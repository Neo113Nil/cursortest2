package com.twilio.voice;

import android.content.Context;
import android.os.Handler;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.twilio.voice.Constants;
import com.twilio.voice.Event;
import com.twilio.voice.MetricEvent;
import io.agora.rtc2.video.FaceShapeAreaOptions;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class EventPublisher {
    private String accessToken;
    private Context context;
    List<Integer> errorCodeList;
    private EventPublisherStatus eventPublisherStatus;
    private String homeRegion;
    private Map<EventPublisherListener, Handler> listenerMap;
    private String publisherName;
    private EventPublisherEventListener publisherPublishEventListener;
    int result;
    String twilioProdSdkEventGatewayURL;
    String twilioProdSdkMetricsGatewayURL;
    private static final Logger logger = Logger.getLogger(EventPublisher.class);
    private static final String TAG = EventPublisher.class.getSimpleName();

    public interface EventPublisherEventListener {
        void onEventPublished(Constants.SeverityLevel severityLevel, String str, String str2);

        void onMetricEventPublished(MetricEvent metricEvent);
    }

    public interface EventPublisherListener {
        void onError(VoiceException voiceException);
    }

    public class EventPublisherStatus {
        private String explanation;
        private volatile boolean invalidatePublishing = false;
        private int errorCode = 0;
        private String responseMessage = "";

        public EventPublisherStatus() {
        }

        public int getErrorCode() {
            return this.errorCode;
        }

        public String getExplanation() {
            return this.explanation;
        }

        public String getResponseMessage() {
            return this.responseMessage;
        }

        public void invalidatePublishing(boolean z10) {
            this.invalidatePublishing = z10;
        }

        public boolean isPublishingInvalidated() {
            return this.invalidatePublishing;
        }

        public void setErrorDetails(int i10, String str, String str2) {
            this.errorCode = i10;
            this.responseMessage = str;
            this.explanation = str2;
        }
    }

    public EventPublisher(String str, String str2) {
        this(null, str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object a(EventPublisher eventPublisher, String str, String str2) {
        HttpsURLConnection httpsURLConnection;
        HttpsURLConnection httpsURLConnection2 = 0;
        if (eventPublisher.eventPublisherStatus.isPublishingInvalidated()) {
            eventPublisher.notifyListeners(eventPublisher.result, eventPublisher.eventPublisherStatus.getResponseMessage(), eventPublisher.eventPublisherStatus.getExplanation());
            return null;
        }
        Logger logger2 = logger;
        logger2.d("Start publishing events to : " + str + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + str2);
        try {
            try {
                httpsURLConnection = VoiceURLConnection.create(eventPublisher.accessToken, str, VoiceURLConnection.METHOD_TYPE_POST);
                try {
                    httpsURLConnection.setRequestProperty("Content-Encoding", "gzip");
                    httpsURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(httpsURLConnection.getOutputStream());
                    gZIPOutputStream.write(str2.getBytes());
                    gZIPOutputStream.close();
                    eventPublisher.result = httpsURLConnection.getResponseCode();
                    String responseMessage = httpsURLConnection.getResponseMessage();
                    int i10 = eventPublisher.result;
                    if (i10 == 200) {
                        logger2.d("Response: " + eventPublisher.result + " - " + responseMessage);
                    } else {
                        if (eventPublisher.errorCodeList.contains(Integer.valueOf(i10))) {
                            logger2.e(String.format(Locale.getDefault(), "Invalidating further publishing : %d - %s", Integer.valueOf(eventPublisher.result), responseMessage));
                            eventPublisher.eventPublisherStatus.invalidatePublishing(true);
                        }
                        char[] cArr = new char[1024];
                        StringBuilder sb2 = new StringBuilder();
                        InputStreamReader inputStreamReader = new InputStreamReader(new GZIPInputStream(httpsURLConnection.getErrorStream()), StandardCharsets.UTF_8);
                        while (true) {
                            int read = inputStreamReader.read(cArr);
                            if (read <= 0) {
                                break;
                            }
                            sb2.append(cArr, 0, read);
                        }
                        String format = String.format(Locale.getDefault(), "%d-%s-%s", Integer.valueOf(eventPublisher.result), responseMessage, sb2.toString());
                        logger.d("Response: " + format);
                        eventPublisher.eventPublisherStatus.setErrorDetails(eventPublisher.result, responseMessage, format);
                        eventPublisher.notifyListeners(eventPublisher.result, responseMessage, format);
                    }
                } catch (Exception e10) {
                    e = e10;
                    logger.e(e.toString());
                    VoiceURLConnection.release(httpsURLConnection);
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                httpsURLConnection2 = str;
                VoiceURLConnection.release(httpsURLConnection2);
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            httpsURLConnection = null;
        } catch (Throwable th3) {
            th = th3;
            VoiceURLConnection.release(httpsURLConnection2);
            throw th;
        }
        VoiceURLConnection.release(httpsURLConnection);
        return null;
    }

    private void notifyListeners(int i10, String str, String str2) {
        final int i11;
        final String str3;
        final String str4;
        for (Map.Entry<EventPublisherListener, Handler> entry : this.listenerMap.entrySet()) {
            final EventPublisherListener key = entry.getKey();
            Handler value = entry.getValue();
            if (value != null) {
                i11 = i10;
                str3 = str;
                str4 = str2;
                value.post(new Runnable() { // from class: com.twilio.voice.EventPublisher.1
                    @Override // java.lang.Runnable
                    public void run() {
                        EventPublisherListener eventPublisherListener = key;
                        if (eventPublisherListener != null) {
                            eventPublisherListener.onError(new VoiceException(i11, str3, str4) { // from class: com.twilio.voice.EventPublisher.1.1
                            });
                        }
                    }
                });
            } else {
                i11 = i10;
                str3 = str;
                str4 = str2;
            }
            i10 = i11;
            str = str3;
            str2 = str4;
        }
    }

    private void updateServiceHostUrlsWithHomeRegion(String str) {
        this.twilioProdSdkMetricsGatewayURL = String.format("https://eventgw.%s.twilio.com/v4/EndpointMetrics", str);
        this.twilioProdSdkEventGatewayURL = String.format("https://eventgw.%s.twilio.com/v4/EndpointEvents", str);
    }

    public void addEventPublisherEventListener(EventPublisherEventListener eventPublisherEventListener) {
        this.publisherPublishEventListener = eventPublisherEventListener;
    }

    public void addListener(EventPublisherListener eventPublisherListener) {
        this.listenerMap.put(eventPublisherListener, Utils.createHandler());
    }

    public Event createEvent(Constants.SeverityLevel severityLevel, String str, String str2, JSONObject jSONObject) {
        return new Event.Builder().productName(this.publisherName).eventName(str2).groupName(str).level(severityLevel).payLoadType("application/json").payLoad(jSONObject).build();
    }

    public MetricEvent createMetricEvent(String str, String str2, JSONArray jSONArray) {
        return new MetricEvent.Builder().productName(this.publisherName).eventName(str2).groupName(str).level(Constants.SeverityLevel.INFO).payLoadType("application/json").payLoad(jSONArray).build();
    }

    public void publish(Constants.SeverityLevel severityLevel, String str, String str2, Event event) {
        if (this.publisherPublishEventListener != null && !this.eventPublisherStatus.isPublishingInvalidated()) {
            this.publisherPublishEventListener.onEventPublished(severityLevel, str, str2);
        }
        publish(event.toJSONObject(this.context).toString(), this.twilioProdSdkEventGatewayURL);
    }

    public void publishMetrics(MetricEvent metricEvent) {
        if (metricEvent != null) {
            publish(metricEvent.toJSONObject(this.context).toString(), this.twilioProdSdkMetricsGatewayURL);
            EventPublisherEventListener eventPublisherEventListener = this.publisherPublishEventListener;
            if (eventPublisherEventListener != null) {
                eventPublisherEventListener.onMetricEventPublished(metricEvent);
            }
        }
    }

    public void removeListener(EventPublisherListener eventPublisherListener) {
        this.listenerMap.remove(eventPublisherListener);
    }

    public EventPublisher(Context context, String str, String str2) {
        this.listenerMap = new HashMap();
        this.result = 0;
        this.eventPublisherStatus = new EventPublisherStatus();
        this.errorCodeList = Arrays.asList(Integer.valueOf(FaceShapeAreaOptions.FACE_SHAPE_AREA_MOUTHLIP));
        if (str2 == null) {
            throw new NullPointerException("accessToken must not be null.");
        }
        if (str == null) {
            throw new NullPointerException("publisherName must not be null.");
        }
        this.context = context;
        this.accessToken = str2;
        this.publisherName = str;
        this.twilioProdSdkMetricsGatewayURL = Constants.getKeyKibanaMetricsHostUrl();
        this.twilioProdSdkEventGatewayURL = Constants.getKeyKibanaEventGatewayHostUrl();
        try {
            this.homeRegion = new AccessTokenParser(str2).getHomeRegion();
        } catch (AccessTokenParseException e10) {
            e10.printStackTrace();
        }
        String str3 = this.homeRegion;
        if (str3 != null) {
            updateServiceHostUrlsWithHomeRegion(str3);
        }
    }

    private void publish(final String str, final String str2) {
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        newCachedThreadPool.submit(new Callable() { // from class: com.twilio.voice.H
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return EventPublisher.a(EventPublisher.this, str2, str);
            }
        });
        newCachedThreadPool.shutdown();
    }
}

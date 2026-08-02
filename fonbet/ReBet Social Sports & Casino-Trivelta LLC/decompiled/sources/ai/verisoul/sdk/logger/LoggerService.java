package ai.verisoul.sdk.logger;

import Ph.AbstractC1457j;
import Ph.AbstractC1459k;
import Ph.C0;
import Ph.C1452g0;
import Ph.M;
import Ph.P;
import Ph.Q;
import Ph.X0;
import Rh.j;
import Rh.m;
import ai.verisoul.sdk.Core;
import ai.verisoul.sdk.VerisoulEnvironment;
import ai.verisoul.sdk.helpers.webview.VerisoulWebViewImplKt;
import android.os.Build;
import com.google.gson.Gson;
import com.twilio.voice.Constants;
import com.twilio.voice.EventKeys;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b\"\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00172\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u0003J\u000f\u0010\u001b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u0003J\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010 \u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0016H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\nH\u0002¢\u0006\u0004\b\"\u0010\u0003J\u0017\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\nH\u0002¢\u0006\u0004\b'\u0010\u0003J\u001d\u0010)\u001a\u00020\n2\u0006\u0010$\u001a\u00020#2\u0006\u0010(\u001a\u00020\u0006¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b+\u0010\u001eJ)\u0010,\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b\"\u00020\u0001¢\u0006\u0004\b,\u0010-J)\u0010.\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b\"\u00020\u0001¢\u0006\u0004\b.\u0010-J)\u0010/\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b\"\u00020\u0001¢\u0006\u0004\b/\u0010-J)\u00100\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b\"\u00020\u0001¢\u0006\u0004\b0\u0010-J1\u00105\u001a\u00020\n2\u0006\u00101\u001a\u00020\u00062\u0006\u00103\u001a\u0002022\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0017¢\u0006\u0004\b5\u00106R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u001f078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001f0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010=\u001a\u0002028\u0002X\u0082D¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010?\u001a\u0002028\u0002X\u0082D¢\u0006\u0006\n\u0004\b?\u0010>R\u0014\u0010@\u001a\u0002028\u0002X\u0082D¢\u0006\u0006\n\u0004\b@\u0010>R\u0014\u0010A\u001a\u0002028\u0002X\u0082D¢\u0006\u0006\n\u0004\bA\u0010>R\u0014\u0010B\u001a\u0002028\u0002X\u0082D¢\u0006\u0006\n\u0004\bB\u0010>R\u0014\u0010C\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082D¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010DR\u0016\u0010(\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010DR\u0018\u0010I\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010S\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u001c\u0010V\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010R0U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006X"}, d2 = {"Lai/verisoul/sdk/logger/LoggerService;", "", "<init>", "()V", "Lai/verisoul/sdk/logger/LogLevel;", "level", "", "message", "", "args", "", "logWithLevel", "(Lai/verisoul/sdk/logger/LogLevel;Ljava/lang/String;[Ljava/lang/Object;)V", EventKeys.DATA, "registerLog", "(Lai/verisoul/sdk/logger/LogLevel;Ljava/lang/String;Ljava/lang/Object;)V", "Lai/verisoul/sdk/logger/LogData;", "formatData", "(Lai/verisoul/sdk/logger/LogLevel;Ljava/lang/String;Ljava/lang/Object;)Lai/verisoul/sdk/logger/LogData;", "Lai/verisoul/sdk/logger/AttributesData;", "getDeviceData", "()Lai/verisoul/sdk/logger/AttributesData;", "", "", "turnArgsIntoJson", "(Ljava/util/List;)Ljava/util/Map;", "startLogProcessor", "flushLogs", "sessionId", "updateSessionId", "(Ljava/lang/String;)V", "Lai/verisoul/sdk/logger/ChildLogData;", "sendLog", "(Ljava/util/List;)V", "closeWebSocket", "Lai/verisoul/sdk/VerisoulEnvironment;", "environment", "initializeWebSocket", "(Lai/verisoul/sdk/VerisoulEnvironment;)V", "shutdown", "projectId", "initialize", "(Lai/verisoul/sdk/VerisoulEnvironment;Ljava/lang/String;)V", "setSessionId", "log", "(Ljava/lang/String;[Ljava/lang/Object;)V", "info", "warn", "error", "name", "", EventKeys.VALUE_KEY, "attributes", "recordMetric", "(Ljava/lang/String;JLjava/util/Map;)V", "LRh/j;", "logChannel", "LRh/j;", "Ljava/util/concurrent/LinkedBlockingQueue;", "batch", "Ljava/util/concurrent/LinkedBlockingQueue;", "logQueueDelay", "J", "sessionIdFetchTimeout", "webSocketTimeout", "oneSecond", "twoSeconds", "defaultSessionIdValue", "Ljava/lang/String;", "", "webSocketCloseCode", "I", "Lokhttp3/WebSocket;", "webSocket", "Lokhttp3/WebSocket;", "Lai/verisoul/sdk/VerisoulEnvironment;", "LPh/M;", "exceptionHandler", "LPh/M;", "LPh/P;", "scope", "LPh/P;", "LPh/C0;", "processorJob", "LPh/C0;", "", "managedJobs", "Ljava/util/List;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLoggerService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoggerService.kt\nai/verisoul/sdk/logger/LoggerService\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,263:1\n48#2,4:264\n800#3,11:268\n1360#3:279\n1446#3,5:280\n1179#3,2:285\n1253#3,4:287\n1855#3,2:291\n1855#3,2:293\n*S KotlinDebug\n*F\n+ 1 LoggerService.kt\nai/verisoul/sdk/logger/LoggerService\n*L\n36#1:264,4\n136#1:268,11\n137#1:279\n137#1:280,5\n138#1:285,2\n138#1:287,4\n177#1:291,2\n191#1:293,2\n*E\n"})
/* loaded from: classes.dex */
public final class LoggerService {
    private VerisoulEnvironment environment;

    @NotNull
    private final M exceptionHandler;

    @NotNull
    private final List<C0> managedJobs;

    @Nullable
    private C0 processorJob;

    @NotNull
    private final P scope;

    @Nullable
    private WebSocket webSocket;

    @NotNull
    private final j logChannel = m.b(Integer.MAX_VALUE, null, null, 6, null);

    @NotNull
    private final LinkedBlockingQueue<ChildLogData> batch = new LinkedBlockingQueue<>();
    private final long logQueueDelay = 5000;
    private final long sessionIdFetchTimeout = VerisoulWebViewImplKt.WEBVIEW_TIMEOUT;
    private final long webSocketTimeout = Core.sensorDataTimeout;
    private final long oneSecond = 1000;
    private final long twoSeconds = 2000;

    @NotNull
    private final String defaultSessionIdValue = "not_available";
    private final int webSocketCloseCode = 1000;

    @NotNull
    private volatile String sessionId = "";

    @NotNull
    private String projectId = "";

    public LoggerService() {
        LoggerService$special$$inlined$CoroutineExceptionHandler$1 loggerService$special$$inlined$CoroutineExceptionHandler$1 = new LoggerService$special$$inlined$CoroutineExceptionHandler$1(M.f9041T2);
        this.exceptionHandler = loggerService$special$$inlined$CoroutineExceptionHandler$1;
        this.scope = Q.a(X0.b(null, 1, null).plus(C1452g0.b()).plus(loggerService$special$$inlined$CoroutineExceptionHandler$1));
        this.managedJobs = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeWebSocket() {
        WebSocket webSocket = this.webSocket;
        if (webSocket != null) {
            webSocket.close(this.webSocketCloseCode, "Closed Web Socket");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void flushLogs() {
        if (this.batch.isEmpty()) {
            return;
        }
        ArrayList<ChildLogData> arrayList = new ArrayList();
        this.batch.drainTo(arrayList);
        for (ChildLogData childLogData : arrayList) {
            if (childLogData instanceof MetricData) {
                ((MetricData) childLogData).setSessionId(this.sessionId);
            } else if (childLogData instanceof LogData) {
                ((LogData) childLogData).setSessionId(this.sessionId);
            }
        }
        sendLog(arrayList);
    }

    private final LogData formatData(LogLevel level, String message, Object data) {
        AttributesData deviceData = getDeviceData();
        String lowerCase = level.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return new LogData(lowerCase, message, this.sessionId, this.projectId, deviceData.getPlatform(), deviceData.getVersion());
    }

    private final AttributesData getDeviceData() {
        return new AttributesData(Constants.PLATFORM_ANDROID, String.valueOf(Build.VERSION.SDK_INT));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializeWebSocket(final VerisoulEnvironment environment) {
        OkHttpClient build = new OkHttpClient.Builder().pingInterval(30L, TimeUnit.SECONDS).build();
        this.webSocket = build.newWebSocket(new Request.Builder().url("wss://ingest." + environment.getValue() + ".verisoul.ai/ws").build(), new WebSocketListener() { // from class: ai.verisoul.sdk.logger.LoggerService$initializeWebSocket$1
            @Override // okhttp3.WebSocketListener
            public void onFailure(@NotNull WebSocket webSocket, @NotNull Throwable t10, @Nullable Response response) {
                P p10;
                C0 d10;
                List list;
                List list2;
                List list3;
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(t10, "t");
                p10 = LoggerService.this.scope;
                d10 = AbstractC1459k.d(p10, null, null, new LoggerService$initializeWebSocket$1$onFailure$reconnectJob$1(LoggerService.this, environment, null), 3, null);
                list = LoggerService.this.managedJobs;
                LoggerService loggerService = LoggerService.this;
                synchronized (list) {
                    list2 = loggerService.managedJobs;
                    list2.add(d10);
                    list3 = loggerService.managedJobs;
                    CollectionsKt.removeAll(list3, (Function1) new Function1<C0, Boolean>() { // from class: ai.verisoul.sdk.logger.LoggerService$initializeWebSocket$1$onFailure$1$1
                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final Boolean invoke(@Nullable C0 c02) {
                            boolean z10 = false;
                            if (c02 != null && c02.isCompleted()) {
                                z10 = true;
                            }
                            return Boolean.valueOf(z10);
                        }
                    });
                }
                super.onFailure(webSocket, t10, response);
            }
        });
        build.connectionPool().evictAll();
        build.dispatcher().executorService().shutdown();
    }

    private final void logWithLevel(LogLevel level, String message, Object... args) {
        registerLog(level, message, !(args.length == 0) ? turnArgsIntoJson(ArraysKt.toList(args)) : null);
    }

    private final void registerLog(LogLevel level, String message, Object data) {
        this.logChannel.h(formatData(level, message, data));
    }

    private final void sendLog(List<? extends ChildLogData> data) {
        try {
            String date = Calendar.getInstance().getTime().toString();
            Intrinsics.checkNotNullExpressionValue(date, "toString(...)");
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
            String v10 = new Gson().v(new ParentLogData("Log", date, uuid, this.sessionId, this.projectId, new DataContainer(data)));
            WebSocket webSocket = this.webSocket;
            if (webSocket != null) {
                Intrinsics.checkNotNull(v10);
                webSocket.send(v10);
            }
        } catch (Exception unused) {
        }
    }

    private final void shutdown() {
        AbstractC1457j.b(null, new LoggerService$shutdown$1(this, null), 1, null);
        Q.f(this.scope, null, 1, null);
    }

    private final void startLogProcessor() {
        C0 d10;
        d10 = AbstractC1459k.d(this.scope, null, null, new LoggerService$startLogProcessor$1(this, null), 3, null);
        this.processorJob = d10;
    }

    private final Map<String, Object> turnArgsIntoJson(List<? extends Object> args) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : args) {
            if (obj instanceof Map) {
                arrayList.add(obj);
            }
        }
        ArrayList<Map.Entry> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList2, ((Map) it.next()).entrySet());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList2, 10)), 16));
        for (Map.Entry entry : arrayList2) {
            Pair pair = TuplesKt.to(entry.getKey(), entry.getValue());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSessionId(String sessionId) {
        for (ChildLogData childLogData : new ArrayList(this.batch)) {
            if (childLogData instanceof MetricData) {
                ((MetricData) childLogData).setSessionId(sessionId);
            } else if (childLogData instanceof LogData) {
                ((LogData) childLogData).setSessionId(sessionId);
            }
        }
    }

    public final void error(@NotNull String message, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(args, "args");
        logWithLevel(LogLevel.ERROR, message, Arrays.copyOf(args, args.length));
    }

    public final void info(@NotNull String message, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(args, "args");
        logWithLevel(LogLevel.INFO, message, Arrays.copyOf(args, args.length));
    }

    public final void initialize(@NotNull VerisoulEnvironment environment, @NotNull String projectId) {
        C0 d10;
        C0 d11;
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        this.environment = environment;
        this.projectId = projectId;
        initializeWebSocket(environment);
        startLogProcessor();
        d10 = AbstractC1459k.d(this.scope, null, null, new LoggerService$initialize$timeoutJob$1(this, null), 3, null);
        synchronized (this.managedJobs) {
            this.managedJobs.add(d10);
        }
        d11 = AbstractC1459k.d(this.scope, null, null, new LoggerService$initialize$sessionTimeoutJob$1(this, null), 3, null);
        synchronized (this.managedJobs) {
            this.managedJobs.add(d11);
        }
    }

    public final void log(@NotNull String message, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(args, "args");
        logWithLevel(LogLevel.LOG, message, Arrays.copyOf(args, args.length));
    }

    public final void recordMetric(@NotNull String name, long value, @NotNull Map<String, ? extends Object> attributes) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        AttributesData deviceData = getDeviceData();
        String lowerCase = "METRIC".toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        this.logChannel.h(new MetricData(lowerCase, "log_forward_metric", name, value, "gauge", System.currentTimeMillis(), deviceData, this.sessionId, this.projectId));
    }

    public final void setSessionId(@NotNull String sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.sessionId = sessionId;
    }

    public final void warn(@NotNull String message, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(args, "args");
        logWithLevel(LogLevel.WARN, message, Arrays.copyOf(args, args.length));
    }
}

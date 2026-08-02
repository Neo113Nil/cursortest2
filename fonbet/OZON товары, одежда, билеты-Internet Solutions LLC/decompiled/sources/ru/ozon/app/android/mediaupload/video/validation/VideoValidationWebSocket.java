package ru.ozon.app.android.mediaupload.video.validation;

import AF.d;
import Ae.InterfaceC2395h;
import Mc.a;
import Sc.o;
import io.reactivex.h;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import qA.C9002a;
import ru.ozon.app.android.mediaupload.video.validation.VideoValidationEvent;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.auth.flags.NetworkBaseTimeoutSec;
import ru.ozon.app.android.network.websockets.OzonWebSocket;
import ru.ozon.app.android.network.websockets.OzonWebSocketFactory;
import ru.ozon.app.android.network.websockets.SocketEvent;
import sc.C9653a;
import sc.C9656b;
import wc.C10494o;
import wc.U;
import wc.x;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001(B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lru/ozon/app/android/mediaupload/video/validation/VideoValidationWebSocket;", "", "Lru/ozon/app/android/network/websockets/OzonWebSocketFactory;", "ozonWebSocketFactory", "", "baseWsUrl", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "<init>", "(Lru/ozon/app/android/network/websockets/OzonWebSocketFactory;Ljava/lang/String;Lru/ozon/app/android/network/abtool/FeatureService;)V", "Lru/ozon/app/android/network/websockets/SocketEvent;", "socketEvent", "Lru/ozon/app/android/mediaupload/video/validation/VideoValidationEvent;", "map", "(Lru/ozon/app/android/network/websockets/SocketEvent;)Lru/ozon/app/android/mediaupload/video/validation/VideoValidationEvent;", "Lorg/json/JSONObject;", "response", "getFFPRobe", "(Lorg/json/JSONObject;)Lorg/json/JSONObject;", "", "size", "", "headers", "LAe/h;", "startValidation", "(JLjava/util/Map;)LAe/h;", "", "bytes", "", "nextPart", "([B)V", "videoType", "sendVideoType", "(Ljava/lang/String;)V", "Lru/ozon/app/android/network/websockets/OzonWebSocketFactory;", "Ljava/lang/String;", "Lru/ozon/app/android/network/abtool/FeatureService;", "Lru/ozon/app/android/network/websockets/OzonWebSocket;", "ozonWebSocket", "Lru/ozon/app/android/network/websockets/OzonWebSocket;", "Companion", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class VideoValidationWebSocket {

    @NotNull
    private final String baseWsUrl;

    @NotNull
    private final FeatureService featureService;
    private OzonWebSocket ozonWebSocket;

    @NotNull
    private final OzonWebSocketFactory ozonWebSocketFactory;

    public VideoValidationWebSocket(@NotNull OzonWebSocketFactory ozonWebSocketFactory, @NotNull String baseWsUrl, @NotNull FeatureService featureService) {
        Intrinsics.checkNotNullParameter(ozonWebSocketFactory, "ozonWebSocketFactory");
        Intrinsics.checkNotNullParameter(baseWsUrl, "baseWsUrl");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        this.ozonWebSocketFactory = ozonWebSocketFactory;
        this.baseWsUrl = baseWsUrl;
        this.featureService = featureService;
    }

    private final JSONObject getFFPRobe(JSONObject response) {
        JSONObject jSONObject = response.getJSONObject("FFProbe");
        Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VideoValidationEvent map(SocketEvent socketEvent) {
        if (Intrinsics.d(socketEvent, SocketEvent.Connecting.INSTANCE)) {
            return VideoValidationEvent.Connecting.INSTANCE;
        }
        if (Intrinsics.d(socketEvent, SocketEvent.Connected.INSTANCE)) {
            return VideoValidationEvent.Connected.INSTANCE;
        }
        if (Intrinsics.d(socketEvent, SocketEvent.Unavailable.INSTANCE)) {
            return VideoValidationEvent.Unavailable.INSTANCE;
        }
        if (socketEvent instanceof SocketEvent.Error) {
            return new VideoValidationEvent.Error(((SocketEvent.Error) socketEvent).getReason());
        }
        if (!(socketEvent instanceof SocketEvent.Message)) {
            throw new o();
        }
        JSONObject json = ((SocketEvent.Message) socketEvent).getJson();
        if (json.has("Valid") && json.getBoolean("Valid")) {
            return new VideoValidationEvent.ValidResult.ValidOk(getFFPRobe(json));
        }
        if (json.has("Valid")) {
            return new VideoValidationEvent.ValidResult.ValidError(json.getString("UserMessage"));
        }
        if (json.has("From") && json.has("Size")) {
            return new VideoValidationEvent.NextPart(json.getLong("From"), json.getInt("Size"));
        }
        throw new IllegalStateException("Unknown event state: " + json);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VideoValidationEvent startValidation$lambda$2(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (VideoValidationEvent) function1.invoke(p02);
    }

    public final void nextPart(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        OzonWebSocket ozonWebSocket = this.ozonWebSocket;
        if (ozonWebSocket != null) {
            ozonWebSocket.send(bytes);
        }
    }

    public final void sendVideoType(@NotNull String videoType) {
        Intrinsics.checkNotNullParameter(videoType, "videoType");
        String jSONObject = new JSONObject().put("video_type", videoType).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        byte[] bytes = jSONObject.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        OzonWebSocket ozonWebSocket = this.ozonWebSocket;
        if (ozonWebSocket != null) {
            ozonWebSocket.send(bytes);
        }
    }

    @NotNull
    public final InterfaceC2395h<VideoValidationEvent> startValidation(long size, @NotNull Map<String, String> headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (this.ozonWebSocket != null) {
            throw new IllegalStateException("Validation already started");
        }
        OzonWebSocket create = this.ozonWebSocketFactory.create(new VideoValidationWebSocketUrl(size, this.baseWsUrl, headers));
        this.ozonWebSocket = create;
        h<SocketEvent> socketEvents = create.getSocketEvents();
        d dVar = new d(new VideoValidationWebSocket$startValidation$4(this), 13);
        socketEvents.getClass();
        x xVar = new x(socketEvents, dVar);
        C9002a c9002a = new C9002a(this);
        C10494o c10494o = new C10494o(xVar, C9653a.g(), C9653a.a(c9002a), c9002a);
        long longKey = this.featureService.getLongKey(NetworkBaseTimeoutSec.INSTANCE);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        io.reactivex.x a11 = a.a();
        C9656b.c(timeUnit, "timeUnit is null");
        C9656b.c(a11, "scheduler is null");
        U u11 = new U(c10494o, longKey, a11);
        Intrinsics.checkNotNullExpressionValue(u11, "timeout(...)");
        return Fe.d.a(u11);
    }
}

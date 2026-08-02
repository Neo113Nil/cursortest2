package com.vk.id.captcha.web;

import android.os.Handler;
import android.util.Log;
import android.webkit.JavascriptInterface;
import com.vk.id.captcha.api.VKCaptcha;
import com.vk.id.captcha.sensors.SensorsDataRepository;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u001c\u0010\u0007\u001a\u0018\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\n0\tj\u0002`\u000b\u0012\u0004\u0012\u00020\u00060\b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u000fH\u0017J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u000fH\u0017J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u000fH\u0017J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u000fH\u0017R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u0018\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\n0\tj\u0002`\u000b\u0012\u0004\u0012\u00020\u00060\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/vk/id/captcha/web/VKCaptchaJSInterface;", "Lcom/vk/id/captcha/web/VKCaptchaBridge;", "handler", "Landroid/os/Handler;", "onClose", "Lkotlin/Function0;", "", "onDataUpdate", "Lkotlin/Function1;", "", "Lcom/vk/id/captcha/sensors/model/SensorData;", "Lcom/vk/id/captcha/sensors/model/SensorsData;", "sensorsDataRepository", "Lcom/vk/id/captcha/sensors/SensorsDataRepository;", "domain", "", "(Landroid/os/Handler;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/vk/id/captcha/sensors/SensorsDataRepository;Ljava/lang/String;)V", "isClosedByUser", "", "VKCaptchaCloseCaptcha", "data", "VKCaptchaGetResult", "VKCaptchaListenSensorsStart", "VKCaptchaListenSensorsStop", "Companion", "captcha_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.vk.id.captcha.web.e, reason: from Kotlin metadata */
/* loaded from: classes9.dex */
public final class VKCaptchaJSInterface {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Handler f60598a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private Function0<Unit> f60599b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<List<? extends com.vk.id.captcha.sensors.a.a>, Unit> f60600c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final SensorsDataRepository f60601d;

    /* renamed from: e, reason: collision with root package name */
    private final String f60602e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f60603f;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0010\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/vk/id/captcha/sensors/model/SensorData;", "Lcom/vk/id/captcha/sensors/model/SensorsData;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.vk.id.captcha.web.e$b */
    static final class b extends AbstractC7737t implements Function1<List<? extends com.vk.id.captcha.sensors.a.a>, Unit> {
        b() {
            super(1);
        }

        public final void a(@NotNull List<? extends com.vk.id.captcha.sensors.a.a> list) {
            Intrinsics.checkNotNullParameter(list, "");
            VKCaptchaJSInterface.this.f60600c.invoke(list);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(List<? extends com.vk.id.captcha.sensors.a.a> list) {
            a(list);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VKCaptchaJSInterface(@NotNull Handler handler, @NotNull Function0<Unit> function0, @NotNull Function1<? super List<? extends com.vk.id.captcha.sensors.a.a>, Unit> function1, @NotNull SensorsDataRepository sensorsDataRepository, String str) {
        Intrinsics.checkNotNullParameter(handler, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(sensorsDataRepository, "");
        this.f60598a = handler;
        this.f60599b = function0;
        this.f60600c = function1;
        this.f60601d = sensorsDataRepository;
        this.f60602e = str;
        this.f60603f = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(JSONObject jSONObject, VKCaptchaJSInterface vKCaptchaJSInterface) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        Intrinsics.checkNotNullParameter(vKCaptchaJSInterface, "");
        VKCaptcha vKCaptcha = VKCaptcha.INSTANCE;
        String string = jSONObject.getString("token");
        Intrinsics.checkNotNullExpressionValue(string, "");
        vKCaptcha.setResult$captcha_release(string, vKCaptchaJSInterface.f60602e);
    }

    @JavascriptInterface
    public final void VKCaptchaCloseCaptcha(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "");
        if (this.f60603f) {
            VKCaptcha.INSTANCE.closeCaptcha();
        }
        this.f60599b.invoke();
    }

    @JavascriptInterface
    public final void VKCaptchaGetResult(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "");
        try {
            JSONObject jSONObject = new JSONObject(data);
            this.f60603f = false;
            this.f60598a.post(new da.b(0, jSONObject, this));
            this.f60601d.a();
        } catch (JSONException e11) {
            Log.e("VKCaptchaWebView", "Error when parsing json\n Error:" + e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0087 A[Catch: JSONException -> 0x005a, TryCatch #0 {JSONException -> 0x005a, blocks: (B:3:0x0007, B:5:0x001b, B:7:0x002f, B:14:0x0070, B:16:0x0087, B:18:0x008a, B:20:0x004e, B:23:0x0057, B:24:0x005c, B:27:0x0065, B:28:0x0068, B:30:0x0083, B:32:0x008d, B:35:0x0096, B:36:0x009d), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008a A[SYNTHETIC] */
    @JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void VKCaptchaListenSensorsStart(@NotNull String data) {
        com.vk.id.captcha.sensors.a.b bVar;
        Intrinsics.checkNotNullParameter(data, "");
        try {
            JSONObject jSONObject = new JSONObject(data);
            int optInt = jSONObject.optInt("period", -1);
            JSONArray jSONArray = jSONObject.getJSONArray("bridge_sensors_list");
            if (optInt == -1) {
                throw new IllegalStateException("No period value was provided from WebView");
            }
            SensorsDataRepository sensorsDataRepository = this.f60601d;
            Intrinsics.f(jSONArray);
            Intrinsics.checkNotNullParameter(jSONArray, "");
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                String obj = jSONArray.get(i11).toString();
                Intrinsics.checkNotNullParameter(obj, "");
                int hashCode = obj.hashCode();
                if (hashCode == -1068318794) {
                    if (obj.equals("motion")) {
                        bVar = com.vk.id.captcha.sensors.a.b.f60547c;
                        if (bVar == null) {
                        }
                    }
                    Log.e("VKCaptchaWebView", "Incorrect or unsupported sensor type\n Sensor: " + obj);
                    bVar = null;
                    if (bVar == null) {
                    }
                } else if (hashCode != 325741829) {
                    if (hashCode == 697872463 && obj.equals("accelerometer")) {
                        bVar = com.vk.id.captcha.sensors.a.b.f60545a;
                        if (bVar == null) {
                            arrayList.add(bVar);
                        }
                    }
                    Log.e("VKCaptchaWebView", "Incorrect or unsupported sensor type\n Sensor: " + obj);
                    bVar = null;
                    if (bVar == null) {
                    }
                } else if (obj.equals("gyroscope")) {
                    bVar = com.vk.id.captcha.sensors.a.b.f60546b;
                    if (bVar == null) {
                    }
                } else {
                    Log.e("VKCaptchaWebView", "Incorrect or unsupported sensor type\n Sensor: " + obj);
                    bVar = null;
                    if (bVar == null) {
                    }
                }
            }
            sensorsDataRepository.a(arrayList, optInt, new b());
        } catch (JSONException e11) {
            Log.e("VKCaptchaWebView", "Error when parsing json\n Error:" + e11);
        }
    }

    @JavascriptInterface
    public final void VKCaptchaListenSensorsStop(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "");
        this.f60601d.a();
    }
}

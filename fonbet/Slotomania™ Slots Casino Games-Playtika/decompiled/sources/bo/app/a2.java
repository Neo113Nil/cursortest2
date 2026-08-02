package bo.app;

import com.braze.Constants;
import com.braze.enums.BrazeSdkMetadata;
import com.braze.enums.SdkFlavor;
import java.util.EnumSet;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\"\u0010\u0007\u001a\u00020\u00062\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002j\u0002`\u0004H&R\u001e\u0010\f\u001a\u0004\u0018\u00010\b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u0007\u0010\u000bR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00038&@&X¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\t\u0010\u000fR\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00118&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0007\u0010\u0014R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00038&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0017\u0010\u000fR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u00038&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u000fR\u001e\u0010 \u001a\u0004\u0018\u00010\u001c8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u0007\u0010\u001fR\u001e\u0010%\u001a\u0004\u0018\u00010!8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b\u0007\u0010$R\u001e\u0010(\u001a\u0004\u0018\u00010\u00038&@&X¦\u000e¢\u0006\f\u001a\u0004\b&\u0010\u000e\"\u0004\b'\u0010\u000fR\u001e\u0010*\u001a\u0004\u0018\u00010\u00038&@&X¦\u000e¢\u0006\f\u001a\u0004\b)\u0010\u000e\"\u0004\b\"\u0010\u000fR\u001e\u0010.\u001a\u0004\u0018\u00010+8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010,\"\u0004\b\u0007\u0010-R\u001e\u00101\u001a\u0004\u0018\u00010\u00038&@&X¦\u000e¢\u0006\f\u001a\u0004\b/\u0010\u000e\"\u0004\b0\u0010\u000fR\u001e\u00102\u001a\u0004\u0018\u00010\u00038&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\u000e\"\u0004\b\u0007\u0010\u000fR\u001e\u00107\u001a\u0004\u0018\u0001038&@&X¦\u000e¢\u0006\f\u001a\u0004\b0\u00104\"\u0004\b5\u00106R*\u0010>\u001a\u0010\u0012\u0004\u0012\u000209\u0018\u000108j\u0004\u0018\u0001`:8&@&X¦\u000e¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b\u0007\u0010=R\u0016\u0010B\u001a\u0004\u0018\u00010?8&X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010E\u001a\u00020C8&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010DR\u0014\u0010F\u001a\u00020C8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010Dø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006GÀ\u0006\u0001"}, d2 = {"Lbo/app/a2;", "Lbo/app/m2;", "", "", "Lcom/braze/communication/MutableHttpHeaders;", "existingHeaders", "", Constants.BRAZE_PUSH_CONTENT_KEY, "Lbo/app/k0;", "b", "()Lbo/app/k0;", "(Lbo/app/k0;)V", "device", "getDeviceId", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "deviceId", "", "j", "()Ljava/lang/Long;", "(Ljava/lang/Long;)V", "requestInitiationTime", "getApiKey", "f", "apiKey", "getSdkVersion", "g", "sdkVersion", "Lcom/braze/enums/SdkFlavor;", "getSdkFlavor", "()Lcom/braze/enums/SdkFlavor;", "(Lcom/braze/enums/SdkFlavor;)V", "sdkFlavor", "Lbo/app/y3;", "e", "()Lbo/app/y3;", "(Lbo/app/y3;)V", "outboundUser", "getHostAppVersion", "c", "hostAppVersion", "getHostAppSemanticVersionCode", "hostAppSemanticVersionCode", "Lbo/app/k;", "()Lbo/app/k;", "(Lbo/app/k;)V", "customEvents", "k", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "sdkAuthSignature", "userId", "Lbo/app/x3;", "()Lbo/app/x3;", "setOutboundRespondWith", "(Lbo/app/x3;)V", "outboundRespondWith", "Ljava/util/EnumSet;", "Lcom/braze/enums/BrazeSdkMetadata;", "Lcom/braze/enums/MetadataTags;", "i", "()Ljava/util/EnumSet;", "(Ljava/util/EnumSet;)V", "sdkMetadata", "Lorg/json/JSONObject;", "l", "()Lorg/json/JSONObject;", "payload", "", "()Z", "containsNoNewData", "doesSendOptionalData", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public interface a2 extends m2 {
    String a();

    void a(k0 k0Var);

    void a(k kVar);

    void a(y3 y3Var);

    void a(SdkFlavor sdkFlavor);

    void a(Long l);

    void a(String str);

    void a(EnumSet<BrazeSdkMetadata> enumSet);

    void a(Map<String, String> existingHeaders);

    k0 b();

    void b(String str);

    void c(String str);

    boolean c();

    x3 d();

    void d(String str);

    y3 e();

    void e(String str);

    k f();

    void f(String str);

    void g(String str);

    boolean g();

    EnumSet<BrazeSdkMetadata> i();

    Long j();

    String k();

    JSONObject l();
}

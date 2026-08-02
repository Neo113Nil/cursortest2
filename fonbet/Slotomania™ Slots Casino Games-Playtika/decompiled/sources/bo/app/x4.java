package bo.app;

import com.braze.Constants;
import com.google.common.net.HttpHeaders;
import com.ironsource.B5;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\bR,\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002j\u0002`\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lbo/app/x4;", "", "", "", "Lcom/braze/communication/MutableHttpHeaders;", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/util/Map;", "getHeaders$annotations", "()V", "headers", "<init>", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class x4 {
    public static final x4 a = new x4();

    private x4() {
    }

    public static final Map<String, String> a() {
        HashMap hashMap = new HashMap();
        hashMap.put(HttpHeaders.ACCEPT_ENCODING, "gzip, deflate");
        hashMap.put("Content-Type", B5.M);
        return hashMap;
    }
}

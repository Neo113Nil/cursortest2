package defpackage;

import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class ijg {
    public abstract JSONObject a();

    public abstract String b();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ijg)) {
            return false;
        }
        ijg ijgVar = (ijg) obj;
        if (b().equals(ijgVar.b())) {
            return a() != null ? ijgVar.a() != null && a().toString().equals(ijgVar.a().toString()) : ijgVar.a() == null;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{b(), a()});
    }
}

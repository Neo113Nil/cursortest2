package defpackage;

import android.content.Context;
import com.bytedance.sdk.component.sf.pcc.vh;
import com.ironsource.Ua;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class tem {
    public static Context a = null;
    public static String b = null;
    public static vh c = null;
    public static int d = 1;

    public static vh a() {
        vh vhVar = c;
        if (vhVar != null) {
            return vhVar;
        }
        vh.pcc pccVar = new vh.pcc("v_config");
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        vh pcc = pccVar.pcc(Ua.s, timeUnit).sf(Ua.s, timeUnit).gm(Ua.s, timeUnit).pcc();
        c = pcc;
        return pcc;
    }
}

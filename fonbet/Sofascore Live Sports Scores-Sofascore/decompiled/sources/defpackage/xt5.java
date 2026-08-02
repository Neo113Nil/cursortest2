package defpackage;

import com.sofascore.model.Sports;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class xt5 {
    public static final Set a = ph0.a0(new String[]{Sports.BASKETBALL, Sports.AMERICAN_FOOTBALL, Sports.HANDBALL, Sports.ICE_HOCKEY, Sports.RUGBY});

    public static float a(String str) {
        str.getClass();
        return (str.equals(Sports.AMERICAN_FOOTBALL) || str.equals(Sports.ICE_HOCKEY)) ? 104.0f : 44.0f;
    }
}

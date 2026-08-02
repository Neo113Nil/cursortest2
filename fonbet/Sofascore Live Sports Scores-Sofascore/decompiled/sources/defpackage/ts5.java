package defpackage;

import com.sofascore.results.R;
import java.util.List;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class ts5 {
    public static final List a;

    static {
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(0.6f);
        Float valueOf3 = Float.valueOf(0.4f);
        a = b.j(valueOf, valueOf2, valueOf3, valueOf3, Float.valueOf(0.25f), Float.valueOf(0.2f));
    }

    public static r9k a(int i, int i2, String str, String str2) {
        if (i > i2) {
            return new m9k(str);
        }
        if (i < i2) {
            return new m9k(str2);
        }
        int i3 = ke0.c;
        return (zu3.v0.getMccList().contains(Integer.valueOf(i3)) || zu3.k.getMccList().contains(Integer.valueOf(i3))) ? new q9k(R.string.who_will_win_tie) : new q9k(R.string.draw);
    }
}

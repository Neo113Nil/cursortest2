package defpackage;

import com.ironsource.U3;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes.dex */
public final class mwd {

    @NotNull
    public static final lwd Companion = new lwd();
    public final boolean a;
    public final String b;

    public mwd(int i, String str, boolean z) {
        this.a = (i & 1) == 0 ? true : z;
        if ((i & 2) == 0) {
            this.b = "none";
            str = "none";
        } else {
            this.b = str;
        }
        if (ph0.a0(new String[]{"none", U3.i.C, U3.i.D}).contains(str)) {
            return;
        }
        a70.p("Failed requirement.");
        throw null;
    }
}

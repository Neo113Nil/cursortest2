package defpackage;

import kotlin.io.encoding.Base64$PaddingOption;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class e01 {

    @NotNull
    public static final d01 e = new d01(null);
    public static final byte[] f = {13, 10};
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;

    static {
        Base64$PaddingOption[] base64$PaddingOptionArr = Base64$PaddingOption.a;
        new e01(-1, true, false);
        new e01(76, false, true);
        new e01(64, false, true);
    }

    public e01(int i, boolean z, boolean z2) {
        Base64$PaddingOption[] base64$PaddingOptionArr = Base64$PaddingOption.a;
        this.a = z;
        this.b = z2;
        this.c = i;
        if (z && z2) {
            a70.p("Failed requirement.");
            throw null;
        }
        this.d = i / 4;
    }

    public final int a(int i) {
        int i2 = (i / 3) * 4;
        if (i % 3 != 0) {
            Base64$PaddingOption[] base64$PaddingOptionArr = Base64$PaddingOption.a;
            i2 += 4;
        }
        if (i2 < 0) {
            a70.p("Input is too big");
            return 0;
        }
        if (this.b) {
            i2 = lnb.d(i2 - 1, this.c, 2, i2);
        }
        if (i2 >= 0) {
            return i2;
        }
        a70.p("Input is too big");
        return 0;
    }
}

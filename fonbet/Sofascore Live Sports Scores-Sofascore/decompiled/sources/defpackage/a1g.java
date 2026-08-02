package defpackage;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes.dex */
public final class a1g {

    @NotNull
    public static final z0g Companion = new z0g();
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;

    public /* synthetic */ a1g(int i, int i2, int i3, int i4, int i5, boolean z) {
        if (31 != (i & 31)) {
            oea.z(i, 31, y0g.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = z;
        if (i2 < 50) {
            a70.p("Failed requirement.");
            throw null;
        }
        if (i3 >= 50) {
            return;
        }
        a70.p("Failed requirement.");
        throw null;
    }
}

package defpackage;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes.dex */
public final class wh6 {

    @NotNull
    public static final vh6 Companion = new vh6();
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public /* synthetic */ wh6(int i, int i2, int i3, boolean z, boolean z2) {
        if (3 != (i & 3)) {
            oea.z(i, 3, uh6.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = i3;
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z2;
        }
    }

    public wh6(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = false;
    }
}

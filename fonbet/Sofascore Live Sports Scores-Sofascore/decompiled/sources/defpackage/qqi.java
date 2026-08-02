package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qqi {
    public final int a;
    public final int b;
    public final int c;
    public final Function1 d;

    public qqi(int i, int i2, int i3, Function1 function1) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = function1;
    }

    public final int a(boolean z) {
        if (this.c == 0) {
            return 0;
        }
        return z ? this.b : this.a;
    }
}

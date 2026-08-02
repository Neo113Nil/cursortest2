package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class jz8 extends ContextWrapper {
    public static final rw8 h = new rw8();
    public final kn4 a;
    public final ggf b;
    public final List c;
    public final dh0 d;
    public final sn5 e;
    public final t9d f;
    public r0g g;

    public jz8(Context context, kn4 kn4Var, yih yihVar, k03 k03Var, dh0 dh0Var, List list, sn5 sn5Var, t9d t9dVar) {
        super(context.getApplicationContext());
        this.a = kn4Var;
        this.c = list;
        this.d = dh0Var;
        this.e = sn5Var;
        this.f = t9dVar;
        this.b = new ggf(yihVar);
    }

    public final ovf a() {
        return (ovf) this.b.get();
    }
}

package defpackage;

import android.graphics.Bitmap;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bf2 {
    public final joa a;
    public final joa b;
    public final long c;
    public final long d;
    public final boolean e;
    public final q89 f;

    public bf2(lof lofVar) {
        ysa ysaVar = ysa.c;
        this.a = ypa.a(ysaVar, new af2(this, 0));
        this.b = ypa.a(ysaVar, new af2(this, 1));
        this.c = Long.parseLong(lofVar.n(Long.MAX_VALUE));
        this.d = Long.parseLong(lofVar.n(Long.MAX_VALUE));
        this.e = Integer.parseInt(lofVar.n(Long.MAX_VALUE)) > 0;
        int parseInt = Integer.parseInt(lofVar.n(Long.MAX_VALUE));
        ef0 ef0Var = new ef0(1);
        for (int i = 0; i < parseInt; i++) {
            String n = lofVar.n(Long.MAX_VALUE);
            Bitmap.Config[] configArr = l.a;
            int O = StringsKt.O(n, ':', 0, 6);
            if (O == -1) {
                ogj.h("Unexpected header: ".concat(n));
                throw null;
            }
            ef0Var.d(StringsKt.l0(n.substring(0, O)).toString(), n.substring(O + 1));
        }
        this.f = vha.i(ef0Var);
    }

    public final void a(kof kofVar) {
        kofVar.m(this.c);
        kofVar.writeByte(10);
        kofVar.m(this.d);
        kofVar.writeByte(10);
        kofVar.m(this.e ? 1L : 0L);
        kofVar.writeByte(10);
        q89 q89Var = this.f;
        kofVar.m(q89Var.size());
        kofVar.writeByte(10);
        int size = q89Var.size();
        for (int i = 0; i < size; i++) {
            kofVar.S(vha.j(q89Var, i));
            kofVar.S(": ");
            kofVar.S(vha.l(q89Var, i));
            kofVar.writeByte(10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public bf2(d2g d2gVar) {
        ysa ysaVar = ysa.c;
        this.a = ypa.a(ysaVar, new af2(this, 0 == true ? 1 : 0));
        this.b = ypa.a(ysaVar, new af2(this, 1));
        this.c = d2gVar.l;
        this.d = d2gVar.m;
        this.e = d2gVar.e != null;
        this.f = d2gVar.f;
    }
}

package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dna implements l1c {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ ena e;
    public final /* synthetic */ kna f;
    public final /* synthetic */ Function1 g;

    public dna(int i, int i2, Map map, Function1 function1, ena enaVar, kna knaVar, Function1 function12) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = function1;
        this.e = enaVar;
        this.f = knaVar;
        this.g = function12;
    }

    @Override // defpackage.l1c
    public final Map a() {
        return this.c;
    }

    @Override // defpackage.l1c
    public final void b() {
        y3a y3aVar;
        wma wmaVar = this.f.a;
        boolean W = this.e.W();
        Function1 function1 = this.g;
        if (!W || (y3aVar = ((z3a) wmaVar.F.d).T) == null) {
            function1.invoke(((z3a) wmaVar.F.d).l);
        } else {
            function1.invoke(y3aVar.l);
        }
    }

    @Override // defpackage.l1c
    public final Function1 c() {
        return this.d;
    }

    @Override // defpackage.l1c
    public final int getHeight() {
        return this.b;
    }

    @Override // defpackage.l1c
    public final int getWidth() {
        return this.a;
    }
}

package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ena implements yji {
    public ema a = ema.b;
    public float b;
    public float c;
    public final /* synthetic */ kna d;

    public ena(kna knaVar) {
        this.d = knaVar;
    }

    @Override // defpackage.m1c
    public final l1c M0(int i, int i2, Map map, Function1 function1, Function1 function12) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            r3a.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new dna(i, i2, map, function1, this, this.d, function12);
    }

    @Override // defpackage.l9a
    public final boolean W() {
        sma smaVar = this.d.a.G.d;
        return smaVar == sma.d || smaVar == sma.b;
    }

    @Override // defpackage.kx4
    public final float getFontScale() {
        return this.c;
    }

    @Override // defpackage.l9a
    public final ema getLayoutDirection() {
        return this.a;
    }

    @Override // defpackage.kx4
    public final float j() {
        return this.b;
    }

    @Override // defpackage.yji
    public final List t(Object obj, Function2 function2) {
        kna knaVar = this.d;
        knaVar.i();
        wma wmaVar = knaVar.a;
        sma smaVar = wmaVar.G.d;
        sma smaVar2 = sma.a;
        if (smaVar != smaVar2 && smaVar != sma.c && smaVar != sma.b && smaVar != sma.d) {
            r3a.b("subcompose can only be used inside the measure or layout blocks");
        }
        x0d x0dVar = knaVar.g;
        Object g = x0dVar.g(obj);
        if (g == null) {
            g = (wma) knaVar.j.k(obj);
            if (g != null) {
                if (knaVar.o <= 0) {
                    r3a.b("Check failed.");
                }
                knaVar.o--;
            } else {
                g = knaVar.o(obj);
                if (g == null) {
                    int i = knaVar.d;
                    wma wmaVar2 = new wma(2);
                    wmaVar.q = true;
                    wmaVar.B(i, wmaVar2);
                    Unit unit = Unit.a;
                    wmaVar.q = false;
                    g = wmaVar2;
                }
            }
            x0dVar.m(obj, g);
        }
        wma wmaVar3 = (wma) g;
        if (CollectionsKt.a0(knaVar.d, wmaVar.p()) != wmaVar3) {
            int p = ((i1d) ((j0d) wmaVar.p()).b).p(wmaVar3);
            if (p < knaVar.d) {
                r3a.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i2 = knaVar.d;
            if (i2 != p) {
                knaVar.k(p, i2);
            }
        }
        knaVar.d++;
        knaVar.n(wmaVar3, obj, false, function2);
        return (smaVar == smaVar2 || smaVar == sma.c) ? wmaVar3.n() : wmaVar3.m();
    }
}

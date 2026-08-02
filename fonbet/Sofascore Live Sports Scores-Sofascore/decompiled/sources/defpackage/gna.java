package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gna extends tma {
    public final /* synthetic */ kna b;
    public final /* synthetic */ Function2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gna(kna knaVar, Function2 function2, String str) {
        super(str);
        this.b = knaVar;
        this.c = function2;
    }

    @Override // defpackage.k1c
    public final l1c d(m1c m1cVar, List list, long j) {
        kna knaVar = this.b;
        ena enaVar = knaVar.h;
        enaVar.a = m1cVar.getLayoutDirection();
        enaVar.b = m1cVar.j();
        enaVar.c = m1cVar.getFontScale();
        boolean W = m1cVar.W();
        Function2 function2 = this.c;
        if (W || knaVar.a.h == null) {
            knaVar.d = 0;
            l1c l1cVar = (l1c) function2.invoke(enaVar, new an3(j));
            return new fna(l1cVar, knaVar, knaVar.d, l1cVar, 1);
        }
        knaVar.e = 0;
        l1c l1cVar2 = (l1c) function2.invoke(knaVar.i, new an3(j));
        return new fna(l1cVar2, knaVar, knaVar.e, l1cVar2, 0);
    }
}

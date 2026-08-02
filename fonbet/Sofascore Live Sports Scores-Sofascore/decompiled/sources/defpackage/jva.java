package defpackage;

import com.sofascore.model.mvvm.model.Event;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class jva extends hoi implements Function2 {
    public zu4 A;
    public zu4 B;
    public zu4 C;
    public zu4 D;
    public Event E;
    public zu4 F;
    public Object G;
    public Object H;
    public Object I;
    public yzc J;
    public Object K;
    public Object L;
    public Object M;
    public Object N;
    public Object O;
    public Object P;
    public Object Q;
    public List R;
    public Object S;
    public Object T;
    public Object U;
    public Object V;
    public List W;
    public gv9 X;
    public int Y;
    public int Z;
    public /* synthetic */ Object a0;
    public final /* synthetic */ kva b0;
    public final /* synthetic */ int c0;
    public final /* synthetic */ boolean d0;
    public final /* synthetic */ int e0;
    public zu4 r;
    public zu4 s;
    public zu4 t;
    public zu4 u;
    public zu4 v;
    public zu4 w;
    public zu4 x;
    public zu4 y;
    public zu4 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jva(kva kvaVar, int i, boolean z, int i2, rq3 rq3Var) {
        super(2, rq3Var);
        this.b0 = kvaVar;
        this.c0 = i;
        this.d0 = z;
        this.e0 = i2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        jva jvaVar = new jva(this.b0, this.c0, this.d0, this.e0, rq3Var);
        jvaVar.a0 = obj;
        return jvaVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((jva) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:202:0x08e4 -> B:185:0x08f4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:203:0x092b -> B:188:0x093b). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    public final java.lang.Object invokeSuspend(java.lang.Object r49) {
        /*
            Method dump skipped, instructions count: 4654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jva.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

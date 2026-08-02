package defpackage;

import androidx.compose.runtime.e;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ej0 implements cdi {
    public final List a;
    public final f6k b;
    public final Function1 c;
    public final e1d d;
    public boolean e = true;

    public ej0(List list, Object obj, f6k f6kVar, sx2 sx2Var, Function1 function1, u00 u00Var) {
        this.a = list;
        this.b = f6kVar;
        this.c = function1;
        this.d = e.f(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009c A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x0032, B:16:0x009c, B:23:0x0048, B:25:0x004d, B:28:0x007a, B:33:0x0092), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x009c -> B:14:0x00a5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(sq3 sq3Var) {
        dj0 dj0Var;
        int i;
        Function1 function1;
        e1d e1dVar;
        int size;
        List list;
        int i2;
        try {
            if (sq3Var instanceof dj0) {
                dj0Var = (dj0) sq3Var;
                int i3 = dj0Var.x;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    dj0Var.x = i3 - Integer.MIN_VALUE;
                    Object obj = dj0Var.v;
                    lu3 lu3Var = lu3.a;
                    i = dj0Var.x;
                    function1 = this.c;
                    e1dVar = this.d;
                    if (i == 0) {
                        if (i == 1) {
                            int i4 = dj0Var.u;
                            int i5 = dj0Var.t;
                            p1g p1gVar = dj0Var.s;
                            List list2 = dj0Var.r;
                            y6a.M(obj);
                            if (obj != null) {
                                f6k f6kVar = this.b;
                                ((eoh) e1dVar).setValue(gvd.M(f6kVar.d, obj, p1gVar, f6kVar.b, f6kVar.c));
                                return Unit.a;
                            }
                            dj0Var.r = list2;
                            dj0Var.s = null;
                            dj0Var.t = i5;
                            dj0Var.u = i4;
                            dj0Var.x = 2;
                            if (cga.U(dj0Var) == lu3Var) {
                                return lu3Var;
                            }
                            size = i4;
                            i2 = i5;
                            list = list2;
                        } else {
                            if (i != 2) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            size = dj0Var.u;
                            i2 = dj0Var.t;
                            list = dj0Var.r;
                            y6a.M(obj);
                        }
                        i2++;
                        if (i2 < size) {
                            ((p1g) list.get(i2)).getClass();
                            i2++;
                            if (i2 < size) {
                                boolean B = bea.B(dj0Var.getContext());
                                this.e = false;
                                function1.invoke(new h6k(((eoh) e1dVar).getValue(), B));
                                return Unit.a;
                            }
                        }
                    } else {
                        y6a.M(obj);
                        List list3 = this.a;
                        size = list3.size();
                        list = list3;
                        i2 = 0;
                        if (i2 < size) {
                        }
                    }
                }
            }
            if (i == 0) {
            }
        } finally {
            boolean B2 = bea.B(dj0Var.getContext());
            this.e = false;
            function1.invoke(new h6k(((eoh) e1dVar).getValue(), B2));
        }
        dj0Var = new dj0(this, sq3Var);
        Object obj2 = dj0Var.v;
        lu3 lu3Var2 = lu3.a;
        i = dj0Var.x;
        function1 = this.c;
        e1dVar = this.d;
    }

    @Override // defpackage.cdi
    public final Object getValue() {
        return ((eoh) this.d).getValue();
    }
}

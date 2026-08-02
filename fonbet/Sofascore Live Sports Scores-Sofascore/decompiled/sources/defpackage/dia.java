package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dia extends hoi implements Function2 {
    public int r;

    public dia(rq3 rq3Var) {
        super(2, rq3Var);
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new dia(rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new dia((rq3) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0024 -> B:5:0x0027). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            z = true;
            if (z) {
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
            z = ((Boolean) obj).booleanValue();
            if (z) {
                ljd ljdVar = ljd.a;
                this.r = 1;
                obj = ljdVar.c(1000, true, this);
                if (obj == lu3Var) {
                    return lu3Var;
                }
                z = ((Boolean) obj).booleanValue();
                if (z) {
                    return Unit.a;
                }
            }
        }
    }
}

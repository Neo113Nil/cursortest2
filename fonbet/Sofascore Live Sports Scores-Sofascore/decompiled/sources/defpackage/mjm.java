package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mjm implements b98 {
    public final /* synthetic */ b98 a;
    public final /* synthetic */ lom b;

    public mjm(b98 b98Var, lom lomVar) {
        this.a = b98Var;
        this.b = lomVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.b98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, rq3 rq3Var) {
        shm shmVar;
        int i;
        if (rq3Var instanceof shm) {
            shmVar = (shm) rq3Var;
            int i2 = shmVar.s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                shmVar.s = i2 - Integer.MIN_VALUE;
                Object obj2 = shmVar.r;
                lu3 lu3Var = lu3.a;
                i = shmVar.s;
                if (i != 0) {
                    y6a.M(obj2);
                    if (Intrinsics.c((String) obj, this.b.w())) {
                        shmVar.s = 1;
                        if (this.a.emit(obj, shmVar) == lu3Var) {
                            return lu3Var;
                        }
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj2);
                }
                return Unit.a;
            }
        }
        shmVar = new shm(this, rq3Var);
        Object obj22 = shmVar.r;
        lu3 lu3Var2 = lu3.a;
        i = shmVar.s;
        if (i != 0) {
        }
        return Unit.a;
    }
}

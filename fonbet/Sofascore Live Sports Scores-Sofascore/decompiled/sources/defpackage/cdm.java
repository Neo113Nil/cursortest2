package defpackage;

import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class cdm implements b98 {
    public final /* synthetic */ b98 a;
    public final /* synthetic */ BlazePlayerType b;

    public cdm(b98 b98Var, BlazePlayerType blazePlayerType) {
        this.a = b98Var;
        this.b = blazePlayerType;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.b98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, rq3 rq3Var) {
        pam pamVar;
        int i;
        Object obj2;
        Boolean bool;
        if (rq3Var instanceof pam) {
            pamVar = (pam) rq3Var;
            int i2 = pamVar.s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pamVar.s = i2 - Integer.MIN_VALUE;
                Object obj3 = pamVar.r;
                lu3 lu3Var = lu3.a;
                i = pamVar.s;
                v4m v4mVar = null;
                if (i != 0) {
                    y6a.M(obj3);
                    String str = (String) obj;
                    v4m v4mVar2 = bmm.d;
                    Iterator it = bmm.e.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        v4m v4mVar3 = (v4m) obj2;
                        if (Intrinsics.c(v4mVar3.a, str) && v4mVar3.d == this.b) {
                            break;
                        }
                    }
                    v4m v4mVar4 = (v4m) obj2;
                    String str2 = v4mVar4 != null ? v4mVar4.a : null;
                    StringBuilder sb = new StringBuilder();
                    sb.append(v4mVar2 != null ? v4mVar2.a : null);
                    sb.append("prepare");
                    if (Intrinsics.c(str2, sb.toString())) {
                        if (v4mVar4.d == (v4mVar2 != null ? v4mVar2.d : null)) {
                            bmm.e.remove(v4mVar4);
                            if (v4mVar != null) {
                                pamVar.s = 1;
                                if (this.a.emit(v4mVar, pamVar) == lu3Var) {
                                    return lu3Var;
                                }
                            }
                        }
                    }
                    if (v4mVar4 != null) {
                        yda ydaVar = bmm.a;
                        List list = v4mVar4.e;
                        List list2 = v4mVar2 != null ? v4mVar2.e : null;
                        if (list2 == null) {
                            list2 = km5.a;
                        }
                        bool = Boolean.valueOf(!CollectionsKt.d0(list, CollectionsKt.W0(list2)).isEmpty());
                    } else {
                        bool = null;
                    }
                    if (Intrinsics.c(str, v4mVar2 != null ? v4mVar2.a : null)) {
                        v4mVar = v4mVar2;
                    } else if (Intrinsics.c(bool, Boolean.TRUE)) {
                        v4mVar = v4mVar4;
                    }
                    if (v4mVar != null) {
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj3);
                }
                return Unit.a;
            }
        }
        pamVar = new pam(this, rq3Var);
        Object obj32 = pamVar.r;
        lu3 lu3Var2 = lu3.a;
        i = pamVar.s;
        v4m v4mVar5 = null;
        if (i != 0) {
        }
        return Unit.a;
    }
}

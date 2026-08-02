package defpackage;

import com.sofascore.model.newNetwork.EventListResponse;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class a36 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ ArrayList s;
    public final /* synthetic */ v2g t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a36(ArrayList arrayList, v2g v2gVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.s = arrayList;
        this.t = v2gVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        v2g v2gVar = this.t;
        ArrayList arrayList = this.s;
        switch (i) {
            case 0:
                return new a36(arrayList, v2gVar, rq3Var, 0);
            default:
                return new a36(arrayList, v2gVar, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((a36) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        v2g v2gVar = this.t;
        ArrayList arrayList = this.s;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                return Boolean.valueOf(arrayList.addAll(CollectionsKt.B0(CollectionsKt.L0(((EventListResponse) v2gVar.a).getEvents(), 2))));
            default:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                return Boolean.valueOf(arrayList.addAll(CollectionsKt.B0(((EventListResponse) v2gVar.a).getEvents())));
        }
    }
}

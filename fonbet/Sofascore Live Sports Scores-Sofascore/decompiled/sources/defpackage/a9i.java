package defpackage;

import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.results.service.StageWorker;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class a9i extends hoi implements Function2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ asf B;
    public asf r;
    public asf s;
    public StageWorker t;
    public Iterator u;
    public asf v;
    public int w;
    public int x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ StageWorker z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9i(boolean z, StageWorker stageWorker, int i, asf asfVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.y = z;
        this.z = stageWorker;
        this.A = i;
        this.B = asfVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new a9i(this.y, this.z, this.A, this.B, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a9i) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0049, code lost:
    
        if (r12 == r0) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0075  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00a5 -> B:7:0x00a7). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        Iterator it;
        int i;
        asf asfVar;
        lu3 lu3Var = lu3.a;
        int i2 = this.x;
        asf asfVar2 = this.B;
        int i3 = this.A;
        StageWorker stageWorker = this.z;
        if (i2 == 0) {
            y6a.M(obj);
            if (!this.y) {
                list = km5.a;
                if (list.isEmpty()) {
                    it = list.iterator();
                    i = 0;
                    if (it.hasNext()) {
                    }
                    return Unit.a;
                }
                qa6 qa6Var = stageWorker.b;
                this.r = asfVar2;
                this.x = 2;
                obj = qa6Var.w(i3, this);
                if (obj != lu3Var) {
                    asfVar = asfVar2;
                    asfVar.a = !((Boolean) obj).booleanValue() || asfVar2.a;
                    return Unit.a;
                }
                return lu3Var;
            }
            this.x = 1;
            obj = stageWorker.g(i3, this);
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    asfVar = this.r;
                    y6a.M(obj);
                    asfVar.a = !((Boolean) obj).booleanValue() || asfVar2.a;
                    return Unit.a;
                }
                if (i2 != 3) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = this.w;
                asfVar2 = this.v;
                it = this.u;
                StageWorker stageWorker2 = this.t;
                asf asfVar3 = this.s;
                y6a.M(obj);
                asfVar2.a = !((Boolean) obj).booleanValue() || asfVar3.a;
                asfVar2 = asfVar3;
                stageWorker = stageWorker2;
                if (it.hasNext()) {
                    Stage stage = (Stage) it.next();
                    qa6 qa6Var2 = stageWorker.b;
                    int id = stage.getId();
                    this.r = null;
                    this.s = asfVar2;
                    this.t = stageWorker;
                    this.u = it;
                    this.v = asfVar2;
                    this.w = i;
                    this.x = 3;
                    obj = qa6Var2.w(id, this);
                    if (obj != lu3Var) {
                        stageWorker2 = stageWorker;
                        asfVar3 = asfVar2;
                        asfVar2.a = !((Boolean) obj).booleanValue() || asfVar3.a;
                        asfVar2 = asfVar3;
                        stageWorker = stageWorker2;
                        if (it.hasNext()) {
                        }
                    }
                    return lu3Var;
                }
                return Unit.a;
            }
            y6a.M(obj);
        }
        list = (List) obj;
        if (list.isEmpty()) {
        }
    }
}

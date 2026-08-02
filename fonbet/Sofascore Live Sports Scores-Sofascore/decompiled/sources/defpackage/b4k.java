package defpackage;

import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.newNetwork.StageResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class b4k extends hoi implements Function2 {
    public int A;
    public final /* synthetic */ Collection B;
    public final /* synthetic */ g4k C;
    public g4k r;
    public Collection s;
    public Iterator t;
    public Pair u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4k(Collection collection, g4k g4kVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.B = collection;
        this.C = g4kVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new b4k(this.B, this.C, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b4k) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00e5  */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0076 -> B:10:0x010b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00db -> B:6:0x00e1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0103 -> B:9:0x00ec). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        Iterator it;
        g4k g4kVar;
        int i;
        int i2;
        int i3;
        g4k g4kVar2;
        ArrayList arrayList2;
        Object obj2;
        Iterator it2;
        Pair pair;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Stage stage;
        lu3 lu3Var = lu3.a;
        int i9 = this.A;
        int i10 = 0;
        Stage stage2 = null;
        if (i9 == 0) {
            y6a.M(obj);
            Collection collection = this.B;
            arrayList = new ArrayList();
            it = collection.iterator();
            g4kVar = this.C;
            i = 0;
            i2 = 0;
            i3 = 0;
            if (it.hasNext()) {
            }
        } else if (i9 == 1) {
            int i11 = this.z;
            int i12 = this.y;
            int i13 = this.x;
            i5 = this.w;
            i4 = this.v;
            pair = this.u;
            it2 = this.t;
            Collection collection2 = this.s;
            g4k g4kVar3 = this.r;
            y6a.M(obj);
            i7 = i11;
            i8 = i13;
            i6 = i12;
            g4kVar2 = g4kVar3;
            arrayList2 = collection2;
            obj2 = obj;
            StageResponse stageResponse = (StageResponse) obj2;
            if (stageResponse == null) {
            }
            if (stage == null) {
            }
        } else {
            if (i9 != 2) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i8 = this.x;
            int i14 = this.w;
            int i15 = this.v;
            Pair pair2 = this.u;
            Iterator it3 = this.t;
            Collection collection3 = this.s;
            g4k g4kVar4 = this.r;
            y6a.M(obj);
            Object a = obj;
            ArrayList arrayList3 = collection3;
            Stage stage3 = (Stage) a;
            if (stage3 != null) {
                ArrayList arrayList4 = arrayList3;
                i3 = i8;
                it = it3;
                i2 = i14;
                arrayList = arrayList4;
                i = i15;
                g4kVar = g4kVar4;
                Pair pair3 = null;
                if (pair3 != null) {
                    arrayList.add(pair3);
                }
                i10 = 0;
                stage2 = null;
                if (it.hasNext()) {
                    pair3 = (Pair) it.next();
                    Object obj3 = pair3.b;
                    if (obj3 instanceof Stage) {
                        s96 s96Var = g4kVar.e;
                        int id = ((Stage) obj3).getId();
                        this.r = g4kVar;
                        this.s = arrayList;
                        this.t = it;
                        this.u = pair3;
                        this.v = i;
                        this.w = i2;
                        this.x = i3;
                        this.y = i10;
                        this.z = i10;
                        this.A = 1;
                        obj2 = s96Var.y(id, this);
                        if (obj2 != lu3Var) {
                            it2 = it;
                            i8 = i3;
                            pair = pair3;
                            int i16 = i2;
                            i4 = i;
                            i5 = i16;
                            arrayList2 = arrayList;
                            g4kVar2 = g4kVar;
                            i7 = i10;
                            i6 = i7;
                            StageResponse stageResponse2 = (StageResponse) obj2;
                            stage = stageResponse2 == null ? stageResponse2.getStage() : stage2;
                            if (stage == null) {
                                s96 s96Var2 = g4kVar2.e;
                                this.r = g4kVar2;
                                this.s = arrayList2;
                                this.t = it2;
                                this.u = pair;
                                this.v = i4;
                                this.w = i5;
                                this.x = i8;
                                this.y = i6;
                                this.z = i7;
                                this.A = 2;
                                a = s96Var2.a(stage, true, this);
                                if (a != lu3Var) {
                                    i14 = i5;
                                    i15 = i4;
                                    pair2 = pair;
                                    it3 = it2;
                                    arrayList3 = arrayList2;
                                    g4kVar4 = g4kVar2;
                                    Stage stage32 = (Stage) a;
                                    if (stage32 != null) {
                                        joa joaVar = l5i.a;
                                        l5i.l(stage32);
                                        Pair pair4 = new Pair(pair2.a, stage32);
                                        ArrayList arrayList5 = arrayList3;
                                        i3 = i8;
                                        it = it3;
                                        i2 = i14;
                                        arrayList = arrayList5;
                                        i = i15;
                                        g4kVar = g4kVar4;
                                        pair3 = pair4;
                                    }
                                }
                            } else {
                                int i17 = i4;
                                i2 = i5;
                                i = i17;
                                i3 = i8;
                                it = it2;
                                arrayList = arrayList2;
                                g4kVar = g4kVar2;
                                Pair pair32 = null;
                            }
                        }
                        return lu3Var;
                    }
                    if (pair32 != null) {
                    }
                    i10 = 0;
                    stage2 = null;
                    if (it.hasNext()) {
                        return arrayList;
                    }
                }
            }
        }
    }
}

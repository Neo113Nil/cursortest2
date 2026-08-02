package defpackage;

import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ju6 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ List t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ju6(int i, List list, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = i;
        this.t = list;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new ju6(0, this.t, rq3Var);
            default:
                return new ju6(1, this.t, rq3Var);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((ju6) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object next;
        double floatValue;
        double floatValue2;
        int i = this.r;
        List list = this.t;
        Object[] objArr = 0;
        int i2 = 1;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    obj = s9a.r(new ju6(i2, list, objArr == true ? 1 : 0), this);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                List<FantasyRoundPlayerUiModel> list2 = (List) obj;
                Iterator it = list2.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        Float f = ((FantasyRoundPlayerUiModel) next).q;
                        float floatValue3 = f != null ? f.floatValue() : 0.0f;
                        do {
                            Object next2 = it.next();
                            Float f2 = ((FantasyRoundPlayerUiModel) next2).q;
                            float floatValue4 = f2 != null ? f2.floatValue() : 0.0f;
                            if (Float.compare(floatValue3, floatValue4) < 0) {
                                next = next2;
                                floatValue3 = floatValue4;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = (FantasyRoundPlayerUiModel) next;
                Integer num = fantasyRoundPlayerUiModel != null ? new Integer(fantasyRoundPlayerUiModel.a) : null;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!((FantasyRoundPlayerUiModel) obj2).k) {
                        arrayList.add(obj2);
                    }
                }
                Iterator it2 = arrayList.iterator();
                double d = 0.0d;
                while (it2.hasNext()) {
                    FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel2 = (FantasyRoundPlayerUiModel) it2.next();
                    boolean z = fantasyRoundPlayerUiModel2.m;
                    Float f3 = fantasyRoundPlayerUiModel2.q;
                    if (z) {
                        if (f3 != null) {
                            floatValue2 = f3.floatValue() * 2.0d;
                        }
                        floatValue2 = 0.0d;
                    } else {
                        if (f3 != null) {
                            floatValue2 = f3.floatValue();
                        }
                        floatValue2 = 0.0d;
                    }
                    d += floatValue2;
                }
                float f4 = (float) d;
                double d2 = 0.0d;
                for (FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel3 : list2) {
                    int i4 = fantasyRoundPlayerUiModel3.a;
                    Float f5 = fantasyRoundPlayerUiModel3.q;
                    if (num != null && i4 == num.intValue()) {
                        if (f5 != null) {
                            floatValue = f5.floatValue() * 2.0d;
                        }
                        floatValue = 0.0d;
                    } else {
                        if (f5 != null) {
                            floatValue = f5.floatValue();
                        }
                        floatValue = 0.0d;
                    }
                    d2 += floatValue;
                }
                return new rx6(new Float(f4), new Float(((float) d2) - f4));
            default:
                lu3 lu3Var2 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    if (list.isEmpty()) {
                        return km5.a;
                    }
                    wd5 wd5Var = xd5.b;
                    long R = wkn.R(5, be5.SECONDS);
                    qa7 qa7Var = new qa7(list, (rq3) null, 1);
                    this.s = 1;
                    obj = wba.W(R, qa7Var, this);
                    if (obj == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i5 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                List list3 = (List) obj;
                return list3 == null ? km5.a : list3;
        }
    }
}

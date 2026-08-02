package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StageSeason;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.main.leagues.StageCategoryEventsFragment;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class i1i implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StageCategoryEventsFragment b;

    public /* synthetic */ i1i(StageCategoryEventsFragment stageCategoryEventsFragment, int i) {
        this.a = i;
        this.b = stageCategoryEventsFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        Intent intent;
        StageSeason stageSeason;
        Object obj3;
        Object obj4;
        boolean z;
        Stage stageParent;
        Stage stage;
        Stage stageParent2;
        int i = this.a;
        String str = null;
        Boolean bool = null;
        StageSeason stageSeason2 = null;
        str = null;
        StageCategoryEventsFragment stageCategoryEventsFragment = this.b;
        switch (i) {
            case 0:
                Integer num = (Integer) ((pn3) obj).a();
                if (num != null) {
                    stageCategoryEventsFragment.F().m(num.intValue());
                    List list = (List) stageCategoryEventsFragment.F().k.d();
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj2 = it.next();
                                if (((UniqueStage) obj2).getId() == num.intValue()) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        UniqueStage uniqueStage = (UniqueStage) obj2;
                        if (uniqueStage != null) {
                            FragmentActivity requireActivity = stageCategoryEventsFragment.requireActivity();
                            BaseActivity baseActivity = requireActivity instanceof BaseActivity ? (BaseActivity) requireActivity : null;
                            if (baseActivity != null && (intent = baseActivity.getIntent()) != null) {
                                Context requireContext = stageCategoryEventsFragment.requireContext();
                                requireContext.getClass();
                                nv.i0(requireContext, uniqueStage, intent);
                            }
                            str = stageCategoryEventsFragment.E(uniqueStage);
                        }
                    }
                    Object value = stageCategoryEventsFragment.w.getValue();
                    value.getClass();
                    ((d89) value).c.t(str, false);
                }
                break;
            case 1:
                List list2 = (List) obj;
                ArrayList k = me4.k(list2);
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    String E = stageCategoryEventsFragment.E((UniqueStage) it2.next());
                    if (E != null) {
                        k.add(E);
                    }
                }
                Integer num2 = stageCategoryEventsFragment.F().h;
                Iterator it3 = list2.iterator();
                int i2 = 0;
                while (true) {
                    if (it3.hasNext()) {
                        UniqueStage uniqueStage2 = (UniqueStage) it3.next();
                        uniqueStage2.getClass();
                        if ((num2 == null || uniqueStage2.getId() == num2.intValue()) == false) {
                            i2++;
                        }
                    } else {
                        i2 = -1;
                    }
                }
                Integer valueOf = i2 != -1 ? Integer.valueOf(i2) : null;
                r1 = valueOf != null ? valueOf.intValue() : 0;
                Object value2 = stageCategoryEventsFragment.w.getValue();
                value2.getClass();
                TypeHeaderView typeHeaderView = ((d89) value2).c;
                ArrayList arrayList = new ArrayList();
                Iterator it4 = list2.iterator();
                while (it4.hasNext()) {
                    String E2 = stageCategoryEventsFragment.E((UniqueStage) it4.next());
                    if (E2 != null) {
                        arrayList.add(E2);
                    }
                }
                typeHeaderView.y(arrayList, (String) CollectionsKt.a0(r1, k), Boolean.TRUE);
                break;
            case 2:
                e1d e1dVar = stageCategoryEventsFragment.y;
                List list3 = (List) obj;
                list3.getClass();
                e1d e1dVar2 = stageCategoryEventsFragment.x;
                ((eoh) e1dVar2).setValue(list3);
                ArrayList arrayList2 = new ArrayList(k13.r(list3, 10));
                Iterator it5 = list3.iterator();
                while (it5.hasNext()) {
                    arrayList2.add(((StageSeason) it5.next()).getYear());
                }
                StageSeason stageSeason3 = (StageSeason) ((eoh) e1dVar).getValue();
                if (arrayList2.contains(stageSeason3 != null ? stageSeason3.getYear() : null)) {
                    Iterator it6 = ((List) ((eoh) e1dVar2).getValue()).iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            obj3 = it6.next();
                            String year = ((StageSeason) obj3).getYear();
                            StageSeason stageSeason4 = (StageSeason) ((eoh) e1dVar).getValue();
                            if (Intrinsics.c(year, stageSeason4 != null ? stageSeason4.getYear() : null)) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    stageSeason = (StageSeason) obj3;
                } else {
                    stageSeason = (StageSeason) CollectionsKt.firstOrNull((List) ((eoh) e1dVar2).getValue());
                }
                if (stageSeason != null) {
                    r1i F = stageCategoryEventsFragment.F();
                    F.i = Integer.valueOf(stageSeason.getId());
                    F.l();
                    krk krkVar = stageCategoryEventsFragment.l;
                    krkVar.getClass();
                    ((xq8) krkVar).d.setRefreshing(true);
                    stageSeason2 = stageSeason;
                }
                ((eoh) e1dVar).setValue(stageSeason2);
                break;
            case 3:
                List<Stage> list4 = (List) obj;
                stageCategoryEventsFragment.n();
                Integer valueOf2 = (list4 == null || (stage = (Stage) CollectionsKt.firstOrNull(list4)) == null || (stageParent2 = stage.getStageParent()) == null) ? null : Integer.valueOf(stageParent2.getId());
                Iterator it7 = stageCategoryEventsFragment.D().i.iterator();
                while (true) {
                    if (it7.hasNext()) {
                        obj4 = it7.next();
                        if (obj4 instanceof Stage) {
                        }
                    } else {
                        obj4 = null;
                    }
                }
                if (!(obj4 instanceof Stage)) {
                    obj4 = null;
                }
                Stage stage2 = (Stage) obj4;
                if (!Intrinsics.c(valueOf2, (stage2 == null || (stageParent = stage2.getStageParent()) == null) ? null : Integer.valueOf(stageParent.getId()))) {
                    if (list4 != null) {
                        if (!list4.isEmpty()) {
                            for (Stage stage3 : list4) {
                                if (Intrinsics.c(stage3.getStatusType(), StatusKt.STATUS_IN_PROGRESS) || Intrinsics.c(stage3.getStatusType(), StatusKt.STATUS_NOT_STARTED)) {
                                    z = true;
                                    bool = Boolean.valueOf(z);
                                }
                            }
                        }
                        z = false;
                        bool = Boolean.valueOf(z);
                    }
                    if (Intrinsics.c(bool, Boolean.TRUE)) {
                        r1 = 1;
                    }
                }
                stageCategoryEventsFragment.D().F(list4 == null ? km5.a : list4);
                if (r1 != 0) {
                    stageCategoryEventsFragment.G(list4);
                }
                break;
            default:
                StageSeason stageSeason5 = (StageSeason) obj;
                stageSeason5.getClass();
                ((eoh) stageCategoryEventsFragment.y).setValue(stageSeason5);
                r1i F2 = stageCategoryEventsFragment.F();
                F2.i = Integer.valueOf(stageSeason5.getId());
                F2.l();
                krk krkVar2 = stageCategoryEventsFragment.l;
                krkVar2.getClass();
                ((xq8) krkVar2).d.setRefreshing(true);
                break;
        }
        return Unit.a;
    }
}

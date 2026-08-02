package defpackage;

import com.sofascore.model.cuptree.CupTree;
import com.sofascore.model.cuptree.CupTreeBlock;
import com.sofascore.model.cuptree.CupTreeRound;
import com.sofascore.model.cuptree.CupTreesResponse;
import com.sofascore.results.league.fragment.cuptree.BaseCupTreeFragment;
import com.sofascore.results.league.view.cuptree.CupTreeExtendedView;
import com.sofascore.results.view.CupTreeView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class i21 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseCupTreeFragment b;

    public /* synthetic */ i21(BaseCupTreeFragment baseCupTreeFragment, int i) {
        this.a = i;
        this.b = baseCupTreeFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CupTree cupTree;
        Object obj2;
        Object obj3;
        Boolean bool;
        boolean z;
        int i = this.a;
        BaseCupTreeFragment baseCupTreeFragment = this.b;
        switch (i) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                krk krkVar = baseCupTreeFragment.l;
                krkVar.getClass();
                ((co8) krkVar).h.setVisibility(booleanValue ? 0 : 8);
                baseCupTreeFragment.t.f(booleanValue);
                baseCupTreeFragment.I(booleanValue);
                CupTree cupTree2 = (CupTree) ((eoh) baseCupTreeFragment.s).getValue();
                if (cupTree2 != null) {
                    int i2 = CupTreeView.q;
                    if (t62.x(cupTree2)) {
                        baseCupTreeFragment.K(cupTree2, booleanValue);
                    }
                }
                krk krkVar2 = baseCupTreeFragment.l;
                krkVar2.getClass();
                ((co8) krkVar2).g.setSelected(booleanValue);
                krk krkVar3 = baseCupTreeFragment.l;
                krkVar3.getClass();
                ((co8) krkVar3).e.setExpanded(booleanValue);
                break;
            case 1:
                CupTreesResponse cupTreesResponse = (CupTreesResponse) obj;
                if (cupTreesResponse != null) {
                    baseCupTreeFragment.o = false;
                    List<CupTree> cupTrees = cupTreesResponse.getCupTrees();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : cupTrees) {
                        CupTree cupTree3 = (CupTree) obj4;
                        int i3 = CupTreeView.q;
                        if (!t62.x(cupTree3)) {
                            int i4 = CupTreeExtendedView.p;
                            if (s02.D(cupTree3)) {
                            }
                        }
                        arrayList.add(obj4);
                    }
                    ((eoh) baseCupTreeFragment.r).setValue(arrayList);
                    Iterator it = baseCupTreeFragment.A().iterator();
                    while (true) {
                        cupTree = null;
                        if (it.hasNext()) {
                            obj2 = it.next();
                            CupTree cupTree4 = (CupTree) obj2;
                            if (baseCupTreeFragment.E() != null) {
                                int id = cupTree4.getId();
                                Integer E = baseCupTreeFragment.E();
                                if (E != null && id == E.intValue()) {
                                }
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    CupTree cupTree5 = (CupTree) obj2;
                    if (cupTree5 == null) {
                        List A = baseCupTreeFragment.A();
                        Integer D = baseCupTreeFragment.D();
                        if (D == null) {
                            cupTree5 = null;
                        } else {
                            Iterator it2 = A.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj3 = it2.next();
                                    List<CupTreeRound> rounds = ((CupTree) obj3).getRounds();
                                    if (rounds != null) {
                                        if (!rounds.isEmpty()) {
                                            Iterator<T> it3 = rounds.iterator();
                                            while (it3.hasNext()) {
                                                List<CupTreeBlock> blocks = ((CupTreeRound) it3.next()).getBlocks();
                                                if (blocks == null || !blocks.isEmpty()) {
                                                    Iterator<T> it4 = blocks.iterator();
                                                    while (it4.hasNext()) {
                                                        List<Integer> events = ((CupTreeBlock) it4.next()).getEvents();
                                                        if (Intrinsics.c(events != null ? Boolean.valueOf(events.contains(D)) : null, Boolean.TRUE)) {
                                                            z = true;
                                                            bool = Boolean.valueOf(z);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        z = false;
                                        bool = Boolean.valueOf(z);
                                    } else {
                                        bool = null;
                                    }
                                    if (Intrinsics.c(bool, Boolean.TRUE)) {
                                    }
                                } else {
                                    obj3 = null;
                                }
                            }
                            cupTree5 = (CupTree) obj3;
                        }
                        if (cupTree5 == null) {
                            cupTree5 = (CupTree) CollectionsKt.firstOrNull(baseCupTreeFragment.A());
                        }
                    }
                    if (cupTree5 != null) {
                        baseCupTreeFragment.K(cupTree5, false);
                        cupTree = cupTree5;
                    }
                    ((eoh) baseCupTreeFragment.s).setValue(cupTree);
                    krk krkVar4 = baseCupTreeFragment.l;
                    krkVar4.getClass();
                    ((co8) krkVar4).b.setVisibility(baseCupTreeFragment.A().size() <= 1 ? 4 : 0);
                    krk krkVar5 = baseCupTreeFragment.l;
                    krkVar5.getClass();
                    ((co8) krkVar5).g.setOnExpand(baseCupTreeFragment.u);
                }
                break;
            default:
                CupTree cupTree6 = (CupTree) obj;
                cupTree6.getClass();
                ((eoh) baseCupTreeFragment.s).setValue(cupTree6);
                krk krkVar6 = baseCupTreeFragment.l;
                krkVar6.getClass();
                baseCupTreeFragment.K(cupTree6, ((co8) krkVar6).h.getVisibility() == 0);
                break;
        }
        return Unit.a;
    }
}

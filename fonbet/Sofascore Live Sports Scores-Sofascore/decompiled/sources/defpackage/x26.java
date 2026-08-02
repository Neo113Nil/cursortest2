package defpackage;

import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.model.network.response.GoalDistributionsResponse;
import com.sofascore.model.network.response.MediaHighlightedItem;
import com.sofascore.model.newNetwork.Highlight;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class x26 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;
    public final /* synthetic */ ltk w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x26(ltk ltkVar, int i, int i2, int i3, rq3 rq3Var, int i4) {
        super(2, rq3Var);
        this.r = i4;
        this.w = ltkVar;
        this.t = i;
        this.u = i2;
        this.v = i3;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        ltk ltkVar = this.w;
        switch (i) {
            case 0:
                return new x26((c36) ltkVar, this.t, this.u, this.v, rq3Var, 0);
            default:
                return new x26((e5c) ltkVar, this.t, this.u, this.v, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((x26) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d7, code lost:
    
        if (r0 == null) goto L42;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object P;
        Object I0;
        Object obj2;
        r5c r5cVar;
        int i = this.r;
        ltk ltkVar = this.w;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    j0j j0jVar = ((c36) ltkVar).g;
                    this.s = 1;
                    j0jVar.getClass();
                    P = yaa.P(new hh7(j0jVar, this.t, this.u, this.v, null, 2), this);
                    if (P == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    P = obj;
                }
                x2g x2gVar = (x2g) P;
                if (x2gVar instanceof v2g) {
                    return (GoalDistributionsResponse) ((v2g) x2gVar).a;
                }
                return null;
            default:
                e5c e5cVar = (e5c) ltkVar;
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    w3b w3bVar = e5cVar.c;
                    this.s = 1;
                    I0 = w3bVar.I0(this.t, this.u, this);
                    if (I0 == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    I0 = obj;
                }
                List list = (List) I0;
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        int i4 = this.v;
                        if (!hasNext) {
                            obj2 = CollectionsKt.H0(arrayList, new d5c(i4, 1));
                            break;
                        } else {
                            MediaHighlightedItem mediaHighlightedItem = (MediaHighlightedItem) it.next();
                            Integer mo689getId = mediaHighlightedItem.getItem().mo689getId();
                            if (mo689getId != null) {
                                int intValue = mo689getId.intValue();
                                String title = mediaHighlightedItem.getItem().getTitle();
                                if (title == null) {
                                    title = "";
                                }
                                String subtitle = mediaHighlightedItem.getItem().getSubtitle();
                                if (subtitle == null) {
                                    subtitle = "";
                                }
                                String videoUrl = mediaHighlightedItem.getItem().getVideoUrl();
                                Highlight highlight = new Highlight(intValue, title, subtitle, mediaHighlightedItem.getItem().getThumbnailUrl(), videoUrl == null ? "" : videoUrl, 6, false, null, 0L, "", Boolean.FALSE, null, a.o, null);
                                Integer mo689getId2 = mediaHighlightedItem.getItem().mo689getId();
                                r5cVar = new r5c(highlight, false, mo689getId2 != null && mo689getId2.intValue() == i4, 0, (Integer) null, 58);
                            } else {
                                r5cVar = null;
                            }
                            if (r5cVar != null) {
                                arrayList.add(r5cVar);
                            }
                        }
                    }
                }
                obj2 = km5.a;
                e5cVar.d.j(obj2);
                return Unit.a;
        }
    }
}

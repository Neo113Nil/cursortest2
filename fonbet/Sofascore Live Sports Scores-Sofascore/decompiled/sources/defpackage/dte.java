package defpackage;

import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.newNetwork.Highlight;
import com.sofascore.model.newNetwork.VideoHighlight;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class dte extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ gte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dte(gte gteVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = gteVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        gte gteVar = this.t;
        switch (i) {
            case 0:
                return new dte(gteVar, rq3Var, 0);
            default:
                return new dte(gteVar, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((dte) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object e;
        Object g;
        int i = this.r;
        gte gteVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    t9c t9cVar = gteVar.p;
                    int id = ((Player) gteVar.u()).getId();
                    this.s = 1;
                    e = t9cVar.e(id, this);
                    if (e == lu3Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                    e = obj;
                }
                List list = (List) e;
                if (list != null) {
                    ArrayList arrayList = new ArrayList(k13.r(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new r5c((Highlight) it.next(), false, false, 0, new Integer(((Player) gteVar.u()).getId()), 46));
                    }
                    break;
                } else {
                    break;
                }
            default:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    t9c t9cVar2 = gteVar.p;
                    int id2 = ((Player) gteVar.u()).getId();
                    this.s = 1;
                    g = t9cVar2.g(id2, this);
                    if (g == lu3Var2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                    g = obj;
                }
                List<VideoHighlight> list2 = (List) g;
                if (list2 != null) {
                    ArrayList arrayList2 = new ArrayList(k13.r(list2, 10));
                    for (VideoHighlight videoHighlight : list2) {
                        int id3 = videoHighlight.getId();
                        String title = videoHighlight.getTitle();
                        String str = title == null ? "" : title;
                        String description = videoHighlight.getDescription();
                        arrayList2.add(new r5c(new Highlight(id3, str, description == null ? "" : description, videoHighlight.getThumbnailUrl(), videoHighlight.getUrl(), Intrinsics.c(videoHighlight.getEmbeddable(), Boolean.TRUE) ? 6 : 1, false, null, 0L, "", Boolean.FALSE, null, a.o, null), false, false, 0, new Integer(((Player) gteVar.u()).getId()), 46));
                    }
                    break;
                } else {
                    break;
                }
        }
        return km5.a;
    }
}

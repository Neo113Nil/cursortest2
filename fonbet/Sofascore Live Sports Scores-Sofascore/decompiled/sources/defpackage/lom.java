package defpackage;

import com.blaze.blazesdk.analytics.enums.ContentType;
import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.features.stories.models.ui.StoryModel;
import com.blaze.blazesdk.features.stories.repos.StoriesRepositoryImpl;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.shared.results.BlazeResult;
import com.blaze.blazesdk.style.players.stories.BlazeStoryPlayerStyle;
import defpackage.cql;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lom extends cql {
    public BlazeStoryPlayerStyle q;
    public yda r;
    public yda s;
    public yda t;
    public yda u;
    public final ContentType v = ContentType.STORY;

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0072, code lost:
    
        if (r14 != r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004c, code lost:
    
        if (r13.k(r10) == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object A(lom lomVar, sq3 sq3Var) {
        b0m b0mVar;
        int i;
        lomVar.getClass();
        if (sq3Var instanceof b0m) {
            b0mVar = (b0m) sq3Var;
            int i2 = b0mVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b0mVar.u = i2 - Integer.MIN_VALUE;
                b0m b0mVar2 = b0mVar;
                Object obj = b0mVar2.s;
                lu3 lu3Var = lu3.a;
                i = b0mVar2.u;
                if (i != 0) {
                    y6a.M(obj);
                    lomVar.l = false;
                    b0mVar2.r = lomVar;
                    b0mVar2.u = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        lomVar = b0mVar2.r;
                        y6a.M(obj);
                        a9m a9mVar = (a9m) obj;
                        if (a9mVar instanceof qbm) {
                            List list = (List) ((qbm) a9mVar).a;
                            new irm();
                            list.getClass();
                            ArrayList arrayList = new ArrayList(k13.r(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(v7a.g((StoryModel) it.next()));
                            }
                            irm.b(arrayList, lomVar.o(), rvm.a);
                        }
                        if (a9mVar instanceof a6m) {
                            lomVar.c.k(new cql.a.C1350a(new BlazeResult.Error(null, null, null, "Failed to load stories", null, null, 55, null)));
                        }
                        return Unit.a;
                    }
                    lomVar = b0mVar2.r;
                    y6a.M(obj);
                }
                lomVar.getClass();
                StoriesRepositoryImpl storiesRepositoryImpl = StoriesRepositoryImpl.a;
                BlazeDataSourceType v = lomVar.v();
                String w = lomVar.w();
                String w2 = lomVar.w();
                boolean z = lomVar.m;
                b0mVar2.r = lomVar;
                b0mVar2.u = 2;
                obj = yrl.fetchStories$default(storiesRepositoryImpl, v, w, null, w2, z, false, null, null, b0mVar2, 228, null);
            }
        }
        b0mVar = new b0m(lomVar, sq3Var);
        b0m b0mVar22 = b0mVar;
        Object obj2 = b0mVar22.s;
        lu3 lu3Var2 = lu3.a;
        i = b0mVar22.u;
        if (i != 0) {
        }
        lomVar.getClass();
        StoriesRepositoryImpl storiesRepositoryImpl2 = StoriesRepositoryImpl.a;
        BlazeDataSourceType v2 = lomVar.v();
        String w3 = lomVar.w();
        String w22 = lomVar.w();
        boolean z2 = lomVar.m;
        b0mVar22.r = lomVar;
        b0mVar22.u = 2;
        obj2 = yrl.fetchStories$default(storiesRepositoryImpl2, v2, w3, null, w22, z2, false, null, null, b0mVar22, 228, null);
    }

    @Override // defpackage.cql, defpackage.ltk
    public final void e() {
        this.o = null;
        yda ydaVar = this.r;
        if (ydaVar != null) {
            ydaVar.e(null);
        }
        this.r = null;
        yda ydaVar2 = this.t;
        if (ydaVar2 != null) {
            ydaVar2.e(null);
        }
        this.t = null;
        yda ydaVar3 = this.u;
        if (ydaVar3 != null) {
            ydaVar3.e(null);
        }
        this.u = null;
        yda ydaVar4 = this.s;
        if (ydaVar4 != null) {
            ydaVar4.e(null);
        }
        this.s = null;
    }

    @Override // defpackage.cql
    public final ArrayList h(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            StoryModel storyModel = (StoryModel) it.next();
            storyModel.getClass();
            arrayList.add(new ipm(storyModel.id, storyModel.title, storyModel.f, storyModel.c, storyModel.a, null, storyModel.l, null, null, storyModel.m));
        }
        return arrayList;
    }

    @Override // defpackage.cql
    public final void l() {
        try {
            x5m.safeViewModelScopeIO$default(this, null, new zrl(this, null), 1, null);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // defpackage.cql
    public final void n() {
        yda ydaVar = this.u;
        if (ydaVar == null || !ydaVar.isActive()) {
            this.u = x5m.safeViewModelScopeIO$default(this, null, new zvl(this, null), 1, null);
        } else if (yrl.hasDataSourceChanged$default(StoriesRepositoryImpl.a, w(), v(), this.m, w(), null, null, 48, null)) {
            yda ydaVar2 = this.u;
            if (ydaVar2 != null) {
                ydaVar2.e(null);
            }
            this.u = x5m.safeViewModelScopeIO$default(this, null, new zvl(this, null), 1, null);
        }
    }

    @Override // defpackage.cql
    public final ContentType t() {
        return this.v;
    }

    @Override // defpackage.cql
    public final void y() {
        if (this.t != null) {
            return;
        }
        this.t = x5m.safeViewModelScopeIO$default(this, null, new y6m(this, null), 1, null);
    }
}

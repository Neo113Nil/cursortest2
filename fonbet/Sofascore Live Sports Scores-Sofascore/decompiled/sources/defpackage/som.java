package defpackage;

import com.blaze.blazesdk.analytics.enums.ContentType;
import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.features.videos.models.ui.VideoModel;
import com.blaze.blazesdk.features.videos.models.ui.i;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.shared.results.BlazeResult;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerStyle;
import defpackage.cql;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class som extends cql {
    public BlazeVideosPlayerStyle r;
    public i s;
    public yda t;
    public yda u;
    public yda v;
    public yda w;
    public final qom q = qom.b;
    public final ContentType x = ContentType.VIDEO;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
    
        if (r14 != r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0049, code lost:
    
        if (k(r10) == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object A(sq3 sq3Var) {
        g0m g0mVar;
        int i;
        if (sq3Var instanceof g0m) {
            g0mVar = (g0m) sq3Var;
            int i2 = g0mVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g0mVar.u = i2 - Integer.MIN_VALUE;
                g0m g0mVar2 = g0mVar;
                Object obj = g0mVar2.s;
                lu3 lu3Var = lu3.a;
                i = g0mVar2.u;
                if (i != 0) {
                    y6a.M(obj);
                    this.l = false;
                    g0mVar2.r = this;
                    g0mVar2.u = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = g0mVar2.r;
                        y6a.M(obj);
                        a9m a9mVar = (a9m) obj;
                        if (a9mVar instanceof qbm) {
                            List list = (List) ((qbm) a9mVar).a;
                            new irm();
                            irm.a(zmm.a(list), this.o(), new w5m(10), rvm.a);
                        }
                        if (a9mVar instanceof a6m) {
                            this.c.k(new cql.a.C1350a(new BlazeResult.Error(null, null, null, "Failed to load videos", null, null, 55, null)));
                        }
                        return Unit.a;
                    }
                    this = g0mVar2.r;
                    y6a.M(obj);
                }
                qom qomVar = this.q;
                BlazeDataSourceType v = this.v();
                String w = this.w();
                String w2 = this.w();
                boolean z = this.m;
                g0mVar2.r = this;
                g0mVar2.u = 2;
                obj = fsl.getVideos$default(qomVar, v, w, w2, false, z, null, null, null, g0mVar2, 232, null);
            }
        }
        g0mVar = new g0m(this, sq3Var);
        g0m g0mVar22 = g0mVar;
        Object obj2 = g0mVar22.s;
        lu3 lu3Var2 = lu3.a;
        i = g0mVar22.u;
        if (i != 0) {
        }
        qom qomVar2 = this.q;
        BlazeDataSourceType v2 = this.v();
        String w3 = this.w();
        String w22 = this.w();
        boolean z2 = this.m;
        g0mVar22.r = this;
        g0mVar22.u = 2;
        obj2 = fsl.getVideos$default(qomVar2, v2, w3, w22, false, z2, null, null, null, g0mVar22, 232, null);
    }

    @Override // defpackage.cql, defpackage.ltk
    public final void e() {
        this.o = null;
        yda ydaVar = this.t;
        if (ydaVar != null) {
            ydaVar.e(null);
        }
        this.t = null;
        yda ydaVar2 = this.v;
        if (ydaVar2 != null) {
            ydaVar2.e(null);
        }
        this.v = null;
        yda ydaVar3 = this.w;
        if (ydaVar3 != null) {
            ydaVar3.e(null);
        }
        this.w = null;
        yda ydaVar4 = this.u;
        if (ydaVar4 != null) {
            ydaVar4.e(null);
        }
        this.u = null;
    }

    @Override // defpackage.cql
    public final ArrayList h(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            VideoModel videoModel = (VideoModel) it.next();
            videoModel.getClass();
            arrayList.add(new ipm(videoModel.id, videoModel.title, videoModel.i, videoModel.k, false, Double.valueOf(videoModel.c), videoModel.p, videoModel.s, videoModel.t, videoModel.u));
        }
        return arrayList;
    }

    @Override // defpackage.cql
    public final void l() {
        try {
            x5m.safeViewModelScopeIO$default(this, null, new gsl(this, null), 1, null);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // defpackage.cql
    public final void n() {
        yda ydaVar = this.w;
        if (ydaVar == null || !ydaVar.isActive()) {
            this.w = x5m.safeViewModelScopeIO$default(this, null, new ewl(this, null), 1, null);
            return;
        }
        if (fsl.hasDataSourceChanged$default(this.q, w(), v(), this.m, w(), null, null, 48, null)) {
            yda ydaVar2 = this.w;
            if (ydaVar2 != null) {
                ydaVar2.e(null);
            }
            this.w = x5m.safeViewModelScopeIO$default(this, null, new ewl(this, null), 1, null);
        }
    }

    @Override // defpackage.cql
    public final ContentType t() {
        return this.x;
    }

    @Override // defpackage.cql
    public final void y() {
        if (this.v != null) {
            return;
        }
        this.v = x5m.safeViewModelScopeIO$default(this, null, new d7m(this, null), 1, null);
    }
}

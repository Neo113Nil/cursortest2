package defpackage;

import com.blaze.blazesdk.analytics.enums.ContentType;
import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.delegates.BlazeWidgetDelegate;
import com.blaze.blazesdk.features.moments.models.ui.MomentModel;
import com.blaze.blazesdk.features.moments.models.ui.a;
import com.blaze.blazesdk.prefetch.models.BlazeCachingLevel;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.shared.results.BlazeResult;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetLayout;
import defpackage.cql;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qpm extends cql {
    public BlazeMomentsPlayerStyle q;
    public a r;
    public yda s;
    public yda t;
    public yda u;
    public yda v;
    public final ContentType w = ContentType.MOMENT;

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
    
        if (r15 != r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
    
        if (r14.k(r11) == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object A(qpm qpmVar, sq3 sq3Var) {
        nzl nzlVar;
        int i;
        qpmVar.getClass();
        if (sq3Var instanceof nzl) {
            nzlVar = (nzl) sq3Var;
            int i2 = nzlVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nzlVar.u = i2 - Integer.MIN_VALUE;
                nzl nzlVar2 = nzlVar;
                Object obj = nzlVar2.s;
                lu3 lu3Var = lu3.a;
                i = nzlVar2.u;
                if (i != 0) {
                    y6a.M(obj);
                    qpmVar.l = false;
                    nzlVar2.r = qpmVar;
                    nzlVar2.u = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qpmVar = nzlVar2.r;
                        y6a.M(obj);
                        a9m a9mVar = (a9m) obj;
                        if (a9mVar instanceof qbm) {
                            List list = (List) ((qbm) a9mVar).a;
                            BlazeMomentsPlayerStyle blazeMomentsPlayerStyle = qpmVar.q;
                            if (blazeMomentsPlayerStyle == null) {
                                blazeMomentsPlayerStyle = BlazeSDK.INSTANCE.getDefaultMomentsPlayerStyle();
                            }
                            Function1 a = e7m.a(y9m.a(blazeMomentsPlayerStyle));
                            new irm();
                            irm.a(i6m.a(list), qpmVar.o(), a, rvm.a);
                        }
                        if (a9mVar instanceof a6m) {
                            qpmVar.c.k(new cql.a.C1350a(new BlazeResult.Error(null, null, null, "Failed to load moments", null, null, 55, null)));
                        }
                        return Unit.a;
                    }
                    qpmVar = nzlVar2.r;
                    y6a.M(obj);
                }
                qpmVar.getClass();
                gum gumVar = gum.b;
                BlazeDataSourceType v = qpmVar.v();
                String w = qpmVar.w();
                String w2 = qpmVar.w();
                boolean z = qpmVar.m;
                nzlVar2.r = qpmVar;
                nzlVar2.u = 2;
                obj = jrl.getMomentsAndSaveToCache$default(gumVar, v, w, w2, false, z, null, null, null, false, nzlVar2, 488, null);
            }
        }
        nzlVar = new nzl(qpmVar, sq3Var);
        nzl nzlVar22 = nzlVar;
        Object obj2 = nzlVar22.s;
        lu3 lu3Var2 = lu3.a;
        i = nzlVar22.u;
        if (i != 0) {
        }
        qpmVar.getClass();
        gum gumVar2 = gum.b;
        BlazeDataSourceType v2 = qpmVar.v();
        String w3 = qpmVar.w();
        String w22 = qpmVar.w();
        boolean z2 = qpmVar.m;
        nzlVar22.r = qpmVar;
        nzlVar22.u = 2;
        obj2 = jrl.getMomentsAndSaveToCache$default(gumVar2, v2, w3, w22, false, z2, null, null, null, false, nzlVar22, 488, null);
    }

    public final void B(String str, String str2, BlazeWidgetLayout blazeWidgetLayout, BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, BlazeDataSourceType blazeDataSourceType, BlazeCachingLevel blazeCachingLevel, boolean z, BlazeWidgetDelegate blazeWidgetDelegate, Map map, Function1 function1, a aVar) {
        str.getClass();
        blazeWidgetLayout.getClass();
        blazeDataSourceType.getClass();
        blazeCachingLevel.getClass();
        blazeWidgetDelegate.getClass();
        map.getClass();
        i(str, str2, blazeDataSourceType, blazeCachingLevel, blazeWidgetDelegate, z, map, function1, blazeWidgetLayout);
        this.q = blazeMomentsPlayerStyle;
        this.r = aVar;
        if (this.s == null) {
            this.s = x5m.safeViewModelScopeIO$default(this, null, new aom(this, null), 1, null);
        }
        if (this.t == null) {
            this.t = x5m.safeViewModelScopeIO$default(this, null, new ybm(this, null), 1, null);
        }
        if (w2g.a(z()) != null) {
            j(false);
            return;
        }
        gum gumVar = gum.b;
        boolean hasDataSourceChanged$default = jrl.hasDataSourceChanged$default(gumVar, w(), v(), this.m, w(), null, null, 48, null);
        cql.a aVar2 = (cql.a) this.d.d();
        if (hasDataSourceChanged$default) {
            j(false);
            return;
        }
        if (!(aVar2 instanceof cql.a.b)) {
            if (aVar2 instanceof cql.a.c) {
                m(((cql.a.c) aVar2).b);
                return;
            }
            return;
        }
        String w = w();
        gumVar.getClass();
        List q = gum.q(w);
        if (q.isEmpty()) {
            j(false);
        } else {
            m(q);
        }
    }

    @Override // defpackage.cql, defpackage.ltk
    public final void e() {
        this.o = null;
        yda ydaVar = this.s;
        if (ydaVar != null) {
            ydaVar.e(null);
        }
        this.s = null;
        yda ydaVar2 = this.u;
        if (ydaVar2 != null) {
            ydaVar2.e(null);
        }
        this.u = null;
        yda ydaVar3 = this.v;
        if (ydaVar3 != null) {
            ydaVar3.e(null);
        }
        this.v = null;
        yda ydaVar4 = this.t;
        if (ydaVar4 != null) {
            ydaVar4.e(null);
        }
        this.t = null;
    }

    @Override // defpackage.cql
    public final ArrayList h(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MomentModel momentModel = (MomentModel) it.next();
            momentModel.getClass();
            arrayList.add(new ipm(momentModel.id, momentModel.title, momentModel.i, momentModel.k, false, Double.valueOf(momentModel.c), momentModel.p, null, null, momentModel.t));
        }
        return arrayList;
    }

    @Override // defpackage.cql
    public final void l() {
        try {
            x5m.safeViewModelScopeIO$default(this, null, new krl(this, null), 1, null);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // defpackage.cql
    public final void n() {
        yda ydaVar = this.v;
        if (ydaVar == null || !ydaVar.isActive()) {
            this.v = x5m.safeViewModelScopeIO$default(this, null, new mvl(this, null), 1, null);
        } else if (jrl.hasDataSourceChanged$default(gum.b, w(), v(), this.m, w(), null, null, 48, null)) {
            yda ydaVar2 = this.v;
            if (ydaVar2 != null) {
                ydaVar2.e(null);
            }
            this.v = x5m.safeViewModelScopeIO$default(this, null, new mvl(this, null), 1, null);
        }
    }

    @Override // defpackage.cql
    public final ContentType t() {
        return this.w;
    }

    @Override // defpackage.cql
    public final void y() {
        if (this.u != null) {
            return;
        }
        this.u = x5m.safeViewModelScopeIO$default(this, null, new p6m(this, null), 1, null);
    }
}

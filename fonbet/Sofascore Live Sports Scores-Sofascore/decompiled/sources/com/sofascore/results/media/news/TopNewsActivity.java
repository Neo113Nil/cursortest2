package com.sofascore.results.media.news;

import android.os.Bundle;
import com.sofascore.results.mvvm.base.AbstractActivity;
import defpackage.du1;
import defpackage.duf;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.iz2;
import defpackage.joa;
import defpackage.llj;
import defpackage.mlj;
import defpackage.mqi;
import defpackage.olj;
import defpackage.otk;
import defpackage.qlj;
import defpackage.rq3;
import defpackage.tc3;
import defpackage.un0;
import defpackage.wrh;
import defpackage.xw3;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z23;
import defpackage.z45;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sofascore/results/media/news/TopNewsActivity;", "Lcom/sofascore/results/mvvm/base/AbstractActivity;", "<init>", "()V", "dff", "Lplj;", "state", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TopNewsActivity extends AbstractActivity {
    public static final /* synthetic */ int O = 0;
    public final mqi J = ypa.b(new llj(this, 0));
    public final otk K = new otk(duf.a.getOrCreateKotlinClass(qlj.class), new olj(this, 1), new olj(this, 0), new olj(this, 2));
    public long L;
    public final joa M;
    public final joa N;

    public TopNewsActivity() {
        llj lljVar = new llj(this, 3);
        ysa ysaVar = ysa.c;
        this.M = ypa.a(ysaVar, lljVar);
        this.N = ypa.a(ysaVar, new llj(this, 4));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
        qlj qljVar = (qlj) this.K.getValue();
        int i = qljVar.i;
        Integer num = qljVar.h;
        rq3 rq3Var = null;
        if (num != null) {
            xw3.L(un0.z(qljVar), null, null, new du1(qljVar, num.intValue(), i, rq3Var, 10), 3);
        } else {
            iz2 z = un0.z(qljVar);
            hs4 hs4Var = z45.a;
            xw3.L(z, hq4.c, null, new z23(qljVar, i, rq3Var, 22), 2);
        }
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mqi mqiVar = this.J;
        setContentView(((wrh) mqiVar.getValue()).a);
        ((wrh) mqiVar.getValue()).b.setContent(new tc3(-135527572, new mlj(this, 0), true));
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "NewsScreen";
    }
}

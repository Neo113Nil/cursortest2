package com.sofascore.results.media.highlights;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import com.sofascore.model.newNetwork.mediaposts.MediaType;
import com.sofascore.results.R;
import com.sofascore.results.mvvm.base.AbstractActivity;
import defpackage.a5c;
import defpackage.bba;
import defpackage.c5c;
import defpackage.du1;
import defpackage.duf;
import defpackage.e5c;
import defpackage.eqb;
import defpackage.ez0;
import defpackage.g6b;
import defpackage.h2c;
import defpackage.hol;
import defpackage.hpo;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.i2c;
import defpackage.ida;
import defpackage.iz2;
import defpackage.jf;
import defpackage.joa;
import defpackage.km5;
import defpackage.kr9;
import defpackage.mqi;
import defpackage.otk;
import defpackage.pd;
import defpackage.qea;
import defpackage.qhi;
import defpackage.rq3;
import defpackage.un0;
import defpackage.x26;
import defpackage.xw3;
import defpackage.xxb;
import defpackage.y4c;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z45;
import defpackage.z4c;
import defpackage.z8e;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/media/highlights/MediaHighlightsActivity;", "Lcom/sofascore/results/mvvm/base/AbstractActivity;", "<init>", "()V", "q1f", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MediaHighlightsActivity extends AbstractActivity {
    public static final /* synthetic */ int a0 = 0;
    public final mqi J;
    public final otk K;
    public final z4c L = new z4c(this, 10);
    public final joa M;
    public final joa N;
    public final joa O;
    public final joa P;
    public final joa Q;
    public final joa R;
    public final joa S;
    public final joa T;
    public final joa U;
    public final joa V;
    public final joa W;
    public final joa X;
    public int Y;
    public i2c Z;

    public MediaHighlightsActivity() {
        int i = 0;
        this.J = ypa.b(new z4c(this, i));
        int i2 = 1;
        int i3 = 2;
        this.K = new otk(duf.a.getOrCreateKotlinClass(e5c.class), new a5c(this, i2), new a5c(this, i), new a5c(this, i3));
        z4c z4cVar = new z4c(this, 11);
        ysa ysaVar = ysa.c;
        this.M = ypa.a(ysaVar, z4cVar);
        this.N = ypa.a(ysaVar, new z4c(this, 12));
        this.O = ypa.a(ysaVar, new z4c(this, 13));
        this.P = ypa.a(ysaVar, new z4c(this, 14));
        this.Q = ypa.a(ysaVar, new z4c(this, i2));
        this.R = ypa.a(ysaVar, new z4c(this, i3));
        this.S = ypa.a(ysaVar, new z4c(this, 3));
        this.T = ypa.a(ysaVar, new z4c(this, 4));
        this.U = ypa.a(ysaVar, new z4c(this, 6));
        this.V = ypa.a(ysaVar, new z4c(this, 7));
        this.W = ypa.a(ysaVar, new z4c(this, 8));
        this.X = ypa.a(ysaVar, new z4c(this, 9));
    }

    public final pd Q() {
        return (pd) this.J.getValue();
    }

    public final y4c R() {
        return (y4c) this.M.getValue();
    }

    public final void S() {
        joa joaVar = this.V;
        int intValue = ((Number) joaVar.getValue()).intValue();
        otk otkVar = this.K;
        joa joaVar2 = this.T;
        joa joaVar3 = this.W;
        rq3 rq3Var = null;
        if (intValue != 0 && ((Number) joaVar3.getValue()).intValue() != 0) {
            e5c e5cVar = (e5c) otkVar.getValue();
            int intValue2 = ((Number) joaVar2.getValue()).intValue();
            int intValue3 = ((Number) joaVar.getValue()).intValue();
            xw3.L(un0.z(e5cVar), null, null, new x26(e5cVar, ((Number) joaVar3.getValue()).intValue(), intValue3, intValue2, null, 1), 3);
            return;
        }
        if (((Number) joaVar3.getValue()).intValue() != 0) {
            e5c e5cVar2 = (e5c) otkVar.getValue();
            int intValue4 = ((Number) joaVar2.getValue()).intValue();
            xw3.L(un0.z(e5cVar2), null, null, new du1(e5cVar2, ((Number) joaVar3.getValue()).intValue(), intValue4, rq3Var, 5), 3);
            return;
        }
        int intValue5 = ((Number) this.R.getValue()).intValue();
        int ordinal = MediaType.ExternalVideo.ordinal();
        joa joaVar4 = this.U;
        if (intValue5 == ordinal) {
            e5c e5cVar3 = (e5c) otkVar.getValue();
            int intValue6 = ((Number) joaVar2.getValue()).intValue();
            List list = (List) joaVar4.getValue();
            if (list == null) {
                list = km5.a;
            }
            List list2 = list;
            list2.getClass();
            iz2 z = un0.z(e5cVar3);
            hs4 hs4Var = z45.a;
            xw3.L(z, hq4.c, null, new c5c(list2, e5cVar3, intValue6, rq3Var, 0), 2);
            return;
        }
        e5c e5cVar4 = (e5c) otkVar.getValue();
        int intValue7 = ((Number) joaVar2.getValue()).intValue();
        List list3 = (List) joaVar4.getValue();
        if (list3 == null) {
            list3 = km5.a;
        }
        List list4 = list3;
        list4.getClass();
        iz2 z2 = un0.z(e5cVar4);
        hs4 hs4Var2 = z45.a;
        xw3.L(z2, hq4.c, null, new c5c(list4, e5cVar4, intValue7, rq3Var, 1), 2);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        this.x.b = "feed";
        setContentView(Q().a);
        this.o = Q().b;
        Q().e.setOnRefreshListener(new kr9(this, 9));
        z8e.X(Q().e, this, null);
        this.Y = getIntent().getIntExtra("highlight_id", 0);
        MediaHighlightHeaderView mediaHighlightHeaderView = Q().d;
        String str2 = (String) this.N.getValue();
        String str3 = (String) this.O.getValue();
        boolean booleanValue = ((Boolean) this.Q.getValue()).booleanValue();
        ez0 ez0Var = mediaHighlightHeaderView.d;
        mediaHighlightHeaderView.g = str2;
        String str4 = "";
        if (booleanValue) {
            mqi mqiVar = qhi.a;
            str = qhi.c(str2, false);
        } else {
            str = "";
        }
        mediaHighlightHeaderView.f = str;
        TextView textView = (TextView) ez0Var.d;
        if (str3 == null) {
            str3 = "";
        }
        textView.setText(str3);
        z8e.a0((MaterialButton) ez0Var.c, 1000L, new xxb(mediaHighlightHeaderView, 1));
        YouTubePlayerView youTubePlayerView = mediaHighlightHeaderView.i;
        int i = 3;
        if (youTubePlayerView == null || !booleanValue) {
            mediaHighlightHeaderView.o();
        } else {
            if (mediaHighlightHeaderView.isAttachedToWindow()) {
                g6b t = qea.t(mediaHighlightHeaderView);
                if (t != null) {
                    t.a(youTubePlayerView);
                }
            } else {
                mediaHighlightHeaderView.addOnAttachStateChangeListener(new jf(mediaHighlightHeaderView, mediaHighlightHeaderView, youTubePlayerView, i));
            }
            hol holVar = new hol(new WeakReference(mediaHighlightHeaderView.getContext()), new WeakReference(qea.t(mediaHighlightHeaderView)), new WeakReference(mediaHighlightHeaderView.e), new WeakReference(youTubePlayerView), mediaHighlightHeaderView.f, null, null, new ida(mediaHighlightHeaderView, 27), 96);
            Context applicationContext = mediaHighlightHeaderView.getContext().getApplicationContext();
            applicationContext.getClass();
            youTubePlayerView.a(holVar, new hpo(applicationContext).i());
            mediaHighlightHeaderView.h = holVar;
        }
        if (((Boolean) this.P.getValue()).booleanValue()) {
            str4 = getString(R.string.creator_spotlight);
        } else if (((Number) this.R.getValue()).intValue() == MediaType.ExternalVideo.ordinal()) {
            str4 = getString(R.string.videos_for_you);
        } else {
            joa joaVar = this.S;
            if (((Number) joaVar.getValue()).intValue() != 0) {
                str4 = getString(((Number) joaVar.getValue()).intValue());
            }
        }
        str4.getClass();
        setTitle(str4);
        RecyclerView recyclerView = Q().c;
        z8e.b0(recyclerView, this, false, false, new z4c(this, 5), 14);
        recyclerView.setAdapter(R());
        this.Z = new i2c(recyclerView, (String) this.X.getValue());
        y4c R = R();
        bba bbaVar = new bba(this, 11);
        R.getClass();
        R.a.d = bbaVar;
        S();
        ((e5c) this.K.getValue()).e.e(this, new eqb(i, new ida(this, 28)));
    }

    @Override // com.sofascore.results.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        i2c i2cVar = this.Z;
        if (i2cVar != null) {
            i2cVar.c();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        i2c i2cVar = this.Z;
        if (i2cVar != null) {
            i2cVar.a.getHitRect(i2cVar.d);
            LinkedHashMap linkedHashMap = i2cVar.c;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                i2cVar.b((h2c) entry.getKey(), ((Number) entry.getValue()).longValue());
            }
            linkedHashMap.clear();
        }
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "VideoHighlightsScreen";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
    }
}

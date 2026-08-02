package com.sofascore.results.feed;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import com.sofascore.model.newNetwork.Highlight;
import com.sofascore.results.dialog.BaseFullScreenDialog;
import defpackage.fye;
import defpackage.hol;
import defpackage.hpo;
import defpackage.ida;
import defpackage.krk;
import defpackage.mqi;
import defpackage.qhi;
import defpackage.snl;
import defpackage.t61;
import defpackage.u4c;
import defpackage.v4c;
import defpackage.v5b;
import defpackage.xnl;
import defpackage.ypa;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/sofascore/results/feed/MediaExternalVideoDialog;", "Lcom/sofascore/results/dialog/BaseFullScreenDialog;", "Lv4c;", "<init>", "()V", "uaa", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MediaExternalVideoDialog extends BaseFullScreenDialog<v4c> {
    public final mqi v = ypa.b(new u4c(this, 0));
    public final fye w = new fye();

    @Override // com.sofascore.results.dialog.BaseFullScreenDialog, androidx.fragment.app.Fragment
    public final void onPause() {
        snl snlVar;
        fye fyeVar = this.w;
        if (fyeVar != null && (snlVar = fyeVar.a) != null) {
            ((xnl) snlVar).c();
        }
        super.onPause();
    }

    @Override // com.sofascore.results.dialog.BaseFullScreenDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        this.r.a = Integer.valueOf(requireArguments().getInt("POST_ID"));
        v4c v4cVar = (v4c) this.s;
        if (v4cVar != null) {
            getLifecycle().a(v4cVar.b);
        }
        WeakReference weakReference = new WeakReference(getContext());
        WeakReference weakReference2 = new WeakReference(getLifecycle());
        WeakReference weakReference3 = new WeakReference(this.w);
        v4c v4cVar2 = (v4c) this.s;
        WeakReference weakReference4 = new WeakReference(v4cVar2 != null ? v4cVar2.b : null);
        mqi mqiVar = qhi.a;
        Highlight highlight = (Highlight) this.v.getValue();
        hol holVar = new hol(weakReference, weakReference2, weakReference3, weakReference4, qhi.c(highlight != null ? highlight.getUrl() : null, false), new u4c(this, 1), null, new ida(this, 26), 64);
        v4c v4cVar3 = (v4c) this.s;
        if (v4cVar3 != null) {
            YouTubePlayerView youTubePlayerView = v4cVar3.b;
            v5b v5bVar = youTubePlayerView.b;
            Context applicationContext = youTubePlayerView.getContext().getApplicationContext();
            applicationContext.getClass();
            youTubePlayerView.a(holVar, new hpo(applicationContext).i());
            v5bVar.getWebViewYouTubePlayer$core_release().c.a(holVar);
            v5bVar.getWebViewYouTubePlayer$core_release().c.a(new t61(this, 1));
        }
    }

    @Override // com.sofascore.results.dialog.BaseFullScreenDialog
    public final String q() {
        return "YoutubeModal";
    }

    @Override // com.sofascore.results.dialog.BaseFullScreenDialog
    public final krk s(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return v4c.a(layoutInflater, viewGroup);
    }
}

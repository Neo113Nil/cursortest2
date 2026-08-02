package com.vk.movika.sdk.base.hooks;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.clips.design.view.camera.controls.ClipsControlsView;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.view.components.tooltip.VkTooltip;
import com.vk.dto.stories.model.StoryUploadParams;
import com.vk.movika.sdk.player.base.listener.PlaybackStateListener;
import com.vk.music.fragment.impl.model.a;
import com.vk.newsfeed.impl.feed.views.FeedRecyclerPaginatedView;
import com.vk.search.communities.map.catalog.request.SearchCommunitiesOnMapRequestFactory;
import com.vk.voip.ui.broadcast.fragments.config.BroadcastConfigFragment;
import io.reactivex.rxjava3.core.t;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import me.grishka.appkit.views.UsableRecyclerPaginatedView;
import xsna.byo;
import xsna.dj1;
import xsna.du;
import xsna.ehu;
import xsna.hda;
import xsna.i0p;
import xsna.i3f;
import xsna.iie;
import xsna.lmv;
import xsna.o5b;
import xsna.p40;
import xsna.q5r;
import xsna.s4k;
import xsna.t440;
import xsna.tq70;
import xsna.u5r;
import xsna.uo40;
import xsna.vv7;
import xsna.wzs;
import xsna.yl3;
import xsna.z7f;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements PlaybackStateListener, io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, VkTooltip.b, io.reactivex.rxjava3.functions.c, Continuation, tq70.b, SwipeDrawableRefreshLayout.g, io.reactivex.rxjava3.functions.h {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(a.C1323a c1323a, VKApiExecutionException vKApiExecutionException) {
        this.b = 17;
        this.c = vKApiExecutionException;
    }

    @Override // xsna.tq70.b
    public void accept(Object obj) {
        ((i0p.a) obj).a((VKApiExecutionException) this.c);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 1:
                return (du) ((p40) this.c).invoke(obj);
            case 5:
                return (t) ((p40) this.c).invoke(obj);
            case 6:
                return (o5b) ((dj1) this.c).invoke(obj);
            case 8:
                return (Long) ((dj1) this.c).invoke(obj);
            case 10:
                return (t) ((p40) this.c).invoke(obj);
            case 11:
                return (List) ((i3f) this.c).invoke(obj);
            case 12:
                return (z7f) ((yl3) this.c).invoke(obj);
            case 16:
                return (Result) ((dj1) this.c).invoke(obj);
            case 21:
                return (t) ((ehu) this.c).invoke(obj);
            case 23:
                return (StoryUploadParams) ((t440) this.c).c;
            case 25:
                return (hda) ((uo40.b) this.c).invoke(obj);
            case 27:
                return (String) ((t440) this.c).invoke(obj);
            case 28:
                return (hda) ((SearchCommunitiesOnMapRequestFactory.a) this.c).invoke(obj);
            default:
                return (List) ((t440) this.c).invoke(obj);
        }
    }

    @Override // com.vk.core.view.components.tooltip.VkTooltip.b
    public void b(VkTooltip.DismissReason dismissReason) {
        CameraUIView cameraUIView = (CameraUIView) this.c;
        float f = CameraUIView.w1;
        ClipsControlsView clipsControls = cameraUIView.getClipsControls();
        if (clipsControls != null) {
            lmv.J2(clipsControls, null, 7);
        }
    }

    @Override // io.reactivex.rxjava3.functions.h
    public Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        return (u5r) ((q5r) this.c).invoke(obj, obj2, obj3, obj4);
    }

    @Override // com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout.g
    public void h() {
        UsableRecyclerPaginatedView.a aVar = ((FeedRecyclerPaginatedView) this.c).R;
        if (aVar != null) {
            aVar.h();
        }
    }

    @Override // com.vk.movika.sdk.player.base.listener.PlaybackStateListener
    public void i(PlaybackStateListener.PlaybackState playbackState) {
        i iVar = (i) this.c;
        if (playbackState == PlaybackStateListener.PlaybackState.READY) {
            iVar.a();
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 2:
                return ((Boolean) ((dj1) obj2).invoke(obj)).booleanValue();
            case 3:
                int i2 = BroadcastConfigFragment.U;
                return ((Boolean) ((dj1) obj2).invoke(obj)).booleanValue();
            case 7:
                return ((Boolean) ((dj1) obj2).invoke(obj)).booleanValue();
            case 9:
                return ((Boolean) ((dj1) obj2).invoke(obj)).booleanValue();
            case 14:
                return ((Boolean) ((iie) obj2).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((byo) obj2).invoke(obj)).booleanValue();
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((s4k) this.c).call();
    }

    public /* synthetic */ f(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        switch (this.b) {
            case 13:
                return (Pair) ((vv7) this.c).invoke(obj, obj2);
            default:
                return (Pair) ((wzs) this.c).invoke(obj, obj2);
        }
    }
}

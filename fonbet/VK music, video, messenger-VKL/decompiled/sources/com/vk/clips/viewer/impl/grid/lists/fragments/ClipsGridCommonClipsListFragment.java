package com.vk.clips.viewer.impl.grid.lists.fragments;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.clips.viewer.impl.grid.lists.ClipsGridPaginatedView;
import com.vk.clips.viewer.impl.grid.lists.ClipsGridTabData;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.compilation.Compilation;
import com.vk.dto.geo.GeoPlace;
import com.vk.dto.masks.Mask;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.shortvideo.ClipCameraParams;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.dto.shortvideo.entries.ClipsGridHeaderEntry;
import com.vk.stat.scheme.CommonVideoStat$TypeScreenMode;
import com.vk.stat.scheme.CommonVideoStat$TypeVideoCardEvent;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeClipGridItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ah;
import xsna.anj;
import xsna.aof;
import xsna.asu0;
import xsna.bjc;
import xsna.c5g;
import xsna.drm0;
import xsna.epx;
import xsna.eu1;
import xsna.ey0;
import xsna.ez;
import xsna.fb;
import xsna.g620;
import xsna.gzs;
import xsna.i5g;
import xsna.ide;
import xsna.ie;
import xsna.io2;
import xsna.izs;
import xsna.j5g;
import xsna.k15;
import xsna.kwc;
import xsna.m4;
import xsna.msy;
import xsna.nce;
import xsna.nmv;
import xsna.oce;
import xsna.of7;
import xsna.oz50;
import xsna.pce;
import xsna.pee;
import xsna.py;
import xsna.q;
import xsna.qce;
import xsna.qt;
import xsna.rli0;
import xsna.s3q0;
import xsna.s490;
import xsna.ulp0;
import xsna.uzp0;
import xsna.vee;
import xsna.wzs;
import xsna.xg5;
import xsna.yg;
import xsna.zof;
import xsna.zy;

/* compiled from: ClipsGridCommonClipsListFragment.kt */
/* loaded from: classes17.dex */
public final class ClipsGridCommonClipsListFragment extends AbstractClipsGridListFragment {
    public static final /* synthetic */ int q0 = 0;
    public final Object f0;
    public final Object g0;
    public final Object h0;
    public final Object i0;
    public aof j0;
    public final IntentFilter k0;
    public final Object l0;
    public final of7 m0;
    public final Object n0;
    public b o0;
    public io.reactivex.rxjava3.disposables.c p0;

    /* compiled from: ClipsGridCommonClipsListFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: ClipsGridCommonClipsListFragment.kt */
    public final class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            String action = intent != null ? intent.getAction() : null;
            if (action != null) {
                int hashCode = action.hashCode();
                if (hashCode != -611648706) {
                    if (hashCode != 1832049201 || !action.equals("com.vkontakte.android.ACTION_GROUP_STATUS_CHANGED")) {
                        return;
                    }
                } else if (!action.equals("com.vkontakte.android.ACTION_FRIEND_STATUS_CHANGED")) {
                    return;
                }
                UserId userId = (UserId) intent.getParcelableExtra("id");
                if (userId == null) {
                    return;
                }
                boolean z = false;
                int intExtra = intent.getIntExtra("status", 0);
                if (userId.b <= 0 ? !(intExtra == 0 || intExtra == -1) : !(intExtra == 0 || intExtra == -1)) {
                    z = true;
                }
                int i = ClipsGridCommonClipsListFragment.q0;
                ClipsGridCommonClipsListFragment.this.to(userId, z);
            }
        }
    }

    /* compiled from: ClipsGridCommonClipsListFragment.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements wzs<Integer, io2, s3q0> {
        /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.wzs
        public final s3q0 invoke(Integer num, io2 io2Var) {
            Object music;
            Object compilation;
            String r;
            int intValue = num.intValue();
            io2 io2Var2 = io2Var;
            ClipsGridCommonClipsListFragment clipsGridCommonClipsListFragment = (ClipsGridCommonClipsListFragment) this.receiver;
            int i = ClipsGridCommonClipsListFragment.q0;
            ClipGridParams f = clipsGridCommonClipsListFragment.ko().f();
            if (f instanceof ClipGridParams.Data) {
                int E0 = clipsGridCommonClipsListFragment.jo().E0() - rli0.A(rli0.t(rli0.j(new i5g(clipsGridCommonClipsListFragment.jo().y0()), qce.b), new qt(13))).size();
                ClipGridParams f2 = clipsGridCommonClipsListFragment.ko().f();
                ClipGridParams.OnlyId zb = f2 != null ? f2.zb() : null;
                ClipGridParams.OnlyId.Profile profile = zb instanceof ClipGridParams.OnlyId.Profile ? (ClipGridParams.OnlyId.Profile) zb : null;
                boolean z = ((zof) clipsGridCommonClipsListFragment.f0.getValue()).H().isEnabled() && (k15.r(clipsGridCommonClipsListFragment) || (profile != null && xg5.a().e(profile.b)));
                int i2 = intValue - E0;
                VideoFile videoFile = (VideoFile) j5g.b0(i2, clipsGridCommonClipsListFragment.so());
                if (videoFile != null && (r = videoFile.r()) != null) {
                    SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CATALOG_ITEM, null, null, null, r, null, 46, null), new CommonVideoStat$TypeVideoCardEvent(CommonVideoStat$TypeVideoCardEvent.EventType.CLICK, CommonVideoStat$TypeScreenMode.PREVIEW), 2);
                    UiTracker uiTracker = UiTracker.a;
                    MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                    uzp0 uzp0Var = UiTracker.h;
                    uzp0Var.getClass();
                    new bjc(c, b, uzp0Var.a).q();
                }
                ClipsRouter a = g620.f().a();
                FragmentActivity kn = clipsGridCommonClipsListFragment.kn();
                ClipGridParams.Data data = (ClipGridParams.Data) f;
                if (data instanceof ClipGridParams.Data.Profile) {
                    Owner owner = ((ClipGridParams.Data.Profile) data).b.b;
                    music = new ClipFeedTab.Profile(owner.c, owner.b);
                } else {
                    if (data instanceof ClipGridParams.Data.Hashtag) {
                        ClipGridParams.Data.Hashtag hashtag = (ClipGridParams.Data.Hashtag) data;
                        compilation = new ClipFeedTab.Hashtag(hashtag.b, hashtag.d, null, 4, null);
                    } else if (data instanceof ClipGridParams.Data.GeoPlace) {
                        GeoPlace geoPlace = ((ClipGridParams.Data.GeoPlace) data).b;
                        music = new ClipFeedTab.Place(geoPlace.c, geoPlace.i);
                    } else if (data instanceof ClipGridParams.Data.CameraMask) {
                        ClipGridParams.Data.CameraMask cameraMask = (ClipGridParams.Data.CameraMask) data;
                        String str = cameraMask.b.g;
                        StringBuilder sb = new StringBuilder();
                        Mask mask = cameraMask.b;
                        sb.append(mask.e);
                        sb.append('_');
                        sb.append(mask.d);
                        music = new ClipFeedTab.Mask(str, sb.toString());
                    } else if (data instanceof ClipGridParams.Data.ClipCompilation) {
                        ClipGridParams.Data.ClipCompilation clipCompilation = (ClipGridParams.Data.ClipCompilation) data;
                        String valueOf = String.valueOf(clipCompilation.b.b);
                        Compilation compilation2 = clipCompilation.b;
                        compilation = new ClipFeedTab.Compilation(valueOf, compilation2.e, compilation2.c, null, 8, null);
                    } else {
                        if (!(data instanceof ClipGridParams.Data.Music)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ClipGridParams.Data.Music music2 = (ClipGridParams.Data.Music) data;
                        MusicTrack musicTrack = music2.b;
                        String str2 = musicTrack.d;
                        StringBuilder sb2 = new StringBuilder();
                        String str3 = musicTrack.e;
                        if (str3 == null) {
                            str3 = "";
                        }
                        sb2.append(str3);
                        sb2.append(' ');
                        sb2.append(s490.c(musicTrack.u));
                        String obj = drm0.p0(sb2.toString()).toString();
                        MusicTrack musicTrack2 = music2.b;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(musicTrack2.c);
                        sb3.append('_');
                        sb3.append(musicTrack2.b);
                        music = new ClipFeedTab.Music(str2, obj, sb3.toString(), music2.i);
                    }
                    music = compilation;
                }
                List singletonList = Collections.singletonList(music);
                PaginationKey h = clipsGridCommonClipsListFragment.ko().h();
                List<VideoFile> so = clipsGridCommonClipsListFragment.so();
                ArrayList arrayList = new ArrayList(c5g.u(so, 10));
                Iterator<T> it = so.iterator();
                while (it.hasNext()) {
                    arrayList.add(k15.B((VideoFile) it.next()));
                }
                ClipsRouter.c(a, kn, singletonList, io2Var2, new kwc(arrayList, h, i2), null, null, null, z, null, 1904);
            }
            return s3q0.a;
        }
    }

    /* compiled from: ClipsGridCommonClipsListFragment.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements wzs<ClipGridParams.Data, ClipCameraParams, s3q0> {
        @Override // xsna.wzs
        public final s3q0 invoke(ClipGridParams.Data data, ClipCameraParams clipCameraParams) {
            ClipGridParams.Data data2 = data;
            ClipCameraParams clipCameraParams2 = clipCameraParams;
            ClipsGridCommonClipsListFragment clipsGridCommonClipsListFragment = (ClipsGridCommonClipsListFragment) this.receiver;
            int i = ClipsGridCommonClipsListFragment.q0;
            ((ide) clipsGridCommonClipsListFragment.getParentFragment()).K1(data2, clipCameraParams2, clipsGridCommonClipsListFragment.T, MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.OTHER, null);
            return s3q0.a;
        }
    }

    /* compiled from: ClipsGridCommonClipsListFragment.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<ClipsGridHeaderEntry.Author, s3q0> {
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.izs
        public final s3q0 invoke(ClipsGridHeaderEntry.Author author) {
            ClipsGridCommonClipsListFragment clipsGridCommonClipsListFragment = (ClipsGridCommonClipsListFragment) this.receiver;
            ((pee) clipsGridCommonClipsListFragment.i0.getValue()).a(clipsGridCommonClipsListFragment.requireContext(), author, new fb(clipsGridCommonClipsListFragment, 29));
            return s3q0.a;
        }
    }

    /* compiled from: ClipsGridCommonClipsListFragment.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements gzs<Integer> {
        @Override // xsna.gzs
        public final Integer invoke() {
            return Integer.valueOf(((ide) this.receiver).Ba());
        }
    }

    /* compiled from: _Sequences.kt */
    public static final class g implements izs<Object, Boolean> {
        public static final g b = new g();

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof vee);
        }
    }

    public ClipsGridCommonClipsListFragment() {
        super(ClipsGridTabData.CommonClips);
        ey0 ey0Var = new ey0(this, 17);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f0 = msy.a(lazyThreadSafetyMode, ey0Var);
        this.g0 = msy.a(lazyThreadSafetyMode, new eu1(this, 23));
        this.h0 = msy.a(lazyThreadSafetyMode, new q(this, 22));
        this.i0 = msy.a(lazyThreadSafetyMode, new zy(this, 26));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.vkontakte.android.ACTION_FRIEND_STATUS_CHANGED");
        intentFilter.addAction("com.vkontakte.android.ACTION_GROUP_STATUS_CHANGED");
        this.k0 = intentFilter;
        this.l0 = msy.a(lazyThreadSafetyMode, new yg(this, 27));
        this.m0 = new of7(new pce(this, 0));
        this.n0 = msy.a(lazyThreadSafetyMode, new ah(this, 26));
    }

    @Override // com.vk.clips.viewer.impl.grid.lists.fragments.AbstractClipsGridListFragment
    public final ie lo() {
        return this.m0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.clips.viewer.impl.grid.lists.fragments.AbstractClipsGridListFragment
    public final boolean no() {
        return ((Boolean) this.l0.getValue()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.U.b = new m4(this, 23);
        this.p0 = ((BridgeComponent) this.g0.getValue()).F().T().m().d.a0(asu0.a.d()).subscribe(new ez(new com.vk.movika.sdk.base.observable.g(this, 20), 12));
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        io.reactivex.rxjava3.disposables.c cVar = this.p0;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // com.vk.clips.viewer.impl.grid.lists.fragments.AbstractClipsGridListFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        b bVar = this.o0;
        if (bVar != null) {
            Context mo2getContext = mo2getContext();
            if (mo2getContext != null) {
                mo2getContext.unregisterReceiver(bVar);
            }
            this.o0 = null;
        }
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        aof aofVar = this.j0;
        if (aofVar != null) {
            aofVar.b();
        }
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        aof aofVar = this.j0;
        if (aofVar != null) {
            aofVar.a();
        }
    }

    @Override // com.vk.clips.viewer.impl.grid.lists.fragments.AbstractClipsGridListFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Context mo2getContext;
        super.onViewCreated(view, bundle);
        if (this.o0 == null && (mo2getContext = mo2getContext()) != null) {
            ClipGridParams f2 = ko().f();
            b bVar = ((f2 instanceof ClipGridParams.OnlyId.CameraMask) || (f2 instanceof ClipGridParams.Data.CameraMask)) ? new b() : null;
            if (bVar != null) {
                anj.d(mo2getContext, bVar, this.k0, null, 4);
                this.o0 = bVar;
            }
        }
        ClipsGridPaginatedView clipsGridPaginatedView = this.X;
        this.j0 = new aof((clipsGridPaginatedView != null ? clipsGridPaginatedView : null).getRecyclerView(), new oce(this, 0));
    }

    @Override // com.vk.clips.viewer.impl.grid.lists.fragments.AbstractClipsGridListFragment
    public final void qo() {
        this.m0.c(ko().c());
        super.qo();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.clips.viewer.impl.grid.lists.fragments.AbstractClipsGridListFragment
    /* renamed from: ro, reason: merged with bridge method [inline-methods] */
    public final nce jo() {
        return (nce) this.n0.getValue();
    }

    public final List<VideoFile> so() {
        return rli0.A(new ulp0(rli0.j(new i5g(jo().y0()), g.b), new py(9)));
    }

    public final void to(UserId userId, boolean z) {
        nce jo = jo();
        List<nmv> y0 = jo().y0();
        ArrayList arrayList = new ArrayList(c5g.u(y0, 10));
        Iterator it = ((ArrayList) y0).iterator();
        while (it.hasNext()) {
            Object obj = (nmv) it.next();
            if (obj instanceof ClipsGridHeaderEntry.Author) {
                ClipsGridHeaderEntry.Author author = (ClipsGridHeaderEntry.Author) obj;
                if (epx.f(author.a, userId)) {
                    obj = ClipsGridHeaderEntry.Author.a(author, z);
                }
            }
            arrayList.add(obj);
        }
        jo.setItems(arrayList);
    }

    @Override // com.vk.clips.viewer.impl.grid.lists.fragments.AbstractClipsGridListFragment, com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        super.y(uiTrackingScreen);
        ClipGridParams f2 = ko().f();
        if (f2 instanceof ClipGridParams.Data.Hashtag) {
            uiTrackingScreen.a(new SchemeStat$TypeClipGridItem(SchemeStat$TypeClipGridItem.ScreenType.TRENDING_HASHTAG, null, null, ((ClipGridParams.Data.Hashtag) f2).b, 6, null));
        } else if (f2 instanceof ClipGridParams.Data.Music) {
            ClipGridParams.Data.Music music = (ClipGridParams.Data.Music) f2;
            uiTrackingScreen.a(new SchemeStat$TypeClipGridItem(SchemeStat$TypeClipGridItem.ScreenType.TRENDING_MUSIC, Long.valueOf(music.b.c.b), Integer.valueOf(music.b.b), null, 8, null));
        }
    }
}

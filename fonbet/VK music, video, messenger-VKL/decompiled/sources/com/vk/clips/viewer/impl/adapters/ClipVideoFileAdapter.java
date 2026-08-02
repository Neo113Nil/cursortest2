package com.vk.clips.viewer.impl.adapters;

import android.os.Parcelable;
import com.vk.clips.sdk.models.SdkCoOwnerItem;
import com.vk.clips.sdk.models.SdkCompilation;
import com.vk.clips.sdk.models.SdkDuetMeta;
import com.vk.clips.sdk.models.SdkImages;
import com.vk.clips.sdk.models.SdkMask;
import com.vk.clips.sdk.models.SdkMusicTrack;
import com.vk.clips.sdk.models.SdkTrendingHashtag;
import com.vk.clips.sdk.models.ads.SdkAdsFlags;
import com.vk.clips.sdk.models.ads.SdkClipsAdsFeaturesParams;
import com.vk.clips.sdk.shared.api.deps.SdkOriginalSoundStatus;
import com.vk.clips.sdk.shared.api.deps.dtos.SdkGeoPlace;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFileModeration;
import com.vk.clips.sdk.shared.api.playlist.SdkClipsDraftablePlaylist;
import com.vk.clips.sdk.shared.clips.SdkClipAudioTemplate;
import com.vk.clips.sdk.shared.clips.SdkNewsMonotheme;
import com.vk.clips.sdk.stats.pixels.models.AdStatPixel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.clips.external.ClipsDraftablePlaylist;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Good;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.clips.ClipMainTabState;
import com.vk.dto.common.clips.ClipsAdsFeaturesParams;
import com.vk.dto.common.clips.CoOwnerItem;
import com.vk.dto.common.clips.TrendingHashtag;
import com.vk.dto.common.id.UserId;
import com.vk.dto.masks.Mask;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.stories.model.clickable.ClickableMarketItem;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.dto.stories.model.clickable.ClickableVkTicket;
import com.vk.movika.sdk.base.observable.i;
import com.vk.movika.sdk.base.observable.u;
import defpackage.e;
import defpackage.f;
import defpackage.g;
import defpackage.h;
import defpackage.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.bpn0;
import xsna.c5g;
import xsna.dz;
import xsna.ep;
import xsna.epx;
import xsna.fp;
import xsna.fpf0;
import xsna.hh1;
import xsna.hpf0;
import xsna.in0;
import xsna.jyf;
import xsna.m4;
import xsna.mh;
import xsna.njh0;
import xsna.qcy;
import xsna.ry0;
import xsna.vih0;
import xsna.x4;
import xsna.xn4;
import xsna.yed;
import xsna.z4;

/* compiled from: VideoFileAdapter.kt */
/* loaded from: classes17.dex */
public final class ClipVideoFileAdapter extends VideoFileAdapter implements SdkClipVideoFile {
    public static final /* synthetic */ qcy<Object>[] B;
    public static final Serializer.c<ClipVideoFileAdapter> CREATOR;
    public final bpn0 A;
    public final ClipVideoFile m;
    public final xn4 n;
    public final xn4 o;
    public final xn4 p;
    public final xn4 q;
    public final bpn0 r;
    public final bpn0 s;
    public final ArrayList t;
    public final bpn0 u;
    public final bpn0 v;
    public final bpn0 w;
    public final bpn0 x;
    public final bpn0 y;
    public final bpn0 z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ClipVideoFileAdapter> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClipVideoFileAdapter a(Serializer serializer) {
            return new ClipVideoFileAdapter(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClipVideoFileAdapter[i];
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ClipVideoFileAdapter.class, "coauthors", "getCoauthors()Ljava/util/List;", 0);
        hpf0 hpf0Var = fpf0.a;
        B = new qcy[]{propertyReference1Impl, fp.c(0, ClipVideoFileAdapter.class, "playlists", "getPlaylists()Ljava/util/List;", hpf0Var), ep.a(0, ClipVideoFileAdapter.class, "music", "getMusic()Lcom/vk/clips/sdk/models/SdkMusicTrack;", hpf0Var), ep.a(0, ClipVideoFileAdapter.class, "originalSoundStatus", "getOriginalSoundStatus()Lcom/vk/clips/sdk/shared/api/deps/SdkOriginalSoundStatus;", hpf0Var)};
        CREATOR = new a();
    }

    public ClipVideoFileAdapter(ClipVideoFile clipVideoFile) {
        super(clipVideoFile);
        this.m = clipVideoFile;
        this.n = new xn4(new m4(this, 20), new u(11));
        this.o = new xn4(new com.vk.movika.sdk.android.defaultplayer.interactive.a(this, 17), new dz(9));
        this.p = new xn4(new hh1(this, 14), new i(10));
        this.q = new xn4(new ry0(this, 18), new x4(14));
        this.r = new bpn0(new in0(this, 21));
        this.s = new bpn0(new z4(this, 25));
        List<Mask> list = clipVideoFile.E1;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (Mask mask : list) {
            int i = mask.d;
            String str = mask.g;
            if (str == null) {
                str = "";
            }
            arrayList.add(new SdkMask(i, str, mask));
        }
        this.t = arrayList;
        this.u = new bpn0(new mh(this, 25));
        this.v = new bpn0(new e(this, 19));
        this.w = new bpn0(new f(this, 13));
        this.x = new bpn0(new g(this, 24));
        this.y = new bpn0(new h(this, 18));
        this.z = new bpn0(new defpackage.i(this, 21));
        this.A = new bpn0(new j(this, 17));
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile
    public final SdkGeoPlace A5() {
        return (SdkGeoPlace) this.u.getValue();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile
    public final List<njh0> G1() {
        return (List) this.A.getValue();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile
    public final List<SdkMask> H2() {
        return this.t;
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile
    public final List<SdkCompilation> H4() {
        return (List) this.r.getValue();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile
    public final ArrayList K3() {
        List<ClickableSticker> list;
        Good good;
        ClickableStickers clickableStickers = this.m.C1;
        if (clickableStickers == null || (list = clickableStickers.d) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ClickableSticker clickableSticker : list) {
            ClickableMarketItem clickableMarketItem = clickableSticker instanceof ClickableMarketItem ? (ClickableMarketItem) clickableSticker : null;
            GoodWrapper goodWrapper = (clickableMarketItem == null || (good = clickableMarketItem.j) == null) ? null : new GoodWrapper(good);
            if (goodWrapper != null) {
                arrayList.add(goodWrapper);
            }
        }
        return arrayList;
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile
    public final CharSequence L5() {
        return this.m.V1;
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile
    public final SdkImages M0() {
        return (SdkImages) this.x.getValue();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile
    public final ClipVideoFileAdapter M1(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            SdkClipsDraftablePlaylist sdkClipsDraftablePlaylist = (SdkClipsDraftablePlaylist) it.next();
            arrayList2.add(new ClipsDraftablePlaylist(sdkClipsDraftablePlaylist.b, sdkClipsDraftablePlaylist.c, sdkClipsDraftablePlaylist.d, sdkClipsDraftablePlaylist.e));
        }
        return new ClipVideoFileAdapter(ClipVideoFile.Kb(this.m, false, null, arrayList2, null, null, null, null, 8372223));
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile
    public final ArrayList Ma() {
        List<ClickableSticker> list;
        ClickableStickers clickableStickers = this.m.C1;
        if (clickableStickers == null || (list = clickableStickers.d) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ClickableSticker clickableSticker : list) {
            ClickableVkTicket clickableVkTicket = clickableSticker instanceof ClickableVkTicket ? (ClickableVkTicket) clickableSticker : null;
            yed yedVar = clickableVkTicket != null ? new yed(clickableVkTicket, clickableVkTicket.i) : null;
            if (yedVar != null) {
                arrayList.add(yedVar);
            }
        }
        return arrayList;
    }

    @Override // com.vk.clips.viewer.impl.adapters.VideoFileAdapter, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.m);
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile
    public final List<SdkCoOwnerItem> P1() {
        qcy<Object> qcyVar = B[0];
        return (List) this.n.b();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile
    public final List<SdkTrendingHashtag> R0() {
        return (List) this.v.getValue();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile
    public final void R4(CharSequence charSequence) {
        this.m.W1 = charSequence;
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile
    public final CharSequence S6() {
        return this.m.W1;
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile
    public final CharSequence U6() {
        return this.m.U1;
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile
    public final SdkMusicTrack V() {
        qcy<Object> qcyVar = B[2];
        return (SdkMusicTrack) this.p.b();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile
    public final SdkClipAudioTemplate a5() {
        return (SdkClipAudioTemplate) this.y.getValue();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile
    public final ClipVideoFileAdapter c2(Integer num, LinkedHashMap linkedHashMap, Map map, List list) {
        ClipMainTabState.Companion.getClass();
        ClipMainTabState a2 = ClipMainTabState.a.a(num);
        List<CoOwnerItem> list2 = this.m.N1;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (CoOwnerItem coOwnerItem : list2) {
            ClipMainTabState.a aVar = ClipMainTabState.Companion;
            Integer num2 = (Integer) linkedHashMap.get(coOwnerItem.b);
            aVar.getClass();
            arrayList.add(CoOwnerItem.zb(coOwnerItem, null, null, ClipMainTabState.a.a(num2), 15));
        }
        List<SdkTrendingHashtag> list3 = list;
        ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
        for (SdkTrendingHashtag sdkTrendingHashtag : list3) {
            arrayList2.add(new TrendingHashtag(sdkTrendingHashtag.b, sdkTrendingHashtag.c));
        }
        return new ClipVideoFileAdapter(ClipVideoFile.Kb(this.m, false, null, null, arrayList, map, arrayList2, a2, 6717439));
    }

    @Override // com.vk.clips.viewer.impl.adapters.VideoFileAdapter
    public final VideoFile d() {
        return this.m;
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile
    public final List<SdkClipsDraftablePlaylist> d0() {
        qcy<Object> qcyVar = B[1];
        return (List) this.o.b();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile
    public final SdkClipsAdsFeaturesParams d3() {
        SdkAdsFlags sdkAdsFlags;
        ClipsAdsFeaturesParams clipsAdsFeaturesParams = this.m.S1;
        if (clipsAdsFeaturesParams == null) {
            return null;
        }
        List<String> list = clipsAdsFeaturesParams.b;
        List<ClipsAdsFeaturesParams.AdsFlags> list2 = clipsAdsFeaturesParams.c;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            int i = vih0.$EnumSwitchMapping$0[((ClipsAdsFeaturesParams.AdsFlags) it.next()).ordinal()];
            if (i == 1) {
                sdkAdsFlags = SdkAdsFlags.UNKNOWN;
            } else if (i == 2) {
                sdkAdsFlags = SdkAdsFlags.HIDE_FULLSCREEN_AD_BANNER;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                sdkAdsFlags = SdkAdsFlags.HIDE_CLOSING_AD_BANNER;
            }
            arrayList.add(sdkAdsFlags);
        }
        return new SdkClipsAdsFeaturesParams(list, arrayList, clipsAdsFeaturesParams.d);
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile
    public final void ea(CharSequence charSequence) {
        this.m.V1 = charSequence;
    }

    @Override // com.vk.clips.viewer.impl.adapters.VideoFileAdapter
    public final boolean equals(Object obj) {
        boolean z = obj instanceof ClipVideoFileAdapter;
        ClipVideoFile clipVideoFile = this.m;
        return z ? epx.f(clipVideoFile, ((ClipVideoFileAdapter) obj).m) : epx.f(clipVideoFile, obj);
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile
    public final Map<AdStatPixel.Type, List<AdStatPixel>> f6() {
        return this.m.O1;
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile
    public final boolean f7() {
        return this.m.X1;
    }

    @Override // com.vk.clips.viewer.impl.adapters.VideoFileAdapter
    public final int hashCode() {
        return this.m.hashCode();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile
    public final SdkVideoFileModeration j6() {
        return (SdkVideoFileModeration) this.z.getValue();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile
    public final boolean k0() {
        return this.m.Q0;
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile
    public final Integer n7() {
        ClipMainTabState clipMainTabState = this.m.R1;
        if (clipMainTabState != null) {
            return Integer.valueOf(clipMainTabState.h());
        }
        return null;
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile
    public final boolean o9() {
        return this.m.J1;
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile
    public final SdkDuetMeta oa() {
        return (SdkDuetMeta) this.s.getValue();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile
    public final SdkNewsMonotheme v1() {
        return (SdkNewsMonotheme) this.w.getValue();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile
    public final ArrayList w6() {
        List<ClickableSticker> list;
        ClickableStickers clickableStickers = this.m.C1;
        if (clickableStickers == null || (list = clickableStickers.d) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ClickableSticker clickableSticker : list) {
            ClickableMarketItem clickableMarketItem = clickableSticker instanceof ClickableMarketItem ? (ClickableMarketItem) clickableSticker : null;
            com.vk.clips.viewer.impl.adapters.a aVar = clickableMarketItem != null ? new com.vk.clips.viewer.impl.adapters.a(clickableMarketItem) : null;
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile
    public final SdkOriginalSoundStatus y8() {
        qcy<Object> qcyVar = B[3];
        return (SdkOriginalSoundStatus) this.q.b();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile
    public final ClipVideoFileAdapter z4(ArrayList arrayList) {
        CoOwnerItem.StatusDto statusDto;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            SdkCoOwnerItem sdkCoOwnerItem = (SdkCoOwnerItem) it.next();
            UserId userId = sdkCoOwnerItem.b;
            int i = jyf.$EnumSwitchMapping$1[sdkCoOwnerItem.e.ordinal()];
            if (i == 1) {
                statusDto = CoOwnerItem.StatusDto.PENDING;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                statusDto = CoOwnerItem.StatusDto.APPROVED;
            }
            CoOwnerItem.StatusDto statusDto2 = statusDto;
            Parcelable parcelable = sdkCoOwnerItem.c.m;
            ClipMainTabState clipMainTabState = null;
            Owner owner = parcelable instanceof Owner ? (Owner) parcelable : null;
            if (owner == null) {
                throw new IllegalStateException("SdkOwner.extendedOwnerModel isn't Owner model");
            }
            boolean z = sdkCoOwnerItem.d;
            Integer num = sdkCoOwnerItem.f;
            if (num != null) {
                ClipMainTabState.Companion.getClass();
                clipMainTabState = ClipMainTabState.a.a(num);
            }
            arrayList2.add(new CoOwnerItem(userId, statusDto2, owner, z, clipMainTabState));
        }
        return new ClipVideoFileAdapter(ClipVideoFile.Kb(this.m, false, null, null, arrayList2, null, null, null, 8355839));
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile
    public final void z5(CharSequence charSequence) {
        this.m.U1 = charSequence;
    }

    @Override // com.vk.clips.viewer.impl.adapters.VideoFileAdapter, com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile
    public final ClipVideoFileAdapter copy() {
        return new ClipVideoFileAdapter((ClipVideoFile) this.m.copy());
    }

    public ClipVideoFileAdapter(Serializer serializer) {
        this((ClipVideoFile) serializer.G(ClipVideoFile.class.getClassLoader()));
    }
}

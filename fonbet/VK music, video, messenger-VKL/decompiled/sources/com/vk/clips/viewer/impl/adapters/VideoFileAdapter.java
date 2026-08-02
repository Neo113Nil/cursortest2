package com.vk.clips.viewer.impl.adapters;

import android.os.Parcel;
import com.vk.clips.sdk.models.SdkActionLink;
import com.vk.clips.sdk.models.SdkImages;
import com.vk.clips.sdk.models.SdkOwner;
import com.vk.clips.sdk.models.SdkRestrictionButton;
import com.vk.clips.sdk.models.SdkVerifyInfo;
import com.vk.clips.sdk.models.SdkVideoRestriction;
import com.vk.clips.sdk.models.ads.SdkOrdAdsInfo;
import com.vk.clips.sdk.shared.api.analytics.SdkStatPixel;
import com.vk.clips.sdk.shared.api.deps.SdkTimelineThumbs;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoAdInfo;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.restrictions.RestrictionButton;
import com.vk.dto.common.restrictions.VideoRestriction;
import java.util.Map;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.d7l0;
import xsna.dbj0;
import xsna.dck0;
import xsna.epj0;
import xsna.epx;
import xsna.fcs0;
import xsna.fpf0;
import xsna.fz5;
import xsna.g1s0;
import xsna.gpt0;
import xsna.h3e0;
import xsna.ha40;
import xsna.hcs0;
import xsna.iri0;
import xsna.j8n0;
import xsna.ksq0;
import xsna.l5r0;
import xsna.mlf0;
import xsna.p5j;
import xsna.prq0;
import xsna.puq0;
import xsna.qcy;
import xsna.uho0;
import xsna.ukh0;
import xsna.xn4;
import xsna.z6f0;
import xsna.z6i;
import xsna.zlm0;

/* compiled from: VideoFileAdapter.kt */
/* loaded from: classes17.dex */
public class VideoFileAdapter implements SdkVideoFile {
    public final VideoFile b;
    public final xn4 c;
    public final z6i d;
    public final xn4 e;
    public final xn4 f;
    public final xn4 g;
    public final xn4 h;
    public final xn4 i;
    public final xn4 j;
    public final xn4 k;
    public static final /* synthetic */ qcy<Object>[] l = {new PropertyReference1Impl(VideoFileAdapter.class, "owner", "getOwner()Lcom/vk/clips/sdk/models/SdkOwner;", 0), p5j.a(0, VideoFileAdapter.class, "adsData", "getAdsData()Lcom/vk/clips/sdk/shared/api/deps/video/SdkVideoAdInfo;", fpf0.a), new PropertyReference1Impl(VideoFileAdapter.class, "ordAdsInfo", "getOrdAdsInfo()Lcom/vk/clips/sdk/models/ads/SdkOrdAdsInfo;", 0), new PropertyReference1Impl(VideoFileAdapter.class, "actionLink", "getActionLink()Lcom/vk/clips/sdk/models/SdkActionLink;", 0), new PropertyReference1Impl(VideoFileAdapter.class, "pixels", "getPixels()Ljava/util/Map;", 0), new PropertyReference1Impl(VideoFileAdapter.class, "firstFrame", "getFirstFrame()Lcom/vk/clips/sdk/models/SdkImages;", 0), new PropertyReference1Impl(VideoFileAdapter.class, "image", "getImage()Lcom/vk/clips/sdk/models/SdkImages;", 0), new PropertyReference1Impl(VideoFileAdapter.class, "anyImage", "getAnyImage()Lcom/vk/clips/sdk/models/SdkImages;", 0), new PropertyReference1Impl(VideoFileAdapter.class, "timelineThumbs", "getTimelineThumbs()Lcom/vk/clips/sdk/shared/api/deps/SdkTimelineThumbs;", 0)};
    public static final Serializer.c<VideoFileAdapter> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VideoFileAdapter> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VideoFileAdapter a(Serializer serializer) {
            return new VideoFileAdapter(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VideoFileAdapter[i];
        }
    }

    public VideoFileAdapter(VideoFile videoFile) {
        this.b = videoFile;
        int i = 11;
        this.c = new xn4(new iri0(this, 19), new epj0(i));
        this.d = new z6i(new fcs0(this, 2), new d7l0(i), new z6f0(this, 28));
        this.e = new xn4(new prq0(this, 10), new g1s0(1));
        this.f = new xn4(new j8n0(this, 13), new h3e0(14));
        this.g = new xn4(new uho0(this, 8), new l5r0(5));
        this.h = new xn4(new ksq0(this, 5), new hcs0(1));
        this.i = new xn4(new dck0(this, 13), new puq0(5));
        this.j = new xn4(new dbj0(this, 14), new zlm0(9));
        this.k = new xn4(new mlf0(this, 17), new ha40(25));
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile
    public final boolean A0() {
        return d().A0();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile
    public final SdkTimelineThumbs B0() {
        qcy<Object> qcyVar = l[8];
        return (SdkTimelineThumbs) this.k.b();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile
    public final UserId I0() {
        return d().I0();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile
    public final SdkImages I7() {
        qcy<Object> qcyVar = l[7];
        return (SdkImages) this.j.b();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile
    public final boolean J() {
        return d().O9();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile
    public final SdkVideoRestriction O() {
        VideoRestriction O = d().O();
        if (O == null) {
            return null;
        }
        String str = O.b;
        String str2 = O.c;
        RestrictionButton restrictionButton = O.e;
        return new SdkVideoRestriction(false, str, str2, restrictionButton != null ? restrictionButton.c : null, O.d, O.f, restrictionButton != null, restrictionButton != null ? new SdkRestrictionButton(restrictionButton.c) : null, fz5.C(O.g), Integer.valueOf(O.i), fz5.C(O.h), null, O.j, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public void O7(Serializer serializer) {
        serializer.i0(d());
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile
    public final String P() {
        return d().P();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile
    public final Boolean Q() {
        return d().Q();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile
    public final boolean Q0() {
        return d().Q0();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile
    public final boolean U() {
        return d().U();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile
    public final SdkVideoAdInfo X0() {
        qcy<Object> qcyVar = l[1];
        return (SdkVideoAdInfo) this.d.b();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile
    public final SdkVerifyInfo Y() {
        VerifyInfo Y = d().Y();
        return new SdkVerifyInfo(Y.b, Y.c, Y.d, Y.e, Y.f, Y.g);
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile
    public final String a1() {
        return d().a1();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile
    public final int b0() {
        return d().b0();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile
    public final boolean c0() {
        return d().c0();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile
    public SdkVideoFile copy() {
        return new VideoFileAdapter(d().copy());
    }

    public VideoFile d() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile
    public final Map<SdkStatPixel.a, ukh0> e0() {
        qcy<Object> qcyVar = l[4];
        return (Map) this.g.b();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile
    public final SdkImages e1() {
        qcy<Object> qcyVar = l[5];
        return (SdkImages) this.h.b();
    }

    public boolean equals(Object obj) {
        return obj instanceof VideoFileAdapter ? epx.f(d(), ((VideoFileAdapter) obj).d()) : epx.f(d(), obj);
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile
    public final boolean g1() {
        return d().g1();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile
    public final int getDuration() {
        return d().getDuration();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile
    public final int getHeight() {
        return d().getHeight();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile
    public final SdkImages getImage() {
        qcy<Object> qcyVar = l[6];
        return (SdkImages) this.i.b();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile
    public final int getWidth() {
        return d().getWidth();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile
    public final boolean h1() {
        return d().h1();
    }

    public int hashCode() {
        return d().hashCode();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile
    public final boolean i0() {
        return d().i0();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile
    public final boolean j0() {
        return d().j0();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile
    public final String j1() {
        return d().j1();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile
    public final int k1() {
        return d().k1();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile
    public final SdkActionLink m1() {
        qcy<Object> qcyVar = l[3];
        return (SdkActionLink) this.f.b();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile
    public final int o0() {
        return d().o0();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile
    public final void o7(SdkVideoFile sdkVideoFile) {
        if (!(sdkVideoFile instanceof VideoFileAdapter)) {
            throw new IllegalStateException("Check failed.");
        }
        VideoFileAdapter videoFileAdapter = (VideoFileAdapter) sdkVideoFile;
        d().setTrackCode(videoFileAdapter.d().r());
        d().n8(videoFileAdapter.d().p0());
        d().rb(videoFileAdapter.d().X0());
        d().C7(videoFileAdapter.d().e0());
        d().u7(videoFileAdapter.d().m1());
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile
    public final boolean p0() {
        return d().p0();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile
    public final SdkOrdAdsInfo p1() {
        qcy<Object> qcyVar = l[2];
        return (SdkOrdAdsInfo) this.e.b();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile
    public final boolean q0() {
        return d().q0();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile
    public final String r() {
        return d().r();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile
    public final String r1() {
        return d().r1();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile
    public final SdkOwner s() {
        qcy<Object> qcyVar = l[0];
        return (SdkOwner) this.c.b();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile
    public final void setTrackCode(String str) {
        d().setTrackCode(str);
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile
    public final boolean t0() {
        return d().t0();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile
    public final boolean v() {
        return d().v();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile
    public final boolean v3() {
        gpt0 gpt0Var = gpt0.a;
        return gpt0.y(d());
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile
    public final boolean w1() {
        VideoFile d = d();
        if (d.O9()) {
            return true;
        }
        ClipVideoFile clipVideoFile = d instanceof ClipVideoFile ? (ClipVideoFile) d : null;
        return clipVideoFile != null ? clipVideoFile.J1 : false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile
    public final boolean x0() {
        return d().x0();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile
    public final void xa(boolean z) {
        d().e4(Boolean.valueOf(z));
    }

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile
    public final boolean z0() {
        return d().z0();
    }

    public VideoFileAdapter(Serializer serializer) {
        this((VideoFile) serializer.G(VideoFile.class.getClassLoader()));
    }
}

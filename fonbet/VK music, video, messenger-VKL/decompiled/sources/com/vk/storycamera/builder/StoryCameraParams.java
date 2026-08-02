package com.vk.storycamera.builder;

import android.os.Bundle;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.ClipStatStoryData;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.DuetType;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicCameraData;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.dto.photo.Photo;
import com.vk.dto.polls.Poll;
import com.vk.dto.stickers.ShareVmojiStoryParams;
import com.vk.dto.stories.entities.StoryCameraGalleryData;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.dto.stories.entities.StoryCameraTarget;
import com.vk.dto.stories.entities.StoryEditorMode;
import com.vk.dto.stories.entities.StoryImSharingData;
import com.vk.dto.stories.entities.StoryLocalPhotoSticker;
import com.vk.dto.stories.entities.StorySharingInfo;
import com.vk.dto.stories.entities.stat.StoryBackgroundType;
import com.vk.dto.stories.model.StoryAnswer;
import com.vk.dto.stories.model.StoryEntryExtended;
import com.vk.dto.stories.model.StoryQuestion;
import com.vk.stories.StoryPostInfo;
import com.vk.storycamera.CameraTooltipFromLink;
import com.vk.storycamera.entity.attach.StoryEditorPhotoAlbumAttachment;
import com.vk.storycamera.entity.attach.StoryEditorPollAttach;
import com.vk.superapp.api.dto.story.WebStoryBox;
import com.vkontakte.android.attachments.ChannelMessageAttachment;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.bh10;
import xsna.e43;
import xsna.epx;
import xsna.fkq0;
import xsna.fw3;
import xsna.i5g;
import xsna.qoy;
import xsna.rli0;
import xsna.svk0;
import xsna.urd0;
import xsna.xa4;

/* compiled from: StoryCameraParams.kt */
/* loaded from: classes6.dex */
public final class StoryCameraParams extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StoryCameraParams> CREATOR = new b();
    public final boolean A;
    public final List<StoryImSharingData> A0;
    public final boolean B;
    public final boolean B0;
    public final List<StoryCameraGalleryData> C;
    public final Bundle C0;
    public final boolean D;
    public final ChannelMessageAttachment D0;
    public final boolean E;
    public final StoryEditorMode E0;
    public final Photo F;
    public final StoryLocalPhotoSticker G;
    public final StoryBackgroundType H;
    public final String I;
    public final StoryMusicInfo J;
    public final String K;
    public final List<StoryAnswer> L;
    public String M;
    public ClipVideoFile N;
    public final DuetType O;
    public final boolean P;
    public final boolean Q;
    public final boolean R;
    public final boolean S;
    public final boolean T;
    public final boolean U;
    public final boolean V;
    public final boolean W;
    public final String X;
    public final Integer Y;
    public final Boolean Z;
    public final Boolean a0;
    public String b;
    public final Float b0;
    public String c;
    public final Integer c0;
    public final StoryCameraMode d;
    public final Boolean d0;
    public final List<? extends StoryCameraMode> e;
    public StoryMusicInfo e0;
    public StorySharingInfo f;
    public final StoryQuestion f0;
    public final UserId g;
    public final CameraTooltipFromLink g0;
    public final String h;
    public final MusicTrack h0;
    public final String i;
    public final List<Photo> i0;
    public String j;
    public final boolean j0;
    public final String k;
    public final boolean k0;
    public boolean l;
    public final Integer l0;
    public boolean m;
    public final ShareVmojiStoryParams m0;
    public final StoryEntryExtended n;
    public final Playlist n0;
    public final StoryCameraTarget o;
    public VideoFile o0;
    public String p;
    public final boolean p0;
    public final long q;
    public final Integer q0;
    public final String r;
    public final String r0;
    public final String s;
    public final String s0;
    public final String t;
    public final MusicCameraData t0;
    public final WebStoryBox u;
    public final boolean u0;
    public final StoryPostInfo v;
    public final boolean v0;
    public final ClipStatStoryData w;
    public final boolean w0;
    public final StoryEditorPollAttach x;
    public final boolean x0;
    public final Integer y;
    public final boolean y0;
    public final boolean z;
    public final StoryEditorPhotoAlbumAttachment z0;

    /* compiled from: StoryCameraParams.kt */
    public static abstract class a {
        public StoryEditorPollAttach A;
        public StoryEditorPhotoAlbumAttachment A0;
        public Integer B;
        public List<? extends StoryImSharingData> B0;
        public boolean C;
        public Bundle C0;
        public boolean D;
        public ChannelMessageAttachment D0;
        public boolean E;
        public Integer F;
        public List<StoryCameraGalleryData> G;
        public boolean H;
        public boolean I;
        public Photo J;
        public StoryLocalPhotoSticker K;
        public StoryBackgroundType L;
        public ClipStatStoryData M;
        public String N;
        public StoryMusicInfo O;
        public String P;
        public String Q;
        public ClipVideoFile R;
        public DuetType S;
        public boolean T;
        public boolean U;
        public boolean V;
        public boolean W;
        public boolean X;
        public boolean Y;
        public boolean Z;
        public final String a;
        public boolean a0;
        public final String b;
        public String b0;
        public String c;
        public Integer c0;
        public String d;
        public Boolean d0;
        public Integer e;
        public Boolean e0;
        public Float f0;
        public Boolean g0;
        public List<? extends StoryCameraMode> h;
        public StoryMusicInfo h0;
        public StorySharingInfo i;
        public StoryQuestion i0;
        public UserId j;
        public CameraTooltipFromLink j0;
        public String k;
        public MusicTrack k0;
        public String l;
        public List<? extends Photo> l0;
        public String m;
        public boolean m0;
        public String n;
        public boolean n0;
        public boolean o;
        public Integer o0;
        public boolean p;
        public ShareVmojiStoryParams p0;
        public StoryEntryExtended q;
        public Playlist q0;
        public StoryCameraTarget r;
        public VideoFile r0;
        public String s;
        public boolean s0;
        public long t;
        public boolean t0;
        public String u;
        public MusicCameraData u0;
        public String v;
        public boolean v0;
        public String w;
        public boolean w0;
        public List<StoryAnswer> x;
        public boolean x0;
        public WebStoryBox y;
        public boolean y0;
        public StoryPostInfo z;
        public boolean z0;
        public StoryCameraMode f = StoryCameraMode.STORY;
        public List<? extends StoryCameraMode> g = xa4.q();

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
            EmptyList emptyList = EmptyList.b;
            this.h = emptyList;
            this.j = UserId.d;
            this.r = StoryCameraTarget.UNDEFINED;
            this.U = true;
            this.V = true;
            this.W = true;
            this.X = true;
            this.Y = true;
            this.Z = true;
            this.v0 = true;
            this.w0 = true;
            this.x0 = true;
            this.y0 = true;
            this.z0 = true;
            this.B0 = emptyList;
        }

        public static void p(a aVar, Poll poll) {
            aVar.A = poll != null ? new StoryEditorPollAttach(poll, null, false) : null;
        }

        public static /* synthetic */ void r(com.vk.storycamera.builder.a aVar, UserId userId, String str, int i) {
            if ((i & 4) != 0) {
                str = null;
            }
            aVar.q(userId, null, str);
        }

        public static void y(com.vk.storycamera.builder.a aVar, boolean z) {
            aVar.t0 = z;
            aVar.C0 = null;
        }

        public final StoryCameraParams a() {
            List<? extends StoryCameraMode> list = this.g;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!this.h.contains((StoryCameraMode) obj)) {
                    arrayList.add(obj);
                }
            }
            StoryCameraMode storyCameraMode = this.f;
            StorySharingInfo storySharingInfo = this.i;
            UserId userId = this.j;
            String str = this.k;
            String str2 = this.l;
            String str3 = this.m;
            String str4 = this.n;
            boolean z = this.o;
            boolean z2 = this.p;
            StoryEntryExtended storyEntryExtended = this.q;
            StoryCameraTarget storyCameraTarget = this.r;
            String str5 = this.s;
            long j = this.t;
            String str6 = this.u;
            String str7 = this.v;
            String str8 = this.w;
            WebStoryBox webStoryBox = this.y;
            StoryPostInfo storyPostInfo = this.z;
            ClipStatStoryData clipStatStoryData = this.M;
            StoryEditorPollAttach storyEditorPollAttach = this.A;
            Integer num = this.B;
            boolean z3 = this.C;
            List<StoryCameraGalleryData> list2 = this.G;
            boolean z4 = this.H;
            boolean z5 = this.D;
            boolean z6 = this.E;
            boolean z7 = this.I;
            Photo photo = this.J;
            StoryLocalPhotoSticker storyLocalPhotoSticker = this.K;
            StoryBackgroundType storyBackgroundType = this.L;
            String str9 = this.N;
            StoryMusicInfo storyMusicInfo = this.O;
            String str10 = this.P;
            List<StoryAnswer> list3 = this.x;
            String str11 = this.Q;
            ClipVideoFile clipVideoFile = this.R;
            DuetType duetType = this.S;
            boolean z8 = this.T;
            Integer num2 = this.e;
            String str12 = this.c;
            String str13 = this.d;
            boolean z9 = this.U;
            boolean z10 = this.V;
            boolean z11 = this.W;
            boolean z12 = this.X;
            boolean z13 = this.Y;
            boolean z14 = this.Z;
            boolean z15 = this.a0;
            String str14 = this.b0;
            Integer num3 = this.c0;
            Boolean bool = this.d0;
            Boolean bool2 = this.e0;
            return new StoryCameraParams(this.a, this.b, storyCameraMode, arrayList, storySharingInfo, userId, str, str2, str3, str4, z, z2, storyEntryExtended, storyCameraTarget, str5, j, str6, str7, str8, webStoryBox, storyPostInfo, clipStatStoryData, storyEditorPollAttach, num, z3, z5, z6, list2, z4, z7, photo, storyLocalPhotoSticker, storyBackgroundType, str9, storyMusicInfo, str10, list3, str11, clipVideoFile, duetType, z8, z9, z10, z11, z12, z13, z14, z15, str14, num3, bool, Boolean.valueOf(bool2 != null ? bool2.booleanValue() : !fkq0.b(userId)), this.f0, this.F, this.g0, this.h0, this.i0, this.j0, this.k0, this.l0, this.m0, this.n0, this.o0, this.p0, this.q0, this.r0, this.s0, num2, str12, str13, this.u0, this.v0, this.w0, this.x0, this.y0, this.z0, this.A0, this.B0, this.t0, this.C0, this.D0);
        }

        public final void b(StoryCameraParams storyCameraParams) {
            List<? extends StoryCameraMode> B = rli0.B(rli0.j(new i5g(this.g), new svk0(this, 6)));
            this.f = storyCameraParams.d;
            this.g = B;
            this.i = storyCameraParams.f;
            this.j = storyCameraParams.g;
            this.k = storyCameraParams.h;
            this.l = storyCameraParams.i;
            this.m = storyCameraParams.j;
            this.n = storyCameraParams.k;
            this.o = storyCameraParams.l;
            this.p = storyCameraParams.m;
            this.q = storyCameraParams.n;
            this.r = storyCameraParams.o;
            this.s = storyCameraParams.p;
            this.t = storyCameraParams.q;
            this.u = storyCameraParams.r;
            this.v = storyCameraParams.s;
            this.w = storyCameraParams.t;
            this.y = storyCameraParams.u;
            this.z = storyCameraParams.v;
            this.M = storyCameraParams.w;
            this.A = storyCameraParams.x;
            this.B = storyCameraParams.y;
            this.C = storyCameraParams.z;
            this.G = storyCameraParams.C;
            this.H = storyCameraParams.D;
            this.D = storyCameraParams.A;
            this.E = storyCameraParams.B;
            this.I = storyCameraParams.E;
            this.J = storyCameraParams.F;
            this.K = storyCameraParams.G;
            this.L = storyCameraParams.H;
            this.N = storyCameraParams.I;
            this.O = storyCameraParams.J;
            this.P = storyCameraParams.K;
            this.x = storyCameraParams.L;
            this.Q = storyCameraParams.M;
            this.R = storyCameraParams.N;
            this.S = storyCameraParams.O;
            this.T = storyCameraParams.P;
            this.e = storyCameraParams.q0;
            this.c = storyCameraParams.r0;
            this.d = storyCameraParams.s0;
            this.U = storyCameraParams.Q;
            this.V = storyCameraParams.R;
            this.W = storyCameraParams.S;
            this.X = storyCameraParams.T;
            this.Y = storyCameraParams.U;
            this.Z = storyCameraParams.V;
            this.a0 = storyCameraParams.W;
            this.b0 = storyCameraParams.X;
            this.c0 = storyCameraParams.Y;
            this.d0 = storyCameraParams.Z;
            this.e0 = storyCameraParams.a0;
            this.f0 = storyCameraParams.b0;
            this.F = storyCameraParams.c0;
            this.g0 = storyCameraParams.d0;
            this.h0 = storyCameraParams.e0;
            this.i0 = storyCameraParams.f0;
            this.j0 = storyCameraParams.g0;
            this.k0 = storyCameraParams.h0;
            this.l0 = storyCameraParams.i0;
            this.m0 = storyCameraParams.j0;
            this.n0 = storyCameraParams.k0;
            this.o0 = storyCameraParams.l0;
            this.p0 = storyCameraParams.m0;
            this.q0 = storyCameraParams.n0;
            this.r0 = storyCameraParams.o0;
            this.s0 = storyCameraParams.p0;
            this.u0 = storyCameraParams.t0;
            this.v0 = storyCameraParams.u0;
            this.w0 = storyCameraParams.v0;
            this.x0 = storyCameraParams.w0;
            this.y0 = storyCameraParams.x0;
            this.z0 = storyCameraParams.y0;
            this.A0 = storyCameraParams.z0;
            this.B0 = storyCameraParams.A0;
            this.t0 = storyCameraParams.B0;
            this.C0 = storyCameraParams.C0;
            this.D0 = storyCameraParams.D0;
        }

        public final void c() {
            this.p = true;
            this.o = false;
        }

        public final void d() {
            this.o = true;
            this.p = false;
        }

        public final void f(ArrayList arrayList) {
            this.g = arrayList;
        }

        public final void g(StoryCameraMode storyCameraMode) {
            this.f = storyCameraMode;
        }

        public final void h(ArrayList arrayList) {
            this.G = arrayList;
        }

        public final void i(Integer num) {
            this.e = num;
        }

        public final void j(String str) {
            this.m = str;
        }

        public final void k(String str) {
            this.c = str;
        }

        public final void l(String str) {
            this.d = str;
        }

        public final void m(Integer num) {
            this.B = num;
        }

        public final void n() {
            this.m0 = true;
        }

        public final void o(boolean z) {
            this.T = z;
        }

        public final void q(UserId userId, String str, String str2) {
            this.j = userId;
            this.k = str;
            this.l = str2;
        }

        public final void s() {
            StoryCameraMode storyCameraMode = StoryCameraMode.QR_SCANNER;
            this.g = e43.a(storyCameraMode);
            this.f = storyCameraMode;
            c();
            this.D = true;
        }

        public final void t() {
            this.F = 0;
        }

        public final void u(String str) {
            this.N = str;
        }

        public final void v(StorySharingInfo storySharingInfo) {
            this.i = storySharingInfo;
        }

        public final void w(Integer num) {
            this.c0 = num;
        }

        public final void x(WebStoryBox webStoryBox) {
            this.y = webStoryBox;
        }

        public final void z(boolean z) {
            this.s0 = z;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<StoryCameraParams> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StoryCameraParams a(Serializer serializer) {
            String H = serializer.H();
            String H2 = serializer.H();
            StoryCameraMode storyCameraMode = (StoryCameraMode) serializer.C();
            ArrayList D = serializer.D();
            StorySharingInfo storySharingInfo = (StorySharingInfo) serializer.G(StorySharingInfo.class.getClassLoader());
            UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
            String H3 = serializer.H();
            String H4 = serializer.H();
            String H5 = serializer.H();
            String H6 = serializer.H();
            boolean m = serializer.m();
            boolean m2 = serializer.m();
            StoryEntryExtended storyEntryExtended = (StoryEntryExtended) serializer.G(StoryEntryExtended.class.getClassLoader());
            StoryCameraTarget storyCameraTarget = StoryCameraTarget.values()[serializer.u()];
            String H7 = serializer.H();
            long w = serializer.w();
            String H8 = serializer.H();
            String H9 = serializer.H();
            String H10 = serializer.H();
            WebStoryBox webStoryBox = (WebStoryBox) serializer.G(WebStoryBox.class.getClassLoader());
            StoryPostInfo storyPostInfo = (StoryPostInfo) serializer.G(StoryPostInfo.class.getClassLoader());
            ClipStatStoryData clipStatStoryData = (ClipStatStoryData) serializer.G(ClipStatStoryData.class.getClassLoader());
            StoryEditorPollAttach storyEditorPollAttach = (StoryEditorPollAttach) serializer.G(StoryEditorPollAttach.class.getClassLoader());
            Integer v = serializer.v();
            boolean m3 = serializer.m();
            boolean m4 = serializer.m();
            boolean m5 = serializer.m();
            List k = serializer.k(StoryCameraGalleryData.class);
            if (k == null) {
                k = EmptyList.b;
            }
            boolean m6 = serializer.m();
            boolean m7 = serializer.m();
            List list = k;
            Photo photo = (Photo) serializer.G(Photo.class.getClassLoader());
            StoryLocalPhotoSticker storyLocalPhotoSticker = (StoryLocalPhotoSticker) serializer.G(StoryLocalPhotoSticker.class.getClassLoader());
            String H11 = serializer.H();
            StoryBackgroundType valueOf = H11 != null ? StoryBackgroundType.valueOf(H11) : null;
            String H12 = serializer.H();
            StoryMusicInfo storyMusicInfo = (StoryMusicInfo) serializer.G(StoryMusicInfo.class.getClassLoader());
            String H13 = serializer.H();
            ArrayList k2 = serializer.k(StoryAnswer.class);
            String H14 = serializer.H();
            ClipVideoFile clipVideoFile = (ClipVideoFile) serializer.G(ClipVideoFile.class.getClassLoader());
            DuetType.Wrapper wrapper = (DuetType.Wrapper) serializer.G(DuetType.Wrapper.class.getClassLoader());
            DuetType duetType = wrapper != null ? wrapper.b : null;
            boolean m8 = serializer.m();
            boolean m9 = serializer.m();
            boolean m10 = serializer.m();
            boolean m11 = serializer.m();
            boolean m12 = serializer.m();
            boolean m13 = serializer.m();
            boolean m14 = serializer.m();
            String H15 = serializer.H();
            Integer v2 = serializer.v();
            Boolean n = serializer.n();
            Boolean n2 = serializer.n();
            Float t = serializer.t();
            Integer v3 = serializer.v();
            Boolean n3 = serializer.n();
            StoryMusicInfo storyMusicInfo2 = (StoryMusicInfo) serializer.G(StoryMusicInfo.class.getClassLoader());
            StoryQuestion storyQuestion = (StoryQuestion) serializer.G(StoryQuestion.class.getClassLoader());
            CameraTooltipFromLink cameraTooltipFromLink = (CameraTooltipFromLink) serializer.C();
            MusicTrack musicTrack = (MusicTrack) serializer.G(MusicTrack.class.getClassLoader());
            ArrayList k3 = serializer.k(Photo.class);
            boolean m15 = serializer.m();
            boolean m16 = serializer.m();
            Integer v4 = serializer.v();
            ShareVmojiStoryParams shareVmojiStoryParams = (ShareVmojiStoryParams) serializer.G(ShareVmojiStoryParams.class.getClassLoader());
            boolean m17 = serializer.m();
            Playlist playlist = (Playlist) serializer.G(Playlist.class.getClassLoader());
            VideoFile videoFile = (VideoFile) serializer.G(VideoFile.class.getClassLoader());
            boolean m18 = serializer.m();
            Integer v5 = serializer.v();
            MusicCameraData musicCameraData = (MusicCameraData) serializer.G(MusicCameraData.class.getClassLoader());
            boolean m19 = serializer.m();
            boolean m20 = serializer.m();
            boolean m21 = serializer.m();
            boolean m22 = serializer.m();
            return new StoryCameraParams(H, H2, storyCameraMode, D, storySharingInfo, userId, H3, H4, H5, H6, m, m2, storyEntryExtended, storyCameraTarget, H7, w, H8, H9, H10, webStoryBox, storyPostInfo, clipStatStoryData, storyEditorPollAttach, v, m3, m4, m5, list, m6, m7, photo, storyLocalPhotoSticker, valueOf, H12, storyMusicInfo, H13, k2, H14, clipVideoFile, duetType, m8, m9, m10, m11, m12, m13, m17, m14, H15, v2, n, n2, t, v3, n3, storyMusicInfo2, storyQuestion, cameraTooltipFromLink, musicTrack, k3, m15, m16, v4, shareVmojiStoryParams, playlist, videoFile, m18, v5, serializer.I(), serializer.I(), musicCameraData, m19, m20, m21, serializer.m(), m22, (StoryEditorPhotoAlbumAttachment) serializer.G(StoryEditorPhotoAlbumAttachment.class.getClassLoader()), serializer.B(StoryImSharingData.class.getClassLoader()), serializer.m(), (Bundle) serializer.A(Bundle.class.getClassLoader()), (ChannelMessageAttachment) serializer.A(ChannelMessageAttachment.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoryCameraParams[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StoryCameraParams(String str, String str2, StoryCameraMode storyCameraMode, List<? extends StoryCameraMode> list, StorySharingInfo storySharingInfo, UserId userId, String str3, String str4, String str5, String str6, boolean z, boolean z2, StoryEntryExtended storyEntryExtended, StoryCameraTarget storyCameraTarget, String str7, long j, String str8, String str9, String str10, WebStoryBox webStoryBox, StoryPostInfo storyPostInfo, ClipStatStoryData clipStatStoryData, StoryEditorPollAttach storyEditorPollAttach, Integer num, boolean z3, boolean z4, boolean z5, List<StoryCameraGalleryData> list2, boolean z6, boolean z7, Photo photo, StoryLocalPhotoSticker storyLocalPhotoSticker, StoryBackgroundType storyBackgroundType, String str11, StoryMusicInfo storyMusicInfo, String str12, List<StoryAnswer> list3, String str13, ClipVideoFile clipVideoFile, DuetType duetType, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String str14, Integer num2, Boolean bool, Boolean bool2, Float f, Integer num3, Boolean bool3, StoryMusicInfo storyMusicInfo2, StoryQuestion storyQuestion, CameraTooltipFromLink cameraTooltipFromLink, MusicTrack musicTrack, List<? extends Photo> list4, boolean z16, boolean z17, Integer num4, ShareVmojiStoryParams shareVmojiStoryParams, Playlist playlist, VideoFile videoFile, boolean z18, Integer num5, String str15, String str16, MusicCameraData musicCameraData, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, StoryEditorPhotoAlbumAttachment storyEditorPhotoAlbumAttachment, List<? extends StoryImSharingData> list5, boolean z24, Bundle bundle, ChannelMessageAttachment channelMessageAttachment) {
        this.b = str;
        this.c = str2;
        this.d = storyCameraMode;
        this.e = list;
        this.f = storySharingInfo;
        this.g = userId;
        this.h = str3;
        this.i = str4;
        this.j = str5;
        this.k = str6;
        this.l = z;
        this.m = z2;
        this.n = storyEntryExtended;
        this.o = storyCameraTarget;
        this.p = str7;
        this.q = j;
        this.r = str8;
        this.s = str9;
        this.t = str10;
        this.u = webStoryBox;
        this.v = storyPostInfo;
        this.w = clipStatStoryData;
        this.x = storyEditorPollAttach;
        this.y = num;
        this.z = z3;
        this.A = z4;
        this.B = z5;
        this.C = list2;
        this.D = z6;
        this.E = z7;
        this.F = photo;
        this.G = storyLocalPhotoSticker;
        this.H = storyBackgroundType;
        this.I = str11;
        this.J = storyMusicInfo;
        this.K = str12;
        this.L = list3;
        this.M = str13;
        this.N = clipVideoFile;
        this.O = duetType;
        this.P = z8;
        this.Q = z9;
        this.R = z10;
        this.S = z11;
        this.T = z12;
        this.U = z13;
        this.V = z14;
        this.W = z15;
        this.X = str14;
        this.Y = num2;
        this.Z = bool;
        this.a0 = bool2;
        this.b0 = f;
        this.c0 = num3;
        this.d0 = bool3;
        this.e0 = storyMusicInfo2;
        this.f0 = storyQuestion;
        this.g0 = cameraTooltipFromLink;
        this.h0 = musicTrack;
        this.i0 = list4;
        this.j0 = z16;
        this.k0 = z17;
        this.l0 = num4;
        this.m0 = shareVmojiStoryParams;
        this.n0 = playlist;
        this.o0 = videoFile;
        this.p0 = z18;
        this.q0 = num5;
        this.r0 = str15;
        this.s0 = str16;
        this.t0 = musicCameraData;
        this.u0 = z19;
        this.v0 = z20;
        this.w0 = z21;
        this.x0 = z22;
        this.y0 = z23;
        this.z0 = storyEditorPhotoAlbumAttachment;
        this.A0 = list5;
        this.B0 = z24;
        this.C0 = bundle;
        this.D0 = channelMessageAttachment;
        this.E0 = z17 ? StoryEditorMode.WITH_BACKGROUND : storyEntryExtended != null ? StoryEditorMode.WITH_BACKGROUND : storyPostInfo != null ? StoryEditorMode.WITH_BACKGROUND : clipStatStoryData != null ? StoryEditorMode.WITH_BACKGROUND : storyEditorPollAttach != null ? StoryEditorMode.WITH_BACKGROUND : photo != null ? StoryEditorMode.WITH_BACKGROUND : storyLocalPhotoSticker != null ? StoryEditorMode.WITH_BACKGROUND : storyQuestion != null ? StoryEditorMode.WITH_BACKGROUND : list3 != null ? StoryEditorMode.WITH_BACKGROUND : musicTrack != null ? StoryEditorMode.WITH_BACKGROUND : shareVmojiStoryParams != null ? StoryEditorMode.WITH_BACKGROUND : playlist != null ? StoryEditorMode.WITH_BACKGROUND : videoFile != null ? StoryEditorMode.WITH_BACKGROUND : channelMessageAttachment != null ? StoryEditorMode.WITH_BACKGROUND : (storySharingInfo == null || storySharingInfo.f == null || storySharingInfo.b != 30) ? storyEditorPhotoAlbumAttachment != null ? StoryEditorMode.WITH_BACKGROUND : StoryEditorMode.DEFAULT : StoryEditorMode.WITH_BACKGROUND;
    }

    public final boolean Ab() {
        return this.y0;
    }

    public final boolean Bb() {
        return this.z;
    }

    public final ClipVideoFile Cb() {
        return this.N;
    }

    public final StoryEditorMode Db() {
        return this.E0;
    }

    public final String Eb() {
        return this.c;
    }

    public final boolean Fb() {
        return this.m;
    }

    public final boolean Gb() {
        return this.l;
    }

    public final StoryCameraMode Hb() {
        return this.d;
    }

    public final List<StoryCameraGalleryData> Ib() {
        return this.C;
    }

    public final Boolean Jb() {
        return this.d0;
    }

    public final DuetType Kb() {
        return this.O;
    }

    public final String Lb() {
        return this.s0;
    }

    public final boolean Mb() {
        return this.j0;
    }

    public final Integer Nb() {
        return this.c0;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.g0(this.d);
        serializer.h0(this.e);
        serializer.i0(this.f);
        serializer.e0(this.g);
        serializer.j0(this.h);
        serializer.j0(this.i);
        serializer.j0(this.j);
        serializer.j0(this.k);
        serializer.L(this.l ? (byte) 1 : (byte) 0);
        serializer.L(this.m ? (byte) 1 : (byte) 0);
        serializer.i0(this.n);
        serializer.S(this.o.ordinal());
        serializer.j0(this.p);
        serializer.Y(this.q);
        serializer.j0(this.r);
        serializer.j0(this.s);
        serializer.j0(this.t);
        serializer.i0(this.u);
        serializer.i0(this.v);
        serializer.i0(this.w);
        serializer.i0(this.x);
        serializer.V(this.y);
        serializer.L(this.z ? (byte) 1 : (byte) 0);
        serializer.L(this.A ? (byte) 1 : (byte) 0);
        serializer.L(this.B ? (byte) 1 : (byte) 0);
        serializer.W(this.C);
        serializer.L(this.D ? (byte) 1 : (byte) 0);
        serializer.L(this.E ? (byte) 1 : (byte) 0);
        serializer.i0(this.F);
        serializer.i0(this.G);
        StoryBackgroundType storyBackgroundType = this.H;
        serializer.j0(storyBackgroundType != null ? storyBackgroundType.toString() : null);
        serializer.j0(this.I);
        serializer.i0(this.J);
        serializer.j0(this.K);
        serializer.W(this.L);
        serializer.j0(this.M);
        serializer.i0(this.N);
        DuetType duetType = this.O;
        serializer.i0(duetType != null ? new DuetType.Wrapper(duetType) : null);
        serializer.L(this.P ? (byte) 1 : (byte) 0);
        serializer.L(this.Q ? (byte) 1 : (byte) 0);
        serializer.L(this.R ? (byte) 1 : (byte) 0);
        serializer.L(this.S ? (byte) 1 : (byte) 0);
        serializer.L(this.T ? (byte) 1 : (byte) 0);
        serializer.L(this.U ? (byte) 1 : (byte) 0);
        serializer.L(this.W ? (byte) 1 : (byte) 0);
        serializer.j0(this.X);
        serializer.V(this.Y);
        serializer.J(this.Z);
        serializer.J(this.a0);
        serializer.R(this.b0);
        serializer.V(this.c0);
        serializer.J(this.d0);
        serializer.i0(this.e0);
        serializer.i0(this.f0);
        serializer.g0(this.g0);
        serializer.i0(this.h0);
        serializer.W(this.i0);
        serializer.L(this.j0 ? (byte) 1 : (byte) 0);
        serializer.L(this.k0 ? (byte) 1 : (byte) 0);
        serializer.V(this.l0);
        serializer.i0(this.m0);
        serializer.L(this.V ? (byte) 1 : (byte) 0);
        serializer.i0(this.n0);
        serializer.i0(this.o0);
        serializer.L(this.p0 ? (byte) 1 : (byte) 0);
        serializer.V(this.q0);
        serializer.i0(this.t0);
        serializer.L(this.u0 ? (byte) 1 : (byte) 0);
        serializer.L(this.v0 ? (byte) 1 : (byte) 0);
        serializer.L(this.w0 ? (byte) 1 : (byte) 0);
        serializer.L(this.y0 ? (byte) 1 : (byte) 0);
        serializer.L(this.x0 ? (byte) 1 : (byte) 0);
        serializer.i0(this.z0);
        serializer.m0(this.s0);
        serializer.m0(this.r0);
        serializer.f0(this.A0);
        serializer.L(this.B0 ? (byte) 1 : (byte) 0);
        serializer.e0(this.C0);
        serializer.e0(this.D0);
    }

    public final String Ob() {
        return this.b;
    }

    public final String Pb() {
        return this.I;
    }

    public final boolean Qb() {
        return this.w0;
    }

    public final WebStoryBox Rb() {
        return this.u;
    }

    public final boolean Sb() {
        return this.p0;
    }

    public final boolean Tb() {
        return this.A;
    }

    public final boolean Ub() {
        return this.B;
    }

    public final boolean Vb() {
        StorySharingInfo storySharingInfo;
        return (this.v == null && this.n == null && this.o0 == null && this.F == null && this.h0 == null && this.n0 == null && this.x == null && ((storySharingInfo = this.f) == null || storySharingInfo.f == null || storySharingInfo.b != 30) && this.z0 == null && this.D0 == null) ? false : true;
    }

    public final boolean Wb() {
        return this.V;
    }

    public final void Xb() {
        this.N = null;
    }

    public final void Yb() {
        this.m = false;
    }

    public final void Zb() {
        this.l = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryCameraParams)) {
            return false;
        }
        StoryCameraParams storyCameraParams = (StoryCameraParams) obj;
        return epx.f(this.b, storyCameraParams.b) && epx.f(this.c, storyCameraParams.c) && this.d == storyCameraParams.d && epx.f(this.e, storyCameraParams.e) && epx.f(this.f, storyCameraParams.f) && epx.f(this.g, storyCameraParams.g) && epx.f(this.h, storyCameraParams.h) && epx.f(this.i, storyCameraParams.i) && epx.f(this.j, storyCameraParams.j) && epx.f(this.k, storyCameraParams.k) && this.l == storyCameraParams.l && this.m == storyCameraParams.m && epx.f(this.n, storyCameraParams.n) && this.o == storyCameraParams.o && epx.f(this.p, storyCameraParams.p) && this.q == storyCameraParams.q && epx.f(this.r, storyCameraParams.r) && epx.f(this.s, storyCameraParams.s) && epx.f(this.t, storyCameraParams.t) && epx.f(this.u, storyCameraParams.u) && epx.f(this.v, storyCameraParams.v) && epx.f(this.w, storyCameraParams.w) && epx.f(this.x, storyCameraParams.x) && epx.f(this.y, storyCameraParams.y) && this.z == storyCameraParams.z && this.A == storyCameraParams.A && this.B == storyCameraParams.B && epx.f(this.C, storyCameraParams.C) && this.D == storyCameraParams.D && this.E == storyCameraParams.E && epx.f(this.F, storyCameraParams.F) && epx.f(this.G, storyCameraParams.G) && this.H == storyCameraParams.H && epx.f(this.I, storyCameraParams.I) && epx.f(this.J, storyCameraParams.J) && epx.f(this.K, storyCameraParams.K) && epx.f(this.L, storyCameraParams.L) && epx.f(this.M, storyCameraParams.M) && epx.f(this.N, storyCameraParams.N) && this.O == storyCameraParams.O && this.P == storyCameraParams.P && this.Q == storyCameraParams.Q && this.R == storyCameraParams.R && this.S == storyCameraParams.S && this.T == storyCameraParams.T && this.U == storyCameraParams.U && this.V == storyCameraParams.V && this.W == storyCameraParams.W && epx.f(this.X, storyCameraParams.X) && epx.f(this.Y, storyCameraParams.Y) && epx.f(this.Z, storyCameraParams.Z) && epx.f(this.a0, storyCameraParams.a0) && epx.f(this.b0, storyCameraParams.b0) && epx.f(this.c0, storyCameraParams.c0) && epx.f(this.d0, storyCameraParams.d0) && epx.f(this.e0, storyCameraParams.e0) && epx.f(this.f0, storyCameraParams.f0) && this.g0 == storyCameraParams.g0 && epx.f(this.h0, storyCameraParams.h0) && epx.f(this.i0, storyCameraParams.i0) && this.j0 == storyCameraParams.j0 && this.k0 == storyCameraParams.k0 && epx.f(this.l0, storyCameraParams.l0) && epx.f(this.m0, storyCameraParams.m0) && epx.f(this.n0, storyCameraParams.n0) && epx.f(this.o0, storyCameraParams.o0) && this.p0 == storyCameraParams.p0 && epx.f(this.q0, storyCameraParams.q0) && epx.f(this.r0, storyCameraParams.r0) && epx.f(this.s0, storyCameraParams.s0) && epx.f(this.t0, storyCameraParams.t0) && this.u0 == storyCameraParams.u0 && this.v0 == storyCameraParams.v0 && this.w0 == storyCameraParams.w0 && this.x0 == storyCameraParams.x0 && this.y0 == storyCameraParams.y0 && epx.f(this.z0, storyCameraParams.z0) && epx.f(this.A0, storyCameraParams.A0) && this.B0 == storyCameraParams.B0 && epx.f(this.C0, storyCameraParams.C0) && epx.f(this.D0, storyCameraParams.D0);
    }

    public final int hashCode() {
        int a2 = fw3.a((this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c)) * 31, 31, this.e);
        StorySharingInfo storySharingInfo = this.f;
        int a3 = bh10.a((a2 + (storySharingInfo == null ? 0 : storySharingInfo.hashCode())) * 31, 31, this.g.b);
        String str = this.h;
        int hashCode = (a3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.k;
        int b2 = qoy.b(qoy.b((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.l), 31, this.m);
        StoryEntryExtended storyEntryExtended = this.n;
        int hashCode4 = (this.o.hashCode() + ((b2 + (storyEntryExtended == null ? 0 : storyEntryExtended.hashCode())) * 31)) * 31;
        String str5 = this.p;
        int a4 = bh10.a((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.q);
        String str6 = this.r;
        int hashCode5 = (a4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.s;
        int hashCode6 = (hashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.t;
        int hashCode7 = (hashCode6 + (str8 == null ? 0 : str8.hashCode())) * 31;
        WebStoryBox webStoryBox = this.u;
        int hashCode8 = (hashCode7 + (webStoryBox == null ? 0 : webStoryBox.hashCode())) * 31;
        StoryPostInfo storyPostInfo = this.v;
        int hashCode9 = (hashCode8 + (storyPostInfo == null ? 0 : storyPostInfo.b.hashCode())) * 31;
        ClipStatStoryData clipStatStoryData = this.w;
        int hashCode10 = (hashCode9 + (clipStatStoryData == null ? 0 : clipStatStoryData.hashCode())) * 31;
        StoryEditorPollAttach storyEditorPollAttach = this.x;
        int hashCode11 = (hashCode10 + (storyEditorPollAttach == null ? 0 : storyEditorPollAttach.hashCode())) * 31;
        Integer num = this.y;
        int b3 = qoy.b(qoy.b(qoy.b((hashCode11 + (num == null ? 0 : num.hashCode())) * 31, 31, this.z), 31, this.A), 31, this.B);
        List<StoryCameraGalleryData> list = this.C;
        int b4 = qoy.b(qoy.b((b3 + (list == null ? 0 : list.hashCode())) * 31, 31, this.D), 31, this.E);
        Photo photo = this.F;
        int hashCode12 = (b4 + (photo == null ? 0 : photo.hashCode())) * 31;
        StoryLocalPhotoSticker storyLocalPhotoSticker = this.G;
        int hashCode13 = (hashCode12 + (storyLocalPhotoSticker == null ? 0 : storyLocalPhotoSticker.hashCode())) * 31;
        StoryBackgroundType storyBackgroundType = this.H;
        int hashCode14 = (hashCode13 + (storyBackgroundType == null ? 0 : storyBackgroundType.hashCode())) * 31;
        String str9 = this.I;
        int hashCode15 = (hashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        StoryMusicInfo storyMusicInfo = this.J;
        int hashCode16 = (hashCode15 + (storyMusicInfo == null ? 0 : storyMusicInfo.hashCode())) * 31;
        String str10 = this.K;
        int hashCode17 = (hashCode16 + (str10 == null ? 0 : str10.hashCode())) * 31;
        List<StoryAnswer> list2 = this.L;
        int hashCode18 = (hashCode17 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str11 = this.M;
        int hashCode19 = (hashCode18 + (str11 == null ? 0 : str11.hashCode())) * 31;
        ClipVideoFile clipVideoFile = this.N;
        int hashCode20 = (hashCode19 + (clipVideoFile == null ? 0 : clipVideoFile.hashCode())) * 31;
        DuetType duetType = this.O;
        int b5 = qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((hashCode20 + (duetType == null ? 0 : duetType.hashCode())) * 31, 31, this.P), 31, this.Q), 31, this.R), 31, this.S), 31, this.T), 31, this.U), 31, this.V), 31, this.W);
        String str12 = this.X;
        int hashCode21 = (b5 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num2 = this.Y;
        int hashCode22 = (hashCode21 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.Z;
        int hashCode23 = (hashCode22 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.a0;
        int hashCode24 = (hashCode23 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Float f = this.b0;
        int hashCode25 = (hashCode24 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num3 = this.c0;
        int hashCode26 = (hashCode25 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool3 = this.d0;
        int hashCode27 = (hashCode26 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        StoryMusicInfo storyMusicInfo2 = this.e0;
        int hashCode28 = (hashCode27 + (storyMusicInfo2 == null ? 0 : storyMusicInfo2.hashCode())) * 31;
        StoryQuestion storyQuestion = this.f0;
        int hashCode29 = (hashCode28 + (storyQuestion == null ? 0 : storyQuestion.hashCode())) * 31;
        CameraTooltipFromLink cameraTooltipFromLink = this.g0;
        int hashCode30 = (hashCode29 + (cameraTooltipFromLink == null ? 0 : cameraTooltipFromLink.hashCode())) * 31;
        MusicTrack musicTrack = this.h0;
        int hashCode31 = (hashCode30 + (musicTrack == null ? 0 : musicTrack.hashCode())) * 31;
        List<Photo> list3 = this.i0;
        int b6 = qoy.b(qoy.b((hashCode31 + (list3 == null ? 0 : list3.hashCode())) * 31, 31, this.j0), 31, this.k0);
        Integer num4 = this.l0;
        int hashCode32 = (b6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        ShareVmojiStoryParams shareVmojiStoryParams = this.m0;
        int hashCode33 = (hashCode32 + (shareVmojiStoryParams == null ? 0 : shareVmojiStoryParams.hashCode())) * 31;
        Playlist playlist = this.n0;
        int hashCode34 = (hashCode33 + (playlist == null ? 0 : playlist.hashCode())) * 31;
        VideoFile videoFile = this.o0;
        int b7 = qoy.b((hashCode34 + (videoFile == null ? 0 : videoFile.hashCode())) * 31, 31, this.p0);
        Integer num5 = this.q0;
        int hashCode35 = (b7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str13 = this.r0;
        int hashCode36 = (hashCode35 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.s0;
        int hashCode37 = (hashCode36 + (str14 == null ? 0 : str14.hashCode())) * 31;
        MusicCameraData musicCameraData = this.t0;
        int b8 = qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((hashCode37 + (musicCameraData == null ? 0 : musicCameraData.hashCode())) * 31, 31, this.u0), 31, this.v0), 31, this.w0), 31, this.x0), 31, this.y0);
        StoryEditorPhotoAlbumAttachment storyEditorPhotoAlbumAttachment = this.z0;
        int b9 = qoy.b(fw3.a((b8 + (storyEditorPhotoAlbumAttachment == null ? 0 : storyEditorPhotoAlbumAttachment.hashCode())) * 31, 31, this.A0), 31, this.B0);
        Bundle bundle = this.C0;
        int hashCode38 = (b9 + (bundle == null ? 0 : bundle.hashCode())) * 31;
        ChannelMessageAttachment channelMessageAttachment = this.D0;
        return hashCode38 + (channelMessageAttachment != null ? channelMessageAttachment.hashCode() : 0);
    }

    public final String toString() {
        return "StoryCameraParams(ref=" + this.b + ", entryPoint=" + this.c + ", forcedState=" + this.d + ", allowedModes=" + this.e + ", sharingInfo=" + this.f + ", publishFromId=" + this.g + ", publishFromName=" + this.h + ", publishFromPhoto=" + this.i + ", maskId=" + this.j + ", prependMaskId=" + this.k + ", forceFrontCamera=" + this.l + ", forceBackCamera=" + this.m + ", parentStory=" + this.n + ", cameraTarget=" + this.o + ", targetName=" + this.p + ", imDialogId=" + this.q + ", title=" + this.r + ", hashtag=" + this.s + ", clipHashtag=" + this.t + ", storyBox=" + this.u + ", postInfo=" + this.v + ", clipStat=" + this.w + ", poll=" + this.x + ", miniAppId=" + this.y + ", codeReaderMode=" + this.z + ", isOnlyQrMode=" + this.A + ", isOnlyVmojiCaptureMode=" + this.B + ", galleryStories=" + this.C + ", directSendingToIM=" + this.D + ", isAuthorOnlyUser=" + this.E + ", photoSticker=" + this.F + ", localPhotoSticker=" + this.G + ", backgroundType=" + this.H + ", requestId=" + this.I + ", musicInfo=" + this.J + ", parentStoryId=" + this.K + ", answers=" + this.L + ", draftId=" + this.M + ", duet=" + this.N + ", initDuetType=" + this.O + ", openTextEditor=" + this.P + ", isAddStoryButtonVisible=" + this.Q + ", isSaveStoryButtonVisible=" + this.R + ", isOpenCameraButtonVisible=" + this.S + ", isSaveToDeviceAfterPublish=" + this.T + ", isPhotoEnhancementButtonVisible=" + this.U + ", isScanQrCodeFromPhotoButtonVisible=" + this.V + ", isFromIdeas=" + this.W + ", storyTeaserType=" + this.X + ", situationalSuggestId=" + this.Y + ", isChooseReceiversAvailable=" + this.Z + ", isChoosePrivacyAvailable=" + this.a0 + ", recordingSpeed=" + this.b0 + ", qrModeIndex=" + this.c0 + ", gesturedControl=" + this.d0 + ", clipMusicInfo=" + this.e0 + ", question=" + this.f0 + ", tooltipName=" + this.g0 + ", musicSharingData=" + this.h0 + ", storiesPhoto=" + this.i0 + ", onlyEditor=" + this.j0 + ", initWithEmptyContent=" + this.k0 + ", sharingSuccessRequestCode=" + this.l0 + ", vmojiParams=" + this.m0 + ", playlistSharingData=" + this.n0 + ", shareVideo=" + this.o0 + ", withTransitions=" + this.p0 + ", lifetime=" + this.q0 + ", memoryDate=" + this.r0 + ", memoryType=" + this.s0 + ", musicCameraData=" + this.t0 + ", isMusicButtonVisible=" + this.u0 + ", shouldRegisterAsDialog=" + this.v0 + ", shouldControlFullscreenMode=" + this.w0 + ", clipEnableTemplates=" + this.x0 + ", clipEnableDrafts=" + this.y0 + ", album=" + this.z0 + ", imSharingData=" + this.A0 + ", withOpenedFromCollage=" + this.B0 + ", collageParams=" + this.C0 + ", channelPostInfo=" + this.D0 + ')';
    }

    public final StoryCameraTarget zb() {
        return this.o;
    }
}

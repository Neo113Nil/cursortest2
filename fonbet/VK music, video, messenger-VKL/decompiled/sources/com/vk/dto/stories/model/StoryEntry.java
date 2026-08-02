package com.vk.dto.stories.model;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.huawei.hms.framework.common.BundleUtil;
import com.ironsource.D1;
import com.vk.api.generated.stories.dto.StoriesMediascopeResearchDto;
import com.vk.api.generated.stories.dto.StoriesMediascopeResearchEventDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.actionlinks.ActionLinkSnippet;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.c;
import com.vk.dto.common.filter.ImageQuality;
import com.vk.dto.common.filter.ImageSide;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.Image;
import com.vk.dto.group.Group;
import com.vk.dto.photo.Photo;
import com.vk.dto.profile.CatchUpBanner;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.dto.reactions.ReactionSet;
import com.vk.dto.stories.entities.PromoInfo;
import com.vk.dto.stories.model.ExternalAdsInfo;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.dto.stories.model.StoryViewAction;
import com.vk.dto.stories.model.ads.MyTargetAdData;
import com.vk.dto.stories.model.ads.MyTargetAdFormat;
import com.vk.dto.stories.model.ads.MyTargetAdType;
import com.vk.dto.stories.model.clickable.ClickableMusic;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.dto.user.UserProfile;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.epx;
import xsna.fkq0;
import xsna.hx6;
import xsna.igl;
import xsna.j5g;
import xsna.jgp;
import xsna.riw;
import xsna.t860;
import xsna.vhk0;
import xsna.xwl0;

/* loaded from: classes18.dex */
public class StoryEntry extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StoryEntry> CREATOR = new a();
    public int A;
    public int A0;
    public boolean B;

    @Nullable
    public String B0;
    public boolean C;

    @Nullable
    public StoryMemoryType C0;
    public boolean D;

    @Nullable
    public String D0;
    public boolean E;

    @Nullable
    public MyTargetAdData E0;
    public boolean F;

    @Nullable
    public StoriesMediascopeResearchDto F0;
    public boolean G;
    public final hx6 G0;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int O;
    public UserId P;
    public String Q;
    public StoryEntryExtended R;

    @Nullable
    public String S;
    public String T;
    public CatchUpBanner U;

    @Nullable
    public ArrayList V;

    @Nullable
    public ArrayList W;

    @Nullable
    public ClickableStickers X;
    public int Y;
    public int Z;
    public boolean a0;
    public boolean b;
    public boolean b0;
    public int c;
    public boolean c0;
    public UserId d;
    public boolean d0;
    public String e;
    public int e0;
    public long f;

    @Nullable
    public final ReactionSet f0;

    @Nullable
    public Long g;

    @Nullable
    public Integer g0;
    public boolean h;

    @Nullable
    public Object h0;
    public int i;
    public boolean i0;
    public int j;
    public int j0;
    public boolean k;
    public long k0;

    @Nullable
    public String l;

    @Nullable
    public StoryOwner l0;
    public Photo m;

    @Nullable
    public ExternalAdsInfo m0;

    @Nullable
    public VideoFile n;
    public int n0;

    @Nullable
    public String o;
    public boolean o0;
    public boolean p;

    @Nullable
    public String p0;
    public boolean q;
    public int q0;
    public boolean r;
    public StorySubscribersHeader r0;

    @Nullable
    public String s;
    public boolean s0;
    public PromoInfo t;
    public String t0;
    public String u;
    public String u0;
    public String v;
    public boolean v0;

    @Nullable
    public String w;
    public boolean w0;
    public File x;
    public String x0;
    public File y;
    public boolean y0;
    public int z;
    public boolean z0;

    public class a extends Serializer.c<StoryEntry> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StoryEntry a(@NonNull Serializer serializer) {
            return new StoryEntry(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoryEntry[i];
        }
    }

    public StoryEntry() {
        UserId userId = UserId.d;
        this.d = userId;
        this.C = true;
        this.P = userId;
        this.G0 = new hx6();
    }

    @NonNull
    public static ArrayList Vb(@NonNull JSONArray jSONArray, Map map, Map map2, @NonNull Map map3) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                arrayList.add(new StoryEntry(optJSONObject, map, map2, map3));
            }
        }
        return arrayList;
    }

    @Nullable
    public final ClickableMusic Ab() {
        ClickableStickers clickableStickers = this.X;
        if (clickableStickers == null) {
            return null;
        }
        for (ClickableSticker clickableSticker : clickableStickers.d) {
            if (clickableSticker instanceof ClickableMusic) {
                return (ClickableMusic) clickableSticker;
            }
        }
        return null;
    }

    @Nullable
    public final String Bb(int i) {
        File file = this.x;
        return (file == null || !vhk0.g(file)) ? Jb(i, ImageQuality.FIT, false) : Eb();
    }

    @Nullable
    public final String Cb(boolean z) {
        return Db(z, ImageQuality.FIT, false);
    }

    @Nullable
    public final String Db(boolean z, ImageQuality imageQuality, boolean z2) {
        ImageSize zb;
        File file = this.x;
        if (file != null && vhk0.g(file)) {
            return Eb();
        }
        if (!z && !TextUtils.isEmpty(this.l)) {
            return this.l;
        }
        Photo photo = this.m;
        if (photo != null) {
            List<ImageSize> list = photo.y.b;
            Image image = zb(imageQuality, 130, list).d;
            if (image.b >= 130) {
                return image.d;
            }
            Image image2 = zb(imageQuality, 604, list).d;
            if (image2.b >= 604) {
                return image2.d;
            }
            if (this.m.y.b.isEmpty()) {
                return null;
            }
            return zb(imageQuality, 130, list).d.d;
        }
        VideoFile videoFile = this.n;
        if (videoFile == null) {
            return null;
        }
        if (z2) {
            ArrayList arrayList = new ArrayList(this.n.e1().b);
            arrayList.addAll(this.n.getImage().b);
            zb = zb(ImageQuality.BEST, 320, arrayList);
        } else {
            zb = zb(ImageQuality.BEST, 320, videoFile.e1().b);
        }
        if (zb == ImageSize.f) {
            zb = zb(ImageQuality.BEST, 320, this.n.getImage().b);
        }
        return zb.d.d;
    }

    @Nullable
    public final String Eb() {
        File file = this.x;
        if (file == null || !vhk0.g(file)) {
            return null;
        }
        return "file://" + this.x.getAbsolutePath();
    }

    @NonNull
    public final String Fb() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Gb());
        if (TextUtils.isEmpty(this.o)) {
            str = "";
        } else {
            str = BundleUtil.UNDERLINE_TAG + this.o;
        }
        sb.append(str);
        return sb.toString();
    }

    @NonNull
    public final String Gb() {
        return this.d + BundleUtil.UNDERLINE_TAG + this.c;
    }

    public final StoryEntryExtended Hb() {
        return this.R;
    }

    @Nullable
    public final String Ib(int i) {
        return Jb(i, ImageQuality.FIT, false);
    }

    @Nullable
    public final String Jb(int i, ImageQuality imageQuality, boolean z) {
        ImageSize zb;
        Photo photo = this.m;
        if (photo != null) {
            List<ImageSize> list = photo.y.b;
            if (i != 0) {
                return zb(imageQuality, i, list).d.d;
            }
            int[] iArr = {2560, 1080, 807, 604, 505, 350, 130};
            for (int i2 = 0; i2 < 7; i2++) {
                int i3 = iArr[i2];
                Image image = zb(imageQuality, i, list).d;
                if (image.b >= i3) {
                    return image.d;
                }
            }
            if (this.m.y.b.isEmpty()) {
                return null;
            }
            return zb(imageQuality, 130, list).d.d;
        }
        VideoFile videoFile = this.n;
        if (videoFile == null) {
            if (TextUtils.isEmpty(this.l)) {
                return null;
            }
            return this.l;
        }
        List<ImageSize> list2 = videoFile.e1().b;
        if (z) {
            ArrayList arrayList = new ArrayList(list2);
            arrayList.addAll(this.n.getImage().b);
            zb = zb(ImageQuality.BEST, 800, arrayList);
        } else {
            zb = zb(ImageQuality.BEST, 800, list2);
        }
        if (zb == null) {
            return null;
        }
        return zb.d.d;
    }

    @NonNull
    public final String Kb() {
        Locale locale = Locale.US;
        return "story" + this.d.b + BundleUtil.UNDERLINE_TAG + this.c;
    }

    public final boolean Lb() {
        ExternalAdsInfo externalAdsInfo = this.m0;
        return externalAdsInfo != null && externalAdsInfo.g == ExternalAdsInfo.ScaleType.FIT;
    }

    public final boolean Mb() {
        VideoFile videoFile = this.n;
        return videoFile != null && videoFile.X2();
    }

    public final boolean Nb() {
        return this.F && this.E0 != null;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(@NonNull Serializer serializer) {
        serializer.L(this.b ? (byte) 1 : (byte) 0);
        serializer.S(this.c);
        serializer.e0(this.d);
        serializer.j0(this.e);
        serializer.Y(this.f);
        serializer.b0(this.g);
        serializer.L(this.h ? (byte) 1 : (byte) 0);
        serializer.L(this.k ? (byte) 1 : (byte) 0);
        serializer.j0(this.l);
        serializer.S(this.j);
        serializer.i0(this.m);
        serializer.i0(this.n);
        serializer.g0(this.x);
        serializer.j0(this.o);
        serializer.L(this.p ? (byte) 1 : (byte) 0);
        serializer.L(this.i0 ? (byte) 1 : (byte) 0);
        serializer.L(this.q ? (byte) 1 : (byte) 0);
        serializer.L(this.r ? (byte) 1 : (byte) 0);
        serializer.i0(this.t);
        serializer.j0(this.u);
        serializer.j0(this.v);
        serializer.j0(this.w);
        serializer.S(this.z);
        serializer.S(this.A);
        serializer.L(this.B ? (byte) 1 : (byte) 0);
        serializer.S(this.O);
        serializer.e0(this.P);
        serializer.j0(this.Q);
        serializer.L(this.E ? (byte) 1 : (byte) 0);
        serializer.L(this.C ? (byte) 1 : (byte) 0);
        serializer.L(this.D ? (byte) 1 : (byte) 0);
        serializer.L(this.F ? (byte) 1 : (byte) 0);
        serializer.j0(this.T);
        serializer.j0(this.S);
        serializer.i0(this.R);
        serializer.i0(this.X);
        serializer.i0(this.U);
        serializer.L(this.N ? (byte) 1 : (byte) 0);
        serializer.S(this.Z);
        serializer.L(this.H ? (byte) 1 : (byte) 0);
        serializer.L(this.I ? (byte) 1 : (byte) 0);
        serializer.L(this.J ? (byte) 1 : (byte) 0);
        serializer.L(this.K ? (byte) 1 : (byte) 0);
        serializer.L(this.a0 ? (byte) 1 : (byte) 0);
        serializer.L(this.b0 ? (byte) 1 : (byte) 0);
        serializer.S(this.i);
        serializer.S(this.j0);
        serializer.Y(this.k0);
        serializer.L(this.c0 ? (byte) 1 : (byte) 0);
        serializer.L(this.d0 ? (byte) 1 : (byte) 0);
        serializer.S(this.Y);
        serializer.L(this.G ? (byte) 1 : (byte) 0);
        serializer.i0(this.l0);
        serializer.S(this.n0);
        serializer.L(this.o0 ? (byte) 1 : (byte) 0);
        serializer.m0(this.p0);
        serializer.S(this.q0);
        serializer.i0(this.r0);
        serializer.L(this.s0 ? (byte) 1 : (byte) 0);
        serializer.S(this.e0);
        serializer.i0(this.m0);
        serializer.j0(this.t0);
        serializer.j0(this.u0);
        serializer.L(this.v0 ? (byte) 1 : (byte) 0);
        serializer.m0(this.s);
        serializer.L(this.w0 ? (byte) 1 : (byte) 0);
        serializer.m0(this.x0);
        serializer.L(this.y0 ? (byte) 1 : (byte) 0);
        serializer.m0(this.B0);
        serializer.L(this.z0 ? (byte) 1 : (byte) 0);
        serializer.S(this.A0);
        serializer.L(this.M ? (byte) 1 : (byte) 0);
        serializer.e0(this.E0);
        serializer.e0(this.C0);
        serializer.m0(this.D0);
        serializer.e0(this.F0);
        serializer.L(this.L ? (byte) 1 : (byte) 0);
        serializer.V(this.g0);
    }

    public final boolean Ob() {
        MyTargetAdData myTargetAdData;
        return this.F && (myTargetAdData = this.E0) != null && myTargetAdData.d == MyTargetAdFormat.HTML5;
    }

    public final boolean Pb() {
        return Qb() || Rb();
    }

    public final boolean Qb() {
        MyTargetAdData myTargetAdData;
        return this.F && (myTargetAdData = this.E0) != null && myTargetAdData.d == MyTargetAdFormat.STATIC;
    }

    public final boolean Rb() {
        MyTargetAdData myTargetAdData;
        return this.F && (myTargetAdData = this.E0) != null && myTargetAdData.d == MyTargetAdFormat.VIDEO;
    }

    public final boolean Sb() {
        return "photo".equals(this.e) || Qb();
    }

    public final boolean Tb() {
        return "video".equals(this.e) || Rb();
    }

    public final boolean Ub() {
        if (Sb() || Qb()) {
            return false;
        }
        if (Tb() || Rb()) {
            return !this.a0;
        }
        return true;
    }

    public final void Wb(StoryEntryExtended storyEntryExtended) {
        this.R = storyEntryExtended;
        if (storyEntryExtended == null) {
            this.O = 0;
            this.P = UserId.d;
            this.Q = "";
        } else {
            StoryEntry storyEntry = storyEntryExtended.b;
            this.O = storyEntry.c;
            this.P = storyEntry.d;
            this.Q = storyEntry.o;
        }
    }

    public final void Xb(StoryEntry storyEntry) {
        this.b = storyEntry.b;
        this.c = storyEntry.c;
        this.d = storyEntry.d;
        this.e = storyEntry.e;
        this.f = storyEntry.f;
        this.g = storyEntry.g;
        this.h = storyEntry.h;
        this.j = storyEntry.j;
        this.k = storyEntry.k;
        this.l = storyEntry.l;
        this.m = storyEntry.m;
        this.n = storyEntry.n;
        this.o = storyEntry.o;
        this.p = storyEntry.p;
        this.i0 = storyEntry.i0;
        this.q = storyEntry.q;
        this.r = storyEntry.r;
        this.t = storyEntry.t;
        this.u = storyEntry.u;
        this.B = storyEntry.B;
        this.E = storyEntry.E;
        this.v = storyEntry.v;
        this.w = storyEntry.w;
        this.C = storyEntry.C;
        this.D = storyEntry.D;
        this.z = storyEntry.z;
        this.A = storyEntry.A;
        this.O = storyEntry.O;
        this.P = storyEntry.P;
        this.Q = storyEntry.Q;
        this.R = storyEntry.R;
        this.s = storyEntry.s;
        this.V = storyEntry.V;
        this.X = storyEntry.X;
        this.Y = storyEntry.Y;
        this.Z = storyEntry.Z;
        this.H = storyEntry.H;
        this.I = storyEntry.I;
        this.J = storyEntry.J;
        this.K = storyEntry.K;
        this.a0 = storyEntry.a0;
        this.b0 = storyEntry.b0;
        this.i = storyEntry.i;
        this.j0 = storyEntry.j0;
        this.k0 = storyEntry.k0;
        this.c0 = storyEntry.c0;
        this.d0 = storyEntry.d0;
        this.G = storyEntry.G;
        this.l0 = storyEntry.l0;
        this.n0 = storyEntry.n0;
        this.o0 = storyEntry.o0;
        this.p0 = storyEntry.p0;
        this.q0 = storyEntry.q0;
        this.s0 = storyEntry.s0;
        this.e0 = storyEntry.e0;
        this.m0 = storyEntry.m0;
        this.t0 = storyEntry.t0;
        this.u0 = storyEntry.u0;
        this.v0 = storyEntry.v0;
        this.w0 = storyEntry.w0;
        this.x0 = storyEntry.x0;
        this.y0 = storyEntry.y0;
        this.B0 = storyEntry.B0;
        this.z0 = storyEntry.z0;
        this.A0 = storyEntry.A0;
        this.M = storyEntry.M;
        this.E0 = storyEntry.E0;
        this.C0 = storyEntry.C0;
        this.D0 = storyEntry.D0;
        this.F0 = storyEntry.F0;
        this.L = storyEntry.L;
        this.g0 = storyEntry.g0;
    }

    @NonNull
    public final String Yb() {
        if (TextUtils.isEmpty(this.o)) {
            return this.d + BundleUtil.UNDERLINE_TAG + this.c;
        }
        return this.d + BundleUtil.UNDERLINE_TAG + this.c + BundleUtil.UNDERLINE_TAG + this.o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            StoryEntry storyEntry = (StoryEntry) obj;
            if (this.E0 == null && storyEntry.E0 == null) {
                ExternalAdsInfo externalAdsInfo = this.m0;
                if (externalAdsInfo != null) {
                    return externalAdsInfo.equals(storyEntry.m0);
                }
                if (this.c != storyEntry.c) {
                    return false;
                }
                return Objects.equals(this.d, storyEntry.d);
            }
            if (this.c == storyEntry.c && Objects.equals(this.d, storyEntry.d) && Objects.equals(this.E0, storyEntry.E0)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public final String getId() {
        return this.d + BundleUtil.UNDERLINE_TAG + this.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.c), this.d, this.E0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryEntry: isPhoto=");
        sb.append(Sb() || Qb());
        sb.append(", isAds=");
        sb.append(this.F);
        return sb.toString();
    }

    @NonNull
    public final ImageSize zb(ImageQuality imageQuality, int i, List<ImageSize> list) {
        ImageSize a2;
        riw riwVar = new riw(i, ImageSide.WIDTH);
        hx6 hx6Var = this.G0;
        hx6Var.getClass();
        hx6Var.a = imageQuality;
        Pair<hx6.a, ImageSize> pair = hx6Var.b;
        hx6.a aVar = new hx6.a(imageQuality, list, riwVar);
        if (pair == null || !epx.f(pair.i(), aVar)) {
            if (list.isEmpty()) {
                a2 = null;
            } else if (list.size() == 1) {
                a2 = (ImageSize) j5g.Y(list);
            } else {
                int i2 = igl.a.$EnumSwitchMapping$0[hx6Var.a.ordinal()];
                if (i2 == 1) {
                    a2 = igl.a(list, riwVar, true, true);
                } else if (i2 == 2) {
                    a2 = igl.a(list, riwVar, false, true);
                } else if (i2 == 3) {
                    a2 = igl.a(list, riwVar, false, true);
                } else if (i2 == 4) {
                    a2 = igl.a(list, riwVar, false, false);
                } else {
                    if (i2 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    a2 = igl.a(list, riwVar, true, false);
                }
            }
            hx6Var.b = new Pair<>(aVar, a2);
        } else {
            a2 = pair.j();
        }
        return a2 == null ? ImageSize.f : a2;
    }

    public StoryEntry(JSONObject jSONObject) {
        this(jSONObject, null, null, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x07b3, code lost:
    
        if (r0.equals("html5") == false) goto L402;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:224:0x060b A[Catch: all -> 0x05b9, TryCatch #1 {all -> 0x05b9, blocks: (B:211:0x05b3, B:212:0x05c5, B:214:0x05cd, B:216:0x05d7, B:217:0x05db, B:219:0x05df, B:224:0x060b, B:226:0x0618, B:227:0x0623, B:229:0x0636, B:231:0x0644, B:232:0x064a, B:238:0x0657, B:239:0x0659, B:234:0x0651, B:367:0x05eb, B:371:0x05f7, B:374:0x0602), top: B:210:0x05b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0618 A[Catch: all -> 0x05b9, TryCatch #1 {all -> 0x05b9, blocks: (B:211:0x05b3, B:212:0x05c5, B:214:0x05cd, B:216:0x05d7, B:217:0x05db, B:219:0x05df, B:224:0x060b, B:226:0x0618, B:227:0x0623, B:229:0x0636, B:231:0x0644, B:232:0x064a, B:238:0x0657, B:239:0x0659, B:234:0x0651, B:367:0x05eb, B:371:0x05f7, B:374:0x0602), top: B:210:0x05b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0636 A[Catch: all -> 0x05b9, TryCatch #1 {all -> 0x05b9, blocks: (B:211:0x05b3, B:212:0x05c5, B:214:0x05cd, B:216:0x05d7, B:217:0x05db, B:219:0x05df, B:224:0x060b, B:226:0x0618, B:227:0x0623, B:229:0x0636, B:231:0x0644, B:232:0x064a, B:238:0x0657, B:239:0x0659, B:234:0x0651, B:367:0x05eb, B:371:0x05f7, B:374:0x0602), top: B:210:0x05b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0657 A[Catch: all -> 0x05b9, TryCatch #1 {all -> 0x05b9, blocks: (B:211:0x05b3, B:212:0x05c5, B:214:0x05cd, B:216:0x05d7, B:217:0x05db, B:219:0x05df, B:224:0x060b, B:226:0x0618, B:227:0x0623, B:229:0x0636, B:231:0x0644, B:232:0x064a, B:238:0x0657, B:239:0x0659, B:234:0x0651, B:367:0x05eb, B:371:0x05f7, B:374:0x0602), top: B:210:0x05b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x07fc  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x07fe  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0654 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0614  */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [com.vk.dto.stories.model.ads.MyTargetAdType] */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [com.vk.dto.stories.model.ads.MyTargetAdFormat] */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r32v0, types: [java.util.Map, java.util.Map<com.vk.dto.common.id.UserId, com.vk.dto.group.Group>] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.String, xsna.zcl] */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v35, types: [com.vk.api.generated.stories.dto.StoriesMediascopeResearchDto] */
    /* JADX WARN: Type inference failed for: r9v36 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StoryEntry(JSONObject jSONObject, @Nullable Map<UserId, UserProfile> map, @Nullable Map<UserId, Group> map2, @Nullable Map<String, ReactionSet> map3) {
        char c;
        StoryMemoryType storyMemoryType;
        int i;
        ArrayList arrayList;
        JSONObject optJSONObject;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ?? storiesMediascopeResearchDto;
        int i2;
        MyTargetAdType myTargetAdType;
        ?? r22;
        MyTargetAdFormat myTargetAdFormat;
        ?? r23;
        ArrayList arrayList4;
        ArrayList arrayList5;
        Object obj;
        JSONObject optJSONObject2;
        ?? r7;
        com.vk.dto.common.Image image;
        String optString;
        String optString2;
        int i3;
        int length;
        int i4;
        ExternalAdsInfo.ScaleType scaleType;
        List list;
        UserProfile userProfile;
        JSONArray optJSONArray;
        Object obj2;
        String str;
        JSONObject optJSONObject3;
        JSONArray jSONArray;
        StoryViewAction storyViewAction;
        String str2;
        UserId userId = UserId.d;
        this.d = userId;
        this.C = true;
        this.P = userId;
        this.G0 = new hx6();
        this.b = false;
        this.c = jSONObject.optInt("id");
        this.d = new UserId(jSONObject.optLong("owner_id"));
        this.e = jSONObject.optString("type");
        String optString3 = jSONObject.optString("preview");
        this.l = optString3;
        if (TextUtils.isEmpty(optString3)) {
            this.l = null;
        } else {
            this.l = "data:mime/type;base64," + this.l;
        }
        this.f = jSONObject.optLong("date") * 1000;
        this.g = jSONObject.has("expires_at") ? Long.valueOf(jSONObject.optLong("expires_at") * 1000) : null;
        this.h = jSONObject.optInt("seen") > 0;
        this.j = jSONObject.optInt("views");
        this.k = jSONObject.optBoolean("is_expired");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("photo");
        if (optJSONObject4 != null) {
            try {
                Photo photo = (Photo) Photo.R.a(optJSONObject4);
                this.m = photo;
                this.B0 = photo.P;
            } catch (JSONException unused) {
                this.m = null;
            }
        } else {
            this.m = null;
        }
        JSONObject optJSONObject5 = jSONObject.optJSONObject("video");
        if (optJSONObject5 != null) {
            VideoFileOld b = c.b(optJSONObject5);
            this.n = b;
            this.B0 = b.i1;
            if (b.m1() != null) {
                this.T = this.n.m1().e;
                ActionLinkSnippet actionLinkSnippet = this.n.m1().f;
                if (actionLinkSnippet != null) {
                    this.S = actionLinkSnippet.e;
                }
            }
        } else {
            this.n = null;
        }
        String optString4 = jSONObject.optString("memory_type");
        optString4.getClass();
        switch (optString4.hashCode()) {
            case -1405959847:
                if (optString4.equals("avatar")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -706998905:
                if (optString4.equals("first_audio")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -690394458:
                if (optString4.equals("first_story")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -441285176:
                if (optString4.equals("first_avatar")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -160912177:
                if (optString4.equals("first_post")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 3446944:
                if (optString4.equals("post")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 106642994:
                if (optString4.equals("photo")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 109770997:
                if (optString4.equals("story")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1069376125:
                if (optString4.equals("birthday")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1427104526:
                if (optString4.equals("my_top_track")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                storyMemoryType = StoryMemoryType.AVATAR;
                break;
            case 1:
                storyMemoryType = StoryMemoryType.FIRST_AUDIO;
                break;
            case 2:
                storyMemoryType = StoryMemoryType.FIRST_STORY;
                break;
            case 3:
                storyMemoryType = StoryMemoryType.FIRST_AVATAR;
                break;
            case 4:
                storyMemoryType = StoryMemoryType.FIRST_POST;
                break;
            case 5:
                storyMemoryType = StoryMemoryType.POST;
                break;
            case 6:
                storyMemoryType = StoryMemoryType.PHOTO;
                break;
            case 7:
                storyMemoryType = StoryMemoryType.STORY;
                break;
            case '\b':
                storyMemoryType = StoryMemoryType.BIRTHDAY;
                break;
            case '\t':
                storyMemoryType = StoryMemoryType.MY_TOP_TRACK;
                break;
            default:
                storyMemoryType = null;
                break;
        }
        this.C0 = storyMemoryType;
        this.D0 = jSONObject.optString("memory_date");
        this.o = jSONObject.optString("access_key");
        this.p = jSONObject.optInt("is_private") > 0;
        this.i0 = jSONObject.optBoolean("is_one_time", false);
        this.E = jSONObject.optInt("is_direct") > 0;
        this.q = jSONObject.optInt("can_share") > 0;
        this.r = jSONObject.optInt("can_comment") > 0;
        JSONObject optJSONObject6 = jSONObject.optJSONObject(NotificationCompat.CATEGORY_PROMO);
        if (optJSONObject6 != null) {
            this.t = new PromoInfo(optJSONObject6);
        }
        this.u = jSONObject.optString("track_code");
        this.F = jSONObject.optBoolean("is_ads");
        this.v0 = jSONObject.optBoolean("is_authors_ads");
        this.N = jSONObject.optBoolean("is_promo");
        this.B = jSONObject.optBoolean("is_deleted");
        this.t0 = jSONObject.optString("advertiser_info_url");
        this.u0 = jSONObject.optString("ad_marker");
        this.w0 = jSONObject.optBoolean("is_best_friends_privacy");
        this.x0 = jSONObject.optString("privacy");
        this.y0 = jSONObject.optBoolean("have_old_privacy");
        JSONObject optJSONObject7 = jSONObject.optJSONObject("link");
        if (optJSONObject7 != null) {
            this.S = optJSONObject7.optString("text");
            this.T = optJSONObject7.optString("url");
        }
        this.v = jSONObject.optString("mask_id");
        JSONObject optJSONObject8 = jSONObject.optJSONObject("mask");
        if (optJSONObject8 != null) {
            this.w = optJSONObject8.optString("name");
        }
        this.C = jSONObject.optInt("can_see") > 0;
        this.D = jSONObject.optInt("can_reply") > 0;
        this.G = jSONObject.optInt("can_hide", 1) > 0;
        this.H = jSONObject.optInt("can_ask", 1) > 0;
        this.I = jSONObject.optInt("can_ask_anonymous", 1) > 0;
        JSONObject optJSONObject9 = jSONObject.optJSONObject("replies");
        if (optJSONObject9 != null) {
            this.z = optJSONObject9.optInt("count");
            this.A = optJSONObject9.optInt("new");
        }
        JSONObject optJSONObject10 = jSONObject.optJSONObject("questions");
        if (optJSONObject10 != null) {
            this.Y = optJSONObject10.optInt("count");
            this.Z = optJSONObject10.optInt("new");
        }
        this.O = jSONObject.optInt("parent_story_id");
        this.P = new UserId(jSONObject.optLong("parent_story_owner_id"));
        this.Q = jSONObject.optString("parent_story_access_key");
        this.s = jSONObject.optString("caption");
        JSONArray optJSONArray2 = jSONObject.optJSONArray("ads_statistics");
        if (optJSONArray2 != null) {
            this.V = new ArrayList(optJSONArray2.length());
            int i5 = 0;
            while (i5 != optJSONArray2.length()) {
                JSONObject optJSONObject11 = optJSONArray2.optJSONObject(i5);
                if (optJSONObject11 == null) {
                    jSONArray = optJSONArray2;
                } else {
                    StoryViewAction.a aVar = StoryViewAction.Companion;
                    String optString5 = optJSONObject11.optString("type", "");
                    aVar.getClass();
                    StoryViewAction[] values = StoryViewAction.values();
                    jSONArray = optJSONArray2;
                    int length2 = values.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 < length2) {
                            StoryViewAction storyViewAction2 = values[i6];
                            int i7 = i6;
                            str2 = storyViewAction2.stringValue;
                            if (epx.f(str2, optString5)) {
                                storyViewAction = storyViewAction2;
                            } else {
                                i6 = i7 + 1;
                            }
                        } else {
                            storyViewAction = null;
                        }
                    }
                    String optString6 = optJSONObject11.optString("url");
                    xwl0 xwl0Var = (storyViewAction == null || optString6 == null || optString6.length() == 0) ? null : new xwl0(storyViewAction, optString6);
                    if (xwl0Var != null) {
                        this.V.add(xwl0Var);
                    }
                }
                i5++;
                optJSONArray2 = jSONArray;
            }
        }
        JSONObject optJSONObject12 = jSONObject.optJSONObject("header_catch_up_link");
        if (optJSONObject12 != null) {
            Serializer.c<CatchUpBanner> cVar = CatchUpBanner.CREATOR;
            this.U = CatchUpBanner.a.a(optJSONObject12);
        }
        JSONObject optJSONObject13 = jSONObject.optJSONObject("clickable_stickers");
        if (optJSONObject13 != null) {
            Serializer.c<ClickableStickers> cVar2 = ClickableStickers.CREATOR;
            ClickableStickers a2 = ClickableStickers.a.a(optJSONObject13, map, map2);
            this.X = a2;
            if (a2 != null) {
                a2.Ab();
            }
        }
        this.J = jSONObject.optBoolean("need_mute");
        this.K = jSONObject.optBoolean("is_restricted");
        jSONObject.optBoolean("need_show_empty_stats");
        this.a0 = jSONObject.optBoolean("no_sound");
        this.b0 = jSONObject.optBoolean("mute_reply");
        if (fkq0.c(this.P) && this.O != 0 && map != null && map2 != 0 && (optJSONObject3 = jSONObject.optJSONObject("parent_story")) != null) {
            this.R = new StoryEntryExtended(new StoryEntry(optJSONObject3), map, (Map<UserId, Group>) map2);
        }
        this.i = jSONObject.optInt("seen_progress", 0);
        this.c0 = jSONObject.optBoolean("is_liked");
        this.d0 = jSONObject.optBoolean("can_like");
        this.e0 = jSONObject.optInt("likes_count");
        int optInt = jSONObject.optInt("user_reaction_id", -1);
        this.g0 = optInt >= 0 ? Integer.valueOf(optInt) : null;
        String optString7 = jSONObject.optString("reaction_set_id", "");
        if (map3 != null && !optString7.isEmpty()) {
            this.f0 = map3.get(optString7);
        }
        if (this.f0 != null && (optJSONArray = jSONObject.optJSONArray("new_reactions")) != null) {
            this.h0 = new ArrayList(optJSONArray.length());
            for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
                JSONObject optJSONObject14 = optJSONArray.optJSONObject(i8);
                if (optJSONObject14 != null) {
                    ReactionSet reactionSet = this.f0;
                    UserId userId2 = new UserId(optJSONObject14.optLong("user_id"));
                    int optInt2 = optJSONObject14.optInt("reaction_id", -1);
                    Iterator it = reactionSet.c.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (((ReactionMeta) obj2).getId() == optInt2) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    ReactionMeta reactionMeta = (ReactionMeta) obj2;
                    jgp jgpVar = jgp.b;
                    UserProfile userProfile2 = (map == null ? jgpVar : map).get(userId2);
                    Group group = (Group) (map2 != 0 ? map2 : jgpVar).get(userId2);
                    com.vk.dto.common.Image image2 = (userProfile2 == null || (image2 = userProfile2.O) == null) ? group != null ? group.g : null : image2;
                    t860 t860Var = image2 != null ? new t860((userProfile2 == null || (str = userProfile2.e) == null) ? group != null ? group.d : null : str, image2, reactionMeta) : null;
                    if (t860Var != null) {
                        this.h0.add(t860Var);
                    }
                }
            }
        }
        long j = this.d.b;
        if (j > 0 && map != null) {
            this.l0 = new StoryOwner.User(map.get(this.d));
        } else if (j < 0 && map2 != 0) {
            this.l0 = new StoryOwner.Community((Group) map2.get(fkq0.e(this.d)));
        }
        this.n0 = jSONObject.optInt("narratives_count", 0);
        this.o0 = jSONObject.optBoolean("can_use_in_narrative");
        this.p0 = jSONObject.optString("first_narrative_title");
        this.q0 = jSONObject.optInt("narrative_id", 0);
        JSONObject optJSONObject15 = jSONObject.optJSONObject("also_subscribed");
        if (optJSONObject15 != null) {
            Serializer.c<StorySubscribersHeader> cVar3 = StorySubscribersHeader.CREATOR;
            String optString8 = optJSONObject15.optString("label");
            JSONArray optJSONArray3 = optJSONObject15.optJSONArray("user_ids");
            if (optJSONArray3 != null) {
                ArrayList arrayList6 = new ArrayList(optJSONArray3.length());
                int length3 = optJSONArray3.length();
                for (int i9 = 0; i9 < length3; i9++) {
                    arrayList6.add((map == null || (userProfile = map.get(new UserId(optJSONArray3.getLong(i9)))) == null) ? null : userProfile.l0());
                }
                list = j5g.V(arrayList6);
            } else {
                list = null;
            }
            this.r0 = new StorySubscribersHeader(optString8, list == null ? EmptyList.b : list);
        }
        this.s0 = jSONObject.optBoolean("is_profile_question");
        if (this.F && this.c == 0 && this.d.equals(UserId.d)) {
            ExternalAdsInfo.h.getClass();
            try {
                optJSONObject2 = jSONObject.optJSONObject("android_app");
                JSONObject optJSONObject16 = jSONObject.optJSONObject("link");
                JSONArray optJSONArray4 = jSONObject.optJSONArray("photo_icon");
                if (optJSONArray4 != null) {
                    i = 2;
                    r7 = 0;
                    r7 = 0;
                    try {
                        image = new com.vk.dto.common.Image(optJSONArray4, r7, i, r7);
                    } catch (Throwable th) {
                        th = th;
                        arrayList4 = r7;
                        obj = new Result.Failure(th);
                        arrayList5 = arrayList4;
                        this.m0 = (ExternalAdsInfo) (obj instanceof Result.Failure ? arrayList5 : obj);
                        arrayList = arrayList5;
                        this.z0 = jSONObject.optBoolean("is_music_cover", false);
                        this.A0 = jSONObject.optInt("first_narrative_id", 0);
                        this.M = jSONObject.optBoolean("is_gen_memories", false);
                        this.L = jSONObject.optBoolean("is_from_messenger", false);
                        if (this.F) {
                        }
                        optJSONObject = jSONObject.optJSONObject("research");
                        if (optJSONObject != null) {
                        }
                        this.F0 = storiesMediascopeResearchDto;
                    }
                } else {
                    i = 2;
                    r7 = 0;
                    image = null;
                }
                optString = jSONObject.optString("title");
                optString2 = optJSONObject16 != null ? optJSONObject16.optString("link_url_target") : r7;
            } catch (Throwable th2) {
                th = th2;
                i = 2;
                arrayList4 = null;
            }
            if (optString2 != null) {
                switch (optString2.hashCode()) {
                    case -1820761141:
                        optString2.equals(D1.e);
                        break;
                    case -1544407700:
                        if (optString2.equals("internal_hidden")) {
                            i3 = 1;
                            break;
                        }
                        break;
                    case 570410685:
                        if (optString2.equals("internal")) {
                            i3 = i;
                            break;
                        } else {
                            break;
                        }
                    case 1475610601:
                        if (optString2.equals("authorize")) {
                            i3 = 3;
                            break;
                        } else {
                            break;
                        }
                }
                String optString9 = optJSONObject2 == null ? optJSONObject2.optString("app_id") : r7;
                String optString10 = optJSONObject2 == null ? optJSONObject2.optString("open_url") : r7;
                ExternalAdsInfo.ScaleType.a aVar2 = ExternalAdsInfo.ScaleType.Companion;
                String optString11 = jSONObject.optString("content_scale_type");
                aVar2.getClass();
                ExternalAdsInfo.ScaleType[] values2 = ExternalAdsInfo.ScaleType.values();
                length = values2.length;
                i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        scaleType = values2[i4];
                        String name = scaleType.name();
                        Locale locale = Locale.ROOT;
                        if (!name.toLowerCase(locale).equals(optString11 != null ? optString11.toLowerCase(locale) : r7)) {
                            i4++;
                        }
                    } else {
                        scaleType = r7;
                    }
                }
                obj = new ExternalAdsInfo(image, optString, i3, optString9, optString10, scaleType == null ? ExternalAdsInfo.ScaleType.FILL : scaleType);
                arrayList5 = r7;
                this.m0 = (ExternalAdsInfo) (obj instanceof Result.Failure ? arrayList5 : obj);
                arrayList = arrayList5;
            }
            i3 = 0;
            if (optJSONObject2 == null) {
            }
            if (optJSONObject2 == null) {
            }
            ExternalAdsInfo.ScaleType.a aVar22 = ExternalAdsInfo.ScaleType.Companion;
            String optString112 = jSONObject.optString("content_scale_type");
            aVar22.getClass();
            ExternalAdsInfo.ScaleType[] values22 = ExternalAdsInfo.ScaleType.values();
            length = values22.length;
            i4 = 0;
            while (true) {
                if (i4 >= length) {
                }
                i4++;
            }
            obj = new ExternalAdsInfo(image, optString, i3, optString9, optString10, scaleType == null ? ExternalAdsInfo.ScaleType.FILL : scaleType);
            arrayList5 = r7;
            this.m0 = (ExternalAdsInfo) (obj instanceof Result.Failure ? arrayList5 : obj);
            arrayList = arrayList5;
        } else {
            i = 2;
            arrayList = null;
        }
        this.z0 = jSONObject.optBoolean("is_music_cover", false);
        this.A0 = jSONObject.optInt("first_narrative_id", 0);
        this.M = jSONObject.optBoolean("is_gen_memories", false);
        this.L = jSONObject.optBoolean("is_from_messenger", false);
        if (this.F) {
            String optString12 = jSONObject.optString("sdk_source");
            String optString13 = jSONObject.optString("template_id");
            optString13.getClass();
            switch (optString13.hashCode()) {
                case -1986603010:
                    if (optString13.equals("lead_form_video_sdk")) {
                        i2 = 0;
                        break;
                    }
                    i2 = -1;
                    break;
                case -1596981292:
                    if (optString13.equals("site_slider_sdk")) {
                        i2 = 1;
                        break;
                    }
                    i2 = -1;
                    break;
                case -1568751657:
                    if (optString13.equals("vk_miniapp_video_sdk")) {
                        i2 = i;
                        break;
                    }
                    i2 = -1;
                    break;
                case -1314596848:
                    if (optString13.equals("vk_user_sdk")) {
                        i2 = 3;
                        break;
                    }
                    i2 = -1;
                    break;
                case -924812792:
                    if (optString13.equals("survey_photo_sdk")) {
                        i2 = 4;
                        break;
                    }
                    i2 = -1;
                    break;
                case -823723846:
                    if (optString13.equals("app_slider_sdk")) {
                        i2 = 5;
                        break;
                    }
                    i2 = -1;
                    break;
                case -793613028:
                    if (optString13.equals("app_sdk")) {
                        i2 = 6;
                        break;
                    }
                    i2 = -1;
                    break;
                case -668644904:
                    if (optString13.equals("app_video_sdk")) {
                        i2 = 7;
                        break;
                    }
                    i2 = -1;
                    break;
                case 127422005:
                    if (optString13.equals("lead_form_photo_sdk")) {
                        i2 = 8;
                        break;
                    }
                    i2 = -1;
                    break;
                case 675532610:
                    if (optString13.equals("site_sdk")) {
                        i2 = 9;
                        break;
                    }
                    i2 = -1;
                    break;
                case 1256129489:
                    if (optString13.equals("survey_video_sdk")) {
                        i2 = 10;
                        break;
                    }
                    i2 = -1;
                    break;
                case 1625296475:
                    if (optString13.equals("vk_miniapp_sdk")) {
                        i2 = 11;
                        break;
                    }
                    i2 = -1;
                    break;
                case 2073079244:
                    if (optString13.equals("vk_user_video_sdk")) {
                        i2 = 12;
                        break;
                    }
                    i2 = -1;
                    break;
                case 2077357950:
                    if (optString13.equals("site_video_sdk")) {
                        i2 = 13;
                        break;
                    }
                    i2 = -1;
                    break;
                default:
                    i2 = -1;
                    break;
            }
            switch (i2) {
                case 0:
                    myTargetAdType = MyTargetAdType.LEAD_FORM_VIDEO;
                    r22 = myTargetAdType;
                    break;
                case 1:
                    myTargetAdType = MyTargetAdType.SITE_SLIDER;
                    r22 = myTargetAdType;
                    break;
                case 2:
                    myTargetAdType = MyTargetAdType.VK_MINIAPP_VIDEO;
                    r22 = myTargetAdType;
                    break;
                case 3:
                    myTargetAdType = MyTargetAdType.VK_USER;
                    r22 = myTargetAdType;
                    break;
                case 4:
                    myTargetAdType = MyTargetAdType.SURVEY_PHOTO;
                    r22 = myTargetAdType;
                    break;
                case 5:
                    myTargetAdType = MyTargetAdType.APP_SLIDER;
                    r22 = myTargetAdType;
                    break;
                case 6:
                    myTargetAdType = MyTargetAdType.APP;
                    r22 = myTargetAdType;
                    break;
                case 7:
                    myTargetAdType = MyTargetAdType.APP_VIDEO;
                    r22 = myTargetAdType;
                    break;
                case 8:
                    myTargetAdType = MyTargetAdType.LEAD_FORM_PHOTO;
                    r22 = myTargetAdType;
                    break;
                case 9:
                    myTargetAdType = MyTargetAdType.SITE;
                    r22 = myTargetAdType;
                    break;
                case 10:
                    myTargetAdType = MyTargetAdType.SURVEY_VIDEO;
                    r22 = myTargetAdType;
                    break;
                case 11:
                    myTargetAdType = MyTargetAdType.VK_MINIAPP;
                    r22 = myTargetAdType;
                    break;
                case 12:
                    myTargetAdType = MyTargetAdType.VK_USER_VIDEO;
                    r22 = myTargetAdType;
                    break;
                case 13:
                    myTargetAdType = MyTargetAdType.SITE_VIDEO;
                    r22 = myTargetAdType;
                    break;
                default:
                    r22 = arrayList;
                    break;
            }
            String optString14 = jSONObject.optString("format");
            optString14.getClass();
            switch (optString14.hashCode()) {
                case -892481938:
                    if (optString14.equals("static")) {
                        i = 0;
                        break;
                    }
                    i = -1;
                    break;
                case 3446944:
                    if (optString14.equals("post")) {
                        i = 1;
                        break;
                    }
                    i = -1;
                    break;
                case 99610090:
                    break;
                case 112202875:
                    if (optString14.equals("video")) {
                        i = 3;
                        break;
                    }
                    i = -1;
                    break;
                default:
                    i = -1;
                    break;
            }
            switch (i) {
                case 0:
                    myTargetAdFormat = MyTargetAdFormat.STATIC;
                    r23 = myTargetAdFormat;
                    break;
                case 1:
                    myTargetAdFormat = MyTargetAdFormat.POST;
                    r23 = myTargetAdFormat;
                    break;
                case 2:
                    myTargetAdFormat = MyTargetAdFormat.HTML5;
                    r23 = myTargetAdFormat;
                    break;
                case 3:
                    myTargetAdFormat = MyTargetAdFormat.VIDEO;
                    r23 = myTargetAdFormat;
                    break;
                default:
                    r23 = arrayList;
                    break;
            }
            String optString15 = jSONObject.optString("ad_data");
            if (!TextUtils.isEmpty(optString12)) {
                this.E0 = new MyTargetAdData(optString12, r22, r23, optString15, null);
            }
        }
        optJSONObject = jSONObject.optJSONObject("research");
        if (optJSONObject != null) {
            storiesMediascopeResearchDto = arrayList;
        } else {
            JSONArray optJSONArray5 = optJSONObject.optJSONArray("urls");
            if (optJSONArray5 != null) {
                arrayList2 = new ArrayList(optJSONArray5.length());
                for (int i10 = 0; i10 < optJSONArray5.length(); i10++) {
                    arrayList2.add(optJSONArray5.optString(i10));
                }
            } else {
                arrayList2 = arrayList;
            }
            JSONArray optJSONArray6 = optJSONObject.optJSONArray("events");
            if (optJSONArray6 != null) {
                arrayList3 = new ArrayList(optJSONArray6.length());
                for (int i11 = 0; i11 < optJSONArray6.length(); i11++) {
                    JSONObject optJSONObject17 = optJSONArray6.optJSONObject(i11);
                    if (optJSONObject17 != null) {
                        arrayList3.add(new StoriesMediascopeResearchEventDto(Integer.valueOf(optJSONObject17.optInt("source_id")), optJSONObject17.optString("item_id")));
                    }
                }
            } else {
                arrayList3 = arrayList;
            }
            storiesMediascopeResearchDto = new StoriesMediascopeResearchDto(arrayList2, arrayList3);
        }
        this.F0 = storiesMediascopeResearchDto;
    }

    public StoryEntry(Serializer serializer) {
        UserId userId = UserId.d;
        this.d = userId;
        this.C = true;
        this.P = userId;
        this.G0 = new hx6();
        this.b = serializer.p() != 0;
        this.c = serializer.u();
        this.d = (UserId) serializer.A(UserId.class.getClassLoader());
        this.e = serializer.H();
        this.f = serializer.w();
        this.g = serializer.x();
        this.h = serializer.p() != 0;
        this.k = serializer.p() != 0;
        this.l = serializer.H();
        this.j = serializer.u();
        this.m = (Photo) serializer.G(Photo.class.getClassLoader());
        this.n = (VideoFile) serializer.G(VideoFile.class.getClassLoader());
        this.x = (File) serializer.C();
        this.o = serializer.H();
        this.p = serializer.p() != 0;
        this.i0 = serializer.p() != 0;
        this.q = serializer.p() != 0;
        this.r = serializer.p() != 0;
        this.t = (PromoInfo) serializer.G(PromoInfo.class.getClassLoader());
        this.u = serializer.H();
        this.v = serializer.H();
        this.w = serializer.H();
        this.z = serializer.u();
        this.A = serializer.u();
        this.B = serializer.m();
        this.O = serializer.u();
        this.P = (UserId) serializer.A(UserId.class.getClassLoader());
        this.Q = serializer.H();
        this.E = serializer.m();
        this.C = serializer.m();
        this.D = serializer.m();
        this.F = serializer.m();
        this.T = serializer.H();
        this.S = serializer.H();
        this.R = (StoryEntryExtended) serializer.G(StoryEntryExtended.class.getClassLoader());
        this.X = (ClickableStickers) serializer.G(ClickableStickers.class.getClassLoader());
        this.U = (CatchUpBanner) serializer.G(CatchUpBanner.class.getClassLoader());
        this.N = serializer.m();
        this.Z = serializer.u();
        this.H = serializer.m();
        this.I = serializer.m();
        this.J = serializer.m();
        this.K = serializer.m();
        this.a0 = serializer.m();
        this.b0 = serializer.m();
        this.i = serializer.u();
        this.j0 = serializer.u();
        this.k0 = serializer.w();
        this.c0 = serializer.m();
        this.d0 = serializer.m();
        this.Y = serializer.u();
        this.G = serializer.m();
        this.l0 = (StoryOwner) serializer.G(StoryOwner.class.getClassLoader());
        this.n0 = serializer.u();
        this.o0 = serializer.m();
        this.p0 = serializer.I();
        this.q0 = serializer.u();
        this.r0 = (StorySubscribersHeader) serializer.G(StorySubscribersHeader.class.getClassLoader());
        this.s0 = serializer.m();
        this.e0 = serializer.u();
        this.m0 = (ExternalAdsInfo) serializer.G(ExternalAdsInfo.class.getClassLoader());
        this.t0 = serializer.H();
        this.u0 = serializer.H();
        this.v0 = serializer.m();
        this.s = serializer.I();
        this.w0 = serializer.m();
        this.x0 = serializer.I();
        this.y0 = serializer.m();
        this.B0 = serializer.I();
        this.z0 = serializer.m();
        this.A0 = serializer.u();
        this.M = serializer.m();
        this.E0 = (MyTargetAdData) serializer.A(MyTargetAdData.class.getClassLoader());
        this.C0 = (StoryMemoryType) serializer.A(StoryMemoryType.class.getClassLoader());
        this.D0 = serializer.I();
        this.F0 = (StoriesMediascopeResearchDto) serializer.A(StoriesMediascopeResearchDto.class.getClassLoader());
        this.L = serializer.m();
        this.g0 = serializer.v();
    }
}

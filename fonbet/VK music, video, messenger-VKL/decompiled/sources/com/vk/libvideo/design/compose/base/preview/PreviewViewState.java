package com.vk.libvideo.design.compose.base.preview;

import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.ContentBadgeAppearance;
import com.vk.core.compose.component.defaults.ContentBadgeMode;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.libvideo.design.compose.base.placeholder.PlaceholderViewState;
import com.vk.libvideo.design.compose.base.timeline.TimelineViewState;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.LazyThreadSafetyMode;
import xsna.asp;
import xsna.at;
import xsna.c8d;
import xsna.dai;
import xsna.epx;
import xsna.h13;
import xsna.ho8;
import xsna.kqu0;
import xsna.mno0;
import xsna.msy;
import xsna.oq;
import xsna.pco;
import xsna.q020;
import xsna.qoy;
import xsna.rmw;
import xsna.shy;
import xsna.vu5;
import xsna.w7d;
import xsna.xq;
import xsna.zoi;
import xsna.zrp;

/* compiled from: PreviewViewState.kt */
/* loaded from: classes2.dex */
public final class PreviewViewState {
    public final q020 a;
    public final e b;
    public final d c;
    public final z d;
    public final y e;
    public final p f;
    public final x g;
    public final c h;
    public final b i;
    public final float j;
    public final Object k;
    public final Object l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PreviewViewState.kt */
    public static final class Size {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        public static final Size Clip9x16;
        public static final Size PosterMedium2x3;
        public static final Size PosterSmall2x3;
        public static final Size VideoMedium16x9;
        public static final Size VideoSmall16x9;

        static {
            Size size = new Size("VideoMedium16x9", 0);
            VideoMedium16x9 = size;
            Size size2 = new Size("VideoSmall16x9", 1);
            VideoSmall16x9 = size2;
            Size size3 = new Size("PosterMedium2x3", 2);
            PosterMedium2x3 = size3;
            Size size4 = new Size("PosterSmall2x3", 3);
            PosterSmall2x3 = size4;
            Size size5 = new Size("Clip9x16", 4);
            Clip9x16 = size5;
            Size[] sizeArr = {size, size2, size3, size4, size5};
            $VALUES = sizeArr;
            $ENTRIES = new asp(sizeArr);
        }

        public Size() {
            throw null;
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) $VALUES.clone();
        }
    }

    /* compiled from: PreviewViewState.kt */
    public static final class a implements z {
        public final n a;
        public final n b;
        public final n c;

        /* compiled from: PreviewViewState.kt */
        /* renamed from: com.vk.libvideo.design.compose.base.preview.PreviewViewState$a$a, reason: collision with other inner class name */
        public static final class C1224a {
            public static n a(int i, mno0.g gVar) {
                return new n(new rmw.d(i), gVar, VkColorToken.OverlayPrimary, VkColorToken.IconContrast);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a() {
            this(r0, r0, 7);
            n nVar = null;
        }

        public final n a() {
            return this.c;
        }

        public final n b() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            n nVar = this.a;
            int hashCode = (nVar == null ? 0 : nVar.hashCode()) * 31;
            n nVar2 = this.b;
            int hashCode2 = (hashCode + (nVar2 == null ? 0 : nVar2.hashCode())) * 31;
            n nVar3 = this.c;
            return hashCode2 + (nVar3 != null ? nVar3.hashCode() : 0);
        }

        public final String toString() {
            return "Actions(watchLater=" + this.a + ", subtitles=" + this.b + ", mute=" + this.c + ')';
        }

        public /* synthetic */ a(n nVar, n nVar2, int i) {
            this((n) null, (i & 2) != 0 ? null : nVar, (i & 4) != 0 ? null : nVar2);
        }

        public a(n nVar, n nVar2, n nVar3) {
            this.a = nVar;
            this.b = nVar2;
            this.c = nVar3;
        }
    }

    /* compiled from: PreviewViewState.kt */
    public static final class a0 {
        public static final a0 a = new a0();

        public static PreviewViewState b(rmw rmwVar, boolean z, DurationBadge durationBadge, d dVar, k kVar, z zVar, p pVar, v vVar, u uVar, b bVar, VkColorToken vkColorToken, int i) {
            if ((i & 4) != 0) {
                durationBadge = null;
            }
            if ((i & 8) != 0) {
                dVar = null;
            }
            if ((i & 16) != 0) {
                kVar = null;
            }
            if ((i & 32) != 0) {
                zVar = null;
            }
            if ((i & 64) != 0) {
                pVar = null;
            }
            if ((i & 128) != 0) {
                vVar = null;
            }
            if ((i & 256) != 0) {
                uVar = null;
            }
            if ((i & 512) != 0) {
                bVar = null;
            }
            if ((i & 1024) != 0) {
                vkColorToken = VkColorToken.ImagePlaceholder;
            }
            return new PreviewViewState(c(a, rmwVar, z, vkColorToken, 8), durationBadge, dVar, zVar, kVar, pVar, vVar, uVar, bVar, 1.7777778f);
        }

        public static q020 c(a0 a0Var, rmw rmwVar, boolean z, VkColorToken vkColorToken, int i) {
            boolean z2 = (i & 4) == 0;
            boolean z3 = (i & 8) == 0;
            if ((i & 16) != 0) {
                vkColorToken = VkColorToken.ImagePlaceholder;
            }
            VkColorToken vkColorToken2 = vkColorToken;
            return new q020(rmwVar, z3 ? 20 : null, null, null, z ? new pco(kqu0.e) : null, vkColorToken2, z2, 284);
        }

        public static PreviewViewState e(rmw rmwVar, int i, Integer num, n nVar, int i2) {
            if ((i2 & 8) != 0) {
                num = null;
            }
            n nVar2 = (i2 & 16) != 0 ? null : nVar;
            q020 c = c(a, rmwVar, true, VkColorToken.ImagePlaceholder, 12);
            t tVar = new t(i, num);
            VideoFeatures videoFeatures = VideoFeatures.VIDEO_ALTERNATIVE_ALBUM_BADGE;
            videoFeatures.getClass();
            com.vk.toggle.b bVar = com.vk.toggle.b.A;
            return new PreviewViewState(c, bVar.a(videoFeatures) ? tVar : null, nVar2, null, null, !bVar.a(videoFeatures) ? new r(i) : null, 1.7777778f, 248);
        }

        public static PreviewViewState f(boolean z) {
            pco pcoVar = new pco(kqu0.e);
            if (!z) {
                pcoVar = null;
            }
            return new PreviewViewState(new q020(null, null, null, null, pcoVar, null, false, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE), null, null, null, null, null, 1.7777778f, 510);
        }

        public final PreviewViewState a(rmw rmwVar, boolean z, PlaceholderViewState placeholderViewState) {
            return new PreviewViewState(c(this, rmwVar, z, null, 20), null, null, null, null, new q(placeholderViewState), 1.7777778f, 254);
        }

        public final PreviewViewState d(boolean z, PlaceholderViewState placeholderViewState) {
            return new PreviewViewState(c(this, null, z, null, 28), null, null, null, null, new q(placeholderViewState), 1.7777778f, 254);
        }
    }

    /* compiled from: PreviewViewState.kt */
    public interface b {
    }

    /* compiled from: PreviewViewState.kt */
    public interface c {
    }

    /* compiled from: PreviewViewState.kt */
    public interface d {
    }

    /* compiled from: PreviewViewState.kt */
    public interface e {
    }

    /* compiled from: PreviewViewState.kt */
    public static final class f implements z {
        public final mno0 a;
        public final ButtonStyle b;
        public final rmw c;
        public final Object d;

        public f() {
            this(null, null, 7);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.a, fVar.a) && this.b == fVar.b && epx.f(this.c, fVar.c);
        }

        public final int hashCode() {
            mno0 mno0Var = this.a;
            int hashCode = (this.b.hashCode() + ((mno0Var == null ? 0 : mno0Var.hashCode()) * 31)) * 31;
            rmw rmwVar = this.c;
            return hashCode + (rmwVar != null ? rmwVar.hashCode() : 0);
        }

        public final String toString() {
            return "Button(text=" + this.a + ", style=" + this.b + ", icon=" + this.c + ')';
        }

        public f(mno0.i iVar, rmw.d dVar, int i) {
            iVar = (i & 1) != 0 ? null : iVar;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            dVar = (i & 4) != 0 ? null : dVar;
            this.a = iVar;
            this.b = buttonStyle;
            this.c = dVar;
            this.d = at.c(LazyThreadSafetyMode.NONE);
        }
    }

    /* compiled from: PreviewViewState.kt */
    public static final class g {
        public static PreviewViewState a(rmw.h hVar, PlaceholderViewState placeholderViewState) {
            return new PreviewViewState(new q020(hVar, 20, null, null, new pco(kqu0.e), null, false, 476), null, null, null, null, new q(placeholderViewState), 0.5625f, 254);
        }

        public static PreviewViewState b(rmw.h hVar, n nVar, b bVar, int i) {
            return new PreviewViewState(new q020(hVar, null, null, null, new pco(kqu0.e), null, true, 350), null, null, (i & 4) != 0 ? null : nVar, null, bVar, 0.5625f, 230);
        }

        public static PreviewViewState c(PlaceholderViewState placeholderViewState, rmw.h hVar, n nVar) {
            return new PreviewViewState(new q020(hVar, null, null, null, new pco(kqu0.e), null, false, 478), null, null, nVar, null, new q(placeholderViewState), 0.5625f, 246);
        }

        public static PreviewViewState d() {
            return new PreviewViewState(new q020(null, null, null, null, new pco(kqu0.e), null, false, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE), null, null, null, null, null, 0.5625f, 510);
        }
    }

    /* compiled from: PreviewViewState.kt */
    public static final class h implements b {
        public final c8d a;

        public h(c8d c8dVar) {
            this.a = c8dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.a, ((h) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ClipMeta(meta=" + this.a + ')';
        }
    }

    /* compiled from: PreviewViewState.kt */
    public static final class i implements b {
        public final w7d a;

        public i(w7d w7dVar) {
            this.a = w7dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.a, ((i) obj).a);
        }

        public final int hashCode() {
            return this.a.a.a.hashCode();
        }

        public final String toString() {
            return "ClipMetaCentered(meta=" + this.a + ')';
        }
    }

    /* compiled from: PreviewViewState.kt */
    public static final class j implements z, e, d {
        public final ContentBadgeMode a;
        public final ContentBadgeAppearance b;
        public final rmw c;
        public final VkColorToken d;
        public final mno0 e;
        public final mno0 f;

        public j(ContentBadgeMode contentBadgeMode, ContentBadgeAppearance contentBadgeAppearance, rmw.d dVar, VkColorToken vkColorToken, mno0 mno0Var, mno0 mno0Var2, int i) {
            dVar = (i & 4) != 0 ? null : dVar;
            vkColorToken = (i & 8) != 0 ? null : vkColorToken;
            mno0Var = (i & 16) != 0 ? null : mno0Var;
            mno0Var2 = (i & 32) != 0 ? null : mno0Var2;
            this.a = contentBadgeMode;
            this.b = contentBadgeAppearance;
            this.c = dVar;
            this.d = vkColorToken;
            this.e = mno0Var;
            this.f = mno0Var2;
        }

        public final mno0 a() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.a == jVar.a && epx.f(this.b, jVar.b) && epx.f(this.c, jVar.c) && this.d == jVar.d && epx.f(this.e, jVar.e) && epx.f(this.f, jVar.f);
        }

        public final int hashCode() {
            int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
            rmw rmwVar = this.c;
            int hashCode2 = (hashCode + (rmwVar == null ? 0 : rmwVar.hashCode())) * 31;
            VkColorToken vkColorToken = this.d;
            int hashCode3 = (hashCode2 + (vkColorToken == null ? 0 : vkColorToken.hashCode())) * 31;
            mno0 mno0Var = this.e;
            int hashCode4 = (hashCode3 + (mno0Var == null ? 0 : mno0Var.hashCode())) * 31;
            mno0 mno0Var2 = this.f;
            return hashCode4 + (mno0Var2 != null ? mno0Var2.hashCode() : 0);
        }

        public final String toString() {
            return "ContentBadge(mode=" + this.a + ", appearance=" + this.b + ", icon=" + this.c + ", iconTint=" + this.d + ", text=" + this.e + ", contentDescription=" + this.f + ')';
        }
    }

    /* compiled from: PreviewViewState.kt */
    public static final class k implements y {
        public final j a;
        public final j b;

        public k() {
            this((j) null, 3);
        }

        public final j a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return epx.f(this.a, kVar.a) && epx.f(this.b, kVar.b);
        }

        public final int hashCode() {
            j jVar = this.a;
            int hashCode = (jVar == null ? 0 : jVar.hashCode()) * 31;
            j jVar2 = this.b;
            return hashCode + (jVar2 != null ? jVar2.hashCode() : 0);
        }

        public final String toString() {
            return "ContentBadges(firstBadge=" + this.a + ", secondBadge=" + this.b + ')';
        }

        public /* synthetic */ k(j jVar, int i) {
            this((i & 1) != 0 ? null : jVar, (j) null);
        }

        public k(j jVar, j jVar2) {
            this.a = jVar;
            this.b = jVar2;
        }
    }

    /* compiled from: PreviewViewState.kt */
    public static final class l implements d {
        public final mno0 a;
        public final mno0.i b;
        public final Object c = at.c(LazyThreadSafetyMode.NONE);

        public l(mno0 mno0Var, mno0.i iVar) {
            this.a = mno0Var;
            this.b = iVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final dai.c a() {
            return (dai.c) this.c.getValue();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return this.a.equals(lVar.a) && this.b.equals(lVar.b);
        }

        public final int hashCode() {
            return this.b.a.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "DonutBadge(text=" + this.a + ", contentDescription=" + this.b + ')';
        }
    }

    /* compiled from: PreviewViewState.kt */
    public static final class m implements p {
        public static final a e = new a();
        public final n a;
        public final n b;
        public final n c;
        public final VkColorToken d;

        /* compiled from: PreviewViewState.kt */
        public static final class a {
            public final n a() {
                return new n(new rmw.d(R.drawable.vk_icon_replay_outline_28), null, VkColorToken.OverlayPrimary, VkColorToken.IconContrast);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public m() {
            this(null, 0 == true ? 1 : 0, 15);
        }

        public final n a() {
            return this.c;
        }

        public final n b() {
            return this.a;
        }

        public final n c() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return epx.f(this.a, mVar.a) && epx.f(this.b, mVar.b) && epx.f(this.c, mVar.c) && this.d == mVar.d;
        }

        public final int hashCode() {
            n nVar = this.a;
            int hashCode = (nVar == null ? 0 : nVar.hashCode()) * 31;
            n nVar2 = this.b;
            int hashCode2 = (hashCode + (nVar2 == null ? 0 : nVar2.hashCode())) * 31;
            n nVar3 = this.c;
            int hashCode3 = (hashCode2 + (nVar3 == null ? 0 : nVar3.hashCode())) * 31;
            VkColorToken vkColorToken = this.d;
            return hashCode3 + (vkColorToken != null ? vkColorToken.hashCode() : 0);
        }

        public final String toString() {
            return "EndVideo(replay=" + this.a + ", share=" + this.b + ", add=" + this.c + ", background=" + this.d + ')';
        }

        public /* synthetic */ m(n nVar, VkColorToken vkColorToken, int i) {
            this((i & 1) != 0 ? null : nVar, null, null, (i & 8) != 0 ? null : vkColorToken);
        }

        public m(n nVar, n nVar2, n nVar3, VkColorToken vkColorToken) {
            this.a = nVar;
            this.b = nVar2;
            this.c = nVar3;
            this.d = vkColorToken;
        }
    }

    /* compiled from: PreviewViewState.kt */
    public static final class n implements d, z, y, p {
        public final rmw.d a;
        public final mno0 b;
        public final VkColorToken c;
        public final VkColorToken d;
        public final Object e;

        public /* synthetic */ n(rmw.d dVar, mno0.g gVar, VkColorToken vkColorToken, VkColorToken vkColorToken2, int i) {
            this(dVar, (i & 2) != 0 ? null : gVar, (i & 4) != 0 ? null : vkColorToken, (i & 8) != 0 ? null : vkColorToken2);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final dai.c a() {
            return (dai.c) this.e.getValue();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return epx.f(this.a, nVar.a) && epx.f(this.b, nVar.b) && this.c == nVar.c && this.d == nVar.d;
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.a.a) * 31;
            mno0 mno0Var = this.b;
            int hashCode2 = (hashCode + (mno0Var == null ? 0 : mno0Var.hashCode())) * 31;
            VkColorToken vkColorToken = this.c;
            int hashCode3 = (hashCode2 + (vkColorToken == null ? 0 : vkColorToken.hashCode())) * 31;
            VkColorToken vkColorToken2 = this.d;
            return hashCode3 + (vkColorToken2 != null ? vkColorToken2.hashCode() : 0);
        }

        public final String toString() {
            return "Icon(icon=" + this.a + ", contentDescription=" + this.b + ", background=" + this.c + ", tint=" + this.d + ')';
        }

        public n(rmw.d dVar, mno0 mno0Var, VkColorToken vkColorToken, VkColorToken vkColorToken2) {
            this.a = dVar;
            this.b = mno0Var;
            this.c = vkColorToken;
            this.d = vkColorToken2;
            this.e = at.c(LazyThreadSafetyMode.NONE);
        }
    }

    /* compiled from: PreviewViewState.kt */
    public static final class o implements p {
        public static final o a = new o();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return -1815739947;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: PreviewViewState.kt */
    public interface p {
    }

    /* compiled from: PreviewViewState.kt */
    public static final class q implements b {
        public final PlaceholderViewState a;

        public q(PlaceholderViewState placeholderViewState) {
            this.a = placeholderViewState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && epx.f(this.a, ((q) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Placeholder(state=" + this.a + ')';
        }
    }

    /* compiled from: PreviewViewState.kt */
    public static final class r implements b {
        public final int a;

        public r(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && this.a == ((r) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("Playlist(count="), this.a, ')');
        }
    }

    /* compiled from: PreviewViewState.kt */
    public static final class s {
        public static final s a = new s();

        public static PreviewViewState b(rmw.h hVar, j jVar, k kVar, int i) {
            if ((i & 8) != 0) {
                kVar = null;
            }
            return new PreviewViewState(c(a, hVar, VkColorToken.ImagePlaceholder, 6), jVar, null, null, kVar, null, 0.6666667f, 384);
        }

        public static q020 c(s sVar, rmw rmwVar, VkColorToken vkColorToken, int i) {
            boolean z = (i & 4) == 0;
            if ((i & 8) != 0) {
                vkColorToken = VkColorToken.ImagePlaceholder;
            }
            return new q020(rmwVar, z ? 20 : null, null, null, new pco(kqu0.e), vkColorToken, false, 284);
        }

        public static PreviewViewState e() {
            return new PreviewViewState(new q020(null, null, null, null, new pco(kqu0.e), null, false, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE), null, null, null, null, null, 0.6666667f, 510);
        }

        public final PreviewViewState a(rmw.h hVar, PlaceholderViewState placeholderViewState) {
            return new PreviewViewState(c(this, hVar, null, 10), null, null, null, null, new q(placeholderViewState), 0.6666667f, 254);
        }

        public final PreviewViewState d(PlaceholderViewState placeholderViewState) {
            return new PreviewViewState(c(this, null, null, 14), null, null, null, null, new q(placeholderViewState), 0.6666667f, 254);
        }
    }

    /* compiled from: PreviewViewState.kt */
    public static final class t implements e {
        public final int a;
        public final Integer b;

        public t(int i, Integer num) {
            this.a = i;
            this.b = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof t)) {
                return false;
            }
            t tVar = (t) obj;
            tVar.getClass();
            return this.a == tVar.a && epx.f(this.b, tVar.b);
        }

        public final int hashCode() {
            int a = shy.a(this.a, Boolean.hashCode(true) * 31, 31);
            Integer num = this.b;
            return (a + (num == null ? 0 : num.hashCode())) * 31;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SeasonsBadge(isPlaylist=true, videosCount=");
            sb.append(this.a);
            sb.append(", seasonsCount=");
            return oq.b(sb, this.b, ", contentDescription=null)");
        }
    }

    /* compiled from: PreviewViewState.kt */
    public static final class u implements c {
        public final String a;

        public u(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && epx.f(this.a, ((u) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Subtitles(text="), this.a, ')');
        }
    }

    /* compiled from: PreviewViewState.kt */
    public static final class v implements x {
        public final mno0 a;
        public final Object b = at.c(LazyThreadSafetyMode.NONE);

        public v(mno0 mno0Var) {
            this.a = mno0Var;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final dai.c a() {
            return (dai.c) this.b.getValue();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && epx.f(this.a, ((v) obj).a);
        }

        public final int hashCode() {
            mno0 mno0Var = this.a;
            if (mno0Var == null) {
                return 0;
            }
            return mno0Var.hashCode();
        }

        public final String toString() {
            return "Text(text=" + this.a + ')';
        }
    }

    /* compiled from: PreviewViewState.kt */
    public static final class w implements b {
        public final TimelineViewState a;

        public w(TimelineViewState timelineViewState) {
            this.a = timelineViewState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && epx.f(this.a, ((w) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Timeline(timelineViewState=" + this.a + ')';
        }
    }

    /* compiled from: PreviewViewState.kt */
    public interface x {
    }

    /* compiled from: PreviewViewState.kt */
    public interface y {
    }

    /* compiled from: PreviewViewState.kt */
    public interface z {
    }

    public /* synthetic */ PreviewViewState(q020 q020Var, e eVar, d dVar, z zVar, y yVar, b bVar, float f2, int i2) {
        this(q020Var, (i2 & 2) != 0 ? null : eVar, (i2 & 4) != 0 ? null : dVar, (i2 & 8) != 0 ? null : zVar, (i2 & 16) != 0 ? null : yVar, null, null, null, (i2 & 256) != 0 ? null : bVar, f2);
    }

    public final PlaceholderViewState a() {
        b bVar = this.i;
        q qVar = bVar instanceof q ? (q) bVar : null;
        if (qVar != null) {
            return qVar.a;
        }
        return null;
    }

    public final TimelineViewState b() {
        b bVar = this.i;
        w wVar = bVar instanceof w ? (w) bVar : null;
        if (wVar != null) {
            return wVar.a;
        }
        return null;
    }

    public final l c() {
        d dVar = this.c;
        if (dVar instanceof l) {
            return (l) dVar;
        }
        return null;
    }

    public final n d() {
        d dVar = this.c;
        if (dVar instanceof n) {
            return (n) dVar;
        }
        return null;
    }

    public final q020 e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviewViewState)) {
            return false;
        }
        PreviewViewState previewViewState = (PreviewViewState) obj;
        return epx.f(this.a, previewViewState.a) && epx.f(this.b, previewViewState.b) && epx.f(this.c, previewViewState.c) && epx.f(this.d, previewViewState.d) && epx.f(this.e, previewViewState.e) && epx.f(this.f, previewViewState.f) && epx.f(this.g, previewViewState.g) && epx.f(this.h, previewViewState.h) && epx.f(this.i, previewViewState.i) && Float.compare(this.j, previewViewState.j) == 0;
    }

    public final p f() {
        return this.f;
    }

    public final m g() {
        p pVar = this.f;
        if (pVar instanceof m) {
            return (m) pVar;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final zoi<Size> h() {
        return (zoi) this.k.getValue();
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        e eVar = this.b;
        int hashCode2 = (hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        d dVar = this.c;
        int hashCode3 = (hashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        z zVar = this.d;
        int hashCode4 = (hashCode3 + (zVar == null ? 0 : zVar.hashCode())) * 31;
        y yVar = this.e;
        int hashCode5 = (hashCode4 + (yVar == null ? 0 : yVar.hashCode())) * 31;
        p pVar = this.f;
        int hashCode6 = (hashCode5 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        x xVar = this.g;
        int hashCode7 = (hashCode6 + (xVar == null ? 0 : xVar.hashCode())) * 31;
        c cVar = this.h;
        int hashCode8 = (hashCode7 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        b bVar = this.i;
        return Float.hashCode(this.j) + ((hashCode8 + (bVar != null ? bVar.hashCode() : 0)) * 31);
    }

    public final y i() {
        return this.e;
    }

    public final a j() {
        z zVar = this.d;
        if (zVar instanceof a) {
            return (a) zVar;
        }
        return null;
    }

    public final v k() {
        x xVar = this.g;
        if (xVar instanceof v) {
            return (v) xVar;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final zoi<Boolean> l() {
        return (zoi) this.l.getValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreviewViewState(media=");
        sb.append(this.a);
        sb.append(", bottomRight=");
        sb.append(this.b);
        sb.append(", bottomLeft=");
        sb.append(this.c);
        sb.append(", topRight=");
        sb.append(this.d);
        sb.append(", topLeft=");
        sb.append(this.e);
        sb.append(", middle=");
        sb.append(this.f);
        sb.append(", top=");
        sb.append(this.g);
        sb.append(", bottom=");
        sb.append(this.h);
        sb.append(", after=");
        sb.append(this.i);
        sb.append(", aspectRatio=");
        return xq.c(')', this.j, sb);
    }

    public PreviewViewState(q020 q020Var, e eVar, d dVar, z zVar, y yVar, p pVar, x xVar, c cVar, b bVar, float f2) {
        this.a = q020Var;
        this.b = eVar;
        this.c = dVar;
        this.d = zVar;
        this.e = yVar;
        this.f = pVar;
        this.g = xVar;
        this.h = cVar;
        this.i = bVar;
        this.j = f2;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        int i2 = 10;
        this.k = msy.a(lazyThreadSafetyMode, new h13(i2));
        this.l = msy.a(lazyThreadSafetyMode, new h13(i2));
    }

    /* compiled from: PreviewViewState.kt */
    public static final class DurationBadge implements e {
        public final mno0 a;
        public final boolean b;
        public final IconState c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: PreviewViewState.kt */
        public static final class IconState {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ IconState[] $VALUES;
            public static final IconState MusicNote;
            public static final IconState Play;
            public static final IconState Progress;

            static {
                IconState iconState = new IconState("Play", 0);
                Play = iconState;
                IconState iconState2 = new IconState("Progress", 1);
                Progress = iconState2;
                IconState iconState3 = new IconState("MusicNote", 2);
                MusicNote = iconState3;
                IconState[] iconStateArr = {iconState, iconState2, iconState3};
                $VALUES = iconStateArr;
                $ENTRIES = new asp(iconStateArr);
            }

            public IconState() {
                throw null;
            }

            public static IconState valueOf(String str) {
                return (IconState) Enum.valueOf(IconState.class, str);
            }

            public static IconState[] values() {
                return (IconState[]) $VALUES.clone();
            }
        }

        public DurationBadge(mno0 mno0Var, boolean z, IconState iconState) {
            this.a = mno0Var;
            this.b = z;
            this.c = iconState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DurationBadge)) {
                return false;
            }
            DurationBadge durationBadge = (DurationBadge) obj;
            return epx.f(this.a, durationBadge.a) && this.b == durationBadge.b && this.c == durationBadge.c;
        }

        public final int hashCode() {
            int b = qoy.b(this.a.hashCode() * 31, 31, this.b);
            IconState iconState = this.c;
            return b + (iconState == null ? 0 : iconState.hashCode());
        }

        public final String toString() {
            return "DurationBadge(text=" + this.a + ", isLive=" + this.b + ", iconState=" + this.c + ')';
        }

        public /* synthetic */ DurationBadge(mno0 mno0Var, boolean z, IconState iconState, int i) {
            this(mno0Var, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : iconState);
        }
    }
}

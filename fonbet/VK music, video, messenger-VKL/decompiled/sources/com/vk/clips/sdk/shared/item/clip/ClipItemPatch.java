package com.vk.clips.sdk.shared.item.clip;

import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.item.clip.state.OwnerRightState;
import defpackage.q0;
import java.util.List;
import one.video.player.model.text.SubtitleRenderItem;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.br;
import xsna.cut0;
import xsna.epx;
import xsna.ho8;
import xsna.ioa0;
import xsna.ixp0;
import xsna.j4b0;
import xsna.kih0;
import xsna.m0d;
import xsna.ms9;
import xsna.n0x;
import xsna.nlh0;
import xsna.qoy;
import xsna.qzb0;
import xsna.shy;
import xsna.t16;
import xsna.uu;
import xsna.vu5;
import xsna.wp50;
import xsna.xl50;
import xsna.y0r;
import xsna.zrp;

/* compiled from: ClipItemPatch.kt */
/* loaded from: classes17.dex */
public interface ClipItemPatch extends xl50 {

    /* compiled from: ClipItemPatch.kt */
    public interface ActionButton extends ClipItemPatch {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ClipItemPatch.kt */
        public static final class Show implements ActionButton {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Show[] $VALUES;
            public static final Show ACTIVE;
            public static final Show INACTIVE;

            static {
                Show show = new Show(SignalingProtocol.STATE_ACTIVE, 0);
                ACTIVE = show;
                Show show2 = new Show("INACTIVE", 1);
                INACTIVE = show2;
                Show[] showArr = {show, show2};
                $VALUES = showArr;
                $ENTRIES = new asp(showArr);
            }

            public Show() {
                throw null;
            }

            public static Show valueOf(String str) {
                return (Show) Enum.valueOf(Show.class, str);
            }

            public static Show[] values() {
                return (Show[]) $VALUES.clone();
            }
        }

        /* compiled from: ClipItemPatch.kt */
        public static final class a implements ActionButton {
            public final cut0 b;
            public final cut0 c;

            public a(cut0 cut0Var, cut0 cut0Var2) {
                this.b = cut0Var;
                this.c = cut0Var2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                return "ColorsLoaded(activeBackgroundColor=" + this.b + ", activeTextColor=" + this.c + ')';
            }
        }

        /* compiled from: ClipItemPatch.kt */
        public static final class b implements ActionButton {
            public final uu.a b;

            public b(uu.a aVar) {
                this.b = aVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.b.equals(((b) obj).b);
            }

            public final int hashCode() {
                return this.b.a.hashCode();
            }

            public final String toString() {
                return "IconLoaded(icon=" + this.b + ')';
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipItemPatch.kt */
    public static final class UpdateItemViewFocused implements ClipItemPatch {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ UpdateItemViewFocused[] $VALUES;
        public static final UpdateItemViewFocused FOCUSED;
        public static final UpdateItemViewFocused UNFOCUSED;

        static {
            UpdateItemViewFocused updateItemViewFocused = new UpdateItemViewFocused("FOCUSED", 0);
            FOCUSED = updateItemViewFocused;
            UpdateItemViewFocused updateItemViewFocused2 = new UpdateItemViewFocused("UNFOCUSED", 1);
            UNFOCUSED = updateItemViewFocused2;
            UpdateItemViewFocused[] updateItemViewFocusedArr = {updateItemViewFocused, updateItemViewFocused2};
            $VALUES = updateItemViewFocusedArr;
            $ENTRIES = new asp(updateItemViewFocusedArr);
        }

        public UpdateItemViewFocused() {
            throw null;
        }

        public static UpdateItemViewFocused valueOf(String str) {
            return (UpdateItemViewFocused) Enum.valueOf(UpdateItemViewFocused.class, str);
        }

        public static UpdateItemViewFocused[] values() {
            return (UpdateItemViewFocused[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipItemPatch.kt */
    public static final class UpdateSnapFocused implements ClipItemPatch {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ UpdateSnapFocused[] $VALUES;
        public static final UpdateSnapFocused FOCUSED;
        public static final UpdateSnapFocused UNFOCUSED;

        static {
            UpdateSnapFocused updateSnapFocused = new UpdateSnapFocused("FOCUSED", 0);
            FOCUSED = updateSnapFocused;
            UpdateSnapFocused updateSnapFocused2 = new UpdateSnapFocused("UNFOCUSED", 1);
            UNFOCUSED = updateSnapFocused2;
            UpdateSnapFocused[] updateSnapFocusedArr = {updateSnapFocused, updateSnapFocused2};
            $VALUES = updateSnapFocusedArr;
            $ENTRIES = new asp(updateSnapFocusedArr);
        }

        public UpdateSnapFocused() {
            throw null;
        }

        public static UpdateSnapFocused valueOf(String str) {
            return (UpdateSnapFocused) Enum.valueOf(UpdateSnapFocused.class, str);
        }

        public static UpdateSnapFocused[] values() {
            return (UpdateSnapFocused[]) $VALUES.clone();
        }
    }

    /* compiled from: ClipItemPatch.kt */
    public interface a extends ClipItemPatch {

        /* compiled from: ClipItemPatch.kt */
        /* renamed from: com.vk.clips.sdk.shared.item.clip.ClipItemPatch$a$a, reason: collision with other inner class name */
        public static final class C0658a implements a {
            public final String b;

            public C0658a(String str) {
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0658a) && epx.f(this.b, ((C0658a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("CommentShowed(videoId="), this.b, ')');
            }
        }

        /* compiled from: ClipItemPatch.kt */
        public static final class b implements a {
            public final String b;

            public b(String str) {
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("LikesShowed(videoId="), this.b, ')');
            }
        }
    }

    /* compiled from: ClipItemPatch.kt */
    public interface b extends ClipItemPatch {

        /* compiled from: ClipItemPatch.kt */
        public interface a extends b {

            /* compiled from: ClipItemPatch.kt */
            /* renamed from: com.vk.clips.sdk.shared.item.clip.ClipItemPatch$b$a$a, reason: collision with other inner class name */
            public static final class C0659a implements a {
                public final m0d b;
                public final nlh0 c;
                public final kih0 d;
                public final y0r e;
                public final int f;
                public final boolean g;
                public final j4b0 h;
                public final boolean i;
                public final boolean j;
                public final uu k;
                public final boolean l;
                public final ixp0 m;
                public final OwnerRightState n;
                public final n0x o;
                public final qzb0 p;
                public final t16 q;
                public final wp50 r;
                public final boolean s;

                public C0659a(m0d m0dVar, nlh0 nlh0Var, kih0 kih0Var, y0r y0rVar, int i, boolean z, j4b0 j4b0Var, boolean z2, boolean z3, uu uuVar, boolean z4, ixp0 ixp0Var, OwnerRightState ownerRightState, n0x n0xVar, qzb0 qzb0Var, t16 t16Var, wp50 wp50Var, boolean z5) {
                    this.b = m0dVar;
                    this.c = nlh0Var;
                    this.d = kih0Var;
                    this.e = y0rVar;
                    this.f = i;
                    this.g = z;
                    this.h = j4b0Var;
                    this.i = z2;
                    this.j = z3;
                    this.k = uuVar;
                    this.l = z4;
                    this.m = ixp0Var;
                    this.n = ownerRightState;
                    this.o = n0xVar;
                    this.p = qzb0Var;
                    this.q = t16Var;
                    this.r = wp50Var;
                    this.s = z5;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0659a)) {
                        return false;
                    }
                    C0659a c0659a = (C0659a) obj;
                    return epx.f(this.b, c0659a.b) && epx.f(this.c, c0659a.c) && epx.f(this.d, c0659a.d) && epx.f(this.e, c0659a.e) && this.f == c0659a.f && this.g == c0659a.g && epx.f(this.h, c0659a.h) && this.i == c0659a.i && this.j == c0659a.j && epx.f(this.k, c0659a.k) && this.l == c0659a.l && epx.f(this.m, c0659a.m) && this.n == c0659a.n && epx.f(this.o, c0659a.o) && epx.f(this.p, c0659a.p) && epx.f(this.q, c0659a.q) && epx.f(this.r, c0659a.r) && this.s == c0659a.s;
                }

                public final int hashCode() {
                    int hashCode = (this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31;
                    y0r y0rVar = this.e;
                    int b = qoy.b(qoy.b((this.h.hashCode() + qoy.b(shy.a(this.f, (hashCode + (y0rVar == null ? 0 : y0rVar.hashCode())) * 31, 31), 31, this.g)) * 31, 31, this.i), 31, this.j);
                    uu uuVar = this.k;
                    int hashCode2 = (this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + qoy.b((b + (uuVar == null ? 0 : uuVar.hashCode())) * 31, 31, this.l)) * 31)) * 31)) * 31)) * 31)) * 31;
                    wp50 wp50Var = this.r;
                    return Boolean.hashCode(this.s) + ((hashCode2 + (wp50Var != null ? wp50Var.hashCode() : 0)) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Full(clipState=");
                    sb.append(this.b);
                    sb.append(", videoFileController=");
                    sb.append(this.c);
                    sb.append(", autoPlay=");
                    sb.append(this.d);
                    sb.append(", cacheInfo=");
                    sb.append(this.e);
                    sb.append(", adapterPosition=");
                    sb.append(this.f);
                    sb.append(", muteInClipFeed=");
                    sb.append(this.g);
                    sb.append(", playerState=");
                    sb.append(this.h);
                    sb.append(", actionButtonWasShown=");
                    sb.append(this.i);
                    sb.append(", actionButtonWasActive=");
                    sb.append(this.j);
                    sb.append(", actionButtonIcon=");
                    sb.append(this.k);
                    sb.append(", clipRestricted=");
                    sb.append(this.l);
                    sb.append(", uiVisibilityConfig=");
                    sb.append(this.m);
                    sb.append(", ownerRightState=");
                    sb.append(this.n);
                    sb.append(", inlineNpsState=");
                    sb.append(this.o);
                    sb.append(", positionPointsState=");
                    sb.append(this.p);
                    sb.append(", bannerCompanionState=");
                    sb.append(this.q);
                    sb.append(", myTargetFacade=");
                    sb.append(this.r);
                    sb.append(", itemFocused=");
                    return q0.a(sb, this.s, ')');
                }
            }

            /* compiled from: ClipItemPatch.kt */
            /* renamed from: com.vk.clips.sdk.shared.item.clip.ClipItemPatch$b$a$b, reason: collision with other inner class name */
            public static final class C0660b implements a {
                public final m0d b;

                public C0660b(m0d m0dVar) {
                    this.b = m0dVar;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C0660b) && epx.f(this.b, ((C0660b) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return "Payload(clipState=" + this.b + ')';
                }
            }
        }

        /* compiled from: ClipItemPatch.kt */
        /* renamed from: com.vk.clips.sdk.shared.item.clip.ClipItemPatch$b$b, reason: collision with other inner class name */
        public static final class C0661b implements b {
            public static final C0661b b = new C0661b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0661b);
            }

            public final int hashCode() {
                return -536094007;
            }

            public final String toString() {
                return "Unbind";
            }
        }
    }

    /* compiled from: ClipItemPatch.kt */
    public interface c extends ClipItemPatch {

        /* compiled from: ClipItemPatch.kt */
        public static final class a implements c {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 2134153929;
            }

            public final String toString() {
                return "Collapse";
            }
        }

        /* compiled from: ClipItemPatch.kt */
        public static final class b implements c {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1728746314;
            }

            public final String toString() {
                return "Expand";
            }
        }
    }

    /* compiled from: ClipItemPatch.kt */
    public interface d extends ClipItemPatch {

        /* compiled from: ClipItemPatch.kt */
        public static final class a implements d {
            public final boolean b;

            public a(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.b == ((a) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return q0.a(new StringBuilder("UpdateShowLoading(showLoading="), this.b, ')');
            }
        }

        /* compiled from: ClipItemPatch.kt */
        public static final class b implements d {
            public final SdkVideoFile b;

            public b(SdkVideoFile sdkVideoFile) {
                this.b = sdkVideoFile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "UpdateVideo(video=" + this.b + ')';
            }
        }
    }

    /* compiled from: ClipItemPatch.kt */
    public static final class e implements ClipItemPatch {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 90971578;
        }

        public final String toString() {
            return "Initial";
        }
    }

    /* compiled from: ClipItemPatch.kt */
    public static final class f implements ClipItemPatch {
        public final boolean b;
        public final boolean c;

        public f(boolean z, boolean z2) {
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.b == fVar.b && this.c == fVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsFeedMarketItemsState(itemsIsVisible=");
            sb.append(this.b);
            sb.append(", itemsWasShown=");
            return q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: ClipItemPatch.kt */
    public static final class g implements ClipItemPatch {
        public final ioa0 b;

        public g(ioa0 ioa0Var) {
            this.b = ioa0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "PinnedChangeSpinnerPatch(newSpinnerState=" + this.b + ')';
        }
    }

    /* compiled from: ClipItemPatch.kt */
    public static final class h implements ClipItemPatch {
        public final boolean b;

        public h(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.b == ((h) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("PinnedStatePatch(isPinned="), this.b, ')');
        }
    }

    /* compiled from: ClipItemPatch.kt */
    public static final class i implements ClipItemPatch {
        public final boolean b;
        public final boolean c;
        public final boolean d;

        public i(boolean z, boolean z2, boolean z3) {
            this.b = z;
            this.c = z2;
            this.d = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.b == iVar.b && this.c == iVar.c && this.d == iVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TrendEngagementGrowthState(isTrendHashtagBadgeAnimationAvailable=");
            sb.append(this.b);
            sb.append(", isTrendMusicBadgeAnimationAvailable=");
            sb.append(this.c);
            sb.append(", isTrendButtonVisibilityAvailable=");
            return q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: ClipItemPatch.kt */
    public static final class j implements ClipItemPatch {
        public final t16 b;

        public j(t16 t16Var) {
            this.b = t16Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && epx.f(this.b, ((j) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpdateBannerCompanionState(bannerCompanionState=" + this.b + ')';
        }
    }

    /* compiled from: ClipItemPatch.kt */
    public static final class k implements ClipItemPatch {
        public final n0x b;

        public k(n0x n0xVar) {
            this.b = n0xVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && epx.f(this.b, ((k) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpdateInlineNpsState(inlineNpsState=" + this.b + ')';
        }
    }

    /* compiled from: ClipItemPatch.kt */
    public static final class l implements ClipItemPatch {
        public final boolean b;

        public l(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.b == ((l) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("UpdateMuteInClipFeed(muteInClipFeed="), this.b, ')');
        }
    }

    /* compiled from: ClipItemPatch.kt */
    public static final class m implements ClipItemPatch {
        public static final m b = new m();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return 1480686086;
        }

        public final String toString() {
            return "UpdateNewsMonothemeBadgeHasBeenAnimated";
        }
    }

    /* compiled from: ClipItemPatch.kt */
    public static final class n implements ClipItemPatch {
        public final boolean b;

        public n(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.b == ((n) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("UpdateProductsVisibility(visible="), this.b, ')');
        }
    }

    /* compiled from: ClipItemPatch.kt */
    public static final class o implements ClipItemPatch {
        public final boolean b;

        public o(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.b == ((o) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("UpdateSeekState(seeking="), this.b, ')');
        }
    }

    /* compiled from: ClipItemPatch.kt */
    public static final class p implements ClipItemPatch {
        public static final p b = new p();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof p);
        }

        public final int hashCode() {
            return -717812475;
        }

        public final String toString() {
            return "UpdateShopsMoreBadgeHasBeenAnimated";
        }
    }

    /* compiled from: ClipItemPatch.kt */
    public static final class q implements ClipItemPatch {
        public final boolean b;

        public q(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && this.b == ((q) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("UpdateSubscribeButtonHighlight(highlight="), this.b, ')');
        }
    }

    /* compiled from: ClipItemPatch.kt */
    public static final class r implements ClipItemPatch {
        public final boolean b;

        public r(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && this.b == ((r) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("UpdateTemplateBadgeHighlight(highlight="), this.b, ')');
        }
    }

    /* compiled from: ClipItemPatch.kt */
    public static final class s implements ClipItemPatch {
        public final ixp0 b;

        public s(ixp0 ixp0Var) {
            this.b = ixp0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && epx.f(this.b, ((s) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpdateUIVisibilityConfig(config=" + this.b + ')';
        }
    }

    /* compiled from: ClipItemPatch.kt */
    public interface t extends ClipItemPatch {

        /* compiled from: ClipItemPatch.kt */
        public static final class a implements t {
            public final j4b0 b;

            public a(j4b0 j4b0Var) {
                this.b = j4b0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return br.c(new StringBuilder("OnEndOfBuffer(playerState="), this.b, ')');
            }
        }

        /* compiled from: ClipItemPatch.kt */
        public static final class b implements t {
            public final j4b0 b;
            public final int c;

            public b(j4b0 j4b0Var, int i) {
                this.b = j4b0Var;
                this.c = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.b.equals(bVar.b) && this.c == bVar.c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OnError(playerState=");
                sb.append(this.b);
                sb.append(", errorTitleRes=");
                return vu5.b(sb, this.c, ')');
            }
        }

        /* compiled from: ClipItemPatch.kt */
        public static final class c implements t {
            public final j4b0 b;

            public c(j4b0 j4b0Var) {
                this.b = j4b0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return br.c(new StringBuilder("OnFirstFrameRendered(playerState="), this.b, ')');
            }
        }

        /* compiled from: ClipItemPatch.kt */
        public static final class d implements t {
            public final j4b0 b;

            public d(j4b0 j4b0Var) {
                this.b = j4b0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return br.c(new StringBuilder("OnLoading(playerState="), this.b, ')');
            }
        }

        /* compiled from: ClipItemPatch.kt */
        public static final class e implements t {
            public final j4b0 b;

            public e(j4b0 j4b0Var) {
                this.b = j4b0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return br.c(new StringBuilder("OnPause(playerState="), this.b, ')');
            }
        }

        /* compiled from: ClipItemPatch.kt */
        public static final class f implements t {
            public final j4b0 b;

            public f(j4b0 j4b0Var) {
                this.b = j4b0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return br.c(new StringBuilder("OnPlay(playerState="), this.b, ')');
            }
        }

        /* compiled from: ClipItemPatch.kt */
        public static final class g implements t {
            public final boolean b;
            public final boolean c;
            public final qzb0 d;
            public final boolean e;
            public final boolean f;
            public final boolean g;
            public final boolean h;
            public final boolean i;

            public g(boolean z, boolean z2, qzb0 qzb0Var, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
                this.b = z;
                this.c = z2;
                this.d = qzb0Var;
                this.e = z3;
                this.f = z4;
                this.g = z5;
                this.h = z6;
                this.i = z7;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return this.b == gVar.b && this.c == gVar.c && epx.f(this.d, gVar.d) && this.e == gVar.e && this.f == gVar.f && this.g == gVar.g && this.h == gVar.h && this.i == gVar.i;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.i) + qoy.b(qoy.b(qoy.b(qoy.b((this.d.hashCode() + qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OnPositionUpdate(actionButtonWasShown=");
                sb.append(this.b);
                sb.append(", actionButtonWasActive=");
                sb.append(this.c);
                sb.append(", positionPointsState=");
                sb.append(this.d);
                sb.append(", productsWasShown=");
                sb.append(this.e);
                sb.append(", bannerCompanionLoadDataReached=");
                sb.append(this.f);
                sb.append(", bannerCompanionShowReached=");
                sb.append(this.g);
                sb.append(", shopsMoreWasShown=");
                sb.append(this.h);
                sb.append(", shopsMorePreloadWasTriggered=");
                return q0.a(sb, this.i, ')');
            }
        }

        /* compiled from: ClipItemPatch.kt */
        public static final class h implements t {
            public final j4b0 b;

            public h(j4b0 j4b0Var) {
                this.b = j4b0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && epx.f(this.b, ((h) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return br.c(new StringBuilder("OnReady(playerState="), this.b, ')');
            }
        }

        /* compiled from: ClipItemPatch.kt */
        public static final class i implements t {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof i)) {
                    return false;
                }
                ((i) obj).getClass();
                return true;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "OnResume(playerState=null)";
            }
        }

        /* compiled from: ClipItemPatch.kt */
        public static final class j implements t {
            public final List<SubtitleRenderItem> b;

            /* JADX WARN: Multi-variable type inference failed */
            public j(List<? extends SubtitleRenderItem> list) {
                this.b = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof j) && epx.f(this.b, ((j) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("OnSubtitleRenderItemsReceived(renderItems="), this.b);
            }
        }

        /* compiled from: ClipItemPatch.kt */
        public static final class k implements t {
            public final boolean b;

            public k(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof k) && this.b == ((k) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return q0.a(new StringBuilder("OnVolumeChanged(muteInClipFeed="), this.b, ')');
            }
        }
    }
}

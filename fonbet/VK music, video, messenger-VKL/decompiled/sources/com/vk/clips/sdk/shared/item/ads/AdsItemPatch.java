package com.vk.clips.sdk.shared.item.ads;

import defpackage.q0;
import xsna.asp;
import xsna.br;
import xsna.cut0;
import xsna.epx;
import xsna.hw0;
import xsna.iq;
import xsna.ixp0;
import xsna.j4b0;
import xsna.kih0;
import xsna.nlh0;
import xsna.qoy;
import xsna.uu;
import xsna.vu5;
import xsna.wp50;
import xsna.xl50;
import xsna.zrp;

/* compiled from: AdsItemPatch.kt */
/* loaded from: classes17.dex */
public interface AdsItemPatch extends xl50 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdsItemPatch.kt */
    public static final class UpdateItemViewFocused implements AdsItemPatch {
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
    /* compiled from: AdsItemPatch.kt */
    public static final class UpdateVideoFocused implements AdsItemPatch {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ UpdateVideoFocused[] $VALUES;
        public static final UpdateVideoFocused FOCUSED;
        public static final UpdateVideoFocused UNFOCUSED;

        static {
            UpdateVideoFocused updateVideoFocused = new UpdateVideoFocused("FOCUSED", 0);
            FOCUSED = updateVideoFocused;
            UpdateVideoFocused updateVideoFocused2 = new UpdateVideoFocused("UNFOCUSED", 1);
            UNFOCUSED = updateVideoFocused2;
            UpdateVideoFocused[] updateVideoFocusedArr = {updateVideoFocused, updateVideoFocused2};
            $VALUES = updateVideoFocusedArr;
            $ENTRIES = new asp(updateVideoFocusedArr);
        }

        public UpdateVideoFocused() {
            throw null;
        }

        public static UpdateVideoFocused valueOf(String str) {
            return (UpdateVideoFocused) Enum.valueOf(UpdateVideoFocused.class, str);
        }

        public static UpdateVideoFocused[] values() {
            return (UpdateVideoFocused[]) $VALUES.clone();
        }
    }

    /* compiled from: AdsItemPatch.kt */
    public interface a extends AdsItemPatch {

        /* compiled from: AdsItemPatch.kt */
        /* renamed from: com.vk.clips.sdk.shared.item.ads.AdsItemPatch$a$a, reason: collision with other inner class name */
        public static final class C0646a implements a {
            public final cut0 b;
            public final cut0 c;

            public C0646a(cut0 cut0Var, cut0 cut0Var2) {
                this.b = cut0Var;
                this.c = cut0Var2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0646a)) {
                    return false;
                }
                C0646a c0646a = (C0646a) obj;
                return epx.f(this.b, c0646a.b) && epx.f(this.c, c0646a.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                return "ColorsLoaded(activeBackgroundColor=" + this.b + ", activeTextColor=" + this.c + ')';
            }
        }

        /* compiled from: AdsItemPatch.kt */
        public static final class b implements a {
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

    /* compiled from: AdsItemPatch.kt */
    public interface b extends AdsItemPatch {

        /* compiled from: AdsItemPatch.kt */
        public interface a extends b {

            /* compiled from: AdsItemPatch.kt */
            /* renamed from: com.vk.clips.sdk.shared.item.ads.AdsItemPatch$b$a$a, reason: collision with other inner class name */
            public static final class C0647a implements a {
                public final hw0 b;
                public final nlh0 c;
                public final kih0 d;
                public final j4b0 e;
                public final ixp0 f;
                public final boolean g;
                public final boolean h;
                public final boolean i;
                public final wp50 j;

                public C0647a(hw0 hw0Var, nlh0 nlh0Var, kih0 kih0Var, j4b0 j4b0Var, ixp0 ixp0Var, boolean z, boolean z2, boolean z3, wp50 wp50Var) {
                    this.b = hw0Var;
                    this.c = nlh0Var;
                    this.d = kih0Var;
                    this.e = j4b0Var;
                    this.f = ixp0Var;
                    this.g = z;
                    this.h = z2;
                    this.i = z3;
                    this.j = wp50Var;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0647a)) {
                        return false;
                    }
                    C0647a c0647a = (C0647a) obj;
                    return epx.f(this.b, c0647a.b) && epx.f(this.c, c0647a.c) && epx.f(this.d, c0647a.d) && epx.f(this.e, c0647a.e) && epx.f(this.f, c0647a.f) && this.g == c0647a.g && this.h == c0647a.h && this.i == c0647a.i && epx.f(this.j, c0647a.j);
                }

                public final int hashCode() {
                    int b = qoy.b(qoy.b(qoy.b((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31, this.g), 31, this.h), 31, this.i);
                    wp50 wp50Var = this.j;
                    return b + (wp50Var == null ? 0 : wp50Var.hashCode());
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Full(clipState=");
                    sb.append(this.b);
                    sb.append(", videoFileController=");
                    sb.append(this.c);
                    sb.append(", autoPlay=");
                    sb.append(this.d);
                    sb.append(", playerState=");
                    sb.append(this.e);
                    sb.append(", uiVisibilityConfig=");
                    sb.append(this.f);
                    sb.append(", actionButtonWasShown=");
                    sb.append(this.g);
                    sb.append(", actionButtonWasActive=");
                    sb.append(this.h);
                    sb.append(", muteInClipFeed=");
                    sb.append(this.i);
                    sb.append(", myTargetFacade=");
                    return iq.c(sb, this.j, ')');
                }
            }

            /* compiled from: AdsItemPatch.kt */
            /* renamed from: com.vk.clips.sdk.shared.item.ads.AdsItemPatch$b$a$b, reason: collision with other inner class name */
            public static final class C0648b implements a {
                public final hw0 b;

                public C0648b(hw0 hw0Var) {
                    this.b = hw0Var;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C0648b) && epx.f(this.b, ((C0648b) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return "Payload(clipState=" + this.b + ')';
                }
            }
        }

        /* compiled from: AdsItemPatch.kt */
        /* renamed from: com.vk.clips.sdk.shared.item.ads.AdsItemPatch$b$b, reason: collision with other inner class name */
        public static final class C0649b implements b {
            public static final C0649b b = new C0649b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0649b);
            }

            public final int hashCode() {
                return -276871539;
            }

            public final String toString() {
                return "Unbind";
            }
        }
    }

    /* compiled from: AdsItemPatch.kt */
    public interface c extends AdsItemPatch {

        /* compiled from: AdsItemPatch.kt */
        public static final class a implements c {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1485757555;
            }

            public final String toString() {
                return "Collapse";
            }
        }

        /* compiled from: AdsItemPatch.kt */
        public static final class b implements c {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1517988230;
            }

            public final String toString() {
                return "Expand";
            }
        }
    }

    /* compiled from: AdsItemPatch.kt */
    public static final class d implements AdsItemPatch {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1730979446;
        }

        public final String toString() {
            return "Initial";
        }
    }

    /* compiled from: AdsItemPatch.kt */
    public static final class e implements AdsItemPatch {
        public final ixp0 b;

        public e(ixp0 ixp0Var) {
            this.b = ixp0Var;
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
            return "UpdateUIVisibilityConfig(config=" + this.b + ')';
        }
    }

    /* compiled from: AdsItemPatch.kt */
    public interface f extends AdsItemPatch {

        /* compiled from: AdsItemPatch.kt */
        public static final class a implements f {
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
                return br.c(new StringBuilder("OnComplete(playerState="), this.b, ')');
            }
        }

        /* compiled from: AdsItemPatch.kt */
        public static final class b implements f {
            public final j4b0 b;

            public b(j4b0 j4b0Var) {
                this.b = j4b0Var;
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
                return br.c(new StringBuilder("OnEndOfBuffer(playerState="), this.b, ')');
            }
        }

        /* compiled from: AdsItemPatch.kt */
        public static final class c implements f {
            public final j4b0 b;
            public final int c;

            public c(j4b0 j4b0Var, int i) {
                this.b = j4b0Var;
                this.c = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.b.equals(cVar.b) && this.c == cVar.c;
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

        /* compiled from: AdsItemPatch.kt */
        public static final class d implements f {
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
                return br.c(new StringBuilder("OnFirstFrameRendered(playerState="), this.b, ')');
            }
        }

        /* compiled from: AdsItemPatch.kt */
        public static final class e implements f {
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
                return br.c(new StringBuilder("OnLoading(playerState="), this.b, ')');
            }
        }

        /* compiled from: AdsItemPatch.kt */
        /* renamed from: com.vk.clips.sdk.shared.item.ads.AdsItemPatch$f$f, reason: collision with other inner class name */
        public static final class C0650f implements f {
            public final j4b0 b;

            public C0650f(j4b0 j4b0Var) {
                this.b = j4b0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0650f) && epx.f(this.b, ((C0650f) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return br.c(new StringBuilder("OnPause(playerState="), this.b, ')');
            }
        }

        /* compiled from: AdsItemPatch.kt */
        public static final class g implements f {
            public final j4b0 b;

            public g(j4b0 j4b0Var) {
                this.b = j4b0Var;
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
                return br.c(new StringBuilder("OnPlay(playerState="), this.b, ')');
            }
        }

        /* compiled from: AdsItemPatch.kt */
        public static final class h implements f {
            public final boolean b;
            public final boolean c;

            public h(boolean z, boolean z2) {
                this.b = z;
                this.c = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return this.b == hVar.b && this.c == hVar.c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OnPositionUpdate(actionButtonWasShown=");
                sb.append(this.b);
                sb.append(", actionButtonWasActive=");
                return q0.a(sb, this.c, ')');
            }
        }

        /* compiled from: AdsItemPatch.kt */
        public static final class i implements f {
            public final j4b0 b;

            public i(j4b0 j4b0Var) {
                this.b = j4b0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && epx.f(this.b, ((i) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return br.c(new StringBuilder("OnReady(playerState="), this.b, ')');
            }
        }

        /* compiled from: AdsItemPatch.kt */
        public static final class j implements f {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof j)) {
                    return false;
                }
                ((j) obj).getClass();
                return true;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "OnResume(playerState=null)";
            }
        }

        /* compiled from: AdsItemPatch.kt */
        public static final class k implements f {
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

package com.vk.libvideo.design.compose.video.videocard;

import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.asp;
import xsna.at;
import xsna.dai;
import xsna.epx;
import xsna.h13;
import xsna.mno0;
import xsna.msy;
import xsna.rmw;
import xsna.se0;
import xsna.zoi;
import xsna.zrp;

/* compiled from: VideoCardViewState.kt */
/* loaded from: classes2.dex */
public final class VideoCardViewState {
    public final PreviewViewState a;
    public final b b;
    public final Object c;
    public final Object d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoCardViewState.kt */
    /* loaded from: classes.dex */
    public static final class Size {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        public static final Size Medium;
        public static final Size Sharp;
        public static final Size Small;

        static {
            Size size = new Size("Medium", 0);
            Medium = size;
            Size size2 = new Size("Small", 1);
            Small = size2;
            Size size3 = new Size("Sharp", 2);
            Sharp = size3;
            Size[] sizeArr = {size, size2, size3};
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

    /* compiled from: VideoCardViewState.kt */
    public static final class a {
        public static c a(String str, VideoMetaViewState videoMetaViewState, boolean z) {
            return new c(str, videoMetaViewState, z ? new rmw.d(R.drawable.vk_icon_more_vertical_24) : null, z ? new mno0.g(R.string.accessibility_actions) : null);
        }

        public static /* synthetic */ c b(VideoMetaViewState videoMetaViewState, boolean z, int i) {
            if ((i & 4) != 0) {
                z = false;
            }
            return a(null, videoMetaViewState, z);
        }
    }

    /* compiled from: VideoCardViewState.kt */
    public interface b {
    }

    /* compiled from: VideoCardViewState.kt */
    public static final class c implements b {
        public final String a;
        public final VideoMetaViewState b;
        public final rmw c;
        public final mno0 d;
        public final Object e;
        public final Object f;
        public final Object g;

        public c(String str, VideoMetaViewState videoMetaViewState, rmw.d dVar, mno0.g gVar) {
            this.a = str;
            this.b = videoMetaViewState;
            this.c = dVar;
            this.d = gVar;
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
            this.e = at.c(lazyThreadSafetyMode);
            this.f = at.c(lazyThreadSafetyMode);
            this.g = at.c(lazyThreadSafetyMode);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final dai.c a() {
            return (dai.c) this.g.getValue();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final dai.c b() {
            return (dai.c) this.f.getValue();
        }

        public final VideoMetaViewState c() {
            return this.b;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final dai.c d() {
            return (dai.c) this.e.getValue();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
            rmw rmwVar = this.c;
            int hashCode2 = (hashCode + (rmwVar == null ? 0 : rmwVar.hashCode())) * 31;
            mno0 mno0Var = this.d;
            return hashCode2 + (mno0Var != null ? mno0Var.hashCode() : 0);
        }

        public final String toString() {
            return "MiddleContent(avatarUrl=" + this.a + ", meta=" + this.b + ", buttonIcon=" + this.c + ", contentDescription=" + this.d + ')';
        }
    }

    /* compiled from: VideoCardViewState.kt */
    public static final class d implements b {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1383921756;
        }

        public final String toString() {
            return "Skeleton";
        }
    }

    public VideoCardViewState(PreviewViewState previewViewState, b bVar) {
        this.a = previewViewState;
        this.b = bVar;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = msy.a(lazyThreadSafetyMode, new se0(14));
        this.d = msy.a(lazyThreadSafetyMode, new h13(10));
    }

    public final PreviewViewState a() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final dai.b b() {
        return (dai.b) this.c.getValue();
    }

    public final c c() {
        b bVar = this.b;
        if (bVar instanceof c) {
            return (c) bVar;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final zoi<Size> d() {
        return (zoi) this.d.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoCardViewState)) {
            return false;
        }
        VideoCardViewState videoCardViewState = (VideoCardViewState) obj;
        return epx.f(this.a, videoCardViewState.a) && epx.f(this.b, videoCardViewState.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
    }

    public final String toString() {
        return "VideoCardViewState(before=" + this.a + ", middle=" + this.b + ", after=null)";
    }
}

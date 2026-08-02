package com.vk.libvideo.design.compose.video.videocell;

import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.asp;
import xsna.at;
import xsna.dai;
import xsna.epx;
import xsna.h13;
import xsna.msy;
import xsna.q630;
import xsna.rmw;
import xsna.zoi;
import xsna.zrp;

/* compiled from: VideoCellViewState.kt */
/* loaded from: classes2.dex */
public final class VideoCellViewState {
    public final PreviewViewState a;
    public final d b;
    public final a c;
    public final b d;
    public final e e;
    public final Object f;
    public final Object g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoCellViewState.kt */
    public static final class Size {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        public static final Size Medium;
        public static final Size Small;

        static {
            Size size = new Size("Medium", 0);
            Medium = size;
            Size size2 = new Size("Small", 1);
            Small = size2;
            Size[] sizeArr = {size, size2};
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

    /* compiled from: VideoCellViewState.kt */
    public interface a {
    }

    /* compiled from: VideoCellViewState.kt */
    public interface b {
    }

    /* compiled from: VideoCellViewState.kt */
    public static final class c implements a {
        public final rmw.d a;
        public final Object b;
        public final Object c;

        /* compiled from: VideoCellViewState.kt */
        public static final class a {
            public static c a() {
                return new c(new rmw.d(R.drawable.vk_icon_more_vertical_24));
            }
        }

        public c(rmw.d dVar) {
            this.a = dVar;
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
            this.b = at.c(lazyThreadSafetyMode);
            this.c = msy.a(lazyThreadSafetyMode, new h13(10));
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final dai.c a() {
            return (dai.c) this.b.getValue();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final zoi<q630> b() {
            return (zoi) this.c.getValue();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a.equals(((c) obj).a);
        }

        public final int hashCode() {
            return Integer.hashCode(this.a.a) * 31;
        }

        public final String toString() {
            return "Icon(icon=" + this.a + ", contentDescription=null)";
        }
    }

    /* compiled from: VideoCellViewState.kt */
    public interface d {
    }

    /* compiled from: VideoCellViewState.kt */
    public static final class e {
        public final zoi<q630> a;

        public e() {
            this(null);
        }

        public final zoi<q630> a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ReorderBadge(modifier=" + this.a + ')';
        }

        public e(Object obj) {
            this.a = new zoi<>();
        }
    }

    /* compiled from: VideoCellViewState.kt */
    public static final class f implements d, b {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 2038768840;
        }

        public final String toString() {
            return "Skeleton";
        }
    }

    /* compiled from: VideoCellViewState.kt */
    public static final class g implements d, b {
        public final VideoMetaViewState a;

        public g(VideoMetaViewState videoMetaViewState) {
            this.a = videoMetaViewState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.a, ((g) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "VideoMeta(meta=" + this.a + ')';
        }
    }

    public VideoCellViewState(PreviewViewState previewViewState, d dVar, c cVar, g gVar, e eVar, int i) {
        cVar = (i & 4) != 0 ? null : cVar;
        gVar = (i & 8) != 0 ? null : gVar;
        eVar = (i & 16) != 0 ? null : eVar;
        this.a = previewViewState;
        this.b = dVar;
        this.c = cVar;
        this.d = gVar;
        this.e = eVar;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f = at.c(lazyThreadSafetyMode);
        this.g = msy.a(lazyThreadSafetyMode, new h13(10));
    }

    public final c a() {
        a aVar = this.c;
        if (aVar instanceof c) {
            return (c) aVar;
        }
        return null;
    }

    public final PreviewViewState b() {
        return this.a;
    }

    public final VideoMetaViewState c() {
        d dVar = this.b;
        g gVar = dVar instanceof g ? (g) dVar : null;
        if (gVar != null) {
            return gVar.a;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final dai.c d() {
        return (dai.c) this.f.getValue();
    }

    public final e e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoCellViewState)) {
            return false;
        }
        VideoCellViewState videoCellViewState = (VideoCellViewState) obj;
        return epx.f(this.a, videoCellViewState.a) && epx.f(this.b, videoCellViewState.b) && epx.f(this.c, videoCellViewState.c) && epx.f(this.d, videoCellViewState.d) && epx.f(this.e, videoCellViewState.e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final zoi<Size> f() {
        return (zoi) this.g.getValue();
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        a aVar = this.c;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        b bVar = this.d;
        int hashCode3 = (hashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        e eVar = this.e;
        return hashCode3 + (eVar != null ? eVar.a.hashCode() : 0);
    }

    public final String toString() {
        return "VideoCellViewState(before=" + this.a + ", middle=" + this.b + ", after=" + this.c + ", bottom=" + this.d + ", reorderBadge=" + this.e + ')';
    }
}

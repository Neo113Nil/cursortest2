package com.vk.libvideo.design.compose.movie.poster;

import com.vk.core.compose.component.defaults.ContentBadgeAppearance;
import com.vk.core.compose.component.defaults.ContentBadgeMode;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import kotlin.LazyThreadSafetyMode;
import xsna.asp;
import xsna.at;
import xsna.epx;
import xsna.h13;
import xsna.kqu0;
import xsna.mno0;
import xsna.msy;
import xsna.pco;
import xsna.q020;
import xsna.rmw;
import xsna.zrp;

/* compiled from: PosterCardState.kt */
/* loaded from: classes2.dex */
public final class PosterCardState {
    public final PreviewViewState a;
    public final b b;
    public final Object c = msy.a(LazyThreadSafetyMode.NONE, new h13(10));

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PosterCardState.kt */
    public static final class Size {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        public static final Size Medium;
        public static final Size Small;

        static {
            Size size = new Size("Small", 0);
            Small = size;
            Size size2 = new Size("Medium", 1);
            Medium = size2;
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

    /* compiled from: PosterCardState.kt */
    public static final class a {
        public static PosterCardState a(rmw.h hVar, VideoMetaViewState videoMetaViewState, PreviewViewState.k kVar, int i) {
            PreviewViewState.k kVar2 = (i & 32) != 0 ? null : kVar;
            boolean z = (6 & 4) == 0;
            return new PosterCardState(new PreviewViewState(new q020(hVar, z ? 20 : null, null, null, new pco(kqu0.e), (6 & 8) != 0 ? VkColorToken.ImagePlaceholder : null, false, 284), null, null, null, kVar2, null, 0.6666667f, 384), new b(videoMetaViewState, null, null));
        }

        public static PreviewViewState.j b(float f) {
            return new PreviewViewState.j(ContentBadgeMode.Primary, new ContentBadgeAppearance.b(f >= 7.0f ? VkColorToken.IconPositive : VkColorToken.IconSecondary, VkColorToken.TextContrast), null, null, new mno0.i(String.valueOf(f)), null, 44);
        }
    }

    /* compiled from: PosterCardState.kt */
    public static final class b {
        public final VideoMetaViewState a;
        public final rmw b;
        public final mno0 c;
        public final Object d;
        public final Object e;

        public b(VideoMetaViewState videoMetaViewState, rmw.d dVar, mno0.g gVar) {
            this.a = videoMetaViewState;
            this.b = dVar;
            this.c = gVar;
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
            this.d = at.c(lazyThreadSafetyMode);
            this.e = at.c(lazyThreadSafetyMode);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            rmw rmwVar = this.b;
            int hashCode2 = (hashCode + (rmwVar == null ? 0 : rmwVar.hashCode())) * 31;
            mno0 mno0Var = this.c;
            return hashCode2 + (mno0Var != null ? mno0Var.hashCode() : 0);
        }

        public final String toString() {
            return "MiddleContent(meta=" + this.a + ", buttonIcon=" + this.b + ", contentDescription=" + this.c + ')';
        }
    }

    /* compiled from: PosterCardState.kt */
    public static final class c {
    }

    public PosterCardState(PreviewViewState previewViewState, b bVar) {
        this.a = previewViewState;
        this.b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PosterCardState)) {
            return false;
        }
        PosterCardState posterCardState = (PosterCardState) obj;
        return this.a.equals(posterCardState.a) && this.b.equals(posterCardState.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PosterCardState(before=" + this.a + ", middle=" + this.b + ')';
    }
}

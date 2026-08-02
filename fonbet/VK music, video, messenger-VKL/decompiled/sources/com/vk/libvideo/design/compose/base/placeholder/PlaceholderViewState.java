package com.vk.libvideo.design.compose.base.placeholder;

import com.vk.core.compose.generated.VkColorToken;
import kotlin.LazyThreadSafetyMode;
import xsna.asp;
import xsna.at;
import xsna.dai;
import xsna.epx;
import xsna.h13;
import xsna.mno0;
import xsna.msy;
import xsna.rmw;
import xsna.zoi;
import xsna.zrp;

/* compiled from: PlaceholderViewState.kt */
/* loaded from: classes2.dex */
public final class PlaceholderViewState {
    public final rmw a;
    public final mno0 b;
    public final mno0 c;
    public final rmw d;
    public final VkColorToken e;
    public final Object f;
    public final Object g;
    public final Object h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PlaceholderViewState.kt */
    public static final class Appearance {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Appearance[] $VALUES;
        public static final Appearance Neutral;
        public static final Appearance Overlay;

        static {
            Appearance appearance = new Appearance("Neutral", 0);
            Neutral = appearance;
            Appearance appearance2 = new Appearance("Overlay", 1);
            Overlay = appearance2;
            Appearance[] appearanceArr = {appearance, appearance2};
            $VALUES = appearanceArr;
            $ENTRIES = new asp(appearanceArr);
        }

        public Appearance() {
            throw null;
        }

        public static Appearance valueOf(String str) {
            return (Appearance) Enum.valueOf(Appearance.class, str);
        }

        public static Appearance[] values() {
            return (Appearance[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PlaceholderViewState.kt */
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

    public PlaceholderViewState() {
        this(null, null, null, null, null, 31);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final zoi<Appearance> a() {
        return (zoi) this.g.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final dai.c b() {
        return (dai.c) this.h.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceholderViewState)) {
            return false;
        }
        PlaceholderViewState placeholderViewState = (PlaceholderViewState) obj;
        return epx.f(this.a, placeholderViewState.a) && epx.f(this.b, placeholderViewState.b) && epx.f(this.c, placeholderViewState.c) && epx.f(this.d, placeholderViewState.d) && this.e == placeholderViewState.e;
    }

    public final int hashCode() {
        rmw rmwVar = this.a;
        int hashCode = (rmwVar == null ? 0 : rmwVar.hashCode()) * 31;
        mno0 mno0Var = this.b;
        int hashCode2 = (hashCode + (mno0Var == null ? 0 : mno0Var.hashCode())) * 31;
        mno0 mno0Var2 = this.c;
        int hashCode3 = (hashCode2 + (mno0Var2 == null ? 0 : mno0Var2.hashCode())) * 31;
        rmw rmwVar2 = this.d;
        int hashCode4 = (hashCode3 + (rmwVar2 == null ? 0 : rmwVar2.hashCode())) * 31;
        VkColorToken vkColorToken = this.e;
        return hashCode4 + (vkColorToken != null ? vkColorToken.hashCode() : 0);
    }

    public final String toString() {
        return "PlaceholderViewState(icon=" + this.a + ", text=" + this.b + ", buttonText=" + this.c + ", buttonIcon=" + this.d + ", backgroundColor=" + this.e + ')';
    }

    public PlaceholderViewState(rmw rmwVar, mno0 mno0Var, mno0 mno0Var2, rmw.d dVar, VkColorToken vkColorToken, int i) {
        rmwVar = (i & 1) != 0 ? null : rmwVar;
        mno0Var = (i & 2) != 0 ? null : mno0Var;
        mno0Var2 = (i & 4) != 0 ? null : mno0Var2;
        dVar = (i & 8) != 0 ? null : dVar;
        vkColorToken = (i & 16) != 0 ? null : vkColorToken;
        this.a = rmwVar;
        this.b = mno0Var;
        this.c = mno0Var2;
        this.d = dVar;
        this.e = vkColorToken;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        int i2 = 10;
        this.f = msy.a(lazyThreadSafetyMode, new h13(i2));
        this.g = msy.a(lazyThreadSafetyMode, new h13(i2));
        this.h = at.c(lazyThreadSafetyMode);
    }
}

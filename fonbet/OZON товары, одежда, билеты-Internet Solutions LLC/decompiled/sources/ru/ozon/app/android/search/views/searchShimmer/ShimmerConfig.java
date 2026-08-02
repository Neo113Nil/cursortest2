package ru.ozon.app.android.search.views.searchShimmer;

import Am.C2438a;
import B0.C2454a;
import D40.c;
import android.view.animation.Animation;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\u0010R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/search/views/searchShimmer/ShimmerConfig;", "", "", "animRes", "shimmerWidth", "", "", "alphaWithPositionGradientMap", "Landroid/view/animation/Animation$AnimationListener;", "animationListener", "<init>", "(IILjava/util/Map;Landroid/view/animation/Animation$AnimationListener;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getAnimRes", "getShimmerWidth", "Ljava/util/Map;", "getAlphaWithPositionGradientMap", "()Ljava/util/Map;", "Landroid/view/animation/Animation$AnimationListener;", "getAnimationListener", "()Landroid/view/animation/Animation$AnimationListener;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ShimmerConfig {

    @NotNull
    private final Map<Float, Float> alphaWithPositionGradientMap;
    private final int animRes;
    private final Animation.AnimationListener animationListener;
    private final int shimmerWidth;

    public ShimmerConfig(int i11, int i12, @NotNull Map<Float, Float> alphaWithPositionGradientMap, Animation.AnimationListener animationListener) {
        Intrinsics.checkNotNullParameter(alphaWithPositionGradientMap, "alphaWithPositionGradientMap");
        this.animRes = i11;
        this.shimmerWidth = i12;
        this.alphaWithPositionGradientMap = alphaWithPositionGradientMap;
        this.animationListener = animationListener;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShimmerConfig)) {
            return false;
        }
        ShimmerConfig shimmerConfig = (ShimmerConfig) other;
        return this.animRes == shimmerConfig.animRes && this.shimmerWidth == shimmerConfig.shimmerWidth && Intrinsics.d(this.alphaWithPositionGradientMap, shimmerConfig.alphaWithPositionGradientMap) && Intrinsics.d(this.animationListener, shimmerConfig.animationListener);
    }

    @NotNull
    public final Map<Float, Float> getAlphaWithPositionGradientMap() {
        return this.alphaWithPositionGradientMap;
    }

    public final int getAnimRes() {
        return this.animRes;
    }

    public final Animation.AnimationListener getAnimationListener() {
        return this.animationListener;
    }

    public final int getShimmerWidth() {
        return this.shimmerWidth;
    }

    public int hashCode() {
        int a11 = c.a(this.alphaWithPositionGradientMap, C2454a.a(this.shimmerWidth, Integer.hashCode(this.animRes) * 31, 31), 31);
        Animation.AnimationListener animationListener = this.animationListener;
        return a11 + (animationListener == null ? 0 : animationListener.hashCode());
    }

    @NotNull
    public String toString() {
        int i11 = this.animRes;
        int i12 = this.shimmerWidth;
        Map<Float, Float> map = this.alphaWithPositionGradientMap;
        Animation.AnimationListener animationListener = this.animationListener;
        StringBuilder a11 = C2438a.a("ShimmerConfig(animRes=", i11, ", shimmerWidth=", ", alphaWithPositionGradientMap=", i12);
        a11.append(map);
        a11.append(", animationListener=");
        a11.append(animationListener);
        a11.append(")");
        return a11.toString();
    }

    public /* synthetic */ ShimmerConfig(int i11, int i12, Map map, Animation.AnimationListener animationListener, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12, map, (i13 & 8) != 0 ? null : animationListener);
    }
}

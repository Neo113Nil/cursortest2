package com.google.accompanist.placeholder;

import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.util.MathHelpersKt;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.sentry.rrweb.RRWebVideoEvent;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: PlaceholderHighlight.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016J\"\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\u0003HÂ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÂ\u0003J7\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, d2 = {"Lcom/google/accompanist/placeholder/Shimmer;", "Lcom/google/accompanist/placeholder/PlaceholderHighlight;", "highlightColor", "Landroidx/compose/ui/graphics/Color;", "animationSpec", "Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "", "progressForMaxAlpha", "(JLandroidx/compose/animation/core/InfiniteRepeatableSpec;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAnimationSpec", "()Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "J", "alpha", "progress", "brush", "Landroidx/compose/ui/graphics/Brush;", RRWebVideoEvent.JsonKeys.SIZE, "Landroidx/compose/ui/geometry/Size;", "brush-d16Qtg0", "(FJ)Landroidx/compose/ui/graphics/Brush;", "component1", "component1-0d7_KjU", "()J", "component2", "component3", "copy", "copy-ek8zF_U", "(JLandroidx/compose/animation/core/InfiniteRepeatableSpec;F)Lcom/google/accompanist/placeholder/Shimmer;", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "placeholder_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* data */ class Shimmer implements PlaceholderHighlight {
    private final InfiniteRepeatableSpec<Float> animationSpec;
    private final long highlightColor;
    private final float progressForMaxAlpha;

    public /* synthetic */ Shimmer(long j, InfiniteRepeatableSpec infiniteRepeatableSpec, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, infiniteRepeatableSpec, f);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    private final long getHighlightColor() {
        return this.highlightColor;
    }

    /* renamed from: component3, reason: from getter */
    private final float getProgressForMaxAlpha() {
        return this.progressForMaxAlpha;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-ek8zF_U$default, reason: not valid java name */
    public static /* synthetic */ Shimmer m11066copyek8zF_U$default(Shimmer shimmer, long j, InfiniteRepeatableSpec infiniteRepeatableSpec, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            j = shimmer.highlightColor;
        }
        if ((i & 2) != 0) {
            infiniteRepeatableSpec = shimmer.animationSpec;
        }
        if ((i & 4) != 0) {
            f = shimmer.progressForMaxAlpha;
        }
        return shimmer.m11067copyek8zF_U(j, infiniteRepeatableSpec, f);
    }

    public final InfiniteRepeatableSpec<Float> component2() {
        return this.animationSpec;
    }

    /* renamed from: copy-ek8zF_U, reason: not valid java name */
    public final Shimmer m11067copyek8zF_U(long highlightColor, InfiniteRepeatableSpec<Float> animationSpec, float progressForMaxAlpha) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return new Shimmer(highlightColor, animationSpec, progressForMaxAlpha, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Shimmer)) {
            return false;
        }
        Shimmer shimmer = (Shimmer) other;
        return Color.m6040equalsimpl0(this.highlightColor, shimmer.highlightColor) && Intrinsics.areEqual(this.animationSpec, shimmer.animationSpec) && Float.compare(this.progressForMaxAlpha, shimmer.progressForMaxAlpha) == 0;
    }

    public int hashCode() {
        return (((Color.m6046hashCodeimpl(this.highlightColor) * 31) + this.animationSpec.hashCode()) * 31) + Float.hashCode(this.progressForMaxAlpha);
    }

    public String toString() {
        return "Shimmer(highlightColor=" + ((Object) Color.m6047toStringimpl(this.highlightColor)) + ", animationSpec=" + this.animationSpec + ", progressForMaxAlpha=" + this.progressForMaxAlpha + ')';
    }

    private Shimmer(long j, InfiniteRepeatableSpec<Float> animationSpec, float f) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        this.highlightColor = j;
        this.animationSpec = animationSpec;
        this.progressForMaxAlpha = f;
    }

    public /* synthetic */ Shimmer(long j, InfiniteRepeatableSpec infiniteRepeatableSpec, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, infiniteRepeatableSpec, (i & 4) != 0 ? 0.6f : f, null);
    }

    @Override // com.google.accompanist.placeholder.PlaceholderHighlight
    public InfiniteRepeatableSpec<Float> getAnimationSpec() {
        return this.animationSpec;
    }

    @Override // com.google.accompanist.placeholder.PlaceholderHighlight
    /* renamed from: brush-d16Qtg0 */
    public Brush mo11055brushd16Qtg0(float progress, long size) {
        return Brush.Companion.m5991radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m6029boximpl(Color.m6038copywmQWz5c$default(this.highlightColor, 0.0f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6029boximpl(this.highlightColor), Color.m6029boximpl(Color.m6038copywmQWz5c$default(this.highlightColor, 0.0f, 0.0f, 0.0f, 0.0f, 14, null))}), OffsetKt.Offset(0.0f, 0.0f), RangesKt.coerceAtLeast(Math.max(Size.m5840getWidthimpl(size), Size.m5837getHeightimpl(size)) * progress * 2, 0.01f), 0, 8, (Object) null);
    }

    @Override // com.google.accompanist.placeholder.PlaceholderHighlight
    public float alpha(float progress) {
        float f = this.progressForMaxAlpha;
        if (progress <= f) {
            return MathHelpersKt.lerp(0.0f, 1.0f, progress / f);
        }
        return MathHelpersKt.lerp(1.0f, 0.0f, (progress - f) / (1.0f - f));
    }
}

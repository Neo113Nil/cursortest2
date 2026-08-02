package com.google.accompanist.placeholder;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.RepeatMode;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: Placeholder.kt */
@Deprecated(message = "\naccompanist/placeholder is deprecated and the API is no longer maintained. \nWe recommend forking the implementation and customising it to your needs. \nFor more information please visit https://google.github.io/accompanist/placeholder\n")
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\u000b\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/google/accompanist/placeholder/PlaceholderDefaults;", "", "()V", "fadeAnimationSpec", "Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "", "getFadeAnimationSpec", "()Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "fadeAnimationSpec$delegate", "Lkotlin/Lazy;", "shimmerAnimationSpec", "getShimmerAnimationSpec", "shimmerAnimationSpec$delegate", "placeholder_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlaceholderDefaults {
    public static final PlaceholderDefaults INSTANCE = new PlaceholderDefaults();

    /* renamed from: fadeAnimationSpec$delegate, reason: from kotlin metadata */
    private static final Lazy fadeAnimationSpec = LazyKt.lazy(new Function0<InfiniteRepeatableSpec<Float>>() { // from class: com.google.accompanist.placeholder.PlaceholderDefaults$fadeAnimationSpec$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final InfiniteRepeatableSpec<Float> invoke() {
            return AnimationSpecKt.m476infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(600, 200, null, 4, null), RepeatMode.Reverse, 0L, 4, null);
        }
    });

    /* renamed from: shimmerAnimationSpec$delegate, reason: from kotlin metadata */
    private static final Lazy shimmerAnimationSpec = LazyKt.lazy(new Function0<InfiniteRepeatableSpec<Float>>() { // from class: com.google.accompanist.placeholder.PlaceholderDefaults$shimmerAnimationSpec$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final InfiniteRepeatableSpec<Float> invoke() {
            return AnimationSpecKt.m476infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1700, 200, null, 4, null), RepeatMode.Restart, 0L, 4, null);
        }
    });
    public static final int $stable = 8;

    private PlaceholderDefaults() {
    }

    public final InfiniteRepeatableSpec<Float> getFadeAnimationSpec() {
        return (InfiniteRepeatableSpec) fadeAnimationSpec.getValue();
    }

    public final InfiniteRepeatableSpec<Float> getShimmerAnimationSpec() {
        return (InfiniteRepeatableSpec) shimmerAnimationSpec.getValue();
    }
}

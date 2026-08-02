package com.giphy.sdk.ui.views;

import Ph.AbstractC1440a0;
import Ph.AbstractC1459k;
import Ph.C1452g0;
import Ph.C1483w0;
import Ph.P;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.facebook.react.uimanager.ViewProps;
import com.giphy.sdk.ui.views.VideoBufferingIndicator;
import com.google.crypto.tink.integration.android.b;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/giphy/sdk/ui/views/VideoBufferingIndicator;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "visibility", "", "setVisibility", "(I)V", "Landroid/animation/ValueAnimator;", "a", "Landroid/animation/ValueAnimator;", "getColorAnimation", "()Landroid/animation/ValueAnimator;", "colorAnimation", "", b.f37029b, "Z", "getVisible", "()Z", "setVisible", "(Z)V", ViewProps.VISIBLE, "giphy-ui-2.3.17_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoBufferingIndicator extends FrameLayout {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final ValueAnimator colorAnimation;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public boolean visible;

    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f31856n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f31858p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, Continuation continuation) {
            super(2, continuation);
            this.f31858p = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return VideoBufferingIndicator.this.new a(this.f31858p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f31856n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f31856n = 1;
                if (AbstractC1440a0.a(500L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (VideoBufferingIndicator.this.getVisible()) {
                VideoBufferingIndicator.super.setVisibility(this.f31858p);
                VideoBufferingIndicator.this.getColorAnimation().start();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VideoBufferingIndicator(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void b(VideoBufferingIndicator this$0, ValueAnimator animator) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(animator, "animator");
        Object animatedValue = animator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        this$0.setBackgroundColor(((Integer) animatedValue).intValue());
    }

    @NotNull
    public final ValueAnimator getColorAnimation() {
        return this.colorAnimation;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        if (visibility == 0) {
            this.visible = true;
            AbstractC1459k.d(C1483w0.f9135a, C1452g0.c(), null, new a(visibility, null), 2, null);
        } else {
            this.visible = false;
            super.setVisibility(visibility);
            this.colorAnimation.cancel();
        }
    }

    public final void setVisible(boolean z10) {
        this.visible = z10;
    }

    public /* synthetic */ VideoBufferingIndicator(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoBufferingIndicator(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(Color.argb(0, 0, 0, 0)), Integer.valueOf(Color.argb(64, 0, 0, 0)));
        Intrinsics.checkNotNullExpressionValue(ofObject, "ofObject(ArgbEvaluator(), colorFrom, colorTo)");
        this.colorAnimation = ofObject;
        ofObject.setRepeatCount(-1);
        ofObject.setRepeatMode(2);
        ofObject.setDuration(1000L);
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: V8.m0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                VideoBufferingIndicator.b(VideoBufferingIndicator.this, valueAnimator);
            }
        });
    }
}

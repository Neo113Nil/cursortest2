package ru.ozon.uni.android.notificationbar;

import android.animation.Animator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B_\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\fJ\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\fJ\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\fJ\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\fR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\rR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\rR \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/uni/android/notificationbar/SimpleAnimatorListener;", "Landroid/animation/Animator$AnimatorListener;", "Lkotlin/Function1;", "Landroid/animation/Animator;", "", "onAnimationStart", "onAnimationEnd", "onAnimationCancel", "onAnimationRepeat", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "animation", "(Landroid/animation/Animator;)V", "Lkotlin/jvm/functions/Function1;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SimpleAnimatorListener implements Animator.AnimatorListener {

    @NotNull
    private final Function1<Animator, Unit> onAnimationCancel;

    @NotNull
    private final Function1<Animator, Unit> onAnimationEnd;

    @NotNull
    private final Function1<Animator, Unit> onAnimationRepeat;

    @NotNull
    private final Function1<Animator, Unit> onAnimationStart;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/Animator;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.uni.android.notificationbar.SimpleAnimatorListener$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Animator, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Animator it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Animator animator) {
            invoke2(animator);
            return Unit.f71690a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/Animator;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.uni.android.notificationbar.SimpleAnimatorListener$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<Animator, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Animator it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Animator animator) {
            invoke2(animator);
            return Unit.f71690a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/Animator;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.uni.android.notificationbar.SimpleAnimatorListener$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<Animator, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        AnonymousClass3() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Animator it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Animator animator) {
            invoke2(animator);
            return Unit.f71690a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/Animator;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.uni.android.notificationbar.SimpleAnimatorListener$4, reason: invalid class name */
    static final class AnonymousClass4 extends AbstractC7737t implements Function1<Animator, Unit> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        AnonymousClass4() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Animator it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Animator animator) {
            invoke2(animator);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleAnimatorListener(@NotNull Function1<? super Animator, Unit> onAnimationStart, @NotNull Function1<? super Animator, Unit> onAnimationEnd, @NotNull Function1<? super Animator, Unit> onAnimationCancel, @NotNull Function1<? super Animator, Unit> onAnimationRepeat) {
        Intrinsics.checkNotNullParameter(onAnimationStart, "onAnimationStart");
        Intrinsics.checkNotNullParameter(onAnimationEnd, "onAnimationEnd");
        Intrinsics.checkNotNullParameter(onAnimationCancel, "onAnimationCancel");
        Intrinsics.checkNotNullParameter(onAnimationRepeat, "onAnimationRepeat");
        this.onAnimationStart = onAnimationStart;
        this.onAnimationEnd = onAnimationEnd;
        this.onAnimationCancel = onAnimationCancel;
        this.onAnimationRepeat = onAnimationRepeat;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(@NotNull Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.onAnimationCancel.invoke(animation);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(@NotNull Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.onAnimationEnd.invoke(animation);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(@NotNull Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.onAnimationRepeat.invoke(animation);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(@NotNull Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.onAnimationStart.invoke(animation);
    }

    public /* synthetic */ SimpleAnimatorListener(Function1 function1, Function1 function12, Function1 function13, Function1 function14, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? AnonymousClass1.INSTANCE : function1, (i11 & 2) != 0 ? AnonymousClass2.INSTANCE : function12, (i11 & 4) != 0 ? AnonymousClass3.INSTANCE : function13, (i11 & 8) != 0 ? AnonymousClass4.INSTANCE : function14);
    }
}

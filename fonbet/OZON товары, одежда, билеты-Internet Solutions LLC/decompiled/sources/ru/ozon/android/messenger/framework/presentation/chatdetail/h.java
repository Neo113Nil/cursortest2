package ru.ozon.android.messenger.framework.presentation.chatdetail;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.Y;
import c3.C5739a;
import c3.C5740b;
import hd.C6915b;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.common.SquircleLinearLayout;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.MessengerMetricsRecyclerView;
import ru.ozon.app.android.messenger.databinding.MFragmentChatBinding;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;

/* loaded from: classes10.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final MFragmentChatBinding f89796a;

    /* renamed from: b, reason: collision with root package name */
    private ValueAnimator f89797b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f89798c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f89799d;

    /* renamed from: e, reason: collision with root package name */
    private ru.ozon.android.messenger.framework.presentation.chatdetail.e f89800e;

    /* renamed from: f, reason: collision with root package name */
    private float f89801f;

    public static final class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.removeOnLayoutChangeListener(this);
            float height = view.getHeight();
            h hVar = h.this;
            if (height <= 0.0f) {
                SquircleLinearLayout pinContainerLl = hVar.f89796a.pinContainerLl;
                Intrinsics.checkNotNullExpressionValue(pinContainerLl, "pinContainerLl");
                ru.ozon.android.messenger.utils.view.s.a(pinContainerLl);
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(new C5739a());
            ofFloat.addUpdateListener(hVar.new b(ofFloat, height));
            ofFloat.addListener(hVar.new e());
            ofFloat.addListener(hVar.new d(height));
            ofFloat.addListener(hVar.new c());
            hVar.f89797b = ofFloat;
            ofFloat.start();
        }
    }

    static final class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ValueAnimator f89804b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f89805c;

        static final class a extends AbstractC7737t implements Function1<ViewGroup.MarginLayoutParams, Unit> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ float f89806b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(float f7) {
                super(1);
                this.f89806b = f7;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(ViewGroup.MarginLayoutParams marginLayoutParams) {
                ViewGroup.MarginLayoutParams updateMarginLP = marginLayoutParams;
                Intrinsics.checkNotNullParameter(updateMarginLP, "$this$updateMarginLP");
                updateMarginLP.topMargin = C6915b.c(this.f89806b);
                return Unit.f71690a;
            }
        }

        b(ValueAnimator valueAnimator, float f7) {
            this.f89804b = valueAnimator;
            this.f89805c = f7;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator anim) {
            int i11;
            Intrinsics.checkNotNullParameter(anim, "anim");
            h hVar = h.this;
            if (hVar.f89797b != this.f89804b) {
                return;
            }
            Object animatedValue = anim.getAnimatedValue();
            Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            float f7 = this.f89805c;
            i11 = ru.ozon.android.messenger.utils.e.f91913j;
            float f11 = (floatValue * f7) - i11;
            if (f11 < 0.0f) {
                f11 = 0.0f;
            }
            MessengerMetricsRecyclerView messagesRv = hVar.f89796a.messagesRv;
            Intrinsics.checkNotNullExpressionValue(messagesRv, "messagesRv");
            ru.ozon.android.messenger.utils.view.s.f(messagesRv, new a(f11));
            hVar.f89801f = f11;
            h.c(hVar, f7, floatValue);
        }
    }

    public static final class c implements Animator.AnimatorListener {
        public c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(@NotNull Animator animator) {
            h.this.f89798c = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@NotNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(@NotNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(@NotNull Animator animator) {
        }
    }

    public static final class d implements Animator.AnimatorListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f89809b;

        public d(float f7) {
            this.f89809b = f7;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(@NotNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@NotNull Animator animator) {
            h.d(h.this, this.f89809b);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(@NotNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(@NotNull Animator animator) {
        }
    }

    public static final class e implements Animator.AnimatorListener {
        public e() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(@NotNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@NotNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(@NotNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(@NotNull Animator animator) {
            h.this.f89798c = true;
        }
    }

    static final class f extends AbstractC7737t implements Function1<ViewGroup.MarginLayoutParams, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f89811b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(float f7) {
            super(1);
            this.f89811b = f7;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ViewGroup.MarginLayoutParams updateMarginLP = marginLayoutParams;
            Intrinsics.checkNotNullParameter(updateMarginLP, "$this$updateMarginLP");
            updateMarginLP.topMargin = C6915b.c(this.f89811b);
            return Unit.f71690a;
        }
    }

    public static final class g implements Animator.AnimatorListener {
        public g() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(@NotNull Animator animator) {
            h.this.f89798c = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@NotNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(@NotNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(@NotNull Animator animator) {
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.h$h, reason: collision with other inner class name */
    public static final class C1659h implements Animator.AnimatorListener {
        public C1659h() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(@NotNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@NotNull Animator animator) {
            h.e(h.this);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(@NotNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(@NotNull Animator animator) {
        }
    }

    public static final class i implements Animator.AnimatorListener {
        public i() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(@NotNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@NotNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(@NotNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(@NotNull Animator animator) {
            h.this.f89798c = true;
        }
    }

    public static final class j implements View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f89815a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.presentation.chatdetail.e f89816b;

        public j(View view, ru.ozon.android.messenger.framework.presentation.chatdetail.e eVar) {
            this.f89815a = view;
            this.f89816b = eVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(@NotNull View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(@NotNull View view) {
            this.f89815a.removeOnAttachStateChangeListener(this);
            view.getViewTreeObserver().removeOnPreDrawListener(this.f89816b);
        }
    }

    public static final class k implements View.OnLayoutChangeListener {
        public k() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.removeOnLayoutChangeListener(this);
            h hVar = h.this;
            if (hVar.f89799d) {
                MessengerMetricsRecyclerView messagesRv = hVar.f89796a.messagesRv;
                Intrinsics.checkNotNullExpressionValue(messagesRv, "messagesRv");
                ru.ozon.android.messenger.utils.view.s.f(messagesRv, hVar.new m());
            }
        }
    }

    static final class l extends AbstractC7737t implements Function1<ViewGroup.MarginLayoutParams, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final l f89818b = new l(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ViewGroup.MarginLayoutParams updateMarginLP = marginLayoutParams;
            Intrinsics.checkNotNullParameter(updateMarginLP, "$this$updateMarginLP");
            updateMarginLP.topMargin = 0;
            return Unit.f71690a;
        }
    }

    static final class m extends AbstractC7737t implements Function1<ViewGroup.MarginLayoutParams, Unit> {
        m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ViewGroup.MarginLayoutParams updateMarginLP = marginLayoutParams;
            Intrinsics.checkNotNullParameter(updateMarginLP, "$this$updateMarginLP");
            updateMarginLP.topMargin = C6915b.c(h.this.f89801f);
            return Unit.f71690a;
        }
    }

    public h(@NotNull MFragmentChatBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f89796a = binding;
    }

    public static void a(h hVar) {
        if (hVar.f89796a.pinContainerLl.getHeight() > 0) {
            hVar.f89796a.pinContainerLl.getViewTreeObserver().removeOnPreDrawListener(hVar.f89800e);
            hVar.f89800e = null;
            hVar.o();
        }
    }

    public static void b(h hVar, ValueAnimator valueAnimator, float f7, ValueAnimator anim) {
        int i11;
        Intrinsics.checkNotNullParameter(anim, "anim");
        if (hVar.f89797b != valueAnimator) {
            return;
        }
        Object animatedValue = anim.getAnimatedValue();
        Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        MFragmentChatBinding mFragmentChatBinding = hVar.f89796a;
        float f11 = floatValue * f7;
        mFragmentChatBinding.pinContainerLl.setTranslationY(f11 - f7);
        mFragmentChatBinding.pinContainerLl.setAlpha(floatValue);
        i11 = ru.ozon.android.messenger.utils.e.f91913j;
        float f12 = f11 - i11;
        if (f12 < 0.0f) {
            f12 = 0.0f;
        }
        MessengerMetricsRecyclerView messagesRv = mFragmentChatBinding.messagesRv;
        Intrinsics.checkNotNullExpressionValue(messagesRv, "messagesRv");
        ru.ozon.android.messenger.utils.view.s.f(messagesRv, new f(f12));
        hVar.f89801f = f12;
    }

    public static final void c(h hVar, float f7, float f11) {
        MFragmentChatBinding mFragmentChatBinding = hVar.f89796a;
        mFragmentChatBinding.pinContainerLl.setTranslationY((f11 * f7) - f7);
        mFragmentChatBinding.pinContainerLl.setAlpha(f11);
    }

    public static final void d(h hVar, float f7) {
        MFragmentChatBinding mFragmentChatBinding = hVar.f89796a;
        SquircleLinearLayout squircleLinearLayout = mFragmentChatBinding.pinContainerLl;
        Intrinsics.f(squircleLinearLayout);
        ru.ozon.android.messenger.utils.view.s.a(squircleLinearLayout);
        squircleLinearLayout.setTranslationY(-f7);
        squircleLinearLayout.setAlpha(1.0f);
        MessengerMetricsRecyclerView messagesRv = mFragmentChatBinding.messagesRv;
        Intrinsics.checkNotNullExpressionValue(messagesRv, "messagesRv");
        ru.ozon.android.messenger.utils.view.s.f(messagesRv, ru.ozon.android.messenger.framework.presentation.chatdetail.g.f89795b);
        hVar.f89798c = false;
        hVar.f89799d = false;
    }

    public static final void e(h hVar) {
        SquircleLinearLayout squircleLinearLayout = hVar.f89796a.pinContainerLl;
        Intrinsics.f(squircleLinearLayout);
        ru.ozon.android.messenger.utils.view.s.d(squircleLinearLayout);
        squircleLinearLayout.setTranslationY(0.0f);
        squircleLinearLayout.setAlpha(1.0f);
        hVar.f89798c = false;
        hVar.f89799d = true;
    }

    public final void m() {
        ValueAnimator valueAnimator = this.f89797b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f89797b = null;
        this.f89798c = false;
        this.f89799d = false;
        this.f89800e = null;
    }

    public final void n() {
        ValueAnimator valueAnimator;
        if (this.f89799d || this.f89798c) {
            if (this.f89798c && (valueAnimator = this.f89797b) != null) {
                valueAnimator.cancel();
            }
            MFragmentChatBinding mFragmentChatBinding = this.f89796a;
            SquircleLinearLayout pinContainerLl = mFragmentChatBinding.pinContainerLl;
            Intrinsics.checkNotNullExpressionValue(pinContainerLl, "pinContainerLl");
            int i11 = Y.f42258g;
            if (!pinContainerLl.isLaidOut() || pinContainerLl.isLayoutRequested()) {
                pinContainerLl.addOnLayoutChangeListener(new a());
                return;
            }
            float height = pinContainerLl.getHeight();
            if (height <= 0.0f) {
                SquircleLinearLayout pinContainerLl2 = mFragmentChatBinding.pinContainerLl;
                Intrinsics.checkNotNullExpressionValue(pinContainerLl2, "pinContainerLl");
                ru.ozon.android.messenger.utils.view.s.a(pinContainerLl2);
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(new C5739a());
            ofFloat.addUpdateListener(new b(ofFloat, height));
            ofFloat.addListener(new e());
            ofFloat.addListener(new d(height));
            ofFloat.addListener(new c());
            this.f89797b = ofFloat;
            ofFloat.start();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [android.view.ViewTreeObserver$OnPreDrawListener, ru.ozon.android.messenger.framework.presentation.chatdetail.e] */
    public final void o() {
        ValueAnimator valueAnimator;
        if (!this.f89799d || this.f89798c) {
            if (this.f89798c && (valueAnimator = this.f89797b) != null) {
                valueAnimator.cancel();
            }
            MFragmentChatBinding mFragmentChatBinding = this.f89796a;
            if (mFragmentChatBinding.pinContainerLl.getHeight() == 0) {
                SquircleLinearLayout pinContainerLl = mFragmentChatBinding.pinContainerLl;
                Intrinsics.checkNotNullExpressionValue(pinContainerLl, "pinContainerLl");
                if (pinContainerLl.getVisibility() == 8) {
                    SquircleLinearLayout pinContainerLl2 = mFragmentChatBinding.pinContainerLl;
                    Intrinsics.checkNotNullExpressionValue(pinContainerLl2, "pinContainerLl");
                    ViewExtKt.hide(pinContainerLl2);
                }
                ?? r12 = new ViewTreeObserver.OnPreDrawListener() { // from class: ru.ozon.android.messenger.framework.presentation.chatdetail.e
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public final boolean onPreDraw() {
                        h.a(h.this);
                        return true;
                    }
                };
                mFragmentChatBinding.pinContainerLl.getViewTreeObserver().addOnPreDrawListener(r12);
                SquircleLinearLayout pinContainerLl3 = mFragmentChatBinding.pinContainerLl;
                Intrinsics.checkNotNullExpressionValue(pinContainerLl3, "pinContainerLl");
                if (pinContainerLl3.isAttachedToWindow()) {
                    pinContainerLl3.addOnAttachStateChangeListener(new j(pinContainerLl3, r12));
                } else {
                    pinContainerLl3.getViewTreeObserver().removeOnPreDrawListener(r12);
                }
                this.f89800e = r12;
                return;
            }
            final float height = mFragmentChatBinding.pinContainerLl.getHeight();
            SquircleLinearLayout squircleLinearLayout = mFragmentChatBinding.pinContainerLl;
            Intrinsics.f(squircleLinearLayout);
            ru.ozon.android.messenger.utils.view.s.d(squircleLinearLayout);
            squircleLinearLayout.setTranslationY(-height);
            final ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(300L);
            ofFloat.setInterpolator(new C5740b());
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ru.ozon.android.messenger.framework.presentation.chatdetail.f
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    h.b(h.this, ofFloat, height, valueAnimator2);
                }
            });
            ofFloat.addListener(new i());
            ofFloat.addListener(new C1659h());
            ofFloat.addListener(new g());
            this.f89797b = ofFloat;
            ofFloat.start();
        }
    }

    public final void p(@NotNull List<ru.ozon.android.messenger.framework.presentation.models.e> blockItems) {
        int i11;
        Intrinsics.checkNotNullParameter(blockItems, "blockItems");
        if (!blockItems.isEmpty()) {
            Iterator<T> it = blockItems.iterator();
            while (it.hasNext()) {
                if (((ru.ozon.android.messenger.framework.presentation.models.e) it.next()).b() instanceof ru.ozon.android.messenger.blocks.pinneditem.g) {
                    i11 = ru.ozon.android.messenger.utils.e.f91914k;
                    break;
                }
            }
        }
        i11 = 0;
        int i12 = i11;
        MFragmentChatBinding mFragmentChatBinding = this.f89796a;
        if (mFragmentChatBinding.pinContainerLl.getPaddingBottom() != i12) {
            SquircleLinearLayout pinContainerLl = mFragmentChatBinding.pinContainerLl;
            Intrinsics.checkNotNullExpressionValue(pinContainerLl, "pinContainerLl");
            ru.ozon.android.messenger.utils.view.s.g(pinContainerLl, 0, 0, 0, i12, 7);
        }
        if (!blockItems.isEmpty()) {
            Iterator<T> it2 = blockItems.iterator();
            while (it2.hasNext()) {
                if (((ru.ozon.android.messenger.framework.presentation.models.e) it2.next()).b() instanceof ru.ozon.android.messenger.blocks.pinneditem.g) {
                    SquircleLinearLayout pinContainerLl2 = mFragmentChatBinding.pinContainerLl;
                    Intrinsics.checkNotNullExpressionValue(pinContainerLl2, "pinContainerLl");
                    int i13 = Y.f42258g;
                    if (!pinContainerLl2.isLaidOut() || pinContainerLl2.isLayoutRequested()) {
                        pinContainerLl2.addOnLayoutChangeListener(new k());
                        return;
                    } else {
                        if (this.f89799d) {
                            MessengerMetricsRecyclerView messagesRv = mFragmentChatBinding.messagesRv;
                            Intrinsics.checkNotNullExpressionValue(messagesRv, "messagesRv");
                            ru.ozon.android.messenger.utils.view.s.f(messagesRv, new m());
                            return;
                        }
                        return;
                    }
                }
            }
        }
        MessengerMetricsRecyclerView messagesRv2 = mFragmentChatBinding.messagesRv;
        Intrinsics.checkNotNullExpressionValue(messagesRv2, "messagesRv");
        ru.ozon.android.messenger.utils.view.s.f(messagesRv2, l.f89818b);
    }
}

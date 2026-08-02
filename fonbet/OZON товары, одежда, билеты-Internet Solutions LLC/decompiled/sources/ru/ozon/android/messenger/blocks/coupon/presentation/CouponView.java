package ru.ozon.android.messenger.blocks.coupon.presentation;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.utils.h;
import ru.ozon.android.messenger.utils.view.s;
import ru.ozon.app.android.messenger.R$color;
import ru.ozon.app.android.messenger.databinding.MViewCouponBinding;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/android/messenger/blocks/coupon/presentation/CouponView;", "Landroid/widget/LinearLayout;", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CouponView extends LinearLayout {

    /* renamed from: c, reason: collision with root package name */
    private static final float f84929c = h.d(3);

    /* renamed from: d, reason: collision with root package name */
    private static final int f84930d = h.c(9);

    /* renamed from: e, reason: collision with root package name */
    private static final int f84931e = h.c(1);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Paint f84932a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private MViewCouponBinding f84933b;

    static final class a extends AbstractC7737t implements Function1<View, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f84934b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0<Unit> function0) {
            super(1);
            this.f84934b = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f84934b.invoke();
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function1<View, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f84935b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function0<Unit> function0) {
            super(1);
            this.f84935b = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f84935b.invoke();
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CouponView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        paint.setColor(getResources().getColor(R$color.layer_floor_1, context.getTheme()));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f84932a = paint;
        MViewCouponBinding inflate = MViewCouponBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        inflate.couponLeft.setClipToOutline(true);
        inflate.couponApply.setClipToOutline(true);
        this.f84933b = inflate;
        setLayerType(2, null);
    }

    public final void a(TextAtom textAtom) {
        MViewCouponBinding mViewCouponBinding = this.f84933b;
        if (textAtom != null) {
            TextAtomView couponApply = mViewCouponBinding.couponApply;
            Intrinsics.checkNotNullExpressionValue(couponApply, "couponApply");
            TextAtomHolderKt.bind$default(couponApply, textAtom, null, 2, null);
        }
        mViewCouponBinding.couponApply.setMaxLinesOrDefault(1);
        mViewCouponBinding.couponApply.setLetterSpacing(0.0f);
    }

    public final void b(String str) {
        ImageView couponImage = this.f84933b.couponImage;
        Intrinsics.checkNotNullExpressionValue(couponImage, "couponImage");
        ImageViewExtKt.loadImageOrGone(couponImage, str);
    }

    public final void c(TextAtom textAtom) {
        TextAtomView couponSubtitle = this.f84933b.couponSubtitle;
        Intrinsics.checkNotNullExpressionValue(couponSubtitle, "couponSubtitle");
        TextAtomHolderKt.bindOrGone$default(couponSubtitle, textAtom != null ? TextAtom.copy$default(textAtom, null, null, null, 1, null, null, null, 119, null) : null, null, 2, null);
    }

    public final void d(TextAtom textAtom) {
        MViewCouponBinding mViewCouponBinding = this.f84933b;
        TextAtomView couponTitle = mViewCouponBinding.couponTitle;
        Intrinsics.checkNotNullExpressionValue(couponTitle, "couponTitle");
        TextAtomHolderKt.bindOrGone$default(couponTitle, textAtom, null, 2, null);
        mViewCouponBinding.couponTitle.setMaxLinesOrDefault(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        float width = getWidth() - this.f84933b.couponApply.getMeasuredWidth();
        float f7 = f84931e;
        while (true) {
            int measuredHeight = getMeasuredHeight();
            int i11 = f84930d;
            if (f7 >= measuredHeight + i11) {
                return;
            }
            canvas.drawCircle(width, f7, f84929c, this.f84932a);
            f7 += i11;
        }
    }

    public final void e(@NotNull Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        TextAtomView couponApply = this.f84933b.couponApply;
        Intrinsics.checkNotNullExpressionValue(couponApply, "couponApply");
        s.c(couponApply, new a(action));
    }

    public final void f(@NotNull Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        ConstraintLayout couponLeft = this.f84933b.couponLeft;
        Intrinsics.checkNotNullExpressionValue(couponLeft, "couponLeft");
        s.c(couponLeft, new b(action));
    }

    public final void g(int i11) {
        this.f84933b.couponLeft.setBackgroundResource(i11);
    }

    public final void h(@NotNull String color) {
        Intrinsics.checkNotNullParameter(color, "color");
        ConstraintLayout couponLeft = this.f84933b.couponLeft;
        Intrinsics.checkNotNullExpressionValue(couponLeft, "couponLeft");
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        s.b(couponLeft, styleParser.parseColor(context, color, R$color.bg_marketing_primary));
    }

    public final void i(int i11) {
        this.f84933b.couponApply.setBackgroundResource(i11);
    }

    public final void j(@NotNull String color) {
        Intrinsics.checkNotNullParameter(color, "color");
        TextAtomView couponApply = this.f84933b.couponApply;
        Intrinsics.checkNotNullExpressionValue(couponApply, "couponApply");
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        s.b(couponApply, styleParser.parseColor(context, color, R$color.bg_marketing_primary));
    }
}

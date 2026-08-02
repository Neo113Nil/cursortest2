package ru.ozon.fintech.features.operations.ui.operationinfo;

import Aw.ViewOnClickListenerC2448a;
import Sc.o;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.bumptech.glide.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l6.AbstractC7878a;
import l6.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.features.operations.ui.operationinfo.a;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/fintech/features/operations/ui/operationinfo/OperationInfoCardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "operations_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OperationInfoCardView extends ConstraintLayout {

    /* renamed from: c, reason: collision with root package name */
    private A70.a f96092c;

    /* renamed from: d, reason: collision with root package name */
    private ru.ozon.fintech.features.operations.ui.operationinfo.a f96093d;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f96094a;

        static {
            int[] iArr = new int[a.C2066a.EnumC2067a.values().length];
            try {
                iArr[a.C2066a.EnumC2067a.PREMIUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.C2066a.EnumC2067a.CURRENCY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f96094a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperationInfoCardView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f96092c = A70.a.a(LayoutInflater.from(context), this);
    }

    public static void b(OperationInfoCardView operationInfoCardView) {
        ru.ozon.fintech.features.operations.ui.operationinfo.a aVar = operationInfoCardView.f96093d;
    }

    public final void c(@NotNull ru.ozon.fintech.features.operations.ui.operationinfo.a card) {
        Intrinsics.checkNotNullParameter(card, "card");
        this.f96093d = card;
        A70.a aVar = this.f96092c;
        if (aVar != null) {
            Integer b11 = card.b();
            ImageView imageView = aVar.f525g;
            if (b11 != null) {
                imageView.setImageResource(card.b().intValue());
            } else if (card.c() != null) {
                Intrinsics.f(c.n(getContext()).load(card.c()).apply((AbstractC7878a<?>) i.circleCropTransform()).fallback(R.drawable.fintech_operations_ic_blank_48).into(imageView));
            } else {
                imageView.setImageResource(R.drawable.fintech_operations_avatartravel_icon_48);
            }
            String b12 = Nk.a.b(" ", card.h());
            TextView textView = aVar.f532n;
            textView.setText(b12);
            textView.setTextColor(androidx.core.content.a.getColorStateList(getContext(), card.j().b()));
            textView.setCompoundDrawablesWithIntrinsicBounds(androidx.core.content.a.getDrawable(getContext(), card.j().a()), (Drawable) null, (Drawable) null, (Drawable) null);
            aVar.f534p.setText(card.i());
            TextView tvOldPrice = aVar.f531m;
            Intrinsics.checkNotNullExpressionValue(tvOldPrice, "tvOldPrice");
            tvOldPrice.setVisibility(8);
            aVar.f529k.setText(card.f());
            String e11 = card.e();
            TextView tvDescription = aVar.f528j;
            if (e11 != null) {
                tvDescription.setText(card.e());
                Intrinsics.checkNotNullExpressionValue(tvDescription, "tvDescription");
                tvDescription.setVisibility(0);
            } else {
                Intrinsics.checkNotNullExpressionValue(tvDescription, "tvDescription");
                tvDescription.setVisibility(8);
            }
            String g10 = card.g();
            ImageView ivArrow = aVar.f524f;
            TextView tvInfoTo = aVar.f530l;
            if (g10 != null) {
                tvInfoTo.setText(card.g());
                Intrinsics.checkNotNullExpressionValue(tvInfoTo, "tvInfoTo");
                tvInfoTo.setVisibility(0);
                Intrinsics.checkNotNullExpressionValue(ivArrow, "ivArrow");
                ivArrow.setVisibility(0);
            } else {
                Intrinsics.checkNotNullExpressionValue(tvInfoTo, "tvInfoTo");
                tvInfoTo.setVisibility(8);
                Intrinsics.checkNotNullExpressionValue(ivArrow, "ivArrow");
                ivArrow.setVisibility(8);
            }
            ConstraintLayout dynamicContainer = aVar.f523e;
            Intrinsics.checkNotNullExpressionValue(dynamicContainer, "dynamicContainer");
            dynamicContainer.setVisibility(card.a() != null ? 0 : 8);
            LinearLayout discountContainer = aVar.f522d;
            Intrinsics.checkNotNullExpressionValue(discountContainer, "discountContainer");
            discountContainer.setVisibility(8);
            a.C2066a a11 = card.a();
            Group cachePremiumPointsGroup = aVar.f520b;
            LinearLayout cachebackContainer = aVar.f521c;
            if (a11 != null) {
                int i11 = a.f96094a[card.a().b().ordinal()];
                if (i11 == 1) {
                    aVar.f533o.setText(card.a().a());
                    Intrinsics.checkNotNullExpressionValue(cachePremiumPointsGroup, "cachePremiumPointsGroup");
                    cachePremiumPointsGroup.setVisibility(0);
                    Intrinsics.checkNotNullExpressionValue(cachebackContainer, "cachebackContainer");
                    cachebackContainer.setVisibility(8);
                } else {
                    if (i11 != 2) {
                        throw new o();
                    }
                    aVar.f526h.setText(Nk.a.b("+", card.a().a()));
                    Intrinsics.checkNotNullExpressionValue(cachebackContainer, "cachebackContainer");
                    cachebackContainer.setVisibility(0);
                    Intrinsics.checkNotNullExpressionValue(cachePremiumPointsGroup, "cachePremiumPointsGroup");
                    cachePremiumPointsGroup.setVisibility(8);
                }
            } else {
                Intrinsics.checkNotNullExpressionValue(cachebackContainer, "cachebackContainer");
                cachebackContainer.setVisibility(8);
                Intrinsics.checkNotNullExpressionValue(cachePremiumPointsGroup, "cachePremiumPointsGroup");
                cachePremiumPointsGroup.setVisibility(8);
            }
            String d11 = card.d();
            TextView tvCommission = aVar.f527i;
            if (d11 != null) {
                tvCommission.setText(card.d());
                Intrinsics.checkNotNullExpressionValue(tvCommission, "tvCommission");
                tvCommission.setVisibility(0);
            } else {
                Intrinsics.checkNotNullExpressionValue(tvCommission, "tvCommission");
                tvCommission.setVisibility(8);
            }
        }
        setOnClickListener(new ViewOnClickListenerC2448a(this, 2));
    }
}

package ru.ozon.android.messenger.blocks.courierheader.presentation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.courierheader.presentation.a;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.utils.h;
import ru.ozon.android.messenger.utils.view.s;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.databinding.MCourierHeaderOrderItemBinding;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.productMedia.ProductMediaView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.productMedia.ProductMediaHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

/* loaded from: classes10.dex */
public final class d extends RecyclerView.C {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final MCourierHeaderOrderItemBinding f84959a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.navigation.controller.a f84960b;

    static final class a extends AbstractC7737t implements Function1<View, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a.C1486a f84961b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f84962c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(a.C1486a c1486a, d dVar) {
            super(1);
            this.f84961b = c1486a;
            this.f84962c = dVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            a.C1486a c1486a = this.f84961b;
            Map<String, MessengerTrackingInfo> e11 = c1486a.e();
            d dVar = this.f84962c;
            if (e11 != null) {
                dVar.f84960b.m(e11);
            }
            dVar.f84960b.q(ru.ozon.android.messenger.framework.navigation.action.b.c(c1486a.a()));
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull MCourierHeaderOrderItemBinding binding, @NotNull ru.ozon.android.messenger.framework.navigation.controller.a controller) {
        super(binding.getConstraintLayout());
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.f84959a = binding;
        this.f84960b = controller;
        Intrinsics.checkNotNullExpressionValue(binding.getConstraintLayout(), "getRoot(...)");
    }

    public final void f(@NotNull a.C1486a item) {
        int i11;
        Intrinsics.checkNotNullParameter(item, "item");
        MCourierHeaderOrderItemBinding mCourierHeaderOrderItemBinding = this.f84959a;
        TextAtomV2View orderTitleTv = mCourierHeaderOrderItemBinding.orderTitleTv;
        Intrinsics.checkNotNullExpressionValue(orderTitleTv, "orderTitleTv");
        TextHolderKt.bindOrGone$default(orderTitleTv, item.d(), null, 2, null);
        List<ProductMediaDTO> c11 = item.c();
        if (c11 != null) {
            for (ProductMediaDTO productMediaDTO : c11) {
                LinearLayoutCompat linearLayoutCompat = mCourierHeaderOrderItemBinding.productsList;
                Context context = mCourierHeaderOrderItemBinding.getConstraintLayout().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                ProductMediaView productMediaView = new ProductMediaView(context, null, 0, 6, null);
                ProductMediaHolderKt.bindOrGone$default(productMediaView, productMediaDTO, null, 2, null);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(h.c(32), h.c(43));
                i11 = ru.ozon.android.messenger.utils.e.f91907d;
                marginLayoutParams.setMarginEnd(i11);
                productMediaView.setLayoutParams(marginLayoutParams);
                linearLayoutCompat.addView(productMediaView);
            }
        }
        BadgeView customBadge = mCourierHeaderOrderItemBinding.customBadge;
        Intrinsics.checkNotNullExpressionValue(customBadge, "customBadge");
        BadgeHolderKt.bindOrGone$default(customBadge, item.b(), (Function1) null, 2, (Object) null);
        ConstraintLayout constraintLayout = mCourierHeaderOrderItemBinding.getConstraintLayout();
        androidx.constraintlayout.widget.d d11 = Tl.a.d(constraintLayout, "getRoot(...)", constraintLayout);
        if (item.b() != null) {
            int i12 = R$id.orderTitleTv;
            int i13 = R$id.customBadge;
            Intrinsics.checkNotNullParameter(d11, "<this>");
            d11.t(i12, 3, i13, 3, 0);
            int i14 = R$id.orderTitleTv;
            int i15 = R$id.customBadge;
            Intrinsics.checkNotNullParameter(d11, "<this>");
            d11.t(i14, 4, i15, 4, 0);
        } else {
            int i16 = R$id.orderTitleTv;
            int c12 = h.c(9);
            Intrinsics.checkNotNullParameter(d11, "<this>");
            d11.t(i16, 3, 0, 3, c12);
        }
        d11.f(constraintLayout);
        ConstraintLayout constraintLayout2 = mCourierHeaderOrderItemBinding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
        s.c(constraintLayout2, new a(item, this));
    }
}

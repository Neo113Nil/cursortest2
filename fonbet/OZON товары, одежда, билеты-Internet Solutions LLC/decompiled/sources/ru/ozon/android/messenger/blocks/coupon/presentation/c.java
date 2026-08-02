package ru.ozon.android.messenger.blocks.coupon.presentation;

import android.view.ViewGroup;
import android.widget.ImageView;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.coupon.e;
import ru.ozon.android.messenger.blocks.coupon.f;
import ru.ozon.android.messenger.framework.core.d;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.android.messenger.framework.presentation.models.p;
import ru.ozon.android.messenger.framework.presentation.models.s;
import ru.ozon.app.android.messenger.R$drawable;
import ru.ozon.app.android.messenger.databinding.MBlockCouponBinding;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;

/* loaded from: classes10.dex */
public final class c extends q<ru.ozon.android.messenger.blocks.coupon.b, MBlockCouponBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d f84940a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull MBlockCouponBinding binding, @NotNull d references) {
        super(binding, references);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        this.f84940a = references;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.q
    public final void bind(ru.ozon.android.messenger.blocks.coupon.b bVar, p itemInfo, ru.ozon.android.messenger.framework.presentation.models.d blockInfo, Object obj) {
        ru.ozon.android.messenger.blocks.coupon.b block = bVar;
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        Intrinsics.checkNotNullParameter(blockInfo, "blockInfo");
        super.bind(block, itemInfo, blockInfo, obj);
        if (!(itemInfo instanceof s)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        MBlockCouponBinding binding = getBinding();
        e b11 = block.b();
        s sVar = (s) itemInfo;
        boolean p11 = sVar.p();
        CouponView couponView = binding.couponView;
        couponView.d(b11.e());
        couponView.c(b11.d());
        couponView.b(b11.c());
        couponView.h(b11.b());
        couponView.g(p11 ? R$drawable.m_bg_my_coupon_left : R$drawable.m_bg_other_coupon_left);
        AtomActionDTO a11 = b11.a();
        if (a11 != null) {
            couponView.f(new a(this, a11));
            Unit unit = Unit.f71690a;
        }
        f c11 = block.c();
        boolean p12 = sVar.p();
        CouponView couponView2 = binding.couponView;
        couponView2.a(c11.c());
        couponView2.j(c11.b());
        couponView2.i(p12 ? R$drawable.m_bg_my_coupon_right : R$drawable.m_bg_other_coupon_right);
        AtomActionDTO a12 = c11.a();
        if (a12 != null) {
            couponView2.e(new b(this, a12));
            Unit unit2 = Unit.f71690a;
        }
        ru.ozon.android.messenger.blocks.coupon.d a13 = block.a();
        ImageView imageView = binding.banner;
        Intrinsics.f(imageView);
        ImageViewExtKt.loadImageOrGone(imageView, a13 != null ? a13.a() : null);
        imageView.setClipToOutline(true);
        ViewGroup findBubbleMsgContainer = findBubbleMsgContainer();
        if (findBubbleMsgContainer != null) {
            ru.ozon.android.messenger.utils.view.s.h(findBubbleMsgContainer, -1);
        }
    }
}

package ru.ozon.android.messenger.framework.presentation.chatdetail.coupon;

import Aw.ViewOnClickListenerC2448a;
import B90.W;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.navigation.action.b;
import ru.ozon.android.messenger.framework.presentation.models.responses.c;
import ru.ozon.android.messenger.utils.f;
import ru.ozon.android.messenger.utils.g;
import ru.ozon.android.messenger.utils.view.s;
import ru.ozon.app.android.messenger.R$drawable;
import ru.ozon.app.android.messenger.R$style;
import ru.ozon.app.android.messenger.databinding.MCouponDialogBinding;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.controls.button.DataButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.DataButtonDTO;
import ru.ozon.uni.atoms.v3.holders.controls.button.DataButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/android/messenger/framework/presentation/chatdetail/coupon/a;", "Landroidx/fragment/app/k;", "<init>", "()V", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a extends DialogInterfaceOnCancelListenerC5390k {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f89725d = 0;

    /* renamed from: a, reason: collision with root package name */
    public ru.ozon.android.messenger.framework.navigation.controller.a f89726a;

    /* renamed from: b, reason: collision with root package name */
    private MCouponDialogBinding f89727b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f89728c = f.b(new C1657a());

    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.coupon.a$a, reason: collision with other inner class name */
    static final class C1657a extends AbstractC7737t implements Function0<c.b.C1710b> {
        C1657a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final c.b.C1710b invoke() {
            Bundle requireArguments = a.this.requireArguments();
            Intrinsics.checkNotNullExpressionValue(requireArguments, "requireArguments(...)");
            return (c.b.C1710b) f.a(requireArguments, "BUNDLE_ARG_COUPON_CONTENT", c.b.C1710b.class);
        }
    }

    public static void t(a aVar) {
        CommonControlSettings common;
        aVar.dismiss();
        ru.ozon.android.messenger.framework.navigation.controller.a aVar2 = aVar.f89726a;
        AtomActionDTO atomActionDTO = null;
        if (aVar2 == null) {
            Intrinsics.n("messengerController");
            throw null;
        }
        DataButtonDTO b11 = aVar.v().b();
        if (b11 != null && (common = b11.getCommon()) != null) {
            atomActionDTO = common.getAction();
        }
        aVar2.q(b.c(atomActionDTO));
    }

    private final MCouponDialogBinding u() {
        MCouponDialogBinding mCouponDialogBinding = this.f89727b;
        if (mCouponDialogBinding != null) {
            return mCouponDialogBinding;
        }
        throw new IllegalStateException("Illegal fragment state (" + getViewLifecycleOwner().getLifecycle().b() + ") for view binding");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    private final c.b.C1710b v() {
        return (c.b.C1710b) this.f89728c.getValue();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    public final int getTheme() {
        return R$style.m_CouponDialogTheme;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        g.d(this).y(this);
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f89727b = MCouponDialogBinding.inflate(inflater, viewGroup, false);
        ConstraintLayout constraintLayout = u().getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        this.f89727b = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        this.f89727b = MCouponDialogBinding.bind(view);
        MCouponDialogBinding u11 = u();
        TextAtomView description = u11.description;
        Intrinsics.checkNotNullExpressionValue(description, "description");
        TextAtomHolderKt.bindOrGone$default(description, v().d(), null, 2, null);
        TextAtomView title = u11.title;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        TextAtomHolderKt.bindOrGone$default(title, v().e(), null, 2, null);
        u11.closeIv.setIcon(Integer.valueOf(R$drawable.ic_m_cross));
        u11.closeIv.setOnClickListener(new BS.a(this, 14));
        DataButtonView submitButton = u11.submitButton;
        Intrinsics.checkNotNullExpressionValue(submitButton, "submitButton");
        DataButtonHolderKt.bindOrGone$default(submitButton, v().b(), null, 2, null);
        u11.submitButton.setOnClickListener(new ViewOnClickListenerC2448a(this, 15));
        if (v().a() != null) {
            LottieAnimationView animationCoupon = u11.animationCoupon;
            Intrinsics.checkNotNullExpressionValue(animationCoupon, "animationCoupon");
            s.d(animationCoupon);
            LottieAnimationView animationConfetti = u11.animationConfetti;
            Intrinsics.checkNotNullExpressionValue(animationConfetti, "animationConfetti");
            s.d(animationConfetti);
            u11.animationCoupon.playAnimation();
            u11.animationConfetti.postDelayed(new W(u11, 5), 300L);
        } else {
            LottieAnimationView animationCoupon2 = u11.animationCoupon;
            Intrinsics.checkNotNullExpressionValue(animationCoupon2, "animationCoupon");
            s.a(animationCoupon2);
            LottieAnimationView animationConfetti2 = u11.animationConfetti;
            Intrinsics.checkNotNullExpressionValue(animationConfetti2, "animationConfetti");
            s.a(animationConfetti2);
        }
        AppCompatImageView imageCoupon = u11.imageCoupon;
        Intrinsics.checkNotNullExpressionValue(imageCoupon, "imageCoupon");
        ImageViewExtKt.loadImageOrGone(imageCoupon, v().c());
    }
}

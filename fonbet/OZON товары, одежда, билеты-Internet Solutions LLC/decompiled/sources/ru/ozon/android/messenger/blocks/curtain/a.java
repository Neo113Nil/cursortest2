package ru.ozon.android.messenger.blocks.curtain;

import Az.ViewOnClickListenerC2453a;
import Sc.InterfaceC4008j;
import Sc.k;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.utils.e;
import ru.ozon.android.messenger.utils.g;
import ru.ozon.app.android.messenger.R$color;
import ru.ozon.app.android.messenger.databinding.MChatCurtainModalBlockBinding;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.component.sheet.SheetDialog;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/android/messenger/blocks/curtain/a;", "Lcom/google/android/material/bottomsheet/b;", "", "<init>", "()V", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a extends com.google.android.material.bottomsheet.b {

    /* renamed from: a, reason: collision with root package name */
    public ru.ozon.android.messenger.framework.navigation.controller.a f84967a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f84968b = k.b(new C1487a());

    /* renamed from: c, reason: collision with root package name */
    private MChatCurtainModalBlockBinding f84969c;

    /* renamed from: ru.ozon.android.messenger.blocks.curtain.a$a, reason: collision with other inner class name */
    static final class C1487a extends AbstractC7737t implements Function0<c> {
        C1487a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final c invoke() {
            return (c) g.c(a.this, "PRODUCT_SHELF_MODAL_ARG_KEY", c.class);
        }
    }

    private final c t() {
        return (c) this.f84968b.getValue();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        g.d(this).J(this);
        super.onCreate(bundle);
    }

    @Override // com.google.android.material.bottomsheet.b, androidx.appcompat.app.x, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NotNull
    public final Dialog onCreateDialog(Bundle bundle) {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        return new SheetDialog(requireContext, 0, true, 0, true, true, null, null, false, false, null, false, 0, false, null, 32714, null);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        MChatCurtainModalBlockBinding inflate = MChatCurtainModalBlockBinding.inflate(inflater, viewGroup, false);
        this.f84969c = inflate;
        Intrinsics.f(inflate);
        LinearLayoutCompat linearLayoutCompat = inflate.root;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        linearLayoutCompat.setBackgroundColor(styleParser.parseColor(requireContext, t().getBackgroundColor(), R$color.layer_floor_1));
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "apply(...)");
        return linearLayoutCompat;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        super.onDestroyView();
        this.f84969c = null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        Map<String, MessengerTrackingInfo> e11 = t().e();
        if (e11 != null) {
            ru.ozon.android.messenger.framework.navigation.controller.a aVar = this.f84967a;
            if (aVar == null) {
                Intrinsics.n("controller");
                throw null;
            }
            aVar.g(ru.ozon.android.messenger.framework.analytics.a.a(e11));
        }
        super.onDismiss(dialog);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onResume() {
        super.onResume();
        Map<String, MessengerTrackingInfo> e11 = t().e();
        if (e11 != null) {
            ru.ozon.android.messenger.framework.navigation.controller.a aVar = this.f84967a;
            if (aVar != null) {
                aVar.s(e11);
            } else {
                Intrinsics.n("controller");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        int i11;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        MChatCurtainModalBlockBinding mChatCurtainModalBlockBinding = this.f84969c;
        Intrinsics.f(mChatCurtainModalBlockBinding);
        Image iconIv = mChatCurtainModalBlockBinding.iconIv;
        Intrinsics.checkNotNullExpressionValue(iconIv, "iconIv");
        ImageHolderKt.bindOrGone$default(iconIv, t().b(), null, 2, null);
        TextAtomV2View textAtomV2View = mChatCurtainModalBlockBinding.titleTv;
        Intrinsics.f(textAtomV2View);
        TextHolderKt.bindOrGone$default(textAtomV2View, t().d(), null, 2, null);
        ViewGroup.LayoutParams layoutParams = textAtomV2View.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i12 = 0;
        marginLayoutParams.topMargin = t().b() == null ? e.f91913j : 0;
        textAtomV2View.setLayoutParams(marginLayoutParams);
        TextAtomV2View subtitleTv = mChatCurtainModalBlockBinding.subtitleTv;
        Intrinsics.checkNotNullExpressionValue(subtitleTv, "subtitleTv");
        TextHolderKt.bindOrGone$default(subtitleTv, t().c(), null, 2, null);
        mChatCurtainModalBlockBinding.buttonsContainerLl.removeAllViews();
        List<ButtonV3DTO> a11 = t().a();
        if (a11 != null) {
            for (Object obj : a11) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C7714v.O0();
                    throw null;
                }
                ButtonV3DTO buttonV3DTO = (ButtonV3DTO) obj;
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                List<ButtonV3DTO> a12 = t().a();
                if (a12 == null || i12 != C7714v.P(a12)) {
                    i11 = e.f91910g;
                    layoutParams2.bottomMargin = i11;
                }
                Context requireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                ButtonV3View buttonV3View = new ButtonV3View(requireContext, null, 0, 0, 14, null);
                ButtonV3HolderKt.bind$default(buttonV3View, buttonV3DTO, null, 2, null);
                buttonV3View.setOnClickListener(new ViewOnClickListenerC2453a(6, buttonV3DTO, this));
                mChatCurtainModalBlockBinding.buttonsContainerLl.addView(buttonV3View, layoutParams2);
                i12 = i13;
            }
        }
    }
}

package ru.ozon.app.android.account.orders.commonBarcodeV2;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.bottomsheet.b;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.plugins.PluginsManager;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.barcodecache.R$string;
import ru.ozon.app.android.delivery.customActionsHandlers.sharebarcode.ShareBarcodeAnalytics;
import ru.ozon.app.android.delivery.customActionsHandlers.sharebarcode.ShareBarcodeDelegate;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.component.sheet.SheetDialog;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniTextStyles;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0003J\u0019\u0010\u0017\u001a\u00020\u00162\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/account/orders/commonBarcodeV2/ShareBarcodeBottomSheetFragment;", "Lcom/google/android/material/bottomsheet/b;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleView", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "buttonView", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "Lru/ozon/app/android/delivery/customActionsHandlers/sharebarcode/ShareBarcodeDelegate;", "shareBarcodeDelegate", "Lru/ozon/app/android/delivery/customActionsHandlers/sharebarcode/ShareBarcodeDelegate;", "Lru/ozon/app/android/delivery/customActionsHandlers/sharebarcode/ShareBarcodeAnalytics;", "shareBarcodeAnalytics", "Lru/ozon/app/android/delivery/customActionsHandlers/sharebarcode/ShareBarcodeAnalytics;", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ShareBarcodeBottomSheetFragment extends b {
    private ButtonV3View buttonView;
    private ShareBarcodeAnalytics shareBarcodeAnalytics;

    @NotNull
    private final ShareBarcodeDelegate shareBarcodeDelegate = new ShareBarcodeDelegate();
    private TextAtomV2View subtitleView;
    private TextAtomV2View titleView;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/account/orders/commonBarcodeV2/ShareBarcodeBottomSheetFragment$Companion;", "", "<init>", "()V", "ARG_CODE", "", "ARG_VISIBLE_CODE", "ARG_OBJECT_TYPE", "SHARE_ICON", "TEXT_MAX_LINES", "", "newInstance", "Lru/ozon/app/android/account/orders/commonBarcodeV2/ShareBarcodeBottomSheetFragment;", "code", "visibleCode", "objectType", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ShareBarcodeBottomSheetFragment newInstance$default(Companion companion, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                str3 = null;
            }
            return companion.newInstance(str, str2, str3);
        }

        @NotNull
        public final ShareBarcodeBottomSheetFragment newInstance(@NotNull String code, @NotNull String visibleCode, String objectType) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(visibleCode, "visibleCode");
            ShareBarcodeBottomSheetFragment shareBarcodeBottomSheetFragment = new ShareBarcodeBottomSheetFragment();
            Bundle bundle = new Bundle();
            bundle.putString("code", code);
            bundle.putString("visibleCode", visibleCode);
            bundle.putString("objectType", objectType);
            shareBarcodeBottomSheetFragment.setArguments(bundle);
            return shareBarcodeBottomSheetFragment;
        }

        private Companion() {
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (AnalyticsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(context, AnalyticsComponentApi.class).getDependencyStorage();
        if (AnalyticsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsComponentApi is not DiComponent");
        }
        AnalyticsDataLayer analyticsDataLayer = ((AnalyticsComponentApi) dependencyStorage.b(AnalyticsComponentApi.class)).getAnalyticsDataLayer();
        if (AnalyticsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsComponentApi is not DiComponent");
        }
        C6740b dependencyStorage2 = C6739a.a(context, AnalyticsComponentApi.class).getDependencyStorage();
        if (AnalyticsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsComponentApi is not DiComponent");
        }
        PluginsManager pluginsManager = ((AnalyticsComponentApi) dependencyStorage2.b(AnalyticsComponentApi.class)).getPluginsManager();
        if (AnalyticsScreenStorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsScreenStorageComponentApi is not DiComponent");
        }
        C6740b dependencyStorage3 = C6739a.a(context, AnalyticsScreenStorageComponentApi.class).getDependencyStorage();
        if (AnalyticsScreenStorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsScreenStorageComponentApi is not DiComponent");
        }
        ShareBarcodeAnalytics shareBarcodeAnalytics = new ShareBarcodeAnalytics(analyticsDataLayer, pluginsManager, ((AnalyticsScreenStorageComponentApi) dependencyStorage3.b(AnalyticsScreenStorageComponentApi.class)).getAnalyticsScreenStorage());
        this.shareBarcodeAnalytics = shareBarcodeAnalytics;
        shareBarcodeAnalytics.init(this);
    }

    @Override // com.google.android.material.bottomsheet.b, androidx.appcompat.app.x, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NotNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        return new SheetDialog(requireContext, 0, false, 0, true, true, null, null, false, false, null, false, 0, false, null, 32718, null);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        LinearLayout linearLayout = new LinearLayout(requireContext());
        linearLayout.setId(View.generateViewId());
        linearLayout.setOrientation(1);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        int px = ResourceExtKt.toPx(8, requireContext);
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        int px2 = ResourceExtKt.toPx(10, requireContext2);
        Context requireContext3 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
        int px3 = ResourceExtKt.toPx(16, requireContext3);
        Context requireContext4 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
        int px4 = ResourceExtKt.toPx(24, requireContext4);
        linearLayout.setPadding(px3, px3, px3, px2);
        Context requireContext5 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext5, "requireContext(...)");
        TextAtomV2View textAtomV2View = new TextAtomV2View(requireContext5, null, 0, 6, null);
        linearLayout.addView(textAtomV2View);
        this.titleView = textAtomV2View;
        Context requireContext6 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext6, "requireContext(...)");
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(requireContext6, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, px, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        textAtomV2View2.setLayoutParams(layoutParams);
        linearLayout.addView(textAtomV2View2);
        this.subtitleView = textAtomV2View2;
        Context requireContext7 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext7, "requireContext(...)");
        ButtonV3View buttonV3View = new ButtonV3View(requireContext7, null, 0, 0, 14, null);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin, px4, ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
        buttonV3View.setLayoutParams(layoutParams2);
        linearLayout.addView(buttonV3View);
        this.buttonView = buttonV3View;
        return linearLayout;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        super.onDestroyView();
        this.titleView = null;
        this.subtitleView = null;
        this.buttonView = null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        TextAtomV2View textAtomV2View = this.titleView;
        if (textAtomV2View != null) {
            TextHolderKt.bind$default(textAtomV2View, new TextDTO(OzonSpannableStringKt.toOzonSpannableString(StringProvider.getString(R$string.barcode_info_sharing_modal_title)), null, null, CommonCellSettings.LayoutPadding.PADDING_900, null, null, TextPreset.PRESET_CUSTOM, UniTextStyles.HEADLINE_700_X_LARGE.getToken(), null, null, null, null, null, false, null, null, null, null, 99, 261942, null), null, 2, null);
        }
        TextAtomV2View textAtomV2View2 = this.subtitleView;
        if (textAtomV2View2 != null) {
            TextHolderKt.bind$default(textAtomV2View2, new TextDTO(OzonSpannableStringKt.toOzonSpannableString(StringProvider.getString(R$string.barcode_info_sharing_modal_subtitle)), null, null, null, null, null, TextPreset.PRESET_CUSTOM, UniTextStyles.BODY_500_MEDIUM.getToken(), UniColors.TEXT_SECONDARY.getToken(), null, null, null, null, false, null, null, null, null, 99, 261694, null), null, 2, null);
        }
        ButtonV3View buttonV3View = this.buttonView;
        if (buttonV3View != null) {
            ButtonV3HolderKt.bind(buttonV3View, new ButtonV3DTO(null, ButtonV3DTO.Sizes.SIZE_600, StringProvider.getString(R$string.share), null, "ic_m_share_universal_filled", null, null, null, null, null, null, null, null, new CommonControlSettings(new AtomActionDTO(AtomActionDTO.Behavior.CUSTOM, null, null, null, 14, null), null, null, 6, null), null, null, null, null, 253929, null), new ShareBarcodeBottomSheetFragment$onViewCreated$1(this));
        }
        ShareBarcodeAnalytics shareBarcodeAnalytics = this.shareBarcodeAnalytics;
        if (shareBarcodeAnalytics == null) {
            Intrinsics.n("shareBarcodeAnalytics");
            throw null;
        }
        Bundle arguments = getArguments();
        shareBarcodeAnalytics.shareButtonView(arguments != null ? arguments.getString("objectType") : null, StringProvider.getString(R$string.share));
    }
}

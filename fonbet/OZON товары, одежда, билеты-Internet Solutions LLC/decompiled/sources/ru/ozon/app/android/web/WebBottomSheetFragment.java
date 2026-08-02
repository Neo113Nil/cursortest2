package ru.ozon.app.android.web;

import HY.d;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.G;
import androidx.fragment.app.Q;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.feature.common.web.R$id;
import ru.ozon.app.android.feature.common.web.R$layout;
import ru.ozon.app.android.feature.common.web.R$string;
import ru.ozon.app.android.feature.common.web.databinding.FragmentWebBottomSheetBinding;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.uikit.view.dialog.OzonBottomSheetDialog;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.app.android.web.WebFragment;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0013H\u0016J\u0012\u0010\u001b\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0006\u0010\u001e\u001a\u00020\u0013R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006 "}, d2 = {"Lru/ozon/app/android/web/WebBottomSheetFragment;", "Lru/ozon/app/android/web/ClosableWebViewBottomSheetFragment;", "Lru/ozon/app/android/web/OnReceiveTitleListener;", "<init>", "()V", "mBinding", "Lru/ozon/app/android/feature/common/web/databinding/FragmentWebBottomSheetBinding;", "binding", "getBinding", "()Lru/ozon/app/android/feature/common/web/databinding/FragmentWebBottomSheetBinding;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "onCreateDialog", "Lru/ozon/app/android/uikit/view/dialog/OzonBottomSheetDialog;", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "onDestroyView", "receiveTitle", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "closeFragment", "Companion", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WebBottomSheetFragment extends ClosableWebViewBottomSheetFragment implements OnReceiveTitleListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private FragmentWebBottomSheetBinding mBinding;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/web/WebBottomSheetFragment$Companion;", "", "<init>", "()V", "EXTRA_URL", "", "EXTRA_DISMISS_AND_REDIRECT_URL", "EXTRA_IS_WRAP_CONTENT", "EXTRA_IS_TITLE_VISIBLE", "EXTRA_IS_CLOSE_BUTTON_VISIBLE", "newInstance", "Lru/ozon/app/android/web/WebBottomSheetFragment;", ImagesContract.URL, "dismissAndRedirectUrl", "isWrapContent", "", "isTitleVisible", "isCloseButtonVisible", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ WebBottomSheetFragment newInstance$default(Companion companion, String str, String str2, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                z11 = false;
            }
            return companion.newInstance(str, str2, z11, (i11 & 8) != 0 ? true : z12, (i11 & 16) != 0 ? true : z13);
        }

        @NotNull
        public final WebBottomSheetFragment newInstance(@NotNull String url, String dismissAndRedirectUrl, boolean isWrapContent, boolean isTitleVisible, boolean isCloseButtonVisible) {
            Intrinsics.checkNotNullParameter(url, "url");
            WebBottomSheetFragment webBottomSheetFragment = new WebBottomSheetFragment();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_URL", url);
            bundle.putString("EXTRA_DISMISS_AND_REDIRECT_URL", dismissAndRedirectUrl);
            bundle.putBoolean("EXTRA_IS_WRAP_CONTENT", isWrapContent);
            bundle.putBoolean("EXTRA_IS_TITLE_VISIBLE", isTitleVisible);
            bundle.putBoolean("EXTRA_IS_CLOSE_BUTTON_VISIBLE", isCloseButtonVisible);
            webBottomSheetFragment.setArguments(bundle);
            return webBottomSheetFragment;
        }

        private Companion() {
        }
    }

    private final FragmentWebBottomSheetBinding getBinding() {
        FragmentWebBottomSheetBinding fragmentWebBottomSheetBinding = this.mBinding;
        Intrinsics.f(fragmentWebBottomSheetBinding);
        return fragmentWebBottomSheetBinding;
    }

    public final void closeFragment() {
        dismiss();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.mBinding = FragmentWebBottomSheetBinding.bind(View.inflate(requireContext(), R$layout.fragment_web_bottom_sheet, null));
        LinearLayout constraintLayout = getBinding().getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        super.onDestroyView();
        this.mBinding = null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        KeyboardUtilsKt.hideKeyboard(this);
    }

    @Override // ru.ozon.app.android.web.ClosableWebViewBottomSheetFragment, androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        String string;
        Intrinsics.checkNotNullParameter(view, "view");
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("EXTRA_URL")) == null) {
            closeFragment();
            return;
        }
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("EXTRA_DISMISS_AND_REDIRECT_URL") : null;
        Bundle arguments3 = getArguments();
        boolean z11 = true;
        boolean z12 = arguments3 != null ? arguments3.getBoolean("EXTRA_IS_TITLE_VISIBLE", true) : true;
        Bundle arguments4 = getArguments();
        boolean z13 = arguments4 != null ? arguments4.getBoolean("EXTRA_IS_CLOSE_BUTTON_VISIBLE", true) : true;
        ConstraintLayout headerCl = getBinding().headerCl;
        Intrinsics.checkNotNullExpressionValue(headerCl, "headerCl");
        if (!z12 && !z13) {
            z11 = false;
        }
        ViewExtKt.showOrGone(headerCl, Boolean.valueOf(z11));
        TextView titleTv = getBinding().titleTv;
        Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
        ViewExtKt.showOrGone(titleTv, Boolean.valueOf(z12));
        ImageView closeIv = getBinding().closeIv;
        Intrinsics.checkNotNullExpressionValue(closeIv, "closeIv");
        ViewExtKt.showOrGone(closeIv, Boolean.valueOf(z13));
        if (getChildFragmentManager().f0(R$id.containerFcv) == null) {
            G childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            Q p11 = childFragmentManager.p();
            Intrinsics.checkNotNullExpressionValue(p11, "beginTransaction(...)");
            p11.c(WebFragment.Companion.newInstance$default(WebFragment.INSTANCE, string, true, string2, false, false, false, false, false, false, false, false, false, 3760, null), R$id.containerFcv);
            p11.i();
            childFragmentManager.c0();
        }
        getBinding().closeIv.setOnClickListener(new d(this, 0));
        super.onViewCreated(view, savedInstanceState);
    }

    @Override // ru.ozon.app.android.web.OnReceiveTitleListener
    public void receiveTitle(String title) {
        if (title == null || h.K(title)) {
            getBinding().titleTv.setText(StringProvider.getString(R$string.web_webview_title));
        } else {
            getBinding().titleTv.setText(title);
        }
    }

    @Override // com.google.android.material.bottomsheet.b, androidx.appcompat.app.x, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NotNull
    public OzonBottomSheetDialog onCreateDialog(Bundle savedInstanceState) {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Bundle arguments = getArguments();
        return new OzonBottomSheetDialog(requireContext, 0, 0, true, null, true, arguments != null ? arguments.getBoolean("EXTRA_IS_WRAP_CONTENT", false) : false, false, Integer.valueOf(ResourceExtKt.toPx(300)), false, 662, null);
    }
}

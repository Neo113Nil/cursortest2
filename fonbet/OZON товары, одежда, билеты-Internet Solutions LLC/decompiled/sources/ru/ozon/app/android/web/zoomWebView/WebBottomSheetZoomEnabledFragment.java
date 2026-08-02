package ru.ozon.app.android.web.zoomWebView;

import DS.a;
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
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.feature.common.web.R$id;
import ru.ozon.app.android.feature.common.web.R$string;
import ru.ozon.app.android.feature.common.web.databinding.FragmentWebBottomSheetZoomBinding;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.uikit.view.dialog.OzonBottomSheetDialog;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.app.android.web.ClosableWebViewBottomSheetFragment;
import ru.ozon.app.android.web.OnReceiveTitleListener;
import ru.ozon.app.android.web.WebFragment;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001#B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J$\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0012\u0010\u001b\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u000fH\u0016J\u0012\u0010\u001f\u001a\u00020\u000f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0006\u0010\"\u001a\u00020\u000fR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lru/ozon/app/android/web/zoomWebView/WebBottomSheetZoomEnabledFragment;", "Lru/ozon/app/android/web/ClosableWebViewBottomSheetFragment;", "Lru/ozon/app/android/web/OnReceiveTitleListener;", "<init>", "()V", "mBinding", "Lru/ozon/app/android/feature/common/web/databinding/FragmentWebBottomSheetZoomBinding;", "binding", "getBinding", "()Lru/ozon/app/android/feature/common/web/databinding/FragmentWebBottomSheetZoomBinding;", "dialog", "Lru/ozon/app/android/uikit/view/dialog/OzonBottomSheetDialog;", "zoomEndedCallback", "Lkotlin/Function1;", "", "", "scrollEndedCallback", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "onCreateDialog", "onDismiss", "Landroid/content/DialogInterface;", "onDestroyView", "receiveTitle", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "closeFragment", "Companion", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WebBottomSheetZoomEnabledFragment extends ClosableWebViewBottomSheetFragment implements OnReceiveTitleListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int minHeightDp = ResourceExtKt.toPx(300);
    private OzonBottomSheetDialog dialog;
    private FragmentWebBottomSheetZoomBinding mBinding;

    @NotNull
    private final Function1<Boolean, Unit> zoomEndedCallback = new WebBottomSheetZoomEnabledFragment$zoomEndedCallback$1(this);

    @NotNull
    private final Function1<Boolean, Unit> scrollEndedCallback = new WebBottomSheetZoomEnabledFragment$scrollEndedCallback$1(this);

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/web/zoomWebView/WebBottomSheetZoomEnabledFragment$Companion;", "", "<init>", "()V", "EXTRA_URL", "", "EXTRA_DISMISS_AND_REDIRECT_URL", "EXTRA_IS_WRAP_CONTENT", "EXTRA_IS_TITLE_VISIBLE", "EXTRA_IS_CLOSE_BUTTON_VISIBLE", "minHeightDp", "", "newInstance", "Lru/ozon/app/android/web/zoomWebView/WebBottomSheetZoomEnabledFragment;", ImagesContract.URL, "dismissAndRedirectUrl", "isWrapContent", "", "isTitleVisible", "isCloseButtonVisible", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final WebBottomSheetZoomEnabledFragment newInstance(@NotNull String url, String dismissAndRedirectUrl, boolean isWrapContent, boolean isTitleVisible, boolean isCloseButtonVisible) {
            Intrinsics.checkNotNullParameter(url, "url");
            WebBottomSheetZoomEnabledFragment webBottomSheetZoomEnabledFragment = new WebBottomSheetZoomEnabledFragment();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_URL", url);
            bundle.putString("EXTRA_DISMISS_AND_REDIRECT_URL", dismissAndRedirectUrl);
            bundle.putBoolean("EXTRA_IS_WRAP_CONTENT", isWrapContent);
            bundle.putBoolean("EXTRA_IS_TITLE_VISIBLE", isTitleVisible);
            bundle.putBoolean("EXTRA_IS_CLOSE_BUTTON_VISIBLE", isCloseButtonVisible);
            webBottomSheetZoomEnabledFragment.setArguments(bundle);
            return webBottomSheetZoomEnabledFragment;
        }

        private Companion() {
        }
    }

    private final FragmentWebBottomSheetZoomBinding getBinding() {
        FragmentWebBottomSheetZoomBinding fragmentWebBottomSheetZoomBinding = this.mBinding;
        Intrinsics.f(fragmentWebBottomSheetZoomBinding);
        return fragmentWebBottomSheetZoomBinding;
    }

    public final void closeFragment() {
        dismiss();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.mBinding = FragmentWebBottomSheetZoomBinding.inflate(inflater, container, false);
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
        getBinding().scaledNestedScrollView.setZoomEndedCallback(this.zoomEndedCallback);
        getBinding().scaledNestedScrollView.setHorizontalScrollingEndedCallback(this.scrollEndedCallback);
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
        FragmentWebBottomSheetZoomBinding binding = getBinding();
        ConstraintLayout headerCl = binding.headerCl;
        Intrinsics.checkNotNullExpressionValue(headerCl, "headerCl");
        if (!z12 && !z13) {
            z11 = false;
        }
        ViewExtKt.showOrGone(headerCl, Boolean.valueOf(z11));
        TextView titleTv = binding.titleTv;
        Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
        ViewExtKt.showOrGone(titleTv, Boolean.valueOf(z12));
        ImageView closeIv = binding.closeIv;
        Intrinsics.checkNotNullExpressionValue(closeIv, "closeIv");
        ViewExtKt.showOrGone(closeIv, Boolean.valueOf(z13));
        if (getChildFragmentManager().f0(R$id.containerFcv) == null) {
            G childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            Q p11 = childFragmentManager.p();
            Intrinsics.checkNotNullExpressionValue(p11, "beginTransaction(...)");
            p11.c(WebFragment.Companion.newInstance$default(WebFragment.INSTANCE, string, true, string2, false, false, false, false, false, true, false, false, false, 3760, null), R$id.containerFcv);
            p11.i();
            childFragmentManager.c0();
        }
        getBinding().closeIv.setOnClickListener(new a(this, 4));
        super.onViewCreated(view, savedInstanceState);
    }

    @Override // ru.ozon.app.android.web.OnReceiveTitleListener
    public void receiveTitle(String title) {
        TextView textView = getBinding().titleTv;
        if (title == null || h.K(title)) {
            title = StringProvider.getString(R$string.web_webview_title);
        }
        textView.setText(title);
    }

    @Override // com.google.android.material.bottomsheet.b, androidx.appcompat.app.x, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NotNull
    public OzonBottomSheetDialog onCreateDialog(Bundle savedInstanceState) {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Bundle arguments = getArguments();
        OzonBottomSheetDialog ozonBottomSheetDialog = new OzonBottomSheetDialog(requireContext, 0, 0, true, null, true, arguments != null ? arguments.getBoolean("EXTRA_IS_WRAP_CONTENT", false) : false, false, Integer.valueOf(minHeightDp), false, 662, null);
        this.dialog = ozonBottomSheetDialog;
        return ozonBottomSheetDialog;
    }
}

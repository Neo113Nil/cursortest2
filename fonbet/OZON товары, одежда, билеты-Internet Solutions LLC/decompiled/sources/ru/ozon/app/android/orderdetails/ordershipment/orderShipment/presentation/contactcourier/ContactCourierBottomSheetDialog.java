package ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.contactcourier;

import XU.a;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orderdetails.databinding.BottomSheetContactCourierBinding;
import ru.ozon.app.android.uikit.view.dialog.OzonBottomSheetDialog;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u00182\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u0003R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/contactcourier/ContactCourierBottomSheetDialog;", "Lcom/google/android/material/bottomsheet/b;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "isIntentSafe", "(Landroid/content/Context;Landroid/content/Intent;)Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "onDestroyView", "Lru/ozon/app/android/orderdetails/databinding/BottomSheetContactCourierBinding;", "binding", "Lru/ozon/app/android/orderdetails/databinding/BottomSheetContactCourierBinding;", "Companion", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ContactCourierBottomSheetDialog extends b {
    private BottomSheetContactCourierBinding binding;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/contactcourier/ContactCourierBottomSheetDialog$Companion;", "", "<init>", "()V", "TAG", "", "COURIER_INFO", "newInstance", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/contactcourier/ContactCourierBottomSheetDialog;", "courierInfo", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/contactcourier/CourierInfo;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ContactCourierBottomSheetDialog newInstance(@NotNull CourierInfo courierInfo) {
            Intrinsics.checkNotNullParameter(courierInfo, "courierInfo");
            ContactCourierBottomSheetDialog contactCourierBottomSheetDialog = new ContactCourierBottomSheetDialog();
            Bundle bundle = new Bundle();
            bundle.putParcelable("courierInfo", courierInfo);
            contactCourierBottomSheetDialog.setArguments(bundle);
            return contactCourierBottomSheetDialog;
        }

        private Companion() {
        }
    }

    @SuppressLint({"WrongConstant"})
    private final boolean isIntentSafe(Context context, Intent intent) {
        return intent.resolveActivityInfo(context.getPackageManager(), intent.getFlags()).exported;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2$lambda$0(CourierInfo courierInfo, ContactCourierBottomSheetDialog contactCourierBottomSheetDialog, View view) {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse(courierInfo.getLink()));
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (contactCourierBottomSheetDialog.isIntentSafe(context, intent)) {
            contactCourierBottomSheetDialog.startActivity(intent);
        }
    }

    @Override // com.google.android.material.bottomsheet.b, androidx.appcompat.app.x, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NotNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        return new OzonBottomSheetDialog(requireContext, 0, 4, false, null, true, true, false, null, false, 922, null);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        BottomSheetContactCourierBinding inflate = BottomSheetContactCourierBinding.inflate(inflater, null, false);
        this.binding = inflate;
        if (inflate != null) {
            return inflate.getConstraintLayout();
        }
        return null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        super.onDestroyView();
        this.binding = null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        Bundle arguments = getArguments();
        CourierInfo courierInfo = arguments != null ? (CourierInfo) arguments.getParcelable("courierInfo") : null;
        Intrinsics.f(courierInfo);
        BottomSheetContactCourierBinding bottomSheetContactCourierBinding = this.binding;
        if (bottomSheetContactCourierBinding != null) {
            bottomSheetContactCourierBinding.descriptionTv.setText(courierInfo.getTitle());
            bottomSheetContactCourierBinding.courierPhoneTv.setText(courierInfo.getFormattedPhone());
            bottomSheetContactCourierBinding.courierPhoneTv.setOnClickListener(new a(3, courierInfo, this));
            bottomSheetContactCourierBinding.contactCourierCancelTv.setOnClickListener(new AI.a(this, 16));
        }
    }
}

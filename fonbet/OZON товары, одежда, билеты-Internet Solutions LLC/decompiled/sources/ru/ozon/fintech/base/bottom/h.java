package ru.ozon.fintech.base.bottom;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.app.x;
import java.util.UUID;
import ru.ozon.fintech.base.bottom.BaseBottomSheetBehaviour;

/* loaded from: classes3.dex */
public class h extends x {
    String UNIQUE_UUID = E30.c.UNIQUE_UUID;
    public String uniqueUuid = "";
    private boolean waitingForDismissAllowingStateLoss;

    private class a extends BaseBottomSheetBehaviour.b {
        a() {
        }

        @Override // ru.ozon.fintech.base.bottom.BaseBottomSheetBehaviour.b
        public final void a(@NonNull View view, float f7) {
        }

        @Override // ru.ozon.fintech.base.bottom.BaseBottomSheetBehaviour.b
        public final void b(@NonNull View view, int i11) {
            if (i11 == 5) {
                h.this.dismissAfterAnimation();
            }
        }
    }

    private void dismissWithAnimation(@NonNull BaseBottomSheetBehaviour<?> baseBottomSheetBehaviour, boolean z11) {
        this.waitingForDismissAllowingStateLoss = z11;
        if (baseBottomSheetBehaviour.f94975x == 5) {
            dismissAfterAnimation();
            return;
        }
        if (getDialog() instanceof g) {
            ((g) getDialog()).removeDefaultCallback();
        }
        baseBottomSheetBehaviour.g(new a());
        baseBottomSheetBehaviour.setState(5);
    }

    private String generateAndPutUniqueId() {
        String uuid = UUID.randomUUID().toString();
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.putString(this.UNIQUE_UUID, uuid);
        }
        return uuid;
    }

    private boolean tryDismissWithAnimation(boolean z11) {
        Dialog dialog = getDialog();
        if (!(dialog instanceof g)) {
            return false;
        }
        boolean z12 = ((g) dialog).c().f94972u;
        return false;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    public void dismiss() {
        if (tryDismissWithAnimation(false)) {
            return;
        }
        super.dismiss();
    }

    public void dismissAfterAnimation() {
        if (this.waitingForDismissAllowingStateLoss) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    public void dismissAllowingStateLoss() {
        if (tryDismissWithAnimation(true)) {
            return;
        }
        super.dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle bundle) {
        Bundle arguments = getArguments();
        if (arguments == null) {
            setArguments(new Bundle());
        }
        if (arguments == null || arguments.getString(this.UNIQUE_UUID) == null) {
            this.uniqueUuid = generateAndPutUniqueId();
        } else {
            this.uniqueUuid = getArguments().getString(this.UNIQUE_UUID);
        }
        super.onCreate(bundle);
    }

    @Override // androidx.appcompat.app.x, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        return new g(getContext(), getTheme());
    }
}

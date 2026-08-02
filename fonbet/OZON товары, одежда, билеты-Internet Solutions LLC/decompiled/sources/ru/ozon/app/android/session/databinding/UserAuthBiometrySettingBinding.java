package ru.ozon.app.android.session.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.switchmaterial.SwitchMaterial;
import ru.ozon.app.android.session.R$id;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes2.dex */
public final class UserAuthBiometrySettingBinding implements a {

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final View separator;

    @NonNull
    public final TextAtomView subtitleTav;

    @NonNull
    public final TextAtomView titleTav;

    @NonNull
    public final SwitchMaterial toggleSw;

    private UserAuthBiometrySettingBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2, @NonNull SwitchMaterial switchMaterial) {
        this.rootView = constraintLayout;
        this.separator = view;
        this.subtitleTav = textAtomView;
        this.titleTav = textAtomView2;
        this.toggleSw = switchMaterial;
    }

    @NonNull
    public static UserAuthBiometrySettingBinding bind(@NonNull View view) {
        int i11 = R$id.separator;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            i11 = R$id.subtitleTav;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                i11 = R$id.titleTav;
                TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView2 != null) {
                    i11 = R$id.toggleSw;
                    SwitchMaterial switchMaterial = (SwitchMaterial) C2548q.d(i11, view);
                    if (switchMaterial != null) {
                        return new UserAuthBiometrySettingBinding((ConstraintLayout) view, d11, textAtomView, textAtomView2, switchMaterial);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}

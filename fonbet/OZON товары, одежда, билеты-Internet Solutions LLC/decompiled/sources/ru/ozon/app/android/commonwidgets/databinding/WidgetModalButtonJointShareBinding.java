package ru.ozon.app.android.commonwidgets.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;

/* loaded from: classes11.dex */
public final class WidgetModalButtonJointShareBinding implements a {

    @NonNull
    private final SmallIconButtonView rootView;

    @NonNull
    public final SmallIconButtonView smallIconButtonView;

    private WidgetModalButtonJointShareBinding(@NonNull SmallIconButtonView smallIconButtonView, @NonNull SmallIconButtonView smallIconButtonView2) {
        this.rootView = smallIconButtonView;
        this.smallIconButtonView = smallIconButtonView2;
    }

    @NonNull
    public static WidgetModalButtonJointShareBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        SmallIconButtonView smallIconButtonView = (SmallIconButtonView) view;
        return new WidgetModalButtonJointShareBinding(smallIconButtonView, smallIconButtonView);
    }

    @Override // X4.a
    @NonNull
    public SmallIconButtonView getRoot() {
        return this.rootView;
    }
}

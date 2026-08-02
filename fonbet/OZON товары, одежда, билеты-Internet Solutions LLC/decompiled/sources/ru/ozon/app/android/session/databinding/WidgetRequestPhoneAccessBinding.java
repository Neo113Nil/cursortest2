package ru.ozon.app.android.session.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.session.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes2.dex */
public final class WidgetRequestPhoneAccessBinding implements a {

    @NonNull
    public final TextAtomView help;

    @NonNull
    public final LinearLayoutCompat permissionsContainer;

    @NonNull
    public final LargeButtonView requestButton;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final LargeButtonView skipButton;

    @NonNull
    public final TextAtomView subtitle;

    @NonNull
    public final TextAtomView title;

    private WidgetRequestPhoneAccessBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextAtomView textAtomView, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LargeButtonView largeButtonView, @NonNull LargeButtonView largeButtonView2, @NonNull TextAtomView textAtomView2, @NonNull TextAtomView textAtomView3) {
        this.rootView = constraintLayout;
        this.help = textAtomView;
        this.permissionsContainer = linearLayoutCompat;
        this.requestButton = largeButtonView;
        this.skipButton = largeButtonView2;
        this.subtitle = textAtomView2;
        this.title = textAtomView3;
    }

    @NonNull
    public static WidgetRequestPhoneAccessBinding bind(@NonNull View view) {
        int i11 = R$id.help;
        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
        if (textAtomView != null) {
            i11 = R$id.permissionsContainer;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) C2548q.d(i11, view);
            if (linearLayoutCompat != null) {
                i11 = R$id.requestButton;
                LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
                if (largeButtonView != null) {
                    i11 = R$id.skipButton;
                    LargeButtonView largeButtonView2 = (LargeButtonView) C2548q.d(i11, view);
                    if (largeButtonView2 != null) {
                        i11 = R$id.subtitle;
                        TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                        if (textAtomView2 != null) {
                            i11 = R$id.title;
                            TextAtomView textAtomView3 = (TextAtomView) C2548q.d(i11, view);
                            if (textAtomView3 != null) {
                                return new WidgetRequestPhoneAccessBinding((ConstraintLayout) view, textAtomView, linearLayoutCompat, largeButtonView, largeButtonView2, textAtomView2, textAtomView3);
                            }
                        }
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

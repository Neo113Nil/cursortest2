package ru.ozon.app.android.travel.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.travel.feature.b2b.R$id;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes12.dex */
public final class WidgetTravelModalPersonalManagerBinding implements a {

    @NonNull
    public final View modalPersonalManagerBackgroundView;

    @NonNull
    public final VerticalAtomsLayout modalPersonalManagerButtonsVAL;

    @NonNull
    public final RecyclerView modalPersonalManagerContentListRV;

    @NonNull
    public final AppCompatImageView modalPersonalManagerLogoIV;

    @NonNull
    public final TextAtomView modalPersonalManagerNotificationTAV;

    @NonNull
    public final TextAtomView modalPersonalManagerTitleTAV;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetTravelModalPersonalManagerBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull RecyclerView recyclerView, @NonNull AppCompatImageView appCompatImageView, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2) {
        this.rootView = constraintLayout;
        this.modalPersonalManagerBackgroundView = view;
        this.modalPersonalManagerButtonsVAL = verticalAtomsLayout;
        this.modalPersonalManagerContentListRV = recyclerView;
        this.modalPersonalManagerLogoIV = appCompatImageView;
        this.modalPersonalManagerNotificationTAV = textAtomView;
        this.modalPersonalManagerTitleTAV = textAtomView2;
    }

    @NonNull
    public static WidgetTravelModalPersonalManagerBinding bind(@NonNull View view) {
        int i11 = R$id.modalPersonalManagerBackgroundView;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            i11 = R$id.modalPersonalManagerButtonsVAL;
            VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
            if (verticalAtomsLayout != null) {
                i11 = R$id.modalPersonalManagerContentListRV;
                RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                if (recyclerView != null) {
                    i11 = R$id.modalPersonalManagerLogoIV;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
                    if (appCompatImageView != null) {
                        i11 = R$id.modalPersonalManagerNotificationTAV;
                        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                        if (textAtomView != null) {
                            i11 = R$id.modalPersonalManagerTitleTAV;
                            TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                            if (textAtomView2 != null) {
                                return new WidgetTravelModalPersonalManagerBinding((ConstraintLayout) view, d11, verticalAtomsLayout, recyclerView, appCompatImageView, textAtomView, textAtomView2);
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

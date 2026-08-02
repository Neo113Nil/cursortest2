package ru.ozon.app.android.travel.feature.railway.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import ru.ozon.app.android.atoms.v3.containers.VerticalRecyclerContainer;
import ru.ozon.app.android.travel.feature.railway.R$id;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes4.dex */
public final class WidgetTravelCarriageDetailsBinding implements a {

    @NonNull
    public final TextAtomView carriageDetailsHeaderTextView;

    @NonNull
    public final TextAtomView carriageDetailsMainInfoTextView;

    @NonNull
    public final VerticalRecyclerContainer carriageDetailsServices;

    @NonNull
    public final Group carriageDetailsServicesGroup;

    @NonNull
    public final TextAtomView carriageDetailsServicesHeader;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomView serviceDetailsAdditionalInfoTextView;

    private WidgetTravelCarriageDetailsBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2, @NonNull VerticalRecyclerContainer verticalRecyclerContainer, @NonNull Group group, @NonNull TextAtomView textAtomView3, @NonNull TextAtomView textAtomView4) {
        this.rootView = constraintLayout;
        this.carriageDetailsHeaderTextView = textAtomView;
        this.carriageDetailsMainInfoTextView = textAtomView2;
        this.carriageDetailsServices = verticalRecyclerContainer;
        this.carriageDetailsServicesGroup = group;
        this.carriageDetailsServicesHeader = textAtomView3;
        this.serviceDetailsAdditionalInfoTextView = textAtomView4;
    }

    @NonNull
    public static WidgetTravelCarriageDetailsBinding bind(@NonNull View view) {
        int i11 = R$id.carriageDetailsHeaderTextView;
        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
        if (textAtomView != null) {
            i11 = R$id.carriageDetailsMainInfoTextView;
            TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView2 != null) {
                i11 = R$id.carriageDetailsServices;
                VerticalRecyclerContainer verticalRecyclerContainer = (VerticalRecyclerContainer) C2548q.d(i11, view);
                if (verticalRecyclerContainer != null) {
                    i11 = R$id.carriageDetailsServicesGroup;
                    Group group = (Group) C2548q.d(i11, view);
                    if (group != null) {
                        i11 = R$id.carriageDetailsServicesHeader;
                        TextAtomView textAtomView3 = (TextAtomView) C2548q.d(i11, view);
                        if (textAtomView3 != null) {
                            i11 = R$id.serviceDetailsAdditionalInfoTextView;
                            TextAtomView textAtomView4 = (TextAtomView) C2548q.d(i11, view);
                            if (textAtomView4 != null) {
                                return new WidgetTravelCarriageDetailsBinding((ConstraintLayout) view, textAtomView, textAtomView2, verticalRecyclerContainer, group, textAtomView3, textAtomView4);
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

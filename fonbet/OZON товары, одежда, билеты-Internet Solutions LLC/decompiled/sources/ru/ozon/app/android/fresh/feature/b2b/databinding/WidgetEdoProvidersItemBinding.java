package ru.ozon.app.android.fresh.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.fresh.feature.b2b.R$id;
import ru.ozon.app.android.fresh.feature.b2b.R$layout;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.disclosure.disclosureTitleSubtitleCell.DisclosureTitleSubtitleCellView;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

/* loaded from: classes12.dex */
public final class WidgetEdoProvidersItemBinding implements a {

    @NonNull
    public final DisclosureTitleSubtitleCellView edoId;

    @NonNull
    public final SingleAtom infoBadge;

    @NonNull
    public final ImageView removeButton;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomV2View title;

    private WidgetEdoProvidersItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull DisclosureTitleSubtitleCellView disclosureTitleSubtitleCellView, @NonNull SingleAtom singleAtom, @NonNull ImageView imageView, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = constraintLayout;
        this.edoId = disclosureTitleSubtitleCellView;
        this.infoBadge = singleAtom;
        this.removeButton = imageView;
        this.title = textAtomV2View;
    }

    @NonNull
    public static WidgetEdoProvidersItemBinding bind(@NonNull View view) {
        int i11 = R$id.edoId;
        DisclosureTitleSubtitleCellView disclosureTitleSubtitleCellView = (DisclosureTitleSubtitleCellView) C2548q.d(i11, view);
        if (disclosureTitleSubtitleCellView != null) {
            i11 = R$id.infoBadge;
            SingleAtom singleAtom = (SingleAtom) C2548q.d(i11, view);
            if (singleAtom != null) {
                i11 = R$id.removeButton;
                ImageView imageView = (ImageView) C2548q.d(i11, view);
                if (imageView != null) {
                    i11 = R$id.title;
                    TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View != null) {
                        return new WidgetEdoProvidersItemBinding((ConstraintLayout) view, disclosureTitleSubtitleCellView, singleAtom, imageView, textAtomV2View);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static WidgetEdoProvidersItemBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.widget_edo_providers_item, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}

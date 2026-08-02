package ru.ozon.app.android.fresh.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.fresh.feature.b2b.R$id;
import ru.ozon.app.android.fresh.feature.b2b.R$layout;
import ru.ozon.uni.android.atom.loader.ui.LoaderView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.button.IconButtonView;

/* loaded from: classes12.dex */
public final class WidgetLegalDetailsEditorFileFieldBinding implements a {

    @NonNull
    public final Layer clickableAreaF;

    @NonNull
    public final TextView description;

    @NonNull
    public final IconButtonView iconButton;

    @NonNull
    public final TextAtomV2View label;

    @NonNull
    public final LoaderView loaderView;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomV2View title;

    private WidgetLegalDetailsEditorFileFieldBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Layer layer, @NonNull TextView textView, @NonNull IconButtonView iconButtonView, @NonNull TextAtomV2View textAtomV2View, @NonNull LoaderView loaderView, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = constraintLayout;
        this.clickableAreaF = layer;
        this.description = textView;
        this.iconButton = iconButtonView;
        this.label = textAtomV2View;
        this.loaderView = loaderView;
        this.title = textAtomV2View2;
    }

    @NonNull
    public static WidgetLegalDetailsEditorFileFieldBinding bind(@NonNull View view) {
        int i11 = R$id.clickableAreaF;
        Layer layer = (Layer) C2548q.d(i11, view);
        if (layer != null) {
            i11 = R$id.description;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.iconButton;
                IconButtonView iconButtonView = (IconButtonView) C2548q.d(i11, view);
                if (iconButtonView != null) {
                    i11 = R$id.label;
                    TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View != null) {
                        i11 = R$id.loaderView;
                        LoaderView loaderView = (LoaderView) C2548q.d(i11, view);
                        if (loaderView != null) {
                            i11 = R$id.title;
                            TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                            if (textAtomV2View2 != null) {
                                return new WidgetLegalDetailsEditorFileFieldBinding((ConstraintLayout) view, layer, textView, iconButtonView, textAtomV2View, loaderView, textAtomV2View2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static WidgetLegalDetailsEditorFileFieldBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.widget_legal_details_editor_file_field, viewGroup, false);
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

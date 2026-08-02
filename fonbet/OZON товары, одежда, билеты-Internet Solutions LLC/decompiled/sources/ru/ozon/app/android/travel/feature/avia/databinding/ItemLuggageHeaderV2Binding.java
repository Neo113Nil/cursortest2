package ru.ozon.app.android.travel.feature.avia.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.feature.avia.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes8.dex */
public final class ItemLuggageHeaderV2Binding implements a {

    @NonNull
    public final TextAtomView luggageHeaderV2SubtitleTextView;

    @NonNull
    public final TextAtomView luggageHeaderV2TitleTextView;

    @NonNull
    private final LinearLayout rootView;

    private ItemLuggageHeaderV2Binding(@NonNull LinearLayout linearLayout, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2) {
        this.rootView = linearLayout;
        this.luggageHeaderV2SubtitleTextView = textAtomView;
        this.luggageHeaderV2TitleTextView = textAtomView2;
    }

    @NonNull
    public static ItemLuggageHeaderV2Binding bind(@NonNull View view) {
        int i11 = R$id.luggageHeaderV2SubtitleTextView;
        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
        if (textAtomView != null) {
            i11 = R$id.luggageHeaderV2TitleTextView;
            TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView2 != null) {
                return new ItemLuggageHeaderV2Binding((LinearLayout) view, textAtomView, textAtomView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemLuggageHeaderV2Binding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_luggage_header_v2, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

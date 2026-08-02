package ru.ozon.app.android.pdp.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.pdp.R$id;

/* loaded from: classes13.dex */
public final class PdpWidgetMarkdownBinding implements a {

    @NonNull
    public final RecyclerView characteristicsRv;

    @NonNull
    public final TextView markdownDescriptionTv;

    @NonNull
    public final TextView markdownDetailsTv;

    @NonNull
    public final TextView markdownTitleTv;

    @NonNull
    private final ConstraintLayout rootView;

    private PdpWidgetMarkdownBinding(@NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = constraintLayout;
        this.characteristicsRv = recyclerView;
        this.markdownDescriptionTv = textView;
        this.markdownDetailsTv = textView2;
        this.markdownTitleTv = textView3;
    }

    @NonNull
    public static PdpWidgetMarkdownBinding bind(@NonNull View view) {
        int i11 = R$id.characteristicsRv;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            i11 = R$id.markdownDescriptionTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.markdownDetailsTv;
                TextView textView2 = (TextView) C2548q.d(i11, view);
                if (textView2 != null) {
                    i11 = R$id.markdownTitleTv;
                    TextView textView3 = (TextView) C2548q.d(i11, view);
                    if (textView3 != null) {
                        return new PdpWidgetMarkdownBinding((ConstraintLayout) view, recyclerView, textView, textView2, textView3);
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

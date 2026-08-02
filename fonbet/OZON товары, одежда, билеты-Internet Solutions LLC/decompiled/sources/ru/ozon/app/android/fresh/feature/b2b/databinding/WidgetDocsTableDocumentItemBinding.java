package ru.ozon.app.android.fresh.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.fresh.feature.b2b.R$id;
import ru.ozon.app.android.fresh.feature.b2b.R$layout;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;

/* loaded from: classes12.dex */
public final class WidgetDocsTableDocumentItemBinding implements a {

    @NonNull
    public final HorizontalFlexAtomsLayout controlsAtom;

    @NonNull
    public final WidgetDocsTableHeaderBinding header;

    @NonNull
    public final TextAtomV2View info;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final WidgetDocsTableStatusBinding status;

    @NonNull
    public final TextAtomV2View text;

    private WidgetDocsTableDocumentItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull HorizontalFlexAtomsLayout horizontalFlexAtomsLayout, @NonNull WidgetDocsTableHeaderBinding widgetDocsTableHeaderBinding, @NonNull TextAtomV2View textAtomV2View, @NonNull WidgetDocsTableStatusBinding widgetDocsTableStatusBinding, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = constraintLayout;
        this.controlsAtom = horizontalFlexAtomsLayout;
        this.header = widgetDocsTableHeaderBinding;
        this.info = textAtomV2View;
        this.status = widgetDocsTableStatusBinding;
        this.text = textAtomV2View2;
    }

    @NonNull
    public static WidgetDocsTableDocumentItemBinding bind(@NonNull View view) {
        View d11;
        View d12;
        int i11 = R$id.controlsAtom;
        HorizontalFlexAtomsLayout horizontalFlexAtomsLayout = (HorizontalFlexAtomsLayout) C2548q.d(i11, view);
        if (horizontalFlexAtomsLayout != null && (d11 = C2548q.d((i11 = R$id.header), view)) != null) {
            WidgetDocsTableHeaderBinding bind = WidgetDocsTableHeaderBinding.bind(d11);
            i11 = R$id.info;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View != null && (d12 = C2548q.d((i11 = R$id.status), view)) != null) {
                WidgetDocsTableStatusBinding bind2 = WidgetDocsTableStatusBinding.bind(d12);
                i11 = R$id.text;
                TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View2 != null) {
                    return new WidgetDocsTableDocumentItemBinding((ConstraintLayout) view, horizontalFlexAtomsLayout, bind, textAtomV2View, bind2, textAtomV2View2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static WidgetDocsTableDocumentItemBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.widget_docs_table_document_item, viewGroup, false);
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

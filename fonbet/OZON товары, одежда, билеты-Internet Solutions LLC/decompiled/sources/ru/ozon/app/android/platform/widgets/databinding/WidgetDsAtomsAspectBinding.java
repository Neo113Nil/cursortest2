package ru.ozon.app.android.platform.widgets.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.platform.widgets.R$id;
import ru.ozon.uni.android.atom.aspect.AspectView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes13.dex */
public final class WidgetDsAtomsAspectBinding implements a {

    @NonNull
    public final AspectView aspectView;

    @NonNull
    private final AspectView rootView;

    @NonNull
    public final TextAtomV2View textAtom;

    private WidgetDsAtomsAspectBinding(@NonNull AspectView aspectView, @NonNull AspectView aspectView2, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = aspectView;
        this.aspectView = aspectView2;
        this.textAtom = textAtomV2View;
    }

    @NonNull
    public static WidgetDsAtomsAspectBinding bind(@NonNull View view) {
        AspectView aspectView = (AspectView) view;
        int i11 = R$id.textAtom;
        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
        if (textAtomV2View != null) {
            return new WidgetDsAtomsAspectBinding(aspectView, aspectView, textAtomV2View);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public AspectView getConstraintLayout() {
        return this.rootView;
    }
}

package ru.ozon.app.android.fresh.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.fresh.feature.b2b.R$id;
import ru.ozon.uni.android.atom.loader.ui.LoaderView;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

/* loaded from: classes12.dex */
public final class SelectFileLayoutBinding implements a {

    @NonNull
    public final IconButtonV3View attachFileButton;

    @NonNull
    public final ConstraintLayout clickableAreaAttachFile;

    @NonNull
    public final LoaderView loaderView;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView subtitle;

    @NonNull
    public final TextView title;

    private SelectFileLayoutBinding(@NonNull ConstraintLayout constraintLayout, @NonNull IconButtonV3View iconButtonV3View, @NonNull ConstraintLayout constraintLayout2, @NonNull LoaderView loaderView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = constraintLayout;
        this.attachFileButton = iconButtonV3View;
        this.clickableAreaAttachFile = constraintLayout2;
        this.loaderView = loaderView;
        this.subtitle = textView;
        this.title = textView2;
    }

    @NonNull
    public static SelectFileLayoutBinding bind(@NonNull View view) {
        int i11 = R$id.attachFileButton;
        IconButtonV3View iconButtonV3View = (IconButtonV3View) C2548q.d(i11, view);
        if (iconButtonV3View != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i11 = R$id.loaderView;
            LoaderView loaderView = (LoaderView) C2548q.d(i11, view);
            if (loaderView != null) {
                i11 = R$id.subtitle;
                TextView textView = (TextView) C2548q.d(i11, view);
                if (textView != null) {
                    i11 = R$id.title;
                    TextView textView2 = (TextView) C2548q.d(i11, view);
                    if (textView2 != null) {
                        return new SelectFileLayoutBinding(constraintLayout, iconButtonV3View, constraintLayout, loaderView, textView, textView2);
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

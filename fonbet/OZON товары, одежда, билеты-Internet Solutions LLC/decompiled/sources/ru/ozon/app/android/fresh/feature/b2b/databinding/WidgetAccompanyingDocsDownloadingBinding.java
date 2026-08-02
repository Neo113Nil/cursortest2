package ru.ozon.app.android.fresh.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.fresh.feature.b2b.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes12.dex */
public final class WidgetAccompanyingDocsDownloadingBinding implements a {

    @NonNull
    public final VerticalAtomsLayout cellListView;

    @NonNull
    public final SmallBorderlessButtonView notificationButton;

    @NonNull
    public final LinearLayout notificationLayout;

    @NonNull
    public final TextAtomV2View notificationText;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView title;

    private WidgetAccompanyingDocsDownloadingBinding(@NonNull LinearLayout linearLayout, @NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull SmallBorderlessButtonView smallBorderlessButtonView, @NonNull LinearLayout linearLayout2, @NonNull TextAtomV2View textAtomV2View, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.cellListView = verticalAtomsLayout;
        this.notificationButton = smallBorderlessButtonView;
        this.notificationLayout = linearLayout2;
        this.notificationText = textAtomV2View;
        this.title = textView;
    }

    @NonNull
    public static WidgetAccompanyingDocsDownloadingBinding bind(@NonNull View view) {
        int i11 = R$id.cellListView;
        VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
        if (verticalAtomsLayout != null) {
            i11 = R$id.notificationButton;
            SmallBorderlessButtonView smallBorderlessButtonView = (SmallBorderlessButtonView) C2548q.d(i11, view);
            if (smallBorderlessButtonView != null) {
                i11 = R$id.notificationLayout;
                LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
                if (linearLayout != null) {
                    i11 = R$id.notificationText;
                    TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View != null) {
                        i11 = R$id.title;
                        TextView textView = (TextView) C2548q.d(i11, view);
                        if (textView != null) {
                            return new WidgetAccompanyingDocsDownloadingBinding((LinearLayout) view, verticalAtomsLayout, smallBorderlessButtonView, linearLayout, textAtomV2View, textView);
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
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}

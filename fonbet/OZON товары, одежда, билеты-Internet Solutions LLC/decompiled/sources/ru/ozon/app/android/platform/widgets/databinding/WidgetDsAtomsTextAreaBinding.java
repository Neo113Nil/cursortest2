package ru.ozon.app.android.platform.widgets.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.uni.android.textArea.TextAreaView;

/* loaded from: classes13.dex */
public final class WidgetDsAtomsTextAreaBinding implements a {

    @NonNull
    private final TextAreaView rootView;

    @NonNull
    public final TextAreaView textArea;

    private WidgetDsAtomsTextAreaBinding(@NonNull TextAreaView textAreaView, @NonNull TextAreaView textAreaView2) {
        this.rootView = textAreaView;
        this.textArea = textAreaView2;
    }

    @NonNull
    public static WidgetDsAtomsTextAreaBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextAreaView textAreaView = (TextAreaView) view;
        return new WidgetDsAtomsTextAreaBinding(textAreaView, textAreaView);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public TextAreaView getConstraintLayout() {
        return this.rootView;
    }
}

package ru.ozon.app.android.regulardraw.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.regulardraw.R$layout;

/* loaded from: classes13.dex */
public final class MorkovskHintDialogLayoutBinding implements a {

    @NonNull
    public final FrameLayout rootDialogContainer;

    @NonNull
    private final FrameLayout rootView;

    private MorkovskHintDialogLayoutBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.rootDialogContainer = frameLayout2;
    }

    @NonNull
    public static MorkovskHintDialogLayoutBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new MorkovskHintDialogLayoutBinding(frameLayout, frameLayout);
    }

    @NonNull
    public static MorkovskHintDialogLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.morkovsk_hint_dialog_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}

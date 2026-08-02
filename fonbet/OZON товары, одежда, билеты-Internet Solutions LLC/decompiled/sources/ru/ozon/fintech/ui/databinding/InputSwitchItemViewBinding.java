package ru.ozon.fintech.ui.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.R;

/* loaded from: classes3.dex */
public final class InputSwitchItemViewBinding implements a {

    @NonNull
    public final View background;

    @NonNull
    public final TextView firstText;

    @NonNull
    private final View rootView;

    @NonNull
    public final TextView secondText;

    private InputSwitchItemViewBinding(@NonNull View view, @NonNull View view2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = view;
        this.background = view2;
        this.firstText = textView;
        this.secondText = textView2;
    }

    @NonNull
    public static InputSwitchItemViewBinding bind(@NonNull View view) {
        int i11 = R.id.background;
        View d11 = C2548q.d(R.id.background, view);
        if (d11 != null) {
            i11 = R.id.first_text;
            TextView textView = (TextView) C2548q.d(R.id.first_text, view);
            if (textView != null) {
                i11 = R.id.second_text;
                TextView textView2 = (TextView) C2548q.d(R.id.second_text, view);
                if (textView2 != null) {
                    return new InputSwitchItemViewBinding(view, d11, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static InputSwitchItemViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.input_switch_item_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}

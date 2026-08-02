package ru.ozon.app.android.debugmenu.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import ru.ozon.app.android.debugmenu.R$id;
import ru.ozon.app.android.debugmenu.R$layout;

/* loaded from: classes11.dex */
public final class ActivityVersionBinding implements a {

    @NonNull
    public final TextInputEditText appVersionEt;

    @NonNull
    public final TextView appVersionHint;

    @NonNull
    public final TextInputLayout appVersionTil;

    @NonNull
    public final Button clearVersionBtn;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final Button saveVersionBtn;

    @NonNull
    public final Toolbar toolbar;

    private ActivityVersionBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextInputEditText textInputEditText, @NonNull TextView textView, @NonNull TextInputLayout textInputLayout, @NonNull Button button, @NonNull Button button2, @NonNull Toolbar toolbar) {
        this.rootView = constraintLayout;
        this.appVersionEt = textInputEditText;
        this.appVersionHint = textView;
        this.appVersionTil = textInputLayout;
        this.clearVersionBtn = button;
        this.saveVersionBtn = button2;
        this.toolbar = toolbar;
    }

    @NonNull
    public static ActivityVersionBinding bind(@NonNull View view) {
        int i11 = R$id.appVersionEt;
        TextInputEditText textInputEditText = (TextInputEditText) C2548q.d(i11, view);
        if (textInputEditText != null) {
            i11 = R$id.appVersionHint;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.appVersionTil;
                TextInputLayout textInputLayout = (TextInputLayout) C2548q.d(i11, view);
                if (textInputLayout != null) {
                    i11 = R$id.clearVersionBtn;
                    Button button = (Button) C2548q.d(i11, view);
                    if (button != null) {
                        i11 = R$id.saveVersionBtn;
                        Button button2 = (Button) C2548q.d(i11, view);
                        if (button2 != null) {
                            i11 = R$id.toolbar;
                            Toolbar toolbar = (Toolbar) C2548q.d(i11, view);
                            if (toolbar != null) {
                                return new ActivityVersionBinding((ConstraintLayout) view, textInputEditText, textView, textInputLayout, button, button2, toolbar);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ActivityVersionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityVersionBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.activity_version, viewGroup, false);
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

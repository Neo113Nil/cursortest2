package ru.ozon.app.android.abtool.databinding;

import X4.a;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* loaded from: classes11.dex */
public final class ServiceHeaderHolderBinding implements a {

    @NonNull
    private final TextView rootView;

    private ServiceHeaderHolderBinding(@NonNull TextView textView) {
        this.rootView = textView;
    }

    @NonNull
    public static ServiceHeaderHolderBinding bind(@NonNull View view) {
        if (view != null) {
            return new ServiceHeaderHolderBinding((TextView) view);
        }
        throw new NullPointerException("rootView");
    }

    @Override // X4.a
    @NonNull
    public TextView getRoot() {
        return this.rootView;
    }
}

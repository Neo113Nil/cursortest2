package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import ru.ozon.app.android.messenger.R$id;

/* loaded from: classes12.dex */
public final class MContextMenuItemBinding implements a {

    @NonNull
    public final LinearLayout contextMenuButton;

    @NonNull
    public final AppCompatImageView menuIcon;

    @NonNull
    public final TextView menuLabel;

    @NonNull
    private final LinearLayout rootView;

    private MContextMenuItemBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull AppCompatImageView appCompatImageView, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.contextMenuButton = linearLayout2;
        this.menuIcon = appCompatImageView;
        this.menuLabel = textView;
    }

    @NonNull
    public static MContextMenuItemBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i11 = R$id.menuIcon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
        if (appCompatImageView != null) {
            i11 = R$id.menuLabel;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                return new MContextMenuItemBinding(linearLayout, linearLayout, appCompatImageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

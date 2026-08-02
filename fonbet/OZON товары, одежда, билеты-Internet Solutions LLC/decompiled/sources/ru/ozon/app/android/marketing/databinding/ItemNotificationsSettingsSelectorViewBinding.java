package ru.ozon.app.android.marketing.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.marketing.R$id;
import ru.ozon.app.android.marketing.R$layout;

/* loaded from: classes12.dex */
public final class ItemNotificationsSettingsSelectorViewBinding implements a {

    @NonNull
    private final View rootView;

    @NonNull
    public final RadioButton variantStateRb;

    @NonNull
    public final TextView variantSubtitleTv;

    @NonNull
    public final TextView variantTitleTv;

    private ItemNotificationsSettingsSelectorViewBinding(@NonNull View view, @NonNull RadioButton radioButton, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = view;
        this.variantStateRb = radioButton;
        this.variantSubtitleTv = textView;
        this.variantTitleTv = textView2;
    }

    @NonNull
    public static ItemNotificationsSettingsSelectorViewBinding bind(@NonNull View view) {
        int i11 = R$id.variantStateRb;
        RadioButton radioButton = (RadioButton) C2548q.d(i11, view);
        if (radioButton != null) {
            i11 = R$id.variantSubtitleTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.variantTitleTv;
                TextView textView2 = (TextView) C2548q.d(i11, view);
                if (textView2 != null) {
                    return new ItemNotificationsSettingsSelectorViewBinding(view, radioButton, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemNotificationsSettingsSelectorViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.item_notifications_settings_selector_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}

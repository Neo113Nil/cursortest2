package ru.ozon.uni.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import ru.ozon.uni.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;

/* loaded from: classes4.dex */
public final class NotificationWithIconViewUniBinding implements a {

    @NonNull
    public final SmallButtonView btn;

    @NonNull
    public final ImageView disclosureIv;

    @NonNull
    public final ImageView iconIv;

    @NonNull
    private final View rootView;

    @NonNull
    public final AppCompatTextView subtitleTv;

    @NonNull
    public final AppCompatTextView titleTv;

    private NotificationWithIconViewUniBinding(@NonNull View view, @NonNull SmallButtonView smallButtonView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2) {
        this.rootView = view;
        this.btn = smallButtonView;
        this.disclosureIv = imageView;
        this.iconIv = imageView2;
        this.subtitleTv = appCompatTextView;
        this.titleTv = appCompatTextView2;
    }

    @NonNull
    public static NotificationWithIconViewUniBinding bind(@NonNull View view) {
        int i11 = R$id.btn;
        SmallButtonView smallButtonView = (SmallButtonView) C2548q.d(i11, view);
        if (smallButtonView != null) {
            i11 = R$id.disclosureIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                i11 = R$id.iconIv;
                ImageView imageView2 = (ImageView) C2548q.d(i11, view);
                if (imageView2 != null) {
                    i11 = R$id.subtitleTv;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
                    if (appCompatTextView != null) {
                        i11 = R$id.titleTv;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2548q.d(i11, view);
                        if (appCompatTextView2 != null) {
                            return new NotificationWithIconViewUniBinding(view, smallButtonView, imageView, imageView2, appCompatTextView, appCompatTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}

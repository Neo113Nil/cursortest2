package ru.ozon.uni.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import ru.ozon.uni.R$id;
import ru.ozon.uni.android.atom.timer.TimerView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;

/* loaded from: classes4.dex */
public final class NotificationViewUniBinding implements a {

    @NonNull
    public final SmallButtonView btn;

    @NonNull
    public final ImageView disclosureIv;

    @NonNull
    private final View rootView;

    @NonNull
    public final AppCompatTextView subtitleTv;

    @NonNull
    public final TimerView timerV;

    @NonNull
    public final AppCompatTextView titleTv;

    private NotificationViewUniBinding(@NonNull View view, @NonNull SmallButtonView smallButtonView, @NonNull ImageView imageView, @NonNull AppCompatTextView appCompatTextView, @NonNull TimerView timerView, @NonNull AppCompatTextView appCompatTextView2) {
        this.rootView = view;
        this.btn = smallButtonView;
        this.disclosureIv = imageView;
        this.subtitleTv = appCompatTextView;
        this.timerV = timerView;
        this.titleTv = appCompatTextView2;
    }

    @NonNull
    public static NotificationViewUniBinding bind(@NonNull View view) {
        int i11 = R$id.btn;
        SmallButtonView smallButtonView = (SmallButtonView) C2548q.d(i11, view);
        if (smallButtonView != null) {
            i11 = R$id.disclosureIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                i11 = R$id.subtitleTv;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
                if (appCompatTextView != null) {
                    i11 = R$id.timerV;
                    TimerView timerView = (TimerView) C2548q.d(i11, view);
                    if (timerView != null) {
                        i11 = R$id.titleTv;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2548q.d(i11, view);
                        if (appCompatTextView2 != null) {
                            return new NotificationViewUniBinding(view, smallButtonView, imageView, appCompatTextView, timerView, appCompatTextView2);
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
    public View getConstraintLayout() {
        return this.rootView;
    }
}

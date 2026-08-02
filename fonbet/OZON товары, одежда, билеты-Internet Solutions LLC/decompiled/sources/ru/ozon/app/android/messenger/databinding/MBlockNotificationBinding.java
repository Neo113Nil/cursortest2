package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.flexbox.FlexboxLayout;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;

/* loaded from: classes12.dex */
public final class MBlockNotificationBinding implements a {

    @NonNull
    public final FlexboxLayout badgesFbl;

    @NonNull
    public final ImageView blurIv;

    @NonNull
    public final FlexboxLayout buttonsFbl;

    @NonNull
    public final LinearLayout contentLl;

    @NonNull
    public final ImageView imageIv;

    @NonNull
    public final ConstraintLayout notificationContainerCl;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView sendTimeTv;

    private MBlockNotificationBinding(@NonNull ConstraintLayout constraintLayout, @NonNull FlexboxLayout flexboxLayout, @NonNull ImageView imageView, @NonNull FlexboxLayout flexboxLayout2, @NonNull LinearLayout linearLayout, @NonNull ImageView imageView2, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.badgesFbl = flexboxLayout;
        this.blurIv = imageView;
        this.buttonsFbl = flexboxLayout2;
        this.contentLl = linearLayout;
        this.imageIv = imageView2;
        this.notificationContainerCl = constraintLayout2;
        this.sendTimeTv = textView;
    }

    @NonNull
    public static MBlockNotificationBinding bind(@NonNull View view) {
        int i11 = R$id.badgesFbl;
        FlexboxLayout flexboxLayout = (FlexboxLayout) C2548q.d(i11, view);
        if (flexboxLayout != null) {
            i11 = R$id.blurIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                i11 = R$id.buttonsFbl;
                FlexboxLayout flexboxLayout2 = (FlexboxLayout) C2548q.d(i11, view);
                if (flexboxLayout2 != null) {
                    i11 = R$id.contentLl;
                    LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
                    if (linearLayout != null) {
                        i11 = R$id.imageIv;
                        ImageView imageView2 = (ImageView) C2548q.d(i11, view);
                        if (imageView2 != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                            i11 = R$id.sendTimeTv;
                            TextView textView = (TextView) C2548q.d(i11, view);
                            if (textView != null) {
                                return new MBlockNotificationBinding(constraintLayout, flexboxLayout, imageView, flexboxLayout2, linearLayout, imageView2, constraintLayout, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MBlockNotificationBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_block_notification, viewGroup, false);
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

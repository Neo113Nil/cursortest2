package ru.ozon.app.android.marketing.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.marketing.R$id;
import ru.ozon.app.android.marketing.R$layout;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes12.dex */
public final class ViewAllowPushSuccessBinding implements a {

    @NonNull
    public final ImageView decorRightIV;

    @NonNull
    private final View rootView;

    @NonNull
    public final TextAtomV2View titleTav;

    private ViewAllowPushSuccessBinding(@NonNull View view, @NonNull ImageView imageView, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = view;
        this.decorRightIV = imageView;
        this.titleTav = textAtomV2View;
    }

    @NonNull
    public static ViewAllowPushSuccessBinding bind(@NonNull View view) {
        int i11 = R$id.decorRightIV;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.titleTav;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View != null) {
                return new ViewAllowPushSuccessBinding(view, imageView, textAtomV2View);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ViewAllowPushSuccessBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.view_allow_push_success, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}

package ru.ozon.fintech.features.camera.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.textatomV2.TextAtomV2WrapperView;

/* loaded from: classes3.dex */
public final class TextTipsViewBinding implements a {

    @NonNull
    public final View fadeItem;

    @NonNull
    private final View rootView;

    @NonNull
    public final TextAtomV2WrapperView tvItem1;

    @NonNull
    public final TextAtomV2WrapperView tvItem2;

    private TextTipsViewBinding(@NonNull View view, @NonNull View view2, @NonNull TextAtomV2WrapperView textAtomV2WrapperView, @NonNull TextAtomV2WrapperView textAtomV2WrapperView2) {
        this.rootView = view;
        this.fadeItem = view2;
        this.tvItem1 = textAtomV2WrapperView;
        this.tvItem2 = textAtomV2WrapperView2;
    }

    @NonNull
    public static TextTipsViewBinding bind(@NonNull View view) {
        int i11 = R.id.fade_item;
        View d11 = C2548q.d(R.id.fade_item, view);
        if (d11 != null) {
            i11 = R.id.tv_item1;
            TextAtomV2WrapperView textAtomV2WrapperView = (TextAtomV2WrapperView) C2548q.d(R.id.tv_item1, view);
            if (textAtomV2WrapperView != null) {
                i11 = R.id.tv_item2;
                TextAtomV2WrapperView textAtomV2WrapperView2 = (TextAtomV2WrapperView) C2548q.d(R.id.tv_item2, view);
                if (textAtomV2WrapperView2 != null) {
                    return new TextTipsViewBinding(view, d11, textAtomV2WrapperView, textAtomV2WrapperView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static TextTipsViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.text_tips_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}

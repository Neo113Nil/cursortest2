package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes12.dex */
public final class MChatCurtainModalBlockBinding implements a {

    @NonNull
    public final LinearLayout buttonsContainerLl;

    @NonNull
    public final Image iconIv;

    @NonNull
    public final LinearLayoutCompat root;

    @NonNull
    private final LinearLayoutCompat rootView;

    @NonNull
    public final TextAtomV2View subtitleTv;

    @NonNull
    public final TextAtomV2View titleTv;

    private MChatCurtainModalBlockBinding(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayout linearLayout, @NonNull Image image, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = linearLayoutCompat;
        this.buttonsContainerLl = linearLayout;
        this.iconIv = image;
        this.root = linearLayoutCompat2;
        this.subtitleTv = textAtomV2View;
        this.titleTv = textAtomV2View2;
    }

    @NonNull
    public static MChatCurtainModalBlockBinding bind(@NonNull View view) {
        int i11 = R$id.buttonsContainerLl;
        LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
        if (linearLayout != null) {
            i11 = R$id.iconIv;
            Image image = (Image) C2548q.d(i11, view);
            if (image != null) {
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
                i11 = R$id.subtitleTv;
                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View != null) {
                    i11 = R$id.titleTv;
                    TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View2 != null) {
                        return new MChatCurtainModalBlockBinding(linearLayoutCompat, linearLayout, image, linearLayoutCompat, textAtomV2View, textAtomV2View2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MChatCurtainModalBlockBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_chat_curtain_modal_block, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayoutCompat getConstraintLayout() {
        return this.rootView;
    }
}

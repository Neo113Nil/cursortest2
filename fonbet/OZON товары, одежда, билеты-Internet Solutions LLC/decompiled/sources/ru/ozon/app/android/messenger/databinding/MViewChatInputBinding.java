package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.android.messenger.blocks.input.views.PastePlainTextEditText;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

/* loaded from: classes12.dex */
public final class MViewChatInputBinding implements a {

    @NonNull
    public final ImageView attachIv;

    @NonNull
    public final ConstraintLayout inputCl;

    @NonNull
    public final PastePlainTextEditText inputEt;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final IconButtonV3View sendButtonView;

    private MViewChatInputBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout2, @NonNull PastePlainTextEditText pastePlainTextEditText, @NonNull IconButtonV3View iconButtonV3View) {
        this.rootView = constraintLayout;
        this.attachIv = imageView;
        this.inputCl = constraintLayout2;
        this.inputEt = pastePlainTextEditText;
        this.sendButtonView = iconButtonV3View;
    }

    @NonNull
    public static MViewChatInputBinding bind(@NonNull View view) {
        int i11 = R$id.attachIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i11 = R$id.inputEt;
            PastePlainTextEditText pastePlainTextEditText = (PastePlainTextEditText) C2548q.d(i11, view);
            if (pastePlainTextEditText != null) {
                i11 = R$id.sendButtonView;
                IconButtonV3View iconButtonV3View = (IconButtonV3View) C2548q.d(i11, view);
                if (iconButtonV3View != null) {
                    return new MViewChatInputBinding(constraintLayout, imageView, constraintLayout, pastePlainTextEditText, iconButtonV3View);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MViewChatInputBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_view_chat_input, viewGroup, false);
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

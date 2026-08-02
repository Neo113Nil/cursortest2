package ru.ozon.app.android.marketing.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.marketing.R$id;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

/* loaded from: classes12.dex */
public final class WidgetSellerTransparencyProfileBinding implements a {

    @NonNull
    public final TextAtomView reviewCountLabelTv;

    @NonNull
    public final TextAtomView reviewCountTv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final IconView sellerIv;

    @NonNull
    public final TextAtomView sellerNameTv;

    @NonNull
    public final SingleAtom shareBtn;

    @NonNull
    public final SingleAtom subscribeBtn;

    @NonNull
    public final TextAtomView subscriberCountLabelTv;

    @NonNull
    public final TextAtomView subscriberCountTv;

    @NonNull
    public final RecyclerView trustFactorList;

    @NonNull
    public final SingleAtom unsubscribeBtn;

    private WidgetSellerTransparencyProfileBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2, @NonNull IconView iconView, @NonNull TextAtomView textAtomView3, @NonNull SingleAtom singleAtom, @NonNull SingleAtom singleAtom2, @NonNull TextAtomView textAtomView4, @NonNull TextAtomView textAtomView5, @NonNull RecyclerView recyclerView, @NonNull SingleAtom singleAtom3) {
        this.rootView = constraintLayout;
        this.reviewCountLabelTv = textAtomView;
        this.reviewCountTv = textAtomView2;
        this.sellerIv = iconView;
        this.sellerNameTv = textAtomView3;
        this.shareBtn = singleAtom;
        this.subscribeBtn = singleAtom2;
        this.subscriberCountLabelTv = textAtomView4;
        this.subscriberCountTv = textAtomView5;
        this.trustFactorList = recyclerView;
        this.unsubscribeBtn = singleAtom3;
    }

    @NonNull
    public static WidgetSellerTransparencyProfileBinding bind(@NonNull View view) {
        int i11 = R$id.reviewCountLabelTv;
        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
        if (textAtomView != null) {
            i11 = R$id.reviewCountTv;
            TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView2 != null) {
                i11 = R$id.sellerIv;
                IconView iconView = (IconView) C2548q.d(i11, view);
                if (iconView != null) {
                    i11 = R$id.sellerNameTv;
                    TextAtomView textAtomView3 = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView3 != null) {
                        i11 = R$id.shareBtn;
                        SingleAtom singleAtom = (SingleAtom) C2548q.d(i11, view);
                        if (singleAtom != null) {
                            i11 = R$id.subscribeBtn;
                            SingleAtom singleAtom2 = (SingleAtom) C2548q.d(i11, view);
                            if (singleAtom2 != null) {
                                i11 = R$id.subscriberCountLabelTv;
                                TextAtomView textAtomView4 = (TextAtomView) C2548q.d(i11, view);
                                if (textAtomView4 != null) {
                                    i11 = R$id.subscriberCountTv;
                                    TextAtomView textAtomView5 = (TextAtomView) C2548q.d(i11, view);
                                    if (textAtomView5 != null) {
                                        i11 = R$id.trustFactorList;
                                        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                                        if (recyclerView != null) {
                                            i11 = R$id.unsubscribeBtn;
                                            SingleAtom singleAtom3 = (SingleAtom) C2548q.d(i11, view);
                                            if (singleAtom3 != null) {
                                                return new WidgetSellerTransparencyProfileBinding((ConstraintLayout) view, textAtomView, textAtomView2, iconView, textAtomView3, singleAtom, singleAtom2, textAtomView4, textAtomView5, recyclerView, singleAtom3);
                                            }
                                        }
                                    }
                                }
                            }
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
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}

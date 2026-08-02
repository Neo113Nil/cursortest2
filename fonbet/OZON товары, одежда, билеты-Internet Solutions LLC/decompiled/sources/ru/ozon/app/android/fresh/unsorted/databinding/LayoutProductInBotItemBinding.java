package ru.ozon.app.android.fresh.unsorted.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import ru.ozon.app.android.fresh.unsorted.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes12.dex */
public final class LayoutProductInBotItemBinding implements a {

    @NonNull
    public final TextAtomView aspectsTa;

    @NonNull
    public final Barrier bottomBarrier;

    @NonNull
    public final ImageView checkboxIv;

    @NonNull
    public final Group counterGroup;

    @NonNull
    public final TextView itemCountTv;

    @NonNull
    public final SmallIconButtonView minusBv;

    @NonNull
    public final SmallIconButtonView plusBv;

    @NonNull
    public final PriceView priceV;

    @NonNull
    public final ImageView productIv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final View separator;

    @NonNull
    public final TextAtomView titleTa;

    private LayoutProductInBotItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextAtomView textAtomView, @NonNull Barrier barrier, @NonNull ImageView imageView, @NonNull Group group, @NonNull TextView textView, @NonNull SmallIconButtonView smallIconButtonView, @NonNull SmallIconButtonView smallIconButtonView2, @NonNull PriceView priceView, @NonNull ImageView imageView2, @NonNull View view, @NonNull TextAtomView textAtomView2) {
        this.rootView = constraintLayout;
        this.aspectsTa = textAtomView;
        this.bottomBarrier = barrier;
        this.checkboxIv = imageView;
        this.counterGroup = group;
        this.itemCountTv = textView;
        this.minusBv = smallIconButtonView;
        this.plusBv = smallIconButtonView2;
        this.priceV = priceView;
        this.productIv = imageView2;
        this.separator = view;
        this.titleTa = textAtomView2;
    }

    @NonNull
    public static LayoutProductInBotItemBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.aspectsTa;
        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
        if (textAtomView != null) {
            i11 = R$id.bottomBarrier;
            Barrier barrier = (Barrier) C2548q.d(i11, view);
            if (barrier != null) {
                i11 = R$id.checkboxIv;
                ImageView imageView = (ImageView) C2548q.d(i11, view);
                if (imageView != null) {
                    i11 = R$id.counterGroup;
                    Group group = (Group) C2548q.d(i11, view);
                    if (group != null) {
                        i11 = R$id.itemCountTv;
                        TextView textView = (TextView) C2548q.d(i11, view);
                        if (textView != null) {
                            i11 = R$id.minusBv;
                            SmallIconButtonView smallIconButtonView = (SmallIconButtonView) C2548q.d(i11, view);
                            if (smallIconButtonView != null) {
                                i11 = R$id.plusBv;
                                SmallIconButtonView smallIconButtonView2 = (SmallIconButtonView) C2548q.d(i11, view);
                                if (smallIconButtonView2 != null) {
                                    i11 = R$id.priceV;
                                    PriceView priceView = (PriceView) C2548q.d(i11, view);
                                    if (priceView != null) {
                                        i11 = R$id.productIv;
                                        ImageView imageView2 = (ImageView) C2548q.d(i11, view);
                                        if (imageView2 != null && (d11 = C2548q.d((i11 = R$id.separator), view)) != null) {
                                            i11 = R$id.titleTa;
                                            TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                                            if (textAtomView2 != null) {
                                                return new LayoutProductInBotItemBinding((ConstraintLayout) view, textAtomView, barrier, imageView, group, textView, smallIconButtonView, smallIconButtonView2, priceView, imageView2, d11, textAtomView2);
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

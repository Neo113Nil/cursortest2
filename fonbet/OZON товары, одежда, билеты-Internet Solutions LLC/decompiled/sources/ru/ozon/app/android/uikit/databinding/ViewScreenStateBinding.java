package ru.ozon.app.android.uikit.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import me.zhanghai.android.materialprogressbar.MaterialProgressBar;
import ru.ozon.app.android.uikit.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;

/* loaded from: classes2.dex */
public final class ViewScreenStateBinding implements a {

    @NonNull
    public final TextView errorDescTv;

    @NonNull
    public final ImageView errorLogoIv;

    @NonNull
    public final SmallButtonView errorSummaryBtn;

    @NonNull
    public final TextView errorTitleTv;

    @NonNull
    public final MaterialProgressBar progress;

    @NonNull
    private final View rootView;

    @NonNull
    public final SmallButtonView screenStateActionBtn;

    @NonNull
    public final LinearLayout screenStateBtnList;

    @NonNull
    public final SmallButtonView screenStateSecondaryActionBtn;

    private ViewScreenStateBinding(@NonNull View view, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull SmallButtonView smallButtonView, @NonNull TextView textView2, @NonNull MaterialProgressBar materialProgressBar, @NonNull SmallButtonView smallButtonView2, @NonNull LinearLayout linearLayout, @NonNull SmallButtonView smallButtonView3) {
        this.rootView = view;
        this.errorDescTv = textView;
        this.errorLogoIv = imageView;
        this.errorSummaryBtn = smallButtonView;
        this.errorTitleTv = textView2;
        this.progress = materialProgressBar;
        this.screenStateActionBtn = smallButtonView2;
        this.screenStateBtnList = linearLayout;
        this.screenStateSecondaryActionBtn = smallButtonView3;
    }

    @NonNull
    public static ViewScreenStateBinding bind(@NonNull View view) {
        int i11 = R$id.errorDescTv;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            i11 = R$id.errorLogoIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                i11 = R$id.errorSummaryBtn;
                SmallButtonView smallButtonView = (SmallButtonView) C2548q.d(i11, view);
                if (smallButtonView != null) {
                    i11 = R$id.errorTitleTv;
                    TextView textView2 = (TextView) C2548q.d(i11, view);
                    if (textView2 != null) {
                        i11 = R$id.progress;
                        MaterialProgressBar materialProgressBar = (MaterialProgressBar) C2548q.d(i11, view);
                        if (materialProgressBar != null) {
                            i11 = R$id.screenStateActionBtn;
                            SmallButtonView smallButtonView2 = (SmallButtonView) C2548q.d(i11, view);
                            if (smallButtonView2 != null) {
                                i11 = R$id.screenStateBtnList;
                                LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
                                if (linearLayout != null) {
                                    i11 = R$id.screenStateSecondaryActionBtn;
                                    SmallButtonView smallButtonView3 = (SmallButtonView) C2548q.d(i11, view);
                                    if (smallButtonView3 != null) {
                                        return new ViewScreenStateBinding(view, textView, imageView, smallButtonView, textView2, materialProgressBar, smallButtonView2, linearLayout, smallButtonView3);
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
    public View getRoot() {
        return this.rootView;
    }
}

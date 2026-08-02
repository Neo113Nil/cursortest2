package com.sofascore.results.weeklyChallenge.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.sofascore.results.R;
import defpackage.nq8;
import defpackage.o8;
import defpackage.ujf;
import defpackage.yhk;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/weeklyChallenge/ui/view/UserRankingItemView;", "Lo8;", "", "getLayoutId", "()I", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UserRankingItemView extends o8 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserRankingItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.user_image;
        ImageView imageView = (ImageView) nq8.B(R.id.user_image, root);
        if (imageView != null) {
            i = R.id.user_nickname;
            TextView textView = (TextView) nq8.B(R.id.user_nickname, root);
            if (textView != null) {
                i = R.id.user_points;
                TextView textView2 = (TextView) nq8.B(R.id.user_points, root);
                if (textView2 != null) {
                    i = R.id.user_ranking;
                    TextView textView3 = (TextView) nq8.B(R.id.user_ranking, root);
                    if (textView3 != null) {
                        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, ujf.t, 0, 0);
                        try {
                            textView3.setText(obtainStyledAttributes.getString(3));
                            textView.setText(obtainStyledAttributes.getString(1));
                            textView2.setText(obtainStyledAttributes.getString(2));
                            imageView.setImageDrawable(obtainStyledAttributes.getDrawable(0));
                            return;
                        } finally {
                            obtainStyledAttributes.recycle();
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.league_user_ranking_item_view;
    }
}

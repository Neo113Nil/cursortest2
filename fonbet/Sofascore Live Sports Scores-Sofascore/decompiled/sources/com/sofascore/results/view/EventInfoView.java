package com.sofascore.results.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;
import defpackage.nq8;
import defpackage.nr1;
import defpackage.o8;
import defpackage.yhk;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/view/EventInfoView;", "Lo8;", "", "getLayoutId", "()I", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EventInfoView extends o8 {
    public static final /* synthetic */ int e = 0;
    public final nr1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.away_score;
        TextView textView = (TextView) nq8.B(R.id.away_score, root);
        if (textView != null) {
            i = R.id.dash;
            TextView textView2 = (TextView) nq8.B(R.id.dash, root);
            if (textView2 != null) {
                i = R.id.date;
                TextView textView3 = (TextView) nq8.B(R.id.date, root);
                if (textView3 != null) {
                    i = R.id.home_score;
                    TextView textView4 = (TextView) nq8.B(R.id.home_score, root);
                    if (textView4 != null) {
                        i = R.id.status;
                        TextView textView5 = (TextView) nq8.B(R.id.status, root);
                        if (textView5 != null) {
                            i = R.id.team_display_away;
                            ImageView imageView = (ImageView) nq8.B(R.id.team_display_away, root);
                            if (imageView != null) {
                                i = R.id.team_display_home;
                                ImageView imageView2 = (ImageView) nq8.B(R.id.team_display_home, root);
                                if (imageView2 != null) {
                                    this.d = new nr1((ConstraintLayout) root, textView, textView2, textView3, textView4, textView5, imageView, imageView2);
                                    return;
                                }
                            }
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
        return R.layout.event_info_view;
    }
}

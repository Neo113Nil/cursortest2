package com.sofascore.results.event.details.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.bu1;
import defpackage.hkg;
import defpackage.me4;
import defpackage.nq8;
import defpackage.o8;
import defpackage.tgj;
import defpackage.yhk;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0005J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/sofascore/results/event/details/view/HorizontalBarView;", "Lo8;", "", "getLayoutId", "()I", "af9", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HorizontalBarView extends o8 {
    public static final /* synthetic */ int e = 0;
    public final bu1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalBarView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.bar_count_end;
        TextView textView = (TextView) nq8.B(R.id.bar_count_end, root);
        if (textView != null) {
            i = R.id.bar_count_middle;
            TextView textView2 = (TextView) nq8.B(R.id.bar_count_middle, root);
            if (textView2 != null) {
                i = R.id.bar_count_start;
                TextView textView3 = (TextView) nq8.B(R.id.bar_count_start, root);
                if (textView3 != null) {
                    i = R.id.bar_end;
                    FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.bar_end, root);
                    if (frameLayout != null) {
                        i = R.id.bar_end_text;
                        TextView textView4 = (TextView) nq8.B(R.id.bar_end_text, root);
                        if (textView4 != null) {
                            i = R.id.bar_middle;
                            FrameLayout frameLayout2 = (FrameLayout) nq8.B(R.id.bar_middle, root);
                            if (frameLayout2 != null) {
                                i = R.id.bar_middle_text;
                                TextView textView5 = (TextView) nq8.B(R.id.bar_middle_text, root);
                                if (textView5 != null) {
                                    i = R.id.bar_start;
                                    FrameLayout frameLayout3 = (FrameLayout) nq8.B(R.id.bar_start, root);
                                    if (frameLayout3 != null) {
                                        i = R.id.bar_start_text;
                                        TextView textView6 = (TextView) nq8.B(R.id.bar_start_text, root);
                                        if (textView6 != null) {
                                            LinearLayout linearLayout = (LinearLayout) root;
                                            this.d = new bu1(linearLayout, textView, textView2, textView3, frameLayout, textView4, frameLayout2, textView5, frameLayout3, textView6);
                                            linearLayout.getClass();
                                            linearLayout.setVisibility(8);
                                            if (hkg.c0(context)) {
                                                frameLayout3.setBackground(context.getDrawable(R.drawable.rectangle_8dp_corners_right));
                                                frameLayout.setBackground(context.getDrawable(R.drawable.rectangle_8dp_corners_left));
                                                return;
                                            } else {
                                                frameLayout3.setBackground(context.getDrawable(R.drawable.rectangle_8dp_corners_left));
                                                frameLayout.setBackground(context.getDrawable(R.drawable.rectangle_8dp_corners_right));
                                                return;
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
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    public static void j(TextView textView, String str) {
        textView.setText(str);
        textView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        tgj.E(textView, 0L, null, 15);
    }

    public static void l(View view, float f, float f2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.getClass();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.weight = me4.b(f, 1.0f, f2, 1.0f);
        view.setLayoutParams(layoutParams2);
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.horizontal_bar_layout;
    }
}

package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.common.widget.ScrollInterceptorHorizontalScrollView;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.results.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class a8i extends g7 {
    public boolean A;
    public UniqueStage l;
    public final String m;
    public final f3i n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public j5i s;
    public final int t;
    public ta4 u;
    public Integer v;
    public final int w;
    public final int x;
    public final LayoutInflater y;
    public final tug z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8i(Context context, UniqueStage uniqueStage, String str, f3i f3iVar) {
        super(context);
        context.getClass();
        this.l = uniqueStage;
        this.m = str;
        this.n = f3iVar;
        this.o = ao2.v(4, context);
        this.p = ao2.v(12, context);
        this.q = ao2.s(36, context);
        this.r = ao2.v(72, context);
        this.t = ao2.s(12, context);
        this.u = ta4.c;
        this.w = context.getColor(R.color.neutral_highlight);
        this.x = context.getColor(R.color.surface_1);
        this.y = LayoutInflater.from(context);
        this.z = new tug();
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        if (((z7i) obj) instanceof y7i) {
            return this.s == j5i.b || cga.z(this.l);
        }
        return false;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new ame(arrayList2, arrayList, 13);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        z7i z7iVar = (z7i) obj;
        z7iVar.getClass();
        if (z7iVar instanceof y7i) {
            return 1;
        }
        if (z7iVar instanceof t7i) {
            return 2;
        }
        if (z7iVar instanceof v7i) {
            return 3;
        }
        if (z7iVar instanceof x7i) {
            return 4;
        }
        if (z7iVar instanceof w7i) {
            return 5;
        }
        zzl.b();
        return 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        int i2 = R.id.scroller;
        LayoutInflater layoutInflater = this.y;
        if (i == 1) {
            View inflate = layoutInflater.inflate(R.layout.stage_ranking_driver_row, viewGroup, false);
            int i3 = R.id.bottom_divider;
            View B = nq8.B(R.id.bottom_divider, inflate);
            if (B != null) {
                LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.column_container, inflate);
                if (linearLayout != null) {
                    i3 = R.id.driver_image;
                    ImageView imageView = (ImageView) nq8.B(R.id.driver_image, inflate);
                    if (imageView != null) {
                        i3 = R.id.driver_indicator;
                        View B2 = nq8.B(R.id.driver_indicator, inflate);
                        if (B2 != null) {
                            i3 = R.id.driver_name;
                            TextView textView = (TextView) nq8.B(R.id.driver_name, inflate);
                            if (textView != null) {
                                i3 = R.id.guideline;
                                if (((Space) nq8.B(R.id.guideline, inflate)) != null) {
                                    i3 = R.id.position;
                                    TextView textView2 = (TextView) nq8.B(R.id.position, inflate);
                                    if (textView2 != null) {
                                        i3 = R.id.rank_down;
                                        ImageView imageView2 = (ImageView) nq8.B(R.id.rank_down, inflate);
                                        if (imageView2 != null) {
                                            i3 = R.id.rank_up;
                                            ImageView imageView3 = (ImageView) nq8.B(R.id.rank_up, inflate);
                                            if (imageView3 != null) {
                                                ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView = (ScrollInterceptorHorizontalScrollView) nq8.B(R.id.scroller, inflate);
                                                if (scrollInterceptorHorizontalScrollView != null) {
                                                    i2 = R.id.team_name;
                                                    TextView textView3 = (TextView) nq8.B(R.id.team_name, inflate);
                                                    if (textView3 != null) {
                                                        return new vh(this, new p12((ConstraintLayout) inflate, B, linearLayout, imageView, B2, textView, textView2, imageView2, imageView3, scrollInterceptorHorizontalScrollView, textView3));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    i2 = R.id.column_container;
                }
                yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
                return null;
            }
            i2 = i3;
            yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
            return null;
        }
        if (i == 2) {
            View inflate2 = layoutInflater.inflate(R.layout.section_header_driver_standings, viewGroup, false);
            LinearLayout linearLayout2 = (LinearLayout) nq8.B(R.id.column_container, inflate2);
            if (linearLayout2 != null) {
                int i4 = R.id.left_button;
                ImageView imageView4 = (ImageView) nq8.B(R.id.left_button, inflate2);
                if (imageView4 != null) {
                    i4 = R.id.right_button;
                    ImageView imageView5 = (ImageView) nq8.B(R.id.right_button, inflate2);
                    if (imageView5 != null) {
                        ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView2 = (ScrollInterceptorHorizontalScrollView) nq8.B(R.id.scroller, inflate2);
                        if (scrollInterceptorHorizontalScrollView2 != null) {
                            i2 = R.id.subject;
                            TextView textView4 = (TextView) nq8.B(R.id.subject, inflate2);
                            if (textView4 != null) {
                                return new u7i(this, new djf((LinearLayout) inflate2, linearLayout2, imageView4, imageView5, scrollInterceptorHorizontalScrollView2, textView4, 4));
                            }
                        }
                    }
                }
                i2 = i4;
            } else {
                i2 = R.id.column_container;
            }
            yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i2)));
            return null;
        }
        if (i != 3) {
            if (i != 4) {
                if (i == 5) {
                    return new vh(this, h04.d(layoutInflater, viewGroup));
                }
                ilg.c();
                return null;
            }
            View inflate3 = layoutInflater.inflate(R.layout.item_legend_title, viewGroup, false);
            if (inflate3 != null) {
                return new r71(14, (TextView) inflate3);
            }
            yhk.s("rootView");
            return null;
        }
        View inflate4 = layoutInflater.inflate(R.layout.item_stage_last_updated, viewGroup, false);
        int i5 = R.id.live_indicator;
        TextView textView5 = (TextView) nq8.B(R.id.live_indicator, inflate4);
        if (textView5 != null) {
            i5 = R.id.update_time;
            TextView textView6 = (TextView) nq8.B(R.id.update_time, inflate4);
            if (textView6 != null) {
                return new ja9(new t22((LinearLayout) inflate4, textView5, textView6, 6));
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate4.getResources().getResourceName(i5)));
        return null;
    }
}

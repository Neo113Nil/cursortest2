package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.CustomizableDivider;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.results.R;
import com.sofascore.results.redesign.dividers.SofaDivider;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ayd extends g7 {
    public final Event l;
    public final LayoutInflater m;
    public final int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayd(Context context, Event event) {
        super(context);
        event.getClass();
        context.getClass();
        this.l = event;
        this.m = LayoutInflater.from(context);
        this.n = context.getColor(R.color.surface_2);
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return obj instanceof cyd;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new th(arrayList2, arrayList, 28);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        obj.getClass();
        if (obj instanceof r9k) {
            return 1;
        }
        if (obj instanceof c14) {
            return 5;
        }
        if (obj instanceof CustomizableDivider) {
            return 2;
        }
        if (obj instanceof dyd) {
            return 3;
        }
        if (obj instanceof cyd) {
            return 4;
        }
        if (obj instanceof i04) {
            return 7;
        }
        if (obj instanceof Integer) {
            return 6;
        }
        ogj.h(obj);
        return 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        Drawable drawable = null;
        Context context = this.b;
        int i2 = R.id.column_4;
        int i3 = this.n;
        int i4 = 0;
        LayoutInflater layoutInflater = this.m;
        switch (i) {
            case 1:
                return new xlc(kqb.c(layoutInflater, viewGroup), 1);
            case 2:
                SofaDivider sofaDivider = new SofaDivider(context, null, 6);
                sofaDivider.setTag("CRICKET_SUMMARY_TAG");
                return new wh(sofaDivider);
            case 3:
                View inflate = layoutInflater.inflate(R.layout.over_details_summary, viewGroup, false);
                int i5 = R.id.batting_label;
                if (((TextView) nq8.B(R.id.batting_label, inflate)) != null) {
                    i5 = R.id.over_number;
                    TextView textView = (TextView) nq8.B(R.id.over_number, inflate);
                    if (textView != null) {
                        i5 = R.id.runs_and_wickets;
                        TextView textView2 = (TextView) nq8.B(R.id.runs_and_wickets, inflate);
                        if (textView2 != null) {
                            i5 = R.id.score;
                            TextView textView3 = (TextView) nq8.B(R.id.score, inflate);
                            if (textView3 != null) {
                                i5 = R.id.separator;
                                View B = nq8.B(R.id.separator, inflate);
                                if (B != null) {
                                    i5 = R.id.team_flag;
                                    ImageView imageView = (ImageView) nq8.B(R.id.team_flag, inflate);
                                    if (imageView != null) {
                                        return new wh(new z82((ConstraintLayout) inflate, textView, textView2, textView3, B, imageView));
                                    }
                                }
                            }
                        }
                    }
                }
                yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i5)));
                return null;
            case 4:
                View inflate2 = layoutInflater.inflate(R.layout.over_details_player_cell, viewGroup, false);
                TextView textView4 = (TextView) nq8.B(R.id.column_1, inflate2);
                if (textView4 != null) {
                    TextView textView5 = (TextView) nq8.B(R.id.column_2, inflate2);
                    if (textView5 != null) {
                        TextView textView6 = (TextView) nq8.B(R.id.column_3, inflate2);
                        if (textView6 != null) {
                            TextView textView7 = (TextView) nq8.B(R.id.column_4, inflate2);
                            if (textView7 != null) {
                                i2 = R.id.out_marker;
                                TextView textView8 = (TextView) nq8.B(R.id.out_marker, inflate2);
                                if (textView8 != null) {
                                    i2 = R.id.player_image;
                                    ImageView imageView2 = (ImageView) nq8.B(R.id.player_image, inflate2);
                                    if (imageView2 != null) {
                                        i2 = R.id.player_name;
                                        TextView textView9 = (TextView) nq8.B(R.id.player_name, inflate2);
                                        if (textView9 != null) {
                                            i2 = R.id.team_logo;
                                            ImageView imageView3 = (ImageView) nq8.B(R.id.team_logo, inflate2);
                                            if (imageView3 != null) {
                                                return new vh(new zxd((ConstraintLayout) inflate2, textView4, textView5, textView6, textView7, textView8, imageView2, textView9, imageView3));
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            i2 = R.id.column_3;
                        }
                    } else {
                        i2 = R.id.column_2;
                    }
                } else {
                    i2 = R.id.column_1;
                }
                yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i2)));
                return null;
            case 5:
                View inflate3 = layoutInflater.inflate(R.layout.cricket_tournament_section, viewGroup, false);
                TextView textView10 = (TextView) nq8.B(R.id.column_1, inflate3);
                if (textView10 != null) {
                    TextView textView11 = (TextView) nq8.B(R.id.column_2, inflate3);
                    if (textView11 != null) {
                        TextView textView12 = (TextView) nq8.B(R.id.column_3, inflate3);
                        if (textView12 != null) {
                            TextView textView13 = (TextView) nq8.B(R.id.column_4, inflate3);
                            if (textView13 != null) {
                                i2 = R.id.role;
                                TextView textView14 = (TextView) nq8.B(R.id.role, inflate3);
                                if (textView14 != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate3;
                                    z82 z82Var = new z82((ViewGroup) constraintLayout, textView10, (Object) textView11, (Object) textView12, (Object) textView13, (Object) textView14, 6);
                                    constraintLayout.setTag("CRICKET_SUMMARY_TAG");
                                    return new z02(z82Var, Integer.valueOf(i3));
                                }
                            }
                        } else {
                            i2 = R.id.column_3;
                        }
                    } else {
                        i2 = R.id.column_2;
                    }
                } else {
                    i2 = R.id.column_1;
                }
                yhk.s("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(i2)));
                return null;
            case 6:
                View view = new View(context);
                view.setTag("CRICKET_SUMMARY_TAG");
                Context context2 = view.getContext();
                context2.getClass();
                view.setLayoutParams(new ViewGroup.LayoutParams(-1, ao2.s(16, context2)));
                Drawable drawable2 = view.getContext().getDrawable(R.drawable.rectangle_16dp_corners_bottom_no_fill);
                if (drawable2 != null) {
                    drawable2.mutate().setTint(i3);
                    drawable = drawable2;
                }
                view.setBackground(drawable);
                return new r71(2, view);
            case 7:
                View inflate4 = layoutInflater.inflate(R.layout.cricket_commentary_item, viewGroup, false);
                int i6 = R.id.text_commentary;
                TextView textView15 = (TextView) nq8.B(R.id.text_commentary, inflate4);
                if (textView15 != null) {
                    i6 = R.id.text_over_ball;
                    TextView textView16 = (TextView) nq8.B(R.id.text_over_ball, inflate4);
                    if (textView16 != null) {
                        return new wh(new h04((ConstraintLayout) inflate4, textView15, textView16, i4));
                    }
                }
                yhk.s("Missing required view with ID: ".concat(inflate4.getResources().getResourceName(i6)));
                return null;
            default:
                a70.p(ayd.class.getName());
                return null;
        }
    }
}

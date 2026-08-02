package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.sofascore.results.R;
import com.sofascore.results.event.statistics.view.football.FootballGoalmapView;
import com.sofascore.results.event.statistics.view.football.FootballShotmapView;
import com.sofascore.results.view.DividerLinearLayout;
import com.sofascore.results.view.SofascoreSmallRatingView;
import com.sofascore.results.view.branding.BrandingLayout;
import com.sofascore.results.view.graph.BasketballShotmapGraph;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class dd implements krk {
    public final /* synthetic */ int a;
    public final ViewGroup b;
    public final Object c;
    public final Object d;

    public dd(ConstraintLayout constraintLayout, TextView textView, frc frcVar, frc frcVar2) {
        this.a = 24;
        this.b = constraintLayout;
        this.c = frcVar;
        this.d = frcVar2;
    }

    public static dd a(View view) {
        int i = R.id.user_badge;
        ShapeableImageView shapeableImageView = (ShapeableImageView) nq8.B(R.id.user_badge, view);
        if (shapeableImageView != null) {
            i = R.id.user_icon;
            ImageView imageView = (ImageView) nq8.B(R.id.user_icon, view);
            if (imageView != null) {
                return new dd((FrameLayout) view, shapeableImageView, imageView, 4);
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static dd b(View view) {
        int i = R.id.shotmap;
        FootballShotmapView footballShotmapView = (FootballShotmapView) nq8.B(R.id.shotmap, view);
        if (footballShotmapView != null) {
            i = R.id.shotmap_frame;
            ImageView imageView = (ImageView) nq8.B(R.id.shotmap_frame, view);
            if (imageView != null) {
                return new dd((ConstraintLayout) view, footballShotmapView, imageView, 15);
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static dd c(View view) {
        int i = R.id.goal_zone_info;
        View B = nq8.B(R.id.goal_zone_info, view);
        if (B != null) {
            y2a.a(B);
            i = R.id.goalmap;
            FootballGoalmapView footballGoalmapView = (FootballGoalmapView) nq8.B(R.id.goalmap, view);
            if (footballGoalmapView != null) {
                i = R.id.result_info;
                View B2 = nq8.B(R.id.result_info, view);
                if (B2 != null) {
                    y2a.a(B2);
                    i = R.id.shot_type_info;
                    View B3 = nq8.B(R.id.shot_type_info, view);
                    if (B3 != null) {
                        y2a.a(B3);
                        i = R.id.shotmap_container;
                        View B4 = nq8.B(R.id.shotmap_container, view);
                        if (B4 != null) {
                            dd b = b(B4);
                            int i2 = R.id.situation_info;
                            View B5 = nq8.B(R.id.situation_info, view);
                            if (B5 != null) {
                                y2a.a(B5);
                                i2 = R.id.space;
                                if (((Space) nq8.B(R.id.space, view)) != null) {
                                    i2 = R.id.stats_lower;
                                    if (((LinearLayout) nq8.B(R.id.stats_lower, view)) != null) {
                                        i2 = R.id.stats_upper;
                                        if (((LinearLayout) nq8.B(R.id.stats_upper, view)) != null) {
                                            return new dd((LinearLayout) view, footballGoalmapView, b, 16);
                                        }
                                    }
                                }
                            }
                            i = i2;
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static dd d(View view) {
        int i = R.id.missing_players_container;
        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.missing_players_container, view);
        if (linearLayout != null) {
            i = R.id.missing_players_note;
            View B = nq8.B(R.id.missing_players_note, view);
            if (B != null) {
                int i2 = R.id.missing_players_icon;
                if (((ImageView) nq8.B(R.id.missing_players_icon, B)) != null) {
                    i2 = R.id.missing_players_text;
                    TextView textView = (TextView) nq8.B(R.id.missing_players_text, B);
                    if (textView != null) {
                        return new dd((DividerLinearLayout) view, linearLayout, new dk2((LinearLayout) B, textView, 5), 22);
                    }
                }
                yhk.s("Missing required view with ID: ".concat(B.getResources().getResourceName(i2)));
                return null;
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static dd e(View view) {
        int i = R.id.rating;
        SofascoreSmallRatingView sofascoreSmallRatingView = (SofascoreSmallRatingView) nq8.B(R.id.rating, view);
        if (sofascoreSmallRatingView != null) {
            i = R.id.value;
            TextView textView = (TextView) nq8.B(R.id.value, view);
            if (textView != null) {
                return new dd((FrameLayout) view, sofascoreSmallRatingView, textView, 29);
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static dd f(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        View inflate = layoutInflater.inflate(R.layout.dialog_with_recycler_and_loader, (ViewGroup) frameLayout, false);
        int i = R.id.circular_progress_bar_view;
        View B = nq8.B(R.id.circular_progress_bar_view, inflate);
        if (B != null) {
            dk2 a = dk2.a(B);
            LinearLayout linearLayout = (LinearLayout) inflate;
            RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.rated_matches_list, inflate);
            if (recyclerView != null) {
                return new dd(linearLayout, a, recyclerView, 12);
            }
            i = R.id.rated_matches_list;
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        int i = this.a;
        ViewGroup viewGroup = this.b;
        switch (i) {
            case 0:
                return (CoordinatorLayout) viewGroup;
            case 1:
                return (LinearLayout) viewGroup;
            case 2:
                return (LinearLayout) viewGroup;
            case 3:
                return (LinearLayout) viewGroup;
            case 4:
                return (FrameLayout) viewGroup;
            case 5:
                return (FrameLayout) viewGroup;
            case 6:
                return (ConstraintLayout) viewGroup;
            case 7:
                return (LinearLayout) viewGroup;
            case 8:
                return (FrameLayout) viewGroup;
            case 9:
                return (RelativeLayout) viewGroup;
            case 10:
                return (LinearLayout) viewGroup;
            case 11:
                return (CoordinatorLayout) viewGroup;
            case 12:
                return (LinearLayout) viewGroup;
            case 13:
                return (ConstraintLayout) viewGroup;
            case 14:
                return (ConstraintLayout) viewGroup;
            case 15:
                return (ConstraintLayout) viewGroup;
            case 16:
                return (LinearLayout) viewGroup;
            case 17:
                return (ConstraintLayout) viewGroup;
            case 18:
                return (BrandingLayout) viewGroup;
            case 19:
                return (LinearLayout) viewGroup;
            case 20:
                return (ConstraintLayout) viewGroup;
            case 21:
                return (LinearLayout) viewGroup;
            case 22:
                return (DividerLinearLayout) viewGroup;
            case 23:
                return (LinearLayout) viewGroup;
            case 24:
                return (ConstraintLayout) viewGroup;
            case 25:
                return (LinearLayout) viewGroup;
            case 26:
                return (ConstraintLayout) viewGroup;
            case 27:
                return (FrameLayout) viewGroup;
            case 28:
                return (ConstraintLayout) viewGroup;
            default:
                return (FrameLayout) viewGroup;
        }
    }

    public /* synthetic */ dd(ViewGroup viewGroup, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = viewGroup;
        this.c = obj;
        this.d = obj2;
    }

    public dd(LinearLayout linearLayout, dd ddVar, kqb kqbVar, dd ddVar2) {
        this.a = 21;
        this.b = linearLayout;
        this.c = ddVar;
        this.d = ddVar2;
    }

    public dd(ConstraintLayout constraintLayout, LinearLayout linearLayout, nq5 nq5Var, nq5 nq5Var2, nq5 nq5Var3, nq5 nq5Var4, nq5 nq5Var5, nq5 nq5Var6, nq5 nq5Var7, nq5 nq5Var8, LinearLayout linearLayout2) {
        this.a = 13;
        this.b = constraintLayout;
        this.c = linearLayout;
        this.d = linearLayout2;
    }

    public dd(ConstraintLayout constraintLayout, TextView textView, ShapeableImageView shapeableImageView, ImageView imageView, TextView textView2, TextView textView3, TextView textView4, BasketballShotmapGraph basketballShotmapGraph, View view) {
        this.a = 14;
        this.b = constraintLayout;
        this.c = basketballShotmapGraph;
        this.d = view;
    }
}

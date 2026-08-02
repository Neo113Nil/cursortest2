package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.sofascore.results.R;
import com.sofascore.results.event.details.view.predictions.adapter.NestedScrollableHost;
import com.sofascore.results.profile.view.ProfileClickableRowView;
import com.sofascore.results.view.InformationView;
import com.sofascore.results.view.branding.BrandingHeaderView;
import com.sofascore.results.view.graph.BasketballShotmapPlayAreasGraph;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ed implements krk {
    public final /* synthetic */ int a;
    public final View b;
    public final Object c;

    public ed(ConstraintLayout constraintLayout, TextView textView, TextView textView2, AppCompatRatingBar appCompatRatingBar) {
        this.a = 8;
        this.b = constraintLayout;
        this.c = appCompatRatingBar;
    }

    public static ed a(View view) {
        CardView cardView = (CardView) nq8.B(R.id.buzzer_tile_holder, view);
        if (cardView != null) {
            return new ed((FrameLayout) view, 3, cardView);
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.buzzer_tile_holder)));
        return null;
    }

    public static ed b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.divider_card_layout, viewGroup, false);
        View B = nq8.B(R.id.card_content, inflate);
        if (B != null) {
            return new ed((FrameLayout) inflate, 10, B);
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.card_content)));
        return null;
    }

    public static ed c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.nested_recycler_view, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.recycler_view, inflate);
        if (recyclerView != null) {
            return new ed((NestedScrollableHost) inflate, 16, recyclerView);
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.recycler_view)));
        return null;
    }

    public static ed d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.viewholder_branding_header, viewGroup, false);
        BrandingHeaderView brandingHeaderView = (BrandingHeaderView) nq8.B(R.id.brand_header, inflate);
        if (brandingHeaderView != null) {
            return new ed((FrameLayout) inflate, 29, brandingHeaderView);
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.brand_header)));
        return null;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        int i = this.a;
        View view = this.b;
        switch (i) {
            case 0:
                return (CoordinatorLayout) view;
            case 1:
                return (LinearLayout) view;
            case 2:
                return (ConstraintLayout) view;
            case 3:
                return (FrameLayout) view;
            case 4:
                return (MaterialCheckBox) view;
            case 5:
                return (FrameLayout) view;
            case 6:
                return (FrameLayout) view;
            case 7:
                return (NestedScrollView) view;
            case 8:
                return (ConstraintLayout) view;
            case 9:
                return (ConstraintLayout) view;
            case 10:
                return (FrameLayout) view;
            case 11:
                return (ConstraintLayout) view;
            case 12:
                return (FrameLayout) view;
            case 13:
                return (FrameLayout) view;
            case 14:
                return (InformationView) view;
            case 15:
                return (ConstraintLayout) view;
            case 16:
                return (NestedScrollableHost) view;
            case 17:
                return (ConstraintLayout) view;
            case 18:
                return (LinearLayout) view;
            case 19:
                return (LinearLayout) view;
            case 20:
                return (LinearLayout) view;
            case 21:
                return (NestedScrollView) view;
            case 22:
                return (LinearLayout) view;
            case 23:
                return (FrameLayout) view;
            case 24:
                return (LinearLayout) view;
            case 25:
                return (f32) view;
            case 26:
                return (ProfileClickableRowView) view;
            case 27:
                return (LinearLayout) view;
            case 28:
                return (LinearLayout) view;
            default:
                return (FrameLayout) view;
        }
    }

    public /* synthetic */ ed(int i, View view, ViewGroup viewGroup, Object obj) {
        this.a = i;
        this.b = viewGroup;
        this.c = obj;
    }

    public /* synthetic */ ed(View view, int i, Object obj) {
        this.a = i;
        this.b = view;
        this.c = obj;
    }

    public /* synthetic */ ed(LinearLayout linearLayout, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = linearLayout;
        this.c = obj;
    }

    public /* synthetic */ ed(int i, View view, View view2, ViewGroup viewGroup, Object obj) {
        this.a = i;
        this.b = viewGroup;
        this.c = view2;
    }

    public ed(LinearLayout linearLayout, LinearLayout linearLayout2, BasketballShotmapPlayAreasGraph basketballShotmapPlayAreasGraph, ImageView imageView, ImageView imageView2, ImageView imageView3) {
        this.a = 24;
        this.b = linearLayout;
        this.c = basketballShotmapPlayAreasGraph;
    }

    public ed(ConstraintLayout constraintLayout, TextView textView, MaterialButton materialButton, MaterialCheckBox materialCheckBox, TextView textView2) {
        this.a = 9;
        this.b = constraintLayout;
        this.c = materialCheckBox;
    }
}

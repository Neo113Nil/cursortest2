package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.results.profile.editor.ProfileEditorSummaryItemView;
import com.sofascore.results.profile.view.ProfilePredictionStatisticsView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class xk8 implements krk {
    public final /* synthetic */ int a = 1;
    public final TextView b;
    public final View c;
    public final View d;
    public final View e;
    public final TextView f;
    public final ViewGroup g;
    public final View h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;
    public final Object p;
    public final Object q;
    public final Object r;

    public xk8(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, View view, View view2, View view3, View view4, y2a y2aVar, y2a y2aVar2, y2a y2aVar3, y2a y2aVar4, y2a y2aVar5, y2a y2aVar6, TextView textView, View view5, ImageView imageView3, TextView textView2) {
        this.g = constraintLayout;
        this.c = imageView;
        this.d = imageView2;
        this.h = view;
        this.i = view2;
        this.j = view3;
        this.k = view4;
        this.m = y2aVar;
        this.n = y2aVar2;
        this.o = y2aVar3;
        this.p = y2aVar4;
        this.q = y2aVar5;
        this.r = y2aVar6;
        this.b = textView;
        this.l = view5;
        this.e = imageView3;
        this.f = textView2;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        int i = this.a;
        ViewGroup viewGroup = this.g;
        switch (i) {
            case 0:
                return (ConstraintLayout) viewGroup;
            case 1:
                return (FrameLayout) viewGroup;
            default:
                return (ScrollView) viewGroup;
        }
    }

    public xk8(ScrollView scrollView, ProfileEditorSummaryItemView profileEditorSummaryItemView, LinearLayout linearLayout, TextView textView, TextView textView2, LinearLayout linearLayout2, CardView cardView, av1 av1Var, av1 av1Var2, CardView cardView2, CardView cardView3, RecyclerView recyclerView, CardView cardView4, ProfileEditorSummaryItemView profileEditorSummaryItemView2, av1 av1Var3, ProfilePredictionStatisticsView profilePredictionStatisticsView, CardView cardView5) {
        this.g = scrollView;
        this.c = profileEditorSummaryItemView;
        this.d = linearLayout;
        this.b = textView;
        this.f = textView2;
        this.e = linearLayout2;
        this.h = cardView;
        this.i = av1Var;
        this.j = av1Var2;
        this.k = cardView2;
        this.l = cardView3;
        this.m = recyclerView;
        this.n = cardView4;
        this.o = profileEditorSummaryItemView2;
        this.p = av1Var3;
        this.q = profilePredictionStatisticsView;
        this.r = cardView5;
    }

    public xk8(FrameLayout frameLayout, TextView textView, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, e92 e92Var, t22 t22Var, z82 z82Var, z82 z82Var2, z82 z82Var3, z82 z82Var4, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.g = frameLayout;
        this.b = textView;
        this.c = imageView;
        this.d = imageView2;
        this.e = imageView3;
        this.h = imageView4;
        this.i = e92Var;
        this.j = t22Var;
        this.k = z82Var;
        this.l = z82Var2;
        this.m = z82Var3;
        this.n = z82Var4;
        this.f = textView2;
        this.o = textView3;
        this.p = textView4;
        this.q = textView5;
        this.r = textView6;
    }
}

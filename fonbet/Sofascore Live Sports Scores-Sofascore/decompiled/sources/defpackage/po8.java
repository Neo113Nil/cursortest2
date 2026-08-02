package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.sofascore.results.view.InformationView;
import com.sofascore.results.view.SofaTextInputLayout;
import com.sofascore.results.view.typeheader.TypeHeaderView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class po8 implements krk {
    public final SwipeRefreshLayout a;
    public final AppBarLayout b;
    public final View c;
    public final InformationView d;
    public final ComposeView e;
    public final TypeHeaderView f;
    public final SwipeRefreshLayout g;
    public final RecyclerView h;
    public final LinearLayout i;
    public final MaterialAutoCompleteTextView j;
    public final LinearLayout k;
    public final SofaTextInputLayout l;
    public final ImageView m;

    public po8(SwipeRefreshLayout swipeRefreshLayout, AppBarLayout appBarLayout, View view, InformationView informationView, ComposeView composeView, TypeHeaderView typeHeaderView, SwipeRefreshLayout swipeRefreshLayout2, RecyclerView recyclerView, LinearLayout linearLayout, MaterialAutoCompleteTextView materialAutoCompleteTextView, LinearLayout linearLayout2, SofaTextInputLayout sofaTextInputLayout, ImageView imageView) {
        this.a = swipeRefreshLayout;
        this.b = appBarLayout;
        this.c = view;
        this.d = informationView;
        this.e = composeView;
        this.f = typeHeaderView;
        this.g = swipeRefreshLayout2;
        this.h = recyclerView;
        this.i = linearLayout;
        this.j = materialAutoCompleteTextView;
        this.k = linearLayout2;
        this.l = sofaTextInputLayout;
        this.m = imageView;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}

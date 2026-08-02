package com.sofascore.results.pots;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import com.sofascore.results.R;
import com.sofascore.results.featureWalkthrough.FeatureWalkthroughFullScreenDialog;
import com.sofascore.results.pots.POTSActivity;
import defpackage.f3e;
import defpackage.g3e;
import defpackage.hkg;
import defpackage.hz8;
import defpackage.joa;
import defpackage.ny0;
import defpackage.ut7;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/pots/POTSActivity;", "Lcom/sofascore/results/mvvm/base/CollapsibleToolbarActivity;", "<init>", "()V", "ug5", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class POTSActivity extends Hilt_POTSActivity {
    public static final /* synthetic */ int O = 0;
    public final joa M;
    public final joa N;

    public POTSActivity() {
        final int i = 0;
        Function0 function0 = new Function0(this) { // from class: j0e
            public final /* synthetic */ POTSActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                POTSActivity pOTSActivity = this.b;
                switch (i2) {
                    case 0:
                        int i3 = POTSActivity.O;
                        return new g3e(pOTSActivity, pOTSActivity.Q().k, pOTSActivity.Q().h);
                    default:
                        int i4 = POTSActivity.O;
                        Bundle extras = pOTSActivity.getIntent().getExtras();
                        if (extras != null) {
                            return (f3e) gz8.M(extras, "InitialTab", f3e.class);
                        }
                        return null;
                }
            }
        };
        ysa ysaVar = ysa.c;
        this.M = ypa.a(ysaVar, function0);
        final int i2 = 1;
        this.N = ypa.a(ysaVar, new Function0(this) { // from class: j0e
            public final /* synthetic */ POTSActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                POTSActivity pOTSActivity = this.b;
                switch (i22) {
                    case 0:
                        int i3 = POTSActivity.O;
                        return new g3e(pOTSActivity, pOTSActivity.Q().k, pOTSActivity.Q().h);
                    default:
                        int i4 = POTSActivity.O;
                        Bundle extras = pOTSActivity.getIntent().getExtras();
                        if (extras != null) {
                            return (f3e) gz8.M(extras, "InitialTab", f3e.class);
                        }
                        return null;
                }
            }
        });
    }

    @Override // com.sofascore.results.mvvm.base.CollapsibleToolbarActivity, com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int D;
        Drawable mutate;
        super.onCreate(bundle);
        ViewPager2 viewPager2 = Q().k;
        joa joaVar = this.M;
        viewPager2.setAdapter((g3e) joaVar.getValue());
        Q().l.setEnabled(false);
        ((g3e) joaVar.getValue()).x(f3e.f);
        if (bundle != null) {
            Q().k.c(bundle.getInt("TabPosition"), false);
        } else {
            f3e f3eVar = (f3e) this.N.getValue();
            if (f3eVar != null && (D = ((g3e) joaVar.getValue()).D(f3eVar)) >= 0) {
                Q().k.c(D, false);
            }
        }
        Q().h.setSelectedTabIndicatorColor(getColor(R.color.on_color_primary));
        this.o = Q().g;
        Drawable drawable = null;
        I(Q().b, null);
        ((TextView) Q().f.g).setText(hkg.Q(this, R.string.player_of_the_season, null, new Object[0]));
        ((TextView) Q().f.g).setMaxLines(2);
        ((TextView) Q().f.i).setVisibility(8);
        ImageView R = R();
        Integer valueOf = Integer.valueOf(R.color.rating_90);
        Drawable drawable2 = getDrawable(R.drawable.ic_pots_trophy);
        if (drawable2 != null && (mutate = drawable2.mutate()) != null) {
            mutate.setTint(getColor(valueOf.intValue()));
            drawable = mutate;
        }
        R.setImageDrawable(drawable);
        R().setBackground(getDrawable(R.drawable.rounded_surface_level_3));
        Q().d.setBackground(new ny0(new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{getColor(R.color.graphics_dark), getColor(R.color.rating_90), getColor(R.color.graphics_dark)})));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.menu_info, menu);
        return true;
    }

    @Override // com.sofascore.results.base.BaseActivity, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() == R.id.info) {
            ut7 ut7Var = ut7.a;
            FeatureWalkthroughFullScreenDialog featureWalkthroughFullScreenDialog = new FeatureWalkthroughFullScreenDialog();
            featureWalkthroughFullScreenDialog.setArguments(hz8.E(new Pair("TYPE", ut7.e)));
            featureWalkthroughFullScreenDialog.p(k(), "FeatureWalkthroughFullScreenDialog");
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        bundle.putInt("TabPosition", Q().k.getCurrentItem());
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "PlayerOfTheSeasonScreen";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
    }
}

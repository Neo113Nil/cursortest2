package com.sofascore.results.stagesport;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.sofascore.model.favorites.FavoritesStagesData;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.R;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.stagesport.StageCategoryActivity;
import com.sofascore.results.view.follownotification.NotificationsActionButton;
import defpackage.b1i;
import defpackage.b2i;
import defpackage.d1i;
import defpackage.duf;
import defpackage.e1i;
import defpackage.g1i;
import defpackage.ioe;
import defpackage.joa;
import defpackage.m1f;
import defpackage.mz1;
import defpackage.otk;
import defpackage.rc5;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z8e;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/stagesport/StageCategoryActivity;", "Lcom/sofascore/results/mvvm/base/CollapsibleToolbarActivity;", "<init>", "()V", "yfa", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StageCategoryActivity extends Hilt_StageCategoryActivity {
    public static final /* synthetic */ int R = 0;
    public final otk M = new otk(duf.a.getOrCreateKotlinClass(g1i.class), new e1i(this, 1), new e1i(this, 0), new e1i(this, 2));
    public final joa N = ypa.a(ysa.c, new d1i(this, 0));
    public boolean O;
    public Function0 P;
    public NotificationsActionButton Q;

    public StageCategoryActivity() {
        new b1i(this);
    }

    public final g1i X() {
        return (g1i) this.M.getValue();
    }

    public final b2i Y() {
        return (b2i) this.N.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.CollapsibleToolbarActivity, com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Q().h.setSelectedTabIndicatorColor(getColor(R.color.on_color_primary));
        this.o = Q().g;
        final int i = 0;
        X().m.e(this, new ioe(6, new Function1(this) { // from class: c1i
            public final /* synthetic */ StageCategoryActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Category category;
                Sport sport;
                String slug;
                int i2 = i;
                StageCategoryActivity stageCategoryActivity = this.b;
                switch (i2) {
                    case 0:
                        UniqueStage uniqueStage = (UniqueStage) obj;
                        int i3 = StageCategoryActivity.R;
                        if (uniqueStage != null) {
                            stageCategoryActivity.x.a = Integer.valueOf(uniqueStage.getId());
                            stageCategoryActivity.Q().d.setBackground(new wy0(uniqueStage.getId(), uniqueStage.getName()));
                            AdBannerView adBannerView = stageCategoryActivity.Q().b;
                            ltb ltbVar = new ltb();
                            UniqueStage uniqueStage2 = (UniqueStage) stageCategoryActivity.X().m.d();
                            if (uniqueStage2 != null && (category = uniqueStage2.getCategory()) != null && (sport = category.getSport()) != null && (slug = sport.getSlug()) != null) {
                                ltbVar.put(SearchResponseKt.SPORT_ENTITY, slug);
                            }
                            stageCategoryActivity.I(adBannerView, ltbVar.d());
                            Intent intent = stageCategoryActivity.getIntent();
                            intent.getClass();
                            nv.i0(stageCategoryActivity, uniqueStage, intent);
                            ((TextView) stageCategoryActivity.Q().f.i).setText(uniqueStage.getName());
                            as9.b(stageCategoryActivity.R(), Integer.valueOf(uniqueStage.getCategory().getId()), null);
                            FavoritesStagesData favoritesStagesData = (FavoritesStagesData) stageCategoryActivity.X().p.a.getValue();
                            NotificationsActionButton notificationsActionButton = stageCategoryActivity.Q;
                            if (notificationsActionButton != null) {
                                notificationsActionButton.setFollowableItem(uniqueStage);
                                notificationsActionButton.h(favoritesStagesData);
                            }
                        }
                        break;
                    default:
                        f1i f1iVar = (f1i) obj;
                        int i4 = StageCategoryActivity.R;
                        stageCategoryActivity.Q().l.setRefreshing(false);
                        List list = f1iVar.a;
                        if (!list.isEmpty() && !stageCategoryActivity.O) {
                            stageCategoryActivity.O = true;
                            new d1i(stageCategoryActivity, 1);
                            stageCategoryActivity.Q().l.setEnabled(false);
                            ((Spinner) stageCategoryActivity.Q().f.k).setAdapter((SpinnerAdapter) new b8i(stageCategoryActivity, list));
                            if (!list.isEmpty() && stageCategoryActivity.Y().l.size() <= 0) {
                                d41.w(stageCategoryActivity.Y(), a2i.STAGE_LEAGUE_RACES);
                                if (f1iVar.b) {
                                    d41.w(stageCategoryActivity.Y(), a2i.STAGE_LEAGUE_RANKING);
                                }
                                if (f1iVar.c) {
                                    d41.w(stageCategoryActivity.Y(), a2i.STAGE_LEAGUE_ODDS);
                                }
                            }
                        }
                        break;
                }
                return Unit.a;
            }
        }));
        z8e.x(this, X().p, new m1f(this, null, 18));
        ((TextView) Q().f.g).setVisibility(8);
        ((Spinner) Q().f.k).setVisibility(0);
        ((ImageView) Q().f.d).setBackground(getDrawable(R.drawable.rounded_surface_level_4));
        ((Spinner) Q().f.k).setOnItemSelectedListener(new rc5(this, 3));
        Q().k.setAdapter(Y());
        final int i2 = 1;
        X().i.e(this, new ioe(6, new Function1(this) { // from class: c1i
            public final /* synthetic */ StageCategoryActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Category category;
                Sport sport;
                String slug;
                int i22 = i2;
                StageCategoryActivity stageCategoryActivity = this.b;
                switch (i22) {
                    case 0:
                        UniqueStage uniqueStage = (UniqueStage) obj;
                        int i3 = StageCategoryActivity.R;
                        if (uniqueStage != null) {
                            stageCategoryActivity.x.a = Integer.valueOf(uniqueStage.getId());
                            stageCategoryActivity.Q().d.setBackground(new wy0(uniqueStage.getId(), uniqueStage.getName()));
                            AdBannerView adBannerView = stageCategoryActivity.Q().b;
                            ltb ltbVar = new ltb();
                            UniqueStage uniqueStage2 = (UniqueStage) stageCategoryActivity.X().m.d();
                            if (uniqueStage2 != null && (category = uniqueStage2.getCategory()) != null && (sport = category.getSport()) != null && (slug = sport.getSlug()) != null) {
                                ltbVar.put(SearchResponseKt.SPORT_ENTITY, slug);
                            }
                            stageCategoryActivity.I(adBannerView, ltbVar.d());
                            Intent intent = stageCategoryActivity.getIntent();
                            intent.getClass();
                            nv.i0(stageCategoryActivity, uniqueStage, intent);
                            ((TextView) stageCategoryActivity.Q().f.i).setText(uniqueStage.getName());
                            as9.b(stageCategoryActivity.R(), Integer.valueOf(uniqueStage.getCategory().getId()), null);
                            FavoritesStagesData favoritesStagesData = (FavoritesStagesData) stageCategoryActivity.X().p.a.getValue();
                            NotificationsActionButton notificationsActionButton = stageCategoryActivity.Q;
                            if (notificationsActionButton != null) {
                                notificationsActionButton.setFollowableItem(uniqueStage);
                                notificationsActionButton.h(favoritesStagesData);
                            }
                        }
                        break;
                    default:
                        f1i f1iVar = (f1i) obj;
                        int i4 = StageCategoryActivity.R;
                        stageCategoryActivity.Q().l.setRefreshing(false);
                        List list = f1iVar.a;
                        if (!list.isEmpty() && !stageCategoryActivity.O) {
                            stageCategoryActivity.O = true;
                            new d1i(stageCategoryActivity, 1);
                            stageCategoryActivity.Q().l.setEnabled(false);
                            ((Spinner) stageCategoryActivity.Q().f.k).setAdapter((SpinnerAdapter) new b8i(stageCategoryActivity, list));
                            if (!list.isEmpty() && stageCategoryActivity.Y().l.size() <= 0) {
                                d41.w(stageCategoryActivity.Y(), a2i.STAGE_LEAGUE_RACES);
                                if (f1iVar.b) {
                                    d41.w(stageCategoryActivity.Y(), a2i.STAGE_LEAGUE_RANKING);
                                }
                                if (f1iVar.c) {
                                    d41.w(stageCategoryActivity.Y(), a2i.STAGE_LEAGUE_ODDS);
                                }
                            }
                        }
                        break;
                }
                return Unit.a;
            }
        }));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.activity_stage_menu, menu);
        View actionView = menu.findItem(R.id.add_to_favorites).getActionView();
        this.Q = actionView != null ? (NotificationsActionButton) actionView.findViewById(R.id.notifications_button) : null;
        return true;
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        menu.getClass();
        UniqueStage uniqueStage = (UniqueStage) X().m.d();
        if (uniqueStage != null) {
            FavoritesStagesData favoritesStagesData = (FavoritesStagesData) X().p.a.getValue();
            NotificationsActionButton notificationsActionButton = this.Q;
            if (notificationsActionButton != null) {
                notificationsActionButton.setFollowableItem(uniqueStage);
                notificationsActionButton.h(favoritesStagesData);
            }
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "StageLeagueScreen";
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String y() {
        return mz1.j(getIntent().getIntExtra("STAGE_SPORT", 0), super.y(), " id:");
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
    }
}

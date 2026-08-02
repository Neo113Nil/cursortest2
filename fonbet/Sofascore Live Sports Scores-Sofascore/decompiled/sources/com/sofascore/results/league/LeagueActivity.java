package com.sofascore.results.league;

import android.app.assist.AssistContent;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Spinner;
import com.sofascore.local_persistance.Brand;
import com.sofascore.local_persistance.BrandingTournament;
import com.sofascore.model.Sports;
import com.sofascore.model.favorites.FavoritesEventsData;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.R;
import com.sofascore.results.view.ToolbarBackgroundAppBarLayout;
import com.sofascore.results.view.follownotification.FollowActionButton;
import com.sofascore.results.view.follownotification.NotificationsActionButton;
import defpackage.a5f;
import defpackage.a99;
import defpackage.c1g;
import defpackage.c30;
import defpackage.cp4;
import defpackage.dr6;
import defpackage.dsi;
import defpackage.duf;
import defpackage.f54;
import defpackage.fdi;
import defpackage.fuf;
import defpackage.hd;
import defpackage.ita;
import defpackage.jta;
import defpackage.koj;
import defpackage.kva;
import defpackage.ky0;
import defpackage.ljg;
import defpackage.lta;
import defpackage.lza;
import defpackage.mqi;
import defpackage.mta;
import defpackage.ota;
import defpackage.otk;
import defpackage.p15;
import defpackage.ph0;
import defpackage.q5a;
import defpackage.qy0;
import defpackage.rd4;
import defpackage.rq3;
import defpackage.s26;
import defpackage.s38;
import defpackage.tnb;
import defpackage.tz9;
import defpackage.uic;
import defpackage.un0;
import defpackage.vnb;
import defpackage.xta;
import defpackage.xw3;
import defpackage.y4b;
import defpackage.ypa;
import defpackage.yta;
import defpackage.yy0;
import defpackage.z1;
import defpackage.z4b;
import defpackage.z8e;
import defpackage.zzc;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/league/LeagueActivity;", "Lcom/sofascore/results/mvvm/base/AbstractActivity;", "<init>", "()V", "a99", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LeagueActivity extends Hilt_LeagueActivity {
    public static final a99 h0 = new a99(26);
    public final mqi K;
    public final mqi L;
    public final mqi M;
    public final mqi N;
    public final mqi O;
    public final otk P;
    public final otk Q;
    public final otk R;
    public final otk S;
    public final mqi T;
    public final mqi U;
    public Function0 V;
    public boolean W;
    public int X;
    public Integer Y;
    public y4b Z;
    public boolean a0;
    public boolean b0;
    public lza c0;
    public Menu d0;
    public final mqi e0;
    public NotificationsActionButton f0;
    public FollowActionButton g0;

    public LeagueActivity() {
        int i = 0;
        this.K = ypa.b(new ita(this, i));
        int i2 = 2;
        this.L = ypa.b(new ita(this, i2));
        int i3 = 4;
        this.M = ypa.b(new ita(this, i3));
        int i4 = 5;
        this.N = ypa.b(new ita(this, i4));
        int i5 = 6;
        this.O = ypa.b(new ita(this, i5));
        mta mtaVar = new mta(this, 3);
        fuf fufVar = duf.a;
        this.P = new otk(fufVar.getOrCreateKotlinClass(yta.class), new mta(this, i3), mtaVar, new mta(this, i4));
        int i6 = 7;
        int i7 = 8;
        this.Q = new otk(fufVar.getOrCreateKotlinClass(kva.class), new mta(this, i6), new mta(this, i5), new mta(this, i7));
        int i8 = 9;
        int i9 = 10;
        this.R = new otk(fufVar.getOrCreateKotlinClass(koj.class), new mta(this, i9), new mta(this, i8), new mta(this, 11));
        this.S = new otk(fufVar.getOrCreateKotlinClass(dsi.class), new mta(this, 1), new mta(this, i), new mta(this, i2));
        this.T = ypa.b(new ita(this, i6));
        this.U = ypa.b(new ita(this, i7));
        this.V = new ita(this, i8);
        this.e0 = ypa.b(new ita(this, i9));
    }

    public final void Q(Season season) {
        Object value;
        int i;
        this.V = new ita(this, 3);
        fdi fdiVar = ((koj) this.R.getValue()).e;
        do {
            value = fdiVar.getValue();
            ((vnb) value).getClass();
        } while (!fdiVar.k(value, tnb.a));
        if (U().l.size() > 0) {
            this.X = S().l.getCurrentItem();
            this.Z = (y4b) U().E(this.X);
        }
        if (this.a0) {
            Spinner spinner = (Spinner) S().g.k;
            lza lzaVar = this.c0;
            if (lzaVar != null) {
                int id = season.getId();
                int size = lzaVar.b.size();
                i = 0;
                while (i < size) {
                    if (((Season) lzaVar.b.get(i)).getId() == id) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            i = 0;
            spinner.setSelection(i);
        }
        R().l = ((Spinner) S().g.k).getSelectedItemPosition() == 0 || this.b0;
        boolean z = R().l || CollectionsKt.R(ph0.a0(new String[]{Sports.FOOTBALL, Sports.BASKETBALL}), R().m());
        R().m = z;
        rq3 rq3Var = null;
        if (z) {
            kva kvaVar = (kva) this.Q.getValue();
            kvaVar.l.j(null);
            kvaVar.n.j(null);
            kvaVar.p.j(null);
        }
        yta R = R();
        String m = R().m();
        if (m == null) {
            m = "";
        }
        String str = m;
        season.getClass();
        if (R.i > 0) {
            xw3.L(un0.z(R), null, null, new xta(null, R, season, str), 3);
        } else {
            xw3.L(un0.z(R), null, null, new f54(R, season, str, rq3Var, 6), 3);
        }
        if (S().f.hasOnClickListeners()) {
            if (R().m) {
                S().f.y(0);
            } else {
                S().f.y(1);
            }
        }
    }

    public final yta R() {
        return (yta) this.P.getValue();
    }

    public final hd S() {
        return (hd) this.T.getValue();
    }

    public final int T() {
        return ((Number) this.L.getValue()).intValue();
    }

    public final z4b U() {
        return (z4b) this.U.getValue();
    }

    public final void V(UniqueTournament uniqueTournament) {
        if (uniqueTournament == null) {
            return;
        }
        FavoritesEventsData favoritesEventsData = (FavoritesEventsData) R().I.a.getValue();
        int id = uniqueTournament.getId();
        FollowActionButton followActionButton = this.g0;
        if (id <= 0) {
            if (followActionButton != null) {
                followActionButton.setVisibility(8);
            }
            NotificationsActionButton notificationsActionButton = this.f0;
            if (notificationsActionButton != null) {
                notificationsActionButton.setVisibility(8);
                return;
            }
            return;
        }
        if (followActionButton != null) {
            followActionButton.setVisibility(0);
        }
        NotificationsActionButton notificationsActionButton2 = this.f0;
        if (notificationsActionButton2 != null) {
            notificationsActionButton2.setVisibility(0);
        }
        FollowActionButton followActionButton2 = this.g0;
        if (followActionButton2 != null) {
            followActionButton2.h(uniqueTournament, favoritesEventsData);
        }
        NotificationsActionButton notificationsActionButton3 = this.f0;
        if (notificationsActionButton3 != null) {
            int i = NotificationsActionButton.g;
            notificationsActionButton3.i(uniqueTournament, favoritesEventsData, false);
        }
    }

    public final void W() {
        if (U().D(y4b.d) != S().l.getCurrentItem()) {
            View currentFocus = getCurrentFocus();
            if (currentFocus == null) {
                currentFocus = new View(this);
            }
            EditText editText = currentFocus instanceof EditText ? (EditText) currentFocus : null;
            if (editText != null) {
                editText.clearFocus();
            }
            Context context = currentFocus.getContext();
            context.getClass();
            InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService(InputMethodManager.class);
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
        }
    }

    public final void X(List list) {
        String str;
        UniqueTournament uniqueTournament;
        Season l = R().l();
        if (l != null) {
            Tournament n = R().n();
            if (n == null || (uniqueTournament = n.getUniqueTournament()) == null || (str = uniqueTournament.getName()) == null) {
                str = "";
            }
            new rd4(this, str, l, list, new dr6(19, l, this, list));
        }
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        mqi mqiVar;
        boolean z;
        yy0 qy0Var;
        GradientDrawable gradientDrawable;
        super.onCreate(bundle);
        setContentView(S().a);
        int i = 1;
        S().f.y(1);
        H(S().j);
        if (bundle != null) {
            this.X = bundle.getInt("START_TAB");
            this.Y = Integer.valueOf(bundle.getInt("SPINNER_POSITION"));
        }
        this.x.a = Integer.valueOf(T());
        yta R = R();
        mqi mqiVar2 = this.K;
        R.k = ((Number) mqiVar2.getValue()).intValue();
        if (T() == 0 && R().k == 0) {
            s38.a().c(new IllegalArgumentException("LeagueActivity without tournamentId and uniqueTournamentId"));
            finish();
        } else {
            R().k();
        }
        this.o = S().h;
        S().i.setSelectedTabIndicatorColor(getColor(R.color.on_color_primary));
        S().l.setAdapter(U());
        BrandingTournament brandingTournament = R().q;
        rq3 rq3Var = null;
        Brand brand = brandingTournament != null ? brandingTournament.getBrand() : null;
        int i2 = 0;
        if (brand == null || !Intrinsics.c(brandingTournament.getTakeoverImage(), Boolean.TRUE)) {
            mqiVar = mqiVar2;
            z = false;
        } else {
            mqiVar = mqiVar2;
            z = true;
        }
        if (brandingTournament != null) {
            c1g L = tz9.L(this, brandingTournament.getBackgroundColor(), brandingTournament.getBackgroundGradientColor());
            if (L == null) {
                gradientDrawable = null;
            } else {
                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
                int i3 = L.a;
                gradientDrawable = new GradientDrawable(orientation, new int[]{i3, L.b, i3});
            }
            if (gradientDrawable != null) {
                S().a.setBackground(gradientDrawable);
            }
        }
        ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout = S().d;
        if (brandingTournament != null ? Intrinsics.c(brandingTournament.getAppHeader(), Boolean.TRUE) : false) {
            Brand brand2 = brandingTournament.getBrand();
            qy0Var = new ky0(T(), brand2 != null ? Integer.valueOf(brand2.getId()) : null);
        } else {
            qy0Var = new qy0(T(), ((Number) mqiVar.getValue()).intValue());
        }
        toolbarBackgroundAppBarLayout.setBackground(qy0Var);
        z8e.x(this, R().I, new lta(this, rq3Var, i2));
        R().v.e(this, new z1(15, new c30(this, z, brand, brandingTournament, 2)));
        R().z.e(this, new z1(15, new s26(1, this, LeagueActivity.class, "onHeadersLoaded", "onHeadersLoaded(Lcom/sofascore/results/league/LeagueDetailsHeadFlags;)V", 0, 22)));
        q5a.I(this, U());
        R().C.e(this, new z1(15, new jta(this, 0)));
        z8e.x(this, R().H, new lta(this, rq3Var, i));
        zzc zzcVar = R().E;
        p15 p15Var = new p15(new jta(this, 2), i);
        zzcVar.getClass();
        zzcVar.a.e(this, p15Var);
        zzc zzcVar2 = R().G;
        p15 p15Var2 = new p15(new jta(this, 3), i);
        zzcVar2.getClass();
        zzcVar2.a.e(this, p15Var2);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.activity_favorite_notification_menu, menu);
        View actionView = menu.findItem(R.id.add_to_favorites).getActionView();
        this.g0 = actionView != null ? (FollowActionButton) actionView.findViewById(R.id.follow_button) : null;
        View actionView2 = menu.findItem(R.id.receive_notifications).getActionView();
        this.f0 = actionView2 != null ? (NotificationsActionButton) actionView2.findViewById(R.id.notifications_button) : null;
        this.d0 = menu;
        return true;
    }

    @Override // com.sofascore.results.base.BaseActivity, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        getOnBackPressedDispatcher().c();
        return true;
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        menu.getClass();
        Tournament n = R().n();
        V(n != null ? n.getUniqueTournament() : null);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public final void onProvideAssistContent(AssistContent assistContent) {
        UniqueTournament uniqueTournament;
        assistContent.getClass();
        super.onProvideAssistContent(assistContent);
        Tournament n = R().n();
        if (n == null || (uniqueTournament = n.getUniqueTournament()) == null) {
            return;
        }
        Season l = R().l();
        assistContent.setWebUri(Uri.parse(String.format("%s%s%s", Arrays.copyOf(new Object[]{getString(R.string.share_link), uniqueTournament.getWebUrl(), l != null ? ljg.j(l.getId(), "#id:") : ""}, 3))));
    }

    @Override // com.sofascore.results.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        yta R = R();
        xw3.L(un0.z(R), null, null, new ota(R, null, 0), 3);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        bundle.putInt("START_TAB", S().l.getCurrentItem());
        bundle.putInt("SPINNER_POSITION", ((Spinner) S().g.k).getSelectedItemPosition());
        super.onSaveInstanceState(bundle);
    }

    @Override // com.sofascore.results.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        if (Build.VERSION.SDK_INT >= 34) {
            SharedPreferences sharedPreferences = uic.j;
            if (sharedPreferences == null) {
                Context applicationContext = getApplicationContext();
                synchronized (uic.i) {
                    sharedPreferences = a5f.d(applicationContext);
                    uic.j = sharedPreferences;
                }
                sharedPreferences.getClass();
            }
            if (sharedPreferences.getBoolean("PREF_SCREENSHOT_DO_NOT_SHOW_AGAIN", false)) {
                return;
            }
            registerScreenCaptureCallback(getMainExecutor(), cp4.e(this.e0.getValue()));
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (Build.VERSION.SDK_INT >= 34) {
            try {
                unregisterScreenCaptureCallback(cp4.e(this.e0.getValue()));
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "LeagueScreen";
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String y() {
        return super.y() + " uid/id:" + T() + "/" + R().k;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
    }
}

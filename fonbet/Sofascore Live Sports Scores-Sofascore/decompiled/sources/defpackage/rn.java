package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.CompoundButton;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class rn implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ rn(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    private final void a(CompoundButton compoundButton, boolean z) {
        SharedPreferences d;
        Context context = this.b;
        compoundButton.getClass();
        boolean z2 = !z;
        context.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                d = a5f.d(applicationContext);
                uic.j = d;
            }
            d.getClass();
            sharedPreferences = d;
        }
        wt3.v(sharedPreferences, "PREF_SHOW_FOLLOW_LEAGUE_DIALOG", z2);
        Unit unit = Unit.a;
    }

    private final void b(CompoundButton compoundButton, boolean z) {
        SharedPreferences d;
        Context context = this.b;
        compoundButton.getClass();
        boolean z2 = !z;
        context.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                d = a5f.d(applicationContext);
                uic.j = d;
            }
            d.getClass();
            sharedPreferences = d;
        }
        wt3.v(sharedPreferences, "PREF_SHOW_STAGE_DIALOG", z2);
        Unit unit = Unit.a;
    }

    private final void c(CompoundButton compoundButton, boolean z) {
        SharedPreferences d;
        Context context = this.b;
        compoundButton.getClass();
        boolean z2 = !z;
        context.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                d = a5f.d(applicationContext);
                uic.j = d;
            }
            d.getClass();
            sharedPreferences = d;
        }
        wt3.v(sharedPreferences, "PREF_SHOW_FOLLOW_PLAYER_DIALOG", z2);
        Unit unit = Unit.a;
    }

    private final void d(CompoundButton compoundButton, boolean z) {
        SharedPreferences d;
        Context context = this.b;
        boolean z2 = !z;
        context.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                d = a5f.d(applicationContext);
                uic.j = d;
            }
            d.getClass();
            sharedPreferences = d;
        }
        wt3.v(sharedPreferences, "PREF_SHOW_EVENT_DIALOG", z2);
        Unit unit = Unit.a;
    }

    private final void e(CompoundButton compoundButton, boolean z) {
        SharedPreferences d;
        Context context = this.b;
        compoundButton.getClass();
        boolean z2 = !z;
        context.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                d = a5f.d(applicationContext);
                uic.j = d;
            }
            d.getClass();
            sharedPreferences = d;
        }
        wt3.v(sharedPreferences, "PREF_SHOW_FOLLOW_TEAM_DIALOG", z2);
        Unit unit = Unit.a;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        SharedPreferences d;
        SharedPreferences d2;
        SharedPreferences d3;
        SharedPreferences d4;
        switch (this.a) {
            case 0:
                Context context = this.b;
                compoundButton.getClass();
                boolean z2 = !z;
                context.getClass();
                SharedPreferences sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext = context.getApplicationContext();
                    synchronized (uic.i) {
                        d = a5f.d(applicationContext);
                        uic.j = d;
                    }
                    d.getClass();
                    sharedPreferences = d;
                }
                wt3.v(sharedPreferences, "PREF_SHOW_MANUFACTURER_DIALOG", z2);
                Unit unit = Unit.a;
                return;
            case 1:
                Context context2 = this.b;
                compoundButton.getClass();
                boolean z3 = !z;
                context2.getClass();
                SharedPreferences sharedPreferences2 = uic.j;
                if (sharedPreferences2 == null) {
                    Context applicationContext2 = context2.getApplicationContext();
                    synchronized (uic.i) {
                        d2 = a5f.d(applicationContext2);
                        uic.j = d2;
                    }
                    d2.getClass();
                    sharedPreferences2 = d2;
                }
                SharedPreferences.Editor i = dmi.i(sharedPreferences2, "PREF_SHOW_FOLLOW_UNIQUE_STAGE_INFO", z3);
                Unit unit2 = Unit.a;
                i.apply();
                return;
            case 2:
                Context context3 = this.b;
                compoundButton.getClass();
                boolean z4 = !z;
                context3.getClass();
                SharedPreferences sharedPreferences3 = uic.j;
                if (sharedPreferences3 == null) {
                    Context applicationContext3 = context3.getApplicationContext();
                    synchronized (uic.i) {
                        d3 = a5f.d(applicationContext3);
                        uic.j = d3;
                    }
                    d3.getClass();
                    sharedPreferences3 = d3;
                }
                wt3.v(sharedPreferences3, "PREF_SHOW_FOLLOW_TEAM_DIALOG", z4);
                Unit unit3 = Unit.a;
                return;
            case 3:
                a(compoundButton, z);
                return;
            case 4:
                b(compoundButton, z);
                return;
            case 5:
                c(compoundButton, z);
                return;
            case 6:
                d(compoundButton, z);
                return;
            case 7:
                e(compoundButton, z);
                return;
            default:
                Context context4 = this.b;
                boolean z5 = !z;
                SharedPreferences sharedPreferences4 = uic.j;
                if (sharedPreferences4 == null) {
                    Context applicationContext4 = context4.getApplicationContext();
                    synchronized (uic.i) {
                        d4 = a5f.d(applicationContext4);
                        uic.j = d4;
                    }
                    d4.getClass();
                    sharedPreferences4 = d4;
                }
                SharedPreferences.Editor i2 = dmi.i(sharedPreferences4, "PREF_SHOW_PREDICTION_DIALOG", z5);
                Unit unit4 = Unit.a;
                i2.apply();
                return;
        }
    }
}

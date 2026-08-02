package com.sofascore.results.sofaSeason;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.WorkerParameters;
import com.sofascore.results.service.AbstractRetryCoroutineWorker;
import defpackage.a70;
import defpackage.dhk;
import defpackage.hdb;
import defpackage.jdb;
import defpackage.ke0;
import defpackage.lth;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.y6a;
import java.util.Calendar;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B-\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/sofascore/results/sofaSeason/SofaSeasonWorker;", "Lcom/sofascore/results/service/AbstractRetryCoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Landroid/content/SharedPreferences;", "preferences", "Ldhk;", "userRepository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Landroid/content/SharedPreferences;Ldhk;)V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SofaSeasonWorker extends AbstractRetryCoroutineWorker {
    public final Context b;
    public final SharedPreferences c;
    public final dhk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SofaSeasonWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull SharedPreferences sharedPreferences, @NotNull dhk dhkVar) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        sharedPreferences.getClass();
        dhkVar.getClass();
        this.b = context;
        this.c = sharedPreferences;
        this.d = dhkVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.sofascore.results.service.AbstractRetryCoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(rq3 rq3Var) {
        lth lthVar;
        int i;
        String d;
        if (rq3Var instanceof lth) {
            lthVar = (lth) rq3Var;
            int i2 = lthVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lthVar.t = i2 - Integer.MIN_VALUE;
                Object obj = lthVar.r;
                lu3 lu3Var = lu3.a;
                i = lthVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    SharedPreferences sharedPreferences = this.c;
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.getClass();
                    edit.putInt("SOFA_SEASON_ROLE_ORDINAL", getInputData().a("USER_ROLE", -1));
                    edit.apply();
                    if (sharedPreferences.getBoolean("DEV_MODE_SHOW_SOFA_SEASON", false)) {
                        d = sharedPreferences.getString("DEV_MODE_SOFA_SEASON_ID", "10FBB22F-30DD-417D-9AFA-69A544B3B46C");
                        if (d == null) {
                            d = "";
                        }
                    } else {
                        Calendar calendar = ke0.a;
                        d = ke0.d(this.b);
                    }
                    lthVar.t = 1;
                    obj = this.d.h(d, lthVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return !((Boolean) obj).booleanValue() ? jdb.a() : new hdb();
            }
        }
        lthVar = new lth(this, (sq3) rq3Var);
        Object obj2 = lthVar.r;
        lu3 lu3Var2 = lu3.a;
        i = lthVar.t;
        if (i != 0) {
        }
        if (!((Boolean) obj2).booleanValue()) {
        }
    }
}

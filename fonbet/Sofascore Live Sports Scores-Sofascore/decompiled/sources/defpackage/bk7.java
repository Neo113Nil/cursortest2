package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.blaze.blazesdk.features.videos.players.ui.a;
import com.sofascore.results.feed.FeedFragment;
import com.sofascore.results.team.TeamActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class bk7 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bk7(int i, Function0 function0) {
        this.a = 3;
        this.b = i;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long e;
        long currentTimeMillis;
        long e2;
        boolean z = true;
        switch (this.a) {
            case 0:
                ksa ksaVar = (ksa) this.c;
                int i = this.b;
                if ((ksaVar.h() != i || ksaVar.i() == 0) && ksaVar.h() <= i) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                FeedFragment feedFragment = (FeedFragment) this.c;
                int i2 = this.b;
                Context requireContext = feedFragment.requireContext();
                requireContext.getClass();
                if (i2 != 0) {
                    if (i2 == 1) {
                        currentTimeMillis = System.currentTimeMillis();
                        wd5 wd5Var = xd5.b;
                        e2 = xd5.e(wkn.R(2, be5.DAYS));
                    } else if (i2 != 2) {
                        e = -1;
                    } else {
                        currentTimeMillis = System.currentTimeMillis();
                        wd5 wd5Var2 = xd5.b;
                        e2 = xd5.e(wkn.R(4, be5.DAYS));
                    }
                    e = currentTimeMillis + e2;
                } else {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    wd5 wd5Var3 = xd5.b;
                    e = xd5.e(wkn.R(1, be5.DAYS)) + currentTimeMillis2;
                }
                SharedPreferences sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext = requireContext.getApplicationContext();
                    synchronized (uic.i) {
                        sharedPreferences = a5f.d(applicationContext);
                        uic.j = sharedPreferences;
                    }
                    sharedPreferences.getClass();
                }
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.getClass();
                edit.putLong("PREF_FEED_UPDATE_TIMESTAMP", e);
                Unit unit = Unit.a;
                edit.apply();
                return Unit.a;
            case 2:
                zg9 zg9Var = (zg9) this.c;
                int i3 = this.b;
                zg9Var.k.getClass();
                synchronized (zg9Var) {
                    zg9Var.z.remove(Integer.valueOf(i3));
                }
                return Unit.a;
            case 3:
                return new pr4(this.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Function0) this.c);
            case 4:
                y5f y5fVar = (y5f) this.c;
                int i4 = this.b;
                int i5 = TeamActivity.Z;
                Context context = y5fVar.getContext();
                context.getClass();
                jle.r(context, i4, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                return Unit.a;
            case 5:
                return Integer.valueOf(((aej) ((zz0) this.c).e).b.d(this.b));
            case 6:
                return (x6a) ((koh) this.c).get(Integer.valueOf(this.b));
            case 7:
                iul iulVar = (iul) this.c;
                iulVar.d(this.b);
                iulVar.a = null;
                return Unit.a;
            case 8:
                obm obmVar = (obm) this.c;
                obmVar.C(this.b, obmVar.z);
                return Unit.a;
            default:
                bzm bzmVar = (bzm) this.c;
                int i6 = this.b;
                a aVar = bzmVar.b;
                int i7 = a.I;
                w3m.onPageSelected$default((w3m) aVar.getViewModel(), i6, false, 2, null);
                bzmVar.a = null;
                return Unit.a;
        }
    }

    public /* synthetic */ bk7(zg9 zg9Var, int i, tp5 tp5Var) {
        this.a = 2;
        this.c = zg9Var;
        this.b = i;
    }

    public /* synthetic */ bk7(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }
}

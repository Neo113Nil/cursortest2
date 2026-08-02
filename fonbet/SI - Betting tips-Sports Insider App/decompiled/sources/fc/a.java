package fc;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import cd.q;
import com.sports.insider.MyApp;
import com.sports.insider.R;
import com.sports.insider.data.repository.room.accountsetting.database.AccountSetting;
import com.sports.insider.data.repository.room.billing.BillingDatabase;
import com.sports.insider.data.repository.room.sports.db.impl.SportsDatabase;
import com.sports.insider.data.room.general.AppDatabase;
import eb.f;
import eb.m;
import eg.v1;
import eg.z;
import f0.l;
import io.appmetrica.analytics.impl.C0122e9;
import io.sentry.hints.j;
import k2.s;
import k2.x;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import la.g;
import la.t0;
import la.u0;
import md.o;
import pb.e;
import za.h;
import za.i;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9550a;

    public /* synthetic */ a(int i5) {
        this.f9550a = i5;
    }

    private final Object a(Object obj, Object obj2) {
        ji.a single = (ji.a) obj;
        fi.a it = (fi.a) obj2;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        j jVar = AccountSetting.f6836l;
        Context context = x.d(single);
        Intrinsics.checkNotNullParameter(context, "context");
        AccountSetting accountSetting = AccountSetting.f6837m;
        if (accountSetting == null) {
            synchronized (jVar) {
                accountSetting = AccountSetting.f6837m;
                if (accountSetting == null) {
                    Context applicationContext = context.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                    AccountSetting accountSetting2 = (AccountSetting) h8.b.i(applicationContext, AccountSetting.class, "setting_account").b();
                    AccountSetting.f6837m = accountSetting2;
                    accountSetting = accountSetting2;
                }
            }
        }
        return new db.a(accountSetting.t());
    }

    private final Object b(Object obj, Object obj2) {
        ji.a single = (ji.a) obj;
        fi.a it = (fi.a) obj2;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        o oVar = SportsDatabase.f6857l;
        Context context = x.d(single);
        Intrinsics.checkNotNullParameter(context, "context");
        SportsDatabase sportsDatabase = SportsDatabase.f6858m;
        if (sportsDatabase == null) {
            synchronized (oVar) {
                sportsDatabase = SportsDatabase.f6858m;
                if (sportsDatabase == null) {
                    Context applicationContext = context.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                    s i5 = h8.b.i(applicationContext, SportsDatabase.class, "Sports");
                    i5.a(new f(1, 2, 2));
                    i5.a(new f(2, 3, 3));
                    SportsDatabase sportsDatabase2 = (SportsDatabase) i5.b();
                    SportsDatabase.f6858m = sportsDatabase2;
                    sportsDatabase = sportsDatabase2;
                }
            }
        }
        return new e(sportsDatabase.t());
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Typeface typeface;
        Typeface typeface2;
        Typeface typeface3 = null;
        switch (this.f9550a) {
            case 0:
                ji.a factory = (ji.a) obj;
                fi.a it = (fi.a) obj2;
                Intrinsics.checkNotNullParameter(factory, "$this$factory");
                Intrinsics.checkNotNullParameter(it, "it");
                return new t0();
            case 1:
                ji.a factory2 = (ji.a) obj;
                fi.a it2 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter(factory2, "$this$factory");
                Intrinsics.checkNotNullParameter(it2, "it");
                return new u0();
            case 2:
                ji.a single = (ji.a) obj;
                fi.a it3 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter(single, "$this$single");
                Intrinsics.checkNotNullParameter(it3, "it");
                j jVar = BillingDatabase.f6839l;
                Context context = x.d(single);
                Intrinsics.checkNotNullParameter(context, "context");
                BillingDatabase billingDatabase = BillingDatabase.f6840m;
                if (billingDatabase == null) {
                    synchronized (jVar) {
                        billingDatabase = BillingDatabase.f6840m;
                        if (billingDatabase == null) {
                            Context applicationContext = context.getApplicationContext();
                            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                            s i5 = h8.b.i(applicationContext, BillingDatabase.class, "billing");
                            i5.a(new f(1, 2, 0), new f(2, 3, 1));
                            BillingDatabase billingDatabase2 = (BillingDatabase) i5.b();
                            BillingDatabase.f6840m = billingDatabase2;
                            billingDatabase = billingDatabase2;
                        }
                    }
                }
                return new m(billingDatabase.t());
            case 3:
                ji.a single2 = (ji.a) obj;
                fi.a it4 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter(single2, "$this$single");
                Intrinsics.checkNotNullParameter(it4, "it");
                s7.s sVar = AppDatabase.f6866l;
                return new sb.j(sVar.e(x.d(single2)).t(), sVar.e(x.d(single2)).u());
            case 4:
                ji.a factory3 = (ji.a) obj;
                fi.a it5 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter(factory3, "$this$factory");
                Intrinsics.checkNotNullParameter(it5, "it");
                return new la.a();
            case 5:
                ji.a factory4 = (ji.a) obj;
                fi.a it6 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter(factory4, "$this$factory");
                Intrinsics.checkNotNullParameter(it6, "it");
                return new g();
            case 6:
                ji.a factory5 = (ji.a) obj;
                fi.a it7 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter(factory5, "$this$factory");
                Intrinsics.checkNotNullParameter(it7, "it");
                return new la.m();
            case 7:
                return a(obj, obj2);
            case 8:
                ji.a factory6 = (ji.a) obj;
                fi.a it8 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter(factory6, "$this$factory");
                Intrinsics.checkNotNullParameter(it8, "it");
                return new la.b();
            case 9:
                return b(obj, obj2);
            case 10:
                ji.a factory7 = (ji.a) obj;
                fi.a it9 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter(factory7, "$this$factory");
                Intrinsics.checkNotNullParameter(it9, "it");
                return new la.o();
            case 11:
                ji.a factory8 = (ji.a) obj;
                fi.a it10 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter(factory8, "$this$factory");
                Intrinsics.checkNotNullParameter(it10, "it");
                return new oc.a(x.d(factory8));
            case 12:
                ji.a single3 = (ji.a) obj;
                fi.a it11 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter(single3, "$this$single");
                Intrinsics.checkNotNullParameter(it11, "it");
                return x.d(single3).getSharedPreferences("user", 0);
            case 13:
                ji.a single4 = (ji.a) obj;
                fi.a it12 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter(single4, "$this$single");
                Intrinsics.checkNotNullParameter(it12, "it");
                return x.d(single4).getSharedPreferences("settings", 0);
            case 14:
                ji.a single5 = (ji.a) obj;
                fi.a it13 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter(single5, "$this$single");
                Intrinsics.checkNotNullParameter(it13, "it");
                return new fa.a((SharedPreferences) single5.a(Reflection.getOrCreateKotlinClass(SharedPreferences.class), a.a.v("user")), (SharedPreferences) single5.a(Reflection.getOrCreateKotlinClass(SharedPreferences.class), a.a.v("settings")));
            case 15:
                ji.a single6 = (ji.a) obj;
                fi.a it14 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter(single6, "$this$single");
                Intrinsics.checkNotNullParameter(it14, "it");
                return new id.e(x.d(single6), (z) single6.a(Reflection.getOrCreateKotlinClass(z.class), null));
            case 16:
                ji.a single7 = (ji.a) obj;
                fi.a it15 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter(single7, "$this$single");
                Intrinsics.checkNotNullParameter(it15, "it");
                return new q(x.d(single7), (z) single7.a(Reflection.getOrCreateKotlinClass(z.class), null));
            case 17:
                ji.a factory9 = (ji.a) obj;
                fi.a it16 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter(factory9, "$this$factory");
                Intrinsics.checkNotNullParameter(it16, "it");
                return new dc.a();
            case 18:
                ji.a factory10 = (ji.a) obj;
                fi.a it17 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter(factory10, "$this$factory");
                Intrinsics.checkNotNullParameter(it17, "it");
                Context context2 = x.d(factory10);
                Intrinsics.checkNotNullParameter(context2, "context");
                za.f fVar = new za.f();
                fVar.f25899a = context2;
                return fVar;
            case 19:
                ji.a factory11 = (ji.a) obj;
                fi.a it18 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter(factory11, "$this$factory");
                Intrinsics.checkNotNullParameter(it18, "it");
                Context appContext = x.d(factory11);
                Intrinsics.checkNotNullParameter(appContext, "appContext");
                zb.b bVar = new zb.b();
                bVar.f25906a = appContext;
                return bVar;
            case 20:
                ji.a factory12 = (ji.a) obj;
                fi.a it19 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter(factory12, "$this$factory");
                Intrinsics.checkNotNullParameter(it19, "it");
                return new za.b();
            case 21:
                ji.a factory13 = (ji.a) obj;
                fi.a it20 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter(factory13, "$this$factory");
                Intrinsics.checkNotNullParameter(it20, "it");
                return new h();
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                fi.a it21 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter((ji.a) obj, "$this$single");
                Intrinsics.checkNotNullParameter(it21, "it");
                return MyApp.f6830c;
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                ji.a factory14 = (ji.a) obj;
                fi.a it22 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter(factory14, "$this$factory");
                Intrinsics.checkNotNullParameter(it22, "it");
                Context androidContext = x.d(factory14);
                Intrinsics.checkNotNullParameter(androidContext, "androidContext");
                ea.a aVar = new ea.a();
                aVar.f8783a = androidContext;
                aVar.c();
                aVar.d();
                return aVar;
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                ji.a single8 = (ji.a) obj;
                fi.a it23 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter(single8, "$this$single");
                Intrinsics.checkNotNullParameter(it23, "it");
                Context context3 = x.d(single8);
                Intrinsics.checkNotNullParameter(context3, "context");
                ve.s sVar2 = new ve.s();
                sVar2.f24827a = context3;
                try {
                    typeface = l.b(context3, R.font.arimo_regular);
                } catch (Exception unused) {
                    typeface = null;
                }
                sVar2.f24828b = typeface;
                try {
                    typeface2 = l.b(sVar2.f24827a, R.font.arimo_bold);
                } catch (Exception unused2) {
                    typeface2 = null;
                }
                sVar2.f24829c = typeface2;
                try {
                    typeface3 = l.b(sVar2.f24827a, R.font.montserrat_black);
                } catch (Exception unused3) {
                }
                sVar2.f24830d = typeface3;
                return sVar2;
            case C0122e9.F /* 25 */:
                ji.a single9 = (ji.a) obj;
                fi.a it24 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter(single9, "$this$single");
                Intrinsics.checkNotNullParameter(it24, "it");
                Context context4 = x.d(single9);
                Intrinsics.checkNotNullParameter(context4, "context");
                i iVar = new i();
                iVar.f25901a = context4;
                return iVar;
            case C0122e9.G /* 26 */:
                ji.a factory15 = (ji.a) obj;
                fi.a it25 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter(factory15, "$this$factory");
                Intrinsics.checkNotNullParameter(it25, "it");
                return new yb.m();
            case C0122e9.H /* 27 */:
                fi.a it26 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter((ji.a) obj, "$this$single");
                Intrinsics.checkNotNullParameter(it26, "it");
                return new cc.i();
            case 28:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            default:
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                if (!(element instanceof v1)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? element : Integer.valueOf(intValue + 1);
        }
    }
}

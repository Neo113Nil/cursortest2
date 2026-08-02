package c1;

import android.app.NotificationManager;
import android.content.Context;
import com.sports.insider.data.repository.room.live.LiveDatabase;
import com.sports.insider.data.repository.room.metric.MetricsDatabase;
import com.sports.insider.data.repository.room.news.NewsDatabase;
import com.sports.insider.data.repository.room.support.dp.impl.SupportDatabase;
import io.appmetrica.analytics.impl.C0122e9;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import la.j1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3415a;

    public /* synthetic */ k(int i5) {
        this.f3415a = i5;
    }

    private final Object a(Object obj, Object obj2) {
        ji.a single = (ji.a) obj;
        fi.a it = (fi.a) obj2;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        m8.a aVar = SupportDatabase.f6862l;
        Context context = k2.x.d(single);
        Intrinsics.checkNotNullParameter(context, "context");
        SupportDatabase supportDatabase = SupportDatabase.f6863m;
        if (supportDatabase == null) {
            synchronized (aVar) {
                supportDatabase = SupportDatabase.f6863m;
                if (supportDatabase == null) {
                    Context applicationContext = context.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                    k2.s i5 = h8.b.i(applicationContext, SupportDatabase.class, "support");
                    i5.a(new eb.f(1, 2, 4));
                    SupportDatabase supportDatabase2 = (SupportDatabase) i5.b();
                    SupportDatabase.f6863m = supportDatabase2;
                    supportDatabase = supportDatabase2;
                }
            }
        }
        return new rb.g(supportDatabase.t());
    }

    private final Object b(Object obj, Object obj2) {
        ji.a single = (ji.a) obj;
        fi.a it = (fi.a) obj2;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        io.sentry.hints.j jVar = NewsDatabase.f6853l;
        Context context = k2.x.d(single);
        Intrinsics.checkNotNullParameter(context, "context");
        NewsDatabase newsDatabase = NewsDatabase.f6854m;
        if (newsDatabase == null) {
            synchronized (jVar) {
                newsDatabase = NewsDatabase.f6854m;
                if (newsDatabase == null) {
                    Context applicationContext = context.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                    NewsDatabase newsDatabase2 = (NewsDatabase) h8.b.i(applicationContext, NewsDatabase.class, "news").b();
                    NewsDatabase.f6854m = newsDatabase2;
                    newsDatabase = newsDatabase2;
                }
            }
        }
        return new ib.e(newsDatabase.t());
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3415a) {
            case 0:
                u0 msg = (u0) obj;
                Throwable th2 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(msg, "msg");
                eg.r rVar = msg.f3482b;
                if (th2 == null) {
                    th2 = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                rVar.h0(th2);
                return Unit.f19194a;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 2:
                return ((CoroutineContext) obj).t((CoroutineContext.Element) obj2);
            case 3:
                return ((CoroutineContext) obj).t((CoroutineContext.Element) obj2);
            case 4:
                ji.a single = (ji.a) obj;
                fi.a it = (fi.a) obj2;
                Intrinsics.checkNotNullParameter(single, "$this$single");
                Intrinsics.checkNotNullParameter(it, "it");
                m3.f fVar = LiveDatabase.f6843l;
                Context context = k2.x.d(single);
                Intrinsics.checkNotNullParameter(context, "context");
                LiveDatabase liveDatabase = LiveDatabase.f6844m;
                if (liveDatabase == null) {
                    synchronized (fVar) {
                        liveDatabase = LiveDatabase.f6844m;
                        if (liveDatabase == null) {
                            Context applicationContext = context.getApplicationContext();
                            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                            LiveDatabase liveDatabase2 = (LiveDatabase) h8.b.i(applicationContext, LiveDatabase.class, "live").b();
                            LiveDatabase.f6844m = liveDatabase2;
                            liveDatabase = liveDatabase2;
                        }
                    }
                }
                return new la.p(liveDatabase.t());
            case 5:
                return a(obj, obj2);
            case 6:
                ji.a factory = (ji.a) obj;
                fi.a it2 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter(factory, "$this$factory");
                Intrinsics.checkNotNullParameter(it2, "it");
                return new j1();
            case 7:
                ji.a single2 = (ji.a) obj;
                fi.a it3 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter(single2, "$this$single");
                Intrinsics.checkNotNullParameter(it3, "it");
                io.sentry.hints.j jVar = MetricsDatabase.f6848l;
                return new hb.g(jVar.w(k2.x.d(single2)).t(), jVar.w(k2.x.d(single2)).u());
            case 8:
                ji.a factory2 = (ji.a) obj;
                fi.a it4 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter(factory2, "$this$factory");
                Intrinsics.checkNotNullParameter(it4, "it");
                return new la.w();
            case 9:
                ji.a factory3 = (ji.a) obj;
                fi.a it5 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter(factory3, "$this$factory");
                Intrinsics.checkNotNullParameter(it5, "it");
                return new bc.a();
            case 10:
                ji.a factory4 = (ji.a) obj;
                fi.a it6 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter(factory4, "$this$factory");
                Intrinsics.checkNotNullParameter(it6, "it");
                Context context2 = k2.x.d(factory4);
                Intrinsics.checkNotNullParameter(context2, "context");
                za.e eVar = new za.e();
                eVar.f25898a = context2;
                return eVar;
            case 11:
                return b(obj, obj2);
            case 12:
                ji.a factory5 = (ji.a) obj;
                fi.a it7 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter(factory5, "$this$factory");
                Intrinsics.checkNotNullParameter(it7, "it");
                return new la.c0();
            case 13:
                fi.a it8 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter((ji.a) obj, "$this$single");
                Intrinsics.checkNotNullParameter(it8, "it");
                return new gc.c();
            case 14:
                ji.a factory6 = (ji.a) obj;
                fi.a it9 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter(factory6, "$this$factory");
                Intrinsics.checkNotNullParameter(it9, "it");
                return new gc.a();
            case 15:
                fi.a it10 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter((ji.a) obj, "$this$single");
                Intrinsics.checkNotNullParameter(it10, "it");
                return new ea.e();
            case 16:
                ji.a single3 = (ji.a) obj;
                fi.a it11 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter(single3, "$this$single");
                Intrinsics.checkNotNullParameter(it11, "it");
                return new yb.i(k2.x.d(single3));
            case 17:
                fi.a it12 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter((ji.a) obj, "$this$single");
                Intrinsics.checkNotNullParameter(it12, "it");
                return new pc.u();
            case 18:
                ji.a factory7 = (ji.a) obj;
                fi.a it13 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter(factory7, "$this$factory");
                Intrinsics.checkNotNullParameter(it13, "it");
                Context context3 = k2.x.d(factory7);
                Intrinsics.checkNotNullParameter(context3, "context");
                f3.v e7 = f3.v.e(context3);
                Intrinsics.checkNotNullExpressionValue(e7, "getInstance(...)");
                return e7;
            case 19:
                ji.a factory8 = (ji.a) obj;
                fi.a it14 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter(factory8, "$this$factory");
                Intrinsics.checkNotNullParameter(it14, "it");
                Object systemService = k2.x.d(factory8).getSystemService("notification");
                if (systemService instanceof NotificationManager) {
                    return (NotificationManager) systemService;
                }
                return null;
            case 20:
                ji.a factory9 = (ji.a) obj;
                fi.a it15 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter(factory9, "$this$factory");
                Intrinsics.checkNotNullParameter(it15, "it");
                c0.h0 h0Var = new c0.h0(k2.x.d(factory9));
                Intrinsics.checkNotNullExpressionValue(h0Var, "from(...)");
                return h0Var;
            case 21:
                fi.a it16 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter((ji.a) obj, "$this$single");
                Intrinsics.checkNotNullParameter(it16, "it");
                return ac.d.f126a;
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                ji.a factory10 = (ji.a) obj;
                fi.a it17 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter(factory10, "$this$factory");
                Intrinsics.checkNotNullParameter(it17, "it");
                Context context4 = k2.x.d(factory10);
                Intrinsics.checkNotNullParameter(context4, "context");
                za.k kVar = new za.k();
                kVar.f25905a = context4;
                return kVar;
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                ji.a factory11 = (ji.a) obj;
                fi.a it18 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter(factory11, "$this$factory");
                Intrinsics.checkNotNullParameter(it18, "it");
                return new la.c1();
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                ji.a factory12 = (ji.a) obj;
                fi.a it19 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter(factory12, "$this$factory");
                Intrinsics.checkNotNullParameter(it19, "it");
                return new la.d();
            case C0122e9.F /* 25 */:
                ji.a factory13 = (ji.a) obj;
                fi.a it20 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter(factory13, "$this$factory");
                Intrinsics.checkNotNullParameter(it20, "it");
                return new la.m0();
            case C0122e9.G /* 26 */:
                ji.a factory14 = (ji.a) obj;
                fi.a it21 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter(factory14, "$this$factory");
                Intrinsics.checkNotNullParameter(it21, "it");
                return new la.s0();
            case C0122e9.H /* 27 */:
                ji.a factory15 = (ji.a) obj;
                fi.a it22 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter(factory15, "$this$factory");
                Intrinsics.checkNotNullParameter(it22, "it");
                return new la.g0();
            case 28:
                ji.a factory16 = (ji.a) obj;
                fi.a it23 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter(factory16, "$this$factory");
                Intrinsics.checkNotNullParameter(it23, "it");
                return new la.e1();
            default:
                ji.a factory17 = (ji.a) obj;
                fi.a it24 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter(factory17, "$this$factory");
                Intrinsics.checkNotNullParameter(it24, "it");
                return new la.h();
        }
    }
}

package defpackage;

import android.app.Activity;
import android.app.Application;
import androidx.appcompat.app.AppCompatActivity;
import com.adsbynimbus.google.GoogleAuctionData;
import com.sofascore.model.firebase.AdType;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class g9a extends q8 {
    public final yzc e;
    public final yzc f;
    public final yzc g;
    public final yzc h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9a(@NotNull Application application) {
        super(application);
        application.getClass();
        yzc yzcVar = new yzc();
        this.e = yzcVar;
        this.f = yzcVar;
        yzc yzcVar2 = new yzc();
        this.g = yzcVar2;
        this.h = yzcVar2;
    }

    @Override // defpackage.ltk
    public final void e() {
        this.e.j(null);
        this.g.j(null);
    }

    public final yzc k(AdType.Interstitial interstitial) {
        int i = b9a.a[interstitial.ordinal()];
        if (i == 1) {
            return this.e;
        }
        if (i == 2) {
            return this.g;
        }
        zzl.b();
        return null;
    }

    public final void l(Activity activity, AdType.Interstitial interstitial) {
        activity.getClass();
        interstitial.getClass();
        AppCompatActivity appCompatActivity = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
        WeakReference weakReference = appCompatActivity != null ? new WeakReference(appCompatActivity) : null;
        ia0 ia0Var = ia0.q;
        if (mz1.C()) {
            Application application = activity.getApplication();
            application.getClass();
            if (z8e.O(application)) {
                xw3.L(un0.z(this), null, null, new c9a(interstitial, weakReference, this, null), 3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(WeakReference weakReference, AdType.Interstitial interstitial, sq3 sq3Var) {
        d9a d9aVar;
        int i;
        x2g x2gVar;
        zrh zrhVar;
        AppCompatActivity appCompatActivity;
        g6b lifecycle;
        if (sq3Var instanceof d9a) {
            d9aVar = (d9a) sq3Var;
            int i2 = d9aVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d9aVar.u = i2 - Integer.MIN_VALUE;
                Object obj = d9aVar.s;
                lu3 lu3Var = lu3.a;
                i = d9aVar.u;
                if (i != 0) {
                    y6a.M(obj);
                    AppCompatActivity appCompatActivity2 = (AppCompatActivity) weakReference.get();
                    if (appCompatActivity2 == null) {
                        x2gVar = null;
                        if ((x2gVar instanceof v2g) || (zrhVar = (zrh) ((v2g) x2gVar).a) == null) {
                            return null;
                        }
                        if (mx9.x(true) && (appCompatActivity = (AppCompatActivity) weakReference.get()) != null && (lifecycle = appCompatActivity.getLifecycle()) != null) {
                            lifecycle.a(new h6(3, lifecycle, zrhVar));
                        }
                        LinkedHashMap linkedHashMap = nk.a;
                        AdType.Interstitial adType = zrhVar.getAdType();
                        adType.getClass();
                        nk.a.put(adType, zrhVar);
                        return zrhVar;
                    }
                    e9a e9aVar = new e9a(appCompatActivity2, interstitial, null);
                    d9aVar.r = weakReference;
                    d9aVar.u = 1;
                    obj = yaa.P(e9aVar, d9aVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    weakReference = d9aVar.r;
                    y6a.M(obj);
                }
                x2gVar = (x2g) obj;
                if (x2gVar instanceof v2g) {
                }
                return null;
            }
        }
        d9aVar = new d9a(this, sq3Var);
        Object obj2 = d9aVar.s;
        lu3 lu3Var2 = lu3.a;
        i = d9aVar.u;
        if (i != 0) {
        }
        x2gVar = (x2g) obj2;
        if (x2gVar instanceof v2g) {
        }
        return null;
    }

    public final void n(zrh zrhVar, Function0 function0) {
        jcd jcdVar = new jcd();
        wcd d = zrhVar.d();
        zrhVar.g(new f9a(d != null ? new GoogleAuctionData(d) : null, zrhVar, this, jcdVar, function0));
    }
}

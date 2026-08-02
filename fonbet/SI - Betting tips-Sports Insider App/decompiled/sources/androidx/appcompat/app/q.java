package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f340a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f341b;

    public /* synthetic */ q(Context context, int i5) {
        this.f340a = i5;
        this.f341b = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x008b, code lost:
    
        if (r2 != null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        l0.g gVar;
        Object obj;
        Context context;
        switch (this.f340a) {
            case 0:
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 33) {
                    Context context2 = this.f341b;
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i5 < 33) {
                            gVar = v.f355c;
                            break;
                        } else {
                            s.f fVar = v.f359g;
                            fVar.getClass();
                            s.a aVar = new s.a(fVar);
                            while (true) {
                                if (aVar.hasNext()) {
                                    v vVar = (v) ((WeakReference) aVar.next()).get();
                                    if (vVar != null && (context = ((l0) vVar).f304k) != null) {
                                        obj = context.getSystemService(CommonUrlParts.LOCALE);
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            if (obj != null) {
                                gVar = new l0.g(new l0.j(s.a(obj)));
                                if (gVar.f19306a.isEmpty()) {
                                    String e7 = c0.d.e(context2);
                                    Object systemService = context2.getSystemService(CommonUrlParts.LOCALE);
                                    if (systemService != null) {
                                        s.b(systemService, r.a(e7));
                                    }
                                }
                                context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                            }
                            gVar = l0.g.f19305b;
                            if (gVar.f19306a.isEmpty()) {
                            }
                            context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        }
                    }
                }
                v.f358f = true;
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new q(this.f341b, 2));
                break;
            default:
                i2.f.t(this.f341b, new o.a(1), i2.f.f10883a, false);
                break;
        }
    }
}

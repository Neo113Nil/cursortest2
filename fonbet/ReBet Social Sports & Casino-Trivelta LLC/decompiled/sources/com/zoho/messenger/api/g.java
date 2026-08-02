package com.zoho.messenger.api;

import Q2.C1495f;
import Q2.K;
import Q2.L;
import Q2.O;
import Q2.w;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.C;
import com.zoho.messenger.api.g;
import com.zoho.wms.common.workmanager.workers.WmsCanaryWorker;
import gg.C4379a;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public abstract class g {

    public class a implements C {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f44609a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function1 f44610b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ L f44611c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C4379a f44612d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ UUID f44613e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Function0 f44614f;
        final /* synthetic */ boolean[] val$isCompleted;

        public a(String str, boolean[] zArr, Function1 function1, L l10, C4379a c4379a, UUID uuid, Function0 function0) {
            this.f44609a = str;
            this.val$isCompleted = zArr;
            this.f44610b = function1;
            this.f44611c = l10;
            this.f44612d = c4379a;
            this.f44613e = uuid;
            this.f44614f = function0;
        }

        @Override // androidx.lifecycle.C
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(K k10) {
            if (k10 == null) {
                return;
            }
            K.c b10 = k10.b();
            b10.name();
            if (b10 == K.c.SUCCEEDED) {
                if (WmsCanaryWorker.a.SUCCESS.name().equals(k10.a().d("wms_canary_result"))) {
                    this.val$isCompleted[0] = true;
                    this.f44610b.invoke(this.f44611c);
                } else {
                    g.e(this.f44609a, this.f44612d, null);
                }
                this.f44611c.i(this.f44613e).removeObserver(this);
                return;
            }
            if (b10 == K.c.FAILED) {
                this.val$isCompleted[0] = true;
                Log.e(this.f44609a, "Canary worker FAILED. Custom WorkerFactory is misconfigured.");
                this.f44614f.invoke();
                g.f(this.f44609a, this.f44612d);
                this.f44611c.i(this.f44613e).removeObserver(this);
            }
        }
    }

    public static /* synthetic */ void b(boolean[] zArr, Function0 function0, String str, C4379a c4379a) {
        if (zArr[0]) {
            return;
        }
        function0.invoke();
        Log.e(str, "Canary worker FAILED. Timed out waiting for completion.");
        f(str, c4379a);
    }

    public static void e(String str, C4379a c4379a, Exception exc) {
        String str2 = "\n************************** ZOHO " + str + " SDK INITIALIZATION ERROR **************************\n* WorkManager failed to initialize. This is a critical error that will prevent\n* all background features of the Zoho " + str + " library from functioning reliably.\n*\n* This usually happens if you have disabled the default WorkManagerInitializer\n* in your AndroidManifest.xml without providing a custom configuration.\n*\n* To fix this, please either:\n*   1. REMOVE 'tools:node=\"remove\"' for 'WorkManagerInitializer' or the\n*      startup provider from your AndroidManifest.xml.\n*      OR\n*   2. Ensure your Application class implements 'androidx.work.Configuration.Provider'\n*      and correctly provides a WorkManager Configuration.\n*\n";
        if (exc != null) {
            str2 = str2 + "* Root cause: " + exc.getMessage() + "\n********************************************************************************\n* Stack trace:\n" + Log.getStackTraceString(exc);
        }
        String str3 = str2 + "********************************************************************************";
        if (c4379a == null || c4379a.B(str3)) {
            Log.e(str, str3);
        }
    }

    public static void f(String str, C4379a c4379a) {
        String str2 = "\n************************* ZOHO " + str + " SDK CONFIGURATION WARNING *************************\n* Your application's custom WorkManager.WorkerFactory is not configured\n* to support the Zoho " + str + " library. This can lead to unexpected crashes.\n*\n* >>> To fix this, please add the following code to the TOP of your <<<\n* >>> custom WorkerFactory's createWorker() method:                  <<<\n*\n*   if (workerClassName.startsWith(\"com.zoho.\")) {\n*       return null;\n*   }\n*\n* This allows our SDK to handle its own background tasks safely.\n* Until this is fixed, SDK background features will not work reliably.\n*******************************************************************************";
        if (c4379a == null || c4379a.B(str2)) {
            Log.e(str, str2);
        }
    }

    public static void g(final String str, String str2, final Function1 function1, final Function0 function0) {
        final L g10;
        O q10;
        final C4379a e10 = b.e(str2);
        try {
            g10 = L.g();
            q10 = g10.f().q();
        } catch (Exception e11) {
            e = e11;
        }
        try {
            if (q10.getClass().getName().equals(O.class.getName()) || q10.getClass().getName().equals(C1495f.class.getName())) {
                function1.invoke(g10);
                return;
            }
            w wVar = (w) new w.a(WmsCanaryWorker.class).a();
            final UUID a10 = wVar.a();
            g10.b(wVar);
            Handler handler = new Handler(Looper.getMainLooper());
            final boolean[] zArr = {false};
            handler.post(new Runnable() { // from class: com.zoho.messenger.api.e
                @Override // java.lang.Runnable
                public final void run() {
                    r0.i(r1).observeForever(new g.a(str, zArr, function1, L.this, e10, a10, function0));
                }
            });
            handler.postDelayed(new Runnable() { // from class: com.zoho.messenger.api.f
                @Override // java.lang.Runnable
                public final void run() {
                    g.b(zArr, function0, str, e10);
                }
            }, 10000L);
        } catch (Exception e12) {
            e = e12;
            e(str, e10, e);
            function0.invoke();
        }
    }
}

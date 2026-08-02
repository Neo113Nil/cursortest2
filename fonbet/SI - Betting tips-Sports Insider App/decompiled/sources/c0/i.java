package c0;

import android.app.ActivityManager;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Process;
import com.sports.insider.domain.service.RestartService;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f3274a;

    public i(o oVar) {
        this.f3274a = oVar;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        l lVar;
        while (true) {
            o oVar = this.f3274a;
            n nVar = oVar.f3290a;
            int i5 = 0;
            if (nVar != null) {
                lVar = nVar.b();
            } else {
                synchronized (oVar.f3294e) {
                    try {
                        lVar = oVar.f3294e.size() > 0 ? (l) oVar.f3294e.remove(0) : null;
                    } finally {
                    }
                }
            }
            if (lVar == null) {
                return null;
            }
            o oVar2 = this.f3274a;
            Intent intent = lVar.getIntent();
            RestartService restartService = (RestartService) oVar2;
            Intrinsics.checkNotNullParameter(intent, "intent");
            Object systemService = restartService.getSystemService("activity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            int size = runningAppProcesses.size();
            while (true) {
                if (i5 >= size) {
                    break;
                }
                if (Intrinsics.areEqual(runningAppProcesses.get(i5).processName, "com.sports.insider")) {
                    Process.killProcess(runningAppProcesses.get(i5).pid);
                    break;
                }
                i5++;
            }
            Intent launchIntentForPackage = restartService.getPackageManager().getLaunchIntentForPackage("com.sports.insider");
            if (launchIntentForPackage != null) {
                launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
                launchIntentForPackage.addFlags(872448000);
            } else {
                launchIntentForPackage = null;
            }
            try {
                restartService.startActivity(launchIntentForPackage);
            } catch (Exception e7) {
                zc.d.b(6, null, e7);
            }
            lVar.a();
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled(Object obj) {
        this.f3274a.b();
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        this.f3274a.b();
    }
}

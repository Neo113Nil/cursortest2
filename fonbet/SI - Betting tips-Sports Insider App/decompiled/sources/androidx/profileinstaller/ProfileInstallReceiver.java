package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import i2.d;
import i2.f;
import java.io.File;
import o.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            f.t(context, new a(1), new d(0, this), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if (!"WRITE_SKIP_FILE".equals(string)) {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                        setResultCode(11);
                        return;
                    }
                    return;
                }
                d dVar = new d(0, this);
                try {
                    f.e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    dVar.k(10, null);
                    return;
                } catch (PackageManager.NameNotFoundException e7) {
                    dVar.k(7, e7);
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            d dVar2 = new d(0, this);
            int myPid = Process.myPid();
            if (Build.VERSION.SDK_INT < 24) {
                dVar2.k(13, null);
                return;
            } else {
                Process.sendSignal(myPid, 10);
                dVar2.k(12, null);
                return;
            }
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        d dVar3 = new d(0, this);
        if ("DROP_SHADER_CACHE".equals(string2)) {
            int i5 = Build.VERSION.SDK_INT;
            if (f.c(i5 >= 34 ? i2.a.a(context).getCacheDir() : i5 >= 24 ? i2.a.a(context).getCodeCacheDir() : i5 == 23 ? context.getCodeCacheDir() : context.getCacheDir())) {
                dVar3.k(14, null);
                return;
            } else {
                dVar3.k(15, null);
                return;
            }
        }
        if (!"SAVE_PROFILE".equals(string2)) {
            dVar3.k(16, null);
            return;
        }
        int i10 = extras.getInt("EXTRA_PID", Process.myPid());
        if (Build.VERSION.SDK_INT < 24) {
            dVar3.k(13, null);
        } else {
            Process.sendSignal(i10, 10);
            dVar3.k(12, null);
        }
    }
}

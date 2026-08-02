package com.google.android.search.verification.client;

import android.app.IntentService;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.annotation.RequiresApi;
import android.support.v4.app.NotificationCompat;
import android.util.Log;
import com.vkontakte.android.R;
import xsna.eov;
import xsna.q9k;
import xsna.xlh0;

/* loaded from: classes13.dex */
public abstract class SearchActionVerificationClientService extends IntentService {
    public final boolean b;
    public final long c;
    public final Intent d;
    public final Intent e;
    public a f;
    public a g;

    public class a implements ServiceConnection {
        public eov b;

        public a() {
        }

        public static boolean a(a aVar) {
            return aVar.b != null;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            eov c2829a;
            int i = eov.a.a;
            if (iBinder == null) {
                c2829a = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.search.verification.api.ISearchActionVerificationService");
                c2829a = queryLocalInterface instanceof eov ? (eov) queryLocalInterface : new eov.a.C2829a(iBinder);
            }
            this.b = c2829a;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            this.b = null;
            boolean z = SearchActionVerificationClientService.this.b;
        }
    }

    public SearchActionVerificationClientService() {
        super("SearchActionVerificationClientService");
        this.d = new Intent("com.google.android.googlequicksearchbox.SEARCH_ACTION_VERIFICATION_SERVICE").setPackage("com.google.android.googlequicksearchbox");
        this.e = new Intent("com.google.android.apps.assistant.go.verification.VERIFICATION_SERVICE").setPackage("com.google.android.apps.assistant");
        this.b = !"user".equals(Build.TYPE);
        this.c = 1000L;
    }

    public final boolean a(String str) {
        ApplicationInfo applicationInfo;
        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo(str, 0);
            if (packageInfo != null && (applicationInfo = packageInfo.applicationInfo) != null) {
                if (applicationInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(String str, Intent intent, a aVar) {
        String message;
        if (!str.equals("com.google.android.googlequicksearchbox") && !str.equals("com.google.android.apps.assistant")) {
            return false;
        }
        if ("user".equals(Build.TYPE) && !xlh0.a(this, str)) {
            return false;
        }
        boolean hasExtra = intent.hasExtra("SearchActionVerificationClientExtraIntent");
        boolean z = this.b;
        if (!hasExtra) {
            if (z) {
                new StringBuilder(String.valueOf(intent).length() + 28);
            }
            return false;
        }
        Intent intent2 = (Intent) intent.getParcelableExtra("SearchActionVerificationClientExtraIntent");
        boolean z2 = true;
        if (z) {
            new StringBuilder(String.valueOf(intent2).length() + 1);
            Bundle extras = intent2.getExtras();
            if (extras != null) {
                for (String str2 : extras.keySet()) {
                    String.format("\t%s: %s", str2, extras.get(str2));
                }
            }
        }
        if (a.a(aVar)) {
            try {
                aVar.b.getVersion();
                Bundle bundle = new Bundle();
                eov eovVar = aVar.b;
                if (eovVar == null || !eovVar.G(intent2, bundle)) {
                    z2 = false;
                }
                c(intent2, z2);
                message = "";
            } catch (RemoteException e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.e("SAVerificationClientS", valueOf.length() != 0 ? "Remote exception: ".concat(valueOf) : new String("Remote exception: "));
                message = e.getMessage();
            } catch (Exception e2) {
                String valueOf2 = String.valueOf(e2.getMessage());
                Log.e("SAVerificationClientS", valueOf2.length() != 0 ? "Exception: ".concat(valueOf2) : new String("Exception: "));
                message = e2.getMessage();
            }
            if (intent2.hasExtra("com.google.android.voicesearch.extra.SEND_MESSAGE_RESULT_RECEIVER")) {
                ((ResultReceiver) intent2.getExtras().getParcelable("com.google.android.voicesearch.extra.SEND_MESSAGE_RESULT_RECEIVER")).send(z2 ? 0 : -1, q9k.a("com.google.android.voicesearch.extra.ERROR_MESSAGE", message));
            }
            return z2;
        }
        Log.e("SAVerificationClientS", String.format("VerificationService is not connected to %s, unable to check intent: %s", str, intent));
        message = "VerificationService is not connected to %s, unable to check intent: %s";
        z2 = false;
        if (intent2.hasExtra("com.google.android.voicesearch.extra.SEND_MESSAGE_RESULT_RECEIVER")) {
        }
        return z2;
    }

    public abstract void c(Intent intent, boolean z) throws Exception;

    @RequiresApi(26)
    public void d() {
        NotificationChannel notificationChannel = new NotificationChannel("Assistant_verifier", getApplicationContext().getResources().getString(R.drawable._arrow_body__0_res_0x7f080000), 2);
        notificationChannel.enableVibration(false);
        notificationChannel.enableLights(false);
        notificationChannel.setShowBadge(false);
        ((NotificationManager) getApplicationContext().getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
        startForeground(10000, new NotificationCompat.Builder(getApplicationContext(), "Assistant_verifier").setGroup("Assistant_verifier").setContentTitle(getApplicationContext().getResources().getString(R.drawable._avd_hide_password__0_res_0x7f080001)).setSmallIcon(android.R.drawable.ic_dialog_email).setPriority(-2).setVisibility(1).build());
    }

    @Override // android.app.IntentService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f = new a();
        if (a("com.google.android.googlequicksearchbox") && (!"user".equals(Build.TYPE) || xlh0.a(this, "com.google.android.googlequicksearchbox"))) {
            bindService(this.d, this.f, 1);
        }
        this.g = new a();
        if (a("com.google.android.apps.assistant") && (!"user".equals(Build.TYPE) || xlh0.a(this, "com.google.android.apps.assistant"))) {
            bindService(this.e, this.g, 1);
        }
        d();
    }

    @Override // android.app.IntentService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        if (a.a(this.f)) {
            unbindService(this.f);
        }
        if (a.a(this.g)) {
            unbindService(this.g);
        }
        stopForeground(true);
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            return;
        }
        long nanoTime = System.nanoTime();
        while (true) {
            boolean z = true;
            boolean z2 = !a("com.google.android.googlequicksearchbox") || a.a(this.f);
            boolean z3 = this.b;
            if (z3) {
                a.a(this.f);
            }
            if (a("com.google.android.apps.assistant") && !a.a(this.g)) {
                z = false;
            }
            if (z3) {
                a.a(this.g);
            }
            if ((!z2 || !z) && System.nanoTime() - nanoTime < this.c * 1000000) {
                try {
                    Thread.sleep(50L);
                } catch (InterruptedException e) {
                    if (z3) {
                        new StringBuilder(String.valueOf(e).length() + 33);
                    }
                }
            }
        }
        if (b("com.google.android.googlequicksearchbox", intent, this.f)) {
            return;
        }
        b("com.google.android.apps.assistant", intent, this.g);
    }
}

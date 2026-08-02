package androidx.media.session;

import android.app.ForegroundServiceStartNotAllowedException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.util.Log;
import android.view.KeyEvent;
import java.util.List;
import java.util.Objects;
import xsna.t33;
import xsna.tgj;
import xsna.ugj;

/* loaded from: classes12.dex */
public class MediaButtonReceiver extends BroadcastReceiver {

    public static final class a {
        public static ForegroundServiceStartNotAllowedException a(IllegalStateException illegalStateException) {
            return tgj.a(illegalStateException);
        }

        public static boolean b(IllegalStateException illegalStateException) {
            return ugj.f(illegalStateException);
        }
    }

    public static class b extends MediaBrowserCompat.ConnectionCallback {
        public final Context a;
        public final Intent b;
        public final BroadcastReceiver.PendingResult c;
        public MediaBrowserCompat d;

        public b(BroadcastReceiver.PendingResult pendingResult, Context context, Intent intent) {
            this.a = context;
            this.b = intent;
            this.c = pendingResult;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public final void onConnected() {
            new MediaControllerCompat(this.a, this.d.getSessionToken()).dispatchMediaButtonEvent((KeyEvent) this.b.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            this.d.disconnect();
            this.c.finish();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public final void onConnectionFailed() {
            this.d.disconnect();
            this.c.finish();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public final void onConnectionSuspended() {
            this.d.disconnect();
            this.c.finish();
        }
    }

    public static ComponentName a(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
            return new ComponentName(activityInfo.packageName, activityInfo.name);
        }
        queryBroadcastReceivers.size();
        return null;
    }

    public static ComponentName b(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (queryIntentServices.isEmpty()) {
            return null;
        }
        StringBuilder a2 = t33.a("Expected 1 service that handles ", str, ", found ");
        a2.append(queryIntentServices.size());
        throw new IllegalStateException(a2.toString());
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String message;
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Objects.toString(intent);
            return;
        }
        ComponentName b2 = b(context, "android.intent.action.MEDIA_BUTTON");
        if (b2 == null) {
            ComponentName b3 = b(context, "android.media.browse.MediaBrowserService");
            if (b3 == null) {
                throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
            }
            BroadcastReceiver.PendingResult goAsync = goAsync();
            Context applicationContext = context.getApplicationContext();
            b bVar = new b(goAsync, applicationContext, intent);
            MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, b3, bVar, null);
            bVar.d = mediaBrowserCompat;
            mediaBrowserCompat.connect();
            return;
        }
        intent.setComponent(b2);
        try {
            context.startForegroundService(intent);
        } catch (IllegalStateException e) {
            if (Build.VERSION.SDK_INT < 31 || !a.b(e)) {
                throw e;
            }
            ForegroundServiceStartNotAllowedException a2 = a.a(e);
            StringBuilder sb = new StringBuilder("caught exception when trying to start a foreground service from the background: ");
            message = a2.getMessage();
            sb.append(message);
            Log.e("MediaButtonReceiver", sb.toString());
        }
    }
}

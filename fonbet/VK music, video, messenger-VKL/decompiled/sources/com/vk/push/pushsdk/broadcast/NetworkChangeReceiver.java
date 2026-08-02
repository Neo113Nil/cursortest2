package com.vk.push.pushsdk.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import com.vk.push.common.Logger;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Result;
import xsna.epx;
import xsna.o560;

/* compiled from: NetworkChangeReceiver.kt */
/* loaded from: classes5.dex */
public final class NetworkChangeReceiver extends BroadcastReceiver {
    public final Logger a;
    public final CopyOnWriteArraySet<o560> b = new CopyOnWriteArraySet<>();
    public Boolean c;

    public NetworkChangeReceiver(Logger logger) {
        this.a = logger.createLogger("NetworkChangeReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Object failure;
        if (epx.f(intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            boolean z = false;
            if (this.c == null) {
                this.c = Boolean.valueOf(context.checkSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
            }
            boolean f = epx.f(this.c, Boolean.TRUE);
            Logger logger = this.a;
            if (!f) {
                Logger.DefaultImpls.warn$default(logger, "Failed to check network availability, require ACCESS_NETWORK_STATE permission", null, 2, null);
                return;
            }
            try {
                failure = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (!(failure instanceof Result.Failure)) {
                NetworkCapabilities networkCapabilities = (NetworkCapabilities) failure;
                if (networkCapabilities != null && connectivityManager.getActiveNetwork() != null && (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3) || networkCapabilities.hasTransport(4))) {
                    z = true;
                }
                failure = Boolean.valueOf(z);
            }
            if (!(failure instanceof Result.Failure)) {
                boolean booleanValue = ((Boolean) failure).booleanValue();
                CopyOnWriteArraySet<o560> copyOnWriteArraySet = this.b;
                if (booleanValue) {
                    Logger.DefaultImpls.info$default(logger, "Network connection is available", null, 2, null);
                    Iterator<o560> it = copyOnWriteArraySet.iterator();
                    while (it.hasNext()) {
                        it.next().b();
                    }
                } else {
                    Logger.DefaultImpls.info$default(logger, "Network connection is lost", null, 2, null);
                    Iterator<o560> it2 = copyOnWriteArraySet.iterator();
                    while (it2.hasNext()) {
                        it2.next().a();
                    }
                }
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                logger.warn("An error occurred when trying check network availability", a);
            }
        }
    }
}

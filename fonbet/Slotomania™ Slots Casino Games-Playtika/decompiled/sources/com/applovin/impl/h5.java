package com.applovin.impl;

import android.content.IntentFilter;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes4.dex */
public class h5 {
    private final Set a = new HashSet(32);
    private final Object b = new Object();

    public boolean a(String str) {
        synchronized (this.b) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                if (str.equals(((i5) it.next()).b())) {
                    return true;
                }
            }
            return false;
        }
    }

    public void b(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        i5 a;
        if (StringUtils.isValidString(str)) {
            synchronized (this.b) {
                a = a(str, appLovinCommunicatorSubscriber);
            }
            if (a != null) {
                a.a(false);
                AppLovinBroadcastManager.unregisterReceiver(a);
            }
        }
    }

    public boolean a(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        if (appLovinCommunicatorSubscriber != null && StringUtils.isValidString(str)) {
            synchronized (this.b) {
                i5 a = a(str, appLovinCommunicatorSubscriber);
                if (a != null) {
                    com.applovin.impl.sdk.p.h("AppLovinCommunicator", "Attempting to re-subscribe subscriber (" + appLovinCommunicatorSubscriber + ") to topic (" + str + ")");
                    if (!a.c()) {
                        a.a(true);
                        AppLovinBroadcastManager.registerReceiver(a, new IntentFilter(str));
                    }
                    return true;
                }
                i5 i5Var = new i5(str, appLovinCommunicatorSubscriber);
                this.a.add(i5Var);
                AppLovinBroadcastManager.registerReceiver(i5Var, new IntentFilter(str));
                return true;
            }
        }
        com.applovin.impl.sdk.p.h("AppLovinCommunicator", "Unable to subscribe - invalid subscriber (" + appLovinCommunicatorSubscriber + ") or topic (" + str + ")");
        return false;
    }

    private i5 a(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        for (i5 i5Var : this.a) {
            if (str.equals(i5Var.b()) && appLovinCommunicatorSubscriber.equals(i5Var.a())) {
                return i5Var;
            }
        }
        return null;
    }
}

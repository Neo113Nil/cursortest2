package com.vk.core.firebase.providers;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.content.SharedPreferences;
import com.vk.core.firebase.providers.FirebaseHijackingType;
import com.vk.core.preference.Preference;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import xsna.bpn0;
import xsna.i7s;
import xsna.i9;
import xsna.ipo;
import xsna.j5g;
import xsna.s3q0;

/* compiled from: FirebaseWrapperController.kt */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes.dex */
public final class a {
    public static Context b;
    public static File c;
    public static CompletableFuture<Void> e;
    public static final a a = new a();
    public static final ipo d = new ipo(1);

    public static boolean b(Context context) {
        List historicalProcessExitReasons;
        int reason;
        long timestamp;
        long timestamp2;
        historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 5);
        bpn0 bpn0Var = new bpn0(new i9(23));
        Iterator it = historicalProcessExitReasons.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo a2 = i7s.a(it.next());
            reason = a2.getReason();
            if (reason == 6) {
                List list = (List) bpn0Var.getValue();
                timestamp = a2.getTimestamp();
                if (!list.contains(Long.valueOf(timestamp))) {
                    List list2 = (List) bpn0Var.getValue();
                    timestamp2 = a2.getTimestamp();
                    list2.add(Long.valueOf(timestamp2));
                    SharedPreferences.Editor edit = Preference.f("firebase_init_controller").edit();
                    edit.putString("timestamps", j5g.g0((List) bpn0Var.getValue(), StringUtils.COMMA, null, null, 0, null, 62));
                    edit.apply();
                    return true;
                }
            }
        }
        return false;
    }

    public static FirebaseHijackingType d() {
        Integer num;
        FirebaseHijackingType.a aVar = FirebaseHijackingType.Companion;
        File file = c;
        Object obj = null;
        if (file == null) {
            file = null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                num = Integer.valueOf(fileInputStream.read());
                fileInputStream.close();
            } finally {
            }
        } catch (Throwable unused) {
            num = null;
        }
        aVar.getClass();
        Iterator<E> it = FirebaseHijackingType.h().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int i = ((FirebaseHijackingType) next).i();
            if (num != null && i == num.intValue()) {
                obj = next;
                break;
            }
        }
        FirebaseHijackingType firebaseHijackingType = (FirebaseHijackingType) obj;
        return firebaseHijackingType == null ? FirebaseHijackingType.ASYNC : firebaseHijackingType;
    }

    public final synchronized void a(FirebaseHijackingType firebaseHijackingType) {
        File file = c;
        if (file == null) {
            file = null;
        }
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(firebaseHijackingType.i());
                fileOutputStream.flush();
                s3q0 s3q0Var = s3q0.a;
                fileOutputStream.close();
            } finally {
            }
        } catch (Exception unused) {
        }
    }

    public final synchronized void c(Executor executor, final Context context) {
        if (e != null) {
            return;
        }
        e = CompletableFuture.runAsync(new Runnable() { // from class: xsna.zkr
            @Override // java.lang.Runnable
            public final void run() {
                com.vk.core.firebase.providers.a.d.invoke(context);
            }
        }, executor);
    }
}

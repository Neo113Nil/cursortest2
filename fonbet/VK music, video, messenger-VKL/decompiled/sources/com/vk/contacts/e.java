package com.vk.contacts;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.provider.ContactsContract;
import com.vk.log.L;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.LazyThreadSafetyMode;
import xsna.asu0;
import xsna.b25;
import xsna.bpn0;
import xsna.cd3;
import xsna.enj;
import xsna.hej;
import xsna.msy;
import xsna.paj0;
import xsna.rq6;
import xsna.tbu0;
import xsna.u94;
import xsna.w12;
import xsna.w8i;
import xsna.wv8;
import xsna.wvv;
import xsna.z58;

/* compiled from: ContactsSyncLauncher.kt */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes.dex */
public final class e implements w8i {
    public static final e b = new e();
    public static final Object c = msy.a(LazyThreadSafetyMode.NONE, new wv8(1));
    public static final bpn0 d = new bpn0(new rq6(2));
    public static final bpn0 e = new bpn0(new u94(2));
    public static final bpn0 f = new bpn0(new cd3(3));
    public static final bpn0 g = new bpn0(new z58(2));
    public static final AtomicLong h = new AtomicLong(-1);
    public static final long i = TimeUnit.HOURS.toMillis(6);
    public static Context j;
    public static com.vk.contacts.c k;
    public static b25 l;
    public static w12 m;
    public static boolean n;

    /* compiled from: ContactsSyncLauncher.kt */
    public static final class a implements b25.a {
        @Override // xsna.b25.a
        public final void d(tbu0 tbu0Var) {
            e.b();
        }
    }

    /* compiled from: ContactsSyncLauncher.kt */
    /* loaded from: classes17.dex */
    public static final class b extends ContentObserver {
        public b() {
            super(null);
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z, Uri uri) {
            L.e("VkContactManager", "ContactsChangeObserver.syncIfAllowed");
            e eVar = e.b;
            long millis = TimeUnit.SECONDS.toMillis(3L);
            asu0.a.getClass();
            asu0.n().submit(new hej(false, millis));
        }
    }

    /* compiled from: ContactsSyncLauncher.kt */
    public static final class c implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            L.e("VkContactManager", "InitSyncRunnable.syncIfAllowed");
            e.b();
        }
    }

    /* compiled from: ContactsSyncLauncher.kt */
    public static final class d implements io.reactivex.rxjava3.functions.f<Object> {
        @Override // io.reactivex.rxjava3.functions.f
        public final void accept(Object obj) {
            L.e("VkContactManager", "PermissionsListener.syncIfAllowed}");
            wvv wvvVar = wvv.a;
            e eVar = e.b;
            wvv.a((c) e.e.getValue());
            e.b();
            e.a();
        }
    }

    public static void a() {
        Context context = j;
        if (context == null) {
            context = null;
        }
        if (enj.m(context, "android.permission.READ_CONTACTS")) {
            com.vk.contacts.c cVar = k;
            if (cVar == null) {
                cVar = null;
            }
            cVar.getClass();
            f fVar = com.vk.contacts.c.i;
            if (fVar == null) {
                fVar = null;
            }
            fVar.getClass();
            if (((paj0) f.c()).getBoolean("key_in_app_permission_granted", false)) {
                Context context2 = j;
                ContentResolver contentResolver = (context2 != null ? context2 : null).getContentResolver();
                bpn0 bpn0Var = f;
                contentResolver.unregisterContentObserver((b) bpn0Var.getValue());
                try {
                    contentResolver.registerContentObserver(ContactsContract.RawContacts.CONTENT_URI, false, (b) bpn0Var.getValue());
                } catch (SecurityException e2) {
                    L.LogType logType = L.LogType.e;
                    String message = e2.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    L.s(logType, "VkContactManager", message, e2);
                }
            }
        }
    }

    public static void b() {
        long millis = TimeUnit.SECONDS.toMillis(10L);
        asu0.a.getClass();
        asu0.n().submit(new hej(true, millis));
    }
}

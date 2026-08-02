package io.seon.androidsdk.service;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
class PageSizeUtil {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f53108a = false;

    /* renamed from: b, reason: collision with root package name */
    public static Context f53109b;

    public PageSizeUtil(Context context) {
        f53109b = context;
    }

    public static /* synthetic */ void b() {
        Context context;
        if (f53108a || (context = f53109b) == null) {
            return;
        }
        C8.c.a(context, "pgs");
        f53108a = true;
    }

    public static void c() {
        Runnable runnable = new Runnable() { // from class: io.seon.androidsdk.service.b
            @Override // java.lang.Runnable
            public final void run() {
                PageSizeUtil.b();
            }
        };
        AtomicInteger atomicInteger = V.f53166a;
        try {
            runnable.run();
        } catch (Throwable unused) {
        }
    }

    private native int getPageSizeInBytesNative();

    public final Integer a() {
        try {
            if (!f53108a) {
                c();
            }
            int pageSizeInBytesNative = getPageSizeInBytesNative();
            if (pageSizeInBytesNative == -1) {
                return null;
            }
            return Integer.valueOf(pageSizeInBytesNative);
        } catch (Throwable unused) {
            return null;
        }
    }
}

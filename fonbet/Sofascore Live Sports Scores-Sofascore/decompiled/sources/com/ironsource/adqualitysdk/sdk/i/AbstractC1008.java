package com.ironsource.adqualitysdk.sdk.i;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.יִ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC1008 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final ScheduledExecutorService f3250;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static final Handler f3251;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final Handler f3252 = new Handler(Looper.getMainLooper());

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    static {
        Handler handler;
        HandlerThread handlerThread;
        int i = 0;
        while (true) {
            if (i >= 3) {
                break;
            }
            try {
                handlerThread = new HandlerThread(StringFog.decrypt("H9NfEDw5U/gq9Q==\n", "S5EdV2hRIZ0=\n"));
            } catch (Throwable unused) {
                handlerThread = null;
            }
            try {
                handlerThread.start();
                handler = new Handler(handlerThread.getLooper());
                break;
            } catch (Throwable unused2) {
                if (handlerThread != null) {
                    try {
                        handlerThread.quitSafely();
                    } catch (Throwable unused3) {
                        AbstractC0420.m254(StringFog.decrypt("i0akRAcUdhezcbF6\n", "yiL1MWZ4H2M=\n"), StringFog.decrypt("osg+QhJgD8eLiTRcEmVb1sTLNk0cY13ckcczDh9lQdeIzCU=\n", "5KlXLncEL7M=\n"), true);
                        handler = null;
                        f3251 = handler;
                        f3250 = handler == null ? Executors.newSingleThreadScheduledExecutor() : null;
                    }
                }
                AbstractC0420.m254(StringFog.decrypt("cE3BLbh5TPBIetQT\n", "MSmQWNkVJYQ=\n"), StringFog.decrypt("ZfGAh7NLZeRMsIqZs04x9QPyiIi9SDf/Vv6Ny75OK/RP9ZvH9l0g5FHpgIWxAWu+\n", "I5Dp69YvRZA=\n"), true);
                i++;
            }
            i++;
        }
        f3251 = handler;
        f3250 = handler == null ? Executors.newSingleThreadScheduledExecutor() : null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m610(AbstractRunnableC0606 abstractRunnableC0606) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            abstractRunnableC0606.run();
        } else {
            m612(abstractRunnableC0606);
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static void m611(AbstractRunnableC0606 abstractRunnableC0606) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            m614(abstractRunnableC0606);
        } else {
            abstractRunnableC0606.run();
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m613(AbstractRunnableC0606 abstractRunnableC0606, long j) {
        try {
            f3252.postDelayed(abstractRunnableC0606, j);
        } catch (Throwable unused) {
            AbstractC0420.m254(StringFog.decrypt("xxQMA9llXbv/Ixk9\n", "hnBddrgJNM8=\n"), StringFog.decrypt("Jip3L1/h8nUPa24sSfHyZQUnfzpf4fJuDmtzIlPr8nUIOXsiXg==\n", "YEseQzqF0gE=\n"), false);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m615(AbstractRunnableC0606 abstractRunnableC0606, long j) {
        try {
            Handler handler = f3251;
            if (handler != null) {
                handler.postDelayed(abstractRunnableC0606, j);
                return;
            }
            ScheduledExecutorService scheduledExecutorService = f3250;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.schedule(abstractRunnableC0606, j, TimeUnit.MILLISECONDS);
            } else {
                AbstractC0420.m254(StringFog.decrypt("X2uwxbybBkNnXKX7\n", "Hg/hsN33bzc=\n"), StringFog.decrypt("0iecj50srCvuJ8mDmG+vLfIs0IiOb6g+vC7dgZAtpi/3aNmVmSyyOPM6nIyKLq4g/SrQiA==\n", "nEi87fxPx0w=\n"), false);
            }
        } catch (Throwable unused) {
            AbstractC0420.m254(StringFog.decrypt("ZxiDuNJrYWpfL5aG\n", "JnzSzbMHCB4=\n"), StringFog.decrypt("yk/Ts/4OI57jDsqw6B4jjulC26b+DiOF4g7YvvgBZJjjW9S7uwJihOhC360=\n", "jC6635tqA+o=\n"), false);
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m612(AbstractRunnableC0606 abstractRunnableC0606) {
        try {
            f3252.post(abstractRunnableC0606);
        } catch (Throwable unused) {
            AbstractC0420.m254(StringFog.decrypt("lkyy3TqICjSue6fj\n", "1yjjqFvkY0A=\n"), StringFog.decrypt("1zkOp6LZZZX+eBektMlljv94Cqqu02WV+SoCqqM=\n", "kVhny8e9ReE=\n"), false);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m614(AbstractRunnableC0606 abstractRunnableC0606) {
        try {
            Handler handler = f3251;
            if (handler != null) {
                handler.post(abstractRunnableC0606);
                return;
            }
            ScheduledExecutorService scheduledExecutorService = f3250;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.execute(abstractRunnableC0606);
            } else {
                AbstractC0420.m254(StringFog.decrypt("Ys/HwZBSP2Ba+NL/\n", "I6uWtPE+VhQ=\n"), StringFog.decrypt("E/juVzw9s7wv+LtbOX6wujPzolAvfrepffGvWTE8ubg2t6tNOD2trzLl7lQrP7G3PPWiUA==\n", "XZfONV1e2Ns=\n"), false);
            }
        } catch (Throwable unused) {
            AbstractC0420.m254(StringFog.decrypt("2w3cldg0GJHjOsmr\n", "mmmN4LlYceU=\n"), StringFog.decrypt("keA3fGNT5i+4oS5/dUPmNLmhPHFlXKEpuPQwdCZfpzWz7Tti\n", "14FeEAY3xls=\n"), false);
        }
    }
}

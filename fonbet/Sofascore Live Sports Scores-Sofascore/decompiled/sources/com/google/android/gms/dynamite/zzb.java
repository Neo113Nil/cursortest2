package com.google.android.gms.dynamite;

import android.os.Looper;
import defpackage.vk0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class zzb {
    public static ClassLoader a;
    public static Thread b;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x009d, code lost:
    
        if (r1 == null) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized ClassLoader a() {
        ClassLoader classLoader;
        SecurityException e;
        Thread thread;
        ThreadGroup threadGroup;
        vk0 vk0Var;
        synchronized (zzb.class) {
            classLoader = a;
            if (classLoader == null) {
                Thread thread2 = b;
                ClassLoader classLoader2 = null;
                if (thread2 == null) {
                    ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                    if (threadGroup2 == null) {
                        thread2 = null;
                    } else {
                        synchronized (Void.class) {
                            try {
                                try {
                                    int activeGroupCount = threadGroup2.activeGroupCount();
                                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                                    threadGroup2.enumerate(threadGroupArr);
                                    int i = 0;
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 >= activeGroupCount) {
                                            threadGroup = null;
                                            break;
                                        }
                                        threadGroup = threadGroupArr[i2];
                                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                                            break;
                                        }
                                        i2++;
                                    }
                                    if (threadGroup == null) {
                                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                    }
                                    int activeCount = threadGroup.activeCount();
                                    Thread[] threadArr = new Thread[activeCount];
                                    threadGroup.enumerate(threadArr);
                                    while (true) {
                                        if (i >= activeCount) {
                                            thread = null;
                                            break;
                                        }
                                        thread = threadArr[i];
                                        if ("GmsDynamite".equals(thread.getName())) {
                                            break;
                                        }
                                        i++;
                                    }
                                    if (thread == null) {
                                        try {
                                            vk0Var = new vk0(threadGroup, "GmsDynamite");
                                        } catch (SecurityException e2) {
                                            e = e2;
                                        }
                                        try {
                                            vk0Var.setContextClassLoader(null);
                                            vk0Var.start();
                                            thread = vk0Var;
                                        } catch (SecurityException e3) {
                                            e = e3;
                                            thread = vk0Var;
                                            new StringBuilder(String.valueOf(e.getMessage()).length() + 39);
                                            thread2 = thread;
                                            b = thread2;
                                        }
                                    }
                                } catch (SecurityException e4) {
                                    e = e4;
                                    thread = null;
                                }
                            } finally {
                            }
                        }
                        thread2 = thread;
                    }
                    b = thread2;
                }
                synchronized (thread2) {
                    try {
                        classLoader2 = b.getContextClassLoader();
                    } catch (SecurityException e5) {
                        new StringBuilder(String.valueOf(e5.getMessage()).length() + 41);
                    }
                }
                classLoader = classLoader2;
                a = classLoader;
            }
        }
        return classLoader;
    }
}

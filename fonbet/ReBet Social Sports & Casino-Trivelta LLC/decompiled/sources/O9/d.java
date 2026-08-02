package O9;

import android.os.Looper;
import android.util.Log;

/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static ClassLoader f8576a;

    /* renamed from: b, reason: collision with root package name */
    public static Thread f8577b;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00af, code lost:
    
        if (r2 == null) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized ClassLoader a() {
        ClassLoader classLoader;
        SecurityException e10;
        Thread thread;
        ThreadGroup threadGroup;
        synchronized (d.class) {
            if (f8576a == null) {
                Thread thread2 = f8577b;
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
                                    int i10 = 0;
                                    int i11 = 0;
                                    while (true) {
                                        if (i11 >= activeGroupCount) {
                                            threadGroup = null;
                                            break;
                                        }
                                        threadGroup = threadGroupArr[i11];
                                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                                            break;
                                        }
                                        i11++;
                                    }
                                    if (threadGroup == null) {
                                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                    }
                                    int activeCount = threadGroup.activeCount();
                                    Thread[] threadArr = new Thread[activeCount];
                                    threadGroup.enumerate(threadArr);
                                    while (true) {
                                        if (i10 >= activeCount) {
                                            thread = null;
                                            break;
                                        }
                                        thread = threadArr[i10];
                                        if ("GmsDynamite".equals(thread.getName())) {
                                            break;
                                        }
                                        i10++;
                                    }
                                    if (thread == null) {
                                        try {
                                            c cVar = new c(threadGroup, "GmsDynamite");
                                            try {
                                                cVar.setContextClassLoader(null);
                                                cVar.start();
                                                thread = cVar;
                                            } catch (SecurityException e11) {
                                                e10 = e11;
                                                thread = cVar;
                                                String message = e10.getMessage();
                                                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 39);
                                                sb2.append("Failed to enumerate thread/threadgroup ");
                                                sb2.append(message);
                                                Log.w("DynamiteLoaderV2CL", sb2.toString());
                                                thread2 = thread;
                                                f8577b = thread2;
                                            }
                                        } catch (SecurityException e12) {
                                            e10 = e12;
                                        }
                                    }
                                } finally {
                                }
                            } catch (SecurityException e13) {
                                e10 = e13;
                                thread = null;
                            }
                        }
                        thread2 = thread;
                    }
                    f8577b = thread2;
                }
                synchronized (thread2) {
                    try {
                        classLoader2 = f8577b.getContextClassLoader();
                    } catch (SecurityException e14) {
                        String message2 = e14.getMessage();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + 41);
                        sb3.append("Failed to get thread context classloader ");
                        sb3.append(message2);
                        Log.w("DynamiteLoaderV2CL", sb3.toString());
                    }
                }
                f8576a = classLoader2;
            }
            classLoader = f8576a;
        }
        return classLoader;
    }
}

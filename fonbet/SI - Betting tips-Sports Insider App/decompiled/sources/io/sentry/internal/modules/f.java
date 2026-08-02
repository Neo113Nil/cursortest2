package io.sentry.internal.modules;

import android.content.Context;
import com.google.android.gms.internal.measurement.d5;
import com.sports.insider.MyApp;
import io.sentry.ILogger;
import io.sentry.b5;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f16533e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final Object f16534f;

    public f(List list, ILogger iLogger) {
        super(iLogger);
        this.f16534f = list;
    }

    @Override // io.sentry.internal.modules.d
    public final Map b() {
        int i5 = this.f16533e;
        ILogger iLogger = this.f16529a;
        Object obj = this.f16534f;
        switch (i5) {
            case 0:
                TreeMap treeMap = new TreeMap();
                try {
                    InputStream resourceAsStream = ((ClassLoader) obj).getResourceAsStream("sentry-external-modules.txt");
                    try {
                        if (resourceAsStream == null) {
                            iLogger.h(b5.INFO, "%s file was not found.", "sentry-external-modules.txt");
                            if (resourceAsStream != null) {
                                resourceAsStream.close();
                            }
                        } else {
                            TreeMap c2 = c(resourceAsStream);
                            resourceAsStream.close();
                            treeMap = c2;
                        }
                    } catch (Throwable th2) {
                        if (resourceAsStream != null) {
                            try {
                                resourceAsStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                } catch (IOException e7) {
                    iLogger.e(b5.INFO, "Access to resources failed.", e7);
                } catch (SecurityException e9) {
                    iLogger.e(b5.INFO, "Access to resources denied.", e9);
                }
                return treeMap;
            case 1:
                TreeMap treeMap2 = new TreeMap();
                try {
                    InputStream open = ((Context) obj).getAssets().open("sentry-external-modules.txt");
                    try {
                        TreeMap c8 = c(open);
                        if (open != null) {
                            open.close();
                        }
                        return c8;
                    } catch (Throwable th4) {
                        if (open != null) {
                            try {
                                open.close();
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                            }
                        }
                        throw th4;
                    }
                } catch (FileNotFoundException unused) {
                    iLogger.h(b5.INFO, "%s file was not found.", "sentry-external-modules.txt");
                    return treeMap2;
                } catch (IOException e10) {
                    iLogger.e(b5.ERROR, "Error extracting modules.", e10);
                    return treeMap2;
                }
            default:
                TreeMap treeMap3 = new TreeMap();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    Map a7 = ((a) it.next()).a();
                    if (a7 != null) {
                        treeMap3.putAll(a7);
                    }
                }
                return treeMap3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ILogger iLogger) {
        super(iLogger);
        ClassLoader classLoader = f.class.getClassLoader();
        this.f16534f = d5.j(classLoader);
    }

    public f(MyApp myApp, ILogger iLogger) {
        super(iLogger);
        Context applicationContext = myApp.getApplicationContext();
        this.f16534f = applicationContext != null ? applicationContext : myApp;
        new Thread(new io.sentry.android.core.f(4, this)).start();
    }
}

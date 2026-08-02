package io.sentry.internal.modules;

import io.sentry.EnumC4788n3;
import io.sentry.ILogger;
import io.sentry.InterfaceC4765j0;
import io.sentry.util.C4843a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public abstract class d implements b {

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f52124d = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final ILogger f52125a;

    /* renamed from: b, reason: collision with root package name */
    public final C4843a f52126b = new C4843a();

    /* renamed from: c, reason: collision with root package name */
    public volatile Map f52127c = null;

    public d(ILogger iLogger) {
        this.f52125a = iLogger;
    }

    @Override // io.sentry.internal.modules.b
    public Map a() {
        if (this.f52127c == null) {
            InterfaceC4765j0 d10 = this.f52126b.d();
            try {
                if (this.f52127c == null) {
                    this.f52127c = b();
                }
                if (d10 != null) {
                    d10.close();
                }
            } catch (Throwable th2) {
                if (d10 != null) {
                    try {
                        d10.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        return this.f52127c;
    }

    public abstract Map b();

    public Map c(InputStream inputStream) {
        TreeMap treeMap = new TreeMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, f52124d));
            try {
                for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                    int lastIndexOf = readLine.lastIndexOf(58);
                    treeMap.put(readLine.substring(0, lastIndexOf), readLine.substring(lastIndexOf + 1));
                }
                this.f52125a.c(EnumC4788n3.DEBUG, "Extracted %d modules from resources.", Integer.valueOf(treeMap.size()));
                bufferedReader.close();
                return treeMap;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e10) {
            this.f52125a.b(EnumC4788n3.ERROR, "Error extracting modules.", e10);
            return treeMap;
        } catch (RuntimeException e11) {
            this.f52125a.a(EnumC4788n3.ERROR, e11, "%s file is malformed.", "sentry-external-modules.txt");
            return treeMap;
        }
    }
}

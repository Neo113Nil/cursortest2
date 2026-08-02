package io.sentry.internal.modules;

import io.sentry.ILogger;
import io.sentry.b5;
import io.sentry.r;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class d implements a {

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f16528d = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final ILogger f16529a;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.util.a f16530b = new io.sentry.util.a();

    /* renamed from: c, reason: collision with root package name */
    public volatile Map f16531c = null;

    public d(ILogger iLogger) {
        this.f16529a = iLogger;
    }

    @Override // io.sentry.internal.modules.a
    public final Map a() {
        if (this.f16531c == null) {
            r a7 = this.f16530b.a();
            try {
                if (this.f16531c == null) {
                    this.f16531c = b();
                }
                a7.close();
            } catch (Throwable th2) {
                try {
                    a7.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        return this.f16531c;
    }

    public abstract Map b();

    public final TreeMap c(InputStream inputStream) {
        ILogger iLogger = this.f16529a;
        TreeMap treeMap = new TreeMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, f16528d));
            try {
                for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                    int lastIndexOf = readLine.lastIndexOf(58);
                    treeMap.put(readLine.substring(0, lastIndexOf), readLine.substring(lastIndexOf + 1));
                }
                iLogger.h(b5.DEBUG, "Extracted %d modules from resources.", Integer.valueOf(treeMap.size()));
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
        } catch (IOException e7) {
            iLogger.e(b5.ERROR, "Error extracting modules.", e7);
            return treeMap;
        } catch (RuntimeException e9) {
            iLogger.b(b5.ERROR, e9, "%s file is malformed.", "sentry-external-modules.txt");
            return treeMap;
        }
    }
}

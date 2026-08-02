package io.sentry.internal.modules;

import io.sentry.I2;
import io.sentry.ILogger;
import io.sentry.InterfaceC7097a0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.TreeMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class d implements b {

    /* renamed from: d, reason: collision with root package name */
    private static final Charset f68009d = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    protected final ILogger f68010a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f68011b = new io.sentry.util.a();

    /* renamed from: c, reason: collision with root package name */
    private volatile Map<String, String> f68012c = null;

    public d(@NotNull ILogger iLogger) {
        this.f68010a = iLogger;
    }

    @Override // io.sentry.internal.modules.b
    public final Map<String, String> a() {
        if (this.f68012c == null) {
            InterfaceC7097a0 a11 = this.f68011b.a();
            try {
                if (this.f68012c == null) {
                    this.f68012c = b();
                }
                a11.close();
            } catch (Throwable th2) {
                try {
                    a11.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        return this.f68012c;
    }

    protected abstract Map<String, String> b();

    protected final TreeMap c(@NotNull InputStream inputStream) {
        ILogger iLogger = this.f68010a;
        TreeMap treeMap = new TreeMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, f68009d));
            try {
                for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                    int lastIndexOf = readLine.lastIndexOf(58);
                    treeMap.put(readLine.substring(0, lastIndexOf), readLine.substring(lastIndexOf + 1));
                }
                iLogger.c(I2.DEBUG, "Extracted %d modules from resources.", Integer.valueOf(treeMap.size()));
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
        } catch (IOException e11) {
            iLogger.a(I2.ERROR, "Error extracting modules.", e11);
            return treeMap;
        } catch (RuntimeException e12) {
            iLogger.b(I2.ERROR, e12, "%s file is malformed.", "sentry-external-modules.txt");
            return treeMap;
        }
    }
}

package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Uf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final File f12975a;

    /* renamed from: b, reason: collision with root package name */
    public final Consumer f12976b;

    public Uf(File file, C0171g6 c0171g6) {
        this.f12975a = file;
        this.f12976b = c0171g6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File[] listFiles;
        if (!this.f12975a.exists() || !this.f12975a.isDirectory() || (listFiles = this.f12975a.listFiles()) == null || listFiles.length == 0) {
            return;
        }
        for (File file : listFiles) {
            try {
                this.f12976b.consume(file);
            } catch (Throwable unused) {
            }
        }
    }
}

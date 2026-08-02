package io.sentry.android.core.internal.modules;

import android.content.Context;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.android.core.AbstractC4704q0;
import io.sentry.internal.modules.d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public final class b extends d {

    /* renamed from: e, reason: collision with root package name */
    public final Context f51046e;

    public b(Context context, F3 f32) {
        super(f32.getLogger());
        this.f51046e = AbstractC4704q0.g(context);
        try {
            f32.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.internal.modules.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.a();
                }
            });
        } catch (Throwable th2) {
            f32.getLogger().b(EnumC4788n3.ERROR, "AssetsModulesLoader submit failed", th2);
        }
    }

    @Override // io.sentry.internal.modules.d
    public Map b() {
        TreeMap treeMap = new TreeMap();
        try {
            InputStream open = this.f51046e.getAssets().open("sentry-external-modules.txt");
            try {
                Map c10 = c(open);
                if (open == null) {
                    return c10;
                }
                open.close();
                return c10;
            } catch (Throwable th2) {
                if (open != null) {
                    try {
                        open.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (FileNotFoundException unused) {
            this.f52125a.c(EnumC4788n3.INFO, "%s file was not found.", "sentry-external-modules.txt");
            return treeMap;
        } catch (IOException e10) {
            this.f52125a.b(EnumC4788n3.ERROR, "Error extracting modules.", e10);
            return treeMap;
        }
    }
}

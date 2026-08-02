package io.sentry.android.core.internal.debugmeta;

import android.content.Context;
import io.sentry.EnumC4788n3;
import io.sentry.ILogger;
import io.sentry.android.core.AbstractC4704q0;
import io.sentry.util.AbstractC4846d;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

/* loaded from: classes3.dex */
public final class a implements io.sentry.internal.debugmeta.a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f50999a;

    /* renamed from: b, reason: collision with root package name */
    public final ILogger f51000b;

    public a(Context context, ILogger iLogger) {
        this.f50999a = AbstractC4704q0.g(context);
        this.f51000b = iLogger;
    }

    @Override // io.sentry.internal.debugmeta.a
    public List a() {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f50999a.getAssets().open(AbstractC4846d.f52794a));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                List singletonList = Collections.singletonList(properties);
                bufferedInputStream.close();
                return singletonList;
            } catch (Throwable th2) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (FileNotFoundException unused) {
            this.f51000b.c(EnumC4788n3.INFO, "%s file was not found.", AbstractC4846d.f52794a);
            return null;
        } catch (IOException e10) {
            this.f51000b.b(EnumC4788n3.ERROR, "Error getting Proguard UUIDs.", e10);
            return null;
        } catch (RuntimeException e11) {
            this.f51000b.a(EnumC4788n3.ERROR, e11, "%s file is malformed.", AbstractC4846d.f52794a);
            return null;
        }
    }
}

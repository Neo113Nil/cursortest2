package io.sentry.android.core;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import io.sentry.AbstractC4772k2;
import io.sentry.C4778l3;
import io.sentry.EnumC4788n3;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes3.dex */
public final class SentryInitProvider extends AbstractC4715w0 {
    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (SentryInitProvider.class.getName().equals(providerInfo.authority)) {
            throw new IllegalStateException("An applicationId is required to fulfill the manifest placeholder.");
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        C c10 = new C();
        Context context = getContext();
        if (context == null) {
            c10.c(EnumC4788n3.FATAL, "App. Context from ContentProvider is null", new Object[0]);
            return false;
        }
        if (!M0.c(context, c10) || AbstractC4704q0.f(context)) {
            return true;
        }
        a1.e(context, c10);
        C4778l3.d().a("AutoInit");
        return true;
    }

    @Override // android.content.ContentProvider
    public void shutdown() {
        AbstractC4772k2.h();
    }
}

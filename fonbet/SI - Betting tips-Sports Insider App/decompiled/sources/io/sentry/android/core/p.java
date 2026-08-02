package io.sentry.android.core;

import io.sentry.b5;
import io.sentry.c4;
import java.io.File;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements io.sentry.util.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SentryAndroidOptions f15788a;

    @Override // io.sentry.util.e
    public Object b() {
        List list = io.sentry.android.core.cache.b.f15561k;
        SentryAndroidOptions sentryAndroidOptions = this.f15788a;
        String outboxPath = sentryAndroidOptions.getOutboxPath();
        boolean z5 = false;
        if (outboxPath == null) {
            sentryAndroidOptions.getLogger().h(b5.DEBUG, "Outbox path is null, the startup crash marker file does not exist", new Object[0]);
        } else {
            File file = new File(outboxPath, "startup_crash");
            try {
                boolean booleanValue = ((Boolean) sentryAndroidOptions.getRuntimeManager().b(new c4(file, 3))).booleanValue();
                if (booleanValue && !((Boolean) sentryAndroidOptions.getRuntimeManager().b(new c4(file, 4))).booleanValue()) {
                    sentryAndroidOptions.getLogger().h(b5.ERROR, "Failed to delete the startup crash marker file. %s.", file.getAbsolutePath());
                }
                z5 = booleanValue;
            } catch (Throwable th2) {
                sentryAndroidOptions.getLogger().e(b5.ERROR, "Error reading/deleting the startup crash marker file on the disk", th2);
            }
        }
        return Boolean.valueOf(z5);
    }
}

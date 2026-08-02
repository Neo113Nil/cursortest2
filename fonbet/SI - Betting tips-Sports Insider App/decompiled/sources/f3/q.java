package f3;

import android.content.Context;
import io.sentry.android.core.u0;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements t2.c, io.sentry.util.runtime.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9414a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f9415b;

    public /* synthetic */ q(Context context, int i5) {
        this.f9414a = i5;
        this.f9415b = context;
    }

    @Override // t2.c
    public t2.d b(t2.b configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Context context = this.f9415b;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        String str = configuration.f23745b;
        com.android.billingclient.api.l0 callback = configuration.f23746c;
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (callback == null) {
            throw new IllegalArgumentException("Must set a callback to create the configuration.");
        }
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        Intrinsics.checkNotNullParameter(new t2.b(context, str, callback, true, true), "configuration");
        return io.sentry.android.sqlite.g.c(new u2.h(context, str, callback, true, true));
    }

    @Override // io.sentry.util.runtime.a
    public Object run() {
        switch (this.f9414a) {
            case 1:
                return new File(this.f9415b.getCacheDir(), "sentry").getAbsolutePath();
            default:
                return u0.a(this.f9415b);
        }
    }
}

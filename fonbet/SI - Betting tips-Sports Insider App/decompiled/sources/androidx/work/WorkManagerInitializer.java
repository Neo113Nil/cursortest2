package androidx.work;

import android.content.Context;
import b6.p;
import e3.c;
import e3.x;
import f3.v;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import x2.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class WorkManagerInitializer implements b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2916a = x.g("WrkMgrInitializer");

    @Override // x2.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // x2.b
    public final Object create(Context context) {
        x.e().a(f2916a, "Initializing WorkManager with default configuration.");
        c configuration = new c(new p());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        v.f(context, configuration);
        Intrinsics.checkNotNullParameter(context, "context");
        v e7 = v.e(context);
        Intrinsics.checkNotNullExpressionValue(e7, "getInstance(...)");
        return e7;
    }
}

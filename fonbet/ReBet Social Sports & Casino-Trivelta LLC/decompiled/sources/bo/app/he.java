package bo.app;

import android.content.Context;
import bo.app.he;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class he {

    /* renamed from: a, reason: collision with root package name */
    public final ge f25536a;

    public he(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f25536a = new ge(context);
    }

    public final boolean a() {
        return Intrinsics.areEqual(this.f25536a.readBoolean(DataStoreKey.SDK_ENABLEMENT, Boolean.FALSE), Boolean.TRUE);
    }

    public final void b(final boolean z10) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: c3.l3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return he.a(z10);
            }
        }, 6, (Object) null);
        this.f25536a.writeData(DataStoreKey.SDK_ENABLEMENT, Boolean.valueOf(z10));
    }

    public static final String a(boolean z10) {
        return "Setting Braze SDK disabled to: " + z10;
    }
}

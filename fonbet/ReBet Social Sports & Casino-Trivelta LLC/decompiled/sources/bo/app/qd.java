package bo.app;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class qd {

    /* renamed from: a, reason: collision with root package name */
    public final Context f25953a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25954b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25955c;

    /* renamed from: d, reason: collision with root package name */
    public final com.braze.storage.n f25956d;

    public qd(Context context, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f25953a = context;
        this.f25954b = str;
        this.f25955c = str2;
        this.f25956d = new com.braze.storage.n(context, str, str2);
    }

    public static final String a(String str) {
        return "Setting signature to: " + str;
    }

    public final void b(final String str) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.S9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.qd.a(str);
            }
        }, 6, (Object) null);
        com.braze.storage.n nVar = this.f25956d;
        DataStoreKey dataStoreKey = DataStoreKey.SDK_AUTH;
        if (str == null) {
            str = "";
        }
        nVar.writeData(dataStoreKey, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd)) {
            return false;
        }
        qd qdVar = (qd) obj;
        return Intrinsics.areEqual(this.f25953a, qdVar.f25953a) && Intrinsics.areEqual(this.f25954b, qdVar.f25954b) && Intrinsics.areEqual(this.f25955c, qdVar.f25955c);
    }

    public final int hashCode() {
        int hashCode = this.f25953a.hashCode() * 31;
        String str = this.f25954b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f25955c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "SdkAuthenticationCache(context=" + this.f25953a + ", userId=" + this.f25954b + ", apiKey=" + this.f25955c + ")";
    }
}

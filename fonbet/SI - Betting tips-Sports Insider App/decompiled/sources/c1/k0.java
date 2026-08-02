package c1;

import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k0 extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final String f3416a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(FileNotFoundException ex) {
        super(ex);
        Intrinsics.checkNotNullParameter(ex, "ex");
        this.f3416a = "Encountered a [" + ex.getMessage() + "]. If you are trying to use DataStore during direct boot, this exception likely indicates that your DataStore file is not located in the Device Encrypted Storage and therefore is not available for write access during direct boot mode. DataStore to be used during direct boot must be initialized using `DataStoreFactory.createInDeviceProtectedStorage()`.";
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f3416a;
    }
}

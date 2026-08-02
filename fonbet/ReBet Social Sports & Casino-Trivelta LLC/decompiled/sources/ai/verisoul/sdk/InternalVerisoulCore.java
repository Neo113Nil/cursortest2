package ai.verisoul.sdk;

import ai.verisoul.sdk.SDKType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lai/verisoul/sdk/InternalVerisoulCore;", "", "()V", "sdkType", "Lai/verisoul/sdk/SDKType;", "getSdkType", "()Lai/verisoul/sdk/SDKType;", "setSdkType", "(Lai/verisoul/sdk/SDKType;)V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InternalVerisoulCore {

    @NotNull
    public static final InternalVerisoulCore INSTANCE = new InternalVerisoulCore();

    @NotNull
    private static SDKType sdkType = SDKType.Native.INSTANCE;

    private InternalVerisoulCore() {
    }

    @NotNull
    public final SDKType getSdkType() {
        return sdkType;
    }

    public final void setSdkType(@NotNull SDKType sDKType) {
        Intrinsics.checkNotNullParameter(sDKType, "<set-?>");
        sdkType = sDKType;
    }
}

package l10;

import Sc.InterfaceC3999a;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.B0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC3999a
/* loaded from: classes7.dex */
public final class r implements v {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final B0 f72528a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final B0 f72529b;

    public r(ComponentCallbacksC5392m viewModelStoreOwner, androidx.fragment.app.r sharedViewModelStoreOwner, int i11) {
        sharedViewModelStoreOwner = (i11 & 2) != 0 ? viewModelStoreOwner.requireActivity() : sharedViewModelStoreOwner;
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "fragment");
        Intrinsics.checkNotNullParameter(sharedViewModelStoreOwner, "sharedViewModelStoreOwner");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.f72528a = sharedViewModelStoreOwner;
        this.f72529b = viewModelStoreOwner;
    }

    @Override // a00.h
    @NotNull
    public final B0 a() {
        return this.f72529b;
    }

    @Override // a00.h
    @NotNull
    public final B0 b() {
        return this.f72528a;
    }
}

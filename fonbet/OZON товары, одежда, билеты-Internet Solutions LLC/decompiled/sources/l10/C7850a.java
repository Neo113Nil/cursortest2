package l10;

import Sc.InterfaceC3999a;
import androidx.lifecycle.B0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC3999a
/* renamed from: l10.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7850a implements v {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final B0 f72296a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final B0 f72297b;

    public C7850a(androidx.fragment.app.r viewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "activity");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "sharedViewModelStoreOwner");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.f72296a = viewModelStoreOwner;
        this.f72297b = viewModelStoreOwner;
    }

    @Override // a00.h
    @NotNull
    public final B0 a() {
        return this.f72297b;
    }

    @Override // a00.h
    @NotNull
    public final B0 b() {
        return this.f72296a;
    }
}

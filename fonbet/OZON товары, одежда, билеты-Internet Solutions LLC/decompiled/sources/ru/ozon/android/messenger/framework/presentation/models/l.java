package ru.ozon.android.messenger.framework.presentation.models;

import java.util.ArrayList;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.C0;

/* loaded from: classes10.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.g f91444a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C0 f91445b;

    public l() {
        this(0);
    }

    @NotNull
    public final ru.ozon.android.messenger.framework.domain.g a() {
        return this.f91444a;
    }

    @NotNull
    public final C0 b() {
        return this.f91445b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.f91444a, lVar.f91444a) && Intrinsics.d(this.f91445b, lVar.f91445b);
    }

    public final int hashCode() {
        return this.f91445b.hashCode() + (this.f91444a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "ChatScreenUiState(noUiContainer=" + this.f91444a + ", widgetsContainer=" + this.f91445b + ")";
    }

    public l(@NotNull ru.ozon.android.messenger.framework.domain.g noUiContainer, @NotNull C0 widgetsContainer) {
        Intrinsics.checkNotNullParameter(noUiContainer, "noUiContainer");
        Intrinsics.checkNotNullParameter(widgetsContainer, "widgetsContainer");
        this.f91444a = noUiContainer;
        this.f91445b = widgetsContainer;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l(int i11) {
        this(new ru.ozon.android.messenger.framework.domain.g(r4, r4), new C0(new ArrayList(), false));
        K k11 = K.f71697a;
    }
}

package ru.ozon.android.messenger.blocks.messagetext;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;

/* loaded from: classes10.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.responses.d f85894a;

    static {
        int i11 = DisclaimerDTO.$stable;
    }

    public m(@NotNull ru.ozon.android.messenger.framework.presentation.models.responses.d modalVO) {
        Intrinsics.checkNotNullParameter(modalVO, "modalVO");
        this.f85894a = modalVO;
    }

    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.responses.d a() {
        return this.f85894a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Intrinsics.d(this.f85894a, ((m) obj).f85894a);
    }

    public final int hashCode() {
        return this.f85894a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "ShowExternalTransitionModalEvent(modalVO=" + this.f85894a + ")";
    }
}

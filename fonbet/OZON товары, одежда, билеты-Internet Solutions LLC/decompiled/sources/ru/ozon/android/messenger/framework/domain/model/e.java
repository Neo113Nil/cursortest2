package ru.ozon.android.messenger.framework.domain.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.q;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final q f88806a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.remote.models.c f88807b;

    public e(@NotNull q itemVO, @NotNull ru.ozon.android.messenger.framework.data.remote.models.c sendMessageModel) {
        Intrinsics.checkNotNullParameter(itemVO, "itemVO");
        Intrinsics.checkNotNullParameter(sendMessageModel, "sendMessageModel");
        this.f88806a = itemVO;
        this.f88807b = sendMessageModel;
    }

    @NotNull
    public final q a() {
        return this.f88806a;
    }

    @NotNull
    public final ru.ozon.android.messenger.framework.data.remote.models.c b() {
        return this.f88807b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f88806a, eVar.f88806a) && Intrinsics.d(this.f88807b, eVar.f88807b);
    }

    public final int hashCode() {
        return this.f88807b.hashCode() + (this.f88806a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "PreparedMessage(itemVO=" + this.f88806a + ", sendMessageModel=" + this.f88807b + ")";
    }
}

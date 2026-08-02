package ru.ozon.android.messenger.framework.presentation.common.view.timestatus;

import C.o0;
import android.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.z;
import ru.ozon.app.android.messenger.R$attr;
import ru.ozon.app.android.messenger.R$color;

/* loaded from: classes10.dex */
public final class d extends b {

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final String f91297g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final z f91298h;

    /* renamed from: i, reason: collision with root package name */
    private final String f91299i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull String time, @NotNull z status, String str) {
        super(time, str, status, R$color.text_secondary, R$attr.graphicActionPrimary, R.color.transparent);
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f91297g = time;
        this.f91298h = status;
        this.f91299i = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f91297g, dVar.f91297g) && Intrinsics.d(this.f91298h, dVar.f91298h) && Intrinsics.d(this.f91299i, dVar.f91299i);
    }

    public final int hashCode() {
        int hashCode = (this.f91298h.hashCode() + (this.f91297g.hashCode() * 31)) * 31;
        String str = this.f91299i;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Message(time=");
        sb2.append(this.f91297g);
        sb2.append(", status=");
        sb2.append(this.f91298h);
        sb2.append(", updateStatusLabel=");
        return o0.c(sb2, this.f91299i, ")");
    }
}

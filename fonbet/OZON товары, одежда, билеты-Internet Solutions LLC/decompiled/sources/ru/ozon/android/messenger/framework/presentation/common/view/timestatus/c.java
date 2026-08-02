package ru.ozon.android.messenger.framework.presentation.common.view.timestatus;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.z;
import ru.ozon.app.android.messenger.R$attr;
import ru.ozon.app.android.messenger.R$color;

/* loaded from: classes10.dex */
public final class c extends b {

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final String f91294g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final z f91295h;

    /* renamed from: i, reason: collision with root package name */
    private final String f91296i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull String time, @NotNull z status, String str) {
        super(time, str, status, R$color.text_primary_on_dark, R$attr.bgLightKey, R$color.layer_overlay_dimming);
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f91294g = time;
        this.f91295h = status;
        this.f91296i = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f91294g, cVar.f91294g) && Intrinsics.d(this.f91295h, cVar.f91295h) && Intrinsics.d(this.f91296i, cVar.f91296i);
    }

    public final int hashCode() {
        int hashCode = (this.f91295h.hashCode() + (this.f91294g.hashCode() * 31)) * 31;
        String str = this.f91296i;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImageMessage(time=");
        sb2.append(this.f91294g);
        sb2.append(", status=");
        sb2.append(this.f91295h);
        sb2.append(", updateStatusLabel=");
        return o0.c(sb2, this.f91296i, ")");
    }
}

package ru.ozon.android.messenger.blocks.error;

import B0.C2454a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.g;
import ru.ozon.android.messenger.framework.presentation.models.j;

/* loaded from: classes10.dex */
public final class b implements g, j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.c f85148a;

    /* renamed from: b, reason: collision with root package name */
    private final int f85149b;

    /* renamed from: c, reason: collision with root package name */
    private String f85150c;

    public b(ru.ozon.android.messenger.framework.presentation.models.c blockId, int i11) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        this.f85148a = blockId;
        this.f85149b = i11;
        this.f85150c = null;
    }

    public final int a() {
        return this.f85149b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f85148a, bVar.f85148a) && this.f85149b == bVar.f85149b && Intrinsics.d(this.f85150c, bVar.f85150c);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f85148a;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.j
    public final String getSendTime() {
        return this.f85150c;
    }

    public final int hashCode() {
        int a11 = C2454a.a(this.f85149b, this.f85148a.hashCode() * 31, 31);
        String str = this.f85150c;
        return a11 + (str == null ? 0 : str.hashCode());
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.j
    public final void setSendTime(String str) {
        this.f85150c = str;
    }

    @NotNull
    public final String toString() {
        return "ErrorVO(blockId=" + this.f85148a + ", message=" + this.f85149b + ", sendTime=" + this.f85150c + ")";
    }
}

package ru.ozon.android.messenger.blocks.travelOrders;

import B90.C2618u;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.CornerRadius;

/* loaded from: classes10.dex */
public final class p implements ru.ozon.android.messenger.framework.presentation.models.g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.c f86540a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList f86541b;

    /* renamed from: c, reason: collision with root package name */
    private final String f86542c;

    /* renamed from: d, reason: collision with root package name */
    private final CornerRadius f86543d;

    public p(@NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId, @NotNull ArrayList orders, String str, CornerRadius cornerRadius) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(orders, "orders");
        this.f86540a = blockId;
        this.f86541b = orders;
        this.f86542c = str;
        this.f86543d = cornerRadius;
    }

    public final String a() {
        return this.f86542c;
    }

    public final CornerRadius b() {
        return this.f86543d;
    }

    @NotNull
    public final List<a> c() {
        return this.f86541b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.d(this.f86540a, pVar.f86540a) && this.f86541b.equals(pVar.f86541b) && Intrinsics.d(this.f86542c, pVar.f86542c) && this.f86543d == pVar.f86543d;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f86540a;
    }

    public final int hashCode() {
        int b11 = C2618u.b(this.f86541b, this.f86540a.hashCode() * 31, 31);
        String str = this.f86542c;
        int hashCode = (b11 + (str == null ? 0 : str.hashCode())) * 31;
        CornerRadius cornerRadius = this.f86543d;
        return hashCode + (cornerRadius != null ? cornerRadius.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "TravelOrdersVO(blockId=" + this.f86540a + ", orders=" + this.f86541b + ", backgroundColor=" + this.f86542c + ", cornerRadius=" + this.f86543d + ")";
    }
}

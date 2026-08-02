package ru.ozon.android.messenger.blocks.coupon;

import T7.P;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.presentation.models.g;

/* loaded from: classes10.dex */
public final class b implements g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.c f84901a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final e f84902b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final f f84903c;

    /* renamed from: d, reason: collision with root package name */
    private final d f84904d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, String> f84905e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<String, MessengerTrackingInfo> f84906f;

    public b(@NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId, @NotNull e leftPart, @NotNull f rightPart, d dVar, Map<String, String> map, Map<String, MessengerTrackingInfo> map2) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(leftPart, "leftPart");
        Intrinsics.checkNotNullParameter(rightPart, "rightPart");
        this.f84901a = blockId;
        this.f84902b = leftPart;
        this.f84903c = rightPart;
        this.f84904d = dVar;
        this.f84905e = map;
        this.f84906f = map2;
    }

    public final d a() {
        return this.f84904d;
    }

    @NotNull
    public final e b() {
        return this.f84902b;
    }

    @NotNull
    public final f c() {
        return this.f84903c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f84901a, bVar.f84901a) && Intrinsics.d(this.f84902b, bVar.f84902b) && Intrinsics.d(this.f84903c, bVar.f84903c) && Intrinsics.d(this.f84904d, bVar.f84904d) && Intrinsics.d(this.f84905e, bVar.f84905e) && Intrinsics.d(this.f84906f, bVar.f84906f);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f84901a;
    }

    public final int hashCode() {
        int hashCode = (this.f84903c.hashCode() + ((this.f84902b.hashCode() + (this.f84901a.hashCode() * 31)) * 31)) * 31;
        d dVar = this.f84904d;
        int hashCode2 = (hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        Map<String, String> map = this.f84905e;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, MessengerTrackingInfo> map2 = this.f84906f;
        return hashCode3 + (map2 != null ? map2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CouponVO(blockId=");
        sb2.append(this.f84901a);
        sb2.append(", leftPart=");
        sb2.append(this.f84902b);
        sb2.append(", rightPart=");
        sb2.append(this.f84903c);
        sb2.append(", image=");
        sb2.append(this.f84904d);
        sb2.append(", lexemes=");
        sb2.append(this.f84905e);
        sb2.append(", trackingInfo=");
        return P.f(sb2, this.f84906f, ")");
    }
}

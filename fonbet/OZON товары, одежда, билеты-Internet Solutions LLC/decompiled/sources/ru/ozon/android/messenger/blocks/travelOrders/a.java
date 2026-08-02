package ru.ozon.android.messenger.blocks.travelOrders;

import T7.P;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ProductMediaDTO f86497a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final TextDTO f86498b;

    /* renamed from: c, reason: collision with root package name */
    private final TextDTO f86499c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomActionDTO f86500d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, MessengerTrackingInfo> f86501e;

    public a(@NotNull ProductMediaDTO productMedia, @NotNull TextDTO title, TextDTO textDTO, AtomActionDTO atomActionDTO, Map<String, MessengerTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(productMedia, "productMedia");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f86497a = productMedia;
        this.f86498b = title;
        this.f86499c = textDTO;
        this.f86500d = atomActionDTO;
        this.f86501e = map;
    }

    public final AtomActionDTO a() {
        return this.f86500d;
    }

    @NotNull
    public final ProductMediaDTO b() {
        return this.f86497a;
    }

    public final TextDTO c() {
        return this.f86499c;
    }

    @NotNull
    public final TextDTO d() {
        return this.f86498b;
    }

    public final Map<String, MessengerTrackingInfo> e() {
        return this.f86501e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f86497a, aVar.f86497a) && Intrinsics.d(this.f86498b, aVar.f86498b) && Intrinsics.d(this.f86499c, aVar.f86499c) && Intrinsics.d(this.f86500d, aVar.f86500d) && Intrinsics.d(this.f86501e, aVar.f86501e);
    }

    public final int hashCode() {
        int a11 = Ns.b.a(this.f86498b, this.f86497a.hashCode() * 31, 31);
        TextDTO textDTO = this.f86499c;
        int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.f86500d;
        int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, MessengerTrackingInfo> map = this.f86501e;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TravelOrderVO(productMedia=");
        sb2.append(this.f86497a);
        sb2.append(", title=");
        sb2.append(this.f86498b);
        sb2.append(", subtitle=");
        sb2.append(this.f86499c);
        sb2.append(", action=");
        sb2.append(this.f86500d);
        sb2.append(", trackingInfo=");
        return P.f(sb2, this.f86501e, ")");
    }
}

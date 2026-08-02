package ru.ozon.android.messenger.blocks.productshelf;

import Kk.C3532b;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
public final class i implements ru.ozon.android.messenger.framework.presentation.models.g, ru.ozon.android.messenger.framework.presentation.models.j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.c f86064a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ProductMediaDTO f86065b;

    /* renamed from: c, reason: collision with root package name */
    private final PriceDTO f86066c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final TextDTO f86067d;

    /* renamed from: e, reason: collision with root package name */
    private final List<IconButtonV3DTO> f86068e;

    /* renamed from: f, reason: collision with root package name */
    private final List<BadgeDTO> f86069f;

    /* renamed from: g, reason: collision with root package name */
    private final List<BadgeDTO> f86070g;

    /* renamed from: h, reason: collision with root package name */
    private final AtomActionDTO f86071h;

    /* renamed from: i, reason: collision with root package name */
    private final AtomActionDTO f86072i;

    /* renamed from: j, reason: collision with root package name */
    private final Map<String, MessengerTrackingInfo> f86073j;

    /* renamed from: k, reason: collision with root package name */
    private String f86074k;

    public i() {
        throw null;
    }

    public i(ru.ozon.android.messenger.framework.presentation.models.c blockId, ProductMediaDTO image, PriceDTO priceDTO, TextDTO productName, List list, List list2, List list3, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, Map map) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(productName, "productName");
        this.f86064a = blockId;
        this.f86065b = image;
        this.f86066c = priceDTO;
        this.f86067d = productName;
        this.f86068e = list;
        this.f86069f = list2;
        this.f86070g = list3;
        this.f86071h = atomActionDTO;
        this.f86072i = atomActionDTO2;
        this.f86073j = map;
        this.f86074k = null;
    }

    public final AtomActionDTO a() {
        return this.f86071h;
    }

    public final List<BadgeDTO> b() {
        return this.f86070g;
    }

    public final List<IconButtonV3DTO> c() {
        return this.f86068e;
    }

    @NotNull
    public final ProductMediaDTO d() {
        return this.f86065b;
    }

    public final PriceDTO e() {
        return this.f86066c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f86064a, iVar.f86064a) && Intrinsics.d(this.f86065b, iVar.f86065b) && Intrinsics.d(this.f86066c, iVar.f86066c) && Intrinsics.d(this.f86067d, iVar.f86067d) && Intrinsics.d(this.f86068e, iVar.f86068e) && Intrinsics.d(this.f86069f, iVar.f86069f) && Intrinsics.d(this.f86070g, iVar.f86070g) && Intrinsics.d(this.f86071h, iVar.f86071h) && Intrinsics.d(this.f86072i, iVar.f86072i) && Intrinsics.d(this.f86073j, iVar.f86073j) && Intrinsics.d(this.f86074k, iVar.f86074k);
    }

    public final List<BadgeDTO> f() {
        return this.f86069f;
    }

    @NotNull
    public final TextDTO g() {
        return this.f86067d;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f86064a;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.j
    public final String getSendTime() {
        return this.f86074k;
    }

    public final Map<String, MessengerTrackingInfo> h() {
        return this.f86073j;
    }

    public final int hashCode() {
        int hashCode = (this.f86065b.hashCode() + (this.f86064a.hashCode() * 31)) * 31;
        PriceDTO priceDTO = this.f86066c;
        int a11 = Ns.b.a(this.f86067d, (hashCode + (priceDTO == null ? 0 : priceDTO.hashCode())) * 31, 31);
        List<IconButtonV3DTO> list = this.f86068e;
        int hashCode2 = (a11 + (list == null ? 0 : list.hashCode())) * 31;
        List<BadgeDTO> list2 = this.f86069f;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<BadgeDTO> list3 = this.f86070g;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.f86071h;
        int hashCode5 = (hashCode4 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        AtomActionDTO atomActionDTO2 = this.f86072i;
        int a12 = C3532b.a((hashCode5 + (atomActionDTO2 == null ? 0 : atomActionDTO2.hashCode())) * 31, 31, false);
        Map<String, MessengerTrackingInfo> map = this.f86073j;
        int hashCode6 = (a12 + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.f86074k;
        return hashCode6 + (str != null ? str.hashCode() : 0);
    }

    public final AtomActionDTO i() {
        return this.f86072i;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.j
    public final void setSendTime(String str) {
        this.f86074k = str;
    }

    @NotNull
    public final String toString() {
        return "ProductShelfVO(blockId=" + this.f86064a + ", image=" + this.f86065b + ", price=" + this.f86066c + ", productName=" + this.f86067d + ", buttons=" + this.f86068e + ", priceBadges=" + this.f86069f + ", bottomBadges=" + this.f86070g + ", action=" + this.f86071h + ", updateBlockAction=" + this.f86072i + ", needUpdate=false, trackingInfo=" + this.f86073j + ", sendTime=" + this.f86074k + ")";
    }
}

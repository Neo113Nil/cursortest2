package ru.ozon.android.messenger.blocks.courierheader.presentation;

import T7.P;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.presentation.models.g;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.c f84949a;

    /* renamed from: b, reason: collision with root package name */
    private final TextDTO f84950b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f84951c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, MessengerTrackingInfo> f84952d;

    /* renamed from: ru.ozon.android.messenger.blocks.courierheader.presentation.a$a, reason: collision with other inner class name */
    public static final class C1486a {

        /* renamed from: a, reason: collision with root package name */
        private final TextDTO f84953a;

        /* renamed from: b, reason: collision with root package name */
        private final BadgeDTO f84954b;

        /* renamed from: c, reason: collision with root package name */
        private final List<ProductMediaDTO> f84955c;

        /* renamed from: d, reason: collision with root package name */
        private final AtomActionDTO f84956d;

        /* renamed from: e, reason: collision with root package name */
        private final Map<String, MessengerTrackingInfo> f84957e;

        public C1486a(TextDTO textDTO, List list, AtomActionDTO atomActionDTO, BadgeDTO badgeDTO, Map map) {
            this.f84953a = textDTO;
            this.f84954b = badgeDTO;
            this.f84955c = list;
            this.f84956d = atomActionDTO;
            this.f84957e = map;
        }

        public final AtomActionDTO a() {
            return this.f84956d;
        }

        public final BadgeDTO b() {
            return this.f84954b;
        }

        public final List<ProductMediaDTO> c() {
            return this.f84955c;
        }

        public final TextDTO d() {
            return this.f84953a;
        }

        public final Map<String, MessengerTrackingInfo> e() {
            return this.f84957e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1486a)) {
                return false;
            }
            C1486a c1486a = (C1486a) obj;
            return Intrinsics.d(this.f84953a, c1486a.f84953a) && Intrinsics.d(this.f84954b, c1486a.f84954b) && Intrinsics.d(this.f84955c, c1486a.f84955c) && Intrinsics.d(this.f84956d, c1486a.f84956d) && Intrinsics.d(this.f84957e, c1486a.f84957e);
        }

        public final int hashCode() {
            TextDTO textDTO = this.f84953a;
            int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
            BadgeDTO badgeDTO = this.f84954b;
            int hashCode2 = (hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
            List<ProductMediaDTO> list = this.f84955c;
            int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.f84956d;
            int hashCode4 = (hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, MessengerTrackingInfo> map = this.f84957e;
            return hashCode4 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ItemVO(title=");
            sb2.append(this.f84953a);
            sb2.append(", badge=");
            sb2.append(this.f84954b);
            sb2.append(", elems=");
            sb2.append(this.f84955c);
            sb2.append(", action=");
            sb2.append(this.f84956d);
            sb2.append(", trackingInfo=");
            return P.f(sb2, this.f84957e, ")");
        }
    }

    public a(@NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId, TextDTO textDTO, ArrayList arrayList, Map map) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        this.f84949a = blockId;
        this.f84950b = textDTO;
        this.f84951c = arrayList;
        this.f84952d = map;
    }

    public final List<C1486a> a() {
        return this.f84951c;
    }

    public final TextDTO b() {
        return this.f84950b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f84949a, aVar.f84949a) && Intrinsics.d(this.f84950b, aVar.f84950b) && Intrinsics.d(this.f84951c, aVar.f84951c) && Intrinsics.d(this.f84952d, aVar.f84952d);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f84949a;
    }

    public final int hashCode() {
        int hashCode = this.f84949a.hashCode() * 31;
        TextDTO textDTO = this.f84950b;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        ArrayList arrayList = this.f84951c;
        int hashCode3 = (hashCode2 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        Map<String, MessengerTrackingInfo> map = this.f84952d;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CourierHeaderVO(blockId=");
        sb2.append(this.f84949a);
        sb2.append(", title=");
        sb2.append(this.f84950b);
        sb2.append(", items=");
        sb2.append(this.f84951c);
        sb2.append(", trackingInfo=");
        return P.f(sb2, this.f84952d, ")");
    }
}

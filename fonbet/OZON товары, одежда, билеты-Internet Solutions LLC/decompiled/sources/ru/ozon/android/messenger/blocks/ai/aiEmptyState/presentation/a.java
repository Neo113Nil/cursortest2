package ru.ozon.android.messenger.blocks.ai.aiEmptyState.presentation;

import B0.C2454a;
import T7.P;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.presentation.models.c;
import ru.ozon.android.messenger.framework.presentation.models.g;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f83946a;

    /* renamed from: b, reason: collision with root package name */
    private final IconDTO f83947b;

    /* renamed from: c, reason: collision with root package name */
    private final TextDTO f83948c;

    /* renamed from: d, reason: collision with root package name */
    private final TextDTO f83949d;

    /* renamed from: e, reason: collision with root package name */
    private final BadgeDTO f83950e;

    /* renamed from: f, reason: collision with root package name */
    private final int f83951f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final String f83952g;

    /* renamed from: h, reason: collision with root package name */
    private final Map<String, MessengerTrackingInfo> f83953h;

    public a(@NotNull c blockId, IconDTO iconDTO, TextDTO textDTO, TextDTO textDTO2, BadgeDTO badgeDTO, int i11, @NotNull String automatizationId, Map<String, MessengerTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(automatizationId, "automatizationId");
        this.f83946a = blockId;
        this.f83947b = iconDTO;
        this.f83948c = textDTO;
        this.f83949d = textDTO2;
        this.f83950e = badgeDTO;
        this.f83951f = i11;
        this.f83952g = automatizationId;
        this.f83953h = map;
    }

    public static void a(a aVar, c blockId, IconDTO iconDTO, TextDTO textDTO, TextDTO textDTO2, BadgeDTO badgeDTO) {
        String automatizationId = aVar.f83952g;
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(automatizationId, "automatizationId");
        new a(blockId, iconDTO, textDTO, textDTO2, badgeDTO, 100, automatizationId, aVar.f83953h);
    }

    @NotNull
    public final String b() {
        return this.f83952g;
    }

    public final BadgeDTO c() {
        return this.f83950e;
    }

    public final IconDTO d() {
        return this.f83947b;
    }

    public final TextDTO e() {
        return this.f83949d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f83946a, aVar.f83946a) && Intrinsics.d(this.f83947b, aVar.f83947b) && Intrinsics.d(this.f83948c, aVar.f83948c) && Intrinsics.d(this.f83949d, aVar.f83949d) && Intrinsics.d(this.f83950e, aVar.f83950e) && this.f83951f == aVar.f83951f && Intrinsics.d(this.f83952g, aVar.f83952g) && Intrinsics.d(this.f83953h, aVar.f83953h);
    }

    public final TextDTO f() {
        return this.f83948c;
    }

    public final int g() {
        return this.f83951f;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final c getBlockId() {
        return this.f83946a;
    }

    public final Map<String, MessengerTrackingInfo> h() {
        return this.f83953h;
    }

    public final int hashCode() {
        int hashCode = this.f83946a.hashCode() * 31;
        IconDTO iconDTO = this.f83947b;
        int hashCode2 = (hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
        TextDTO textDTO = this.f83948c;
        int hashCode3 = (hashCode2 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        TextDTO textDTO2 = this.f83949d;
        int hashCode4 = (hashCode3 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        BadgeDTO badgeDTO = this.f83950e;
        int a11 = G.g.a(C2454a.a(this.f83951f, (hashCode4 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31, 31), 31, this.f83952g);
        Map<String, MessengerTrackingInfo> map = this.f83953h;
        return a11 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AIEmptyStateVO(blockId=");
        sb2.append(this.f83946a);
        sb2.append(", icon=");
        sb2.append(this.f83947b);
        sb2.append(", title=");
        sb2.append(this.f83948c);
        sb2.append(", subtitle=");
        sb2.append(this.f83949d);
        sb2.append(", bottomBadge=");
        sb2.append(this.f83950e);
        sb2.append(", topPadding=");
        sb2.append(this.f83951f);
        sb2.append(", automatizationId=");
        sb2.append(this.f83952g);
        sb2.append(", trackingInfo=");
        return P.f(sb2, this.f83953h, ")");
    }
}

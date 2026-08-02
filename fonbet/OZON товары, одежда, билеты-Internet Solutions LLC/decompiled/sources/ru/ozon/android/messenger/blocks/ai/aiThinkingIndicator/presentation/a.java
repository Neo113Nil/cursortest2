package ru.ozon.android.messenger.blocks.ai.aiThinkingIndicator.presentation;

import El.C2971a;
import T7.P;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.presentation.models.c;
import ru.ozon.android.messenger.framework.presentation.models.g;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f84072a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final IconDTO f84073b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<TextDTO> f84074c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f84075d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, MessengerTrackingInfo> f84076e;

    public a(@NotNull c blockId, @NotNull IconDTO icon, @NotNull List<TextDTO> statusMessages, @NotNull String automatizationId, Map<String, MessengerTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(statusMessages, "statusMessages");
        Intrinsics.checkNotNullParameter(automatizationId, "automatizationId");
        this.f84072a = blockId;
        this.f84073b = icon;
        this.f84074c = statusMessages;
        this.f84075d = automatizationId;
        this.f84076e = map;
    }

    @NotNull
    public final String a() {
        return this.f84075d;
    }

    @NotNull
    public final IconDTO b() {
        return this.f84073b;
    }

    @NotNull
    public final List<TextDTO> c() {
        return this.f84074c;
    }

    public final Map<String, MessengerTrackingInfo> d() {
        return this.f84076e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f84072a, aVar.f84072a) && Intrinsics.d(this.f84073b, aVar.f84073b) && Intrinsics.d(this.f84074c, aVar.f84074c) && Intrinsics.d(this.f84075d, aVar.f84075d) && Intrinsics.d(this.f84076e, aVar.f84076e);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final c getBlockId() {
        return this.f84072a;
    }

    public final int hashCode() {
        int a11 = G.g.a(G.g.b(C2971a.a(this.f84073b, this.f84072a.hashCode() * 31, 31), 31, this.f84074c), 31, this.f84075d);
        Map<String, MessengerTrackingInfo> map = this.f84076e;
        return a11 + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AiThinkingIndicatorVO(blockId=");
        sb2.append(this.f84072a);
        sb2.append(", icon=");
        sb2.append(this.f84073b);
        sb2.append(", statusMessages=");
        sb2.append(this.f84074c);
        sb2.append(", automatizationId=");
        sb2.append(this.f84075d);
        sb2.append(", trackingInfo=");
        return P.f(sb2, this.f84076e, ")");
    }
}

package ru.ozon.android.messenger.blocks.chat.common.menuItems;

import G.g;
import T7.P;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final CommonAtomLabelDTO f84555a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final CommonAtomIconDTO f84556b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f84557c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final AtomActionDTO f84558d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, MessengerTrackingInfo> f84559e;

    public b(@NotNull CommonAtomLabelDTO title, @NotNull CommonAtomIconDTO icon, @NotNull String backgroundColor, @NotNull AtomActionDTO action, Map<String, MessengerTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f84555a = title;
        this.f84556b = icon;
        this.f84557c = backgroundColor;
        this.f84558d = action;
        this.f84559e = map;
    }

    @NotNull
    public final AtomActionDTO a() {
        return this.f84558d;
    }

    @NotNull
    public final String b() {
        return this.f84557c;
    }

    @NotNull
    public final CommonAtomIconDTO c() {
        return this.f84556b;
    }

    @NotNull
    public final CommonAtomLabelDTO d() {
        return this.f84555a;
    }

    public final Map<String, MessengerTrackingInfo> e() {
        return this.f84559e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f84555a, bVar.f84555a) && Intrinsics.d(this.f84556b, bVar.f84556b) && Intrinsics.d(this.f84557c, bVar.f84557c) && Intrinsics.d(this.f84558d, bVar.f84558d) && Intrinsics.d(this.f84559e, bVar.f84559e);
    }

    public final int hashCode() {
        int b11 = Ih.a.b(this.f84558d, g.a((this.f84556b.hashCode() + (this.f84555a.hashCode() * 31)) * 31, 31, this.f84557c), 31);
        Map<String, MessengerTrackingInfo> map = this.f84559e;
        return b11 + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ContextMenuItemVO(title=");
        sb2.append(this.f84555a);
        sb2.append(", icon=");
        sb2.append(this.f84556b);
        sb2.append(", backgroundColor=");
        sb2.append(this.f84557c);
        sb2.append(", action=");
        sb2.append(this.f84558d);
        sb2.append(", trackingInfo=");
        return P.f(sb2, this.f84559e, ")");
    }
}

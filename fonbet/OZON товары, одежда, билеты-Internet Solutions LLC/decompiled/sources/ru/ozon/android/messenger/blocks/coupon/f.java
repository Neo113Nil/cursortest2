package ru.ozon.android.messenger.blocks.coupon;

import G.g;
import T7.P;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final TextAtom f84925a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomActionDTO f84926b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f84927c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, MessengerTrackingInfo> f84928d;

    public f(TextAtom textAtom, AtomActionDTO atomActionDTO, @NotNull String backgroundColor, Map<String, MessengerTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.f84925a = textAtom;
        this.f84926b = atomActionDTO;
        this.f84927c = backgroundColor;
        this.f84928d = map;
    }

    public final AtomActionDTO a() {
        return this.f84926b;
    }

    @NotNull
    public final String b() {
        return this.f84927c;
    }

    public final TextAtom c() {
        return this.f84925a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f84925a, fVar.f84925a) && Intrinsics.d(this.f84926b, fVar.f84926b) && Intrinsics.d(this.f84927c, fVar.f84927c) && Intrinsics.d(this.f84928d, fVar.f84928d);
    }

    public final int hashCode() {
        TextAtom textAtom = this.f84925a;
        int hashCode = (textAtom == null ? 0 : textAtom.hashCode()) * 31;
        AtomActionDTO atomActionDTO = this.f84926b;
        int a11 = g.a((hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31, 31, this.f84927c);
        Map<String, MessengerTrackingInfo> map = this.f84928d;
        return a11 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RightPartVO(title=");
        sb2.append(this.f84925a);
        sb2.append(", action=");
        sb2.append(this.f84926b);
        sb2.append(", backgroundColor=");
        sb2.append(this.f84927c);
        sb2.append(", trackingInfo=");
        return P.f(sb2, this.f84928d, ")");
    }
}

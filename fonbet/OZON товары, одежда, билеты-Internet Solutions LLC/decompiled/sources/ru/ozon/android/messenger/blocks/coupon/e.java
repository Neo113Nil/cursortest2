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
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final TextAtom f84919a;

    /* renamed from: b, reason: collision with root package name */
    private final TextAtom f84920b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomActionDTO f84921c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f84922d;

    /* renamed from: e, reason: collision with root package name */
    private final String f84923e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<String, MessengerTrackingInfo> f84924f;

    public e(@NotNull TextAtom title, TextAtom textAtom, AtomActionDTO atomActionDTO, @NotNull String backgroundColor, String str, Map<String, MessengerTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.f84919a = title;
        this.f84920b = textAtom;
        this.f84921c = atomActionDTO;
        this.f84922d = backgroundColor;
        this.f84923e = str;
        this.f84924f = map;
    }

    public final AtomActionDTO a() {
        return this.f84921c;
    }

    @NotNull
    public final String b() {
        return this.f84922d;
    }

    public final String c() {
        return this.f84923e;
    }

    public final TextAtom d() {
        return this.f84920b;
    }

    @NotNull
    public final TextAtom e() {
        return this.f84919a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f84919a, eVar.f84919a) && Intrinsics.d(this.f84920b, eVar.f84920b) && Intrinsics.d(this.f84921c, eVar.f84921c) && Intrinsics.d(this.f84922d, eVar.f84922d) && Intrinsics.d(this.f84923e, eVar.f84923e) && Intrinsics.d(this.f84924f, eVar.f84924f);
    }

    public final int hashCode() {
        int hashCode = this.f84919a.hashCode() * 31;
        TextAtom textAtom = this.f84920b;
        int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.f84921c;
        int a11 = g.a((hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31, 31, this.f84922d);
        String str = this.f84923e;
        int hashCode3 = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, MessengerTrackingInfo> map = this.f84924f;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LeftPartVO(title=");
        sb2.append(this.f84919a);
        sb2.append(", subtitle=");
        sb2.append(this.f84920b);
        sb2.append(", action=");
        sb2.append(this.f84921c);
        sb2.append(", backgroundColor=");
        sb2.append(this.f84922d);
        sb2.append(", backgroundImage=");
        sb2.append(this.f84923e);
        sb2.append(", trackingInfo=");
        return P.f(sb2, this.f84924f, ")");
    }
}

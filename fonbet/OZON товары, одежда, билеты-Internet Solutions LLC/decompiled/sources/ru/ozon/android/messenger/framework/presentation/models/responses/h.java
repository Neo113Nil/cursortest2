package ru.ozon.android.messenger.framework.presentation.models.responses;

import T7.P;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.q;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

/* loaded from: classes10.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<q> f91502a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<q> f91503b;

    /* renamed from: c, reason: collision with root package name */
    private final Boolean f91504c;

    /* renamed from: d, reason: collision with root package name */
    private final Boolean f91505d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, String> f91506e;

    /* renamed from: f, reason: collision with root package name */
    private final f f91507f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<String, TokenizedTrackingInfo> f91508g;

    public h(@NotNull List<q> messages, @NotNull List<q> noUiItems, Boolean bool, Boolean bool2, Map<String, String> map, f fVar, Map<String, TokenizedTrackingInfo> map2) {
        Intrinsics.checkNotNullParameter(messages, "messages");
        Intrinsics.checkNotNullParameter(noUiItems, "noUiItems");
        this.f91502a = messages;
        this.f91503b = noUiItems;
        this.f91504c = bool;
        this.f91505d = bool2;
        this.f91506e = map;
        this.f91507f = fVar;
        this.f91508g = map2;
    }

    public static h a(h hVar, Boolean bool, Boolean bool2) {
        List<q> messages = hVar.f91502a;
        List<q> noUiItems = hVar.f91503b;
        Map<String, String> map = hVar.f91506e;
        f fVar = hVar.f91507f;
        Map<String, TokenizedTrackingInfo> map2 = hVar.f91508g;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(messages, "messages");
        Intrinsics.checkNotNullParameter(noUiItems, "noUiItems");
        return new h(messages, noUiItems, bool, bool2, map, fVar, map2);
    }

    public final Map<String, String> b() {
        return this.f91506e;
    }

    public final f c() {
        return this.f91507f;
    }

    public final Boolean d() {
        return this.f91504c;
    }

    public final Boolean e() {
        return this.f91505d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f91502a, hVar.f91502a) && Intrinsics.d(this.f91503b, hVar.f91503b) && Intrinsics.d(this.f91504c, hVar.f91504c) && Intrinsics.d(this.f91505d, hVar.f91505d) && Intrinsics.d(this.f91506e, hVar.f91506e) && Intrinsics.d(this.f91507f, hVar.f91507f) && Intrinsics.d(this.f91508g, hVar.f91508g);
    }

    @NotNull
    public final List<q> f() {
        return this.f91502a;
    }

    @NotNull
    public final List<q> g() {
        return this.f91503b;
    }

    public final Map<String, TokenizedTrackingInfo> h() {
        return this.f91508g;
    }

    public final int hashCode() {
        int b11 = G.g.b(this.f91502a.hashCode() * 31, 31, this.f91503b);
        Boolean bool = this.f91504c;
        int hashCode = (b11 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f91505d;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Map<String, String> map = this.f91506e;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        f fVar = this.f91507f;
        int hashCode4 = (hashCode3 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map2 = this.f91508g;
        return hashCode4 + (map2 != null ? map2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GetMessagesResponseVO(messages=");
        sb2.append(this.f91502a);
        sb2.append(", noUiItems=");
        sb2.append(this.f91503b);
        sb2.append(", hasItemsAfter=");
        sb2.append(this.f91504c);
        sb2.append(", hasItemsBefore=");
        sb2.append(this.f91505d);
        sb2.append(", context=");
        sb2.append(this.f91506e);
        sb2.append(", firstPageInfo=");
        sb2.append(this.f91507f);
        sb2.append(", trackingInfo=");
        return P.f(sb2, this.f91508g, ")");
    }
}

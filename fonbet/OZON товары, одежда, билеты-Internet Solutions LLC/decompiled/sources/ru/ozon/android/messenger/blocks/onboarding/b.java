package ru.ozon.android.messenger.blocks.onboarding;

import De.C2859b;
import T7.P;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.presentation.models.g;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
public final class b implements g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.c f85939a;

    /* renamed from: b, reason: collision with root package name */
    private final ImageDTO f85940b;

    /* renamed from: c, reason: collision with root package name */
    private final String f85941c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final TextDTO f85942d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final TextDTO f85943e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ButtonV3DTO f85944f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final AtomActionDTO f85945g;

    /* renamed from: h, reason: collision with root package name */
    private final Map<String, MessengerTrackingInfo> f85946h;

    public b(@NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId, ImageDTO imageDTO, String str, @NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull ButtonV3DTO closeButton, @NotNull AtomActionDTO closedAction, Map<String, MessengerTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        Intrinsics.checkNotNullParameter(closedAction, "closedAction");
        this.f85939a = blockId;
        this.f85940b = imageDTO;
        this.f85941c = str;
        this.f85942d = title;
        this.f85943e = subtitle;
        this.f85944f = closeButton;
        this.f85945g = closedAction;
        this.f85946h = map;
    }

    public final String a() {
        return this.f85941c;
    }

    @NotNull
    public final ButtonV3DTO b() {
        return this.f85944f;
    }

    @NotNull
    public final AtomActionDTO c() {
        return this.f85945g;
    }

    public final ImageDTO d() {
        return this.f85940b;
    }

    @NotNull
    public final TextDTO e() {
        return this.f85943e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f85939a, bVar.f85939a) && Intrinsics.d(this.f85940b, bVar.f85940b) && Intrinsics.d(this.f85941c, bVar.f85941c) && Intrinsics.d(this.f85942d, bVar.f85942d) && Intrinsics.d(this.f85943e, bVar.f85943e) && Intrinsics.d(this.f85944f, bVar.f85944f) && Intrinsics.d(this.f85945g, bVar.f85945g) && Intrinsics.d(this.f85946h, bVar.f85946h);
    }

    @NotNull
    public final TextDTO f() {
        return this.f85942d;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f85939a;
    }

    public final int hashCode() {
        int hashCode = this.f85939a.hashCode() * 31;
        ImageDTO imageDTO = this.f85940b;
        int hashCode2 = (hashCode + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31;
        String str = this.f85941c;
        int b11 = Ih.a.b(this.f85945g, C2859b.c(this.f85944f, Ns.b.a(this.f85943e, Ns.b.a(this.f85942d, (hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31);
        Map<String, MessengerTrackingInfo> map = this.f85946h;
        return b11 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OnboardingVO(blockId=");
        sb2.append(this.f85939a);
        sb2.append(", image=");
        sb2.append(this.f85940b);
        sb2.append(", animation=");
        sb2.append(this.f85941c);
        sb2.append(", title=");
        sb2.append(this.f85942d);
        sb2.append(", subtitle=");
        sb2.append(this.f85943e);
        sb2.append(", closeButton=");
        sb2.append(this.f85944f);
        sb2.append(", closedAction=");
        sb2.append(this.f85945g);
        sb2.append(", trackingInfo=");
        return P.f(sb2, this.f85946h, ")");
    }
}

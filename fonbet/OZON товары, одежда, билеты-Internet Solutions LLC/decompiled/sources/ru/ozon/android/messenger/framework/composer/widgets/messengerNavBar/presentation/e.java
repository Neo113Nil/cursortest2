package ru.ozon.android.messenger.framework.composer.widgets.messengerNavBar.presentation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
public final class e implements l20.c {

    /* renamed from: a, reason: collision with root package name */
    private final long f87020a;

    /* renamed from: b, reason: collision with root package name */
    private final IconButtonV3DTO f87021b;

    /* renamed from: c, reason: collision with root package name */
    private final IconButtonV3DTO f87022c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final TextDTO f87023d;

    /* renamed from: e, reason: collision with root package name */
    private final TextDTO f87024e;

    /* renamed from: f, reason: collision with root package name */
    private final String f87025f;

    /* renamed from: g, reason: collision with root package name */
    private final CornerRadius f87026g;

    public e(long j11, IconButtonV3DTO iconButtonV3DTO, IconButtonV3DTO iconButtonV3DTO2, @NotNull TextDTO title, TextDTO textDTO, String str, CornerRadius cornerRadius) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f87020a = j11;
        this.f87021b = iconButtonV3DTO;
        this.f87022c = iconButtonV3DTO2;
        this.f87023d = title;
        this.f87024e = textDTO;
        this.f87025f = str;
        this.f87026g = cornerRadius;
    }

    public final String a() {
        return this.f87025f;
    }

    public final CornerRadius b() {
        return this.f87026g;
    }

    public final IconButtonV3DTO c() {
        return this.f87021b;
    }

    public final IconButtonV3DTO d() {
        return this.f87022c;
    }

    public final TextDTO e() {
        return this.f87024e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f87020a == eVar.f87020a && Intrinsics.d(this.f87021b, eVar.f87021b) && Intrinsics.d(this.f87022c, eVar.f87022c) && Intrinsics.d(this.f87023d, eVar.f87023d) && Intrinsics.d(this.f87024e, eVar.f87024e) && Intrinsics.d(this.f87025f, eVar.f87025f) && this.f87026g == eVar.f87026g;
    }

    @NotNull
    public final TextDTO f() {
        return this.f87023d;
    }

    @Override // l20.c
    public final long getId() {
        return this.f87020a;
    }

    @Override // l20.c
    public final Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public final int getViewItemKey() {
        return hashCode();
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.f87020a) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.f87021b;
        int hashCode2 = (hashCode + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO2 = this.f87022c;
        int a11 = Ns.b.a(this.f87023d, (hashCode2 + (iconButtonV3DTO2 == null ? 0 : iconButtonV3DTO2.hashCode())) * 31, 31);
        TextDTO textDTO = this.f87024e;
        int hashCode3 = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        String str = this.f87025f;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        CornerRadius cornerRadius = this.f87026g;
        return hashCode4 + (cornerRadius != null ? cornerRadius.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "MessengerNavBarVO(id=" + this.f87020a + ", leftButton=" + this.f87021b + ", rightButton=" + this.f87022c + ", title=" + this.f87023d + ", subtitle=" + this.f87024e + ", backgroundColor=" + this.f87025f + ", cornerRadius=" + this.f87026g + ")";
    }
}

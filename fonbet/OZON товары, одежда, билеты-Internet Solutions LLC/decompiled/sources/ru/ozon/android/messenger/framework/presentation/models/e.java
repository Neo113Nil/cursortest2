package ru.ozon.android.messenger.framework.presentation.models;

import B0.C2454a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final g f91434a;

    /* renamed from: b, reason: collision with root package name */
    private final int f91435b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.core.viewmapper.e f91436c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final p f91437d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final d f91438e;

    public e(@NotNull g blockVO, int i11, @NotNull ru.ozon.android.messenger.framework.core.viewmapper.e viewMapperType, @NotNull p itemInfo, @NotNull d blockInfo) {
        Intrinsics.checkNotNullParameter(blockVO, "blockVO");
        Intrinsics.checkNotNullParameter(viewMapperType, "viewMapperType");
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        Intrinsics.checkNotNullParameter(blockInfo, "blockInfo");
        this.f91434a = blockVO;
        this.f91435b = i11;
        this.f91436c = viewMapperType;
        this.f91437d = itemInfo;
        this.f91438e = blockInfo;
    }

    @NotNull
    public final d a() {
        return this.f91438e;
    }

    @NotNull
    public final g b() {
        return this.f91434a;
    }

    @NotNull
    public final p c() {
        return this.f91437d;
    }

    public final int d() {
        return this.f91435b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f91434a, eVar.f91434a) && this.f91435b == eVar.f91435b && Intrinsics.d(this.f91436c, eVar.f91436c) && Intrinsics.d(this.f91437d, eVar.f91437d) && Intrinsics.d(this.f91438e, eVar.f91438e);
    }

    public final int hashCode() {
        return this.f91438e.hashCode() + ((this.f91437d.hashCode() + ((this.f91436c.hashCode() + C2454a.a(this.f91435b, this.f91434a.hashCode() * 31, 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "BlockItem(blockVO=" + this.f91434a + ", viewType=" + this.f91435b + ", viewMapperType=" + this.f91436c + ", itemInfo=" + this.f91437d + ", blockInfo=" + this.f91438e + ")";
    }
}

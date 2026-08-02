package ru.ozon.android.messenger.blocks.systemText.presentation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.c;
import ru.ozon.android.messenger.framework.presentation.models.g;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f86493a;

    /* renamed from: b, reason: collision with root package name */
    private final TextDTO f86494b;

    /* renamed from: c, reason: collision with root package name */
    private final Boolean f86495c;

    /* renamed from: d, reason: collision with root package name */
    private final Boolean f86496d;

    public a(@NotNull c blockId, TextDTO textDTO, Boolean bool, Boolean bool2) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        this.f86493a = blockId;
        this.f86494b = textDTO;
        this.f86495c = bool;
        this.f86496d = bool2;
    }

    public final Boolean a() {
        return this.f86496d;
    }

    public final Boolean b() {
        return this.f86495c;
    }

    public final TextDTO c() {
        return this.f86494b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f86493a, aVar.f86493a) && Intrinsics.d(this.f86494b, aVar.f86494b) && Intrinsics.d(this.f86495c, aVar.f86495c) && Intrinsics.d(this.f86496d, aVar.f86496d);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final c getBlockId() {
        return this.f86493a;
    }

    public final int hashCode() {
        int hashCode = this.f86493a.hashCode() * 31;
        TextDTO textDTO = this.f86494b;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        Boolean bool = this.f86495c;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f86496d;
        return hashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "SystemTextVO(blockId=" + this.f86493a + ", text=" + this.f86494b + ", hasTopSeparator=" + this.f86495c + ", hasBottomSeparator=" + this.f86496d + ")";
    }
}

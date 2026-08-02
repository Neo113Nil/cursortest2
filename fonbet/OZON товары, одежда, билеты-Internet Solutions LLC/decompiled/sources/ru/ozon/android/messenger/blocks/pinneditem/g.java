package ru.ozon.android.messenger.blocks.pinneditem;

import B90.C2618u;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.remote.models.blocks.BlockDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

/* loaded from: classes10.dex */
public final class g implements ru.ozon.android.messenger.framework.presentation.models.g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.c f86045a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final BlockDTO f86046b;

    /* renamed from: c, reason: collision with root package name */
    private final String f86047c;

    /* renamed from: d, reason: collision with root package name */
    private final List<IconButtonV3DTO> f86048d;

    static {
        int i11 = IconButtonV3DTO.$stable;
    }

    public g(@NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId, @NotNull BlockDTO blockDTO, String str, List<IconButtonV3DTO> list) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(blockDTO, "blockDTO");
        this.f86045a = blockId;
        this.f86046b = blockDTO;
        this.f86047c = str;
        this.f86048d = list;
    }

    @NotNull
    public final BlockDTO a() {
        return this.f86046b;
    }

    public final List<IconButtonV3DTO> b() {
        return this.f86048d;
    }

    public final String c() {
        return this.f86047c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f86045a, gVar.f86045a) && Intrinsics.d(this.f86046b, gVar.f86046b) && Intrinsics.d(this.f86047c, gVar.f86047c) && Intrinsics.d(this.f86048d, gVar.f86048d);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f86045a;
    }

    public final int hashCode() {
        int hashCode = (this.f86046b.hashCode() + (this.f86045a.hashCode() * 31)) * 31;
        String str = this.f86047c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<IconButtonV3DTO> list = this.f86048d;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PinnedItemVO(blockId=");
        sb2.append(this.f86045a);
        sb2.append(", blockDTO=");
        sb2.append(this.f86046b);
        sb2.append(", messageId=");
        sb2.append(this.f86047c);
        sb2.append(", iconButtons=");
        return C2618u.h(sb2, this.f86048d, ")");
    }
}

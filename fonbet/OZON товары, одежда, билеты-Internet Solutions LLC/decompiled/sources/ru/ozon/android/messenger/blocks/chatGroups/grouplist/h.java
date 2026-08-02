package ru.ozon.android.messenger.blocks.chatGroups.grouplist;

import C.o0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.remote.models.items.ItemDTO;

/* loaded from: classes10.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final List<ItemDTO> f84708a;

    /* renamed from: b, reason: collision with root package name */
    private final String f84709b;

    public h(List<ItemDTO> list, String str) {
        this.f84708a = list;
        this.f84709b = str;
    }

    public final List<ItemDTO> a() {
        return this.f84708a;
    }

    public final String b() {
        return this.f84709b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f84708a, hVar.f84708a) && Intrinsics.d(this.f84709b, hVar.f84709b);
    }

    public final int hashCode() {
        List<ItemDTO> list = this.f84708a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.f84709b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChatGroupListDTO(groups=");
        sb2.append(this.f84708a);
        sb2.append(", selectedGroupItemId=");
        return o0.c(sb2, this.f84709b, ")");
    }
}

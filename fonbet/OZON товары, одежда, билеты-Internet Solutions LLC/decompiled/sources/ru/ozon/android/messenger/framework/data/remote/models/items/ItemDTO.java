package ru.ozon.android.messenger.framework.data.remote.models.items;

import B0.C2454a;
import Pk0.g;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JB\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0012J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0012R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0014R\u0017\u0010\n\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010\u0016¨\u0006)"}, d2 = {"Lru/ozon/android/messenger/framework/data/remote/models/items/ItemDTO;", "", "", "id", "Lru/ozon/android/messenger/framework/data/remote/models/items/b;", "type", "", "version", "", "orderBy", "parsedModel", "<init>", "(Ljava/lang/String;Lru/ozon/android/messenger/framework/data/remote/models/items/b;IDLjava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Lru/ozon/android/messenger/framework/data/remote/models/items/b;", "component3", "()I", "component4", "()D", "component5", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Lru/ozon/android/messenger/framework/data/remote/models/items/b;IDLjava/lang/Object;)Lru/ozon/android/messenger/framework/data/remote/models/items/ItemDTO;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lru/ozon/android/messenger/framework/data/remote/models/items/b;", "getType", "I", "getVersion", "D", "getOrderBy", "Ljava/lang/Object;", "getParsedModel", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ItemDTO {
    public static final int $stable = 8;

    @NotNull
    private final String id;
    private final double orderBy;

    @NotNull
    private final Object parsedModel;

    @NotNull
    private final b type;
    private final int version;

    public ItemDTO(@NotNull String id2, @NotNull b type, int i11, double d11, @NotNull Object parsedModel) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parsedModel, "parsedModel");
        this.id = id2;
        this.type = type;
        this.version = i11;
        this.orderBy = d11;
        this.parsedModel = parsedModel;
    }

    public static /* synthetic */ ItemDTO copy$default(ItemDTO itemDTO, String str, b bVar, int i11, double d11, Object obj, int i12, Object obj2) {
        if ((i12 & 1) != 0) {
            str = itemDTO.id;
        }
        if ((i12 & 2) != 0) {
            bVar = itemDTO.type;
        }
        if ((i12 & 4) != 0) {
            i11 = itemDTO.version;
        }
        if ((i12 & 8) != 0) {
            d11 = itemDTO.orderBy;
        }
        if ((i12 & 16) != 0) {
            obj = itemDTO.parsedModel;
        }
        Object obj3 = obj;
        int i13 = i11;
        return itemDTO.copy(str, bVar, i13, d11, obj3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final b getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* renamed from: component4, reason: from getter */
    public final double getOrderBy() {
        return this.orderBy;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final Object getParsedModel() {
        return this.parsedModel;
    }

    @NotNull
    public final ItemDTO copy(@NotNull String id2, @NotNull b type, int version, double orderBy, @NotNull Object parsedModel) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parsedModel, "parsedModel");
        return new ItemDTO(id2, type, version, orderBy, parsedModel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemDTO)) {
            return false;
        }
        ItemDTO itemDTO = (ItemDTO) other;
        return Intrinsics.d(this.id, itemDTO.id) && this.type == itemDTO.type && this.version == itemDTO.version && Double.compare(this.orderBy, itemDTO.orderBy) == 0 && Intrinsics.d(this.parsedModel, itemDTO.parsedModel);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final double getOrderBy() {
        return this.orderBy;
    }

    @NotNull
    public final Object getParsedModel() {
        return this.parsedModel;
    }

    @NotNull
    public final b getType() {
        return this.type;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.parsedModel.hashCode() + g.a(C2454a.a(this.version, (this.type.hashCode() + (this.id.hashCode() * 31)) * 31, 31), 31, this.orderBy);
    }

    @NotNull
    public String toString() {
        return "ItemDTO(id=" + this.id + ", type=" + this.type + ", version=" + this.version + ", orderBy=" + this.orderBy + ", parsedModel=" + this.parsedModel + ")";
    }
}

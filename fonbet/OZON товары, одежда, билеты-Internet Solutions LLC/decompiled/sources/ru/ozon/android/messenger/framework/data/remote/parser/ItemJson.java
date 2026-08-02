package ru.ozon.android.messenger.framework.data.remote.parser;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0012\b\u0001\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u0019\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/android/messenger/framework/data/remote/parser/ItemJson;", "", "", "id", "Lru/ozon/android/messenger/framework/data/remote/models/items/b;", "type", "", "version", "", "orderBy", "model", "<init>", "(Ljava/lang/String;Lru/ozon/android/messenger/framework/data/remote/models/items/b;ILjava/lang/Double;Ljava/lang/String;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lru/ozon/android/messenger/framework/data/remote/models/items/b;", "getType", "()Lru/ozon/android/messenger/framework/data/remote/models/items/b;", "I", "getVersion", "()I", "Ljava/lang/Double;", "getOrderBy", "()Ljava/lang/Double;", "getModel", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ItemJson {
    public static final int $stable = 0;

    @NotNull
    private final String id;

    @NotNull
    private final String model;
    private final Double orderBy;

    @NotNull
    private final ru.ozon.android.messenger.framework.data.remote.models.items.b type;
    private final int version;

    public ItemJson(@NotNull String id2, @NotNull ru.ozon.android.messenger.framework.data.remote.models.items.b type, int i11, Double d11, @DataString @NotNull String model) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(model, "model");
        this.id = id2;
        this.type = type;
        this.version = i11;
        this.orderBy = d11;
        this.model = model;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    public final Double getOrderBy() {
        return this.orderBy;
    }

    @NotNull
    public final ru.ozon.android.messenger.framework.data.remote.models.items.b getType() {
        return this.type;
    }

    public final int getVersion() {
        return this.version;
    }
}

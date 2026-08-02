package ru.ozon.mapsdk.common.geoproxy.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/data/model/FeaturesField;", "", "vector", "Lru/ozon/mapsdk/common/geoproxy/data/model/Vector;", "<init>", "(Lru/ozon/mapsdk/common/geoproxy/data/model/Vector;)V", "getVector", "()Lru/ozon/mapsdk/common/geoproxy/data/model/Vector;", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FeaturesField {

    @NotNull
    private final Vector vector;

    public FeaturesField(@NotNull Vector vector) {
        Intrinsics.checkNotNullParameter(vector, "vector");
        this.vector = vector;
    }

    @NotNull
    public final Vector getVector() {
        return this.vector;
    }
}

package ru.sberdevices.salutevision.core.models;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0082 J\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0011\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0082 J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0011\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006H\u0082 J\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u000f"}, d2 = {"Lru/sberdevices/salutevision/core/models/ModelsRepository;", "", "()V", "addModel", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "data", "", "addModelWithName", "hasModel", "hasModelWithName", "removeModel", "", "removeModelWithName", "salutevision-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public class ModelsRepository {
    protected ModelsRepository() {
    }

    private final native boolean addModel(String name, byte[] data);

    private final native boolean hasModel(String name);

    private final native void removeModel(String name);

    public final boolean addModelWithName(@NotNull String name, @NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(data, "data");
        return addModel(name, data);
    }

    public final boolean hasModelWithName(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return hasModel(name);
    }

    public final void removeModelWithName(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        removeModel(name);
    }
}

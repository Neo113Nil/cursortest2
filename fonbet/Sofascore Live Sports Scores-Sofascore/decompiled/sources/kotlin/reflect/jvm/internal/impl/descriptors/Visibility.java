package kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class Visibility {
    private final boolean isPublicAPI;

    @NotNull
    private final String name;

    public Visibility(@NotNull String str, boolean z) {
        str.getClass();
        this.name = str;
        this.isPublicAPI = z;
    }

    @Nullable
    public Integer compareTo(@NotNull Visibility visibility) {
        visibility.getClass();
        return Visibilities.INSTANCE.compareLocal$compiler_common(this, visibility);
    }

    @NotNull
    public String getInternalDisplayName() {
        return this.name;
    }

    public final boolean isPublicAPI() {
        return this.isPublicAPI;
    }

    @NotNull
    public final String toString() {
        return getInternalDisplayName();
    }

    @NotNull
    public Visibility normalize() {
        return this;
    }
}

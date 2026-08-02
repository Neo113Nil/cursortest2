package ai.verisoul.sdk.helpers.emulator;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lai/verisoul/sdk/helpers/emulator/Property;", "", "name", "", "seekValue", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getSeekValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Property {

    @NotNull
    private final String name;

    @Nullable
    private final String seekValue;

    public Property(@NotNull String name, @Nullable String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.seekValue = str;
    }

    public static /* synthetic */ Property copy$default(Property property, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = property.name;
        }
        if ((i10 & 2) != 0) {
            str2 = property.seekValue;
        }
        return property.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getSeekValue() {
        return this.seekValue;
    }

    @NotNull
    public final Property copy(@NotNull String name, @Nullable String seekValue) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new Property(name, seekValue);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Property)) {
            return false;
        }
        Property property = (Property) other;
        return Intrinsics.areEqual(this.name, property.name) && Intrinsics.areEqual(this.seekValue, property.seekValue);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getSeekValue() {
        return this.seekValue;
    }

    public int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        String str = this.seekValue;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "Property(name=" + this.name + ", seekValue=" + this.seekValue + ")";
    }
}

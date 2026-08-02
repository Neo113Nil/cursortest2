package ru.ozon.mapsdk.common.geoproxy.model;

import Xc.a;
import Xc.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/model/PreferredProvider;", "", "type", "Lru/ozon/mapsdk/common/geoproxy/model/PreferredProvider$Type;", "providers", "", "", "<init>", "(Lru/ozon/mapsdk/common/geoproxy/model/PreferredProvider$Type;Ljava/util/List;)V", "getType", "()Lru/ozon/mapsdk/common/geoproxy/model/PreferredProvider$Type;", "getProviders", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Type", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PreferredProvider {
    private final List<String> providers;

    @NotNull
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/model/PreferredProvider$Type;", "", "<init>", "(Ljava/lang/String;I)V", "SUGGEST", "GEOCODE", "REVGEOCODE", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type SUGGEST = new Type("SUGGEST", 0);
        public static final Type GEOCODE = new Type("GEOCODE", 1);
        public static final Type REVGEOCODE = new Type("REVGEOCODE", 2);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{SUGGEST, GEOCODE, REVGEOCODE};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Type(String str, int i11) {
        }

        @NotNull
        public static a<Type> getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public PreferredProvider(@NotNull Type type, List<String> list) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.providers = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PreferredProvider copy$default(PreferredProvider preferredProvider, Type type, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            type = preferredProvider.type;
        }
        if ((i11 & 2) != 0) {
            list = preferredProvider.providers;
        }
        return preferredProvider.copy(type, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    public final List<String> component2() {
        return this.providers;
    }

    @NotNull
    public final PreferredProvider copy(@NotNull Type type, List<String> providers) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new PreferredProvider(type, providers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreferredProvider)) {
            return false;
        }
        PreferredProvider preferredProvider = (PreferredProvider) other;
        return this.type == preferredProvider.type && Intrinsics.d(this.providers, preferredProvider.providers);
    }

    public final List<String> getProviders() {
        return this.providers;
    }

    @NotNull
    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        List<String> list = this.providers;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "PreferredProvider(type=" + this.type + ", providers=" + this.providers + ")";
    }
}

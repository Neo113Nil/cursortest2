package io.github.lukmccall.pika;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lio/github/lukmccall/pika/TypeInfo;", "", "<init>", "()V", "Simple", "Parameterized", "Star", "Lio/github/lukmccall/pika/TypeInfo$Parameterized;", "Lio/github/lukmccall/pika/TypeInfo$Simple;", "Lio/github/lukmccall/pika/TypeInfo$Star;", "pika-api"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class TypeInfo {
    public /* synthetic */ TypeInfo(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private TypeInfo() {
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\r\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\b\u0002\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0019"}, d2 = {"Lio/github/lukmccall/pika/TypeInfo$Simple;", "Lio/github/lukmccall/pika/TypeInfo;", "typeName", "", "kClass", "Lkotlin/reflect/KClass;", "isNullable", "", "<init>", "(Ljava/lang/String;Lkotlin/reflect/KClass;Z)V", "getTypeName", "()Ljava/lang/String;", "getKClass", "()Lkotlin/reflect/KClass;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "pika-api"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Simple extends TypeInfo {
        private final boolean isNullable;
        private final KClass<?> kClass;
        private final String typeName;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Simple copy$default(Simple simple, String str, KClass kClass, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = simple.typeName;
            }
            if ((i & 2) != 0) {
                kClass = simple.kClass;
            }
            if ((i & 4) != 0) {
                z = simple.isNullable;
            }
            return simple.copy(str, kClass, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTypeName() {
            return this.typeName;
        }

        public final KClass<?> component2() {
            return this.kClass;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsNullable() {
            return this.isNullable;
        }

        public final Simple copy(String typeName, KClass<?> kClass, boolean isNullable) {
            Intrinsics.checkNotNullParameter(typeName, "typeName");
            Intrinsics.checkNotNullParameter(kClass, "kClass");
            return new Simple(typeName, kClass, isNullable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Simple)) {
                return false;
            }
            Simple simple = (Simple) other;
            return Intrinsics.areEqual(this.typeName, simple.typeName) && Intrinsics.areEqual(this.kClass, simple.kClass) && this.isNullable == simple.isNullable;
        }

        public int hashCode() {
            return (((this.typeName.hashCode() * 31) + this.kClass.hashCode()) * 31) + Boolean.hashCode(this.isNullable);
        }

        public String toString() {
            return "Simple(typeName=" + this.typeName + ", kClass=" + this.kClass + ", isNullable=" + this.isNullable + ")";
        }

        public final String getTypeName() {
            return this.typeName;
        }

        public final KClass<?> getKClass() {
            return this.kClass;
        }

        public final boolean isNullable() {
            return this.isNullable;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Simple(String typeName, KClass<?> kClass, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(typeName, "typeName");
            Intrinsics.checkNotNullParameter(kClass, "kClass");
            this.typeName = typeName;
            this.kClass = kClass;
            this.isNullable = z;
        }
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\r\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\tHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\b\u0002\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lio/github/lukmccall/pika/TypeInfo$Parameterized;", "Lio/github/lukmccall/pika/TypeInfo;", "typeName", "", "kClass", "Lkotlin/reflect/KClass;", "isNullable", "", "typeArguments", "", "<init>", "(Ljava/lang/String;Lkotlin/reflect/KClass;ZLjava/util/List;)V", "getTypeName", "()Ljava/lang/String;", "getKClass", "()Lkotlin/reflect/KClass;", "()Z", "getTypeArguments", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "pika-api"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Parameterized extends TypeInfo {
        private final boolean isNullable;
        private final KClass<?> kClass;
        private final List<TypeInfo> typeArguments;
        private final String typeName;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Parameterized copy$default(Parameterized parameterized, String str, KClass kClass, boolean z, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = parameterized.typeName;
            }
            if ((i & 2) != 0) {
                kClass = parameterized.kClass;
            }
            if ((i & 4) != 0) {
                z = parameterized.isNullable;
            }
            if ((i & 8) != 0) {
                list = parameterized.typeArguments;
            }
            return parameterized.copy(str, kClass, z, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTypeName() {
            return this.typeName;
        }

        public final KClass<?> component2() {
            return this.kClass;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsNullable() {
            return this.isNullable;
        }

        public final List<TypeInfo> component4() {
            return this.typeArguments;
        }

        public final Parameterized copy(String typeName, KClass<?> kClass, boolean isNullable, List<? extends TypeInfo> typeArguments) {
            Intrinsics.checkNotNullParameter(typeName, "typeName");
            Intrinsics.checkNotNullParameter(kClass, "kClass");
            Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
            return new Parameterized(typeName, kClass, isNullable, typeArguments);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Parameterized)) {
                return false;
            }
            Parameterized parameterized = (Parameterized) other;
            return Intrinsics.areEqual(this.typeName, parameterized.typeName) && Intrinsics.areEqual(this.kClass, parameterized.kClass) && this.isNullable == parameterized.isNullable && Intrinsics.areEqual(this.typeArguments, parameterized.typeArguments);
        }

        public int hashCode() {
            return (((((this.typeName.hashCode() * 31) + this.kClass.hashCode()) * 31) + Boolean.hashCode(this.isNullable)) * 31) + this.typeArguments.hashCode();
        }

        public String toString() {
            return "Parameterized(typeName=" + this.typeName + ", kClass=" + this.kClass + ", isNullable=" + this.isNullable + ", typeArguments=" + this.typeArguments + ")";
        }

        public final String getTypeName() {
            return this.typeName;
        }

        public final KClass<?> getKClass() {
            return this.kClass;
        }

        public final boolean isNullable() {
            return this.isNullable;
        }

        public final List<TypeInfo> getTypeArguments() {
            return this.typeArguments;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Parameterized(String typeName, KClass<?> kClass, boolean z, List<? extends TypeInfo> typeArguments) {
            super(null);
            Intrinsics.checkNotNullParameter(typeName, "typeName");
            Intrinsics.checkNotNullParameter(kClass, "kClass");
            Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
            this.typeName = typeName;
            this.kClass = kClass;
            this.isNullable = z;
            this.typeArguments = typeArguments;
        }
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lio/github/lukmccall/pika/TypeInfo$Star;", "Lio/github/lukmccall/pika/TypeInfo;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "pika-api"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Star extends TypeInfo {
        public static final Star INSTANCE = new Star();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Star)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 2055254452;
        }

        public String toString() {
            return "Star";
        }

        private Star() {
            super(null);
        }
    }
}

package expo.modules.kotlin.types.descriptors;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: TypeDescriptor.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\t\nR\u0016\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lexpo/modules/kotlin/types/descriptors/RawTypeDescriptor;", "", "kClass", "Lkotlin/reflect/KClass;", "getKClass", "()Lkotlin/reflect/KClass;", "isNullable", "", "()Z", "Simple", "Parameterized", "Lexpo/modules/kotlin/types/descriptors/RawTypeDescriptor$Parameterized;", "Lexpo/modules/kotlin/types/descriptors/RawTypeDescriptor$Simple;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface RawTypeDescriptor {
    KClass<?> getKClass();

    boolean isNullable();

    /* compiled from: TypeDescriptor.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0018\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, d2 = {"Lexpo/modules/kotlin/types/descriptors/RawTypeDescriptor$Simple;", "Lexpo/modules/kotlin/types/descriptors/RawTypeDescriptor;", "kClass", "Lkotlin/reflect/KClass;", "isNullable", "", "<init>", "(Lkotlin/reflect/KClass;Z)V", "getKClass", "()Lkotlin/reflect/KClass;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Simple implements RawTypeDescriptor {
        private final boolean isNullable;
        private final KClass<?> kClass;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Simple copy$default(Simple simple, KClass kClass, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                kClass = simple.kClass;
            }
            if ((i & 2) != 0) {
                z = simple.isNullable;
            }
            return simple.copy(kClass, z);
        }

        public final KClass<?> component1() {
            return this.kClass;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsNullable() {
            return this.isNullable;
        }

        public final Simple copy(KClass<?> kClass, boolean isNullable) {
            Intrinsics.checkNotNullParameter(kClass, "kClass");
            return new Simple(kClass, isNullable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Simple)) {
                return false;
            }
            Simple simple = (Simple) other;
            return Intrinsics.areEqual(this.kClass, simple.kClass) && this.isNullable == simple.isNullable;
        }

        public int hashCode() {
            return (this.kClass.hashCode() * 31) + Boolean.hashCode(this.isNullable);
        }

        public String toString() {
            return "Simple(kClass=" + this.kClass + ", isNullable=" + this.isNullable + ")";
        }

        public Simple(KClass<?> kClass, boolean z) {
            Intrinsics.checkNotNullParameter(kClass, "kClass");
            this.kClass = kClass;
            this.isNullable = z;
        }

        @Override // expo.modules.kotlin.types.descriptors.RawTypeDescriptor
        public KClass<?> getKClass() {
            return this.kClass;
        }

        @Override // expo.modules.kotlin.types.descriptors.RawTypeDescriptor
        public boolean isNullable() {
            return this.isNullable;
        }
    }

    /* compiled from: TypeDescriptor.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0018\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lexpo/modules/kotlin/types/descriptors/RawTypeDescriptor$Parameterized;", "Lexpo/modules/kotlin/types/descriptors/RawTypeDescriptor;", "kClass", "Lkotlin/reflect/KClass;", "isNullable", "", "params", "", "<init>", "(Lkotlin/reflect/KClass;ZLjava/util/List;)V", "getKClass", "()Lkotlin/reflect/KClass;", "()Z", "getParams", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Parameterized implements RawTypeDescriptor {
        private final boolean isNullable;
        private final KClass<?> kClass;
        private final List<RawTypeDescriptor> params;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Parameterized copy$default(Parameterized parameterized, KClass kClass, boolean z, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                kClass = parameterized.kClass;
            }
            if ((i & 2) != 0) {
                z = parameterized.isNullable;
            }
            if ((i & 4) != 0) {
                list = parameterized.params;
            }
            return parameterized.copy(kClass, z, list);
        }

        public final KClass<?> component1() {
            return this.kClass;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsNullable() {
            return this.isNullable;
        }

        public final List<RawTypeDescriptor> component3() {
            return this.params;
        }

        public final Parameterized copy(KClass<?> kClass, boolean isNullable, List<? extends RawTypeDescriptor> params) {
            Intrinsics.checkNotNullParameter(kClass, "kClass");
            Intrinsics.checkNotNullParameter(params, "params");
            return new Parameterized(kClass, isNullable, params);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Parameterized)) {
                return false;
            }
            Parameterized parameterized = (Parameterized) other;
            return Intrinsics.areEqual(this.kClass, parameterized.kClass) && this.isNullable == parameterized.isNullable && Intrinsics.areEqual(this.params, parameterized.params);
        }

        public int hashCode() {
            return (((this.kClass.hashCode() * 31) + Boolean.hashCode(this.isNullable)) * 31) + this.params.hashCode();
        }

        public String toString() {
            return "Parameterized(kClass=" + this.kClass + ", isNullable=" + this.isNullable + ", params=" + this.params + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Parameterized(KClass<?> kClass, boolean z, List<? extends RawTypeDescriptor> params) {
            Intrinsics.checkNotNullParameter(kClass, "kClass");
            Intrinsics.checkNotNullParameter(params, "params");
            this.kClass = kClass;
            this.isNullable = z;
            this.params = params;
        }

        @Override // expo.modules.kotlin.types.descriptors.RawTypeDescriptor
        public KClass<?> getKClass() {
            return this.kClass;
        }

        @Override // expo.modules.kotlin.types.descriptors.RawTypeDescriptor
        public boolean isNullable() {
            return this.isNullable;
        }

        public final List<RawTypeDescriptor> getParams() {
            return this.params;
        }
    }
}

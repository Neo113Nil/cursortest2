package kotlin.reflect.jvm.internal.impl.builtins.functions;

import defpackage.wv8;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.text.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class FunctionTypeKindExtractor {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final FunctionTypeKindExtractor Default = new FunctionTypeKindExtractor(b.j(FunctionTypeKind.Function.INSTANCE, FunctionTypeKind.SuspendFunction.INSTANCE, FunctionTypeKind.KFunction.INSTANCE, FunctionTypeKind.KSuspendFunction.INSTANCE));

    @NotNull
    private final List<FunctionTypeKind> kinds;

    @NotNull
    private final Map<FqName, List<FunctionTypeKind>> knownKindsByPackageFqName;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class KindWithArity {
        private final int arity;

        @NotNull
        private final FunctionTypeKind kind;

        public KindWithArity(@NotNull FunctionTypeKind functionTypeKind, int i) {
            functionTypeKind.getClass();
            this.kind = functionTypeKind;
            this.arity = i;
        }

        @NotNull
        public final FunctionTypeKind component1() {
            return this.kind;
        }

        public final int component2() {
            return this.arity;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof KindWithArity)) {
                return false;
            }
            KindWithArity kindWithArity = (KindWithArity) obj;
            return Intrinsics.c(this.kind, kindWithArity.kind) && this.arity == kindWithArity.arity;
        }

        @NotNull
        public final FunctionTypeKind getKind() {
            return this.kind;
        }

        public int hashCode() {
            return Integer.hashCode(this.arity) + (this.kind.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("KindWithArity(kind=");
            sb.append(this.kind);
            sb.append(", arity=");
            return wv8.j(sb, this.arity, ')');
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FunctionTypeKindExtractor(@NotNull List<? extends FunctionTypeKind> list) {
        list.getClass();
        this.kinds = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            FqName packageFqName = ((FunctionTypeKind) obj).getPackageFqName();
            Object obj2 = linkedHashMap.get(packageFqName);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(packageFqName, obj2);
            }
            ((List) obj2).add(obj);
        }
        this.knownKindsByPackageFqName = linkedHashMap;
    }

    private final Integer toInt(String str) {
        if (str.length() == 0) {
            return null;
        }
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int charAt = str.charAt(i2) - '0';
            if (charAt < 0 || charAt >= 10) {
                return null;
            }
            i = (i * 10) + charAt;
        }
        return Integer.valueOf(i);
    }

    @Nullable
    public final FunctionTypeKind getFunctionalClassKind(@NotNull FqName fqName, @NotNull String str) {
        fqName.getClass();
        str.getClass();
        KindWithArity functionalClassKindWithArity = getFunctionalClassKindWithArity(fqName, str);
        if (functionalClassKindWithArity != null) {
            return functionalClassKindWithArity.getKind();
        }
        return null;
    }

    @Nullable
    public final KindWithArity getFunctionalClassKindWithArity(@NotNull FqName fqName, @NotNull String str) {
        Integer num;
        fqName.getClass();
        str.getClass();
        List<FunctionTypeKind> list = this.knownKindsByPackageFqName.get(fqName);
        if (list == null) {
            return null;
        }
        for (FunctionTypeKind functionTypeKind : list) {
            if (c.v(str, functionTypeKind.getClassNamePrefix(), false) && (num = toInt(str.substring(functionTypeKind.getClassNamePrefix().length()))) != null) {
                return new KindWithArity(functionTypeKind, num.intValue());
            }
        }
        return null;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FunctionTypeKindExtractor getDefault() {
            return FunctionTypeKindExtractor.Default;
        }

        private Companion() {
        }
    }
}

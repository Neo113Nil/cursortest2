package kotlin.reflect.jvm.internal.impl.builtins.functions;

import defpackage.lnb;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class FunctionTypeKind {

    @Nullable
    private final ClassId annotationOnInvokeClassId;

    @NotNull
    private final String classNamePrefix;
    private final boolean isReflectType;

    @NotNull
    private final FqName packageFqName;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Function extends FunctionTypeKind {

        @NotNull
        public static final Function INSTANCE = new Function();

        private Function() {
            super(StandardNames.BUILT_INS_PACKAGE_FQ_NAME, "Function", false, null);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class KFunction extends FunctionTypeKind {

        @NotNull
        public static final KFunction INSTANCE = new KFunction();

        private KFunction() {
            super(StandardNames.KOTLIN_REFLECT_FQ_NAME, "KFunction", true, null);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class KSuspendFunction extends FunctionTypeKind {

        @NotNull
        public static final KSuspendFunction INSTANCE = new KSuspendFunction();

        private KSuspendFunction() {
            super(StandardNames.KOTLIN_REFLECT_FQ_NAME, "KSuspendFunction", true, null);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class SuspendFunction extends FunctionTypeKind {

        @NotNull
        public static final SuspendFunction INSTANCE = new SuspendFunction();

        private SuspendFunction() {
            super(StandardNames.COROUTINES_PACKAGE_FQ_NAME, "SuspendFunction", false, null);
        }
    }

    public FunctionTypeKind(@NotNull FqName fqName, @NotNull String str, boolean z, @Nullable ClassId classId) {
        fqName.getClass();
        str.getClass();
        this.packageFqName = fqName;
        this.classNamePrefix = str;
        this.isReflectType = z;
        this.annotationOnInvokeClassId = classId;
    }

    @NotNull
    public final String getClassNamePrefix() {
        return this.classNamePrefix;
    }

    @NotNull
    public final FqName getPackageFqName() {
        return this.packageFqName;
    }

    @NotNull
    public final Name numberedClassName(int i) {
        Name identifier = Name.identifier(this.classNamePrefix + i);
        identifier.getClass();
        return identifier;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.packageFqName);
        sb.append('.');
        return lnb.q(sb, this.classNamePrefix, 'N');
    }
}

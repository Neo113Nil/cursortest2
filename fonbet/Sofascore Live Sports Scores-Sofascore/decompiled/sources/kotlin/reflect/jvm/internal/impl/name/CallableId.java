package kotlin.reflect.jvm.internal.impl.name;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class CallableId {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final Name LOCAL_NAME;

    @NotNull
    private static final FqName PACKAGE_FQ_NAME_FOR_LOCAL;

    @NotNull
    private final Name callableName;

    @Nullable
    private final FqName className;

    @NotNull
    private final FqName packageName;

    @Nullable
    private final FqName pathToLocal;

    static {
        Name name = SpecialNames.LOCAL;
        LOCAL_NAME = name;
        FqName fqName = FqName.topLevel(name);
        fqName.getClass();
        PACKAGE_FQ_NAME_FOR_LOCAL = fqName;
    }

    public CallableId(@NotNull FqName fqName, @Nullable FqName fqName2, @NotNull Name name, @Nullable FqName fqName3) {
        fqName.getClass();
        name.getClass();
        this.packageName = fqName;
        this.className = fqName2;
        this.callableName = name;
        this.pathToLocal = fqName3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallableId)) {
            return false;
        }
        CallableId callableId = (CallableId) obj;
        return Intrinsics.c(this.packageName, callableId.packageName) && Intrinsics.c(this.className, callableId.className) && Intrinsics.c(this.callableName, callableId.callableName) && Intrinsics.c(this.pathToLocal, callableId.pathToLocal);
    }

    public int hashCode() {
        int hashCode = this.packageName.hashCode() * 31;
        FqName fqName = this.className;
        int hashCode2 = (this.callableName.hashCode() + ((hashCode + (fqName == null ? 0 : fqName.hashCode())) * 31)) * 31;
        FqName fqName2 = this.pathToLocal;
        return hashCode2 + (fqName2 != null ? fqName2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String asString = this.packageName.asString();
        asString.getClass();
        String replace = asString.replace('.', '/');
        replace.getClass();
        StringBuilder sb = new StringBuilder(replace);
        sb.append("/");
        FqName fqName = this.className;
        if (fqName != null) {
            sb.append(fqName);
            sb.append(".");
        }
        sb.append(this.callableName);
        return sb.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ CallableId(FqName fqName, FqName fqName2, Name name, FqName fqName3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fqName, fqName2, name, (i & 8) != 0 ? null : fqName3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CallableId(@NotNull FqName fqName, @NotNull Name name) {
        this(fqName, null, name, null, 8, null);
        fqName.getClass();
        name.getClass();
    }
}

package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import defpackage.km5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class PredefinedFunctionEnhancementInfo {

    @NotNull
    private final List<TypeEnhancementInfo> parametersInfo;

    @Nullable
    private final TypeEnhancementInfo returnTypeInfo;

    public PredefinedFunctionEnhancementInfo(TypeEnhancementInfo typeEnhancementInfo, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : typeEnhancementInfo, (i & 2) != 0 ? km5.a : list);
    }

    @NotNull
    public final List<TypeEnhancementInfo> getParametersInfo() {
        return this.parametersInfo;
    }

    @Nullable
    public final TypeEnhancementInfo getReturnTypeInfo() {
        return this.returnTypeInfo;
    }

    public PredefinedFunctionEnhancementInfo(@Nullable TypeEnhancementInfo typeEnhancementInfo, @NotNull List<TypeEnhancementInfo> list) {
        list.getClass();
        this.returnTypeInfo = typeEnhancementInfo;
        this.parametersInfo = list;
    }

    public PredefinedFunctionEnhancementInfo() {
        this(null, null, 3, null);
    }
}

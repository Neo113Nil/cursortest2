package nf;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final c f20890b = new c(null);
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Class f20891a;

    public d(Enum[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        Class<?> componentType = entries.getClass().getComponentType();
        Intrinsics.checkNotNull(componentType);
        this.f20891a = componentType;
    }

    private final Object readResolve() {
        Object[] enumConstants = this.f20891a.getEnumConstants();
        Intrinsics.checkNotNullExpressionValue(enumConstants, "getEnumConstants(...)");
        return com.google.android.play.core.appupdate.b.l((Enum[]) enumConstants);
    }
}

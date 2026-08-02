package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public interface TypeProjection extends TypeArgumentMarker {
    @NotNull
    Variance getProjectionKind();

    @NotNull
    KotlinType getType();

    boolean isStarProjection();

    @NotNull
    TypeProjection refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner);
}

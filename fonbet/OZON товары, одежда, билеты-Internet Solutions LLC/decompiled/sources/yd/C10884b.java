package yd;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.d0;
import td.e0;

/* renamed from: yd.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10884b implements d0 {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Annotation f106564b;

    public C10884b(@NotNull Annotation annotation) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        this.f106564b = annotation;
    }

    @Override // td.d0
    @NotNull
    public final void b() {
        e0 NO_SOURCE_FILE = e0.f99393a;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE_FILE, "NO_SOURCE_FILE");
    }

    @NotNull
    public final Annotation c() {
        return this.f106564b;
    }
}

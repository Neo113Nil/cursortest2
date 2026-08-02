package zd;

import Jd.InterfaceC3393c;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: zd.i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C11107i extends AbstractC11106h implements InterfaceC3393c {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Annotation f108834b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11107i(Sd.f fVar, @NotNull Annotation annotation) {
        super(fVar);
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        this.f108834b = annotation;
    }

    @Override // Jd.InterfaceC3393c
    @NotNull
    public final C11105g a() {
        return new C11105g(this.f108834b);
    }
}

package gc0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.biometry.data.dto.BiometryEntryActionDTO;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.biometry.BiometryAuthViewModelDelegate", f = "BiometryAuthViewModelDelegate.kt", l = {134}, m = "handleAuthResult")
/* renamed from: gc0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6710c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C6709b f64240d;

    /* renamed from: e, reason: collision with root package name */
    BiometryEntryActionDTO f64241e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f64242f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C6709b f64243g;

    /* renamed from: h, reason: collision with root package name */
    int f64244h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6710c(C6709b c6709b, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f64243g = c6709b;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f64242f = obj;
        this.f64244h |= LinearLayoutManager.INVALID_OFFSET;
        return C6709b.f(this.f64243g, null, this);
    }
}

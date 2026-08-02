package nc0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.crossApp.dto.ModalCrossAppResponseDTO;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.crossApp.CrossAppAuthenticator", f = "CrossAppAuthenticator.kt", l = {255, 256}, m = "updateModalCrossAppData")
/* renamed from: nc0.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C8498i extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C8495f f76803d;

    /* renamed from: e, reason: collision with root package name */
    ModalCrossAppResponseDTO f76804e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f76805f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C8495f f76806g;

    /* renamed from: h, reason: collision with root package name */
    int f76807h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8498i(C8495f c8495f, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f76806g = c8495f;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object z11;
        this.f76805f = obj;
        this.f76807h |= LinearLayoutManager.INVALID_OFFSET;
        z11 = this.f76806g.z(null, this);
        return z11;
    }
}

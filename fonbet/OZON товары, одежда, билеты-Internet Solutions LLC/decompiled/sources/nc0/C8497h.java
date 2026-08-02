package nc0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.crossApp.CrossAppAuthenticator", f = "CrossAppAuthenticator.kt", l = {174, 199, 217}, m = "tryProcessModalCrossAppFlow")
/* renamed from: nc0.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C8497h extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C8495f f76798d;

    /* renamed from: e, reason: collision with root package name */
    Object f76799e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f76800f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C8495f f76801g;

    /* renamed from: h, reason: collision with root package name */
    int f76802h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8497h(C8495f c8495f, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f76801g = c8495f;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f76800f = obj;
        this.f76802h |= LinearLayoutManager.INVALID_OFFSET;
        return C8495f.k(this.f76801g, null, this);
    }
}

package hj0;

import W2.f;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.debug.menu.shared.configuration.domain.repository.impl.ConfigurationRepositoryImpl", f = "ConfigurationRepositoryImpl.kt", l = {UserVerificationMethods.USER_VERIFY_PATTERN, 95}, m = "updateConfiguration")
/* renamed from: hj0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6965e<T> extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Object f65614d;

    /* renamed from: e, reason: collision with root package name */
    f.a f65615e;

    /* renamed from: f, reason: collision with root package name */
    Object f65616f;

    /* renamed from: g, reason: collision with root package name */
    Je.d f65617g;

    /* renamed from: h, reason: collision with root package name */
    /* synthetic */ Object f65618h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ C6961a f65619i;

    /* renamed from: j, reason: collision with root package name */
    int f65620j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6965e(C6961a c6961a, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f65619i = c6961a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object l11;
        this.f65618h = obj;
        this.f65620j |= LinearLayoutManager.INVALID_OFFSET;
        l11 = this.f65619i.l(null, null, this);
        return l11;
    }
}

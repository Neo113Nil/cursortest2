package hc0;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@e(c = "ru.ozon.id.nativeauth.biometry.data.AuthBiometryRepository", f = "AuthBiometryRepository.kt", l = {42, 49}, m = "setBiometryAuthEnabled")
/* renamed from: hc0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6913d extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C6910a f65297d;

    /* renamed from: e, reason: collision with root package name */
    String f65298e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f65299f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C6910a f65300g;

    /* renamed from: h, reason: collision with root package name */
    int f65301h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6913d(C6910a c6910a, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f65300g = c6910a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f65299f = obj;
        this.f65301h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f65300g.i(null, this);
    }
}

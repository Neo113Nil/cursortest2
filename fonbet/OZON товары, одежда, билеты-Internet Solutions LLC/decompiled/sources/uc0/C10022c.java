package uc0;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.crossApp.migration.domain.MigrateSharedStoreUseCase", f = "MigrateSharedStoreUseCase.kt", l = {UserVerificationMethods.USER_VERIFY_EYEPRINT}, m = "isAuthorizedWithoutMigration")
/* renamed from: uc0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C10022c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C10020a f100628d;

    /* renamed from: e, reason: collision with root package name */
    boolean f100629e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f100630f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C10020a f100631g;

    /* renamed from: h, reason: collision with root package name */
    int f100632h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10022c(C10020a c10020a, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f100631g = c10020a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object f7;
        this.f100630f = obj;
        this.f100632h |= LinearLayoutManager.INVALID_OFFSET;
        f7 = this.f100631g.f(this);
        return f7;
    }
}

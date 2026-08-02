package uc0;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.crossApp.migration.domain.MigrateSharedStoreUseCase", f = "MigrateSharedStoreUseCase.kt", l = {48, 49, 58}, m = "execute")
/* renamed from: uc0.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C10021b extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C10020a f100623d;

    /* renamed from: e, reason: collision with root package name */
    ArrayList f100624e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f100625f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C10020a f100626g;

    /* renamed from: h, reason: collision with root package name */
    int f100627h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10021b(C10020a c10020a, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f100626g = c10020a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f100625f = obj;
        this.f100627h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f100626g.e(this);
    }
}

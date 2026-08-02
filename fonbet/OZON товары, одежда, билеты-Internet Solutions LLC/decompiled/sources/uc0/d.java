package uc0;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.log.Logger;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.crossApp.migration.domain.MigrateSharedStoreUseCase", f = "MigrateSharedStoreUseCase.kt", l = {Logger.NONE}, m = "migrateCrossApp")
/* loaded from: classes3.dex */
final class d extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C10020a f100633d;

    /* renamed from: e, reason: collision with root package name */
    ArrayList f100634e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f100635f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C10020a f100636g;

    /* renamed from: h, reason: collision with root package name */
    int f100637h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(C10020a c10020a, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f100636g = c10020a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object g10;
        this.f100635f = obj;
        this.f100637h |= LinearLayoutManager.INVALID_OFFSET;
        g10 = this.f100636g.g(null, this);
        return g10;
    }
}

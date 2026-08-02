package vc0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.data.OzonIdPageEntryFeatureFlagRepository", f = "OzonIdPageEntryFeatureFlagRepository.kt", l = {38}, m = "getFlags")
/* loaded from: classes3.dex */
final class f extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    e f102839d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f102840e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ e f102841f;

    /* renamed from: g, reason: collision with root package name */
    int f102842g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(e eVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f102841f = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f102840e = obj;
        this.f102842g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f102841f.d(this);
    }
}

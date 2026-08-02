package vc0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.data.AppInfoRepository", f = "AppInfoRepository.kt", l = {21, 23}, m = "getUniqueApplicationId$ozon_id_sdk_release")
/* renamed from: vc0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C10303a extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Object f102821d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f102822e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ c f102823f;

    /* renamed from: g, reason: collision with root package name */
    int f102824g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10303a(c cVar, kotlin.coroutines.jvm.internal.c cVar2) {
        super(cVar2);
        this.f102823f = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f102822e = obj;
        this.f102824g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f102823f.b(this);
    }
}

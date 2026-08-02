package ru.ozon.id.ad;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.ad.AdManager;

@e(c = "ru.ozon.id.ad.AdManager$Companion", f = "AdManager.kt", l = {48}, m = "initLib")
/* loaded from: classes7.dex */
final class a extends c {

    /* renamed from: d, reason: collision with root package name */
    Object f97143d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f97144e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AdManager.b f97145f;

    /* renamed from: g, reason: collision with root package name */
    int f97146g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(AdManager.b bVar, c cVar) {
        super(cVar);
        this.f97145f = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f97144e = obj;
        this.f97146g |= LinearLayoutManager.INVALID_OFFSET;
        return AdManager.b.a(this.f97145f, this);
    }
}

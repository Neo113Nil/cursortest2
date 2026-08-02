package ru.ozon.android.messenger.blocks.input.viewmodel;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.input.viewmodel.DraftLoader", f = "DraftLoader.kt", l = {11}, m = "loadDraftForChat")
/* loaded from: classes10.dex */
final class d extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    String f85600d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f85601e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ e f85602f;

    /* renamed from: g, reason: collision with root package name */
    int f85603g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(e eVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f85602f = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f85601e = obj;
        this.f85603g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f85602f.a(null, this);
    }
}

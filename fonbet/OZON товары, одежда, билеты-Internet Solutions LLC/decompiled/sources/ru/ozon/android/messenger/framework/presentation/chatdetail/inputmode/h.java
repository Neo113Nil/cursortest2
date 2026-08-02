package ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.InputModeStoreImpl", f = "InputModeStoreImpl.kt", l = {85, 86}, m = "exitToDefault")
/* loaded from: classes10.dex */
final class h extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    k f89854d;

    /* renamed from: e, reason: collision with root package name */
    boolean f89855e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f89856f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ k f89857g;

    /* renamed from: h, reason: collision with root package name */
    int f89858h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(k kVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f89857g = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f89856f = obj;
        this.f89858h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f89857g.b(false, false, this);
    }
}

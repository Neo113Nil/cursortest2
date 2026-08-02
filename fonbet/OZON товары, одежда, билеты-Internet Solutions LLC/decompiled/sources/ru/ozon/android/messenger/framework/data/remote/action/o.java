package ru.ozon.android.messenger.framework.data.remote.action;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.action.ActionDataSource", f = "ActionDataSource.kt", l = {96}, m = "sendComposerAction$messenger_release")
/* loaded from: classes10.dex */
final class o extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    y f87729d;

    /* renamed from: e, reason: collision with root package name */
    String f87730e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f87731f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ y f87732g;

    /* renamed from: h, reason: collision with root package name */
    int f87733h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(y yVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f87732g = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f87731f = obj;
        this.f87733h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f87732g.r(null, this);
    }
}

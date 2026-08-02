package ru.ozon.android.messenger.framework.domain;

import Sc.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.domain.AlertManagerImpl", f = "AlertManager.kt", l = {32}, m = "removeAlertsAndCleanup-gIAlu-s")
/* loaded from: classes10.dex */
final class c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    String f88785d;

    /* renamed from: e, reason: collision with root package name */
    e f88786e;

    /* renamed from: f, reason: collision with root package name */
    Iterator f88787f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f88788g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ e f88789h;

    /* renamed from: i, reason: collision with root package name */
    int f88790i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(e eVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f88789h = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f88788g = obj;
        this.f88790i |= LinearLayoutManager.INVALID_OFFSET;
        Object a11 = this.f88789h.a(null, this);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : r.a(a11);
    }
}

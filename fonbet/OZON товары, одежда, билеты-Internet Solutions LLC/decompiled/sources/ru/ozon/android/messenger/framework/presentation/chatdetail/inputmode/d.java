package ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.InputModeStoreImpl", f = "InputModeStoreImpl.kt", l = {153, 161, 162}, m = "clearAntifraudAlertAndState")
/* loaded from: classes10.dex */
final class d extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    k f89831d;

    /* renamed from: e, reason: collision with root package name */
    String f89832e;

    /* renamed from: f, reason: collision with root package name */
    String f89833f;

    /* renamed from: g, reason: collision with root package name */
    Iterator f89834g;

    /* renamed from: h, reason: collision with root package name */
    int f89835h;

    /* renamed from: i, reason: collision with root package name */
    /* synthetic */ Object f89836i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ k f89837j;

    /* renamed from: k, reason: collision with root package name */
    int f89838k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(k kVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f89837j = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object h11;
        this.f89836i = obj;
        this.f89838k |= LinearLayoutManager.INVALID_OFFSET;
        h11 = this.f89837j.h(this);
        return h11;
    }
}

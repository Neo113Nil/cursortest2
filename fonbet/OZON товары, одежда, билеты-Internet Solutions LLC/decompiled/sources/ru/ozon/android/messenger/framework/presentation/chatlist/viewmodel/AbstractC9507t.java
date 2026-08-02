package ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel;

import h3.C6788a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.t, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC9507t {

    /* renamed from: a, reason: collision with root package name */
    protected C6788a f90686a;

    /* renamed from: b, reason: collision with root package name */
    protected ru.ozon.android.messenger.framework.presentation.common.viewmodel.c<ru.ozon.android.messenger.framework.presentation.chatlist.f> f90687b;

    @NotNull
    protected final ru.ozon.android.messenger.framework.presentation.common.viewmodel.c<ru.ozon.android.messenger.framework.presentation.chatlist.f> a() {
        ru.ozon.android.messenger.framework.presentation.common.viewmodel.c<ru.ozon.android.messenger.framework.presentation.chatlist.f> cVar = this.f90687b;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.n("reducer");
        throw null;
    }

    @NotNull
    protected final ru.ozon.android.messenger.framework.presentation.chatlist.f b() {
        return a().getState().getValue();
    }
}

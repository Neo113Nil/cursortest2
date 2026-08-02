package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates;

import Ae.C0;
import h3.C6788a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.M;
import ze.C11115c;

/* loaded from: classes10.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    protected C6788a f90160a;

    /* renamed from: b, reason: collision with root package name */
    protected C11115c f90161b;

    public void a() {
    }

    @NotNull
    protected final ze.h<ru.ozon.android.messenger.framework.presentation.chatdetail.j> b() {
        C11115c c11115c = this.f90161b;
        if (c11115c != null) {
            return c11115c;
        }
        Intrinsics.n("uiEvents");
        throw null;
    }

    @NotNull
    protected final M d() {
        C6788a c6788a = this.f90160a;
        if (c6788a != null) {
            return c6788a;
        }
        Intrinsics.n("viewModelScope");
        throw null;
    }

    public final void e(@NotNull C6788a scope, @NotNull C11115c uiEvents, @NotNull C0 viewModelDataEvents) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(uiEvents, "uiEvents");
        Intrinsics.checkNotNullParameter(viewModelDataEvents, "viewModelDataEvents");
        Intrinsics.checkNotNullParameter(scope, "<set-?>");
        this.f90160a = scope;
        Intrinsics.checkNotNullParameter(uiEvents, "<set-?>");
        this.f90161b = uiEvents;
        Intrinsics.checkNotNullParameter(viewModelDataEvents, "<set-?>");
        a();
    }
}

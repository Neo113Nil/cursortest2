package ru.ozon.android.messenger.framework.presentation.common.viewmodel;

import Ae.O0;
import Ae.x0;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b!\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/android/messenger/framework/presentation/common/viewmodel/a;", "State", "Landroidx/lifecycle/w0;", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class a<State> extends w0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final x0<State> f91308a;

    public a() {
        this(null);
    }

    @NotNull
    protected final x0<State> d0() {
        return this.f91308a;
    }

    @NotNull
    /* renamed from: e0, reason: from getter */
    public final x0 getF91308a() {
        return this.f91308a;
    }

    public a(Object obj) {
        x0<State> mutableState = O0.a(null);
        Intrinsics.checkNotNullParameter(mutableState, "mutableState");
        this.f91308a = mutableState;
    }
}

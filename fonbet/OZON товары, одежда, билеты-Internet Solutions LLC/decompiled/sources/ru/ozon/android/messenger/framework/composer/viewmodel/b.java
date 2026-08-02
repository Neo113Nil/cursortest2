package ru.ozon.android.messenger.framework.composer.viewmodel;

import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.C7854a;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/android/messenger/framework/composer/viewmodel/b;", "Landroidx/lifecycle/w0;", "<init>", "()V", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b extends w0 {

    /* renamed from: a, reason: collision with root package name */
    private QZ.a<? extends C7854a> f86821a;

    public final QZ.a<? extends C7854a> d0() {
        return this.f86821a;
    }

    public final void e0(@NotNull QZ.a<? extends C7854a> composer) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        this.f86821a = composer;
    }

    @Override // androidx.lifecycle.w0
    protected final void onCleared() {
        super.onCleared();
        this.f86821a = null;
    }
}

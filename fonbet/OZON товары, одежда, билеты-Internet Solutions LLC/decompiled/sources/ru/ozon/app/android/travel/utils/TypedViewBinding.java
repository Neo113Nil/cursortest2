package ru.ozon.app.android.travel.utils;

import X4.a;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/utils/TypedViewBinding;", "Landroid/view/View;", "T", "LX4/a;", "Lkotlin/Function0;", "rootViewInitializer", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "getRoot", "()Landroid/view/View;", "rootView", "Landroid/view/View;", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TypedViewBinding<T extends View> implements a {

    @NotNull
    private final T rootView;

    public TypedViewBinding(@NotNull Function0<? extends T> rootViewInitializer) {
        Intrinsics.checkNotNullParameter(rootViewInitializer, "rootViewInitializer");
        this.rootView = rootViewInitializer.invoke();
    }

    @Override // X4.a
    @NotNull
    public T getRoot() {
        return this.rootView;
    }
}

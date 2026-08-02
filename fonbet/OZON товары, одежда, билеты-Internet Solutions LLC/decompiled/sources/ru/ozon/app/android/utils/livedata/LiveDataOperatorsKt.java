package ru.ozon.app.android.utils.livedata;

import Sc.InterfaceC3999a;
import androidx.lifecycle.P;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.t0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a%\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a?\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\u000b\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a#\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\r\u0010\u0003¨\u0006\u000e"}, d2 = {"T", "Landroidx/lifecycle/P;", "first", "(Landroidx/lifecycle/P;)Landroidx/lifecycle/P;", "R", "Lkotlin/Function1;", "mapper", "map", "(Landroidx/lifecycle/P;Lkotlin/jvm/functions/Function1;)Landroidx/lifecycle/P;", "", "observer", "observeOnce", "(Landroidx/lifecycle/P;Lkotlin/jvm/functions/Function1;)V", "distinct", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LiveDataOperatorsKt {
    @NotNull
    public static final <T> P<T> distinct(@NotNull P<T> p11) {
        Intrinsics.checkNotNullParameter(p11, "<this>");
        T t2 = new T();
        t2.a(p11, new LiveDataOperatorsKt$sam$androidx_lifecycle_Observer$0(new LiveDataOperatorsKt$distinct$1(t2)));
        return t2;
    }

    @NotNull
    public static final <T> P<T> first(@NotNull P<T> p11) {
        Intrinsics.checkNotNullParameter(p11, "<this>");
        T t2 = new T();
        t2.a(p11, new LiveDataOperatorsKt$sam$androidx_lifecycle_Observer$0(new LiveDataOperatorsKt$first$1(t2, p11)));
        return t2;
    }

    @InterfaceC3999a
    @NotNull
    public static final <T, R> P<R> map(@NotNull P<T> p11, @NotNull Function1<? super T, ? extends R> mapper) {
        Intrinsics.checkNotNullParameter(p11, "<this>");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return t0.b(p11, mapper);
    }

    public static final <T> void observeOnce(@NotNull final P<T> p11, @NotNull final Function1<? super T, Unit> observer) {
        Intrinsics.checkNotNullParameter(p11, "<this>");
        Intrinsics.checkNotNullParameter(observer, "observer");
        p11.observeForever(new W<T>() { // from class: ru.ozon.app.android.utils.livedata.LiveDataOperatorsKt$observeOnce$1
            @Override // androidx.lifecycle.W
            public void onChanged(T value) {
                observer.invoke(value);
                p11.removeObserver(this);
            }
        });
    }
}

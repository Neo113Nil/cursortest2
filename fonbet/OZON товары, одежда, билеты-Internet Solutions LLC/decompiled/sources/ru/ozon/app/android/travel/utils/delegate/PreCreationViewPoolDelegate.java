package ru.ozon.app.android.travel.utils.delegate;

import android.content.Context;
import android.view.View;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.d;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003B?\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u0012\u001a\u00028\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "Landroid/view/View;", "T", "", "Landroid/content/Context;", "context", "Lkotlin/reflect/d;", "viewClass", "Lkotlin/Function0;", "factory", "Lkotlin/Function1;", "", "initBlock", "<init>", "(Landroid/content/Context;Lkotlin/reflect/d;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "thisRef", "Lkotlin/reflect/m;", "property", "getValue", "(Ljava/lang/Object;Lkotlin/reflect/m;)Landroid/view/View;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Landroid/view/View;", "()Landroid/view/View;", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PreCreationViewPoolDelegate<T extends View> {
    public static final int $stable = 0;

    @NotNull
    private final T value;

    public PreCreationViewPoolDelegate(@NotNull Context context, @NotNull d<T> viewClass, @NotNull Function0<? extends T> factory, @NotNull Function1<? super T, Unit> initBlock) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewClass, "viewClass");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(initBlock, "initBlock");
        T i11 = q.f64554a.i(viewClass, context);
        i11 = i11 == null ? factory.invoke() : i11;
        initBlock.invoke(i11);
        this.value = i11;
    }

    @NotNull
    public final T getValue() {
        return this.value;
    }

    @NotNull
    public final T getValue(Object thisRef, @NotNull m<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        return this.value;
    }
}

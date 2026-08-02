package ru.ozon.app.android.courieronmap.presentation.provider;

import android.animation.TypeEvaluator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import we0.m;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/courieronmap/presentation/provider/MapPointEvaluator;", "Landroid/animation/TypeEvaluator;", "Lwe0/m;", "<init>", "()V", "", "fraction", "startValue", "endValue", "evaluate", "(FLwe0/m;Lwe0/m;)Lwe0/m;", "courieronmap_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MapPointEvaluator implements TypeEvaluator<m> {
    @Override // android.animation.TypeEvaluator
    @NotNull
    public m evaluate(float fraction, @NotNull m startValue, @NotNull m endValue) {
        Intrinsics.checkNotNullParameter(startValue, "startValue");
        Intrinsics.checkNotNullParameter(endValue, "endValue");
        double d11 = fraction;
        return new m(((endValue.getLatitude() - startValue.getLatitude()) * d11) + startValue.getLatitude(), ((endValue.getLongitude() - startValue.getLongitude()) * d11) + startValue.getLongitude());
    }
}

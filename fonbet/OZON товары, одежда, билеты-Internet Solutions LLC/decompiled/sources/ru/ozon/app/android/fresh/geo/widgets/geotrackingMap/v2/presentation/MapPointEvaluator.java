package ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation;

import android.animation.TypeEvaluator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import we0.m;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\b\u0000\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006JK\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/MapPointEvaluator;", "Landroid/animation/TypeEvaluator;", "Lkotlin/Pair;", "Lwe0/m;", "", "<init>", "()V", "fraction", "startValue", "endValue", "evaluate", "(FLkotlin/Pair;Lkotlin/Pair;)Lkotlin/Pair;", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MapPointEvaluator implements TypeEvaluator<Pair<? extends m, ? extends Float>> {
    @Override // android.animation.TypeEvaluator
    public /* bridge */ /* synthetic */ Pair<? extends m, ? extends Float> evaluate(float f7, Pair<? extends m, ? extends Float> pair, Pair<? extends m, ? extends Float> pair2) {
        return evaluate2(f7, (Pair<m, Float>) pair, (Pair<m, Float>) pair2);
    }

    @NotNull
    /* renamed from: evaluate, reason: avoid collision after fix types in other method */
    public Pair<m, Float> evaluate2(float fraction, @NotNull Pair<m, Float> startValue, @NotNull Pair<m, Float> endValue) {
        Intrinsics.checkNotNullParameter(startValue, "startValue");
        Intrinsics.checkNotNullParameter(endValue, "endValue");
        double d11 = fraction;
        return new Pair<>(new m(((endValue.e().getLatitude() - startValue.e().getLatitude()) * d11) + startValue.e().getLatitude(), ((endValue.e().getLongitude() - startValue.e().getLongitude()) * d11) + startValue.e().getLongitude()), Float.valueOf(((endValue.f().floatValue() - startValue.f().floatValue()) * fraction) + startValue.f().floatValue()));
    }
}

package ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.data;

import android.content.SharedPreferences;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ \u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/data/BonusExpirationRemainderRepositoryImpl;", "Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/data/BonusExpirationRemainderRepository;", "Landroid/content/SharedPreferences;", "sharedPreferences", "<init>", "(Landroid/content/SharedPreferences;)V", "", "key", "", "getTimestamp", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "putTimestamp", "(Ljava/lang/String;JLkotlin/coroutines/d;)Ljava/lang/Object;", "Landroid/content/SharedPreferences;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BonusExpirationRemainderRepositoryImpl implements BonusExpirationRemainderRepository {

    @NotNull
    private final SharedPreferences sharedPreferences;

    public BonusExpirationRemainderRepositoryImpl(@NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.sharedPreferences = sharedPreferences;
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.data.BonusExpirationRemainderRepository
    public Object getTimestamp(@NotNull String str, @NotNull d<? super Long> dVar) {
        return new Long(this.sharedPreferences.getLong(str, -1L));
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.data.BonusExpirationRemainderRepository
    public Object putTimestamp(@NotNull String str, long j11, @NotNull d<? super Unit> dVar) {
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putLong(str, j11);
        edit.apply();
        return Unit.f71690a;
    }
}

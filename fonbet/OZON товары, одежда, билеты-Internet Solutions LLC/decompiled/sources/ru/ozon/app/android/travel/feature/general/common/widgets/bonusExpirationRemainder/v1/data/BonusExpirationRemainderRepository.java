package ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.data;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H¦@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/data/BonusExpirationRemainderRepository;", "", "", "key", "", "getTimestamp", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "putTimestamp", "(Ljava/lang/String;JLkotlin/coroutines/d;)Ljava/lang/Object;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface BonusExpirationRemainderRepository {
    Object getTimestamp(@NotNull String str, @NotNull d<? super Long> dVar);

    Object putTimestamp(@NotNull String str, long j11, @NotNull d<? super Unit> dVar);
}

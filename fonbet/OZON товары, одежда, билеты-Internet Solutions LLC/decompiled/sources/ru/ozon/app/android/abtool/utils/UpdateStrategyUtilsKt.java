package ru.ozon.app.android.abtool.utils;

import Sc.o;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.data.model.UpdateStrategy;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0001H\u0000¨\u0006\u0006"}, d2 = {"getUpdateStrategy", "Lru/ozon/app/android/abtool/data/model/UpdateStrategy;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toFeatureUpdateStrategy", "Lru/ozon/app/android/abtool/domain/UpdateStrategy;", "abzone_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UpdateStrategyUtilsKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UpdateStrategy.values().length];
            try {
                iArr[UpdateStrategy.PER_PROCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UpdateStrategy.AS_FETCHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UpdateStrategy.DELETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UpdateStrategy.EXCEPTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final UpdateStrategy getUpdateStrategy(int i11) {
        Object obj;
        Iterator<E> it = UpdateStrategy.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((UpdateStrategy) obj).getValue() == i11) {
                break;
            }
        }
        UpdateStrategy updateStrategy = (UpdateStrategy) obj;
        return updateStrategy == null ? UpdateStrategy.EXCEPTION : updateStrategy;
    }

    @NotNull
    public static final ru.ozon.app.android.abtool.domain.UpdateStrategy toFeatureUpdateStrategy(@NotNull UpdateStrategy updateStrategy) {
        Intrinsics.checkNotNullParameter(updateStrategy, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$0[updateStrategy.ordinal()];
        if (i11 == 1) {
            return ru.ozon.app.android.abtool.domain.UpdateStrategy.PER_PROCESS;
        }
        if (i11 == 2) {
            return ru.ozon.app.android.abtool.domain.UpdateStrategy.AS_FETCHED;
        }
        if (i11 == 3) {
            return ru.ozon.app.android.abtool.domain.UpdateStrategy.DELETE;
        }
        if (i11 == 4) {
            return ru.ozon.app.android.abtool.domain.UpdateStrategy.EXCEPTION;
        }
        throw new o();
    }
}

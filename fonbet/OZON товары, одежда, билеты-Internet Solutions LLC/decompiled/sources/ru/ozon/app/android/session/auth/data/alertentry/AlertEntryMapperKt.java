package ru.ozon.app.android.session.auth.data.alertentry;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.auth.data.biometry.BiometryEntry;
import ru.ozon.app.android.session.auth.data.biometry.BiometryEntryMapperKt;
import ru.ozon.app.android.session.auth.data.biometry.BiometryEntryVO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toVO", "Lru/ozon/app/android/session/auth/data/alertentry/AlertEntryVO;", "Lru/ozon/app/android/session/auth/data/alertentry/AlertEntry;", "session_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AlertEntryMapperKt {
    @NotNull
    public static final AlertEntryVO toVO(@NotNull AlertEntry alertEntry) {
        Intrinsics.checkNotNullParameter(alertEntry, "<this>");
        BiometryEntry biometry = alertEntry.getBiometry();
        BiometryEntryVO biometryEntryVO = null;
        if (biometry != null) {
            if (!Intrinsics.d(alertEntry.getType(), "biometry")) {
                biometry = null;
            }
            if (biometry != null) {
                biometryEntryVO = BiometryEntryMapperKt.toVO(biometry);
            }
        }
        return new AlertEntryVO(biometryEntryVO);
    }
}

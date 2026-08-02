package ru.ozon.app.android.session.auth.data.alertentry;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.auth.data.Action;
import ru.ozon.app.android.session.auth.data.biometry.BiometryEntryVO;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u0004H\u0002¨\u0006\u0005"}, d2 = {"getActionByAlertEntry", "Lru/ozon/app/android/session/auth/data/Action;", "Lru/ozon/app/android/session/auth/data/alertentry/AlertEntryVO;", "extract", "Lru/ozon/app/android/session/auth/data/biometry/BiometryEntryVO;", "session_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AlertEntryInteractorKt {
    private static final Action extract(BiometryEntryVO biometryEntryVO) {
        if (h.K(biometryEntryVO.getAction()) || h.K(biometryEntryVO.getChallenge())) {
            return null;
        }
        return new Action.AuthDialog(biometryEntryVO.getAction(), biometryEntryVO.getChallenge());
    }

    public static final Action getActionByAlertEntry(@NotNull AlertEntryVO alertEntryVO) {
        Intrinsics.checkNotNullParameter(alertEntryVO, "<this>");
        BiometryEntryVO biometry = alertEntryVO.getBiometry();
        if (biometry != null) {
            return extract(biometry);
        }
        return null;
    }
}

package ru.ozon.app.android.session.auth.data.biometry;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toVO", "Lru/ozon/app/android/session/auth/data/biometry/BiometryEntryVO;", "Lru/ozon/app/android/session/auth/data/biometry/BiometryEntry;", "session_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BiometryEntryMapperKt {
    @NotNull
    public static final BiometryEntryVO toVO(@NotNull BiometryEntry biometryEntry) {
        Intrinsics.checkNotNullParameter(biometryEntry, "<this>");
        return new BiometryEntryVO(biometryEntry.getAction(), biometryEntry.getChallenge(), biometryEntry.getButtonTitle());
    }
}

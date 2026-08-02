package ru.ozon.app.android.session.auth.data.alertentry;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.auth.data.biometry.BiometryEntryVO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/session/auth/data/alertentry/AlertEntryVO;", "", "Lru/ozon/app/android/session/auth/data/biometry/BiometryEntryVO;", "biometry", "<init>", "(Lru/ozon/app/android/session/auth/data/biometry/BiometryEntryVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/session/auth/data/biometry/BiometryEntryVO;", "getBiometry", "()Lru/ozon/app/android/session/auth/data/biometry/BiometryEntryVO;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AlertEntryVO {
    private final BiometryEntryVO biometry;

    public AlertEntryVO(BiometryEntryVO biometryEntryVO) {
        this.biometry = biometryEntryVO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AlertEntryVO) && Intrinsics.d(this.biometry, ((AlertEntryVO) other).biometry);
    }

    public final BiometryEntryVO getBiometry() {
        return this.biometry;
    }

    public int hashCode() {
        BiometryEntryVO biometryEntryVO = this.biometry;
        if (biometryEntryVO == null) {
            return 0;
        }
        return biometryEntryVO.hashCode();
    }

    @NotNull
    public String toString() {
        return "AlertEntryVO(biometry=" + this.biometry + ")";
    }
}

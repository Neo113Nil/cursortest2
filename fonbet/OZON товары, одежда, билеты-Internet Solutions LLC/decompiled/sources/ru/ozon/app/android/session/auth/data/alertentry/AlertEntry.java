package ru.ozon.app.android.session.auth.data.alertentry;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.auth.data.biometry.BiometryEntry;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/session/auth/data/alertentry/AlertEntry;", "", "type", "", "biometry", "Lru/ozon/app/android/session/auth/data/biometry/BiometryEntry;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/session/auth/data/biometry/BiometryEntry;)V", "getType", "()Ljava/lang/String;", "getBiometry", "()Lru/ozon/app/android/session/auth/data/biometry/BiometryEntry;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AlertEntry {
    public static final int $stable = 0;
    private final BiometryEntry biometry;
    private final String type;

    public AlertEntry(String str, BiometryEntry biometryEntry) {
        this.type = str;
        this.biometry = biometryEntry;
    }

    public static /* synthetic */ AlertEntry copy$default(AlertEntry alertEntry, String str, BiometryEntry biometryEntry, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = alertEntry.type;
        }
        if ((i11 & 2) != 0) {
            biometryEntry = alertEntry.biometry;
        }
        return alertEntry.copy(str, biometryEntry);
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final BiometryEntry getBiometry() {
        return this.biometry;
    }

    @NotNull
    public final AlertEntry copy(String type, BiometryEntry biometry) {
        return new AlertEntry(type, biometry);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlertEntry)) {
            return false;
        }
        AlertEntry alertEntry = (AlertEntry) other;
        return Intrinsics.d(this.type, alertEntry.type) && Intrinsics.d(this.biometry, alertEntry.biometry);
    }

    public final BiometryEntry getBiometry() {
        return this.biometry;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        BiometryEntry biometryEntry = this.biometry;
        return hashCode + (biometryEntry != null ? biometryEntry.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AlertEntry(type=" + this.type + ", biometry=" + this.biometry + ")";
    }
}

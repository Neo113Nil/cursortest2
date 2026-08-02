package ru.ozon.app.android.session.auth.data.biometry;

import C.o0;
import G.g;
import N3.C3660k;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/session/auth/data/biometry/BiometryEntry;", "", "action", "", ClientData.KEY_CHALLENGE, "buttonTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getChallenge", "getButtonTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BiometryEntry {
    public static final int $stable = 0;

    @NotNull
    private final String action;

    @NotNull
    private final String buttonTitle;

    @NotNull
    private final String challenge;

    public BiometryEntry(@NotNull String action, @NotNull String challenge, @NotNull String buttonTitle) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        this.action = action;
        this.challenge = challenge;
        this.buttonTitle = buttonTitle;
    }

    public static /* synthetic */ BiometryEntry copy$default(BiometryEntry biometryEntry, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = biometryEntry.action;
        }
        if ((i11 & 2) != 0) {
            str2 = biometryEntry.challenge;
        }
        if ((i11 & 4) != 0) {
            str3 = biometryEntry.buttonTitle;
        }
        return biometryEntry.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getChallenge() {
        return this.challenge;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @NotNull
    public final BiometryEntry copy(@NotNull String action, @NotNull String challenge, @NotNull String buttonTitle) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        return new BiometryEntry(action, challenge, buttonTitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BiometryEntry)) {
            return false;
        }
        BiometryEntry biometryEntry = (BiometryEntry) other;
        return Intrinsics.d(this.action, biometryEntry.action) && Intrinsics.d(this.challenge, biometryEntry.challenge) && Intrinsics.d(this.buttonTitle, biometryEntry.buttonTitle);
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }

    @NotNull
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @NotNull
    public final String getChallenge() {
        return this.challenge;
    }

    public int hashCode() {
        return this.buttonTitle.hashCode() + g.a(this.action.hashCode() * 31, 31, this.challenge);
    }

    @NotNull
    public String toString() {
        String str = this.action;
        String str2 = this.challenge;
        return o0.c(C3660k.d("BiometryEntry(action=", str, ", challenge=", str2, ", buttonTitle="), this.buttonTitle, ")");
    }
}

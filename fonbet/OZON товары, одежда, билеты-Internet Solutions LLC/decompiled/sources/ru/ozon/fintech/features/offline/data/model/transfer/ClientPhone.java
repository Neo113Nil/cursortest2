package ru.ozon.fintech.features.offline.data.model.transfer;

import V.e;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/fintech/features/offline/data/model/transfer/ClientPhone;", "", "plain", "", "formatted", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPlain", "()Ljava/lang/String;", "getFormatted", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "offline_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ClientPhone {

    @i(name = "formatted")
    @NotNull
    private final String formatted;

    @i(name = "plain")
    @NotNull
    private final String plain;

    public ClientPhone(@NotNull String plain, @NotNull String formatted) {
        Intrinsics.checkNotNullParameter(plain, "plain");
        Intrinsics.checkNotNullParameter(formatted, "formatted");
        this.plain = plain;
        this.formatted = formatted;
    }

    public static /* synthetic */ ClientPhone copy$default(ClientPhone clientPhone, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = clientPhone.plain;
        }
        if ((i11 & 2) != 0) {
            str2 = clientPhone.formatted;
        }
        return clientPhone.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPlain() {
        return this.plain;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getFormatted() {
        return this.formatted;
    }

    @NotNull
    public final ClientPhone copy(@NotNull String plain, @NotNull String formatted) {
        Intrinsics.checkNotNullParameter(plain, "plain");
        Intrinsics.checkNotNullParameter(formatted, "formatted");
        return new ClientPhone(plain, formatted);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClientPhone)) {
            return false;
        }
        ClientPhone clientPhone = (ClientPhone) other;
        return Intrinsics.d(this.plain, clientPhone.plain) && Intrinsics.d(this.formatted, clientPhone.formatted);
    }

    @NotNull
    public final String getFormatted() {
        return this.formatted;
    }

    @NotNull
    public final String getPlain() {
        return this.plain;
    }

    public int hashCode() {
        return this.formatted.hashCode() + (this.plain.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return e.a("ClientPhone(plain=", this.plain, ", formatted=", this.formatted, ")");
    }
}

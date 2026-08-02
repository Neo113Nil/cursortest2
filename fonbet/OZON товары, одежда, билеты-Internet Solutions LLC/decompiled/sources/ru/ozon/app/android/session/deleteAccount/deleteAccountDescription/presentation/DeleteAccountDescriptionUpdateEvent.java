package ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.presentation;

import A00.a;
import V.e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/DeleteAccountDescriptionUpdateEvent;", "LA00/a$J$a;", "", "id", AppMeasurementSdk.ConditionalUserProperty.VALUE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getValue", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DeleteAccountDescriptionUpdateEvent implements a.J.InterfaceC0007a {

    @NotNull
    private final String id;

    @NotNull
    private final String value;

    public DeleteAccountDescriptionUpdateEvent(@NotNull String id2, @NotNull String value) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(value, "value");
        this.id = id2;
        this.value = value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeleteAccountDescriptionUpdateEvent)) {
            return false;
        }
        DeleteAccountDescriptionUpdateEvent deleteAccountDescriptionUpdateEvent = (DeleteAccountDescriptionUpdateEvent) other;
        return Intrinsics.d(this.id, deleteAccountDescriptionUpdateEvent.id) && Intrinsics.d(this.value, deleteAccountDescriptionUpdateEvent.value);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.id.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return e.a("DeleteAccountDescriptionUpdateEvent(id=", this.id, ", value=", this.value, ")");
    }
}

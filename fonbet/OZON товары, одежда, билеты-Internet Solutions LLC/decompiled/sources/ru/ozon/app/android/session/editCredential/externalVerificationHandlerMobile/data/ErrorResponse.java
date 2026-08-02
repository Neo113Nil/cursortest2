package ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/data/ErrorResponse;", "Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/data/PostMessageResponse;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ErrorResponse extends PostMessageResponse {

    @NotNull
    public static final ErrorResponse INSTANCE = new ErrorResponse();

    private ErrorResponse() {
        super(null);
    }

    public boolean equals(Object other) {
        return this == other || (other instanceof ErrorResponse);
    }

    public int hashCode() {
        return -52380067;
    }

    @NotNull
    public String toString() {
        return "ErrorResponse";
    }
}

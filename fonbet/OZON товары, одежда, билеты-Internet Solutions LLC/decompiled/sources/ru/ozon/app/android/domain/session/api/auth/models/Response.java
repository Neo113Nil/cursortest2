package ru.ozon.app.android.domain.session.api.auth.models;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/domain/session/api/auth/models/Response;", "", "status", "Lru/ozon/app/android/domain/session/api/auth/models/Status;", "error", "Lru/ozon/app/android/domain/session/api/auth/models/Error;", "data", "Lru/ozon/app/android/domain/session/api/auth/models/Data;", "<init>", "(Lru/ozon/app/android/domain/session/api/auth/models/Status;Lru/ozon/app/android/domain/session/api/auth/models/Error;Lru/ozon/app/android/domain/session/api/auth/models/Data;)V", "getStatus", "()Lru/ozon/app/android/domain/session/api/auth/models/Status;", "getError", "()Lru/ozon/app/android/domain/session/api/auth/models/Error;", "getData", "()Lru/ozon/app/android/domain/session/api/auth/models/Data;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class Response {
    private final Data data;
    private final Error error;
    private final Status status;

    public Response(Status status, Error error, Data data) {
        this.status = status;
        this.error = error;
        this.data = data;
    }

    public static /* synthetic */ Response copy$default(Response response, Status status, Error error, Data data, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            status = response.status;
        }
        if ((i11 & 2) != 0) {
            error = response.error;
        }
        if ((i11 & 4) != 0) {
            data = response.data;
        }
        return response.copy(status, error, data);
    }

    /* renamed from: component1, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final Error getError() {
        return this.error;
    }

    /* renamed from: component3, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    @NotNull
    public final Response copy(Status status, Error error, Data data) {
        return new Response(status, error, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Response)) {
            return false;
        }
        Response response = (Response) other;
        return Intrinsics.d(this.status, response.status) && Intrinsics.d(this.error, response.error) && Intrinsics.d(this.data, response.data);
    }

    public final Data getData() {
        return this.data;
    }

    public final Error getError() {
        return this.error;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        Status status = this.status;
        int hashCode = (status == null ? 0 : status.hashCode()) * 31;
        Error error = this.error;
        int hashCode2 = (hashCode + (error == null ? 0 : error.hashCode())) * 31;
        Data data = this.data;
        return hashCode2 + (data != null ? data.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Response(status=" + this.status + ", error=" + this.error + ", data=" + this.data + ")";
    }
}

package ru.ozon.app.android.session.userAdultModalMobile.data.models;

import V.e;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/session/userAdultModalMobile/data/models/SetBirthdayResponse;", "", "validationMessage", "", "link", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getValidationMessage", "()Ljava/lang/String;", "getLink", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SetBirthdayResponse {
    public static final int $stable = 0;

    @NotNull
    private final String link;

    @NotNull
    private final String validationMessage;

    /* JADX WARN: Multi-variable type inference failed */
    public SetBirthdayResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SetBirthdayResponse copy$default(SetBirthdayResponse setBirthdayResponse, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = setBirthdayResponse.validationMessage;
        }
        if ((i11 & 2) != 0) {
            str2 = setBirthdayResponse.link;
        }
        return setBirthdayResponse.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getValidationMessage() {
        return this.validationMessage;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    @NotNull
    public final SetBirthdayResponse copy(@NotNull String validationMessage, @NotNull String link) {
        Intrinsics.checkNotNullParameter(validationMessage, "validationMessage");
        Intrinsics.checkNotNullParameter(link, "link");
        return new SetBirthdayResponse(validationMessage, link);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetBirthdayResponse)) {
            return false;
        }
        SetBirthdayResponse setBirthdayResponse = (SetBirthdayResponse) other;
        return Intrinsics.d(this.validationMessage, setBirthdayResponse.validationMessage) && Intrinsics.d(this.link, setBirthdayResponse.link);
    }

    @NotNull
    public final String getLink() {
        return this.link;
    }

    @NotNull
    public final String getValidationMessage() {
        return this.validationMessage;
    }

    public int hashCode() {
        return this.link.hashCode() + (this.validationMessage.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return e.a("SetBirthdayResponse(validationMessage=", this.validationMessage, ", link=", this.link, ")");
    }

    public SetBirthdayResponse(@NotNull String validationMessage, @NotNull String link) {
        Intrinsics.checkNotNullParameter(validationMessage, "validationMessage");
        Intrinsics.checkNotNullParameter(link, "link");
        this.validationMessage = validationMessage;
        this.link = link;
    }

    public /* synthetic */ SetBirthdayResponse(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2);
    }
}

package ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/data/PostMessageDTO;", "", "token", "", "isExpired", "", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "getToken", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/data/PostMessageDTO;", "equals", "other", "hashCode", "", "toString", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PostMessageDTO {
    public static final int $stable = 0;
    private final Boolean isExpired;
    private final String token;

    public PostMessageDTO(String str, Boolean bool) {
        this.token = str;
        this.isExpired = bool;
    }

    public static /* synthetic */ PostMessageDTO copy$default(PostMessageDTO postMessageDTO, String str, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = postMessageDTO.token;
        }
        if ((i11 & 2) != 0) {
            bool = postMessageDTO.isExpired;
        }
        return postMessageDTO.copy(str, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getIsExpired() {
        return this.isExpired;
    }

    @NotNull
    public final PostMessageDTO copy(String token, Boolean isExpired) {
        return new PostMessageDTO(token, isExpired);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostMessageDTO)) {
            return false;
        }
        PostMessageDTO postMessageDTO = (PostMessageDTO) other;
        return Intrinsics.d(this.token, postMessageDTO.token) && Intrinsics.d(this.isExpired, postMessageDTO.isExpired);
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        String str = this.token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isExpired;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isExpired() {
        return this.isExpired;
    }

    @NotNull
    public String toString() {
        return "PostMessageDTO(token=" + this.token + ", isExpired=" + this.isExpired + ")";
    }
}

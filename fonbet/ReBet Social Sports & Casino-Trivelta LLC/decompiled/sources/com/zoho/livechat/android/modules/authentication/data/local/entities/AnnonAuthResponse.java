package com.zoho.livechat.android.modules.authentication.data.local.entities;

import Gb.c;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/zoho/livechat/android/modules/authentication/data/local/entities/AnnonAuthResponse;", "", "token", "", "visitorWmsId", "(Ljava/lang/String;Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "getVisitorWmsId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AnnonAuthResponse {

    @c("token")
    @Nullable
    private final String token;

    @c("vwmsid")
    @Nullable
    private final String visitorWmsId;

    public AnnonAuthResponse(@Nullable String str, @Nullable String str2) {
        this.token = str;
        this.visitorWmsId = str2;
    }

    public static /* synthetic */ AnnonAuthResponse copy$default(AnnonAuthResponse annonAuthResponse, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = annonAuthResponse.token;
        }
        if ((i10 & 2) != 0) {
            str2 = annonAuthResponse.visitorWmsId;
        }
        return annonAuthResponse.copy(str, str2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getVisitorWmsId() {
        return this.visitorWmsId;
    }

    @NotNull
    public final AnnonAuthResponse copy(@Nullable String token, @Nullable String visitorWmsId) {
        return new AnnonAuthResponse(token, visitorWmsId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnnonAuthResponse)) {
            return false;
        }
        AnnonAuthResponse annonAuthResponse = (AnnonAuthResponse) other;
        return Intrinsics.areEqual(this.token, annonAuthResponse.token) && Intrinsics.areEqual(this.visitorWmsId, annonAuthResponse.visitorWmsId);
    }

    @Nullable
    public final String getToken() {
        return this.token;
    }

    @Nullable
    public final String getVisitorWmsId() {
        return this.visitorWmsId;
    }

    public int hashCode() {
        String str = this.token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.visitorWmsId;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AnnonAuthResponse(token=" + this.token + ", visitorWmsId=" + this.visitorWmsId + ')';
    }
}

package com.blaze.blazesdk.interactions.models.dto;

import androidx.annotation.Keep;
import defpackage.b6h;
import defpackage.lnb;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/blaze/blazesdk/interactions/models/dto/InteractionAnswerResponse;", "", "userResponse", "", "newInitData", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getUserResponse", "()Ljava/lang/String;", "getNewInitData", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class InteractionAnswerResponse {
    public static final int $stable = 0;

    @b6h("newInitData")
    @Nullable
    private final String newInitData;

    @b6h("userResponse")
    @Nullable
    private final String userResponse;

    public InteractionAnswerResponse(@Nullable String str, @Nullable String str2) {
        this.userResponse = str;
        this.newInitData = str2;
    }

    public static /* synthetic */ InteractionAnswerResponse copy$default(InteractionAnswerResponse interactionAnswerResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = interactionAnswerResponse.userResponse;
        }
        if ((i & 2) != 0) {
            str2 = interactionAnswerResponse.newInitData;
        }
        return interactionAnswerResponse.copy(str, str2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getUserResponse() {
        return this.userResponse;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getNewInitData() {
        return this.newInitData;
    }

    @NotNull
    public final InteractionAnswerResponse copy(@Nullable String userResponse, @Nullable String newInitData) {
        return new InteractionAnswerResponse(userResponse, newInitData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InteractionAnswerResponse)) {
            return false;
        }
        InteractionAnswerResponse interactionAnswerResponse = (InteractionAnswerResponse) other;
        return Intrinsics.c(this.userResponse, interactionAnswerResponse.userResponse) && Intrinsics.c(this.newInitData, interactionAnswerResponse.newInitData);
    }

    @Nullable
    public final String getNewInitData() {
        return this.newInitData;
    }

    @Nullable
    public final String getUserResponse() {
        return this.userResponse;
    }

    public int hashCode() {
        String str = this.userResponse;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.newInitData;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("InteractionAnswerResponse(userResponse=");
        sb.append(this.userResponse);
        sb.append(", newInitData=");
        return lnb.q(sb, this.newInitData, ')');
    }
}

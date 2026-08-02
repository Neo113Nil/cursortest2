package com.blaze.blazesdk.delegates.models;

import androidx.annotation.Keep;
import defpackage.lnb;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/blaze/blazesdk/delegates/models/BlazePlaybackModificationRequest;", "", "originalURL", "", "<init>", "(Ljava/lang/String;)V", "getOriginalURL", "()Ljava/lang/String;", "response", "Lcom/blaze/blazesdk/delegates/models/BlazePlaybackModificationResponse;", "modifiedURL", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BlazePlaybackModificationRequest {
    public static final int $stable = 0;

    @NotNull
    private final String originalURL;

    public BlazePlaybackModificationRequest(@NotNull String str) {
        str.getClass();
        this.originalURL = str;
    }

    public static /* synthetic */ BlazePlaybackModificationRequest copy$default(BlazePlaybackModificationRequest blazePlaybackModificationRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = blazePlaybackModificationRequest.originalURL;
        }
        return blazePlaybackModificationRequest.copy(str);
    }

    public static /* synthetic */ BlazePlaybackModificationResponse response$default(BlazePlaybackModificationRequest blazePlaybackModificationRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return blazePlaybackModificationRequest.response(str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getOriginalURL() {
        return this.originalURL;
    }

    @NotNull
    public final BlazePlaybackModificationRequest copy(@NotNull String originalURL) {
        originalURL.getClass();
        return new BlazePlaybackModificationRequest(originalURL);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BlazePlaybackModificationRequest) && Intrinsics.c(this.originalURL, ((BlazePlaybackModificationRequest) other).originalURL);
    }

    @NotNull
    public final String getOriginalURL() {
        return this.originalURL;
    }

    public int hashCode() {
        return this.originalURL.hashCode();
    }

    @Keep
    @NotNull
    public final BlazePlaybackModificationResponse response(@Nullable String modifiedURL) {
        if (modifiedURL == null) {
            modifiedURL = this.originalURL;
        }
        return new BlazePlaybackModificationResponse(modifiedURL);
    }

    @NotNull
    public String toString() {
        return lnb.q(new StringBuilder("BlazePlaybackModificationRequest(originalURL="), this.originalURL, ')');
    }
}

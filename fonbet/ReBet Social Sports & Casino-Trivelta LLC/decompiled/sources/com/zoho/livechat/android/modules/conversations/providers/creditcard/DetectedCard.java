package com.zoho.livechat.android.modules.conversations.providers.creditcard;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/zoho/livechat/android/modules/conversations/providers/creditcard/DetectedCard;", "", "cardKey", "", "cleanDigits", "originalFormat", "startIndex", "", "endIndex", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "getCardKey", "()Ljava/lang/String;", "getCleanDigits", "getEndIndex", "()I", "getOriginalFormat", "getStartIndex", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DetectedCard {

    @NotNull
    private final String cardKey;

    @NotNull
    private final String cleanDigits;
    private final int endIndex;

    @NotNull
    private final String originalFormat;
    private final int startIndex;

    public DetectedCard(@NotNull String cardKey, @NotNull String cleanDigits, @NotNull String originalFormat, int i10, int i11) {
        Intrinsics.checkNotNullParameter(cardKey, "cardKey");
        Intrinsics.checkNotNullParameter(cleanDigits, "cleanDigits");
        Intrinsics.checkNotNullParameter(originalFormat, "originalFormat");
        this.cardKey = cardKey;
        this.cleanDigits = cleanDigits;
        this.originalFormat = originalFormat;
        this.startIndex = i10;
        this.endIndex = i11;
    }

    public static /* synthetic */ DetectedCard copy$default(DetectedCard detectedCard, String str, String str2, String str3, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = detectedCard.cardKey;
        }
        if ((i12 & 2) != 0) {
            str2 = detectedCard.cleanDigits;
        }
        if ((i12 & 4) != 0) {
            str3 = detectedCard.originalFormat;
        }
        if ((i12 & 8) != 0) {
            i10 = detectedCard.startIndex;
        }
        if ((i12 & 16) != 0) {
            i11 = detectedCard.endIndex;
        }
        int i13 = i11;
        String str4 = str3;
        return detectedCard.copy(str, str2, str4, i10, i13);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getCardKey() {
        return this.cardKey;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getCleanDigits() {
        return this.cleanDigits;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getOriginalFormat() {
        return this.originalFormat;
    }

    /* renamed from: component4, reason: from getter */
    public final int getStartIndex() {
        return this.startIndex;
    }

    /* renamed from: component5, reason: from getter */
    public final int getEndIndex() {
        return this.endIndex;
    }

    @NotNull
    public final DetectedCard copy(@NotNull String cardKey, @NotNull String cleanDigits, @NotNull String originalFormat, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(cardKey, "cardKey");
        Intrinsics.checkNotNullParameter(cleanDigits, "cleanDigits");
        Intrinsics.checkNotNullParameter(originalFormat, "originalFormat");
        return new DetectedCard(cardKey, cleanDigits, originalFormat, startIndex, endIndex);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetectedCard)) {
            return false;
        }
        DetectedCard detectedCard = (DetectedCard) other;
        return Intrinsics.areEqual(this.cardKey, detectedCard.cardKey) && Intrinsics.areEqual(this.cleanDigits, detectedCard.cleanDigits) && Intrinsics.areEqual(this.originalFormat, detectedCard.originalFormat) && this.startIndex == detectedCard.startIndex && this.endIndex == detectedCard.endIndex;
    }

    @NotNull
    public final String getCardKey() {
        return this.cardKey;
    }

    @NotNull
    public final String getCleanDigits() {
        return this.cleanDigits;
    }

    public final int getEndIndex() {
        return this.endIndex;
    }

    @NotNull
    public final String getOriginalFormat() {
        return this.originalFormat;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public int hashCode() {
        return (((((((this.cardKey.hashCode() * 31) + this.cleanDigits.hashCode()) * 31) + this.originalFormat.hashCode()) * 31) + Integer.hashCode(this.startIndex)) * 31) + Integer.hashCode(this.endIndex);
    }

    @NotNull
    public String toString() {
        return "DetectedCard(cardKey=" + this.cardKey + ", cleanDigits=" + this.cleanDigits + ", originalFormat=" + this.originalFormat + ", startIndex=" + this.startIndex + ", endIndex=" + this.endIndex + ')';
    }
}

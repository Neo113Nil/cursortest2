package ru.ozon.app.android.pdp.ui.configurators.ugc.data;

import E0.C2942q;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000f\u0010\u000b\u0082\u0001\u0002\u0012\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/data/Vote;", "", "", "reviewUuid", "", "itemId", AppMeasurementSdk.ConditionalUserProperty.VALUE, "<init>", "(Ljava/lang/String;JLjava/lang/String;)V", "Ljava/lang/String;", "getReviewUuid", "()Ljava/lang/String;", "J", "getItemId", "()J", "getValue", "Like", "Dislike", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/Vote$Dislike;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/Vote$Like;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class Vote {
    public static final int $stable = 0;
    private final long itemId;

    @NotNull
    private final String reviewUuid;

    @NotNull
    private final String value;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/data/Vote$Dislike;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/Vote;", "reviewUuid", "", "itemId", "", "<init>", "(Ljava/lang/String;J)V", "getReviewUuid", "()Ljava/lang/String;", "getItemId", "()J", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Dislike extends Vote {
        public static final int $stable = 0;
        private final long itemId;

        @NotNull
        private final String reviewUuid;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dislike(@NotNull String reviewUuid, long j11) {
            super(reviewUuid, j11, "UNUSEFUL", null);
            Intrinsics.checkNotNullParameter(reviewUuid, "reviewUuid");
            this.reviewUuid = reviewUuid;
            this.itemId = j11;
        }

        public static /* synthetic */ Dislike copy$default(Dislike dislike, String str, long j11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = dislike.reviewUuid;
            }
            if ((i11 & 2) != 0) {
                j11 = dislike.itemId;
            }
            return dislike.copy(str, j11);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getReviewUuid() {
            return this.reviewUuid;
        }

        /* renamed from: component2, reason: from getter */
        public final long getItemId() {
            return this.itemId;
        }

        @NotNull
        public final Dislike copy(@NotNull String reviewUuid, long itemId) {
            Intrinsics.checkNotNullParameter(reviewUuid, "reviewUuid");
            return new Dislike(reviewUuid, itemId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Dislike)) {
                return false;
            }
            Dislike dislike = (Dislike) other;
            return Intrinsics.d(this.reviewUuid, dislike.reviewUuid) && this.itemId == dislike.itemId;
        }

        @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.data.Vote
        public long getItemId() {
            return this.itemId;
        }

        @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.data.Vote
        @NotNull
        public String getReviewUuid() {
            return this.reviewUuid;
        }

        public int hashCode() {
            return Long.hashCode(this.itemId) + (this.reviewUuid.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder d11 = C2942q.d(this.itemId, "Dislike(reviewUuid=", this.reviewUuid, ", itemId=");
            d11.append(")");
            return d11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/data/Vote$Like;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/Vote;", "reviewUuid", "", "itemId", "", "<init>", "(Ljava/lang/String;J)V", "getReviewUuid", "()Ljava/lang/String;", "getItemId", "()J", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Like extends Vote {
        public static final int $stable = 0;
        private final long itemId;

        @NotNull
        private final String reviewUuid;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Like(@NotNull String reviewUuid, long j11) {
            super(reviewUuid, j11, "USEFUL", null);
            Intrinsics.checkNotNullParameter(reviewUuid, "reviewUuid");
            this.reviewUuid = reviewUuid;
            this.itemId = j11;
        }

        public static /* synthetic */ Like copy$default(Like like, String str, long j11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = like.reviewUuid;
            }
            if ((i11 & 2) != 0) {
                j11 = like.itemId;
            }
            return like.copy(str, j11);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getReviewUuid() {
            return this.reviewUuid;
        }

        /* renamed from: component2, reason: from getter */
        public final long getItemId() {
            return this.itemId;
        }

        @NotNull
        public final Like copy(@NotNull String reviewUuid, long itemId) {
            Intrinsics.checkNotNullParameter(reviewUuid, "reviewUuid");
            return new Like(reviewUuid, itemId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Like)) {
                return false;
            }
            Like like = (Like) other;
            return Intrinsics.d(this.reviewUuid, like.reviewUuid) && this.itemId == like.itemId;
        }

        @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.data.Vote
        public long getItemId() {
            return this.itemId;
        }

        @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.data.Vote
        @NotNull
        public String getReviewUuid() {
            return this.reviewUuid;
        }

        public int hashCode() {
            return Long.hashCode(this.itemId) + (this.reviewUuid.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder d11 = C2942q.d(this.itemId, "Like(reviewUuid=", this.reviewUuid, ", itemId=");
            d11.append(")");
            return d11.toString();
        }
    }

    public /* synthetic */ Vote(String str, long j11, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j11, str2);
    }

    public long getItemId() {
        return this.itemId;
    }

    @NotNull
    public String getReviewUuid() {
        return this.reviewUuid;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    private Vote(String str, long j11, String str2) {
        this.reviewUuid = str;
        this.itemId = j11;
        this.value = str2;
    }
}

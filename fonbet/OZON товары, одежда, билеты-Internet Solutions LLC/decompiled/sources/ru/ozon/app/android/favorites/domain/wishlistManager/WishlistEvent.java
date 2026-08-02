package ru.ozon.app.android.favorites.domain.wishlistManager;

import Pk0.c;
import g.C6594f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0014\u0015\u0016\u0017B3\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0004\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEvent;", "", "", "sku", "wishlistId", "giftId", "", "uniqId", "<init>", "(Ljava/lang/Long;JLjava/lang/Long;Ljava/lang/String;)V", "Ljava/lang/Long;", "getSku", "()Ljava/lang/Long;", "J", "getWishlistId", "()J", "getGiftId", "Ljava/lang/String;", "getUniqId", "()Ljava/lang/String;", "ProductRemovalStarted", "ProductAdditionStarted", "ProductAdded", "ProductRemoved", "Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEvent$ProductAdded;", "Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEvent$ProductAdditionStarted;", "Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEvent$ProductRemovalStarted;", "Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEvent$ProductRemoved;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class WishlistEvent {
    private final Long giftId;
    private final Long sku;
    private final String uniqId;
    private final long wishlistId;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B9\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\u000e¨\u0006\""}, d2 = {"Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEvent$ProductAdded;", "Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEvent;", "", "", "sku", "wishlistId", "Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEvent$Result$ActionResult;", "result", "giftId", "", "uniqId", "<init>", "(Ljava/lang/Long;JLru/ozon/app/android/favorites/domain/wishlistManager/WishlistEvent$Result$ActionResult;Ljava/lang/Long;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getSku", "()Ljava/lang/Long;", "J", "getWishlistId", "()J", "Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEvent$Result$ActionResult;", "getResult", "()Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEvent$Result$ActionResult;", "getGiftId", "Ljava/lang/String;", "getUniqId", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductAdded extends WishlistEvent {
        private final Long giftId;

        @NotNull
        private final WishlistEvent$Result$ActionResult result;
        private final Long sku;
        private final String uniqId;
        private final long wishlistId;

        public /* synthetic */ ProductAdded(Long l11, long j11, WishlistEvent$Result$ActionResult wishlistEvent$Result$ActionResult, Long l12, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(l11, j11, wishlistEvent$Result$ActionResult, (i11 & 8) != 0 ? null : l12, (i11 & 16) != 0 ? null : str);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductAdded)) {
                return false;
            }
            ProductAdded productAdded = (ProductAdded) other;
            return Intrinsics.d(this.sku, productAdded.sku) && this.wishlistId == productAdded.wishlistId && this.result == productAdded.result && Intrinsics.d(this.giftId, productAdded.giftId) && Intrinsics.d(this.uniqId, productAdded.uniqId);
        }

        @NotNull
        public WishlistEvent$Result$ActionResult getResult() {
            return this.result;
        }

        @Override // ru.ozon.app.android.favorites.domain.wishlistManager.WishlistEvent
        public Long getSku() {
            return this.sku;
        }

        @Override // ru.ozon.app.android.favorites.domain.wishlistManager.WishlistEvent
        public String getUniqId() {
            return this.uniqId;
        }

        @Override // ru.ozon.app.android.favorites.domain.wishlistManager.WishlistEvent
        public long getWishlistId() {
            return this.wishlistId;
        }

        public int hashCode() {
            Long l11 = this.sku;
            int hashCode = (this.result.hashCode() + c.a((l11 == null ? 0 : l11.hashCode()) * 31, 31, this.wishlistId)) * 31;
            Long l12 = this.giftId;
            int hashCode2 = (hashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
            String str = this.uniqId;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Long l11 = this.sku;
            long j11 = this.wishlistId;
            WishlistEvent$Result$ActionResult wishlistEvent$Result$ActionResult = this.result;
            Long l12 = this.giftId;
            String str = this.uniqId;
            StringBuilder sb2 = new StringBuilder("ProductAdded(sku=");
            sb2.append(l11);
            sb2.append(", wishlistId=");
            sb2.append(j11);
            sb2.append(", result=");
            sb2.append(wishlistEvent$Result$ActionResult);
            sb2.append(", giftId=");
            sb2.append(l12);
            return C6594f.a(", uniqId=", str, ")", sb2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProductAdded(Long l11, long j11, @NotNull WishlistEvent$Result$ActionResult result, Long l12, String str) {
            super(l11, j11, l12, null, 8, null);
            Intrinsics.checkNotNullParameter(result, "result");
            this.sku = l11;
            this.wishlistId = j11;
            this.result = result;
            this.giftId = l12;
            this.uniqId = str;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEvent$ProductAdditionStarted;", "Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEvent;", "", "sku", "wishlistId", "giftId", "", "uniqId", "<init>", "(Ljava/lang/Long;JLjava/lang/Long;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getSku", "()Ljava/lang/Long;", "J", "getWishlistId", "()J", "getGiftId", "Ljava/lang/String;", "getUniqId", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductAdditionStarted extends WishlistEvent {
        private final Long giftId;
        private final Long sku;
        private final String uniqId;
        private final long wishlistId;

        public /* synthetic */ ProductAdditionStarted(Long l11, long j11, Long l12, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(l11, j11, (i11 & 4) != 0 ? null : l12, (i11 & 8) != 0 ? null : str);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductAdditionStarted)) {
                return false;
            }
            ProductAdditionStarted productAdditionStarted = (ProductAdditionStarted) other;
            return Intrinsics.d(this.sku, productAdditionStarted.sku) && this.wishlistId == productAdditionStarted.wishlistId && Intrinsics.d(this.giftId, productAdditionStarted.giftId) && Intrinsics.d(this.uniqId, productAdditionStarted.uniqId);
        }

        @Override // ru.ozon.app.android.favorites.domain.wishlistManager.WishlistEvent
        public Long getSku() {
            return this.sku;
        }

        @Override // ru.ozon.app.android.favorites.domain.wishlistManager.WishlistEvent
        public String getUniqId() {
            return this.uniqId;
        }

        @Override // ru.ozon.app.android.favorites.domain.wishlistManager.WishlistEvent
        public long getWishlistId() {
            return this.wishlistId;
        }

        public int hashCode() {
            Long l11 = this.sku;
            int a11 = c.a((l11 == null ? 0 : l11.hashCode()) * 31, 31, this.wishlistId);
            Long l12 = this.giftId;
            int hashCode = (a11 + (l12 == null ? 0 : l12.hashCode())) * 31;
            String str = this.uniqId;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ProductAdditionStarted(sku=" + this.sku + ", wishlistId=" + this.wishlistId + ", giftId=" + this.giftId + ", uniqId=" + this.uniqId + ")";
        }

        public ProductAdditionStarted(Long l11, long j11, Long l12, String str) {
            super(l11, j11, l12, null, 8, null);
            this.sku = l11;
            this.wishlistId = j11;
            this.giftId = l12;
            this.uniqId = str;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEvent$ProductRemovalStarted;", "Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEvent;", "", "sku", "wishlistId", "giftId", "", "uniqId", "<init>", "(Ljava/lang/Long;JLjava/lang/Long;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getSku", "()Ljava/lang/Long;", "J", "getWishlistId", "()J", "getGiftId", "Ljava/lang/String;", "getUniqId", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductRemovalStarted extends WishlistEvent {
        private final Long giftId;
        private final Long sku;
        private final String uniqId;
        private final long wishlistId;

        public ProductRemovalStarted(Long l11, long j11, Long l12, String str) {
            super(l11, j11, l12, null, 8, null);
            this.sku = l11;
            this.wishlistId = j11;
            this.giftId = l12;
            this.uniqId = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductRemovalStarted)) {
                return false;
            }
            ProductRemovalStarted productRemovalStarted = (ProductRemovalStarted) other;
            return Intrinsics.d(this.sku, productRemovalStarted.sku) && this.wishlistId == productRemovalStarted.wishlistId && Intrinsics.d(this.giftId, productRemovalStarted.giftId) && Intrinsics.d(this.uniqId, productRemovalStarted.uniqId);
        }

        @Override // ru.ozon.app.android.favorites.domain.wishlistManager.WishlistEvent
        public Long getSku() {
            return this.sku;
        }

        @Override // ru.ozon.app.android.favorites.domain.wishlistManager.WishlistEvent
        public String getUniqId() {
            return this.uniqId;
        }

        @Override // ru.ozon.app.android.favorites.domain.wishlistManager.WishlistEvent
        public long getWishlistId() {
            return this.wishlistId;
        }

        public int hashCode() {
            Long l11 = this.sku;
            int a11 = c.a((l11 == null ? 0 : l11.hashCode()) * 31, 31, this.wishlistId);
            Long l12 = this.giftId;
            int hashCode = (a11 + (l12 == null ? 0 : l12.hashCode())) * 31;
            String str = this.uniqId;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ProductRemovalStarted(sku=" + this.sku + ", wishlistId=" + this.wishlistId + ", giftId=" + this.giftId + ", uniqId=" + this.uniqId + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B9\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\u000e¨\u0006\""}, d2 = {"Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEvent$ProductRemoved;", "Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEvent;", "", "", "sku", "wishlistId", "Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEvent$Result$ActionResult;", "result", "giftId", "", "uniqId", "<init>", "(Ljava/lang/Long;JLru/ozon/app/android/favorites/domain/wishlistManager/WishlistEvent$Result$ActionResult;Ljava/lang/Long;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getSku", "()Ljava/lang/Long;", "J", "getWishlistId", "()J", "Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEvent$Result$ActionResult;", "getResult", "()Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEvent$Result$ActionResult;", "getGiftId", "Ljava/lang/String;", "getUniqId", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductRemoved extends WishlistEvent {
        private final Long giftId;

        @NotNull
        private final WishlistEvent$Result$ActionResult result;
        private final Long sku;
        private final String uniqId;
        private final long wishlistId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProductRemoved(Long l11, long j11, @NotNull WishlistEvent$Result$ActionResult result, Long l12, String str) {
            super(l11, j11, l12, null, 8, null);
            Intrinsics.checkNotNullParameter(result, "result");
            this.sku = l11;
            this.wishlistId = j11;
            this.result = result;
            this.giftId = l12;
            this.uniqId = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductRemoved)) {
                return false;
            }
            ProductRemoved productRemoved = (ProductRemoved) other;
            return Intrinsics.d(this.sku, productRemoved.sku) && this.wishlistId == productRemoved.wishlistId && this.result == productRemoved.result && Intrinsics.d(this.giftId, productRemoved.giftId) && Intrinsics.d(this.uniqId, productRemoved.uniqId);
        }

        @NotNull
        public WishlistEvent$Result$ActionResult getResult() {
            return this.result;
        }

        @Override // ru.ozon.app.android.favorites.domain.wishlistManager.WishlistEvent
        public Long getSku() {
            return this.sku;
        }

        @Override // ru.ozon.app.android.favorites.domain.wishlistManager.WishlistEvent
        public String getUniqId() {
            return this.uniqId;
        }

        @Override // ru.ozon.app.android.favorites.domain.wishlistManager.WishlistEvent
        public long getWishlistId() {
            return this.wishlistId;
        }

        public int hashCode() {
            Long l11 = this.sku;
            int hashCode = (this.result.hashCode() + c.a((l11 == null ? 0 : l11.hashCode()) * 31, 31, this.wishlistId)) * 31;
            Long l12 = this.giftId;
            int hashCode2 = (hashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
            String str = this.uniqId;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Long l11 = this.sku;
            long j11 = this.wishlistId;
            WishlistEvent$Result$ActionResult wishlistEvent$Result$ActionResult = this.result;
            Long l12 = this.giftId;
            String str = this.uniqId;
            StringBuilder sb2 = new StringBuilder("ProductRemoved(sku=");
            sb2.append(l11);
            sb2.append(", wishlistId=");
            sb2.append(j11);
            sb2.append(", result=");
            sb2.append(wishlistEvent$Result$ActionResult);
            sb2.append(", giftId=");
            sb2.append(l12);
            return C6594f.a(", uniqId=", str, ")", sb2);
        }
    }

    public /* synthetic */ WishlistEvent(Long l11, long j11, Long l12, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(l11, j11, l12, str);
    }

    public Long getSku() {
        return this.sku;
    }

    public String getUniqId() {
        return this.uniqId;
    }

    public long getWishlistId() {
        return this.wishlistId;
    }

    private WishlistEvent(Long l11, long j11, Long l12, String str) {
        this.sku = l11;
        this.wishlistId = j11;
        this.giftId = l12;
        this.uniqId = str;
    }

    public /* synthetic */ WishlistEvent(Long l11, long j11, Long l12, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(l11, j11, (i11 & 4) != 0 ? null : l12, (i11 & 8) != 0 ? null : str, null);
    }
}

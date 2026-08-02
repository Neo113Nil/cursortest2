package ru.ozon.app.android.marketing.coupon.domain;

import B0.A0;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/marketing/coupon/domain/CouponResponse;", "", "<init>", "()V", "Success", "Fail", "Lru/ozon/app/android/marketing/coupon/domain/CouponResponse$Fail;", "Lru/ozon/app/android/marketing/coupon/domain/CouponResponse$Success;", "coupon_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class CouponResponse {

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/marketing/coupon/domain/CouponResponse$Fail;", "Lru/ozon/app/android/marketing/coupon/domain/CouponResponse;", "errorForUser", "", "<init>", "(Ljava/lang/String;)V", "getErrorForUser", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "coupon_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Fail extends CouponResponse {
        private final String errorForUser;

        public Fail(String str) {
            super(null);
            this.errorForUser = str;
        }

        public static /* synthetic */ Fail copy$default(Fail fail, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = fail.errorForUser;
            }
            return fail.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getErrorForUser() {
            return this.errorForUser;
        }

        @NotNull
        public final Fail copy(String errorForUser) {
            return new Fail(errorForUser);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Fail) && Intrinsics.d(this.errorForUser, ((Fail) other).errorForUser);
        }

        public final String getErrorForUser() {
            return this.errorForUser;
        }

        public int hashCode() {
            String str = this.errorForUser;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("Fail(errorForUser=", this.errorForUser, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/marketing/coupon/domain/CouponResponse$Success;", "Lru/ozon/app/android/marketing/coupon/domain/CouponResponse;", "messageForUser", "", "<init>", "(Ljava/lang/String;)V", "getMessageForUser", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "coupon_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success extends CouponResponse {
        private final String messageForUser;

        public Success(String str) {
            super(null);
            this.messageForUser = str;
        }

        public static /* synthetic */ Success copy$default(Success success, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = success.messageForUser;
            }
            return success.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessageForUser() {
            return this.messageForUser;
        }

        @NotNull
        public final Success copy(String messageForUser) {
            return new Success(messageForUser);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.d(this.messageForUser, ((Success) other).messageForUser);
        }

        public final String getMessageForUser() {
            return this.messageForUser;
        }

        public int hashCode() {
            String str = this.messageForUser;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("Success(messageForUser=", this.messageForUser, ")");
        }
    }

    public /* synthetic */ CouponResponse(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CouponResponse() {
    }
}

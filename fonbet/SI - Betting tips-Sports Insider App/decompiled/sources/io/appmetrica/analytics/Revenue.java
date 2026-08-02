package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C0050be;
import io.appmetrica.analytics.impl.En;
import java.util.Currency;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class Revenue {

    @NonNull
    public final Currency currency;
    public final String payload;
    public final long priceMicros;
    public final String productID;
    public final Integer quantity;
    public final Receipt receipt;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class Builder {

        /* renamed from: g, reason: collision with root package name */
        private static final En f11370g = new En(new C0050be("revenue currency"));

        /* renamed from: a, reason: collision with root package name */
        final long f11371a;

        /* renamed from: b, reason: collision with root package name */
        final Currency f11372b;

        /* renamed from: c, reason: collision with root package name */
        Integer f11373c;

        /* renamed from: d, reason: collision with root package name */
        String f11374d;

        /* renamed from: e, reason: collision with root package name */
        String f11375e;

        /* renamed from: f, reason: collision with root package name */
        Receipt f11376f;

        public /* synthetic */ Builder(long j, Currency currency, int i5) {
            this(j, currency);
        }

        @NonNull
        public Revenue build() {
            return new Revenue(this, 0);
        }

        @NonNull
        public Builder withPayload(String str) {
            this.f11375e = str;
            return this;
        }

        @NonNull
        public Builder withProductID(String str) {
            this.f11374d = str;
            return this;
        }

        @NonNull
        public Builder withQuantity(Integer num) {
            this.f11373c = num;
            return this;
        }

        @NonNull
        public Builder withReceipt(Receipt receipt) {
            this.f11376f = receipt;
            return this;
        }

        private Builder(long j, Currency currency) {
            f11370g.a(currency);
            this.f11371a = j;
            this.f11372b = currency;
        }
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class Receipt {
        public final String data;
        public final String signature;

        /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
        public static class Builder {

            /* renamed from: a, reason: collision with root package name */
            private String f11377a;

            /* renamed from: b, reason: collision with root package name */
            private String f11378b;

            public /* synthetic */ Builder(int i5) {
                this();
            }

            @NonNull
            public Receipt build() {
                return new Receipt(this, 0);
            }

            @NonNull
            public Builder withData(String str) {
                this.f11377a = str;
                return this;
            }

            @NonNull
            public Builder withSignature(String str) {
                this.f11378b = str;
                return this;
            }

            private Builder() {
            }
        }

        public /* synthetic */ Receipt(Builder builder, int i5) {
            this(builder);
        }

        @NonNull
        public static Builder newBuilder() {
            return new Builder(0);
        }

        private Receipt(Builder builder) {
            this.data = builder.f11377a;
            this.signature = builder.f11378b;
        }
    }

    public /* synthetic */ Revenue(Builder builder, int i5) {
        this(builder);
    }

    @NonNull
    public static Builder newBuilder(long j, @NonNull Currency currency) {
        return new Builder(j, currency, 0);
    }

    private Revenue(Builder builder) {
        this.priceMicros = builder.f11371a;
        this.currency = builder.f11372b;
        this.quantity = builder.f11373c;
        this.productID = builder.f11374d;
        this.payload = builder.f11375e;
        this.receipt = builder.f11376f;
    }
}

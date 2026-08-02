package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.ironsource.U3;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.RewardedOffersResponseOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/RewardedOffersResponseKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RewardedOffersResponseKt {

    @NotNull
    public static final RewardedOffersResponseKt INSTANCE = new RewardedOffersResponseKt();

    private RewardedOffersResponseKt() {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u001e\u001a\u00020\u0010J\u0006\u0010\u001f\u001a\u00020 R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0017\u0010!\u001a\u0004\u0018\u00010\u0018*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lgatewayprotocol/v1/RewardedOffersResponseKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/RewardedOffersResponseOuterClass$RewardedOffersResponse$Builder;", "<init>", "(Lgatewayprotocol/v1/RewardedOffersResponseOuterClass$RewardedOffersResponse$Builder;)V", "_build", "Lgatewayprotocol/v1/RewardedOffersResponseOuterClass$RewardedOffersResponse;", U3.i.X, "Lcom/google/protobuf/ByteString;", "rewardedOffers", "getRewardedOffers", "()Lcom/google/protobuf/ByteString;", "setRewardedOffers", "(Lcom/google/protobuf/ByteString;)V", "clearRewardedOffers", "", "", "rewardedOffersVersion", "getRewardedOffersVersion", "()I", "setRewardedOffersVersion", "(I)V", "clearRewardedOffersVersion", "Lgatewayprotocol/v1/ErrorOuterClass$Error;", "error", "getError", "()Lgatewayprotocol/v1/ErrorOuterClass$Error;", "setError", "(Lgatewayprotocol/v1/ErrorOuterClass$Error;)V", "clearError", "hasError", "", "errorOrNull", "getErrorOrNull", "(Lgatewayprotocol/v1/RewardedOffersResponseKt$Dsl;)Lgatewayprotocol/v1/ErrorOuterClass$Error;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final RewardedOffersResponseOuterClass.RewardedOffersResponse.Builder _builder;

        private Dsl(RewardedOffersResponseOuterClass.RewardedOffersResponse.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ RewardedOffersResponseOuterClass.RewardedOffersResponse _build() {
            RewardedOffersResponseOuterClass.RewardedOffersResponse build = this._builder.build();
            build.getClass();
            return build;
        }

        public final void clearError() {
            this._builder.clearError();
        }

        public final void clearRewardedOffers() {
            this._builder.clearRewardedOffers();
        }

        public final void clearRewardedOffersVersion() {
            this._builder.clearRewardedOffersVersion();
        }

        @NotNull
        public final ErrorOuterClass.Error getError() {
            ErrorOuterClass.Error error = this._builder.getError();
            error.getClass();
            return error;
        }

        @Nullable
        public final ErrorOuterClass.Error getErrorOrNull(@NotNull Dsl dsl) {
            dsl.getClass();
            return RewardedOffersResponseKtKt.getErrorOrNull(dsl._builder);
        }

        @NotNull
        public final ByteString getRewardedOffers() {
            ByteString rewardedOffers = this._builder.getRewardedOffers();
            rewardedOffers.getClass();
            return rewardedOffers;
        }

        public final int getRewardedOffersVersion() {
            return this._builder.getRewardedOffersVersion();
        }

        public final boolean hasError() {
            return this._builder.hasError();
        }

        public final void setError(@NotNull ErrorOuterClass.Error error) {
            error.getClass();
            this._builder.setError(error);
        }

        public final void setRewardedOffers(@NotNull ByteString byteString) {
            byteString.getClass();
            this._builder.setRewardedOffers(byteString);
        }

        public final void setRewardedOffersVersion(int i) {
            this._builder.setRewardedOffersVersion(i);
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/RewardedOffersResponseKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/RewardedOffersResponseKt$Dsl;", "builder", "Lgatewayprotocol/v1/RewardedOffersResponseOuterClass$RewardedOffersResponse$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(RewardedOffersResponseOuterClass.RewardedOffersResponse.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(RewardedOffersResponseOuterClass.RewardedOffersResponse.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }
    }
}

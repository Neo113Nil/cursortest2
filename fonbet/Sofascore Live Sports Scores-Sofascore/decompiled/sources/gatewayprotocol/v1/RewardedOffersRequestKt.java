package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.ironsource.U3;
import gatewayprotocol.v1.RewardedOffersRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/RewardedOffersRequestKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RewardedOffersRequestKt {

    @NotNull
    public static final RewardedOffersRequestKt INSTANCE = new RewardedOffersRequestKt();

    private RewardedOffersRequestKt() {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u001d\u001a\u00020\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u000f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u00178G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lgatewayprotocol/v1/RewardedOffersRequestKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/RewardedOffersRequestOuterClass$RewardedOffersRequest$Builder;", "<init>", "(Lgatewayprotocol/v1/RewardedOffersRequestOuterClass$RewardedOffersRequest$Builder;)V", "_build", "Lgatewayprotocol/v1/RewardedOffersRequestOuterClass$RewardedOffersRequest;", U3.i.X, "Lgatewayprotocol/v1/RewardedOffersRequestOuterClass$RewardedOffersEntryPoint;", "entryPoint", "getEntryPoint", "()Lgatewayprotocol/v1/RewardedOffersRequestOuterClass$RewardedOffersEntryPoint;", "setEntryPoint", "(Lgatewayprotocol/v1/RewardedOffersRequestOuterClass$RewardedOffersEntryPoint;)V", "", "entryPointValue", "getEntryPointValue", "()I", "setEntryPointValue", "(I)V", "clearEntryPoint", "", "Lcom/google/protobuf/ByteString;", "cursor", "getCursor", "()Lcom/google/protobuf/ByteString;", "setCursor", "(Lcom/google/protobuf/ByteString;)V", "clearCursor", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final RewardedOffersRequestOuterClass.RewardedOffersRequest.Builder _builder;

        private Dsl(RewardedOffersRequestOuterClass.RewardedOffersRequest.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ RewardedOffersRequestOuterClass.RewardedOffersRequest _build() {
            RewardedOffersRequestOuterClass.RewardedOffersRequest build = this._builder.build();
            build.getClass();
            return build;
        }

        public final void clearCursor() {
            this._builder.clearCursor();
        }

        public final void clearEntryPoint() {
            this._builder.clearEntryPoint();
        }

        @NotNull
        public final ByteString getCursor() {
            ByteString cursor = this._builder.getCursor();
            cursor.getClass();
            return cursor;
        }

        @NotNull
        public final RewardedOffersRequestOuterClass.RewardedOffersEntryPoint getEntryPoint() {
            RewardedOffersRequestOuterClass.RewardedOffersEntryPoint entryPoint = this._builder.getEntryPoint();
            entryPoint.getClass();
            return entryPoint;
        }

        public final int getEntryPointValue() {
            return this._builder.getEntryPointValue();
        }

        public final void setCursor(@NotNull ByteString byteString) {
            byteString.getClass();
            this._builder.setCursor(byteString);
        }

        public final void setEntryPoint(@NotNull RewardedOffersRequestOuterClass.RewardedOffersEntryPoint rewardedOffersEntryPoint) {
            rewardedOffersEntryPoint.getClass();
            this._builder.setEntryPoint(rewardedOffersEntryPoint);
        }

        public final void setEntryPointValue(int i) {
            this._builder.setEntryPointValue(i);
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/RewardedOffersRequestKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/RewardedOffersRequestKt$Dsl;", "builder", "Lgatewayprotocol/v1/RewardedOffersRequestOuterClass$RewardedOffersRequest$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(RewardedOffersRequestOuterClass.RewardedOffersRequest.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(RewardedOffersRequestOuterClass.RewardedOffersRequest.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }
    }
}

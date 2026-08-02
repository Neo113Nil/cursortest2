package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.ironsource.U3;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.MutableDataOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/MutableDataKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MutableDataKt {

    @NotNull
    public static final MutableDataKt INSTANCE = new MutableDataKt();

    private MutableDataKt() {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 =2\u00020\u0001:\u0001=B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0016\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0012J\u0006\u0010\u001b\u001a\u00020\u0010J\u0006\u0010\u001c\u001a\u00020\u0012J\u0006\u0010#\u001a\u00020\u0010J\u0006\u0010$\u001a\u00020\u0012J\u0006\u0010.\u001a\u00020\u0010J\u0006\u0010/\u001a\u00020\u0012J\u0006\u00106\u001a\u00020\u0010J\u0006\u00107\u001a\u00020\u0012J\u0006\u0010;\u001a\u00020\u0010J\u0006\u0010<\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0013\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000eR$\u0010\u0018\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR$\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u001d8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0017\u0010%\u001a\u0004\u0018\u00010\u001d*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b&\u0010'R$\u0010)\u001a\u00020(2\u0006\u0010\b\u001a\u00020(8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0017\u00100\u001a\u0004\u0018\u00010(*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b1\u00102R$\u00103\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u0010\f\"\u0004\b5\u0010\u000eR$\u00108\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b9\u0010\f\"\u0004\b:\u0010\u000e¨\u0006>"}, d2 = {"Lgatewayprotocol/v1/MutableDataKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/MutableDataOuterClass$MutableData$Builder;", "<init>", "(Lgatewayprotocol/v1/MutableDataOuterClass$MutableData$Builder;)V", "_build", "Lgatewayprotocol/v1/MutableDataOuterClass$MutableData;", U3.i.X, "Lcom/google/protobuf/ByteString;", "currentState", "getCurrentState", "()Lcom/google/protobuf/ByteString;", "setCurrentState", "(Lcom/google/protobuf/ByteString;)V", "clearCurrentState", "", "hasCurrentState", "", "sessionToken", "getSessionToken", "setSessionToken", "clearSessionToken", "hasSessionToken", "privacy", "getPrivacy", "setPrivacy", "clearPrivacy", "hasPrivacy", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "sessionCounters", "getSessionCounters", "()Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "setSessionCounters", "(Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;)V", "clearSessionCounters", "hasSessionCounters", "sessionCountersOrNull", "getSessionCountersOrNull", "(Lgatewayprotocol/v1/MutableDataKt$Dsl;)Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "Lgatewayprotocol/v1/AllowedPiiOuterClass$AllowedPii;", "allowedPii", "getAllowedPii", "()Lgatewayprotocol/v1/AllowedPiiOuterClass$AllowedPii;", "setAllowedPii", "(Lgatewayprotocol/v1/AllowedPiiOuterClass$AllowedPii;)V", "clearAllowedPii", "hasAllowedPii", "allowedPiiOrNull", "getAllowedPiiOrNull", "(Lgatewayprotocol/v1/MutableDataKt$Dsl;)Lgatewayprotocol/v1/AllowedPiiOuterClass$AllowedPii;", "cache", "getCache", "setCache", "clearCache", "hasCache", "privacyFsm", "getPrivacyFsm", "setPrivacyFsm", "clearPrivacyFsm", "hasPrivacyFsm", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final MutableDataOuterClass.MutableData.Builder _builder;

        private Dsl(MutableDataOuterClass.MutableData.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ MutableDataOuterClass.MutableData _build() {
            MutableDataOuterClass.MutableData build = this._builder.build();
            build.getClass();
            return build;
        }

        public final void clearAllowedPii() {
            this._builder.clearAllowedPii();
        }

        public final void clearCache() {
            this._builder.clearCache();
        }

        public final void clearCurrentState() {
            this._builder.clearCurrentState();
        }

        public final void clearPrivacy() {
            this._builder.clearPrivacy();
        }

        public final void clearPrivacyFsm() {
            this._builder.clearPrivacyFsm();
        }

        public final void clearSessionCounters() {
            this._builder.clearSessionCounters();
        }

        public final void clearSessionToken() {
            this._builder.clearSessionToken();
        }

        @NotNull
        public final AllowedPiiOuterClass.AllowedPii getAllowedPii() {
            AllowedPiiOuterClass.AllowedPii allowedPii = this._builder.getAllowedPii();
            allowedPii.getClass();
            return allowedPii;
        }

        @Nullable
        public final AllowedPiiOuterClass.AllowedPii getAllowedPiiOrNull(@NotNull Dsl dsl) {
            dsl.getClass();
            return MutableDataKtKt.getAllowedPiiOrNull(dsl._builder);
        }

        @NotNull
        public final ByteString getCache() {
            ByteString cache = this._builder.getCache();
            cache.getClass();
            return cache;
        }

        @NotNull
        public final ByteString getCurrentState() {
            ByteString currentState = this._builder.getCurrentState();
            currentState.getClass();
            return currentState;
        }

        @NotNull
        public final ByteString getPrivacy() {
            ByteString privacy = this._builder.getPrivacy();
            privacy.getClass();
            return privacy;
        }

        @NotNull
        public final ByteString getPrivacyFsm() {
            ByteString privacyFsm = this._builder.getPrivacyFsm();
            privacyFsm.getClass();
            return privacyFsm;
        }

        @NotNull
        public final SessionCountersOuterClass.SessionCounters getSessionCounters() {
            SessionCountersOuterClass.SessionCounters sessionCounters = this._builder.getSessionCounters();
            sessionCounters.getClass();
            return sessionCounters;
        }

        @Nullable
        public final SessionCountersOuterClass.SessionCounters getSessionCountersOrNull(@NotNull Dsl dsl) {
            dsl.getClass();
            return MutableDataKtKt.getSessionCountersOrNull(dsl._builder);
        }

        @NotNull
        public final ByteString getSessionToken() {
            ByteString sessionToken = this._builder.getSessionToken();
            sessionToken.getClass();
            return sessionToken;
        }

        public final boolean hasAllowedPii() {
            return this._builder.hasAllowedPii();
        }

        public final boolean hasCache() {
            return this._builder.hasCache();
        }

        public final boolean hasCurrentState() {
            return this._builder.hasCurrentState();
        }

        public final boolean hasPrivacy() {
            return this._builder.hasPrivacy();
        }

        public final boolean hasPrivacyFsm() {
            return this._builder.hasPrivacyFsm();
        }

        public final boolean hasSessionCounters() {
            return this._builder.hasSessionCounters();
        }

        public final boolean hasSessionToken() {
            return this._builder.hasSessionToken();
        }

        public final void setAllowedPii(@NotNull AllowedPiiOuterClass.AllowedPii allowedPii) {
            allowedPii.getClass();
            this._builder.setAllowedPii(allowedPii);
        }

        public final void setCache(@NotNull ByteString byteString) {
            byteString.getClass();
            this._builder.setCache(byteString);
        }

        public final void setCurrentState(@NotNull ByteString byteString) {
            byteString.getClass();
            this._builder.setCurrentState(byteString);
        }

        public final void setPrivacy(@NotNull ByteString byteString) {
            byteString.getClass();
            this._builder.setPrivacy(byteString);
        }

        public final void setPrivacyFsm(@NotNull ByteString byteString) {
            byteString.getClass();
            this._builder.setPrivacyFsm(byteString);
        }

        public final void setSessionCounters(@NotNull SessionCountersOuterClass.SessionCounters sessionCounters) {
            sessionCounters.getClass();
            this._builder.setSessionCounters(sessionCounters);
        }

        public final void setSessionToken(@NotNull ByteString byteString) {
            byteString.getClass();
            this._builder.setSessionToken(byteString);
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/MutableDataKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/MutableDataKt$Dsl;", "builder", "Lgatewayprotocol/v1/MutableDataOuterClass$MutableData$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(MutableDataOuterClass.MutableData.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(MutableDataOuterClass.MutableData.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }
    }
}

package gatewayprotocol.v1;

import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.ironsource.U3;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.ModuleOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/InitializationResponseKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InitializationResponseKt {

    @NotNull
    public static final InitializationResponseKt INSTANCE = new InitializationResponseKt();

    private InitializationResponseKt() {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001c\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 l2\u00020\u0001:\u0005lmnopB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0019\u001a\u00020\u0010J\u0006\u0010\u001a\u001a\u00020\u0012J\u0006\u0010!\u001a\u00020\u0010J\u0006\u0010\"\u001a\u00020\u0012J\u0006\u0010+\u001a\u00020\u0010J\u0006\u00102\u001a\u00020\u0010J3\u00109\u001a\u00020\u0010*\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u000206042\u0006\u0010:\u001a\u00020\u00132\u0006\u0010\b\u001a\u000205H\u0007¢\u0006\u0002\b;J4\u0010<\u001a\u00020\u0010*\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u000206042\u0006\u0010:\u001a\u00020\u00132\u0006\u0010\b\u001a\u000205H\u0087\n¢\u0006\u0002\b=J+\u0010>\u001a\u00020\u0010*\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u000206042\u0006\u0010:\u001a\u00020\u0013H\u0007¢\u0006\u0002\b?J7\u0010@\u001a\u00020\u0010*\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u000206042\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u0002050BH\u0007¢\u0006\u0002\bCJ#\u0010D\u001a\u00020\u0010*\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020604H\u0007¢\u0006\u0002\bEJ%\u0010L\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020I0G2\u0006\u0010\b\u001a\u00020HH\u0007¢\u0006\u0002\bMJ&\u0010N\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020I0G2\u0006\u0010\b\u001a\u00020HH\u0087\n¢\u0006\u0002\bOJ+\u0010P\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020I0G2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020H0RH\u0007¢\u0006\u0002\bSJ,\u0010N\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020I0G2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020H0RH\u0087\n¢\u0006\u0002\bTJ.\u0010<\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020I0G2\u0006\u0010U\u001a\u00020,2\u0006\u0010\b\u001a\u00020HH\u0087\u0002¢\u0006\u0002\bVJ\u001d\u0010D\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020I0GH\u0007¢\u0006\u0002\bWJ%\u0010L\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020Z0G2\u0006\u0010\b\u001a\u00020YH\u0007¢\u0006\u0002\b\\J&\u0010N\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020Z0G2\u0006\u0010\b\u001a\u00020YH\u0087\n¢\u0006\u0002\b]J+\u0010P\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020Z0G2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020Y0RH\u0007¢\u0006\u0002\b^J,\u0010N\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020Z0G2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020Y0RH\u0087\n¢\u0006\u0002\b_J.\u0010<\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020Z0G2\u0006\u0010U\u001a\u00020,2\u0006\u0010\b\u001a\u00020YH\u0087\u0002¢\u0006\u0002\b`J\u001d\u0010D\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020Z0GH\u0007¢\u0006\u0002\baJ%\u0010L\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020c\u0012\u0004\u0012\u00020d0G2\u0006\u0010\b\u001a\u00020cH\u0007¢\u0006\u0002\bfJ&\u0010N\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020c\u0012\u0004\u0012\u00020d0G2\u0006\u0010\b\u001a\u00020cH\u0087\n¢\u0006\u0002\bgJ+\u0010P\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020c\u0012\u0004\u0012\u00020d0G2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020c0RH\u0007¢\u0006\u0002\bhJ,\u0010N\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020c\u0012\u0004\u0012\u00020d0G2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020c0RH\u0087\n¢\u0006\u0002\biJ.\u0010<\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020c\u0012\u0004\u0012\u00020d0G2\u0006\u0010U\u001a\u00020,2\u0006\u0010\b\u001a\u00020cH\u0087\u0002¢\u0006\u0002\bjJ\u001d\u0010D\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020c\u0012\u0004\u0012\u00020d0GH\u0007¢\u0006\u0002\bkR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0017\u0010#\u001a\u0004\u0018\u00010\u001b*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b$\u0010%R$\u0010&\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010-\u001a\u00020,2\u0006\u0010\b\u001a\u00020,8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R#\u00103\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u000206048G¢\u0006\u0006\u001a\u0004\b7\u00108R\u001d\u0010F\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020I0G8F¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u001d\u0010X\u001a\u000e\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020Z0G8F¢\u0006\u0006\u001a\u0004\b[\u0010KR\u001d\u0010b\u001a\u000e\u0012\u0004\u0012\u00020c\u0012\u0004\u0012\u00020d0G8F¢\u0006\u0006\u001a\u0004\be\u0010K¨\u0006q"}, d2 = {"Lgatewayprotocol/v1/InitializationResponseKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/InitializationResponseOuterClass$InitializationResponse$Builder;", "<init>", "(Lgatewayprotocol/v1/InitializationResponseOuterClass$InitializationResponse$Builder;)V", "_build", "Lgatewayprotocol/v1/InitializationResponseOuterClass$InitializationResponse;", U3.i.X, "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "nativeConfiguration", "getNativeConfiguration", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "setNativeConfiguration", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;)V", "clearNativeConfiguration", "", "hasNativeConfiguration", "", "", "universalRequestUrl", "getUniversalRequestUrl", "()Ljava/lang/String;", "setUniversalRequestUrl", "(Ljava/lang/String;)V", "clearUniversalRequestUrl", "hasUniversalRequestUrl", "Lgatewayprotocol/v1/ErrorOuterClass$Error;", "error", "getError", "()Lgatewayprotocol/v1/ErrorOuterClass$Error;", "setError", "(Lgatewayprotocol/v1/ErrorOuterClass$Error;)V", "clearError", "hasError", "errorOrNull", "getErrorOrNull", "(Lgatewayprotocol/v1/InitializationResponseKt$Dsl;)Lgatewayprotocol/v1/ErrorOuterClass$Error;", "triggerInitializationCompletedRequest", "getTriggerInitializationCompletedRequest", "()Z", "setTriggerInitializationCompletedRequest", "(Z)V", "clearTriggerInitializationCompletedRequest", "", "countOfLastShownCampaigns", "getCountOfLastShownCampaigns", "()I", "setCountOfLastShownCampaigns", "(I)V", "clearCountOfLastShownCampaigns", "scarPlacements", "Lcom/google/protobuf/kotlin/DslMap;", "Lgatewayprotocol/v1/InitializationResponseOuterClass$Placement;", "Lgatewayprotocol/v1/InitializationResponseKt$Dsl$ScarPlacementsProxy;", "getScarPlacementsMap", "()Lcom/google/protobuf/kotlin/DslMap;", "put", U3.i.W, "putScarPlacements", "set", "setScarPlacements", "remove", "removeScarPlacements", "putAll", "map", "", "putAllScarPlacements", "clear", "clearScarPlacements", "scarEligibleFormats", "Lcom/google/protobuf/kotlin/DslList;", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "Lgatewayprotocol/v1/InitializationResponseKt$Dsl$ScarEligibleFormatsProxy;", "getScarEligibleFormats", "()Lcom/google/protobuf/kotlin/DslList;", "add", "addScarEligibleFormats", "plusAssign", "plusAssignScarEligibleFormats", "addAll", "values", "", "addAllScarEligibleFormats", "plusAssignAllScarEligibleFormats", "index", "setScarEligibleFormats", "clearScarEligibleFormats", "requestUrlOverrides", "Lgatewayprotocol/v1/InitializationResponseOuterClass$RequestUrlOverride;", "Lgatewayprotocol/v1/InitializationResponseKt$Dsl$RequestUrlOverridesProxy;", "getRequestUrlOverrides", "addRequestUrlOverrides", "plusAssignRequestUrlOverrides", "addAllRequestUrlOverrides", "plusAssignAllRequestUrlOverrides", "setRequestUrlOverrides", "clearRequestUrlOverrides", "modules", "Lgatewayprotocol/v1/ModuleOuterClass$Module;", "Lgatewayprotocol/v1/InitializationResponseKt$Dsl$ModulesProxy;", "getModules", "addModules", "plusAssignModules", "addAllModules", "plusAssignAllModules", "setModules", "clearModules", "Companion", "ScarPlacementsProxy", "ScarEligibleFormatsProxy", "RequestUrlOverridesProxy", "ModulesProxy", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final InitializationResponseOuterClass.InitializationResponse.Builder _builder;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/InitializationResponseKt$Dsl$ModulesProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ModulesProxy extends DslProxy {
            private ModulesProxy() {
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/InitializationResponseKt$Dsl$RequestUrlOverridesProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class RequestUrlOverridesProxy extends DslProxy {
            private RequestUrlOverridesProxy() {
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/InitializationResponseKt$Dsl$ScarEligibleFormatsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ScarEligibleFormatsProxy extends DslProxy {
            private ScarEligibleFormatsProxy() {
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/InitializationResponseKt$Dsl$ScarPlacementsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ScarPlacementsProxy extends DslProxy {
            private ScarPlacementsProxy() {
            }
        }

        private Dsl(InitializationResponseOuterClass.InitializationResponse.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ InitializationResponseOuterClass.InitializationResponse _build() {
            InitializationResponseOuterClass.InitializationResponse build = this._builder.build();
            build.getClass();
            return build;
        }

        public final /* synthetic */ void addAllModules(DslList dslList, Iterable iterable) {
            dslList.getClass();
            iterable.getClass();
            this._builder.addAllModules(iterable);
        }

        public final /* synthetic */ void addAllRequestUrlOverrides(DslList dslList, Iterable iterable) {
            dslList.getClass();
            iterable.getClass();
            this._builder.addAllRequestUrlOverrides(iterable);
        }

        public final /* synthetic */ void addAllScarEligibleFormats(DslList dslList, Iterable iterable) {
            dslList.getClass();
            iterable.getClass();
            this._builder.addAllScarEligibleFormats(iterable);
        }

        public final /* synthetic */ void addModules(DslList dslList, ModuleOuterClass.Module module) {
            dslList.getClass();
            module.getClass();
            this._builder.addModules(module);
        }

        public final /* synthetic */ void addRequestUrlOverrides(DslList dslList, InitializationResponseOuterClass.RequestUrlOverride requestUrlOverride) {
            dslList.getClass();
            requestUrlOverride.getClass();
            this._builder.addRequestUrlOverrides(requestUrlOverride);
        }

        public final /* synthetic */ void addScarEligibleFormats(DslList dslList, AdFormatOuterClass.AdFormat adFormat) {
            dslList.getClass();
            adFormat.getClass();
            this._builder.addScarEligibleFormats(adFormat);
        }

        public final void clearCountOfLastShownCampaigns() {
            this._builder.clearCountOfLastShownCampaigns();
        }

        public final void clearError() {
            this._builder.clearError();
        }

        public final /* synthetic */ void clearModules(DslList dslList) {
            dslList.getClass();
            this._builder.clearModules();
        }

        public final void clearNativeConfiguration() {
            this._builder.clearNativeConfiguration();
        }

        public final /* synthetic */ void clearRequestUrlOverrides(DslList dslList) {
            dslList.getClass();
            this._builder.clearRequestUrlOverrides();
        }

        public final /* synthetic */ void clearScarEligibleFormats(DslList dslList) {
            dslList.getClass();
            this._builder.clearScarEligibleFormats();
        }

        public final /* synthetic */ void clearScarPlacements(DslMap dslMap) {
            dslMap.getClass();
            this._builder.clearScarPlacements();
        }

        public final void clearTriggerInitializationCompletedRequest() {
            this._builder.clearTriggerInitializationCompletedRequest();
        }

        public final void clearUniversalRequestUrl() {
            this._builder.clearUniversalRequestUrl();
        }

        public final int getCountOfLastShownCampaigns() {
            return this._builder.getCountOfLastShownCampaigns();
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
            return InitializationResponseKtKt.getErrorOrNull(dsl._builder);
        }

        public final /* synthetic */ DslList getModules() {
            List<ModuleOuterClass.Module> modulesList = this._builder.getModulesList();
            modulesList.getClass();
            return new DslList(modulesList);
        }

        @NotNull
        public final NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration() {
            NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration = this._builder.getNativeConfiguration();
            nativeConfiguration.getClass();
            return nativeConfiguration;
        }

        public final /* synthetic */ DslList getRequestUrlOverrides() {
            List<InitializationResponseOuterClass.RequestUrlOverride> requestUrlOverridesList = this._builder.getRequestUrlOverridesList();
            requestUrlOverridesList.getClass();
            return new DslList(requestUrlOverridesList);
        }

        public final /* synthetic */ DslList getScarEligibleFormats() {
            List<AdFormatOuterClass.AdFormat> scarEligibleFormatsList = this._builder.getScarEligibleFormatsList();
            scarEligibleFormatsList.getClass();
            return new DslList(scarEligibleFormatsList);
        }

        public final /* synthetic */ DslMap getScarPlacementsMap() {
            Map<String, InitializationResponseOuterClass.Placement> scarPlacementsMap = this._builder.getScarPlacementsMap();
            scarPlacementsMap.getClass();
            return new DslMap(scarPlacementsMap);
        }

        public final boolean getTriggerInitializationCompletedRequest() {
            return this._builder.getTriggerInitializationCompletedRequest();
        }

        @NotNull
        public final String getUniversalRequestUrl() {
            String universalRequestUrl = this._builder.getUniversalRequestUrl();
            universalRequestUrl.getClass();
            return universalRequestUrl;
        }

        public final boolean hasError() {
            return this._builder.hasError();
        }

        public final boolean hasNativeConfiguration() {
            return this._builder.hasNativeConfiguration();
        }

        public final boolean hasUniversalRequestUrl() {
            return this._builder.hasUniversalRequestUrl();
        }

        public final /* synthetic */ void plusAssignAllModules(DslList<ModuleOuterClass.Module, ModulesProxy> dslList, Iterable<ModuleOuterClass.Module> iterable) {
            dslList.getClass();
            iterable.getClass();
            addAllModules(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAllRequestUrlOverrides(DslList<InitializationResponseOuterClass.RequestUrlOverride, RequestUrlOverridesProxy> dslList, Iterable<InitializationResponseOuterClass.RequestUrlOverride> iterable) {
            dslList.getClass();
            iterable.getClass();
            addAllRequestUrlOverrides(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAllScarEligibleFormats(DslList<AdFormatOuterClass.AdFormat, ScarEligibleFormatsProxy> dslList, Iterable<? extends AdFormatOuterClass.AdFormat> iterable) {
            dslList.getClass();
            iterable.getClass();
            addAllScarEligibleFormats(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignModules(DslList<ModuleOuterClass.Module, ModulesProxy> dslList, ModuleOuterClass.Module module) {
            dslList.getClass();
            module.getClass();
            addModules(dslList, module);
        }

        public final /* synthetic */ void plusAssignRequestUrlOverrides(DslList<InitializationResponseOuterClass.RequestUrlOverride, RequestUrlOverridesProxy> dslList, InitializationResponseOuterClass.RequestUrlOverride requestUrlOverride) {
            dslList.getClass();
            requestUrlOverride.getClass();
            addRequestUrlOverrides(dslList, requestUrlOverride);
        }

        public final /* synthetic */ void plusAssignScarEligibleFormats(DslList<AdFormatOuterClass.AdFormat, ScarEligibleFormatsProxy> dslList, AdFormatOuterClass.AdFormat adFormat) {
            dslList.getClass();
            adFormat.getClass();
            addScarEligibleFormats(dslList, adFormat);
        }

        public final /* synthetic */ void putAllScarPlacements(DslMap dslMap, Map map) {
            dslMap.getClass();
            map.getClass();
            this._builder.putAllScarPlacements(map);
        }

        public final void putScarPlacements(@NotNull DslMap<String, InitializationResponseOuterClass.Placement, ScarPlacementsProxy> dslMap, @NotNull String str, @NotNull InitializationResponseOuterClass.Placement placement) {
            dslMap.getClass();
            str.getClass();
            placement.getClass();
            this._builder.putScarPlacements(str, placement);
        }

        public final /* synthetic */ void removeScarPlacements(DslMap dslMap, String str) {
            dslMap.getClass();
            str.getClass();
            this._builder.removeScarPlacements(str);
        }

        public final void setCountOfLastShownCampaigns(int i) {
            this._builder.setCountOfLastShownCampaigns(i);
        }

        public final void setError(@NotNull ErrorOuterClass.Error error) {
            error.getClass();
            this._builder.setError(error);
        }

        public final /* synthetic */ void setModules(DslList dslList, int i, ModuleOuterClass.Module module) {
            dslList.getClass();
            module.getClass();
            this._builder.setModules(i, module);
        }

        public final void setNativeConfiguration(@NotNull NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration) {
            nativeConfiguration.getClass();
            this._builder.setNativeConfiguration(nativeConfiguration);
        }

        public final /* synthetic */ void setRequestUrlOverrides(DslList dslList, int i, InitializationResponseOuterClass.RequestUrlOverride requestUrlOverride) {
            dslList.getClass();
            requestUrlOverride.getClass();
            this._builder.setRequestUrlOverrides(i, requestUrlOverride);
        }

        public final /* synthetic */ void setScarEligibleFormats(DslList dslList, int i, AdFormatOuterClass.AdFormat adFormat) {
            dslList.getClass();
            adFormat.getClass();
            this._builder.setScarEligibleFormats(i, adFormat);
        }

        public final /* synthetic */ void setScarPlacements(DslMap<String, InitializationResponseOuterClass.Placement, ScarPlacementsProxy> dslMap, String str, InitializationResponseOuterClass.Placement placement) {
            dslMap.getClass();
            str.getClass();
            placement.getClass();
            putScarPlacements(dslMap, str, placement);
        }

        public final void setTriggerInitializationCompletedRequest(boolean z) {
            this._builder.setTriggerInitializationCompletedRequest(z);
        }

        public final void setUniversalRequestUrl(@NotNull String str) {
            str.getClass();
            this._builder.setUniversalRequestUrl(str);
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/InitializationResponseKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/InitializationResponseKt$Dsl;", "builder", "Lgatewayprotocol/v1/InitializationResponseOuterClass$InitializationResponse$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(InitializationResponseOuterClass.InitializationResponse.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(InitializationResponseOuterClass.InitializationResponse.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }
    }
}

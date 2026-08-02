package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.ironsource.U3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.TimestampsOuterClass;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/DiagnosticEventKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DiagnosticEventKt {

    @NotNull
    public static final DiagnosticEventKt INSTANCE = new DiagnosticEventKt();

    private DiagnosticEventKt() {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001c\n\u0002\b\n\b\u0007\u0018\u0000 \u009e\u00012\u00020\u0001:\b\u009e\u0001\u009f\u0001 \u0001¡\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u001d\u001a\u00020\u0016J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010&\u001a\u00020\u0016J\u0006\u0010'\u001a\u00020\u001fJ\u0006\u0010.\u001a\u00020\u0016J\u0006\u0010/\u001a\u00020\u001fJ3\u00105\u001a\u00020\u0016*\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u000202012\u0006\u00106\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u0017H\u0007¢\u0006\u0002\b7J4\u00108\u001a\u00020\u0016*\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u000202012\u0006\u00106\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u0017H\u0087\n¢\u0006\u0002\b9J+\u0010:\u001a\u00020\u0016*\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u000202012\u0006\u00106\u001a\u00020\u0017H\u0007¢\u0006\u0002\b;J7\u0010<\u001a\u00020\u0016*\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u000202012\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170>H\u0007¢\u0006\u0002\b?J#\u0010@\u001a\u00020\u0016*\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020201H\u0007¢\u0006\u0002\bAJ3\u00105\u001a\u00020\u0016*\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020C012\u0006\u00106\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u000fH\u0007¢\u0006\u0002\bEJ4\u00108\u001a\u00020\u0016*\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020C012\u0006\u00106\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u000fH\u0087\n¢\u0006\u0002\bFJ+\u0010:\u001a\u00020\u0016*\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020C012\u0006\u00106\u001a\u00020\u0017H\u0007¢\u0006\u0002\bGJ7\u0010<\u001a\u00020\u0016*\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020C012\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000f0>H\u0007¢\u0006\u0002\bHJ#\u0010@\u001a\u00020\u0016*\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020C01H\u0007¢\u0006\u0002\bIJ\u0006\u0010M\u001a\u00020\u0016J\u0006\u0010T\u001a\u00020\u0016J\u0006\u0010U\u001a\u00020\u001fJ\u0006\u0010Y\u001a\u00020\u0016J\u0006\u0010Z\u001a\u00020\u001fJ\u0006\u0010d\u001a\u00020\u0016J\u0006\u0010e\u001a\u00020\u001fJ\u0006\u0010k\u001a\u00020\u0016J\u0006\u0010l\u001a\u00020\u001fJ\u0006\u0010p\u001a\u00020\u0016J\u0006\u0010q\u001a\u00020\u001fJ\u0006\u0010{\u001a\u00020\u0016J\u0006\u0010|\u001a\u00020\u001fJ\u0007\u0010\u0080\u0001\u001a\u00020\u0016J\u0007\u0010\u0081\u0001\u001a\u00020\u001fJ\u0007\u0010\u0085\u0001\u001a\u00020\u0016J\u0007\u0010\u0086\u0001\u001a\u00020\u001fJ\u0007\u0010\u008a\u0001\u001a\u00020\u0016J\u0007\u0010\u008b\u0001\u001a\u00020\u001fJ+\u0010\u0092\u0001\u001a\u00020\u0016*\u0011\u0012\u0005\u0012\u00030\u008e\u0001\u0012\u0005\u0012\u00030\u008f\u00010\u008d\u00012\u0007\u0010\b\u001a\u00030\u008e\u0001H\u0007¢\u0006\u0003\b\u0093\u0001J,\u0010\u0094\u0001\u001a\u00020\u0016*\u0011\u0012\u0005\u0012\u00030\u008e\u0001\u0012\u0005\u0012\u00030\u008f\u00010\u008d\u00012\u0007\u0010\b\u001a\u00030\u008e\u0001H\u0087\n¢\u0006\u0003\b\u0095\u0001J3\u0010\u0096\u0001\u001a\u00020\u0016*\u0011\u0012\u0005\u0012\u00030\u008e\u0001\u0012\u0005\u0012\u00030\u008f\u00010\u008d\u00012\u000f\u0010\u0097\u0001\u001a\n\u0012\u0005\u0012\u00030\u008e\u00010\u0098\u0001H\u0007¢\u0006\u0003\b\u0099\u0001J4\u0010\u0094\u0001\u001a\u00020\u0016*\u0011\u0012\u0005\u0012\u00030\u008e\u0001\u0012\u0005\u0012\u00030\u008f\u00010\u008d\u00012\u000f\u0010\u0097\u0001\u001a\n\u0012\u0005\u0012\u00030\u008e\u00010\u0098\u0001H\u0087\n¢\u0006\u0003\b\u009a\u0001J4\u00108\u001a\u00020\u0016*\u0011\u0012\u0005\u0012\u00030\u008e\u0001\u0012\u0005\u0012\u00030\u008f\u00010\u008d\u00012\u0007\u0010\u009b\u0001\u001a\u00020\u000f2\u0007\u0010\b\u001a\u00030\u008e\u0001H\u0087\u0002¢\u0006\u0003\b\u009c\u0001J!\u0010@\u001a\u00020\u0016*\u0011\u0012\u0005\u0012\u00030\u008e\u0001\u0012\u0005\u0012\u00030\u008f\u00010\u008d\u0001H\u0007¢\u0006\u0003\b\u009d\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u000f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u00178G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010!\u001a\u00020 2\u0006\u0010\b\u001a\u00020 8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010)\u001a\u00020(2\u0006\u0010\b\u001a\u00020(8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R#\u00100\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u000202018G¢\u0006\u0006\u001a\u0004\b3\u00104R#\u0010B\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020C018G¢\u0006\u0006\u001a\u0004\bD\u00104R$\u0010J\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u000f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010\u0012\"\u0004\bL\u0010\u0014R$\u0010O\u001a\u00020N2\u0006\u0010\b\u001a\u00020N8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR$\u0010V\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u00178G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bW\u0010\u001a\"\u0004\bX\u0010\u001cR$\u0010\\\u001a\u00020[2\u0006\u0010\b\u001a\u00020[8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R$\u0010a\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u000f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bb\u0010\u0012\"\u0004\bc\u0010\u0014R$\u0010f\u001a\u00020\u001f2\u0006\u0010\b\u001a\u00020\u001f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR$\u0010m\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u000f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bn\u0010\u0012\"\u0004\bo\u0010\u0014R$\u0010s\u001a\u00020r2\u0006\u0010\b\u001a\u00020r8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR$\u0010x\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u000f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\by\u0010\u0012\"\u0004\bz\u0010\u0014R$\u0010}\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u00178G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b~\u0010\u001a\"\u0004\b\u007f\u0010\u001cR'\u0010\u0082\u0001\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u00178G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0083\u0001\u0010\u001a\"\u0005\b\u0084\u0001\u0010\u001cR'\u0010\u0087\u0001\u001a\u00020N2\u0006\u0010\b\u001a\u00020N8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0088\u0001\u0010Q\"\u0005\b\u0089\u0001\u0010SR#\u0010\u008c\u0001\u001a\u0011\u0012\u0005\u0012\u00030\u008e\u0001\u0012\u0005\u0012\u00030\u008f\u00010\u008d\u00018F¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001¨\u0006¢\u0001"}, d2 = {"Lgatewayprotocol/v1/DiagnosticEventKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent$Builder;", "<init>", "(Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent$Builder;)V", "_build", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent;", U3.i.X, "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventType;", "eventType", "getEventType", "()Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventType;", "setEventType", "(Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventType;)V", "", "eventTypeValue", "getEventTypeValue", "()I", "setEventTypeValue", "(I)V", "clearEventType", "", "", "customEventType", "getCustomEventType", "()Ljava/lang/String;", "setCustomEventType", "(Ljava/lang/String;)V", "clearCustomEventType", "hasCustomEventType", "", "Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "timestamps", "getTimestamps", "()Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "setTimestamps", "(Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;)V", "clearTimestamps", "hasTimestamps", "", "timeValue", "getTimeValue", "()D", "setTimeValue", "(D)V", "clearTimeValue", "hasTimeValue", "stringTags", "Lcom/google/protobuf/kotlin/DslMap;", "Lgatewayprotocol/v1/DiagnosticEventKt$Dsl$StringTagsProxy;", "getStringTagsMap", "()Lcom/google/protobuf/kotlin/DslMap;", "put", U3.i.W, "putStringTags", "set", "setStringTags", "remove", "removeStringTags", "putAll", "map", "", "putAllStringTags", "clear", "clearStringTags", "intTags", "Lgatewayprotocol/v1/DiagnosticEventKt$Dsl$IntTagsProxy;", "getIntTagsMap", "putIntTags", "setIntTags", "removeIntTags", "putAllIntTags", "clearIntTags", "eventId", "getEventId", "setEventId", "clearEventId", "Lcom/google/protobuf/ByteString;", "impressionOpportunityId", "getImpressionOpportunityId", "()Lcom/google/protobuf/ByteString;", "setImpressionOpportunityId", "(Lcom/google/protobuf/ByteString;)V", "clearImpressionOpportunityId", "hasImpressionOpportunityId", "placementId", "getPlacementId", "setPlacementId", "clearPlacementId", "hasPlacementId", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "adType", "getAdType", "()Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "setAdType", "(Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;)V", "adTypeValue", "getAdTypeValue", "setAdTypeValue", "clearAdType", "hasAdType", HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "getIsHeaderBidding", "()Z", "setIsHeaderBidding", "(Z)V", "clearIsHeaderBidding", "hasIsHeaderBidding", "headerBiddingTokenNumber", "getHeaderBiddingTokenNumber", "setHeaderBiddingTokenNumber", "clearHeaderBiddingTokenNumber", "hasHeaderBiddingTokenNumber", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "adFormat", "getAdFormat", "()Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "setAdFormat", "(Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;)V", "adFormatValue", "getAdFormatValue", "setAdFormatValue", "clearAdFormat", "hasAdFormat", "reason", "getReason", "setReason", "clearReason", "hasReason", "reasonDebug", "getReasonDebug", "setReasonDebug", "clearReasonDebug", "hasReasonDebug", "errorToken", "getErrorToken", "setErrorToken", "clearErrorToken", "hasErrorToken", "tags", "Lcom/google/protobuf/kotlin/DslList;", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticTag;", "Lgatewayprotocol/v1/DiagnosticEventKt$Dsl$TagsProxy;", "getTags", "()Lcom/google/protobuf/kotlin/DslList;", "add", "addTags", "plusAssign", "plusAssignTags", "addAll", "values", "", "addAllTags", "plusAssignAllTags", "index", "setTags", "clearTags", "Companion", "StringTagsProxy", "IntTagsProxy", "TagsProxy", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder _builder;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/DiagnosticEventKt$Dsl$IntTagsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class IntTagsProxy extends DslProxy {
            private IntTagsProxy() {
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/DiagnosticEventKt$Dsl$StringTagsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class StringTagsProxy extends DslProxy {
            private StringTagsProxy() {
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/DiagnosticEventKt$Dsl$TagsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class TagsProxy extends DslProxy {
            private TagsProxy() {
            }
        }

        private Dsl(DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ DiagnosticEventRequestOuterClass.DiagnosticEvent _build() {
            DiagnosticEventRequestOuterClass.DiagnosticEvent build = this._builder.build();
            build.getClass();
            return build;
        }

        public final /* synthetic */ void addAllTags(DslList dslList, Iterable iterable) {
            dslList.getClass();
            iterable.getClass();
            this._builder.addAllTags(iterable);
        }

        public final /* synthetic */ void addTags(DslList dslList, DiagnosticEventRequestOuterClass.DiagnosticTag diagnosticTag) {
            dslList.getClass();
            diagnosticTag.getClass();
            this._builder.addTags(diagnosticTag);
        }

        public final void clearAdFormat() {
            this._builder.clearAdFormat();
        }

        public final void clearAdType() {
            this._builder.clearAdType();
        }

        public final void clearCustomEventType() {
            this._builder.clearCustomEventType();
        }

        public final void clearErrorToken() {
            this._builder.clearErrorToken();
        }

        public final void clearEventId() {
            this._builder.clearEventId();
        }

        public final void clearEventType() {
            this._builder.clearEventType();
        }

        public final void clearHeaderBiddingTokenNumber() {
            this._builder.clearHeaderBiddingTokenNumber();
        }

        public final void clearImpressionOpportunityId() {
            this._builder.clearImpressionOpportunityId();
        }

        public final /* synthetic */ void clearIntTags(DslMap dslMap) {
            dslMap.getClass();
            this._builder.clearIntTags();
        }

        public final void clearIsHeaderBidding() {
            this._builder.clearIsHeaderBidding();
        }

        public final void clearPlacementId() {
            this._builder.clearPlacementId();
        }

        public final void clearReason() {
            this._builder.clearReason();
        }

        public final void clearReasonDebug() {
            this._builder.clearReasonDebug();
        }

        public final /* synthetic */ void clearStringTags(DslMap dslMap) {
            dslMap.getClass();
            this._builder.clearStringTags();
        }

        public final /* synthetic */ void clearTags(DslList dslList) {
            dslList.getClass();
            this._builder.clearTags();
        }

        public final void clearTimeValue() {
            this._builder.clearTimeValue();
        }

        public final void clearTimestamps() {
            this._builder.clearTimestamps();
        }

        @NotNull
        public final AdFormatOuterClass.AdFormat getAdFormat() {
            AdFormatOuterClass.AdFormat adFormat = this._builder.getAdFormat();
            adFormat.getClass();
            return adFormat;
        }

        public final int getAdFormatValue() {
            return this._builder.getAdFormatValue();
        }

        @NotNull
        public final DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
            DiagnosticEventRequestOuterClass.DiagnosticAdType adType = this._builder.getAdType();
            adType.getClass();
            return adType;
        }

        public final int getAdTypeValue() {
            return this._builder.getAdTypeValue();
        }

        @NotNull
        public final String getCustomEventType() {
            String customEventType = this._builder.getCustomEventType();
            customEventType.getClass();
            return customEventType;
        }

        @NotNull
        public final ByteString getErrorToken() {
            ByteString errorToken = this._builder.getErrorToken();
            errorToken.getClass();
            return errorToken;
        }

        public final int getEventId() {
            return this._builder.getEventId();
        }

        @NotNull
        public final DiagnosticEventRequestOuterClass.DiagnosticEventType getEventType() {
            DiagnosticEventRequestOuterClass.DiagnosticEventType eventType = this._builder.getEventType();
            eventType.getClass();
            return eventType;
        }

        public final int getEventTypeValue() {
            return this._builder.getEventTypeValue();
        }

        public final int getHeaderBiddingTokenNumber() {
            return this._builder.getHeaderBiddingTokenNumber();
        }

        @NotNull
        public final ByteString getImpressionOpportunityId() {
            ByteString impressionOpportunityId = this._builder.getImpressionOpportunityId();
            impressionOpportunityId.getClass();
            return impressionOpportunityId;
        }

        public final /* synthetic */ DslMap getIntTagsMap() {
            Map<String, Integer> intTagsMap = this._builder.getIntTagsMap();
            intTagsMap.getClass();
            return new DslMap(intTagsMap);
        }

        public final boolean getIsHeaderBidding() {
            return this._builder.getIsHeaderBidding();
        }

        @NotNull
        public final String getPlacementId() {
            String placementId = this._builder.getPlacementId();
            placementId.getClass();
            return placementId;
        }

        @NotNull
        public final String getReason() {
            String reason = this._builder.getReason();
            reason.getClass();
            return reason;
        }

        @NotNull
        public final String getReasonDebug() {
            String reasonDebug = this._builder.getReasonDebug();
            reasonDebug.getClass();
            return reasonDebug;
        }

        public final /* synthetic */ DslMap getStringTagsMap() {
            Map<String, String> stringTagsMap = this._builder.getStringTagsMap();
            stringTagsMap.getClass();
            return new DslMap(stringTagsMap);
        }

        public final /* synthetic */ DslList getTags() {
            List<DiagnosticEventRequestOuterClass.DiagnosticTag> tagsList = this._builder.getTagsList();
            tagsList.getClass();
            return new DslList(tagsList);
        }

        public final double getTimeValue() {
            return this._builder.getTimeValue();
        }

        @NotNull
        public final TimestampsOuterClass.Timestamps getTimestamps() {
            TimestampsOuterClass.Timestamps timestamps = this._builder.getTimestamps();
            timestamps.getClass();
            return timestamps;
        }

        public final boolean hasAdFormat() {
            return this._builder.hasAdFormat();
        }

        public final boolean hasAdType() {
            return this._builder.hasAdType();
        }

        public final boolean hasCustomEventType() {
            return this._builder.hasCustomEventType();
        }

        public final boolean hasErrorToken() {
            return this._builder.hasErrorToken();
        }

        public final boolean hasHeaderBiddingTokenNumber() {
            return this._builder.hasHeaderBiddingTokenNumber();
        }

        public final boolean hasImpressionOpportunityId() {
            return this._builder.hasImpressionOpportunityId();
        }

        public final boolean hasIsHeaderBidding() {
            return this._builder.hasIsHeaderBidding();
        }

        public final boolean hasPlacementId() {
            return this._builder.hasPlacementId();
        }

        public final boolean hasReason() {
            return this._builder.hasReason();
        }

        public final boolean hasReasonDebug() {
            return this._builder.hasReasonDebug();
        }

        public final boolean hasTimeValue() {
            return this._builder.hasTimeValue();
        }

        public final boolean hasTimestamps() {
            return this._builder.hasTimestamps();
        }

        public final /* synthetic */ void plusAssignAllTags(DslList<DiagnosticEventRequestOuterClass.DiagnosticTag, TagsProxy> dslList, Iterable<DiagnosticEventRequestOuterClass.DiagnosticTag> iterable) {
            dslList.getClass();
            iterable.getClass();
            addAllTags(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignTags(DslList<DiagnosticEventRequestOuterClass.DiagnosticTag, TagsProxy> dslList, DiagnosticEventRequestOuterClass.DiagnosticTag diagnosticTag) {
            dslList.getClass();
            diagnosticTag.getClass();
            addTags(dslList, diagnosticTag);
        }

        public final /* synthetic */ void putAllIntTags(DslMap dslMap, Map map) {
            dslMap.getClass();
            map.getClass();
            this._builder.putAllIntTags(map);
        }

        public final /* synthetic */ void putAllStringTags(DslMap dslMap, Map map) {
            dslMap.getClass();
            map.getClass();
            this._builder.putAllStringTags(map);
        }

        public final void putIntTags(@NotNull DslMap<String, Integer, IntTagsProxy> dslMap, @NotNull String str, int i) {
            dslMap.getClass();
            str.getClass();
            this._builder.putIntTags(str, i);
        }

        public final void putStringTags(@NotNull DslMap<String, String, StringTagsProxy> dslMap, @NotNull String str, @NotNull String str2) {
            dslMap.getClass();
            str.getClass();
            str2.getClass();
            this._builder.putStringTags(str, str2);
        }

        public final /* synthetic */ void removeIntTags(DslMap dslMap, String str) {
            dslMap.getClass();
            str.getClass();
            this._builder.removeIntTags(str);
        }

        public final /* synthetic */ void removeStringTags(DslMap dslMap, String str) {
            dslMap.getClass();
            str.getClass();
            this._builder.removeStringTags(str);
        }

        public final void setAdFormat(@NotNull AdFormatOuterClass.AdFormat adFormat) {
            adFormat.getClass();
            this._builder.setAdFormat(adFormat);
        }

        public final void setAdFormatValue(int i) {
            this._builder.setAdFormatValue(i);
        }

        public final void setAdType(@NotNull DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType) {
            diagnosticAdType.getClass();
            this._builder.setAdType(diagnosticAdType);
        }

        public final void setAdTypeValue(int i) {
            this._builder.setAdTypeValue(i);
        }

        public final void setCustomEventType(@NotNull String str) {
            str.getClass();
            this._builder.setCustomEventType(str);
        }

        public final void setErrorToken(@NotNull ByteString byteString) {
            byteString.getClass();
            this._builder.setErrorToken(byteString);
        }

        public final void setEventId(int i) {
            this._builder.setEventId(i);
        }

        public final void setEventType(@NotNull DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
            diagnosticEventType.getClass();
            this._builder.setEventType(diagnosticEventType);
        }

        public final void setEventTypeValue(int i) {
            this._builder.setEventTypeValue(i);
        }

        public final void setHeaderBiddingTokenNumber(int i) {
            this._builder.setHeaderBiddingTokenNumber(i);
        }

        public final void setImpressionOpportunityId(@NotNull ByteString byteString) {
            byteString.getClass();
            this._builder.setImpressionOpportunityId(byteString);
        }

        public final /* synthetic */ void setIntTags(DslMap<String, Integer, IntTagsProxy> dslMap, String str, int i) {
            dslMap.getClass();
            str.getClass();
            putIntTags(dslMap, str, i);
        }

        public final void setIsHeaderBidding(boolean z) {
            this._builder.setIsHeaderBidding(z);
        }

        public final void setPlacementId(@NotNull String str) {
            str.getClass();
            this._builder.setPlacementId(str);
        }

        public final void setReason(@NotNull String str) {
            str.getClass();
            this._builder.setReason(str);
        }

        public final void setReasonDebug(@NotNull String str) {
            str.getClass();
            this._builder.setReasonDebug(str);
        }

        public final /* synthetic */ void setStringTags(DslMap<String, String, StringTagsProxy> dslMap, String str, String str2) {
            dslMap.getClass();
            str.getClass();
            str2.getClass();
            putStringTags(dslMap, str, str2);
        }

        public final /* synthetic */ void setTags(DslList dslList, int i, DiagnosticEventRequestOuterClass.DiagnosticTag diagnosticTag) {
            dslList.getClass();
            diagnosticTag.getClass();
            this._builder.setTags(i, diagnosticTag);
        }

        public final void setTimeValue(double d) {
            this._builder.setTimeValue(d);
        }

        public final void setTimestamps(@NotNull TimestampsOuterClass.Timestamps timestamps) {
            timestamps.getClass();
            this._builder.setTimestamps(timestamps);
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/DiagnosticEventKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/DiagnosticEventKt$Dsl;", "builder", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }
    }
}

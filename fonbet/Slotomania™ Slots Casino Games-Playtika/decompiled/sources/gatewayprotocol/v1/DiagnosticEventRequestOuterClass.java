package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.TimestampsOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class DiagnosticEventRequestOuterClass {

    public interface DiagnosticEventOrBuilder extends MessageLiteOrBuilder {
        boolean containsIntTags(String str);

        boolean containsStringTags(String str);

        AdFormatOuterClass.AdFormat getAdFormat();

        int getAdFormatValue();

        DiagnosticAdType getAdType();

        int getAdTypeValue();

        String getCustomEventType();

        ByteString getCustomEventTypeBytes();

        ByteString getErrorToken();

        int getEventId();

        DiagnosticEventType getEventType();

        int getEventTypeValue();

        int getHeaderBiddingTokenNumber();

        ByteString getImpressionOpportunityId();

        @Deprecated
        Map<String, Integer> getIntTags();

        int getIntTagsCount();

        Map<String, Integer> getIntTagsMap();

        int getIntTagsOrDefault(String str, int i);

        int getIntTagsOrThrow(String str);

        boolean getIsHeaderBidding();

        String getPlacementId();

        ByteString getPlacementIdBytes();

        String getReason();

        ByteString getReasonBytes();

        String getReasonDebug();

        ByteString getReasonDebugBytes();

        @Deprecated
        Map<String, String> getStringTags();

        int getStringTagsCount();

        Map<String, String> getStringTagsMap();

        String getStringTagsOrDefault(String str, String str2);

        String getStringTagsOrThrow(String str);

        DiagnosticTag getTags(int i);

        int getTagsCount();

        List<DiagnosticTag> getTagsList();

        double getTimeValue();

        TimestampsOuterClass.Timestamps getTimestamps();

        boolean hasAdFormat();

        boolean hasAdType();

        boolean hasCustomEventType();

        boolean hasErrorToken();

        boolean hasHeaderBiddingTokenNumber();

        boolean hasImpressionOpportunityId();

        boolean hasIsHeaderBidding();

        boolean hasPlacementId();

        boolean hasReason();

        boolean hasReasonDebug();

        boolean hasTimeValue();

        boolean hasTimestamps();
    }

    public interface DiagnosticEventRequestOrBuilder extends MessageLiteOrBuilder {
        DiagnosticEvent getBatch(int i);

        int getBatchCount();

        List<DiagnosticEvent> getBatchList();
    }

    public interface DiagnosticTagOrBuilder extends MessageLiteOrBuilder {
        String getCustomTagType();

        ByteString getCustomTagTypeBytes();

        int getIntValue();

        String getStringValue();

        ByteString getStringValueBytes();

        @Deprecated
        DiagnosticTagType getTagType(int i);

        @Deprecated
        int getTagTypeCount();

        @Deprecated
        List<DiagnosticTagType> getTagTypeList();

        @Deprecated
        int getTagTypeValue(int i);

        @Deprecated
        List<Integer> getTagTypeValueList();

        DiagnosticTagType getType();

        int getTypeValue();

        DiagnosticTag.ValueCase getValueCase();

        boolean hasCustomTagType();

        boolean hasIntValue();

        boolean hasStringValue();
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private DiagnosticEventRequestOuterClass() {
    }

    public enum DiagnosticEventType implements Internal.EnumLite {
        DIAGNOSTIC_EVENT_TYPE_UNSPECIFIED(0),
        DIAGNOSTIC_EVENT_TYPE_CUSTOM(1),
        DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_STARTED(2),
        DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_SUCCESS_TIME(3),
        DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_FAILURE_TIME(4),
        DIAGNOSTIC_EVENT_TYPE_NATIVE_INIT_REQUEST_SUCCESS_TIME(5),
        DIAGNOSTIC_EVENT_TYPE_NATIVE_INIT_REQUEST_FAILURE_TIME(6),
        DIAGNOSTIC_EVENT_TYPE_NATIVE_CLEAN_ASSETS_SUCCESS_TIME(7),
        DIAGNOSTIC_EVENT_TYPE_NATIVE_CLEAN_ASSETS_FAILURE_TIME(8),
        DIAGNOSTIC_EVENT_TYPE_NATIVE_CLEAN_WEBVIEW_SUCCESS_TIME(9),
        DIAGNOSTIC_EVENT_TYPE_NATIVE_CLEAN_WEBVIEW_FAILURE_TIME(10),
        DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_COMPLETED_EVENT_REQUEST_STARTED(11),
        DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_COMPLETED_EVENT_REQUEST_SUCCESS_TIME(12),
        DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_COMPLETED_EVENT_REQUEST_FAILURE_TIME(13),
        DIAGNOSTIC_EVENT_TYPE_NATIVE_GATEWAY_TOKEN_STARTED(14),
        DIAGNOSTIC_EVENT_TYPE_NATIVE_GATEWAY_TOKEN_SUCCESS_TIME(15),
        DIAGNOSTIC_EVENT_TYPE_NATIVE_GATEWAY_TOKEN_FAILURE_TIME(16),
        DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED(17),
        DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_SUCCESS_TIME(18),
        DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FAILURE_TIME(19),
        DIAGNOSTIC_EVENT_TYPE_NATIVE_CREATE_AD_OBJECT_SUCCESS_TIME(20),
        DIAGNOSTIC_EVENT_TYPE_NATIVE_CREATE_AD_OBJECT_FAILURE_TIME(21),
        DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_CACHE_SUCCESS_TIME(22),
        DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_CACHE_FAILURE_TIME(23),
        DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_SUCCESS_TIME(24),
        DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_FAILURE_TIME(25),
        DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER(26),
        DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_TERMINATED(27),
        DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING(28),
        DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME(29),
        DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME(30),
        DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FILE_SUCCESS_TIME(31),
        DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FILE_FAILURE_TIME(32),
        DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_STARTED(33),
        DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_SUCCESS_TIME(34),
        DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME(35),
        DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_WV_STARTED(36),
        DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_CLICKED(37),
        DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP(38),
        DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_STARTED_AD_VIEWER(39),
        DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_REWARDED(40),
        DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_SENT(41),
        DIAGNOSTIC_EVENT_TYPE_NATIVE_SAVED_OPERATIVE_EVENT_SENT(42),
        DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE(43),
        DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_SUCCESS_TIME(44),
        DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_FAILURE_TIME(45),
        DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK(46),
        DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE(47),
        UNRECOGNIZED(-1);

        public static final int DIAGNOSTIC_EVENT_TYPE_CUSTOM_VALUE = 1;
        public static final int DIAGNOSTIC_EVENT_TYPE_NATIVE_CLEAN_ASSETS_FAILURE_TIME_VALUE = 8;
        public static final int DIAGNOSTIC_EVENT_TYPE_NATIVE_CLEAN_ASSETS_SUCCESS_TIME_VALUE = 7;
        public static final int DIAGNOSTIC_EVENT_TYPE_NATIVE_CLEAN_WEBVIEW_FAILURE_TIME_VALUE = 10;
        public static final int DIAGNOSTIC_EVENT_TYPE_NATIVE_CLEAN_WEBVIEW_SUCCESS_TIME_VALUE = 9;
        public static final int DIAGNOSTIC_EVENT_TYPE_NATIVE_CREATE_AD_OBJECT_FAILURE_TIME_VALUE = 21;
        public static final int DIAGNOSTIC_EVENT_TYPE_NATIVE_CREATE_AD_OBJECT_SUCCESS_TIME_VALUE = 20;
        public static final int DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE = 47;
        public static final int DIAGNOSTIC_EVENT_TYPE_NATIVE_GATEWAY_TOKEN_FAILURE_TIME_VALUE = 16;
        public static final int DIAGNOSTIC_EVENT_TYPE_NATIVE_GATEWAY_TOKEN_STARTED_VALUE = 14;
        public static final int DIAGNOSTIC_EVENT_TYPE_NATIVE_GATEWAY_TOKEN_SUCCESS_TIME_VALUE = 15;
        public static final int DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_COMPLETED_EVENT_REQUEST_FAILURE_TIME_VALUE = 13;
        public static final int DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_COMPLETED_EVENT_REQUEST_STARTED_VALUE = 11;
        public static final int DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_COMPLETED_EVENT_REQUEST_SUCCESS_TIME_VALUE = 12;
        public static final int DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_FAILURE_TIME_VALUE = 4;
        public static final int DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_STARTED_VALUE = 2;
        public static final int DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_SUCCESS_TIME_VALUE = 3;
        public static final int DIAGNOSTIC_EVENT_TYPE_NATIVE_INIT_REQUEST_FAILURE_TIME_VALUE = 6;
        public static final int DIAGNOSTIC_EVENT_TYPE_NATIVE_INIT_REQUEST_SUCCESS_TIME_VALUE = 5;
        public static final int DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_CACHE_FAILURE_TIME_VALUE = 23;
        public static final int DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_CACHE_SUCCESS_TIME_VALUE = 22;
        public static final int DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FAILURE_TIME_VALUE = 19;
        public static final int DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FILE_FAILURE_TIME_VALUE = 32;
        public static final int DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FILE_SUCCESS_TIME_VALUE = 31;
        public static final int DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE = 30;
        public static final int DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE = 29;
        public static final int DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE = 26;
        public static final int DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_VALUE = 17;
        public static final int DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_SUCCESS_TIME_VALUE = 18;
        public static final int DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE = 28;
        public static final int DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE = 46;
        public static final int DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE = 43;
        public static final int DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_SENT_VALUE = 41;
        public static final int DIAGNOSTIC_EVENT_TYPE_NATIVE_SAVED_OPERATIVE_EVENT_SENT_VALUE = 42;
        public static final int DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_CLICKED_VALUE = 37;
        public static final int DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE = 35;
        public static final int DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE = 38;
        public static final int DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_REWARDED_VALUE = 40;
        public static final int DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_STARTED_AD_VIEWER_VALUE = 39;
        public static final int DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_STARTED_VALUE = 33;
        public static final int DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_SUCCESS_TIME_VALUE = 34;
        public static final int DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_WV_STARTED_VALUE = 36;
        public static final int DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_FAILURE_TIME_VALUE = 45;
        public static final int DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_SUCCESS_TIME_VALUE = 44;
        public static final int DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_FAILURE_TIME_VALUE = 25;
        public static final int DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_SUCCESS_TIME_VALUE = 24;
        public static final int DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_TERMINATED_VALUE = 27;
        public static final int DIAGNOSTIC_EVENT_TYPE_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<DiagnosticEventType> internalValueMap = new Internal.EnumLiteMap<DiagnosticEventType>() { // from class: gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public DiagnosticEventType findValueByNumber(int i) {
                return DiagnosticEventType.forNumber(i);
            }
        };
        private final int value;

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static DiagnosticEventType valueOf(int i) {
            return forNumber(i);
        }

        public static DiagnosticEventType forNumber(int i) {
            switch (i) {
                case 0:
                    return DIAGNOSTIC_EVENT_TYPE_UNSPECIFIED;
                case 1:
                    return DIAGNOSTIC_EVENT_TYPE_CUSTOM;
                case 2:
                    return DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_STARTED;
                case 3:
                    return DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_SUCCESS_TIME;
                case 4:
                    return DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_FAILURE_TIME;
                case 5:
                    return DIAGNOSTIC_EVENT_TYPE_NATIVE_INIT_REQUEST_SUCCESS_TIME;
                case 6:
                    return DIAGNOSTIC_EVENT_TYPE_NATIVE_INIT_REQUEST_FAILURE_TIME;
                case 7:
                    return DIAGNOSTIC_EVENT_TYPE_NATIVE_CLEAN_ASSETS_SUCCESS_TIME;
                case 8:
                    return DIAGNOSTIC_EVENT_TYPE_NATIVE_CLEAN_ASSETS_FAILURE_TIME;
                case 9:
                    return DIAGNOSTIC_EVENT_TYPE_NATIVE_CLEAN_WEBVIEW_SUCCESS_TIME;
                case 10:
                    return DIAGNOSTIC_EVENT_TYPE_NATIVE_CLEAN_WEBVIEW_FAILURE_TIME;
                case 11:
                    return DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_COMPLETED_EVENT_REQUEST_STARTED;
                case 12:
                    return DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_COMPLETED_EVENT_REQUEST_SUCCESS_TIME;
                case 13:
                    return DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_COMPLETED_EVENT_REQUEST_FAILURE_TIME;
                case 14:
                    return DIAGNOSTIC_EVENT_TYPE_NATIVE_GATEWAY_TOKEN_STARTED;
                case 15:
                    return DIAGNOSTIC_EVENT_TYPE_NATIVE_GATEWAY_TOKEN_SUCCESS_TIME;
                case 16:
                    return DIAGNOSTIC_EVENT_TYPE_NATIVE_GATEWAY_TOKEN_FAILURE_TIME;
                case 17:
                    return DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED;
                case 18:
                    return DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_SUCCESS_TIME;
                case 19:
                    return DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FAILURE_TIME;
                case 20:
                    return DIAGNOSTIC_EVENT_TYPE_NATIVE_CREATE_AD_OBJECT_SUCCESS_TIME;
                case 21:
                    return DIAGNOSTIC_EVENT_TYPE_NATIVE_CREATE_AD_OBJECT_FAILURE_TIME;
                case 22:
                    return DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_CACHE_SUCCESS_TIME;
                case 23:
                    return DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_CACHE_FAILURE_TIME;
                case 24:
                    return DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_SUCCESS_TIME;
                case 25:
                    return DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_FAILURE_TIME;
                case 26:
                    return DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER;
                case 27:
                    return DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_TERMINATED;
                case 28:
                    return DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING;
                case 29:
                    return DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME;
                case 30:
                    return DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME;
                case 31:
                    return DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FILE_SUCCESS_TIME;
                case 32:
                    return DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FILE_FAILURE_TIME;
                case 33:
                    return DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_STARTED;
                case 34:
                    return DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_SUCCESS_TIME;
                case 35:
                    return DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME;
                case 36:
                    return DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_WV_STARTED;
                case 37:
                    return DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_CLICKED;
                case 38:
                    return DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP;
                case 39:
                    return DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_STARTED_AD_VIEWER;
                case 40:
                    return DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_REWARDED;
                case 41:
                    return DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_SENT;
                case 42:
                    return DIAGNOSTIC_EVENT_TYPE_NATIVE_SAVED_OPERATIVE_EVENT_SENT;
                case 43:
                    return DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE;
                case 44:
                    return DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_SUCCESS_TIME;
                case 45:
                    return DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_FAILURE_TIME;
                case 46:
                    return DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK;
                case 47:
                    return DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<DiagnosticEventType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return DiagnosticEventTypeVerifier.INSTANCE;
        }

        private static final class DiagnosticEventTypeVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new DiagnosticEventTypeVerifier();

            private DiagnosticEventTypeVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return DiagnosticEventType.forNumber(i) != null;
            }
        }

        DiagnosticEventType(int i) {
            this.value = i;
        }
    }

    public enum DiagnosticTagType implements Internal.EnumLite {
        DIAGNOSTIC_TAG_TYPE_UNSPECIFIED(0),
        DIAGNOSTIC_TAG_TYPE_CUSTOM(1),
        DIAGNOSTIC_TAG_TYPE_STATE(2),
        DIAGNOSTIC_TAG_TYPE_COMPLETE_STATE(3),
        DIAGNOSTIC_TAG_TYPE_CACHE(4),
        DIAGNOSTIC_TAG_TYPE_RECOVER(5),
        DIAGNOSTIC_TAG_TYPE_IS_RETRY(6),
        DIAGNOSTIC_TAG_TYPE_SOURCE(7),
        DIAGNOSTIC_TAG_TYPE_RESUMED(8),
        DIAGNOSTIC_TAG_TYPE_OFFERWALL(9),
        DIAGNOSTIC_TAG_TYPE_SIZE_KB(10),
        DIAGNOSTIC_TAG_TYPE_HOST(11),
        DIAGNOSTIC_TAG_TYPE_FAILED(12),
        DIAGNOSTIC_TAG_TYPE_PROTOCOL(13),
        DIAGNOSTIC_TAG_TYPE_REQUEST(14),
        DIAGNOSTIC_TAG_TYPE_CONNECT_TIME(15),
        DIAGNOSTIC_TAG_TYPE_SECURE_CONNECT_TIME(16),
        DIAGNOSTIC_TAG_TYPE_REQUEST_TIME(17),
        DIAGNOSTIC_TAG_TYPE_DOMAIN_LOOKUP_TIME(18),
        DIAGNOSTIC_TAG_TYPE_RESPONSE_TIME(19),
        DIAGNOSTIC_TAG_TYPE_TASK_TIME(20),
        DIAGNOSTIC_TAG_TYPE_REQUEST_SIZE(21),
        DIAGNOSTIC_TAG_TYPE_RESPONSE_SIZE(22),
        UNRECOGNIZED(-1);

        public static final int DIAGNOSTIC_TAG_TYPE_CACHE_VALUE = 4;
        public static final int DIAGNOSTIC_TAG_TYPE_COMPLETE_STATE_VALUE = 3;
        public static final int DIAGNOSTIC_TAG_TYPE_CONNECT_TIME_VALUE = 15;
        public static final int DIAGNOSTIC_TAG_TYPE_CUSTOM_VALUE = 1;
        public static final int DIAGNOSTIC_TAG_TYPE_DOMAIN_LOOKUP_TIME_VALUE = 18;
        public static final int DIAGNOSTIC_TAG_TYPE_FAILED_VALUE = 12;
        public static final int DIAGNOSTIC_TAG_TYPE_HOST_VALUE = 11;
        public static final int DIAGNOSTIC_TAG_TYPE_IS_RETRY_VALUE = 6;
        public static final int DIAGNOSTIC_TAG_TYPE_OFFERWALL_VALUE = 9;
        public static final int DIAGNOSTIC_TAG_TYPE_PROTOCOL_VALUE = 13;
        public static final int DIAGNOSTIC_TAG_TYPE_RECOVER_VALUE = 5;
        public static final int DIAGNOSTIC_TAG_TYPE_REQUEST_SIZE_VALUE = 21;
        public static final int DIAGNOSTIC_TAG_TYPE_REQUEST_TIME_VALUE = 17;
        public static final int DIAGNOSTIC_TAG_TYPE_REQUEST_VALUE = 14;
        public static final int DIAGNOSTIC_TAG_TYPE_RESPONSE_SIZE_VALUE = 22;
        public static final int DIAGNOSTIC_TAG_TYPE_RESPONSE_TIME_VALUE = 19;
        public static final int DIAGNOSTIC_TAG_TYPE_RESUMED_VALUE = 8;
        public static final int DIAGNOSTIC_TAG_TYPE_SECURE_CONNECT_TIME_VALUE = 16;
        public static final int DIAGNOSTIC_TAG_TYPE_SIZE_KB_VALUE = 10;
        public static final int DIAGNOSTIC_TAG_TYPE_SOURCE_VALUE = 7;
        public static final int DIAGNOSTIC_TAG_TYPE_STATE_VALUE = 2;
        public static final int DIAGNOSTIC_TAG_TYPE_TASK_TIME_VALUE = 20;
        public static final int DIAGNOSTIC_TAG_TYPE_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<DiagnosticTagType> internalValueMap = new Internal.EnumLiteMap<DiagnosticTagType>() { // from class: gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public DiagnosticTagType findValueByNumber(int i) {
                return DiagnosticTagType.forNumber(i);
            }
        };
        private final int value;

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static DiagnosticTagType valueOf(int i) {
            return forNumber(i);
        }

        public static DiagnosticTagType forNumber(int i) {
            switch (i) {
                case 0:
                    return DIAGNOSTIC_TAG_TYPE_UNSPECIFIED;
                case 1:
                    return DIAGNOSTIC_TAG_TYPE_CUSTOM;
                case 2:
                    return DIAGNOSTIC_TAG_TYPE_STATE;
                case 3:
                    return DIAGNOSTIC_TAG_TYPE_COMPLETE_STATE;
                case 4:
                    return DIAGNOSTIC_TAG_TYPE_CACHE;
                case 5:
                    return DIAGNOSTIC_TAG_TYPE_RECOVER;
                case 6:
                    return DIAGNOSTIC_TAG_TYPE_IS_RETRY;
                case 7:
                    return DIAGNOSTIC_TAG_TYPE_SOURCE;
                case 8:
                    return DIAGNOSTIC_TAG_TYPE_RESUMED;
                case 9:
                    return DIAGNOSTIC_TAG_TYPE_OFFERWALL;
                case 10:
                    return DIAGNOSTIC_TAG_TYPE_SIZE_KB;
                case 11:
                    return DIAGNOSTIC_TAG_TYPE_HOST;
                case 12:
                    return DIAGNOSTIC_TAG_TYPE_FAILED;
                case 13:
                    return DIAGNOSTIC_TAG_TYPE_PROTOCOL;
                case 14:
                    return DIAGNOSTIC_TAG_TYPE_REQUEST;
                case 15:
                    return DIAGNOSTIC_TAG_TYPE_CONNECT_TIME;
                case 16:
                    return DIAGNOSTIC_TAG_TYPE_SECURE_CONNECT_TIME;
                case 17:
                    return DIAGNOSTIC_TAG_TYPE_REQUEST_TIME;
                case 18:
                    return DIAGNOSTIC_TAG_TYPE_DOMAIN_LOOKUP_TIME;
                case 19:
                    return DIAGNOSTIC_TAG_TYPE_RESPONSE_TIME;
                case 20:
                    return DIAGNOSTIC_TAG_TYPE_TASK_TIME;
                case 21:
                    return DIAGNOSTIC_TAG_TYPE_REQUEST_SIZE;
                case 22:
                    return DIAGNOSTIC_TAG_TYPE_RESPONSE_SIZE;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<DiagnosticTagType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return DiagnosticTagTypeVerifier.INSTANCE;
        }

        private static final class DiagnosticTagTypeVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new DiagnosticTagTypeVerifier();

            private DiagnosticTagTypeVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return DiagnosticTagType.forNumber(i) != null;
            }
        }

        DiagnosticTagType(int i) {
            this.value = i;
        }
    }

    public enum DiagnosticEventsSeverity implements Internal.EnumLite {
        DIAGNOSTIC_EVENTS_SEVERITY_UNSPECIFIED(0),
        DIAGNOSTIC_EVENTS_SEVERITY_DEBUG(1),
        DIAGNOSTIC_EVENTS_SEVERITY_INFO(2),
        DIAGNOSTIC_EVENTS_SEVERITY_WARNING(3),
        DIAGNOSTIC_EVENTS_SEVERITY_ERROR(4),
        DIAGNOSTIC_EVENTS_SEVERITY_ALWAYS(5),
        UNRECOGNIZED(-1);

        public static final int DIAGNOSTIC_EVENTS_SEVERITY_ALWAYS_VALUE = 5;
        public static final int DIAGNOSTIC_EVENTS_SEVERITY_DEBUG_VALUE = 1;
        public static final int DIAGNOSTIC_EVENTS_SEVERITY_ERROR_VALUE = 4;
        public static final int DIAGNOSTIC_EVENTS_SEVERITY_INFO_VALUE = 2;
        public static final int DIAGNOSTIC_EVENTS_SEVERITY_UNSPECIFIED_VALUE = 0;
        public static final int DIAGNOSTIC_EVENTS_SEVERITY_WARNING_VALUE = 3;
        private static final Internal.EnumLiteMap<DiagnosticEventsSeverity> internalValueMap = new Internal.EnumLiteMap<DiagnosticEventsSeverity>() { // from class: gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public DiagnosticEventsSeverity findValueByNumber(int i) {
                return DiagnosticEventsSeverity.forNumber(i);
            }
        };
        private final int value;

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static DiagnosticEventsSeverity valueOf(int i) {
            return forNumber(i);
        }

        public static DiagnosticEventsSeverity forNumber(int i) {
            if (i == 0) {
                return DIAGNOSTIC_EVENTS_SEVERITY_UNSPECIFIED;
            }
            if (i == 1) {
                return DIAGNOSTIC_EVENTS_SEVERITY_DEBUG;
            }
            if (i == 2) {
                return DIAGNOSTIC_EVENTS_SEVERITY_INFO;
            }
            if (i == 3) {
                return DIAGNOSTIC_EVENTS_SEVERITY_WARNING;
            }
            if (i == 4) {
                return DIAGNOSTIC_EVENTS_SEVERITY_ERROR;
            }
            if (i != 5) {
                return null;
            }
            return DIAGNOSTIC_EVENTS_SEVERITY_ALWAYS;
        }

        public static Internal.EnumLiteMap<DiagnosticEventsSeverity> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return DiagnosticEventsSeverityVerifier.INSTANCE;
        }

        private static final class DiagnosticEventsSeverityVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new DiagnosticEventsSeverityVerifier();

            private DiagnosticEventsSeverityVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return DiagnosticEventsSeverity.forNumber(i) != null;
            }
        }

        DiagnosticEventsSeverity(int i) {
            this.value = i;
        }
    }

    public enum DiagnosticAdType implements Internal.EnumLite {
        DIAGNOSTIC_AD_TYPE_UNSPECIFIED(0),
        DIAGNOSTIC_AD_TYPE_FULLSCREEN(1),
        DIAGNOSTIC_AD_TYPE_BANNER(2),
        UNRECOGNIZED(-1);

        public static final int DIAGNOSTIC_AD_TYPE_BANNER_VALUE = 2;
        public static final int DIAGNOSTIC_AD_TYPE_FULLSCREEN_VALUE = 1;
        public static final int DIAGNOSTIC_AD_TYPE_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<DiagnosticAdType> internalValueMap = new Internal.EnumLiteMap<DiagnosticAdType>() { // from class: gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public DiagnosticAdType findValueByNumber(int i) {
                return DiagnosticAdType.forNumber(i);
            }
        };
        private final int value;

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static DiagnosticAdType valueOf(int i) {
            return forNumber(i);
        }

        public static DiagnosticAdType forNumber(int i) {
            if (i == 0) {
                return DIAGNOSTIC_AD_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return DIAGNOSTIC_AD_TYPE_FULLSCREEN;
            }
            if (i != 2) {
                return null;
            }
            return DIAGNOSTIC_AD_TYPE_BANNER;
        }

        public static Internal.EnumLiteMap<DiagnosticAdType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return DiagnosticAdTypeVerifier.INSTANCE;
        }

        private static final class DiagnosticAdTypeVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new DiagnosticAdTypeVerifier();

            private DiagnosticAdTypeVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return DiagnosticAdType.forNumber(i) != null;
            }
        }

        DiagnosticAdType(int i) {
            this.value = i;
        }
    }

    public static final class DiagnosticTag extends GeneratedMessageLite<DiagnosticTag, Builder> implements DiagnosticTagOrBuilder {
        public static final int CUSTOM_TAG_TYPE_FIELD_NUMBER = 2;
        private static final DiagnosticTag DEFAULT_INSTANCE;
        public static final int INT_VALUE_FIELD_NUMBER = 4;
        private static volatile Parser<DiagnosticTag> PARSER = null;
        public static final int STRING_VALUE_FIELD_NUMBER = 3;
        public static final int TAG_TYPE_FIELD_NUMBER = 1;
        public static final int TYPE_FIELD_NUMBER = 5;
        private static final Internal.ListAdapter.Converter<Integer, DiagnosticTagType> tagType_converter_ = new Internal.ListAdapter.Converter<Integer, DiagnosticTagType>() { // from class: gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public DiagnosticTagType convert(Integer num) {
                DiagnosticTagType forNumber = DiagnosticTagType.forNumber(num.intValue());
                return forNumber == null ? DiagnosticTagType.UNRECOGNIZED : forNumber;
            }
        };
        private int bitField0_;
        private int tagTypeMemoizedSerializedSize;
        private int type_;
        private Object value_;
        private int valueCase_ = 0;
        private Internal.IntList tagType_ = emptyIntList();
        private String customTagType_ = "";

        private DiagnosticTag() {
        }

        public enum ValueCase {
            STRING_VALUE(3),
            INT_VALUE(4),
            VALUE_NOT_SET(0);

            private final int value;

            ValueCase(int i) {
                this.value = i;
            }

            @Deprecated
            public static ValueCase valueOf(int i) {
                return forNumber(i);
            }

            public static ValueCase forNumber(int i) {
                if (i == 0) {
                    return VALUE_NOT_SET;
                }
                if (i == 3) {
                    return STRING_VALUE;
                }
                if (i != 4) {
                    return null;
                }
                return INT_VALUE;
            }

            public int getNumber() {
                return this.value;
            }
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public ValueCase getValueCase() {
            return ValueCase.forNumber(this.valueCase_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.valueCase_ = 0;
            this.value_ = null;
        }

        static {
            DiagnosticTag diagnosticTag = new DiagnosticTag();
            DEFAULT_INSTANCE = diagnosticTag;
            GeneratedMessageLite.registerDefaultInstance(DiagnosticTag.class, diagnosticTag);
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        @Deprecated
        public List<DiagnosticTagType> getTagTypeList() {
            return new Internal.ListAdapter(this.tagType_, tagType_converter_);
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        @Deprecated
        public int getTagTypeCount() {
            return this.tagType_.size();
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        @Deprecated
        public DiagnosticTagType getTagType(int i) {
            DiagnosticTagType forNumber = DiagnosticTagType.forNumber(this.tagType_.getInt(i));
            return forNumber == null ? DiagnosticTagType.UNRECOGNIZED : forNumber;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        @Deprecated
        public List<Integer> getTagTypeValueList() {
            return this.tagType_;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        @Deprecated
        public int getTagTypeValue(int i) {
            return this.tagType_.getInt(i);
        }

        private void ensureTagTypeIsMutable() {
            Internal.IntList intList = this.tagType_;
            if (intList.isModifiable()) {
                return;
            }
            this.tagType_ = GeneratedMessageLite.mutableCopy(intList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTagType(int i, DiagnosticTagType diagnosticTagType) {
            diagnosticTagType.getClass();
            ensureTagTypeIsMutable();
            this.tagType_.setInt(i, diagnosticTagType.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTagType(DiagnosticTagType diagnosticTagType) {
            diagnosticTagType.getClass();
            ensureTagTypeIsMutable();
            this.tagType_.addInt(diagnosticTagType.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllTagType(Iterable<? extends DiagnosticTagType> iterable) {
            ensureTagTypeIsMutable();
            Iterator<? extends DiagnosticTagType> it = iterable.iterator();
            while (it.hasNext()) {
                this.tagType_.addInt(it.next().getNumber());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTagType() {
            this.tagType_ = emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTagTypeValue(int i, int i2) {
            ensureTagTypeIsMutable();
            this.tagType_.setInt(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTagTypeValue(int i) {
            ensureTagTypeIsMutable();
            this.tagType_.addInt(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllTagTypeValue(Iterable<Integer> iterable) {
            ensureTagTypeIsMutable();
            Iterator<Integer> it = iterable.iterator();
            while (it.hasNext()) {
                this.tagType_.addInt(it.next().intValue());
            }
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public boolean hasCustomTagType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public String getCustomTagType() {
            return this.customTagType_;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public ByteString getCustomTagTypeBytes() {
            return ByteString.copyFromUtf8(this.customTagType_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCustomTagType(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.customTagType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCustomTagType() {
            this.bitField0_ &= -2;
            this.customTagType_ = getDefaultInstance().getCustomTagType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCustomTagTypeBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.customTagType_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public boolean hasStringValue() {
            return this.valueCase_ == 3;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public String getStringValue() {
            if (this.valueCase_ == 3) {
                return (String) this.value_;
            }
            return "";
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public ByteString getStringValueBytes() {
            String str;
            if (this.valueCase_ != 3) {
                str = "";
            } else {
                str = (String) this.value_;
            }
            return ByteString.copyFromUtf8(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStringValue(String str) {
            str.getClass();
            this.valueCase_ = 3;
            this.value_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStringValue() {
            if (this.valueCase_ == 3) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStringValueBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.value_ = byteString.toStringUtf8();
            this.valueCase_ = 3;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public boolean hasIntValue() {
            return this.valueCase_ == 4;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public int getIntValue() {
            if (this.valueCase_ == 4) {
                return ((Integer) this.value_).intValue();
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIntValue(int i) {
            this.valueCase_ = 4;
            this.value_ = Integer.valueOf(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIntValue() {
            if (this.valueCase_ == 4) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public DiagnosticTagType getType() {
            DiagnosticTagType forNumber = DiagnosticTagType.forNumber(this.type_);
            return forNumber == null ? DiagnosticTagType.UNRECOGNIZED : forNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i) {
            this.type_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(DiagnosticTagType diagnosticTagType) {
            this.type_ = diagnosticTagType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        public static DiagnosticTag parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DiagnosticTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static DiagnosticTag parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DiagnosticTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static DiagnosticTag parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DiagnosticTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DiagnosticTag parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DiagnosticTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static DiagnosticTag parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DiagnosticTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DiagnosticTag parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DiagnosticTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static DiagnosticTag parseFrom(InputStream inputStream) throws IOException {
            return (DiagnosticTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DiagnosticTag parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DiagnosticTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DiagnosticTag parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DiagnosticTag) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DiagnosticTag parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DiagnosticTag) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DiagnosticTag parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DiagnosticTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static DiagnosticTag parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DiagnosticTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(DiagnosticTag diagnosticTag) {
            return DEFAULT_INSTANCE.createBuilder(diagnosticTag);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<DiagnosticTag, Builder> implements DiagnosticTagOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(DiagnosticTag.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public ValueCase getValueCase() {
                return ((DiagnosticTag) this.instance).getValueCase();
            }

            public Builder clearValue() {
                copyOnWrite();
                ((DiagnosticTag) this.instance).clearValue();
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            @Deprecated
            public List<DiagnosticTagType> getTagTypeList() {
                return ((DiagnosticTag) this.instance).getTagTypeList();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            @Deprecated
            public int getTagTypeCount() {
                return ((DiagnosticTag) this.instance).getTagTypeCount();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            @Deprecated
            public DiagnosticTagType getTagType(int i) {
                return ((DiagnosticTag) this.instance).getTagType(i);
            }

            @Deprecated
            public Builder setTagType(int i, DiagnosticTagType diagnosticTagType) {
                copyOnWrite();
                ((DiagnosticTag) this.instance).setTagType(i, diagnosticTagType);
                return this;
            }

            @Deprecated
            public Builder addTagType(DiagnosticTagType diagnosticTagType) {
                copyOnWrite();
                ((DiagnosticTag) this.instance).addTagType(diagnosticTagType);
                return this;
            }

            @Deprecated
            public Builder addAllTagType(Iterable<? extends DiagnosticTagType> iterable) {
                copyOnWrite();
                ((DiagnosticTag) this.instance).addAllTagType(iterable);
                return this;
            }

            @Deprecated
            public Builder clearTagType() {
                copyOnWrite();
                ((DiagnosticTag) this.instance).clearTagType();
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            @Deprecated
            public List<Integer> getTagTypeValueList() {
                return Collections.unmodifiableList(((DiagnosticTag) this.instance).getTagTypeValueList());
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            @Deprecated
            public int getTagTypeValue(int i) {
                return ((DiagnosticTag) this.instance).getTagTypeValue(i);
            }

            @Deprecated
            public Builder setTagTypeValue(int i, int i2) {
                copyOnWrite();
                ((DiagnosticTag) this.instance).setTagTypeValue(i, i2);
                return this;
            }

            @Deprecated
            public Builder addTagTypeValue(int i) {
                copyOnWrite();
                ((DiagnosticTag) this.instance).addTagTypeValue(i);
                return this;
            }

            @Deprecated
            public Builder addAllTagTypeValue(Iterable<Integer> iterable) {
                copyOnWrite();
                ((DiagnosticTag) this.instance).addAllTagTypeValue(iterable);
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public boolean hasCustomTagType() {
                return ((DiagnosticTag) this.instance).hasCustomTagType();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public String getCustomTagType() {
                return ((DiagnosticTag) this.instance).getCustomTagType();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public ByteString getCustomTagTypeBytes() {
                return ((DiagnosticTag) this.instance).getCustomTagTypeBytes();
            }

            public Builder setCustomTagType(String str) {
                copyOnWrite();
                ((DiagnosticTag) this.instance).setCustomTagType(str);
                return this;
            }

            public Builder clearCustomTagType() {
                copyOnWrite();
                ((DiagnosticTag) this.instance).clearCustomTagType();
                return this;
            }

            public Builder setCustomTagTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((DiagnosticTag) this.instance).setCustomTagTypeBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public boolean hasStringValue() {
                return ((DiagnosticTag) this.instance).hasStringValue();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public String getStringValue() {
                return ((DiagnosticTag) this.instance).getStringValue();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public ByteString getStringValueBytes() {
                return ((DiagnosticTag) this.instance).getStringValueBytes();
            }

            public Builder setStringValue(String str) {
                copyOnWrite();
                ((DiagnosticTag) this.instance).setStringValue(str);
                return this;
            }

            public Builder clearStringValue() {
                copyOnWrite();
                ((DiagnosticTag) this.instance).clearStringValue();
                return this;
            }

            public Builder setStringValueBytes(ByteString byteString) {
                copyOnWrite();
                ((DiagnosticTag) this.instance).setStringValueBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public boolean hasIntValue() {
                return ((DiagnosticTag) this.instance).hasIntValue();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public int getIntValue() {
                return ((DiagnosticTag) this.instance).getIntValue();
            }

            public Builder setIntValue(int i) {
                copyOnWrite();
                ((DiagnosticTag) this.instance).setIntValue(i);
                return this;
            }

            public Builder clearIntValue() {
                copyOnWrite();
                ((DiagnosticTag) this.instance).clearIntValue();
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public int getTypeValue() {
                return ((DiagnosticTag) this.instance).getTypeValue();
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((DiagnosticTag) this.instance).setTypeValue(i);
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public DiagnosticTagType getType() {
                return ((DiagnosticTag) this.instance).getType();
            }

            public Builder setType(DiagnosticTagType diagnosticTagType) {
                copyOnWrite();
                ((DiagnosticTag) this.instance).setType(diagnosticTagType);
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((DiagnosticTag) this.instance).clearType();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new DiagnosticTag();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001,\u0002ለ\u0000\u0003Ȼ\u0000\u00047\u0000\u0005\f", new Object[]{"value_", "valueCase_", "bitField0_", "tagType_", "customTagType_", "type_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<DiagnosticTag> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (DiagnosticTag.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static DiagnosticTag getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<DiagnosticTag> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: gatewayprotocol.v1.DiagnosticEventRequestOuterClass$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class DiagnosticEvent extends GeneratedMessageLite<DiagnosticEvent, Builder> implements DiagnosticEventOrBuilder {
        public static final int AD_FORMAT_FIELD_NUMBER = 13;
        public static final int AD_TYPE_FIELD_NUMBER = 10;
        public static final int CUSTOM_EVENT_TYPE_FIELD_NUMBER = 2;
        private static final DiagnosticEvent DEFAULT_INSTANCE;
        public static final int ERROR_TOKEN_FIELD_NUMBER = 16;
        public static final int EVENT_ID_FIELD_NUMBER = 7;
        public static final int EVENT_TYPE_FIELD_NUMBER = 1;
        public static final int HEADER_BIDDING_TOKEN_NUMBER_FIELD_NUMBER = 12;
        public static final int IMPRESSION_OPPORTUNITY_ID_FIELD_NUMBER = 8;
        public static final int INT_TAGS_FIELD_NUMBER = 6;
        public static final int IS_HEADER_BIDDING_FIELD_NUMBER = 11;
        private static volatile Parser<DiagnosticEvent> PARSER = null;
        public static final int PLACEMENT_ID_FIELD_NUMBER = 9;
        public static final int REASON_DEBUG_FIELD_NUMBER = 15;
        public static final int REASON_FIELD_NUMBER = 14;
        public static final int STRING_TAGS_FIELD_NUMBER = 5;
        public static final int TAGS_FIELD_NUMBER = 17;
        public static final int TIMESTAMPS_FIELD_NUMBER = 3;
        public static final int TIME_VALUE_FIELD_NUMBER = 4;
        private int adFormat_;
        private int adType_;
        private int bitField0_;
        private int eventId_;
        private int eventType_;
        private int headerBiddingTokenNumber_;
        private boolean isHeaderBidding_;
        private double timeValue_;
        private TimestampsOuterClass.Timestamps timestamps_;
        private MapFieldLite<String, String> stringTags_ = MapFieldLite.emptyMapField();
        private MapFieldLite<String, Integer> intTags_ = MapFieldLite.emptyMapField();
        private String customEventType_ = "";
        private ByteString impressionOpportunityId_ = ByteString.EMPTY;
        private String placementId_ = "";
        private String reason_ = "";
        private String reasonDebug_ = "";
        private ByteString errorToken_ = ByteString.EMPTY;
        private Internal.ProtobufList<DiagnosticTag> tags_ = emptyProtobufList();

        private DiagnosticEvent() {
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public int getEventTypeValue() {
            return this.eventType_;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public DiagnosticEventType getEventType() {
            DiagnosticEventType forNumber = DiagnosticEventType.forNumber(this.eventType_);
            return forNumber == null ? DiagnosticEventType.UNRECOGNIZED : forNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventTypeValue(int i) {
            this.eventType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventType(DiagnosticEventType diagnosticEventType) {
            this.eventType_ = diagnosticEventType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventType() {
            this.eventType_ = 0;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean hasCustomEventType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public String getCustomEventType() {
            return this.customEventType_;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public ByteString getCustomEventTypeBytes() {
            return ByteString.copyFromUtf8(this.customEventType_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCustomEventType(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.customEventType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCustomEventType() {
            this.bitField0_ &= -2;
            this.customEventType_ = getDefaultInstance().getCustomEventType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCustomEventTypeBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.customEventType_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean hasTimestamps() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public TimestampsOuterClass.Timestamps getTimestamps() {
            TimestampsOuterClass.Timestamps timestamps = this.timestamps_;
            return timestamps == null ? TimestampsOuterClass.Timestamps.getDefaultInstance() : timestamps;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimestamps(TimestampsOuterClass.Timestamps timestamps) {
            timestamps.getClass();
            this.timestamps_ = timestamps;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTimestamps(TimestampsOuterClass.Timestamps timestamps) {
            timestamps.getClass();
            TimestampsOuterClass.Timestamps timestamps2 = this.timestamps_;
            if (timestamps2 != null && timestamps2 != TimestampsOuterClass.Timestamps.getDefaultInstance()) {
                this.timestamps_ = TimestampsOuterClass.Timestamps.newBuilder(this.timestamps_).mergeFrom((TimestampsOuterClass.Timestamps.Builder) timestamps).buildPartial();
            } else {
                this.timestamps_ = timestamps;
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimestamps() {
            this.timestamps_ = null;
            this.bitField0_ &= -3;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean hasTimeValue() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public double getTimeValue() {
            return this.timeValue_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeValue(double d) {
            this.bitField0_ |= 4;
            this.timeValue_ = d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimeValue() {
            this.bitField0_ &= -5;
            this.timeValue_ = 0.0d;
        }

        private static final class StringTagsDefaultEntryHolder {
            static final MapEntryLite<String, String> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.STRING, "");

            private StringTagsDefaultEntryHolder() {
            }
        }

        private MapFieldLite<String, String> internalGetStringTags() {
            return this.stringTags_;
        }

        private MapFieldLite<String, String> internalGetMutableStringTags() {
            if (!this.stringTags_.isMutable()) {
                this.stringTags_ = this.stringTags_.mutableCopy();
            }
            return this.stringTags_;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public int getStringTagsCount() {
            return internalGetStringTags().size();
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean containsStringTags(String str) {
            str.getClass();
            return internalGetStringTags().containsKey(str);
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        @Deprecated
        public Map<String, String> getStringTags() {
            return getStringTagsMap();
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public Map<String, String> getStringTagsMap() {
            return Collections.unmodifiableMap(internalGetStringTags());
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public String getStringTagsOrDefault(String str, String str2) {
            str.getClass();
            MapFieldLite<String, String> internalGetStringTags = internalGetStringTags();
            return internalGetStringTags.containsKey(str) ? internalGetStringTags.get(str) : str2;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public String getStringTagsOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, String> internalGetStringTags = internalGetStringTags();
            if (!internalGetStringTags.containsKey(str)) {
                throw new IllegalArgumentException();
            }
            return internalGetStringTags.get(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, String> getMutableStringTagsMap() {
            return internalGetMutableStringTags();
        }

        private static final class IntTagsDefaultEntryHolder {
            static final MapEntryLite<String, Integer> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.UINT32, 0);

            private IntTagsDefaultEntryHolder() {
            }
        }

        private MapFieldLite<String, Integer> internalGetIntTags() {
            return this.intTags_;
        }

        private MapFieldLite<String, Integer> internalGetMutableIntTags() {
            if (!this.intTags_.isMutable()) {
                this.intTags_ = this.intTags_.mutableCopy();
            }
            return this.intTags_;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public int getIntTagsCount() {
            return internalGetIntTags().size();
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean containsIntTags(String str) {
            str.getClass();
            return internalGetIntTags().containsKey(str);
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        @Deprecated
        public Map<String, Integer> getIntTags() {
            return getIntTagsMap();
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public Map<String, Integer> getIntTagsMap() {
            return Collections.unmodifiableMap(internalGetIntTags());
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public int getIntTagsOrDefault(String str, int i) {
            str.getClass();
            MapFieldLite<String, Integer> internalGetIntTags = internalGetIntTags();
            return internalGetIntTags.containsKey(str) ? internalGetIntTags.get(str).intValue() : i;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public int getIntTagsOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, Integer> internalGetIntTags = internalGetIntTags();
            if (!internalGetIntTags.containsKey(str)) {
                throw new IllegalArgumentException();
            }
            return internalGetIntTags.get(str).intValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, Integer> getMutableIntTagsMap() {
            return internalGetMutableIntTags();
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public int getEventId() {
            return this.eventId_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventId(int i) {
            this.eventId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventId() {
            this.eventId_ = 0;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean hasImpressionOpportunityId() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public ByteString getImpressionOpportunityId() {
            return this.impressionOpportunityId_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImpressionOpportunityId(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 8;
            this.impressionOpportunityId_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImpressionOpportunityId() {
            this.bitField0_ &= -9;
            this.impressionOpportunityId_ = getDefaultInstance().getImpressionOpportunityId();
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean hasPlacementId() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public String getPlacementId() {
            return this.placementId_;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public ByteString getPlacementIdBytes() {
            return ByteString.copyFromUtf8(this.placementId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlacementId(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.placementId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlacementId() {
            this.bitField0_ &= -17;
            this.placementId_ = getDefaultInstance().getPlacementId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlacementIdBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.placementId_ = byteString.toStringUtf8();
            this.bitField0_ |= 16;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean hasAdType() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public int getAdTypeValue() {
            return this.adType_;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public DiagnosticAdType getAdType() {
            DiagnosticAdType forNumber = DiagnosticAdType.forNumber(this.adType_);
            return forNumber == null ? DiagnosticAdType.UNRECOGNIZED : forNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdTypeValue(int i) {
            this.bitField0_ |= 32;
            this.adType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdType(DiagnosticAdType diagnosticAdType) {
            this.adType_ = diagnosticAdType.getNumber();
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdType() {
            this.bitField0_ &= -33;
            this.adType_ = 0;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean hasIsHeaderBidding() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean getIsHeaderBidding() {
            return this.isHeaderBidding_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsHeaderBidding(boolean z) {
            this.bitField0_ |= 64;
            this.isHeaderBidding_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsHeaderBidding() {
            this.bitField0_ &= -65;
            this.isHeaderBidding_ = false;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean hasHeaderBiddingTokenNumber() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public int getHeaderBiddingTokenNumber() {
            return this.headerBiddingTokenNumber_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeaderBiddingTokenNumber(int i) {
            this.bitField0_ |= 128;
            this.headerBiddingTokenNumber_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHeaderBiddingTokenNumber() {
            this.bitField0_ &= -129;
            this.headerBiddingTokenNumber_ = 0;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean hasAdFormat() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public int getAdFormatValue() {
            return this.adFormat_;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public AdFormatOuterClass.AdFormat getAdFormat() {
            AdFormatOuterClass.AdFormat forNumber = AdFormatOuterClass.AdFormat.forNumber(this.adFormat_);
            return forNumber == null ? AdFormatOuterClass.AdFormat.UNRECOGNIZED : forNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdFormatValue(int i) {
            this.bitField0_ |= 256;
            this.adFormat_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdFormat(AdFormatOuterClass.AdFormat adFormat) {
            this.adFormat_ = adFormat.getNumber();
            this.bitField0_ |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdFormat() {
            this.bitField0_ &= -257;
            this.adFormat_ = 0;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean hasReason() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public String getReason() {
            return this.reason_;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public ByteString getReasonBytes() {
            return ByteString.copyFromUtf8(this.reason_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReason(String str) {
            str.getClass();
            this.bitField0_ |= 512;
            this.reason_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReason() {
            this.bitField0_ &= -513;
            this.reason_ = getDefaultInstance().getReason();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReasonBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.reason_ = byteString.toStringUtf8();
            this.bitField0_ |= 512;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean hasReasonDebug() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public String getReasonDebug() {
            return this.reasonDebug_;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public ByteString getReasonDebugBytes() {
            return ByteString.copyFromUtf8(this.reasonDebug_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReasonDebug(String str) {
            str.getClass();
            this.bitField0_ |= 1024;
            this.reasonDebug_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReasonDebug() {
            this.bitField0_ &= -1025;
            this.reasonDebug_ = getDefaultInstance().getReasonDebug();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReasonDebugBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.reasonDebug_ = byteString.toStringUtf8();
            this.bitField0_ |= 1024;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean hasErrorToken() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public ByteString getErrorToken() {
            return this.errorToken_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorToken(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 2048;
            this.errorToken_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearErrorToken() {
            this.bitField0_ &= -2049;
            this.errorToken_ = getDefaultInstance().getErrorToken();
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public List<DiagnosticTag> getTagsList() {
            return this.tags_;
        }

        public List<? extends DiagnosticTagOrBuilder> getTagsOrBuilderList() {
            return this.tags_;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public int getTagsCount() {
            return this.tags_.size();
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public DiagnosticTag getTags(int i) {
            return this.tags_.get(i);
        }

        public DiagnosticTagOrBuilder getTagsOrBuilder(int i) {
            return this.tags_.get(i);
        }

        private void ensureTagsIsMutable() {
            Internal.ProtobufList<DiagnosticTag> protobufList = this.tags_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.tags_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTags(int i, DiagnosticTag diagnosticTag) {
            diagnosticTag.getClass();
            ensureTagsIsMutable();
            this.tags_.set(i, diagnosticTag);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTags(DiagnosticTag diagnosticTag) {
            diagnosticTag.getClass();
            ensureTagsIsMutable();
            this.tags_.add(diagnosticTag);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTags(int i, DiagnosticTag diagnosticTag) {
            diagnosticTag.getClass();
            ensureTagsIsMutable();
            this.tags_.add(i, diagnosticTag);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllTags(Iterable<? extends DiagnosticTag> iterable) {
            ensureTagsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.tags_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTags() {
            this.tags_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeTags(int i) {
            ensureTagsIsMutable();
            this.tags_.remove(i);
        }

        public static DiagnosticEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DiagnosticEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static DiagnosticEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DiagnosticEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static DiagnosticEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DiagnosticEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DiagnosticEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DiagnosticEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static DiagnosticEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DiagnosticEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DiagnosticEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DiagnosticEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static DiagnosticEvent parseFrom(InputStream inputStream) throws IOException {
            return (DiagnosticEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DiagnosticEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DiagnosticEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DiagnosticEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DiagnosticEvent) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DiagnosticEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DiagnosticEvent) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DiagnosticEvent parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DiagnosticEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static DiagnosticEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DiagnosticEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(DiagnosticEvent diagnosticEvent) {
            return DEFAULT_INSTANCE.createBuilder(diagnosticEvent);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<DiagnosticEvent, Builder> implements DiagnosticEventOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(DiagnosticEvent.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public int getEventTypeValue() {
                return ((DiagnosticEvent) this.instance).getEventTypeValue();
            }

            public Builder setEventTypeValue(int i) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setEventTypeValue(i);
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public DiagnosticEventType getEventType() {
                return ((DiagnosticEvent) this.instance).getEventType();
            }

            public Builder setEventType(DiagnosticEventType diagnosticEventType) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setEventType(diagnosticEventType);
                return this;
            }

            public Builder clearEventType() {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).clearEventType();
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean hasCustomEventType() {
                return ((DiagnosticEvent) this.instance).hasCustomEventType();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public String getCustomEventType() {
                return ((DiagnosticEvent) this.instance).getCustomEventType();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public ByteString getCustomEventTypeBytes() {
                return ((DiagnosticEvent) this.instance).getCustomEventTypeBytes();
            }

            public Builder setCustomEventType(String str) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setCustomEventType(str);
                return this;
            }

            public Builder clearCustomEventType() {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).clearCustomEventType();
                return this;
            }

            public Builder setCustomEventTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setCustomEventTypeBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean hasTimestamps() {
                return ((DiagnosticEvent) this.instance).hasTimestamps();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public TimestampsOuterClass.Timestamps getTimestamps() {
                return ((DiagnosticEvent) this.instance).getTimestamps();
            }

            public Builder setTimestamps(TimestampsOuterClass.Timestamps timestamps) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setTimestamps(timestamps);
                return this;
            }

            public Builder setTimestamps(TimestampsOuterClass.Timestamps.Builder builder) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setTimestamps(builder.build());
                return this;
            }

            public Builder mergeTimestamps(TimestampsOuterClass.Timestamps timestamps) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).mergeTimestamps(timestamps);
                return this;
            }

            public Builder clearTimestamps() {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).clearTimestamps();
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean hasTimeValue() {
                return ((DiagnosticEvent) this.instance).hasTimeValue();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public double getTimeValue() {
                return ((DiagnosticEvent) this.instance).getTimeValue();
            }

            public Builder setTimeValue(double d) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setTimeValue(d);
                return this;
            }

            public Builder clearTimeValue() {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).clearTimeValue();
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public int getStringTagsCount() {
                return ((DiagnosticEvent) this.instance).getStringTagsMap().size();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean containsStringTags(String str) {
                str.getClass();
                return ((DiagnosticEvent) this.instance).getStringTagsMap().containsKey(str);
            }

            public Builder clearStringTags() {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).getMutableStringTagsMap().clear();
                return this;
            }

            public Builder removeStringTags(String str) {
                str.getClass();
                copyOnWrite();
                ((DiagnosticEvent) this.instance).getMutableStringTagsMap().remove(str);
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            @Deprecated
            public Map<String, String> getStringTags() {
                return getStringTagsMap();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public Map<String, String> getStringTagsMap() {
                return Collections.unmodifiableMap(((DiagnosticEvent) this.instance).getStringTagsMap());
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public String getStringTagsOrDefault(String str, String str2) {
                str.getClass();
                Map<String, String> stringTagsMap = ((DiagnosticEvent) this.instance).getStringTagsMap();
                return stringTagsMap.containsKey(str) ? stringTagsMap.get(str) : str2;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public String getStringTagsOrThrow(String str) {
                str.getClass();
                Map<String, String> stringTagsMap = ((DiagnosticEvent) this.instance).getStringTagsMap();
                if (!stringTagsMap.containsKey(str)) {
                    throw new IllegalArgumentException();
                }
                return stringTagsMap.get(str);
            }

            public Builder putStringTags(String str, String str2) {
                str.getClass();
                str2.getClass();
                copyOnWrite();
                ((DiagnosticEvent) this.instance).getMutableStringTagsMap().put(str, str2);
                return this;
            }

            public Builder putAllStringTags(Map<String, String> map) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).getMutableStringTagsMap().putAll(map);
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public int getIntTagsCount() {
                return ((DiagnosticEvent) this.instance).getIntTagsMap().size();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean containsIntTags(String str) {
                str.getClass();
                return ((DiagnosticEvent) this.instance).getIntTagsMap().containsKey(str);
            }

            public Builder clearIntTags() {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).getMutableIntTagsMap().clear();
                return this;
            }

            public Builder removeIntTags(String str) {
                str.getClass();
                copyOnWrite();
                ((DiagnosticEvent) this.instance).getMutableIntTagsMap().remove(str);
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            @Deprecated
            public Map<String, Integer> getIntTags() {
                return getIntTagsMap();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public Map<String, Integer> getIntTagsMap() {
                return Collections.unmodifiableMap(((DiagnosticEvent) this.instance).getIntTagsMap());
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public int getIntTagsOrDefault(String str, int i) {
                str.getClass();
                Map<String, Integer> intTagsMap = ((DiagnosticEvent) this.instance).getIntTagsMap();
                return intTagsMap.containsKey(str) ? intTagsMap.get(str).intValue() : i;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public int getIntTagsOrThrow(String str) {
                str.getClass();
                Map<String, Integer> intTagsMap = ((DiagnosticEvent) this.instance).getIntTagsMap();
                if (!intTagsMap.containsKey(str)) {
                    throw new IllegalArgumentException();
                }
                return intTagsMap.get(str).intValue();
            }

            public Builder putIntTags(String str, int i) {
                str.getClass();
                copyOnWrite();
                ((DiagnosticEvent) this.instance).getMutableIntTagsMap().put(str, Integer.valueOf(i));
                return this;
            }

            public Builder putAllIntTags(Map<String, Integer> map) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).getMutableIntTagsMap().putAll(map);
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public int getEventId() {
                return ((DiagnosticEvent) this.instance).getEventId();
            }

            public Builder setEventId(int i) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setEventId(i);
                return this;
            }

            public Builder clearEventId() {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).clearEventId();
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean hasImpressionOpportunityId() {
                return ((DiagnosticEvent) this.instance).hasImpressionOpportunityId();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public ByteString getImpressionOpportunityId() {
                return ((DiagnosticEvent) this.instance).getImpressionOpportunityId();
            }

            public Builder setImpressionOpportunityId(ByteString byteString) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setImpressionOpportunityId(byteString);
                return this;
            }

            public Builder clearImpressionOpportunityId() {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).clearImpressionOpportunityId();
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean hasPlacementId() {
                return ((DiagnosticEvent) this.instance).hasPlacementId();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public String getPlacementId() {
                return ((DiagnosticEvent) this.instance).getPlacementId();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public ByteString getPlacementIdBytes() {
                return ((DiagnosticEvent) this.instance).getPlacementIdBytes();
            }

            public Builder setPlacementId(String str) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setPlacementId(str);
                return this;
            }

            public Builder clearPlacementId() {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).clearPlacementId();
                return this;
            }

            public Builder setPlacementIdBytes(ByteString byteString) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setPlacementIdBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean hasAdType() {
                return ((DiagnosticEvent) this.instance).hasAdType();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public int getAdTypeValue() {
                return ((DiagnosticEvent) this.instance).getAdTypeValue();
            }

            public Builder setAdTypeValue(int i) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setAdTypeValue(i);
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public DiagnosticAdType getAdType() {
                return ((DiagnosticEvent) this.instance).getAdType();
            }

            public Builder setAdType(DiagnosticAdType diagnosticAdType) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setAdType(diagnosticAdType);
                return this;
            }

            public Builder clearAdType() {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).clearAdType();
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean hasIsHeaderBidding() {
                return ((DiagnosticEvent) this.instance).hasIsHeaderBidding();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean getIsHeaderBidding() {
                return ((DiagnosticEvent) this.instance).getIsHeaderBidding();
            }

            public Builder setIsHeaderBidding(boolean z) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setIsHeaderBidding(z);
                return this;
            }

            public Builder clearIsHeaderBidding() {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).clearIsHeaderBidding();
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean hasHeaderBiddingTokenNumber() {
                return ((DiagnosticEvent) this.instance).hasHeaderBiddingTokenNumber();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public int getHeaderBiddingTokenNumber() {
                return ((DiagnosticEvent) this.instance).getHeaderBiddingTokenNumber();
            }

            public Builder setHeaderBiddingTokenNumber(int i) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setHeaderBiddingTokenNumber(i);
                return this;
            }

            public Builder clearHeaderBiddingTokenNumber() {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).clearHeaderBiddingTokenNumber();
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean hasAdFormat() {
                return ((DiagnosticEvent) this.instance).hasAdFormat();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public int getAdFormatValue() {
                return ((DiagnosticEvent) this.instance).getAdFormatValue();
            }

            public Builder setAdFormatValue(int i) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setAdFormatValue(i);
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public AdFormatOuterClass.AdFormat getAdFormat() {
                return ((DiagnosticEvent) this.instance).getAdFormat();
            }

            public Builder setAdFormat(AdFormatOuterClass.AdFormat adFormat) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setAdFormat(adFormat);
                return this;
            }

            public Builder clearAdFormat() {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).clearAdFormat();
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean hasReason() {
                return ((DiagnosticEvent) this.instance).hasReason();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public String getReason() {
                return ((DiagnosticEvent) this.instance).getReason();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public ByteString getReasonBytes() {
                return ((DiagnosticEvent) this.instance).getReasonBytes();
            }

            public Builder setReason(String str) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setReason(str);
                return this;
            }

            public Builder clearReason() {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).clearReason();
                return this;
            }

            public Builder setReasonBytes(ByteString byteString) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setReasonBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean hasReasonDebug() {
                return ((DiagnosticEvent) this.instance).hasReasonDebug();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public String getReasonDebug() {
                return ((DiagnosticEvent) this.instance).getReasonDebug();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public ByteString getReasonDebugBytes() {
                return ((DiagnosticEvent) this.instance).getReasonDebugBytes();
            }

            public Builder setReasonDebug(String str) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setReasonDebug(str);
                return this;
            }

            public Builder clearReasonDebug() {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).clearReasonDebug();
                return this;
            }

            public Builder setReasonDebugBytes(ByteString byteString) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setReasonDebugBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean hasErrorToken() {
                return ((DiagnosticEvent) this.instance).hasErrorToken();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public ByteString getErrorToken() {
                return ((DiagnosticEvent) this.instance).getErrorToken();
            }

            public Builder setErrorToken(ByteString byteString) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setErrorToken(byteString);
                return this;
            }

            public Builder clearErrorToken() {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).clearErrorToken();
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public List<DiagnosticTag> getTagsList() {
                return Collections.unmodifiableList(((DiagnosticEvent) this.instance).getTagsList());
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public int getTagsCount() {
                return ((DiagnosticEvent) this.instance).getTagsCount();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public DiagnosticTag getTags(int i) {
                return ((DiagnosticEvent) this.instance).getTags(i);
            }

            public Builder setTags(int i, DiagnosticTag diagnosticTag) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setTags(i, diagnosticTag);
                return this;
            }

            public Builder setTags(int i, DiagnosticTag.Builder builder) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setTags(i, builder.build());
                return this;
            }

            public Builder addTags(DiagnosticTag diagnosticTag) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).addTags(diagnosticTag);
                return this;
            }

            public Builder addTags(int i, DiagnosticTag diagnosticTag) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).addTags(i, diagnosticTag);
                return this;
            }

            public Builder addTags(DiagnosticTag.Builder builder) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).addTags(builder.build());
                return this;
            }

            public Builder addTags(int i, DiagnosticTag.Builder builder) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).addTags(i, builder.build());
                return this;
            }

            public Builder addAllTags(Iterable<? extends DiagnosticTag> iterable) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).addAllTags(iterable);
                return this;
            }

            public Builder clearTags() {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).clearTags();
                return this;
            }

            public Builder removeTags(int i) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).removeTags(i);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new DiagnosticEvent();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0011\u0000\u0001\u0001\u0011\u0011\u0002\u0001\u0000\u0001\f\u0002ለ\u0000\u0003ဉ\u0001\u0004က\u0002\u00052\u00062\u0007\u0004\bည\u0003\tለ\u0004\nဌ\u0005\u000bဇ\u0006\fင\u0007\rဌ\b\u000eለ\t\u000fለ\n\u0010ည\u000b\u0011\u001b", new Object[]{"bitField0_", "eventType_", "customEventType_", "timestamps_", "timeValue_", "stringTags_", StringTagsDefaultEntryHolder.defaultEntry, "intTags_", IntTagsDefaultEntryHolder.defaultEntry, "eventId_", "impressionOpportunityId_", "placementId_", "adType_", "isHeaderBidding_", "headerBiddingTokenNumber_", "adFormat_", "reason_", "reasonDebug_", "errorToken_", "tags_", DiagnosticTag.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<DiagnosticEvent> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (DiagnosticEvent.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            DiagnosticEvent diagnosticEvent = new DiagnosticEvent();
            DEFAULT_INSTANCE = diagnosticEvent;
            GeneratedMessageLite.registerDefaultInstance(DiagnosticEvent.class, diagnosticEvent);
        }

        public static DiagnosticEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<DiagnosticEvent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class DiagnosticEventRequest extends GeneratedMessageLite<DiagnosticEventRequest, Builder> implements DiagnosticEventRequestOrBuilder {
        public static final int BATCH_FIELD_NUMBER = 1;
        private static final DiagnosticEventRequest DEFAULT_INSTANCE;
        private static volatile Parser<DiagnosticEventRequest> PARSER;
        private Internal.ProtobufList<DiagnosticEvent> batch_ = emptyProtobufList();

        private DiagnosticEventRequest() {
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequestOrBuilder
        public List<DiagnosticEvent> getBatchList() {
            return this.batch_;
        }

        public List<? extends DiagnosticEventOrBuilder> getBatchOrBuilderList() {
            return this.batch_;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequestOrBuilder
        public int getBatchCount() {
            return this.batch_.size();
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequestOrBuilder
        public DiagnosticEvent getBatch(int i) {
            return this.batch_.get(i);
        }

        public DiagnosticEventOrBuilder getBatchOrBuilder(int i) {
            return this.batch_.get(i);
        }

        private void ensureBatchIsMutable() {
            Internal.ProtobufList<DiagnosticEvent> protobufList = this.batch_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.batch_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBatch(int i, DiagnosticEvent diagnosticEvent) {
            diagnosticEvent.getClass();
            ensureBatchIsMutable();
            this.batch_.set(i, diagnosticEvent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBatch(DiagnosticEvent diagnosticEvent) {
            diagnosticEvent.getClass();
            ensureBatchIsMutable();
            this.batch_.add(diagnosticEvent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBatch(int i, DiagnosticEvent diagnosticEvent) {
            diagnosticEvent.getClass();
            ensureBatchIsMutable();
            this.batch_.add(i, diagnosticEvent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllBatch(Iterable<? extends DiagnosticEvent> iterable) {
            ensureBatchIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.batch_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBatch() {
            this.batch_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeBatch(int i) {
            ensureBatchIsMutable();
            this.batch_.remove(i);
        }

        public static DiagnosticEventRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static DiagnosticEventRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static DiagnosticEventRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DiagnosticEventRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static DiagnosticEventRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DiagnosticEventRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static DiagnosticEventRequest parseFrom(InputStream inputStream) throws IOException {
            return (DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DiagnosticEventRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DiagnosticEventRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DiagnosticEventRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DiagnosticEventRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DiagnosticEventRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DiagnosticEventRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static DiagnosticEventRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(DiagnosticEventRequest diagnosticEventRequest) {
            return DEFAULT_INSTANCE.createBuilder(diagnosticEventRequest);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<DiagnosticEventRequest, Builder> implements DiagnosticEventRequestOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(DiagnosticEventRequest.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequestOrBuilder
            public List<DiagnosticEvent> getBatchList() {
                return Collections.unmodifiableList(((DiagnosticEventRequest) this.instance).getBatchList());
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequestOrBuilder
            public int getBatchCount() {
                return ((DiagnosticEventRequest) this.instance).getBatchCount();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequestOrBuilder
            public DiagnosticEvent getBatch(int i) {
                return ((DiagnosticEventRequest) this.instance).getBatch(i);
            }

            public Builder setBatch(int i, DiagnosticEvent diagnosticEvent) {
                copyOnWrite();
                ((DiagnosticEventRequest) this.instance).setBatch(i, diagnosticEvent);
                return this;
            }

            public Builder setBatch(int i, DiagnosticEvent.Builder builder) {
                copyOnWrite();
                ((DiagnosticEventRequest) this.instance).setBatch(i, builder.build());
                return this;
            }

            public Builder addBatch(DiagnosticEvent diagnosticEvent) {
                copyOnWrite();
                ((DiagnosticEventRequest) this.instance).addBatch(diagnosticEvent);
                return this;
            }

            public Builder addBatch(int i, DiagnosticEvent diagnosticEvent) {
                copyOnWrite();
                ((DiagnosticEventRequest) this.instance).addBatch(i, diagnosticEvent);
                return this;
            }

            public Builder addBatch(DiagnosticEvent.Builder builder) {
                copyOnWrite();
                ((DiagnosticEventRequest) this.instance).addBatch(builder.build());
                return this;
            }

            public Builder addBatch(int i, DiagnosticEvent.Builder builder) {
                copyOnWrite();
                ((DiagnosticEventRequest) this.instance).addBatch(i, builder.build());
                return this;
            }

            public Builder addAllBatch(Iterable<? extends DiagnosticEvent> iterable) {
                copyOnWrite();
                ((DiagnosticEventRequest) this.instance).addAllBatch(iterable);
                return this;
            }

            public Builder clearBatch() {
                copyOnWrite();
                ((DiagnosticEventRequest) this.instance).clearBatch();
                return this;
            }

            public Builder removeBatch(int i) {
                copyOnWrite();
                ((DiagnosticEventRequest) this.instance).removeBatch(i);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new DiagnosticEventRequest();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"batch_", DiagnosticEvent.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<DiagnosticEventRequest> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (DiagnosticEventRequest.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            DiagnosticEventRequest diagnosticEventRequest = new DiagnosticEventRequest();
            DEFAULT_INSTANCE = diagnosticEventRequest;
            GeneratedMessageLite.registerDefaultInstance(DiagnosticEventRequest.class, diagnosticEventRequest);
        }

        public static DiagnosticEventRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<DiagnosticEventRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}

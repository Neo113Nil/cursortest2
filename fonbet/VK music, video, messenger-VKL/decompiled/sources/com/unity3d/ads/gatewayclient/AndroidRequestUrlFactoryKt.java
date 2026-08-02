package com.unity3d.ads.gatewayclient;

import com.unity3d.ads.core.data.model.OperationType;
import gatewayprotocol.v1.InitializationResponseOuterClass;

/* compiled from: AndroidRequestUrlFactory.kt */
/* loaded from: classes14.dex */
public final class AndroidRequestUrlFactoryKt {

    /* compiled from: AndroidRequestUrlFactory.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OperationType.values().length];
            try {
                iArr[OperationType.SHOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OperationType.LOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OperationType.LOAD_HEADER_BIDDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OperationType.REFRESH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OperationType.PRIVACY_UPDATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OperationType.INITIALIZATION_COMPLETED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[OperationType.TRANSACTION_EVENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[OperationType.LIFECYCLE_EVENT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[OperationType.GET_TOKEN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[OperationType.DIAGNOSTIC_EVENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[OperationType.OPERATIVE_EVENT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InitializationResponseOuterClass.RequestType getRequestUrlOverrideType(OperationType operationType) {
        switch (WhenMappings.$EnumSwitchMapping$0[operationType.ordinal()]) {
            case 1:
            case 2:
                return InitializationResponseOuterClass.RequestType.REQUEST_TYPE_AD;
            case 3:
                return InitializationResponseOuterClass.RequestType.REQUEST_TYPE_AD_PLAYER_CONFIG;
            case 4:
                return InitializationResponseOuterClass.RequestType.REQUEST_TYPE_AD_DATA_REFRESH;
            case 5:
                return InitializationResponseOuterClass.RequestType.REQUEST_TYPE_PRIVACY_UPDATE;
            case 6:
                return InitializationResponseOuterClass.RequestType.REQUEST_TYPE_INITIALIZATION_COMPLETED;
            case 7:
                return InitializationResponseOuterClass.RequestType.REQUEST_TYPE_TRANSACTION_EVENT;
            case 8:
                return InitializationResponseOuterClass.RequestType.REQUEST_TYPE_LIFECYCLE_EVENT;
            case 9:
                return InitializationResponseOuterClass.RequestType.REQUEST_TYPE_GET_TOKEN_EVENT;
            case 10:
                return InitializationResponseOuterClass.RequestType.REQUEST_TYPE_DIAGNOSTIC_EVENT;
            case 11:
                return InitializationResponseOuterClass.RequestType.REQUEST_TYPE_OPERATIVE_EVENT;
            default:
                return null;
        }
    }
}

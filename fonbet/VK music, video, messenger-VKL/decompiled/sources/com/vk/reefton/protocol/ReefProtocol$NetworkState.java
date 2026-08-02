package com.vk.reefton.protocol;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.util.ArrayList;
import java.util.List;
import xsna.lof0;

/* loaded from: classes5.dex */
public final class ReefProtocol$NetworkState extends GeneratedMessageLite<ReefProtocol$NetworkState, a> implements MessageLiteOrBuilder {
    public static final int ALLCELLINFO_FIELD_NUMBER = 11;
    public static final int CAPABILITIESHASTRANSPORTCELLULAR_FIELD_NUMBER = 21;
    public static final int CAPABILITIESHASTRANSPORTWIFI_FIELD_NUMBER = 22;
    public static final int CELLSBECAMEACTIVESINCELASTSYNC_FIELD_NUMBER = 9;
    public static final int CELLSBECAMEINACTIVESINCELASTSYNC_FIELD_NUMBER = 10;
    private static final ReefProtocol$NetworkState DEFAULT_INSTANCE;
    public static final int ISROAMING_FIELD_NUMBER = 7;
    public static final int ISVPN_FIELD_NUMBER = 27;
    public static final int MOBILENETWORKTYPECODE_FIELD_NUMBER = 13;
    public static final int NETWORKBANDWIDTH_FIELD_NUMBER = 23;
    public static final int NETWORKDATASTATE_FIELD_NUMBER = 8;
    public static final int NETWORKOPERATOR_FIELD_NUMBER = 6;
    public static final int NETWORKTYPE_FIELD_NUMBER = 1;
    public static final int NOGUARANTEEDGSMSIGNALSTRENGTHINFO_FIELD_NUMBER = 16;
    public static final int OPERATORNAME_FIELD_NUMBER = 25;
    private static volatile Parser<ReefProtocol$NetworkState> PARSER = null;
    public static final int PURGEDRECEIVEDBYTESBYPROCESS_FIELD_NUMBER = 18;
    public static final int PURGEDRECEIVEDBYTESBYSESSION_FIELD_NUMBER = 20;
    public static final int PURGEDRECEIVEDBYTES_FIELD_NUMBER = 17;
    public static final int SIGNALSTRENGTH_FIELD_NUMBER = 24;
    public static final int SIMINFO_FIELD_NUMBER = 2;
    public static final int SIMOPERATOR_FIELD_NUMBER = 5;
    public static final int SUBTYPECODE_FIELD_NUMBER = 15;
    public static final int TMSIGNALSTRENGTH_FIELD_NUMBER = 26;
    public static final int TOTALRECEIVEDBYTESBYPROCESS_FIELD_NUMBER = 4;
    public static final int TOTALRECEIVEDBYTESBYSESSION_FIELD_NUMBER = 19;
    public static final int TOTALRECEIVEDBYTES_FIELD_NUMBER = 3;
    public static final int TYPECODE_FIELD_NUMBER = 12;
    private boolean capabilitiesHasTransportCellular_;
    private boolean capabilitiesHasTransportWifi_;
    private boolean isRoaming_;
    private boolean isVpn_;
    private int mobileNetworkTypeCode_;
    private int networkBandwidth_;
    private int networkDataState_;
    private int networkType_;
    private o noGuaranteedGsmSignalStrengthInfo_;
    private long purgedReceivedBytesByProcess_;
    private long purgedReceivedBytesBySession_;
    private long purgedReceivedBytes_;
    private int signalStrength_;
    private int subtypeCode_;
    private long totalReceivedBytesByProcess_;
    private long totalReceivedBytesBySession_;
    private long totalReceivedBytes_;
    private int typeCode_;
    private Internal.ProtobufList<m> simInfo_ = GeneratedMessageLite.emptyProtobufList();
    private String simOperator_ = "";
    private String networkOperator_ = "";
    private Internal.ProtobufList<c> cellsBecameActiveSinceLastSync_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<c> cellsBecameInactiveSinceLastSync_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<c> allCellInfo_ = GeneratedMessageLite.emptyProtobufList();
    private String operatorName_ = "";
    private Internal.ProtobufList<u> tmSignalStrength_ = GeneratedMessageLite.emptyProtobufList();

    public enum MobileNetworkDataState implements Internal.EnumLite {
        DATA_UNKNOWN(0),
        DATA_DISCONNECTED(1),
        DATA_CONNECTING(2),
        DATA_CONNECTED(3),
        DATA_SUSPENDED(4),
        UNRECOGNIZED(-1);

        public static final int DATA_CONNECTED_VALUE = 3;
        public static final int DATA_CONNECTING_VALUE = 2;
        public static final int DATA_DISCONNECTED_VALUE = 1;
        public static final int DATA_SUSPENDED_VALUE = 4;
        public static final int DATA_UNKNOWN_VALUE = 0;
        private static final Internal.EnumLiteMap<MobileNetworkDataState> internalValueMap = new a();
        private final int value;

        public class a implements Internal.EnumLiteMap<MobileNetworkDataState> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final MobileNetworkDataState findValueByNumber(int i) {
                if (i == 0) {
                    return MobileNetworkDataState.DATA_UNKNOWN;
                }
                if (i == 1) {
                    return MobileNetworkDataState.DATA_DISCONNECTED;
                }
                if (i == 2) {
                    return MobileNetworkDataState.DATA_CONNECTING;
                }
                if (i == 3) {
                    return MobileNetworkDataState.DATA_CONNECTED;
                }
                if (i != 4) {
                    return null;
                }
                return MobileNetworkDataState.DATA_SUSPENDED;
            }
        }

        MobileNetworkDataState(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public static final class a extends GeneratedMessageLite.Builder<ReefProtocol$NetworkState, a> implements MessageLiteOrBuilder {
        public a() {
            super(ReefProtocol$NetworkState.DEFAULT_INSTANCE);
        }

        public final void A(int i) {
            copyOnWrite();
            ReefProtocol$NetworkState.A((ReefProtocol$NetworkState) this.instance, i);
        }

        public final void B(long j) {
            copyOnWrite();
            ReefProtocol$NetworkState.B((ReefProtocol$NetworkState) this.instance, j);
        }

        public final void C(long j) {
            copyOnWrite();
            ReefProtocol$NetworkState.C((ReefProtocol$NetworkState) this.instance, j);
        }

        public final void D(long j) {
            copyOnWrite();
            ReefProtocol$NetworkState.D((ReefProtocol$NetworkState) this.instance, j);
        }

        public final void E(int i) {
            copyOnWrite();
            ReefProtocol$NetworkState.E((ReefProtocol$NetworkState) this.instance, i);
        }

        public final void b(ArrayList arrayList) {
            copyOnWrite();
            ReefProtocol$NetworkState.b((ReefProtocol$NetworkState) this.instance, arrayList);
        }

        public final void c(ArrayList arrayList) {
            copyOnWrite();
            ReefProtocol$NetworkState.c((ReefProtocol$NetworkState) this.instance, arrayList);
        }

        public final void d(ArrayList arrayList) {
            copyOnWrite();
            ReefProtocol$NetworkState.d((ReefProtocol$NetworkState) this.instance, arrayList);
        }

        public final void f(ArrayList arrayList) {
            copyOnWrite();
            ReefProtocol$NetworkState.f((ReefProtocol$NetworkState) this.instance, arrayList);
        }

        public final void g(ArrayList arrayList) {
            copyOnWrite();
            ReefProtocol$NetworkState.g((ReefProtocol$NetworkState) this.instance, arrayList);
        }

        public final void h(boolean z) {
            copyOnWrite();
            ReefProtocol$NetworkState.h((ReefProtocol$NetworkState) this.instance, z);
        }

        public final void m(boolean z) {
            copyOnWrite();
            ReefProtocol$NetworkState.m((ReefProtocol$NetworkState) this.instance, z);
        }

        public final void n(boolean z) {
            copyOnWrite();
            ReefProtocol$NetworkState.n((ReefProtocol$NetworkState) this.instance, z);
        }

        public final void o(boolean z) {
            copyOnWrite();
            ReefProtocol$NetworkState.o((ReefProtocol$NetworkState) this.instance, z);
        }

        public final void p(int i) {
            copyOnWrite();
            ReefProtocol$NetworkState.p((ReefProtocol$NetworkState) this.instance, i);
        }

        public final void q(int i) {
            copyOnWrite();
            ReefProtocol$NetworkState.q((ReefProtocol$NetworkState) this.instance, i);
        }

        public final void r(MobileNetworkDataState mobileNetworkDataState) {
            copyOnWrite();
            ReefProtocol$NetworkState.r((ReefProtocol$NetworkState) this.instance, mobileNetworkDataState);
        }

        public final void s(String str) {
            copyOnWrite();
            ReefProtocol$NetworkState.s((ReefProtocol$NetworkState) this.instance, str);
        }

        public final void t(ReefProtocol$NetworkType reefProtocol$NetworkType) {
            copyOnWrite();
            ReefProtocol$NetworkState.t((ReefProtocol$NetworkState) this.instance, reefProtocol$NetworkType);
        }

        public final void u(String str) {
            copyOnWrite();
            ReefProtocol$NetworkState.u((ReefProtocol$NetworkState) this.instance, str);
        }

        public final void v(long j) {
            copyOnWrite();
            ReefProtocol$NetworkState.v((ReefProtocol$NetworkState) this.instance, j);
        }

        public final void w(long j) {
            copyOnWrite();
            ReefProtocol$NetworkState.w((ReefProtocol$NetworkState) this.instance, j);
        }

        public final void x(long j) {
            copyOnWrite();
            ReefProtocol$NetworkState.x((ReefProtocol$NetworkState) this.instance, j);
        }

        public final void y(int i) {
            copyOnWrite();
            ReefProtocol$NetworkState.y((ReefProtocol$NetworkState) this.instance, i);
        }

        public final void z(String str) {
            copyOnWrite();
            ReefProtocol$NetworkState.z((ReefProtocol$NetworkState) this.instance, str);
        }
    }

    static {
        ReefProtocol$NetworkState reefProtocol$NetworkState = new ReefProtocol$NetworkState();
        DEFAULT_INSTANCE = reefProtocol$NetworkState;
        GeneratedMessageLite.registerDefaultInstance(ReefProtocol$NetworkState.class, reefProtocol$NetworkState);
    }

    public static void A(ReefProtocol$NetworkState reefProtocol$NetworkState, int i) {
        reefProtocol$NetworkState.subtypeCode_ = i;
    }

    public static void B(ReefProtocol$NetworkState reefProtocol$NetworkState, long j) {
        reefProtocol$NetworkState.totalReceivedBytes_ = j;
    }

    public static void C(ReefProtocol$NetworkState reefProtocol$NetworkState, long j) {
        reefProtocol$NetworkState.totalReceivedBytesByProcess_ = j;
    }

    public static void D(ReefProtocol$NetworkState reefProtocol$NetworkState, long j) {
        reefProtocol$NetworkState.totalReceivedBytesBySession_ = j;
    }

    public static void E(ReefProtocol$NetworkState reefProtocol$NetworkState, int i) {
        reefProtocol$NetworkState.typeCode_ = i;
    }

    public static a G() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static void b(ReefProtocol$NetworkState reefProtocol$NetworkState, ArrayList arrayList) {
        Internal.ProtobufList<c> protobufList = reefProtocol$NetworkState.allCellInfo_;
        if (!protobufList.isModifiable()) {
            reefProtocol$NetworkState.allCellInfo_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        AbstractMessageLite.addAll((Iterable) arrayList, (List) reefProtocol$NetworkState.allCellInfo_);
    }

    public static void c(ReefProtocol$NetworkState reefProtocol$NetworkState, ArrayList arrayList) {
        Internal.ProtobufList<c> protobufList = reefProtocol$NetworkState.cellsBecameActiveSinceLastSync_;
        if (!protobufList.isModifiable()) {
            reefProtocol$NetworkState.cellsBecameActiveSinceLastSync_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        AbstractMessageLite.addAll((Iterable) arrayList, (List) reefProtocol$NetworkState.cellsBecameActiveSinceLastSync_);
    }

    public static void d(ReefProtocol$NetworkState reefProtocol$NetworkState, ArrayList arrayList) {
        Internal.ProtobufList<c> protobufList = reefProtocol$NetworkState.cellsBecameInactiveSinceLastSync_;
        if (!protobufList.isModifiable()) {
            reefProtocol$NetworkState.cellsBecameInactiveSinceLastSync_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        AbstractMessageLite.addAll((Iterable) arrayList, (List) reefProtocol$NetworkState.cellsBecameInactiveSinceLastSync_);
    }

    public static void f(ReefProtocol$NetworkState reefProtocol$NetworkState, ArrayList arrayList) {
        Internal.ProtobufList<m> protobufList = reefProtocol$NetworkState.simInfo_;
        if (!protobufList.isModifiable()) {
            reefProtocol$NetworkState.simInfo_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        AbstractMessageLite.addAll((Iterable) arrayList, (List) reefProtocol$NetworkState.simInfo_);
    }

    public static void g(ReefProtocol$NetworkState reefProtocol$NetworkState, ArrayList arrayList) {
        Internal.ProtobufList<u> protobufList = reefProtocol$NetworkState.tmSignalStrength_;
        if (!protobufList.isModifiable()) {
            reefProtocol$NetworkState.tmSignalStrength_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        AbstractMessageLite.addAll((Iterable) arrayList, (List) reefProtocol$NetworkState.tmSignalStrength_);
    }

    public static void h(ReefProtocol$NetworkState reefProtocol$NetworkState, boolean z) {
        reefProtocol$NetworkState.capabilitiesHasTransportCellular_ = z;
    }

    public static void m(ReefProtocol$NetworkState reefProtocol$NetworkState, boolean z) {
        reefProtocol$NetworkState.capabilitiesHasTransportWifi_ = z;
    }

    public static void n(ReefProtocol$NetworkState reefProtocol$NetworkState, boolean z) {
        reefProtocol$NetworkState.isRoaming_ = z;
    }

    public static void o(ReefProtocol$NetworkState reefProtocol$NetworkState, boolean z) {
        reefProtocol$NetworkState.isVpn_ = z;
    }

    public static void p(ReefProtocol$NetworkState reefProtocol$NetworkState, int i) {
        reefProtocol$NetworkState.mobileNetworkTypeCode_ = i;
    }

    public static void q(ReefProtocol$NetworkState reefProtocol$NetworkState, int i) {
        reefProtocol$NetworkState.networkBandwidth_ = i;
    }

    public static void r(ReefProtocol$NetworkState reefProtocol$NetworkState, MobileNetworkDataState mobileNetworkDataState) {
        reefProtocol$NetworkState.getClass();
        reefProtocol$NetworkState.networkDataState_ = mobileNetworkDataState.getNumber();
    }

    public static void s(ReefProtocol$NetworkState reefProtocol$NetworkState, String str) {
        reefProtocol$NetworkState.getClass();
        str.getClass();
        reefProtocol$NetworkState.networkOperator_ = str;
    }

    public static void t(ReefProtocol$NetworkState reefProtocol$NetworkState, ReefProtocol$NetworkType reefProtocol$NetworkType) {
        reefProtocol$NetworkState.getClass();
        reefProtocol$NetworkState.networkType_ = reefProtocol$NetworkType.getNumber();
    }

    public static void u(ReefProtocol$NetworkState reefProtocol$NetworkState, String str) {
        reefProtocol$NetworkState.getClass();
        str.getClass();
        reefProtocol$NetworkState.operatorName_ = str;
    }

    public static void v(ReefProtocol$NetworkState reefProtocol$NetworkState, long j) {
        reefProtocol$NetworkState.purgedReceivedBytes_ = j;
    }

    public static void w(ReefProtocol$NetworkState reefProtocol$NetworkState, long j) {
        reefProtocol$NetworkState.purgedReceivedBytesByProcess_ = j;
    }

    public static void x(ReefProtocol$NetworkState reefProtocol$NetworkState, long j) {
        reefProtocol$NetworkState.purgedReceivedBytesBySession_ = j;
    }

    public static void y(ReefProtocol$NetworkState reefProtocol$NetworkState, int i) {
        reefProtocol$NetworkState.signalStrength_ = i;
    }

    public static void z(ReefProtocol$NetworkState reefProtocol$NetworkState, String str) {
        reefProtocol$NetworkState.getClass();
        str.getClass();
        reefProtocol$NetworkState.simOperator_ = str;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (lof0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new ReefProtocol$NetworkState();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u001a\u0000\u0000\u0001\u001b\u001a\u0000\u0005\u0000\u0001\f\u0002\u001b\u0003\u0002\u0004\u0002\u0005Ȉ\u0006Ȉ\u0007\u0007\b\f\t\u001b\n\u001b\u000b\u001b\f\u0004\r\u0004\u000f\u0004\u0010\t\u0011\u0002\u0012\u0002\u0013\u0002\u0014\u0002\u0015\u0007\u0016\u0007\u0017\u0004\u0018\u0004\u0019Ȉ\u001a\u001b\u001b\u0007", new Object[]{"networkType_", "simInfo_", m.class, "totalReceivedBytes_", "totalReceivedBytesByProcess_", "simOperator_", "networkOperator_", "isRoaming_", "networkDataState_", "cellsBecameActiveSinceLastSync_", c.class, "cellsBecameInactiveSinceLastSync_", c.class, "allCellInfo_", c.class, "typeCode_", "mobileNetworkTypeCode_", "subtypeCode_", "noGuaranteedGsmSignalStrengthInfo_", "purgedReceivedBytes_", "purgedReceivedBytesByProcess_", "totalReceivedBytesBySession_", "purgedReceivedBytesBySession_", "capabilitiesHasTransportCellular_", "capabilitiesHasTransportWifi_", "networkBandwidth_", "signalStrength_", "operatorName_", "tmSignalStrength_", u.class, "isVpn_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ReefProtocol$NetworkState> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (ReefProtocol$NetworkState.class) {
                    try {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    } catch (Throwable th) {
                        throw th;
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
}

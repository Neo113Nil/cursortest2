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
public final class ReefProtocol$Event extends GeneratedMessageLite<ReefProtocol$Event, a> implements MessageLiteOrBuilder {
    public static final int APPLICATIONSTARTTIME_FIELD_NUMBER = 12;
    public static final int APPLICATIONSTATE_FIELD_NUMBER = 8;
    public static final int AUDIOPLAYBACKEVENT_FIELD_NUMBER = 25;
    public static final int BOOTELAPSEDTIME_FIELD_NUMBER = 16;
    public static final int CLIENTSTATE_FIELD_NUMBER = 10;
    public static final int CONTENTSTATE_FIELD_NUMBER = 9;
    private static final ReefProtocol$Event DEFAULT_INSTANCE;
    public static final int DEVICESTATE_FIELD_NUMBER = 7;
    public static final int ERRORSTATE_FIELD_NUMBER = 11;
    public static final int GPSLOCATIONSTATE_FIELD_NUMBER = 18;
    public static final int HTTPREQUESTMETRICSTATE_FIELD_NUMBER = 19;
    public static final int IMAGESLOADEDSTATE_FIELD_NUMBER = 27;
    public static final int INSTANCEID_FIELD_NUMBER = 20;
    public static final int LOCATIONSTATE_FIELD_NUMBER = 14;
    public static final int NETWORKLOCATIONSTATE_FIELD_NUMBER = 17;
    public static final int NETWORKSTATE_FIELD_NUMBER = 6;
    private static volatile Parser<ReefProtocol$Event> PARSER = null;
    public static final int PERMISSIONSTATE_FIELD_NUMBER = 15;
    public static final int PLAYBACKSTATE_FIELD_NUMBER = 5;
    public static final int REEFSDKSTATE_FIELD_NUMBER = 22;
    public static final int SEQUENCENUMBER_FIELD_NUMBER = 2;
    public static final int TESTID_FIELD_NUMBER = 24;
    public static final int TIMESTAMP2_FIELD_NUMBER = 23;
    public static final int TIMESTAMP_FIELD_NUMBER = 3;
    public static final int TIMEZONE_FIELD_NUMBER = 4;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int USERSTATE_FIELD_NUMBER = 21;
    public static final int WIFIINFO_FIELD_NUMBER = 13;
    private long applicationStartTime_;
    private ReefProtocol$ApplicationState applicationState_;
    private com.vk.reefton.protocol.a audioPlaybackEvent_;
    private long bootElapsedTime_;
    private d clientState_;
    private ReefProtocol$ContentState contentState_;
    private ReefProtocol$DeviceState deviceState_;
    private f errorState_;
    private ReefProtocol$LocationState gpsLocationState_;
    private i httpRequestMetricState_;
    private k imagesLoadedState_;
    private int instanceId_;
    private ReefProtocol$LocationState locationState_;
    private ReefProtocol$LocationState networkLocationState_;
    private ReefProtocol$NetworkState networkState_;
    private r permissionState_;
    private s playbackState_;
    private t reefSdkState_;
    private int sequenceNumber_;
    private long timestamp2_;
    private long timestamp_;
    private int timezone_;
    private int type_;
    private x userState_;
    private Internal.ProtobufList<y> wifiInfo_ = GeneratedMessageLite.emptyProtobufList();
    private String testId_ = "";

    public enum Type implements Internal.EnumLite {
        UNKNOWN(0),
        PLAYBACK_PLAY(1),
        PLAYBACK_BUFFERING_START(2),
        PLAYBACK_BUFFERING_STOP(3),
        PLAYBACK_PAUSE(4),
        PLAYBACK_RESUME(5),
        PLAYBACK_STOP(6),
        PLAYBACK_SEEK_START(7),
        PLAYBACK_SEEK_STOP(8),
        PLAYBACK_ERROR(9),
        PLAYBACK_BITRATE_CHANGE(10),
        PLAYBACK_HEARTBEAT(11),
        NETWORK_TYPE_CHANGE(12),
        PLAYBACK_BITRATE_CHANGE_ACTUAL(13),
        APP_WAKEUP(14),
        UX_PLAYBACK_PLAY(15),
        APP_HEARTBEAT(16),
        APP_BACKGROUND(17),
        AUDIO_FRAGMENT_LOADED(51),
        AUDIO_FRAGMENT_STALLED(52),
        IMAGES_IMAGE_LOADED(81),
        UNRECOGNIZED(-1);

        public static final int APP_BACKGROUND_VALUE = 17;
        public static final int APP_HEARTBEAT_VALUE = 16;
        public static final int APP_WAKEUP_VALUE = 14;
        public static final int AUDIO_FRAGMENT_LOADED_VALUE = 51;
        public static final int AUDIO_FRAGMENT_STALLED_VALUE = 52;
        public static final int IMAGES_IMAGE_LOADED_VALUE = 81;
        public static final int NETWORK_TYPE_CHANGE_VALUE = 12;
        public static final int PLAYBACK_BITRATE_CHANGE_ACTUAL_VALUE = 13;
        public static final int PLAYBACK_BITRATE_CHANGE_VALUE = 10;
        public static final int PLAYBACK_BUFFERING_START_VALUE = 2;
        public static final int PLAYBACK_BUFFERING_STOP_VALUE = 3;
        public static final int PLAYBACK_ERROR_VALUE = 9;
        public static final int PLAYBACK_HEARTBEAT_VALUE = 11;
        public static final int PLAYBACK_PAUSE_VALUE = 4;
        public static final int PLAYBACK_PLAY_VALUE = 1;
        public static final int PLAYBACK_RESUME_VALUE = 5;
        public static final int PLAYBACK_SEEK_START_VALUE = 7;
        public static final int PLAYBACK_SEEK_STOP_VALUE = 8;
        public static final int PLAYBACK_STOP_VALUE = 6;
        public static final int UNKNOWN_VALUE = 0;
        public static final int UX_PLAYBACK_PLAY_VALUE = 15;
        private static final Internal.EnumLiteMap<Type> internalValueMap = new a();
        private final int value;

        public class a implements Internal.EnumLiteMap<Type> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Type findValueByNumber(int i) {
                if (i == 51) {
                    return Type.AUDIO_FRAGMENT_LOADED;
                }
                if (i == 52) {
                    return Type.AUDIO_FRAGMENT_STALLED;
                }
                if (i == 81) {
                    return Type.IMAGES_IMAGE_LOADED;
                }
                switch (i) {
                    case 0:
                        return Type.UNKNOWN;
                    case 1:
                        return Type.PLAYBACK_PLAY;
                    case 2:
                        return Type.PLAYBACK_BUFFERING_START;
                    case 3:
                        return Type.PLAYBACK_BUFFERING_STOP;
                    case 4:
                        return Type.PLAYBACK_PAUSE;
                    case 5:
                        return Type.PLAYBACK_RESUME;
                    case 6:
                        return Type.PLAYBACK_STOP;
                    case 7:
                        return Type.PLAYBACK_SEEK_START;
                    case 8:
                        return Type.PLAYBACK_SEEK_STOP;
                    case 9:
                        return Type.PLAYBACK_ERROR;
                    case 10:
                        return Type.PLAYBACK_BITRATE_CHANGE;
                    case 11:
                        return Type.PLAYBACK_HEARTBEAT;
                    case 12:
                        return Type.NETWORK_TYPE_CHANGE;
                    case 13:
                        return Type.PLAYBACK_BITRATE_CHANGE_ACTUAL;
                    case 14:
                        return Type.APP_WAKEUP;
                    case 15:
                        return Type.UX_PLAYBACK_PLAY;
                    case 16:
                        return Type.APP_HEARTBEAT;
                    case 17:
                        return Type.APP_BACKGROUND;
                    default:
                        return null;
                }
            }
        }

        Type(int i) {
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

    public static final class a extends GeneratedMessageLite.Builder<ReefProtocol$Event, a> implements MessageLiteOrBuilder {
        public a() {
            super(ReefProtocol$Event.DEFAULT_INSTANCE);
        }

        public final void A(int i) {
            copyOnWrite();
            ReefProtocol$Event.z((ReefProtocol$Event) this.instance, i);
        }

        public final void B(long j) {
            copyOnWrite();
            ReefProtocol$Event.A((ReefProtocol$Event) this.instance, j);
        }

        public final void C(long j) {
            copyOnWrite();
            ReefProtocol$Event.B((ReefProtocol$Event) this.instance, j);
        }

        public final void D(int i) {
            copyOnWrite();
            ReefProtocol$Event.C((ReefProtocol$Event) this.instance, i);
        }

        public final void E(Type type) {
            copyOnWrite();
            ReefProtocol$Event.D((ReefProtocol$Event) this.instance, type);
        }

        public final void F(x xVar) {
            copyOnWrite();
            ReefProtocol$Event.E((ReefProtocol$Event) this.instance, xVar);
        }

        public final void b(ArrayList arrayList) {
            copyOnWrite();
            ReefProtocol$Event.b((ReefProtocol$Event) this.instance, arrayList);
        }

        public final void d(long j) {
            copyOnWrite();
            ReefProtocol$Event.c((ReefProtocol$Event) this.instance, j);
        }

        public final void f(ReefProtocol$ApplicationState reefProtocol$ApplicationState) {
            copyOnWrite();
            ReefProtocol$Event.d((ReefProtocol$Event) this.instance, reefProtocol$ApplicationState);
        }

        public final void g(com.vk.reefton.protocol.a aVar) {
            copyOnWrite();
            ReefProtocol$Event.f((ReefProtocol$Event) this.instance, aVar);
        }

        public final void h(long j) {
            copyOnWrite();
            ReefProtocol$Event.g((ReefProtocol$Event) this.instance, j);
        }

        public final void m(d dVar) {
            copyOnWrite();
            ReefProtocol$Event.h((ReefProtocol$Event) this.instance, dVar);
        }

        public final void n(ReefProtocol$ContentState reefProtocol$ContentState) {
            copyOnWrite();
            ReefProtocol$Event.m((ReefProtocol$Event) this.instance, reefProtocol$ContentState);
        }

        public final void o(ReefProtocol$DeviceState reefProtocol$DeviceState) {
            copyOnWrite();
            ReefProtocol$Event.n((ReefProtocol$Event) this.instance, reefProtocol$DeviceState);
        }

        public final void p(f fVar) {
            copyOnWrite();
            ReefProtocol$Event.o((ReefProtocol$Event) this.instance, fVar);
        }

        public final void q(ReefProtocol$LocationState reefProtocol$LocationState) {
            copyOnWrite();
            ReefProtocol$Event.p((ReefProtocol$Event) this.instance, reefProtocol$LocationState);
        }

        public final void r(i iVar) {
            copyOnWrite();
            ReefProtocol$Event.q((ReefProtocol$Event) this.instance, iVar);
        }

        public final void s(k kVar) {
            copyOnWrite();
            ReefProtocol$Event.r((ReefProtocol$Event) this.instance, kVar);
        }

        public final void t(int i) {
            copyOnWrite();
            ReefProtocol$Event.s((ReefProtocol$Event) this.instance, i);
        }

        public final void u(ReefProtocol$LocationState reefProtocol$LocationState) {
            copyOnWrite();
            ReefProtocol$Event.t((ReefProtocol$Event) this.instance, reefProtocol$LocationState);
        }

        public final void v(ReefProtocol$LocationState reefProtocol$LocationState) {
            copyOnWrite();
            ReefProtocol$Event.u((ReefProtocol$Event) this.instance, reefProtocol$LocationState);
        }

        public final void w(ReefProtocol$NetworkState reefProtocol$NetworkState) {
            copyOnWrite();
            ReefProtocol$Event.v((ReefProtocol$Event) this.instance, reefProtocol$NetworkState);
        }

        public final void x(r rVar) {
            copyOnWrite();
            ReefProtocol$Event.w((ReefProtocol$Event) this.instance, rVar);
        }

        public final void y(s sVar) {
            copyOnWrite();
            ReefProtocol$Event.x((ReefProtocol$Event) this.instance, sVar);
        }

        public final void z(t tVar) {
            copyOnWrite();
            ReefProtocol$Event.y((ReefProtocol$Event) this.instance, tVar);
        }
    }

    static {
        ReefProtocol$Event reefProtocol$Event = new ReefProtocol$Event();
        DEFAULT_INSTANCE = reefProtocol$Event;
        GeneratedMessageLite.registerDefaultInstance(ReefProtocol$Event.class, reefProtocol$Event);
    }

    public static void A(ReefProtocol$Event reefProtocol$Event, long j) {
        reefProtocol$Event.timestamp_ = j;
    }

    public static void B(ReefProtocol$Event reefProtocol$Event, long j) {
        reefProtocol$Event.timestamp2_ = j;
    }

    public static void C(ReefProtocol$Event reefProtocol$Event, int i) {
        reefProtocol$Event.timezone_ = i;
    }

    public static void D(ReefProtocol$Event reefProtocol$Event, Type type) {
        reefProtocol$Event.getClass();
        reefProtocol$Event.type_ = type.getNumber();
    }

    public static void E(ReefProtocol$Event reefProtocol$Event, x xVar) {
        reefProtocol$Event.getClass();
        xVar.getClass();
        reefProtocol$Event.userState_ = xVar;
    }

    public static a G() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static void b(ReefProtocol$Event reefProtocol$Event, ArrayList arrayList) {
        Internal.ProtobufList<y> protobufList = reefProtocol$Event.wifiInfo_;
        if (!protobufList.isModifiable()) {
            reefProtocol$Event.wifiInfo_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        AbstractMessageLite.addAll((Iterable) arrayList, (List) reefProtocol$Event.wifiInfo_);
    }

    public static void c(ReefProtocol$Event reefProtocol$Event, long j) {
        reefProtocol$Event.applicationStartTime_ = j;
    }

    public static void d(ReefProtocol$Event reefProtocol$Event, ReefProtocol$ApplicationState reefProtocol$ApplicationState) {
        reefProtocol$Event.getClass();
        reefProtocol$ApplicationState.getClass();
        reefProtocol$Event.applicationState_ = reefProtocol$ApplicationState;
    }

    public static void f(ReefProtocol$Event reefProtocol$Event, com.vk.reefton.protocol.a aVar) {
        reefProtocol$Event.getClass();
        aVar.getClass();
        reefProtocol$Event.audioPlaybackEvent_ = aVar;
    }

    public static void g(ReefProtocol$Event reefProtocol$Event, long j) {
        reefProtocol$Event.bootElapsedTime_ = j;
    }

    public static void h(ReefProtocol$Event reefProtocol$Event, d dVar) {
        reefProtocol$Event.getClass();
        dVar.getClass();
        reefProtocol$Event.clientState_ = dVar;
    }

    public static void m(ReefProtocol$Event reefProtocol$Event, ReefProtocol$ContentState reefProtocol$ContentState) {
        reefProtocol$Event.getClass();
        reefProtocol$ContentState.getClass();
        reefProtocol$Event.contentState_ = reefProtocol$ContentState;
    }

    public static void n(ReefProtocol$Event reefProtocol$Event, ReefProtocol$DeviceState reefProtocol$DeviceState) {
        reefProtocol$Event.getClass();
        reefProtocol$DeviceState.getClass();
        reefProtocol$Event.deviceState_ = reefProtocol$DeviceState;
    }

    public static void o(ReefProtocol$Event reefProtocol$Event, f fVar) {
        reefProtocol$Event.getClass();
        fVar.getClass();
        reefProtocol$Event.errorState_ = fVar;
    }

    public static void p(ReefProtocol$Event reefProtocol$Event, ReefProtocol$LocationState reefProtocol$LocationState) {
        reefProtocol$Event.getClass();
        reefProtocol$Event.gpsLocationState_ = reefProtocol$LocationState;
    }

    public static void q(ReefProtocol$Event reefProtocol$Event, i iVar) {
        reefProtocol$Event.getClass();
        iVar.getClass();
        reefProtocol$Event.httpRequestMetricState_ = iVar;
    }

    public static void r(ReefProtocol$Event reefProtocol$Event, k kVar) {
        reefProtocol$Event.getClass();
        kVar.getClass();
        reefProtocol$Event.imagesLoadedState_ = kVar;
    }

    public static void s(ReefProtocol$Event reefProtocol$Event, int i) {
        reefProtocol$Event.instanceId_ = i;
    }

    public static void t(ReefProtocol$Event reefProtocol$Event, ReefProtocol$LocationState reefProtocol$LocationState) {
        reefProtocol$Event.getClass();
        reefProtocol$Event.locationState_ = reefProtocol$LocationState;
    }

    public static void u(ReefProtocol$Event reefProtocol$Event, ReefProtocol$LocationState reefProtocol$LocationState) {
        reefProtocol$Event.getClass();
        reefProtocol$Event.networkLocationState_ = reefProtocol$LocationState;
    }

    public static void v(ReefProtocol$Event reefProtocol$Event, ReefProtocol$NetworkState reefProtocol$NetworkState) {
        reefProtocol$Event.getClass();
        reefProtocol$NetworkState.getClass();
        reefProtocol$Event.networkState_ = reefProtocol$NetworkState;
    }

    public static void w(ReefProtocol$Event reefProtocol$Event, r rVar) {
        reefProtocol$Event.getClass();
        rVar.getClass();
        reefProtocol$Event.permissionState_ = rVar;
    }

    public static void x(ReefProtocol$Event reefProtocol$Event, s sVar) {
        reefProtocol$Event.getClass();
        sVar.getClass();
        reefProtocol$Event.playbackState_ = sVar;
    }

    public static void y(ReefProtocol$Event reefProtocol$Event, t tVar) {
        reefProtocol$Event.getClass();
        tVar.getClass();
        reefProtocol$Event.reefSdkState_ = tVar;
    }

    public static void z(ReefProtocol$Event reefProtocol$Event, int i) {
        reefProtocol$Event.sequenceNumber_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (lof0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new ReefProtocol$Event();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u001a\u0000\u0000\u0001\u001b\u001a\u0000\u0001\u0000\u0001\f\u0002\u0004\u0003\u0002\u0004\u0004\u0005\t\u0006\t\u0007\t\b\t\t\t\n\t\u000b\t\f\u0002\r\u001b\u000e\t\u000f\t\u0010\u0002\u0011\t\u0012\t\u0013\t\u0014\u0004\u0015\t\u0016\t\u0017\u0002\u0018Ȉ\u0019\t\u001b\t", new Object[]{"type_", "sequenceNumber_", "timestamp_", "timezone_", "playbackState_", "networkState_", "deviceState_", "applicationState_", "contentState_", "clientState_", "errorState_", "applicationStartTime_", "wifiInfo_", y.class, "locationState_", "permissionState_", "bootElapsedTime_", "networkLocationState_", "gpsLocationState_", "httpRequestMetricState_", "instanceId_", "userState_", "reefSdkState_", "timestamp2_", "testId_", "audioPlaybackEvent_", "imagesLoadedState_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ReefProtocol$Event> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (ReefProtocol$Event.class) {
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

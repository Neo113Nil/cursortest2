package com.vk.reefton.protocol;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Int32Value;
import com.google.protobuf.Int64Value;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.vk.reefton.protocol.ReefProtocol$ContentState;
import xsna.lof0;

/* compiled from: ReefProtocol.java */
/* loaded from: classes5.dex */
public final class s extends GeneratedMessageLite<s, a> implements MessageLiteOrBuilder {
    public static final int BITRATE_FIELD_NUMBER = 2;
    public static final int BUFFERINGDURATION2_FIELD_NUMBER = 19;
    public static final int BUFFERINGDURATION_FIELD_NUMBER = 8;
    public static final int BUFFERINGINDEX_FIELD_NUMBER = 6;
    public static final int BUFFERINGSTARTTIME2_FIELD_NUMBER = 18;
    public static final int BUFFERINGSTARTTIME_FIELD_NUMBER = 7;
    public static final int BUFFERPERCENT_FIELD_NUMBER = 5;
    private static final s DEFAULT_INSTANCE;
    public static final int IDENTIFIER_FIELD_NUMBER = 1;
    public static final int ISADV_FIELD_NUMBER = 13;
    public static final int ISPLAYING_FIELD_NUMBER = 17;
    public static final int LASTBANDWIDTHESTIMATE_FIELD_NUMBER = 11;
    public static final int LASTREALBANDWIDTHESTIMATE_FIELD_NUMBER = 12;
    public static final int MAXQUALITY_FIELD_NUMBER = 20;
    private static volatile Parser<s> PARSER = null;
    public static final int PLAYBACKEVENTSEQUENCENUMBER_FIELD_NUMBER = 9;
    public static final int POSITION_FIELD_NUMBER = 3;
    public static final int PREVQUALITY_FIELD_NUMBER = 14;
    public static final int QUALITY_FIELD_NUMBER = 10;
    public static final int SESSIONPURGEDWATCHTIME_FIELD_NUMBER = 16;
    public static final int SESSIONTOTALWATCHTIME_FIELD_NUMBER = 15;
    public static final int TIMEFROMSTART_FIELD_NUMBER = 4;
    private Int32Value bitrate_;
    private double bufferPercent_;
    private Int64Value bufferingDuration2_;
    private Int64Value bufferingDuration_;
    private Int32Value bufferingIndex_;
    private Int64Value bufferingStartTime2_;
    private Int64Value bufferingStartTime_;
    private String identifier_ = "";
    private boolean isAdv_;
    private boolean isPlaying_;
    private b lastBandwidthEstimate_;
    private b lastRealBandwidthEstimate_;
    private int maxQuality_;
    private int playbackEventSequenceNumber_;
    private double position_;
    private int prevQuality_;
    private int quality_;
    private long sessionPurgedWatchTime_;
    private long sessionTotalWatchTime_;
    private long timeFromStart_;

    /* compiled from: ReefProtocol.java */
    public static final class a extends GeneratedMessageLite.Builder<s, a> implements MessageLiteOrBuilder {
        public a() {
            super(s.DEFAULT_INSTANCE);
        }

        public final void b(Int32Value int32Value) {
            copyOnWrite();
            s.b((s) this.instance, int32Value);
        }

        public final void c(double d) {
            copyOnWrite();
            s.c((s) this.instance, d);
        }

        public final void d(Int64Value int64Value) {
            copyOnWrite();
            s.d((s) this.instance, int64Value);
        }

        public final void f(Int64Value int64Value) {
            copyOnWrite();
            s.f((s) this.instance, int64Value);
        }

        public final void g(Int32Value int32Value) {
            copyOnWrite();
            s.g((s) this.instance, int32Value);
        }

        public final void h(Int64Value int64Value) {
            copyOnWrite();
            s.h((s) this.instance, int64Value);
        }

        public final void m(Int64Value int64Value) {
            copyOnWrite();
            s.m((s) this.instance, int64Value);
        }

        public final void n(String str) {
            copyOnWrite();
            s.n((s) this.instance, str);
        }

        public final void o(boolean z) {
            copyOnWrite();
            s.o((s) this.instance, z);
        }

        public final void p(boolean z) {
            copyOnWrite();
            s.p((s) this.instance, z);
        }

        public final void q(b bVar) {
            copyOnWrite();
            s.q((s) this.instance, bVar);
        }

        public final void r(ReefProtocol$ContentState.Quality quality) {
            copyOnWrite();
            s.r((s) this.instance, quality);
        }

        public final void s(int i) {
            copyOnWrite();
            s.s((s) this.instance, i);
        }

        public final void t(double d) {
            copyOnWrite();
            s.t((s) this.instance, d);
        }

        public final void u(ReefProtocol$ContentState.Quality quality) {
            copyOnWrite();
            s.u((s) this.instance, quality);
        }

        public final void v(ReefProtocol$ContentState.Quality quality) {
            copyOnWrite();
            s.v((s) this.instance, quality);
        }

        public final void w(long j) {
            copyOnWrite();
            s.w((s) this.instance, j);
        }

        public final void x(long j) {
            copyOnWrite();
            s.x((s) this.instance, j);
        }

        public final void y(long j) {
            copyOnWrite();
            s.y((s) this.instance, j);
        }
    }

    static {
        s sVar = new s();
        DEFAULT_INSTANCE = sVar;
        GeneratedMessageLite.registerDefaultInstance(s.class, sVar);
    }

    public static a A() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static void b(s sVar, Int32Value int32Value) {
        sVar.getClass();
        int32Value.getClass();
        sVar.bitrate_ = int32Value;
    }

    public static void c(s sVar, double d) {
        sVar.bufferPercent_ = d;
    }

    public static void d(s sVar, Int64Value int64Value) {
        sVar.getClass();
        int64Value.getClass();
        sVar.bufferingDuration_ = int64Value;
    }

    public static void f(s sVar, Int64Value int64Value) {
        sVar.getClass();
        int64Value.getClass();
        sVar.bufferingDuration2_ = int64Value;
    }

    public static void g(s sVar, Int32Value int32Value) {
        sVar.getClass();
        int32Value.getClass();
        sVar.bufferingIndex_ = int32Value;
    }

    public static void h(s sVar, Int64Value int64Value) {
        sVar.getClass();
        int64Value.getClass();
        sVar.bufferingStartTime_ = int64Value;
    }

    public static void m(s sVar, Int64Value int64Value) {
        sVar.getClass();
        int64Value.getClass();
        sVar.bufferingStartTime2_ = int64Value;
    }

    public static void n(s sVar, String str) {
        sVar.getClass();
        str.getClass();
        sVar.identifier_ = str;
    }

    public static void o(s sVar, boolean z) {
        sVar.isAdv_ = z;
    }

    public static void p(s sVar, boolean z) {
        sVar.isPlaying_ = z;
    }

    public static void q(s sVar, b bVar) {
        sVar.getClass();
        bVar.getClass();
        sVar.lastBandwidthEstimate_ = bVar;
    }

    public static void r(s sVar, ReefProtocol$ContentState.Quality quality) {
        sVar.getClass();
        sVar.maxQuality_ = quality.getNumber();
    }

    public static void s(s sVar, int i) {
        sVar.playbackEventSequenceNumber_ = i;
    }

    public static void t(s sVar, double d) {
        sVar.position_ = d;
    }

    public static void u(s sVar, ReefProtocol$ContentState.Quality quality) {
        sVar.getClass();
        sVar.prevQuality_ = quality.getNumber();
    }

    public static void v(s sVar, ReefProtocol$ContentState.Quality quality) {
        sVar.getClass();
        sVar.quality_ = quality.getNumber();
    }

    public static void w(s sVar, long j) {
        sVar.sessionPurgedWatchTime_ = j;
    }

    public static void x(s sVar, long j) {
        sVar.sessionTotalWatchTime_ = j;
    }

    public static void y(s sVar, long j) {
        sVar.timeFromStart_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (lof0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new s();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0014\u0000\u0000\u0001\u0014\u0014\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\u0000\u0004\u0002\u0005\u0000\u0006\t\u0007\t\b\t\t\u0004\n\f\u000b\t\f\t\r\u0007\u000e\f\u000f\u0002\u0010\u0002\u0011\u0007\u0012\t\u0013\t\u0014\f", new Object[]{"identifier_", "bitrate_", "position_", "timeFromStart_", "bufferPercent_", "bufferingIndex_", "bufferingStartTime_", "bufferingDuration_", "playbackEventSequenceNumber_", "quality_", "lastBandwidthEstimate_", "lastRealBandwidthEstimate_", "isAdv_", "prevQuality_", "sessionTotalWatchTime_", "sessionPurgedWatchTime_", "isPlaying_", "bufferingStartTime2_", "bufferingDuration2_", "maxQuality_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<s> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (s.class) {
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

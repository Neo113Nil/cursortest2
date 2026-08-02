package com.vk.im.engine.reporters;

import android.util.SparseArray;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.metrics.eventtracking.Event;
import java.util.Locale;
import ru.ok.android.webrtc.connection.BadConnectionSignaling;
import xsna.asp;
import xsna.bh10;
import xsna.brm0;
import xsna.el3;
import xsna.epx;
import xsna.shy;
import xsna.urd0;
import xsna.vu5;
import xsna.zrp;

/* compiled from: VideoConversionReporter.kt */
/* loaded from: classes2.dex */
public final class VideoConversionReporter {
    public static final SparseArray<a> a = new SparseArray<>();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoConversionReporter.kt */
    public static final class CallContext {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CallContext[] $VALUES;
        public static final CallContext MESSAGES;
        public static final CallContext VIDEOS;
        private final String value;

        static {
            CallContext callContext = new CallContext("MESSAGES", 0, "messages");
            MESSAGES = callContext;
            CallContext callContext2 = new CallContext("VIDEOS", 1, "videos");
            VIDEOS = callContext2;
            CallContext[] callContextArr = {callContext, callContext2};
            $VALUES = callContextArr;
            $ENTRIES = new asp(callContextArr);
        }

        public CallContext(String str, int i, String str2) {
            this.value = str2;
        }

        public static CallContext valueOf(String str) {
            return (CallContext) Enum.valueOf(CallContext.class, str);
        }

        public static CallContext[] values() {
            return (CallContext[]) $VALUES.clone();
        }
    }

    /* compiled from: VideoConversionReporter.kt */
    public static abstract class a {

        /* compiled from: VideoConversionReporter.kt */
        /* renamed from: com.vk.im.engine.reporters.VideoConversionReporter$a$a, reason: collision with other inner class name */
        public static final class C1126a extends a {
            public final CallContext a;
            public final long c;
            public final long j;
            public final long k;
            public String b = "unknown";
            public long d = 0;
            public int e = 0;
            public int f = 0;
            public int g = 0;
            public int h = 0;
            public int i = 0;

            public C1126a(CallContext callContext, long j, long j2, long j3) {
                this.a = callContext;
                this.c = j;
                this.j = j2;
                this.k = j3;
            }

            @Override // com.vk.im.engine.reporters.VideoConversionReporter.a
            public final Event a() {
                String y;
                el3 el3Var = Event.b;
                Event.a aVar = new Event.a();
                y = brm0.y("PERF.UPLOAD_VIDEO_WITH_CONVERSION", ".", BundleUtil.UNDERLINE_TAG);
                aVar.g(y.toLowerCase(Locale.ROOT));
                aVar.b("conversion_time", Long.valueOf(this.k));
                aVar.b("upload_time", Long.valueOf(this.d));
                aVar.b("source_file_size", Long.valueOf(this.j));
                aVar.b("result_file_size", Long.valueOf(this.c));
                aVar.c("connection_type", this.b);
                aVar.b(BadConnectionSignaling.KEY_BAD_NET_BITRATE, Integer.valueOf(this.e));
                aVar.b("width", Integer.valueOf(this.g));
                aVar.b("height", Integer.valueOf(this.h));
                aVar.b("area", Integer.valueOf(this.i));
                aVar.i("StatlogTracker");
                return aVar.e();
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1126a)) {
                    return false;
                }
                C1126a c1126a = (C1126a) obj;
                return this.a == c1126a.a && epx.f(this.b, c1126a.b) && this.c == c1126a.c && this.d == c1126a.d && this.e == c1126a.e && this.f == c1126a.f && this.g == c1126a.g && this.h == c1126a.h && this.i == c1126a.i && this.j == c1126a.j && this.k == c1126a.k;
            }

            public final int hashCode() {
                return Long.hashCode(this.k) + bh10.a(shy.a(this.i, shy.a(this.h, shy.a(this.g, shy.a(this.f, shy.a(this.e, bh10.a(bh10.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31), 31), 31), 31), 31, this.j);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("WithConversionReport(callContext=");
                sb.append(this.a);
                sb.append(", connectionType=");
                sb.append(this.b);
                sb.append(", uploadFileSize=");
                sb.append(this.c);
                sb.append(", uploadTime=");
                sb.append(this.d);
                sb.append(", videoBitrate=");
                sb.append(this.e);
                sb.append(", duration=");
                sb.append(this.f);
                sb.append(", width=");
                sb.append(this.g);
                sb.append(", height=");
                sb.append(this.h);
                sb.append(", square=");
                sb.append(this.i);
                sb.append(", sourceFileSize=");
                sb.append(this.j);
                sb.append(", conversionTime=");
                return vu5.a(')', this.k, sb);
            }
        }

        /* compiled from: VideoConversionReporter.kt */
        public static final class b extends a {
            public final CallContext a;
            public final String b;
            public final long c;
            public final long d;
            public final int e;
            public final int f;
            public final int g;
            public final int h;
            public final int i;

            public b(CallContext callContext, String str, long j, long j2, int i, int i2, int i3, int i4, int i5) {
                this.a = callContext;
                this.b = str;
                this.c = j;
                this.d = j2;
                this.e = i;
                this.f = i2;
                this.g = i3;
                this.h = i4;
                this.i = i5;
            }

            @Override // com.vk.im.engine.reporters.VideoConversionReporter.a
            public final Event a() {
                String y;
                el3 el3Var = Event.b;
                Event.a aVar = new Event.a();
                y = brm0.y("PERF.UPLOAD_VIDEO_WITHOUT_CONVERSION", ".", BundleUtil.UNDERLINE_TAG);
                aVar.g(y.toLowerCase(Locale.ROOT));
                aVar.b("upload_time", Long.valueOf(this.c));
                aVar.b("result_file_size", Long.valueOf(this.d));
                aVar.c("connection_type", this.b);
                aVar.b(BadConnectionSignaling.KEY_BAD_NET_BITRATE, Integer.valueOf(this.e));
                aVar.b("width", Integer.valueOf(this.g));
                aVar.b("height", Integer.valueOf(this.h));
                aVar.b("area", Integer.valueOf(this.i));
                aVar.i("StatlogTracker");
                return aVar.e();
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.a == bVar.a && epx.f(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f && this.g == bVar.g && this.h == bVar.h && this.i == bVar.i;
            }

            public final int hashCode() {
                return Integer.hashCode(this.i) + shy.a(this.h, shy.a(this.g, shy.a(this.f, shy.a(this.e, bh10.a(bh10.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31), 31), 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("WithoutConversionReport(callContext=");
                sb.append(this.a);
                sb.append(", connectionType=");
                sb.append(this.b);
                sb.append(", uploadTime=");
                sb.append(this.c);
                sb.append(", uploadFileSize=");
                sb.append(this.d);
                sb.append(", videoBitrate=");
                sb.append(this.e);
                sb.append(", duration=");
                sb.append(this.f);
                sb.append(", width=");
                sb.append(this.g);
                sb.append(", height=");
                sb.append(this.h);
                sb.append(", square=");
                return vu5.b(sb, this.i, ')');
            }
        }

        public abstract Event a();
    }
}

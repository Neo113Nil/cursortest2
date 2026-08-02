package com.vk.libvideo.design.compose.base.timeline;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.asp;
import xsna.at;
import xsna.bh10;
import xsna.dai;
import xsna.epx;
import xsna.ho8;
import xsna.iq;
import xsna.ms9;
import xsna.msy;
import xsna.mtk0;
import xsna.qoy;
import xsna.shy;
import xsna.te0;
import xsna.zrp;

/* compiled from: TimelineViewState.kt */
/* loaded from: classes2.dex */
public final class TimelineViewState {
    public final mtk0<Long> a;
    public final mtk0<Long> b;
    public final long c;
    public final boolean d;
    public final boolean e;
    public final TrackHeightType f;
    public final Style g;
    public final d h;
    public final c i;
    public final Object j;
    public final Object k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TimelineViewState.kt */
    public static final class Style {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;
        public static final Style Live;
        public static final Style Video;

        static {
            Style style = new Style("Video", 0);
            Video = style;
            Style style2 = new Style("Live", 1);
            Live = style2;
            Style[] styleArr = {style, style2};
            $VALUES = styleArr;
            $ENTRIES = new asp(styleArr);
        }

        public Style() {
            throw null;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TimelineViewState.kt */
    public static final class TrackHeightType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TrackHeightType[] $VALUES;
        public static final TrackHeightType Large;
        public static final TrackHeightType Small;

        static {
            TrackHeightType trackHeightType = new TrackHeightType("Large", 0);
            Large = trackHeightType;
            TrackHeightType trackHeightType2 = new TrackHeightType("Small", 1);
            Small = trackHeightType2;
            TrackHeightType[] trackHeightTypeArr = {trackHeightType, trackHeightType2};
            $VALUES = trackHeightTypeArr;
            $ENTRIES = new asp(trackHeightTypeArr);
        }

        public TrackHeightType() {
            throw null;
        }

        public static TrackHeightType valueOf(String str) {
            return (TrackHeightType) Enum.valueOf(TrackHeightType.class, str);
        }

        public static TrackHeightType[] values() {
            return (TrackHeightType[]) $VALUES.clone();
        }
    }

    /* compiled from: TimelineViewState.kt */
    public static final class a {
        public static TimelineViewState a(long j, long j2, long j3) {
            return new TimelineViewState(b(j), b(j2), j3, false, false, TrackHeightType.Small, Style.Video, null, null);
        }

        public static b b(long j) {
            return new b(Long.valueOf(j));
        }
    }

    /* compiled from: TimelineViewState.kt */
    public static final class b<T> implements mtk0<T> {
        public final Long b;

        public b(Long l) {
            this.b = l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b.equals(((b) obj).b);
        }

        @Override // xsna.mtk0
        public final T getValue() {
            return (T) this.b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return iq.b(new StringBuilder("ImmutableState(value="), this.b, ')');
        }
    }

    /* compiled from: TimelineViewState.kt */
    public static final class c {
        public final List<a> a;

        /* compiled from: TimelineViewState.kt */
        public static final class a {
            public final long a;
            public final long b;
            public final String c;

            public a(long j, long j2, String str) {
                this.a = j;
                this.b = j2;
                this.c = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a == aVar.a && this.b == aVar.b && epx.f(this.c, aVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + bh10.a(Long.hashCode(this.a) * 31, 31, this.b);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Item(startPosition=");
                sb.append(this.a);
                sb.append(", endPosition=");
                sb.append(this.b);
                sb.append(", title=");
                return ho8.a(sb, this.c, ')');
            }
        }

        public c(List<a> list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("Intervals(intervals="), this.a);
        }
    }

    /* compiled from: TimelineViewState.kt */
    public static final class d {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final List<String> f;
        public final int g;

        public d(int i, int i2, int i3, int i4, int i5, List<String> list) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = list;
            this.g = i3 * i4;
            list.size();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b && this.c == dVar.c && this.d == dVar.d && this.e == dVar.e && epx.f(this.f, dVar.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + shy.a(this.e, shy.a(this.d, shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TimelineImages(frameWidth=");
            sb.append(this.a);
            sb.append(", frameHeight=");
            sb.append(this.b);
            sb.append(", cols=");
            sb.append(this.c);
            sb.append(", rows=");
            sb.append(this.d);
            sb.append(", framesCount=");
            sb.append(this.e);
            sb.append(", links=");
            return ms9.a(')', sb, this.f);
        }
    }

    public TimelineViewState(mtk0<Long> mtk0Var, mtk0<Long> mtk0Var2, long j, boolean z, boolean z2, TrackHeightType trackHeightType, Style style, d dVar, c cVar) {
        this.a = mtk0Var;
        this.b = mtk0Var2;
        this.c = j;
        this.d = z;
        this.e = z2;
        this.f = trackHeightType;
        this.g = style;
        this.h = dVar;
        this.i = cVar;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.j = at.c(lazyThreadSafetyMode);
        this.k = msy.a(lazyThreadSafetyMode, new te0(12));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final dai.d<Long> a() {
        return (dai.d) this.k.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final dai.c b() {
        return (dai.c) this.j.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimelineViewState)) {
            return false;
        }
        TimelineViewState timelineViewState = (TimelineViewState) obj;
        return epx.f(this.a, timelineViewState.a) && epx.f(this.b, timelineViewState.b) && this.c == timelineViewState.c && this.d == timelineViewState.d && this.e == timelineViewState.e && this.f == timelineViewState.f && this.g == timelineViewState.g && epx.f(this.h, timelineViewState.h) && epx.f(this.i, timelineViewState.i);
    }

    public final int hashCode() {
        int hashCode = (this.g.hashCode() + ((this.f.hashCode() + qoy.b(qoy.b(bh10.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e)) * 31)) * 31;
        d dVar = this.h;
        int hashCode2 = (hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        c cVar = this.i;
        return hashCode2 + (cVar != null ? cVar.a.hashCode() : 0);
    }

    public final String toString() {
        return "TimelineViewState(progress=" + this.a + ", bufferedProgress=" + this.b + ", duration=" + this.c + ", isEnabled=" + this.d + ", isThumbVisible=" + this.e + ", trackHeightType=" + this.f + ", style=" + this.g + ", timelineImages=" + this.h + ", intervals=" + this.i + ')';
    }

    public /* synthetic */ TimelineViewState(mtk0 mtk0Var, mtk0 mtk0Var2, c cVar, int i) {
        this(mtk0Var, mtk0Var2, 100L, true, true, TrackHeightType.Small, Style.Video, null, (i & 256) != 0 ? null : cVar);
    }
}

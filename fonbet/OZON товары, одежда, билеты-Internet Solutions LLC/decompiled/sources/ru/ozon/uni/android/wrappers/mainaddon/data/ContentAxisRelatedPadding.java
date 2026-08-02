package ru.ozon.uni.android.wrappers.mainaddon.data;

import Cm.e;
import Sc.InterfaceC3999a;
import Sc.o;
import T7.E;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.wrappers.mainaddon.data.LayoutPadding;

@InterfaceC3999a
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0010\u0011\u0012B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000e\u0082\u0001\u0003\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/uni/android/wrappers/mainaddon/data/ContentAxisRelatedPadding;", "", "", "start", "end", "<init>", "(II)V", "Lru/ozon/uni/android/wrappers/mainaddon/data/Axis;", "axis", "Lru/ozon/uni/android/wrappers/mainaddon/data/LayoutPadding$padding;", "toLayoutPadding", "(Lru/ozon/uni/android/wrappers/mainaddon/data/Axis;)Lru/ozon/uni/android/wrappers/mainaddon/data/LayoutPadding$padding;", "I", "getStart", "()I", "getEnd", "zero", "startEnd", "startWithEnd", "Lru/ozon/uni/android/wrappers/mainaddon/data/ContentAxisRelatedPadding$startEnd;", "Lru/ozon/uni/android/wrappers/mainaddon/data/ContentAxisRelatedPadding$startWithEnd;", "Lru/ozon/uni/android/wrappers/mainaddon/data/ContentAxisRelatedPadding$zero;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class ContentAxisRelatedPadding {
    private final int end;
    private final int start;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Axis.values().length];
            try {
                iArr[Axis.HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Axis.VERTICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/uni/android/wrappers/mainaddon/data/ContentAxisRelatedPadding$startEnd;", "Lru/ozon/uni/android/wrappers/mainaddon/data/ContentAxisRelatedPadding;", "", "startEnd", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class startEnd extends ContentAxisRelatedPadding {
        private final int startEnd;

        public startEnd(int i11) {
            super(i11, i11, null);
            this.startEnd = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof startEnd) && this.startEnd == ((startEnd) other).startEnd;
        }

        public int hashCode() {
            return Integer.hashCode(this.startEnd);
        }

        @NotNull
        public String toString() {
            return E.a(this.startEnd, "startEnd(startEnd=", ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, d2 = {"Lru/ozon/uni/android/wrappers/mainaddon/data/ContentAxisRelatedPadding$startWithEnd;", "Lru/ozon/uni/android/wrappers/mainaddon/data/ContentAxisRelatedPadding;", "", "startPadding", "endPadding", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getStartPadding", "getEndPadding", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class startWithEnd extends ContentAxisRelatedPadding {
        private final int endPadding;
        private final int startPadding;

        public startWithEnd(int i11, int i12) {
            super(i11, i12, null);
            this.startPadding = i11;
            this.endPadding = i12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof startWithEnd)) {
                return false;
            }
            startWithEnd startwithend = (startWithEnd) other;
            return this.startPadding == startwithend.startPadding && this.endPadding == startwithend.endPadding;
        }

        public int hashCode() {
            return Integer.hashCode(this.endPadding) + (Integer.hashCode(this.startPadding) * 31);
        }

        @NotNull
        public String toString() {
            return e.c("startWithEnd(startPadding=", this.startPadding, ", endPadding=", ")", this.endPadding);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/uni/android/wrappers/mainaddon/data/ContentAxisRelatedPadding$zero;", "Lru/ozon/uni/android/wrappers/mainaddon/data/ContentAxisRelatedPadding;", "<init>", "()V", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class zero extends ContentAxisRelatedPadding {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public zero() {
            super(r0, r0, null);
            int i11 = 0;
        }
    }

    public /* synthetic */ ContentAxisRelatedPadding(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12);
    }

    @NotNull
    public final LayoutPadding.padding toLayoutPadding(@NotNull Axis axis) {
        Intrinsics.checkNotNullParameter(axis, "axis");
        int i11 = WhenMappings.$EnumSwitchMapping$0[axis.ordinal()];
        if (i11 == 1) {
            return new LayoutPadding.padding(0, this.start, 0, this.end);
        }
        if (i11 == 2) {
            return new LayoutPadding.padding(this.start, 0, this.end, 0);
        }
        throw new o();
    }

    private ContentAxisRelatedPadding(int i11, int i12) {
        this.start = i11;
        this.end = i12;
    }
}

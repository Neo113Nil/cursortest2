package ru.ozon.uni.android.wrappers.mainaddon.data;

import Am.C2438a;
import B0.C2454a;
import J0.P;
import Sc.InterfaceC3999a;
import T7.E;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@InterfaceC3999a
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u000f\u0010\u0011\u0012B)\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000e\u0010\u000b\u0082\u0001\u0004\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/uni/android/wrappers/mainaddon/data/LayoutPadding;", "", "", "start", "top", "end", "bottom", "<init>", "(IIII)V", "I", "getStart", "()I", "getTop", "getEnd", "getBottom", "padding", "zero", "vertical", "all", "Lru/ozon/uni/android/wrappers/mainaddon/data/LayoutPadding$all;", "Lru/ozon/uni/android/wrappers/mainaddon/data/LayoutPadding$padding;", "Lru/ozon/uni/android/wrappers/mainaddon/data/LayoutPadding$vertical;", "Lru/ozon/uni/android/wrappers/mainaddon/data/LayoutPadding$zero;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class LayoutPadding {
    private final int bottom;
    private final int end;
    private final int start;
    private final int top;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/uni/android/wrappers/mainaddon/data/LayoutPadding$all;", "Lru/ozon/uni/android/wrappers/mainaddon/data/LayoutPadding;", "", "paddingAll", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class all extends LayoutPadding {
        private final int paddingAll;

        public all(int i11) {
            super(i11, i11, i11, i11, null);
            this.paddingAll = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof all) && this.paddingAll == ((all) other).paddingAll;
        }

        public int hashCode() {
            return Integer.hashCode(this.paddingAll);
        }

        @NotNull
        public String toString() {
            return E.a(this.paddingAll, "all(paddingAll=", ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0016\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0017\u0010\r¨\u0006\u0018"}, d2 = {"Lru/ozon/uni/android/wrappers/mainaddon/data/LayoutPadding$padding;", "Lru/ozon/uni/android/wrappers/mainaddon/data/LayoutPadding;", "", "start", "top", "end", "bottom", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getStart", "getTop", "getEnd", "getBottom", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class padding extends LayoutPadding {
        private final int bottom;
        private final int end;
        private final int start;
        private final int top;

        public padding(int i11, int i12, int i13, int i14) {
            super(i11, i13, i12, i14, null);
            this.start = i11;
            this.top = i12;
            this.end = i13;
            this.bottom = i14;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof padding)) {
                return false;
            }
            padding paddingVar = (padding) other;
            return this.start == paddingVar.start && this.top == paddingVar.top && this.end == paddingVar.end && this.bottom == paddingVar.bottom;
        }

        @Override // ru.ozon.uni.android.wrappers.mainaddon.data.LayoutPadding
        public int getBottom() {
            return this.bottom;
        }

        @Override // ru.ozon.uni.android.wrappers.mainaddon.data.LayoutPadding
        public int getEnd() {
            return this.end;
        }

        @Override // ru.ozon.uni.android.wrappers.mainaddon.data.LayoutPadding
        public int getStart() {
            return this.start;
        }

        @Override // ru.ozon.uni.android.wrappers.mainaddon.data.LayoutPadding
        public int getTop() {
            return this.top;
        }

        public int hashCode() {
            return Integer.hashCode(this.bottom) + C2454a.a(this.end, C2454a.a(this.top, Integer.hashCode(this.start) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            return P.a(this.end, this.bottom, ", bottom=", ")", C2438a.a("padding(start=", this.start, ", top=", ", end=", this.top));
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/uni/android/wrappers/mainaddon/data/LayoutPadding$vertical;", "Lru/ozon/uni/android/wrappers/mainaddon/data/LayoutPadding;", "", "topBottom", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class vertical extends LayoutPadding {
        private final int topBottom;

        public vertical(int i11) {
            super(0, i11, 0, i11, null);
            this.topBottom = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof vertical) && this.topBottom == ((vertical) other).topBottom;
        }

        public int hashCode() {
            return Integer.hashCode(this.topBottom);
        }

        @NotNull
        public String toString() {
            return E.a(this.topBottom, "vertical(topBottom=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/uni/android/wrappers/mainaddon/data/LayoutPadding$zero;", "Lru/ozon/uni/android/wrappers/mainaddon/data/LayoutPadding;", "<init>", "()V", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class zero extends LayoutPadding {
        public zero() {
            super(0, 0, 0, 0, null);
        }
    }

    public /* synthetic */ LayoutPadding(int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12, i13, i14);
    }

    public int getBottom() {
        return this.bottom;
    }

    public int getEnd() {
        return this.end;
    }

    public int getStart() {
        return this.start;
    }

    public int getTop() {
        return this.top;
    }

    private LayoutPadding(int i11, int i12, int i13, int i14) {
        this.start = i11;
        this.top = i12;
        this.end = i13;
        this.bottom = i14;
    }
}

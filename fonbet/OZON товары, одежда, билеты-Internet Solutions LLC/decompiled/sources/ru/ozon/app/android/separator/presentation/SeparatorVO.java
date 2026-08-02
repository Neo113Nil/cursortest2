package ru.ozon.app.android.separator.presentation;

import Ak.C2436a;
import E0.C2942q;
import T7.E;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u001dB!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/separator/presentation/SeparatorVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "backgroundColor", "Lru/ozon/app/android/separator/presentation/SeparatorVO$Mode;", "sizeMode", "<init>", "(JLjava/lang/String;Lru/ozon/app/android/separator/presentation/SeparatorVO$Mode;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/app/android/separator/presentation/SeparatorVO$Mode;", "getSizeMode", "()Lru/ozon/app/android/separator/presentation/SeparatorVO$Mode;", "Mode", "separator_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SeparatorVO implements c {
    private final String backgroundColor;
    private final long id;

    @NotNull
    private final Mode sizeMode;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/separator/presentation/SeparatorVO$Mode;", "", "<init>", "()V", "Ratio", "Height", "Lru/ozon/app/android/separator/presentation/SeparatorVO$Mode$Height;", "Lru/ozon/app/android/separator/presentation/SeparatorVO$Mode$Ratio;", "separator_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Mode {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/separator/presentation/SeparatorVO$Mode$Height;", "Lru/ozon/app/android/separator/presentation/SeparatorVO$Mode;", "", "height", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getHeight", "separator_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Height extends Mode {
            private final int height;

            public Height(int i11) {
                super(null);
                this.height = i11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Height) && this.height == ((Height) other).height;
            }

            public final int getHeight() {
                return this.height;
            }

            public int hashCode() {
                return Integer.hashCode(this.height);
            }

            @NotNull
            public String toString() {
                return E.a(this.height, "Height(height=", ")");
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/separator/presentation/SeparatorVO$Mode$Ratio;", "Lru/ozon/app/android/separator/presentation/SeparatorVO$Mode;", "", "ratio", "<init>", "(F)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getRatio", "()F", "separator_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Ratio extends Mode {
            private final float ratio;

            public Ratio(float f7) {
                super(null);
                this.ratio = f7;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Ratio) && Float.compare(this.ratio, ((Ratio) other).ratio) == 0;
            }

            public final float getRatio() {
                return this.ratio;
            }

            public int hashCode() {
                return Float.hashCode(this.ratio);
            }

            @NotNull
            public String toString() {
                return C2942q.b(this.ratio, "Ratio(ratio=", ")");
            }
        }

        public /* synthetic */ Mode(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Mode() {
        }
    }

    public SeparatorVO(long j11, String str, @NotNull Mode sizeMode) {
        Intrinsics.checkNotNullParameter(sizeMode, "sizeMode");
        this.id = j11;
        this.backgroundColor = str;
        this.sizeMode = sizeMode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeparatorVO)) {
            return false;
        }
        SeparatorVO separatorVO = (SeparatorVO) other;
        return this.id == separatorVO.id && Intrinsics.d(this.backgroundColor, separatorVO.backgroundColor) && Intrinsics.d(this.sizeMode, separatorVO.sizeMode);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final Mode getSizeMode() {
        return this.sizeMode;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.backgroundColor;
        return this.sizeMode.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.backgroundColor;
        Mode mode = this.sizeMode;
        StringBuilder c11 = C2436a.c(j11, "SeparatorVO(id=", ", backgroundColor=", str);
        c11.append(", sizeMode=");
        c11.append(mode);
        c11.append(")");
        return c11.toString();
    }
}

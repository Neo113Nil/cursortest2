package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.data;

import E0.C2942q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileWidthConfig;", "", "<init>", "()V", "Banner", "Default", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileWidthConfig$Banner;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileWidthConfig$Default;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class TileWidthConfig {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileWidthConfig$Banner;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileWidthConfig;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Banner extends TileWidthConfig {

        @NotNull
        public static final Banner INSTANCE = new Banner();

        private Banner() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Banner);
        }

        public int hashCode() {
            return 1564172522;
        }

        @NotNull
        public String toString() {
            return "Banner";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileWidthConfig$Default;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileWidthConfig;", "", "widthCount", "<init>", "(F)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getWidthCount", "()F", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Default extends TileWidthConfig {
        private final float widthCount;

        public Default(float f7) {
            super(null);
            this.widthCount = f7;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Default) && Float.compare(this.widthCount, ((Default) other).widthCount) == 0;
        }

        public final float getWidthCount() {
            return this.widthCount;
        }

        public int hashCode() {
            return Float.hashCode(this.widthCount);
        }

        @NotNull
        public String toString() {
            return C2942q.b(this.widthCount, "Default(widthCount=", ")");
        }
    }

    public /* synthetic */ TileWidthConfig(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private TileWidthConfig() {
    }
}

package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageButton.v5.presentation;

import Am.C2438a;
import B0.C2454a;
import J0.P;
import Kk.C3532b;
import Pk0.b;
import g.C6594f;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageButton.v5.data.HotelsPageButtonV5DTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u001f !B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ0\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5VO$State;", "state", "", "asyncData", "<init>", "(JLru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5VO$State;Ljava/lang/String;)V", "copy", "(JLru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5VO$State;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5VO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5VO$State;", "getState", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5VO$State;", "Ljava/lang/String;", "getAsyncData", "State", "ButtonGroupMargins", "BackgroundType", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsPageButtonV5VO implements c {
    private final String asyncData;
    private final long id;

    @NotNull
    private final State state;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5VO$BackgroundType;", "", "SolidBackground", "ElevatedBackground", "BorderedBackground", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5VO$BackgroundType$BorderedBackground;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5VO$BackgroundType$ElevatedBackground;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5VO$BackgroundType$SolidBackground;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface BackgroundType {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5VO$BackgroundType$BorderedBackground;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5VO$BackgroundType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class BorderedBackground implements BackgroundType {

            @NotNull
            public static final BorderedBackground INSTANCE = new BorderedBackground();

            private BorderedBackground() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof BorderedBackground);
            }

            public int hashCode() {
                return 2003300629;
            }

            @NotNull
            public String toString() {
                return "BorderedBackground";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5VO$BackgroundType$ElevatedBackground;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5VO$BackgroundType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ElevatedBackground implements BackgroundType {

            @NotNull
            public static final ElevatedBackground INSTANCE = new ElevatedBackground();

            private ElevatedBackground() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof ElevatedBackground);
            }

            public int hashCode() {
                return 95688756;
            }

            @NotNull
            public String toString() {
                return "ElevatedBackground";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5VO$BackgroundType$SolidBackground;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5VO$BackgroundType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SolidBackground implements BackgroundType {

            @NotNull
            public static final SolidBackground INSTANCE = new SolidBackground();

            private SolidBackground() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof SolidBackground);
            }

            public int hashCode() {
                return -180315139;
            }

            @NotNull
            public String toString() {
                return "SolidBackground";
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0016\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5VO$ButtonGroupMargins;", "", "", "left", "top", "right", "bottom", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getLeft", "getTop", "getRight", "getBottom", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ButtonGroupMargins {
        private final int bottom;
        private final int left;
        private final int right;
        private final int top;

        public ButtonGroupMargins(int i11, int i12, int i13, int i14) {
            this.left = i11;
            this.top = i12;
            this.right = i13;
            this.bottom = i14;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonGroupMargins)) {
                return false;
            }
            ButtonGroupMargins buttonGroupMargins = (ButtonGroupMargins) other;
            return this.left == buttonGroupMargins.left && this.top == buttonGroupMargins.top && this.right == buttonGroupMargins.right && this.bottom == buttonGroupMargins.bottom;
        }

        public final int getBottom() {
            return this.bottom;
        }

        public final int getLeft() {
            return this.left;
        }

        public final int getRight() {
            return this.right;
        }

        public final int getTop() {
            return this.top;
        }

        public int hashCode() {
            return Integer.hashCode(this.bottom) + C2454a.a(this.right, C2454a.a(this.top, Integer.hashCode(this.left) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            return P.a(this.right, this.bottom, ", bottom=", ")", C2438a.a("ButtonGroupMargins(left=", this.left, ", top=", ", right=", this.top));
        }
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b\b\u0010'R%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b.\u0010-R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b0\u0010\u0019R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u00107\u001a\u0004\b8\u00109¨\u0006:"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5VO$State;", "", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttons", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "dsCell", "", "isUpdateRequired", "", "", "asyncParameters", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/data/HotelsPageButtonV5DTO$WidgetsBlockAnchors;", "widgetScrollAnchors", "cellScrollAnchors", "backgroundColor", "", "topCornerRadius", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5VO$BackgroundType;", "backgroundType", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5VO$ButtonGroupMargins;", "buttonGroupMargins", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/dsCell/CellDTO;ZLjava/util/Map;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/data/HotelsPageButtonV5DTO$WidgetsBlockAnchors;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/data/HotelsPageButtonV5DTO$WidgetsBlockAnchors;Ljava/lang/String;FLru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5VO$BackgroundType;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5VO$ButtonGroupMargins;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getButtons", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getDsCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Z", "()Z", "Ljava/util/Map;", "getAsyncParameters", "()Ljava/util/Map;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/data/HotelsPageButtonV5DTO$WidgetsBlockAnchors;", "getWidgetScrollAnchors", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/data/HotelsPageButtonV5DTO$WidgetsBlockAnchors;", "getCellScrollAnchors", "Ljava/lang/String;", "getBackgroundColor", "F", "getTopCornerRadius", "()F", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5VO$BackgroundType;", "getBackgroundType", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5VO$BackgroundType;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5VO$ButtonGroupMargins;", "getButtonGroupMargins", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5VO$ButtonGroupMargins;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class State {
        private final Map<String, Object> asyncParameters;
        private final String backgroundColor;

        @NotNull
        private final BackgroundType backgroundType;

        @NotNull
        private final ButtonGroupMargins buttonGroupMargins;

        @NotNull
        private final List<ButtonV3DTO> buttons;
        private final HotelsPageButtonV5DTO.WidgetsBlockAnchors cellScrollAnchors;
        private final CellDTO dsCell;
        private final boolean isUpdateRequired;
        private final float topCornerRadius;
        private final HotelsPageButtonV5DTO.WidgetsBlockAnchors widgetScrollAnchors;

        public State(@NotNull List<ButtonV3DTO> buttons, CellDTO cellDTO, boolean z11, Map<String, ? extends Object> map, HotelsPageButtonV5DTO.WidgetsBlockAnchors widgetsBlockAnchors, HotelsPageButtonV5DTO.WidgetsBlockAnchors widgetsBlockAnchors2, String str, float f7, @NotNull BackgroundType backgroundType, @NotNull ButtonGroupMargins buttonGroupMargins) {
            Intrinsics.checkNotNullParameter(buttons, "buttons");
            Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
            Intrinsics.checkNotNullParameter(buttonGroupMargins, "buttonGroupMargins");
            this.buttons = buttons;
            this.dsCell = cellDTO;
            this.isUpdateRequired = z11;
            this.asyncParameters = map;
            this.widgetScrollAnchors = widgetsBlockAnchors;
            this.cellScrollAnchors = widgetsBlockAnchors2;
            this.backgroundColor = str;
            this.topCornerRadius = f7;
            this.backgroundType = backgroundType;
            this.buttonGroupMargins = buttonGroupMargins;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return Intrinsics.d(this.buttons, state.buttons) && Intrinsics.d(this.dsCell, state.dsCell) && this.isUpdateRequired == state.isUpdateRequired && Intrinsics.d(this.asyncParameters, state.asyncParameters) && Intrinsics.d(this.widgetScrollAnchors, state.widgetScrollAnchors) && Intrinsics.d(this.cellScrollAnchors, state.cellScrollAnchors) && Intrinsics.d(this.backgroundColor, state.backgroundColor) && Float.compare(this.topCornerRadius, state.topCornerRadius) == 0 && Intrinsics.d(this.backgroundType, state.backgroundType) && Intrinsics.d(this.buttonGroupMargins, state.buttonGroupMargins);
        }

        public final Map<String, Object> getAsyncParameters() {
            return this.asyncParameters;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final BackgroundType getBackgroundType() {
            return this.backgroundType;
        }

        @NotNull
        public final ButtonGroupMargins getButtonGroupMargins() {
            return this.buttonGroupMargins;
        }

        @NotNull
        public final List<ButtonV3DTO> getButtons() {
            return this.buttons;
        }

        public final HotelsPageButtonV5DTO.WidgetsBlockAnchors getCellScrollAnchors() {
            return this.cellScrollAnchors;
        }

        public final CellDTO getDsCell() {
            return this.dsCell;
        }

        public final float getTopCornerRadius() {
            return this.topCornerRadius;
        }

        public final HotelsPageButtonV5DTO.WidgetsBlockAnchors getWidgetScrollAnchors() {
            return this.widgetScrollAnchors;
        }

        public int hashCode() {
            int hashCode = this.buttons.hashCode() * 31;
            CellDTO cellDTO = this.dsCell;
            int a11 = C3532b.a((hashCode + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31, 31, this.isUpdateRequired);
            Map<String, Object> map = this.asyncParameters;
            int hashCode2 = (a11 + (map == null ? 0 : map.hashCode())) * 31;
            HotelsPageButtonV5DTO.WidgetsBlockAnchors widgetsBlockAnchors = this.widgetScrollAnchors;
            int hashCode3 = (hashCode2 + (widgetsBlockAnchors == null ? 0 : widgetsBlockAnchors.hashCode())) * 31;
            HotelsPageButtonV5DTO.WidgetsBlockAnchors widgetsBlockAnchors2 = this.cellScrollAnchors;
            int hashCode4 = (hashCode3 + (widgetsBlockAnchors2 == null ? 0 : widgetsBlockAnchors2.hashCode())) * 31;
            String str = this.backgroundColor;
            return this.buttonGroupMargins.hashCode() + ((this.backgroundType.hashCode() + b.a(this.topCornerRadius, (hashCode4 + (str != null ? str.hashCode() : 0)) * 31, 31)) * 31);
        }

        /* renamed from: isUpdateRequired, reason: from getter */
        public final boolean getIsUpdateRequired() {
            return this.isUpdateRequired;
        }

        @NotNull
        public String toString() {
            return "State(buttons=" + this.buttons + ", dsCell=" + this.dsCell + ", isUpdateRequired=" + this.isUpdateRequired + ", asyncParameters=" + this.asyncParameters + ", widgetScrollAnchors=" + this.widgetScrollAnchors + ", cellScrollAnchors=" + this.cellScrollAnchors + ", backgroundColor=" + this.backgroundColor + ", topCornerRadius=" + this.topCornerRadius + ", backgroundType=" + this.backgroundType + ", buttonGroupMargins=" + this.buttonGroupMargins + ")";
        }
    }

    public HotelsPageButtonV5VO(long j11, @NotNull State state, String str) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.id = j11;
        this.state = state;
        this.asyncData = str;
    }

    public static /* synthetic */ HotelsPageButtonV5VO copy$default(HotelsPageButtonV5VO hotelsPageButtonV5VO, long j11, State state, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = hotelsPageButtonV5VO.id;
        }
        if ((i11 & 2) != 0) {
            state = hotelsPageButtonV5VO.state;
        }
        if ((i11 & 4) != 0) {
            str = hotelsPageButtonV5VO.asyncData;
        }
        return hotelsPageButtonV5VO.copy(j11, state, str);
    }

    @NotNull
    public final HotelsPageButtonV5VO copy(long id2, @NotNull State state, String asyncData) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new HotelsPageButtonV5VO(id2, state, asyncData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsPageButtonV5VO)) {
            return false;
        }
        HotelsPageButtonV5VO hotelsPageButtonV5VO = (HotelsPageButtonV5VO) other;
        return this.id == hotelsPageButtonV5VO.id && Intrinsics.d(this.state, hotelsPageButtonV5VO.state) && Intrinsics.d(this.asyncData, hotelsPageButtonV5VO.asyncData);
    }

    public final String getAsyncData() {
        return this.asyncData;
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
    public final State getState() {
        return this.state;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.state.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        String str = this.asyncData;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        State state = this.state;
        String str = this.asyncData;
        StringBuilder sb2 = new StringBuilder("HotelsPageButtonV5VO(id=");
        sb2.append(j11);
        sb2.append(", state=");
        sb2.append(state);
        return C6594f.a(", asyncData=", str, ")", sb2);
    }
}

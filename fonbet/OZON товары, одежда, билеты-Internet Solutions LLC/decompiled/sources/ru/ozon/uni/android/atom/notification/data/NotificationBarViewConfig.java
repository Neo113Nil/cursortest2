package ru.ozon.uni.android.atom.notification.data;

import B0.C2454a;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import Pk0.f;
import Xc.a;
import Xc.b;
import c8.C5766e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\"#$BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001b\u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b \u0010!¨\u0006%"}, d2 = {"Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "titleMaxLines", "subtitle", "subtitleMaxLines", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$LeftContent;", "leftContent", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent;", "rightContent", "<init>", "(Ljava/lang/String;ILjava/lang/String;ILru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$LeftContent;Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "I", "getTitleMaxLines", "getSubtitle", "getSubtitleMaxLines", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$LeftContent;", "getLeftContent", "()Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$LeftContent;", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent;", "getRightContent", "()Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent;", "LeftContent", "RightContent", "Alignment", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class NotificationBarViewConfig {
    private final LeftContent leftContent;
    private final RightContent rightContent;
    private final String subtitle;
    private final int subtitleMaxLines;

    @NotNull
    private final String title;
    private final int titleMaxLines;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$Alignment;", "", "<init>", "(Ljava/lang/String;I)V", "TOP", "CENTER", "NONE", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Alignment {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Alignment[] $VALUES;
        public static final Alignment TOP = new Alignment("TOP", 0);
        public static final Alignment CENTER = new Alignment("CENTER", 1);
        public static final Alignment NONE = new Alignment("NONE", 2);

        private static final /* synthetic */ Alignment[] $values() {
            return new Alignment[]{TOP, CENTER, NONE};
        }

        static {
            Alignment[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Alignment(String str, int i11) {
        }

        public static Alignment valueOf(String str) {
            return (Alignment) Enum.valueOf(Alignment.class, str);
        }

        public static Alignment[] values() {
            return (Alignment[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$LeftContent;", "", "Icon", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface LeftContent {

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001:\u0003./0B[\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010Jd\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b%\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b&\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b'\u0010\u0014R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b,\u0010-¨\u00061"}, d2 = {"Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$LeftContent$Icon;", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$LeftContent;", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$LeftContent$Icon$Size;", "size", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$LeftContent$Icon$Shape;", "shape", "", "icon", "iconTintColor", "backgroundColor", "backgroundImage", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$LeftContent$Icon$FitType;", "backgroundImageFitType", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$Alignment;", "alignment", "<init>", "(Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$LeftContent$Icon$Size;Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$LeftContent$Icon$Shape;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$LeftContent$Icon$FitType;Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$Alignment;)V", "copy", "(Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$LeftContent$Icon$Size;Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$LeftContent$Icon$Shape;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$LeftContent$Icon$FitType;Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$Alignment;)Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$LeftContent$Icon;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$LeftContent$Icon$Size;", "getSize", "()Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$LeftContent$Icon$Size;", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$LeftContent$Icon$Shape;", "getShape", "()Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$LeftContent$Icon$Shape;", "Ljava/lang/String;", "getIcon", "getIconTintColor", "getBackgroundColor", "getBackgroundImage", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$LeftContent$Icon$FitType;", "getBackgroundImageFitType", "()Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$LeftContent$Icon$FitType;", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$Alignment;", "getAlignment", "()Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$Alignment;", "Shape", "Size", "FitType", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Icon implements LeftContent {

            @NotNull
            private final Alignment alignment;

            @NotNull
            private final String backgroundColor;
            private final String backgroundImage;

            @NotNull
            private final FitType backgroundImageFitType;
            private final String icon;

            @NotNull
            private final String iconTintColor;

            @NotNull
            private final Shape shape;

            @NotNull
            private final Size size;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$LeftContent$Icon$FitType;", "", "<init>", "(Ljava/lang/String;I)V", "FILL_CENTER", "FIT_CENTER", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class FitType {
                private static final /* synthetic */ a $ENTRIES;
                private static final /* synthetic */ FitType[] $VALUES;
                public static final FitType FILL_CENTER = new FitType("FILL_CENTER", 0);
                public static final FitType FIT_CENTER = new FitType("FIT_CENTER", 1);

                private static final /* synthetic */ FitType[] $values() {
                    return new FitType[]{FILL_CENTER, FIT_CENTER};
                }

                static {
                    FitType[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = b.a($values);
                }

                private FitType(String str, int i11) {
                }

                public static FitType valueOf(String str) {
                    return (FitType) Enum.valueOf(FitType.class, str);
                }

                public static FitType[] values() {
                    return (FitType[]) $VALUES.clone();
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$LeftContent$Icon$Shape;", "", "<init>", "(Ljava/lang/String;I)V", "CIRCLE", "SQUIRCLE", "SHAPE_NONE", "SHAPE_SQUIRCLE_FORCE", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Shape {
                private static final /* synthetic */ a $ENTRIES;
                private static final /* synthetic */ Shape[] $VALUES;
                public static final Shape CIRCLE = new Shape("CIRCLE", 0);
                public static final Shape SQUIRCLE = new Shape("SQUIRCLE", 1);
                public static final Shape SHAPE_NONE = new Shape("SHAPE_NONE", 2);
                public static final Shape SHAPE_SQUIRCLE_FORCE = new Shape("SHAPE_SQUIRCLE_FORCE", 3);

                private static final /* synthetic */ Shape[] $values() {
                    return new Shape[]{CIRCLE, SQUIRCLE, SHAPE_NONE, SHAPE_SQUIRCLE_FORCE};
                }

                static {
                    Shape[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = b.a($values);
                }

                private Shape(String str, int i11) {
                }

                public static Shape valueOf(String str) {
                    return (Shape) Enum.valueOf(Shape.class, str);
                }

                public static Shape[] values() {
                    return (Shape[]) $VALUES.clone();
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$LeftContent$Icon$Size;", "", "<init>", "(Ljava/lang/String;I)V", "SIZE_200", "SIZE_300", "SIZE_400", "SIZE_500", "SIZE_600", "SIZE_700", "SIZE_800", "SIZE_900", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Size {
                private static final /* synthetic */ a $ENTRIES;
                private static final /* synthetic */ Size[] $VALUES;
                public static final Size SIZE_200 = new Size("SIZE_200", 0);
                public static final Size SIZE_300 = new Size("SIZE_300", 1);
                public static final Size SIZE_400 = new Size("SIZE_400", 2);
                public static final Size SIZE_500 = new Size("SIZE_500", 3);
                public static final Size SIZE_600 = new Size("SIZE_600", 4);
                public static final Size SIZE_700 = new Size("SIZE_700", 5);
                public static final Size SIZE_800 = new Size("SIZE_800", 6);
                public static final Size SIZE_900 = new Size("SIZE_900", 7);

                private static final /* synthetic */ Size[] $values() {
                    return new Size[]{SIZE_200, SIZE_300, SIZE_400, SIZE_500, SIZE_600, SIZE_700, SIZE_800, SIZE_900};
                }

                static {
                    Size[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = b.a($values);
                }

                private Size(String str, int i11) {
                }

                public static Size valueOf(String str) {
                    return (Size) Enum.valueOf(Size.class, str);
                }

                public static Size[] values() {
                    return (Size[]) $VALUES.clone();
                }
            }

            public Icon() {
                this(null, null, null, null, null, null, null, null, 255, null);
            }

            @NotNull
            public final Icon copy(@NotNull Size size, @NotNull Shape shape, String icon, @NotNull String iconTintColor, @NotNull String backgroundColor, String backgroundImage, @NotNull FitType backgroundImageFitType, @NotNull Alignment alignment) {
                Intrinsics.checkNotNullParameter(size, "size");
                Intrinsics.checkNotNullParameter(shape, "shape");
                Intrinsics.checkNotNullParameter(iconTintColor, "iconTintColor");
                Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                Intrinsics.checkNotNullParameter(backgroundImageFitType, "backgroundImageFitType");
                Intrinsics.checkNotNullParameter(alignment, "alignment");
                return new Icon(size, shape, icon, iconTintColor, backgroundColor, backgroundImage, backgroundImageFitType, alignment);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Icon)) {
                    return false;
                }
                Icon icon = (Icon) other;
                return this.size == icon.size && this.shape == icon.shape && Intrinsics.d(this.icon, icon.icon) && Intrinsics.d(this.iconTintColor, icon.iconTintColor) && Intrinsics.d(this.backgroundColor, icon.backgroundColor) && Intrinsics.d(this.backgroundImage, icon.backgroundImage) && this.backgroundImageFitType == icon.backgroundImageFitType && this.alignment == icon.alignment;
            }

            @NotNull
            public Alignment getAlignment() {
                return this.alignment;
            }

            @NotNull
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            public final String getBackgroundImage() {
                return this.backgroundImage;
            }

            @NotNull
            public final FitType getBackgroundImageFitType() {
                return this.backgroundImageFitType;
            }

            public final String getIcon() {
                return this.icon;
            }

            @NotNull
            public final String getIconTintColor() {
                return this.iconTintColor;
            }

            @NotNull
            public final Shape getShape() {
                return this.shape;
            }

            @NotNull
            public final Size getSize() {
                return this.size;
            }

            public int hashCode() {
                int hashCode = (this.shape.hashCode() + (this.size.hashCode() * 31)) * 31;
                String str = this.icon;
                int a11 = g.a(g.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.iconTintColor), 31, this.backgroundColor);
                String str2 = this.backgroundImage;
                return this.alignment.hashCode() + ((this.backgroundImageFitType.hashCode() + ((a11 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
            }

            @NotNull
            public String toString() {
                Size size = this.size;
                Shape shape = this.shape;
                String str = this.icon;
                String str2 = this.iconTintColor;
                String str3 = this.backgroundColor;
                String str4 = this.backgroundImage;
                FitType fitType = this.backgroundImageFitType;
                Alignment alignment = this.alignment;
                StringBuilder sb2 = new StringBuilder("Icon(size=");
                sb2.append(size);
                sb2.append(", shape=");
                sb2.append(shape);
                sb2.append(", icon=");
                Nh.a.h(sb2, str, ", iconTintColor=", str2, ", backgroundColor=");
                Nh.a.h(sb2, str3, ", backgroundImage=", str4, ", backgroundImageFitType=");
                sb2.append(fitType);
                sb2.append(", alignment=");
                sb2.append(alignment);
                sb2.append(")");
                return sb2.toString();
            }

            public Icon(@NotNull Size size, @NotNull Shape shape, String str, @NotNull String iconTintColor, @NotNull String backgroundColor, String str2, @NotNull FitType backgroundImageFitType, @NotNull Alignment alignment) {
                Intrinsics.checkNotNullParameter(size, "size");
                Intrinsics.checkNotNullParameter(shape, "shape");
                Intrinsics.checkNotNullParameter(iconTintColor, "iconTintColor");
                Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                Intrinsics.checkNotNullParameter(backgroundImageFitType, "backgroundImageFitType");
                Intrinsics.checkNotNullParameter(alignment, "alignment");
                this.size = size;
                this.shape = shape;
                this.icon = str;
                this.iconTintColor = iconTintColor;
                this.backgroundColor = backgroundColor;
                this.backgroundImage = str2;
                this.backgroundImageFitType = backgroundImageFitType;
                this.alignment = alignment;
            }

            public /* synthetic */ Icon(Size size, Shape shape, String str, String str2, String str3, String str4, FitType fitType, Alignment alignment, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? Size.SIZE_500 : size, (i11 & 2) != 0 ? Shape.SQUIRCLE : shape, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? UniColors.GRAPHIC_TERTIARY_INVERTED.getToken() : str2, (i11 & 16) != 0 ? UniColors.BG_SECONDARY_INVERTED.getToken() : str3, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? FitType.FILL_CENTER : fitType, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? Alignment.TOP : alignment);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent;", "", "alignment", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$Alignment;", "getAlignment", "()Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$Alignment;", "Icon", "Button", "ButtonStyle", "None", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface RightContent {

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001:\u00017B¥\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b*\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b+\u0010\u0019R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b\f\u0010-R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b\r\u0010-R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b.\u0010\u0019R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b/\u0010\u0019R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010!\u001a\u0004\b0\u0010\u0019R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010!\u001a\u0004\b1\u0010\u0019R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010!\u001a\u0004\b2\u0010\u0019R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010!\u001a\u0004\b3\u0010\u0019R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u00104\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent$Button;", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent$Button$ButtonSize;", "size", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent$ButtonStyle;", "styleType", "icon", "dataText", "", "isHoverDisabled", "isEnabled", "titleColor", "subtitleColor", "iconColor", "dataTextColor", "dataBackgroundColor", "backgroundColor", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$Alignment;", "alignment", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent$Button$ButtonSize;Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent$ButtonStyle;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$Alignment;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent$Button$ButtonSize;", "getSize", "()Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent$Button$ButtonSize;", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent$ButtonStyle;", "getStyleType", "()Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent$ButtonStyle;", "getIcon", "getDataText", "Z", "()Z", "getTitleColor", "getSubtitleColor", "getIconColor", "getDataTextColor", "getDataBackgroundColor", "getBackgroundColor", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$Alignment;", "getAlignment", "()Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$Alignment;", "ButtonSize", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Button implements RightContent {

            @NotNull
            private final Alignment alignment;

            @NotNull
            private final String backgroundColor;
            private final String dataBackgroundColor;
            private final String dataText;
            private final String dataTextColor;
            private final String icon;

            @NotNull
            private final String iconColor;
            private final boolean isEnabled;
            private final boolean isHoverDisabled;

            @NotNull
            private final ButtonSize size;

            @NotNull
            private final ButtonStyle styleType;
            private final String subtitle;

            @NotNull
            private final String subtitleColor;

            @NotNull
            private final String title;

            @NotNull
            private final String titleColor;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent$Button$ButtonSize;", "", "<init>", "(Ljava/lang/String;I)V", "SIZE_400", "SIZE_500", "SIZE_600", "SIZE_700", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class ButtonSize {
                private static final /* synthetic */ a $ENTRIES;
                private static final /* synthetic */ ButtonSize[] $VALUES;
                public static final ButtonSize SIZE_400 = new ButtonSize("SIZE_400", 0);
                public static final ButtonSize SIZE_500 = new ButtonSize("SIZE_500", 1);
                public static final ButtonSize SIZE_600 = new ButtonSize("SIZE_600", 2);
                public static final ButtonSize SIZE_700 = new ButtonSize("SIZE_700", 3);

                private static final /* synthetic */ ButtonSize[] $values() {
                    return new ButtonSize[]{SIZE_400, SIZE_500, SIZE_600, SIZE_700};
                }

                static {
                    ButtonSize[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = b.a($values);
                }

                private ButtonSize(String str, int i11) {
                }

                public static ButtonSize valueOf(String str) {
                    return (ButtonSize) Enum.valueOf(ButtonSize.class, str);
                }

                public static ButtonSize[] values() {
                    return (ButtonSize[]) $VALUES.clone();
                }
            }

            public Button(@NotNull String title, String str, @NotNull ButtonSize size, @NotNull ButtonStyle styleType, String str2, String str3, boolean z11, boolean z12, @NotNull String titleColor, @NotNull String subtitleColor, @NotNull String iconColor, String str4, String str5, @NotNull String backgroundColor, @NotNull Alignment alignment) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(size, "size");
                Intrinsics.checkNotNullParameter(styleType, "styleType");
                Intrinsics.checkNotNullParameter(titleColor, "titleColor");
                Intrinsics.checkNotNullParameter(subtitleColor, "subtitleColor");
                Intrinsics.checkNotNullParameter(iconColor, "iconColor");
                Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                Intrinsics.checkNotNullParameter(alignment, "alignment");
                this.title = title;
                this.subtitle = str;
                this.size = size;
                this.styleType = styleType;
                this.icon = str2;
                this.dataText = str3;
                this.isHoverDisabled = z11;
                this.isEnabled = z12;
                this.titleColor = titleColor;
                this.subtitleColor = subtitleColor;
                this.iconColor = iconColor;
                this.dataTextColor = str4;
                this.dataBackgroundColor = str5;
                this.backgroundColor = backgroundColor;
                this.alignment = alignment;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Button)) {
                    return false;
                }
                Button button = (Button) other;
                return Intrinsics.d(this.title, button.title) && Intrinsics.d(this.subtitle, button.subtitle) && this.size == button.size && this.styleType == button.styleType && Intrinsics.d(this.icon, button.icon) && Intrinsics.d(this.dataText, button.dataText) && this.isHoverDisabled == button.isHoverDisabled && this.isEnabled == button.isEnabled && Intrinsics.d(this.titleColor, button.titleColor) && Intrinsics.d(this.subtitleColor, button.subtitleColor) && Intrinsics.d(this.iconColor, button.iconColor) && Intrinsics.d(this.dataTextColor, button.dataTextColor) && Intrinsics.d(this.dataBackgroundColor, button.dataBackgroundColor) && Intrinsics.d(this.backgroundColor, button.backgroundColor) && this.alignment == button.alignment;
            }

            @Override // ru.ozon.uni.android.atom.notification.data.NotificationBarViewConfig.RightContent
            @NotNull
            public Alignment getAlignment() {
                return this.alignment;
            }

            @NotNull
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            public final String getDataBackgroundColor() {
                return this.dataBackgroundColor;
            }

            public final String getDataText() {
                return this.dataText;
            }

            public final String getDataTextColor() {
                return this.dataTextColor;
            }

            public final String getIcon() {
                return this.icon;
            }

            @NotNull
            public final String getIconColor() {
                return this.iconColor;
            }

            @NotNull
            public final ButtonSize getSize() {
                return this.size;
            }

            @NotNull
            public final ButtonStyle getStyleType() {
                return this.styleType;
            }

            public final String getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final String getSubtitleColor() {
                return this.subtitleColor;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            @NotNull
            public final String getTitleColor() {
                return this.titleColor;
            }

            public int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                String str = this.subtitle;
                int hashCode2 = (this.styleType.hashCode() + ((this.size.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
                String str2 = this.icon;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.dataText;
                int a11 = g.a(g.a(g.a(C3532b.a(C3532b.a((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.isHoverDisabled), 31, this.isEnabled), 31, this.titleColor), 31, this.subtitleColor), 31, this.iconColor);
                String str4 = this.dataTextColor;
                int hashCode4 = (a11 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.dataBackgroundColor;
                return this.alignment.hashCode() + g.a((hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31, 31, this.backgroundColor);
            }

            /* renamed from: isHoverDisabled, reason: from getter */
            public final boolean getIsHoverDisabled() {
                return this.isHoverDisabled;
            }

            @NotNull
            public String toString() {
                String str = this.title;
                String str2 = this.subtitle;
                ButtonSize buttonSize = this.size;
                ButtonStyle buttonStyle = this.styleType;
                String str3 = this.icon;
                String str4 = this.dataText;
                boolean z11 = this.isHoverDisabled;
                boolean z12 = this.isEnabled;
                String str5 = this.titleColor;
                String str6 = this.subtitleColor;
                String str7 = this.iconColor;
                String str8 = this.dataTextColor;
                String str9 = this.dataBackgroundColor;
                String str10 = this.backgroundColor;
                Alignment alignment = this.alignment;
                StringBuilder d11 = C3660k.d("Button(title=", str, ", subtitle=", str2, ", size=");
                d11.append(buttonSize);
                d11.append(", styleType=");
                d11.append(buttonStyle);
                d11.append(", icon=");
                Nh.a.h(d11, str3, ", dataText=", str4, ", isHoverDisabled=");
                f.c(", isEnabled=", ", titleColor=", d11, z11, z12);
                Nh.a.h(d11, str5, ", subtitleColor=", str6, ", iconColor=");
                Nh.a.h(d11, str7, ", dataTextColor=", str8, ", dataBackgroundColor=");
                Nh.a.h(d11, str9, ", backgroundColor=", str10, ", alignment=");
                d11.append(alignment);
                d11.append(")");
                return d11.toString();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent$ButtonStyle;", "", "<init>", "(Ljava/lang/String;I)V", "ACTION_PRIMARY", "ACTION_SECONDARY", "ACCENT_PRIMARY", "ACCENT_SECONDARY", "NEGATIVE", "CUSTOM", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ButtonStyle {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ ButtonStyle[] $VALUES;
            public static final ButtonStyle ACTION_PRIMARY = new ButtonStyle("ACTION_PRIMARY", 0);
            public static final ButtonStyle ACTION_SECONDARY = new ButtonStyle("ACTION_SECONDARY", 1);
            public static final ButtonStyle ACCENT_PRIMARY = new ButtonStyle("ACCENT_PRIMARY", 2);
            public static final ButtonStyle ACCENT_SECONDARY = new ButtonStyle("ACCENT_SECONDARY", 3);
            public static final ButtonStyle NEGATIVE = new ButtonStyle("NEGATIVE", 4);
            public static final ButtonStyle CUSTOM = new ButtonStyle("CUSTOM", 5);

            private static final /* synthetic */ ButtonStyle[] $values() {
                return new ButtonStyle[]{ACTION_PRIMARY, ACTION_SECONDARY, ACCENT_PRIMARY, ACCENT_SECONDARY, NEGATIVE, CUSTOM};
            }

            static {
                ButtonStyle[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private ButtonStyle(String str, int i11) {
            }

            public static ButtonStyle valueOf(String str) {
                return (ButtonStyle) Enum.valueOf(ButtonStyle.class, str);
            }

            public static ButtonStyle[] values() {
                return (ButtonStyle[]) $VALUES.clone();
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\bf\u0018\u00002\u00020\u0001:\u0003\u0015\u0016\u0017R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0012\u0010\u0013\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u0018"}, d2 = {"Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent$Icon;", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent;", "size", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent$Icon$IconButtonSize;", "getSize", "()Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent$Icon$IconButtonSize;", "styleType", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent$ButtonStyle;", "getStyleType", "()Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent$ButtonStyle;", "isHoverDisabled", "", "()Z", "iconColor", "", "getIconColor", "()Ljava/lang/String;", "backgroundColor", "getBackgroundColor", "icon", "getIcon", "Close", "Disclosure", "IconButtonSize", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public interface Icon extends RightContent {

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u0007\u0010\u001fR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\u0010R\u001a\u0010\n\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b\"\u0010\u0010R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\u0010¨\u0006("}, d2 = {"Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent$Icon$Close;", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent$Icon;", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent$Icon$IconButtonSize;", "size", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent$ButtonStyle;", "styleType", "", "isHoverDisabled", "", "iconColor", "backgroundColor", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$Alignment;", "alignment", "<init>", "(Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent$Icon$IconButtonSize;Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent$ButtonStyle;ZLjava/lang/String;Ljava/lang/String;Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$Alignment;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent$Icon$IconButtonSize;", "getSize", "()Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent$Icon$IconButtonSize;", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent$ButtonStyle;", "getStyleType", "()Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent$ButtonStyle;", "Z", "()Z", "Ljava/lang/String;", "getIconColor", "getBackgroundColor", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$Alignment;", "getAlignment", "()Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$Alignment;", "icon", "getIcon", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Close implements Icon {

                @NotNull
                private final Alignment alignment;

                @NotNull
                private final String backgroundColor;

                @NotNull
                private final String icon;

                @NotNull
                private final String iconColor;
                private final boolean isHoverDisabled;

                @NotNull
                private final IconButtonSize size;

                @NotNull
                private final ButtonStyle styleType;

                public Close() {
                    this(null, null, false, null, null, null, 63, null);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Close)) {
                        return false;
                    }
                    Close close = (Close) other;
                    return this.size == close.size && this.styleType == close.styleType && this.isHoverDisabled == close.isHoverDisabled && Intrinsics.d(this.iconColor, close.iconColor) && Intrinsics.d(this.backgroundColor, close.backgroundColor) && this.alignment == close.alignment;
                }

                @Override // ru.ozon.uni.android.atom.notification.data.NotificationBarViewConfig.RightContent
                @NotNull
                public Alignment getAlignment() {
                    return this.alignment;
                }

                @Override // ru.ozon.uni.android.atom.notification.data.NotificationBarViewConfig.RightContent.Icon
                @NotNull
                public String getBackgroundColor() {
                    return this.backgroundColor;
                }

                @Override // ru.ozon.uni.android.atom.notification.data.NotificationBarViewConfig.RightContent.Icon
                @NotNull
                public String getIcon() {
                    return this.icon;
                }

                @Override // ru.ozon.uni.android.atom.notification.data.NotificationBarViewConfig.RightContent.Icon
                @NotNull
                public String getIconColor() {
                    return this.iconColor;
                }

                @Override // ru.ozon.uni.android.atom.notification.data.NotificationBarViewConfig.RightContent.Icon
                @NotNull
                public IconButtonSize getSize() {
                    return this.size;
                }

                @Override // ru.ozon.uni.android.atom.notification.data.NotificationBarViewConfig.RightContent.Icon
                @NotNull
                public ButtonStyle getStyleType() {
                    return this.styleType;
                }

                public int hashCode() {
                    return this.alignment.hashCode() + g.a(g.a(C3532b.a((this.styleType.hashCode() + (this.size.hashCode() * 31)) * 31, 31, this.isHoverDisabled), 31, this.iconColor), 31, this.backgroundColor);
                }

                @Override // ru.ozon.uni.android.atom.notification.data.NotificationBarViewConfig.RightContent.Icon
                /* renamed from: isHoverDisabled, reason: from getter */
                public boolean getIsHoverDisabled() {
                    return this.isHoverDisabled;
                }

                @NotNull
                public String toString() {
                    IconButtonSize iconButtonSize = this.size;
                    ButtonStyle buttonStyle = this.styleType;
                    boolean z11 = this.isHoverDisabled;
                    String str = this.iconColor;
                    String str2 = this.backgroundColor;
                    Alignment alignment = this.alignment;
                    StringBuilder sb2 = new StringBuilder("Close(size=");
                    sb2.append(iconButtonSize);
                    sb2.append(", styleType=");
                    sb2.append(buttonStyle);
                    sb2.append(", isHoverDisabled=");
                    C5766e.a(", iconColor=", str, ", backgroundColor=", sb2, z11);
                    sb2.append(str2);
                    sb2.append(", alignment=");
                    sb2.append(alignment);
                    sb2.append(")");
                    return sb2.toString();
                }

                public Close(@NotNull IconButtonSize size, @NotNull ButtonStyle styleType, boolean z11, @NotNull String iconColor, @NotNull String backgroundColor, @NotNull Alignment alignment) {
                    Intrinsics.checkNotNullParameter(size, "size");
                    Intrinsics.checkNotNullParameter(styleType, "styleType");
                    Intrinsics.checkNotNullParameter(iconColor, "iconColor");
                    Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                    Intrinsics.checkNotNullParameter(alignment, "alignment");
                    this.size = size;
                    this.styleType = styleType;
                    this.isHoverDisabled = z11;
                    this.iconColor = iconColor;
                    this.backgroundColor = backgroundColor;
                    this.alignment = alignment;
                    this.icon = "ic_s_cross_filled";
                }

                public /* synthetic */ Close(IconButtonSize iconButtonSize, ButtonStyle buttonStyle, boolean z11, String str, String str2, Alignment alignment, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i11 & 1) != 0 ? IconButtonSize.SIZE_400 : iconButtonSize, (i11 & 2) != 0 ? ButtonStyle.CUSTOM : buttonStyle, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? UniColors.GRAPHIC_TERTIARY_INVERTED.getToken() : str, (i11 & 16) != 0 ? UniColors.CLEAR_LIGHT_KEY_0.getToken() : str2, (i11 & 32) != 0 ? Alignment.CENTER : alignment);
                }
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u0007\u0010\u001fR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\u0010R\u001a\u0010\n\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b\"\u0010\u0010R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\u0010¨\u0006("}, d2 = {"Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent$Icon$Disclosure;", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent$Icon;", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent$Icon$IconButtonSize;", "size", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent$ButtonStyle;", "styleType", "", "isHoverDisabled", "", "iconColor", "backgroundColor", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$Alignment;", "alignment", "<init>", "(Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent$Icon$IconButtonSize;Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent$ButtonStyle;ZLjava/lang/String;Ljava/lang/String;Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$Alignment;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent$Icon$IconButtonSize;", "getSize", "()Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent$Icon$IconButtonSize;", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent$ButtonStyle;", "getStyleType", "()Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent$ButtonStyle;", "Z", "()Z", "Ljava/lang/String;", "getIconColor", "getBackgroundColor", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$Alignment;", "getAlignment", "()Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$Alignment;", "icon", "getIcon", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Disclosure implements Icon {

                @NotNull
                private final Alignment alignment;

                @NotNull
                private final String backgroundColor;

                @NotNull
                private final String icon;

                @NotNull
                private final String iconColor;
                private final boolean isHoverDisabled;

                @NotNull
                private final IconButtonSize size;

                @NotNull
                private final ButtonStyle styleType;

                public Disclosure() {
                    this(null, null, false, null, null, null, 63, null);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Disclosure)) {
                        return false;
                    }
                    Disclosure disclosure = (Disclosure) other;
                    return this.size == disclosure.size && this.styleType == disclosure.styleType && this.isHoverDisabled == disclosure.isHoverDisabled && Intrinsics.d(this.iconColor, disclosure.iconColor) && Intrinsics.d(this.backgroundColor, disclosure.backgroundColor) && this.alignment == disclosure.alignment;
                }

                @Override // ru.ozon.uni.android.atom.notification.data.NotificationBarViewConfig.RightContent
                @NotNull
                public Alignment getAlignment() {
                    return this.alignment;
                }

                @Override // ru.ozon.uni.android.atom.notification.data.NotificationBarViewConfig.RightContent.Icon
                @NotNull
                public String getBackgroundColor() {
                    return this.backgroundColor;
                }

                @Override // ru.ozon.uni.android.atom.notification.data.NotificationBarViewConfig.RightContent.Icon
                @NotNull
                public String getIcon() {
                    return this.icon;
                }

                @Override // ru.ozon.uni.android.atom.notification.data.NotificationBarViewConfig.RightContent.Icon
                @NotNull
                public String getIconColor() {
                    return this.iconColor;
                }

                @Override // ru.ozon.uni.android.atom.notification.data.NotificationBarViewConfig.RightContent.Icon
                @NotNull
                public IconButtonSize getSize() {
                    return this.size;
                }

                @Override // ru.ozon.uni.android.atom.notification.data.NotificationBarViewConfig.RightContent.Icon
                @NotNull
                public ButtonStyle getStyleType() {
                    return this.styleType;
                }

                public int hashCode() {
                    return this.alignment.hashCode() + g.a(g.a(C3532b.a((this.styleType.hashCode() + (this.size.hashCode() * 31)) * 31, 31, this.isHoverDisabled), 31, this.iconColor), 31, this.backgroundColor);
                }

                @Override // ru.ozon.uni.android.atom.notification.data.NotificationBarViewConfig.RightContent.Icon
                /* renamed from: isHoverDisabled, reason: from getter */
                public boolean getIsHoverDisabled() {
                    return this.isHoverDisabled;
                }

                @NotNull
                public String toString() {
                    IconButtonSize iconButtonSize = this.size;
                    ButtonStyle buttonStyle = this.styleType;
                    boolean z11 = this.isHoverDisabled;
                    String str = this.iconColor;
                    String str2 = this.backgroundColor;
                    Alignment alignment = this.alignment;
                    StringBuilder sb2 = new StringBuilder("Disclosure(size=");
                    sb2.append(iconButtonSize);
                    sb2.append(", styleType=");
                    sb2.append(buttonStyle);
                    sb2.append(", isHoverDisabled=");
                    C5766e.a(", iconColor=", str, ", backgroundColor=", sb2, z11);
                    sb2.append(str2);
                    sb2.append(", alignment=");
                    sb2.append(alignment);
                    sb2.append(")");
                    return sb2.toString();
                }

                public Disclosure(@NotNull IconButtonSize size, @NotNull ButtonStyle styleType, boolean z11, @NotNull String iconColor, @NotNull String backgroundColor, @NotNull Alignment alignment) {
                    Intrinsics.checkNotNullParameter(size, "size");
                    Intrinsics.checkNotNullParameter(styleType, "styleType");
                    Intrinsics.checkNotNullParameter(iconColor, "iconColor");
                    Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                    Intrinsics.checkNotNullParameter(alignment, "alignment");
                    this.size = size;
                    this.styleType = styleType;
                    this.isHoverDisabled = z11;
                    this.iconColor = iconColor;
                    this.backgroundColor = backgroundColor;
                    this.alignment = alignment;
                    this.icon = "ic_m_chevron_right_filled";
                }

                public /* synthetic */ Disclosure(IconButtonSize iconButtonSize, ButtonStyle buttonStyle, boolean z11, String str, String str2, Alignment alignment, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i11 & 1) != 0 ? IconButtonSize.SIZE_400 : iconButtonSize, (i11 & 2) != 0 ? ButtonStyle.CUSTOM : buttonStyle, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? UniColors.GRAPHIC_TERTIARY_INVERTED.getToken() : str, (i11 & 16) != 0 ? UniColors.CLEAR_LIGHT_KEY_0.getToken() : str2, (i11 & 32) != 0 ? Alignment.CENTER : alignment);
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent$Icon$IconButtonSize;", "", "<init>", "(Ljava/lang/String;I)V", "SIZE_300", "SIZE_400", "SIZE_450", "SIZE_500", "SIZE_600", "SIZE_700", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class IconButtonSize {
                private static final /* synthetic */ a $ENTRIES;
                private static final /* synthetic */ IconButtonSize[] $VALUES;
                public static final IconButtonSize SIZE_300 = new IconButtonSize("SIZE_300", 0);
                public static final IconButtonSize SIZE_400 = new IconButtonSize("SIZE_400", 1);
                public static final IconButtonSize SIZE_450 = new IconButtonSize("SIZE_450", 2);
                public static final IconButtonSize SIZE_500 = new IconButtonSize("SIZE_500", 3);
                public static final IconButtonSize SIZE_600 = new IconButtonSize("SIZE_600", 4);
                public static final IconButtonSize SIZE_700 = new IconButtonSize("SIZE_700", 5);

                private static final /* synthetic */ IconButtonSize[] $values() {
                    return new IconButtonSize[]{SIZE_300, SIZE_400, SIZE_450, SIZE_500, SIZE_600, SIZE_700};
                }

                static {
                    IconButtonSize[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = b.a($values);
                }

                private IconButtonSize(String str, int i11) {
                }

                public static IconButtonSize valueOf(String str) {
                    return (IconButtonSize) Enum.valueOf(IconButtonSize.class, str);
                }

                public static IconButtonSize[] values() {
                    return (IconButtonSize[]) $VALUES.clone();
                }
            }

            @NotNull
            String getBackgroundColor();

            @NotNull
            String getIcon();

            @NotNull
            String getIconColor();

            @NotNull
            IconButtonSize getSize();

            @NotNull
            ButtonStyle getStyleType();

            /* renamed from: isHoverDisabled */
            boolean getIsHoverDisabled();
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent$None;", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent;", "<init>", "()V", "alignment", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$Alignment;", "getAlignment", "()Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$Alignment;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class None implements RightContent {

            @NotNull
            public static final None INSTANCE = new None();

            @NotNull
            private static final Alignment alignment = Alignment.NONE;

            private None() {
            }

            @Override // ru.ozon.uni.android.atom.notification.data.NotificationBarViewConfig.RightContent
            @NotNull
            public Alignment getAlignment() {
                return alignment;
            }
        }

        @NotNull
        Alignment getAlignment();
    }

    public NotificationBarViewConfig(@NotNull String title, int i11, String str, int i12, LeftContent leftContent, RightContent rightContent) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.titleMaxLines = i11;
        this.subtitle = str;
        this.subtitleMaxLines = i12;
        this.leftContent = leftContent;
        this.rightContent = rightContent;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationBarViewConfig)) {
            return false;
        }
        NotificationBarViewConfig notificationBarViewConfig = (NotificationBarViewConfig) other;
        return Intrinsics.d(this.title, notificationBarViewConfig.title) && this.titleMaxLines == notificationBarViewConfig.titleMaxLines && Intrinsics.d(this.subtitle, notificationBarViewConfig.subtitle) && this.subtitleMaxLines == notificationBarViewConfig.subtitleMaxLines && Intrinsics.d(this.leftContent, notificationBarViewConfig.leftContent) && Intrinsics.d(this.rightContent, notificationBarViewConfig.rightContent);
    }

    public final LeftContent getLeftContent() {
        return this.leftContent;
    }

    public final RightContent getRightContent() {
        return this.rightContent;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final int getSubtitleMaxLines() {
        return this.subtitleMaxLines;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final int getTitleMaxLines() {
        return this.titleMaxLines;
    }

    public int hashCode() {
        int a11 = C2454a.a(this.titleMaxLines, this.title.hashCode() * 31, 31);
        String str = this.subtitle;
        int a12 = C2454a.a(this.subtitleMaxLines, (a11 + (str == null ? 0 : str.hashCode())) * 31, 31);
        LeftContent leftContent = this.leftContent;
        int hashCode = (a12 + (leftContent == null ? 0 : leftContent.hashCode())) * 31;
        RightContent rightContent = this.rightContent;
        return hashCode + (rightContent != null ? rightContent.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        int i11 = this.titleMaxLines;
        String str2 = this.subtitle;
        int i12 = this.subtitleMaxLines;
        LeftContent leftContent = this.leftContent;
        RightContent rightContent = this.rightContent;
        StringBuilder c11 = C3660k.c(i11, "NotificationBarViewConfig(title=", str, ", titleMaxLines=", ", subtitle=");
        Pk0.g.d(i12, str2, ", subtitleMaxLines=", ", leftContent=", c11);
        c11.append(leftContent);
        c11.append(", rightContent=");
        c11.append(rightContent);
        c11.append(")");
        return c11.toString();
    }
}

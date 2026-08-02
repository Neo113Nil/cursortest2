package ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.data;

import G.g;
import Kk.C3532b;
import WZ.t;
import Xc.a;
import Xc.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonsDTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b'\b\u0081\b\u0018\u00002\u00020\u0001:\u0004DEFGB\u008d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b\b\u0010,R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00103\u001a\u0004\b4\u0010\u001dR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010;\u001a\u0004\b>\u0010=R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0016\u0010;\u001a\u0004\b?\u0010=R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0017\u0010;\u001a\u0004\b@\u0010=R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010A\u001a\u0004\bB\u0010C¨\u0006H"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackVO;", "Ll20/c;", "", "id", "", "Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackVO$WidgetButtons;", "buttons", "", "isSticky", "Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackVO$ButtonsOrientation;", "orientation", "Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackVO$ButtonsSize;", "buttonsSize", "", "backgroundColor", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "backgroundRadius", "Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackVO$AlignType;", "align", "Lru/ozon/uni/atoms/data/common/Paddings;", "leftPadding", "rightPadding", "topPadding", "bottomPadding", "LWZ/t;", "tokenizedEvent", "<init>", "(JLjava/util/List;ZLru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackVO$ButtonsOrientation;Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackVO$ButtonsSize;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackVO$AlignType;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getButtons", "()Ljava/util/List;", "Z", "()Z", "Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackVO$ButtonsOrientation;", "getOrientation", "()Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackVO$ButtonsOrientation;", "Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackVO$ButtonsSize;", "getButtonsSize", "()Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackVO$ButtonsSize;", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "getBackgroundRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackVO$AlignType;", "getAlign", "()Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackVO$AlignType;", "Lru/ozon/uni/atoms/data/common/Paddings;", "getLeftPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getRightPadding", "getTopPadding", "getBottomPadding", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "WidgetButtons", "ButtonsSize", "ButtonsOrientation", "AlignType", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ButtonStackVO implements c {

    @NotNull
    private final AlignType align;
    private final String backgroundColor;
    private final CornerRadius backgroundRadius;
    private final Paddings bottomPadding;

    @NotNull
    private final List<WidgetButtons> buttons;

    @NotNull
    private final ButtonsSize buttonsSize;
    private final long id;
    private final boolean isSticky;
    private final Paddings leftPadding;

    @NotNull
    private final ButtonsOrientation orientation;
    private final Paddings rightPadding;
    private final t tokenizedEvent;
    private final Paddings topPadding;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackVO$AlignType;", "", "<init>", "(Ljava/lang/String;I)V", "ALIGN_START", "ALIGN_CENTER", "ALIGN_END", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AlignType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ AlignType[] $VALUES;
        public static final AlignType ALIGN_START = new AlignType("ALIGN_START", 0);
        public static final AlignType ALIGN_CENTER = new AlignType("ALIGN_CENTER", 1);
        public static final AlignType ALIGN_END = new AlignType("ALIGN_END", 2);

        private static final /* synthetic */ AlignType[] $values() {
            return new AlignType[]{ALIGN_START, ALIGN_CENTER, ALIGN_END};
        }

        static {
            AlignType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private AlignType(String str, int i11) {
        }

        public static AlignType valueOf(String str) {
            return (AlignType) Enum.valueOf(AlignType.class, str);
        }

        public static AlignType[] values() {
            return (AlignType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackVO$ButtonsOrientation;", "", "<init>", "(Ljava/lang/String;I)V", "ORIENTATION_VERTICAL", "ORIENTATION_HORIZONTAL", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ButtonsOrientation {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ButtonsOrientation[] $VALUES;
        public static final ButtonsOrientation ORIENTATION_VERTICAL = new ButtonsOrientation("ORIENTATION_VERTICAL", 0);
        public static final ButtonsOrientation ORIENTATION_HORIZONTAL = new ButtonsOrientation("ORIENTATION_HORIZONTAL", 1);

        private static final /* synthetic */ ButtonsOrientation[] $values() {
            return new ButtonsOrientation[]{ORIENTATION_VERTICAL, ORIENTATION_HORIZONTAL};
        }

        static {
            ButtonsOrientation[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ButtonsOrientation(String str, int i11) {
        }

        public static ButtonsOrientation valueOf(String str) {
            return (ButtonsOrientation) Enum.valueOf(ButtonsOrientation.class, str);
        }

        public static ButtonsOrientation[] values() {
            return (ButtonsOrientation[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackVO$ButtonsSize;", "", "LZ1/h;", "verticalGap", "horizontalGap", "<init>", "(Ljava/lang/String;IFF)V", "F", "getVerticalGap-D9Ej5fM", "()F", "getHorizontalGap-D9Ej5fM", "SIZE_400", "SIZE_500", "SIZE_600", "SIZE_700", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ButtonsSize {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ButtonsSize[] $VALUES;
        public static final ButtonsSize SIZE_400;
        public static final ButtonsSize SIZE_500;
        public static final ButtonsSize SIZE_600;
        public static final ButtonsSize SIZE_700;
        private final float horizontalGap;
        private final float verticalGap;

        private static final /* synthetic */ ButtonsSize[] $values() {
            return new ButtonsSize[]{SIZE_400, SIZE_500, SIZE_600, SIZE_700};
        }

        static {
            float f7 = 8;
            SIZE_400 = new ButtonsSize("SIZE_400", 0, f7, f7);
            SIZE_500 = new ButtonsSize("SIZE_500", 1, f7, f7);
            SIZE_600 = new ButtonsSize("SIZE_600", 2, f7, f7);
            SIZE_700 = new ButtonsSize("SIZE_700", 3, 12, f7);
            ButtonsSize[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ButtonsSize(String str, int i11, float f7, float f11) {
            this.verticalGap = f7;
            this.horizontalGap = f11;
        }

        public static ButtonsSize valueOf(String str) {
            return (ButtonsSize) Enum.valueOf(ButtonsSize.class, str);
        }

        public static ButtonsSize[] values() {
            return (ButtonsSize[]) $VALUES.clone();
        }

        /* renamed from: getHorizontalGap-D9Ej5fM, reason: not valid java name and from getter */
        public final float getHorizontalGap() {
            return this.horizontalGap;
        }

        /* renamed from: getVerticalGap-D9Ej5fM, reason: not valid java name and from getter */
        public final float getVerticalGap() {
            return this.verticalGap;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackVO$WidgetButtons;", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonsDTO;", "button", "Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackVO$WidgetButtons$Sizing;", "sizing", "", "buttonWidth", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonsDTO;Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackVO$WidgetButtons$Sizing;Ljava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/controls/button/ButtonsDTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonsDTO;", "Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackVO$WidgetButtons$Sizing;", "getSizing", "()Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackVO$WidgetButtons$Sizing;", "Ljava/lang/Integer;", "getButtonWidth", "()Ljava/lang/Integer;", "Sizing", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WidgetButtons {
        public static final int $stable = ButtonsDTO.$stable;

        @NotNull
        private final ButtonsDTO button;
        private final Integer buttonWidth;

        @NotNull
        private final Sizing sizing;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackVO$WidgetButtons$Sizing;", "", "<init>", "(Ljava/lang/String;I)V", "SIZING_FILL", "SIZING_HUG", "SIZING_FIX", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Sizing {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ Sizing[] $VALUES;
            public static final Sizing SIZING_FILL = new Sizing("SIZING_FILL", 0);
            public static final Sizing SIZING_HUG = new Sizing("SIZING_HUG", 1);
            public static final Sizing SIZING_FIX = new Sizing("SIZING_FIX", 2);

            private static final /* synthetic */ Sizing[] $values() {
                return new Sizing[]{SIZING_FILL, SIZING_HUG, SIZING_FIX};
            }

            static {
                Sizing[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private Sizing(String str, int i11) {
            }

            public static Sizing valueOf(String str) {
                return (Sizing) Enum.valueOf(Sizing.class, str);
            }

            public static Sizing[] values() {
                return (Sizing[]) $VALUES.clone();
            }
        }

        public WidgetButtons(@NotNull ButtonsDTO button, @NotNull Sizing sizing, Integer num) {
            Intrinsics.checkNotNullParameter(button, "button");
            Intrinsics.checkNotNullParameter(sizing, "sizing");
            this.button = button;
            this.sizing = sizing;
            this.buttonWidth = num;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WidgetButtons)) {
                return false;
            }
            WidgetButtons widgetButtons = (WidgetButtons) other;
            return Intrinsics.d(this.button, widgetButtons.button) && this.sizing == widgetButtons.sizing && Intrinsics.d(this.buttonWidth, widgetButtons.buttonWidth);
        }

        @NotNull
        public final ButtonsDTO getButton() {
            return this.button;
        }

        public final Integer getButtonWidth() {
            return this.buttonWidth;
        }

        @NotNull
        public final Sizing getSizing() {
            return this.sizing;
        }

        public int hashCode() {
            int hashCode = (this.sizing.hashCode() + (this.button.hashCode() * 31)) * 31;
            Integer num = this.buttonWidth;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        @NotNull
        public String toString() {
            ButtonsDTO buttonsDTO = this.button;
            Sizing sizing = this.sizing;
            Integer num = this.buttonWidth;
            StringBuilder sb2 = new StringBuilder("WidgetButtons(button=");
            sb2.append(buttonsDTO);
            sb2.append(", sizing=");
            sb2.append(sizing);
            sb2.append(", buttonWidth=");
            return Ep.a.c(sb2, num, ")");
        }
    }

    public ButtonStackVO(long j11, @NotNull List<WidgetButtons> buttons, boolean z11, @NotNull ButtonsOrientation orientation, @NotNull ButtonsSize buttonsSize, String str, CornerRadius cornerRadius, @NotNull AlignType align, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, t tVar) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(buttonsSize, "buttonsSize");
        Intrinsics.checkNotNullParameter(align, "align");
        this.id = j11;
        this.buttons = buttons;
        this.isSticky = z11;
        this.orientation = orientation;
        this.buttonsSize = buttonsSize;
        this.backgroundColor = str;
        this.backgroundRadius = cornerRadius;
        this.align = align;
        this.leftPadding = paddings;
        this.rightPadding = paddings2;
        this.topPadding = paddings3;
        this.bottomPadding = paddings4;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonStackVO)) {
            return false;
        }
        ButtonStackVO buttonStackVO = (ButtonStackVO) other;
        return this.id == buttonStackVO.id && Intrinsics.d(this.buttons, buttonStackVO.buttons) && this.isSticky == buttonStackVO.isSticky && this.orientation == buttonStackVO.orientation && this.buttonsSize == buttonStackVO.buttonsSize && Intrinsics.d(this.backgroundColor, buttonStackVO.backgroundColor) && this.backgroundRadius == buttonStackVO.backgroundRadius && this.align == buttonStackVO.align && this.leftPadding == buttonStackVO.leftPadding && this.rightPadding == buttonStackVO.rightPadding && this.topPadding == buttonStackVO.topPadding && this.bottomPadding == buttonStackVO.bottomPadding && Intrinsics.d(this.tokenizedEvent, buttonStackVO.tokenizedEvent);
    }

    @NotNull
    public final AlignType getAlign() {
        return this.align;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final CornerRadius getBackgroundRadius() {
        return this.backgroundRadius;
    }

    public final Paddings getBottomPadding() {
        return this.bottomPadding;
    }

    @NotNull
    public final List<WidgetButtons> getButtons() {
        return this.buttons;
    }

    @NotNull
    public final ButtonsSize getButtonsSize() {
        return this.buttonsSize;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final Paddings getLeftPadding() {
        return this.leftPadding;
    }

    @NotNull
    public final ButtonsOrientation getOrientation() {
        return this.orientation;
    }

    public final Paddings getRightPadding() {
        return this.rightPadding;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public final Paddings getTopPadding() {
        return this.topPadding;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.buttonsSize.hashCode() + ((this.orientation.hashCode() + C3532b.a(g.b(Long.hashCode(this.id) * 31, 31, this.buttons), 31, this.isSticky)) * 31)) * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        CornerRadius cornerRadius = this.backgroundRadius;
        int hashCode3 = (this.align.hashCode() + ((hashCode2 + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31)) * 31;
        Paddings paddings = this.leftPadding;
        int hashCode4 = (hashCode3 + (paddings == null ? 0 : paddings.hashCode())) * 31;
        Paddings paddings2 = this.rightPadding;
        int hashCode5 = (hashCode4 + (paddings2 == null ? 0 : paddings2.hashCode())) * 31;
        Paddings paddings3 = this.topPadding;
        int hashCode6 = (hashCode5 + (paddings3 == null ? 0 : paddings3.hashCode())) * 31;
        Paddings paddings4 = this.bottomPadding;
        int hashCode7 = (hashCode6 + (paddings4 == null ? 0 : paddings4.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode7 + (tVar != null ? tVar.hashCode() : 0);
    }

    /* renamed from: isSticky, reason: from getter */
    public final boolean getIsSticky() {
        return this.isSticky;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<WidgetButtons> list = this.buttons;
        boolean z11 = this.isSticky;
        ButtonsOrientation buttonsOrientation = this.orientation;
        ButtonsSize buttonsSize = this.buttonsSize;
        String str = this.backgroundColor;
        CornerRadius cornerRadius = this.backgroundRadius;
        AlignType alignType = this.align;
        Paddings paddings = this.leftPadding;
        Paddings paddings2 = this.rightPadding;
        Paddings paddings3 = this.topPadding;
        Paddings paddings4 = this.bottomPadding;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = Lh.b.b(j11, "ButtonStackVO(id=", ", buttons=", list);
        b11.append(", isSticky=");
        b11.append(z11);
        b11.append(", orientation=");
        b11.append(buttonsOrientation);
        b11.append(", buttonsSize=");
        b11.append(buttonsSize);
        b11.append(", backgroundColor=");
        b11.append(str);
        b11.append(", backgroundRadius=");
        b11.append(cornerRadius);
        b11.append(", align=");
        b11.append(alignType);
        b11.append(", leftPadding=");
        b11.append(paddings);
        b11.append(", rightPadding=");
        b11.append(paddings2);
        b11.append(", topPadding=");
        b11.append(paddings3);
        b11.append(", bottomPadding=");
        b11.append(paddings4);
        return Lh.a.b(b11, ", tokenizedEvent=", tVar, ")");
    }
}

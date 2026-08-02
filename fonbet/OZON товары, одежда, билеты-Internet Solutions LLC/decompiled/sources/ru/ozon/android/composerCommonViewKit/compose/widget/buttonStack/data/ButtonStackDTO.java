package ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.data;

import B3.p;
import Kk.C3532b;
import T7.P;
import Xc.a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonsDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u000589:;<Bq\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\t\u0010+\u001a\u00020\bHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010/\u001a\u00020\u0010HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0017\u00101\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003J\u007f\u00102\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0001J\u0013\u00103\u001a\u00020\u00062\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\fHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001f\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006="}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO;", "", "buttons", "", "Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO$WidgetButtons;", "isSticky", "", "orientation", "Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO$ButtonsOrientation;", "buttonsSize", "Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO$ButtonsSize;", "backgroundColor", "", "backgroundRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "align", "Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO$AlignType;", "paddings", "Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO$Paddings;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;ZLru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO$ButtonsOrientation;Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO$ButtonsSize;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO$AlignType;Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO$Paddings;Ljava/util/Map;)V", "getButtons", "()Ljava/util/List;", "()Z", "getOrientation", "()Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO$ButtonsOrientation;", "getButtonsSize", "()Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO$ButtonsSize;", "getBackgroundColor", "()Ljava/lang/String;", "getBackgroundRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getAlign", "()Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO$AlignType;", "getPaddings", "()Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO$Paddings;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "Paddings", "WidgetButtons", "ButtonsSize", "ButtonsOrientation", "AlignType", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ButtonStackDTO {
    public static final int $stable = 8;

    @NotNull
    private final AlignType align;
    private final String backgroundColor;
    private final CornerRadius backgroundRadius;

    @NotNull
    private final List<WidgetButtons> buttons;
    private final ButtonsSize buttonsSize;
    private final boolean isSticky;

    @NotNull
    private final ButtonsOrientation orientation;
    private final Paddings paddings;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO$AlignType;", "", "<init>", "(Ljava/lang/String;I)V", "ALIGN_START", "ALIGN_CENTER", "ALIGN_END", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO$ButtonsOrientation;", "", "<init>", "(Ljava/lang/String;I)V", "ORIENTATION_VERTICAL", "ORIENTATION_HORIZONTAL", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO$ButtonsSize;", "", "<init>", "(Ljava/lang/String;I)V", "SIZE_400", "SIZE_500", "SIZE_600", "SIZE_700", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ButtonsSize {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ButtonsSize[] $VALUES;
        public static final ButtonsSize SIZE_400 = new ButtonsSize("SIZE_400", 0);
        public static final ButtonsSize SIZE_500 = new ButtonsSize("SIZE_500", 1);
        public static final ButtonsSize SIZE_600 = new ButtonsSize("SIZE_600", 2);
        public static final ButtonsSize SIZE_700 = new ButtonsSize("SIZE_700", 3);

        private static final /* synthetic */ ButtonsSize[] $values() {
            return new ButtonsSize[]{SIZE_400, SIZE_500, SIZE_600, SIZE_700};
        }

        static {
            ButtonsSize[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ButtonsSize(String str, int i11) {
        }

        public static ButtonsSize valueOf(String str) {
            return (ButtonsSize) Enum.valueOf(ButtonsSize.class, str);
        }

        public static ButtonsSize[] values() {
            return (ButtonsSize[]) $VALUES.clone();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO$Paddings;", "", "leftPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "rightPadding", "topPadding", "bottomPadding", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getLeftPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getRightPadding", "getTopPadding", "getBottomPadding", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Paddings {
        public static final int $stable = 0;
        private final ru.ozon.uni.atoms.data.common.Paddings bottomPadding;
        private final ru.ozon.uni.atoms.data.common.Paddings leftPadding;
        private final ru.ozon.uni.atoms.data.common.Paddings rightPadding;
        private final ru.ozon.uni.atoms.data.common.Paddings topPadding;

        public Paddings() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ Paddings copy$default(Paddings paddings, ru.ozon.uni.atoms.data.common.Paddings paddings2, ru.ozon.uni.atoms.data.common.Paddings paddings3, ru.ozon.uni.atoms.data.common.Paddings paddings4, ru.ozon.uni.atoms.data.common.Paddings paddings5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings2 = paddings.leftPadding;
            }
            if ((i11 & 2) != 0) {
                paddings3 = paddings.rightPadding;
            }
            if ((i11 & 4) != 0) {
                paddings4 = paddings.topPadding;
            }
            if ((i11 & 8) != 0) {
                paddings5 = paddings.bottomPadding;
            }
            return paddings.copy(paddings2, paddings3, paddings4, paddings5);
        }

        /* renamed from: component1, reason: from getter */
        public final ru.ozon.uni.atoms.data.common.Paddings getLeftPadding() {
            return this.leftPadding;
        }

        /* renamed from: component2, reason: from getter */
        public final ru.ozon.uni.atoms.data.common.Paddings getRightPadding() {
            return this.rightPadding;
        }

        /* renamed from: component3, reason: from getter */
        public final ru.ozon.uni.atoms.data.common.Paddings getTopPadding() {
            return this.topPadding;
        }

        /* renamed from: component4, reason: from getter */
        public final ru.ozon.uni.atoms.data.common.Paddings getBottomPadding() {
            return this.bottomPadding;
        }

        @NotNull
        public final Paddings copy(ru.ozon.uni.atoms.data.common.Paddings leftPadding, ru.ozon.uni.atoms.data.common.Paddings rightPadding, ru.ozon.uni.atoms.data.common.Paddings topPadding, ru.ozon.uni.atoms.data.common.Paddings bottomPadding) {
            return new Paddings(leftPadding, rightPadding, topPadding, bottomPadding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Paddings)) {
                return false;
            }
            Paddings paddings = (Paddings) other;
            return this.leftPadding == paddings.leftPadding && this.rightPadding == paddings.rightPadding && this.topPadding == paddings.topPadding && this.bottomPadding == paddings.bottomPadding;
        }

        public final ru.ozon.uni.atoms.data.common.Paddings getBottomPadding() {
            return this.bottomPadding;
        }

        public final ru.ozon.uni.atoms.data.common.Paddings getLeftPadding() {
            return this.leftPadding;
        }

        public final ru.ozon.uni.atoms.data.common.Paddings getRightPadding() {
            return this.rightPadding;
        }

        public final ru.ozon.uni.atoms.data.common.Paddings getTopPadding() {
            return this.topPadding;
        }

        public int hashCode() {
            ru.ozon.uni.atoms.data.common.Paddings paddings = this.leftPadding;
            int hashCode = (paddings == null ? 0 : paddings.hashCode()) * 31;
            ru.ozon.uni.atoms.data.common.Paddings paddings2 = this.rightPadding;
            int hashCode2 = (hashCode + (paddings2 == null ? 0 : paddings2.hashCode())) * 31;
            ru.ozon.uni.atoms.data.common.Paddings paddings3 = this.topPadding;
            int hashCode3 = (hashCode2 + (paddings3 == null ? 0 : paddings3.hashCode())) * 31;
            ru.ozon.uni.atoms.data.common.Paddings paddings4 = this.bottomPadding;
            return hashCode3 + (paddings4 != null ? paddings4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            ru.ozon.uni.atoms.data.common.Paddings paddings = this.leftPadding;
            ru.ozon.uni.atoms.data.common.Paddings paddings2 = this.rightPadding;
            return GR.b.e(p.b("Paddings(leftPadding=", paddings, ", rightPadding=", paddings2, ", topPadding="), this.topPadding, ", bottomPadding=", this.bottomPadding, ")");
        }

        public Paddings(ru.ozon.uni.atoms.data.common.Paddings paddings, ru.ozon.uni.atoms.data.common.Paddings paddings2, ru.ozon.uni.atoms.data.common.Paddings paddings3, ru.ozon.uni.atoms.data.common.Paddings paddings4) {
            this.leftPadding = paddings;
            this.rightPadding = paddings2;
            this.topPadding = paddings3;
            this.bottomPadding = paddings4;
        }

        public /* synthetic */ Paddings(ru.ozon.uni.atoms.data.common.Paddings paddings, ru.ozon.uni.atoms.data.common.Paddings paddings2, ru.ozon.uni.atoms.data.common.Paddings paddings3, ru.ozon.uni.atoms.data.common.Paddings paddings4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? ru.ozon.uni.atoms.data.common.Paddings.NONE : paddings, (i11 & 2) != 0 ? ru.ozon.uni.atoms.data.common.Paddings.NONE : paddings2, (i11 & 4) != 0 ? ru.ozon.uni.atoms.data.common.Paddings.NONE : paddings3, (i11 & 8) != 0 ? ru.ozon.uni.atoms.data.common.Paddings.NONE : paddings4);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ.\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO$WidgetButtons;", "", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonsDTO;", "sizing", "Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO$WidgetButtons$Sizing;", "buttonWidth", "", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonsDTO;Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO$WidgetButtons$Sizing;Ljava/lang/Integer;)V", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonsDTO;", "getSizing", "()Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO$WidgetButtons$Sizing;", "getButtonWidth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Lru/ozon/uni/atoms/data/controls/button/ButtonsDTO;Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO$WidgetButtons$Sizing;Ljava/lang/Integer;)Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO$WidgetButtons;", "equals", "", "other", "hashCode", "toString", "", "Sizing", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class WidgetButtons {
        public static final int $stable = ButtonsDTO.$stable;

        @NotNull
        private final ButtonsDTO button;
        private final Integer buttonWidth;

        @NotNull
        private final Sizing sizing;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO$WidgetButtons$Sizing;", "", "<init>", "(Ljava/lang/String;I)V", "SIZING_FILL", "SIZING_HUG", "SIZING_FIX", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

        public WidgetButtons(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "button", type = ButtonV3DTO.class), @ProtoOneOfSignature(name = "iconButton", type = IconButtonV3DTO.class)}) @NotNull @ProtoOneOf(label = "type") ButtonsDTO button, @NotNull Sizing sizing, Integer num) {
            Intrinsics.checkNotNullParameter(button, "button");
            Intrinsics.checkNotNullParameter(sizing, "sizing");
            this.button = button;
            this.sizing = sizing;
            this.buttonWidth = num;
        }

        public static /* synthetic */ WidgetButtons copy$default(WidgetButtons widgetButtons, ButtonsDTO buttonsDTO, Sizing sizing, Integer num, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                buttonsDTO = widgetButtons.button;
            }
            if ((i11 & 2) != 0) {
                sizing = widgetButtons.sizing;
            }
            if ((i11 & 4) != 0) {
                num = widgetButtons.buttonWidth;
            }
            return widgetButtons.copy(buttonsDTO, sizing, num);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ButtonsDTO getButton() {
            return this.button;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Sizing getSizing() {
            return this.sizing;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getButtonWidth() {
            return this.buttonWidth;
        }

        @NotNull
        public final WidgetButtons copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "button", type = ButtonV3DTO.class), @ProtoOneOfSignature(name = "iconButton", type = IconButtonV3DTO.class)}) @NotNull @ProtoOneOf(label = "type") ButtonsDTO button, @NotNull Sizing sizing, Integer buttonWidth) {
            Intrinsics.checkNotNullParameter(button, "button");
            Intrinsics.checkNotNullParameter(sizing, "sizing");
            return new WidgetButtons(button, sizing, buttonWidth);
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

    public ButtonStackDTO(@NotNull List<WidgetButtons> buttons, boolean z11, @NotNull ButtonsOrientation orientation, ButtonsSize buttonsSize, String str, CornerRadius cornerRadius, @NotNull AlignType align, Paddings paddings, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(align, "align");
        this.buttons = buttons;
        this.isSticky = z11;
        this.orientation = orientation;
        this.buttonsSize = buttonsSize;
        this.backgroundColor = str;
        this.backgroundRadius = cornerRadius;
        this.align = align;
        this.paddings = paddings;
        this.trackingInfo = map;
    }

    public static /* synthetic */ ButtonStackDTO copy$default(ButtonStackDTO buttonStackDTO, List list, boolean z11, ButtonsOrientation buttonsOrientation, ButtonsSize buttonsSize, String str, CornerRadius cornerRadius, AlignType alignType, Paddings paddings, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = buttonStackDTO.buttons;
        }
        if ((i11 & 2) != 0) {
            z11 = buttonStackDTO.isSticky;
        }
        if ((i11 & 4) != 0) {
            buttonsOrientation = buttonStackDTO.orientation;
        }
        if ((i11 & 8) != 0) {
            buttonsSize = buttonStackDTO.buttonsSize;
        }
        if ((i11 & 16) != 0) {
            str = buttonStackDTO.backgroundColor;
        }
        if ((i11 & 32) != 0) {
            cornerRadius = buttonStackDTO.backgroundRadius;
        }
        if ((i11 & 64) != 0) {
            alignType = buttonStackDTO.align;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            paddings = buttonStackDTO.paddings;
        }
        if ((i11 & 256) != 0) {
            map = buttonStackDTO.trackingInfo;
        }
        Paddings paddings2 = paddings;
        Map map2 = map;
        CornerRadius cornerRadius2 = cornerRadius;
        AlignType alignType2 = alignType;
        String str2 = str;
        ButtonsOrientation buttonsOrientation2 = buttonsOrientation;
        return buttonStackDTO.copy(list, z11, buttonsOrientation2, buttonsSize, str2, cornerRadius2, alignType2, paddings2, map2);
    }

    @NotNull
    public final List<WidgetButtons> component1() {
        return this.buttons;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSticky() {
        return this.isSticky;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ButtonsOrientation getOrientation() {
        return this.orientation;
    }

    /* renamed from: component4, reason: from getter */
    public final ButtonsSize getButtonsSize() {
        return this.buttonsSize;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component6, reason: from getter */
    public final CornerRadius getBackgroundRadius() {
        return this.backgroundRadius;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final AlignType getAlign() {
        return this.align;
    }

    /* renamed from: component8, reason: from getter */
    public final Paddings getPaddings() {
        return this.paddings;
    }

    public final Map<String, TokenizedTrackingInfo> component9() {
        return this.trackingInfo;
    }

    @NotNull
    public final ButtonStackDTO copy(@NotNull List<WidgetButtons> buttons, boolean isSticky, @NotNull ButtonsOrientation orientation, ButtonsSize buttonsSize, String backgroundColor, CornerRadius backgroundRadius, @NotNull AlignType align, Paddings paddings, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(align, "align");
        return new ButtonStackDTO(buttons, isSticky, orientation, buttonsSize, backgroundColor, backgroundRadius, align, paddings, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonStackDTO)) {
            return false;
        }
        ButtonStackDTO buttonStackDTO = (ButtonStackDTO) other;
        return Intrinsics.d(this.buttons, buttonStackDTO.buttons) && this.isSticky == buttonStackDTO.isSticky && this.orientation == buttonStackDTO.orientation && this.buttonsSize == buttonStackDTO.buttonsSize && Intrinsics.d(this.backgroundColor, buttonStackDTO.backgroundColor) && this.backgroundRadius == buttonStackDTO.backgroundRadius && this.align == buttonStackDTO.align && Intrinsics.d(this.paddings, buttonStackDTO.paddings) && Intrinsics.d(this.trackingInfo, buttonStackDTO.trackingInfo);
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

    @NotNull
    public final List<WidgetButtons> getButtons() {
        return this.buttons;
    }

    public final ButtonsSize getButtonsSize() {
        return this.buttonsSize;
    }

    @NotNull
    public final ButtonsOrientation getOrientation() {
        return this.orientation;
    }

    public final Paddings getPaddings() {
        return this.paddings;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = (this.orientation.hashCode() + C3532b.a(this.buttons.hashCode() * 31, 31, this.isSticky)) * 31;
        ButtonsSize buttonsSize = this.buttonsSize;
        int hashCode2 = (hashCode + (buttonsSize == null ? 0 : buttonsSize.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        CornerRadius cornerRadius = this.backgroundRadius;
        int hashCode4 = (this.align.hashCode() + ((hashCode3 + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31)) * 31;
        Paddings paddings = this.paddings;
        int hashCode5 = (hashCode4 + (paddings == null ? 0 : paddings.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode5 + (map != null ? map.hashCode() : 0);
    }

    public final boolean isSticky() {
        return this.isSticky;
    }

    @NotNull
    public String toString() {
        List<WidgetButtons> list = this.buttons;
        boolean z11 = this.isSticky;
        ButtonsOrientation buttonsOrientation = this.orientation;
        ButtonsSize buttonsSize = this.buttonsSize;
        String str = this.backgroundColor;
        CornerRadius cornerRadius = this.backgroundRadius;
        AlignType alignType = this.align;
        Paddings paddings = this.paddings;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("ButtonStackDTO(buttons=");
        sb2.append(list);
        sb2.append(", isSticky=");
        sb2.append(z11);
        sb2.append(", orientation=");
        sb2.append(buttonsOrientation);
        sb2.append(", buttonsSize=");
        sb2.append(buttonsSize);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", backgroundRadius=");
        sb2.append(cornerRadius);
        sb2.append(", align=");
        sb2.append(alignType);
        sb2.append(", paddings=");
        sb2.append(paddings);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }

    public /* synthetic */ ButtonStackDTO(List list, boolean z11, ButtonsOrientation buttonsOrientation, ButtonsSize buttonsSize, String str, CornerRadius cornerRadius, AlignType alignType, Paddings paddings, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, z11, buttonsOrientation, (i11 & 8) != 0 ? ButtonsSize.SIZE_500 : buttonsSize, str, cornerRadius, (i11 & 64) != 0 ? AlignType.ALIGN_START : alignType, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : paddings, map);
    }
}

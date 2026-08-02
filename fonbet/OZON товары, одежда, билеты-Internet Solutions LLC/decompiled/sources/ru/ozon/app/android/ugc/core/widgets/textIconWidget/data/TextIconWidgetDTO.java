package ru.ozon.app.android.ugc.core.widgets.textIconWidget.data;

import B3.p;
import Bl.C2639a;
import Ul.C4070a;
import Xc.a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0003456Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0017\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003Js\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00067"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/textIconWidget/data/TextIconWidgetDTO;", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "iconPosition", "Lru/ozon/app/android/ugc/core/widgets/textIconWidget/data/TextIconWidgetDTO$IconPosition;", "alignment", "Lru/ozon/app/android/ugc/core/widgets/textIconWidget/data/TextIconWidgetDTO$Alignment;", "paddings", "Lru/ozon/app/android/ugc/core/widgets/textIconWidget/data/TextIconWidgetDTO$LayoutPaddings;", "backgroundColor", "", "tracking", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/ugc/core/widgets/textIconWidget/data/TextIconWidgetDTO$IconPosition;Lru/ozon/app/android/ugc/core/widgets/textIconWidget/data/TextIconWidgetDTO$Alignment;Lru/ozon/app/android/ugc/core/widgets/textIconWidget/data/TextIconWidgetDTO$LayoutPaddings;Ljava/lang/String;Ljava/util/Map;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getIconPosition", "()Lru/ozon/app/android/ugc/core/widgets/textIconWidget/data/TextIconWidgetDTO$IconPosition;", "getAlignment", "()Lru/ozon/app/android/ugc/core/widgets/textIconWidget/data/TextIconWidgetDTO$Alignment;", "getPaddings", "()Lru/ozon/app/android/ugc/core/widgets/textIconWidget/data/TextIconWidgetDTO$LayoutPaddings;", "getBackgroundColor", "()Ljava/lang/String;", "getTracking", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "LayoutPaddings", "Alignment", "IconPosition", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TextIconWidgetDTO {
    public static final int $stable = 8;
    private final AtomActionDTO action;
    private final Alignment alignment;
    private final String backgroundColor;
    private final IconDTO icon;
    private final IconPosition iconPosition;
    private final LayoutPaddings paddings;

    @NotNull
    private final TextDTO text;
    private final Map<String, TokenizedTrackingInfo> tracking;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/textIconWidget/data/TextIconWidgetDTO$Alignment;", "", "<init>", "(Ljava/lang/String;I)V", "ALIGNMENT_INVALID", "LEFT", "CENTER", "RIGHT", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Alignment {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Alignment[] $VALUES;
        public static final Alignment ALIGNMENT_INVALID = new Alignment("ALIGNMENT_INVALID", 0);
        public static final Alignment LEFT = new Alignment("LEFT", 1);
        public static final Alignment CENTER = new Alignment("CENTER", 2);
        public static final Alignment RIGHT = new Alignment("RIGHT", 3);

        private static final /* synthetic */ Alignment[] $values() {
            return new Alignment[]{ALIGNMENT_INVALID, LEFT, CENTER, RIGHT};
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/textIconWidget/data/TextIconWidgetDTO$IconPosition;", "", "<init>", "(Ljava/lang/String;I)V", "POSITION_INVALID", "START", "END", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconPosition {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ IconPosition[] $VALUES;
        public static final IconPosition POSITION_INVALID = new IconPosition("POSITION_INVALID", 0);
        public static final IconPosition START = new IconPosition("START", 1);
        public static final IconPosition END = new IconPosition("END", 2);

        private static final /* synthetic */ IconPosition[] $values() {
            return new IconPosition[]{POSITION_INVALID, START, END};
        }

        static {
            IconPosition[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private IconPosition(String str, int i11) {
        }

        public static IconPosition valueOf(String str) {
            return (IconPosition) Enum.valueOf(IconPosition.class, str);
        }

        public static IconPosition[] values() {
            return (IconPosition[]) $VALUES.clone();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/textIconWidget/data/TextIconWidgetDTO$LayoutPaddings;", "", "topPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "bottomPadding", "leftPadding", "rightPadding", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getTopPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottomPadding", "getLeftPadding", "getRightPadding", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LayoutPaddings {
        public static final int $stable = 0;
        private final Paddings bottomPadding;
        private final Paddings leftPadding;
        private final Paddings rightPadding;
        private final Paddings topPadding;

        public LayoutPaddings(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4) {
            this.topPadding = paddings;
            this.bottomPadding = paddings2;
            this.leftPadding = paddings3;
            this.rightPadding = paddings4;
        }

        public static /* synthetic */ LayoutPaddings copy$default(LayoutPaddings layoutPaddings, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = layoutPaddings.topPadding;
            }
            if ((i11 & 2) != 0) {
                paddings2 = layoutPaddings.bottomPadding;
            }
            if ((i11 & 4) != 0) {
                paddings3 = layoutPaddings.leftPadding;
            }
            if ((i11 & 8) != 0) {
                paddings4 = layoutPaddings.rightPadding;
            }
            return layoutPaddings.copy(paddings, paddings2, paddings3, paddings4);
        }

        /* renamed from: component1, reason: from getter */
        public final Paddings getTopPadding() {
            return this.topPadding;
        }

        /* renamed from: component2, reason: from getter */
        public final Paddings getBottomPadding() {
            return this.bottomPadding;
        }

        /* renamed from: component3, reason: from getter */
        public final Paddings getLeftPadding() {
            return this.leftPadding;
        }

        /* renamed from: component4, reason: from getter */
        public final Paddings getRightPadding() {
            return this.rightPadding;
        }

        @NotNull
        public final LayoutPaddings copy(Paddings topPadding, Paddings bottomPadding, Paddings leftPadding, Paddings rightPadding) {
            return new LayoutPaddings(topPadding, bottomPadding, leftPadding, rightPadding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LayoutPaddings)) {
                return false;
            }
            LayoutPaddings layoutPaddings = (LayoutPaddings) other;
            return this.topPadding == layoutPaddings.topPadding && this.bottomPadding == layoutPaddings.bottomPadding && this.leftPadding == layoutPaddings.leftPadding && this.rightPadding == layoutPaddings.rightPadding;
        }

        public final Paddings getBottomPadding() {
            return this.bottomPadding;
        }

        public final Paddings getLeftPadding() {
            return this.leftPadding;
        }

        public final Paddings getRightPadding() {
            return this.rightPadding;
        }

        public final Paddings getTopPadding() {
            return this.topPadding;
        }

        public int hashCode() {
            Paddings paddings = this.topPadding;
            int hashCode = (paddings == null ? 0 : paddings.hashCode()) * 31;
            Paddings paddings2 = this.bottomPadding;
            int hashCode2 = (hashCode + (paddings2 == null ? 0 : paddings2.hashCode())) * 31;
            Paddings paddings3 = this.leftPadding;
            int hashCode3 = (hashCode2 + (paddings3 == null ? 0 : paddings3.hashCode())) * 31;
            Paddings paddings4 = this.rightPadding;
            return hashCode3 + (paddings4 != null ? paddings4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.topPadding;
            Paddings paddings2 = this.bottomPadding;
            return GR.b.e(p.b("LayoutPaddings(topPadding=", paddings, ", bottomPadding=", paddings2, ", leftPadding="), this.leftPadding, ", rightPadding=", this.rightPadding, ")");
        }
    }

    public TextIconWidgetDTO(@NotNull TextDTO text, IconDTO iconDTO, AtomActionDTO atomActionDTO, IconPosition iconPosition, Alignment alignment, LayoutPaddings layoutPaddings, String str, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.icon = iconDTO;
        this.action = atomActionDTO;
        this.iconPosition = iconPosition;
        this.alignment = alignment;
        this.paddings = layoutPaddings;
        this.backgroundColor = str;
        this.tracking = map;
    }

    public static /* synthetic */ TextIconWidgetDTO copy$default(TextIconWidgetDTO textIconWidgetDTO, TextDTO textDTO, IconDTO iconDTO, AtomActionDTO atomActionDTO, IconPosition iconPosition, Alignment alignment, LayoutPaddings layoutPaddings, String str, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = textIconWidgetDTO.text;
        }
        if ((i11 & 2) != 0) {
            iconDTO = textIconWidgetDTO.icon;
        }
        if ((i11 & 4) != 0) {
            atomActionDTO = textIconWidgetDTO.action;
        }
        if ((i11 & 8) != 0) {
            iconPosition = textIconWidgetDTO.iconPosition;
        }
        if ((i11 & 16) != 0) {
            alignment = textIconWidgetDTO.alignment;
        }
        if ((i11 & 32) != 0) {
            layoutPaddings = textIconWidgetDTO.paddings;
        }
        if ((i11 & 64) != 0) {
            str = textIconWidgetDTO.backgroundColor;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            map = textIconWidgetDTO.tracking;
        }
        String str2 = str;
        Map map2 = map;
        Alignment alignment2 = alignment;
        LayoutPaddings layoutPaddings2 = layoutPaddings;
        return textIconWidgetDTO.copy(textDTO, iconDTO, atomActionDTO, iconPosition, alignment2, layoutPaddings2, str2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final IconDTO getIcon() {
        return this.icon;
    }

    /* renamed from: component3, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component4, reason: from getter */
    public final IconPosition getIconPosition() {
        return this.iconPosition;
    }

    /* renamed from: component5, reason: from getter */
    public final Alignment getAlignment() {
        return this.alignment;
    }

    /* renamed from: component6, reason: from getter */
    public final LayoutPaddings getPaddings() {
        return this.paddings;
    }

    /* renamed from: component7, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Map<String, TokenizedTrackingInfo> component8() {
        return this.tracking;
    }

    @NotNull
    public final TextIconWidgetDTO copy(@NotNull TextDTO text, IconDTO icon, AtomActionDTO action, IconPosition iconPosition, Alignment alignment, LayoutPaddings paddings, String backgroundColor, Map<String, TokenizedTrackingInfo> tracking) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new TextIconWidgetDTO(text, icon, action, iconPosition, alignment, paddings, backgroundColor, tracking);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextIconWidgetDTO)) {
            return false;
        }
        TextIconWidgetDTO textIconWidgetDTO = (TextIconWidgetDTO) other;
        return Intrinsics.d(this.text, textIconWidgetDTO.text) && Intrinsics.d(this.icon, textIconWidgetDTO.icon) && Intrinsics.d(this.action, textIconWidgetDTO.action) && this.iconPosition == textIconWidgetDTO.iconPosition && this.alignment == textIconWidgetDTO.alignment && Intrinsics.d(this.paddings, textIconWidgetDTO.paddings) && Intrinsics.d(this.backgroundColor, textIconWidgetDTO.backgroundColor) && Intrinsics.d(this.tracking, textIconWidgetDTO.tracking);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final IconDTO getIcon() {
        return this.icon;
    }

    public final IconPosition getIconPosition() {
        return this.iconPosition;
    }

    public final LayoutPaddings getPaddings() {
        return this.paddings;
    }

    @NotNull
    public final TextDTO getText() {
        return this.text;
    }

    public final Map<String, TokenizedTrackingInfo> getTracking() {
        return this.tracking;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        IconDTO iconDTO = this.icon;
        int hashCode2 = (hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        IconPosition iconPosition = this.iconPosition;
        int hashCode4 = (hashCode3 + (iconPosition == null ? 0 : iconPosition.hashCode())) * 31;
        Alignment alignment = this.alignment;
        int hashCode5 = (hashCode4 + (alignment == null ? 0 : alignment.hashCode())) * 31;
        LayoutPaddings layoutPaddings = this.paddings;
        int hashCode6 = (hashCode5 + (layoutPaddings == null ? 0 : layoutPaddings.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.tracking;
        return hashCode7 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.text;
        IconDTO iconDTO = this.icon;
        AtomActionDTO atomActionDTO = this.action;
        IconPosition iconPosition = this.iconPosition;
        Alignment alignment = this.alignment;
        LayoutPaddings layoutPaddings = this.paddings;
        String str = this.backgroundColor;
        Map<String, TokenizedTrackingInfo> map = this.tracking;
        StringBuilder d11 = C2639a.d("TextIconWidgetDTO(text=", ", icon=", ", action=", iconDTO, textDTO);
        d11.append(atomActionDTO);
        d11.append(", iconPosition=");
        d11.append(iconPosition);
        d11.append(", alignment=");
        d11.append(alignment);
        d11.append(", paddings=");
        d11.append(layoutPaddings);
        d11.append(", backgroundColor=");
        return C4070a.a(d11, str, ", tracking=", map, ")");
    }
}

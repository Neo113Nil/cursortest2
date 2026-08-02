package ru.ozon.app.android.pdp.ui.configurators.pdp.aspectsV4.data;

import G.g;
import Kk.C3532b;
import Tz.C4055a;
import Xc.a;
import Xc.b;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.expandable.ExpandableTextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0005+,-./BO\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0017\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J]\u0010$\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u00060"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTO;", "", "variants", "", "Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTO$Variant;", "selectedColor", "", "layoutType", "Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTO$LayoutType;", "aspectInfo", "Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTO$AspectInfo;", "markdownReason", "Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTO$MarkdownReason;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/lang/String;Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTO$LayoutType;Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTO$AspectInfo;Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTO$MarkdownReason;Ljava/util/Map;)V", "getVariants", "()Ljava/util/List;", "getSelectedColor", "()Ljava/lang/String;", "getLayoutType", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTO$LayoutType;", "getAspectInfo", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTO$AspectInfo;", "getMarkdownReason", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTO$MarkdownReason;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "MarkdownReason", "AspectInfo", "LayoutType", "Variant", "TappableText", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AspectsV4DTO {
    public static final int $stable = 8;
    private final AspectInfo aspectInfo;

    @NotNull
    private final LayoutType layoutType;
    private final MarkdownReason markdownReason;

    @NotNull
    private final String selectedColor;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private final List<Variant> variants;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTO$AspectInfo;", "", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", CommentV3DTO.EXPANDABLE_TEXT_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/expandable/ExpandableTextDTO;", "tappableText", "Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTO$TappableText;", "<init>", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/expandable/ExpandableTextDTO;Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTO$TappableText;)V", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getExpandableText", "()Lru/ozon/uni/atoms/data/text/expandable/ExpandableTextDTO;", "getTappableText", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTO$TappableText;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AspectInfo {
        public static final int $stable = ExpandableTextDTO.$stable;
        private final BadgeDTO badge;
        private final ExpandableTextDTO expandableText;
        private final TappableText tappableText;

        public AspectInfo(BadgeDTO badgeDTO, ExpandableTextDTO expandableTextDTO, TappableText tappableText) {
            this.badge = badgeDTO;
            this.expandableText = expandableTextDTO;
            this.tappableText = tappableText;
        }

        public static /* synthetic */ AspectInfo copy$default(AspectInfo aspectInfo, BadgeDTO badgeDTO, ExpandableTextDTO expandableTextDTO, TappableText tappableText, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                badgeDTO = aspectInfo.badge;
            }
            if ((i11 & 2) != 0) {
                expandableTextDTO = aspectInfo.expandableText;
            }
            if ((i11 & 4) != 0) {
                tappableText = aspectInfo.tappableText;
            }
            return aspectInfo.copy(badgeDTO, expandableTextDTO, tappableText);
        }

        /* renamed from: component1, reason: from getter */
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        /* renamed from: component2, reason: from getter */
        public final ExpandableTextDTO getExpandableText() {
            return this.expandableText;
        }

        /* renamed from: component3, reason: from getter */
        public final TappableText getTappableText() {
            return this.tappableText;
        }

        @NotNull
        public final AspectInfo copy(BadgeDTO badge, ExpandableTextDTO expandableText, TappableText tappableText) {
            return new AspectInfo(badge, expandableText, tappableText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AspectInfo)) {
                return false;
            }
            AspectInfo aspectInfo = (AspectInfo) other;
            return Intrinsics.d(this.badge, aspectInfo.badge) && Intrinsics.d(this.expandableText, aspectInfo.expandableText) && Intrinsics.d(this.tappableText, aspectInfo.tappableText);
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final ExpandableTextDTO getExpandableText() {
            return this.expandableText;
        }

        public final TappableText getTappableText() {
            return this.tappableText;
        }

        public int hashCode() {
            BadgeDTO badgeDTO = this.badge;
            int hashCode = (badgeDTO == null ? 0 : badgeDTO.hashCode()) * 31;
            ExpandableTextDTO expandableTextDTO = this.expandableText;
            int hashCode2 = (hashCode + (expandableTextDTO == null ? 0 : expandableTextDTO.hashCode())) * 31;
            TappableText tappableText = this.tappableText;
            return hashCode2 + (tappableText != null ? tappableText.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "AspectInfo(badge=" + this.badge + ", expandableText=" + this.expandableText + ", tappableText=" + this.tappableText + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTO$LayoutType;", "", "<init>", "(Ljava/lang/String;I)V", "SCROLL", "MULTILINE", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LayoutType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ LayoutType[] $VALUES;

        @i(name = "SCROLL")
        public static final LayoutType SCROLL = new LayoutType("SCROLL", 0);

        @i(name = "MULTILINE")
        public static final LayoutType MULTILINE = new LayoutType("MULTILINE", 1);

        private static final /* synthetic */ LayoutType[] $values() {
            return new LayoutType[]{SCROLL, MULTILINE};
        }

        static {
            LayoutType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private LayoutType(String str, int i11) {
        }

        public static LayoutType valueOf(String str) {
            return (LayoutType) Enum.valueOf(LayoutType.class, str);
        }

        public static LayoutType[] values() {
            return (LayoutType[]) $VALUES.clone();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTO$MarkdownReason;", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MarkdownReason {
        public static final int $stable = 0;
        private final ButtonV3DTO button;

        @NotNull
        private final TextDTO text;

        public MarkdownReason(@NotNull TextDTO text, ButtonV3DTO buttonV3DTO) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.button = buttonV3DTO;
        }

        public static /* synthetic */ MarkdownReason copy$default(MarkdownReason markdownReason, TextDTO textDTO, ButtonV3DTO buttonV3DTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = markdownReason.text;
            }
            if ((i11 & 2) != 0) {
                buttonV3DTO = markdownReason.button;
            }
            return markdownReason.copy(textDTO, buttonV3DTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final ButtonV3DTO getButton() {
            return this.button;
        }

        @NotNull
        public final MarkdownReason copy(@NotNull TextDTO text, ButtonV3DTO button) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new MarkdownReason(text, button);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MarkdownReason)) {
                return false;
            }
            MarkdownReason markdownReason = (MarkdownReason) other;
            return Intrinsics.d(this.text, markdownReason.text) && Intrinsics.d(this.button, markdownReason.button);
        }

        public final ButtonV3DTO getButton() {
            return this.button;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            ButtonV3DTO buttonV3DTO = this.button;
            return hashCode + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode());
        }

        @NotNull
        public String toString() {
            return "MarkdownReason(text=" + this.text + ", button=" + this.button + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTO$TappableText;", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TappableText {
        public static final int $stable = 0;
        private final AtomActionDTO action;

        @NotNull
        private final TextDTO text;

        public TappableText(@NotNull TextDTO text, AtomActionDTO atomActionDTO) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.action = atomActionDTO;
        }

        public static /* synthetic */ TappableText copy$default(TappableText tappableText, TextDTO textDTO, AtomActionDTO atomActionDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = tappableText.text;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = tappableText.action;
            }
            return tappableText.copy(textDTO, atomActionDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final TappableText copy(@NotNull TextDTO text, AtomActionDTO action) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new TappableText(text, action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TappableText)) {
                return false;
            }
            TappableText tappableText = (TappableText) other;
            return Intrinsics.d(this.text, tappableText.text) && Intrinsics.d(this.action, tappableText.action);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            AtomActionDTO atomActionDTO = this.action;
            return hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode());
        }

        @NotNull
        public String toString() {
            return "TappableText(text=" + this.text + ", action=" + this.action + ")";
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001(BK\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0017\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\rHÆ\u0003J\\\u0010!\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0014R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\b\u0010\u0015R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTO$Variant;", "", "variant", "Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTO$Variant$VariantType;", "refreshDeeplink", "", "isOutOfStock", "", "isSelected", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTO$Variant$VariantType;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/util/Map;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getVariant", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTO$Variant$VariantType;", "getRefreshDeeplink", "()Ljava/lang/String;", "()Z", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTrackingInfo", "()Ljava/util/Map;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTO$Variant$VariantType;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/util/Map;Lru/ozon/uni/atoms/data/AtomActionDTO;)Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTO$Variant;", "equals", "other", "hashCode", "", "toString", "VariantType", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Variant {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final boolean isOutOfStock;
        private final Boolean isSelected;

        @NotNull
        private final String refreshDeeplink;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @NotNull
        private final VariantType variant;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTO$Variant$VariantType;", "", "<init>", "()V", "Image", "Size", "Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTO$Variant$VariantType$Image;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTO$Variant$VariantType$Size;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class VariantType {
            public static final int $stable = 0;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J5\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTO$Variant$VariantType$Image;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTO$Variant$VariantType;", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "label", "Lru/ozon/uni/atoms/data/text/TextDTO;", "isWave", "", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Z)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getLabel", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Image extends VariantType {
                public static final int $stable = 0;
                private final BadgeDTO badge;

                @NotNull
                private final ImageDTO image;
                private final boolean isWave;
                private final TextDTO label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Image(@NotNull ImageDTO image, BadgeDTO badgeDTO, TextDTO textDTO, boolean z11) {
                    super(null);
                    Intrinsics.checkNotNullParameter(image, "image");
                    this.image = image;
                    this.badge = badgeDTO;
                    this.label = textDTO;
                    this.isWave = z11;
                }

                public static /* synthetic */ Image copy$default(Image image, ImageDTO imageDTO, BadgeDTO badgeDTO, TextDTO textDTO, boolean z11, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        imageDTO = image.image;
                    }
                    if ((i11 & 2) != 0) {
                        badgeDTO = image.badge;
                    }
                    if ((i11 & 4) != 0) {
                        textDTO = image.label;
                    }
                    if ((i11 & 8) != 0) {
                        z11 = image.isWave;
                    }
                    return image.copy(imageDTO, badgeDTO, textDTO, z11);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final ImageDTO getImage() {
                    return this.image;
                }

                /* renamed from: component2, reason: from getter */
                public final BadgeDTO getBadge() {
                    return this.badge;
                }

                /* renamed from: component3, reason: from getter */
                public final TextDTO getLabel() {
                    return this.label;
                }

                /* renamed from: component4, reason: from getter */
                public final boolean getIsWave() {
                    return this.isWave;
                }

                @NotNull
                public final Image copy(@NotNull ImageDTO image, BadgeDTO badge, TextDTO label, boolean isWave) {
                    Intrinsics.checkNotNullParameter(image, "image");
                    return new Image(image, badge, label, isWave);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Image)) {
                        return false;
                    }
                    Image image = (Image) other;
                    return Intrinsics.d(this.image, image.image) && Intrinsics.d(this.badge, image.badge) && Intrinsics.d(this.label, image.label) && this.isWave == image.isWave;
                }

                public final BadgeDTO getBadge() {
                    return this.badge;
                }

                @NotNull
                public final ImageDTO getImage() {
                    return this.image;
                }

                public final TextDTO getLabel() {
                    return this.label;
                }

                public int hashCode() {
                    int hashCode = this.image.hashCode() * 31;
                    BadgeDTO badgeDTO = this.badge;
                    int hashCode2 = (hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
                    TextDTO textDTO = this.label;
                    return Boolean.hashCode(this.isWave) + ((hashCode2 + (textDTO != null ? textDTO.hashCode() : 0)) * 31);
                }

                public final boolean isWave() {
                    return this.isWave;
                }

                @NotNull
                public String toString() {
                    return "Image(image=" + this.image + ", badge=" + this.badge + ", label=" + this.label + ", isWave=" + this.isWave + ")";
                }
            }

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTO$Variant$VariantType$Size;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTO$Variant$VariantType;", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtext", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtext", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Size extends VariantType {
                public static final int $stable = 0;
                private final TextDTO subtext;

                @NotNull
                private final TextDTO text;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Size(@NotNull TextDTO text, TextDTO textDTO) {
                    super(null);
                    Intrinsics.checkNotNullParameter(text, "text");
                    this.text = text;
                    this.subtext = textDTO;
                }

                public static /* synthetic */ Size copy$default(Size size, TextDTO textDTO, TextDTO textDTO2, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        textDTO = size.text;
                    }
                    if ((i11 & 2) != 0) {
                        textDTO2 = size.subtext;
                    }
                    return size.copy(textDTO, textDTO2);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final TextDTO getText() {
                    return this.text;
                }

                /* renamed from: component2, reason: from getter */
                public final TextDTO getSubtext() {
                    return this.subtext;
                }

                @NotNull
                public final Size copy(@NotNull TextDTO text, TextDTO subtext) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    return new Size(text, subtext);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Size)) {
                        return false;
                    }
                    Size size = (Size) other;
                    return Intrinsics.d(this.text, size.text) && Intrinsics.d(this.subtext, size.subtext);
                }

                public final TextDTO getSubtext() {
                    return this.subtext;
                }

                @NotNull
                public final TextDTO getText() {
                    return this.text;
                }

                public int hashCode() {
                    int hashCode = this.text.hashCode() * 31;
                    TextDTO textDTO = this.subtext;
                    return hashCode + (textDTO == null ? 0 : textDTO.hashCode());
                }

                @NotNull
                public String toString() {
                    return Lc.a.b("Size(text=", this.text, ", subtext=", this.subtext, ")");
                }
            }

            public /* synthetic */ VariantType(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private VariantType() {
            }
        }

        public Variant(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "image", type = VariantType.Image.class), @ProtoOneOfSignature(name = "size", type = VariantType.Size.class)}) @NotNull @ProtoOneOf(label = "type") VariantType variant, @NotNull String refreshDeeplink, boolean z11, Boolean bool, Map<String, TokenizedTrackingInfo> map, AtomActionDTO atomActionDTO) {
            Intrinsics.checkNotNullParameter(variant, "variant");
            Intrinsics.checkNotNullParameter(refreshDeeplink, "refreshDeeplink");
            this.variant = variant;
            this.refreshDeeplink = refreshDeeplink;
            this.isOutOfStock = z11;
            this.isSelected = bool;
            this.trackingInfo = map;
            this.action = atomActionDTO;
        }

        public static /* synthetic */ Variant copy$default(Variant variant, VariantType variantType, String str, boolean z11, Boolean bool, Map map, AtomActionDTO atomActionDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                variantType = variant.variant;
            }
            if ((i11 & 2) != 0) {
                str = variant.refreshDeeplink;
            }
            if ((i11 & 4) != 0) {
                z11 = variant.isOutOfStock;
            }
            if ((i11 & 8) != 0) {
                bool = variant.isSelected;
            }
            if ((i11 & 16) != 0) {
                map = variant.trackingInfo;
            }
            if ((i11 & 32) != 0) {
                atomActionDTO = variant.action;
            }
            Map map2 = map;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            return variant.copy(variantType, str, z11, bool, map2, atomActionDTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final VariantType getVariant() {
            return this.variant;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getRefreshDeeplink() {
            return this.refreshDeeplink;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsOutOfStock() {
            return this.isOutOfStock;
        }

        /* renamed from: component4, reason: from getter */
        public final Boolean getIsSelected() {
            return this.isSelected;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.trackingInfo;
        }

        /* renamed from: component6, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final Variant copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "image", type = VariantType.Image.class), @ProtoOneOfSignature(name = "size", type = VariantType.Size.class)}) @NotNull @ProtoOneOf(label = "type") VariantType variant, @NotNull String refreshDeeplink, boolean isOutOfStock, Boolean isSelected, Map<String, TokenizedTrackingInfo> trackingInfo, AtomActionDTO action) {
            Intrinsics.checkNotNullParameter(variant, "variant");
            Intrinsics.checkNotNullParameter(refreshDeeplink, "refreshDeeplink");
            return new Variant(variant, refreshDeeplink, isOutOfStock, isSelected, trackingInfo, action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Variant)) {
                return false;
            }
            Variant variant = (Variant) other;
            return Intrinsics.d(this.variant, variant.variant) && Intrinsics.d(this.refreshDeeplink, variant.refreshDeeplink) && this.isOutOfStock == variant.isOutOfStock && Intrinsics.d(this.isSelected, variant.isSelected) && Intrinsics.d(this.trackingInfo, variant.trackingInfo) && Intrinsics.d(this.action, variant.action);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final String getRefreshDeeplink() {
            return this.refreshDeeplink;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        @NotNull
        public final VariantType getVariant() {
            return this.variant;
        }

        public int hashCode() {
            int a11 = C3532b.a(g.a(this.variant.hashCode() * 31, 31, this.refreshDeeplink), 31, this.isOutOfStock);
            Boolean bool = this.isSelected;
            int hashCode = (a11 + (bool == null ? 0 : bool.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            return hashCode2 + (atomActionDTO != null ? atomActionDTO.hashCode() : 0);
        }

        public final boolean isOutOfStock() {
            return this.isOutOfStock;
        }

        public final Boolean isSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            return "Variant(variant=" + this.variant + ", refreshDeeplink=" + this.refreshDeeplink + ", isOutOfStock=" + this.isOutOfStock + ", isSelected=" + this.isSelected + ", trackingInfo=" + this.trackingInfo + ", action=" + this.action + ")";
        }
    }

    public AspectsV4DTO(@NotNull List<Variant> variants, @NotNull String selectedColor, @NotNull LayoutType layoutType, AspectInfo aspectInfo, MarkdownReason markdownReason, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(variants, "variants");
        Intrinsics.checkNotNullParameter(selectedColor, "selectedColor");
        Intrinsics.checkNotNullParameter(layoutType, "layoutType");
        this.variants = variants;
        this.selectedColor = selectedColor;
        this.layoutType = layoutType;
        this.aspectInfo = aspectInfo;
        this.markdownReason = markdownReason;
        this.trackingInfo = map;
    }

    public static /* synthetic */ AspectsV4DTO copy$default(AspectsV4DTO aspectsV4DTO, List list, String str, LayoutType layoutType, AspectInfo aspectInfo, MarkdownReason markdownReason, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = aspectsV4DTO.variants;
        }
        if ((i11 & 2) != 0) {
            str = aspectsV4DTO.selectedColor;
        }
        if ((i11 & 4) != 0) {
            layoutType = aspectsV4DTO.layoutType;
        }
        if ((i11 & 8) != 0) {
            aspectInfo = aspectsV4DTO.aspectInfo;
        }
        if ((i11 & 16) != 0) {
            markdownReason = aspectsV4DTO.markdownReason;
        }
        if ((i11 & 32) != 0) {
            map = aspectsV4DTO.trackingInfo;
        }
        MarkdownReason markdownReason2 = markdownReason;
        Map map2 = map;
        return aspectsV4DTO.copy(list, str, layoutType, aspectInfo, markdownReason2, map2);
    }

    @NotNull
    public final List<Variant> component1() {
        return this.variants;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSelectedColor() {
        return this.selectedColor;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final LayoutType getLayoutType() {
        return this.layoutType;
    }

    /* renamed from: component4, reason: from getter */
    public final AspectInfo getAspectInfo() {
        return this.aspectInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final MarkdownReason getMarkdownReason() {
        return this.markdownReason;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final AspectsV4DTO copy(@NotNull List<Variant> variants, @NotNull String selectedColor, @NotNull LayoutType layoutType, AspectInfo aspectInfo, MarkdownReason markdownReason, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(variants, "variants");
        Intrinsics.checkNotNullParameter(selectedColor, "selectedColor");
        Intrinsics.checkNotNullParameter(layoutType, "layoutType");
        return new AspectsV4DTO(variants, selectedColor, layoutType, aspectInfo, markdownReason, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AspectsV4DTO)) {
            return false;
        }
        AspectsV4DTO aspectsV4DTO = (AspectsV4DTO) other;
        return Intrinsics.d(this.variants, aspectsV4DTO.variants) && Intrinsics.d(this.selectedColor, aspectsV4DTO.selectedColor) && this.layoutType == aspectsV4DTO.layoutType && Intrinsics.d(this.aspectInfo, aspectsV4DTO.aspectInfo) && Intrinsics.d(this.markdownReason, aspectsV4DTO.markdownReason) && Intrinsics.d(this.trackingInfo, aspectsV4DTO.trackingInfo);
    }

    public final AspectInfo getAspectInfo() {
        return this.aspectInfo;
    }

    @NotNull
    public final LayoutType getLayoutType() {
        return this.layoutType;
    }

    public final MarkdownReason getMarkdownReason() {
        return this.markdownReason;
    }

    @NotNull
    public final String getSelectedColor() {
        return this.selectedColor;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    @NotNull
    public final List<Variant> getVariants() {
        return this.variants;
    }

    public int hashCode() {
        int hashCode = (this.layoutType.hashCode() + g.a(this.variants.hashCode() * 31, 31, this.selectedColor)) * 31;
        AspectInfo aspectInfo = this.aspectInfo;
        int hashCode2 = (hashCode + (aspectInfo == null ? 0 : aspectInfo.hashCode())) * 31;
        MarkdownReason markdownReason = this.markdownReason;
        int hashCode3 = (hashCode2 + (markdownReason == null ? 0 : markdownReason.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<Variant> list = this.variants;
        String str = this.selectedColor;
        LayoutType layoutType = this.layoutType;
        AspectInfo aspectInfo = this.aspectInfo;
        MarkdownReason markdownReason = this.markdownReason;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder a11 = C4055a.a("AspectsV4DTO(variants=", ", selectedColor=", str, ", layoutType=", list);
        a11.append(layoutType);
        a11.append(", aspectInfo=");
        a11.append(aspectInfo);
        a11.append(", markdownReason=");
        a11.append(markdownReason);
        a11.append(", trackingInfo=");
        a11.append(map);
        a11.append(")");
        return a11.toString();
    }
}

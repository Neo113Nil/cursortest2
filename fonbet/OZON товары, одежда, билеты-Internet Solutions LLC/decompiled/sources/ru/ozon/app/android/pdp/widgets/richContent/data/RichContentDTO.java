package ru.ozon.app.android.pdp.widgets.richContent.data;

import B0.C2454a;
import Cm.e;
import Pk0.g;
import T7.P;
import Ul.C4070a;
import Xc.a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.pdp.widgets.textDescription.data.ShortHeightButton;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0081\b\u0018\u0000 !2\u00020\u0001:\u0004!\"#$BE\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JI\u0010\u001a\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006%"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO;", "", "content", "", "Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content;", "shortHeightButton", "Lru/ozon/app/android/pdp/widgets/textDescription/data/ShortHeightButton;", "tabGroupId", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Lru/ozon/app/android/pdp/widgets/textDescription/data/ShortHeightButton;Ljava/lang/String;Ljava/util/Map;)V", "getContent", "()Ljava/util/List;", "getShortHeightButton", "()Lru/ozon/app/android/pdp/widgets/textDescription/data/ShortHeightButton;", "getTabGroupId", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "Content", "AlignedText", "ImagePosition", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class RichContentDTO {

    @Deprecated
    @NotNull
    public static final String ALIGN_CENTER = "center";

    @Deprecated
    @NotNull
    public static final String ALIGN_LEFT = "left";

    @Deprecated
    @NotNull
    public static final String ALIGN_RIGHT = "right";

    @Deprecated
    @NotNull
    public static final String POSITION_FILL = "fill";

    @Deprecated
    @NotNull
    public static final String POSITION_FIT = "fit";

    @Deprecated
    @NotNull
    public static final String TYPE = "type";

    @Deprecated
    @NotNull
    public static final String TYPE_BILLBOARD = "billboard";

    @Deprecated
    @NotNull
    public static final String TYPE_DOUBLE_TILE = "doubleTile";

    @Deprecated
    @NotNull
    public static final String TYPE_LIST_ITEM = "listItem";

    @Deprecated
    @NotNull
    public static final String TYPE_SPACER = "spacer";

    @Deprecated
    @NotNull
    public static final String TYPE_TEXT = "text";

    @NotNull
    private final List<Content> content;
    private final ShortHeightButton shortHeightButton;
    private final String tabGroupId;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$AlignedText;", "", "text", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "align", "Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$AlignedText$Alignment;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$AlignedText$Alignment;)V", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getAlign", "()Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$AlignedText$Alignment;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Alignment", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class AlignedText {
        public static final int $stable = TextAtom.$stable;
        private final Alignment align;

        @NotNull
        private final TextAtom text;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$AlignedText$Alignment;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "LEFT", "RIGHT", "CENTER", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Alignment {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ Alignment[] $VALUES;

            @NotNull
            private final String value;

            @i(name = "left")
            public static final Alignment LEFT = new Alignment("LEFT", 0, "left");

            @i(name = "right")
            public static final Alignment RIGHT = new Alignment("RIGHT", 1, "right");

            @i(name = RichContentDTO.ALIGN_CENTER)
            public static final Alignment CENTER = new Alignment("CENTER", 2, RichContentDTO.ALIGN_CENTER);

            private static final /* synthetic */ Alignment[] $values() {
                return new Alignment[]{LEFT, RIGHT, CENTER};
            }

            static {
                Alignment[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private Alignment(String str, int i11, String str2) {
                this.value = str2;
            }

            public static Alignment valueOf(String str) {
                return (Alignment) Enum.valueOf(Alignment.class, str);
            }

            public static Alignment[] values() {
                return (Alignment[]) $VALUES.clone();
            }
        }

        public AlignedText(@NotNull TextAtom text, Alignment alignment) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.align = alignment;
        }

        public static /* synthetic */ AlignedText copy$default(AlignedText alignedText, TextAtom textAtom, Alignment alignment, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = alignedText.text;
            }
            if ((i11 & 2) != 0) {
                alignment = alignedText.align;
            }
            return alignedText.copy(textAtom, alignment);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final Alignment getAlign() {
            return this.align;
        }

        @NotNull
        public final AlignedText copy(@NotNull TextAtom text, Alignment align) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new AlignedText(text, align);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AlignedText)) {
                return false;
            }
            AlignedText alignedText = (AlignedText) other;
            return Intrinsics.d(this.text, alignedText.text) && this.align == alignedText.align;
        }

        public final Alignment getAlign() {
            return this.align;
        }

        @NotNull
        public final TextAtom getText() {
            return this.text;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            Alignment alignment = this.align;
            return hashCode + (alignment == null ? 0 : alignment.hashCode());
        }

        @NotNull
        public String toString() {
            return "AlignedText(text=" + this.text + ", align=" + this.align + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Companion;", "", "<init>", "()V", "TYPE", "", "TYPE_TEXT", "TYPE_BILLBOARD", "TYPE_DOUBLE_TILE", "TYPE_LIST_ITEM", "TYPE_SPACER", "ALIGN_LEFT", "ALIGN_RIGHT", "ALIGN_CENTER", "POSITION_FILL", "POSITION_FIT", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u000f\u0010\u0011\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0005\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content;", "", "<init>", "()V", "tabGroupId", "", "getTabGroupId", "()Ljava/lang/String;", "isExpanded", "", "()Ljava/lang/Boolean;", "position", "", "getPosition", "()Ljava/lang/Integer;", "TextDTO", "BillboardDTO", "DoubleTileDTO", "ListItemDTO", "SpacerDTO", "Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content$BillboardDTO;", "Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content$DoubleTileDTO;", "Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content$ListItemDTO;", "Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content$SpacerDTO;", "Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content$TextDTO;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Content {
        public static final int $stable = 0;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0019J\t\u0010(\u001a\u00020\tHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010-\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010#J\u0082\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u00020\u00072\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u00020\u0012HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0006\u0010\u0019R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0010\u0010\u0019R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0096\u0004¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#¨\u00065"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content$BillboardDTO;", "Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content;", "image", "", "imagePosition", "Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$ImagePosition;", "isParandja", "", "ratio", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "tabGroupId", "isExpanded", "position", "", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$ImagePosition;Ljava/lang/Boolean;DLru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getImage", "()Ljava/lang/String;", "getImagePosition", "()Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$ImagePosition;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRatio", "()D", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getTabGroupId", "getPosition", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$ImagePosition;Ljava/lang/Boolean;DLru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content$BillboardDTO;", "equals", "other", "", "hashCode", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class BillboardDTO extends Content {
            public static final int $stable = 8;
            private final AtomActionDTO action;

            @NotNull
            private final String image;
            private final ImagePosition imagePosition;
            private final Boolean isExpanded;
            private final Boolean isParandja;
            private final Integer position;
            private final double ratio;
            private final String tabGroupId;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BillboardDTO(@NotNull String image, ImagePosition imagePosition, Boolean bool, double d11, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, String str, Boolean bool2, Integer num) {
                super(null);
                Intrinsics.checkNotNullParameter(image, "image");
                this.image = image;
                this.imagePosition = imagePosition;
                this.isParandja = bool;
                this.ratio = d11;
                this.action = atomActionDTO;
                this.trackingInfo = map;
                this.tabGroupId = str;
                this.isExpanded = bool2;
                this.position = num;
            }

            public static /* synthetic */ BillboardDTO copy$default(BillboardDTO billboardDTO, String str, ImagePosition imagePosition, Boolean bool, double d11, AtomActionDTO atomActionDTO, Map map, String str2, Boolean bool2, Integer num, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = billboardDTO.image;
                }
                if ((i11 & 2) != 0) {
                    imagePosition = billboardDTO.imagePosition;
                }
                if ((i11 & 4) != 0) {
                    bool = billboardDTO.isParandja;
                }
                if ((i11 & 8) != 0) {
                    d11 = billboardDTO.ratio;
                }
                if ((i11 & 16) != 0) {
                    atomActionDTO = billboardDTO.action;
                }
                if ((i11 & 32) != 0) {
                    map = billboardDTO.trackingInfo;
                }
                if ((i11 & 64) != 0) {
                    str2 = billboardDTO.tabGroupId;
                }
                if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    bool2 = billboardDTO.isExpanded;
                }
                if ((i11 & 256) != 0) {
                    num = billboardDTO.position;
                }
                Integer num2 = num;
                String str3 = str2;
                AtomActionDTO atomActionDTO2 = atomActionDTO;
                double d12 = d11;
                Boolean bool3 = bool;
                return billboardDTO.copy(str, imagePosition, bool3, d12, atomActionDTO2, map, str3, bool2, num2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getImage() {
                return this.image;
            }

            /* renamed from: component2, reason: from getter */
            public final ImagePosition getImagePosition() {
                return this.imagePosition;
            }

            /* renamed from: component3, reason: from getter */
            public final Boolean getIsParandja() {
                return this.isParandja;
            }

            /* renamed from: component4, reason: from getter */
            public final double getRatio() {
                return this.ratio;
            }

            /* renamed from: component5, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final Map<String, TokenizedTrackingInfo> component6() {
                return this.trackingInfo;
            }

            /* renamed from: component7, reason: from getter */
            public final String getTabGroupId() {
                return this.tabGroupId;
            }

            /* renamed from: component8, reason: from getter */
            public final Boolean getIsExpanded() {
                return this.isExpanded;
            }

            /* renamed from: component9, reason: from getter */
            public final Integer getPosition() {
                return this.position;
            }

            @NotNull
            public final BillboardDTO copy(@NotNull String image, ImagePosition imagePosition, Boolean isParandja, double ratio, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, String tabGroupId, Boolean isExpanded, Integer position) {
                Intrinsics.checkNotNullParameter(image, "image");
                return new BillboardDTO(image, imagePosition, isParandja, ratio, action, trackingInfo, tabGroupId, isExpanded, position);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BillboardDTO)) {
                    return false;
                }
                BillboardDTO billboardDTO = (BillboardDTO) other;
                return Intrinsics.d(this.image, billboardDTO.image) && this.imagePosition == billboardDTO.imagePosition && Intrinsics.d(this.isParandja, billboardDTO.isParandja) && Double.compare(this.ratio, billboardDTO.ratio) == 0 && Intrinsics.d(this.action, billboardDTO.action) && Intrinsics.d(this.trackingInfo, billboardDTO.trackingInfo) && Intrinsics.d(this.tabGroupId, billboardDTO.tabGroupId) && Intrinsics.d(this.isExpanded, billboardDTO.isExpanded) && Intrinsics.d(this.position, billboardDTO.position);
            }

            public final AtomActionDTO getAction() {
                return this.action;
            }

            @NotNull
            public final String getImage() {
                return this.image;
            }

            public final ImagePosition getImagePosition() {
                return this.imagePosition;
            }

            @Override // ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO.Content
            public Integer getPosition() {
                return this.position;
            }

            public final double getRatio() {
                return this.ratio;
            }

            @Override // ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO.Content
            public String getTabGroupId() {
                return this.tabGroupId;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int hashCode = this.image.hashCode() * 31;
                ImagePosition imagePosition = this.imagePosition;
                int hashCode2 = (hashCode + (imagePosition == null ? 0 : imagePosition.hashCode())) * 31;
                Boolean bool = this.isParandja;
                int a11 = g.a((hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.ratio);
                AtomActionDTO atomActionDTO = this.action;
                int hashCode3 = (a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
                String str = this.tabGroupId;
                int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
                Boolean bool2 = this.isExpanded;
                int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                Integer num = this.position;
                return hashCode6 + (num != null ? num.hashCode() : 0);
            }

            @Override // ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO.Content
            public Boolean isExpanded() {
                return this.isExpanded;
            }

            public final Boolean isParandja() {
                return this.isParandja;
            }

            @NotNull
            public String toString() {
                return "BillboardDTO(image=" + this.image + ", imagePosition=" + this.imagePosition + ", isParandja=" + this.isParandja + ", ratio=" + this.ratio + ", action=" + this.action + ", trackingInfo=" + this.trackingInfo + ", tabGroupId=" + this.tabGroupId + ", isExpanded=" + this.isExpanded + ", position=" + this.position + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001#B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0015JH\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\nHÖ\u0001J\t\u0010\"\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0007\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015¨\u0006$"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content$DoubleTileDTO;", "Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content;", "left", "Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content$DoubleTileDTO$Tile;", "right", "tabGroupId", "", "isExpanded", "", "position", "", "<init>", "(Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content$DoubleTileDTO$Tile;Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content$DoubleTileDTO$Tile;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getLeft", "()Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content$DoubleTileDTO$Tile;", "getRight", "getTabGroupId", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPosition", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content$DoubleTileDTO$Tile;Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content$DoubleTileDTO$Tile;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content$DoubleTileDTO;", "equals", "other", "", "hashCode", "toString", "Tile", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class DoubleTileDTO extends Content {
            public static final int $stable = 8;
            private final Boolean isExpanded;

            @NotNull
            private final Tile left;
            private final Integer position;
            private final Tile right;
            private final String tabGroupId;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0017\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003Jl\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020\u00072\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0006\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006-"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content$DoubleTileDTO$Tile;", "", "image", "", "imagePosition", "Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$ImagePosition;", "isParandja", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$AlignedText;", "text", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$ImagePosition;Ljava/lang/Boolean;Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$AlignedText;Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$AlignedText;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getImage", "()Ljava/lang/String;", "getImagePosition", "()Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$ImagePosition;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTitle", "()Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$AlignedText;", "getText", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$ImagePosition;Ljava/lang/Boolean;Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$AlignedText;Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$AlignedText;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content$DoubleTileDTO$Tile;", "equals", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Tile {
                public static final int $stable = 8;
                private final AtomActionDTO action;

                @NotNull
                private final String image;
                private final ImagePosition imagePosition;
                private final Boolean isParandja;
                private final AlignedText text;
                private final AlignedText title;
                private final Map<String, TokenizedTrackingInfo> trackingInfo;

                public Tile(@NotNull String image, ImagePosition imagePosition, Boolean bool, AlignedText alignedText, AlignedText alignedText2, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
                    Intrinsics.checkNotNullParameter(image, "image");
                    this.image = image;
                    this.imagePosition = imagePosition;
                    this.isParandja = bool;
                    this.title = alignedText;
                    this.text = alignedText2;
                    this.action = atomActionDTO;
                    this.trackingInfo = map;
                }

                public static /* synthetic */ Tile copy$default(Tile tile, String str, ImagePosition imagePosition, Boolean bool, AlignedText alignedText, AlignedText alignedText2, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = tile.image;
                    }
                    if ((i11 & 2) != 0) {
                        imagePosition = tile.imagePosition;
                    }
                    if ((i11 & 4) != 0) {
                        bool = tile.isParandja;
                    }
                    if ((i11 & 8) != 0) {
                        alignedText = tile.title;
                    }
                    if ((i11 & 16) != 0) {
                        alignedText2 = tile.text;
                    }
                    if ((i11 & 32) != 0) {
                        atomActionDTO = tile.action;
                    }
                    if ((i11 & 64) != 0) {
                        map = tile.trackingInfo;
                    }
                    AtomActionDTO atomActionDTO2 = atomActionDTO;
                    Map map2 = map;
                    AlignedText alignedText3 = alignedText2;
                    Boolean bool2 = bool;
                    return tile.copy(str, imagePosition, bool2, alignedText, alignedText3, atomActionDTO2, map2);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final String getImage() {
                    return this.image;
                }

                /* renamed from: component2, reason: from getter */
                public final ImagePosition getImagePosition() {
                    return this.imagePosition;
                }

                /* renamed from: component3, reason: from getter */
                public final Boolean getIsParandja() {
                    return this.isParandja;
                }

                /* renamed from: component4, reason: from getter */
                public final AlignedText getTitle() {
                    return this.title;
                }

                /* renamed from: component5, reason: from getter */
                public final AlignedText getText() {
                    return this.text;
                }

                /* renamed from: component6, reason: from getter */
                public final AtomActionDTO getAction() {
                    return this.action;
                }

                public final Map<String, TokenizedTrackingInfo> component7() {
                    return this.trackingInfo;
                }

                @NotNull
                public final Tile copy(@NotNull String image, ImagePosition imagePosition, Boolean isParandja, AlignedText title, AlignedText text, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
                    Intrinsics.checkNotNullParameter(image, "image");
                    return new Tile(image, imagePosition, isParandja, title, text, action, trackingInfo);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Tile)) {
                        return false;
                    }
                    Tile tile = (Tile) other;
                    return Intrinsics.d(this.image, tile.image) && this.imagePosition == tile.imagePosition && Intrinsics.d(this.isParandja, tile.isParandja) && Intrinsics.d(this.title, tile.title) && Intrinsics.d(this.text, tile.text) && Intrinsics.d(this.action, tile.action) && Intrinsics.d(this.trackingInfo, tile.trackingInfo);
                }

                public final AtomActionDTO getAction() {
                    return this.action;
                }

                @NotNull
                public final String getImage() {
                    return this.image;
                }

                public final ImagePosition getImagePosition() {
                    return this.imagePosition;
                }

                public final AlignedText getText() {
                    return this.text;
                }

                public final AlignedText getTitle() {
                    return this.title;
                }

                public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                    return this.trackingInfo;
                }

                public int hashCode() {
                    int hashCode = this.image.hashCode() * 31;
                    ImagePosition imagePosition = this.imagePosition;
                    int hashCode2 = (hashCode + (imagePosition == null ? 0 : imagePosition.hashCode())) * 31;
                    Boolean bool = this.isParandja;
                    int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
                    AlignedText alignedText = this.title;
                    int hashCode4 = (hashCode3 + (alignedText == null ? 0 : alignedText.hashCode())) * 31;
                    AlignedText alignedText2 = this.text;
                    int hashCode5 = (hashCode4 + (alignedText2 == null ? 0 : alignedText2.hashCode())) * 31;
                    AtomActionDTO atomActionDTO = this.action;
                    int hashCode6 = (hashCode5 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
                    Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                    return hashCode6 + (map != null ? map.hashCode() : 0);
                }

                public final Boolean isParandja() {
                    return this.isParandja;
                }

                @NotNull
                public String toString() {
                    String str = this.image;
                    ImagePosition imagePosition = this.imagePosition;
                    Boolean bool = this.isParandja;
                    AlignedText alignedText = this.title;
                    AlignedText alignedText2 = this.text;
                    AtomActionDTO atomActionDTO = this.action;
                    Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                    StringBuilder sb2 = new StringBuilder("Tile(image=");
                    sb2.append(str);
                    sb2.append(", imagePosition=");
                    sb2.append(imagePosition);
                    sb2.append(", isParandja=");
                    sb2.append(bool);
                    sb2.append(", title=");
                    sb2.append(alignedText);
                    sb2.append(", text=");
                    sb2.append(alignedText2);
                    sb2.append(", action=");
                    sb2.append(atomActionDTO);
                    sb2.append(", trackingInfo=");
                    return P.f(sb2, map, ")");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DoubleTileDTO(@NotNull Tile left, Tile tile, String str, Boolean bool, Integer num) {
                super(null);
                Intrinsics.checkNotNullParameter(left, "left");
                this.left = left;
                this.right = tile;
                this.tabGroupId = str;
                this.isExpanded = bool;
                this.position = num;
            }

            public static /* synthetic */ DoubleTileDTO copy$default(DoubleTileDTO doubleTileDTO, Tile tile, Tile tile2, String str, Boolean bool, Integer num, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    tile = doubleTileDTO.left;
                }
                if ((i11 & 2) != 0) {
                    tile2 = doubleTileDTO.right;
                }
                if ((i11 & 4) != 0) {
                    str = doubleTileDTO.tabGroupId;
                }
                if ((i11 & 8) != 0) {
                    bool = doubleTileDTO.isExpanded;
                }
                if ((i11 & 16) != 0) {
                    num = doubleTileDTO.position;
                }
                Integer num2 = num;
                String str2 = str;
                return doubleTileDTO.copy(tile, tile2, str2, bool, num2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final Tile getLeft() {
                return this.left;
            }

            /* renamed from: component2, reason: from getter */
            public final Tile getRight() {
                return this.right;
            }

            /* renamed from: component3, reason: from getter */
            public final String getTabGroupId() {
                return this.tabGroupId;
            }

            /* renamed from: component4, reason: from getter */
            public final Boolean getIsExpanded() {
                return this.isExpanded;
            }

            /* renamed from: component5, reason: from getter */
            public final Integer getPosition() {
                return this.position;
            }

            @NotNull
            public final DoubleTileDTO copy(@NotNull Tile left, Tile right, String tabGroupId, Boolean isExpanded, Integer position) {
                Intrinsics.checkNotNullParameter(left, "left");
                return new DoubleTileDTO(left, right, tabGroupId, isExpanded, position);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DoubleTileDTO)) {
                    return false;
                }
                DoubleTileDTO doubleTileDTO = (DoubleTileDTO) other;
                return Intrinsics.d(this.left, doubleTileDTO.left) && Intrinsics.d(this.right, doubleTileDTO.right) && Intrinsics.d(this.tabGroupId, doubleTileDTO.tabGroupId) && Intrinsics.d(this.isExpanded, doubleTileDTO.isExpanded) && Intrinsics.d(this.position, doubleTileDTO.position);
            }

            @NotNull
            public final Tile getLeft() {
                return this.left;
            }

            @Override // ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO.Content
            public Integer getPosition() {
                return this.position;
            }

            public final Tile getRight() {
                return this.right;
            }

            @Override // ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO.Content
            public String getTabGroupId() {
                return this.tabGroupId;
            }

            public int hashCode() {
                int hashCode = this.left.hashCode() * 31;
                Tile tile = this.right;
                int hashCode2 = (hashCode + (tile == null ? 0 : tile.hashCode())) * 31;
                String str = this.tabGroupId;
                int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                Boolean bool = this.isExpanded;
                int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
                Integer num = this.position;
                return hashCode4 + (num != null ? num.hashCode() : 0);
            }

            @Override // ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO.Content
            public Boolean isExpanded() {
                return this.isExpanded;
            }

            @NotNull
            public String toString() {
                Tile tile = this.left;
                Tile tile2 = this.right;
                String str = this.tabGroupId;
                Boolean bool = this.isExpanded;
                Integer num = this.position;
                StringBuilder sb2 = new StringBuilder("DoubleTileDTO(left=");
                sb2.append(tile);
                sb2.append(", right=");
                sb2.append(tile2);
                sb2.append(", tabGroupId=");
                Sh.a.d(bool, str, ", isExpanded=", ", position=", sb2);
                return Ep.a.c(sb2, num, ")");
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001cJz\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020\b2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020\fHÖ\u0001J\t\u0010/\u001a\u00020\nHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0007\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\r\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u000e\u0010\u0017R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001f\u0010\u001c¨\u00060"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content$ListItemDTO;", "Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$AlignedText;", "text", "imagePosition", "Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$ImagePosition;", "isParandja", "", "image", "", "number", "", "tabGroupId", "isExpanded", "position", "<init>", "(Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$AlignedText;Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$AlignedText;Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$ImagePosition;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getTitle", "()Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$AlignedText;", "getText", "getImagePosition", "()Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$ImagePosition;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getImage", "()Ljava/lang/String;", "getNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTabGroupId", "getPosition", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$AlignedText;Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$AlignedText;Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$ImagePosition;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content$ListItemDTO;", "equals", "other", "", "hashCode", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ListItemDTO extends Content {
            public static final int $stable = TextAtom.$stable;
            private final String image;
            private final ImagePosition imagePosition;
            private final Boolean isExpanded;
            private final Boolean isParandja;
            private final Integer number;
            private final Integer position;
            private final String tabGroupId;
            private final AlignedText text;
            private final AlignedText title;

            public ListItemDTO(AlignedText alignedText, AlignedText alignedText2, ImagePosition imagePosition, Boolean bool, String str, Integer num, String str2, Boolean bool2, Integer num2) {
                super(null);
                this.title = alignedText;
                this.text = alignedText2;
                this.imagePosition = imagePosition;
                this.isParandja = bool;
                this.image = str;
                this.number = num;
                this.tabGroupId = str2;
                this.isExpanded = bool2;
                this.position = num2;
            }

            public static /* synthetic */ ListItemDTO copy$default(ListItemDTO listItemDTO, AlignedText alignedText, AlignedText alignedText2, ImagePosition imagePosition, Boolean bool, String str, Integer num, String str2, Boolean bool2, Integer num2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    alignedText = listItemDTO.title;
                }
                if ((i11 & 2) != 0) {
                    alignedText2 = listItemDTO.text;
                }
                if ((i11 & 4) != 0) {
                    imagePosition = listItemDTO.imagePosition;
                }
                if ((i11 & 8) != 0) {
                    bool = listItemDTO.isParandja;
                }
                if ((i11 & 16) != 0) {
                    str = listItemDTO.image;
                }
                if ((i11 & 32) != 0) {
                    num = listItemDTO.number;
                }
                if ((i11 & 64) != 0) {
                    str2 = listItemDTO.tabGroupId;
                }
                if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    bool2 = listItemDTO.isExpanded;
                }
                if ((i11 & 256) != 0) {
                    num2 = listItemDTO.position;
                }
                Boolean bool3 = bool2;
                Integer num3 = num2;
                Integer num4 = num;
                String str3 = str2;
                String str4 = str;
                ImagePosition imagePosition2 = imagePosition;
                return listItemDTO.copy(alignedText, alignedText2, imagePosition2, bool, str4, num4, str3, bool3, num3);
            }

            /* renamed from: component1, reason: from getter */
            public final AlignedText getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final AlignedText getText() {
                return this.text;
            }

            /* renamed from: component3, reason: from getter */
            public final ImagePosition getImagePosition() {
                return this.imagePosition;
            }

            /* renamed from: component4, reason: from getter */
            public final Boolean getIsParandja() {
                return this.isParandja;
            }

            /* renamed from: component5, reason: from getter */
            public final String getImage() {
                return this.image;
            }

            /* renamed from: component6, reason: from getter */
            public final Integer getNumber() {
                return this.number;
            }

            /* renamed from: component7, reason: from getter */
            public final String getTabGroupId() {
                return this.tabGroupId;
            }

            /* renamed from: component8, reason: from getter */
            public final Boolean getIsExpanded() {
                return this.isExpanded;
            }

            /* renamed from: component9, reason: from getter */
            public final Integer getPosition() {
                return this.position;
            }

            @NotNull
            public final ListItemDTO copy(AlignedText title, AlignedText text, ImagePosition imagePosition, Boolean isParandja, String image, Integer number, String tabGroupId, Boolean isExpanded, Integer position) {
                return new ListItemDTO(title, text, imagePosition, isParandja, image, number, tabGroupId, isExpanded, position);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ListItemDTO)) {
                    return false;
                }
                ListItemDTO listItemDTO = (ListItemDTO) other;
                return Intrinsics.d(this.title, listItemDTO.title) && Intrinsics.d(this.text, listItemDTO.text) && this.imagePosition == listItemDTO.imagePosition && Intrinsics.d(this.isParandja, listItemDTO.isParandja) && Intrinsics.d(this.image, listItemDTO.image) && Intrinsics.d(this.number, listItemDTO.number) && Intrinsics.d(this.tabGroupId, listItemDTO.tabGroupId) && Intrinsics.d(this.isExpanded, listItemDTO.isExpanded) && Intrinsics.d(this.position, listItemDTO.position);
            }

            public final String getImage() {
                return this.image;
            }

            public final ImagePosition getImagePosition() {
                return this.imagePosition;
            }

            public final Integer getNumber() {
                return this.number;
            }

            @Override // ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO.Content
            public Integer getPosition() {
                return this.position;
            }

            @Override // ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO.Content
            public String getTabGroupId() {
                return this.tabGroupId;
            }

            public final AlignedText getText() {
                return this.text;
            }

            public final AlignedText getTitle() {
                return this.title;
            }

            public int hashCode() {
                AlignedText alignedText = this.title;
                int hashCode = (alignedText == null ? 0 : alignedText.hashCode()) * 31;
                AlignedText alignedText2 = this.text;
                int hashCode2 = (hashCode + (alignedText2 == null ? 0 : alignedText2.hashCode())) * 31;
                ImagePosition imagePosition = this.imagePosition;
                int hashCode3 = (hashCode2 + (imagePosition == null ? 0 : imagePosition.hashCode())) * 31;
                Boolean bool = this.isParandja;
                int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
                String str = this.image;
                int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
                Integer num = this.number;
                int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
                String str2 = this.tabGroupId;
                int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Boolean bool2 = this.isExpanded;
                int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                Integer num2 = this.position;
                return hashCode8 + (num2 != null ? num2.hashCode() : 0);
            }

            @Override // ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO.Content
            public Boolean isExpanded() {
                return this.isExpanded;
            }

            public final Boolean isParandja() {
                return this.isParandja;
            }

            @NotNull
            public String toString() {
                AlignedText alignedText = this.title;
                AlignedText alignedText2 = this.text;
                ImagePosition imagePosition = this.imagePosition;
                Boolean bool = this.isParandja;
                String str = this.image;
                Integer num = this.number;
                String str2 = this.tabGroupId;
                Boolean bool2 = this.isExpanded;
                Integer num2 = this.position;
                StringBuilder sb2 = new StringBuilder("ListItemDTO(title=");
                sb2.append(alignedText);
                sb2.append(", text=");
                sb2.append(alignedText2);
                sb2.append(", imagePosition=");
                sb2.append(imagePosition);
                sb2.append(", isParandja=");
                sb2.append(bool);
                sb2.append(", image=");
                C2454a.f(num, str, ", number=", ", tabGroupId=", sb2);
                Sh.a.d(bool2, str2, ", isExpanded=", ", position=", sb2);
                return Ep.a.c(sb2, num2, ")");
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014JH\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0007\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content$SpacerDTO;", "Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content;", "height", "", "backgroundColor", "", "tabGroupId", "isExpanded", "", "position", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getHeight", "()I", "getBackgroundColor", "()Ljava/lang/String;", "getTabGroupId", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPosition", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content$SpacerDTO;", "equals", "other", "", "hashCode", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SpacerDTO extends Content {
            public static final int $stable = 0;
            private final String backgroundColor;
            private final int height;
            private final Boolean isExpanded;
            private final Integer position;
            private final String tabGroupId;

            public SpacerDTO(int i11, String str, String str2, Boolean bool, Integer num) {
                super(null);
                this.height = i11;
                this.backgroundColor = str;
                this.tabGroupId = str2;
                this.isExpanded = bool;
                this.position = num;
            }

            public static /* synthetic */ SpacerDTO copy$default(SpacerDTO spacerDTO, int i11, String str, String str2, Boolean bool, Integer num, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    i11 = spacerDTO.height;
                }
                if ((i12 & 2) != 0) {
                    str = spacerDTO.backgroundColor;
                }
                if ((i12 & 4) != 0) {
                    str2 = spacerDTO.tabGroupId;
                }
                if ((i12 & 8) != 0) {
                    bool = spacerDTO.isExpanded;
                }
                if ((i12 & 16) != 0) {
                    num = spacerDTO.position;
                }
                Integer num2 = num;
                String str3 = str2;
                return spacerDTO.copy(i11, str, str3, bool, num2);
            }

            /* renamed from: component1, reason: from getter */
            public final int getHeight() {
                return this.height;
            }

            /* renamed from: component2, reason: from getter */
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            /* renamed from: component3, reason: from getter */
            public final String getTabGroupId() {
                return this.tabGroupId;
            }

            /* renamed from: component4, reason: from getter */
            public final Boolean getIsExpanded() {
                return this.isExpanded;
            }

            /* renamed from: component5, reason: from getter */
            public final Integer getPosition() {
                return this.position;
            }

            @NotNull
            public final SpacerDTO copy(int height, String backgroundColor, String tabGroupId, Boolean isExpanded, Integer position) {
                return new SpacerDTO(height, backgroundColor, tabGroupId, isExpanded, position);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SpacerDTO)) {
                    return false;
                }
                SpacerDTO spacerDTO = (SpacerDTO) other;
                return this.height == spacerDTO.height && Intrinsics.d(this.backgroundColor, spacerDTO.backgroundColor) && Intrinsics.d(this.tabGroupId, spacerDTO.tabGroupId) && Intrinsics.d(this.isExpanded, spacerDTO.isExpanded) && Intrinsics.d(this.position, spacerDTO.position);
            }

            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            public final int getHeight() {
                return this.height;
            }

            @Override // ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO.Content
            public Integer getPosition() {
                return this.position;
            }

            @Override // ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO.Content
            public String getTabGroupId() {
                return this.tabGroupId;
            }

            public int hashCode() {
                int hashCode = Integer.hashCode(this.height) * 31;
                String str = this.backgroundColor;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.tabGroupId;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Boolean bool = this.isExpanded;
                int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
                Integer num = this.position;
                return hashCode4 + (num != null ? num.hashCode() : 0);
            }

            @Override // ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO.Content
            public Boolean isExpanded() {
                return this.isExpanded;
            }

            @NotNull
            public String toString() {
                int i11 = this.height;
                String str = this.backgroundColor;
                String str2 = this.tabGroupId;
                Boolean bool = this.isExpanded;
                Integer num = this.position;
                StringBuilder g10 = e.g(i11, "SpacerDTO(height=", ", backgroundColor=", str, ", tabGroupId=");
                Sh.a.d(bool, str2, ", isExpanded=", ", position=", g10);
                return Ep.a.c(g10, num, ")");
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0015JH\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\nHÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0007\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content$TextDTO;", "Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content;", "text", "Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$AlignedText;", "backgroundColor", "", "tabGroupId", "isExpanded", "", "position", "", "<init>", "(Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$AlignedText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getText", "()Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$AlignedText;", "getBackgroundColor", "()Ljava/lang/String;", "getTabGroupId", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPosition", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$AlignedText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content$TextDTO;", "equals", "other", "", "hashCode", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TextDTO extends Content {
            public static final int $stable = TextAtom.$stable;
            private final String backgroundColor;
            private final Boolean isExpanded;
            private final Integer position;
            private final String tabGroupId;

            @NotNull
            private final AlignedText text;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TextDTO(@NotNull AlignedText text, String str, String str2, Boolean bool, Integer num) {
                super(null);
                Intrinsics.checkNotNullParameter(text, "text");
                this.text = text;
                this.backgroundColor = str;
                this.tabGroupId = str2;
                this.isExpanded = bool;
                this.position = num;
            }

            public static /* synthetic */ TextDTO copy$default(TextDTO textDTO, AlignedText alignedText, String str, String str2, Boolean bool, Integer num, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    alignedText = textDTO.text;
                }
                if ((i11 & 2) != 0) {
                    str = textDTO.backgroundColor;
                }
                if ((i11 & 4) != 0) {
                    str2 = textDTO.tabGroupId;
                }
                if ((i11 & 8) != 0) {
                    bool = textDTO.isExpanded;
                }
                if ((i11 & 16) != 0) {
                    num = textDTO.position;
                }
                Integer num2 = num;
                String str3 = str2;
                return textDTO.copy(alignedText, str, str3, bool, num2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final AlignedText getText() {
                return this.text;
            }

            /* renamed from: component2, reason: from getter */
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            /* renamed from: component3, reason: from getter */
            public final String getTabGroupId() {
                return this.tabGroupId;
            }

            /* renamed from: component4, reason: from getter */
            public final Boolean getIsExpanded() {
                return this.isExpanded;
            }

            /* renamed from: component5, reason: from getter */
            public final Integer getPosition() {
                return this.position;
            }

            @NotNull
            public final TextDTO copy(@NotNull AlignedText text, String backgroundColor, String tabGroupId, Boolean isExpanded, Integer position) {
                Intrinsics.checkNotNullParameter(text, "text");
                return new TextDTO(text, backgroundColor, tabGroupId, isExpanded, position);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TextDTO)) {
                    return false;
                }
                TextDTO textDTO = (TextDTO) other;
                return Intrinsics.d(this.text, textDTO.text) && Intrinsics.d(this.backgroundColor, textDTO.backgroundColor) && Intrinsics.d(this.tabGroupId, textDTO.tabGroupId) && Intrinsics.d(this.isExpanded, textDTO.isExpanded) && Intrinsics.d(this.position, textDTO.position);
            }

            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            @Override // ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO.Content
            public Integer getPosition() {
                return this.position;
            }

            @Override // ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO.Content
            public String getTabGroupId() {
                return this.tabGroupId;
            }

            @NotNull
            public final AlignedText getText() {
                return this.text;
            }

            public int hashCode() {
                int hashCode = this.text.hashCode() * 31;
                String str = this.backgroundColor;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.tabGroupId;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Boolean bool = this.isExpanded;
                int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
                Integer num = this.position;
                return hashCode4 + (num != null ? num.hashCode() : 0);
            }

            @Override // ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO.Content
            public Boolean isExpanded() {
                return this.isExpanded;
            }

            @NotNull
            public String toString() {
                AlignedText alignedText = this.text;
                String str = this.backgroundColor;
                String str2 = this.tabGroupId;
                Boolean bool = this.isExpanded;
                Integer num = this.position;
                StringBuilder sb2 = new StringBuilder("TextDTO(text=");
                sb2.append(alignedText);
                sb2.append(", backgroundColor=");
                sb2.append(str);
                sb2.append(", tabGroupId=");
                Sh.a.d(bool, str2, ", isExpanded=", ", position=", sb2);
                return Ep.a.c(sb2, num, ")");
            }
        }

        public /* synthetic */ Content(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract Integer getPosition();

        public abstract String getTabGroupId();

        public abstract Boolean isExpanded();

        private Content() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$ImagePosition;", "", "<init>", "(Ljava/lang/String;I)V", "FILL", "FIT", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ImagePosition {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ImagePosition[] $VALUES;

        @i(name = RichContentDTO.POSITION_FILL)
        public static final ImagePosition FILL = new ImagePosition("FILL", 0);

        @i(name = RichContentDTO.POSITION_FIT)
        public static final ImagePosition FIT = new ImagePosition("FIT", 1);

        private static final /* synthetic */ ImagePosition[] $values() {
            return new ImagePosition[]{FILL, FIT};
        }

        static {
            ImagePosition[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ImagePosition(String str, int i11) {
        }

        public static ImagePosition valueOf(String str) {
            return (ImagePosition) Enum.valueOf(ImagePosition.class, str);
        }

        public static ImagePosition[] values() {
            return (ImagePosition[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RichContentDTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "text", type = Content.TextDTO.class), @ProtoOneOfSignature(name = "billboard", type = Content.BillboardDTO.class), @ProtoOneOfSignature(name = "doubleTile", type = Content.DoubleTileDTO.class), @ProtoOneOfSignature(name = "listItem", type = Content.ListItemDTO.class), @ProtoOneOfSignature(name = "spacer", type = Content.SpacerDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Content> content, ShortHeightButton shortHeightButton, String str, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.content = content;
        this.shortHeightButton = shortHeightButton;
        this.tabGroupId = str;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RichContentDTO copy$default(RichContentDTO richContentDTO, List list, ShortHeightButton shortHeightButton, String str, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = richContentDTO.content;
        }
        if ((i11 & 2) != 0) {
            shortHeightButton = richContentDTO.shortHeightButton;
        }
        if ((i11 & 4) != 0) {
            str = richContentDTO.tabGroupId;
        }
        if ((i11 & 8) != 0) {
            map = richContentDTO.trackingInfo;
        }
        return richContentDTO.copy(list, shortHeightButton, str, map);
    }

    @NotNull
    public final List<Content> component1() {
        return this.content;
    }

    /* renamed from: component2, reason: from getter */
    public final ShortHeightButton getShortHeightButton() {
        return this.shortHeightButton;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTabGroupId() {
        return this.tabGroupId;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final RichContentDTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "text", type = Content.TextDTO.class), @ProtoOneOfSignature(name = "billboard", type = Content.BillboardDTO.class), @ProtoOneOfSignature(name = "doubleTile", type = Content.DoubleTileDTO.class), @ProtoOneOfSignature(name = "listItem", type = Content.ListItemDTO.class), @ProtoOneOfSignature(name = "spacer", type = Content.SpacerDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Content> content, ShortHeightButton shortHeightButton, String tabGroupId, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(content, "content");
        return new RichContentDTO(content, shortHeightButton, tabGroupId, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RichContentDTO)) {
            return false;
        }
        RichContentDTO richContentDTO = (RichContentDTO) other;
        return Intrinsics.d(this.content, richContentDTO.content) && Intrinsics.d(this.shortHeightButton, richContentDTO.shortHeightButton) && Intrinsics.d(this.tabGroupId, richContentDTO.tabGroupId) && Intrinsics.d(this.trackingInfo, richContentDTO.trackingInfo);
    }

    @NotNull
    public final List<Content> getContent() {
        return this.content;
    }

    public final ShortHeightButton getShortHeightButton() {
        return this.shortHeightButton;
    }

    public final String getTabGroupId() {
        return this.tabGroupId;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.content.hashCode() * 31;
        ShortHeightButton shortHeightButton = this.shortHeightButton;
        int hashCode2 = (hashCode + (shortHeightButton == null ? 0 : shortHeightButton.hashCode())) * 31;
        String str = this.tabGroupId;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<Content> list = this.content;
        ShortHeightButton shortHeightButton = this.shortHeightButton;
        String str = this.tabGroupId;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("RichContentDTO(content=");
        sb2.append(list);
        sb2.append(", shortHeightButton=");
        sb2.append(shortHeightButton);
        sb2.append(", tabGroupId=");
        return C4070a.a(sb2, str, ", trackingInfo=", map, ")");
    }

    public /* synthetic */ RichContentDTO(List list, ShortHeightButton shortHeightButton, String str, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, shortHeightButton, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : map);
    }
}

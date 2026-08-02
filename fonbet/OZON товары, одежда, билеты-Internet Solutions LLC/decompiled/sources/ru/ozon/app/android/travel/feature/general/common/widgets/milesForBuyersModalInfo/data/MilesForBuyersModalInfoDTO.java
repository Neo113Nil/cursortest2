package ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyersModalInfo.data;

import B3.p;
import C.o0;
import F3.G;
import G.g;
import T7.E;
import T7.P;
import T7.Z;
import Xc.a;
import Xc.b;
import com.squareup.moshi.j;
import ed.InterfaceC6346b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.progress.ProgressBar;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001:\u0007%&'()*+BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0003JQ\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoDTO;", "", "headerContainer", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoDTO$ContentContainerDTO;", "image", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoDTO$HeaderImageDTO;", "bodyContainer", "stickyButtons", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoDTO$ButtonWrapper;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoDTO$ContentContainerDTO;Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoDTO$HeaderImageDTO;Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoDTO$ContentContainerDTO;Ljava/util/List;Ljava/util/Map;)V", "getHeaderContainer", "()Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoDTO$ContentContainerDTO;", "getImage", "()Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoDTO$HeaderImageDTO;", "getBodyContainer", "getStickyButtons", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "ContentContainerDTO", "ProgressDTO", "SeparatorDTO", "PaddingsDTO", "HeaderImageDTO", "ImagePosition", "ButtonWrapper", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MilesForBuyersModalInfoDTO {
    public static final int $stable = 8;

    @NotNull
    private final ContentContainerDTO bodyContainer;

    @NotNull
    private final ContentContainerDTO headerContainer;
    private final HeaderImageDTO image;

    @NotNull
    private final List<ButtonWrapper> stickyButtons;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @InterfaceC6346b
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoDTO$ButtonWrapper;", "", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "constructor-impl", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "equals", "", "other", "equals-impl", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)I", "toString", "", "toString-impl", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)Ljava/lang/String;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final class ButtonWrapper {

        @NotNull
        private final ButtonV3DTO button;

        private /* synthetic */ ButtonWrapper(ButtonV3DTO buttonV3DTO) {
            this.button = buttonV3DTO;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ ButtonWrapper m1240boximpl(ButtonV3DTO buttonV3DTO) {
            return new ButtonWrapper(buttonV3DTO);
        }

        @NotNull
        /* renamed from: constructor-impl, reason: not valid java name */
        public static ButtonV3DTO m1241constructorimpl(@NotNull ButtonV3DTO button) {
            Intrinsics.checkNotNullParameter(button, "button");
            return button;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m1242equalsimpl(ButtonV3DTO buttonV3DTO, Object obj) {
            return (obj instanceof ButtonWrapper) && Intrinsics.d(buttonV3DTO, ((ButtonWrapper) obj).m1246unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m1243equalsimpl0(ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2) {
            return Intrinsics.d(buttonV3DTO, buttonV3DTO2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m1244hashCodeimpl(ButtonV3DTO buttonV3DTO) {
            return buttonV3DTO.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m1245toStringimpl(ButtonV3DTO buttonV3DTO) {
            return G.b(buttonV3DTO, "ButtonWrapper(button=", ")");
        }

        public boolean equals(Object obj) {
            return m1242equalsimpl(this.button, obj);
        }

        @NotNull
        public final ButtonV3DTO getButton() {
            return this.button;
        }

        public int hashCode() {
            return m1244hashCodeimpl(this.button);
        }

        public String toString() {
            return m1245toStringimpl(this.button);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ ButtonV3DTO m1246unboximpl() {
            return this.button;
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoDTO$ContentContainerDTO;", "", "items", "", "paddings", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoDTO$PaddingsDTO;", "backgroundColor", "", "<init>", "(Ljava/util/List;Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoDTO$PaddingsDTO;Ljava/lang/String;)V", "getItems", "()Ljava/util/List;", "getPaddings", "()Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoDTO$PaddingsDTO;", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ContentContainerDTO {
        public static final int $stable = 8;
        private final String backgroundColor;

        @NotNull
        private final List<Object> items;
        private final PaddingsDTO paddings;

        public ContentContainerDTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "text", type = TextDTO.class), @ProtoOneOfSignature(name = "icon", type = IconDTO.class), @ProtoOneOfSignature(name = "progress", type = ProgressDTO.class), @ProtoOneOfSignature(name = "separator", type = SeparatorDTO.class), @ProtoOneOfSignature(name = "cell", type = CellDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> items, PaddingsDTO paddingsDTO, String str) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.items = items;
            this.paddings = paddingsDTO;
            this.backgroundColor = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ContentContainerDTO copy$default(ContentContainerDTO contentContainerDTO, List list, PaddingsDTO paddingsDTO, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = contentContainerDTO.items;
            }
            if ((i11 & 2) != 0) {
                paddingsDTO = contentContainerDTO.paddings;
            }
            if ((i11 & 4) != 0) {
                str = contentContainerDTO.backgroundColor;
            }
            return contentContainerDTO.copy(list, paddingsDTO, str);
        }

        @NotNull
        public final List<Object> component1() {
            return this.items;
        }

        /* renamed from: component2, reason: from getter */
        public final PaddingsDTO getPaddings() {
            return this.paddings;
        }

        /* renamed from: component3, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final ContentContainerDTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "text", type = TextDTO.class), @ProtoOneOfSignature(name = "icon", type = IconDTO.class), @ProtoOneOfSignature(name = "progress", type = ProgressDTO.class), @ProtoOneOfSignature(name = "separator", type = SeparatorDTO.class), @ProtoOneOfSignature(name = "cell", type = CellDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> items, PaddingsDTO paddings, String backgroundColor) {
            Intrinsics.checkNotNullParameter(items, "items");
            return new ContentContainerDTO(items, paddings, backgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContentContainerDTO)) {
                return false;
            }
            ContentContainerDTO contentContainerDTO = (ContentContainerDTO) other;
            return Intrinsics.d(this.items, contentContainerDTO.items) && Intrinsics.d(this.paddings, contentContainerDTO.paddings) && Intrinsics.d(this.backgroundColor, contentContainerDTO.backgroundColor);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final List<Object> getItems() {
            return this.items;
        }

        public final PaddingsDTO getPaddings() {
            return this.paddings;
        }

        public int hashCode() {
            int hashCode = this.items.hashCode() * 31;
            PaddingsDTO paddingsDTO = this.paddings;
            int hashCode2 = (hashCode + (paddingsDTO == null ? 0 : paddingsDTO.hashCode())) * 31;
            String str = this.backgroundColor;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            List<Object> list = this.items;
            PaddingsDTO paddingsDTO = this.paddings;
            String str = this.backgroundColor;
            StringBuilder sb2 = new StringBuilder("ContentContainerDTO(items=");
            sb2.append(list);
            sb2.append(", paddings=");
            sb2.append(paddingsDTO);
            sb2.append(", backgroundColor=");
            return o0.c(sb2, str, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoDTO$ImagePosition;", "", "<init>", "(Ljava/lang/String;I)V", "BACKGROUND", "FOREGROUND", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ImagePosition {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ImagePosition[] $VALUES;
        public static final ImagePosition BACKGROUND = new ImagePosition("BACKGROUND", 0);
        public static final ImagePosition FOREGROUND = new ImagePosition("FOREGROUND", 1);

        private static final /* synthetic */ ImagePosition[] $values() {
            return new ImagePosition[]{BACKGROUND, FOREGROUND};
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

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoDTO$PaddingsDTO;", "", "leading", "Lru/ozon/uni/atoms/data/common/Paddings;", "top", "trailing", "bottom", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getLeading", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getTop", "getTrailing", "getBottom", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaddingsDTO {
        public static final int $stable = 0;

        @EnumNullFallback
        @NotNull
        private final Paddings bottom;

        @EnumNullFallback
        @NotNull
        private final Paddings leading;

        @EnumNullFallback
        @NotNull
        private final Paddings top;

        @EnumNullFallback
        @NotNull
        private final Paddings trailing;

        public PaddingsDTO() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ PaddingsDTO copy$default(PaddingsDTO paddingsDTO, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = paddingsDTO.leading;
            }
            if ((i11 & 2) != 0) {
                paddings2 = paddingsDTO.top;
            }
            if ((i11 & 4) != 0) {
                paddings3 = paddingsDTO.trailing;
            }
            if ((i11 & 8) != 0) {
                paddings4 = paddingsDTO.bottom;
            }
            return paddingsDTO.copy(paddings, paddings2, paddings3, paddings4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Paddings getLeading() {
            return this.leading;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Paddings getTop() {
            return this.top;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Paddings getTrailing() {
            return this.trailing;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final Paddings getBottom() {
            return this.bottom;
        }

        @NotNull
        public final PaddingsDTO copy(@NotNull Paddings leading, @NotNull Paddings top, @NotNull Paddings trailing, @NotNull Paddings bottom) {
            Intrinsics.checkNotNullParameter(leading, "leading");
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(trailing, "trailing");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            return new PaddingsDTO(leading, top, trailing, bottom);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaddingsDTO)) {
                return false;
            }
            PaddingsDTO paddingsDTO = (PaddingsDTO) other;
            return this.leading == paddingsDTO.leading && this.top == paddingsDTO.top && this.trailing == paddingsDTO.trailing && this.bottom == paddingsDTO.bottom;
        }

        @NotNull
        public final Paddings getBottom() {
            return this.bottom;
        }

        @NotNull
        public final Paddings getLeading() {
            return this.leading;
        }

        @NotNull
        public final Paddings getTop() {
            return this.top;
        }

        @NotNull
        public final Paddings getTrailing() {
            return this.trailing;
        }

        public int hashCode() {
            return this.bottom.hashCode() + GR.b.b(this.trailing, GR.b.b(this.top, this.leading.hashCode() * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.leading;
            Paddings paddings2 = this.top;
            return GR.b.e(p.b("PaddingsDTO(leading=", paddings, ", top=", paddings2, ", trailing="), this.trailing, ", bottom=", this.bottom, ")");
        }

        public PaddingsDTO(@NotNull Paddings leading, @NotNull Paddings top, @NotNull Paddings trailing, @NotNull Paddings bottom) {
            Intrinsics.checkNotNullParameter(leading, "leading");
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(trailing, "trailing");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            this.leading = leading;
            this.top = top;
            this.trailing = trailing;
            this.bottom = bottom;
        }

        public /* synthetic */ PaddingsDTO(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? Paddings.NONE : paddings, (i11 & 2) != 0 ? Paddings.NONE : paddings2, (i11 & 4) != 0 ? Paddings.NONE : paddings3, (i11 & 8) != 0 ? Paddings.NONE : paddings4);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J<\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoDTO$ProgressDTO;", "", "progressBar", "Lru/ozon/app/android/atoms/data/progress/ProgressBar;", "progressBackgroundColor", "", "paddingLeft", "", "progressHeight", "<init>", "(Lru/ozon/app/android/atoms/data/progress/ProgressBar;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getProgressBar", "()Lru/ozon/app/android/atoms/data/progress/ProgressBar;", "getProgressBackgroundColor", "()Ljava/lang/String;", "getPaddingLeft", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getProgressHeight", "component1", "component2", "component3", "component4", "copy", "(Lru/ozon/app/android/atoms/data/progress/ProgressBar;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoDTO$ProgressDTO;", "equals", "", "other", "hashCode", "toString", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProgressDTO {
        public static final int $stable = 8;
        private final Integer paddingLeft;
        private final String progressBackgroundColor;

        @NotNull
        private final ProgressBar progressBar;
        private final Integer progressHeight;

        public ProgressDTO(@NotNull ProgressBar progressBar, String str, Integer num, Integer num2) {
            Intrinsics.checkNotNullParameter(progressBar, "progressBar");
            this.progressBar = progressBar;
            this.progressBackgroundColor = str;
            this.paddingLeft = num;
            this.progressHeight = num2;
        }

        public static /* synthetic */ ProgressDTO copy$default(ProgressDTO progressDTO, ProgressBar progressBar, String str, Integer num, Integer num2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                progressBar = progressDTO.progressBar;
            }
            if ((i11 & 2) != 0) {
                str = progressDTO.progressBackgroundColor;
            }
            if ((i11 & 4) != 0) {
                num = progressDTO.paddingLeft;
            }
            if ((i11 & 8) != 0) {
                num2 = progressDTO.progressHeight;
            }
            return progressDTO.copy(progressBar, str, num, num2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ProgressBar getProgressBar() {
            return this.progressBar;
        }

        /* renamed from: component2, reason: from getter */
        public final String getProgressBackgroundColor() {
            return this.progressBackgroundColor;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getPaddingLeft() {
            return this.paddingLeft;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getProgressHeight() {
            return this.progressHeight;
        }

        @NotNull
        public final ProgressDTO copy(@NotNull ProgressBar progressBar, String progressBackgroundColor, Integer paddingLeft, Integer progressHeight) {
            Intrinsics.checkNotNullParameter(progressBar, "progressBar");
            return new ProgressDTO(progressBar, progressBackgroundColor, paddingLeft, progressHeight);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProgressDTO)) {
                return false;
            }
            ProgressDTO progressDTO = (ProgressDTO) other;
            return Intrinsics.d(this.progressBar, progressDTO.progressBar) && Intrinsics.d(this.progressBackgroundColor, progressDTO.progressBackgroundColor) && Intrinsics.d(this.paddingLeft, progressDTO.paddingLeft) && Intrinsics.d(this.progressHeight, progressDTO.progressHeight);
        }

        public final Integer getPaddingLeft() {
            return this.paddingLeft;
        }

        public final String getProgressBackgroundColor() {
            return this.progressBackgroundColor;
        }

        @NotNull
        public final ProgressBar getProgressBar() {
            return this.progressBar;
        }

        public final Integer getProgressHeight() {
            return this.progressHeight;
        }

        public int hashCode() {
            int hashCode = this.progressBar.hashCode() * 31;
            String str = this.progressBackgroundColor;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.paddingLeft;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.progressHeight;
            return hashCode3 + (num2 != null ? num2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            ProgressBar progressBar = this.progressBar;
            String str = this.progressBackgroundColor;
            Integer num = this.paddingLeft;
            Integer num2 = this.progressHeight;
            StringBuilder sb2 = new StringBuilder("ProgressDTO(progressBar=");
            sb2.append(progressBar);
            sb2.append(", progressBackgroundColor=");
            sb2.append(str);
            sb2.append(", paddingLeft=");
            return Z.c(sb2, num, ", progressHeight=", num2, ")");
        }
    }

    @InterfaceC6346b
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoDTO$SeparatorDTO;", "", "height", "", "constructor-impl", "(I)I", "getHeight", "()I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final class SeparatorDTO {
        private final int height;

        private /* synthetic */ SeparatorDTO(int i11) {
            this.height = i11;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ SeparatorDTO m1247boximpl(int i11) {
            return new SeparatorDTO(i11);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m1248constructorimpl(int i11) {
            return i11;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m1249equalsimpl(int i11, Object obj) {
            return (obj instanceof SeparatorDTO) && i11 == ((SeparatorDTO) obj).m1253unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m1250equalsimpl0(int i11, int i12) {
            return i11 == i12;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m1251hashCodeimpl(int i11) {
            return Integer.hashCode(i11);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m1252toStringimpl(int i11) {
            return E.a(i11, "SeparatorDTO(height=", ")");
        }

        public boolean equals(Object obj) {
            return m1249equalsimpl(this.height, obj);
        }

        public final int getHeight() {
            return this.height;
        }

        public int hashCode() {
            return m1251hashCodeimpl(this.height);
        }

        public String toString() {
            return m1252toStringimpl(this.height);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m1253unboximpl() {
            return this.height;
        }
    }

    public MilesForBuyersModalInfoDTO(@NotNull ContentContainerDTO headerContainer, HeaderImageDTO headerImageDTO, @NotNull ContentContainerDTO bodyContainer, @NotNull List<ButtonWrapper> stickyButtons, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(headerContainer, "headerContainer");
        Intrinsics.checkNotNullParameter(bodyContainer, "bodyContainer");
        Intrinsics.checkNotNullParameter(stickyButtons, "stickyButtons");
        this.headerContainer = headerContainer;
        this.image = headerImageDTO;
        this.bodyContainer = bodyContainer;
        this.stickyButtons = stickyButtons;
        this.trackingInfo = map;
    }

    public static /* synthetic */ MilesForBuyersModalInfoDTO copy$default(MilesForBuyersModalInfoDTO milesForBuyersModalInfoDTO, ContentContainerDTO contentContainerDTO, HeaderImageDTO headerImageDTO, ContentContainerDTO contentContainerDTO2, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            contentContainerDTO = milesForBuyersModalInfoDTO.headerContainer;
        }
        if ((i11 & 2) != 0) {
            headerImageDTO = milesForBuyersModalInfoDTO.image;
        }
        if ((i11 & 4) != 0) {
            contentContainerDTO2 = milesForBuyersModalInfoDTO.bodyContainer;
        }
        if ((i11 & 8) != 0) {
            list = milesForBuyersModalInfoDTO.stickyButtons;
        }
        if ((i11 & 16) != 0) {
            map = milesForBuyersModalInfoDTO.trackingInfo;
        }
        Map map2 = map;
        ContentContainerDTO contentContainerDTO3 = contentContainerDTO2;
        return milesForBuyersModalInfoDTO.copy(contentContainerDTO, headerImageDTO, contentContainerDTO3, list, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ContentContainerDTO getHeaderContainer() {
        return this.headerContainer;
    }

    /* renamed from: component2, reason: from getter */
    public final HeaderImageDTO getImage() {
        return this.image;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ContentContainerDTO getBodyContainer() {
        return this.bodyContainer;
    }

    @NotNull
    public final List<ButtonWrapper> component4() {
        return this.stickyButtons;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final MilesForBuyersModalInfoDTO copy(@NotNull ContentContainerDTO headerContainer, HeaderImageDTO image, @NotNull ContentContainerDTO bodyContainer, @NotNull List<ButtonWrapper> stickyButtons, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(headerContainer, "headerContainer");
        Intrinsics.checkNotNullParameter(bodyContainer, "bodyContainer");
        Intrinsics.checkNotNullParameter(stickyButtons, "stickyButtons");
        return new MilesForBuyersModalInfoDTO(headerContainer, image, bodyContainer, stickyButtons, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MilesForBuyersModalInfoDTO)) {
            return false;
        }
        MilesForBuyersModalInfoDTO milesForBuyersModalInfoDTO = (MilesForBuyersModalInfoDTO) other;
        return Intrinsics.d(this.headerContainer, milesForBuyersModalInfoDTO.headerContainer) && Intrinsics.d(this.image, milesForBuyersModalInfoDTO.image) && Intrinsics.d(this.bodyContainer, milesForBuyersModalInfoDTO.bodyContainer) && Intrinsics.d(this.stickyButtons, milesForBuyersModalInfoDTO.stickyButtons) && Intrinsics.d(this.trackingInfo, milesForBuyersModalInfoDTO.trackingInfo);
    }

    @NotNull
    public final ContentContainerDTO getBodyContainer() {
        return this.bodyContainer;
    }

    @NotNull
    public final ContentContainerDTO getHeaderContainer() {
        return this.headerContainer;
    }

    public final HeaderImageDTO getImage() {
        return this.image;
    }

    @NotNull
    public final List<ButtonWrapper> getStickyButtons() {
        return this.stickyButtons;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.headerContainer.hashCode() * 31;
        HeaderImageDTO headerImageDTO = this.image;
        int b11 = g.b((this.bodyContainer.hashCode() + ((hashCode + (headerImageDTO == null ? 0 : headerImageDTO.hashCode())) * 31)) * 31, 31, this.stickyButtons);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return b11 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ContentContainerDTO contentContainerDTO = this.headerContainer;
        HeaderImageDTO headerImageDTO = this.image;
        ContentContainerDTO contentContainerDTO2 = this.bodyContainer;
        List<ButtonWrapper> list = this.stickyButtons;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("MilesForBuyersModalInfoDTO(headerContainer=");
        sb2.append(contentContainerDTO);
        sb2.append(", image=");
        sb2.append(headerImageDTO);
        sb2.append(", bodyContainer=");
        sb2.append(contentContainerDTO2);
        sb2.append(", stickyButtons=");
        sb2.append(list);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoDTO$HeaderImageDTO;", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "imagePosition", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoDTO$ImagePosition;", "isBackgroundHeader", "", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoDTO$ImagePosition;Z)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImagePosition", "()Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoDTO$ImagePosition;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HeaderImageDTO {
        public static final int $stable = 0;

        @NotNull
        private final ImageDTO image;

        @EnumNullFallback
        @NotNull
        private final ImagePosition imagePosition;
        private final boolean isBackgroundHeader;

        public HeaderImageDTO(@NotNull ImageDTO image, @NotNull ImagePosition imagePosition, boolean z11) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(imagePosition, "imagePosition");
            this.image = image;
            this.imagePosition = imagePosition;
            this.isBackgroundHeader = z11;
        }

        public static /* synthetic */ HeaderImageDTO copy$default(HeaderImageDTO headerImageDTO, ImageDTO imageDTO, ImagePosition imagePosition, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                imageDTO = headerImageDTO.image;
            }
            if ((i11 & 2) != 0) {
                imagePosition = headerImageDTO.imagePosition;
            }
            if ((i11 & 4) != 0) {
                z11 = headerImageDTO.isBackgroundHeader;
            }
            return headerImageDTO.copy(imageDTO, imagePosition, z11);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ImageDTO getImage() {
            return this.image;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ImagePosition getImagePosition() {
            return this.imagePosition;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsBackgroundHeader() {
            return this.isBackgroundHeader;
        }

        @NotNull
        public final HeaderImageDTO copy(@NotNull ImageDTO image, @NotNull ImagePosition imagePosition, boolean isBackgroundHeader) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(imagePosition, "imagePosition");
            return new HeaderImageDTO(image, imagePosition, isBackgroundHeader);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HeaderImageDTO)) {
                return false;
            }
            HeaderImageDTO headerImageDTO = (HeaderImageDTO) other;
            return Intrinsics.d(this.image, headerImageDTO.image) && this.imagePosition == headerImageDTO.imagePosition && this.isBackgroundHeader == headerImageDTO.isBackgroundHeader;
        }

        @NotNull
        public final ImageDTO getImage() {
            return this.image;
        }

        @NotNull
        public final ImagePosition getImagePosition() {
            return this.imagePosition;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isBackgroundHeader) + ((this.imagePosition.hashCode() + (this.image.hashCode() * 31)) * 31);
        }

        public final boolean isBackgroundHeader() {
            return this.isBackgroundHeader;
        }

        @NotNull
        public String toString() {
            ImageDTO imageDTO = this.image;
            ImagePosition imagePosition = this.imagePosition;
            boolean z11 = this.isBackgroundHeader;
            StringBuilder sb2 = new StringBuilder("HeaderImageDTO(image=");
            sb2.append(imageDTO);
            sb2.append(", imagePosition=");
            sb2.append(imagePosition);
            sb2.append(", isBackgroundHeader=");
            return Pk0.a.a(")", sb2, z11);
        }

        public /* synthetic */ HeaderImageDTO(ImageDTO imageDTO, ImagePosition imagePosition, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(imageDTO, (i11 & 2) != 0 ? ImagePosition.BACKGROUND : imagePosition, (i11 & 4) != 0 ? false : z11);
        }
    }

    public MilesForBuyersModalInfoDTO(ContentContainerDTO contentContainerDTO, HeaderImageDTO headerImageDTO, ContentContainerDTO contentContainerDTO2, List list, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(contentContainerDTO, headerImageDTO, contentContainerDTO2, (i11 & 8) != 0 ? K.f71697a : list, map);
    }
}

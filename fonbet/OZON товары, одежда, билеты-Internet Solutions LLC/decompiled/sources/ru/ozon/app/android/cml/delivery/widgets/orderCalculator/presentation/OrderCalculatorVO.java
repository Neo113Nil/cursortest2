package ru.ozon.app.android.cml.delivery.widgets.orderCalculator.presentation;

import Bi.a;
import De.C2859b;
import G.g;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.molecules.boxCard.presentation.BoxCardVO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b \b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002:;BU\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b/\u0010\u0016R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b0\u0010\u0016R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00101\u001a\u0004\b2\u00103R\"\u00104\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006<"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/presentation/OrderCalculatorVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/presentation/OrderCalculatorVO$RegionsVO;", "regions", "", "Lru/ozon/app/android/cml/delivery/molecules/boxCard/presentation/BoxCardVO;", "boxCards", "Lru/ozon/uni/atoms/data/text/TextDTO;", "infoText", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "createOrderButton", "", "topPatchColor", "backgroundColor", "LWZ/t;", "tokenizedEvent", "<init>", "(JLru/ozon/app/android/cml/delivery/widgets/orderCalculator/presentation/OrderCalculatorVO$RegionsVO;Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/String;Ljava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/presentation/OrderCalculatorVO$RegionsVO;", "getRegions", "()Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/presentation/OrderCalculatorVO$RegionsVO;", "Ljava/util/List;", "getBoxCards", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getInfoText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getCreateOrderButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Ljava/lang/String;", "getTopPatchColor", "getBackgroundColor", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "areRegionsSwapped", "Z", "getAreRegionsSwapped", "()Z", "setAreRegionsSwapped", "(Z)V", "RegionsVO", "TextFieldVO", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OrderCalculatorVO implements c {
    private boolean areRegionsSwapped;
    private final String backgroundColor;

    @NotNull
    private final List<BoxCardVO> boxCards;

    @NotNull
    private final ButtonV3DTO createOrderButton;
    private final long id;
    private final TextDTO infoText;

    @NotNull
    private final RegionsVO regions;
    private final t tokenizedEvent;
    private final String topPatchColor;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/presentation/OrderCalculatorVO$RegionsVO;", "", "Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/presentation/OrderCalculatorVO$TextFieldVO;", "source", "destination", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "swapButton", "<init>", "(Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/presentation/OrderCalculatorVO$TextFieldVO;Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/presentation/OrderCalculatorVO$TextFieldVO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/presentation/OrderCalculatorVO$TextFieldVO;", "getSource", "()Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/presentation/OrderCalculatorVO$TextFieldVO;", "getDestination", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getSwapButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RegionsVO {

        @NotNull
        private final TextFieldVO destination;

        @NotNull
        private final TextFieldVO source;

        @NotNull
        private final IconButtonV3DTO swapButton;

        public RegionsVO(@NotNull TextFieldVO source, @NotNull TextFieldVO destination, @NotNull IconButtonV3DTO swapButton) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(destination, "destination");
            Intrinsics.checkNotNullParameter(swapButton, "swapButton");
            this.source = source;
            this.destination = destination;
            this.swapButton = swapButton;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RegionsVO)) {
                return false;
            }
            RegionsVO regionsVO = (RegionsVO) other;
            return Intrinsics.d(this.source, regionsVO.source) && Intrinsics.d(this.destination, regionsVO.destination) && Intrinsics.d(this.swapButton, regionsVO.swapButton);
        }

        @NotNull
        public final TextFieldVO getDestination() {
            return this.destination;
        }

        @NotNull
        public final TextFieldVO getSource() {
            return this.source;
        }

        @NotNull
        public final IconButtonV3DTO getSwapButton() {
            return this.swapButton;
        }

        public int hashCode() {
            return this.swapButton.hashCode() + ((this.destination.hashCode() + (this.source.hashCode() * 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "RegionsVO(source=" + this.source + ", destination=" + this.destination + ", swapButton=" + this.swapButton + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/presentation/OrderCalculatorVO$TextFieldVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "common", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextFieldVO {

        @NotNull
        private final CommonControlSettings common;

        @NotNull
        private final TextDTO text;

        public TextFieldVO(@NotNull TextDTO text, @NotNull CommonControlSettings common) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(common, "common");
            this.text = text;
            this.common = common;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextFieldVO)) {
                return false;
            }
            TextFieldVO textFieldVO = (TextFieldVO) other;
            return Intrinsics.d(this.text, textFieldVO.text) && Intrinsics.d(this.common, textFieldVO.common);
        }

        @NotNull
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            return this.common.hashCode() + (this.text.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "TextFieldVO(text=" + this.text + ", common=" + this.common + ")";
        }
    }

    public OrderCalculatorVO(long j11, @NotNull RegionsVO regions, @NotNull List<BoxCardVO> boxCards, TextDTO textDTO, @NotNull ButtonV3DTO createOrderButton, String str, String str2, t tVar) {
        Intrinsics.checkNotNullParameter(regions, "regions");
        Intrinsics.checkNotNullParameter(boxCards, "boxCards");
        Intrinsics.checkNotNullParameter(createOrderButton, "createOrderButton");
        this.id = j11;
        this.regions = regions;
        this.boxCards = boxCards;
        this.infoText = textDTO;
        this.createOrderButton = createOrderButton;
        this.topPatchColor = str;
        this.backgroundColor = str2;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderCalculatorVO)) {
            return false;
        }
        OrderCalculatorVO orderCalculatorVO = (OrderCalculatorVO) other;
        return this.id == orderCalculatorVO.id && Intrinsics.d(this.regions, orderCalculatorVO.regions) && Intrinsics.d(this.boxCards, orderCalculatorVO.boxCards) && Intrinsics.d(this.infoText, orderCalculatorVO.infoText) && Intrinsics.d(this.createOrderButton, orderCalculatorVO.createOrderButton) && Intrinsics.d(this.topPatchColor, orderCalculatorVO.topPatchColor) && Intrinsics.d(this.backgroundColor, orderCalculatorVO.backgroundColor) && Intrinsics.d(this.tokenizedEvent, orderCalculatorVO.tokenizedEvent);
    }

    public final boolean getAreRegionsSwapped() {
        return this.areRegionsSwapped;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final List<BoxCardVO> getBoxCards() {
        return this.boxCards;
    }

    @NotNull
    public final ButtonV3DTO getCreateOrderButton() {
        return this.createOrderButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final TextDTO getInfoText() {
        return this.infoText;
    }

    @NotNull
    public final RegionsVO getRegions() {
        return this.regions;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public final String getTopPatchColor() {
        return this.topPatchColor;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b((this.regions.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31, this.boxCards);
        TextDTO textDTO = this.infoText;
        int c11 = C2859b.c(this.createOrderButton, (b11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31);
        String str = this.topPatchColor;
        int hashCode = (c11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundColor;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
    }

    public final void setAreRegionsSwapped(boolean z11) {
        this.areRegionsSwapped = z11;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        RegionsVO regionsVO = this.regions;
        List<BoxCardVO> list = this.boxCards;
        TextDTO textDTO = this.infoText;
        ButtonV3DTO buttonV3DTO = this.createOrderButton;
        String str = this.topPatchColor;
        String str2 = this.backgroundColor;
        t tVar = this.tokenizedEvent;
        StringBuilder sb2 = new StringBuilder("OrderCalculatorVO(id=");
        sb2.append(j11);
        sb2.append(", regions=");
        sb2.append(regionsVO);
        sb2.append(", boxCards=");
        sb2.append(list);
        sb2.append(", infoText=");
        sb2.append(textDTO);
        sb2.append(", createOrderButton=");
        sb2.append(buttonV3DTO);
        sb2.append(", topPatchColor=");
        sb2.append(str);
        a.f(sb2, ", backgroundColor=", str2, ", tokenizedEvent=", tVar);
        sb2.append(")");
        return sb2.toString();
    }
}

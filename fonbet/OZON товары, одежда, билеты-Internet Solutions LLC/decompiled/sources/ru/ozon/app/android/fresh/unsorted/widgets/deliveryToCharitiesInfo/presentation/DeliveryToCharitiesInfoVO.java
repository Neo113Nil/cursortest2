package ru.ozon.app.android.fresh.unsorted.widgets.deliveryToCharitiesInfo.presentation;

import Ak.C2436a;
import G.g;
import Ns.b;
import TY.a;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001,BM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u000e\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b#\u0010\"R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b'\u0010\"R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b(\u0010\"R\u001f\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryToCharitiesInfo/presentation/DeliveryToCharitiesInfoVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryToCharitiesInfo/presentation/DeliveryToCharitiesInfoVO$InstructionVO;", "instructions", "agreement", "about", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Ljava/util/List;", "getInstructions", "()Ljava/util/List;", "getAgreement", "getAbout", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "InstructionVO", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DeliveryToCharitiesInfoVO implements c {

    @NotNull
    private final TextDTO about;

    @NotNull
    private final TextDTO agreement;
    private final long id;

    @NotNull
    private final List<InstructionVO> instructions;

    @NotNull
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryToCharitiesInfo/presentation/DeliveryToCharitiesInfoVO$InstructionVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "orderNumber", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttonV3DTO", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getOrderNumber", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButtonV3DTO", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InstructionVO implements c {
        private final ButtonV3DTO buttonV3DTO;
        private final long id;

        @NotNull
        private final String orderNumber;
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;

        public InstructionVO(long j11, @NotNull String orderNumber, @NotNull TextDTO title, TextDTO textDTO, ButtonV3DTO buttonV3DTO) {
            Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
            Intrinsics.checkNotNullParameter(title, "title");
            this.id = j11;
            this.orderNumber = orderNumber;
            this.title = title;
            this.subtitle = textDTO;
            this.buttonV3DTO = buttonV3DTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InstructionVO)) {
                return false;
            }
            InstructionVO instructionVO = (InstructionVO) other;
            return this.id == instructionVO.id && Intrinsics.d(this.orderNumber, instructionVO.orderNumber) && Intrinsics.d(this.title, instructionVO.title) && Intrinsics.d(this.subtitle, instructionVO.subtitle) && Intrinsics.d(this.buttonV3DTO, instructionVO.buttonV3DTO);
        }

        public final ButtonV3DTO getButtonV3DTO() {
            return this.buttonV3DTO;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @NotNull
        public final String getOrderNumber() {
            return this.orderNumber;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return null;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        @Override // l20.c
        public int getViewItemKey() {
            return hashCode();
        }

        public int hashCode() {
            int a11 = b.a(this.title, g.a(Long.hashCode(this.id) * 31, 31, this.orderNumber), 31);
            TextDTO textDTO = this.subtitle;
            int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            ButtonV3DTO buttonV3DTO = this.buttonV3DTO;
            return hashCode + (buttonV3DTO != null ? buttonV3DTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            String str = this.orderNumber;
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            ButtonV3DTO buttonV3DTO = this.buttonV3DTO;
            StringBuilder c11 = C2436a.c(j11, "InstructionVO(id=", ", orderNumber=", str);
            D3.g.i(", title=", ", subtitle=", c11, textDTO, textDTO2);
            c11.append(", buttonV3DTO=");
            c11.append(buttonV3DTO);
            c11.append(")");
            return c11.toString();
        }
    }

    public DeliveryToCharitiesInfoVO(long j11, @NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull List<InstructionVO> instructions, @NotNull TextDTO agreement, @NotNull TextDTO about, t tVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(instructions, "instructions");
        Intrinsics.checkNotNullParameter(agreement, "agreement");
        Intrinsics.checkNotNullParameter(about, "about");
        this.id = j11;
        this.title = title;
        this.subtitle = subtitle;
        this.instructions = instructions;
        this.agreement = agreement;
        this.about = about;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryToCharitiesInfoVO)) {
            return false;
        }
        DeliveryToCharitiesInfoVO deliveryToCharitiesInfoVO = (DeliveryToCharitiesInfoVO) other;
        return this.id == deliveryToCharitiesInfoVO.id && Intrinsics.d(this.title, deliveryToCharitiesInfoVO.title) && Intrinsics.d(this.subtitle, deliveryToCharitiesInfoVO.subtitle) && Intrinsics.d(this.instructions, deliveryToCharitiesInfoVO.instructions) && Intrinsics.d(this.agreement, deliveryToCharitiesInfoVO.agreement) && Intrinsics.d(this.about, deliveryToCharitiesInfoVO.about) && Intrinsics.d(this.tokenizedEvent, deliveryToCharitiesInfoVO.tokenizedEvent);
    }

    @NotNull
    public final TextDTO getAbout() {
        return this.about;
    }

    @NotNull
    public final TextDTO getAgreement() {
        return this.agreement;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<InstructionVO> getInstructions() {
        return this.instructions;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = b.a(this.about, b.a(this.agreement, g.b(b.a(this.subtitle, b.a(this.title, Long.hashCode(this.id) * 31, 31), 31), 31, this.instructions), 31), 31);
        t tVar = this.tokenizedEvent;
        return a11 + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        List<InstructionVO> list = this.instructions;
        TextDTO textDTO3 = this.agreement;
        TextDTO textDTO4 = this.about;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = a.b("DeliveryToCharitiesInfoVO(id=", j11, ", title=", textDTO);
        b11.append(", subtitle=");
        b11.append(textDTO2);
        b11.append(", instructions=");
        b11.append(list);
        D3.g.i(", agreement=", ", about=", b11, textDTO3, textDTO4);
        return Lh.a.b(b11, ", tokenizedEvent=", tVar, ")");
    }
}

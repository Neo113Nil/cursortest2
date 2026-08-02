package ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.presentation.model;

import D3.g;
import De.C2859b;
import Nh.a;
import Ns.b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BQ\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b)\u0010(R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u00100\u001a\u0004\b3\u00102R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00104\u001a\u0004\b5\u00106¨\u00067"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/model/LargeOrdersLiftingV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/model/InputVO;", "input", "Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/model/OptionsBlockVO;", "optionsBlock", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "confirmButton", "cancelButton", "LWZ/t;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/model/InputVO;Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/model/OptionsBlockVO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/model/InputVO;", "getInput", "()Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/model/InputVO;", "Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/model/OptionsBlockVO;", "getOptionsBlock", "()Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/model/OptionsBlockVO;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getConfirmButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getCancelButton", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class LargeOrdersLiftingV2VO implements c {

    @NotNull
    private final ButtonV3DTO cancelButton;

    @NotNull
    private final ButtonV3DTO confirmButton;
    private final long id;

    @NotNull
    private final ImageDTO image;

    @NotNull
    private final InputVO input;

    @NotNull
    private final OptionsBlockVO optionsBlock;

    @NotNull
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final t tokenizedEvent;

    public LargeOrdersLiftingV2VO(long j11, @NotNull ImageDTO image, @NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull InputVO input, @NotNull OptionsBlockVO optionsBlock, @NotNull ButtonV3DTO confirmButton, @NotNull ButtonV3DTO cancelButton, t tVar) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(optionsBlock, "optionsBlock");
        Intrinsics.checkNotNullParameter(confirmButton, "confirmButton");
        Intrinsics.checkNotNullParameter(cancelButton, "cancelButton");
        this.id = j11;
        this.image = image;
        this.title = title;
        this.subtitle = subtitle;
        this.input = input;
        this.optionsBlock = optionsBlock;
        this.confirmButton = confirmButton;
        this.cancelButton = cancelButton;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LargeOrdersLiftingV2VO)) {
            return false;
        }
        LargeOrdersLiftingV2VO largeOrdersLiftingV2VO = (LargeOrdersLiftingV2VO) other;
        return this.id == largeOrdersLiftingV2VO.id && Intrinsics.d(this.image, largeOrdersLiftingV2VO.image) && Intrinsics.d(this.title, largeOrdersLiftingV2VO.title) && Intrinsics.d(this.subtitle, largeOrdersLiftingV2VO.subtitle) && Intrinsics.d(this.input, largeOrdersLiftingV2VO.input) && Intrinsics.d(this.optionsBlock, largeOrdersLiftingV2VO.optionsBlock) && Intrinsics.d(this.confirmButton, largeOrdersLiftingV2VO.confirmButton) && Intrinsics.d(this.cancelButton, largeOrdersLiftingV2VO.cancelButton) && Intrinsics.d(this.tokenizedEvent, largeOrdersLiftingV2VO.tokenizedEvent);
    }

    @NotNull
    public final ButtonV3DTO getCancelButton() {
        return this.cancelButton;
    }

    @NotNull
    public final ButtonV3DTO getConfirmButton() {
        return this.confirmButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final ImageDTO getImage() {
        return this.image;
    }

    @NotNull
    public final InputVO getInput() {
        return this.input;
    }

    @NotNull
    public final OptionsBlockVO getOptionsBlock() {
        return this.optionsBlock;
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
        int c11 = C2859b.c(this.cancelButton, C2859b.c(this.confirmButton, (this.optionsBlock.hashCode() + ((this.input.hashCode() + b.a(this.subtitle, b.a(this.title, a.b(this.image, Long.hashCode(this.id) * 31, 31), 31), 31)) * 31)) * 31, 31), 31);
        t tVar = this.tokenizedEvent;
        return c11 + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ImageDTO imageDTO = this.image;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        InputVO inputVO = this.input;
        OptionsBlockVO optionsBlockVO = this.optionsBlock;
        ButtonV3DTO buttonV3DTO = this.confirmButton;
        ButtonV3DTO buttonV3DTO2 = this.cancelButton;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = Nh.b.c("LargeOrdersLiftingV2VO(id=", j11, ", image=", imageDTO);
        g.i(", title=", ", subtitle=", c11, textDTO, textDTO2);
        c11.append(", input=");
        c11.append(inputVO);
        c11.append(", optionsBlock=");
        c11.append(optionsBlockVO);
        c11.append(", confirmButton=");
        c11.append(buttonV3DTO);
        c11.append(", cancelButton=");
        c11.append(buttonV3DTO2);
        return Lh.a.b(c11, ", tokenizedEvent=", tVar, ")");
    }
}

package ru.ozon.app.android.travel.feature.tours.widgets.orderToursChangeForm.presentation;

import B90.C2619v;
import Bl.C2639a;
import Lh.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R\u001f\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/orderToursChangeForm/presentation/OrderToursChangeFormVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "info", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$TextCommonInputVO;", "input", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$TextCommonInputVO;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getInfo", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$TextCommonInputVO;", "getInput", "()Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$TextCommonInputVO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OrderToursChangeFormVO implements c {
    private final long id;

    @NotNull
    private final TextAtom info;

    @NotNull
    private final CommonInputVO.TextCommonInputVO input;

    @NotNull
    private final TextAtom title;
    private final t tokenizedEvent;

    public OrderToursChangeFormVO(long j11, @NotNull TextAtom title, @NotNull TextAtom info, @NotNull CommonInputVO.TextCommonInputVO input, t tVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(input, "input");
        this.id = j11;
        this.title = title;
        this.info = info;
        this.input = input;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderToursChangeFormVO)) {
            return false;
        }
        OrderToursChangeFormVO orderToursChangeFormVO = (OrderToursChangeFormVO) other;
        return this.id == orderToursChangeFormVO.id && Intrinsics.d(this.title, orderToursChangeFormVO.title) && Intrinsics.d(this.info, orderToursChangeFormVO.info) && Intrinsics.d(this.input, orderToursChangeFormVO.input) && Intrinsics.d(this.tokenizedEvent, orderToursChangeFormVO.tokenizedEvent);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final TextAtom getInfo() {
        return this.info;
    }

    @NotNull
    public final CommonInputVO.TextCommonInputVO getInput() {
        return this.input;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextAtom getTitle() {
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
        int hashCode = (this.input.hashCode() + C2619v.b(C2619v.b(Long.hashCode(this.id) * 31, 31, this.title), 31, this.info)) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.info;
        CommonInputVO.TextCommonInputVO textCommonInputVO = this.input;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = C2639a.c("OrderToursChangeFormVO(id=", j11, ", title=", textAtom);
        c11.append(", info=");
        c11.append(textAtom2);
        c11.append(", input=");
        c11.append(textCommonInputVO);
        return a.b(c11, ", tokenizedEvent=", tVar, ")");
    }
}

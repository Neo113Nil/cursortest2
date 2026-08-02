package ru.ozon.app.android.marketing.widgets.blackFridayStatus.presentation.texttitle;

import B90.C2619v;
import Bl.C2639a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.stock.StockBar;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.data.ButtonWithTitle;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.presentation.model.ImageVO;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.presentation.model.TimerWithTitleVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b)\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b1\u00102R\u001f\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00103\u001a\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/texttitle/TextTitleLayoutVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/model/ImageVO;", "leftImage", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/app/android/atoms/data/stock/StockBar;", "stockBar", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/model/TimerWithTitleVO;", DynamicElementDTO.TIMER, "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/ButtonWithTitle;", "button", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/model/ImageVO;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/atoms/data/stock/StockBar;Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/model/TimerWithTitleVO;Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/ButtonWithTitle;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/model/ImageVO;", "getLeftImage", "()Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/model/ImageVO;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "Lru/ozon/app/android/atoms/data/stock/StockBar;", "getStockBar", "()Lru/ozon/app/android/atoms/data/stock/StockBar;", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/model/TimerWithTitleVO;", "getTimer", "()Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/model/TimerWithTitleVO;", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/ButtonWithTitle;", "getButton", "()Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/ButtonWithTitle;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TextTitleLayoutVO implements c {
    private final ButtonWithTitle button;
    private final long id;

    @NotNull
    private final ImageVO leftImage;
    private final StockBar stockBar;
    private final TextAtom subtitle;
    private final TimerWithTitleVO timer;

    @NotNull
    private final TextAtom title;
    private final t tokenizedEvent;

    public TextTitleLayoutVO(long j11, @NotNull ImageVO leftImage, @NotNull TextAtom title, TextAtom textAtom, StockBar stockBar, TimerWithTitleVO timerWithTitleVO, ButtonWithTitle buttonWithTitle, t tVar) {
        Intrinsics.checkNotNullParameter(leftImage, "leftImage");
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = j11;
        this.leftImage = leftImage;
        this.title = title;
        this.subtitle = textAtom;
        this.stockBar = stockBar;
        this.timer = timerWithTitleVO;
        this.button = buttonWithTitle;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextTitleLayoutVO)) {
            return false;
        }
        TextTitleLayoutVO textTitleLayoutVO = (TextTitleLayoutVO) other;
        return this.id == textTitleLayoutVO.id && Intrinsics.d(this.leftImage, textTitleLayoutVO.leftImage) && Intrinsics.d(this.title, textTitleLayoutVO.title) && Intrinsics.d(this.subtitle, textTitleLayoutVO.subtitle) && Intrinsics.d(this.stockBar, textTitleLayoutVO.stockBar) && Intrinsics.d(this.timer, textTitleLayoutVO.timer) && Intrinsics.d(this.button, textTitleLayoutVO.button) && Intrinsics.d(this.tokenizedEvent, textTitleLayoutVO.tokenizedEvent);
    }

    public final ButtonWithTitle getButton() {
        return this.button;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final ImageVO getLeftImage() {
        return this.leftImage;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final StockBar getStockBar() {
        return this.stockBar;
    }

    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    public final TimerWithTitleVO getTimer() {
        return this.timer;
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
        int b11 = C2619v.b((this.leftImage.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31, this.title);
        TextAtom textAtom = this.subtitle;
        int hashCode = (b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        StockBar stockBar = this.stockBar;
        int hashCode2 = (hashCode + (stockBar == null ? 0 : stockBar.hashCode())) * 31;
        TimerWithTitleVO timerWithTitleVO = this.timer;
        int hashCode3 = (hashCode2 + (timerWithTitleVO == null ? 0 : timerWithTitleVO.hashCode())) * 31;
        ButtonWithTitle buttonWithTitle = this.button;
        int hashCode4 = (hashCode3 + (buttonWithTitle == null ? 0 : buttonWithTitle.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode4 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ImageVO imageVO = this.leftImage;
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subtitle;
        StockBar stockBar = this.stockBar;
        TimerWithTitleVO timerWithTitleVO = this.timer;
        ButtonWithTitle buttonWithTitle = this.button;
        t tVar = this.tokenizedEvent;
        StringBuilder sb2 = new StringBuilder("TextTitleLayoutVO(id=");
        sb2.append(j11);
        sb2.append(", leftImage=");
        sb2.append(imageVO);
        C2639a.e(", title=", ", subtitle=", sb2, textAtom, textAtom2);
        sb2.append(", stockBar=");
        sb2.append(stockBar);
        sb2.append(", timer=");
        sb2.append(timerWithTitleVO);
        sb2.append(", button=");
        sb2.append(buttonWithTitle);
        sb2.append(", tokenizedEvent=");
        sb2.append(tVar);
        sb2.append(")");
        return sb2.toString();
    }
}

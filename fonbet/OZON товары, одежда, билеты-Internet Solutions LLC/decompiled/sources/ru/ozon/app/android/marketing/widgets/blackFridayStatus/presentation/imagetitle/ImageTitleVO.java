package ru.ozon.app.android.marketing.widgets.blackFridayStatus.presentation.imagetitle;

import Bl.b;
import Kk.C3532b;
import Lh.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.stock.StockBar;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.presentation.model.ImageVO;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.presentation.model.TimerWithTitleVO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b&\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010,R\u001f\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, d2 = {"Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/imagetitle/ImageTitleVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "leftImageDynamicSize", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/model/ImageVO;", "leftImage", "titleImage", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/model/TimerWithTitleVO;", DynamicElementDTO.TIMER, "Lru/ozon/app/android/atoms/data/stock/StockBar;", "stockBar", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JZLru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/model/ImageVO;Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/model/ImageVO;Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/model/TimerWithTitleVO;Lru/ozon/app/android/atoms/data/stock/StockBar;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Z", "getLeftImageDynamicSize", "()Z", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/model/ImageVO;", "getLeftImage", "()Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/model/ImageVO;", "getTitleImage", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/model/TimerWithTitleVO;", "getTimer", "()Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/model/TimerWithTitleVO;", "Lru/ozon/app/android/atoms/data/stock/StockBar;", "getStockBar", "()Lru/ozon/app/android/atoms/data/stock/StockBar;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ImageTitleVO implements c {
    private final long id;

    @NotNull
    private final ImageVO leftImage;
    private final boolean leftImageDynamicSize;
    private final StockBar stockBar;
    private final TimerWithTitleVO timer;

    @NotNull
    private final ImageVO titleImage;
    private final t tokenizedEvent;

    public ImageTitleVO(long j11, boolean z11, @NotNull ImageVO leftImage, @NotNull ImageVO titleImage, TimerWithTitleVO timerWithTitleVO, StockBar stockBar, t tVar) {
        Intrinsics.checkNotNullParameter(leftImage, "leftImage");
        Intrinsics.checkNotNullParameter(titleImage, "titleImage");
        this.id = j11;
        this.leftImageDynamicSize = z11;
        this.leftImage = leftImage;
        this.titleImage = titleImage;
        this.timer = timerWithTitleVO;
        this.stockBar = stockBar;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageTitleVO)) {
            return false;
        }
        ImageTitleVO imageTitleVO = (ImageTitleVO) other;
        return this.id == imageTitleVO.id && this.leftImageDynamicSize == imageTitleVO.leftImageDynamicSize && Intrinsics.d(this.leftImage, imageTitleVO.leftImage) && Intrinsics.d(this.titleImage, imageTitleVO.titleImage) && Intrinsics.d(this.timer, imageTitleVO.timer) && Intrinsics.d(this.stockBar, imageTitleVO.stockBar) && Intrinsics.d(this.tokenizedEvent, imageTitleVO.tokenizedEvent);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final ImageVO getLeftImage() {
        return this.leftImage;
    }

    public final boolean getLeftImageDynamicSize() {
        return this.leftImageDynamicSize;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final StockBar getStockBar() {
        return this.stockBar;
    }

    public final TimerWithTitleVO getTimer() {
        return this.timer;
    }

    @NotNull
    public final ImageVO getTitleImage() {
        return this.titleImage;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.titleImage.hashCode() + ((this.leftImage.hashCode() + C3532b.a(Long.hashCode(this.id) * 31, 31, this.leftImageDynamicSize)) * 31)) * 31;
        TimerWithTitleVO timerWithTitleVO = this.timer;
        int hashCode2 = (hashCode + (timerWithTitleVO == null ? 0 : timerWithTitleVO.hashCode())) * 31;
        StockBar stockBar = this.stockBar;
        int hashCode3 = (hashCode2 + (stockBar == null ? 0 : stockBar.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode3 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        boolean z11 = this.leftImageDynamicSize;
        ImageVO imageVO = this.leftImage;
        ImageVO imageVO2 = this.titleImage;
        TimerWithTitleVO timerWithTitleVO = this.timer;
        StockBar stockBar = this.stockBar;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = b.c(j11, "ImageTitleVO(id=", ", leftImageDynamicSize=", z11);
        c11.append(", leftImage=");
        c11.append(imageVO);
        c11.append(", titleImage=");
        c11.append(imageVO2);
        c11.append(", timer=");
        c11.append(timerWithTitleVO);
        c11.append(", stockBar=");
        c11.append(stockBar);
        return a.b(c11, ", tokenizedEvent=", tVar, ")");
    }
}

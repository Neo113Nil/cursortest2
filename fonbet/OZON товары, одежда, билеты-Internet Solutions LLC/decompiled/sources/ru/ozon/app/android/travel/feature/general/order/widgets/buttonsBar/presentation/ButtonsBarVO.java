package ru.ozon.app.android.travel.feature.general.order.widgets.buttonsBar.presentation;

import Lh.a;
import Pk0.b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.buttonsRow.ButtonsRowVO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0011R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u001f\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/buttonsBar/presentation/ButtonsBarVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/travel/molecules/view/buttonsRow/ButtonsRowVO;", "buttonsRow", "", "backgroundColor", "", "topRadius", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "<init>", "(JLru/ozon/app/android/travel/molecules/view/buttonsRow/ButtonsRowVO;Ljava/lang/String;FLWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/molecules/view/buttonsRow/ButtonsRowVO;", "getButtonsRow", "()Lru/ozon/app/android/travel/molecules/view/buttonsRow/ButtonsRowVO;", "Ljava/lang/String;", "getBackgroundColor", "F", "getTopRadius", "()F", "LWZ/t;", "getViewEvent", "()LWZ/t;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ButtonsBarVO implements c {
    private final String backgroundColor;

    @NotNull
    private final ButtonsRowVO buttonsRow;
    private final long id;
    private final float topRadius;
    private final t viewEvent;

    public ButtonsBarVO(long j11, @NotNull ButtonsRowVO buttonsRow, String str, float f7, t tVar) {
        Intrinsics.checkNotNullParameter(buttonsRow, "buttonsRow");
        this.id = j11;
        this.buttonsRow = buttonsRow;
        this.backgroundColor = str;
        this.topRadius = f7;
        this.viewEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonsBarVO)) {
            return false;
        }
        ButtonsBarVO buttonsBarVO = (ButtonsBarVO) other;
        return this.id == buttonsBarVO.id && Intrinsics.d(this.buttonsRow, buttonsBarVO.buttonsRow) && Intrinsics.d(this.backgroundColor, buttonsBarVO.backgroundColor) && Float.compare(this.topRadius, buttonsBarVO.topRadius) == 0 && Intrinsics.d(this.viewEvent, buttonsBarVO.viewEvent);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final ButtonsRowVO getButtonsRow() {
        return this.buttonsRow;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final float getTopRadius() {
        return this.topRadius;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.buttonsRow.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        String str = this.backgroundColor;
        int a11 = b.a(this.topRadius, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        t tVar = this.viewEvent;
        return a11 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ButtonsRowVO buttonsRowVO = this.buttonsRow;
        String str = this.backgroundColor;
        float f7 = this.topRadius;
        t tVar = this.viewEvent;
        StringBuilder sb2 = new StringBuilder("ButtonsBarVO(id=");
        sb2.append(j11);
        sb2.append(", buttonsRow=");
        sb2.append(buttonsRowVO);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", topRadius=");
        sb2.append(f7);
        return a.b(sb2, ", viewEvent=", tVar, ")");
    }
}

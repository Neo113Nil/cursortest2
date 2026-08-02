package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation;

import B0.A0;
import B0.C2454a;
import E0.C2942q;
import G.g;
import Kk.C3532b;
import Nh.a;
import Ns.b;
import Pk0.i;
import Ve.C4598rp;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b.\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BÑ\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\r\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0018\u0012\u000e\u0010\u001f\u001a\n\u0018\u00010\u001dj\u0004\u0018\u0001`\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010#\u001a\u00020 ¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020 2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b/\u00100R\u001b\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u00103R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u00106R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b7\u00106R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010;\u001a\u0004\b<\u0010)R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010;\u001a\u0004\b=\u0010)R\u0017\u0010\u0010\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0010\u0010;\u001a\u0004\b>\u0010)R\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0011\u0010;\u001a\u0004\b?\u0010)R\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0012\u0010;\u001a\u0004\b@\u0010)R\u0017\u0010\u0013\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0013\u0010;\u001a\u0004\bA\u0010)R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u0016\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010.\u001a\u0004\bE\u00100R\u0017\u0010\u0017\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0017\u0010;\u001a\u0004\bF\u0010)R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010G\u001a\u0004\bH\u0010'R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u001a\u0010G\u001a\u0004\bI\u0010'R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u001b\u0010G\u001a\u0004\bJ\u0010'R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u001c\u0010G\u001a\u0004\bK\u0010'R\u001f\u0010\u001f\u001a\n\u0018\u00010\u001dj\u0004\u0018\u0001`\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010O\u001a\u0004\bP\u0010QR\u0019\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\"\u0010R\u001a\u0004\bS\u0010TR\"\u0010#\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010O\u001a\u0004\bU\u0010Q\"\u0004\bV\u0010W¨\u0006X"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v3/presentation/DeliveryWidgetV3VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "Lru/ozon/uni/atoms/data/text/TextDTO;", "priceText", "deliveryText", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "deliveryInfoIcon", "", "topPadding", "bottomPadding", "horizontalPadding", "betweenPadding", "eclipsePadding", "deliveryInfoPadding", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "widgetUpdatePeriod", "progress", "", "progressGradient", "borderColor", "eclipseColor", "backgroundColor", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "shouldHideProgressBar", "timerDeadline", "resetState", "<init>", "(JLl20/d;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;IIIIIILru/ozon/uni/atoms/af/AtomAction;JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LWZ/t;ZLjava/lang/Long;Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ll20/d;", "getWidgetInfo", "()Ll20/d;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getPriceText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDeliveryText", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "getDeliveryInfoIcon", "()Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "I", "getTopPadding", "getBottomPadding", "getHorizontalPadding", "getBetweenPadding", "getEclipsePadding", "getDeliveryInfoPadding", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getWidgetUpdatePeriod", "getProgress", "Ljava/lang/String;", "getProgressGradient", "getBorderColor", "getEclipseColor", "getBackgroundColor", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Z", "getShouldHideProgressBar", "()Z", "Ljava/lang/Long;", "getTimerDeadline", "()Ljava/lang/Long;", "getResetState", "setResetState", "(Z)V", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DeliveryWidgetV3VO implements c {

    @NotNull
    private final AtomAction action;
    private final String backgroundColor;
    private final int betweenPadding;
    private final String borderColor;
    private final int bottomPadding;

    @NotNull
    private final CommonAtomIconDTO deliveryInfoIcon;
    private final int deliveryInfoPadding;
    private final TextDTO deliveryText;
    private final String eclipseColor;
    private final int eclipsePadding;
    private final int horizontalPadding;
    private final long id;

    @NotNull
    private final TextDTO priceText;
    private final int progress;

    @NotNull
    private final String progressGradient;
    private boolean resetState;
    private final boolean shouldHideProgressBar;
    private final Long timerDeadline;
    private final t tokenizedEvent;
    private final int topPadding;

    @NotNull
    private final d widgetInfo;
    private final long widgetUpdatePeriod;

    public DeliveryWidgetV3VO(long j11, @NotNull d widgetInfo, @NotNull TextDTO priceText, TextDTO textDTO, @NotNull CommonAtomIconDTO deliveryInfoIcon, int i11, int i12, int i13, int i14, int i15, int i16, @NotNull AtomAction action, long j12, int i17, @NotNull String progressGradient, String str, String str2, String str3, t tVar, boolean z11, Long l11, boolean z12) {
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        Intrinsics.checkNotNullParameter(priceText, "priceText");
        Intrinsics.checkNotNullParameter(deliveryInfoIcon, "deliveryInfoIcon");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(progressGradient, "progressGradient");
        this.id = j11;
        this.widgetInfo = widgetInfo;
        this.priceText = priceText;
        this.deliveryText = textDTO;
        this.deliveryInfoIcon = deliveryInfoIcon;
        this.topPadding = i11;
        this.bottomPadding = i12;
        this.horizontalPadding = i13;
        this.betweenPadding = i14;
        this.eclipsePadding = i15;
        this.deliveryInfoPadding = i16;
        this.action = action;
        this.widgetUpdatePeriod = j12;
        this.progress = i17;
        this.progressGradient = progressGradient;
        this.borderColor = str;
        this.eclipseColor = str2;
        this.backgroundColor = str3;
        this.tokenizedEvent = tVar;
        this.shouldHideProgressBar = z11;
        this.timerDeadline = l11;
        this.resetState = z12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryWidgetV3VO)) {
            return false;
        }
        DeliveryWidgetV3VO deliveryWidgetV3VO = (DeliveryWidgetV3VO) other;
        return this.id == deliveryWidgetV3VO.id && Intrinsics.d(this.widgetInfo, deliveryWidgetV3VO.widgetInfo) && Intrinsics.d(this.priceText, deliveryWidgetV3VO.priceText) && Intrinsics.d(this.deliveryText, deliveryWidgetV3VO.deliveryText) && Intrinsics.d(this.deliveryInfoIcon, deliveryWidgetV3VO.deliveryInfoIcon) && this.topPadding == deliveryWidgetV3VO.topPadding && this.bottomPadding == deliveryWidgetV3VO.bottomPadding && this.horizontalPadding == deliveryWidgetV3VO.horizontalPadding && this.betweenPadding == deliveryWidgetV3VO.betweenPadding && this.eclipsePadding == deliveryWidgetV3VO.eclipsePadding && this.deliveryInfoPadding == deliveryWidgetV3VO.deliveryInfoPadding && Intrinsics.d(this.action, deliveryWidgetV3VO.action) && this.widgetUpdatePeriod == deliveryWidgetV3VO.widgetUpdatePeriod && this.progress == deliveryWidgetV3VO.progress && Intrinsics.d(this.progressGradient, deliveryWidgetV3VO.progressGradient) && Intrinsics.d(this.borderColor, deliveryWidgetV3VO.borderColor) && Intrinsics.d(this.eclipseColor, deliveryWidgetV3VO.eclipseColor) && Intrinsics.d(this.backgroundColor, deliveryWidgetV3VO.backgroundColor) && Intrinsics.d(this.tokenizedEvent, deliveryWidgetV3VO.tokenizedEvent) && this.shouldHideProgressBar == deliveryWidgetV3VO.shouldHideProgressBar && Intrinsics.d(this.timerDeadline, deliveryWidgetV3VO.timerDeadline) && this.resetState == deliveryWidgetV3VO.resetState;
    }

    @NotNull
    public final AtomAction getAction() {
        return this.action;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getBetweenPadding() {
        return this.betweenPadding;
    }

    public final String getBorderColor() {
        return this.borderColor;
    }

    public final int getBottomPadding() {
        return this.bottomPadding;
    }

    @NotNull
    public final CommonAtomIconDTO getDeliveryInfoIcon() {
        return this.deliveryInfoIcon;
    }

    public final int getDeliveryInfoPadding() {
        return this.deliveryInfoPadding;
    }

    public final TextDTO getDeliveryText() {
        return this.deliveryText;
    }

    public final String getEclipseColor() {
        return this.eclipseColor;
    }

    public final int getEclipsePadding() {
        return this.eclipsePadding;
    }

    public final int getHorizontalPadding() {
        return this.horizontalPadding;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final TextDTO getPriceText() {
        return this.priceText;
    }

    public final int getProgress() {
        return this.progress;
    }

    @NotNull
    public final String getProgressGradient() {
        return this.progressGradient;
    }

    public final boolean getResetState() {
        return this.resetState;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final boolean getShouldHideProgressBar() {
        return this.shouldHideProgressBar;
    }

    public final Long getTimerDeadline() {
        return this.timerDeadline;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public final int getTopPadding() {
        return this.topPadding;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    @NotNull
    public final d getWidgetInfo() {
        return this.widgetInfo;
    }

    public final long getWidgetUpdatePeriod() {
        return this.widgetUpdatePeriod;
    }

    public int hashCode() {
        int a11 = b.a(this.priceText, (this.widgetInfo.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31);
        TextDTO textDTO = this.deliveryText;
        int a12 = g.a(C2454a.a(this.progress, Pk0.c.a(C4598rp.a(this.action, C2454a.a(this.deliveryInfoPadding, C2454a.a(this.eclipsePadding, C2454a.a(this.betweenPadding, C2454a.a(this.horizontalPadding, C2454a.a(this.bottomPadding, C2454a.a(this.topPadding, (this.deliveryInfoIcon.hashCode() + ((a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31)) * 31, 31), 31), 31), 31), 31), 31), 31), 31, this.widgetUpdatePeriod), 31), 31, this.progressGradient);
        String str = this.borderColor;
        int hashCode = (a12 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.eclipseColor;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.backgroundColor;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int a13 = C3532b.a((hashCode3 + (tVar == null ? 0 : tVar.hashCode())) * 31, 31, this.shouldHideProgressBar);
        Long l11 = this.timerDeadline;
        return Boolean.hashCode(this.resetState) + ((a13 + (l11 != null ? l11.hashCode() : 0)) * 31);
    }

    public final void setResetState(boolean z11) {
        this.resetState = z11;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        d dVar = this.widgetInfo;
        TextDTO textDTO = this.priceText;
        TextDTO textDTO2 = this.deliveryText;
        CommonAtomIconDTO commonAtomIconDTO = this.deliveryInfoIcon;
        int i11 = this.topPadding;
        int i12 = this.bottomPadding;
        int i13 = this.horizontalPadding;
        int i14 = this.betweenPadding;
        int i15 = this.eclipsePadding;
        int i16 = this.deliveryInfoPadding;
        AtomAction atomAction = this.action;
        long j12 = this.widgetUpdatePeriod;
        int i17 = this.progress;
        String str = this.progressGradient;
        String str2 = this.borderColor;
        String str3 = this.eclipseColor;
        String str4 = this.backgroundColor;
        t tVar = this.tokenizedEvent;
        boolean z11 = this.shouldHideProgressBar;
        Long l11 = this.timerDeadline;
        boolean z12 = this.resetState;
        StringBuilder sb2 = new StringBuilder("DeliveryWidgetV3VO(id=");
        sb2.append(j11);
        sb2.append(", widgetInfo=");
        sb2.append(dVar);
        D3.g.i(", priceText=", ", deliveryText=", sb2, textDTO, textDTO2);
        sb2.append(", deliveryInfoIcon=");
        sb2.append(commonAtomIconDTO);
        sb2.append(", topPadding=");
        sb2.append(i11);
        A0.c(i12, i13, ", bottomPadding=", ", horizontalPadding=", sb2);
        A0.c(i14, i15, ", betweenPadding=", ", eclipsePadding=", sb2);
        sb2.append(", deliveryInfoPadding=");
        sb2.append(i16);
        sb2.append(", action=");
        sb2.append(atomAction);
        C2942q.f(sb2, ", widgetUpdatePeriod=", j12, ", progress=");
        i.c(i17, ", progressGradient=", str, ", borderColor=", sb2);
        a.h(sb2, str2, ", eclipseColor=", str3, ", backgroundColor=");
        sb2.append(str4);
        sb2.append(", tokenizedEvent=");
        sb2.append(tVar);
        sb2.append(", shouldHideProgressBar=");
        sb2.append(z11);
        sb2.append(", timerDeadline=");
        sb2.append(l11);
        sb2.append(", resetState=");
        return Pk0.a.a(")", sb2, z12);
    }

    public /* synthetic */ DeliveryWidgetV3VO(long j11, d dVar, TextDTO textDTO, TextDTO textDTO2, CommonAtomIconDTO commonAtomIconDTO, int i11, int i12, int i13, int i14, int i15, int i16, AtomAction atomAction, long j12, int i17, String str, String str2, String str3, String str4, t tVar, boolean z11, Long l11, boolean z12, int i18, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, dVar, textDTO, textDTO2, commonAtomIconDTO, i11, i12, i13, i14, i15, i16, atomAction, j12, i17, str, str2, str3, str4, tVar, z11, (i18 & 1048576) != 0 ? null : l11, (i18 & 2097152) != 0 ? true : z12);
    }
}

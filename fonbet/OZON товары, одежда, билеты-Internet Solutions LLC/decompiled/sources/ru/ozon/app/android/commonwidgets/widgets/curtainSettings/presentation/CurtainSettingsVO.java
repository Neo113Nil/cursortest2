package ru.ozon.app.android.commonwidgets.widgets.curtainSettings.presentation;

import Ak.C2436a;
import B0.C2454a;
import Bl.b;
import Kk.C3532b;
import Nh.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0089\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u000e\u0010\u0017\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b(\u0010'R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010\u001bR\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b+\u0010\u001bR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b,\u0010\u001bR\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b-\u0010'R\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b.\u0010'R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b3\u0010\u001dR\u0017\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010%\u001a\u0004\b4\u0010'R\u0017\u0010\u0012\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010%\u001a\u0004\b5\u0010'R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00106\u001a\u0004\b7\u00108R\u001f\u0010\u0017\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u00109\u001a\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtainSettings/presentation/CurtainSettingsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "showCloseButton", "scrollableContent", "", "containerBackgroundColor", "closeButtonBgColor", "closeButtonIconColor", "allowResizeByGesture", "showHandle", "", "minHeight", "heightMode", "wrapContent", "cancelable", "Lru/ozon/uni/atoms/af/AtomAction;", "onCloseAction", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "trackingInfo", "<init>", "(JZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/Integer;IZZLru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Z", "getShowCloseButton", "()Z", "getScrollableContent", "Ljava/lang/String;", "getContainerBackgroundColor", "getCloseButtonBgColor", "getCloseButtonIconColor", "getAllowResizeByGesture", "getShowHandle", "Ljava/lang/Integer;", "getMinHeight", "()Ljava/lang/Integer;", "I", "getHeightMode", "getWrapContent", "getCancelable", "Lru/ozon/uni/atoms/af/AtomAction;", "getOnCloseAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTrackingInfo", "()LWZ/t;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CurtainSettingsVO implements c {
    private final boolean allowResizeByGesture;
    private final boolean cancelable;
    private final String closeButtonBgColor;
    private final String closeButtonIconColor;
    private final String containerBackgroundColor;
    private final int heightMode;
    private final long id;
    private final Integer minHeight;
    private final AtomAction onCloseAction;
    private final boolean scrollableContent;
    private final boolean showCloseButton;
    private final boolean showHandle;
    private final t trackingInfo;
    private final boolean wrapContent;

    public CurtainSettingsVO(long j11, boolean z11, boolean z12, String str, String str2, String str3, boolean z13, boolean z14, Integer num, int i11, boolean z15, boolean z16, AtomAction atomAction, t tVar) {
        this.id = j11;
        this.showCloseButton = z11;
        this.scrollableContent = z12;
        this.containerBackgroundColor = str;
        this.closeButtonBgColor = str2;
        this.closeButtonIconColor = str3;
        this.allowResizeByGesture = z13;
        this.showHandle = z14;
        this.minHeight = num;
        this.heightMode = i11;
        this.wrapContent = z15;
        this.cancelable = z16;
        this.onCloseAction = atomAction;
        this.trackingInfo = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurtainSettingsVO)) {
            return false;
        }
        CurtainSettingsVO curtainSettingsVO = (CurtainSettingsVO) other;
        return this.id == curtainSettingsVO.id && this.showCloseButton == curtainSettingsVO.showCloseButton && this.scrollableContent == curtainSettingsVO.scrollableContent && Intrinsics.d(this.containerBackgroundColor, curtainSettingsVO.containerBackgroundColor) && Intrinsics.d(this.closeButtonBgColor, curtainSettingsVO.closeButtonBgColor) && Intrinsics.d(this.closeButtonIconColor, curtainSettingsVO.closeButtonIconColor) && this.allowResizeByGesture == curtainSettingsVO.allowResizeByGesture && this.showHandle == curtainSettingsVO.showHandle && Intrinsics.d(this.minHeight, curtainSettingsVO.minHeight) && this.heightMode == curtainSettingsVO.heightMode && this.wrapContent == curtainSettingsVO.wrapContent && this.cancelable == curtainSettingsVO.cancelable && Intrinsics.d(this.onCloseAction, curtainSettingsVO.onCloseAction) && Intrinsics.d(this.trackingInfo, curtainSettingsVO.trackingInfo);
    }

    public final boolean getAllowResizeByGesture() {
        return this.allowResizeByGesture;
    }

    public final boolean getCancelable() {
        return this.cancelable;
    }

    public final String getCloseButtonBgColor() {
        return this.closeButtonBgColor;
    }

    public final String getCloseButtonIconColor() {
        return this.closeButtonIconColor;
    }

    public final String getContainerBackgroundColor() {
        return this.containerBackgroundColor;
    }

    public final int getHeightMode() {
        return this.heightMode;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final Integer getMinHeight() {
        return this.minHeight;
    }

    public final AtomAction getOnCloseAction() {
        return this.onCloseAction;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final boolean getScrollableContent() {
        return this.scrollableContent;
    }

    public final boolean getShowCloseButton() {
        return this.showCloseButton;
    }

    public final boolean getShowHandle() {
        return this.showHandle;
    }

    public final t getTrackingInfo() {
        return this.trackingInfo;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public final boolean getWrapContent() {
        return this.wrapContent;
    }

    public int hashCode() {
        int a11 = C3532b.a(C3532b.a(Long.hashCode(this.id) * 31, 31, this.showCloseButton), 31, this.scrollableContent);
        String str = this.containerBackgroundColor;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.closeButtonBgColor;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.closeButtonIconColor;
        int a12 = C3532b.a(C3532b.a((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.allowResizeByGesture), 31, this.showHandle);
        Integer num = this.minHeight;
        int a13 = C3532b.a(C3532b.a(C2454a.a(this.heightMode, (a12 + (num == null ? 0 : num.hashCode())) * 31, 31), 31, this.wrapContent), 31, this.cancelable);
        AtomAction atomAction = this.onCloseAction;
        int hashCode3 = (a13 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.trackingInfo;
        return hashCode3 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        boolean z11 = this.showCloseButton;
        boolean z12 = this.scrollableContent;
        String str = this.containerBackgroundColor;
        String str2 = this.closeButtonBgColor;
        String str3 = this.closeButtonIconColor;
        boolean z13 = this.allowResizeByGesture;
        boolean z14 = this.showHandle;
        Integer num = this.minHeight;
        int i11 = this.heightMode;
        boolean z15 = this.wrapContent;
        boolean z16 = this.cancelable;
        AtomAction atomAction = this.onCloseAction;
        t tVar = this.trackingInfo;
        StringBuilder c11 = b.c(j11, "CurtainSettingsVO(id=", ", showCloseButton=", z11);
        c11.append(", scrollableContent=");
        c11.append(z12);
        c11.append(", containerBackgroundColor=");
        c11.append(str);
        a.h(c11, ", closeButtonBgColor=", str2, ", closeButtonIconColor=", str3);
        C2436a.e(", allowResizeByGesture=", ", showHandle=", c11, z13, z14);
        c11.append(", minHeight=");
        c11.append(num);
        c11.append(", heightMode=");
        c11.append(i11);
        C2436a.e(", wrapContent=", ", cancelable=", c11, z15, z16);
        Fj.c.e(tVar, ", onCloseAction=", ", trackingInfo=", c11, atomAction);
        c11.append(")");
        return c11.toString();
    }
}

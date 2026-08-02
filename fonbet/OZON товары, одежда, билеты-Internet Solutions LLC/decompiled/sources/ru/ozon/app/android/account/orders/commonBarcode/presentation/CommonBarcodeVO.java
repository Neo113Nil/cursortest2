package ru.ozon.app.android.account.orders.commonBarcode.presentation;

import Ak.C2436a;
import G.g;
import Nh.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0081\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b!\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b\"\u0010\u0014R%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b-\u0010\u0016¨\u0006."}, d2 = {"Lru/ozon/app/android/account/orders/commonBarcode/presentation/CommonBarcodeVO;", "Ll20/c;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "code", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "description", "", "subtitleTextStyle", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/texts/TextAtom;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTitle", "getSubtitle", "getCode", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDescription", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "I", "getSubtitleTextStyle", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CommonBarcodeVO implements c {
    private final AtomAction action;

    @NotNull
    private final String code;
    private final TextAtom description;
    private final long id;

    @NotNull
    private final String subtitle;
    private final int subtitleTextStyle;

    @NotNull
    private final String title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public CommonBarcodeVO(long j11, @NotNull String title, @NotNull String subtitle, @NotNull String code, Map<String, TokenizedTrackingInfo> map, AtomAction atomAction, TextAtom textAtom, int i11) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(code, "code");
        this.id = j11;
        this.title = title;
        this.subtitle = subtitle;
        this.code = code;
        this.trackingInfo = map;
        this.action = atomAction;
        this.description = textAtom;
        this.subtitleTextStyle = i11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonBarcodeVO)) {
            return false;
        }
        CommonBarcodeVO commonBarcodeVO = (CommonBarcodeVO) other;
        return this.id == commonBarcodeVO.id && Intrinsics.d(this.title, commonBarcodeVO.title) && Intrinsics.d(this.subtitle, commonBarcodeVO.subtitle) && Intrinsics.d(this.code, commonBarcodeVO.code) && Intrinsics.d(this.trackingInfo, commonBarcodeVO.trackingInfo) && Intrinsics.d(this.action, commonBarcodeVO.action) && Intrinsics.d(this.description, commonBarcodeVO.description) && this.subtitleTextStyle == commonBarcodeVO.subtitleTextStyle;
    }

    public final AtomAction getAction() {
        return this.action;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    public final TextAtom getDescription() {
        return this.description;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final int getSubtitleTextStyle() {
        return this.subtitleTextStyle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a(g.a(g.a(Long.hashCode(this.id) * 31, 31, this.title), 31, this.subtitle), 31, this.code);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode = (a11 + (map == null ? 0 : map.hashCode())) * 31;
        AtomAction atomAction = this.action;
        int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        TextAtom textAtom = this.description;
        return Integer.hashCode(this.subtitleTextStyle) + ((hashCode2 + (textAtom != null ? textAtom.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.code;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        AtomAction atomAction = this.action;
        TextAtom textAtom = this.description;
        int i11 = this.subtitleTextStyle;
        StringBuilder c11 = C2436a.c(j11, "CommonBarcodeVO(id=", ", title=", str);
        a.h(c11, ", subtitle=", str2, ", code=", str3);
        c11.append(", trackingInfo=");
        c11.append(map);
        c11.append(", action=");
        c11.append(atomAction);
        c11.append(", description=");
        c11.append(textAtom);
        c11.append(", subtitleTextStyle=");
        c11.append(i11);
        c11.append(")");
        return c11.toString();
    }
}

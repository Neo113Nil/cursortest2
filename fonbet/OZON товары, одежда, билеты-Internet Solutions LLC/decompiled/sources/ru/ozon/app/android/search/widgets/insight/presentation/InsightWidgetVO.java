package ru.ozon.app.android.search.widgets.insight.presentation;

import Ak.C2436a;
import Lh.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.insight.data.InsightDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002Bc\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u000e\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b'\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b(\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b0\u00101R\u001f\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00102\u001a\u0004\b3\u00104¨\u00065"}, d2 = {"Lru/ozon/app/android/search/widgets/insight/presentation/InsightWidgetVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "backgroundColor", "", "borderRadius", "marginTop", "marginBottom", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/search/widgets/insight/data/InsightDTO$FooterDTO;", CommentV3DTO.FOOTER_FIELD_NAME, "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "deleteErrorNotification", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/search/widgets/insight/data/InsightDTO$FooterDTO;Lru/ozon/uni/atoms/data/notification/NotificationDTO;LWZ/t;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getBackgroundColor", "Ljava/lang/Integer;", "getBorderRadius", "()Ljava/lang/Integer;", "getMarginTop", "getMarginBottom", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getHeader", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Lru/ozon/app/android/search/widgets/insight/data/InsightDTO$FooterDTO;", "getFooter", "()Lru/ozon/app/android/search/widgets/insight/data/InsightDTO$FooterDTO;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getDeleteErrorNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class InsightWidgetVO implements c {
    private final String backgroundColor;
    private final Integer borderRadius;

    @NotNull
    private final NotificationDTO deleteErrorNotification;
    private final InsightDTO.FooterDTO footer;
    private final CellDTO header;
    private final long id;
    private final Integer marginBottom;
    private final Integer marginTop;
    private final t tokenizedEvent;

    public InsightWidgetVO(long j11, String str, Integer num, Integer num2, Integer num3, CellDTO cellDTO, InsightDTO.FooterDTO footerDTO, @NotNull NotificationDTO deleteErrorNotification, t tVar) {
        Intrinsics.checkNotNullParameter(deleteErrorNotification, "deleteErrorNotification");
        this.id = j11;
        this.backgroundColor = str;
        this.borderRadius = num;
        this.marginTop = num2;
        this.marginBottom = num3;
        this.header = cellDTO;
        this.footer = footerDTO;
        this.deleteErrorNotification = deleteErrorNotification;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InsightWidgetVO)) {
            return false;
        }
        InsightWidgetVO insightWidgetVO = (InsightWidgetVO) other;
        return this.id == insightWidgetVO.id && Intrinsics.d(this.backgroundColor, insightWidgetVO.backgroundColor) && Intrinsics.d(this.borderRadius, insightWidgetVO.borderRadius) && Intrinsics.d(this.marginTop, insightWidgetVO.marginTop) && Intrinsics.d(this.marginBottom, insightWidgetVO.marginBottom) && Intrinsics.d(this.header, insightWidgetVO.header) && Intrinsics.d(this.footer, insightWidgetVO.footer) && Intrinsics.d(this.deleteErrorNotification, insightWidgetVO.deleteErrorNotification) && Intrinsics.d(this.tokenizedEvent, insightWidgetVO.tokenizedEvent);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Integer getBorderRadius() {
        return this.borderRadius;
    }

    @NotNull
    public final NotificationDTO getDeleteErrorNotification() {
        return this.deleteErrorNotification;
    }

    public final InsightDTO.FooterDTO getFooter() {
        return this.footer;
    }

    public final CellDTO getHeader() {
        return this.header;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final Integer getMarginBottom() {
        return this.marginBottom;
    }

    public final Integer getMarginTop() {
        return this.marginTop;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.borderRadius;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.marginTop;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.marginBottom;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        CellDTO cellDTO = this.header;
        int hashCode6 = (hashCode5 + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31;
        InsightDTO.FooterDTO footerDTO = this.footer;
        int hashCode7 = (this.deleteErrorNotification.hashCode() + ((hashCode6 + (footerDTO == null ? 0 : footerDTO.hashCode())) * 31)) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode7 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.backgroundColor;
        Integer num = this.borderRadius;
        Integer num2 = this.marginTop;
        Integer num3 = this.marginBottom;
        CellDTO cellDTO = this.header;
        InsightDTO.FooterDTO footerDTO = this.footer;
        NotificationDTO notificationDTO = this.deleteErrorNotification;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = C2436a.c(j11, "InsightWidgetVO(id=", ", backgroundColor=", str);
        c11.append(", borderRadius=");
        c11.append(num);
        c11.append(", marginTop=");
        c11.append(num2);
        c11.append(", marginBottom=");
        c11.append(num3);
        c11.append(", header=");
        c11.append(cellDTO);
        c11.append(", footer=");
        c11.append(footerDTO);
        c11.append(", deleteErrorNotification=");
        c11.append(notificationDTO);
        return a.b(c11, ", tokenizedEvent=", tVar, ")");
    }
}

package ru.ozon.app.android.storefront.widgets.naviGrid3.presentation;

import Ak.C2436a;
import G.g;
import Lh.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002BM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b\"\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+R\u001f\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010/\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b/\u0010&\u001a\u0004\b0\u0010(¨\u00061"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviGrid3/presentation/NaviGrid3ItemVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "image", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/storefront/widgets/naviGrid3/presentation/CornerLabel;", "label", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lru/ozon/app/android/storefront/widgets/naviGrid3/presentation/CornerLabel;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getImage", "getTitle", "Lru/ozon/app/android/storefront/widgets/naviGrid3/presentation/CornerLabel;", "getLabel", "()Lru/ozon/app/android/storefront/widgets/naviGrid3/presentation/CornerLabel;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "badgeAction", "getBadgeAction", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NaviGrid3ItemVO implements c {
    private final AtomAction action;
    private final BadgeDTO badge;
    private final AtomAction badgeAction;
    private final long id;

    @NotNull
    private final String image;
    private final CornerLabel label;

    @NotNull
    private final String title;
    private final t tokenizedEvent;

    public NaviGrid3ItemVO(long j11, @NotNull String image, @NotNull String title, CornerLabel cornerLabel, AtomAction atomAction, BadgeDTO badgeDTO, t tVar) {
        CommonControlSettings common;
        AtomActionDTO action;
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = j11;
        this.image = image;
        this.title = title;
        this.label = cornerLabel;
        this.action = atomAction;
        this.badge = badgeDTO;
        this.tokenizedEvent = tVar;
        AtomAction atomAction2 = null;
        atomAction2 = null;
        atomAction2 = null;
        if (badgeDTO != null && (common = badgeDTO.getCommon()) != null && (action = common.getAction()) != null) {
            CommonControlSettings common2 = badgeDTO.getCommon();
            atomAction2 = AtomActionMapperKt.toAtomAction(action, common2 != null ? common2.getTrackingInfo() : null);
        }
        this.badgeAction = atomAction2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NaviGrid3ItemVO)) {
            return false;
        }
        NaviGrid3ItemVO naviGrid3ItemVO = (NaviGrid3ItemVO) other;
        return this.id == naviGrid3ItemVO.id && Intrinsics.d(this.image, naviGrid3ItemVO.image) && Intrinsics.d(this.title, naviGrid3ItemVO.title) && Intrinsics.d(this.label, naviGrid3ItemVO.label) && Intrinsics.d(this.action, naviGrid3ItemVO.action) && Intrinsics.d(this.badge, naviGrid3ItemVO.badge) && Intrinsics.d(this.tokenizedEvent, naviGrid3ItemVO.tokenizedEvent);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    public final AtomAction getBadgeAction() {
        return this.badgeAction;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    public final CornerLabel getLabel() {
        return this.label;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final String getTitle() {
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
        int a11 = g.a(g.a(Long.hashCode(this.id) * 31, 31, this.image), 31, this.title);
        CornerLabel cornerLabel = this.label;
        int hashCode = (a11 + (cornerLabel == null ? 0 : cornerLabel.hashCode())) * 31;
        AtomAction atomAction = this.action;
        int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        BadgeDTO badgeDTO = this.badge;
        int hashCode3 = (hashCode2 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode3 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.image;
        String str2 = this.title;
        CornerLabel cornerLabel = this.label;
        AtomAction atomAction = this.action;
        BadgeDTO badgeDTO = this.badge;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = C2436a.c(j11, "NaviGrid3ItemVO(id=", ", image=", str);
        c11.append(", title=");
        c11.append(str2);
        c11.append(", label=");
        c11.append(cornerLabel);
        c11.append(", action=");
        c11.append(atomAction);
        c11.append(", badge=");
        c11.append(badgeDTO);
        return a.b(c11, ", tokenizedEvent=", tVar, ")");
    }
}

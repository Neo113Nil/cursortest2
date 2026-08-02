package ru.ozon.app.android.pdp.widgets.badgeList.presentation;

import G.g;
import Lh.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetPlaceholderViewObject;
import ru.ozon.uni.atoms.data.badge.Badge;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b#\u0010\u0010¨\u0006$"}, d2 = {"Lru/ozon/app/android/pdp/widgets/badgeList/presentation/BadgeListVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetPlaceholderViewObject;", "", "id", "", "Lru/ozon/uni/atoms/data/badge/Badge;", "badges", "LWZ/t;", "tokenizedEvent", "", "json", "<init>", "(JLjava/util/List;LWZ/t;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getBadges", "()Ljava/util/List;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Ljava/lang/String;", "getJson", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BadgeListVO implements c, WidgetPlaceholderViewObject {

    @NotNull
    private final List<Badge> badges;
    private final long id;

    @NotNull
    private final String json;
    private final t tokenizedEvent;

    public BadgeListVO(long j11, @NotNull List<Badge> badges, t tVar, @NotNull String json) {
        Intrinsics.checkNotNullParameter(badges, "badges");
        Intrinsics.checkNotNullParameter(json, "json");
        this.id = j11;
        this.badges = badges;
        this.tokenizedEvent = tVar;
        this.json = json;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BadgeListVO)) {
            return false;
        }
        BadgeListVO badgeListVO = (BadgeListVO) other;
        return this.id == badgeListVO.id && Intrinsics.d(this.badges, badgeListVO.badges) && Intrinsics.d(this.tokenizedEvent, badgeListVO.tokenizedEvent) && Intrinsics.d(this.json, badgeListVO.json);
    }

    @NotNull
    public final List<Badge> getBadges() {
        return this.badges;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetPlaceholderViewObject
    @NotNull
    public String getJson() {
        return this.json;
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
        int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.badges);
        t tVar = this.tokenizedEvent;
        return this.json.hashCode() + ((b11 + (tVar == null ? 0 : tVar.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<Badge> list = this.badges;
        t tVar = this.tokenizedEvent;
        String str = this.json;
        StringBuilder b11 = b.b(j11, "BadgeListVO(id=", ", badges=", list);
        b11.append(", tokenizedEvent=");
        b11.append(tVar);
        b11.append(", json=");
        b11.append(str);
        b11.append(")");
        return b11.toString();
    }
}

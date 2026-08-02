package ru.ozon.app.android.pdp.widgets.badgeListV2.presentation;

import B0.A0;
import B0.C2454a;
import G.g;
import Lh.b;
import WZ.t;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetPlaceholderViewObject;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003BK\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010\u0015R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b)\u0010\u0017R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b*\u0010\u0017R$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00060"}, d2 = {"Lru/ozon/app/android/pdp/widgets/badgeListV2/presentation/BadgeListV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetPlaceholderViewObject;", "", "id", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badges", "LWZ/t;", "tokenizedEvent", "", "json", "", "inset", "spacedBy", "Landroid/os/Parcelable;", "scrollState", "<init>", "(JLjava/util/List;LWZ/t;Ljava/lang/String;IILandroid/os/Parcelable;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getBadges", "()Ljava/util/List;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Ljava/lang/String;", "getJson", "I", "getInset", "getSpacedBy", "Landroid/os/Parcelable;", "getScrollState", "()Landroid/os/Parcelable;", "setScrollState", "(Landroid/os/Parcelable;)V", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BadgeListV2VO implements c, WidgetPlaceholderViewObject {

    @NotNull
    private final List<BadgeDTO> badges;
    private final long id;
    private final int inset;

    @NotNull
    private final String json;
    private Parcelable scrollState;
    private final int spacedBy;
    private final t tokenizedEvent;

    public BadgeListV2VO(long j11, @NotNull List<BadgeDTO> badges, t tVar, @NotNull String json, int i11, int i12, Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(badges, "badges");
        Intrinsics.checkNotNullParameter(json, "json");
        this.id = j11;
        this.badges = badges;
        this.tokenizedEvent = tVar;
        this.json = json;
        this.inset = i11;
        this.spacedBy = i12;
        this.scrollState = parcelable;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BadgeListV2VO)) {
            return false;
        }
        BadgeListV2VO badgeListV2VO = (BadgeListV2VO) other;
        return this.id == badgeListV2VO.id && Intrinsics.d(this.badges, badgeListV2VO.badges) && Intrinsics.d(this.tokenizedEvent, badgeListV2VO.tokenizedEvent) && Intrinsics.d(this.json, badgeListV2VO.json) && this.inset == badgeListV2VO.inset && this.spacedBy == badgeListV2VO.spacedBy && Intrinsics.d(this.scrollState, badgeListV2VO.scrollState);
    }

    @NotNull
    public final List<BadgeDTO> getBadges() {
        return this.badges;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final int getInset() {
        return this.inset;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetPlaceholderViewObject
    @NotNull
    public String getJson() {
        return this.json;
    }

    public final Parcelable getScrollState() {
        return this.scrollState;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final int getSpacedBy() {
        return this.spacedBy;
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
        int a11 = C2454a.a(this.spacedBy, C2454a.a(this.inset, g.a((b11 + (tVar == null ? 0 : tVar.hashCode())) * 31, 31, this.json), 31), 31);
        Parcelable parcelable = this.scrollState;
        return a11 + (parcelable != null ? parcelable.hashCode() : 0);
    }

    public final void setScrollState(Parcelable parcelable) {
        this.scrollState = parcelable;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<BadgeDTO> list = this.badges;
        t tVar = this.tokenizedEvent;
        String str = this.json;
        int i11 = this.inset;
        int i12 = this.spacedBy;
        Parcelable parcelable = this.scrollState;
        StringBuilder b11 = b.b(j11, "BadgeListV2VO(id=", ", badges=", list);
        b11.append(", tokenizedEvent=");
        b11.append(tVar);
        b11.append(", json=");
        b11.append(str);
        A0.c(i11, i12, ", inset=", ", spacedBy=", b11);
        b11.append(", scrollState=");
        b11.append(parcelable);
        b11.append(")");
        return b11.toString();
    }

    public /* synthetic */ BadgeListV2VO(long j11, List list, t tVar, String str, int i11, int i12, Parcelable parcelable, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, list, tVar, str, i11, i12, (i13 & 64) != 0 ? null : parcelable);
    }
}

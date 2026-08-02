package ru.ozon.app.android.travel.feature.general.services.widgets.supportPremiumCellsWithHeader.presentation;

import Ak.C2436a;
import Bi.a;
import G.g;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0081\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b'\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b.\u0010-R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b/\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b0\u0010-R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\b2\u00103R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010%\u001a\u0004\b7\u0010\u0019R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u00108\u001a\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/supportPremiumCellsWithHeader/presentation/SupportPremiumCellsWithHeaderVI;", "Ll20/c;", "", "id", "", "backgroundColor", "backgroundImage", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "Lru/ozon/uni/atoms/data/text/TextDTO;", "titleLeft", "titleMid", "titleRightImage", "subtitle", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cells", "cellsBackgroundColor", "LWZ/t;", "tokenizedEvent", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/List;Ljava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getBackgroundColor", "getBackgroundImage", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitleLeft", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitleMid", "getTitleRightImage", "getSubtitle", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Ljava/util/List;", "getCells", "()Ljava/util/List;", "getCellsBackgroundColor", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SupportPremiumCellsWithHeaderVI implements c {

    @NotNull
    private final String backgroundColor;
    private final String backgroundImage;
    private final BadgeDTO badge;

    @NotNull
    private final List<CellDTO> cells;
    private final String cellsBackgroundColor;
    private final long id;
    private final ImageDTO image;
    private final TextDTO subtitle;
    private final TextDTO titleLeft;
    private final TextDTO titleMid;
    private final ImageDTO titleRightImage;
    private final t tokenizedEvent;

    public SupportPremiumCellsWithHeaderVI(long j11, @NotNull String backgroundColor, String str, ImageDTO imageDTO, TextDTO textDTO, TextDTO textDTO2, ImageDTO imageDTO2, TextDTO textDTO3, BadgeDTO badgeDTO, @NotNull List<CellDTO> cells, String str2, t tVar) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(cells, "cells");
        this.id = j11;
        this.backgroundColor = backgroundColor;
        this.backgroundImage = str;
        this.image = imageDTO;
        this.titleLeft = textDTO;
        this.titleMid = textDTO2;
        this.titleRightImage = imageDTO2;
        this.subtitle = textDTO3;
        this.badge = badgeDTO;
        this.cells = cells;
        this.cellsBackgroundColor = str2;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportPremiumCellsWithHeaderVI)) {
            return false;
        }
        SupportPremiumCellsWithHeaderVI supportPremiumCellsWithHeaderVI = (SupportPremiumCellsWithHeaderVI) other;
        return this.id == supportPremiumCellsWithHeaderVI.id && Intrinsics.d(this.backgroundColor, supportPremiumCellsWithHeaderVI.backgroundColor) && Intrinsics.d(this.backgroundImage, supportPremiumCellsWithHeaderVI.backgroundImage) && Intrinsics.d(this.image, supportPremiumCellsWithHeaderVI.image) && Intrinsics.d(this.titleLeft, supportPremiumCellsWithHeaderVI.titleLeft) && Intrinsics.d(this.titleMid, supportPremiumCellsWithHeaderVI.titleMid) && Intrinsics.d(this.titleRightImage, supportPremiumCellsWithHeaderVI.titleRightImage) && Intrinsics.d(this.subtitle, supportPremiumCellsWithHeaderVI.subtitle) && Intrinsics.d(this.badge, supportPremiumCellsWithHeaderVI.badge) && Intrinsics.d(this.cells, supportPremiumCellsWithHeaderVI.cells) && Intrinsics.d(this.cellsBackgroundColor, supportPremiumCellsWithHeaderVI.cellsBackgroundColor) && Intrinsics.d(this.tokenizedEvent, supportPremiumCellsWithHeaderVI.tokenizedEvent);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    @NotNull
    public final List<CellDTO> getCells() {
        return this.cells;
    }

    public final String getCellsBackgroundColor() {
        return this.cellsBackgroundColor;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final ImageDTO getImage() {
        return this.image;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public final TextDTO getTitleLeft() {
        return this.titleLeft;
    }

    public final TextDTO getTitleMid() {
        return this.titleMid;
    }

    public final ImageDTO getTitleRightImage() {
        return this.titleRightImage;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a(Long.hashCode(this.id) * 31, 31, this.backgroundColor);
        String str = this.backgroundImage;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        ImageDTO imageDTO = this.image;
        int hashCode2 = (hashCode + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31;
        TextDTO textDTO = this.titleLeft;
        int hashCode3 = (hashCode2 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        TextDTO textDTO2 = this.titleMid;
        int hashCode4 = (hashCode3 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        ImageDTO imageDTO2 = this.titleRightImage;
        int hashCode5 = (hashCode4 + (imageDTO2 == null ? 0 : imageDTO2.hashCode())) * 31;
        TextDTO textDTO3 = this.subtitle;
        int hashCode6 = (hashCode5 + (textDTO3 == null ? 0 : textDTO3.hashCode())) * 31;
        BadgeDTO badgeDTO = this.badge;
        int b11 = g.b((hashCode6 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31, 31, this.cells);
        String str2 = this.cellsBackgroundColor;
        int hashCode7 = (b11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode7 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.backgroundColor;
        String str2 = this.backgroundImage;
        ImageDTO imageDTO = this.image;
        TextDTO textDTO = this.titleLeft;
        TextDTO textDTO2 = this.titleMid;
        ImageDTO imageDTO2 = this.titleRightImage;
        TextDTO textDTO3 = this.subtitle;
        BadgeDTO badgeDTO = this.badge;
        List<CellDTO> list = this.cells;
        String str3 = this.cellsBackgroundColor;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = C2436a.c(j11, "SupportPremiumCellsWithHeaderVI(id=", ", backgroundColor=", str);
        c11.append(", backgroundImage=");
        c11.append(str2);
        c11.append(", image=");
        c11.append(imageDTO);
        D3.g.i(", titleLeft=", ", titleMid=", c11, textDTO, textDTO2);
        c11.append(", titleRightImage=");
        c11.append(imageDTO2);
        c11.append(", subtitle=");
        c11.append(textDTO3);
        c11.append(", badge=");
        c11.append(badgeDTO);
        c11.append(", cells=");
        c11.append(list);
        a.f(c11, ", cellsBackgroundColor=", str3, ", tokenizedEvent=", tVar);
        c11.append(")");
        return c11.toString();
    }
}

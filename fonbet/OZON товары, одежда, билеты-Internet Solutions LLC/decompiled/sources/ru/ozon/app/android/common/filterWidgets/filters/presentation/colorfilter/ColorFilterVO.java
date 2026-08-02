package ru.ozon.app.android.common.filterWidgets.filters.presentation.colorfilter;

import Ak.C2436a;
import D40.a;
import De.C2860c;
import G.g;
import Kk.C3532b;
import WZ.t;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.color.ColorAtom;
import ru.ozon.app.android.common.filterWidgets.filters.data.FiltersDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b%\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002B¯\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u000e\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0013\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\u001b2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u00102R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u00105R%\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b7\u00108R\u001f\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010<\u001a\u0004\b=\u0010>R\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010?\u001a\u0004\b@\u0010AR\u001f\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0017\u0010?\u001a\u0004\bB\u0010AR\u001f\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0019\u0010?\u001a\u0004\bC\u0010AR\u0017\u0010\u001a\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010.\u001a\u0004\bD\u0010#R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010\u001d\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010E\u001a\u0004\bH\u0010GR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010I\u001a\u0004\bJ\u0010K¨\u0006L"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/colorfilter/ColorFilterVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/button/Icon;", "icon", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "rightButton", "", "Lru/ozon/app/android/atoms/data/color/ColorAtom;", "colors", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$ColorIcon;", "colorIcons", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$ColorAspect;", "colorAspects", "originalUrl", "", "showSeparator", "scrollEnabled", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "rightIcon", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;LWZ/t;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZZLru/ozon/uni/atoms/data/icon/IconDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTitle", "Lru/ozon/uni/atoms/data/button/Icon;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "getRightButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "Ljava/util/List;", "getColors", "()Ljava/util/List;", "getColorIcons", "getColorAspects", "getOriginalUrl", "Z", "getShowSeparator", "()Z", "getScrollEnabled", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getRightIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ColorFilterVO implements c {
    private final AtomActionDTO action;
    private final List<FiltersDTO.ColorAspect> colorAspects;
    private final List<FiltersDTO.ColorIcon> colorIcons;
    private final List<ColorAtom> colors;
    private final Icon icon;
    private final long id;

    @NotNull
    private final String originalUrl;
    private final ButtonV3Atom.LargeBorderlessButton rightButton;
    private final IconDTO rightIcon;
    private final boolean scrollEnabled;
    private final boolean showSeparator;
    private final String title;
    private final t tokenizedEvent;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public ColorFilterVO(long j11, String str, Icon icon, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, t tVar, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, List<ColorAtom> list, List<FiltersDTO.ColorIcon> list2, List<FiltersDTO.ColorAspect> list3, @NotNull String originalUrl, boolean z11, boolean z12, IconDTO iconDTO) {
        Intrinsics.checkNotNullParameter(originalUrl, "originalUrl");
        this.id = j11;
        this.title = str;
        this.icon = icon;
        this.action = atomActionDTO;
        this.trackingInfo = map;
        this.tokenizedEvent = tVar;
        this.rightButton = largeBorderlessButton;
        this.colors = list;
        this.colorIcons = list2;
        this.colorAspects = list3;
        this.originalUrl = originalUrl;
        this.showSeparator = z11;
        this.scrollEnabled = z12;
        this.rightIcon = iconDTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ColorFilterVO)) {
            return false;
        }
        ColorFilterVO colorFilterVO = (ColorFilterVO) other;
        return this.id == colorFilterVO.id && Intrinsics.d(this.title, colorFilterVO.title) && Intrinsics.d(this.icon, colorFilterVO.icon) && Intrinsics.d(this.action, colorFilterVO.action) && Intrinsics.d(this.trackingInfo, colorFilterVO.trackingInfo) && Intrinsics.d(this.tokenizedEvent, colorFilterVO.tokenizedEvent) && Intrinsics.d(this.rightButton, colorFilterVO.rightButton) && Intrinsics.d(this.colors, colorFilterVO.colors) && Intrinsics.d(this.colorIcons, colorFilterVO.colorIcons) && Intrinsics.d(this.colorAspects, colorFilterVO.colorAspects) && Intrinsics.d(this.originalUrl, colorFilterVO.originalUrl) && this.showSeparator == colorFilterVO.showSeparator && this.scrollEnabled == colorFilterVO.scrollEnabled && Intrinsics.d(this.rightIcon, colorFilterVO.rightIcon);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final List<FiltersDTO.ColorAspect> getColorAspects() {
        return this.colorAspects;
    }

    public final List<FiltersDTO.ColorIcon> getColorIcons() {
        return this.colorIcons;
    }

    public final List<ColorAtom> getColors() {
        return this.colors;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getOriginalUrl() {
        return this.originalUrl;
    }

    public final ButtonV3Atom.LargeBorderlessButton getRightButton() {
        return this.rightButton;
    }

    public final IconDTO getRightIcon() {
        return this.rightIcon;
    }

    public final boolean getScrollEnabled() {
        return this.scrollEnabled;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final boolean getShowSeparator() {
        return this.showSeparator;
    }

    public final String getTitle() {
        return this.title;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Icon icon = this.icon;
        int hashCode3 = (hashCode2 + (icon == null ? 0 : icon.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode4 = (hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode6 = (hashCode5 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.rightButton;
        int hashCode7 = (hashCode6 + (largeBorderlessButton == null ? 0 : largeBorderlessButton.hashCode())) * 31;
        List<ColorAtom> list = this.colors;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        List<FiltersDTO.ColorIcon> list2 = this.colorIcons;
        int hashCode9 = (hashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<FiltersDTO.ColorAspect> list3 = this.colorAspects;
        int a11 = C3532b.a(C3532b.a(g.a((hashCode9 + (list3 == null ? 0 : list3.hashCode())) * 31, 31, this.originalUrl), 31, this.showSeparator), 31, this.scrollEnabled);
        IconDTO iconDTO = this.rightIcon;
        return a11 + (iconDTO != null ? iconDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.title;
        Icon icon = this.icon;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        t tVar = this.tokenizedEvent;
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.rightButton;
        List<ColorAtom> list = this.colors;
        List<FiltersDTO.ColorIcon> list2 = this.colorIcons;
        List<FiltersDTO.ColorAspect> list3 = this.colorAspects;
        String str2 = this.originalUrl;
        boolean z11 = this.showSeparator;
        boolean z12 = this.scrollEnabled;
        IconDTO iconDTO = this.rightIcon;
        StringBuilder c11 = C2436a.c(j11, "ColorFilterVO(id=", ", title=", str);
        c11.append(", icon=");
        c11.append(icon);
        c11.append(", action=");
        c11.append(atomActionDTO);
        c11.append(", trackingInfo=");
        c11.append(map);
        c11.append(", tokenizedEvent=");
        c11.append(tVar);
        c11.append(", rightButton=");
        c11.append(largeBorderlessButton);
        c11.append(", colors=");
        c11.append(list);
        C2860c.g(", colorIcons=", ", colorAspects=", c11, list2, list3);
        a.g(", originalUrl=", str2, ", showSeparator=", c11, z11);
        c11.append(", scrollEnabled=");
        c11.append(z12);
        c11.append(", rightIcon=");
        c11.append(iconDTO);
        c11.append(")");
        return c11.toString();
    }
}

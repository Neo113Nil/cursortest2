package ru.ozon.app.android.common.filterWidgets.filters.presentation.tagfilter;

import Ak.C2436a;
import D40.a;
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
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b)\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002B¡\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u000e\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0017\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00172\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u00103R%\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b5\u00106R\u001f\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010:\u001a\u0004\b;\u0010<R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u0016\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010,\u001a\u0004\b@\u0010\"R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\u001b\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u001b\u0010A\u001a\u0004\bG\u0010CR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010H\u001a\u0004\bI\u0010JR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001e\u0010H\u001a\u0004\bK\u0010JR\u0016\u0010M\u001a\u0004\u0018\u00010\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010J¨\u0006N"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/tagfilter/TagFilterVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/button/Icon;", "icon", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "rightButton", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "tags", "originalUrl", "", "hideSeparator", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "rightIcon", "scrollEnabled", "", "maxRowsCount", "totalValuesCount", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;LWZ/t;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;Ljava/util/List;Ljava/lang/String;ZLru/ozon/uni/atoms/data/icon/IconDTO;ZLjava/lang/Integer;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTitle", "Lru/ozon/uni/atoms/data/button/Icon;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "getRightButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "Ljava/util/List;", "getTags", "()Ljava/util/List;", "getOriginalUrl", "Z", "getHideSeparator", "()Z", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getRightIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getScrollEnabled", "Ljava/lang/Integer;", "getMaxRowsCount", "()Ljava/lang/Integer;", "getTotalValuesCount", "getScrollWidgetKey", "scrollWidgetKey", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TagFilterVO implements c {
    private final AtomActionDTO action;
    private final boolean hideSeparator;
    private final Icon icon;
    private final long id;
    private final Integer maxRowsCount;

    @NotNull
    private final String originalUrl;
    private final ButtonV3Atom.LargeBorderlessButton rightButton;
    private final IconDTO rightIcon;
    private final boolean scrollEnabled;

    @NotNull
    private final List<AtomDTO> tags;
    private final String title;
    private final t tokenizedEvent;
    private final Integer totalValuesCount;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public TagFilterVO(long j11, String str, Icon icon, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, t tVar, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, @NotNull List<? extends AtomDTO> tags, @NotNull String originalUrl, boolean z11, IconDTO iconDTO, boolean z12, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(originalUrl, "originalUrl");
        this.id = j11;
        this.title = str;
        this.icon = icon;
        this.action = atomActionDTO;
        this.trackingInfo = map;
        this.tokenizedEvent = tVar;
        this.rightButton = largeBorderlessButton;
        this.tags = tags;
        this.originalUrl = originalUrl;
        this.hideSeparator = z11;
        this.rightIcon = iconDTO;
        this.scrollEnabled = z12;
        this.maxRowsCount = num;
        this.totalValuesCount = num2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TagFilterVO)) {
            return false;
        }
        TagFilterVO tagFilterVO = (TagFilterVO) other;
        return this.id == tagFilterVO.id && Intrinsics.d(this.title, tagFilterVO.title) && Intrinsics.d(this.icon, tagFilterVO.icon) && Intrinsics.d(this.action, tagFilterVO.action) && Intrinsics.d(this.trackingInfo, tagFilterVO.trackingInfo) && Intrinsics.d(this.tokenizedEvent, tagFilterVO.tokenizedEvent) && Intrinsics.d(this.rightButton, tagFilterVO.rightButton) && Intrinsics.d(this.tags, tagFilterVO.tags) && Intrinsics.d(this.originalUrl, tagFilterVO.originalUrl) && this.hideSeparator == tagFilterVO.hideSeparator && Intrinsics.d(this.rightIcon, tagFilterVO.rightIcon) && this.scrollEnabled == tagFilterVO.scrollEnabled && Intrinsics.d(this.maxRowsCount, tagFilterVO.maxRowsCount) && Intrinsics.d(this.totalValuesCount, tagFilterVO.totalValuesCount);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final boolean getHideSeparator() {
        return this.hideSeparator;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final Integer getMaxRowsCount() {
        return this.maxRowsCount;
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
        String str = this.title;
        if (str != null) {
            return Integer.valueOf(str.hashCode());
        }
        return null;
    }

    @NotNull
    public final List<AtomDTO> getTags() {
        return this.tags;
    }

    public final String getTitle() {
        return this.title;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public final Integer getTotalValuesCount() {
        return this.totalValuesCount;
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
        int a11 = C3532b.a(g.a(g.b((hashCode6 + (largeBorderlessButton == null ? 0 : largeBorderlessButton.hashCode())) * 31, 31, this.tags), 31, this.originalUrl), 31, this.hideSeparator);
        IconDTO iconDTO = this.rightIcon;
        int a12 = C3532b.a((a11 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31, 31, this.scrollEnabled);
        Integer num = this.maxRowsCount;
        int hashCode7 = (a12 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.totalValuesCount;
        return hashCode7 + (num2 != null ? num2.hashCode() : 0);
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
        List<AtomDTO> list = this.tags;
        String str2 = this.originalUrl;
        boolean z11 = this.hideSeparator;
        IconDTO iconDTO = this.rightIcon;
        boolean z12 = this.scrollEnabled;
        Integer num = this.maxRowsCount;
        Integer num2 = this.totalValuesCount;
        StringBuilder c11 = C2436a.c(j11, "TagFilterVO(id=", ", title=", str);
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
        c11.append(", tags=");
        c11.append(list);
        a.g(", originalUrl=", str2, ", hideSeparator=", c11, z11);
        c11.append(", rightIcon=");
        c11.append(iconDTO);
        c11.append(", scrollEnabled=");
        c11.append(z12);
        c11.append(", maxRowsCount=");
        c11.append(num);
        c11.append(", totalValuesCount=");
        c11.append(num2);
        c11.append(")");
        return c11.toString();
    }
}

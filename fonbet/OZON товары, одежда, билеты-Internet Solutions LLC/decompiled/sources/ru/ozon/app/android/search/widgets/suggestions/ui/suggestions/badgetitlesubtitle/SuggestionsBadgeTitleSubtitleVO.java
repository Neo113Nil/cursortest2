package ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.badgetitlesubtitle;

import B4.V;
import Pk0.b;
import g.C6594f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.suggestions.ui.common.SuggestionsCommonVO;
import ru.ozon.app.android.search.widgets.suggestions.ui.common.SuggestionsTextVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00015B[\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b(\u0010'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00102\u001a\u0004\b3\u0010\u0016R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u00102\u001a\u0004\b4\u0010\u0016¨\u00066"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/badgetitlesubtitle/SuggestionsBadgeTitleSubtitleVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/search/widgets/suggestions/ui/common/SuggestionsCommonVO;", "common", "Lru/ozon/app/android/search/widgets/suggestions/ui/common/SuggestionsTextVO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/badgetitlesubtitle/SuggestionsBadgeTitleSubtitleVO$LayoutModel;", "layoutModel", "", "islandColor", "backgroundColor", "<init>", "(JLru/ozon/app/android/search/widgets/suggestions/ui/common/SuggestionsCommonVO;Lru/ozon/app/android/search/widgets/suggestions/ui/common/SuggestionsTextVO;Lru/ozon/app/android/search/widgets/suggestions/ui/common/SuggestionsTextVO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/badgetitlesubtitle/SuggestionsBadgeTitleSubtitleVO$LayoutModel;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/search/widgets/suggestions/ui/common/SuggestionsCommonVO;", "getCommon", "()Lru/ozon/app/android/search/widgets/suggestions/ui/common/SuggestionsCommonVO;", "Lru/ozon/app/android/search/widgets/suggestions/ui/common/SuggestionsTextVO;", "getTitle", "()Lru/ozon/app/android/search/widgets/suggestions/ui/common/SuggestionsTextVO;", "getSubtitle", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/badgetitlesubtitle/SuggestionsBadgeTitleSubtitleVO$LayoutModel;", "getLayoutModel", "()Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/badgetitlesubtitle/SuggestionsBadgeTitleSubtitleVO$LayoutModel;", "Ljava/lang/String;", "getIslandColor", "getBackgroundColor", "LayoutModel", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SuggestionsBadgeTitleSubtitleVO implements c {
    private final String backgroundColor;
    private final BadgeDTO badge;
    private final SuggestionsCommonVO common;
    private final IconDTO icon;
    private final long id;
    private final String islandColor;

    @NotNull
    private final LayoutModel layoutModel;
    private final SuggestionsTextVO subtitle;

    @NotNull
    private final SuggestionsTextVO title;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/badgetitlesubtitle/SuggestionsBadgeTitleSubtitleVO$LayoutModel;", "", "", "hasSeparator", "", "topCornerRadius", "bottomCornerRadius", "<init>", "(ZFF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getHasSeparator", "()Z", "F", "getTopCornerRadius", "()F", "getBottomCornerRadius", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LayoutModel {
        private final float bottomCornerRadius;
        private final boolean hasSeparator;
        private final float topCornerRadius;

        public LayoutModel() {
            this(false, 0.0f, 0.0f, 7, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LayoutModel)) {
                return false;
            }
            LayoutModel layoutModel = (LayoutModel) other;
            return this.hasSeparator == layoutModel.hasSeparator && Float.compare(this.topCornerRadius, layoutModel.topCornerRadius) == 0 && Float.compare(this.bottomCornerRadius, layoutModel.bottomCornerRadius) == 0;
        }

        public final float getBottomCornerRadius() {
            return this.bottomCornerRadius;
        }

        public final boolean getHasSeparator() {
            return this.hasSeparator;
        }

        public final float getTopCornerRadius() {
            return this.topCornerRadius;
        }

        public int hashCode() {
            return Float.hashCode(this.bottomCornerRadius) + b.a(this.topCornerRadius, Boolean.hashCode(this.hasSeparator) * 31, 31);
        }

        @NotNull
        public String toString() {
            boolean z11 = this.hasSeparator;
            float f7 = this.topCornerRadius;
            float f11 = this.bottomCornerRadius;
            StringBuilder sb2 = new StringBuilder("LayoutModel(hasSeparator=");
            sb2.append(z11);
            sb2.append(", topCornerRadius=");
            sb2.append(f7);
            sb2.append(", bottomCornerRadius=");
            return V.b(f11, ")", sb2);
        }

        public LayoutModel(boolean z11, float f7, float f11) {
            this.hasSeparator = z11;
            this.topCornerRadius = f7;
            this.bottomCornerRadius = f11;
        }

        public /* synthetic */ LayoutModel(boolean z11, float f7, float f11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? true : z11, (i11 & 2) != 0 ? 0.0f : f7, (i11 & 4) != 0 ? 0.0f : f11);
        }
    }

    public SuggestionsBadgeTitleSubtitleVO(long j11, SuggestionsCommonVO suggestionsCommonVO, @NotNull SuggestionsTextVO title, SuggestionsTextVO suggestionsTextVO, BadgeDTO badgeDTO, IconDTO iconDTO, @NotNull LayoutModel layoutModel, String str, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(layoutModel, "layoutModel");
        this.id = j11;
        this.common = suggestionsCommonVO;
        this.title = title;
        this.subtitle = suggestionsTextVO;
        this.badge = badgeDTO;
        this.icon = iconDTO;
        this.layoutModel = layoutModel;
        this.islandColor = str;
        this.backgroundColor = str2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuggestionsBadgeTitleSubtitleVO)) {
            return false;
        }
        SuggestionsBadgeTitleSubtitleVO suggestionsBadgeTitleSubtitleVO = (SuggestionsBadgeTitleSubtitleVO) other;
        return this.id == suggestionsBadgeTitleSubtitleVO.id && Intrinsics.d(this.common, suggestionsBadgeTitleSubtitleVO.common) && Intrinsics.d(this.title, suggestionsBadgeTitleSubtitleVO.title) && Intrinsics.d(this.subtitle, suggestionsBadgeTitleSubtitleVO.subtitle) && Intrinsics.d(this.badge, suggestionsBadgeTitleSubtitleVO.badge) && Intrinsics.d(this.icon, suggestionsBadgeTitleSubtitleVO.icon) && Intrinsics.d(this.layoutModel, suggestionsBadgeTitleSubtitleVO.layoutModel) && Intrinsics.d(this.islandColor, suggestionsBadgeTitleSubtitleVO.islandColor) && Intrinsics.d(this.backgroundColor, suggestionsBadgeTitleSubtitleVO.backgroundColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    public final SuggestionsCommonVO getCommon() {
        return this.common;
    }

    public final IconDTO getIcon() {
        return this.icon;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final String getIslandColor() {
        return this.islandColor;
    }

    @NotNull
    public final LayoutModel getLayoutModel() {
        return this.layoutModel;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final SuggestionsTextVO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final SuggestionsTextVO getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        SuggestionsCommonVO suggestionsCommonVO = this.common;
        int hashCode2 = (this.title.hashCode() + ((hashCode + (suggestionsCommonVO == null ? 0 : suggestionsCommonVO.hashCode())) * 31)) * 31;
        SuggestionsTextVO suggestionsTextVO = this.subtitle;
        int hashCode3 = (hashCode2 + (suggestionsTextVO == null ? 0 : suggestionsTextVO.hashCode())) * 31;
        BadgeDTO badgeDTO = this.badge;
        int hashCode4 = (hashCode3 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        IconDTO iconDTO = this.icon;
        int hashCode5 = (this.layoutModel.hashCode() + ((hashCode4 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31)) * 31;
        String str = this.islandColor;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundColor;
        return hashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        SuggestionsCommonVO suggestionsCommonVO = this.common;
        SuggestionsTextVO suggestionsTextVO = this.title;
        SuggestionsTextVO suggestionsTextVO2 = this.subtitle;
        BadgeDTO badgeDTO = this.badge;
        IconDTO iconDTO = this.icon;
        LayoutModel layoutModel = this.layoutModel;
        String str = this.islandColor;
        String str2 = this.backgroundColor;
        StringBuilder sb2 = new StringBuilder("SuggestionsBadgeTitleSubtitleVO(id=");
        sb2.append(j11);
        sb2.append(", common=");
        sb2.append(suggestionsCommonVO);
        sb2.append(", title=");
        sb2.append(suggestionsTextVO);
        sb2.append(", subtitle=");
        sb2.append(suggestionsTextVO2);
        sb2.append(", badge=");
        sb2.append(badgeDTO);
        sb2.append(", icon=");
        sb2.append(iconDTO);
        sb2.append(", layoutModel=");
        sb2.append(layoutModel);
        sb2.append(", islandColor=");
        sb2.append(str);
        return C6594f.a(", backgroundColor=", str2, ")", sb2);
    }
}

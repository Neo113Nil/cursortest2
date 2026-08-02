package ru.ozon.app.android.search.widgets.searchOnboarding.presentation;

import Gl.C3124a;
import Nh.a;
import Ns.b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002Be\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012\u0012\u000e\u0010\u0014\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b.\u0010\u0018R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b3\u00104R\u001f\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00105\u001a\u0004\b6\u00107R\u001f\u0010\u0014\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u00105\u001a\u0004\b8\u00107¨\u00069"}, d2 = {"Lru/ozon/app/android/search/widgets/searchOnboarding/presentation/SearchOnboardingVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "", "backgroundColor", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadius", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "openControl", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "trackingInfo", "crossTrackingInfo", "<init>", "(JLru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;LWZ/t;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getOpenControl", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "LWZ/t;", "getTrackingInfo", "()LWZ/t;", "getCrossTrackingInfo", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SearchOnboardingVO implements c {
    private final String backgroundColor;

    @NotNull
    private final BadgeDTO badge;
    private final CornerRadius cornerRadius;
    private final t crossTrackingInfo;
    private final long id;

    @NotNull
    private final ImageDTO image;
    private final CommonControlSettings openControl;

    @NotNull
    private final TextDTO title;
    private final t trackingInfo;

    public SearchOnboardingVO(long j11, @NotNull ImageDTO image, @NotNull TextDTO title, @NotNull BadgeDTO badge, String str, CornerRadius cornerRadius, CommonControlSettings commonControlSettings, t tVar, t tVar2) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(badge, "badge");
        this.id = j11;
        this.image = image;
        this.title = title;
        this.badge = badge;
        this.backgroundColor = str;
        this.cornerRadius = cornerRadius;
        this.openControl = commonControlSettings;
        this.trackingInfo = tVar;
        this.crossTrackingInfo = tVar2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchOnboardingVO)) {
            return false;
        }
        SearchOnboardingVO searchOnboardingVO = (SearchOnboardingVO) other;
        return this.id == searchOnboardingVO.id && Intrinsics.d(this.image, searchOnboardingVO.image) && Intrinsics.d(this.title, searchOnboardingVO.title) && Intrinsics.d(this.badge, searchOnboardingVO.badge) && Intrinsics.d(this.backgroundColor, searchOnboardingVO.backgroundColor) && this.cornerRadius == searchOnboardingVO.cornerRadius && Intrinsics.d(this.openControl, searchOnboardingVO.openControl) && Intrinsics.d(this.trackingInfo, searchOnboardingVO.trackingInfo) && Intrinsics.d(this.crossTrackingInfo, searchOnboardingVO.crossTrackingInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final BadgeDTO getBadge() {
        return this.badge;
    }

    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    public final t getCrossTrackingInfo() {
        return this.crossTrackingInfo;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final ImageDTO getImage() {
        return this.image;
    }

    public final CommonControlSettings getOpenControl() {
        return this.openControl;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final t getTrackingInfo() {
        return this.trackingInfo;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int c11 = C3124a.c(this.badge, b.a(this.title, a.b(this.image, Long.hashCode(this.id) * 31, 31), 31), 31);
        String str = this.backgroundColor;
        int hashCode = (c11 + (str == null ? 0 : str.hashCode())) * 31;
        CornerRadius cornerRadius = this.cornerRadius;
        int hashCode2 = (hashCode + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.openControl;
        int hashCode3 = (hashCode2 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
        t tVar = this.trackingInfo;
        int hashCode4 = (hashCode3 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        t tVar2 = this.crossTrackingInfo;
        return hashCode4 + (tVar2 != null ? tVar2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ImageDTO imageDTO = this.image;
        TextDTO textDTO = this.title;
        BadgeDTO badgeDTO = this.badge;
        String str = this.backgroundColor;
        CornerRadius cornerRadius = this.cornerRadius;
        CommonControlSettings commonControlSettings = this.openControl;
        t tVar = this.trackingInfo;
        t tVar2 = this.crossTrackingInfo;
        StringBuilder c11 = Nh.b.c("SearchOnboardingVO(id=", j11, ", image=", imageDTO);
        c11.append(", title=");
        c11.append(textDTO);
        c11.append(", badge=");
        c11.append(badgeDTO);
        c11.append(", backgroundColor=");
        c11.append(str);
        c11.append(", cornerRadius=");
        c11.append(cornerRadius);
        c11.append(", openControl=");
        c11.append(commonControlSettings);
        c11.append(", trackingInfo=");
        c11.append(tVar);
        return Lh.a.b(c11, ", crossTrackingInfo=", tVar2, ")");
    }
}

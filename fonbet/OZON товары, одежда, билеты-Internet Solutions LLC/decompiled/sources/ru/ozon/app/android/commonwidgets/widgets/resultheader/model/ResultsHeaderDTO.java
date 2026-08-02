package ru.ozon.app.android.commonwidgets.widgets.resultheader.model;

import G.g;
import N3.C3660k;
import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JS\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/resultheader/model/ResultsHeaderDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "actionButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "badge", "", "Lru/ozon/uni/atoms/data/badge/Badge;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Ljava/util/List;Ljava/util/Map;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getActionButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getBadge", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ResultsHeaderDTO {
    private final ButtonV3Atom.SmallIconButton actionButton;
    private final List<Badge> badge;

    @NotNull
    private final String subtitle;

    @NotNull
    private final String title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public ResultsHeaderDTO(@NotNull String title, @NotNull String subtitle, ButtonV3Atom.SmallIconButton smallIconButton, List<Badge> list, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.title = title;
        this.subtitle = subtitle;
        this.actionButton = smallIconButton;
        this.badge = list;
        this.trackingInfo = map;
    }

    public static /* synthetic */ ResultsHeaderDTO copy$default(ResultsHeaderDTO resultsHeaderDTO, String str, String str2, ButtonV3Atom.SmallIconButton smallIconButton, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = resultsHeaderDTO.title;
        }
        if ((i11 & 2) != 0) {
            str2 = resultsHeaderDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            smallIconButton = resultsHeaderDTO.actionButton;
        }
        if ((i11 & 8) != 0) {
            list = resultsHeaderDTO.badge;
        }
        if ((i11 & 16) != 0) {
            map = resultsHeaderDTO.trackingInfo;
        }
        Map map2 = map;
        ButtonV3Atom.SmallIconButton smallIconButton2 = smallIconButton;
        return resultsHeaderDTO.copy(str, str2, smallIconButton2, list, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final ButtonV3Atom.SmallIconButton getActionButton() {
        return this.actionButton;
    }

    public final List<Badge> component4() {
        return this.badge;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final ResultsHeaderDTO copy(@NotNull String title, @NotNull String subtitle, ButtonV3Atom.SmallIconButton actionButton, List<Badge> badge, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        return new ResultsHeaderDTO(title, subtitle, actionButton, badge, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResultsHeaderDTO)) {
            return false;
        }
        ResultsHeaderDTO resultsHeaderDTO = (ResultsHeaderDTO) other;
        return Intrinsics.d(this.title, resultsHeaderDTO.title) && Intrinsics.d(this.subtitle, resultsHeaderDTO.subtitle) && Intrinsics.d(this.actionButton, resultsHeaderDTO.actionButton) && Intrinsics.d(this.badge, resultsHeaderDTO.badge) && Intrinsics.d(this.trackingInfo, resultsHeaderDTO.trackingInfo);
    }

    public final ButtonV3Atom.SmallIconButton getActionButton() {
        return this.actionButton;
    }

    public final List<Badge> getBadge() {
        return this.badge;
    }

    @NotNull
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = g.a(this.title.hashCode() * 31, 31, this.subtitle);
        ButtonV3Atom.SmallIconButton smallIconButton = this.actionButton;
        int hashCode = (a11 + (smallIconButton == null ? 0 : smallIconButton.hashCode())) * 31;
        List<Badge> list = this.badge;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        ButtonV3Atom.SmallIconButton smallIconButton = this.actionButton;
        List<Badge> list = this.badge;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = C3660k.d("ResultsHeaderDTO(title=", str, ", subtitle=", str2, ", actionButton=");
        d11.append(smallIconButton);
        d11.append(", badge=");
        d11.append(list);
        d11.append(", trackingInfo=");
        return P.f(d11, map, ")");
    }
}

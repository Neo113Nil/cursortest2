package ru.ozon.app.android.search.widgets.tapTags.v3.presentation;

import WZ.t;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001+BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0019JT\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010\u0019R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b\u000f\u0010*¨\u0006,"}, d2 = {"Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "items", "", "maxRows", "", "searchText", "Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3VO$SuggestedPage;", "suggestedPage", "", "isExpressPage", "<init>", "(JLjava/util/List;ILjava/lang/String;Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3VO$SuggestedPage;Z)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(JLjava/util/List;ILjava/lang/String;Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3VO$SuggestedPage;Z)Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3VO;", "J", "getId", "()J", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "I", "getMaxRows", "Ljava/lang/String;", "getSearchText", "Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3VO$SuggestedPage;", "getSuggestedPage", "()Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3VO$SuggestedPage;", "Z", "()Z", "SuggestedPage", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TapTagsV3VO implements c {
    private final long id;
    private final boolean isExpressPage;

    @NotNull
    private final List<TagButtonDTO> items;
    private final int maxRows;

    @NotNull
    private final String searchText;
    private final SuggestedPage suggestedPage;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ,\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001f\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3VO$SuggestedPage;", "", "", "refreshLink", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(Ljava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;LWZ/t;)Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3VO$SuggestedPage;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRefreshLink", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SuggestedPage {

        @NotNull
        private final String refreshLink;
        private final t tokenizedEvent;

        public SuggestedPage(@NotNull String refreshLink, t tVar) {
            Intrinsics.checkNotNullParameter(refreshLink, "refreshLink");
            this.refreshLink = refreshLink;
            this.tokenizedEvent = tVar;
        }

        @NotNull
        public final SuggestedPage copy(@NotNull String refreshLink, t tokenizedEvent) {
            Intrinsics.checkNotNullParameter(refreshLink, "refreshLink");
            return new SuggestedPage(refreshLink, tokenizedEvent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SuggestedPage)) {
                return false;
            }
            SuggestedPage suggestedPage = (SuggestedPage) other;
            return Intrinsics.d(this.refreshLink, suggestedPage.refreshLink) && Intrinsics.d(this.tokenizedEvent, suggestedPage.tokenizedEvent);
        }

        @NotNull
        public final String getRefreshLink() {
            return this.refreshLink;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int hashCode = this.refreshLink.hashCode() * 31;
            t tVar = this.tokenizedEvent;
            return hashCode + (tVar == null ? 0 : tVar.hashCode());
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            Fj.c.f("refreshLink=", this.refreshLink, "; ", sb2);
            sb2.append("tokenizedEvent=" + this.tokenizedEvent + "; ");
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
            return sb3;
        }
    }

    public TapTagsV3VO(long j11, @NotNull List<TagButtonDTO> items, int i11, @NotNull String searchText, SuggestedPage suggestedPage, boolean z11) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        this.id = j11;
        this.items = items;
        this.maxRows = i11;
        this.searchText = searchText;
        this.suggestedPage = suggestedPage;
        this.isExpressPage = z11;
    }

    public static /* synthetic */ TapTagsV3VO copy$default(TapTagsV3VO tapTagsV3VO, long j11, List list, int i11, String str, SuggestedPage suggestedPage, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = tapTagsV3VO.id;
        }
        long j12 = j11;
        if ((i12 & 2) != 0) {
            list = tapTagsV3VO.items;
        }
        List list2 = list;
        if ((i12 & 4) != 0) {
            i11 = tapTagsV3VO.maxRows;
        }
        int i13 = i11;
        if ((i12 & 8) != 0) {
            str = tapTagsV3VO.searchText;
        }
        String str2 = str;
        if ((i12 & 16) != 0) {
            suggestedPage = tapTagsV3VO.suggestedPage;
        }
        SuggestedPage suggestedPage2 = suggestedPage;
        if ((i12 & 32) != 0) {
            z11 = tapTagsV3VO.isExpressPage;
        }
        return tapTagsV3VO.copy(j12, list2, i13, str2, suggestedPage2, z11);
    }

    @NotNull
    public final TapTagsV3VO copy(long id2, @NotNull List<TagButtonDTO> items, int maxRows, @NotNull String searchText, SuggestedPage suggestedPage, boolean isExpressPage) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        return new TapTagsV3VO(id2, items, maxRows, searchText, suggestedPage, isExpressPage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!TapTagsV3VO.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.g(other, "null cannot be cast to non-null type ru.ozon.app.android.search.widgets.tapTags.v3.presentation.TapTagsV3VO");
        TapTagsV3VO tapTagsV3VO = (TapTagsV3VO) other;
        return getId() == tapTagsV3VO.getId() && Intrinsics.d(this.searchText, tapTagsV3VO.searchText);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<TagButtonDTO> getItems() {
        return this.items;
    }

    public final int getMaxRows() {
        return this.maxRows;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final String getSearchText() {
        return this.searchText;
    }

    public final SuggestedPage getSuggestedPage() {
        return this.suggestedPage;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return TapTagsV3VO.class.hashCode() * Long.hashCode(getId()) * 31;
    }

    /* renamed from: isExpressPage, reason: from getter */
    public final boolean getIsExpressPage() {
        return this.isExpressPage;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<T> it = this.items.iterator();
        while (it.hasNext()) {
            sb2.append(((TagButtonDTO) it.next()).getText());
            sb2.append("; ");
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(super.toString());
        sb3.append("id=" + getId() + ", ");
        sb3.append("searchText=" + this.searchText + ", ");
        sb3.append("items=" + ((Object) sb2) + " ");
        sb3.append("suggestedPage=" + this.suggestedPage + ", ");
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        return sb4;
    }

    public /* synthetic */ TapTagsV3VO(long j11, List list, int i11, String str, SuggestedPage suggestedPage, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, list, i11, str, suggestedPage, (i12 & 32) != 0 ? false : z11);
    }
}

package ru.ozon.app.android.search.widgets.tapTags.v2.presentation;

import B0.C2454a;
import G.g;
import Kk.C3532b;
import Lh.b;
import g.C6594f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJH\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010\u0013¨\u0006'"}, d2 = {"Lru/ozon/app/android/search/widgets/tapTags/v2/presentation/TapTagsV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "items", "", "maxRows", "", "showSeparator", "", "searchText", "<init>", "(JLjava/util/List;IZLjava/lang/String;)V", "copy", "(JLjava/util/List;IZLjava/lang/String;)Lru/ozon/app/android/search/widgets/tapTags/v2/presentation/TapTagsV2VO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "I", "getMaxRows", "Z", "getShowSeparator", "()Z", "Ljava/lang/String;", "getSearchText", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TapTagsV2VO implements c {
    private final long id;

    @NotNull
    private final List<TagButtonDTO> items;
    private final int maxRows;

    @NotNull
    private final String searchText;
    private final boolean showSeparator;

    public TapTagsV2VO(long j11, @NotNull List<TagButtonDTO> items, int i11, boolean z11, @NotNull String searchText) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        this.id = j11;
        this.items = items;
        this.maxRows = i11;
        this.showSeparator = z11;
        this.searchText = searchText;
    }

    public static /* synthetic */ TapTagsV2VO copy$default(TapTagsV2VO tapTagsV2VO, long j11, List list, int i11, boolean z11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = tapTagsV2VO.id;
        }
        long j12 = j11;
        if ((i12 & 2) != 0) {
            list = tapTagsV2VO.items;
        }
        List list2 = list;
        if ((i12 & 4) != 0) {
            i11 = tapTagsV2VO.maxRows;
        }
        int i13 = i11;
        if ((i12 & 8) != 0) {
            z11 = tapTagsV2VO.showSeparator;
        }
        boolean z12 = z11;
        if ((i12 & 16) != 0) {
            str = tapTagsV2VO.searchText;
        }
        return tapTagsV2VO.copy(j12, list2, i13, z12, str);
    }

    @NotNull
    public final TapTagsV2VO copy(long id2, @NotNull List<TagButtonDTO> items, int maxRows, boolean showSeparator, @NotNull String searchText) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        return new TapTagsV2VO(id2, items, maxRows, showSeparator, searchText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TapTagsV2VO)) {
            return false;
        }
        TapTagsV2VO tapTagsV2VO = (TapTagsV2VO) other;
        return this.id == tapTagsV2VO.id && Intrinsics.d(this.items, tapTagsV2VO.items) && this.maxRows == tapTagsV2VO.maxRows && this.showSeparator == tapTagsV2VO.showSeparator && Intrinsics.d(this.searchText, tapTagsV2VO.searchText);
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

    public final boolean getShowSeparator() {
        return this.showSeparator;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.searchText.hashCode() + C3532b.a(C2454a.a(this.maxRows, g.b(Long.hashCode(this.id) * 31, 31, this.items), 31), 31, this.showSeparator);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<TagButtonDTO> list = this.items;
        int i11 = this.maxRows;
        boolean z11 = this.showSeparator;
        String str = this.searchText;
        StringBuilder b11 = b.b(j11, "TapTagsV2VO(id=", ", items=", list);
        b11.append(", maxRows=");
        b11.append(i11);
        b11.append(", showSeparator=");
        b11.append(z11);
        return C6594f.a(", searchText=", str, ")", b11);
    }
}

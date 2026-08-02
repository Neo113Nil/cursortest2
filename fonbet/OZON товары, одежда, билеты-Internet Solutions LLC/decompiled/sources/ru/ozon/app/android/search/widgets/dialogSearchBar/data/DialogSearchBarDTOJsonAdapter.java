package ru.ozon.app.android.search.widgets.dialogSearchBar.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.search.widgets.dialogSearchBar.data.DialogSearchBarDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R(\u0010&\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020%\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0018R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0018R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0018¨\u0006+"}, d2 = {"Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$RefreshInfo;", "refreshInfoAdapter", "nullableRefreshInfoAdapter", "Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$ReturnKeyInfo;", "nullableReturnKeyInfoAdapter", "Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$TapTagOptions;", "nullableTapTagOptionsAdapter", "Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$TagsList;", "nullableTagsListAdapter", "Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$AllFiltersButton;", "nullableAllFiltersButtonAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$SearchBarStyles;", "nullableSearchBarStylesAdapter", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "nullableIconButtonV3DTOAdapter", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DialogSearchBarDTOJsonAdapter extends JsonAdapter<DialogSearchBarDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<DialogSearchBarDTO.AllFiltersButton> nullableAllFiltersButtonAdapter;

    @NotNull
    private final JsonAdapter<IconButtonV3DTO> nullableIconButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<DialogSearchBarDTO.RefreshInfo> nullableRefreshInfoAdapter;

    @NotNull
    private final JsonAdapter<DialogSearchBarDTO.ReturnKeyInfo> nullableReturnKeyInfoAdapter;

    @NotNull
    private final JsonAdapter<DialogSearchBarDTO.SearchBarStyles> nullableSearchBarStylesAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<DialogSearchBarDTO.TagsList> nullableTagsListAdapter;

    @NotNull
    private final JsonAdapter<DialogSearchBarDTO.TapTagOptions> nullableTapTagOptionsAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<DialogSearchBarDTO.RefreshInfo> refreshInfoAdapter;

    public DialogSearchBarDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("inputText", HammersV3BodyDTO.PLACEHOLDER, "widgetRefresh", "pageRefresh", "returnKey", "tapTagOptions", "usedTags", "allFilters", "pageInteraction", "defaultStateLink", "searchBarStyles", "rightButton");
        M m11 = M.f71699a;
        this.nullableStringAdapter = moshi.f(String.class, m11, "inputText");
        this.refreshInfoAdapter = moshi.f(DialogSearchBarDTO.RefreshInfo.class, m11, "widgetRefresh");
        this.nullableRefreshInfoAdapter = moshi.f(DialogSearchBarDTO.RefreshInfo.class, m11, "pageRefresh");
        this.nullableReturnKeyInfoAdapter = moshi.f(DialogSearchBarDTO.ReturnKeyInfo.class, m11, "returnKey");
        this.nullableTapTagOptionsAdapter = moshi.f(DialogSearchBarDTO.TapTagOptions.class, m11, "tapTagOptions");
        this.nullableTagsListAdapter = moshi.f(DialogSearchBarDTO.TagsList.class, m11, "usedTags");
        this.nullableAllFiltersButtonAdapter = moshi.f(DialogSearchBarDTO.AllFiltersButton.class, m11, "allFilters");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "pageInteraction");
        this.nullableSearchBarStylesAdapter = moshi.f(DialogSearchBarDTO.SearchBarStyles.class, m11, "searchBarStyles");
        this.nullableIconButtonV3DTOAdapter = moshi.f(IconButtonV3DTO.class, m11, "rightButton");
    }

    @NotNull
    public String toString() {
        return b.c(40, "GeneratedJsonAdapter(DialogSearchBarDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public DialogSearchBarDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        DialogSearchBarDTO.RefreshInfo refreshInfo = null;
        DialogSearchBarDTO.RefreshInfo refreshInfo2 = null;
        DialogSearchBarDTO.ReturnKeyInfo returnKeyInfo = null;
        DialogSearchBarDTO.TapTagOptions tapTagOptions = null;
        DialogSearchBarDTO.TagsList tagsList = null;
        DialogSearchBarDTO.AllFiltersButton allFiltersButton = null;
        Map<String, TokenizedTrackingInfo> map = null;
        String str3 = null;
        DialogSearchBarDTO.SearchBarStyles searchBarStyles = null;
        IconButtonV3DTO iconButtonV3DTO = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    refreshInfo = this.refreshInfoAdapter.fromJson(reader);
                    if (refreshInfo == null) {
                        throw c.q("widgetRefresh", "widgetRefresh", reader);
                    }
                    break;
                case 3:
                    refreshInfo2 = this.nullableRefreshInfoAdapter.fromJson(reader);
                    break;
                case 4:
                    returnKeyInfo = this.nullableReturnKeyInfoAdapter.fromJson(reader);
                    break;
                case 5:
                    tapTagOptions = this.nullableTapTagOptionsAdapter.fromJson(reader);
                    break;
                case 6:
                    tagsList = this.nullableTagsListAdapter.fromJson(reader);
                    break;
                case 7:
                    allFiltersButton = this.nullableAllFiltersButtonAdapter.fromJson(reader);
                    break;
                case 8:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 9:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 10:
                    searchBarStyles = this.nullableSearchBarStylesAdapter.fromJson(reader);
                    break;
                case 11:
                    iconButtonV3DTO = this.nullableIconButtonV3DTOAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (refreshInfo != null) {
            return new DialogSearchBarDTO(str, str2, refreshInfo, refreshInfo2, returnKeyInfo, tapTagOptions, tagsList, allFiltersButton, map, str3, searchBarStyles, iconButtonV3DTO);
        }
        throw c.j("widgetRefresh", "widgetRefresh", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, DialogSearchBarDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("inputText");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getInputText());
        writer.w(HammersV3BodyDTO.PLACEHOLDER);
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getPlaceholder());
        writer.w("widgetRefresh");
        this.refreshInfoAdapter.mo44toJson(writer, (x) value.getWidgetRefresh());
        writer.w("pageRefresh");
        this.nullableRefreshInfoAdapter.mo44toJson(writer, (x) value.getPageRefresh());
        writer.w("returnKey");
        this.nullableReturnKeyInfoAdapter.mo44toJson(writer, (x) value.getReturnKey());
        writer.w("tapTagOptions");
        this.nullableTapTagOptionsAdapter.mo44toJson(writer, (x) value.getTapTagOptions());
        writer.w("usedTags");
        this.nullableTagsListAdapter.mo44toJson(writer, (x) value.getUsedTags());
        writer.w("allFilters");
        this.nullableAllFiltersButtonAdapter.mo44toJson(writer, (x) value.getAllFilters());
        writer.w("pageInteraction");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getPageInteraction());
        writer.w("defaultStateLink");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getDefaultStateLink());
        writer.w("searchBarStyles");
        this.nullableSearchBarStylesAdapter.mo44toJson(writer, (x) value.getSearchBarStyles());
        writer.w("rightButton");
        this.nullableIconButtonV3DTOAdapter.mo44toJson(writer, (x) value.getRightButton());
        writer.p();
    }
}

package ru.ozon.app.android.search.widgets.suggestions.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonDTO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010\r¨\u0006 "}, d2 = {"Lru/ozon/app/android/search/widgets/suggestions/data/model/SuggestionsTitleSubtitleModel;", "", "Lru/ozon/app/android/search/widgets/suggestions/data/model/SuggestionsCommonModel;", "common", "Lru/ozon/app/android/search/widgets/suggestions/data/model/SuggestionsTextModel;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;", "removeButton", "", "backgroundColor", "<init>", "(Lru/ozon/app/android/search/widgets/suggestions/data/model/SuggestionsCommonModel;Lru/ozon/app/android/search/widgets/suggestions/data/model/SuggestionsTextModel;Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/search/widgets/suggestions/data/model/SuggestionsCommonModel;", "getCommon", "()Lru/ozon/app/android/search/widgets/suggestions/data/model/SuggestionsCommonModel;", "Lru/ozon/app/android/search/widgets/suggestions/data/model/SuggestionsTextModel;", "getTitle", "()Lru/ozon/app/android/search/widgets/suggestions/data/model/SuggestionsTextModel;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;", "getRemoveButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;", "Ljava/lang/String;", "getBackgroundColor", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SuggestionsTitleSubtitleModel {
    private final String backgroundColor;
    private final SuggestionsCommonModel common;
    private final IconButtonDTO removeButton;

    @NotNull
    private final SuggestionsTextModel title;

    public SuggestionsTitleSubtitleModel(SuggestionsCommonModel suggestionsCommonModel, @NotNull SuggestionsTextModel title, IconButtonDTO iconButtonDTO, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.common = suggestionsCommonModel;
        this.title = title;
        this.removeButton = iconButtonDTO;
        this.backgroundColor = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuggestionsTitleSubtitleModel)) {
            return false;
        }
        SuggestionsTitleSubtitleModel suggestionsTitleSubtitleModel = (SuggestionsTitleSubtitleModel) other;
        return Intrinsics.d(this.common, suggestionsTitleSubtitleModel.common) && Intrinsics.d(this.title, suggestionsTitleSubtitleModel.title) && Intrinsics.d(this.removeButton, suggestionsTitleSubtitleModel.removeButton) && Intrinsics.d(this.backgroundColor, suggestionsTitleSubtitleModel.backgroundColor);
    }

    public final SuggestionsCommonModel getCommon() {
        return this.common;
    }

    public final IconButtonDTO getRemoveButton() {
        return this.removeButton;
    }

    @NotNull
    public final SuggestionsTextModel getTitle() {
        return this.title;
    }

    public int hashCode() {
        SuggestionsCommonModel suggestionsCommonModel = this.common;
        int hashCode = (this.title.hashCode() + ((suggestionsCommonModel == null ? 0 : suggestionsCommonModel.hashCode()) * 31)) * 31;
        IconButtonDTO iconButtonDTO = this.removeButton;
        int hashCode2 = (hashCode + (iconButtonDTO == null ? 0 : iconButtonDTO.hashCode())) * 31;
        String str = this.backgroundColor;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SuggestionsTitleSubtitleModel(common=" + this.common + ", title=" + this.title + ", removeButton=" + this.removeButton + ", backgroundColor=" + this.backgroundColor + ")";
    }
}

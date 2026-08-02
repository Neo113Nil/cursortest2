package ru.ozon.app.android.search.widgets.brandList.presentation.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/search/widgets/brandList/presentation/models/TitleCell;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getId", "()Ljava/lang/String;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TitleCell {

    @NotNull
    private final String id;
    private final TextDTO title;

    public TitleCell(@NotNull String id2, TextDTO textDTO) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.id = id2;
        this.title = textDTO;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final TextDTO getTitle() {
        return this.title;
    }
}

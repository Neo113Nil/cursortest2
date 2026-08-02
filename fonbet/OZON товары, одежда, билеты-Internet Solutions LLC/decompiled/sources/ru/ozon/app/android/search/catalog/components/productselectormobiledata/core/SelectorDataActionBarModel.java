package ru.ozon.app.android.search.catalog.components.productselectormobiledata.core;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/search/catalog/components/productselectormobiledata/core/SelectorDataActionBarModel;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "clearButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "closeButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getClearButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "getCloseButton", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SelectorDataActionBarModel {
    public static final int $stable = ButtonV3Atom.LargeBorderlessButton.$stable;
    private final ButtonV3Atom.LargeBorderlessButton clearButton;

    @NotNull
    private final ButtonV3Atom.LargeBorderlessButton closeButton;
    private final String subtitle;
    private final String title;

    public SelectorDataActionBarModel(String str, String str2, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, @NotNull ButtonV3Atom.LargeBorderlessButton closeButton) {
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        this.title = str;
        this.subtitle = str2;
        this.clearButton = largeBorderlessButton;
        this.closeButton = closeButton;
    }

    public final ButtonV3Atom.LargeBorderlessButton getClearButton() {
        return this.clearButton;
    }

    @NotNull
    public final ButtonV3Atom.LargeBorderlessButton getCloseButton() {
        return this.closeButton;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }
}

package ru.ozon.uni.android.uikit.view.atoms.tabs;

import android.text.Spanned;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0005\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/uni/android/uikit/view/atoms/tabs/TabModel;", "", "Landroid/text/Spanned;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "isSelected", "<init>", "(Landroid/text/Spanned;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Landroid/text/Spanned;", "getTitle", "()Landroid/text/Spanned;", "Z", "()Z", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TabModel {
    private final boolean isSelected;

    @NotNull
    private final Spanned title;

    public TabModel(@NotNull Spanned title, boolean z11) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.isSelected = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TabModel)) {
            return false;
        }
        TabModel tabModel = (TabModel) other;
        return Intrinsics.d(this.title, tabModel.title) && this.isSelected == tabModel.isSelected;
    }

    @NotNull
    public final Spanned getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSelected) + (this.title.hashCode() * 31);
    }

    /* renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        Spanned spanned = this.title;
        return "TabModel(title=" + ((Object) spanned) + ", isSelected=" + this.isSelected + ")";
    }
}

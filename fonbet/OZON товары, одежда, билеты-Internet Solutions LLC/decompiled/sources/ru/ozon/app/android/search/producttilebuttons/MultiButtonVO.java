package ru.ozon.app.android.search.producttilebuttons;

import G.g;
import N3.C3660k;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.multiButton.model.MultiButtonTemplate;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/search/producttilebuttons/MultiButtonVO;", "", "", "id", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/multiButton/model/MultiButtonTemplate;", "template", "", "fixedFooterHeight", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/multiButton/model/MultiButtonTemplate;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getTitle", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/multiButton/model/MultiButtonTemplate;", "getTemplate", "()Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/multiButton/model/MultiButtonTemplate;", "Z", "getFixedFooterHeight", "()Z", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class MultiButtonVO {
    private final boolean fixedFooterHeight;

    @NotNull
    private final String id;

    @NotNull
    private final MultiButtonTemplate template;

    @NotNull
    private final String title;

    public MultiButtonVO(@NotNull String id2, @NotNull String title, @NotNull MultiButtonTemplate template, boolean z11) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(template, "template");
        this.id = id2;
        this.title = title;
        this.template = template;
        this.fixedFooterHeight = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiButtonVO)) {
            return false;
        }
        MultiButtonVO multiButtonVO = (MultiButtonVO) other;
        return Intrinsics.d(this.id, multiButtonVO.id) && Intrinsics.d(this.title, multiButtonVO.title) && Intrinsics.d(this.template, multiButtonVO.template) && this.fixedFooterHeight == multiButtonVO.fixedFooterHeight;
    }

    @NotNull
    public final MultiButtonTemplate getTemplate() {
        return this.template;
    }

    public int hashCode() {
        return Boolean.hashCode(this.fixedFooterHeight) + ((this.template.hashCode() + g.a(this.id.hashCode() * 31, 31, this.title)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.title;
        MultiButtonTemplate multiButtonTemplate = this.template;
        boolean z11 = this.fixedFooterHeight;
        StringBuilder d11 = C3660k.d("MultiButtonVO(id=", str, ", title=", str2, ", template=");
        d11.append(multiButtonTemplate);
        d11.append(", fixedFooterHeight=");
        d11.append(z11);
        d11.append(")");
        return d11.toString();
    }

    public /* synthetic */ MultiButtonVO(String str, String str2, MultiButtonTemplate multiButtonTemplate, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? "" : str2, multiButtonTemplate, z11);
    }
}

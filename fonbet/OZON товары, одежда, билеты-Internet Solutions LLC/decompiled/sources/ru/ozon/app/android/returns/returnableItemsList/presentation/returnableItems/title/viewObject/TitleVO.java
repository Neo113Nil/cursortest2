package ru.ozon.app.android.returns.returnableItemsList.presentation.returnableItems.title.viewObject;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/title/viewObject/TitleVO;", "Ll20/c;", "", "id", "Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/title/viewObject/Title;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "<init>", "(JLru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/title/viewObject/Title;Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/title/viewObject/Title;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/title/viewObject/Title;", "getTitle", "()Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/title/viewObject/Title;", "getSubtitle", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TitleVO implements c {
    public static final int $stable = TextAtom.$stable;
    private final long id;

    @NotNull
    private final Title subtitle;

    @NotNull
    private final Title title;

    public TitleVO(long j11, @NotNull Title title, @NotNull Title subtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.id = j11;
        this.title = title;
        this.subtitle = subtitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TitleVO)) {
            return false;
        }
        TitleVO titleVO = (TitleVO) other;
        return this.id == titleVO.id && Intrinsics.d(this.title, titleVO.title) && Intrinsics.d(this.subtitle, titleVO.subtitle);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final Title getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final Title getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.subtitle.hashCode() + ((this.title.hashCode() + (Long.hashCode(this.id) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "TitleVO(id=" + this.id + ", title=" + this.title + ", subtitle=" + this.subtitle + ")";
    }
}

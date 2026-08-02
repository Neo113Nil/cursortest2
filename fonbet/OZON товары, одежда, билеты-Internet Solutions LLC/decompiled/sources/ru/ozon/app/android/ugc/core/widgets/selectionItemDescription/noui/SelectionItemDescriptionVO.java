package ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.noui;

import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.data.SelectionItemDescriptionDTO;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/noui/SelectionItemDescriptionVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/data/SelectionItemDescriptionDTO$ScrollPosition;", "scrollPosition", "<init>", "(JLWZ/t;Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/data/SelectionItemDescriptionDTO$ScrollPosition;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/data/SelectionItemDescriptionDTO$ScrollPosition;", "getScrollPosition", "()Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/data/SelectionItemDescriptionDTO$ScrollPosition;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SelectionItemDescriptionVO implements c {
    private final long id;

    @NotNull
    private final SelectionItemDescriptionDTO.ScrollPosition scrollPosition;
    private final t tokenizedEvent;

    public SelectionItemDescriptionVO(long j11, t tVar, @NotNull SelectionItemDescriptionDTO.ScrollPosition scrollPosition) {
        Intrinsics.checkNotNullParameter(scrollPosition, "scrollPosition");
        this.id = j11;
        this.tokenizedEvent = tVar;
        this.scrollPosition = scrollPosition;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectionItemDescriptionVO)) {
            return false;
        }
        SelectionItemDescriptionVO selectionItemDescriptionVO = (SelectionItemDescriptionVO) other;
        return this.id == selectionItemDescriptionVO.id && Intrinsics.d(this.tokenizedEvent, selectionItemDescriptionVO.tokenizedEvent) && this.scrollPosition == selectionItemDescriptionVO.scrollPosition;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final SelectionItemDescriptionDTO.ScrollPosition getScrollPosition() {
        return this.scrollPosition;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        t tVar = this.tokenizedEvent;
        return this.scrollPosition.hashCode() + ((hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        return "SelectionItemDescriptionVO(id=" + this.id + ", tokenizedEvent=" + this.tokenizedEvent + ", scrollPosition=" + this.scrollPosition + ")";
    }
}

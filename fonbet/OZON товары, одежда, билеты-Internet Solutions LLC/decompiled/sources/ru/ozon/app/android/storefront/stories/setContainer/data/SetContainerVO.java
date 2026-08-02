package ru.ozon.app.android.storefront.stories.setContainer.data;

import B0.A0;
import B0.C2454a;
import G.g;
import Lh.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ>\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010\u0013\"\u0004\b#\u0010$R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b%\u0010\u0013¨\u0006&"}, d2 = {"Lru/ozon/app/android/storefront/stories/setContainer/data/SetContainerVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/storefront/stories/setContainer/data/CommonVoSet;", "setsList", "", "closeScreenStoryPosition", "selectedSetIndex", "<init>", "(JLjava/util/List;II)V", "copy", "(JLjava/util/List;II)Lru/ozon/app/android/storefront/stories/setContainer/data/SetContainerVO;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getSetsList", "()Ljava/util/List;", "setSetsList", "(Ljava/util/List;)V", "I", "getCloseScreenStoryPosition", "setCloseScreenStoryPosition", "(I)V", "getSelectedSetIndex", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SetContainerVO implements c {
    private int closeScreenStoryPosition;
    private final long id;
    private final int selectedSetIndex;

    @NotNull
    private List<? extends CommonVoSet> setsList;

    public SetContainerVO(long j11, @NotNull List<? extends CommonVoSet> setsList, int i11, int i12) {
        Intrinsics.checkNotNullParameter(setsList, "setsList");
        this.id = j11;
        this.setsList = setsList;
        this.closeScreenStoryPosition = i11;
        this.selectedSetIndex = i12;
    }

    public static /* synthetic */ SetContainerVO copy$default(SetContainerVO setContainerVO, long j11, List list, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j11 = setContainerVO.id;
        }
        long j12 = j11;
        if ((i13 & 2) != 0) {
            list = setContainerVO.setsList;
        }
        List list2 = list;
        if ((i13 & 4) != 0) {
            i11 = setContainerVO.closeScreenStoryPosition;
        }
        int i14 = i11;
        if ((i13 & 8) != 0) {
            i12 = setContainerVO.selectedSetIndex;
        }
        return setContainerVO.copy(j12, list2, i14, i12);
    }

    @NotNull
    public final SetContainerVO copy(long id2, @NotNull List<? extends CommonVoSet> setsList, int closeScreenStoryPosition, int selectedSetIndex) {
        Intrinsics.checkNotNullParameter(setsList, "setsList");
        return new SetContainerVO(id2, setsList, closeScreenStoryPosition, selectedSetIndex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetContainerVO)) {
            return false;
        }
        SetContainerVO setContainerVO = (SetContainerVO) other;
        return this.id == setContainerVO.id && Intrinsics.d(this.setsList, setContainerVO.setsList) && this.closeScreenStoryPosition == setContainerVO.closeScreenStoryPosition && this.selectedSetIndex == setContainerVO.selectedSetIndex;
    }

    public final int getCloseScreenStoryPosition() {
        return this.closeScreenStoryPosition;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final int getSelectedSetIndex() {
        return this.selectedSetIndex;
    }

    @NotNull
    public final List<CommonVoSet> getSetsList() {
        return this.setsList;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return Integer.hashCode(this.selectedSetIndex) + C2454a.a(this.closeScreenStoryPosition, g.b(Long.hashCode(this.id) * 31, 31, this.setsList), 31);
    }

    public final void setCloseScreenStoryPosition(int i11) {
        this.closeScreenStoryPosition = i11;
    }

    public final void setSetsList(@NotNull List<? extends CommonVoSet> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.setsList = list;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<? extends CommonVoSet> list = this.setsList;
        int i11 = this.closeScreenStoryPosition;
        int i12 = this.selectedSetIndex;
        StringBuilder b11 = b.b(j11, "SetContainerVO(id=", ", setsList=", list);
        A0.c(i11, i12, ", closeScreenStoryPosition=", ", selectedSetIndex=", b11);
        b11.append(")");
        return b11.toString();
    }

    public /* synthetic */ SetContainerVO(long j11, List list, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, list, (i13 & 4) != 0 ? -1 : i11, (i13 & 8) != 0 ? 0 : i12);
    }
}

package ru.ozon.app.android.pdp.widgets.richContent.presentation.subWidgets.list;

import B0.C2454a;
import Kk.C3532b;
import P4.f;
import Pk0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.RichContentVO;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.RichContentVoWrapper;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJD\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u0005\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010\u0011R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/presentation/subWidgets/list/RichContentNumberListVoWrapper;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVoWrapper;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item$ListItem$NumberList;", "item", "", "isExpanded", "", "position", "", "tabGroupId", "", "id", "<init>", "(Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item$ListItem$NumberList;ZILjava/lang/String;J)V", "copy", "(Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item$ListItem$NumberList;ZILjava/lang/String;J)Lru/ozon/app/android/pdp/widgets/richContent/presentation/subWidgets/list/RichContentNumberListVoWrapper;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item$ListItem$NumberList;", "getItem", "()Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item$ListItem$NumberList;", "Z", "()Z", "I", "getPosition", "Ljava/lang/String;", "getTabGroupId", "J", "getId", "()J", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class RichContentNumberListVoWrapper implements RichContentVoWrapper {
    private final long id;
    private final boolean isExpanded;

    @NotNull
    private final RichContentVO.Item.ListItem.NumberList item;
    private final int position;
    private final String tabGroupId;

    public RichContentNumberListVoWrapper(@NotNull RichContentVO.Item.ListItem.NumberList item, boolean z11, int i11, String str, long j11) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
        this.isExpanded = z11;
        this.position = i11;
        this.tabGroupId = str;
        this.id = j11;
    }

    public static /* synthetic */ RichContentNumberListVoWrapper copy$default(RichContentNumberListVoWrapper richContentNumberListVoWrapper, RichContentVO.Item.ListItem.NumberList numberList, boolean z11, int i11, String str, long j11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            numberList = richContentNumberListVoWrapper.item;
        }
        if ((i12 & 2) != 0) {
            z11 = richContentNumberListVoWrapper.isExpanded;
        }
        if ((i12 & 4) != 0) {
            i11 = richContentNumberListVoWrapper.position;
        }
        if ((i12 & 8) != 0) {
            str = richContentNumberListVoWrapper.tabGroupId;
        }
        if ((i12 & 16) != 0) {
            j11 = richContentNumberListVoWrapper.id;
        }
        long j12 = j11;
        return richContentNumberListVoWrapper.copy(numberList, z11, i11, str, j12);
    }

    @NotNull
    public final RichContentNumberListVoWrapper copy(@NotNull RichContentVO.Item.ListItem.NumberList item, boolean isExpanded, int position, String tabGroupId, long id2) {
        Intrinsics.checkNotNullParameter(item, "item");
        return new RichContentNumberListVoWrapper(item, isExpanded, position, tabGroupId, id2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RichContentNumberListVoWrapper)) {
            return false;
        }
        RichContentNumberListVoWrapper richContentNumberListVoWrapper = (RichContentNumberListVoWrapper) other;
        return Intrinsics.d(this.item, richContentNumberListVoWrapper.item) && this.isExpanded == richContentNumberListVoWrapper.isExpanded && this.position == richContentNumberListVoWrapper.position && Intrinsics.d(this.tabGroupId, richContentNumberListVoWrapper.tabGroupId) && this.id == richContentNumberListVoWrapper.id;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final RichContentVO.Item.ListItem.NumberList getItem() {
        return this.item;
    }

    @Override // ru.ozon.app.android.pdp.widgets.richContent.presentation.RichContentVoWrapper
    public int getPosition() {
        return this.position;
    }

    @Override // l20.c
    @NotNull
    public Integer getScrollWidgetKey() {
        return RichContentVoWrapper.DefaultImpls.getScrollWidgetKey(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedViewObject
    public String getTabGroupId() {
        return this.tabGroupId;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return RichContentVoWrapper.DefaultImpls.getViewItemKey(this);
    }

    public int hashCode() {
        int a11 = C2454a.a(this.position, C3532b.a(this.item.hashCode() * 31, 31, this.isExpanded), 31);
        String str = this.tabGroupId;
        return Long.hashCode(this.id) + ((a11 + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // ru.ozon.app.android.pdp.widgets.richContent.presentation.RichContentVoWrapper
    /* renamed from: isExpanded, reason: from getter */
    public boolean getIsExpanded() {
        return this.isExpanded;
    }

    @NotNull
    public String toString() {
        RichContentVO.Item.ListItem.NumberList numberList = this.item;
        boolean z11 = this.isExpanded;
        int i11 = this.position;
        String str = this.tabGroupId;
        long j11 = this.id;
        StringBuilder sb2 = new StringBuilder("RichContentNumberListVoWrapper(item=");
        sb2.append(numberList);
        sb2.append(", isExpanded=");
        sb2.append(z11);
        sb2.append(", position=");
        i.c(i11, ", tabGroupId=", str, ", id=", sb2);
        return f.a(j11, ")", sb2);
    }
}

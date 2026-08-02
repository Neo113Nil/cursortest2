package ru.ozon.app.android.pdp.widgets.richContent.presentation.subWidgets.spacer;

import B0.C2454a;
import Bi.b;
import Pk0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.RichContentVO;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.RichContentVoWrapper;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJD\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b\u000b\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/presentation/subWidgets/spacer/RichContentSpacerVoWrapper;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVoWrapper;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item$Spacer;", "billboardVO", "", "position", "", "tabGroupId", "", "id", "", "isExpanded", "<init>", "(Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item$Spacer;ILjava/lang/String;JZ)V", "copy", "(Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item$Spacer;ILjava/lang/String;JZ)Lru/ozon/app/android/pdp/widgets/richContent/presentation/subWidgets/spacer/RichContentSpacerVoWrapper;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item$Spacer;", "getBillboardVO", "()Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item$Spacer;", "I", "getPosition", "Ljava/lang/String;", "getTabGroupId", "J", "getId", "()J", "Z", "()Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class RichContentSpacerVoWrapper implements RichContentVoWrapper {

    @NotNull
    private final RichContentVO.Item.Spacer billboardVO;
    private final long id;
    private final boolean isExpanded;
    private final int position;
    private final String tabGroupId;

    public RichContentSpacerVoWrapper(@NotNull RichContentVO.Item.Spacer billboardVO, int i11, String str, long j11, boolean z11) {
        Intrinsics.checkNotNullParameter(billboardVO, "billboardVO");
        this.billboardVO = billboardVO;
        this.position = i11;
        this.tabGroupId = str;
        this.id = j11;
        this.isExpanded = z11;
    }

    public static /* synthetic */ RichContentSpacerVoWrapper copy$default(RichContentSpacerVoWrapper richContentSpacerVoWrapper, RichContentVO.Item.Spacer spacer, int i11, String str, long j11, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            spacer = richContentSpacerVoWrapper.billboardVO;
        }
        if ((i12 & 2) != 0) {
            i11 = richContentSpacerVoWrapper.position;
        }
        if ((i12 & 4) != 0) {
            str = richContentSpacerVoWrapper.tabGroupId;
        }
        if ((i12 & 8) != 0) {
            j11 = richContentSpacerVoWrapper.id;
        }
        if ((i12 & 16) != 0) {
            z11 = richContentSpacerVoWrapper.isExpanded;
        }
        boolean z12 = z11;
        String str2 = str;
        return richContentSpacerVoWrapper.copy(spacer, i11, str2, j11, z12);
    }

    @NotNull
    public final RichContentSpacerVoWrapper copy(@NotNull RichContentVO.Item.Spacer billboardVO, int position, String tabGroupId, long id2, boolean isExpanded) {
        Intrinsics.checkNotNullParameter(billboardVO, "billboardVO");
        return new RichContentSpacerVoWrapper(billboardVO, position, tabGroupId, id2, isExpanded);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RichContentSpacerVoWrapper)) {
            return false;
        }
        RichContentSpacerVoWrapper richContentSpacerVoWrapper = (RichContentSpacerVoWrapper) other;
        return Intrinsics.d(this.billboardVO, richContentSpacerVoWrapper.billboardVO) && this.position == richContentSpacerVoWrapper.position && Intrinsics.d(this.tabGroupId, richContentSpacerVoWrapper.tabGroupId) && this.id == richContentSpacerVoWrapper.id && this.isExpanded == richContentSpacerVoWrapper.isExpanded;
    }

    @NotNull
    public final RichContentVO.Item.Spacer getBillboardVO() {
        return this.billboardVO;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
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
        int a11 = C2454a.a(this.position, this.billboardVO.hashCode() * 31, 31);
        String str = this.tabGroupId;
        return Boolean.hashCode(this.isExpanded) + c.a((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.id);
    }

    @Override // ru.ozon.app.android.pdp.widgets.richContent.presentation.RichContentVoWrapper
    /* renamed from: isExpanded, reason: from getter */
    public boolean getIsExpanded() {
        return this.isExpanded;
    }

    @NotNull
    public String toString() {
        RichContentVO.Item.Spacer spacer = this.billboardVO;
        int i11 = this.position;
        String str = this.tabGroupId;
        long j11 = this.id;
        boolean z11 = this.isExpanded;
        StringBuilder sb2 = new StringBuilder("RichContentSpacerVoWrapper(billboardVO=");
        sb2.append(spacer);
        sb2.append(", position=");
        sb2.append(i11);
        sb2.append(", tabGroupId=");
        sb2.append(str);
        sb2.append(", id=");
        sb2.append(j11);
        return b.f(sb2, ", isExpanded=", z11, ")");
    }
}

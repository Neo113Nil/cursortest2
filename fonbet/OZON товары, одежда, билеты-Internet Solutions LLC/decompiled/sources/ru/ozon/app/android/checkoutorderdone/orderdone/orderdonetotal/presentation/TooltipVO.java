package ru.ozon.app.android.checkoutorderdone.orderdone.orderdonetotal.presentation;

import Bi.a;
import Tl.b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonetotal/presentation/TooltipVO;", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "common", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TooltipVO {

    @NotNull
    private final CommonControlSettings common;

    @NotNull
    private final IconDTO icon;
    private final t tokenizedEvent;

    public TooltipVO(@NotNull IconDTO icon, @NotNull CommonControlSettings common, t tVar) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(common, "common");
        this.icon = icon;
        this.common = common;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TooltipVO)) {
            return false;
        }
        TooltipVO tooltipVO = (TooltipVO) other;
        return Intrinsics.d(this.icon, tooltipVO.icon) && Intrinsics.d(this.common, tooltipVO.common) && Intrinsics.d(this.tokenizedEvent, tooltipVO.tokenizedEvent);
    }

    @NotNull
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final IconDTO getIcon() {
        return this.icon;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public int hashCode() {
        int a11 = a.a(this.common, this.icon.hashCode() * 31, 31);
        t tVar = this.tokenizedEvent;
        return a11 + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        IconDTO iconDTO = this.icon;
        CommonControlSettings commonControlSettings = this.common;
        t tVar = this.tokenizedEvent;
        StringBuilder sb2 = new StringBuilder("TooltipVO(icon=");
        sb2.append(iconDTO);
        sb2.append(", common=");
        sb2.append(commonControlSettings);
        sb2.append(", tokenizedEvent=");
        return b.d(sb2, tVar, ")");
    }
}

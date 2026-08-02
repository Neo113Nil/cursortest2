package ru.ozon.fintech.ui.imageV20;

import Nh.a;
import android.widget.ImageView;
import androidx.annotation.Keep;
import com.detmir.recycli.adapters.RecyclerItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.utils.Common;
import ru.ozon.fintech.ui.utils.WidgetState;

@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BA\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0017\u001a\u00020\u0006H\u0016J\t\u0010\u0018\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006&"}, d2 = {"Lru/ozon/fintech/ui/imageV20/FinImageV20State;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "Lru/ozon/fintech/ui/utils/WidgetState;", "common", "Lru/ozon/fintech/ui/utils/Common;", "iconSrc", "", "icon", "iconBase64", "iconColor", "scaleType", "Landroid/widget/ImageView$ScaleType;", "<init>", "(Lru/ozon/fintech/ui/utils/Common;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/widget/ImageView$ScaleType;)V", "getCommon", "()Lru/ozon/fintech/ui/utils/Common;", "getIconSrc", "()Ljava/lang/String;", "getIcon", "getIconBase64", "getIconColor", "getScaleType", "()Landroid/widget/ImageView$ScaleType;", "provideId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FinImageV20State implements RecyclerItem, WidgetState {

    @NotNull
    private final Common common;
    private final String icon;
    private final String iconBase64;
    private final String iconColor;
    private final String iconSrc;
    private final ImageView.ScaleType scaleType;

    public FinImageV20State(@NotNull Common common, String str, String str2, String str3, String str4, ImageView.ScaleType scaleType) {
        Intrinsics.checkNotNullParameter(common, "common");
        this.common = common;
        this.iconSrc = str;
        this.icon = str2;
        this.iconBase64 = str3;
        this.iconColor = str4;
        this.scaleType = scaleType;
    }

    public static /* synthetic */ FinImageV20State copy$default(FinImageV20State finImageV20State, Common common, String str, String str2, String str3, String str4, ImageView.ScaleType scaleType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            common = finImageV20State.common;
        }
        if ((i11 & 2) != 0) {
            str = finImageV20State.iconSrc;
        }
        if ((i11 & 4) != 0) {
            str2 = finImageV20State.icon;
        }
        if ((i11 & 8) != 0) {
            str3 = finImageV20State.iconBase64;
        }
        if ((i11 & 16) != 0) {
            str4 = finImageV20State.iconColor;
        }
        if ((i11 & 32) != 0) {
            scaleType = finImageV20State.scaleType;
        }
        String str5 = str4;
        ImageView.ScaleType scaleType2 = scaleType;
        return finImageV20State.copy(common, str, str2, str3, str5, scaleType2);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public boolean areContentsTheSame(@NotNull RecyclerItem recyclerItem) {
        return RecyclerItem.a.a(this, recyclerItem);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Common getCommon() {
        return this.common;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIconSrc() {
        return this.iconSrc;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component4, reason: from getter */
    public final String getIconBase64() {
        return this.iconBase64;
    }

    /* renamed from: component5, reason: from getter */
    public final String getIconColor() {
        return this.iconColor;
    }

    /* renamed from: component6, reason: from getter */
    public final ImageView.ScaleType getScaleType() {
        return this.scaleType;
    }

    @NotNull
    public final FinImageV20State copy(@NotNull Common common, String iconSrc, String icon, String iconBase64, String iconColor, ImageView.ScaleType scaleType) {
        Intrinsics.checkNotNullParameter(common, "common");
        return new FinImageV20State(common, iconSrc, icon, iconBase64, iconColor, scaleType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinImageV20State)) {
            return false;
        }
        FinImageV20State finImageV20State = (FinImageV20State) other;
        return Intrinsics.d(this.common, finImageV20State.common) && Intrinsics.d(this.iconSrc, finImageV20State.iconSrc) && Intrinsics.d(this.icon, finImageV20State.icon) && Intrinsics.d(this.iconBase64, finImageV20State.iconBase64) && Intrinsics.d(this.iconColor, finImageV20State.iconColor) && this.scaleType == finImageV20State.scaleType;
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetState
    @NotNull
    public Common getCommon() {
        return this.common;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getIconBase64() {
        return this.iconBase64;
    }

    public final String getIconColor() {
        return this.iconColor;
    }

    public final String getIconSrc() {
        return this.iconSrc;
    }

    public final ImageView.ScaleType getScaleType() {
        return this.scaleType;
    }

    public int hashCode() {
        int hashCode = this.common.hashCode() * 31;
        String str = this.iconSrc;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.icon;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.iconBase64;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.iconColor;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ImageView.ScaleType scaleType = this.scaleType;
        return hashCode5 + (scaleType != null ? scaleType.hashCode() : 0);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    @NotNull
    public String provideId() {
        return getCommon().getWidgetId();
    }

    @NotNull
    public String toString() {
        Common common = this.common;
        String str = this.iconSrc;
        String str2 = this.icon;
        String str3 = this.iconBase64;
        String str4 = this.iconColor;
        ImageView.ScaleType scaleType = this.scaleType;
        StringBuilder sb2 = new StringBuilder("FinImageV20State(common=");
        sb2.append(common);
        sb2.append(", iconSrc=");
        sb2.append(str);
        sb2.append(", icon=");
        a.h(sb2, str2, ", iconBase64=", str3, ", iconColor=");
        sb2.append(str4);
        sb2.append(", scaleType=");
        sb2.append(scaleType);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }
}

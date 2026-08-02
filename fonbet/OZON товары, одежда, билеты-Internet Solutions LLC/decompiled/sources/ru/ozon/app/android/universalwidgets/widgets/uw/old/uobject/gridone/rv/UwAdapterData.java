package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.rv;

import B0.C2454a;
import Pk0.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model.ObjectItemsVO;
import ru.ozon.uni.atoms.data.common.CornerRadius;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010\u0013R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/rv/UwAdapterData;", "", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "ratio", "", "textColor", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemsVO$Paddings;", "paddings", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadius", "<init>", "(Ll20/d;FILru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemsVO$Paddings;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ll20/d;", "getInfo", "()Ll20/d;", "F", "getRatio", "()F", "I", "getTextColor", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemsVO$Paddings;", "getPaddings", "()Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemsVO$Paddings;", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UwAdapterData {

    @NotNull
    private final CornerRadius cornerRadius;
    private final d info;
    private final ObjectItemsVO.Paddings paddings;
    private final float ratio;
    private final int textColor;

    public UwAdapterData(d dVar, float f7, int i11, ObjectItemsVO.Paddings paddings, @NotNull CornerRadius cornerRadius) {
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        this.info = dVar;
        this.ratio = f7;
        this.textColor = i11;
        this.paddings = paddings;
        this.cornerRadius = cornerRadius;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UwAdapterData)) {
            return false;
        }
        UwAdapterData uwAdapterData = (UwAdapterData) other;
        return Intrinsics.d(this.info, uwAdapterData.info) && Float.compare(this.ratio, uwAdapterData.ratio) == 0 && this.textColor == uwAdapterData.textColor && Intrinsics.d(this.paddings, uwAdapterData.paddings) && this.cornerRadius == uwAdapterData.cornerRadius;
    }

    @NotNull
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    public final ObjectItemsVO.Paddings getPaddings() {
        return this.paddings;
    }

    public final float getRatio() {
        return this.ratio;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        d dVar = this.info;
        int a11 = C2454a.a(this.textColor, b.a(this.ratio, (dVar == null ? 0 : dVar.hashCode()) * 31, 31), 31);
        ObjectItemsVO.Paddings paddings = this.paddings;
        return this.cornerRadius.hashCode() + ((a11 + (paddings != null ? paddings.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "UwAdapterData(info=" + this.info + ", ratio=" + this.ratio + ", textColor=" + this.textColor + ", paddings=" + this.paddings + ", cornerRadius=" + this.cornerRadius + ")";
    }
}

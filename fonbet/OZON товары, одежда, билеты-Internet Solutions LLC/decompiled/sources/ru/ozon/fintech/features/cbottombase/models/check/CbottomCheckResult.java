package ru.ozon.fintech.features.cbottombase.models.check;

import B90.C2618u;
import Kk.C3532b;
import Lh.a;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lru/ozon/fintech/features/cbottombase/models/check/CbottomCheckResult;", "", "canRender", "", "canUpdate", "supportedTypes", "", "", "<init>", "(ZZLjava/util/List;)V", "getCanRender", "()Z", "getCanUpdate", "getSupportedTypes", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "cbottom-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CbottomCheckResult {
    private final boolean canRender;
    private final boolean canUpdate;

    @NotNull
    private final List<String> supportedTypes;

    public CbottomCheckResult(@i(name = "can_render") boolean z11, @i(name = "can_update") boolean z12, @i(name = "supported_types") @NotNull List<String> supportedTypes) {
        Intrinsics.checkNotNullParameter(supportedTypes, "supportedTypes");
        this.canRender = z11;
        this.canUpdate = z12;
        this.supportedTypes = supportedTypes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CbottomCheckResult copy$default(CbottomCheckResult cbottomCheckResult, boolean z11, boolean z12, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = cbottomCheckResult.canRender;
        }
        if ((i11 & 2) != 0) {
            z12 = cbottomCheckResult.canUpdate;
        }
        if ((i11 & 4) != 0) {
            list = cbottomCheckResult.supportedTypes;
        }
        return cbottomCheckResult.copy(z11, z12, list);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getCanRender() {
        return this.canRender;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getCanUpdate() {
        return this.canUpdate;
    }

    @NotNull
    public final List<String> component3() {
        return this.supportedTypes;
    }

    @NotNull
    public final CbottomCheckResult copy(@i(name = "can_render") boolean canRender, @i(name = "can_update") boolean canUpdate, @i(name = "supported_types") @NotNull List<String> supportedTypes) {
        Intrinsics.checkNotNullParameter(supportedTypes, "supportedTypes");
        return new CbottomCheckResult(canRender, canUpdate, supportedTypes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CbottomCheckResult)) {
            return false;
        }
        CbottomCheckResult cbottomCheckResult = (CbottomCheckResult) other;
        return this.canRender == cbottomCheckResult.canRender && this.canUpdate == cbottomCheckResult.canUpdate && Intrinsics.d(this.supportedTypes, cbottomCheckResult.supportedTypes);
    }

    public final boolean getCanRender() {
        return this.canRender;
    }

    public final boolean getCanUpdate() {
        return this.canUpdate;
    }

    @NotNull
    public final List<String> getSupportedTypes() {
        return this.supportedTypes;
    }

    public int hashCode() {
        return this.supportedTypes.hashCode() + C3532b.a(Boolean.hashCode(this.canRender) * 31, 31, this.canUpdate);
    }

    @NotNull
    public String toString() {
        boolean z11 = this.canRender;
        boolean z12 = this.canUpdate;
        return C2618u.h(a.d("CbottomCheckResult(canRender=", ", canUpdate=", ", supportedTypes=", z11, z12), this.supportedTypes, ")");
    }
}

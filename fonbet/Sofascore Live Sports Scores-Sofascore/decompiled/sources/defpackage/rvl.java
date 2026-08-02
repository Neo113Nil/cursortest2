package defpackage;

import com.blaze.blazesdk.features.shared.models.ui_shared.BaseLayerType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rvl {
    public final BaseLayerType a;
    public final nfm b;

    public rvl(@Nullable BaseLayerType baseLayerType, @NotNull nfm nfmVar) {
        nfmVar.getClass();
        this.a = baseLayerType;
        this.b = nfmVar;
    }

    public static rvl copy$default(rvl rvlVar, BaseLayerType baseLayerType, nfm nfmVar, int i, Object obj) {
        if ((i & 1) != 0) {
            baseLayerType = rvlVar.a;
        }
        if ((i & 2) != 0) {
            nfmVar = rvlVar.b;
        }
        rvlVar.getClass();
        nfmVar.getClass();
        return new rvl(baseLayerType, nfmVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rvl)) {
            return false;
        }
        rvl rvlVar = (rvl) obj;
        return this.a == rvlVar.a && Intrinsics.c(this.b, rvlVar.b);
    }

    public final int hashCode() {
        BaseLayerType baseLayerType = this.a;
        return this.b.hashCode() + ((baseLayerType == null ? 0 : baseLayerType.hashCode()) * 31);
    }

    public final String toString() {
        return "BaseLayerModel(type=" + this.a + ", content=" + this.b + ')';
    }
}

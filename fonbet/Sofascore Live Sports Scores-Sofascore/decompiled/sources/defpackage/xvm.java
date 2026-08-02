package defpackage;

import com.blaze.blazesdk.style.widgets.BlazeWidgetItemImageStyle;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xvm {
    public final List a;
    public final BlazeWidgetItemImageStyle.BlazeThumbnailType b;

    public xvm(@NotNull List<atm> list, @Nullable BlazeWidgetItemImageStyle.BlazeThumbnailType blazeThumbnailType) {
        list.getClass();
        this.a = list;
        this.b = blazeThumbnailType;
    }

    public static xvm copy$default(xvm xvmVar, List list, BlazeWidgetItemImageStyle.BlazeThumbnailType blazeThumbnailType, int i, Object obj) {
        if ((i & 1) != 0) {
            list = xvmVar.a;
        }
        if ((i & 2) != 0) {
            blazeThumbnailType = xvmVar.b;
        }
        xvmVar.getClass();
        list.getClass();
        return new xvm(list, blazeThumbnailType);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xvm)) {
            return false;
        }
        xvm xvmVar = (xvm) obj;
        return Intrinsics.c(this.a, xvmVar.a) && this.b == xvmVar.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        BlazeWidgetItemImageStyle.BlazeThumbnailType blazeThumbnailType = this.b;
        return hashCode + (blazeThumbnailType == null ? 0 : blazeThumbnailType.hashCode());
    }

    public final String toString() {
        return "ThumbnailModel(renditions=" + this.a + ", type=" + this.b + ')';
    }
}

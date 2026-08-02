package ru.ozon.app.android.ugc.core.widgets.singlereview.aspects;

import K00.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u000e¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/aspects/SingleReviewAspectsDO;", "", "", "uuid", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "aspects", "", "bottomPadding", "<init>", "(Ljava/lang/String;Ljava/util/List;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUuid", "Ljava/util/List;", "getAspects", "()Ljava/util/List;", "I", "getBottomPadding", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SingleReviewAspectsDO {
    private final List<BadgeDTO> aspects;
    private final int bottomPadding;

    @NotNull
    private final String uuid;

    public SingleReviewAspectsDO(@NotNull String uuid, List<BadgeDTO> list, int i11) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.uuid = uuid;
        this.aspects = list;
        this.bottomPadding = i11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleReviewAspectsDO)) {
            return false;
        }
        SingleReviewAspectsDO singleReviewAspectsDO = (SingleReviewAspectsDO) other;
        return Intrinsics.d(this.uuid, singleReviewAspectsDO.uuid) && Intrinsics.d(this.aspects, singleReviewAspectsDO.aspects) && this.bottomPadding == singleReviewAspectsDO.bottomPadding;
    }

    public final List<BadgeDTO> getAspects() {
        return this.aspects;
    }

    public final int getBottomPadding() {
        return this.bottomPadding;
    }

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        int hashCode = this.uuid.hashCode() * 31;
        List<BadgeDTO> list = this.aspects;
        return Integer.hashCode(this.bottomPadding) + ((hashCode + (list == null ? 0 : list.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        return b.e(this.bottomPadding, ")", Tl.b.f("SingleReviewAspectsDO(uuid=", this.uuid, ", aspects=", ", bottomPadding=", this.aspects));
    }
}

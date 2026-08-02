package ru.ozon.app.android.ugc.core.widgets.reviewStatusInfo.image;

import GR.b;
import Nh.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\"\u0010 R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b#\u0010 ¨\u0006$"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewStatusInfo/image/CommonImageVO;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "Lru/ozon/uni/atoms/data/common/Paddings;", "leftMargin", "topMargin", "rightMargin", "bottomMargin", "<init>", "(JLru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/data/common/Paddings;", "getLeftMargin", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getTopMargin", "getRightMargin", "getBottomMargin", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CommonImageVO implements c {

    @NotNull
    private final Paddings bottomMargin;
    private final long id;

    @NotNull
    private final ImageDTO image;

    @NotNull
    private final Paddings leftMargin;

    @NotNull
    private final Paddings rightMargin;

    @NotNull
    private final Paddings topMargin;

    public CommonImageVO(long j11, @NotNull ImageDTO image, @NotNull Paddings leftMargin, @NotNull Paddings topMargin, @NotNull Paddings rightMargin, @NotNull Paddings bottomMargin) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(leftMargin, "leftMargin");
        Intrinsics.checkNotNullParameter(topMargin, "topMargin");
        Intrinsics.checkNotNullParameter(rightMargin, "rightMargin");
        Intrinsics.checkNotNullParameter(bottomMargin, "bottomMargin");
        this.id = j11;
        this.image = image;
        this.leftMargin = leftMargin;
        this.topMargin = topMargin;
        this.rightMargin = rightMargin;
        this.bottomMargin = bottomMargin;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonImageVO)) {
            return false;
        }
        CommonImageVO commonImageVO = (CommonImageVO) other;
        return this.id == commonImageVO.id && Intrinsics.d(this.image, commonImageVO.image) && this.leftMargin == commonImageVO.leftMargin && this.topMargin == commonImageVO.topMargin && this.rightMargin == commonImageVO.rightMargin && this.bottomMargin == commonImageVO.bottomMargin;
    }

    @NotNull
    public final Paddings getBottomMargin() {
        return this.bottomMargin;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final ImageDTO getImage() {
        return this.image;
    }

    @NotNull
    public final Paddings getLeftMargin() {
        return this.leftMargin;
    }

    @NotNull
    public final Paddings getRightMargin() {
        return this.rightMargin;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final Paddings getTopMargin() {
        return this.topMargin;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.bottomMargin.hashCode() + b.b(this.rightMargin, b.b(this.topMargin, b.b(this.leftMargin, a.b(this.image, Long.hashCode(this.id) * 31, 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ImageDTO imageDTO = this.image;
        Paddings paddings = this.leftMargin;
        Paddings paddings2 = this.topMargin;
        Paddings paddings3 = this.rightMargin;
        Paddings paddings4 = this.bottomMargin;
        StringBuilder c11 = Nh.b.c("CommonImageVO(id=", j11, ", image=", imageDTO);
        c11.append(", leftMargin=");
        c11.append(paddings);
        c11.append(", topMargin=");
        c11.append(paddings2);
        c11.append(", rightMargin=");
        c11.append(paddings3);
        c11.append(", bottomMargin=");
        c11.append(paddings4);
        c11.append(")");
        return c11.toString();
    }
}

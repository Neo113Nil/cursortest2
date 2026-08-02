package ru.ozon.android.composerCommonViewKit.compose.widget.commonimage.presentation;

import Nh.a;
import Nh.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.core.models.UniPaddingToken;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\"\u0010 R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b#\u0010 ¨\u0006$"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/commonimage/presentation/CommonImageVO;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "Lru/ozon/uni/core/models/UniPaddingToken;", "leftMargin", "topMargin", "rightMargin", "bottomMargin", "<init>", "(JLru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/core/models/UniPaddingToken;Lru/ozon/uni/core/models/UniPaddingToken;Lru/ozon/uni/core/models/UniPaddingToken;Lru/ozon/uni/core/models/UniPaddingToken;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/core/models/UniPaddingToken;", "getLeftMargin", "()Lru/ozon/uni/core/models/UniPaddingToken;", "getTopMargin", "getRightMargin", "getBottomMargin", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CommonImageVO implements c {
    public static final int $stable = UniPaddingToken.$stable;

    @NotNull
    private final UniPaddingToken bottomMargin;
    private final long id;

    @NotNull
    private final ImageDTO image;

    @NotNull
    private final UniPaddingToken leftMargin;

    @NotNull
    private final UniPaddingToken rightMargin;

    @NotNull
    private final UniPaddingToken topMargin;

    public CommonImageVO(long j11, @NotNull ImageDTO image, @NotNull UniPaddingToken leftMargin, @NotNull UniPaddingToken topMargin, @NotNull UniPaddingToken rightMargin, @NotNull UniPaddingToken bottomMargin) {
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
        return this.id == commonImageVO.id && Intrinsics.d(this.image, commonImageVO.image) && Intrinsics.d(this.leftMargin, commonImageVO.leftMargin) && Intrinsics.d(this.topMargin, commonImageVO.topMargin) && Intrinsics.d(this.rightMargin, commonImageVO.rightMargin) && Intrinsics.d(this.bottomMargin, commonImageVO.bottomMargin);
    }

    @NotNull
    public final UniPaddingToken getBottomMargin() {
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
    public final UniPaddingToken getLeftMargin() {
        return this.leftMargin;
    }

    @NotNull
    public final UniPaddingToken getRightMargin() {
        return this.rightMargin;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final UniPaddingToken getTopMargin() {
        return this.topMargin;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.bottomMargin.hashCode() + ((this.rightMargin.hashCode() + ((this.topMargin.hashCode() + ((this.leftMargin.hashCode() + a.b(this.image, Long.hashCode(this.id) * 31, 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ImageDTO imageDTO = this.image;
        UniPaddingToken uniPaddingToken = this.leftMargin;
        UniPaddingToken uniPaddingToken2 = this.topMargin;
        UniPaddingToken uniPaddingToken3 = this.rightMargin;
        UniPaddingToken uniPaddingToken4 = this.bottomMargin;
        StringBuilder c11 = b.c("CommonImageVO(id=", j11, ", image=", imageDTO);
        c11.append(", leftMargin=");
        c11.append(uniPaddingToken);
        c11.append(", topMargin=");
        c11.append(uniPaddingToken2);
        c11.append(", rightMargin=");
        c11.append(uniPaddingToken3);
        c11.append(", bottomMargin=");
        c11.append(uniPaddingToken4);
        c11.append(")");
        return c11.toString();
    }
}

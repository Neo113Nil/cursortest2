package ru.ozon.app.android.returns.creation.widgets.methods.presentation.images;

import G.g;
import Nh.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.creation.widgets.methods.presentation.Paddings;
import ru.ozon.app.android.returns.ui.presentation.flexImages.ImageVI;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/methods/presentation/images/ImagesElementVO;", "Ll20/c;", "", "id", "Lru/ozon/app/android/returns/creation/widgets/methods/presentation/Paddings;", "paddings", "", "backgroundColor", "", "Lru/ozon/app/android/returns/ui/presentation/flexImages/ImageVI;", "images", "<init>", "(JLru/ozon/app/android/returns/creation/widgets/methods/presentation/Paddings;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/returns/creation/widgets/methods/presentation/Paddings;", "getPaddings", "()Lru/ozon/app/android/returns/creation/widgets/methods/presentation/Paddings;", "Ljava/lang/String;", "getBackgroundColor", "Ljava/util/List;", "getImages", "()Ljava/util/List;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ImagesElementVO implements c {

    @NotNull
    private final String backgroundColor;
    private final long id;

    @NotNull
    private final List<ImageVI> images;

    @NotNull
    private final Paddings paddings;

    /* JADX WARN: Multi-variable type inference failed */
    public ImagesElementVO(long j11, @NotNull Paddings paddings, @NotNull String backgroundColor, @NotNull List<? extends ImageVI> images) {
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(images, "images");
        this.id = j11;
        this.paddings = paddings;
        this.backgroundColor = backgroundColor;
        this.images = images;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImagesElementVO)) {
            return false;
        }
        ImagesElementVO imagesElementVO = (ImagesElementVO) other;
        return this.id == imagesElementVO.id && Intrinsics.d(this.paddings, imagesElementVO.paddings) && Intrinsics.d(this.backgroundColor, imagesElementVO.backgroundColor) && Intrinsics.d(this.images, imagesElementVO.images);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<ImageVI> getImages() {
        return this.images;
    }

    @NotNull
    public final Paddings getPaddings() {
        return this.paddings;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.images.hashCode() + g.a((this.paddings.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31, this.backgroundColor);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        Paddings paddings = this.paddings;
        String str = this.backgroundColor;
        List<ImageVI> list = this.images;
        StringBuilder sb2 = new StringBuilder("ImagesElementVO(id=");
        sb2.append(j11);
        sb2.append(", paddings=");
        sb2.append(paddings);
        a.g(", backgroundColor=", str, ", images=", sb2, list);
        sb2.append(")");
        return sb2.toString();
    }
}

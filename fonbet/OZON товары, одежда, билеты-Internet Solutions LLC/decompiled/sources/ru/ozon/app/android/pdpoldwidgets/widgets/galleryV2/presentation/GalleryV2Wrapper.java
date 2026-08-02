package ru.ozon.app.android.pdpoldwidgets.widgets.galleryV2.presentation;

import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m10.o;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdpoldwidgets.widgets.galleryV2.presentation.GalleryV2VO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010#\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001fR\u0019\u0010&\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b%\u0010\u001fR\u0013\u0010*\u001a\u0004\u0018\u00010'8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0013\u0010.\u001a\u0004\u0018\u00010+8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0013\u00100\u001a\u0004\u0018\u00010+8F¢\u0006\u0006\u001a\u0004\b/\u0010-R\u0011\u00101\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u00103\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b3\u00102R\u0013\u00107\u001a\u0004\u0018\u0001048F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0013\u00109\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b8\u0010\f¨\u0006:"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/presentation/GalleryV2Wrapper;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lm10/o;", "", "id", "Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/presentation/GalleryV2VO;", "galleryVO", "<init>", "(JLru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/presentation/GalleryV2VO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/presentation/GalleryV2VO;", "widgetName", "Ljava/lang/String;", "getWidgetName", "", "Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/presentation/GalleryV2VO$GalleryItem;", "getItems", "()Ljava/util/List;", "items", "Lru/ozon/uni/atoms/data/badge/Badge;", "getBadges", "badges", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeIconButton;", "getButtons", "buttons", "", "getRatio", "()Ljava/lang/Float;", "ratio", "LWZ/t;", "getGalleryTokenizedEvent", "()LWZ/t;", "galleryTokenizedEvent", "getPopupTokenizedEvent", "popupTokenizedEvent", "isEmptyGallery", "()Z", "isClassified", "Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/presentation/GalleryV2VO$ClassifiedInfoVO;", "getClassifiedInfo", "()Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/presentation/GalleryV2VO$ClassifiedInfoVO;", "classifiedInfo", "getBackgroundColor", "backgroundColor", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class GalleryV2Wrapper implements c, o {

    @NotNull
    private final GalleryV2VO galleryVO;
    private final long id;

    @NotNull
    private final String widgetName;

    public GalleryV2Wrapper(long j11, @NotNull GalleryV2VO galleryVO) {
        Intrinsics.checkNotNullParameter(galleryVO, "galleryVO");
        this.id = j11;
        this.galleryVO = galleryVO;
        this.widgetName = "pdp_product";
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GalleryV2Wrapper)) {
            return false;
        }
        GalleryV2Wrapper galleryV2Wrapper = (GalleryV2Wrapper) other;
        return this.id == galleryV2Wrapper.id && Intrinsics.d(this.galleryVO, galleryV2Wrapper.galleryVO);
    }

    public final String getBackgroundColor() {
        return this.galleryVO.getBackgroundColor();
    }

    public final List<Badge> getBadges() {
        return this.galleryVO.getBadges();
    }

    public final List<ButtonV3Atom.LargeIconButton> getButtons() {
        return this.galleryVO.getButtons();
    }

    public final GalleryV2VO.ClassifiedInfoVO getClassifiedInfo() {
        return this.galleryVO.getClassifiedInfo();
    }

    public final t getGalleryTokenizedEvent() {
        return this.galleryVO.getGalleryTokenizedEvent();
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<GalleryV2VO.GalleryItem> getItems() {
        return this.galleryVO.getItems();
    }

    public final t getPopupTokenizedEvent() {
        return this.galleryVO.getPopupTokenizedEvent();
    }

    public final Float getRatio() {
        return this.galleryVO.getRatio();
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    @Override // m10.o
    @NotNull
    public String getWidgetName() {
        return this.widgetName;
    }

    public int hashCode() {
        return this.galleryVO.hashCode() + (Long.hashCode(this.id) * 31);
    }

    public final boolean isClassified() {
        return this.galleryVO.getIsClassified();
    }

    public final boolean isEmptyGallery() {
        return this.galleryVO.getIsEmptyGallery();
    }

    @NotNull
    public String toString() {
        return "GalleryV2Wrapper(id=" + this.id + ", galleryVO=" + this.galleryVO + ")";
    }
}

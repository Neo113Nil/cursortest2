package defpackage;

import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ol2 extends ffb {
    public final /* synthetic */ int g;
    public final /* synthetic */ CarouselLayoutManager h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ol2(CarouselLayoutManager carouselLayoutManager, int i) {
        super(1, 4);
        this.g = i;
        switch (i) {
            case 1:
                this.h = carouselLayoutManager;
                super(0, 4);
                break;
            default:
                this.h = carouselLayoutManager;
                break;
        }
    }

    @Override // defpackage.ffb
    public final int j() {
        int i = this.g;
        CarouselLayoutManager carouselLayoutManager = this.h;
        switch (i) {
            case 0:
                return carouselLayoutManager.getHeight();
            default:
                return carouselLayoutManager.getHeight() - carouselLayoutManager.getPaddingBottom();
        }
    }

    @Override // defpackage.ffb
    public final int k() {
        switch (this.g) {
            case 0:
                return this.h.getPaddingLeft();
            default:
                return 0;
        }
    }

    @Override // defpackage.ffb
    public final int l() {
        int i = this.g;
        CarouselLayoutManager carouselLayoutManager = this.h;
        switch (i) {
            case 0:
                return carouselLayoutManager.getWidth() - carouselLayoutManager.getPaddingRight();
            default:
                return carouselLayoutManager.getWidth();
        }
    }

    @Override // defpackage.ffb
    public final int m() {
        switch (this.g) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.h;
                if (carouselLayoutManager.f()) {
                    return carouselLayoutManager.getWidth();
                }
                return 0;
        }
    }

    @Override // defpackage.ffb
    public final int n() {
        switch (this.g) {
            case 0:
                return 0;
            default:
                return this.h.getPaddingTop();
        }
    }
}

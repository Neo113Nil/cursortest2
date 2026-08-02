package ru.ozon.app.android.pdp.widgets.aspectsV4.presentation.rv;

import Sc.InterfaceC4008j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u001d\b\u0001\u0018\u0000 '2\u00020\u0001:\u0001'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0013\u0010\nR\u001b\u0010\u0017\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\nR\u001b\u0010\u001a\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\nR\u001b\u0010\u001d\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u000fR\u001b\u0010 \u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\nR\u001b\u0010#\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0015\u001a\u0004\b\"\u0010\u000fR\u001b\u0010&\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0015\u001a\u0004\b%\u0010\u000f¨\u0006("}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/AspectsV4ImageConst;", "", "", "isSelect", "<init>", "(Z)V", "", "imageWidth", "I", "getImageWidth", "()I", "", "imageRadius", "F", "getImageRadius", "()F", "strokeBorderWidth", "getStrokeBorderWidth", "imageBorderWidth", "getImageBorderWidth", "waveHeight$delegate", "LSc/j;", "getWaveHeight", "waveHeight", "waveWithBorderHeight$delegate", "getWaveWithBorderHeight", "waveWithBorderHeight", "_waveWithBorderWidth$delegate", "get_waveWithBorderWidth", "_waveWithBorderWidth", "waveWithBorderWidth$delegate", "getWaveWithBorderWidth", "waveWithBorderWidth", "singleWaveWidth$delegate", "getSingleWaveWidth", "singleWaveWidth", "singleWaveWithBorderWidth$delegate", "getSingleWaveWithBorderWidth", "singleWaveWithBorderWidth", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AspectsV4ImageConst {

    /* renamed from: _waveWithBorderWidth$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j _waveWithBorderWidth;
    private final int imageBorderWidth;
    private final float imageRadius;
    private final int imageWidth;

    /* renamed from: singleWaveWidth$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j singleWaveWidth;

    /* renamed from: singleWaveWithBorderWidth$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j singleWaveWithBorderWidth;
    private final float strokeBorderWidth;

    /* renamed from: waveHeight$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j waveHeight;

    /* renamed from: waveWithBorderHeight$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j waveWithBorderHeight;

    /* renamed from: waveWithBorderWidth$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j waveWithBorderWidth;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final int OVER_BOUNDS = Dimens.INSTANCE.getDP_4();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/AspectsV4ImageConst$Companion;", "", "<init>", "()V", "OVER_BOUNDS", "", "getOVER_BOUNDS", "()I", "SELECT_IMAGE_WIDTH", "IMAGE_WIDTH", "WAVES_AMOUNT", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getOVER_BOUNDS() {
            return AspectsV4ImageConst.OVER_BOUNDS;
        }

        private Companion() {
        }
    }

    public AspectsV4ImageConst(boolean z11) {
        this.imageWidth = UiExtKt.toPx(z11 ? 64 : 56);
        this.imageRadius = UiExtKt.toPxF((z11 ? CornerRadius.RADIUS_550 : CornerRadius.RADIUS_500).getPx());
        Dimens dimens = Dimens.INSTANCE;
        float dpf_8 = z11 ? dimens.getDPF_8() : dimens.getDPF_12();
        this.strokeBorderWidth = dpf_8;
        this.imageBorderWidth = (int) (dpf_8 / 2);
        this.waveHeight = DelegatesKt.lazyUnsafe(new AspectsV4ImageConst$waveHeight$2(z11));
        this.waveWithBorderHeight = DelegatesKt.lazyUnsafe(new AspectsV4ImageConst$waveWithBorderHeight$2(z11));
        this._waveWithBorderWidth = DelegatesKt.lazyUnsafe(new AspectsV4ImageConst$_waveWithBorderWidth$2(this));
        this.waveWithBorderWidth = DelegatesKt.lazyUnsafe(new AspectsV4ImageConst$waveWithBorderWidth$2(z11, this));
        this.singleWaveWidth = DelegatesKt.lazyUnsafe(new AspectsV4ImageConst$singleWaveWidth$2(this));
        this.singleWaveWithBorderWidth = DelegatesKt.lazyUnsafe(new AspectsV4ImageConst$singleWaveWithBorderWidth$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float get_waveWithBorderWidth() {
        return ((Number) this._waveWithBorderWidth.getValue()).floatValue();
    }

    public final int getImageBorderWidth() {
        return this.imageBorderWidth;
    }

    public final float getImageRadius() {
        return this.imageRadius;
    }

    public final int getImageWidth() {
        return this.imageWidth;
    }

    public final float getSingleWaveWidth() {
        return ((Number) this.singleWaveWidth.getValue()).floatValue();
    }

    public final float getSingleWaveWithBorderWidth() {
        return ((Number) this.singleWaveWithBorderWidth.getValue()).floatValue();
    }

    public final float getStrokeBorderWidth() {
        return this.strokeBorderWidth;
    }

    public final int getWaveHeight() {
        return ((Number) this.waveHeight.getValue()).intValue();
    }

    public final int getWaveWithBorderHeight() {
        return ((Number) this.waveWithBorderHeight.getValue()).intValue();
    }

    public final int getWaveWithBorderWidth() {
        return ((Number) this.waveWithBorderWidth.getValue()).intValue();
    }
}

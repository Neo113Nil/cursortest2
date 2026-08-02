package ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.vo;

import Ak.C2436a;
import B0.C2454a;
import G.g;
import Kk.C3532b;
import Xc.a;
import Xc.b;
import android.widget.ImageView;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001,BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b%\u0010\u0016R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b\u000e\u0010(R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010)\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileModelImage;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", ImagesContract.URL, "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileModelImage$Ratio;", "ratio", "", "widthImage", "heightImage", "", "enableParanja", "isCompactFavoriteIcon", "Landroid/widget/ImageView$ScaleType;", "scaleType", "<init>", "(JLjava/lang/String;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileModelImage$Ratio;IIZZLandroid/widget/ImageView$ScaleType;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getUrl", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileModelImage$Ratio;", "getRatio", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileModelImage$Ratio;", "I", "getWidthImage", "getHeightImage", "Z", "getEnableParanja", "()Z", "Landroid/widget/ImageView$ScaleType;", "getScaleType", "()Landroid/widget/ImageView$ScaleType;", "Ratio", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SmallTileModelImage implements c {
    private final boolean enableParanja;
    private final int heightImage;
    private final long id;
    private final boolean isCompactFavoriteIcon;

    @NotNull
    private final Ratio ratio;

    @NotNull
    private final ImageView.ScaleType scaleType;

    @NotNull
    private final String url;
    private final int widthImage;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileModelImage$Ratio;", "", "ratio", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;F)V", "getRatio", "()Ljava/lang/String;", "getValue", "()F", "RATIO_1_1", "RATIO_3_4", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Ratio {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Ratio[] $VALUES;
        public static final Ratio RATIO_1_1 = new Ratio("RATIO_1_1", 0, "1:1", 1.0f);
        public static final Ratio RATIO_3_4 = new Ratio("RATIO_3_4", 1, "3:4", 1.3333334f);

        @NotNull
        private final String ratio;
        private final float value;

        private static final /* synthetic */ Ratio[] $values() {
            return new Ratio[]{RATIO_1_1, RATIO_3_4};
        }

        static {
            Ratio[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Ratio(String str, int i11, String str2, float f7) {
            this.ratio = str2;
            this.value = f7;
        }

        public static Ratio valueOf(String str) {
            return (Ratio) Enum.valueOf(Ratio.class, str);
        }

        public static Ratio[] values() {
            return (Ratio[]) $VALUES.clone();
        }

        @NotNull
        public final String getRatio() {
            return this.ratio;
        }

        public final float getValue() {
            return this.value;
        }
    }

    public SmallTileModelImage(long j11, @NotNull String url, @NotNull Ratio ratio, int i11, int i12, boolean z11, boolean z12, @NotNull ImageView.ScaleType scaleType) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(ratio, "ratio");
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        this.id = j11;
        this.url = url;
        this.ratio = ratio;
        this.widthImage = i11;
        this.heightImage = i12;
        this.enableParanja = z11;
        this.isCompactFavoriteIcon = z12;
        this.scaleType = scaleType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SmallTileModelImage)) {
            return false;
        }
        SmallTileModelImage smallTileModelImage = (SmallTileModelImage) other;
        return this.id == smallTileModelImage.id && Intrinsics.d(this.url, smallTileModelImage.url) && this.ratio == smallTileModelImage.ratio && this.widthImage == smallTileModelImage.widthImage && this.heightImage == smallTileModelImage.heightImage && this.enableParanja == smallTileModelImage.enableParanja && this.isCompactFavoriteIcon == smallTileModelImage.isCompactFavoriteIcon && this.scaleType == smallTileModelImage.scaleType;
    }

    public final boolean getEnableParanja() {
        return this.enableParanja;
    }

    public final int getHeightImage() {
        return this.heightImage;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final Ratio getRatio() {
        return this.ratio;
    }

    @NotNull
    public final ImageView.ScaleType getScaleType() {
        return this.scaleType;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public final int getWidthImage() {
        return this.widthImage;
    }

    public int hashCode() {
        return this.scaleType.hashCode() + C3532b.a(C3532b.a(C2454a.a(this.heightImage, C2454a.a(this.widthImage, (this.ratio.hashCode() + g.a(Long.hashCode(this.id) * 31, 31, this.url)) * 31, 31), 31), 31, this.enableParanja), 31, this.isCompactFavoriteIcon);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.url;
        Ratio ratio = this.ratio;
        int i11 = this.widthImage;
        int i12 = this.heightImage;
        boolean z11 = this.enableParanja;
        boolean z12 = this.isCompactFavoriteIcon;
        ImageView.ScaleType scaleType = this.scaleType;
        StringBuilder c11 = C2436a.c(j11, "SmallTileModelImage(id=", ", url=", str);
        c11.append(", ratio=");
        c11.append(ratio);
        c11.append(", widthImage=");
        c11.append(i11);
        c11.append(", heightImage=");
        c11.append(i12);
        c11.append(", enableParanja=");
        c11.append(z11);
        c11.append(", isCompactFavoriteIcon=");
        c11.append(z12);
        c11.append(", scaleType=");
        c11.append(scaleType);
        c11.append(")");
        return c11.toString();
    }
}

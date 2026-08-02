package ru.ozon.app.android.storefront.widgets.megadraw.presentation;

import C.o0;
import Co.a;
import Pk0.b;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/storefront/widgets/megadraw/presentation/PrizeBlockVO;", "", "", "backgroundColor", "Lru/ozon/uni/atoms/data/text/TextDTO;", "countTitle", "subtitle", "", "progress", "", "safeColorArray", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;F[I)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getCountTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "F", "getProgress", "()F", "[I", "getSafeColorArray", "()[I", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PrizeBlockVO {

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final TextDTO countTitle;
    private final float progress;
    private final int[] safeColorArray;

    @NotNull
    private final TextDTO subtitle;

    public PrizeBlockVO(@NotNull String backgroundColor, @NotNull TextDTO countTitle, @NotNull TextDTO subtitle, float f7, int[] iArr) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(countTitle, "countTitle");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.backgroundColor = backgroundColor;
        this.countTitle = countTitle;
        this.subtitle = subtitle;
        this.progress = f7;
        this.safeColorArray = iArr;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrizeBlockVO)) {
            return false;
        }
        PrizeBlockVO prizeBlockVO = (PrizeBlockVO) other;
        return Intrinsics.d(this.backgroundColor, prizeBlockVO.backgroundColor) && Intrinsics.d(this.countTitle, prizeBlockVO.countTitle) && Intrinsics.d(this.subtitle, prizeBlockVO.subtitle) && Float.compare(this.progress, prizeBlockVO.progress) == 0 && Intrinsics.d(this.safeColorArray, prizeBlockVO.safeColorArray);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final TextDTO getCountTitle() {
        return this.countTitle;
    }

    public final float getProgress() {
        return this.progress;
    }

    public final int[] getSafeColorArray() {
        return this.safeColorArray;
    }

    @NotNull
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public int hashCode() {
        int a11 = b.a(this.progress, Ns.b.a(this.subtitle, Ns.b.a(this.countTitle, this.backgroundColor.hashCode() * 31, 31), 31), 31);
        int[] iArr = this.safeColorArray;
        return a11 + (iArr == null ? 0 : Arrays.hashCode(iArr));
    }

    @NotNull
    public String toString() {
        String str = this.backgroundColor;
        TextDTO textDTO = this.countTitle;
        TextDTO textDTO2 = this.subtitle;
        float f7 = this.progress;
        String arrays = Arrays.toString(this.safeColorArray);
        StringBuilder b11 = a.b("PrizeBlockVO(backgroundColor=", textDTO, str, ", countTitle=", ", subtitle=");
        b11.append(textDTO2);
        b11.append(", progress=");
        b11.append(f7);
        b11.append(", safeColorArray=");
        return o0.c(b11, arrays, ")");
    }
}

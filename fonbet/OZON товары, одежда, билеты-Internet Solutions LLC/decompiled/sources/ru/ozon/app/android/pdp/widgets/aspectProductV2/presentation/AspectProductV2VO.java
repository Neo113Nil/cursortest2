package ru.ozon.app.android.pdp.widgets.aspectProductV2.presentation;

import Ak.C2436a;
import Fm.C3051a;
import G.g;
import Kk.C3532b;
import Ns.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b \u0010\u0013R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b\r\u0010(R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectProductV2/presentation/AspectProductV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "image", "deeplink", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "isAvailable", "", "imageAlpha", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/text/TextDTO;ZF)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getImage", "getDeeplink", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Z", "()Z", "F", "getImageAlpha", "()F", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AspectProductV2VO implements c {
    public static final int $stable = PriceDTO.$stable;
    private final String deeplink;
    private final long id;

    @NotNull
    private final String image;
    private final float imageAlpha;
    private final boolean isAvailable;

    @NotNull
    private final PriceDTO price;

    @NotNull
    private final TextDTO title;

    public AspectProductV2VO(long j11, @NotNull String image, String str, @NotNull PriceDTO price, @NotNull TextDTO title, boolean z11, float f7) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = j11;
        this.image = image;
        this.deeplink = str;
        this.price = price;
        this.title = title;
        this.isAvailable = z11;
        this.imageAlpha = f7;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AspectProductV2VO)) {
            return false;
        }
        AspectProductV2VO aspectProductV2VO = (AspectProductV2VO) other;
        return this.id == aspectProductV2VO.id && Intrinsics.d(this.image, aspectProductV2VO.image) && Intrinsics.d(this.deeplink, aspectProductV2VO.deeplink) && Intrinsics.d(this.price, aspectProductV2VO.price) && Intrinsics.d(this.title, aspectProductV2VO.title) && this.isAvailable == aspectProductV2VO.isAvailable && Float.compare(this.imageAlpha, aspectProductV2VO.imageAlpha) == 0;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    public final float getImageAlpha() {
        return this.imageAlpha;
    }

    @NotNull
    public final PriceDTO getPrice() {
        return this.price;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a(Long.hashCode(this.id) * 31, 31, this.image);
        String str = this.deeplink;
        return Float.hashCode(this.imageAlpha) + C3532b.a(b.a(this.title, C3051a.b(this.price, (a11 + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.isAvailable);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.image;
        String str2 = this.deeplink;
        PriceDTO priceDTO = this.price;
        TextDTO textDTO = this.title;
        boolean z11 = this.isAvailable;
        float f7 = this.imageAlpha;
        StringBuilder c11 = C2436a.c(j11, "AspectProductV2VO(id=", ", image=", str);
        c11.append(", deeplink=");
        c11.append(str2);
        c11.append(", price=");
        c11.append(priceDTO);
        c11.append(", title=");
        c11.append(textDTO);
        c11.append(", isAvailable=");
        c11.append(z11);
        c11.append(", imageAlpha=");
        c11.append(f7);
        c11.append(")");
        return c11.toString();
    }
}

package ru.ozon.app.android.travel.molecules.view.imageBanner;

import B0.C2454a;
import Bl.b;
import G.g;
import Ve.C4598rp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\u0012R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/imageBanner/ImageBannerVO;", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "darkImageUrl", "lightImageUrl", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "bgColor", "", "bgRadius", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;IF)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Ljava/lang/String;", "getDarkImageUrl", "getLightImageUrl", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "I", "getBgColor", "F", "getBgRadius", "()F", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ImageBannerVO {
    public static final int $stable = AtomAction.$stable | TextAtom.$stable;

    @NotNull
    private final AtomAction action;
    private final int bgColor;
    private final float bgRadius;

    @NotNull
    private final String darkImageUrl;

    @NotNull
    private final String lightImageUrl;

    @NotNull
    private final TextAtom title;

    public ImageBannerVO(@NotNull TextAtom title, @NotNull String darkImageUrl, @NotNull String lightImageUrl, @NotNull AtomAction action, int i11, float f7) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(darkImageUrl, "darkImageUrl");
        Intrinsics.checkNotNullParameter(lightImageUrl, "lightImageUrl");
        Intrinsics.checkNotNullParameter(action, "action");
        this.title = title;
        this.darkImageUrl = darkImageUrl;
        this.lightImageUrl = lightImageUrl;
        this.action = action;
        this.bgColor = i11;
        this.bgRadius = f7;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageBannerVO)) {
            return false;
        }
        ImageBannerVO imageBannerVO = (ImageBannerVO) other;
        return Intrinsics.d(this.title, imageBannerVO.title) && Intrinsics.d(this.darkImageUrl, imageBannerVO.darkImageUrl) && Intrinsics.d(this.lightImageUrl, imageBannerVO.lightImageUrl) && Intrinsics.d(this.action, imageBannerVO.action) && this.bgColor == imageBannerVO.bgColor && Float.compare(this.bgRadius, imageBannerVO.bgRadius) == 0;
    }

    @NotNull
    public final AtomAction getAction() {
        return this.action;
    }

    public final int getBgColor() {
        return this.bgColor;
    }

    public final float getBgRadius() {
        return this.bgRadius;
    }

    @NotNull
    public final String getDarkImageUrl() {
        return this.darkImageUrl;
    }

    @NotNull
    public final String getLightImageUrl() {
        return this.lightImageUrl;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Float.hashCode(this.bgRadius) + C2454a.a(this.bgColor, C4598rp.a(this.action, g.a(g.a(this.title.hashCode() * 31, 31, this.darkImageUrl), 31, this.lightImageUrl), 31), 31);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        String str = this.darkImageUrl;
        String str2 = this.lightImageUrl;
        AtomAction atomAction = this.action;
        int i11 = this.bgColor;
        float f7 = this.bgRadius;
        StringBuilder d11 = b.d("ImageBannerVO(title=", ", darkImageUrl=", str, ", lightImageUrl=", textAtom);
        Ns.b.d(str2, ", action=", ", bgColor=", d11, atomAction);
        d11.append(i11);
        d11.append(", bgRadius=");
        d11.append(f7);
        d11.append(")");
        return d11.toString();
    }
}

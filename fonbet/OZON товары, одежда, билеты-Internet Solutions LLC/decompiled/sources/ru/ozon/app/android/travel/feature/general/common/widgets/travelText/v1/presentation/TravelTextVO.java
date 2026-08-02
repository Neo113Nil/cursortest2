package ru.ozon.app.android.travel.feature.general.common.widgets.travelText.v1.presentation;

import B0.A0;
import B0.C2454a;
import B90.C2619v;
import Bl.C2639a;
import D3.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0011R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010\u0013R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b#\u0010\u0013R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b$\u0010\u0013R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b%\u0010\u0013¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelText/v1/presentation/TravelTextVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "text", "", "backgroundColor", "", "offsetHorizontal", "offsetTop", "offsetBottom", "textAlignment", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;IIII)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Ljava/lang/String;", "getBackgroundColor", "I", "getOffsetHorizontal", "getOffsetTop", "getOffsetBottom", "getTextAlignment", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelTextVO implements c {
    public static final int $stable = TextAtom.$stable;
    private final String backgroundColor;
    private final long id;
    private final int offsetBottom;
    private final int offsetHorizontal;
    private final int offsetTop;

    @NotNull
    private final TextAtom text;
    private final int textAlignment;

    public TravelTextVO(long j11, @NotNull TextAtom text, String str, int i11, int i12, int i13, int i14) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.id = j11;
        this.text = text;
        this.backgroundColor = str;
        this.offsetHorizontal = i11;
        this.offsetTop = i12;
        this.offsetBottom = i13;
        this.textAlignment = i14;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelTextVO)) {
            return false;
        }
        TravelTextVO travelTextVO = (TravelTextVO) other;
        return this.id == travelTextVO.id && Intrinsics.d(this.text, travelTextVO.text) && Intrinsics.d(this.backgroundColor, travelTextVO.backgroundColor) && this.offsetHorizontal == travelTextVO.offsetHorizontal && this.offsetTop == travelTextVO.offsetTop && this.offsetBottom == travelTextVO.offsetBottom && this.textAlignment == travelTextVO.textAlignment;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final int getOffsetBottom() {
        return this.offsetBottom;
    }

    public final int getOffsetHorizontal() {
        return this.offsetHorizontal;
    }

    public final int getOffsetTop() {
        return this.offsetTop;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextAtom getText() {
        return this.text;
    }

    public final int getTextAlignment() {
        return this.textAlignment;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = C2619v.b(Long.hashCode(this.id) * 31, 31, this.text);
        String str = this.backgroundColor;
        return Integer.hashCode(this.textAlignment) + C2454a.a(this.offsetBottom, C2454a.a(this.offsetTop, C2454a.a(this.offsetHorizontal, (b11 + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.text;
        String str = this.backgroundColor;
        int i11 = this.offsetHorizontal;
        int i12 = this.offsetTop;
        int i13 = this.offsetBottom;
        int i14 = this.textAlignment;
        StringBuilder c11 = C2639a.c("TravelTextVO(id=", j11, ", text=", textAtom);
        c11.append(", backgroundColor=");
        c11.append(str);
        c11.append(", offsetHorizontal=");
        c11.append(i11);
        A0.c(i12, i13, ", offsetTop=", ", offsetBottom=", c11);
        return h.b(c11, ", textAlignment=", i14, ")");
    }
}

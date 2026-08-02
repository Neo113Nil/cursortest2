package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsDetailsFull.v1.presentation;

import B90.C2619v;
import Bl.C2639a;
import Lc.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b \u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsDetailsFull/v1/presentation/InfoCardVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/button/Icon;", "icon", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "infoKey", "infoValue", "<init>", "(JLru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/button/Icon;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getInfoKey", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getInfoValue", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class InfoCardVO implements c {
    public static final int $stable = TextAtom.$stable | Icon.$stable;

    @NotNull
    private final Icon icon;
    private final long id;

    @NotNull
    private final TextAtom infoKey;

    @NotNull
    private final TextAtom infoValue;

    public InfoCardVO(long j11, @NotNull Icon icon, @NotNull TextAtom infoKey, @NotNull TextAtom infoValue) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(infoKey, "infoKey");
        Intrinsics.checkNotNullParameter(infoValue, "infoValue");
        this.id = j11;
        this.icon = icon;
        this.infoKey = infoKey;
        this.infoValue = infoValue;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InfoCardVO)) {
            return false;
        }
        InfoCardVO infoCardVO = (InfoCardVO) other;
        return this.id == infoCardVO.id && Intrinsics.d(this.icon, infoCardVO.icon) && Intrinsics.d(this.infoKey, infoCardVO.infoKey) && Intrinsics.d(this.infoValue, infoCardVO.infoValue);
    }

    @NotNull
    public final Icon getIcon() {
        return this.icon;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final TextAtom getInfoKey() {
        return this.infoKey;
    }

    @NotNull
    public final TextAtom getInfoValue() {
        return this.infoValue;
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
        return this.infoValue.hashCode() + C2619v.b(a.a(this.icon, Long.hashCode(this.id) * 31, 31), 31, this.infoKey);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        Icon icon = this.icon;
        TextAtom textAtom = this.infoKey;
        TextAtom textAtom2 = this.infoValue;
        StringBuilder sb2 = new StringBuilder("InfoCardVO(id=");
        sb2.append(j11);
        sb2.append(", icon=");
        sb2.append(icon);
        C2639a.e(", infoKey=", ", infoValue=", sb2, textAtom, textAtom2);
        sb2.append(")");
        return sb2.toString();
    }
}

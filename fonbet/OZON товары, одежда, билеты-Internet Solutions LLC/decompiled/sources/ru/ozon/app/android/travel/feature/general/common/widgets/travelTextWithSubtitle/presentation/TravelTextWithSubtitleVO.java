package ru.ozon.app.android.travel.feature.general.common.widgets.travelTextWithSubtitle.presentation;

import B0.A0;
import B0.C2454a;
import B90.C2619v;
import Bl.C2639a;
import Kk.C3532b;
import g.C6594f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BQ\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0016R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b$\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b%\u0010\u0016R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b&\u0010\u0016R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b\u000e\u0010(R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010)\u001a\u0004\b*\u0010\u0014¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelTextWithSubtitle/presentation/TravelTextWithSubtitleVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "offsetTop", "offsetBottom", "offsetHorizontal", "offsetBetween", "", "isCentered", "", "backgroundColor", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;IIIIZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "I", "getOffsetTop", "getOffsetBottom", "getOffsetHorizontal", "getOffsetBetween", "Z", "()Z", "Ljava/lang/String;", "getBackgroundColor", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelTextWithSubtitleVO implements c {
    public static final int $stable = TextAtom.$stable;
    private final String backgroundColor;
    private final long id;
    private final boolean isCentered;
    private final int offsetBetween;
    private final int offsetBottom;
    private final int offsetHorizontal;
    private final int offsetTop;

    @NotNull
    private final TextAtom subtitle;

    @NotNull
    private final TextAtom title;

    public TravelTextWithSubtitleVO(long j11, @NotNull TextAtom title, @NotNull TextAtom subtitle, int i11, int i12, int i13, int i14, boolean z11, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.id = j11;
        this.title = title;
        this.subtitle = subtitle;
        this.offsetTop = i11;
        this.offsetBottom = i12;
        this.offsetHorizontal = i13;
        this.offsetBetween = i14;
        this.isCentered = z11;
        this.backgroundColor = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelTextWithSubtitleVO)) {
            return false;
        }
        TravelTextWithSubtitleVO travelTextWithSubtitleVO = (TravelTextWithSubtitleVO) other;
        return this.id == travelTextWithSubtitleVO.id && Intrinsics.d(this.title, travelTextWithSubtitleVO.title) && Intrinsics.d(this.subtitle, travelTextWithSubtitleVO.subtitle) && this.offsetTop == travelTextWithSubtitleVO.offsetTop && this.offsetBottom == travelTextWithSubtitleVO.offsetBottom && this.offsetHorizontal == travelTextWithSubtitleVO.offsetHorizontal && this.offsetBetween == travelTextWithSubtitleVO.offsetBetween && this.isCentered == travelTextWithSubtitleVO.isCentered && Intrinsics.d(this.backgroundColor, travelTextWithSubtitleVO.backgroundColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final int getOffsetBetween() {
        return this.offsetBetween;
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
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C3532b.a(C2454a.a(this.offsetBetween, C2454a.a(this.offsetHorizontal, C2454a.a(this.offsetBottom, C2454a.a(this.offsetTop, C2619v.b(C2619v.b(Long.hashCode(this.id) * 31, 31, this.title), 31, this.subtitle), 31), 31), 31), 31), 31, this.isCentered);
        String str = this.backgroundColor;
        return a11 + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: isCentered, reason: from getter */
    public final boolean getIsCentered() {
        return this.isCentered;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subtitle;
        int i11 = this.offsetTop;
        int i12 = this.offsetBottom;
        int i13 = this.offsetHorizontal;
        int i14 = this.offsetBetween;
        boolean z11 = this.isCentered;
        String str = this.backgroundColor;
        StringBuilder c11 = C2639a.c("TravelTextWithSubtitleVO(id=", j11, ", title=", textAtom);
        c11.append(", subtitle=");
        c11.append(textAtom2);
        c11.append(", offsetTop=");
        c11.append(i11);
        A0.c(i12, i13, ", offsetBottom=", ", offsetHorizontal=", c11);
        c11.append(", offsetBetween=");
        c11.append(i14);
        c11.append(", isCentered=");
        c11.append(z11);
        return C6594f.a(", backgroundColor=", str, ")", c11);
    }
}

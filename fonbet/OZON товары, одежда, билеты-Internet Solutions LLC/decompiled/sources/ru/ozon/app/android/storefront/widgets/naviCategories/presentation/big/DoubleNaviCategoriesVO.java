package ru.ozon.app.android.storefront.widgets.naviCategories.presentation.big;

import G.g;
import Lh.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.naviCategories.presentation.PaddingsVO;
import ru.ozon.app.android.storefront.widgets.naviCategories.presentation.RoundedCornerVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B]\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b,\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b.\u0010\u0017R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b0\u00101R\u001f\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00102\u001a\u0004\b3\u00104¨\u00065"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviCategories/presentation/big/DoubleNaviCategoriesVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/storefront/widgets/naviCategories/presentation/RoundedCornerVO;", "roundedCorners", "Lru/ozon/app/android/storefront/widgets/naviCategories/presentation/PaddingsVO;", "paddings", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "image", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLjava/util/List;Lru/ozon/app/android/storefront/widgets/naviCategories/presentation/PaddingsVO;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getRoundedCorners", "()Ljava/util/List;", "Lru/ozon/app/android/storefront/widgets/naviCategories/presentation/PaddingsVO;", "getPaddings", "()Lru/ozon/app/android/storefront/widgets/naviCategories/presentation/PaddingsVO;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "Ljava/lang/String;", "getImage", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DoubleNaviCategoriesVO implements c {
    private final AtomAction action;
    private final long id;
    private final String image;

    @NotNull
    private final PaddingsVO paddings;

    @NotNull
    private final List<RoundedCornerVO> roundedCorners;
    private final TextAtom subtitle;
    private final TextAtom title;
    private final t tokenizedEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public DoubleNaviCategoriesVO(long j11, @NotNull List<? extends RoundedCornerVO> roundedCorners, @NotNull PaddingsVO paddings, TextAtom textAtom, TextAtom textAtom2, String str, AtomAction atomAction, t tVar) {
        Intrinsics.checkNotNullParameter(roundedCorners, "roundedCorners");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        this.id = j11;
        this.roundedCorners = roundedCorners;
        this.paddings = paddings;
        this.title = textAtom;
        this.subtitle = textAtom2;
        this.image = str;
        this.action = atomAction;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DoubleNaviCategoriesVO)) {
            return false;
        }
        DoubleNaviCategoriesVO doubleNaviCategoriesVO = (DoubleNaviCategoriesVO) other;
        return this.id == doubleNaviCategoriesVO.id && Intrinsics.d(this.roundedCorners, doubleNaviCategoriesVO.roundedCorners) && Intrinsics.d(this.paddings, doubleNaviCategoriesVO.paddings) && Intrinsics.d(this.title, doubleNaviCategoriesVO.title) && Intrinsics.d(this.subtitle, doubleNaviCategoriesVO.subtitle) && Intrinsics.d(this.image, doubleNaviCategoriesVO.image) && Intrinsics.d(this.action, doubleNaviCategoriesVO.action) && Intrinsics.d(this.tokenizedEvent, doubleNaviCategoriesVO.tokenizedEvent);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final String getImage() {
        return this.image;
    }

    @NotNull
    public final PaddingsVO getPaddings() {
        return this.paddings;
    }

    @NotNull
    public final List<RoundedCornerVO> getRoundedCorners() {
        return this.roundedCorners;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    public final TextAtom getTitle() {
        return this.title;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.paddings.hashCode() + g.b(Long.hashCode(this.id) * 31, 31, this.roundedCorners)) * 31;
        TextAtom textAtom = this.title;
        int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        TextAtom textAtom2 = this.subtitle;
        int hashCode3 = (hashCode2 + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
        String str = this.image;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        AtomAction atomAction = this.action;
        int hashCode5 = (hashCode4 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode5 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<RoundedCornerVO> list = this.roundedCorners;
        PaddingsVO paddingsVO = this.paddings;
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subtitle;
        String str = this.image;
        AtomAction atomAction = this.action;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = b.b(j11, "DoubleNaviCategoriesVO(id=", ", roundedCorners=", list);
        b11.append(", paddings=");
        b11.append(paddingsVO);
        b11.append(", title=");
        b11.append(textAtom);
        b11.append(", subtitle=");
        b11.append(textAtom2);
        b11.append(", image=");
        b11.append(str);
        Fj.c.e(tVar, ", action=", ", tokenizedEvent=", b11, atomAction);
        b11.append(")");
        return b11.toString();
    }
}

package ru.ozon.app.android.storefront.widgets.naviCategories.presentation.single;

import An.C2439a;
import G.g;
import Lh.a;
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

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BS\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b,\u0010\u0016R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b.\u0010/R\u001f\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviCategories/presentation/single/SingleNaviCategoriesVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/storefront/widgets/naviCategories/presentation/RoundedCornerVO;", "roundedCorners", "Lru/ozon/app/android/storefront/widgets/naviCategories/presentation/PaddingsVO;", "paddings", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "image", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLjava/util/List;Lru/ozon/app/android/storefront/widgets/naviCategories/presentation/PaddingsVO;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getRoundedCorners", "()Ljava/util/List;", "Lru/ozon/app/android/storefront/widgets/naviCategories/presentation/PaddingsVO;", "getPaddings", "()Lru/ozon/app/android/storefront/widgets/naviCategories/presentation/PaddingsVO;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Ljava/lang/String;", "getImage", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SingleNaviCategoriesVO implements c {
    private final AtomAction action;
    private final long id;
    private final String image;

    @NotNull
    private final PaddingsVO paddings;

    @NotNull
    private final List<RoundedCornerVO> roundedCorners;
    private final TextAtom title;
    private final t tokenizedEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public SingleNaviCategoriesVO(long j11, @NotNull List<? extends RoundedCornerVO> roundedCorners, @NotNull PaddingsVO paddings, TextAtom textAtom, String str, AtomAction atomAction, t tVar) {
        Intrinsics.checkNotNullParameter(roundedCorners, "roundedCorners");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        this.id = j11;
        this.roundedCorners = roundedCorners;
        this.paddings = paddings;
        this.title = textAtom;
        this.image = str;
        this.action = atomAction;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleNaviCategoriesVO)) {
            return false;
        }
        SingleNaviCategoriesVO singleNaviCategoriesVO = (SingleNaviCategoriesVO) other;
        return this.id == singleNaviCategoriesVO.id && Intrinsics.d(this.roundedCorners, singleNaviCategoriesVO.roundedCorners) && Intrinsics.d(this.paddings, singleNaviCategoriesVO.paddings) && Intrinsics.d(this.title, singleNaviCategoriesVO.title) && Intrinsics.d(this.image, singleNaviCategoriesVO.image) && Intrinsics.d(this.action, singleNaviCategoriesVO.action) && Intrinsics.d(this.tokenizedEvent, singleNaviCategoriesVO.tokenizedEvent);
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
        String str = this.image;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        AtomAction atomAction = this.action;
        int hashCode4 = (hashCode3 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode4 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<RoundedCornerVO> list = this.roundedCorners;
        PaddingsVO paddingsVO = this.paddings;
        TextAtom textAtom = this.title;
        String str = this.image;
        AtomAction atomAction = this.action;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = b.b(j11, "SingleNaviCategoriesVO(id=", ", roundedCorners=", list);
        b11.append(", paddings=");
        b11.append(paddingsVO);
        b11.append(", title=");
        b11.append(textAtom);
        C2439a.c(", image=", str, ", action=", b11, atomAction);
        return a.b(b11, ", tokenizedEvent=", tVar, ")");
    }
}

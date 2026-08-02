package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.grid.grid3.presentation;

import B0.A0;
import B0.C2454a;
import Bl.b;
import Kk.C3532b;
import WZ.t;
import android.graphics.drawable.ShapeDrawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultVO;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b'\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B§\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0018\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b\u0007\u0010-R\"\u0010\b\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010,\u001a\u0004\b.\u0010-\"\u0004\b/\u00100R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b4\u00103R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b8\u00107R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010<\u001a\u0004\b=\u0010>R\u001f\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010E\u001a\u0004\bF\u0010$R\u0017\u0010\u001a\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u001a\u0010E\u001a\u0004\bG\u0010$R\u0017\u0010\u001b\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u001b\u0010E\u001a\u0004\bH\u0010$R\u0017\u0010\u001c\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u001c\u0010E\u001a\u0004\bI\u0010$R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010J\u001a\u0004\bK\u0010\"¨\u0006L"}, d2 = {"ru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/grid/grid3/presentation/Grid3VO$Grid3ItemVO", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lru/ozon/app/android/account/adult/presenter/AdultVO;", "", "id", "", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "shouldBlur", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "blurImage", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "adBadge", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Landroid/graphics/drawable/ShapeDrawable;", "shape", "", "paddingTop", "paddingBottom", "paddingLeft", "paddingRight", "", "backgroundColor", "<init>", "(JZZLru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Landroid/graphics/drawable/ShapeDrawable;IIIILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Z", "()Z", "getShouldBlur", "setShouldBlur", "(Z)V", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getBlurImage", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getAdBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Landroid/graphics/drawable/ShapeDrawable;", "getShape", "()Landroid/graphics/drawable/ShapeDrawable;", "I", "getPaddingTop", "getPaddingBottom", "getPaddingLeft", "getPaddingRight", "Ljava/lang/String;", "getBackgroundColor", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Grid3VO$Grid3ItemVO implements c, AdultVO {
    private final AtomAction action;
    private final BadgeDTO adBadge;
    private final String backgroundColor;
    private final ImageDTO blurImage;
    private final long id;
    private final ImageDTO image;
    private final boolean isAdult;
    private final int paddingBottom;
    private final int paddingLeft;
    private final int paddingRight;
    private final int paddingTop;
    private final ShapeDrawable shape;
    private boolean shouldBlur;
    private final TextDTO subtitle;
    private final TextDTO title;
    private final t tokenizedEvent;

    public Grid3VO$Grid3ItemVO(long j11, boolean z11, boolean z12, ImageDTO imageDTO, ImageDTO imageDTO2, TextDTO textDTO, TextDTO textDTO2, BadgeDTO badgeDTO, AtomAction atomAction, t tVar, ShapeDrawable shapeDrawable, int i11, int i12, int i13, int i14, String str) {
        this.id = j11;
        this.isAdult = z11;
        this.shouldBlur = z12;
        this.image = imageDTO;
        this.blurImage = imageDTO2;
        this.title = textDTO;
        this.subtitle = textDTO2;
        this.adBadge = badgeDTO;
        this.action = atomAction;
        this.tokenizedEvent = tVar;
        this.shape = shapeDrawable;
        this.paddingTop = i11;
        this.paddingBottom = i12;
        this.paddingLeft = i13;
        this.paddingRight = i14;
        this.backgroundColor = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Grid3VO$Grid3ItemVO)) {
            return false;
        }
        Grid3VO$Grid3ItemVO grid3VO$Grid3ItemVO = (Grid3VO$Grid3ItemVO) other;
        return this.id == grid3VO$Grid3ItemVO.id && this.isAdult == grid3VO$Grid3ItemVO.isAdult && this.shouldBlur == grid3VO$Grid3ItemVO.shouldBlur && Intrinsics.d(this.image, grid3VO$Grid3ItemVO.image) && Intrinsics.d(this.blurImage, grid3VO$Grid3ItemVO.blurImage) && Intrinsics.d(this.title, grid3VO$Grid3ItemVO.title) && Intrinsics.d(this.subtitle, grid3VO$Grid3ItemVO.subtitle) && Intrinsics.d(this.adBadge, grid3VO$Grid3ItemVO.adBadge) && Intrinsics.d(this.action, grid3VO$Grid3ItemVO.action) && Intrinsics.d(this.tokenizedEvent, grid3VO$Grid3ItemVO.tokenizedEvent) && Intrinsics.d(this.shape, grid3VO$Grid3ItemVO.shape) && this.paddingTop == grid3VO$Grid3ItemVO.paddingTop && this.paddingBottom == grid3VO$Grid3ItemVO.paddingBottom && this.paddingLeft == grid3VO$Grid3ItemVO.paddingLeft && this.paddingRight == grid3VO$Grid3ItemVO.paddingRight && Intrinsics.d(this.backgroundColor, grid3VO$Grid3ItemVO.backgroundColor);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final BadgeDTO getAdBadge() {
        return this.adBadge;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final ImageDTO getBlurImage() {
        return this.blurImage;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final ImageDTO getImage() {
        return this.image;
    }

    public final int getPaddingBottom() {
        return this.paddingBottom;
    }

    public final int getPaddingLeft() {
        return this.paddingLeft;
    }

    public final int getPaddingRight() {
        return this.paddingRight;
    }

    public final int getPaddingTop() {
        return this.paddingTop;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final ShapeDrawable getShape() {
        return this.shape;
    }

    public boolean getShouldBlur() {
        return this.shouldBlur;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public final TextDTO getTitle() {
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
        int a11 = C3532b.a(C3532b.a(Long.hashCode(this.id) * 31, 31, this.isAdult), 31, this.shouldBlur);
        ImageDTO imageDTO = this.image;
        int hashCode = (a11 + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31;
        ImageDTO imageDTO2 = this.blurImage;
        int hashCode2 = (hashCode + (imageDTO2 == null ? 0 : imageDTO2.hashCode())) * 31;
        TextDTO textDTO = this.title;
        int hashCode3 = (hashCode2 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        TextDTO textDTO2 = this.subtitle;
        int hashCode4 = (hashCode3 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        BadgeDTO badgeDTO = this.adBadge;
        int hashCode5 = (hashCode4 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        AtomAction atomAction = this.action;
        int hashCode6 = (hashCode5 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode7 = (hashCode6 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        ShapeDrawable shapeDrawable = this.shape;
        int a12 = C2454a.a(this.paddingRight, C2454a.a(this.paddingLeft, C2454a.a(this.paddingBottom, C2454a.a(this.paddingTop, (hashCode7 + (shapeDrawable == null ? 0 : shapeDrawable.hashCode())) * 31, 31), 31), 31), 31);
        String str = this.backgroundColor;
        return a12 + (str != null ? str.hashCode() : 0);
    }

    @Override // ru.ozon.app.android.account.adult.presenter.AdultVO
    /* renamed from: isAdult, reason: from getter */
    public boolean getIsAdult() {
        return this.isAdult;
    }

    @Override // ru.ozon.app.android.account.adult.presenter.AdultVO
    public void setShouldBlur(boolean z11) {
        this.shouldBlur = z11;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        boolean z11 = this.isAdult;
        boolean z12 = this.shouldBlur;
        ImageDTO imageDTO = this.image;
        ImageDTO imageDTO2 = this.blurImage;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        BadgeDTO badgeDTO = this.adBadge;
        AtomAction atomAction = this.action;
        t tVar = this.tokenizedEvent;
        ShapeDrawable shapeDrawable = this.shape;
        int i11 = this.paddingTop;
        int i12 = this.paddingBottom;
        int i13 = this.paddingLeft;
        int i14 = this.paddingRight;
        String str = this.backgroundColor;
        StringBuilder c11 = b.c(j11, "Grid3ItemVO(id=", ", isAdult=", z11);
        c11.append(", shouldBlur=");
        c11.append(z12);
        c11.append(", image=");
        c11.append(imageDTO);
        c11.append(", blurImage=");
        c11.append(imageDTO2);
        c11.append(", title=");
        c11.append(textDTO);
        c11.append(", subtitle=");
        c11.append(textDTO2);
        c11.append(", adBadge=");
        c11.append(badgeDTO);
        Fj.c.e(tVar, ", action=", ", tokenizedEvent=", c11, atomAction);
        c11.append(", shape=");
        c11.append(shapeDrawable);
        c11.append(", paddingTop=");
        c11.append(i11);
        A0.c(i12, i13, ", paddingBottom=", ", paddingLeft=", c11);
        c11.append(", paddingRight=");
        c11.append(i14);
        c11.append(", backgroundColor=");
        c11.append(str);
        c11.append(")");
        return c11.toString();
    }
}

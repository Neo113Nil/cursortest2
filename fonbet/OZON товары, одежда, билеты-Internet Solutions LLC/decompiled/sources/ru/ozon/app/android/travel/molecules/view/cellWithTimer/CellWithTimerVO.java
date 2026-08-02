package ru.ozon.app.android.travel.molecules.view.cellWithTimer;

import B90.C2619v;
import Kk.C3532b;
import Nh.a;
import Pk0.b;
import c8.C5766e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0012\u0010\u0013J~\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b!\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\"\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b\t\u0010'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010\u0017R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b*\u0010\u0017R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0011\u0010(\u001a\u0004\b1\u0010\u0017¨\u00062"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/cellWithTimer/CellWithTimerVO;", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "timerText", "subtitle", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "", "isRightIconVisible", "", "rightIcon", "rightIconTint", "", "cellCornerRadius", "Lru/ozon/uni/atoms/af/AtomAction;", "clickAction", "cellBackgroundColor", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/image/ImageDTO;ZLjava/lang/String;Ljava/lang/String;FLru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;)V", "copy", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/image/ImageDTO;ZLjava/lang/String;Ljava/lang/String;FLru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;)Lru/ozon/app/android/travel/molecules/view/cellWithTimer/CellWithTimerVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTimerText", "getSubtitle", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Z", "()Z", "Ljava/lang/String;", "getRightIcon", "getRightIconTint", "F", "getCellCornerRadius", "()F", "Lru/ozon/uni/atoms/af/AtomAction;", "getClickAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getCellBackgroundColor", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CellWithTimerVO {
    public static final int $stable;
    private final String cellBackgroundColor;
    private final float cellCornerRadius;
    private final AtomAction clickAction;

    @NotNull
    private final ImageDTO image;
    private final boolean isRightIconVisible;
    private final String rightIcon;
    private final String rightIconTint;
    private final TextAtom subtitle;

    @NotNull
    private final TextAtom timerText;

    @NotNull
    private final TextAtom title;

    static {
        int i11 = AtomAction.$stable;
        int i12 = TextAtom.$stable;
        $stable = i11 | i12 | i12 | i12;
    }

    public CellWithTimerVO(@NotNull TextAtom title, @NotNull TextAtom timerText, TextAtom textAtom, @NotNull ImageDTO image, boolean z11, String str, String str2, float f7, AtomAction atomAction, String str3) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(timerText, "timerText");
        Intrinsics.checkNotNullParameter(image, "image");
        this.title = title;
        this.timerText = timerText;
        this.subtitle = textAtom;
        this.image = image;
        this.isRightIconVisible = z11;
        this.rightIcon = str;
        this.rightIconTint = str2;
        this.cellCornerRadius = f7;
        this.clickAction = atomAction;
        this.cellBackgroundColor = str3;
    }

    public static /* synthetic */ CellWithTimerVO copy$default(CellWithTimerVO cellWithTimerVO, TextAtom textAtom, TextAtom textAtom2, TextAtom textAtom3, ImageDTO imageDTO, boolean z11, String str, String str2, float f7, AtomAction atomAction, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = cellWithTimerVO.title;
        }
        if ((i11 & 2) != 0) {
            textAtom2 = cellWithTimerVO.timerText;
        }
        if ((i11 & 4) != 0) {
            textAtom3 = cellWithTimerVO.subtitle;
        }
        if ((i11 & 8) != 0) {
            imageDTO = cellWithTimerVO.image;
        }
        if ((i11 & 16) != 0) {
            z11 = cellWithTimerVO.isRightIconVisible;
        }
        if ((i11 & 32) != 0) {
            str = cellWithTimerVO.rightIcon;
        }
        if ((i11 & 64) != 0) {
            str2 = cellWithTimerVO.rightIconTint;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            f7 = cellWithTimerVO.cellCornerRadius;
        }
        if ((i11 & 256) != 0) {
            atomAction = cellWithTimerVO.clickAction;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            str3 = cellWithTimerVO.cellBackgroundColor;
        }
        AtomAction atomAction2 = atomAction;
        String str4 = str3;
        String str5 = str2;
        float f11 = f7;
        boolean z12 = z11;
        String str6 = str;
        return cellWithTimerVO.copy(textAtom, textAtom2, textAtom3, imageDTO, z12, str6, str5, f11, atomAction2, str4);
    }

    @NotNull
    public final CellWithTimerVO copy(@NotNull TextAtom title, @NotNull TextAtom timerText, TextAtom subtitle, @NotNull ImageDTO image, boolean isRightIconVisible, String rightIcon, String rightIconTint, float cellCornerRadius, AtomAction clickAction, String cellBackgroundColor) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(timerText, "timerText");
        Intrinsics.checkNotNullParameter(image, "image");
        return new CellWithTimerVO(title, timerText, subtitle, image, isRightIconVisible, rightIcon, rightIconTint, cellCornerRadius, clickAction, cellBackgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CellWithTimerVO)) {
            return false;
        }
        CellWithTimerVO cellWithTimerVO = (CellWithTimerVO) other;
        return Intrinsics.d(this.title, cellWithTimerVO.title) && Intrinsics.d(this.timerText, cellWithTimerVO.timerText) && Intrinsics.d(this.subtitle, cellWithTimerVO.subtitle) && Intrinsics.d(this.image, cellWithTimerVO.image) && this.isRightIconVisible == cellWithTimerVO.isRightIconVisible && Intrinsics.d(this.rightIcon, cellWithTimerVO.rightIcon) && Intrinsics.d(this.rightIconTint, cellWithTimerVO.rightIconTint) && Float.compare(this.cellCornerRadius, cellWithTimerVO.cellCornerRadius) == 0 && Intrinsics.d(this.clickAction, cellWithTimerVO.clickAction) && Intrinsics.d(this.cellBackgroundColor, cellWithTimerVO.cellBackgroundColor);
    }

    public final String getCellBackgroundColor() {
        return this.cellBackgroundColor;
    }

    public final float getCellCornerRadius() {
        return this.cellCornerRadius;
    }

    public final AtomAction getClickAction() {
        return this.clickAction;
    }

    @NotNull
    public final ImageDTO getImage() {
        return this.image;
    }

    public final String getRightIcon() {
        return this.rightIcon;
    }

    public final String getRightIconTint() {
        return this.rightIconTint;
    }

    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextAtom getTimerText() {
        return this.timerText;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b11 = C2619v.b(this.title.hashCode() * 31, 31, this.timerText);
        TextAtom textAtom = this.subtitle;
        int a11 = C3532b.a(a.b(this.image, (b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31), 31, this.isRightIconVisible);
        String str = this.rightIcon;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.rightIconTint;
        int a12 = b.a(this.cellCornerRadius, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        AtomAction atomAction = this.clickAction;
        int hashCode2 = (a12 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        String str3 = this.cellBackgroundColor;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    /* renamed from: isRightIconVisible, reason: from getter */
    public final boolean getIsRightIconVisible() {
        return this.isRightIconVisible;
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.timerText;
        TextAtom textAtom3 = this.subtitle;
        ImageDTO imageDTO = this.image;
        boolean z11 = this.isRightIconVisible;
        String str = this.rightIcon;
        String str2 = this.rightIconTint;
        float f7 = this.cellCornerRadius;
        AtomAction atomAction = this.clickAction;
        String str3 = this.cellBackgroundColor;
        StringBuilder a11 = HY.a.a("CellWithTimerVO(title=", textAtom, ", timerText=", textAtom2, ", subtitle=");
        a11.append(textAtom3);
        a11.append(", image=");
        a11.append(imageDTO);
        a11.append(", isRightIconVisible=");
        C5766e.a(", rightIcon=", str, ", rightIconTint=", a11, z11);
        a11.append(str2);
        a11.append(", cellCornerRadius=");
        a11.append(f7);
        a11.append(", clickAction=");
        a11.append(atomAction);
        a11.append(", cellBackgroundColor=");
        a11.append(str3);
        a11.append(")");
        return a11.toString();
    }
}

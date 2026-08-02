package ru.ozon.app.android.fresh.checkout.widgets.cellList.v1.presentation;

import Am.C2438a;
import B0.C2454a;
import D3.h;
import Ek.a;
import Tl.b;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b#\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002DEBm\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u008c\u0001\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b7\u0010\u001dR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010A\u001a\u0004\bB\u0010C¨\u0006F"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/presentation/FreshCellVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "", "badgeImage", "Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/presentation/FreshCellVO$CheckboxFreshVO;", "checkbox", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "rightIcon", "Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/presentation/FreshCellVO$SpacersVO;", "spacers", "backgroundColor", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "", "cornerRadius", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/lang/String;Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/presentation/FreshCellVO$CheckboxFreshVO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/presentation/FreshCellVO$SpacersVO;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;FLru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "copy", "(JLru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/lang/String;Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/presentation/FreshCellVO$CheckboxFreshVO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/presentation/FreshCellVO$SpacersVO;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;FLru/ozon/uni/atoms/af/AtomAction;LWZ/t;)Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/presentation/FreshCellVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Ljava/lang/String;", "getBadgeImage", "Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/presentation/FreshCellVO$CheckboxFreshVO;", "getCheckbox", "()Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/presentation/FreshCellVO$CheckboxFreshVO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getRightIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/presentation/FreshCellVO$SpacersVO;", "getSpacers", "()Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/presentation/FreshCellVO$SpacersVO;", "getBackgroundColor", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "F", "getCornerRadius", "()F", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "SpacersVO", "CheckboxFreshVO", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FreshCellVO implements c {
    private final AtomAction action;
    private final String backgroundColor;
    private final String badgeImage;

    @NotNull
    private final CellDTO cell;
    private final CheckboxFreshVO checkbox;
    private final float cornerRadius;
    private final long id;
    private final IconDTO rightIcon;

    @NotNull
    private final SpacersVO spacers;
    private final TextDTO text;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/presentation/FreshCellVO$CheckboxFreshVO;", "", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "checkbox", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "tokenizedEvent", "<init>", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "getCheckbox", "()Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CheckboxFreshVO {
        private final AtomAction action;
        private final CheckBoxDTO checkbox;
        private final t tokenizedEvent;

        public CheckboxFreshVO(CheckBoxDTO checkBoxDTO, AtomAction atomAction, t tVar) {
            this.checkbox = checkBoxDTO;
            this.action = atomAction;
            this.tokenizedEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CheckboxFreshVO)) {
                return false;
            }
            CheckboxFreshVO checkboxFreshVO = (CheckboxFreshVO) other;
            return Intrinsics.d(this.checkbox, checkboxFreshVO.checkbox) && Intrinsics.d(this.action, checkboxFreshVO.action) && Intrinsics.d(this.tokenizedEvent, checkboxFreshVO.tokenizedEvent);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final CheckBoxDTO getCheckbox() {
            return this.checkbox;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            CheckBoxDTO checkBoxDTO = this.checkbox;
            int hashCode = (checkBoxDTO == null ? 0 : checkBoxDTO.hashCode()) * 31;
            AtomAction atomAction = this.action;
            int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            t tVar = this.tokenizedEvent;
            return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            CheckBoxDTO checkBoxDTO = this.checkbox;
            AtomAction atomAction = this.action;
            t tVar = this.tokenizedEvent;
            StringBuilder sb2 = new StringBuilder("CheckboxFreshVO(checkbox=");
            sb2.append(checkBoxDTO);
            sb2.append(", action=");
            sb2.append(atomAction);
            sb2.append(", tokenizedEvent=");
            return b.d(sb2, tVar, ")");
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0018\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/presentation/FreshCellVO$SpacersVO;", "", "", "top", "bottom", "betweenBadge", "right", "horizontal", "<init>", "(IIIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTop", "getBottom", "getBetweenBadge", "getRight", "getHorizontal", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SpacersVO {
        private final int betweenBadge;
        private final int bottom;
        private final int horizontal;
        private final int right;
        private final int top;

        public SpacersVO(int i11, int i12, int i13, int i14, int i15) {
            this.top = i11;
            this.bottom = i12;
            this.betweenBadge = i13;
            this.right = i14;
            this.horizontal = i15;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SpacersVO)) {
                return false;
            }
            SpacersVO spacersVO = (SpacersVO) other;
            return this.top == spacersVO.top && this.bottom == spacersVO.bottom && this.betweenBadge == spacersVO.betweenBadge && this.right == spacersVO.right && this.horizontal == spacersVO.horizontal;
        }

        public final int getBetweenBadge() {
            return this.betweenBadge;
        }

        public final int getBottom() {
            return this.bottom;
        }

        public final int getHorizontal() {
            return this.horizontal;
        }

        public final int getRight() {
            return this.right;
        }

        public final int getTop() {
            return this.top;
        }

        public int hashCode() {
            return Integer.hashCode(this.horizontal) + C2454a.a(this.right, C2454a.a(this.betweenBadge, C2454a.a(this.bottom, Integer.hashCode(this.top) * 31, 31), 31), 31);
        }

        @NotNull
        public String toString() {
            int i11 = this.top;
            int i12 = this.bottom;
            int i13 = this.betweenBadge;
            int i14 = this.right;
            int i15 = this.horizontal;
            StringBuilder a11 = C2438a.a("SpacersVO(top=", i11, ", bottom=", ", betweenBadge=", i12);
            a.f(i13, i14, ", right=", ", horizontal=", a11);
            return K00.b.e(i15, ")", a11);
        }
    }

    public FreshCellVO(long j11, @NotNull CellDTO cell, String str, CheckboxFreshVO checkboxFreshVO, IconDTO iconDTO, @NotNull SpacersVO spacers, String str2, TextDTO textDTO, float f7, AtomAction atomAction, t tVar) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(spacers, "spacers");
        this.id = j11;
        this.cell = cell;
        this.badgeImage = str;
        this.checkbox = checkboxFreshVO;
        this.rightIcon = iconDTO;
        this.spacers = spacers;
        this.backgroundColor = str2;
        this.text = textDTO;
        this.cornerRadius = f7;
        this.action = atomAction;
        this.tokenizedEvent = tVar;
    }

    public static /* synthetic */ FreshCellVO copy$default(FreshCellVO freshCellVO, long j11, CellDTO cellDTO, String str, CheckboxFreshVO checkboxFreshVO, IconDTO iconDTO, SpacersVO spacersVO, String str2, TextDTO textDTO, float f7, AtomAction atomAction, t tVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = freshCellVO.id;
        }
        return freshCellVO.copy(j11, (i11 & 2) != 0 ? freshCellVO.cell : cellDTO, (i11 & 4) != 0 ? freshCellVO.badgeImage : str, (i11 & 8) != 0 ? freshCellVO.checkbox : checkboxFreshVO, (i11 & 16) != 0 ? freshCellVO.rightIcon : iconDTO, (i11 & 32) != 0 ? freshCellVO.spacers : spacersVO, (i11 & 64) != 0 ? freshCellVO.backgroundColor : str2, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? freshCellVO.text : textDTO, (i11 & 256) != 0 ? freshCellVO.cornerRadius : f7, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? freshCellVO.action : atomAction, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? freshCellVO.tokenizedEvent : tVar);
    }

    @NotNull
    public final FreshCellVO copy(long id2, @NotNull CellDTO cell, String badgeImage, CheckboxFreshVO checkbox, IconDTO rightIcon, @NotNull SpacersVO spacers, String backgroundColor, TextDTO text, float cornerRadius, AtomAction action, t tokenizedEvent) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(spacers, "spacers");
        return new FreshCellVO(id2, cell, badgeImage, checkbox, rightIcon, spacers, backgroundColor, text, cornerRadius, action, tokenizedEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FreshCellVO)) {
            return false;
        }
        FreshCellVO freshCellVO = (FreshCellVO) other;
        return this.id == freshCellVO.id && Intrinsics.d(this.cell, freshCellVO.cell) && Intrinsics.d(this.badgeImage, freshCellVO.badgeImage) && Intrinsics.d(this.checkbox, freshCellVO.checkbox) && Intrinsics.d(this.rightIcon, freshCellVO.rightIcon) && Intrinsics.d(this.spacers, freshCellVO.spacers) && Intrinsics.d(this.backgroundColor, freshCellVO.backgroundColor) && Intrinsics.d(this.text, freshCellVO.text) && Float.compare(this.cornerRadius, freshCellVO.cornerRadius) == 0 && Intrinsics.d(this.action, freshCellVO.action) && Intrinsics.d(this.tokenizedEvent, freshCellVO.tokenizedEvent);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getBadgeImage() {
        return this.badgeImage;
    }

    @NotNull
    public final CellDTO getCell() {
        return this.cell;
    }

    public final CheckboxFreshVO getCheckbox() {
        return this.checkbox;
    }

    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final IconDTO getRightIcon() {
        return this.rightIcon;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final SpacersVO getSpacers() {
        return this.spacers;
    }

    public final TextDTO getText() {
        return this.text;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int c11 = Bi.b.c(this.cell, Long.hashCode(this.id) * 31, 31);
        String str = this.badgeImage;
        int hashCode = (c11 + (str == null ? 0 : str.hashCode())) * 31;
        CheckboxFreshVO checkboxFreshVO = this.checkbox;
        int hashCode2 = (hashCode + (checkboxFreshVO == null ? 0 : checkboxFreshVO.hashCode())) * 31;
        IconDTO iconDTO = this.rightIcon;
        int hashCode3 = (this.spacers.hashCode() + ((hashCode2 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31)) * 31;
        String str2 = this.backgroundColor;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        TextDTO textDTO = this.text;
        int a11 = Pk0.b.a(this.cornerRadius, (hashCode4 + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31);
        AtomAction atomAction = this.action;
        int hashCode5 = (a11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode5 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        CellDTO cellDTO = this.cell;
        String str = this.badgeImage;
        CheckboxFreshVO checkboxFreshVO = this.checkbox;
        IconDTO iconDTO = this.rightIcon;
        SpacersVO spacersVO = this.spacers;
        String str2 = this.backgroundColor;
        TextDTO textDTO = this.text;
        float f7 = this.cornerRadius;
        AtomAction atomAction = this.action;
        t tVar = this.tokenizedEvent;
        StringBuilder e11 = h.e("FreshCellVO(id=", j11, ", cell=", cellDTO);
        e11.append(", badgeImage=");
        e11.append(str);
        e11.append(", checkbox=");
        e11.append(checkboxFreshVO);
        e11.append(", rightIcon=");
        e11.append(iconDTO);
        e11.append(", spacers=");
        e11.append(spacersVO);
        e11.append(", backgroundColor=");
        e11.append(str2);
        e11.append(", text=");
        e11.append(textDTO);
        e11.append(", cornerRadius=");
        e11.append(f7);
        e11.append(", action=");
        e11.append(atomAction);
        return Lh.a.b(e11, ", tokenizedEvent=", tVar, ")");
    }
}

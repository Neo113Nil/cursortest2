package ru.ozon.app.android.pdp.widgets.aspectsCompactV2.presentation;

import Ak.C2436a;
import G.g;
import Ih.a;
import Kk.C3532b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.c;
import m10.InterfaceC8039a;
import m10.o;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.base.AspectsCompactVO$Variant;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b!\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u00032\u00020\u0004Bi\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001cH\u0002¢\u0006\u0004\b#\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u001bR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b-\u0010.R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0014\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010'\u001a\u0004\b8\u0010\u001bR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0017\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010,\u001a\u0004\b<\u0010.R\u0014\u0010?\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/presentation/AspectsCompactV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lm10/a;", "Lm10/o;", "", "id", "", "widgetName", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "addTopMargin", "", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/base/AspectsCompactVO$Variant;", "variants", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "moreVariantsButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon;", "additionalButton", "type", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "additionalButtonAtom", "shouldRefreshToTop", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;ZLjava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "createScrollWidgetKey", "J", "getId", "()J", "Ljava/lang/String;", "getWidgetName", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Z", "getAddTopMargin", "()Z", "Ljava/util/List;", "getVariants", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "getMoreVariantsButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon;", "getAdditionalButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon;", "getType", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getAdditionalButtonAtom", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getShouldRefreshToTop", "getScrollWidgetKey", "()Ljava/lang/Integer;", "scrollWidgetKey", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AspectsCompactV2VO implements c, InterfaceC8039a, o {
    private final boolean addTopMargin;
    private final ButtonV3Atom.SmallBorderlessButtonWithIcon additionalButton;
    private final ButtonV3DTO additionalButtonAtom;
    private final long id;
    private final ButtonV3Atom.LargeBorderlessButton moreVariantsButton;
    private final boolean shouldRefreshToTop;
    private final TextDTO title;

    @NotNull
    private final String type;
    private final List<AspectsCompactVO$Variant> variants;

    @NotNull
    private final String widgetName;

    /* JADX WARN: Multi-variable type inference failed */
    public AspectsCompactV2VO(long j11, @NotNull String widgetName, TextDTO textDTO, boolean z11, List<? extends AspectsCompactVO$Variant> list, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon, @NotNull String type, ButtonV3DTO buttonV3DTO, boolean z12) {
        Intrinsics.checkNotNullParameter(widgetName, "widgetName");
        Intrinsics.checkNotNullParameter(type, "type");
        this.id = j11;
        this.widgetName = widgetName;
        this.title = textDTO;
        this.addTopMargin = z11;
        this.variants = list;
        this.moreVariantsButton = largeBorderlessButton;
        this.additionalButton = smallBorderlessButtonWithIcon;
        this.type = type;
        this.additionalButtonAtom = buttonV3DTO;
        this.shouldRefreshToTop = z12;
    }

    private final int createScrollWidgetKey() {
        char c11;
        TextDTO textDTO;
        OzonSpannableString text;
        List l11;
        OzonSpannableString text2;
        Character ch2;
        TextDTO textDTO2 = this.title;
        String str = null;
        if (textDTO2 != null && (text2 = textDTO2.getText()) != null) {
            int i11 = 0;
            while (true) {
                if (i11 >= text2.length()) {
                    ch2 = null;
                    break;
                }
                char charAt = text2.charAt(i11);
                if (!Character.isLetterOrDigit(charAt) && charAt != ' ') {
                    ch2 = Character.valueOf(charAt);
                    break;
                }
                i11++;
            }
            if (ch2 != null) {
                c11 = ch2.charValue();
                textDTO = this.title;
                if (textDTO != null && (text = textDTO.getText()) != null && (l11 = h.l(text, new char[]{c11}, 0, 6)) != null) {
                    str = (String) C7714v.M(l11);
                }
                return a.a("AspectsCompactV2VO_aspectsCompact_", str);
            }
        }
        c11 = ':';
        textDTO = this.title;
        if (textDTO != null) {
            str = (String) C7714v.M(l11);
        }
        return a.a("AspectsCompactV2VO_aspectsCompact_", str);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AspectsCompactV2VO)) {
            return false;
        }
        AspectsCompactV2VO aspectsCompactV2VO = (AspectsCompactV2VO) other;
        return this.id == aspectsCompactV2VO.id && Intrinsics.d(this.widgetName, aspectsCompactV2VO.widgetName) && Intrinsics.d(this.title, aspectsCompactV2VO.title) && this.addTopMargin == aspectsCompactV2VO.addTopMargin && Intrinsics.d(this.variants, aspectsCompactV2VO.variants) && Intrinsics.d(this.moreVariantsButton, aspectsCompactV2VO.moreVariantsButton) && Intrinsics.d(this.additionalButton, aspectsCompactV2VO.additionalButton) && Intrinsics.d(this.type, aspectsCompactV2VO.type) && Intrinsics.d(this.additionalButtonAtom, aspectsCompactV2VO.additionalButtonAtom) && this.shouldRefreshToTop == aspectsCompactV2VO.shouldRefreshToTop;
    }

    public final boolean getAddTopMargin() {
        return this.addTopMargin;
    }

    public final ButtonV3Atom.SmallBorderlessButtonWithIcon getAdditionalButton() {
        return this.additionalButton;
    }

    public final ButtonV3DTO getAdditionalButtonAtom() {
        return this.additionalButtonAtom;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    @NotNull
    public Integer getScrollWidgetKey() {
        return Integer.valueOf(createScrollWidgetKey());
    }

    public final boolean getShouldRefreshToTop() {
        return this.shouldRefreshToTop;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public final List<AspectsCompactVO$Variant> getVariants() {
        return this.variants;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    @Override // m10.o
    @NotNull
    public String getWidgetName() {
        return this.widgetName;
    }

    public int hashCode() {
        int a11 = g.a(Long.hashCode(this.id) * 31, 31, this.widgetName);
        TextDTO textDTO = this.title;
        int a12 = C3532b.a((a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31, this.addTopMargin);
        List<AspectsCompactVO$Variant> list = this.variants;
        int hashCode = (a12 + (list == null ? 0 : list.hashCode())) * 31;
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.moreVariantsButton;
        int hashCode2 = (hashCode + (largeBorderlessButton == null ? 0 : largeBorderlessButton.hashCode())) * 31;
        ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon = this.additionalButton;
        int a13 = g.a((hashCode2 + (smallBorderlessButtonWithIcon == null ? 0 : smallBorderlessButtonWithIcon.hashCode())) * 31, 31, this.type);
        ButtonV3DTO buttonV3DTO = this.additionalButtonAtom;
        return Boolean.hashCode(this.shouldRefreshToTop) + ((a13 + (buttonV3DTO != null ? buttonV3DTO.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.widgetName;
        TextDTO textDTO = this.title;
        boolean z11 = this.addTopMargin;
        List<AspectsCompactVO$Variant> list = this.variants;
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.moreVariantsButton;
        ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon = this.additionalButton;
        String str2 = this.type;
        ButtonV3DTO buttonV3DTO = this.additionalButtonAtom;
        boolean z12 = this.shouldRefreshToTop;
        StringBuilder c11 = C2436a.c(j11, "AspectsCompactV2VO(id=", ", widgetName=", str);
        c11.append(", title=");
        c11.append(textDTO);
        c11.append(", addTopMargin=");
        c11.append(z11);
        c11.append(", variants=");
        c11.append(list);
        c11.append(", moreVariantsButton=");
        c11.append(largeBorderlessButton);
        c11.append(", additionalButton=");
        c11.append(smallBorderlessButtonWithIcon);
        c11.append(", type=");
        c11.append(str2);
        c11.append(", additionalButtonAtom=");
        c11.append(buttonV3DTO);
        c11.append(", shouldRefreshToTop=");
        c11.append(z12);
        c11.append(")");
        return c11.toString();
    }

    public /* synthetic */ AspectsCompactV2VO(long j11, String str, TextDTO textDTO, boolean z11, List list, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon, String str2, ButtonV3DTO buttonV3DTO, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, (i11 & 2) != 0 ? "pdp_product" : str, textDTO, z11, list, largeBorderlessButton, smallBorderlessButtonWithIcon, str2, buttonV3DTO, z12);
    }
}

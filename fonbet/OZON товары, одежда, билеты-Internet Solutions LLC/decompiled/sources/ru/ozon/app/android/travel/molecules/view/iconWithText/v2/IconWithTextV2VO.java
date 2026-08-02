package ru.ozon.app.android.travel.molecules.view.iconWithText.v2;

import B0.C2454a;
import B90.C2619v;
import Pk0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b \u0010\u0011R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b\r\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/iconWithText/v2/IconWithTextV2VO;", "", "Lru/ozon/uni/atoms/data/button/Icon;", "icon", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "text", "subText", "", "borderColor", "backgroundColor", "", "borderRadius", "", "isSingleItem", "<init>", "(Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/button/Icon;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubText", "Ljava/lang/String;", "getBorderColor", "getBackgroundColor", "Ljava/lang/Integer;", "getBorderRadius", "()Ljava/lang/Integer;", "Z", "()Z", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class IconWithTextV2VO {
    public static final int $stable = TextAtom.$stable | Icon.$stable;
    private final String backgroundColor;
    private final String borderColor;
    private final Integer borderRadius;

    @NotNull
    private final Icon icon;
    private final boolean isSingleItem;
    private final TextAtom subText;

    @NotNull
    private final TextAtom text;

    public IconWithTextV2VO(@NotNull Icon icon, @NotNull TextAtom text, TextAtom textAtom, String str, String str2, Integer num, boolean z11) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(text, "text");
        this.icon = icon;
        this.text = text;
        this.subText = textAtom;
        this.borderColor = str;
        this.backgroundColor = str2;
        this.borderRadius = num;
        this.isSingleItem = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IconWithTextV2VO)) {
            return false;
        }
        IconWithTextV2VO iconWithTextV2VO = (IconWithTextV2VO) other;
        return Intrinsics.d(this.icon, iconWithTextV2VO.icon) && Intrinsics.d(this.text, iconWithTextV2VO.text) && Intrinsics.d(this.subText, iconWithTextV2VO.subText) && Intrinsics.d(this.borderColor, iconWithTextV2VO.borderColor) && Intrinsics.d(this.backgroundColor, iconWithTextV2VO.backgroundColor) && Intrinsics.d(this.borderRadius, iconWithTextV2VO.borderRadius) && this.isSingleItem == iconWithTextV2VO.isSingleItem;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getBorderColor() {
        return this.borderColor;
    }

    public final Integer getBorderRadius() {
        return this.borderRadius;
    }

    @NotNull
    public final Icon getIcon() {
        return this.icon;
    }

    public final TextAtom getSubText() {
        return this.subText;
    }

    @NotNull
    public final TextAtom getText() {
        return this.text;
    }

    public int hashCode() {
        int b11 = C2619v.b(this.icon.hashCode() * 31, 31, this.text);
        TextAtom textAtom = this.subText;
        int hashCode = (b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        String str = this.borderColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundColor;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.borderRadius;
        return Boolean.hashCode(this.isSingleItem) + ((hashCode3 + (num != null ? num.hashCode() : 0)) * 31);
    }

    /* renamed from: isSingleItem, reason: from getter */
    public final boolean getIsSingleItem() {
        return this.isSingleItem;
    }

    @NotNull
    public String toString() {
        Icon icon = this.icon;
        TextAtom textAtom = this.text;
        TextAtom textAtom2 = this.subText;
        String str = this.borderColor;
        String str2 = this.backgroundColor;
        Integer num = this.borderRadius;
        boolean z11 = this.isSingleItem;
        StringBuilder sb2 = new StringBuilder("IconWithTextV2VO(icon=");
        sb2.append(icon);
        sb2.append(", text=");
        sb2.append(textAtom);
        sb2.append(", subText=");
        sb2.append(textAtom2);
        sb2.append(", borderColor=");
        sb2.append(str);
        sb2.append(", backgroundColor=");
        C2454a.f(num, str2, ", borderRadius=", ", isSingleItem=", sb2);
        return a.a(")", sb2, z11);
    }
}

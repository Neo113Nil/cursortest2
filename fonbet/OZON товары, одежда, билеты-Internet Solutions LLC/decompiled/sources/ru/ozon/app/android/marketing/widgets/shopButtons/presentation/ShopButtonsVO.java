package ru.ozon.app.android.marketing.widgets.shopButtons.presentation;

import Bi.a;
import De.C2859b;
import F3.G;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BE\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b$\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010\u0012R\u001f\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/marketing/widgets/shopButtons/presentation/ShopButtonsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "mainButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "rightButtonFirst", "rightButtonSecond", "", "backgroundColor", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Ljava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getMainButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getRightButtonFirst", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getRightButtonSecond", "Ljava/lang/String;", "getBackgroundColor", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ShopButtonsVO implements c {
    private final String backgroundColor;
    private final long id;

    @NotNull
    private final ButtonV3DTO mainButton;
    private final IconButtonV3DTO rightButtonFirst;
    private final IconButtonV3DTO rightButtonSecond;
    private final t tokenizedEvent;

    public ShopButtonsVO(long j11, @NotNull ButtonV3DTO mainButton, IconButtonV3DTO iconButtonV3DTO, IconButtonV3DTO iconButtonV3DTO2, String str, t tVar) {
        Intrinsics.checkNotNullParameter(mainButton, "mainButton");
        this.id = j11;
        this.mainButton = mainButton;
        this.rightButtonFirst = iconButtonV3DTO;
        this.rightButtonSecond = iconButtonV3DTO2;
        this.backgroundColor = str;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShopButtonsVO)) {
            return false;
        }
        ShopButtonsVO shopButtonsVO = (ShopButtonsVO) other;
        return this.id == shopButtonsVO.id && Intrinsics.d(this.mainButton, shopButtonsVO.mainButton) && Intrinsics.d(this.rightButtonFirst, shopButtonsVO.rightButtonFirst) && Intrinsics.d(this.rightButtonSecond, shopButtonsVO.rightButtonSecond) && Intrinsics.d(this.backgroundColor, shopButtonsVO.backgroundColor) && Intrinsics.d(this.tokenizedEvent, shopButtonsVO.tokenizedEvent);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final ButtonV3DTO getMainButton() {
        return this.mainButton;
    }

    public final IconButtonV3DTO getRightButtonFirst() {
        return this.rightButtonFirst;
    }

    public final IconButtonV3DTO getRightButtonSecond() {
        return this.rightButtonSecond;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int c11 = C2859b.c(this.mainButton, Long.hashCode(this.id) * 31, 31);
        IconButtonV3DTO iconButtonV3DTO = this.rightButtonFirst;
        int hashCode = (c11 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO2 = this.rightButtonSecond;
        int hashCode2 = (hashCode + (iconButtonV3DTO2 == null ? 0 : iconButtonV3DTO2.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode3 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ButtonV3DTO buttonV3DTO = this.mainButton;
        IconButtonV3DTO iconButtonV3DTO = this.rightButtonFirst;
        IconButtonV3DTO iconButtonV3DTO2 = this.rightButtonSecond;
        String str = this.backgroundColor;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = G.c("ShopButtonsVO(id=", j11, ", mainButton=", buttonV3DTO);
        c11.append(", rightButtonFirst=");
        c11.append(iconButtonV3DTO);
        c11.append(", rightButtonSecond=");
        c11.append(iconButtonV3DTO2);
        a.f(c11, ", backgroundColor=", str, ", tokenizedEvent=", tVar);
        c11.append(")");
        return c11.toString();
    }
}

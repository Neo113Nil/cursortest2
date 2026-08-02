package ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.model;

import D3.g;
import Ve.C4598rp;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b)\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b1\u00102R\u001f\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00103\u001a\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/HammersV3GradientHeaderVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/GradientTitleVO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "infoText", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/HammersV3TimerBadgeVO;", "timerBadge", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "infoButton", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/GradientTitleVO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/HammersV3TimerBadgeVO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/GradientTitleVO;", "getTitle", "()Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/GradientTitleVO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getInfoText", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/HammersV3TimerBadgeVO;", "getTimerBadge", "()Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/HammersV3TimerBadgeVO;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getInfoButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class HammersV3GradientHeaderVO implements c {

    @NotNull
    private final AtomAction action;
    private final long id;
    private final IconButtonV3DTO infoButton;
    private final TextDTO infoText;
    private final TextDTO subtitle;
    private final HammersV3TimerBadgeVO timerBadge;

    @NotNull
    private final GradientTitleVO title;
    private final t tokenizedEvent;

    public HammersV3GradientHeaderVO(long j11, @NotNull GradientTitleVO title, TextDTO textDTO, TextDTO textDTO2, HammersV3TimerBadgeVO hammersV3TimerBadgeVO, IconButtonV3DTO iconButtonV3DTO, @NotNull AtomAction action, t tVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        this.id = j11;
        this.title = title;
        this.subtitle = textDTO;
        this.infoText = textDTO2;
        this.timerBadge = hammersV3TimerBadgeVO;
        this.infoButton = iconButtonV3DTO;
        this.action = action;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HammersV3GradientHeaderVO)) {
            return false;
        }
        HammersV3GradientHeaderVO hammersV3GradientHeaderVO = (HammersV3GradientHeaderVO) other;
        return this.id == hammersV3GradientHeaderVO.id && Intrinsics.d(this.title, hammersV3GradientHeaderVO.title) && Intrinsics.d(this.subtitle, hammersV3GradientHeaderVO.subtitle) && Intrinsics.d(this.infoText, hammersV3GradientHeaderVO.infoText) && Intrinsics.d(this.timerBadge, hammersV3GradientHeaderVO.timerBadge) && Intrinsics.d(this.infoButton, hammersV3GradientHeaderVO.infoButton) && Intrinsics.d(this.action, hammersV3GradientHeaderVO.action) && Intrinsics.d(this.tokenizedEvent, hammersV3GradientHeaderVO.tokenizedEvent);
    }

    @NotNull
    public final AtomAction getAction() {
        return this.action;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final IconButtonV3DTO getInfoButton() {
        return this.infoButton;
    }

    public final TextDTO getInfoText() {
        return this.infoText;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public final HammersV3TimerBadgeVO getTimerBadge() {
        return this.timerBadge;
    }

    @NotNull
    public final GradientTitleVO getTitle() {
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
        int hashCode = (this.title.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        TextDTO textDTO = this.subtitle;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        TextDTO textDTO2 = this.infoText;
        int hashCode3 = (hashCode2 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        HammersV3TimerBadgeVO hammersV3TimerBadgeVO = this.timerBadge;
        int hashCode4 = (hashCode3 + (hammersV3TimerBadgeVO == null ? 0 : hammersV3TimerBadgeVO.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.infoButton;
        int a11 = C4598rp.a(this.action, (hashCode4 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31, 31);
        t tVar = this.tokenizedEvent;
        return a11 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        GradientTitleVO gradientTitleVO = this.title;
        TextDTO textDTO = this.subtitle;
        TextDTO textDTO2 = this.infoText;
        HammersV3TimerBadgeVO hammersV3TimerBadgeVO = this.timerBadge;
        IconButtonV3DTO iconButtonV3DTO = this.infoButton;
        AtomAction atomAction = this.action;
        t tVar = this.tokenizedEvent;
        StringBuilder sb2 = new StringBuilder("HammersV3GradientHeaderVO(id=");
        sb2.append(j11);
        sb2.append(", title=");
        sb2.append(gradientTitleVO);
        g.i(", subtitle=", ", infoText=", sb2, textDTO, textDTO2);
        sb2.append(", timerBadge=");
        sb2.append(hammersV3TimerBadgeVO);
        sb2.append(", infoButton=");
        sb2.append(iconButtonV3DTO);
        Fj.c.e(tVar, ", action=", ", tokenizedEvent=", sb2, atomAction);
        sb2.append(")");
        return sb2.toString();
    }
}

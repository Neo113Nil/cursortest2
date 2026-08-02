package ru.ozon.app.android.bank.widgets.bankAccountStatus.presentation;

import Ns.b;
import TY.a;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002Bk\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0088\u0001\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00142\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b)\u0010(R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010/R\u001f\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00103\u001a\u0004\b4\u0010\u001bR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u00103\u001a\u0004\b5\u0010\u001bR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u00109\u001a\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lru/ozon/app/android/bank/widgets/bankAccountStatus/presentation/BankAccountStatusVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subTitle", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "button", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "backgroundColor", "widgetBackground", "Lru/ozon/uni/atoms/data/AtomDTO;", "descriptionAtom", "", "needBankBalanceRefresh", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomDTO;Z)V", "copy", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomDTO;Z)Lru/ozon/app/android/bank/widgets/bankAccountStatus/presentation/BankAccountStatusVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubTitle", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Ljava/lang/String;", "getBackgroundColor", "getWidgetBackground", "Lru/ozon/uni/atoms/data/AtomDTO;", "getDescriptionAtom", "()Lru/ozon/uni/atoms/data/AtomDTO;", "Z", "getNeedBankBalanceRefresh", "()Z", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BankAccountStatusVO implements c {
    private final AtomAction action;
    private final String backgroundColor;
    private final ButtonV3Atom.SmallButton button;
    private final AtomDTO descriptionAtom;
    private final long id;
    private final boolean needBankBalanceRefresh;
    private final TextDTO subTitle;

    @NotNull
    private final TextDTO title;
    private final t tokenizedEvent;
    private final String widgetBackground;

    public BankAccountStatusVO(long j11, @NotNull TextDTO title, TextDTO textDTO, ButtonV3Atom.SmallButton smallButton, AtomAction atomAction, t tVar, String str, String str2, AtomDTO atomDTO, boolean z11) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = j11;
        this.title = title;
        this.subTitle = textDTO;
        this.button = smallButton;
        this.action = atomAction;
        this.tokenizedEvent = tVar;
        this.backgroundColor = str;
        this.widgetBackground = str2;
        this.descriptionAtom = atomDTO;
        this.needBankBalanceRefresh = z11;
    }

    public static /* synthetic */ BankAccountStatusVO copy$default(BankAccountStatusVO bankAccountStatusVO, long j11, TextDTO textDTO, TextDTO textDTO2, ButtonV3Atom.SmallButton smallButton, AtomAction atomAction, t tVar, String str, String str2, AtomDTO atomDTO, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = bankAccountStatusVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            textDTO = bankAccountStatusVO.title;
        }
        return bankAccountStatusVO.copy(j12, textDTO, (i11 & 4) != 0 ? bankAccountStatusVO.subTitle : textDTO2, (i11 & 8) != 0 ? bankAccountStatusVO.button : smallButton, (i11 & 16) != 0 ? bankAccountStatusVO.action : atomAction, (i11 & 32) != 0 ? bankAccountStatusVO.tokenizedEvent : tVar, (i11 & 64) != 0 ? bankAccountStatusVO.backgroundColor : str, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? bankAccountStatusVO.widgetBackground : str2, (i11 & 256) != 0 ? bankAccountStatusVO.descriptionAtom : atomDTO, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? bankAccountStatusVO.needBankBalanceRefresh : z11);
    }

    @NotNull
    public final BankAccountStatusVO copy(long id2, @NotNull TextDTO title, TextDTO subTitle, ButtonV3Atom.SmallButton button, AtomAction action, t tokenizedEvent, String backgroundColor, String widgetBackground, AtomDTO descriptionAtom, boolean needBankBalanceRefresh) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new BankAccountStatusVO(id2, title, subTitle, button, action, tokenizedEvent, backgroundColor, widgetBackground, descriptionAtom, needBankBalanceRefresh);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BankAccountStatusVO)) {
            return false;
        }
        BankAccountStatusVO bankAccountStatusVO = (BankAccountStatusVO) other;
        return this.id == bankAccountStatusVO.id && Intrinsics.d(this.title, bankAccountStatusVO.title) && Intrinsics.d(this.subTitle, bankAccountStatusVO.subTitle) && Intrinsics.d(this.button, bankAccountStatusVO.button) && Intrinsics.d(this.action, bankAccountStatusVO.action) && Intrinsics.d(this.tokenizedEvent, bankAccountStatusVO.tokenizedEvent) && Intrinsics.d(this.backgroundColor, bankAccountStatusVO.backgroundColor) && Intrinsics.d(this.widgetBackground, bankAccountStatusVO.widgetBackground) && Intrinsics.d(this.descriptionAtom, bankAccountStatusVO.descriptionAtom) && this.needBankBalanceRefresh == bankAccountStatusVO.needBankBalanceRefresh;
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final ButtonV3Atom.SmallButton getButton() {
        return this.button;
    }

    public final AtomDTO getDescriptionAtom() {
        return this.descriptionAtom;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final boolean getNeedBankBalanceRefresh() {
        return this.needBankBalanceRefresh;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextDTO getSubTitle() {
        return this.subTitle;
    }

    @NotNull
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

    public final String getWidgetBackground() {
        return this.widgetBackground;
    }

    public int hashCode() {
        int a11 = b.a(this.title, Long.hashCode(this.id) * 31, 31);
        TextDTO textDTO = this.subTitle;
        int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        ButtonV3Atom.SmallButton smallButton = this.button;
        int hashCode2 = (hashCode + (smallButton == null ? 0 : smallButton.hashCode())) * 31;
        AtomAction atomAction = this.action;
        int hashCode3 = (hashCode2 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode4 = (hashCode3 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.widgetBackground;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AtomDTO atomDTO = this.descriptionAtom;
        return Boolean.hashCode(this.needBankBalanceRefresh) + ((hashCode6 + (atomDTO != null ? atomDTO.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subTitle;
        ButtonV3Atom.SmallButton smallButton = this.button;
        AtomAction atomAction = this.action;
        t tVar = this.tokenizedEvent;
        String str = this.backgroundColor;
        String str2 = this.widgetBackground;
        AtomDTO atomDTO = this.descriptionAtom;
        boolean z11 = this.needBankBalanceRefresh;
        StringBuilder b11 = a.b("BankAccountStatusVO(id=", j11, ", title=", textDTO);
        b11.append(", subTitle=");
        b11.append(textDTO2);
        b11.append(", button=");
        b11.append(smallButton);
        Fj.c.e(tVar, ", action=", ", tokenizedEvent=", b11, atomAction);
        Nh.a.h(b11, ", backgroundColor=", str, ", widgetBackground=", str2);
        b11.append(", descriptionAtom=");
        b11.append(atomDTO);
        b11.append(", needBankBalanceRefresh=");
        b11.append(z11);
        b11.append(")");
        return b11.toString();
    }
}

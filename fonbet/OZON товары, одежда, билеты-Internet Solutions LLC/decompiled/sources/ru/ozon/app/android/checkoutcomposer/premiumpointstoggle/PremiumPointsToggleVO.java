package ru.ozon.app.android.checkoutcomposer.premiumpointstoggle;

import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.tabs.Tabs;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001$B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/premiumpointstoggle/PremiumPointsToggleVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/checkoutcomposer/premiumpointstoggle/PremiumPointsToggleVO$Header;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/uni/atoms/data/tabs/Tabs;", "switcherTab", "LWZ/t;", "tokenizedEvent", "<init>", "(JLru/ozon/app/android/checkoutcomposer/premiumpointstoggle/PremiumPointsToggleVO$Header;Lru/ozon/uni/atoms/data/tabs/Tabs;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/checkoutcomposer/premiumpointstoggle/PremiumPointsToggleVO$Header;", "getHeader", "()Lru/ozon/app/android/checkoutcomposer/premiumpointstoggle/PremiumPointsToggleVO$Header;", "Lru/ozon/uni/atoms/data/tabs/Tabs;", "getSwitcherTab", "()Lru/ozon/uni/atoms/data/tabs/Tabs;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Header", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PremiumPointsToggleVO implements c {

    @NotNull
    private final Header header;
    private final long id;

    @NotNull
    private final Tabs switcherTab;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/premiumpointstoggle/PremiumPointsToggleVO$Header;", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeIconButton;", "button", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeIconButton;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeIconButton;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeIconButton;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Header {
        public static final int $stable = ButtonV3Atom.LargeIconButton.$stable | TextAtom.$stable;
        private final ButtonV3Atom.LargeIconButton button;

        @NotNull
        private final TextAtom title;

        public Header(@NotNull TextAtom title, ButtonV3Atom.LargeIconButton largeIconButton) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.button = largeIconButton;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Header)) {
                return false;
            }
            Header header = (Header) other;
            return Intrinsics.d(this.title, header.title) && Intrinsics.d(this.button, header.button);
        }

        public final ButtonV3Atom.LargeIconButton getButton() {
            return this.button;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            ButtonV3Atom.LargeIconButton largeIconButton = this.button;
            return hashCode + (largeIconButton == null ? 0 : largeIconButton.hashCode());
        }

        @NotNull
        public String toString() {
            return "Header(title=" + this.title + ", button=" + this.button + ")";
        }
    }

    public PremiumPointsToggleVO(long j11, @NotNull Header header, @NotNull Tabs switcherTab, t tVar) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(switcherTab, "switcherTab");
        this.id = j11;
        this.header = header;
        this.switcherTab = switcherTab;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PremiumPointsToggleVO)) {
            return false;
        }
        PremiumPointsToggleVO premiumPointsToggleVO = (PremiumPointsToggleVO) other;
        return this.id == premiumPointsToggleVO.id && Intrinsics.d(this.header, premiumPointsToggleVO.header) && Intrinsics.d(this.switcherTab, premiumPointsToggleVO.switcherTab) && Intrinsics.d(this.tokenizedEvent, premiumPointsToggleVO.tokenizedEvent);
    }

    @NotNull
    public final Header getHeader() {
        return this.header;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final Tabs getSwitcherTab() {
        return this.switcherTab;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.switcherTab.hashCode() + ((this.header.hashCode() + (Long.hashCode(this.id) * 31)) * 31)) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        return "PremiumPointsToggleVO(id=" + this.id + ", header=" + this.header + ", switcherTab=" + this.switcherTab + ", tokenizedEvent=" + this.tokenizedEvent + ")";
    }
}

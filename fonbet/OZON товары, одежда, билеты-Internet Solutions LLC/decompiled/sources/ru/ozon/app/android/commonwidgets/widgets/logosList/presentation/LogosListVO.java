package ru.ozon.app.android.commonwidgets.widgets.logosList.presentation;

import G.g;
import K1.G;
import Ns.b;
import Ve.C4598rp;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.ui.tooltip.molecule.TooltipWithOnboardingActionVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002 !B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/logosList/presentation/LogosListVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/commonwidgets/widgets/logosList/presentation/LogosListVO$Item;", "items", "Lru/ozon/app/android/commonwidgets/widgets/logosList/presentation/LogosListVO$Onboarding;", "onboarding", "<init>", "(JLjava/util/List;Lru/ozon/app/android/commonwidgets/widgets/logosList/presentation/LogosListVO$Onboarding;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Lru/ozon/app/android/commonwidgets/widgets/logosList/presentation/LogosListVO$Onboarding;", "getOnboarding", "()Lru/ozon/app/android/commonwidgets/widgets/logosList/presentation/LogosListVO$Onboarding;", "Item", "Onboarding", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class LogosListVO implements c {
    private final long id;

    @NotNull
    private final List<Item> items;
    private final Onboarding onboarding;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0003\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/logosList/presentation/LogosListVO$Item;", "", "", "isSelected", "", "text", "subtext", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "tokenizedEvent", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "Ljava/lang/String;", "getText", "getSubtext", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Item {

        @NotNull
        private final AtomAction action;
        private final boolean isSelected;

        @NotNull
        private final String subtext;

        @NotNull
        private final String text;
        private final t tokenizedEvent;

        public Item(boolean z11, @NotNull String text, @NotNull String subtext, @NotNull AtomAction action, t tVar) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(subtext, "subtext");
            Intrinsics.checkNotNullParameter(action, "action");
            this.isSelected = z11;
            this.text = text;
            this.subtext = subtext;
            this.action = action;
            this.tokenizedEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return this.isSelected == item.isSelected && Intrinsics.d(this.text, item.text) && Intrinsics.d(this.subtext, item.subtext) && Intrinsics.d(this.action, item.action) && Intrinsics.d(this.tokenizedEvent, item.tokenizedEvent);
        }

        @NotNull
        public final AtomAction getAction() {
            return this.action;
        }

        @NotNull
        public final String getSubtext() {
            return this.subtext;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int a11 = C4598rp.a(this.action, g.a(g.a(Boolean.hashCode(this.isSelected) * 31, 31, this.text), 31, this.subtext), 31);
            t tVar = this.tokenizedEvent;
            return a11 + (tVar == null ? 0 : tVar.hashCode());
        }

        /* renamed from: isSelected, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            boolean z11 = this.isSelected;
            String str = this.text;
            String str2 = this.subtext;
            AtomAction atomAction = this.action;
            t tVar = this.tokenizedEvent;
            StringBuilder d11 = G.d("Item(isSelected=", ", text=", str, ", subtext=", z11);
            b.d(str2, ", action=", ", tokenizedEvent=", d11, atomAction);
            return Tl.b.d(d11, tVar, ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/logosList/presentation/LogosListVO$Onboarding;", "", "Lru/ozon/app/android/cart/ui/tooltip/molecule/TooltipWithOnboardingActionVO;", "tooltipWithOnboardingAction", "", "index", "<init>", "(Lru/ozon/app/android/cart/ui/tooltip/molecule/TooltipWithOnboardingActionVO;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/cart/ui/tooltip/molecule/TooltipWithOnboardingActionVO;", "getTooltipWithOnboardingAction", "()Lru/ozon/app/android/cart/ui/tooltip/molecule/TooltipWithOnboardingActionVO;", "I", "getIndex", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Onboarding {
        private final int index;

        @NotNull
        private final TooltipWithOnboardingActionVO tooltipWithOnboardingAction;

        public Onboarding(@NotNull TooltipWithOnboardingActionVO tooltipWithOnboardingAction, int i11) {
            Intrinsics.checkNotNullParameter(tooltipWithOnboardingAction, "tooltipWithOnboardingAction");
            this.tooltipWithOnboardingAction = tooltipWithOnboardingAction;
            this.index = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Onboarding)) {
                return false;
            }
            Onboarding onboarding = (Onboarding) other;
            return Intrinsics.d(this.tooltipWithOnboardingAction, onboarding.tooltipWithOnboardingAction) && this.index == onboarding.index;
        }

        public final int getIndex() {
            return this.index;
        }

        @NotNull
        public final TooltipWithOnboardingActionVO getTooltipWithOnboardingAction() {
            return this.tooltipWithOnboardingAction;
        }

        public int hashCode() {
            return Integer.hashCode(this.index) + (this.tooltipWithOnboardingAction.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Onboarding(tooltipWithOnboardingAction=" + this.tooltipWithOnboardingAction + ", index=" + this.index + ")";
        }
    }

    public LogosListVO(long j11, @NotNull List<Item> items, Onboarding onboarding) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.id = j11;
        this.items = items;
        this.onboarding = onboarding;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogosListVO)) {
            return false;
        }
        LogosListVO logosListVO = (LogosListVO) other;
        return this.id == logosListVO.id && Intrinsics.d(this.items, logosListVO.items) && Intrinsics.d(this.onboarding, logosListVO.onboarding);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<Item> getItems() {
        return this.items;
    }

    public final Onboarding getOnboarding() {
        return this.onboarding;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.items);
        Onboarding onboarding = this.onboarding;
        return b11 + (onboarding == null ? 0 : onboarding.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<Item> list = this.items;
        Onboarding onboarding = this.onboarding;
        StringBuilder b11 = Lh.b.b(j11, "LogosListVO(id=", ", items=", list);
        b11.append(", onboarding=");
        b11.append(onboarding);
        b11.append(")");
        return b11.toString();
    }
}

package ru.ozon.app.android.pdp.widgets.priceBlock.priceActions.presentation;

import B0.A0;
import Co.a;
import G.g;
import Ns.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002#$B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/presentation/PriceActionsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/presentation/PriceActionsVO$Action;", "actions", "", "backgroundColor", "LWZ/t;", "tokenizedEvent", "<init>", "(JLjava/util/List;Ljava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getActions", "()Ljava/util/List;", "Ljava/lang/String;", "getBackgroundColor", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Action", "Disclosure", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PriceActionsVO implements c {

    @NotNull
    private final List<Action> actions;

    @NotNull
    private final String backgroundColor;
    private final long id;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b2\u0010.R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010/\u001a\u0004\b6\u00101¨\u00067"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/presentation/PriceActionsVO$Action;", "", "", "backgroundColor", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/uni/atoms/data/button/Icon;", "icon", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/presentation/PriceActionsVO$Disclosure;", "disclosure", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "tokenizedEvent", "", "animationTimer", "animationTokenizedEvent", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onBoarding", "width", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/presentation/PriceActionsVO$Disclosure;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Ljava/lang/Integer;LWZ/t;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/button/Icon;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/presentation/PriceActionsVO$Disclosure;", "getDisclosure", "()Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/presentation/PriceActionsVO$Disclosure;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Ljava/lang/Integer;", "getAnimationTimer", "()Ljava/lang/Integer;", "getAnimationTokenizedEvent", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnBoarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getWidth", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Action {
        private final AtomAction action;
        private final Integer animationTimer;
        private final t animationTokenizedEvent;

        @NotNull
        private final String backgroundColor;
        private final Disclosure disclosure;
        private final Icon icon;
        private final OnBoardingDTO onBoarding;

        @NotNull
        private final TextDTO text;
        private final t tokenizedEvent;
        private final Integer width;

        public Action(@NotNull String backgroundColor, @NotNull TextDTO text, Icon icon, Disclosure disclosure, AtomAction atomAction, t tVar, Integer num, t tVar2, OnBoardingDTO onBoardingDTO, Integer num2) {
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(text, "text");
            this.backgroundColor = backgroundColor;
            this.text = text;
            this.icon = icon;
            this.disclosure = disclosure;
            this.action = atomAction;
            this.tokenizedEvent = tVar;
            this.animationTimer = num;
            this.animationTokenizedEvent = tVar2;
            this.onBoarding = onBoardingDTO;
            this.width = num2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Action)) {
                return false;
            }
            Action action = (Action) other;
            return Intrinsics.d(this.backgroundColor, action.backgroundColor) && Intrinsics.d(this.text, action.text) && Intrinsics.d(this.icon, action.icon) && Intrinsics.d(this.disclosure, action.disclosure) && Intrinsics.d(this.action, action.action) && Intrinsics.d(this.tokenizedEvent, action.tokenizedEvent) && Intrinsics.d(this.animationTimer, action.animationTimer) && Intrinsics.d(this.animationTokenizedEvent, action.animationTokenizedEvent) && Intrinsics.d(this.onBoarding, action.onBoarding) && Intrinsics.d(this.width, action.width);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final Integer getAnimationTimer() {
            return this.animationTimer;
        }

        public final t getAnimationTokenizedEvent() {
            return this.animationTokenizedEvent;
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final Disclosure getDisclosure() {
            return this.disclosure;
        }

        public final Icon getIcon() {
            return this.icon;
        }

        public final OnBoardingDTO getOnBoarding() {
            return this.onBoarding;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public final Integer getWidth() {
            return this.width;
        }

        public int hashCode() {
            int a11 = b.a(this.text, this.backgroundColor.hashCode() * 31, 31);
            Icon icon = this.icon;
            int hashCode = (a11 + (icon == null ? 0 : icon.hashCode())) * 31;
            Disclosure disclosure = this.disclosure;
            int hashCode2 = (hashCode + (disclosure == null ? 0 : disclosure.hashCode())) * 31;
            AtomAction atomAction = this.action;
            int hashCode3 = (hashCode2 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            t tVar = this.tokenizedEvent;
            int hashCode4 = (hashCode3 + (tVar == null ? 0 : tVar.hashCode())) * 31;
            Integer num = this.animationTimer;
            int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
            t tVar2 = this.animationTokenizedEvent;
            int hashCode6 = (hashCode5 + (tVar2 == null ? 0 : tVar2.hashCode())) * 31;
            OnBoardingDTO onBoardingDTO = this.onBoarding;
            int hashCode7 = (hashCode6 + (onBoardingDTO == null ? 0 : onBoardingDTO.hashCode())) * 31;
            Integer num2 = this.width;
            return hashCode7 + (num2 != null ? num2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.backgroundColor;
            TextDTO textDTO = this.text;
            Icon icon = this.icon;
            Disclosure disclosure = this.disclosure;
            AtomAction atomAction = this.action;
            t tVar = this.tokenizedEvent;
            Integer num = this.animationTimer;
            t tVar2 = this.animationTokenizedEvent;
            OnBoardingDTO onBoardingDTO = this.onBoarding;
            Integer num2 = this.width;
            StringBuilder b11 = a.b("Action(backgroundColor=", textDTO, str, ", text=", ", icon=");
            b11.append(icon);
            b11.append(", disclosure=");
            b11.append(disclosure);
            b11.append(", action=");
            b11.append(atomAction);
            b11.append(", tokenizedEvent=");
            b11.append(tVar);
            b11.append(", animationTimer=");
            b11.append(num);
            b11.append(", animationTokenizedEvent=");
            b11.append(tVar2);
            b11.append(", onBoarding=");
            b11.append(onBoardingDTO);
            b11.append(", width=");
            b11.append(num2);
            b11.append(")");
            return b11.toString();
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/presentation/PriceActionsVO$Disclosure;", "", "", "tintColor", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTintColor", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Disclosure {

        @NotNull
        private final String tintColor;

        public Disclosure(@NotNull String tintColor) {
            Intrinsics.checkNotNullParameter(tintColor, "tintColor");
            this.tintColor = tintColor;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Disclosure) && Intrinsics.d(this.tintColor, ((Disclosure) other).tintColor);
        }

        @NotNull
        public final String getTintColor() {
            return this.tintColor;
        }

        public int hashCode() {
            return this.tintColor.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("Disclosure(tintColor=", this.tintColor, ")");
        }
    }

    public PriceActionsVO(long j11, @NotNull List<Action> actions, @NotNull String backgroundColor, t tVar) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.id = j11;
        this.actions = actions;
        this.backgroundColor = backgroundColor;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PriceActionsVO)) {
            return false;
        }
        PriceActionsVO priceActionsVO = (PriceActionsVO) other;
        return this.id == priceActionsVO.id && Intrinsics.d(this.actions, priceActionsVO.actions) && Intrinsics.d(this.backgroundColor, priceActionsVO.backgroundColor) && Intrinsics.d(this.tokenizedEvent, priceActionsVO.tokenizedEvent);
    }

    @NotNull
    public final List<Action> getActions() {
        return this.actions;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
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
        int a11 = g.a(g.b(Long.hashCode(this.id) * 31, 31, this.actions), 31, this.backgroundColor);
        t tVar = this.tokenizedEvent;
        return a11 + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<Action> list = this.actions;
        String str = this.backgroundColor;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = Lh.b.b(j11, "PriceActionsVO(id=", ", actions=", list);
        Bi.a.f(b11, ", backgroundColor=", str, ", tokenizedEvent=", tVar);
        b11.append(")");
        return b11.toString();
    }
}

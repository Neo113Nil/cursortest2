package ru.ozon.app.android.marketing.widgets.blackfridaycounter.presentation;

import Ak.C2436a;
import E0.C2942q;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import Pk0.f;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002/0BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b\"\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+R\u001f\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b-\u0010.¨\u00061"}, d2 = {"Lru/ozon/app/android/marketing/widgets/blackfridaycounter/presentation/BlackFridayCounterVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "backgroundImage", "titleImage", "Lru/ozon/app/android/marketing/widgets/blackfridaycounter/presentation/BlackFridayCounterVO$TimerVO;", DynamicElementDTO.TIMER, "Lru/ozon/app/android/marketing/widgets/blackfridaycounter/presentation/BlackFridayCounterVO$FooterVO;", CommentV3DTO.FOOTER_FIELD_NAME, "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lru/ozon/app/android/marketing/widgets/blackfridaycounter/presentation/BlackFridayCounterVO$TimerVO;Lru/ozon/app/android/marketing/widgets/blackfridaycounter/presentation/BlackFridayCounterVO$FooterVO;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getBackgroundImage", "getTitleImage", "Lru/ozon/app/android/marketing/widgets/blackfridaycounter/presentation/BlackFridayCounterVO$TimerVO;", "getTimer", "()Lru/ozon/app/android/marketing/widgets/blackfridaycounter/presentation/BlackFridayCounterVO$TimerVO;", "Lru/ozon/app/android/marketing/widgets/blackfridaycounter/presentation/BlackFridayCounterVO$FooterVO;", "getFooter", "()Lru/ozon/app/android/marketing/widgets/blackfridaycounter/presentation/BlackFridayCounterVO$FooterVO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "TimerVO", "FooterVO", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class BlackFridayCounterVO implements c {
    private final AtomAction action;

    @NotNull
    private final String backgroundImage;
    private final FooterVO footer;
    private final long id;

    @NotNull
    private final TimerVO timer;

    @NotNull
    private final String titleImage;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0007\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\b\u0010\u001aR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/marketing/widgets/blackfridaycounter/presentation/BlackFridayCounterVO$FooterVO;", "", "", "tintColor", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "showDisclosure", "isHidden", "isPremium", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZZLru/ozon/uni/atoms/af/AtomAction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTintColor", "getTitle", "Z", "getShowDisclosure", "()Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FooterVO {
        public static final int $stable = AtomAction.$stable;
        private final AtomAction action;
        private final boolean isHidden;
        private final boolean isPremium;
        private final boolean showDisclosure;
        private final String tintColor;

        @NotNull
        private final String title;

        public FooterVO(String str, @NotNull String title, boolean z11, boolean z12, boolean z13, AtomAction atomAction) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.tintColor = str;
            this.title = title;
            this.showDisclosure = z11;
            this.isHidden = z12;
            this.isPremium = z13;
            this.action = atomAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FooterVO)) {
                return false;
            }
            FooterVO footerVO = (FooterVO) other;
            return Intrinsics.d(this.tintColor, footerVO.tintColor) && Intrinsics.d(this.title, footerVO.title) && this.showDisclosure == footerVO.showDisclosure && this.isHidden == footerVO.isHidden && this.isPremium == footerVO.isPremium && Intrinsics.d(this.action, footerVO.action);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final boolean getShowDisclosure() {
            return this.showDisclosure;
        }

        public final String getTintColor() {
            return this.tintColor;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.tintColor;
            int a11 = C3532b.a(C3532b.a(C3532b.a(g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.title), 31, this.showDisclosure), 31, this.isHidden), 31, this.isPremium);
            AtomAction atomAction = this.action;
            return a11 + (atomAction != null ? atomAction.hashCode() : 0);
        }

        /* renamed from: isHidden, reason: from getter */
        public final boolean getIsHidden() {
            return this.isHidden;
        }

        /* renamed from: isPremium, reason: from getter */
        public final boolean getIsPremium() {
            return this.isPremium;
        }

        @NotNull
        public String toString() {
            String str = this.tintColor;
            String str2 = this.title;
            boolean z11 = this.showDisclosure;
            boolean z12 = this.isHidden;
            boolean z13 = this.isPremium;
            AtomAction atomAction = this.action;
            StringBuilder d11 = C3660k.d("FooterVO(tintColor=", str, ", title=", str2, ", showDisclosure=");
            f.c(", isHidden=", ", isPremium=", d11, z11, z12);
            d11.append(z13);
            d11.append(", action=");
            d11.append(atomAction);
            d11.append(")");
            return d11.toString();
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u0007\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u001d\u0010\u000eR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u001e\u0010\u000e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/marketing/widgets/blackfridaycounter/presentation/BlackFridayCounterVO$TimerVO;", "", "", "tintColor", "", "timestampEnd", "", "isTimerFinished", SelectionItemFormDTO.TITLE_FIELD_NAME, "titleOnExpire", "backgroundColor", "<init>", "(Ljava/lang/String;JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTintColor", "J", "getTimestampEnd", "()J", "Z", "()Z", "getTitle", "getTitleOnExpire", "getBackgroundColor", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TimerVO {

        @NotNull
        private final String backgroundColor;
        private final boolean isTimerFinished;
        private final long timestampEnd;
        private final String tintColor;

        @NotNull
        private final String title;

        @NotNull
        private final String titleOnExpire;

        public TimerVO(String str, long j11, boolean z11, @NotNull String title, @NotNull String titleOnExpire, @NotNull String backgroundColor) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(titleOnExpire, "titleOnExpire");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            this.tintColor = str;
            this.timestampEnd = j11;
            this.isTimerFinished = z11;
            this.title = title;
            this.titleOnExpire = titleOnExpire;
            this.backgroundColor = backgroundColor;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimerVO)) {
                return false;
            }
            TimerVO timerVO = (TimerVO) other;
            return Intrinsics.d(this.tintColor, timerVO.tintColor) && this.timestampEnd == timerVO.timestampEnd && this.isTimerFinished == timerVO.isTimerFinished && Intrinsics.d(this.title, timerVO.title) && Intrinsics.d(this.titleOnExpire, timerVO.titleOnExpire) && Intrinsics.d(this.backgroundColor, timerVO.backgroundColor);
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final long getTimestampEnd() {
            return this.timestampEnd;
        }

        public final String getTintColor() {
            return this.tintColor;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final String getTitleOnExpire() {
            return this.titleOnExpire;
        }

        public int hashCode() {
            String str = this.tintColor;
            return this.backgroundColor.hashCode() + g.a(g.a(C3532b.a(Pk0.c.a((str == null ? 0 : str.hashCode()) * 31, 31, this.timestampEnd), 31, this.isTimerFinished), 31, this.title), 31, this.titleOnExpire);
        }

        @NotNull
        public String toString() {
            String str = this.tintColor;
            long j11 = this.timestampEnd;
            boolean z11 = this.isTimerFinished;
            String str2 = this.title;
            String str3 = this.titleOnExpire;
            String str4 = this.backgroundColor;
            StringBuilder d11 = C2942q.d(j11, "TimerVO(tintColor=", str, ", timestampEnd=");
            d11.append(", isTimerFinished=");
            d11.append(z11);
            d11.append(", title=");
            d11.append(str2);
            Nh.a.h(d11, ", titleOnExpire=", str3, ", backgroundColor=", str4);
            d11.append(")");
            return d11.toString();
        }
    }

    public BlackFridayCounterVO(long j11, @NotNull String backgroundImage, @NotNull String titleImage, @NotNull TimerVO timer, FooterVO footerVO, AtomAction atomAction, t tVar) {
        Intrinsics.checkNotNullParameter(backgroundImage, "backgroundImage");
        Intrinsics.checkNotNullParameter(titleImage, "titleImage");
        Intrinsics.checkNotNullParameter(timer, "timer");
        this.id = j11;
        this.backgroundImage = backgroundImage;
        this.titleImage = titleImage;
        this.timer = timer;
        this.footer = footerVO;
        this.action = atomAction;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlackFridayCounterVO)) {
            return false;
        }
        BlackFridayCounterVO blackFridayCounterVO = (BlackFridayCounterVO) other;
        return this.id == blackFridayCounterVO.id && Intrinsics.d(this.backgroundImage, blackFridayCounterVO.backgroundImage) && Intrinsics.d(this.titleImage, blackFridayCounterVO.titleImage) && Intrinsics.d(this.timer, blackFridayCounterVO.timer) && Intrinsics.d(this.footer, blackFridayCounterVO.footer) && Intrinsics.d(this.action, blackFridayCounterVO.action) && Intrinsics.d(this.tokenizedEvent, blackFridayCounterVO.tokenizedEvent);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    @NotNull
    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    public final FooterVO getFooter() {
        return this.footer;
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
    public final TimerVO getTimer() {
        return this.timer;
    }

    @NotNull
    public final String getTitleImage() {
        return this.titleImage;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.timer.hashCode() + g.a(g.a(Long.hashCode(this.id) * 31, 31, this.backgroundImage), 31, this.titleImage)) * 31;
        FooterVO footerVO = this.footer;
        int hashCode2 = (hashCode + (footerVO == null ? 0 : footerVO.hashCode())) * 31;
        AtomAction atomAction = this.action;
        int hashCode3 = (hashCode2 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode3 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.backgroundImage;
        String str2 = this.titleImage;
        TimerVO timerVO = this.timer;
        FooterVO footerVO = this.footer;
        AtomAction atomAction = this.action;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = C2436a.c(j11, "BlackFridayCounterVO(id=", ", backgroundImage=", str);
        c11.append(", titleImage=");
        c11.append(str2);
        c11.append(", timer=");
        c11.append(timerVO);
        c11.append(", footer=");
        c11.append(footerVO);
        c11.append(", action=");
        c11.append(atomAction);
        return Lh.a.b(c11, ", tokenizedEvent=", tVar, ")");
    }
}

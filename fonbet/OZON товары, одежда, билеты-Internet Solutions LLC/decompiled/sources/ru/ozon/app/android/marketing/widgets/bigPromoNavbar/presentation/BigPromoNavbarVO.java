package ru.ozon.app.android.marketing.widgets.bigPromoNavbar.presentation;

import Ak.C2436a;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import Nh.a;
import T7.P;
import WZ.t;
import g.C6594f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00013BS\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b#\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b.\u0010/R\u001f\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00100\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lru/ozon/app/android/marketing/widgets/bigPromoNavbar/presentation/BigPromoNavbarVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "backgroundImage", "cornerImage", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/marketing/widgets/bigPromoNavbar/presentation/BigPromoNavbarVO$TimerVO;", DynamicElementDTO.TIMER, "", "hasRoundedCorners", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/app/android/marketing/widgets/bigPromoNavbar/presentation/BigPromoNavbarVO$TimerVO;ZLru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getBackgroundImage", "getCornerImage", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "Lru/ozon/app/android/marketing/widgets/bigPromoNavbar/presentation/BigPromoNavbarVO$TimerVO;", "getTimer", "()Lru/ozon/app/android/marketing/widgets/bigPromoNavbar/presentation/BigPromoNavbarVO$TimerVO;", "Z", "getHasRoundedCorners", "()Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "TimerVO", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class BigPromoNavbarVO implements c {
    private final AtomAction action;
    private final String backgroundImage;

    @NotNull
    private final String cornerImage;
    private final boolean hasRoundedCorners;
    private final long id;

    @NotNull
    private final TimerVO timer;

    @NotNull
    private final OzonSpannableString title;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\b\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u001f\u0010\u000fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b \u0010\u000f¨\u0006!"}, d2 = {"Lru/ozon/app/android/marketing/widgets/bigPromoNavbar/presentation/BigPromoNavbarVO$TimerVO;", "", "", "tintColor", "backgroundColor", "", "timestampEnd", "", "isTimerFinished", SelectionItemFormDTO.TITLE_FIELD_NAME, "titleOnExpire", "icon", "<init>", "(Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTintColor", "getBackgroundColor", "J", "getTimestampEnd", "()J", "Z", "()Z", "getTitle", "getTitleOnExpire", "getIcon", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TimerVO {
        private final String backgroundColor;
        private final String icon;
        private final boolean isTimerFinished;
        private final long timestampEnd;
        private final String tintColor;

        @NotNull
        private final String title;

        @NotNull
        private final String titleOnExpire;

        public TimerVO(String str, String str2, long j11, boolean z11, @NotNull String title, @NotNull String titleOnExpire, String str3) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(titleOnExpire, "titleOnExpire");
            this.tintColor = str;
            this.backgroundColor = str2;
            this.timestampEnd = j11;
            this.isTimerFinished = z11;
            this.title = title;
            this.titleOnExpire = titleOnExpire;
            this.icon = str3;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimerVO)) {
                return false;
            }
            TimerVO timerVO = (TimerVO) other;
            return Intrinsics.d(this.tintColor, timerVO.tintColor) && Intrinsics.d(this.backgroundColor, timerVO.backgroundColor) && this.timestampEnd == timerVO.timestampEnd && this.isTimerFinished == timerVO.isTimerFinished && Intrinsics.d(this.title, timerVO.title) && Intrinsics.d(this.titleOnExpire, timerVO.titleOnExpire) && Intrinsics.d(this.icon, timerVO.icon);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getIcon() {
            return this.icon;
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
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.backgroundColor;
            int a11 = g.a(g.a(C3532b.a(Pk0.c.a((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.timestampEnd), 31, this.isTimerFinished), 31, this.title), 31, this.titleOnExpire);
            String str3 = this.icon;
            return a11 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.tintColor;
            String str2 = this.backgroundColor;
            long j11 = this.timestampEnd;
            boolean z11 = this.isTimerFinished;
            String str3 = this.title;
            String str4 = this.titleOnExpire;
            String str5 = this.icon;
            StringBuilder d11 = C3660k.d("TimerVO(tintColor=", str, ", backgroundColor=", str2, ", timestampEnd=");
            d11.append(j11);
            d11.append(", isTimerFinished=");
            d11.append(z11);
            a.h(d11, ", title=", str3, ", titleOnExpire=", str4);
            return C6594f.a(", icon=", str5, ")", d11);
        }
    }

    public BigPromoNavbarVO(long j11, String str, @NotNull String cornerImage, @NotNull OzonSpannableString title, @NotNull TimerVO timer, boolean z11, AtomAction atomAction, t tVar) {
        Intrinsics.checkNotNullParameter(cornerImage, "cornerImage");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(timer, "timer");
        this.id = j11;
        this.backgroundImage = str;
        this.cornerImage = cornerImage;
        this.title = title;
        this.timer = timer;
        this.hasRoundedCorners = z11;
        this.action = atomAction;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BigPromoNavbarVO)) {
            return false;
        }
        BigPromoNavbarVO bigPromoNavbarVO = (BigPromoNavbarVO) other;
        return this.id == bigPromoNavbarVO.id && Intrinsics.d(this.backgroundImage, bigPromoNavbarVO.backgroundImage) && Intrinsics.d(this.cornerImage, bigPromoNavbarVO.cornerImage) && Intrinsics.d(this.title, bigPromoNavbarVO.title) && Intrinsics.d(this.timer, bigPromoNavbarVO.timer) && this.hasRoundedCorners == bigPromoNavbarVO.hasRoundedCorners && Intrinsics.d(this.action, bigPromoNavbarVO.action) && Intrinsics.d(this.tokenizedEvent, bigPromoNavbarVO.tokenizedEvent);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    @NotNull
    public final String getCornerImage() {
        return this.cornerImage;
    }

    public final boolean getHasRoundedCorners() {
        return this.hasRoundedCorners;
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
    public final OzonSpannableString getTitle() {
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
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.backgroundImage;
        int a11 = C3532b.a((this.timer.hashCode() + P.c(this.title, g.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.cornerImage), 31)) * 31, 31, this.hasRoundedCorners);
        AtomAction atomAction = this.action;
        int hashCode2 = (a11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.backgroundImage;
        String str2 = this.cornerImage;
        OzonSpannableString ozonSpannableString = this.title;
        TimerVO timerVO = this.timer;
        boolean z11 = this.hasRoundedCorners;
        AtomAction atomAction = this.action;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = C2436a.c(j11, "BigPromoNavbarVO(id=", ", backgroundImage=", str);
        c11.append(", cornerImage=");
        c11.append(str2);
        c11.append(", title=");
        c11.append((Object) ozonSpannableString);
        c11.append(", timer=");
        c11.append(timerVO);
        c11.append(", hasRoundedCorners=");
        c11.append(z11);
        Fj.c.e(tVar, ", action=", ", tokenizedEvent=", c11, atomAction);
        c11.append(")");
        return c11.toString();
    }
}

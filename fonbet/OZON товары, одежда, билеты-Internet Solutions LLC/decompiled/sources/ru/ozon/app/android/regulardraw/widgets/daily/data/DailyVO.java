package ru.ozon.app.android.regulardraw.widgets.daily.data;

import Ak.C2436a;
import B6.b;
import E0.C2942q;
import G.g;
import Nh.a;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.regulardraw.ui.button.MorkovskShadowButtonDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001.BI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b!\u0010\u0013R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/daily/data/DailyVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "bannerImage", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "dailyList", "Lru/ozon/app/android/regulardraw/widgets/daily/data/DailyVO$Timer;", DynamicElementDTO.TIMER, "Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;", "button", "LWZ/t;", "tokenizedEvent", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lru/ozon/app/android/regulardraw/widgets/daily/data/DailyVO$Timer;Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getBannerImage", "getTitle", "Ljava/util/List;", "getDailyList", "()Ljava/util/List;", "Lru/ozon/app/android/regulardraw/widgets/daily/data/DailyVO$Timer;", "getTimer", "()Lru/ozon/app/android/regulardraw/widgets/daily/data/DailyVO$Timer;", "Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;", "getButton", "()Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Timer", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DailyVO implements c {

    @NotNull
    private final String bannerImage;

    @NotNull
    private final MorkovskShadowButtonDTO button;

    @NotNull
    private final List<String> dailyList;
    private final long id;
    private final Timer timer;

    @NotNull
    private final String title;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/daily/data/DailyVO$Timer;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "secondsLeft", "timestampEnd", "Lru/ozon/uni/atoms/af/AtomAction;", "onTimerEndAction", "<init>", "(Ljava/lang/String;JJLru/ozon/uni/atoms/af/AtomAction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "J", "getSecondsLeft", "()J", "getTimestampEnd", "Lru/ozon/uni/atoms/af/AtomAction;", "getOnTimerEndAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Timer {

        @NotNull
        private final AtomAction onTimerEndAction;
        private final long secondsLeft;
        private final long timestampEnd;

        @NotNull
        private final String title;

        public Timer(@NotNull String title, long j11, long j12, @NotNull AtomAction onTimerEndAction) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(onTimerEndAction, "onTimerEndAction");
            this.title = title;
            this.secondsLeft = j11;
            this.timestampEnd = j12;
            this.onTimerEndAction = onTimerEndAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Timer)) {
                return false;
            }
            Timer timer = (Timer) other;
            return Intrinsics.d(this.title, timer.title) && this.secondsLeft == timer.secondsLeft && this.timestampEnd == timer.timestampEnd && Intrinsics.d(this.onTimerEndAction, timer.onTimerEndAction);
        }

        @NotNull
        public final AtomAction getOnTimerEndAction() {
            return this.onTimerEndAction;
        }

        public final long getTimestampEnd() {
            return this.timestampEnd;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.onTimerEndAction.hashCode() + Pk0.c.a(Pk0.c.a(this.title.hashCode() * 31, 31, this.secondsLeft), 31, this.timestampEnd);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            long j11 = this.secondsLeft;
            long j12 = this.timestampEnd;
            AtomAction atomAction = this.onTimerEndAction;
            StringBuilder d11 = C2942q.d(j11, "Timer(title=", str, ", secondsLeft=");
            C2942q.f(d11, ", timestampEnd=", j12, ", onTimerEndAction=");
            return b.b(d11, atomAction, ")");
        }
    }

    public DailyVO(long j11, @NotNull String bannerImage, @NotNull String title, @NotNull List<String> dailyList, Timer timer, @NotNull MorkovskShadowButtonDTO button, t tVar) {
        Intrinsics.checkNotNullParameter(bannerImage, "bannerImage");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(dailyList, "dailyList");
        Intrinsics.checkNotNullParameter(button, "button");
        this.id = j11;
        this.bannerImage = bannerImage;
        this.title = title;
        this.dailyList = dailyList;
        this.timer = timer;
        this.button = button;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyVO)) {
            return false;
        }
        DailyVO dailyVO = (DailyVO) other;
        return this.id == dailyVO.id && Intrinsics.d(this.bannerImage, dailyVO.bannerImage) && Intrinsics.d(this.title, dailyVO.title) && Intrinsics.d(this.dailyList, dailyVO.dailyList) && Intrinsics.d(this.timer, dailyVO.timer) && Intrinsics.d(this.button, dailyVO.button) && Intrinsics.d(this.tokenizedEvent, dailyVO.tokenizedEvent);
    }

    @NotNull
    public final String getBannerImage() {
        return this.bannerImage;
    }

    @NotNull
    public final MorkovskShadowButtonDTO getButton() {
        return this.button;
    }

    @NotNull
    public final List<String> getDailyList() {
        return this.dailyList;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final Timer getTimer() {
        return this.timer;
    }

    @NotNull
    public final String getTitle() {
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
        int b11 = g.b(g.a(g.a(Long.hashCode(this.id) * 31, 31, this.bannerImage), 31, this.title), 31, this.dailyList);
        Timer timer = this.timer;
        int hashCode = (this.button.hashCode() + ((b11 + (timer == null ? 0 : timer.hashCode())) * 31)) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.bannerImage;
        String str2 = this.title;
        List<String> list = this.dailyList;
        Timer timer = this.timer;
        MorkovskShadowButtonDTO morkovskShadowButtonDTO = this.button;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = C2436a.c(j11, "DailyVO(id=", ", bannerImage=", str);
        a.g(", title=", str2, ", dailyList=", c11, list);
        c11.append(", timer=");
        c11.append(timer);
        c11.append(", button=");
        c11.append(morkovskShadowButtonDTO);
        return Lh.a.b(c11, ", tokenizedEvent=", tVar, ")");
    }
}

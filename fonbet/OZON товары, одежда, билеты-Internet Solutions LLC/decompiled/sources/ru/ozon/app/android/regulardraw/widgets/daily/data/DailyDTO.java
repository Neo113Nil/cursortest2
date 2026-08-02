package ru.ozon.app.android.regulardraw.widgets.daily.data;

import E0.C2942q;
import G.g;
import Ih.a;
import N3.C3660k;
import Pk0.c;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.regulardraw.ui.button.MorkovskShadowButtonDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001(BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\u0017\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J[\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/daily/data/DailyDTO;", "", "bannerImage", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "dailyList", "", DynamicElementDTO.TIMER, "Lru/ozon/app/android/regulardraw/widgets/daily/data/DailyDTO$Timer;", "button", "Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lru/ozon/app/android/regulardraw/widgets/daily/data/DailyDTO$Timer;Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;Ljava/util/Map;)V", "getBannerImage", "()Ljava/lang/String;", "getTitle", "getDailyList", "()Ljava/util/List;", "getTimer", "()Lru/ozon/app/android/regulardraw/widgets/daily/data/DailyDTO$Timer;", "getButton", "()Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "Timer", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DailyDTO {
    public static final int $stable = 8;

    @NotNull
    private final String bannerImage;

    @NotNull
    private final MorkovskShadowButtonDTO button;

    @NotNull
    private final List<String> dailyList;
    private final Timer timer;

    @NotNull
    private final String title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J?\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/daily/data/DailyDTO$Timer;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "secondsLeft", "", "onTimerEndAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;JLru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getTitle", "()Ljava/lang/String;", "getSecondsLeft", "()J", "getOnTimerEndAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Timer {
        public static final int $stable = 8;

        @NotNull
        private final AtomActionDTO onTimerEndAction;
        private final long secondsLeft;

        @NotNull
        private final String title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public Timer(@NotNull String title, long j11, @NotNull AtomActionDTO onTimerEndAction, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(onTimerEndAction, "onTimerEndAction");
            this.title = title;
            this.secondsLeft = j11;
            this.onTimerEndAction = onTimerEndAction;
            this.trackingInfo = map;
        }

        public static /* synthetic */ Timer copy$default(Timer timer, String str, long j11, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = timer.title;
            }
            if ((i11 & 2) != 0) {
                j11 = timer.secondsLeft;
            }
            if ((i11 & 4) != 0) {
                atomActionDTO = timer.onTimerEndAction;
            }
            if ((i11 & 8) != 0) {
                map = timer.trackingInfo;
            }
            return timer.copy(str, j11, atomActionDTO, map);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final long getSecondsLeft() {
            return this.secondsLeft;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final AtomActionDTO getOnTimerEndAction() {
            return this.onTimerEndAction;
        }

        public final Map<String, TokenizedTrackingInfo> component4() {
            return this.trackingInfo;
        }

        @NotNull
        public final Timer copy(@NotNull String title, long secondsLeft, @NotNull AtomActionDTO onTimerEndAction, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(onTimerEndAction, "onTimerEndAction");
            return new Timer(title, secondsLeft, onTimerEndAction, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Timer)) {
                return false;
            }
            Timer timer = (Timer) other;
            return Intrinsics.d(this.title, timer.title) && this.secondsLeft == timer.secondsLeft && Intrinsics.d(this.onTimerEndAction, timer.onTimerEndAction) && Intrinsics.d(this.trackingInfo, timer.trackingInfo);
        }

        @NotNull
        public final AtomActionDTO getOnTimerEndAction() {
            return this.onTimerEndAction;
        }

        public final long getSecondsLeft() {
            return this.secondsLeft;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int b11 = a.b(this.onTimerEndAction, c.a(this.title.hashCode() * 31, 31, this.secondsLeft), 31);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return b11 + (map == null ? 0 : map.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.title;
            long j11 = this.secondsLeft;
            AtomActionDTO atomActionDTO = this.onTimerEndAction;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder d11 = C2942q.d(j11, "Timer(title=", str, ", secondsLeft=");
            d11.append(", onTimerEndAction=");
            d11.append(atomActionDTO);
            d11.append(", trackingInfo=");
            d11.append(map);
            d11.append(")");
            return d11.toString();
        }
    }

    public DailyDTO(@NotNull String bannerImage, @NotNull String title, @NotNull List<String> dailyList, Timer timer, @NotNull MorkovskShadowButtonDTO button, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(bannerImage, "bannerImage");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(dailyList, "dailyList");
        Intrinsics.checkNotNullParameter(button, "button");
        this.bannerImage = bannerImage;
        this.title = title;
        this.dailyList = dailyList;
        this.timer = timer;
        this.button = button;
        this.trackingInfo = map;
    }

    public static /* synthetic */ DailyDTO copy$default(DailyDTO dailyDTO, String str, String str2, List list, Timer timer, MorkovskShadowButtonDTO morkovskShadowButtonDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = dailyDTO.bannerImage;
        }
        if ((i11 & 2) != 0) {
            str2 = dailyDTO.title;
        }
        if ((i11 & 4) != 0) {
            list = dailyDTO.dailyList;
        }
        if ((i11 & 8) != 0) {
            timer = dailyDTO.timer;
        }
        if ((i11 & 16) != 0) {
            morkovskShadowButtonDTO = dailyDTO.button;
        }
        if ((i11 & 32) != 0) {
            map = dailyDTO.trackingInfo;
        }
        MorkovskShadowButtonDTO morkovskShadowButtonDTO2 = morkovskShadowButtonDTO;
        Map map2 = map;
        return dailyDTO.copy(str, str2, list, timer, morkovskShadowButtonDTO2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBannerImage() {
        return this.bannerImage;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final List<String> component3() {
        return this.dailyList;
    }

    /* renamed from: component4, reason: from getter */
    public final Timer getTimer() {
        return this.timer;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final MorkovskShadowButtonDTO getButton() {
        return this.button;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final DailyDTO copy(@NotNull String bannerImage, @NotNull String title, @NotNull List<String> dailyList, Timer timer, @NotNull MorkovskShadowButtonDTO button, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(bannerImage, "bannerImage");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(dailyList, "dailyList");
        Intrinsics.checkNotNullParameter(button, "button");
        return new DailyDTO(bannerImage, title, dailyList, timer, button, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyDTO)) {
            return false;
        }
        DailyDTO dailyDTO = (DailyDTO) other;
        return Intrinsics.d(this.bannerImage, dailyDTO.bannerImage) && Intrinsics.d(this.title, dailyDTO.title) && Intrinsics.d(this.dailyList, dailyDTO.dailyList) && Intrinsics.d(this.timer, dailyDTO.timer) && Intrinsics.d(this.button, dailyDTO.button) && Intrinsics.d(this.trackingInfo, dailyDTO.trackingInfo);
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

    public final Timer getTimer() {
        return this.timer;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int b11 = g.b(g.a(this.bannerImage.hashCode() * 31, 31, this.title), 31, this.dailyList);
        Timer timer = this.timer;
        int hashCode = (this.button.hashCode() + ((b11 + (timer == null ? 0 : timer.hashCode())) * 31)) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.bannerImage;
        String str2 = this.title;
        List<String> list = this.dailyList;
        Timer timer = this.timer;
        MorkovskShadowButtonDTO morkovskShadowButtonDTO = this.button;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = C3660k.d("DailyDTO(bannerImage=", str, ", title=", str2, ", dailyList=");
        d11.append(list);
        d11.append(", timer=");
        d11.append(timer);
        d11.append(", button=");
        d11.append(morkovskShadowButtonDTO);
        d11.append(", trackingInfo=");
        d11.append(map);
        d11.append(")");
        return d11.toString();
    }
}

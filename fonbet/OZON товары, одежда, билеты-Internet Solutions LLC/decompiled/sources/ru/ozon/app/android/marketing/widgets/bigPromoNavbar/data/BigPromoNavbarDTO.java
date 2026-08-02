package ru.ozon.app.android.marketing.widgets.bigPromoNavbar.data;

import C.o0;
import G.g;
import N3.C3660k;
import Nh.a;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001&BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JW\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006'"}, d2 = {"Lru/ozon/app/android/marketing/widgets/bigPromoNavbar/data/BigPromoNavbarDTO;", "", "backgroundImage", "", "cornerImage", SelectionItemFormDTO.TITLE_FIELD_NAME, DynamicElementDTO.TIMER, "Lru/ozon/app/android/marketing/widgets/bigPromoNavbar/data/BigPromoNavbarDTO$TimerDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/marketing/widgets/bigPromoNavbar/data/BigPromoNavbarDTO$TimerDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getBackgroundImage", "()Ljava/lang/String;", "getCornerImage", "getTitle", "getTimer", "()Lru/ozon/app/android/marketing/widgets/bigPromoNavbar/data/BigPromoNavbarDTO$TimerDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "TimerDTO", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class BigPromoNavbarDTO {
    public static final int $stable = 8;
    private final AtomActionDTO action;
    private final String backgroundImage;

    @NotNull
    private final String cornerImage;

    @NotNull
    private final TimerDTO timer;

    @NotNull
    private final String title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003JU\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\""}, d2 = {"Lru/ozon/app/android/marketing/widgets/bigPromoNavbar/data/BigPromoNavbarDTO$TimerDTO;", "", "tintColor", "", "backgroundColor", "serverTimestamp", "deadlineTimestamp", SelectionItemFormDTO.TITLE_FIELD_NAME, "titleOnExpire", "icon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTintColor", "()Ljava/lang/String;", "getBackgroundColor", "getServerTimestamp", "getDeadlineTimestamp", "getTitle", "getTitleOnExpire", "getIcon", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TimerDTO {
        public static final int $stable = 0;
        private final String backgroundColor;

        @NotNull
        private final String deadlineTimestamp;
        private final String icon;

        @NotNull
        private final String serverTimestamp;
        private final String tintColor;

        @NotNull
        private final String title;

        @NotNull
        private final String titleOnExpire;

        public TimerDTO(String str, String str2, @NotNull String serverTimestamp, @NotNull String deadlineTimestamp, @NotNull String title, @NotNull String titleOnExpire, String str3) {
            Intrinsics.checkNotNullParameter(serverTimestamp, "serverTimestamp");
            Intrinsics.checkNotNullParameter(deadlineTimestamp, "deadlineTimestamp");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(titleOnExpire, "titleOnExpire");
            this.tintColor = str;
            this.backgroundColor = str2;
            this.serverTimestamp = serverTimestamp;
            this.deadlineTimestamp = deadlineTimestamp;
            this.title = title;
            this.titleOnExpire = titleOnExpire;
            this.icon = str3;
        }

        public static /* synthetic */ TimerDTO copy$default(TimerDTO timerDTO, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = timerDTO.tintColor;
            }
            if ((i11 & 2) != 0) {
                str2 = timerDTO.backgroundColor;
            }
            if ((i11 & 4) != 0) {
                str3 = timerDTO.serverTimestamp;
            }
            if ((i11 & 8) != 0) {
                str4 = timerDTO.deadlineTimestamp;
            }
            if ((i11 & 16) != 0) {
                str5 = timerDTO.title;
            }
            if ((i11 & 32) != 0) {
                str6 = timerDTO.titleOnExpire;
            }
            if ((i11 & 64) != 0) {
                str7 = timerDTO.icon;
            }
            String str8 = str6;
            String str9 = str7;
            String str10 = str5;
            String str11 = str3;
            return timerDTO.copy(str, str2, str11, str4, str10, str8, str9);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTintColor() {
            return this.tintColor;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getServerTimestamp() {
            return this.serverTimestamp;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getDeadlineTimestamp() {
            return this.deadlineTimestamp;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final String getTitleOnExpire() {
            return this.titleOnExpire;
        }

        /* renamed from: component7, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        @NotNull
        public final TimerDTO copy(String tintColor, String backgroundColor, @NotNull String serverTimestamp, @NotNull String deadlineTimestamp, @NotNull String title, @NotNull String titleOnExpire, String icon) {
            Intrinsics.checkNotNullParameter(serverTimestamp, "serverTimestamp");
            Intrinsics.checkNotNullParameter(deadlineTimestamp, "deadlineTimestamp");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(titleOnExpire, "titleOnExpire");
            return new TimerDTO(tintColor, backgroundColor, serverTimestamp, deadlineTimestamp, title, titleOnExpire, icon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimerDTO)) {
                return false;
            }
            TimerDTO timerDTO = (TimerDTO) other;
            return Intrinsics.d(this.tintColor, timerDTO.tintColor) && Intrinsics.d(this.backgroundColor, timerDTO.backgroundColor) && Intrinsics.d(this.serverTimestamp, timerDTO.serverTimestamp) && Intrinsics.d(this.deadlineTimestamp, timerDTO.deadlineTimestamp) && Intrinsics.d(this.title, timerDTO.title) && Intrinsics.d(this.titleOnExpire, timerDTO.titleOnExpire) && Intrinsics.d(this.icon, timerDTO.icon);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final String getDeadlineTimestamp() {
            return this.deadlineTimestamp;
        }

        public final String getIcon() {
            return this.icon;
        }

        @NotNull
        public final String getServerTimestamp() {
            return this.serverTimestamp;
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
            int a11 = g.a(g.a(g.a(g.a((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.serverTimestamp), 31, this.deadlineTimestamp), 31, this.title), 31, this.titleOnExpire);
            String str3 = this.icon;
            return a11 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.tintColor;
            String str2 = this.backgroundColor;
            String str3 = this.serverTimestamp;
            String str4 = this.deadlineTimestamp;
            String str5 = this.title;
            String str6 = this.titleOnExpire;
            String str7 = this.icon;
            StringBuilder d11 = C3660k.d("TimerDTO(tintColor=", str, ", backgroundColor=", str2, ", serverTimestamp=");
            a.h(d11, str3, ", deadlineTimestamp=", str4, ", title=");
            a.h(d11, str5, ", titleOnExpire=", str6, ", icon=");
            return o0.c(d11, str7, ")");
        }
    }

    public BigPromoNavbarDTO(String str, @NotNull String cornerImage, @NotNull String title, @NotNull TimerDTO timer, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(cornerImage, "cornerImage");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(timer, "timer");
        this.backgroundImage = str;
        this.cornerImage = cornerImage;
        this.title = title;
        this.timer = timer;
        this.action = atomActionDTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ BigPromoNavbarDTO copy$default(BigPromoNavbarDTO bigPromoNavbarDTO, String str, String str2, String str3, TimerDTO timerDTO, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = bigPromoNavbarDTO.backgroundImage;
        }
        if ((i11 & 2) != 0) {
            str2 = bigPromoNavbarDTO.cornerImage;
        }
        if ((i11 & 4) != 0) {
            str3 = bigPromoNavbarDTO.title;
        }
        if ((i11 & 8) != 0) {
            timerDTO = bigPromoNavbarDTO.timer;
        }
        if ((i11 & 16) != 0) {
            atomActionDTO = bigPromoNavbarDTO.action;
        }
        if ((i11 & 32) != 0) {
            map = bigPromoNavbarDTO.trackingInfo;
        }
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        Map map2 = map;
        return bigPromoNavbarDTO.copy(str, str2, str3, timerDTO, atomActionDTO2, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getCornerImage() {
        return this.cornerImage;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final TimerDTO getTimer() {
        return this.timer;
    }

    /* renamed from: component5, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final BigPromoNavbarDTO copy(String backgroundImage, @NotNull String cornerImage, @NotNull String title, @NotNull TimerDTO timer, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(cornerImage, "cornerImage");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(timer, "timer");
        return new BigPromoNavbarDTO(backgroundImage, cornerImage, title, timer, action, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BigPromoNavbarDTO)) {
            return false;
        }
        BigPromoNavbarDTO bigPromoNavbarDTO = (BigPromoNavbarDTO) other;
        return Intrinsics.d(this.backgroundImage, bigPromoNavbarDTO.backgroundImage) && Intrinsics.d(this.cornerImage, bigPromoNavbarDTO.cornerImage) && Intrinsics.d(this.title, bigPromoNavbarDTO.title) && Intrinsics.d(this.timer, bigPromoNavbarDTO.timer) && Intrinsics.d(this.action, bigPromoNavbarDTO.action) && Intrinsics.d(this.trackingInfo, bigPromoNavbarDTO.trackingInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    @NotNull
    public final String getCornerImage() {
        return this.cornerImage;
    }

    @NotNull
    public final TimerDTO getTimer() {
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
        String str = this.backgroundImage;
        int hashCode = (this.timer.hashCode() + g.a(g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.cornerImage), 31, this.title)) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.backgroundImage;
        String str2 = this.cornerImage;
        String str3 = this.title;
        TimerDTO timerDTO = this.timer;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = C3660k.d("BigPromoNavbarDTO(backgroundImage=", str, ", cornerImage=", str2, ", title=");
        d11.append(str3);
        d11.append(", timer=");
        d11.append(timerDTO);
        d11.append(", action=");
        return D40.a.d(d11, atomActionDTO, ", trackingInfo=", map, ")");
    }
}

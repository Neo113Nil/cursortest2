package ru.ozon.app.android.marketing.widgets.timerWidget.data;

import B0.C2454a;
import K1.G;
import Kk.c;
import T7.Z;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/marketing/widgets/timerWidget/data/TimerWidgetDTO;", "", DynamicElementDTO.TIMER, "Lru/ozon/app/android/marketing/widgets/timerWidget/data/TimerWidgetDTO$TimerDTO;", "options", "Lru/ozon/app/android/marketing/widgets/timerWidget/data/TimerWidgetDTO$PaddingOption;", "<init>", "(Lru/ozon/app/android/marketing/widgets/timerWidget/data/TimerWidgetDTO$TimerDTO;Lru/ozon/app/android/marketing/widgets/timerWidget/data/TimerWidgetDTO$PaddingOption;)V", "getTimer", "()Lru/ozon/app/android/marketing/widgets/timerWidget/data/TimerWidgetDTO$TimerDTO;", "getOptions", "()Lru/ozon/app/android/marketing/widgets/timerWidget/data/TimerWidgetDTO$PaddingOption;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "TimerDTO", "PaddingOption", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TimerWidgetDTO {
    public static final int $stable = 0;
    private final PaddingOption options;

    @NotNull
    private final TimerDTO timer;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ>\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/marketing/widgets/timerWidget/data/TimerWidgetDTO$PaddingOption;", "", "topMargin", "", "leftMargin", "rightMargin", "bottomMargin", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getTopMargin", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLeftMargin", "getRightMargin", "getBottomMargin", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lru/ozon/app/android/marketing/widgets/timerWidget/data/TimerWidgetDTO$PaddingOption;", "equals", "", "other", "hashCode", "toString", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaddingOption {
        public static final int $stable = 0;
        private final Integer bottomMargin;
        private final Integer leftMargin;
        private final Integer rightMargin;
        private final Integer topMargin;

        public PaddingOption(Integer num, Integer num2, Integer num3, Integer num4) {
            this.topMargin = num;
            this.leftMargin = num2;
            this.rightMargin = num3;
            this.bottomMargin = num4;
        }

        public static /* synthetic */ PaddingOption copy$default(PaddingOption paddingOption, Integer num, Integer num2, Integer num3, Integer num4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                num = paddingOption.topMargin;
            }
            if ((i11 & 2) != 0) {
                num2 = paddingOption.leftMargin;
            }
            if ((i11 & 4) != 0) {
                num3 = paddingOption.rightMargin;
            }
            if ((i11 & 8) != 0) {
                num4 = paddingOption.bottomMargin;
            }
            return paddingOption.copy(num, num2, num3, num4);
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getTopMargin() {
            return this.topMargin;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getLeftMargin() {
            return this.leftMargin;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getRightMargin() {
            return this.rightMargin;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getBottomMargin() {
            return this.bottomMargin;
        }

        @NotNull
        public final PaddingOption copy(Integer topMargin, Integer leftMargin, Integer rightMargin, Integer bottomMargin) {
            return new PaddingOption(topMargin, leftMargin, rightMargin, bottomMargin);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaddingOption)) {
                return false;
            }
            PaddingOption paddingOption = (PaddingOption) other;
            return Intrinsics.d(this.topMargin, paddingOption.topMargin) && Intrinsics.d(this.leftMargin, paddingOption.leftMargin) && Intrinsics.d(this.rightMargin, paddingOption.rightMargin) && Intrinsics.d(this.bottomMargin, paddingOption.bottomMargin);
        }

        public final Integer getBottomMargin() {
            return this.bottomMargin;
        }

        public final Integer getLeftMargin() {
            return this.leftMargin;
        }

        public final Integer getRightMargin() {
            return this.rightMargin;
        }

        public final Integer getTopMargin() {
            return this.topMargin;
        }

        public int hashCode() {
            Integer num = this.topMargin;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.leftMargin;
            int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.rightMargin;
            int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.bottomMargin;
            return hashCode3 + (num4 != null ? num4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Integer num = this.topMargin;
            Integer num2 = this.leftMargin;
            return Z.c(c.f("PaddingOption(topMargin=", ", leftMargin=", num, num2, ", rightMargin="), this.rightMargin, ", bottomMargin=", this.bottomMargin, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/marketing/widgets/timerWidget/data/TimerWidgetDTO$TimerDTO;", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "timeLeft", "", "actionOnExpire", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;ILru/ozon/uni/atoms/data/AtomActionDTO;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTimeLeft", "()I", "getActionOnExpire", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TimerDTO {
        public static final int $stable = 0;
        private final AtomActionDTO actionOnExpire;

        @NotNull
        private final TextDTO text;
        private final int timeLeft;

        public TimerDTO(@NotNull TextDTO text, int i11, AtomActionDTO atomActionDTO) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.timeLeft = i11;
            this.actionOnExpire = atomActionDTO;
        }

        public static /* synthetic */ TimerDTO copy$default(TimerDTO timerDTO, TextDTO textDTO, int i11, AtomActionDTO atomActionDTO, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                textDTO = timerDTO.text;
            }
            if ((i12 & 2) != 0) {
                i11 = timerDTO.timeLeft;
            }
            if ((i12 & 4) != 0) {
                atomActionDTO = timerDTO.actionOnExpire;
            }
            return timerDTO.copy(textDTO, i11, atomActionDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final int getTimeLeft() {
            return this.timeLeft;
        }

        /* renamed from: component3, reason: from getter */
        public final AtomActionDTO getActionOnExpire() {
            return this.actionOnExpire;
        }

        @NotNull
        public final TimerDTO copy(@NotNull TextDTO text, int timeLeft, AtomActionDTO actionOnExpire) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new TimerDTO(text, timeLeft, actionOnExpire);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimerDTO)) {
                return false;
            }
            TimerDTO timerDTO = (TimerDTO) other;
            return Intrinsics.d(this.text, timerDTO.text) && this.timeLeft == timerDTO.timeLeft && Intrinsics.d(this.actionOnExpire, timerDTO.actionOnExpire);
        }

        public final AtomActionDTO getActionOnExpire() {
            return this.actionOnExpire;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public final int getTimeLeft() {
            return this.timeLeft;
        }

        public int hashCode() {
            int a11 = C2454a.a(this.timeLeft, this.text.hashCode() * 31, 31);
            AtomActionDTO atomActionDTO = this.actionOnExpire;
            return a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode());
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.text;
            int i11 = this.timeLeft;
            AtomActionDTO atomActionDTO = this.actionOnExpire;
            StringBuilder sb2 = new StringBuilder("TimerDTO(text=");
            sb2.append(textDTO);
            sb2.append(", timeLeft=");
            sb2.append(i11);
            sb2.append(", actionOnExpire=");
            return G.c(sb2, atomActionDTO, ")");
        }
    }

    public TimerWidgetDTO(@NotNull TimerDTO timer, PaddingOption paddingOption) {
        Intrinsics.checkNotNullParameter(timer, "timer");
        this.timer = timer;
        this.options = paddingOption;
    }

    public static /* synthetic */ TimerWidgetDTO copy$default(TimerWidgetDTO timerWidgetDTO, TimerDTO timerDTO, PaddingOption paddingOption, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            timerDTO = timerWidgetDTO.timer;
        }
        if ((i11 & 2) != 0) {
            paddingOption = timerWidgetDTO.options;
        }
        return timerWidgetDTO.copy(timerDTO, paddingOption);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TimerDTO getTimer() {
        return this.timer;
    }

    /* renamed from: component2, reason: from getter */
    public final PaddingOption getOptions() {
        return this.options;
    }

    @NotNull
    public final TimerWidgetDTO copy(@NotNull TimerDTO timer, PaddingOption options) {
        Intrinsics.checkNotNullParameter(timer, "timer");
        return new TimerWidgetDTO(timer, options);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimerWidgetDTO)) {
            return false;
        }
        TimerWidgetDTO timerWidgetDTO = (TimerWidgetDTO) other;
        return Intrinsics.d(this.timer, timerWidgetDTO.timer) && Intrinsics.d(this.options, timerWidgetDTO.options);
    }

    public final PaddingOption getOptions() {
        return this.options;
    }

    @NotNull
    public final TimerDTO getTimer() {
        return this.timer;
    }

    public int hashCode() {
        int hashCode = this.timer.hashCode() * 31;
        PaddingOption paddingOption = this.options;
        return hashCode + (paddingOption == null ? 0 : paddingOption.hashCode());
    }

    @NotNull
    public String toString() {
        return "TimerWidgetDTO(timer=" + this.timer + ", options=" + this.options + ")";
    }
}

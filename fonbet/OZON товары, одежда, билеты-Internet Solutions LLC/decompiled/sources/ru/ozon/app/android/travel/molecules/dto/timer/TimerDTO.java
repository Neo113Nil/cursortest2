package ru.ozon.app.android.travel.molecules.dto.timer;

import B0.C2454a;
import G.g;
import N3.C3660k;
import P4.f;
import Xc.a;
import Xc.b;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.core.UniColors;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001)BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010\"\u001a\u00020\rHÆ\u0003JS\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0007HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/timer/TimerDTO;", "", "textColor", "", "backgroundColor", SelectionItemFormDTO.TITLE_FIELD_NAME, "timeLeft", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "theme", "Lru/ozon/app/android/travel/molecules/dto/timer/TimerDTO$ThemeType;", "startTime", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/travel/molecules/dto/timer/TimerDTO$ThemeType;J)V", "getTextColor", "()Ljava/lang/String;", "getBackgroundColor", "getTitle", "getTimeLeft", "()I", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTheme", "()Lru/ozon/app/android/travel/molecules/dto/timer/TimerDTO$ThemeType;", "getStartTime", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "ThemeType", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TimerDTO {
    private final AtomActionDTO action;

    @NotNull
    private final String backgroundColor;
    private final long startTime;

    @NotNull
    private final String textColor;
    private final ThemeType theme;
    private final int timeLeft;

    @NotNull
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/timer/TimerDTO$ThemeType;", "", "<init>", "(Ljava/lang/String;I)V", "THEME_TYPE_INVALID", "THEME_TYPE_XSMALL", "THEME_TYPE_SMALL", "THEME_TYPE_MEDIUM", "THEME_TYPE_LARGE", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ThemeType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ThemeType[] $VALUES;

        @i(name = "THEME_TYPE_INVALID")
        public static final ThemeType THEME_TYPE_INVALID = new ThemeType("THEME_TYPE_INVALID", 0);

        @i(name = "THEME_TYPE_XSMALL")
        public static final ThemeType THEME_TYPE_XSMALL = new ThemeType("THEME_TYPE_XSMALL", 1);

        @i(name = "THEME_TYPE_SMALL")
        public static final ThemeType THEME_TYPE_SMALL = new ThemeType("THEME_TYPE_SMALL", 2);

        @i(name = "THEME_TYPE_MEDIUM")
        public static final ThemeType THEME_TYPE_MEDIUM = new ThemeType("THEME_TYPE_MEDIUM", 3);

        @i(name = "THEME_TYPE_LARGE")
        public static final ThemeType THEME_TYPE_LARGE = new ThemeType("THEME_TYPE_LARGE", 4);

        private static final /* synthetic */ ThemeType[] $values() {
            return new ThemeType[]{THEME_TYPE_INVALID, THEME_TYPE_XSMALL, THEME_TYPE_SMALL, THEME_TYPE_MEDIUM, THEME_TYPE_LARGE};
        }

        static {
            ThemeType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ThemeType(String str, int i11) {
        }

        public static ThemeType valueOf(String str) {
            return (ThemeType) Enum.valueOf(ThemeType.class, str);
        }

        public static ThemeType[] values() {
            return (ThemeType[]) $VALUES.clone();
        }
    }

    public TimerDTO(@NotNull String textColor, @NotNull String backgroundColor, @NotNull String title, int i11, AtomActionDTO atomActionDTO, ThemeType themeType, long j11) {
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(title, "title");
        this.textColor = textColor;
        this.backgroundColor = backgroundColor;
        this.title = title;
        this.timeLeft = i11;
        this.action = atomActionDTO;
        this.theme = themeType;
        this.startTime = j11;
    }

    public static /* synthetic */ TimerDTO copy$default(TimerDTO timerDTO, String str, String str2, String str3, int i11, AtomActionDTO atomActionDTO, ThemeType themeType, long j11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = timerDTO.textColor;
        }
        if ((i12 & 2) != 0) {
            str2 = timerDTO.backgroundColor;
        }
        if ((i12 & 4) != 0) {
            str3 = timerDTO.title;
        }
        if ((i12 & 8) != 0) {
            i11 = timerDTO.timeLeft;
        }
        if ((i12 & 16) != 0) {
            atomActionDTO = timerDTO.action;
        }
        if ((i12 & 32) != 0) {
            themeType = timerDTO.theme;
        }
        if ((i12 & 64) != 0) {
            j11 = timerDTO.startTime;
        }
        long j12 = j11;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        ThemeType themeType2 = themeType;
        return timerDTO.copy(str, str2, str3, i11, atomActionDTO2, themeType2, j12);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final int getTimeLeft() {
        return this.timeLeft;
    }

    /* renamed from: component5, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component6, reason: from getter */
    public final ThemeType getTheme() {
        return this.theme;
    }

    /* renamed from: component7, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    @NotNull
    public final TimerDTO copy(@NotNull String textColor, @NotNull String backgroundColor, @NotNull String title, int timeLeft, AtomActionDTO action, ThemeType theme, long startTime) {
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(title, "title");
        return new TimerDTO(textColor, backgroundColor, title, timeLeft, action, theme, startTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimerDTO)) {
            return false;
        }
        TimerDTO timerDTO = (TimerDTO) other;
        return Intrinsics.d(this.textColor, timerDTO.textColor) && Intrinsics.d(this.backgroundColor, timerDTO.backgroundColor) && Intrinsics.d(this.title, timerDTO.title) && this.timeLeft == timerDTO.timeLeft && Intrinsics.d(this.action, timerDTO.action) && this.theme == timerDTO.theme && this.startTime == timerDTO.startTime;
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    @NotNull
    public final String getTextColor() {
        return this.textColor;
    }

    public final ThemeType getTheme() {
        return this.theme;
    }

    public final int getTimeLeft() {
        return this.timeLeft;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int a11 = C2454a.a(this.timeLeft, g.a(g.a(this.textColor.hashCode() * 31, 31, this.backgroundColor), 31, this.title), 31);
        AtomActionDTO atomActionDTO = this.action;
        int hashCode = (a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        ThemeType themeType = this.theme;
        return Long.hashCode(this.startTime) + ((hashCode + (themeType != null ? themeType.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.textColor;
        String str2 = this.backgroundColor;
        String str3 = this.title;
        int i11 = this.timeLeft;
        AtomActionDTO atomActionDTO = this.action;
        ThemeType themeType = this.theme;
        long j11 = this.startTime;
        StringBuilder d11 = C3660k.d("TimerDTO(textColor=", str, ", backgroundColor=", str2, ", title=");
        Pk0.g.d(i11, str3, ", timeLeft=", ", action=", d11);
        d11.append(atomActionDTO);
        d11.append(", theme=");
        d11.append(themeType);
        d11.append(", startTime=");
        return f.a(j11, ")", d11);
    }

    public /* synthetic */ TimerDTO(String str, String str2, String str3, int i11, AtomActionDTO atomActionDTO, ThemeType themeType, long j11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? UniColors.BG_LIGHT_KEY.getToken() : str, (i12 & 2) != 0 ? UniColors.BG_ACCENT_PRIMARY.getToken() : str2, str3, (i12 & 8) != 0 ? -1 : i11, atomActionDTO, themeType, (i12 & 64) != 0 ? System.currentTimeMillis() : j11);
    }
}

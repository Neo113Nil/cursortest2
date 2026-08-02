package ru.ozon.app.android.session.logout.data;

import Xc.a;
import Xc.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/session/logout/data/LogoutDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "alignment", "Lru/ozon/app/android/session/logout/data/LogoutDTO$Alignment;", "textColor", "showSeparator", "", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/session/logout/data/LogoutDTO$Alignment;Ljava/lang/String;Z)V", "getTitle", "()Ljava/lang/String;", "getAlignment", "()Lru/ozon/app/android/session/logout/data/LogoutDTO$Alignment;", "getTextColor", "getShowSeparator", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "Alignment", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class LogoutDTO {
    public static final int $stable = 0;

    @NotNull
    private final Alignment alignment;
    private final boolean showSeparator;
    private final String textColor;

    @NotNull
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/session/logout/data/LogoutDTO$Alignment;", "", "<init>", "(Ljava/lang/String;I)V", "CENTER", "LEFT", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = false)
    public static final class Alignment {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Alignment[] $VALUES;
        public static final Alignment CENTER = new Alignment("CENTER", 0);
        public static final Alignment LEFT = new Alignment("LEFT", 1);

        private static final /* synthetic */ Alignment[] $values() {
            return new Alignment[]{CENTER, LEFT};
        }

        static {
            Alignment[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Alignment(String str, int i11) {
        }

        @NotNull
        public static a<Alignment> getEntries() {
            return $ENTRIES;
        }

        public static Alignment valueOf(String str) {
            return (Alignment) Enum.valueOf(Alignment.class, str);
        }

        public static Alignment[] values() {
            return (Alignment[]) $VALUES.clone();
        }
    }

    public LogoutDTO(@NotNull String title, @NotNull Alignment alignment, String str, boolean z11) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        this.title = title;
        this.alignment = alignment;
        this.textColor = str;
        this.showSeparator = z11;
    }

    public static /* synthetic */ LogoutDTO copy$default(LogoutDTO logoutDTO, String str, Alignment alignment, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = logoutDTO.title;
        }
        if ((i11 & 2) != 0) {
            alignment = logoutDTO.alignment;
        }
        if ((i11 & 4) != 0) {
            str2 = logoutDTO.textColor;
        }
        if ((i11 & 8) != 0) {
            z11 = logoutDTO.showSeparator;
        }
        return logoutDTO.copy(str, alignment, str2, z11);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Alignment getAlignment() {
        return this.alignment;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowSeparator() {
        return this.showSeparator;
    }

    @NotNull
    public final LogoutDTO copy(@NotNull String title, @NotNull Alignment alignment, String textColor, boolean showSeparator) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        return new LogoutDTO(title, alignment, textColor, showSeparator);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogoutDTO)) {
            return false;
        }
        LogoutDTO logoutDTO = (LogoutDTO) other;
        return Intrinsics.d(this.title, logoutDTO.title) && this.alignment == logoutDTO.alignment && Intrinsics.d(this.textColor, logoutDTO.textColor) && this.showSeparator == logoutDTO.showSeparator;
    }

    @NotNull
    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final boolean getShowSeparator() {
        return this.showSeparator;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = (this.alignment.hashCode() + (this.title.hashCode() * 31)) * 31;
        String str = this.textColor;
        return Boolean.hashCode(this.showSeparator) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        return "LogoutDTO(title=" + this.title + ", alignment=" + this.alignment + ", textColor=" + this.textColor + ", showSeparator=" + this.showSeparator + ")";
    }

    public /* synthetic */ LogoutDTO(String str, Alignment alignment, String str2, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? Alignment.CENTER : alignment, str2, (i11 & 8) != 0 ? false : z11);
    }
}

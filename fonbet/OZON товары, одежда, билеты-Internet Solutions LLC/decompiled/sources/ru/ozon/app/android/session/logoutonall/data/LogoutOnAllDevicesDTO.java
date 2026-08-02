package ru.ozon.app.android.session.logoutonall.data;

import G.g;
import Kk.C3532b;
import N3.C3660k;
import V.e;
import Xc.a;
import Xc.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002$%B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JG\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lru/ozon/app/android/session/logoutonall/data/LogoutOnAllDevicesDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "action", "alignment", "Lru/ozon/app/android/session/logoutonall/data/LogoutOnAllDevicesDTO$Alignment;", "showSeparator", "", "textColor", "confirmation", "Lru/ozon/app/android/session/logoutonall/data/LogoutOnAllDevicesDTO$Confirmation;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/session/logoutonall/data/LogoutOnAllDevicesDTO$Alignment;ZLjava/lang/String;Lru/ozon/app/android/session/logoutonall/data/LogoutOnAllDevicesDTO$Confirmation;)V", "getTitle", "()Ljava/lang/String;", "getAction", "getAlignment", "()Lru/ozon/app/android/session/logoutonall/data/LogoutOnAllDevicesDTO$Alignment;", "getShowSeparator", "()Z", "getTextColor", "getConfirmation", "()Lru/ozon/app/android/session/logoutonall/data/LogoutOnAllDevicesDTO$Confirmation;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "Confirmation", "Alignment", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class LogoutOnAllDevicesDTO {
    public static final int $stable = 0;

    @NotNull
    private final String action;

    @NotNull
    private final Alignment alignment;

    @NotNull
    private final Confirmation confirmation;
    private final boolean showSeparator;
    private final String textColor;

    @NotNull
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/session/logoutonall/data/LogoutOnAllDevicesDTO$Alignment;", "", "<init>", "(Ljava/lang/String;I)V", "CENTER", "LEFT", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/session/logoutonall/data/LogoutOnAllDevicesDTO$Confirmation;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Confirmation {
        public static final int $stable = 0;

        @NotNull
        private final String description;

        @NotNull
        private final String title;

        public Confirmation(@NotNull String title, @NotNull String description) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            this.title = title;
            this.description = description;
        }

        public static /* synthetic */ Confirmation copy$default(Confirmation confirmation, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = confirmation.title;
            }
            if ((i11 & 2) != 0) {
                str2 = confirmation.description;
            }
            return confirmation.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @NotNull
        public final Confirmation copy(@NotNull String title, @NotNull String description) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            return new Confirmation(title, description);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Confirmation)) {
                return false;
            }
            Confirmation confirmation = (Confirmation) other;
            return Intrinsics.d(this.title, confirmation.title) && Intrinsics.d(this.description, confirmation.description);
        }

        @NotNull
        public final String getDescription() {
            return this.description;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.description.hashCode() + (this.title.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("Confirmation(title=", this.title, ", description=", this.description, ")");
        }
    }

    public LogoutOnAllDevicesDTO(@NotNull String title, @NotNull String action, @NotNull Alignment alignment, boolean z11, String str, @NotNull Confirmation confirmation) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(confirmation, "confirmation");
        this.title = title;
        this.action = action;
        this.alignment = alignment;
        this.showSeparator = z11;
        this.textColor = str;
        this.confirmation = confirmation;
    }

    public static /* synthetic */ LogoutOnAllDevicesDTO copy$default(LogoutOnAllDevicesDTO logoutOnAllDevicesDTO, String str, String str2, Alignment alignment, boolean z11, String str3, Confirmation confirmation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = logoutOnAllDevicesDTO.title;
        }
        if ((i11 & 2) != 0) {
            str2 = logoutOnAllDevicesDTO.action;
        }
        if ((i11 & 4) != 0) {
            alignment = logoutOnAllDevicesDTO.alignment;
        }
        if ((i11 & 8) != 0) {
            z11 = logoutOnAllDevicesDTO.showSeparator;
        }
        if ((i11 & 16) != 0) {
            str3 = logoutOnAllDevicesDTO.textColor;
        }
        if ((i11 & 32) != 0) {
            confirmation = logoutOnAllDevicesDTO.confirmation;
        }
        String str4 = str3;
        Confirmation confirmation2 = confirmation;
        return logoutOnAllDevicesDTO.copy(str, str2, alignment, z11, str4, confirmation2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Alignment getAlignment() {
        return this.alignment;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowSeparator() {
        return this.showSeparator;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final Confirmation getConfirmation() {
        return this.confirmation;
    }

    @NotNull
    public final LogoutOnAllDevicesDTO copy(@NotNull String title, @NotNull String action, @NotNull Alignment alignment, boolean showSeparator, String textColor, @NotNull Confirmation confirmation) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(confirmation, "confirmation");
        return new LogoutOnAllDevicesDTO(title, action, alignment, showSeparator, textColor, confirmation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogoutOnAllDevicesDTO)) {
            return false;
        }
        LogoutOnAllDevicesDTO logoutOnAllDevicesDTO = (LogoutOnAllDevicesDTO) other;
        return Intrinsics.d(this.title, logoutOnAllDevicesDTO.title) && Intrinsics.d(this.action, logoutOnAllDevicesDTO.action) && this.alignment == logoutOnAllDevicesDTO.alignment && this.showSeparator == logoutOnAllDevicesDTO.showSeparator && Intrinsics.d(this.textColor, logoutOnAllDevicesDTO.textColor) && Intrinsics.d(this.confirmation, logoutOnAllDevicesDTO.confirmation);
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }

    @NotNull
    public final Alignment getAlignment() {
        return this.alignment;
    }

    @NotNull
    public final Confirmation getConfirmation() {
        return this.confirmation;
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
        int a11 = C3532b.a((this.alignment.hashCode() + g.a(this.title.hashCode() * 31, 31, this.action)) * 31, 31, this.showSeparator);
        String str = this.textColor;
        return this.confirmation.hashCode() + ((a11 + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.action;
        Alignment alignment = this.alignment;
        boolean z11 = this.showSeparator;
        String str3 = this.textColor;
        Confirmation confirmation = this.confirmation;
        StringBuilder d11 = C3660k.d("LogoutOnAllDevicesDTO(title=", str, ", action=", str2, ", alignment=");
        d11.append(alignment);
        d11.append(", showSeparator=");
        d11.append(z11);
        d11.append(", textColor=");
        d11.append(str3);
        d11.append(", confirmation=");
        d11.append(confirmation);
        d11.append(")");
        return d11.toString();
    }

    public /* synthetic */ LogoutOnAllDevicesDTO(String str, String str2, Alignment alignment, boolean z11, String str3, Confirmation confirmation, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? Alignment.CENTER : alignment, (i11 & 8) != 0 ? false : z11, str3, confirmation);
    }
}

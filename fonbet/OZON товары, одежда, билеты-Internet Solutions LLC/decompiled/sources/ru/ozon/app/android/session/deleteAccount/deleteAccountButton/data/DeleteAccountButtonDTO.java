package ru.ozon.app.android.session.deleteAccount.deleteAccountButton.data;

import G.g;
import Xc.a;
import Xc.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003J?\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountButton/data/DeleteAccountButtonDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "action", "", "alignment", "Lru/ozon/app/android/session/deleteAccount/deleteAccountButton/data/DeleteAccountButtonDTO$Alignment;", "textColor", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/app/android/session/deleteAccount/deleteAccountButton/data/DeleteAccountButtonDTO$Alignment;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/Icon;)V", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getAction", "()Ljava/lang/String;", "getAlignment", "()Lru/ozon/app/android/session/deleteAccount/deleteAccountButton/data/DeleteAccountButtonDTO$Alignment;", "getTextColor", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Alignment", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DeleteAccountButtonDTO {
    public static final int $stable = Icon.$stable | OzonSpannableString.$stable;

    @NotNull
    private final String action;

    @NotNull
    private final Alignment alignment;
    private final Icon icon;
    private final String textColor;

    @NotNull
    private final OzonSpannableString title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountButton/data/DeleteAccountButtonDTO$Alignment;", "", "<init>", "(Ljava/lang/String;I)V", "CENTER", "LEFT", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    public DeleteAccountButtonDTO(@NotNull OzonSpannableString title, @NotNull String action, @NotNull Alignment alignment, String str, Icon icon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        this.title = title;
        this.action = action;
        this.alignment = alignment;
        this.textColor = str;
        this.icon = icon;
    }

    public static /* synthetic */ DeleteAccountButtonDTO copy$default(DeleteAccountButtonDTO deleteAccountButtonDTO, OzonSpannableString ozonSpannableString, String str, Alignment alignment, String str2, Icon icon, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            ozonSpannableString = deleteAccountButtonDTO.title;
        }
        if ((i11 & 2) != 0) {
            str = deleteAccountButtonDTO.action;
        }
        if ((i11 & 4) != 0) {
            alignment = deleteAccountButtonDTO.alignment;
        }
        if ((i11 & 8) != 0) {
            str2 = deleteAccountButtonDTO.textColor;
        }
        if ((i11 & 16) != 0) {
            icon = deleteAccountButtonDTO.icon;
        }
        Icon icon2 = icon;
        Alignment alignment2 = alignment;
        return deleteAccountButtonDTO.copy(ozonSpannableString, str, alignment2, str2, icon2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final OzonSpannableString getTitle() {
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
    public final String getTextColor() {
        return this.textColor;
    }

    /* renamed from: component5, reason: from getter */
    public final Icon getIcon() {
        return this.icon;
    }

    @NotNull
    public final DeleteAccountButtonDTO copy(@NotNull OzonSpannableString title, @NotNull String action, @NotNull Alignment alignment, String textColor, Icon icon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        return new DeleteAccountButtonDTO(title, action, alignment, textColor, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeleteAccountButtonDTO)) {
            return false;
        }
        DeleteAccountButtonDTO deleteAccountButtonDTO = (DeleteAccountButtonDTO) other;
        return Intrinsics.d(this.title, deleteAccountButtonDTO.title) && Intrinsics.d(this.action, deleteAccountButtonDTO.action) && this.alignment == deleteAccountButtonDTO.alignment && Intrinsics.d(this.textColor, deleteAccountButtonDTO.textColor) && Intrinsics.d(this.icon, deleteAccountButtonDTO.icon);
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }

    @NotNull
    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    @NotNull
    public final OzonSpannableString getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = (this.alignment.hashCode() + g.a(this.title.hashCode() * 31, 31, this.action)) * 31;
        String str = this.textColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Icon icon = this.icon;
        return hashCode2 + (icon != null ? icon.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        OzonSpannableString ozonSpannableString = this.title;
        String str = this.action;
        Alignment alignment = this.alignment;
        String str2 = this.textColor;
        Icon icon = this.icon;
        StringBuilder f7 = GR.b.f("DeleteAccountButtonDTO(title=", ozonSpannableString, ", action=", str, ", alignment=");
        f7.append(alignment);
        f7.append(", textColor=");
        f7.append(str2);
        f7.append(", icon=");
        f7.append(icon);
        f7.append(")");
        return f7.toString();
    }

    public /* synthetic */ DeleteAccountButtonDTO(OzonSpannableString ozonSpannableString, String str, Alignment alignment, String str2, Icon icon, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(ozonSpannableString, str, (i11 & 4) != 0 ? Alignment.CENTER : alignment, str2, icon);
    }
}

package ru.ozon.app.android.session.flashcall.data;

import K1.G;
import Xc.a;
import Xc.b;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0004)*+,BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\rHÆ\u0003JO\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006-"}, d2 = {"Lru/ozon/app/android/session/flashcall/data/RequestPhoneAccessWidgetDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/session/flashcall/data/RequestPhoneAccessWidgetDTO$TitleDTO;", "subtitle", "Lru/ozon/app/android/session/flashcall/data/RequestPhoneAccessWidgetDTO$SubtitleDTO;", "permissions", "", "Lru/ozon/app/android/session/flashcall/data/RequestPhoneAccessWidgetDTO$PermissionDTO;", "allowButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "disallowButton", "help", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "<init>", "(Lru/ozon/app/android/session/flashcall/data/RequestPhoneAccessWidgetDTO$TitleDTO;Lru/ozon/app/android/session/flashcall/data/RequestPhoneAccessWidgetDTO$SubtitleDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getTitle", "()Lru/ozon/app/android/session/flashcall/data/RequestPhoneAccessWidgetDTO$TitleDTO;", "getSubtitle", "()Lru/ozon/app/android/session/flashcall/data/RequestPhoneAccessWidgetDTO$SubtitleDTO;", "getPermissions", "()Ljava/util/List;", "getAllowButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getDisallowButton", "getHelp", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "TitleDTO", "SubtitleDTO", "PermissionDTO", "AlignmentDTO", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RequestPhoneAccessWidgetDTO {
    public static final int $stable = 8;

    @NotNull
    private final ButtonV3Atom.LargeButton allowButton;

    @NotNull
    private final ButtonV3Atom.LargeButton disallowButton;

    @NotNull
    private final TextAtom help;
    private final List<PermissionDTO> permissions;
    private final SubtitleDTO subtitle;

    @NotNull
    private final TitleDTO title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/session/flashcall/data/RequestPhoneAccessWidgetDTO$AlignmentDTO;", "", "<init>", "(Ljava/lang/String;I)V", "ALIGNMENT_LEFT", "ALIGNMENT_CENTER", "ALIGNMENT_RIGHT", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AlignmentDTO {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ AlignmentDTO[] $VALUES;

        @i(name = "ALIGNMENT_LEFT")
        public static final AlignmentDTO ALIGNMENT_LEFT = new AlignmentDTO("ALIGNMENT_LEFT", 0);

        @i(name = "ALIGNMENT_CENTER")
        public static final AlignmentDTO ALIGNMENT_CENTER = new AlignmentDTO("ALIGNMENT_CENTER", 1);

        @i(name = "ALIGNMENT_RIGHT")
        public static final AlignmentDTO ALIGNMENT_RIGHT = new AlignmentDTO("ALIGNMENT_RIGHT", 2);

        private static final /* synthetic */ AlignmentDTO[] $values() {
            return new AlignmentDTO[]{ALIGNMENT_LEFT, ALIGNMENT_CENTER, ALIGNMENT_RIGHT};
        }

        static {
            AlignmentDTO[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private AlignmentDTO(String str, int i11) {
        }

        public static AlignmentDTO valueOf(String str) {
            return (AlignmentDTO) Enum.valueOf(AlignmentDTO.class, str);
        }

        public static AlignmentDTO[] values() {
            return (AlignmentDTO[]) $VALUES.clone();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/session/flashcall/data/RequestPhoneAccessWidgetDTO$PermissionDTO;", "", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", "text", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "<init>", "(Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PermissionDTO {
        public static final int $stable = TextAtom.$stable | Icon.$stable;

        @NotNull
        private final Icon icon;

        @NotNull
        private final TextAtom text;

        public PermissionDTO(@NotNull Icon icon, @NotNull TextAtom text) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(text, "text");
            this.icon = icon;
            this.text = text;
        }

        public static /* synthetic */ PermissionDTO copy$default(PermissionDTO permissionDTO, Icon icon, TextAtom textAtom, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                icon = permissionDTO.icon;
            }
            if ((i11 & 2) != 0) {
                textAtom = permissionDTO.text;
            }
            return permissionDTO.copy(icon, textAtom);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Icon getIcon() {
            return this.icon;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getText() {
            return this.text;
        }

        @NotNull
        public final PermissionDTO copy(@NotNull Icon icon, @NotNull TextAtom text) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(text, "text");
            return new PermissionDTO(icon, text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PermissionDTO)) {
                return false;
            }
            PermissionDTO permissionDTO = (PermissionDTO) other;
            return Intrinsics.d(this.icon, permissionDTO.icon) && Intrinsics.d(this.text, permissionDTO.text);
        }

        @NotNull
        public final Icon getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextAtom getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode() + (this.icon.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "PermissionDTO(icon=" + this.icon + ", text=" + this.text + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/session/flashcall/data/RequestPhoneAccessWidgetDTO$SubtitleDTO;", "", "text", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SubtitleDTO {
        public static final int $stable = Icon.$stable | TextAtom.$stable;
        private final AtomActionDTO action;

        @NotNull
        private final Icon icon;

        @NotNull
        private final TextAtom text;

        public SubtitleDTO(@NotNull TextAtom text, @NotNull Icon icon, AtomActionDTO atomActionDTO) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.text = text;
            this.icon = icon;
            this.action = atomActionDTO;
        }

        public static /* synthetic */ SubtitleDTO copy$default(SubtitleDTO subtitleDTO, TextAtom textAtom, Icon icon, AtomActionDTO atomActionDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = subtitleDTO.text;
            }
            if ((i11 & 2) != 0) {
                icon = subtitleDTO.icon;
            }
            if ((i11 & 4) != 0) {
                atomActionDTO = subtitleDTO.action;
            }
            return subtitleDTO.copy(textAtom, icon, atomActionDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Icon getIcon() {
            return this.icon;
        }

        /* renamed from: component3, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final SubtitleDTO copy(@NotNull TextAtom text, @NotNull Icon icon, AtomActionDTO action) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new SubtitleDTO(text, icon, action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SubtitleDTO)) {
                return false;
            }
            SubtitleDTO subtitleDTO = (SubtitleDTO) other;
            return Intrinsics.d(this.text, subtitleDTO.text) && Intrinsics.d(this.icon, subtitleDTO.icon) && Intrinsics.d(this.action, subtitleDTO.action);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final Icon getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextAtom getText() {
            return this.text;
        }

        public int hashCode() {
            int a11 = Lc.a.a(this.icon, this.text.hashCode() * 31, 31);
            AtomActionDTO atomActionDTO = this.action;
            return a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode());
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.text;
            Icon icon = this.icon;
            AtomActionDTO atomActionDTO = this.action;
            StringBuilder sb2 = new StringBuilder("SubtitleDTO(text=");
            sb2.append(textAtom);
            sb2.append(", icon=");
            sb2.append(icon);
            sb2.append(", action=");
            return G.c(sb2, atomActionDTO, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/session/flashcall/data/RequestPhoneAccessWidgetDTO$TitleDTO;", "", "text", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "alignment", "Lru/ozon/app/android/session/flashcall/data/RequestPhoneAccessWidgetDTO$AlignmentDTO;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/session/flashcall/data/RequestPhoneAccessWidgetDTO$AlignmentDTO;)V", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getAlignment", "()Lru/ozon/app/android/session/flashcall/data/RequestPhoneAccessWidgetDTO$AlignmentDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TitleDTO {
        public static final int $stable = TextAtom.$stable;

        @NotNull
        private final AlignmentDTO alignment;

        @NotNull
        private final TextAtom text;

        public TitleDTO(@NotNull TextAtom text, @NotNull AlignmentDTO alignment) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(alignment, "alignment");
            this.text = text;
            this.alignment = alignment;
        }

        public static /* synthetic */ TitleDTO copy$default(TitleDTO titleDTO, TextAtom textAtom, AlignmentDTO alignmentDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = titleDTO.text;
            }
            if ((i11 & 2) != 0) {
                alignmentDTO = titleDTO.alignment;
            }
            return titleDTO.copy(textAtom, alignmentDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AlignmentDTO getAlignment() {
            return this.alignment;
        }

        @NotNull
        public final TitleDTO copy(@NotNull TextAtom text, @NotNull AlignmentDTO alignment) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(alignment, "alignment");
            return new TitleDTO(text, alignment);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TitleDTO)) {
                return false;
            }
            TitleDTO titleDTO = (TitleDTO) other;
            return Intrinsics.d(this.text, titleDTO.text) && this.alignment == titleDTO.alignment;
        }

        @NotNull
        public final AlignmentDTO getAlignment() {
            return this.alignment;
        }

        @NotNull
        public final TextAtom getText() {
            return this.text;
        }

        public int hashCode() {
            return this.alignment.hashCode() + (this.text.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "TitleDTO(text=" + this.text + ", alignment=" + this.alignment + ")";
        }
    }

    public RequestPhoneAccessWidgetDTO(@NotNull TitleDTO title, SubtitleDTO subtitleDTO, List<PermissionDTO> list, @NotNull ButtonV3Atom.LargeButton allowButton, @NotNull ButtonV3Atom.LargeButton disallowButton, @NotNull TextAtom help) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(allowButton, "allowButton");
        Intrinsics.checkNotNullParameter(disallowButton, "disallowButton");
        Intrinsics.checkNotNullParameter(help, "help");
        this.title = title;
        this.subtitle = subtitleDTO;
        this.permissions = list;
        this.allowButton = allowButton;
        this.disallowButton = disallowButton;
        this.help = help;
    }

    public static /* synthetic */ RequestPhoneAccessWidgetDTO copy$default(RequestPhoneAccessWidgetDTO requestPhoneAccessWidgetDTO, TitleDTO titleDTO, SubtitleDTO subtitleDTO, List list, ButtonV3Atom.LargeButton largeButton, ButtonV3Atom.LargeButton largeButton2, TextAtom textAtom, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            titleDTO = requestPhoneAccessWidgetDTO.title;
        }
        if ((i11 & 2) != 0) {
            subtitleDTO = requestPhoneAccessWidgetDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            list = requestPhoneAccessWidgetDTO.permissions;
        }
        if ((i11 & 8) != 0) {
            largeButton = requestPhoneAccessWidgetDTO.allowButton;
        }
        if ((i11 & 16) != 0) {
            largeButton2 = requestPhoneAccessWidgetDTO.disallowButton;
        }
        if ((i11 & 32) != 0) {
            textAtom = requestPhoneAccessWidgetDTO.help;
        }
        ButtonV3Atom.LargeButton largeButton3 = largeButton2;
        TextAtom textAtom2 = textAtom;
        return requestPhoneAccessWidgetDTO.copy(titleDTO, subtitleDTO, list, largeButton, largeButton3, textAtom2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TitleDTO getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final SubtitleDTO getSubtitle() {
        return this.subtitle;
    }

    public final List<PermissionDTO> component3() {
        return this.permissions;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ButtonV3Atom.LargeButton getAllowButton() {
        return this.allowButton;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final ButtonV3Atom.LargeButton getDisallowButton() {
        return this.disallowButton;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final TextAtom getHelp() {
        return this.help;
    }

    @NotNull
    public final RequestPhoneAccessWidgetDTO copy(@NotNull TitleDTO title, SubtitleDTO subtitle, List<PermissionDTO> permissions, @NotNull ButtonV3Atom.LargeButton allowButton, @NotNull ButtonV3Atom.LargeButton disallowButton, @NotNull TextAtom help) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(allowButton, "allowButton");
        Intrinsics.checkNotNullParameter(disallowButton, "disallowButton");
        Intrinsics.checkNotNullParameter(help, "help");
        return new RequestPhoneAccessWidgetDTO(title, subtitle, permissions, allowButton, disallowButton, help);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestPhoneAccessWidgetDTO)) {
            return false;
        }
        RequestPhoneAccessWidgetDTO requestPhoneAccessWidgetDTO = (RequestPhoneAccessWidgetDTO) other;
        return Intrinsics.d(this.title, requestPhoneAccessWidgetDTO.title) && Intrinsics.d(this.subtitle, requestPhoneAccessWidgetDTO.subtitle) && Intrinsics.d(this.permissions, requestPhoneAccessWidgetDTO.permissions) && Intrinsics.d(this.allowButton, requestPhoneAccessWidgetDTO.allowButton) && Intrinsics.d(this.disallowButton, requestPhoneAccessWidgetDTO.disallowButton) && Intrinsics.d(this.help, requestPhoneAccessWidgetDTO.help);
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getAllowButton() {
        return this.allowButton;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getDisallowButton() {
        return this.disallowButton;
    }

    @NotNull
    public final TextAtom getHelp() {
        return this.help;
    }

    public final List<PermissionDTO> getPermissions() {
        return this.permissions;
    }

    public final SubtitleDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TitleDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        SubtitleDTO subtitleDTO = this.subtitle;
        int hashCode2 = (hashCode + (subtitleDTO == null ? 0 : subtitleDTO.hashCode())) * 31;
        List<PermissionDTO> list = this.permissions;
        return this.help.hashCode() + Tl.b.a(this.disallowButton, Tl.b.a(this.allowButton, (hashCode2 + (list != null ? list.hashCode() : 0)) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        return "RequestPhoneAccessWidgetDTO(title=" + this.title + ", subtitle=" + this.subtitle + ", permissions=" + this.permissions + ", allowButton=" + this.allowButton + ", disallowButton=" + this.disallowButton + ", help=" + this.help + ")";
    }
}

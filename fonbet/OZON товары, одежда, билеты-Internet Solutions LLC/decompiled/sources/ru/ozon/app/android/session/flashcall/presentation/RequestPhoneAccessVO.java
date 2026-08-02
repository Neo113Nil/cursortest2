package ru.ozon.app.android.session.flashcall.presentation;

import K1.G;
import Xc.a;
import Xc.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00041234BI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b-\u0010,R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b/\u00100¨\u00065"}, d2 = {"Lru/ozon/app/android/session/flashcall/presentation/RequestPhoneAccessVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/session/flashcall/presentation/RequestPhoneAccessVO$TitleVO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/session/flashcall/presentation/RequestPhoneAccessVO$SubtitleVO;", "subtitle", "", "Lru/ozon/app/android/session/flashcall/presentation/RequestPhoneAccessVO$PermissionVO;", "permissions", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "allowButton", "disallowButton", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "help", "<init>", "(JLru/ozon/app/android/session/flashcall/presentation/RequestPhoneAccessVO$TitleVO;Lru/ozon/app/android/session/flashcall/presentation/RequestPhoneAccessVO$SubtitleVO;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/session/flashcall/presentation/RequestPhoneAccessVO$TitleVO;", "getTitle", "()Lru/ozon/app/android/session/flashcall/presentation/RequestPhoneAccessVO$TitleVO;", "Lru/ozon/app/android/session/flashcall/presentation/RequestPhoneAccessVO$SubtitleVO;", "getSubtitle", "()Lru/ozon/app/android/session/flashcall/presentation/RequestPhoneAccessVO$SubtitleVO;", "Ljava/util/List;", "getPermissions", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getAllowButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getDisallowButton", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getHelp", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "TitleVO", "SubtitleVO", "PermissionVO", "AlignmentVO", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RequestPhoneAccessVO implements c {

    @NotNull
    private final ButtonV3Atom.LargeButton allowButton;

    @NotNull
    private final ButtonV3Atom.LargeButton disallowButton;

    @NotNull
    private final TextAtom help;
    private final long id;
    private final List<PermissionVO> permissions;
    private final SubtitleVO subtitle;

    @NotNull
    private final TitleVO title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/session/flashcall/presentation/RequestPhoneAccessVO$AlignmentVO;", "", "<init>", "(Ljava/lang/String;I)V", "ALIGNMENT_LEFT", "ALIGNMENT_CENTER", "ALIGNMENT_RIGHT", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AlignmentVO {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ AlignmentVO[] $VALUES;
        public static final AlignmentVO ALIGNMENT_LEFT = new AlignmentVO("ALIGNMENT_LEFT", 0);
        public static final AlignmentVO ALIGNMENT_CENTER = new AlignmentVO("ALIGNMENT_CENTER", 1);
        public static final AlignmentVO ALIGNMENT_RIGHT = new AlignmentVO("ALIGNMENT_RIGHT", 2);

        private static final /* synthetic */ AlignmentVO[] $values() {
            return new AlignmentVO[]{ALIGNMENT_LEFT, ALIGNMENT_CENTER, ALIGNMENT_RIGHT};
        }

        static {
            AlignmentVO[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private AlignmentVO(String str, int i11) {
        }

        public static AlignmentVO valueOf(String str) {
            return (AlignmentVO) Enum.valueOf(AlignmentVO.class, str);
        }

        public static AlignmentVO[] values() {
            return (AlignmentVO[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/session/flashcall/presentation/RequestPhoneAccessVO$PermissionVO;", "", "Lru/ozon/uni/atoms/data/button/Icon;", "icon", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "text", "<init>", "(Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/button/Icon;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PermissionVO {
        public static final int $stable = TextAtom.$stable | Icon.$stable;

        @NotNull
        private final Icon icon;

        @NotNull
        private final TextAtom text;

        public PermissionVO(@NotNull Icon icon, @NotNull TextAtom text) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(text, "text");
            this.icon = icon;
            this.text = text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PermissionVO)) {
                return false;
            }
            PermissionVO permissionVO = (PermissionVO) other;
            return Intrinsics.d(this.icon, permissionVO.icon) && Intrinsics.d(this.text, permissionVO.text);
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
            return "PermissionVO(icon=" + this.icon + ", text=" + this.text + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/session/flashcall/presentation/RequestPhoneAccessVO$SubtitleVO;", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "text", "Lru/ozon/uni/atoms/data/button/Icon;", "icon", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/uni/atoms/data/button/Icon;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SubtitleVO {
        public static final int $stable = Icon.$stable | TextAtom.$stable;
        private final AtomActionDTO action;

        @NotNull
        private final Icon icon;

        @NotNull
        private final TextAtom text;

        public SubtitleVO(@NotNull TextAtom text, @NotNull Icon icon, AtomActionDTO atomActionDTO) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.text = text;
            this.icon = icon;
            this.action = atomActionDTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SubtitleVO)) {
                return false;
            }
            SubtitleVO subtitleVO = (SubtitleVO) other;
            return Intrinsics.d(this.text, subtitleVO.text) && Intrinsics.d(this.icon, subtitleVO.icon) && Intrinsics.d(this.action, subtitleVO.action);
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
            StringBuilder sb2 = new StringBuilder("SubtitleVO(text=");
            sb2.append(textAtom);
            sb2.append(", icon=");
            sb2.append(icon);
            sb2.append(", action=");
            return G.c(sb2, atomActionDTO, ")");
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/session/flashcall/presentation/RequestPhoneAccessVO$TitleVO;", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "text", "Lru/ozon/app/android/session/flashcall/presentation/RequestPhoneAccessVO$AlignmentVO;", "alignment", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/session/flashcall/presentation/RequestPhoneAccessVO$AlignmentVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/app/android/session/flashcall/presentation/RequestPhoneAccessVO$AlignmentVO;", "getAlignment", "()Lru/ozon/app/android/session/flashcall/presentation/RequestPhoneAccessVO$AlignmentVO;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TitleVO {
        public static final int $stable = TextAtom.$stable;

        @NotNull
        private final AlignmentVO alignment;

        @NotNull
        private final TextAtom text;

        public TitleVO(@NotNull TextAtom text, @NotNull AlignmentVO alignment) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(alignment, "alignment");
            this.text = text;
            this.alignment = alignment;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TitleVO)) {
                return false;
            }
            TitleVO titleVO = (TitleVO) other;
            return Intrinsics.d(this.text, titleVO.text) && this.alignment == titleVO.alignment;
        }

        @NotNull
        public final AlignmentVO getAlignment() {
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
            return "TitleVO(text=" + this.text + ", alignment=" + this.alignment + ")";
        }
    }

    public RequestPhoneAccessVO(long j11, @NotNull TitleVO title, SubtitleVO subtitleVO, List<PermissionVO> list, @NotNull ButtonV3Atom.LargeButton allowButton, @NotNull ButtonV3Atom.LargeButton disallowButton, @NotNull TextAtom help) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(allowButton, "allowButton");
        Intrinsics.checkNotNullParameter(disallowButton, "disallowButton");
        Intrinsics.checkNotNullParameter(help, "help");
        this.id = j11;
        this.title = title;
        this.subtitle = subtitleVO;
        this.permissions = list;
        this.allowButton = allowButton;
        this.disallowButton = disallowButton;
        this.help = help;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestPhoneAccessVO)) {
            return false;
        }
        RequestPhoneAccessVO requestPhoneAccessVO = (RequestPhoneAccessVO) other;
        return this.id == requestPhoneAccessVO.id && Intrinsics.d(this.title, requestPhoneAccessVO.title) && Intrinsics.d(this.subtitle, requestPhoneAccessVO.subtitle) && Intrinsics.d(this.permissions, requestPhoneAccessVO.permissions) && Intrinsics.d(this.allowButton, requestPhoneAccessVO.allowButton) && Intrinsics.d(this.disallowButton, requestPhoneAccessVO.disallowButton) && Intrinsics.d(this.help, requestPhoneAccessVO.help);
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

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final List<PermissionVO> getPermissions() {
        return this.permissions;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final SubtitleVO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TitleVO getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.title.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        SubtitleVO subtitleVO = this.subtitle;
        int hashCode2 = (hashCode + (subtitleVO == null ? 0 : subtitleVO.hashCode())) * 31;
        List<PermissionVO> list = this.permissions;
        return this.help.hashCode() + Tl.b.a(this.disallowButton, Tl.b.a(this.allowButton, (hashCode2 + (list != null ? list.hashCode() : 0)) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        return "RequestPhoneAccessVO(id=" + this.id + ", title=" + this.title + ", subtitle=" + this.subtitle + ", permissions=" + this.permissions + ", allowButton=" + this.allowButton + ", disallowButton=" + this.disallowButton + ", help=" + this.help + ")";
    }
}

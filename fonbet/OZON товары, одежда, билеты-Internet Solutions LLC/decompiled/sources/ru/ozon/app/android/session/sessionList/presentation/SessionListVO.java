package ru.ozon.app.android.session.sessionList.presentation;

import Ak.C2436a;
import B90.C2619v;
import Bi.b;
import Bl.C2639a;
import Kk.C3532b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0005\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/session/sessionList/presentation/SessionListVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "<init>", "()V", "Annotation", "Header", "Title", "Item", "LogoutButton", "Lru/ozon/app/android/session/sessionList/presentation/SessionListVO$Annotation;", "Lru/ozon/app/android/session/sessionList/presentation/SessionListVO$Header;", "Lru/ozon/app/android/session/sessionList/presentation/SessionListVO$Item;", "Lru/ozon/app/android/session/sessionList/presentation/SessionListVO$LogoutButton;", "Lru/ozon/app/android/session/sessionList/presentation/SessionListVO$Title;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class SessionListVO implements c {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/session/sessionList/presentation/SessionListVO$Annotation;", "Lru/ozon/app/android/session/sessionList/presentation/SessionListVO;", "", "id", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "<init>", "(JLru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getDisclaimer", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Annotation extends SessionListVO {

        @NotNull
        private final DisclaimerAtom disclaimer;
        private final long id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Annotation(long j11, @NotNull DisclaimerAtom disclaimer) {
            super(null);
            Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
            this.id = j11;
            this.disclaimer = disclaimer;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Annotation)) {
                return false;
            }
            Annotation annotation = (Annotation) other;
            return this.id == annotation.id && Intrinsics.d(this.disclaimer, annotation.disclaimer);
        }

        @NotNull
        public final DisclaimerAtom getDisclaimer() {
            return this.disclaimer;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        public int hashCode() {
            return this.disclaimer.hashCode() + (Long.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            return "Annotation(id=" + this.id + ", disclaimer=" + this.disclaimer + ")";
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/session/sessionList/presentation/SessionListVO$Header;", "Lru/ozon/app/android/session/sessionList/presentation/SessionListVO;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "aboveList", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "Z", "getAboveList", "()Z", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Header extends SessionListVO {
        public static final int $stable = TextAtom.$stable;
        private final boolean aboveList;
        private final long id;

        @NotNull
        private final TextAtom subtitle;

        @NotNull
        private final TextAtom title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Header(long j11, @NotNull TextAtom title, @NotNull TextAtom subtitle, boolean z11) {
            super(null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            this.id = j11;
            this.title = title;
            this.subtitle = subtitle;
            this.aboveList = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Header)) {
                return false;
            }
            Header header = (Header) other;
            return this.id == header.id && Intrinsics.d(this.title, header.title) && Intrinsics.d(this.subtitle, header.subtitle) && this.aboveList == header.aboveList;
        }

        public final boolean getAboveList() {
            return this.aboveList;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @NotNull
        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            return Boolean.hashCode(this.aboveList) + C2619v.b(C2619v.b(Long.hashCode(this.id) * 31, 31, this.title), 31, this.subtitle);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            TextAtom textAtom = this.title;
            TextAtom textAtom2 = this.subtitle;
            boolean z11 = this.aboveList;
            StringBuilder c11 = C2639a.c("Header(id=", j11, ", title=", textAtom);
            c11.append(", subtitle=");
            c11.append(textAtom2);
            c11.append(", aboveList=");
            c11.append(z11);
            c11.append(")");
            return c11.toString();
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u0007\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/session/sessionList/presentation/SessionListVO$Item;", "Lru/ozon/app/android/session/sessionList/presentation/SessionListVO;", "", "id", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleDefault;", "cell", "", "isFirst", "isLast", "<init>", "(JLru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleDefault;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleDefault;", "getCell", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleDefault;", "Z", "()Z", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Item extends SessionListVO {

        @NotNull
        private final CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault cell;
        private final long id;
        private final boolean isFirst;
        private final boolean isLast;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Item(long j11, @NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault cell, boolean z11, boolean z12) {
            super(null);
            Intrinsics.checkNotNullParameter(cell, "cell");
            this.id = j11;
            this.cell = cell;
            this.isFirst = z11;
            this.isLast = z12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return this.id == item.id && Intrinsics.d(this.cell, item.cell) && this.isFirst == item.isFirst && this.isLast == item.isLast;
        }

        @NotNull
        public final CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault getCell() {
            return this.cell;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isLast) + C3532b.a((this.cell.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31, this.isFirst);
        }

        /* renamed from: isFirst, reason: from getter */
        public final boolean getIsFirst() {
            return this.isFirst;
        }

        /* renamed from: isLast, reason: from getter */
        public final boolean getIsLast() {
            return this.isLast;
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault cellWithSubtitleDefault = this.cell;
            boolean z11 = this.isFirst;
            boolean z12 = this.isLast;
            StringBuilder sb2 = new StringBuilder("Item(id=");
            sb2.append(j11);
            sb2.append(", cell=");
            sb2.append(cellWithSubtitleDefault);
            C2436a.e(", isFirst=", ", isLast=", sb2, z11, z12);
            sb2.append(")");
            return sb2.toString();
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/session/sessionList/presentation/SessionListVO$LogoutButton;", "Lru/ozon/app/android/session/sessionList/presentation/SessionListVO;", "", "id", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "atom", "<init>", "(JLru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getAtom", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LogoutButton extends SessionListVO {
        public static final int $stable = ButtonV3Atom.LargeButton.$stable;

        @NotNull
        private final ButtonV3Atom.LargeButton atom;
        private final long id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LogoutButton(long j11, @NotNull ButtonV3Atom.LargeButton atom) {
            super(null);
            Intrinsics.checkNotNullParameter(atom, "atom");
            this.id = j11;
            this.atom = atom;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LogoutButton)) {
                return false;
            }
            LogoutButton logoutButton = (LogoutButton) other;
            return this.id == logoutButton.id && Intrinsics.d(this.atom, logoutButton.atom);
        }

        @NotNull
        public final ButtonV3Atom.LargeButton getAtom() {
            return this.atom;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        public int hashCode() {
            return this.atom.hashCode() + (Long.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder h11 = b.h("LogoutButton(id=", this.id, ", atom=", this.atom);
            h11.append(")");
            return h11.toString();
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/session/sessionList/presentation/SessionListVO$Title;", "Lru/ozon/app/android/session/sessionList/presentation/SessionListVO;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "text", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Title extends SessionListVO {
        public static final int $stable = TextAtom.$stable;
        private final long id;

        @NotNull
        private final TextAtom text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Title(long j11, @NotNull TextAtom text) {
            super(null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.id = j11;
            this.text = text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Title)) {
                return false;
            }
            Title title = (Title) other;
            return this.id == title.id && Intrinsics.d(this.text, title.text);
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @NotNull
        public final TextAtom getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode() + (Long.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder c11 = C2639a.c("Title(id=", this.id, ", text=", this.text);
            c11.append(")");
            return c11.toString();
        }
    }

    public /* synthetic */ SessionListVO(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    private SessionListVO() {
    }
}

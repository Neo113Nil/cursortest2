package ru.ozon.app.android.button.presentation;

import Lh.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.button.data.ActionButtonDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u001aB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/button/presentation/ActionButtonVO;", "Ll20/c;", "", "id", "", "Lru/ozon/app/android/button/presentation/ActionButtonVO$Button;", "buttons", "<init>", "(JLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getButtons", "()Ljava/util/List;", "Button", "button_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ActionButtonVO implements c {

    @NotNull
    private final List<Button> buttons;
    private final long id;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/button/presentation/ActionButtonVO$Button;", "", "", "type", "Lru/ozon/app/android/button/data/ActionButtonDTO$ButtonsItem$Action;", "action", "Lru/ozon/uni/atoms/data/deprecated/Button;", "atom", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/button/data/ActionButtonDTO$ButtonsItem$Action;Lru/ozon/uni/atoms/data/deprecated/Button;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "Lru/ozon/app/android/button/data/ActionButtonDTO$ButtonsItem$Action;", "getAction", "()Lru/ozon/app/android/button/data/ActionButtonDTO$ButtonsItem$Action;", "Lru/ozon/uni/atoms/data/deprecated/Button;", "getAtom", "()Lru/ozon/uni/atoms/data/deprecated/Button;", "button_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Button {
        private final ActionButtonDTO.ButtonsItem.Action action;

        @NotNull
        private final ru.ozon.uni.atoms.data.deprecated.Button atom;

        @NotNull
        private final String type;

        public Button(@NotNull String type, ActionButtonDTO.ButtonsItem.Action action, @NotNull ru.ozon.uni.atoms.data.deprecated.Button atom) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(atom, "atom");
            this.type = type;
            this.action = action;
            this.atom = atom;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Button)) {
                return false;
            }
            Button button = (Button) other;
            return Intrinsics.d(this.type, button.type) && Intrinsics.d(this.action, button.action) && Intrinsics.d(this.atom, button.atom);
        }

        public final ActionButtonDTO.ButtonsItem.Action getAction() {
            return this.action;
        }

        @NotNull
        public final ru.ozon.uni.atoms.data.deprecated.Button getAtom() {
            return this.atom;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            ActionButtonDTO.ButtonsItem.Action action = this.action;
            return this.atom.hashCode() + ((hashCode + (action == null ? 0 : action.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            return "Button(type=" + this.type + ", action=" + this.action + ", atom=" + this.atom + ")";
        }
    }

    public ActionButtonVO(long j11, @NotNull List<Button> buttons) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.id = j11;
        this.buttons = buttons;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionButtonVO)) {
            return false;
        }
        ActionButtonVO actionButtonVO = (ActionButtonVO) other;
        return this.id == actionButtonVO.id && Intrinsics.d(this.buttons, actionButtonVO.buttons);
    }

    @NotNull
    public final List<Button> getButtons() {
        return this.buttons;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.buttons.hashCode() + (Long.hashCode(this.id) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder b11 = b.b(this.id, "ActionButtonVO(id=", ", buttons=", this.buttons);
        b11.append(")");
        return b11.toString();
    }
}

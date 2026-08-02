package ru.ozon.app.android.cscore.copybutton.models;

import V.e;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/cscore/copybutton/models/CopyButtonDTO;", "", "icon", "", "action", "Lru/ozon/app/android/cscore/copybutton/models/CopyButtonDTO$Action;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/cscore/copybutton/models/CopyButtonDTO$Action;)V", "getIcon", "()Ljava/lang/String;", "getAction", "()Lru/ozon/app/android/cscore/copybutton/models/CopyButtonDTO$Action;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Action", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CopyButtonDTO {
    public static final int $stable = 0;

    @NotNull
    private final Action action;

    @NotNull
    private final String icon;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/cscore/copybutton/models/CopyButtonDTO$Action;", "", "clipboardText", "", "restrictionMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getClipboardText", "()Ljava/lang/String;", "getRestrictionMessage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Action {
        public static final int $stable = 0;

        @NotNull
        private final String clipboardText;

        @NotNull
        private final String restrictionMessage;

        public Action(@i(name = "clipboardText") @NotNull String clipboardText, @i(name = "restrictionMessage") @NotNull String restrictionMessage) {
            Intrinsics.checkNotNullParameter(clipboardText, "clipboardText");
            Intrinsics.checkNotNullParameter(restrictionMessage, "restrictionMessage");
            this.clipboardText = clipboardText;
            this.restrictionMessage = restrictionMessage;
        }

        public static /* synthetic */ Action copy$default(Action action, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = action.clipboardText;
            }
            if ((i11 & 2) != 0) {
                str2 = action.restrictionMessage;
            }
            return action.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getClipboardText() {
            return this.clipboardText;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getRestrictionMessage() {
            return this.restrictionMessage;
        }

        @NotNull
        public final Action copy(@i(name = "clipboardText") @NotNull String clipboardText, @i(name = "restrictionMessage") @NotNull String restrictionMessage) {
            Intrinsics.checkNotNullParameter(clipboardText, "clipboardText");
            Intrinsics.checkNotNullParameter(restrictionMessage, "restrictionMessage");
            return new Action(clipboardText, restrictionMessage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Action)) {
                return false;
            }
            Action action = (Action) other;
            return Intrinsics.d(this.clipboardText, action.clipboardText) && Intrinsics.d(this.restrictionMessage, action.restrictionMessage);
        }

        @NotNull
        public final String getClipboardText() {
            return this.clipboardText;
        }

        @NotNull
        public final String getRestrictionMessage() {
            return this.restrictionMessage;
        }

        public int hashCode() {
            return this.restrictionMessage.hashCode() + (this.clipboardText.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("Action(clipboardText=", this.clipboardText, ", restrictionMessage=", this.restrictionMessage, ")");
        }
    }

    public CopyButtonDTO(@i(name = "icon") @NotNull String icon, @i(name = "action") @NotNull Action action) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(action, "action");
        this.icon = icon;
        this.action = action;
    }

    public static /* synthetic */ CopyButtonDTO copy$default(CopyButtonDTO copyButtonDTO, String str, Action action, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = copyButtonDTO.icon;
        }
        if ((i11 & 2) != 0) {
            action = copyButtonDTO.action;
        }
        return copyButtonDTO.copy(str, action);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    @NotNull
    public final CopyButtonDTO copy(@i(name = "icon") @NotNull String icon, @i(name = "action") @NotNull Action action) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(action, "action");
        return new CopyButtonDTO(icon, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CopyButtonDTO)) {
            return false;
        }
        CopyButtonDTO copyButtonDTO = (CopyButtonDTO) other;
        return Intrinsics.d(this.icon, copyButtonDTO.icon) && Intrinsics.d(this.action, copyButtonDTO.action);
    }

    @NotNull
    public final Action getAction() {
        return this.action;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    public int hashCode() {
        return this.action.hashCode() + (this.icon.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "CopyButtonDTO(icon=" + this.icon + ", action=" + this.action + ")";
    }
}

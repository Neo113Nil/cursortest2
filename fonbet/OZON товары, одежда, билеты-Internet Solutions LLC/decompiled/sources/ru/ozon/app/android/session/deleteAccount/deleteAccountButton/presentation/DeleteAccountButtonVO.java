package ru.ozon.app.android.session.deleteAccount.deleteAccountButton.presentation;

import B0.C2454a;
import G.g;
import T7.P;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0011R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010\u0013R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b#\u0010\u0011R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountButton/presentation/DeleteAccountButtonVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "actionName", "", "gravity", "textColor", "Lru/ozon/uni/atoms/data/button/Icon;", "icon", "<init>", "(JLru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;ILjava/lang/String;Lru/ozon/uni/atoms/data/button/Icon;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "Ljava/lang/String;", "getActionName", "I", "getGravity", "getTextColor", "Lru/ozon/uni/atoms/data/button/Icon;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DeleteAccountButtonVO implements c {
    public static final int $stable = Icon.$stable | OzonSpannableString.$stable;

    @NotNull
    private final String actionName;
    private final int gravity;
    private final Icon icon;
    private final long id;

    @NotNull
    private final String textColor;

    @NotNull
    private final OzonSpannableString title;

    public DeleteAccountButtonVO(long j11, @NotNull OzonSpannableString title, @NotNull String actionName, int i11, @NotNull String textColor, Icon icon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        this.id = j11;
        this.title = title;
        this.actionName = actionName;
        this.gravity = i11;
        this.textColor = textColor;
        this.icon = icon;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeleteAccountButtonVO)) {
            return false;
        }
        DeleteAccountButtonVO deleteAccountButtonVO = (DeleteAccountButtonVO) other;
        return this.id == deleteAccountButtonVO.id && Intrinsics.d(this.title, deleteAccountButtonVO.title) && Intrinsics.d(this.actionName, deleteAccountButtonVO.actionName) && this.gravity == deleteAccountButtonVO.gravity && Intrinsics.d(this.textColor, deleteAccountButtonVO.textColor) && Intrinsics.d(this.icon, deleteAccountButtonVO.icon);
    }

    @NotNull
    public final String getActionName() {
        return this.actionName;
    }

    public final int getGravity() {
        return this.gravity;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final String getTextColor() {
        return this.textColor;
    }

    @NotNull
    public final OzonSpannableString getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a(C2454a.a(this.gravity, g.a(P.c(this.title, Long.hashCode(this.id) * 31, 31), 31, this.actionName), 31), 31, this.textColor);
        Icon icon = this.icon;
        return a11 + (icon == null ? 0 : icon.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        OzonSpannableString ozonSpannableString = this.title;
        return "DeleteAccountButtonVO(id=" + j11 + ", title=" + ((Object) ozonSpannableString) + ", actionName=" + this.actionName + ", gravity=" + this.gravity + ", textColor=" + this.textColor + ", icon=" + this.icon + ")";
    }
}

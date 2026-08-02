package ru.ozon.app.android.session.logoutonall.data;

import Ak.C2436a;
import B0.C2454a;
import G.g;
import Kk.C3532b;
import Nh.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001e\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\u0014R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b%\u0010\u0012R\u0017\u0010\u000e\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b&\u0010\u0012¨\u0006'"}, d2 = {"Lru/ozon/app/android/session/logoutonall/data/LogoutOnAllDevicesVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "action", "textColor", "", "gravity", "", "showSeparator", "confirmTitle", "confirmDescription", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTitle", "getAction", "getTextColor", "I", "getGravity", "Z", "getShowSeparator", "()Z", "getConfirmTitle", "getConfirmDescription", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class LogoutOnAllDevicesVO implements c {

    @NotNull
    private final String action;

    @NotNull
    private final String confirmDescription;

    @NotNull
    private final String confirmTitle;
    private final int gravity;
    private final long id;
    private final boolean showSeparator;

    @NotNull
    private final String textColor;

    @NotNull
    private final String title;

    public LogoutOnAllDevicesVO(long j11, @NotNull String title, @NotNull String action, @NotNull String textColor, int i11, boolean z11, @NotNull String confirmTitle, @NotNull String confirmDescription) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        Intrinsics.checkNotNullParameter(confirmTitle, "confirmTitle");
        Intrinsics.checkNotNullParameter(confirmDescription, "confirmDescription");
        this.id = j11;
        this.title = title;
        this.action = action;
        this.textColor = textColor;
        this.gravity = i11;
        this.showSeparator = z11;
        this.confirmTitle = confirmTitle;
        this.confirmDescription = confirmDescription;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogoutOnAllDevicesVO)) {
            return false;
        }
        LogoutOnAllDevicesVO logoutOnAllDevicesVO = (LogoutOnAllDevicesVO) other;
        return this.id == logoutOnAllDevicesVO.id && Intrinsics.d(this.title, logoutOnAllDevicesVO.title) && Intrinsics.d(this.action, logoutOnAllDevicesVO.action) && Intrinsics.d(this.textColor, logoutOnAllDevicesVO.textColor) && this.gravity == logoutOnAllDevicesVO.gravity && this.showSeparator == logoutOnAllDevicesVO.showSeparator && Intrinsics.d(this.confirmTitle, logoutOnAllDevicesVO.confirmTitle) && Intrinsics.d(this.confirmDescription, logoutOnAllDevicesVO.confirmDescription);
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }

    @NotNull
    public final String getConfirmDescription() {
        return this.confirmDescription;
    }

    @NotNull
    public final String getConfirmTitle() {
        return this.confirmTitle;
    }

    public final int getGravity() {
        return this.gravity;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final boolean getShowSeparator() {
        return this.showSeparator;
    }

    @NotNull
    public final String getTextColor() {
        return this.textColor;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.confirmDescription.hashCode() + g.a(C3532b.a(C2454a.a(this.gravity, g.a(g.a(g.a(Long.hashCode(this.id) * 31, 31, this.title), 31, this.action), 31, this.textColor), 31), 31, this.showSeparator), 31, this.confirmTitle);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.title;
        String str2 = this.action;
        String str3 = this.textColor;
        int i11 = this.gravity;
        boolean z11 = this.showSeparator;
        String str4 = this.confirmTitle;
        String str5 = this.confirmDescription;
        StringBuilder c11 = C2436a.c(j11, "LogoutOnAllDevicesVO(id=", ", title=", str);
        a.h(c11, ", action=", str2, ", textColor=", str3);
        c11.append(", gravity=");
        c11.append(i11);
        c11.append(", showSeparator=");
        c11.append(z11);
        a.h(c11, ", confirmTitle=", str4, ", confirmDescription=", str5);
        c11.append(")");
        return c11.toString();
    }
}

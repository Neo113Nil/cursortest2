package ru.ozon.app.android.session.logout.presentation;

import Ak.C2436a;
import B0.C2454a;
import Bi.b;
import G.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u0011R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/session/logout/presentation/LogoutVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "gravity", "textColor", "", "showSeparator", "<init>", "(JLjava/lang/String;ILjava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTitle", "I", "getGravity", "getTextColor", "Z", "getShowSeparator", "()Z", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class LogoutVO implements c {
    private final int gravity;
    private final long id;
    private final boolean showSeparator;

    @NotNull
    private final String textColor;

    @NotNull
    private final String title;

    public LogoutVO(long j11, @NotNull String title, int i11, @NotNull String textColor, boolean z11) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        this.id = j11;
        this.title = title;
        this.gravity = i11;
        this.textColor = textColor;
        this.showSeparator = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogoutVO)) {
            return false;
        }
        LogoutVO logoutVO = (LogoutVO) other;
        return this.id == logoutVO.id && Intrinsics.d(this.title, logoutVO.title) && this.gravity == logoutVO.gravity && Intrinsics.d(this.textColor, logoutVO.textColor) && this.showSeparator == logoutVO.showSeparator;
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
        return Boolean.hashCode(this.showSeparator) + g.a(C2454a.a(this.gravity, g.a(Long.hashCode(this.id) * 31, 31, this.title), 31), 31, this.textColor);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.title;
        int i11 = this.gravity;
        String str2 = this.textColor;
        boolean z11 = this.showSeparator;
        StringBuilder c11 = C2436a.c(j11, "LogoutVO(id=", ", title=", str);
        c11.append(", gravity=");
        c11.append(i11);
        c11.append(", textColor=");
        c11.append(str2);
        return b.f(c11, ", showSeparator=", z11, ")");
    }
}

package ru.ozon.app.android.session.session.presentation;

import G.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.session.data.SessionDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/session/session/presentation/SessionVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/session/session/data/SessionDTO$Header;", CommentV3DTO.HEADER_FIELD_NAME, "", "Lru/ozon/app/android/session/session/data/SessionDTO$Data;", "dataList", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "logoutButton", "<init>", "(JLru/ozon/app/android/session/session/data/SessionDTO$Header;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/session/session/data/SessionDTO$Header;", "getHeader", "()Lru/ozon/app/android/session/session/data/SessionDTO$Header;", "Ljava/util/List;", "getDataList", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getLogoutButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SessionVO implements c {

    @NotNull
    private final List<SessionDTO.Data> dataList;

    @NotNull
    private final SessionDTO.Header header;
    private final long id;
    private final ButtonV3Atom.LargeButton logoutButton;

    public SessionVO(long j11, @NotNull SessionDTO.Header header, @NotNull List<SessionDTO.Data> dataList, ButtonV3Atom.LargeButton largeButton) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.id = j11;
        this.header = header;
        this.dataList = dataList;
        this.logoutButton = largeButton;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionVO)) {
            return false;
        }
        SessionVO sessionVO = (SessionVO) other;
        return this.id == sessionVO.id && Intrinsics.d(this.header, sessionVO.header) && Intrinsics.d(this.dataList, sessionVO.dataList) && Intrinsics.d(this.logoutButton, sessionVO.logoutButton);
    }

    @NotNull
    public final List<SessionDTO.Data> getDataList() {
        return this.dataList;
    }

    @NotNull
    public final SessionDTO.Header getHeader() {
        return this.header;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final ButtonV3Atom.LargeButton getLogoutButton() {
        return this.logoutButton;
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
        int b11 = g.b((this.header.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31, this.dataList);
        ButtonV3Atom.LargeButton largeButton = this.logoutButton;
        return b11 + (largeButton == null ? 0 : largeButton.hashCode());
    }

    @NotNull
    public String toString() {
        return "SessionVO(id=" + this.id + ", header=" + this.header + ", dataList=" + this.dataList + ", logoutButton=" + this.logoutButton + ")";
    }
}

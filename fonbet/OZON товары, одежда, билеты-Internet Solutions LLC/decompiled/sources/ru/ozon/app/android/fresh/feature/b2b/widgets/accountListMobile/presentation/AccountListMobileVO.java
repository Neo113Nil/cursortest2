package ru.ozon.app.android.fresh.feature.b2b.widgets.accountListMobile.presentation;

import G.g;
import Kk.C3532b;
import Nh.a;
import Ve.C4598rp;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.avatar.Avatar;
import ru.ozon.uni.atoms.data.badge.Badge;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b%\u0010\u0015R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b\r\u0010*R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/accountListMobile/presentation/AccountListMobileVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/avatar/Avatar;", "avatar", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/badge/Badge;", "counter", "", "isSelected", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/avatar/Avatar;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/badge/Badge;ZLru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/avatar/Avatar;", "getAvatar", "()Lru/ozon/uni/atoms/data/avatar/Avatar;", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lru/ozon/uni/atoms/data/badge/Badge;", "getCounter", "()Lru/ozon/uni/atoms/data/badge/Badge;", "Z", "()Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AccountListMobileVO implements c {

    @NotNull
    private final AtomAction action;

    @NotNull
    private final Avatar avatar;
    private final Badge counter;
    private final long id;
    private final boolean isSelected;
    private final String subtitle;

    @NotNull
    private final String title;
    private final t tokenizedEvent;

    public AccountListMobileVO(long j11, @NotNull Avatar avatar, @NotNull String title, String str, Badge badge, boolean z11, @NotNull AtomAction action, t tVar) {
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        this.id = j11;
        this.avatar = avatar;
        this.title = title;
        this.subtitle = str;
        this.counter = badge;
        this.isSelected = z11;
        this.action = action;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountListMobileVO)) {
            return false;
        }
        AccountListMobileVO accountListMobileVO = (AccountListMobileVO) other;
        return this.id == accountListMobileVO.id && Intrinsics.d(this.avatar, accountListMobileVO.avatar) && Intrinsics.d(this.title, accountListMobileVO.title) && Intrinsics.d(this.subtitle, accountListMobileVO.subtitle) && Intrinsics.d(this.counter, accountListMobileVO.counter) && this.isSelected == accountListMobileVO.isSelected && Intrinsics.d(this.action, accountListMobileVO.action) && Intrinsics.d(this.tokenizedEvent, accountListMobileVO.tokenizedEvent);
    }

    @NotNull
    public final AtomAction getAction() {
        return this.action;
    }

    @NotNull
    public final Avatar getAvatar() {
        return this.avatar;
    }

    public final Badge getCounter() {
        return this.counter;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a((this.avatar.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31, this.title);
        String str = this.subtitle;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        Badge badge = this.counter;
        int a12 = C4598rp.a(this.action, C3532b.a((hashCode + (badge == null ? 0 : badge.hashCode())) * 31, 31, this.isSelected), 31);
        t tVar = this.tokenizedEvent;
        return a12 + (tVar != null ? tVar.hashCode() : 0);
    }

    /* renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        Avatar avatar = this.avatar;
        String str = this.title;
        String str2 = this.subtitle;
        Badge badge = this.counter;
        boolean z11 = this.isSelected;
        AtomAction atomAction = this.action;
        t tVar = this.tokenizedEvent;
        StringBuilder sb2 = new StringBuilder("AccountListMobileVO(id=");
        sb2.append(j11);
        sb2.append(", avatar=");
        sb2.append(avatar);
        a.h(sb2, ", title=", str, ", subtitle=", str2);
        sb2.append(", counter=");
        sb2.append(badge);
        sb2.append(", isSelected=");
        sb2.append(z11);
        Fj.c.e(tVar, ", action=", ", tokenizedEvent=", sb2, atomAction);
        sb2.append(")");
        return sb2.toString();
    }
}

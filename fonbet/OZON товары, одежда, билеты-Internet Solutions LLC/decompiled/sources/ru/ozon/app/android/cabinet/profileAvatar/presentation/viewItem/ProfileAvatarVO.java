package ru.ozon.app.android.cabinet.profileAvatar.presentation.viewItem;

import El.C2971a;
import Kk.C3532b;
import Lh.a;
import Ns.b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002B[\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b&\u0010%R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b\u000b\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010\u0018R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00101\u001a\u0004\b2\u00103R\u001f\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00104\u001a\u0004\b5\u00106¨\u00067"}, d2 = {"Lru/ozon/app/android/cabinet/profileAvatar/presentation/viewItem/ProfileAvatarVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "avatarIcon", "loadingAvatarIcon", "Lru/ozon/uni/atoms/data/text/TextDTO;", "actionTitle", "", "isDefaultPhoto", "", "backgroundColor", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "defaultNotification", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;ZLjava/lang/String;Lru/ozon/uni/atoms/data/notification/NotificationDTO;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getAvatarIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getLoadingAvatarIcon", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getActionTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Z", "()Z", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getDefaultNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ProfileAvatarVO implements c {
    private final AtomAction action;

    @NotNull
    private final TextDTO actionTitle;

    @NotNull
    private final IconDTO avatarIcon;
    private final String backgroundColor;

    @NotNull
    private final NotificationDTO defaultNotification;
    private final long id;
    private final boolean isDefaultPhoto;

    @NotNull
    private final IconDTO loadingAvatarIcon;
    private final t tokenizedEvent;

    public ProfileAvatarVO(long j11, @NotNull IconDTO avatarIcon, @NotNull IconDTO loadingAvatarIcon, @NotNull TextDTO actionTitle, boolean z11, String str, @NotNull NotificationDTO defaultNotification, AtomAction atomAction, t tVar) {
        Intrinsics.checkNotNullParameter(avatarIcon, "avatarIcon");
        Intrinsics.checkNotNullParameter(loadingAvatarIcon, "loadingAvatarIcon");
        Intrinsics.checkNotNullParameter(actionTitle, "actionTitle");
        Intrinsics.checkNotNullParameter(defaultNotification, "defaultNotification");
        this.id = j11;
        this.avatarIcon = avatarIcon;
        this.loadingAvatarIcon = loadingAvatarIcon;
        this.actionTitle = actionTitle;
        this.isDefaultPhoto = z11;
        this.backgroundColor = str;
        this.defaultNotification = defaultNotification;
        this.action = atomAction;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileAvatarVO)) {
            return false;
        }
        ProfileAvatarVO profileAvatarVO = (ProfileAvatarVO) other;
        return this.id == profileAvatarVO.id && Intrinsics.d(this.avatarIcon, profileAvatarVO.avatarIcon) && Intrinsics.d(this.loadingAvatarIcon, profileAvatarVO.loadingAvatarIcon) && Intrinsics.d(this.actionTitle, profileAvatarVO.actionTitle) && this.isDefaultPhoto == profileAvatarVO.isDefaultPhoto && Intrinsics.d(this.backgroundColor, profileAvatarVO.backgroundColor) && Intrinsics.d(this.defaultNotification, profileAvatarVO.defaultNotification) && Intrinsics.d(this.action, profileAvatarVO.action) && Intrinsics.d(this.tokenizedEvent, profileAvatarVO.tokenizedEvent);
    }

    @NotNull
    public final TextDTO getActionTitle() {
        return this.actionTitle;
    }

    @NotNull
    public final IconDTO getAvatarIcon() {
        return this.avatarIcon;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final NotificationDTO getDefaultNotification() {
        return this.defaultNotification;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final IconDTO getLoadingAvatarIcon() {
        return this.loadingAvatarIcon;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C3532b.a(b.a(this.actionTitle, C2971a.a(this.loadingAvatarIcon, C2971a.a(this.avatarIcon, Long.hashCode(this.id) * 31, 31), 31), 31), 31, this.isDefaultPhoto);
        String str = this.backgroundColor;
        int hashCode = (this.defaultNotification.hashCode() + ((a11 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        AtomAction atomAction = this.action;
        int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
    }

    /* renamed from: isDefaultPhoto, reason: from getter */
    public final boolean getIsDefaultPhoto() {
        return this.isDefaultPhoto;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        IconDTO iconDTO = this.avatarIcon;
        IconDTO iconDTO2 = this.loadingAvatarIcon;
        TextDTO textDTO = this.actionTitle;
        boolean z11 = this.isDefaultPhoto;
        String str = this.backgroundColor;
        NotificationDTO notificationDTO = this.defaultNotification;
        AtomAction atomAction = this.action;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = D40.c.b("ProfileAvatarVO(id=", j11, ", avatarIcon=", iconDTO);
        b11.append(", loadingAvatarIcon=");
        b11.append(iconDTO2);
        b11.append(", actionTitle=");
        b11.append(textDTO);
        b11.append(", isDefaultPhoto=");
        b11.append(z11);
        b11.append(", backgroundColor=");
        b11.append(str);
        b11.append(", defaultNotification=");
        b11.append(notificationDTO);
        b11.append(", action=");
        b11.append(atomAction);
        return a.b(b11, ", tokenizedEvent=", tVar, ")");
    }
}

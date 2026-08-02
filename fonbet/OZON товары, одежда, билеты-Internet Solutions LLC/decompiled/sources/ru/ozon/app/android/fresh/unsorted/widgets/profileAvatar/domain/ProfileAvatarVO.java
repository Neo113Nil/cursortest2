package ru.ozon.app.android.fresh.unsorted.widgets.profileAvatar.domain;

import Ak.C2436a;
import El.C2971a;
import Kk.C3532b;
import Nh.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002Bu\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00112\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b(\u0010'R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00102\u001a\u0004\b3\u0010\u001aR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b4\u0010\u001aR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00105\u001a\u0004\b\u0012\u00106R\u0017\u0010\u0013\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u00105\u001a\u0004\b\u0013\u00106R\u0017\u0010\u0014\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0014\u00105\u001a\u0004\b\u0014\u00106R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u00107\u001a\u0004\b8\u00109¨\u0006:"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/profileAvatar/domain/ProfileAvatarVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "avatar", "edit", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "notification", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "label", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "backgroundImage", "backgroundColor", "", "isDefaultAvatar", "isAvatarChangeable", "isInSettings", "LWZ/t;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/String;ZZZLWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getAvatar", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getEdit", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getNotification", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "getLabel", "()Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/lang/String;", "getBackgroundImage", "getBackgroundColor", "Z", "()Z", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ProfileAvatarVO implements c {

    @NotNull
    private final IconDTO avatar;
    private final String backgroundColor;
    private final String backgroundImage;
    private final IconDTO edit;
    private final long id;
    private final boolean isAvatarChangeable;
    private final boolean isDefaultAvatar;
    private final boolean isInSettings;
    private final IndicatorDTO label;
    private final IconButtonV3DTO notification;
    private final TextDTO title;
    private final t tokenizedEvent;

    public ProfileAvatarVO(long j11, @NotNull IconDTO avatar, IconDTO iconDTO, IconButtonV3DTO iconButtonV3DTO, IndicatorDTO indicatorDTO, TextDTO textDTO, String str, String str2, boolean z11, boolean z12, boolean z13, t tVar) {
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        this.id = j11;
        this.avatar = avatar;
        this.edit = iconDTO;
        this.notification = iconButtonV3DTO;
        this.label = indicatorDTO;
        this.title = textDTO;
        this.backgroundImage = str;
        this.backgroundColor = str2;
        this.isDefaultAvatar = z11;
        this.isAvatarChangeable = z12;
        this.isInSettings = z13;
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
        return this.id == profileAvatarVO.id && Intrinsics.d(this.avatar, profileAvatarVO.avatar) && Intrinsics.d(this.edit, profileAvatarVO.edit) && Intrinsics.d(this.notification, profileAvatarVO.notification) && Intrinsics.d(this.label, profileAvatarVO.label) && Intrinsics.d(this.title, profileAvatarVO.title) && Intrinsics.d(this.backgroundImage, profileAvatarVO.backgroundImage) && Intrinsics.d(this.backgroundColor, profileAvatarVO.backgroundColor) && this.isDefaultAvatar == profileAvatarVO.isDefaultAvatar && this.isAvatarChangeable == profileAvatarVO.isAvatarChangeable && this.isInSettings == profileAvatarVO.isInSettings && Intrinsics.d(this.tokenizedEvent, profileAvatarVO.tokenizedEvent);
    }

    @NotNull
    public final IconDTO getAvatar() {
        return this.avatar;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    public final IconDTO getEdit() {
        return this.edit;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final IndicatorDTO getLabel() {
        return this.label;
    }

    public final IconButtonV3DTO getNotification() {
        return this.notification;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextDTO getTitle() {
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
        int a11 = C2971a.a(this.avatar, Long.hashCode(this.id) * 31, 31);
        IconDTO iconDTO = this.edit;
        int hashCode = (a11 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.notification;
        int hashCode2 = (hashCode + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
        IndicatorDTO indicatorDTO = this.label;
        int hashCode3 = (hashCode2 + (indicatorDTO == null ? 0 : indicatorDTO.hashCode())) * 31;
        TextDTO textDTO = this.title;
        int hashCode4 = (hashCode3 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        String str = this.backgroundImage;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundColor;
        int a12 = C3532b.a(C3532b.a(C3532b.a((hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.isDefaultAvatar), 31, this.isAvatarChangeable), 31, this.isInSettings);
        t tVar = this.tokenizedEvent;
        return a12 + (tVar != null ? tVar.hashCode() : 0);
    }

    /* renamed from: isAvatarChangeable, reason: from getter */
    public final boolean getIsAvatarChangeable() {
        return this.isAvatarChangeable;
    }

    /* renamed from: isDefaultAvatar, reason: from getter */
    public final boolean getIsDefaultAvatar() {
        return this.isDefaultAvatar;
    }

    /* renamed from: isInSettings, reason: from getter */
    public final boolean getIsInSettings() {
        return this.isInSettings;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        IconDTO iconDTO = this.avatar;
        IconDTO iconDTO2 = this.edit;
        IconButtonV3DTO iconButtonV3DTO = this.notification;
        IndicatorDTO indicatorDTO = this.label;
        TextDTO textDTO = this.title;
        String str = this.backgroundImage;
        String str2 = this.backgroundColor;
        boolean z11 = this.isDefaultAvatar;
        boolean z12 = this.isAvatarChangeable;
        boolean z13 = this.isInSettings;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = D40.c.b("ProfileAvatarVO(id=", j11, ", avatar=", iconDTO);
        b11.append(", edit=");
        b11.append(iconDTO2);
        b11.append(", notification=");
        b11.append(iconButtonV3DTO);
        b11.append(", label=");
        b11.append(indicatorDTO);
        b11.append(", title=");
        b11.append(textDTO);
        a.h(b11, ", backgroundImage=", str, ", backgroundColor=", str2);
        C2436a.e(", isDefaultAvatar=", ", isAvatarChangeable=", b11, z11, z12);
        C2971a.d(b11, ", isInSettings=", z13, ", tokenizedEvent=", tVar);
        b11.append(")");
        return b11.toString();
    }
}

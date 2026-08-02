package ru.ozon.app.android.ugc.widgets.selectionsList.data;

import Ns.b;
import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003JM\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/data/SocialHeader;", "", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "verifyIcon", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getVerifyIcon", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SocialHeader {
    public static final int $stable = 8;
    private final AtomActionDTO action;

    @NotNull
    private final IconDTO icon;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final IconDTO verifyIcon;

    public SocialHeader(@NotNull IconDTO icon, @NotNull TextDTO title, IconDTO iconDTO, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        this.icon = icon;
        this.title = title;
        this.verifyIcon = iconDTO;
        this.action = atomActionDTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ SocialHeader copy$default(SocialHeader socialHeader, IconDTO iconDTO, TextDTO textDTO, IconDTO iconDTO2, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iconDTO = socialHeader.icon;
        }
        if ((i11 & 2) != 0) {
            textDTO = socialHeader.title;
        }
        if ((i11 & 4) != 0) {
            iconDTO2 = socialHeader.verifyIcon;
        }
        if ((i11 & 8) != 0) {
            atomActionDTO = socialHeader.action;
        }
        if ((i11 & 16) != 0) {
            map = socialHeader.trackingInfo;
        }
        Map map2 = map;
        IconDTO iconDTO3 = iconDTO2;
        return socialHeader.copy(iconDTO, textDTO, iconDTO3, atomActionDTO, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final IconDTO getIcon() {
        return this.icon;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final IconDTO getVerifyIcon() {
        return this.verifyIcon;
    }

    /* renamed from: component4, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final SocialHeader copy(@NotNull IconDTO icon, @NotNull TextDTO title, IconDTO verifyIcon, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        return new SocialHeader(icon, title, verifyIcon, action, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocialHeader)) {
            return false;
        }
        SocialHeader socialHeader = (SocialHeader) other;
        return Intrinsics.d(this.icon, socialHeader.icon) && Intrinsics.d(this.title, socialHeader.title) && Intrinsics.d(this.verifyIcon, socialHeader.verifyIcon) && Intrinsics.d(this.action, socialHeader.action) && Intrinsics.d(this.trackingInfo, socialHeader.trackingInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final IconDTO getIcon() {
        return this.icon;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final IconDTO getVerifyIcon() {
        return this.verifyIcon;
    }

    public int hashCode() {
        int a11 = b.a(this.title, this.icon.hashCode() * 31, 31);
        IconDTO iconDTO = this.verifyIcon;
        int hashCode = (a11 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        IconDTO iconDTO = this.icon;
        TextDTO textDTO = this.title;
        IconDTO iconDTO2 = this.verifyIcon;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder i11 = Bi.b.i("SocialHeader(icon=", ", title=", ", verifyIcon=", iconDTO, textDTO);
        i11.append(iconDTO2);
        i11.append(", action=");
        i11.append(atomActionDTO);
        i11.append(", trackingInfo=");
        return P.f(i11, map, ")");
    }
}

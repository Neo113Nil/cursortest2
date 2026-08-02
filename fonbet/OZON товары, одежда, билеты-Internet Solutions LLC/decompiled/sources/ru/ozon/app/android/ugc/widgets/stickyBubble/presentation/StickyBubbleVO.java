package ru.ozon.app.android.ugc.widgets.stickyBubble.presentation;

import Ak.C2436a;
import Kk.C3532b;
import Ns.b;
import T7.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001.B[\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011Jn\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010 \u001a\u0004\b\u0007\u0010\"\"\u0004\b%\u0010$R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b\b\u0010\"R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b\t\u0010\"R\"\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010 \u001a\u0004\b\n\u0010\"\"\u0004\b&\u0010$R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b*\u0010)R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lru/ozon/app/android/ugc/widgets/stickyBubble/presentation/StickyBubbleVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "shouldShow", "isClicked", "isSelected", "isSubscribed", "isShrunk", "Lru/ozon/app/android/ugc/widgets/stickyBubble/presentation/StickyBubbleVO$StickyBubbleStateVO;", "defaultState", "selectedState", "", "selectedStateTimeout", "<init>", "(JZZZZZLru/ozon/app/android/ugc/widgets/stickyBubble/presentation/StickyBubbleVO$StickyBubbleStateVO;Lru/ozon/app/android/ugc/widgets/stickyBubble/presentation/StickyBubbleVO$StickyBubbleStateVO;Ljava/lang/Integer;)V", "copy", "(JZZZZZLru/ozon/app/android/ugc/widgets/stickyBubble/presentation/StickyBubbleVO$StickyBubbleStateVO;Lru/ozon/app/android/ugc/widgets/stickyBubble/presentation/StickyBubbleVO$StickyBubbleStateVO;Ljava/lang/Integer;)Lru/ozon/app/android/ugc/widgets/stickyBubble/presentation/StickyBubbleVO;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Z", "getShouldShow", "()Z", "setShouldShow", "(Z)V", "setClicked", "setShrunk", "Lru/ozon/app/android/ugc/widgets/stickyBubble/presentation/StickyBubbleVO$StickyBubbleStateVO;", "getDefaultState", "()Lru/ozon/app/android/ugc/widgets/stickyBubble/presentation/StickyBubbleVO$StickyBubbleStateVO;", "getSelectedState", "Ljava/lang/Integer;", "getSelectedStateTimeout", "()Ljava/lang/Integer;", "StickyBubbleStateVO", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class StickyBubbleVO implements c {

    @NotNull
    private final StickyBubbleStateVO defaultState;
    private final long id;
    private boolean isClicked;
    private final boolean isSelected;
    private boolean isShrunk;
    private final boolean isSubscribed;
    private final StickyBubbleStateVO selectedState;
    private final Integer selectedStateTimeout;
    private boolean shouldShow;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0010R%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/ugc/widgets/stickyBubble/presentation/StickyBubbleVO$StickyBubbleStateVO;", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "", "backgroundColor", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Ljava/util/Map;)V", "getAuthorId", "()Ljava/lang/String;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Ljava/lang/String;", "getBackgroundColor", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StickyBubbleStateVO {
        private final AtomActionDTO action;
        private final String backgroundColor;

        @NotNull
        private final IconDTO icon;

        @NotNull
        private final TextDTO text;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public StickyBubbleStateVO(@NotNull IconDTO icon, @NotNull TextDTO text, AtomActionDTO atomActionDTO, String str, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(text, "text");
            this.icon = icon;
            this.text = text;
            this.action = atomActionDTO;
            this.backgroundColor = str;
            this.trackingInfo = map;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StickyBubbleStateVO)) {
                return false;
            }
            StickyBubbleStateVO stickyBubbleStateVO = (StickyBubbleStateVO) other;
            return Intrinsics.d(this.icon, stickyBubbleStateVO.icon) && Intrinsics.d(this.text, stickyBubbleStateVO.text) && Intrinsics.d(this.action, stickyBubbleStateVO.action) && Intrinsics.d(this.backgroundColor, stickyBubbleStateVO.backgroundColor) && Intrinsics.d(this.trackingInfo, stickyBubbleStateVO.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final String getAuthorId() {
            Map<String, String> params;
            AtomActionDTO atomActionDTO = this.action;
            String str = (atomActionDTO == null || (params = atomActionDTO.getParams()) == null) ? null : params.get("authorId");
            return str == null ? "" : str;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = b.a(this.text, this.icon.hashCode() * 31, 31);
            AtomActionDTO atomActionDTO = this.action;
            int hashCode = (a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            String str = this.backgroundColor;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            IconDTO iconDTO = this.icon;
            TextDTO textDTO = this.text;
            AtomActionDTO atomActionDTO = this.action;
            String str = this.backgroundColor;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder i11 = Bi.b.i("StickyBubbleStateVO(icon=", ", text=", ", action=", iconDTO, textDTO);
            HY.b.d(", backgroundColor=", str, ", trackingInfo=", i11, atomActionDTO);
            return P.f(i11, map, ")");
        }
    }

    public StickyBubbleVO(long j11, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, @NotNull StickyBubbleStateVO defaultState, StickyBubbleStateVO stickyBubbleStateVO, Integer num) {
        Intrinsics.checkNotNullParameter(defaultState, "defaultState");
        this.id = j11;
        this.shouldShow = z11;
        this.isClicked = z12;
        this.isSelected = z13;
        this.isSubscribed = z14;
        this.isShrunk = z15;
        this.defaultState = defaultState;
        this.selectedState = stickyBubbleStateVO;
        this.selectedStateTimeout = num;
    }

    public static /* synthetic */ StickyBubbleVO copy$default(StickyBubbleVO stickyBubbleVO, long j11, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, StickyBubbleStateVO stickyBubbleStateVO, StickyBubbleStateVO stickyBubbleStateVO2, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = stickyBubbleVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            z11 = stickyBubbleVO.shouldShow;
        }
        boolean z16 = z11;
        if ((i11 & 4) != 0) {
            z12 = stickyBubbleVO.isClicked;
        }
        return stickyBubbleVO.copy(j12, z16, z12, (i11 & 8) != 0 ? stickyBubbleVO.isSelected : z13, (i11 & 16) != 0 ? stickyBubbleVO.isSubscribed : z14, (i11 & 32) != 0 ? stickyBubbleVO.isShrunk : z15, (i11 & 64) != 0 ? stickyBubbleVO.defaultState : stickyBubbleStateVO, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? stickyBubbleVO.selectedState : stickyBubbleStateVO2, (i11 & 256) != 0 ? stickyBubbleVO.selectedStateTimeout : num);
    }

    @NotNull
    public final StickyBubbleVO copy(long id2, boolean shouldShow, boolean isClicked, boolean isSelected, boolean isSubscribed, boolean isShrunk, @NotNull StickyBubbleStateVO defaultState, StickyBubbleStateVO selectedState, Integer selectedStateTimeout) {
        Intrinsics.checkNotNullParameter(defaultState, "defaultState");
        return new StickyBubbleVO(id2, shouldShow, isClicked, isSelected, isSubscribed, isShrunk, defaultState, selectedState, selectedStateTimeout);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StickyBubbleVO)) {
            return false;
        }
        StickyBubbleVO stickyBubbleVO = (StickyBubbleVO) other;
        return this.id == stickyBubbleVO.id && this.shouldShow == stickyBubbleVO.shouldShow && this.isClicked == stickyBubbleVO.isClicked && this.isSelected == stickyBubbleVO.isSelected && this.isSubscribed == stickyBubbleVO.isSubscribed && this.isShrunk == stickyBubbleVO.isShrunk && Intrinsics.d(this.defaultState, stickyBubbleVO.defaultState) && Intrinsics.d(this.selectedState, stickyBubbleVO.selectedState) && Intrinsics.d(this.selectedStateTimeout, stickyBubbleVO.selectedStateTimeout);
    }

    @NotNull
    public final StickyBubbleStateVO getDefaultState() {
        return this.defaultState;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final StickyBubbleStateVO getSelectedState() {
        return this.selectedState;
    }

    public final Integer getSelectedStateTimeout() {
        return this.selectedStateTimeout;
    }

    public final boolean getShouldShow() {
        return this.shouldShow;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.defaultState.hashCode() + C3532b.a(C3532b.a(C3532b.a(C3532b.a(C3532b.a(Long.hashCode(this.id) * 31, 31, this.shouldShow), 31, this.isClicked), 31, this.isSelected), 31, this.isSubscribed), 31, this.isShrunk)) * 31;
        StickyBubbleStateVO stickyBubbleStateVO = this.selectedState;
        int hashCode2 = (hashCode + (stickyBubbleStateVO == null ? 0 : stickyBubbleStateVO.hashCode())) * 31;
        Integer num = this.selectedStateTimeout;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    /* renamed from: isClicked, reason: from getter */
    public final boolean getIsClicked() {
        return this.isClicked;
    }

    /* renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* renamed from: isShrunk, reason: from getter */
    public final boolean getIsShrunk() {
        return this.isShrunk;
    }

    /* renamed from: isSubscribed, reason: from getter */
    public final boolean getIsSubscribed() {
        return this.isSubscribed;
    }

    public final void setClicked(boolean z11) {
        this.isClicked = z11;
    }

    public final void setShouldShow(boolean z11) {
        this.shouldShow = z11;
    }

    public final void setShrunk(boolean z11) {
        this.isShrunk = z11;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        boolean z11 = this.shouldShow;
        boolean z12 = this.isClicked;
        boolean z13 = this.isSelected;
        boolean z14 = this.isSubscribed;
        boolean z15 = this.isShrunk;
        StickyBubbleStateVO stickyBubbleStateVO = this.defaultState;
        StickyBubbleStateVO stickyBubbleStateVO2 = this.selectedState;
        Integer num = this.selectedStateTimeout;
        StringBuilder c11 = Bl.b.c(j11, "StickyBubbleVO(id=", ", shouldShow=", z11);
        C2436a.e(", isClicked=", ", isSelected=", c11, z12, z13);
        C2436a.e(", isSubscribed=", ", isShrunk=", c11, z14, z15);
        c11.append(", defaultState=");
        c11.append(stickyBubbleStateVO);
        c11.append(", selectedState=");
        c11.append(stickyBubbleStateVO2);
        c11.append(", selectedStateTimeout=");
        c11.append(num);
        c11.append(")");
        return c11.toString();
    }

    public /* synthetic */ StickyBubbleVO(long j11, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, StickyBubbleStateVO stickyBubbleStateVO, StickyBubbleStateVO stickyBubbleStateVO2, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? false : z12, z13, (i11 & 16) != 0 ? false : z14, (i11 & 32) != 0 ? true : z15, stickyBubbleStateVO, stickyBubbleStateVO2, num);
    }
}

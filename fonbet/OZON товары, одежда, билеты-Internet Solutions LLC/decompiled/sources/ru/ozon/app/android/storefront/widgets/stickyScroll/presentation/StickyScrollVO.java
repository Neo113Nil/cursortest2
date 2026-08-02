package ru.ozon.app.android.storefront.widgets.stickyScroll.presentation;

import Ak.C2436a;
import Bi.b;
import El.C2971a;
import G.g;
import Kk.C3532b;
import Nh.a;
import Ve.C4598rp;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002Bq\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u000e\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0088\u0001\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00072\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b.\u0010\u001aR\u001f\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b0\u00101R\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u00102\u001a\u0004\b7\u00104R\"\u0010\u0013\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u00102\u001a\u0004\b8\u00104\"\u0004\b9\u00106R\"\u0010\u0014\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u00102\u001a\u0004\b:\u00104\"\u0004\b;\u00106¨\u0006<"}, d2 = {"Lru/ozon/app/android/storefront/widgets/stickyScroll/presentation/StickyScrollVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "", "text", "backgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "anchorName", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "shouldShrink", "shouldBeGone", "hasShrunk", "hasGone", "<init>", "(JLru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;LWZ/t;ZZZZ)V", "copy", "(JLru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;LWZ/t;ZZZZ)Lru/ozon/app/android/storefront/widgets/stickyScroll/presentation/StickyScrollVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Ljava/lang/String;", "getText", "getBackgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getAnchorName", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Z", "getShouldShrink", "()Z", "setShouldShrink", "(Z)V", "getShouldBeGone", "getHasShrunk", "setHasShrunk", "getHasGone", "setHasGone", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class StickyScrollVO implements c {

    @NotNull
    private final AtomAction action;

    @NotNull
    private final String anchorName;
    private final String backgroundColor;
    private boolean hasGone;
    private boolean hasShrunk;

    @NotNull
    private final IconDTO icon;
    private final long id;
    private final boolean shouldBeGone;
    private boolean shouldShrink;

    @NotNull
    private final String text;
    private final t tokenizedEvent;

    public StickyScrollVO(long j11, @NotNull IconDTO icon, @NotNull String text, String str, @NotNull AtomAction action, @NotNull String anchorName, t tVar, boolean z11, boolean z12, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(anchorName, "anchorName");
        this.id = j11;
        this.icon = icon;
        this.text = text;
        this.backgroundColor = str;
        this.action = action;
        this.anchorName = anchorName;
        this.tokenizedEvent = tVar;
        this.shouldShrink = z11;
        this.shouldBeGone = z12;
        this.hasShrunk = z13;
        this.hasGone = z14;
    }

    public static /* synthetic */ StickyScrollVO copy$default(StickyScrollVO stickyScrollVO, long j11, IconDTO iconDTO, String str, String str2, AtomAction atomAction, String str3, t tVar, boolean z11, boolean z12, boolean z13, boolean z14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = stickyScrollVO.id;
        }
        return stickyScrollVO.copy(j11, (i11 & 2) != 0 ? stickyScrollVO.icon : iconDTO, (i11 & 4) != 0 ? stickyScrollVO.text : str, (i11 & 8) != 0 ? stickyScrollVO.backgroundColor : str2, (i11 & 16) != 0 ? stickyScrollVO.action : atomAction, (i11 & 32) != 0 ? stickyScrollVO.anchorName : str3, (i11 & 64) != 0 ? stickyScrollVO.tokenizedEvent : tVar, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? stickyScrollVO.shouldShrink : z11, (i11 & 256) != 0 ? stickyScrollVO.shouldBeGone : z12, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? stickyScrollVO.hasShrunk : z13, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? stickyScrollVO.hasGone : z14);
    }

    @NotNull
    public final StickyScrollVO copy(long id2, @NotNull IconDTO icon, @NotNull String text, String backgroundColor, @NotNull AtomAction action, @NotNull String anchorName, t tokenizedEvent, boolean shouldShrink, boolean shouldBeGone, boolean hasShrunk, boolean hasGone) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(anchorName, "anchorName");
        return new StickyScrollVO(id2, icon, text, backgroundColor, action, anchorName, tokenizedEvent, shouldShrink, shouldBeGone, hasShrunk, hasGone);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StickyScrollVO)) {
            return false;
        }
        StickyScrollVO stickyScrollVO = (StickyScrollVO) other;
        return this.id == stickyScrollVO.id && Intrinsics.d(this.icon, stickyScrollVO.icon) && Intrinsics.d(this.text, stickyScrollVO.text) && Intrinsics.d(this.backgroundColor, stickyScrollVO.backgroundColor) && Intrinsics.d(this.action, stickyScrollVO.action) && Intrinsics.d(this.anchorName, stickyScrollVO.anchorName) && Intrinsics.d(this.tokenizedEvent, stickyScrollVO.tokenizedEvent) && this.shouldShrink == stickyScrollVO.shouldShrink && this.shouldBeGone == stickyScrollVO.shouldBeGone && this.hasShrunk == stickyScrollVO.hasShrunk && this.hasGone == stickyScrollVO.hasGone;
    }

    @NotNull
    public final AtomAction getAction() {
        return this.action;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final boolean getHasGone() {
        return this.hasGone;
    }

    public final boolean getHasShrunk() {
        return this.hasShrunk;
    }

    @NotNull
    public final IconDTO getIcon() {
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

    public final boolean getShouldBeGone() {
        return this.shouldBeGone;
    }

    public final boolean getShouldShrink() {
        return this.shouldShrink;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a(C2971a.a(this.icon, Long.hashCode(this.id) * 31, 31), 31, this.text);
        String str = this.backgroundColor;
        int a12 = g.a(C4598rp.a(this.action, (a11 + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.anchorName);
        t tVar = this.tokenizedEvent;
        return Boolean.hashCode(this.hasGone) + C3532b.a(C3532b.a(C3532b.a((a12 + (tVar != null ? tVar.hashCode() : 0)) * 31, 31, this.shouldShrink), 31, this.shouldBeGone), 31, this.hasShrunk);
    }

    public final void setHasGone(boolean z11) {
        this.hasGone = z11;
    }

    public final void setHasShrunk(boolean z11) {
        this.hasShrunk = z11;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        IconDTO iconDTO = this.icon;
        String str = this.text;
        String str2 = this.backgroundColor;
        AtomAction atomAction = this.action;
        String str3 = this.anchorName;
        t tVar = this.tokenizedEvent;
        boolean z11 = this.shouldShrink;
        boolean z12 = this.shouldBeGone;
        boolean z13 = this.hasShrunk;
        boolean z14 = this.hasGone;
        StringBuilder b11 = D40.c.b("StickyScrollVO(id=", j11, ", icon=", iconDTO);
        a.h(b11, ", text=", str, ", backgroundColor=", str2);
        b11.append(", action=");
        b11.append(atomAction);
        b11.append(", anchorName=");
        b11.append(str3);
        b11.append(", tokenizedEvent=");
        b11.append(tVar);
        b11.append(", shouldShrink=");
        b11.append(z11);
        C2436a.e(", shouldBeGone=", ", hasShrunk=", b11, z12, z13);
        return b.f(b11, ", hasGone=", z14, ")");
    }

    public /* synthetic */ StickyScrollVO(long j11, IconDTO iconDTO, String str, String str2, AtomAction atomAction, String str3, t tVar, boolean z11, boolean z12, boolean z13, boolean z14, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, iconDTO, str, str2, atomAction, str3, tVar, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? false : z11, (i11 & 256) != 0 ? false : z12, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : z13, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? false : z14);
    }
}

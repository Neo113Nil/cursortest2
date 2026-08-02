package ru.ozon.app.android.monetization.widgets.unreadMessageIndicator.presentation;

import GR.b;
import Ih.a;
import Kk.C3532b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.navBar.v2.NavbarIconVO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002BI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J`\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b%\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+R\u001f\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"Lru/ozon/app/android/monetization/widgets/unreadMessageIndicator/presentation/UnreadMessageIndicatorVI;", "Lru/ozon/app/android/storefront/navBar/v2/NavbarIconVO;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "defaultStateButton", "unreadStateButton", "", "hasUnreadMessages", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "fetchAction", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "<init>", "(JLru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;ZLru/ozon/uni/atoms/data/AtomActionDTO;LWZ/t;Lru/ozon/uni/atoms/data/TestInfo;)V", "copy", "(JLru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;ZLru/ozon/uni/atoms/data/AtomActionDTO;LWZ/t;Lru/ozon/uni/atoms/data/TestInfo;)Lru/ozon/app/android/monetization/widgets/unreadMessageIndicator/presentation/UnreadMessageIndicatorVI;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getDefaultStateButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getUnreadStateButton", "Z", "getHasUnreadMessages", "()Z", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getFetchAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class UnreadMessageIndicatorVI implements NavbarIconVO, c {

    @NotNull
    private final IconButtonV3DTO defaultStateButton;

    @NotNull
    private final AtomActionDTO fetchAction;
    private final boolean hasUnreadMessages;
    private final long id;
    private final TestInfo testInfo;
    private final t tokenizedEvent;

    @NotNull
    private final IconButtonV3DTO unreadStateButton;

    public UnreadMessageIndicatorVI(long j11, @NotNull IconButtonV3DTO defaultStateButton, @NotNull IconButtonV3DTO unreadStateButton, boolean z11, @NotNull AtomActionDTO fetchAction, t tVar, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(defaultStateButton, "defaultStateButton");
        Intrinsics.checkNotNullParameter(unreadStateButton, "unreadStateButton");
        Intrinsics.checkNotNullParameter(fetchAction, "fetchAction");
        this.id = j11;
        this.defaultStateButton = defaultStateButton;
        this.unreadStateButton = unreadStateButton;
        this.hasUnreadMessages = z11;
        this.fetchAction = fetchAction;
        this.tokenizedEvent = tVar;
        this.testInfo = testInfo;
    }

    public static /* synthetic */ UnreadMessageIndicatorVI copy$default(UnreadMessageIndicatorVI unreadMessageIndicatorVI, long j11, IconButtonV3DTO iconButtonV3DTO, IconButtonV3DTO iconButtonV3DTO2, boolean z11, AtomActionDTO atomActionDTO, t tVar, TestInfo testInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = unreadMessageIndicatorVI.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            iconButtonV3DTO = unreadMessageIndicatorVI.defaultStateButton;
        }
        IconButtonV3DTO iconButtonV3DTO3 = iconButtonV3DTO;
        if ((i11 & 4) != 0) {
            iconButtonV3DTO2 = unreadMessageIndicatorVI.unreadStateButton;
        }
        IconButtonV3DTO iconButtonV3DTO4 = iconButtonV3DTO2;
        if ((i11 & 8) != 0) {
            z11 = unreadMessageIndicatorVI.hasUnreadMessages;
        }
        boolean z12 = z11;
        if ((i11 & 16) != 0) {
            atomActionDTO = unreadMessageIndicatorVI.fetchAction;
        }
        return unreadMessageIndicatorVI.copy(j12, iconButtonV3DTO3, iconButtonV3DTO4, z12, atomActionDTO, (i11 & 32) != 0 ? unreadMessageIndicatorVI.tokenizedEvent : tVar, (i11 & 64) != 0 ? unreadMessageIndicatorVI.testInfo : testInfo);
    }

    @NotNull
    public final UnreadMessageIndicatorVI copy(long id2, @NotNull IconButtonV3DTO defaultStateButton, @NotNull IconButtonV3DTO unreadStateButton, boolean hasUnreadMessages, @NotNull AtomActionDTO fetchAction, t tokenizedEvent, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(defaultStateButton, "defaultStateButton");
        Intrinsics.checkNotNullParameter(unreadStateButton, "unreadStateButton");
        Intrinsics.checkNotNullParameter(fetchAction, "fetchAction");
        return new UnreadMessageIndicatorVI(id2, defaultStateButton, unreadStateButton, hasUnreadMessages, fetchAction, tokenizedEvent, testInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnreadMessageIndicatorVI)) {
            return false;
        }
        UnreadMessageIndicatorVI unreadMessageIndicatorVI = (UnreadMessageIndicatorVI) other;
        return this.id == unreadMessageIndicatorVI.id && Intrinsics.d(this.defaultStateButton, unreadMessageIndicatorVI.defaultStateButton) && Intrinsics.d(this.unreadStateButton, unreadMessageIndicatorVI.unreadStateButton) && this.hasUnreadMessages == unreadMessageIndicatorVI.hasUnreadMessages && Intrinsics.d(this.fetchAction, unreadMessageIndicatorVI.fetchAction) && Intrinsics.d(this.tokenizedEvent, unreadMessageIndicatorVI.tokenizedEvent) && Intrinsics.d(this.testInfo, unreadMessageIndicatorVI.testInfo);
    }

    @NotNull
    public final IconButtonV3DTO getDefaultStateButton() {
        return this.defaultStateButton;
    }

    @NotNull
    public final AtomActionDTO getFetchAction() {
        return this.fetchAction;
    }

    public final boolean getHasUnreadMessages() {
        return this.hasUnreadMessages;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @NotNull
    public final IconButtonV3DTO getUnreadStateButton() {
        return this.unreadStateButton;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = a.b(this.fetchAction, C3532b.a(b.c(this.unreadStateButton, b.c(this.defaultStateButton, Long.hashCode(this.id) * 31, 31), 31), 31, this.hasUnreadMessages), 31);
        t tVar = this.tokenizedEvent;
        int hashCode = (b11 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode + (testInfo != null ? testInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UnreadMessageIndicatorVI(id=" + this.id + ", defaultStateButton=" + this.defaultStateButton + ", unreadStateButton=" + this.unreadStateButton + ", hasUnreadMessages=" + this.hasUnreadMessages + ", fetchAction=" + this.fetchAction + ", tokenizedEvent=" + this.tokenizedEvent + ", testInfo=" + this.testInfo + ")";
    }
}

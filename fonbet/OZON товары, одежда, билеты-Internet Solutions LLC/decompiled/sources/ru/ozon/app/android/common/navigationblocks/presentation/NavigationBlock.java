package ru.ozon.app.android.common.navigationblocks.presentation;

import De.C2859b;
import G.g;
import Nh.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.Icon;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001d\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001e\u0010\u0010R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/common/navigationblocks/presentation/NavigationBlock;", "", "Lru/ozon/uni/atoms/data/button/Icon;", "icon", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "backgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(Lru/ozon/uni/atoms/data/button/Icon;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/button/Icon;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "Ljava/lang/String;", "getTitle", "getSubtitle", "getBackgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "navigation-blocks_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class NavigationBlock {
    private final AtomAction action;
    private final String backgroundColor;

    @NotNull
    private final Icon icon;

    @NotNull
    private final String subtitle;

    @NotNull
    private final String title;
    private final t tokenizedEvent;

    public NavigationBlock(@NotNull Icon icon, @NotNull String title, @NotNull String subtitle, String str, AtomAction atomAction, t tVar) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.icon = icon;
        this.title = title;
        this.subtitle = subtitle;
        this.backgroundColor = str;
        this.action = atomAction;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigationBlock)) {
            return false;
        }
        NavigationBlock navigationBlock = (NavigationBlock) other;
        return Intrinsics.d(this.icon, navigationBlock.icon) && Intrinsics.d(this.title, navigationBlock.title) && Intrinsics.d(this.subtitle, navigationBlock.subtitle) && Intrinsics.d(this.backgroundColor, navigationBlock.backgroundColor) && Intrinsics.d(this.action, navigationBlock.action) && Intrinsics.d(this.tokenizedEvent, navigationBlock.tokenizedEvent);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final Icon getIcon() {
        return this.icon;
    }

    @NotNull
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

    public int hashCode() {
        int a11 = g.a(g.a(this.icon.hashCode() * 31, 31, this.title), 31, this.subtitle);
        String str = this.backgroundColor;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        AtomAction atomAction = this.action;
        int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Icon icon = this.icon;
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.backgroundColor;
        AtomAction atomAction = this.action;
        t tVar = this.tokenizedEvent;
        StringBuilder sb2 = new StringBuilder("NavigationBlock(icon=");
        sb2.append(icon);
        sb2.append(", title=");
        sb2.append(str);
        sb2.append(", subtitle=");
        a.h(sb2, str2, ", backgroundColor=", str3, ", action=");
        return C2859b.e(tVar, ", tokenizedEvent=", ")", sb2, atomAction);
    }
}

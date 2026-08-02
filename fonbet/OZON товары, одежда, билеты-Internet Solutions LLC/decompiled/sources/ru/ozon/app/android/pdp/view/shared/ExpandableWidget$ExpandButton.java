package ru.ozon.app.android.pdp.view.shared;

import Lc.a;
import Ns.b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0011R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"ru/ozon/app/android/pdp/view/shared/ExpandableWidget$ExpandButton", "", "", "collapsedContentHeight", "expandedContentHeight", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/uni/atoms/data/button/Icon;", "icon", "LWZ/t;", "tokenizedEvent", "<init>", "(ILjava/lang/Integer;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/button/Icon;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getCollapsedContentHeight", "Ljava/lang/Integer;", "getExpandedContentHeight", "()Ljava/lang/Integer;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/button/Icon;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ExpandableWidget$ExpandButton {
    private final int collapsedContentHeight;
    private final Integer expandedContentHeight;

    @NotNull
    private final Icon icon;

    @NotNull
    private final TextDTO text;
    private final t tokenizedEvent;

    public ExpandableWidget$ExpandButton(int i11, Integer num, @NotNull TextDTO text, @NotNull Icon icon, t tVar) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.collapsedContentHeight = i11;
        this.expandedContentHeight = num;
        this.text = text;
        this.icon = icon;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpandableWidget$ExpandButton)) {
            return false;
        }
        ExpandableWidget$ExpandButton expandableWidget$ExpandButton = (ExpandableWidget$ExpandButton) other;
        return this.collapsedContentHeight == expandableWidget$ExpandButton.collapsedContentHeight && Intrinsics.d(this.expandedContentHeight, expandableWidget$ExpandButton.expandedContentHeight) && Intrinsics.d(this.text, expandableWidget$ExpandButton.text) && Intrinsics.d(this.icon, expandableWidget$ExpandButton.icon) && Intrinsics.d(this.tokenizedEvent, expandableWidget$ExpandButton.tokenizedEvent);
    }

    public final int getCollapsedContentHeight() {
        return this.collapsedContentHeight;
    }

    public final Integer getExpandedContentHeight() {
        return this.expandedContentHeight;
    }

    @NotNull
    public final Icon getIcon() {
        return this.icon;
    }

    @NotNull
    public final TextDTO getText() {
        return this.text;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.collapsedContentHeight) * 31;
        Integer num = this.expandedContentHeight;
        int a11 = a.a(this.icon, b.a(this.text, (hashCode + (num == null ? 0 : num.hashCode())) * 31, 31), 31);
        t tVar = this.tokenizedEvent;
        return a11 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i11 = this.collapsedContentHeight;
        Integer num = this.expandedContentHeight;
        TextDTO textDTO = this.text;
        Icon icon = this.icon;
        t tVar = this.tokenizedEvent;
        StringBuilder sb2 = new StringBuilder("ExpandButton(collapsedContentHeight=");
        sb2.append(i11);
        sb2.append(", expandedContentHeight=");
        sb2.append(num);
        sb2.append(", text=");
        sb2.append(textDTO);
        sb2.append(", icon=");
        sb2.append(icon);
        sb2.append(", tokenizedEvent=");
        return Tl.b.d(sb2, tVar, ")");
    }
}

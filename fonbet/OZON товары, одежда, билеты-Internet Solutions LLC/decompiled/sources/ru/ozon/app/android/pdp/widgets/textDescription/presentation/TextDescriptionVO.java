package ru.ozon.app.android.pdp.widgets.textDescription.presentation;

import Ak.C2436a;
import D3.h;
import G.g;
import Kk.C3532b;
import Ns.b;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedViewObject;
import ru.ozon.app.android.pdp.view.shared.ExpandableWidget$ExpandButton;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b \b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002BY\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014Jp\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u0011HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b\n\u0010'R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b+\u0010\u0018R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010&\u001a\u0004\b\u0010\u0010'R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010/\u001a\u0004\b0\u0010\u001a¨\u00061"}, d2 = {"Lru/ozon/app/android/pdp/widgets/textDescription/presentation/TextDescriptionVO;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/tab/TabEmbeddedViewObject;", "", "", "id", "", "tabGroupId", "Lru/ozon/app/android/pdp/view/shared/ExpandableWidget$ExpandButton;", "expandButton", "", "isExpanded", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "backgroundColor", "LWZ/t;", "tokenizedEvent", "isLoading", "", "loaderTopPadding", "<init>", "(JLjava/lang/String;Lru/ozon/app/android/pdp/view/shared/ExpandableWidget$ExpandButton;ZLru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;LWZ/t;ZI)V", "copy", "(JLjava/lang/String;Lru/ozon/app/android/pdp/view/shared/ExpandableWidget$ExpandButton;ZLru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;LWZ/t;ZI)Lru/ozon/app/android/pdp/widgets/textDescription/presentation/TextDescriptionVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTabGroupId", "Lru/ozon/app/android/pdp/view/shared/ExpandableWidget$ExpandButton;", "getExpandButton", "()Lru/ozon/app/android/pdp/view/shared/ExpandableWidget$ExpandButton;", "Z", "()Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBackgroundColor", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "I", "getLoaderTopPadding", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TextDescriptionVO implements TabEmbeddedViewObject {

    @NotNull
    private final String backgroundColor;
    private final ExpandableWidget$ExpandButton expandButton;
    private final long id;
    private final boolean isExpanded;
    private final boolean isLoading;
    private final int loaderTopPadding;
    private final String tabGroupId;

    @NotNull
    private final TextDTO text;
    private final t tokenizedEvent;

    public TextDescriptionVO(long j11, String str, ExpandableWidget$ExpandButton expandableWidget$ExpandButton, boolean z11, @NotNull TextDTO text, @NotNull String backgroundColor, t tVar, boolean z12, int i11) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.id = j11;
        this.tabGroupId = str;
        this.expandButton = expandableWidget$ExpandButton;
        this.isExpanded = z11;
        this.text = text;
        this.backgroundColor = backgroundColor;
        this.tokenizedEvent = tVar;
        this.isLoading = z12;
        this.loaderTopPadding = i11;
    }

    public static /* synthetic */ TextDescriptionVO copy$default(TextDescriptionVO textDescriptionVO, long j11, String str, ExpandableWidget$ExpandButton expandableWidget$ExpandButton, boolean z11, TextDTO textDTO, String str2, t tVar, boolean z12, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = textDescriptionVO.id;
        }
        long j12 = j11;
        if ((i12 & 2) != 0) {
            str = textDescriptionVO.tabGroupId;
        }
        String str3 = str;
        if ((i12 & 4) != 0) {
            expandableWidget$ExpandButton = textDescriptionVO.expandButton;
        }
        return textDescriptionVO.copy(j12, str3, expandableWidget$ExpandButton, (i12 & 8) != 0 ? textDescriptionVO.isExpanded : z11, (i12 & 16) != 0 ? textDescriptionVO.text : textDTO, (i12 & 32) != 0 ? textDescriptionVO.backgroundColor : str2, (i12 & 64) != 0 ? textDescriptionVO.tokenizedEvent : tVar, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? textDescriptionVO.isLoading : z12, (i12 & 256) != 0 ? textDescriptionVO.loaderTopPadding : i11);
    }

    @NotNull
    public final TextDescriptionVO copy(long id2, String tabGroupId, ExpandableWidget$ExpandButton expandButton, boolean isExpanded, @NotNull TextDTO text, @NotNull String backgroundColor, t tokenizedEvent, boolean isLoading, int loaderTopPadding) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        return new TextDescriptionVO(id2, tabGroupId, expandButton, isExpanded, text, backgroundColor, tokenizedEvent, isLoading, loaderTopPadding);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextDescriptionVO)) {
            return false;
        }
        TextDescriptionVO textDescriptionVO = (TextDescriptionVO) other;
        return this.id == textDescriptionVO.id && Intrinsics.d(this.tabGroupId, textDescriptionVO.tabGroupId) && Intrinsics.d(this.expandButton, textDescriptionVO.expandButton) && this.isExpanded == textDescriptionVO.isExpanded && Intrinsics.d(this.text, textDescriptionVO.text) && Intrinsics.d(this.backgroundColor, textDescriptionVO.backgroundColor) && Intrinsics.d(this.tokenizedEvent, textDescriptionVO.tokenizedEvent) && this.isLoading == textDescriptionVO.isLoading && this.loaderTopPadding == textDescriptionVO.loaderTopPadding;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public ExpandableWidget$ExpandButton getExpandButton() {
        return this.expandButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final int getLoaderTopPadding() {
        return this.loaderTopPadding;
    }

    @Override // l20.c
    @NotNull
    public Integer getScrollWidgetKey() {
        return TabEmbeddedViewObject.DefaultImpls.getScrollWidgetKey(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedViewObject
    public String getTabGroupId() {
        return this.tabGroupId;
    }

    @NotNull
    public final TextDTO getText() {
        return this.text;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return TabEmbeddedViewObject.DefaultImpls.getViewItemKey(this);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.tabGroupId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ExpandableWidget$ExpandButton expandableWidget$ExpandButton = this.expandButton;
        int a11 = g.a(b.a(this.text, C3532b.a((hashCode2 + (expandableWidget$ExpandButton == null ? 0 : expandableWidget$ExpandButton.hashCode())) * 31, 31, this.isExpanded), 31), 31, this.backgroundColor);
        t tVar = this.tokenizedEvent;
        return Integer.hashCode(this.loaderTopPadding) + C3532b.a((a11 + (tVar != null ? tVar.hashCode() : 0)) * 31, 31, this.isLoading);
    }

    /* renamed from: isExpanded, reason: from getter */
    public boolean getIsExpanded() {
        return this.isExpanded;
    }

    /* renamed from: isLoading, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.tabGroupId;
        ExpandableWidget$ExpandButton expandableWidget$ExpandButton = this.expandButton;
        boolean z11 = this.isExpanded;
        TextDTO textDTO = this.text;
        String str2 = this.backgroundColor;
        t tVar = this.tokenizedEvent;
        boolean z12 = this.isLoading;
        int i11 = this.loaderTopPadding;
        StringBuilder c11 = C2436a.c(j11, "TextDescriptionVO(id=", ", tabGroupId=", str);
        c11.append(", expandButton=");
        c11.append(expandableWidget$ExpandButton);
        c11.append(", isExpanded=");
        c11.append(z11);
        c11.append(", text=");
        c11.append(textDTO);
        c11.append(", backgroundColor=");
        c11.append(str2);
        c11.append(", tokenizedEvent=");
        c11.append(tVar);
        c11.append(", isLoading=");
        c11.append(z12);
        return h.b(c11, ", loaderTopPadding=", i11, ")");
    }

    public /* synthetic */ TextDescriptionVO(long j11, String str, ExpandableWidget$ExpandButton expandableWidget$ExpandButton, boolean z11, TextDTO textDTO, String str2, t tVar, boolean z12, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, str, expandableWidget$ExpandButton, z11, textDTO, str2, tVar, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? false : z12, (i12 & 256) != 0 ? 0 : i11);
    }
}

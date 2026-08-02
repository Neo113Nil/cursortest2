package ru.ozon.app.android.pdp.widgets.descriptionAccordion.presentation;

import G.g;
import K1.G;
import Kk.C3532b;
import Ns.b;
import Pk0.a;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedViewObject;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0081\b\u0018\u00002\u00020\u0001:\u00014Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014J|\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b%\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010\u0018R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b\f\u0010,R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b0\u0010\u0018R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0012\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010+\u001a\u0004\b\u0012\u0010,¨\u00065"}, d2 = {"Lru/ozon/app/android/pdp/widgets/descriptionAccordion/presentation/DescriptionAccordionVO;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/tab/TabEmbeddedViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/app/android/pdp/widgets/descriptionAccordion/presentation/DescriptionAccordionVO$Icon;", "icon", "", "backgroundColor", "", "isShowSeparator", "LWZ/t;", "tokenizedEvent", "tabGroupId", "", "disclosureSubtitleHeight", "isLoading", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/pdp/widgets/descriptionAccordion/presentation/DescriptionAccordionVO$Icon;Ljava/lang/String;ZLWZ/t;Ljava/lang/String;Ljava/lang/Integer;Z)V", "copy", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/pdp/widgets/descriptionAccordion/presentation/DescriptionAccordionVO$Icon;Ljava/lang/String;ZLWZ/t;Ljava/lang/String;Ljava/lang/Integer;Z)Lru/ozon/app/android/pdp/widgets/descriptionAccordion/presentation/DescriptionAccordionVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/app/android/pdp/widgets/descriptionAccordion/presentation/DescriptionAccordionVO$Icon;", "getIcon", "()Lru/ozon/app/android/pdp/widgets/descriptionAccordion/presentation/DescriptionAccordionVO$Icon;", "Ljava/lang/String;", "getBackgroundColor", "Z", "()Z", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "getTabGroupId", "Ljava/lang/Integer;", "getDisclosureSubtitleHeight", "()Ljava/lang/Integer;", "Icon", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DescriptionAccordionVO implements TabEmbeddedViewObject {

    @NotNull
    private final String backgroundColor;
    private final Integer disclosureSubtitleHeight;

    @NotNull
    private final Icon icon;
    private final long id;
    private final boolean isLoading;
    private final boolean isShowSeparator;
    private final TextDTO subtitle;
    private final String tabGroupId;

    @NotNull
    private final TextDTO title;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0003\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0006\u0010\u0014¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/widgets/descriptionAccordion/presentation/DescriptionAccordionVO$Icon;", "", "", "isDisclosureOpen", "", "disclosureTintColor", "isShowIcon", "<init>", "(ZLjava/lang/String;Z)V", "copy", "(ZLjava/lang/String;Z)Lru/ozon/app/android/pdp/widgets/descriptionAccordion/presentation/DescriptionAccordionVO$Icon;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "Ljava/lang/String;", "getDisclosureTintColor", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Icon {

        @NotNull
        private final String disclosureTintColor;
        private final boolean isDisclosureOpen;
        private final boolean isShowIcon;

        public Icon(boolean z11, @NotNull String disclosureTintColor, boolean z12) {
            Intrinsics.checkNotNullParameter(disclosureTintColor, "disclosureTintColor");
            this.isDisclosureOpen = z11;
            this.disclosureTintColor = disclosureTintColor;
            this.isShowIcon = z12;
        }

        public static /* synthetic */ Icon copy$default(Icon icon, boolean z11, String str, boolean z12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = icon.isDisclosureOpen;
            }
            if ((i11 & 2) != 0) {
                str = icon.disclosureTintColor;
            }
            if ((i11 & 4) != 0) {
                z12 = icon.isShowIcon;
            }
            return icon.copy(z11, str, z12);
        }

        @NotNull
        public final Icon copy(boolean isDisclosureOpen, @NotNull String disclosureTintColor, boolean isShowIcon) {
            Intrinsics.checkNotNullParameter(disclosureTintColor, "disclosureTintColor");
            return new Icon(isDisclosureOpen, disclosureTintColor, isShowIcon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Icon)) {
                return false;
            }
            Icon icon = (Icon) other;
            return this.isDisclosureOpen == icon.isDisclosureOpen && Intrinsics.d(this.disclosureTintColor, icon.disclosureTintColor) && this.isShowIcon == icon.isShowIcon;
        }

        @NotNull
        public final String getDisclosureTintColor() {
            return this.disclosureTintColor;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isShowIcon) + g.a(Boolean.hashCode(this.isDisclosureOpen) * 31, 31, this.disclosureTintColor);
        }

        /* renamed from: isDisclosureOpen, reason: from getter */
        public final boolean getIsDisclosureOpen() {
            return this.isDisclosureOpen;
        }

        /* renamed from: isShowIcon, reason: from getter */
        public final boolean getIsShowIcon() {
            return this.isShowIcon;
        }

        @NotNull
        public String toString() {
            boolean z11 = this.isDisclosureOpen;
            String str = this.disclosureTintColor;
            return a.a(")", G.d("Icon(isDisclosureOpen=", ", disclosureTintColor=", str, ", isShowIcon=", z11), this.isShowIcon);
        }
    }

    public DescriptionAccordionVO(long j11, @NotNull TextDTO title, TextDTO textDTO, @NotNull Icon icon, @NotNull String backgroundColor, boolean z11, t tVar, String str, Integer num, boolean z12) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.id = j11;
        this.title = title;
        this.subtitle = textDTO;
        this.icon = icon;
        this.backgroundColor = backgroundColor;
        this.isShowSeparator = z11;
        this.tokenizedEvent = tVar;
        this.tabGroupId = str;
        this.disclosureSubtitleHeight = num;
        this.isLoading = z12;
    }

    public static /* synthetic */ DescriptionAccordionVO copy$default(DescriptionAccordionVO descriptionAccordionVO, long j11, TextDTO textDTO, TextDTO textDTO2, Icon icon, String str, boolean z11, t tVar, String str2, Integer num, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = descriptionAccordionVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            textDTO = descriptionAccordionVO.title;
        }
        return descriptionAccordionVO.copy(j12, textDTO, (i11 & 4) != 0 ? descriptionAccordionVO.subtitle : textDTO2, (i11 & 8) != 0 ? descriptionAccordionVO.icon : icon, (i11 & 16) != 0 ? descriptionAccordionVO.backgroundColor : str, (i11 & 32) != 0 ? descriptionAccordionVO.isShowSeparator : z11, (i11 & 64) != 0 ? descriptionAccordionVO.tokenizedEvent : tVar, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? descriptionAccordionVO.tabGroupId : str2, (i11 & 256) != 0 ? descriptionAccordionVO.disclosureSubtitleHeight : num, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? descriptionAccordionVO.isLoading : z12);
    }

    @NotNull
    public final DescriptionAccordionVO copy(long id2, @NotNull TextDTO title, TextDTO subtitle, @NotNull Icon icon, @NotNull String backgroundColor, boolean isShowSeparator, t tokenizedEvent, String tabGroupId, Integer disclosureSubtitleHeight, boolean isLoading) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        return new DescriptionAccordionVO(id2, title, subtitle, icon, backgroundColor, isShowSeparator, tokenizedEvent, tabGroupId, disclosureSubtitleHeight, isLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DescriptionAccordionVO)) {
            return false;
        }
        DescriptionAccordionVO descriptionAccordionVO = (DescriptionAccordionVO) other;
        return this.id == descriptionAccordionVO.id && Intrinsics.d(this.title, descriptionAccordionVO.title) && Intrinsics.d(this.subtitle, descriptionAccordionVO.subtitle) && Intrinsics.d(this.icon, descriptionAccordionVO.icon) && Intrinsics.d(this.backgroundColor, descriptionAccordionVO.backgroundColor) && this.isShowSeparator == descriptionAccordionVO.isShowSeparator && Intrinsics.d(this.tokenizedEvent, descriptionAccordionVO.tokenizedEvent) && Intrinsics.d(this.tabGroupId, descriptionAccordionVO.tabGroupId) && Intrinsics.d(this.disclosureSubtitleHeight, descriptionAccordionVO.disclosureSubtitleHeight) && this.isLoading == descriptionAccordionVO.isLoading;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Integer getDisclosureSubtitleHeight() {
        return this.disclosureSubtitleHeight;
    }

    @NotNull
    public final Icon getIcon() {
        return this.icon;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    @NotNull
    public Integer getScrollWidgetKey() {
        return TabEmbeddedViewObject.DefaultImpls.getScrollWidgetKey(this);
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedViewObject
    public String getTabGroupId() {
        return this.tabGroupId;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return TabEmbeddedViewObject.DefaultImpls.getViewItemKey(this);
    }

    public int hashCode() {
        int a11 = b.a(this.title, Long.hashCode(this.id) * 31, 31);
        TextDTO textDTO = this.subtitle;
        int a12 = C3532b.a(g.a((this.icon.hashCode() + ((a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31)) * 31, 31, this.backgroundColor), 31, this.isShowSeparator);
        t tVar = this.tokenizedEvent;
        int hashCode = (a12 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        String str = this.tabGroupId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.disclosureSubtitleHeight;
        return Boolean.hashCode(this.isLoading) + ((hashCode2 + (num != null ? num.hashCode() : 0)) * 31);
    }

    /* renamed from: isLoading, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: isShowSeparator, reason: from getter */
    public final boolean getIsShowSeparator() {
        return this.isShowSeparator;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        Icon icon = this.icon;
        String str = this.backgroundColor;
        boolean z11 = this.isShowSeparator;
        t tVar = this.tokenizedEvent;
        String str2 = this.tabGroupId;
        Integer num = this.disclosureSubtitleHeight;
        boolean z12 = this.isLoading;
        StringBuilder b11 = TY.a.b("DescriptionAccordionVO(id=", j11, ", title=", textDTO);
        b11.append(", subtitle=");
        b11.append(textDTO2);
        b11.append(", icon=");
        b11.append(icon);
        D40.a.g(", backgroundColor=", str, ", isShowSeparator=", b11, z11);
        b11.append(", tokenizedEvent=");
        b11.append(tVar);
        b11.append(", tabGroupId=");
        b11.append(str2);
        b11.append(", disclosureSubtitleHeight=");
        b11.append(num);
        b11.append(", isLoading=");
        b11.append(z12);
        b11.append(")");
        return b11.toString();
    }

    public /* synthetic */ DescriptionAccordionVO(long j11, TextDTO textDTO, TextDTO textDTO2, Icon icon, String str, boolean z11, t tVar, String str2, Integer num, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, textDTO, textDTO2, icon, str, z11, tVar, str2, num, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : z12);
    }
}

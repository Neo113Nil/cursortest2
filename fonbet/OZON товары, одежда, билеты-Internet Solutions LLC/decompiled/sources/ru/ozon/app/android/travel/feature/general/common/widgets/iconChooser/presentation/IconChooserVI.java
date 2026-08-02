package ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.presentation;

import C.o0;
import G.g;
import N3.C3660k;
import WZ.t;
import Xc.a;
import Xc.b;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.data.IconChooserDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0081\b\u0018\u00002\u00020\u0001:\u0003123BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\\\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000eHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010-R\u001f\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b/\u00100¨\u00064"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI$IconSelectorVI;", "iconSelectors", "Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/data/IconChooserDTO$SelectedStyle;", "selectedStyle", "Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI$EnabledStyle;", "enabledStyle", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/data/IconChooserDTO$SelectedStyle;Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI$EnabledStyle;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "copy", "(JLru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/data/IconChooserDTO$SelectedStyle;Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI$EnabledStyle;LWZ/t;)Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/util/List;", "getIconSelectors", "()Ljava/util/List;", "Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/data/IconChooserDTO$SelectedStyle;", "getSelectedStyle", "()Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/data/IconChooserDTO$SelectedStyle;", "Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI$EnabledStyle;", "getEnabledStyle", "()Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI$EnabledStyle;", "LWZ/t;", "getViewEvent", "()LWZ/t;", "IconSelectorVI", "EnabledStyle", "IconEnum", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class IconChooserVI implements c {

    @NotNull
    private final EnabledStyle enabledStyle;

    @NotNull
    private final List<IconSelectorVI> iconSelectors;
    private final long id;

    @NotNull
    private final IconChooserDTO.SelectedStyle selectedStyle;
    private final TextDTO title;
    private final t viewEvent;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI$EnabledStyle;", "", "", "aspectBorderColor", "enabledTypographyToken", "enabledTextColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAspectBorderColor", "getEnabledTypographyToken", "getEnabledTextColor", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EnabledStyle {

        @NotNull
        private final String aspectBorderColor;

        @NotNull
        private final String enabledTextColor;

        @NotNull
        private final String enabledTypographyToken;

        public EnabledStyle(@NotNull String aspectBorderColor, @NotNull String enabledTypographyToken, @NotNull String enabledTextColor) {
            Intrinsics.checkNotNullParameter(aspectBorderColor, "aspectBorderColor");
            Intrinsics.checkNotNullParameter(enabledTypographyToken, "enabledTypographyToken");
            Intrinsics.checkNotNullParameter(enabledTextColor, "enabledTextColor");
            this.aspectBorderColor = aspectBorderColor;
            this.enabledTypographyToken = enabledTypographyToken;
            this.enabledTextColor = enabledTextColor;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EnabledStyle)) {
                return false;
            }
            EnabledStyle enabledStyle = (EnabledStyle) other;
            return Intrinsics.d(this.aspectBorderColor, enabledStyle.aspectBorderColor) && Intrinsics.d(this.enabledTypographyToken, enabledStyle.enabledTypographyToken) && Intrinsics.d(this.enabledTextColor, enabledStyle.enabledTextColor);
        }

        @NotNull
        public final String getAspectBorderColor() {
            return this.aspectBorderColor;
        }

        @NotNull
        public final String getEnabledTextColor() {
            return this.enabledTextColor;
        }

        @NotNull
        public final String getEnabledTypographyToken() {
            return this.enabledTypographyToken;
        }

        public int hashCode() {
            return this.enabledTextColor.hashCode() + g.a(this.aspectBorderColor.hashCode() * 31, 31, this.enabledTypographyToken);
        }

        @NotNull
        public String toString() {
            String str = this.aspectBorderColor;
            String str2 = this.enabledTypographyToken;
            return o0.c(C3660k.d("EnabledStyle(aspectBorderColor=", str, ", enabledTypographyToken=", str2, ", enabledTextColor="), this.enabledTextColor, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI$IconEnum;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "PREMIUM_1", "PREMIUM_2", "PREMIUM_3", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconEnum {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ IconEnum[] $VALUES;
        public static final IconEnum DEFAULT = new IconEnum("DEFAULT", 0);
        public static final IconEnum PREMIUM_1 = new IconEnum("PREMIUM_1", 1);
        public static final IconEnum PREMIUM_2 = new IconEnum("PREMIUM_2", 2);
        public static final IconEnum PREMIUM_3 = new IconEnum("PREMIUM_3", 3);

        private static final /* synthetic */ IconEnum[] $values() {
            return new IconEnum[]{DEFAULT, PREMIUM_1, PREMIUM_2, PREMIUM_3};
        }

        static {
            IconEnum[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private IconEnum(String str, int i11) {
        }

        public static IconEnum valueOf(String str) {
            return (IconEnum) Enum.valueOf(IconEnum.class, str);
        }

        public static IconEnum[] values() {
            return (IconEnum[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJB\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI$IconSelectorVI;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "aspect", "Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI$IconEnum;", "appIcon", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "clickEvent", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/aspect/AspectDTO;Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI$IconEnum;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "copy", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/aspect/AspectDTO;Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI$IconEnum;LWZ/t;)Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI$IconSelectorVI;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "getAspect", "()Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI$IconEnum;", "getAppIcon", "()Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI$IconEnum;", "LWZ/t;", "getClickEvent", "()LWZ/t;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IconSelectorVI {

        @NotNull
        private final IconEnum appIcon;
        private final AspectDTO aspect;
        private final t clickEvent;

        @NotNull
        private final TextDTO title;

        public IconSelectorVI(@NotNull TextDTO title, AspectDTO aspectDTO, @NotNull IconEnum appIcon, t tVar) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(appIcon, "appIcon");
            this.title = title;
            this.aspect = aspectDTO;
            this.appIcon = appIcon;
            this.clickEvent = tVar;
        }

        public static /* synthetic */ IconSelectorVI copy$default(IconSelectorVI iconSelectorVI, TextDTO textDTO, AspectDTO aspectDTO, IconEnum iconEnum, t tVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = iconSelectorVI.title;
            }
            if ((i11 & 2) != 0) {
                aspectDTO = iconSelectorVI.aspect;
            }
            if ((i11 & 4) != 0) {
                iconEnum = iconSelectorVI.appIcon;
            }
            if ((i11 & 8) != 0) {
                tVar = iconSelectorVI.clickEvent;
            }
            return iconSelectorVI.copy(textDTO, aspectDTO, iconEnum, tVar);
        }

        @NotNull
        public final IconSelectorVI copy(@NotNull TextDTO title, AspectDTO aspect, @NotNull IconEnum appIcon, t clickEvent) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(appIcon, "appIcon");
            return new IconSelectorVI(title, aspect, appIcon, clickEvent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IconSelectorVI)) {
                return false;
            }
            IconSelectorVI iconSelectorVI = (IconSelectorVI) other;
            return Intrinsics.d(this.title, iconSelectorVI.title) && Intrinsics.d(this.aspect, iconSelectorVI.aspect) && this.appIcon == iconSelectorVI.appIcon && Intrinsics.d(this.clickEvent, iconSelectorVI.clickEvent);
        }

        @NotNull
        public final IconEnum getAppIcon() {
            return this.appIcon;
        }

        public final AspectDTO getAspect() {
            return this.aspect;
        }

        public final t getClickEvent() {
            return this.clickEvent;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            AspectDTO aspectDTO = this.aspect;
            int hashCode2 = (this.appIcon.hashCode() + ((hashCode + (aspectDTO == null ? 0 : aspectDTO.hashCode())) * 31)) * 31;
            t tVar = this.clickEvent;
            return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            OzonSpannableString text = this.title.getText();
            return this + "@IconSelectorVI with " + ((Object) text) + " " + this.title.getTextColor() + " " + this.title.getTypographyToken() + ", aspect=" + this.aspect;
        }
    }

    public IconChooserVI(long j11, TextDTO textDTO, @NotNull List<IconSelectorVI> iconSelectors, @NotNull IconChooserDTO.SelectedStyle selectedStyle, @NotNull EnabledStyle enabledStyle, t tVar) {
        Intrinsics.checkNotNullParameter(iconSelectors, "iconSelectors");
        Intrinsics.checkNotNullParameter(selectedStyle, "selectedStyle");
        Intrinsics.checkNotNullParameter(enabledStyle, "enabledStyle");
        this.id = j11;
        this.title = textDTO;
        this.iconSelectors = iconSelectors;
        this.selectedStyle = selectedStyle;
        this.enabledStyle = enabledStyle;
        this.viewEvent = tVar;
    }

    public static /* synthetic */ IconChooserVI copy$default(IconChooserVI iconChooserVI, long j11, TextDTO textDTO, List list, IconChooserDTO.SelectedStyle selectedStyle, EnabledStyle enabledStyle, t tVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = iconChooserVI.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            textDTO = iconChooserVI.title;
        }
        TextDTO textDTO2 = textDTO;
        if ((i11 & 4) != 0) {
            list = iconChooserVI.iconSelectors;
        }
        List list2 = list;
        if ((i11 & 8) != 0) {
            selectedStyle = iconChooserVI.selectedStyle;
        }
        IconChooserDTO.SelectedStyle selectedStyle2 = selectedStyle;
        if ((i11 & 16) != 0) {
            enabledStyle = iconChooserVI.enabledStyle;
        }
        EnabledStyle enabledStyle2 = enabledStyle;
        if ((i11 & 32) != 0) {
            tVar = iconChooserVI.viewEvent;
        }
        return iconChooserVI.copy(j12, textDTO2, list2, selectedStyle2, enabledStyle2, tVar);
    }

    @NotNull
    public final IconChooserVI copy(long id2, TextDTO title, @NotNull List<IconSelectorVI> iconSelectors, @NotNull IconChooserDTO.SelectedStyle selectedStyle, @NotNull EnabledStyle enabledStyle, t viewEvent) {
        Intrinsics.checkNotNullParameter(iconSelectors, "iconSelectors");
        Intrinsics.checkNotNullParameter(selectedStyle, "selectedStyle");
        Intrinsics.checkNotNullParameter(enabledStyle, "enabledStyle");
        return new IconChooserVI(id2, title, iconSelectors, selectedStyle, enabledStyle, viewEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IconChooserVI)) {
            return false;
        }
        IconChooserVI iconChooserVI = (IconChooserVI) other;
        return this.id == iconChooserVI.id && Intrinsics.d(this.title, iconChooserVI.title) && Intrinsics.d(this.iconSelectors, iconChooserVI.iconSelectors) && Intrinsics.d(this.selectedStyle, iconChooserVI.selectedStyle) && Intrinsics.d(this.enabledStyle, iconChooserVI.enabledStyle) && Intrinsics.d(this.viewEvent, iconChooserVI.viewEvent);
    }

    @NotNull
    public final EnabledStyle getEnabledStyle() {
        return this.enabledStyle;
    }

    @NotNull
    public final List<IconSelectorVI> getIconSelectors() {
        return this.iconSelectors;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final IconChooserDTO.SelectedStyle getSelectedStyle() {
        return this.selectedStyle;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        TextDTO textDTO = this.title;
        int hashCode2 = (this.enabledStyle.hashCode() + ((this.selectedStyle.hashCode() + g.b((hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31, this.iconSelectors)) * 31)) * 31;
        t tVar = this.viewEvent;
        return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Iterator<T> it = this.iconSelectors.iterator();
        while (it.hasNext()) {
            ((IconSelectorVI) it.next()).toString();
        }
        return this + "@IconChooserVI with iconSelectors=" + Unit.f71690a + ", selectedStyle=" + this.selectedStyle;
    }
}

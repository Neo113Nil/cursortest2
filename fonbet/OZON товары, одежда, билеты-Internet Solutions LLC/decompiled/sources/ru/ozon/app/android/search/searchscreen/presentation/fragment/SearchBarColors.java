package ru.ozon.app.android.search.searchscreen.presentation.fragment;

import Sc.InterfaceC4008j;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.utils.SelectUtilsKt;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b(\b\u0001\u0018\u0000 42\u00020\u0001:\u00014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\b\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\r2\b\b\u0001\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0017\u0010\u0017\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001b\u0010\u001e\u001a\u00020\r8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010!\u001a\u00020\r8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001dR\u001b\u0010$\u001a\u00020\r8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u001b\u0010'\u001a\u00020\r8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010\u001dR\u001b\u0010*\u001a\u00020\r8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u001b\u001a\u0004\b)\u0010\u001dR\u001b\u0010-\u001a\u00020\r8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u001b\u001a\u0004\b,\u0010\u001dR\u001b\u00100\u001a\u00020\r8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u001b\u001a\u0004\b/\u0010\u001dR\u001b\u00103\u001a\u00020\r8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u001b\u001a\u0004\b2\u0010\u001d¨\u00065"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/fragment/SearchBarColors;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "remoteColor", "getSearchBarBackgroundColor", "(Ljava/lang/String;)Ljava/lang/String;", "", "isHomePage", "(Ljava/lang/String;Z)Ljava/lang/String;", "", "getHintColor", "(Z)I", "remoteToken", "getIconColor", "(Ljava/lang/String;Z)I", "resId", "color", "(I)I", "Landroid/content/Context;", "isSelect", "Z", "()Z", "clearSearchIcon$delegate", "LSc/j;", "getClearSearchIcon", "()I", "clearSearchIcon", "iconRes$delegate", "getIconRes", "iconRes", "icon$delegate", "getIcon", "icon", "hintText$delegate", "getHintText", "hintText", "text$delegate", "getText", "text", "cursorColor$delegate", "getCursorColor", "cursorColor", "defaultBackground$delegate", "getDefaultBackground", "defaultBackground", "pdpButtonBackground$delegate", "getPdpButtonBackground", "pdpButtonBackground", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchBarColors {
    private static final int clearSearchIconBxRes;
    private static final int colorAccentAttr;

    @NotNull
    private static final UniColors defaultBackgroundBx;

    @NotNull
    private static final String defaultBackgroundSelect;
    private static final int graphicTertiaryRes;
    private static final int hintBxRes;
    private static final int hintSelectHomeRes;
    private static final int hintSelectRes;

    @NotNull
    private static final String homeBackgroundSelect;
    private static final int iconBxRes;
    private static final int iconSelectHomeRes;
    private static final int iconSelectRes;
    private static final int pdpButtonBackgroundBxRes;
    private static final int textBxRes;
    private static final int textSelectRes;

    /* renamed from: clearSearchIcon$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j clearSearchIcon;

    @NotNull
    private final Context context;

    /* renamed from: cursorColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j cursorColor;

    /* renamed from: defaultBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j defaultBackground;

    /* renamed from: hintText$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j hintText;

    /* renamed from: icon$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j icon;

    /* renamed from: iconRes$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j iconRes;
    private final boolean isSelect;

    /* renamed from: pdpButtonBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j pdpButtonBackground;

    /* renamed from: text$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j text;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0015\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0015\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u001a\u0010\u0012R\u0017\u0010\u001b\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u001c\u0010\u0012R\u0017\u0010\u001d\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001e\u0010\u0012R\u0017\u0010\u001f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b \u0010\u0012R\u0017\u0010!\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b!\u0010\u0010\u001a\u0004\b\"\u0010\u0012¨\u0006#"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/fragment/SearchBarColors$Companion;", "", "<init>", "()V", "Lru/ozon/uni/core/UniColors;", "defaultBackgroundBx", "Lru/ozon/uni/core/UniColors;", "getDefaultBackgroundBx", "()Lru/ozon/uni/core/UniColors;", "", "defaultBackgroundSelect", "Ljava/lang/String;", "getDefaultBackgroundSelect", "()Ljava/lang/String;", "", "hintBxRes", "I", "getHintBxRes", "()I", "hintSelectRes", "getHintSelectRes", "textBxRes", "getTextBxRes", "textSelectRes", "getTextSelectRes", "iconBxRes", "getIconBxRes", "iconSelectRes", "getIconSelectRes", "clearSearchIconBxRes", "getClearSearchIconBxRes", "pdpButtonBackgroundBxRes", "getPdpButtonBackgroundBxRes", "colorAccentAttr", "getColorAccentAttr", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getClearSearchIconBxRes() {
            return SearchBarColors.clearSearchIconBxRes;
        }

        public final int getColorAccentAttr() {
            return SearchBarColors.colorAccentAttr;
        }

        @NotNull
        public final UniColors getDefaultBackgroundBx() {
            return SearchBarColors.defaultBackgroundBx;
        }

        @NotNull
        public final String getDefaultBackgroundSelect() {
            return SearchBarColors.defaultBackgroundSelect;
        }

        public final int getHintBxRes() {
            return SearchBarColors.hintBxRes;
        }

        public final int getHintSelectRes() {
            return SearchBarColors.hintSelectRes;
        }

        public final int getIconBxRes() {
            return SearchBarColors.iconBxRes;
        }

        public final int getIconSelectRes() {
            return SearchBarColors.iconSelectRes;
        }

        public final int getPdpButtonBackgroundBxRes() {
            return SearchBarColors.pdpButtonBackgroundBxRes;
        }

        public final int getTextBxRes() {
            return SearchBarColors.textBxRes;
        }

        public final int getTextSelectRes() {
            return SearchBarColors.textSelectRes;
        }

        private Companion() {
        }
    }

    static {
        int resId = UniColors.GRAPHIC_TERTIARY.getResId();
        graphicTertiaryRes = resId;
        defaultBackgroundBx = UniColors.BG_SECONDARY;
        defaultBackgroundSelect = UniColors.CLEAR_LIGHT_KEY_300.getToken();
        homeBackgroundSelect = UniColors.BG_PRIMARY.getToken();
        hintBxRes = resId;
        hintSelectRes = UniColors.TEXT_TERTIARY_ON_DARK.getResId();
        hintSelectHomeRes = UniColors.TEXT_TERTIARY.getResId();
        textBxRes = R$attr.textPrimary;
        textSelectRes = UniColors.TEXT_LIGHT_KEY.getResId();
        iconBxRes = resId;
        iconSelectRes = UniColors.GRAPHIC_TERTIARY_ON_DARK.getResId();
        iconSelectHomeRes = resId;
        clearSearchIconBxRes = R$attr.graphicTertiary;
        pdpButtonBackgroundBxRes = R$attr.layerFloor1;
        colorAccentAttr = R$attr.colorAccent;
    }

    public SearchBarColors(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.isSelect = SelectUtilsKt.isSelect(context);
        this.clearSearchIcon = LazyUtilsKt.unsafeLazy(new SearchBarColors$clearSearchIcon$2(this));
        this.iconRes = LazyUtilsKt.unsafeLazy(new SearchBarColors$iconRes$2(this));
        this.icon = LazyUtilsKt.unsafeLazy(new SearchBarColors$icon$2(this));
        this.hintText = LazyUtilsKt.unsafeLazy(new SearchBarColors$hintText$2(this));
        this.text = LazyUtilsKt.unsafeLazy(new SearchBarColors$text$2(this));
        this.cursorColor = LazyUtilsKt.unsafeLazy(new SearchBarColors$cursorColor$2(this));
        this.defaultBackground = LazyUtilsKt.unsafeLazy(new SearchBarColors$defaultBackground$2(this));
        this.pdpButtonBackground = LazyUtilsKt.unsafeLazy(new SearchBarColors$pdpButtonBackground$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int color(int resId) {
        return ResourceExtKt.color(this.context, resId);
    }

    public final int getClearSearchIcon() {
        return ((Number) this.clearSearchIcon.getValue()).intValue();
    }

    public final int getCursorColor() {
        return ((Number) this.cursorColor.getValue()).intValue();
    }

    public final int getDefaultBackground() {
        return ((Number) this.defaultBackground.getValue()).intValue();
    }

    public final int getHintColor(boolean isHomePage) {
        boolean z11 = this.isSelect;
        return color((z11 && isHomePage) ? hintSelectHomeRes : (!z11 || isHomePage) ? hintBxRes : hintSelectRes);
    }

    public final int getHintText() {
        return ((Number) this.hintText.getValue()).intValue();
    }

    public final int getIcon() {
        return ((Number) this.icon.getValue()).intValue();
    }

    public final int getIconColor(String remoteToken, boolean isHomePage) {
        Integer parseColor = StyleParser.INSTANCE.parseColor(this.context, remoteToken);
        if (parseColor != null) {
            return parseColor.intValue();
        }
        boolean z11 = this.isSelect;
        return (z11 && isHomePage) ? color(iconSelectHomeRes) : (!z11 || isHomePage) ? color(iconBxRes) : color(iconSelectRes);
    }

    public final int getIconRes() {
        return ((Number) this.iconRes.getValue()).intValue();
    }

    public final int getPdpButtonBackground() {
        return ((Number) this.pdpButtonBackground.getValue()).intValue();
    }

    @NotNull
    public final String getSearchBarBackgroundColor(String remoteColor) {
        return remoteColor == null ? this.isSelect ? defaultBackgroundSelect : defaultBackgroundBx.getToken() : remoteColor;
    }

    public final int getText() {
        return ((Number) this.text.getValue()).intValue();
    }

    /* renamed from: isSelect, reason: from getter */
    public final boolean getIsSelect() {
        return this.isSelect;
    }

    @NotNull
    public final String getSearchBarBackgroundColor(String remoteColor, boolean isHomePage) {
        if (remoteColor != null) {
            return remoteColor;
        }
        boolean z11 = this.isSelect;
        if (z11 && isHomePage) {
            return homeBackgroundSelect;
        }
        if (z11 && !isHomePage) {
            return defaultBackgroundSelect;
        }
        return defaultBackgroundBx.getToken();
    }
}

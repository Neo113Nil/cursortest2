package ru.ozon.app.android.composer.universalscreen.view;

import B0.C2454a;
import E00.a;
import Kk.C3532b;
import Pk0.f;
import QZ.g;
import Ql.c;
import T7.Z;
import Xc.b;
import a00.C4911f;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import i10.h;
import i10.l;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.M;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.emptyscreenfactory.DefaultEmptyScreenFactory;
import ru.ozon.app.android.composer.initialwidgets.DefaultInitialWidgetsProvider;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.component.sheet.SheetSoftInputMode;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b1\b\u0087\b\u0018\u0000 c2\u00020\u0001:\u0006cdefghB³\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006\u0012\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u00140\u0013\u0012\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u00140\u0013\u0012\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u0013\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010#\u001a\u00020\u0006\u0012\b\b\u0002\u0010$\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u00020%0\u0014\u0012\u0010\b\u0002\u0010(\u001a\n\u0012\u0006\b\u0001\u0012\u00020'0\u0014¢\u0006\u0004\b)\u0010*J\u001d\u0010/\u001a\u00020.2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u0019¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u0019¢\u0006\u0004\b1\u00102J¾\u0002\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u00140\u00132\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u00140\u00132\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00132\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010#\u001a\u00020\u00062\b\b\u0002\u0010$\u001a\u00020\u00062\u0010\b\u0002\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u00020%0\u00142\u0010\b\u0002\u0010(\u001a\n\u0012\u0006\b\u0001\u0012\u00020'0\u0014HÆ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020 HÖ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b7\u00102J\u001a\u0010:\u001a\u00020\u00062\b\u00109\u001a\u0004\u0018\u000108HÖ\u0003¢\u0006\u0004\b:\u0010;R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010B\u001a\u0004\b\u0007\u0010CR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010B\u001a\u0004\bG\u0010CR\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010B\u001a\u0004\bH\u0010CR\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010B\u001a\u0004\b\f\u0010CR\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\b\r\u0010CR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010\u0010\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010B\u001a\u0004\b\u0010\u0010CR\u0017\u0010\u0011\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010B\u001a\u0004\b\u0011\u0010CR\u0017\u0010\u0012\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010B\u001a\u0004\b\u0012\u0010CR%\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u00140\u00138\u0006¢\u0006\f\n\u0004\b\u0016\u0010L\u001a\u0004\bM\u0010NR%\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u00140\u00138\u0006¢\u0006\f\n\u0004\b\u0018\u0010L\u001a\u0004\bO\u0010NR\"\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010P\u0012\u0004\bS\u0010T\u001a\u0004\bQ\u0010RR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010U\u001a\u0004\bV\u0010WR\u0017\u0010\u001d\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010B\u001a\u0004\bX\u0010CR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010Y\u001a\u0004\bZ\u0010[R\u001f\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b!\u0010L\u001a\u0004\b\\\u0010NR\u0019\u0010\"\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\"\u0010P\u001a\u0004\b]\u0010RR\u0017\u0010#\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010B\u001a\u0004\b^\u0010CR\u0017\u0010$\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010B\u001a\u0004\b$\u0010CR\u001f\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u00020%0\u00148\u0006¢\u0006\f\n\u0004\b&\u0010_\u001a\u0004\b`\u0010aR\u001f\u0010(\u001a\n\u0012\u0006\b\u0001\u0012\u00020'0\u00148\u0006¢\u0006\f\n\u0004\b(\u0010_\u001a\u0004\bb\u0010a¨\u0006i"}, d2 = {"Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "Landroid/os/Parcelable;", "Li10/h$c;", "pageRef", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$ToolbarConfig;", "toolbarConfig", "", "isPageViewTrackingEnabled", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$BottomSheetConfig;", "bottomSheetConfig", "stickyHeaderEnabled", "animationEnabled", "isSwipeToRefreshEnabled", "isRefreshByLocation", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$RefreshByAuthConfig;", "refreshByAuthConfig", "isRefreshByCurrency", "isRefreshByLocale", "isFullScreen", "", "Ljava/lang/Class;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "configurators", "LQZ/g;", "interceptors", "", "backgroundColor", "Lru/ozon/app/android/composer/universalscreen/view/BackgroundColor;", "backgroundColorThemed", "useSemanticStatusBarColor", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$AppearanceConfig;", "appearanceConfig", "", "notRemovableNoUi", "softInputMode", "skipComposerFrequencyLoadCheck", "isFirstRowSpacerEnabled", "LE00/a;", "composerEmptyStateScreenFactory", "LC00/a;", "initialWidgetsProvider", "<init>", "(Li10/h$c;Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$ToolbarConfig;ZLru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$BottomSheetConfig;ZZZZLru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$RefreshByAuthConfig;ZZZLjava/util/Set;Ljava/util/Set;Ljava/lang/Integer;Lru/ozon/app/android/composer/universalscreen/view/BackgroundColor;ZLru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$AppearanceConfig;Ljava/util/Set;Ljava/lang/Integer;ZZLjava/lang/Class;Ljava/lang/Class;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Li10/h$c;Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$ToolbarConfig;ZLru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$BottomSheetConfig;ZZZZLru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$RefreshByAuthConfig;ZZZLjava/util/Set;Ljava/util/Set;Ljava/lang/Integer;Lru/ozon/app/android/composer/universalscreen/view/BackgroundColor;ZLru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$AppearanceConfig;Ljava/util/Set;Ljava/lang/Integer;ZZLjava/lang/Class;Ljava/lang/Class;)Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Li10/h$c;", "getPageRef", "()Li10/h$c;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$ToolbarConfig;", "getToolbarConfig", "()Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$ToolbarConfig;", "Z", "()Z", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$BottomSheetConfig;", "getBottomSheetConfig", "()Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$BottomSheetConfig;", "getStickyHeaderEnabled", "getAnimationEnabled", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$RefreshByAuthConfig;", "getRefreshByAuthConfig", "()Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$RefreshByAuthConfig;", "Ljava/util/Set;", "getConfigurators", "()Ljava/util/Set;", "getInterceptors", "Ljava/lang/Integer;", "getBackgroundColor", "()Ljava/lang/Integer;", "getBackgroundColor$annotations", "()V", "Lru/ozon/app/android/composer/universalscreen/view/BackgroundColor;", "getBackgroundColorThemed", "()Lru/ozon/app/android/composer/universalscreen/view/BackgroundColor;", "getUseSemanticStatusBarColor", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$AppearanceConfig;", "getAppearanceConfig", "()Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$AppearanceConfig;", "getNotRemovableNoUi", "getSoftInputMode", "getSkipComposerFrequencyLoadCheck", "Ljava/lang/Class;", "getComposerEmptyStateScreenFactory", "()Ljava/lang/Class;", "getInitialWidgetsProvider", "Companion", "PageConfigurator", "AppearanceConfig", "RefreshByAuthConfig", "ToolbarConfig", "BottomSheetConfig", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ComposerScreenConfig implements Parcelable {
    private final boolean animationEnabled;

    @NotNull
    private final AppearanceConfig appearanceConfig;
    private final Integer backgroundColor;
    private final BackgroundColor backgroundColorThemed;
    private final BottomSheetConfig bottomSheetConfig;

    @NotNull
    private final Class<? extends a> composerEmptyStateScreenFactory;

    @NotNull
    private final Set<Class<? extends PageConfigurator>> configurators;

    @NotNull
    private final Class<? extends C00.a> initialWidgetsProvider;

    @NotNull
    private final Set<Class<? extends g>> interceptors;
    private final boolean isFirstRowSpacerEnabled;
    private final boolean isFullScreen;
    private final boolean isPageViewTrackingEnabled;
    private final boolean isRefreshByCurrency;
    private final boolean isRefreshByLocale;
    private final boolean isRefreshByLocation;
    private final boolean isSwipeToRefreshEnabled;
    private final Set<String> notRemovableNoUi;

    @NotNull
    private final h.c pageRef;

    @NotNull
    private final RefreshByAuthConfig refreshByAuthConfig;
    private final boolean skipComposerFrequencyLoadCheck;
    private final Integer softInputMode;
    private final boolean stickyHeaderEnabled;
    private final ToolbarConfig toolbarConfig;
    private final boolean useSemanticStatusBarColor;
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<ComposerScreenConfig> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$AppearanceConfig;", "Landroid/os/Parcelable;", "Li10/l$a;", "loader", "<init>", "(Li10/l$a;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Li10/l$a;", "getLoader", "()Li10/l$a;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AppearanceConfig implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<AppearanceConfig> CREATOR = new Creator();
        private final l.a loader;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AppearanceConfig> {
            @Override // android.os.Parcelable.Creator
            public final AppearanceConfig createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AppearanceConfig((l.a) parcel.readParcelable(AppearanceConfig.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final AppearanceConfig[] newArray(int i11) {
                return new AppearanceConfig[i11];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AppearanceConfig() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AppearanceConfig) && Intrinsics.d(this.loader, ((AppearanceConfig) other).loader);
        }

        public final l.a getLoader() {
            return this.loader;
        }

        public int hashCode() {
            l.a aVar = this.loader;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        @NotNull
        public String toString() {
            return "AppearanceConfig(loader=" + this.loader + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.loader, flags);
        }

        public AppearanceConfig(l.a aVar) {
            this.loader = aVar;
        }

        public /* synthetic */ AppearanceConfig(l.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : aVar);
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0087\b\u0018\u0000 62\u00020\u0001:\u00016Bu\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aJ~\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010\u001aJ\u001a\u0010#\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b\u0005\u0010)R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010(\u001a\u0004\b*\u0010)\"\u0004\b+\u0010,R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b1\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b2\u0010)R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b\f\u0010)R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b\r\u0010)R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b3\u0010)R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b4\u0010)R\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010(\u001a\u0004\b5\u0010)¨\u00067"}, d2 = {"Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$BottomSheetConfig;", "Landroid/os/Parcelable;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment$DisplayMode;", "displayMode", "", "isPageViewTrackingEnabled", "modifyWindowFlags", "Lru/ozon/uni/android/component/sheet/SheetSoftInputMode;", "softInputMode", "", "minHeight", "cancelable", "isDismissActivityResult", "isToolbarEnabled", "showHandle", "roundedCorners", "keepInBackStackOnNavigation", "<init>", "(Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment$DisplayMode;ZZLru/ozon/uni/android/component/sheet/SheetSoftInputMode;IZZZZZZ)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment$DisplayMode;ZZLru/ozon/uni/android/component/sheet/SheetSoftInputMode;IZZZZZZ)Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$BottomSheetConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment$DisplayMode;", "getDisplayMode", "()Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment$DisplayMode;", "Z", "()Z", "getModifyWindowFlags", "setModifyWindowFlags", "(Z)V", "Lru/ozon/uni/android/component/sheet/SheetSoftInputMode;", "getSoftInputMode", "()Lru/ozon/uni/android/component/sheet/SheetSoftInputMode;", "I", "getMinHeight", "getCancelable", "getShowHandle", "getRoundedCorners", "getKeepInBackStackOnNavigation", "Companion", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BottomSheetConfig implements Parcelable {
        private final boolean cancelable;

        @NotNull
        private final ComposerFragment.DisplayMode displayMode;
        private final boolean isDismissActivityResult;
        private final boolean isPageViewTrackingEnabled;
        private final boolean isToolbarEnabled;
        private final boolean keepInBackStackOnNavigation;
        private final int minHeight;
        private boolean modifyWindowFlags;
        private final boolean roundedCorners;
        private final boolean showHandle;

        @NotNull
        private final SheetSoftInputMode softInputMode;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        @NotNull
        public static final Parcelable.Creator<BottomSheetConfig> CREATOR = new Creator();
        private static final int MIN_HEIGHT_DEFAULT = ResourceExtKt.toPx(98);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$BottomSheetConfig$Companion;", "", "<init>", "()V", "MIN_HEIGHT_DEFAULT", "", "getMIN_HEIGHT_DEFAULT", "()I", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int getMIN_HEIGHT_DEFAULT() {
                return BottomSheetConfig.MIN_HEIGHT_DEFAULT;
            }

            private Companion() {
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BottomSheetConfig> {
            @Override // android.os.Parcelable.Creator
            public final BottomSheetConfig createFromParcel(Parcel parcel) {
                boolean z11;
                boolean z12;
                boolean z13;
                boolean z14;
                boolean z15;
                boolean z16;
                boolean z17;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                ComposerFragment.DisplayMode valueOf = ComposerFragment.DisplayMode.valueOf(parcel.readString());
                boolean z18 = false;
                boolean z19 = true;
                if (parcel.readInt() != 0) {
                    z11 = false;
                    z18 = true;
                } else {
                    z11 = false;
                }
                if (parcel.readInt() != 0) {
                    z12 = true;
                } else {
                    z12 = true;
                    z19 = z11;
                }
                SheetSoftInputMode valueOf2 = SheetSoftInputMode.valueOf(parcel.readString());
                boolean z21 = z12;
                int readInt = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z13 = z21;
                } else {
                    z13 = z21;
                    z21 = z11;
                }
                if (parcel.readInt() != 0) {
                    z14 = z13;
                } else {
                    z14 = z13;
                    z13 = z11;
                }
                if (parcel.readInt() != 0) {
                    z15 = z14;
                } else {
                    z15 = z14;
                    z14 = z11;
                }
                if (parcel.readInt() != 0) {
                    z16 = z15;
                } else {
                    z16 = z15;
                    z15 = z11;
                }
                if (parcel.readInt() != 0) {
                    z17 = z16;
                } else {
                    z17 = z16;
                    z16 = z11;
                }
                if (parcel.readInt() == 0) {
                    z17 = z11;
                }
                return new BottomSheetConfig(valueOf, z18, z19, valueOf2, readInt, z21, z13, z14, z15, z16, z17);
            }

            @Override // android.os.Parcelable.Creator
            public final BottomSheetConfig[] newArray(int i11) {
                return new BottomSheetConfig[i11];
            }
        }

        public BottomSheetConfig() {
            this(null, false, false, null, 0, false, false, false, false, false, false, 2047, null);
        }

        public static /* synthetic */ BottomSheetConfig copy$default(BottomSheetConfig bottomSheetConfig, ComposerFragment.DisplayMode displayMode, boolean z11, boolean z12, SheetSoftInputMode sheetSoftInputMode, int i11, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                displayMode = bottomSheetConfig.displayMode;
            }
            if ((i12 & 2) != 0) {
                z11 = bottomSheetConfig.isPageViewTrackingEnabled;
            }
            if ((i12 & 4) != 0) {
                z12 = bottomSheetConfig.modifyWindowFlags;
            }
            if ((i12 & 8) != 0) {
                sheetSoftInputMode = bottomSheetConfig.softInputMode;
            }
            if ((i12 & 16) != 0) {
                i11 = bottomSheetConfig.minHeight;
            }
            if ((i12 & 32) != 0) {
                z13 = bottomSheetConfig.cancelable;
            }
            if ((i12 & 64) != 0) {
                z14 = bottomSheetConfig.isDismissActivityResult;
            }
            if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                z15 = bottomSheetConfig.isToolbarEnabled;
            }
            if ((i12 & 256) != 0) {
                z16 = bottomSheetConfig.showHandle;
            }
            if ((i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                z17 = bottomSheetConfig.roundedCorners;
            }
            if ((i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                z18 = bottomSheetConfig.keepInBackStackOnNavigation;
            }
            boolean z19 = z17;
            boolean z21 = z18;
            boolean z22 = z15;
            boolean z23 = z16;
            boolean z24 = z13;
            boolean z25 = z14;
            int i13 = i11;
            boolean z26 = z12;
            return bottomSheetConfig.copy(displayMode, z11, z26, sheetSoftInputMode, i13, z24, z25, z22, z23, z19, z21);
        }

        @NotNull
        public final BottomSheetConfig copy(@NotNull ComposerFragment.DisplayMode displayMode, boolean isPageViewTrackingEnabled, boolean modifyWindowFlags, @NotNull SheetSoftInputMode softInputMode, int minHeight, boolean cancelable, boolean isDismissActivityResult, boolean isToolbarEnabled, boolean showHandle, boolean roundedCorners, boolean keepInBackStackOnNavigation) {
            Intrinsics.checkNotNullParameter(displayMode, "displayMode");
            Intrinsics.checkNotNullParameter(softInputMode, "softInputMode");
            return new BottomSheetConfig(displayMode, isPageViewTrackingEnabled, modifyWindowFlags, softInputMode, minHeight, cancelable, isDismissActivityResult, isToolbarEnabled, showHandle, roundedCorners, keepInBackStackOnNavigation);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BottomSheetConfig)) {
                return false;
            }
            BottomSheetConfig bottomSheetConfig = (BottomSheetConfig) other;
            return this.displayMode == bottomSheetConfig.displayMode && this.isPageViewTrackingEnabled == bottomSheetConfig.isPageViewTrackingEnabled && this.modifyWindowFlags == bottomSheetConfig.modifyWindowFlags && this.softInputMode == bottomSheetConfig.softInputMode && this.minHeight == bottomSheetConfig.minHeight && this.cancelable == bottomSheetConfig.cancelable && this.isDismissActivityResult == bottomSheetConfig.isDismissActivityResult && this.isToolbarEnabled == bottomSheetConfig.isToolbarEnabled && this.showHandle == bottomSheetConfig.showHandle && this.roundedCorners == bottomSheetConfig.roundedCorners && this.keepInBackStackOnNavigation == bottomSheetConfig.keepInBackStackOnNavigation;
        }

        public final boolean getCancelable() {
            return this.cancelable;
        }

        @NotNull
        public final ComposerFragment.DisplayMode getDisplayMode() {
            return this.displayMode;
        }

        public final boolean getKeepInBackStackOnNavigation() {
            return this.keepInBackStackOnNavigation;
        }

        public final int getMinHeight() {
            return this.minHeight;
        }

        public final boolean getShowHandle() {
            return this.showHandle;
        }

        @NotNull
        public final SheetSoftInputMode getSoftInputMode() {
            return this.softInputMode;
        }

        public int hashCode() {
            return Boolean.hashCode(this.keepInBackStackOnNavigation) + C3532b.a(C3532b.a(C3532b.a(C3532b.a(C3532b.a(C2454a.a(this.minHeight, (this.softInputMode.hashCode() + C3532b.a(C3532b.a(this.displayMode.hashCode() * 31, 31, this.isPageViewTrackingEnabled), 31, this.modifyWindowFlags)) * 31, 31), 31, this.cancelable), 31, this.isDismissActivityResult), 31, this.isToolbarEnabled), 31, this.showHandle), 31, this.roundedCorners);
        }

        /* renamed from: isDismissActivityResult, reason: from getter */
        public final boolean getIsDismissActivityResult() {
            return this.isDismissActivityResult;
        }

        /* renamed from: isPageViewTrackingEnabled, reason: from getter */
        public final boolean getIsPageViewTrackingEnabled() {
            return this.isPageViewTrackingEnabled;
        }

        /* renamed from: isToolbarEnabled, reason: from getter */
        public final boolean getIsToolbarEnabled() {
            return this.isToolbarEnabled;
        }

        @NotNull
        public String toString() {
            ComposerFragment.DisplayMode displayMode = this.displayMode;
            boolean z11 = this.isPageViewTrackingEnabled;
            boolean z12 = this.modifyWindowFlags;
            SheetSoftInputMode sheetSoftInputMode = this.softInputMode;
            int i11 = this.minHeight;
            boolean z13 = this.cancelable;
            boolean z14 = this.isDismissActivityResult;
            boolean z15 = this.isToolbarEnabled;
            boolean z16 = this.showHandle;
            boolean z17 = this.roundedCorners;
            boolean z18 = this.keepInBackStackOnNavigation;
            StringBuilder sb2 = new StringBuilder("BottomSheetConfig(displayMode=");
            sb2.append(displayMode);
            sb2.append(", isPageViewTrackingEnabled=");
            sb2.append(z11);
            sb2.append(", modifyWindowFlags=");
            sb2.append(z12);
            sb2.append(", softInputMode=");
            sb2.append(sheetSoftInputMode);
            sb2.append(", minHeight=");
            c.d(sb2, i11, ", cancelable=", z13, ", isDismissActivityResult=");
            f.c(", isToolbarEnabled=", ", showHandle=", sb2, z14, z15);
            f.c(", roundedCorners=", ", keepInBackStackOnNavigation=", sb2, z16, z17);
            return Pk0.a.a(")", sb2, z18);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.displayMode.name());
            dest.writeInt(this.isPageViewTrackingEnabled ? 1 : 0);
            dest.writeInt(this.modifyWindowFlags ? 1 : 0);
            dest.writeString(this.softInputMode.name());
            dest.writeInt(this.minHeight);
            dest.writeInt(this.cancelable ? 1 : 0);
            dest.writeInt(this.isDismissActivityResult ? 1 : 0);
            dest.writeInt(this.isToolbarEnabled ? 1 : 0);
            dest.writeInt(this.showHandle ? 1 : 0);
            dest.writeInt(this.roundedCorners ? 1 : 0);
            dest.writeInt(this.keepInBackStackOnNavigation ? 1 : 0);
        }

        public BottomSheetConfig(@NotNull ComposerFragment.DisplayMode displayMode, boolean z11, boolean z12, @NotNull SheetSoftInputMode softInputMode, int i11, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18) {
            Intrinsics.checkNotNullParameter(displayMode, "displayMode");
            Intrinsics.checkNotNullParameter(softInputMode, "softInputMode");
            this.displayMode = displayMode;
            this.isPageViewTrackingEnabled = z11;
            this.modifyWindowFlags = z12;
            this.softInputMode = softInputMode;
            this.minHeight = i11;
            this.cancelable = z13;
            this.isDismissActivityResult = z14;
            this.isToolbarEnabled = z15;
            this.showHandle = z16;
            this.roundedCorners = z17;
            this.keepInBackStackOnNavigation = z18;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
            	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
            	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
            */
        public /* synthetic */ BottomSheetConfig(ru.ozon.app.android.composer.universalscreen.view.ComposerFragment.DisplayMode r3, boolean r4, boolean r5, ru.ozon.uni.android.component.sheet.SheetSoftInputMode r6, int r7, boolean r8, boolean r9, boolean r10, boolean r11, boolean r12, boolean r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
            /*
                r2 = this;
                r15 = r14 & 1
                if (r15 == 0) goto L6
                ru.ozon.app.android.composer.universalscreen.view.ComposerFragment$DisplayMode r3 = ru.ozon.app.android.composer.universalscreen.view.ComposerFragment.DisplayMode.REGULAR
            L6:
                r15 = r14 & 2
                r0 = 0
                if (r15 == 0) goto Lc
                r4 = r0
            Lc:
                r15 = r14 & 4
                r1 = 1
                if (r15 == 0) goto L12
                r5 = r1
            L12:
                r15 = r14 & 8
                if (r15 == 0) goto L18
                ru.ozon.uni.android.component.sheet.SheetSoftInputMode r6 = ru.ozon.uni.android.component.sheet.SheetSoftInputMode.UNSPECIFIED
            L18:
                r15 = r14 & 16
                if (r15 == 0) goto L1e
                int r7 = ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.BottomSheetConfig.MIN_HEIGHT_DEFAULT
            L1e:
                r15 = r14 & 32
                if (r15 == 0) goto L23
                r8 = r1
            L23:
                r15 = r14 & 64
                if (r15 == 0) goto L28
                r9 = r0
            L28:
                r15 = r14 & 128(0x80, float:1.8E-43)
                if (r15 == 0) goto L2d
                r10 = r0
            L2d:
                r15 = r14 & 256(0x100, float:3.59E-43)
                if (r15 == 0) goto L32
                r11 = r1
            L32:
                r15 = r14 & 512(0x200, float:7.17E-43)
                if (r15 == 0) goto L37
                r12 = r1
            L37:
                r14 = r14 & 1024(0x400, float:1.435E-42)
                if (r14 == 0) goto L48
                r15 = r0
                r13 = r11
                r14 = r12
                r11 = r9
                r12 = r10
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r4 = r2
                goto L54
            L48:
                r15 = r13
                r14 = r12
                r12 = r10
                r13 = r11
                r10 = r8
                r11 = r9
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
            L54:
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.BottomSheetConfig.<init>(ru.ozon.app.android.composer.universalscreen.view.ComposerFragment$DisplayMode, boolean, boolean, ru.ozon.uni.android.component.sheet.SheetSoftInputMode, int, boolean, boolean, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ComposerScreenConfig> {
        @Override // android.os.Parcelable.Creator
        public final ComposerScreenConfig createFromParcel(Parcel parcel) {
            boolean z11;
            boolean z12;
            BottomSheetConfig bottomSheetConfig;
            boolean z13;
            boolean z14;
            boolean z15;
            boolean z16;
            boolean z17;
            RefreshByAuthConfig refreshByAuthConfig;
            boolean z18;
            boolean z19;
            boolean z21;
            LinkedHashSet linkedHashSet;
            boolean z22;
            Integer num;
            LinkedHashSet linkedHashSet2;
            LinkedHashSet linkedHashSet3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            h.c cVar = (h.c) parcel.readParcelable(ComposerScreenConfig.class.getClassLoader());
            ToolbarConfig createFromParcel = parcel.readInt() == 0 ? null : ToolbarConfig.CREATOR.createFromParcel(parcel);
            boolean z23 = false;
            if (parcel.readInt() != 0) {
                z11 = false;
                z23 = true;
            } else {
                z11 = false;
            }
            BottomSheetConfig createFromParcel2 = parcel.readInt() == 0 ? null : BottomSheetConfig.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z12 = true;
                bottomSheetConfig = createFromParcel2;
                z13 = true;
            } else {
                z12 = true;
                bottomSheetConfig = createFromParcel2;
                z13 = z11;
            }
            if (parcel.readInt() != 0) {
                z14 = z12;
            } else {
                z14 = z12;
                z12 = z11;
            }
            if (parcel.readInt() != 0) {
                z15 = z14;
            } else {
                z15 = z14;
                z14 = z11;
            }
            if (parcel.readInt() != 0) {
                z16 = z15;
            } else {
                z16 = z15;
                z15 = z11;
            }
            RefreshByAuthConfig refreshByAuthConfig2 = (RefreshByAuthConfig) parcel.readParcelable(ComposerScreenConfig.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z17 = z16;
                refreshByAuthConfig = refreshByAuthConfig2;
                z18 = z17;
            } else {
                z17 = z16;
                refreshByAuthConfig = refreshByAuthConfig2;
                z18 = z11;
            }
            if (parcel.readInt() != 0) {
                z19 = z17;
            } else {
                z19 = z17;
                z17 = z11;
            }
            if (parcel.readInt() != 0) {
                z21 = z19;
            } else {
                z21 = z19;
                z19 = z11;
            }
            int readInt = parcel.readInt();
            LinkedHashSet linkedHashSet4 = new LinkedHashSet(readInt);
            for (int i11 = 0; i11 != readInt; i11++) {
                linkedHashSet4.add(parcel.readSerializable());
            }
            int readInt2 = parcel.readInt();
            LinkedHashSet linkedHashSet5 = new LinkedHashSet(readInt2);
            int i12 = 0;
            while (i12 != readInt2) {
                linkedHashSet5.add(parcel.readSerializable());
                i12++;
                readInt2 = readInt2;
            }
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BackgroundColor backgroundColor = (BackgroundColor) parcel.readParcelable(ComposerScreenConfig.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z22 = z21;
                linkedHashSet = linkedHashSet4;
            } else {
                linkedHashSet = linkedHashSet4;
                z22 = false;
            }
            AppearanceConfig createFromParcel3 = AppearanceConfig.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                num = valueOf;
                linkedHashSet3 = linkedHashSet5;
                linkedHashSet2 = null;
            } else {
                int readInt3 = parcel.readInt();
                num = valueOf;
                linkedHashSet2 = new LinkedHashSet(readInt3);
                linkedHashSet3 = linkedHashSet5;
                int i13 = 0;
                while (i13 != readInt3) {
                    linkedHashSet2.add(parcel.readString());
                    i13++;
                    readInt3 = readInt3;
                }
            }
            return new ComposerScreenConfig(cVar, createFromParcel, z23, bottomSheetConfig, z13, z12, z14, z15, refreshByAuthConfig, z18, z17, z19, linkedHashSet, linkedHashSet3, num, backgroundColor, z22, createFromParcel3, linkedHashSet2, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, parcel.readInt() != 0, (Class) parcel.readSerializable(), (Class) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final ComposerScreenConfig[] newArray(int i11) {
            return new ComposerScreenConfig[i11];
        }
    }

    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0015\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u000e\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001e\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0006H\u0014¢\u0006\u0004\b#\u0010\u0003R(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010$\u001a\u0004\u0018\u00010\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010'R,\u0010*\u001a\u00060(j\u0002`)2\n\u0010$\u001a\u00060(j\u0002`)8\u0006@BX\u0086.¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0011\u00101\u001a\u00020.8F¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "<init>", "()V", "Lru/ozon/app/android/composer/ConfiguratorReferences;", "references", "", "composerInitialized", "(Lru/ozon/app/android/composer/ConfiguratorReferences;)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Landroid/os/Bundle;", "outState", "La00/h;", "Lru/ozon/app/android/composer/ViewModelOwnerProvider;", "viewModelOwnerProvider", "onSaveInstanceState", "(Landroid/os/Bundle;La00/h;)V", "onRestoreInstanceState", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onComposerInitialized", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/app/android/composer/ConfiguratorReferences;", "getReferences", "()Lru/ozon/app/android/composer/ConfiguratorReferences;", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "container", "La00/f;", "getContainer", "()La00/f;", "Landroidx/lifecycle/J;", "getOwner", "()Landroidx/lifecycle/J;", "owner", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class PageConfigurator implements DefaultLifecycleObserver {
        private C4911f container;
        private ConfiguratorReferences references;

        public final void composerInitialized(@NotNull ConfiguratorReferences references) {
            Intrinsics.checkNotNullParameter(references, "references");
            this.references = references;
            this.container = references.getOwnerContainer();
            onComposerInitialized();
        }

        @NotNull
        public final C4911f getContainer() {
            C4911f c4911f = this.container;
            if (c4911f != null) {
                return c4911f;
            }
            Intrinsics.n("container");
            throw null;
        }

        @NotNull
        public final J getOwner() {
            return getContainer().f();
        }

        public final ConfiguratorReferences getReferences() {
            return this.references;
        }

        public void onActivityResult(int requestCode, int resultCode, Intent data) {
        }

        protected void onComposerInitialized() {
        }

        public void onConfigurationChanged(@NotNull Configuration newConfig) {
            Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        }

        public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
            Intrinsics.checkNotNullParameter(permissions, "permissions");
            Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        }

        public void onRestoreInstanceState(Bundle outState, @NotNull a00.h viewModelOwnerProvider) {
            Intrinsics.checkNotNullParameter(viewModelOwnerProvider, "viewModelOwnerProvider");
        }

        public void onSaveInstanceState(@NotNull Bundle outState, @NotNull a00.h viewModelOwnerProvider) {
            Intrinsics.checkNotNullParameter(outState, "outState");
            Intrinsics.checkNotNullParameter(viewModelOwnerProvider, "viewModelOwnerProvider");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$RefreshByAuthConfig;", "Landroid/os/Parcelable;", "Disabled", "Enabled", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$RefreshByAuthConfig$Disabled;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$RefreshByAuthConfig$Enabled;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface RefreshByAuthConfig extends Parcelable {

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$RefreshByAuthConfig$Disabled;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$RefreshByAuthConfig;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final /* data */ class Disabled implements RefreshByAuthConfig {

            @NotNull
            public static final Disabled INSTANCE = new Disabled();

            @NotNull
            public static final Parcelable.Creator<Disabled> CREATOR = new Creator();

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Disabled> {
                @Override // android.os.Parcelable.Creator
                public final Disabled createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Disabled.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final Disabled[] newArray(int i11) {
                    return new Disabled[i11];
                }
            }

            private Disabled() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Disabled);
            }

            public int hashCode() {
                return 1721169125;
            }

            @NotNull
            public String toString() {
                return "Disabled";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000fJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$RefreshByAuthConfig$Enabled;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$RefreshByAuthConfig;", "", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$RefreshByAuthConfig$Enabled$ReasonRefresh;", "refreshReasons", "<init>", "(Ljava/util/Set;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Set;", "getRefreshReasons", "()Ljava/util/Set;", "ReasonRefresh", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Enabled implements RefreshByAuthConfig {

            @NotNull
            public static final Parcelable.Creator<Enabled> CREATOR = new Creator();

            @NotNull
            private final Set<ReasonRefresh> refreshReasons;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Enabled> {
                @Override // android.os.Parcelable.Creator
                public final Enabled createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    for (int i11 = 0; i11 != readInt; i11++) {
                        linkedHashSet.add(parcel.readParcelable(Enabled.class.getClassLoader()));
                    }
                    return new Enabled(linkedHashSet);
                }

                @Override // android.os.Parcelable.Creator
                public final Enabled[] newArray(int i11) {
                    return new Enabled[i11];
                }
            }

            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$RefreshByAuthConfig$Enabled$ReasonRefresh;", "Landroid/os/Parcelable;", "Login", "Logout", "SwitchUser", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$RefreshByAuthConfig$Enabled$ReasonRefresh$Login;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$RefreshByAuthConfig$Enabled$ReasonRefresh$Logout;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$RefreshByAuthConfig$Enabled$ReasonRefresh$SwitchUser;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public interface ReasonRefresh extends Parcelable {

                @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$RefreshByAuthConfig$Enabled$ReasonRefresh$Login;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$RefreshByAuthConfig$Enabled$ReasonRefresh;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final /* data */ class Login implements ReasonRefresh {

                    @NotNull
                    public static final Login INSTANCE = new Login();

                    @NotNull
                    public static final Parcelable.Creator<Login> CREATOR = new Creator();

                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    public static final class Creator implements Parcelable.Creator<Login> {
                        @Override // android.os.Parcelable.Creator
                        public final Login createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            parcel.readInt();
                            return Login.INSTANCE;
                        }

                        @Override // android.os.Parcelable.Creator
                        public final Login[] newArray(int i11) {
                            return new Login[i11];
                        }
                    }

                    private Login() {
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object other) {
                        return this == other || (other instanceof Login);
                    }

                    public int hashCode() {
                        return 123779900;
                    }

                    @NotNull
                    public String toString() {
                        return "Login";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(@NotNull Parcel dest, int flags) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        dest.writeInt(1);
                    }
                }

                @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$RefreshByAuthConfig$Enabled$ReasonRefresh$Logout;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$RefreshByAuthConfig$Enabled$ReasonRefresh;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final /* data */ class Logout implements ReasonRefresh {

                    @NotNull
                    public static final Logout INSTANCE = new Logout();

                    @NotNull
                    public static final Parcelable.Creator<Logout> CREATOR = new Creator();

                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    public static final class Creator implements Parcelable.Creator<Logout> {
                        @Override // android.os.Parcelable.Creator
                        public final Logout createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            parcel.readInt();
                            return Logout.INSTANCE;
                        }

                        @Override // android.os.Parcelable.Creator
                        public final Logout[] newArray(int i11) {
                            return new Logout[i11];
                        }
                    }

                    private Logout() {
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object other) {
                        return this == other || (other instanceof Logout);
                    }

                    public int hashCode() {
                        return -457784297;
                    }

                    @NotNull
                    public String toString() {
                        return "Logout";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(@NotNull Parcel dest, int flags) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        dest.writeInt(1);
                    }
                }

                @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$RefreshByAuthConfig$Enabled$ReasonRefresh$SwitchUser;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$RefreshByAuthConfig$Enabled$ReasonRefresh;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final /* data */ class SwitchUser implements ReasonRefresh {

                    @NotNull
                    public static final SwitchUser INSTANCE = new SwitchUser();

                    @NotNull
                    public static final Parcelable.Creator<SwitchUser> CREATOR = new Creator();

                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    public static final class Creator implements Parcelable.Creator<SwitchUser> {
                        @Override // android.os.Parcelable.Creator
                        public final SwitchUser createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            parcel.readInt();
                            return SwitchUser.INSTANCE;
                        }

                        @Override // android.os.Parcelable.Creator
                        public final SwitchUser[] newArray(int i11) {
                            return new SwitchUser[i11];
                        }
                    }

                    private SwitchUser() {
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object other) {
                        return this == other || (other instanceof SwitchUser);
                    }

                    public int hashCode() {
                        return 1848114476;
                    }

                    @NotNull
                    public String toString() {
                        return "SwitchUser";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(@NotNull Parcel dest, int flags) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        dest.writeInt(1);
                    }
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Enabled(@NotNull Set<? extends ReasonRefresh> refreshReasons) {
                Intrinsics.checkNotNullParameter(refreshReasons, "refreshReasons");
                this.refreshReasons = refreshReasons;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Enabled) && Intrinsics.d(this.refreshReasons, ((Enabled) other).refreshReasons);
            }

            @NotNull
            public final Set<ReasonRefresh> getRefreshReasons() {
                return this.refreshReasons;
            }

            public int hashCode() {
                return this.refreshReasons.hashCode();
            }

            @NotNull
            public String toString() {
                return "Enabled(refreshReasons=" + this.refreshReasons + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Set<ReasonRefresh> set = this.refreshReasons;
                dest.writeInt(set.size());
                Iterator<ReasonRefresh> it = set.iterator();
                while (it.hasNext()) {
                    dest.writeParcelable(it.next(), flags);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000fJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u000f¨\u0006 "}, d2 = {"Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$ToolbarConfig;", "Landroid/os/Parcelable;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$ToolbarConfig$DefaultState;", "defaultState", "", "insetStart", "<init>", "(Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$ToolbarConfig$DefaultState;I)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$ToolbarConfig$DefaultState;", "getDefaultState", "()Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$ToolbarConfig$DefaultState;", "I", "getInsetStart", "DefaultState", "ToolbarTitleAlign", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ToolbarConfig implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ToolbarConfig> CREATOR = new Creator();
        private final DefaultState defaultState;
        private final int insetStart;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ToolbarConfig> {
            @Override // android.os.Parcelable.Creator
            public final ToolbarConfig createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ToolbarConfig(parcel.readInt() == 0 ? null : DefaultState.CREATOR.createFromParcel(parcel), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final ToolbarConfig[] newArray(int i11) {
                return new ToolbarConfig[i11];
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u001a\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0017R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b*\u0010)¨\u0006+"}, d2 = {"Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$ToolbarConfig$DefaultState;", "Landroid/os/Parcelable;", "", "drawableId", "", "navigationUpEnabled", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$ToolbarConfig$ToolbarTitleAlign;", "titleAlign", "backgroundColor", "iconColor", "<init>", "(IZLjava/lang/String;Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$ToolbarConfig$ToolbarTitleAlign;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getDrawableId", "Z", "getNavigationUpEnabled", "()Z", "Ljava/lang/String;", "getTitle", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$ToolbarConfig$ToolbarTitleAlign;", "getTitleAlign", "()Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$ToolbarConfig$ToolbarTitleAlign;", "Ljava/lang/Integer;", "getBackgroundColor", "()Ljava/lang/Integer;", "getIconColor", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class DefaultState implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<DefaultState> CREATOR = new Creator();
            private final Integer backgroundColor;
            private final int drawableId;
            private final Integer iconColor;
            private final boolean navigationUpEnabled;
            private final String title;

            @NotNull
            private final ToolbarTitleAlign titleAlign;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<DefaultState> {
                @Override // android.os.Parcelable.Creator
                public final DefaultState createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new DefaultState(parcel.readInt(), parcel.readInt() != 0, parcel.readString(), ToolbarTitleAlign.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
                }

                @Override // android.os.Parcelable.Creator
                public final DefaultState[] newArray(int i11) {
                    return new DefaultState[i11];
                }
            }

            public DefaultState() {
                this(0, false, null, null, null, null, 63, null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DefaultState)) {
                    return false;
                }
                DefaultState defaultState = (DefaultState) other;
                return this.drawableId == defaultState.drawableId && this.navigationUpEnabled == defaultState.navigationUpEnabled && Intrinsics.d(this.title, defaultState.title) && this.titleAlign == defaultState.titleAlign && Intrinsics.d(this.backgroundColor, defaultState.backgroundColor) && Intrinsics.d(this.iconColor, defaultState.iconColor);
            }

            public final Integer getBackgroundColor() {
                return this.backgroundColor;
            }

            public final int getDrawableId() {
                return this.drawableId;
            }

            public final Integer getIconColor() {
                return this.iconColor;
            }

            public final boolean getNavigationUpEnabled() {
                return this.navigationUpEnabled;
            }

            public final String getTitle() {
                return this.title;
            }

            @NotNull
            public final ToolbarTitleAlign getTitleAlign() {
                return this.titleAlign;
            }

            public int hashCode() {
                int a11 = C3532b.a(Integer.hashCode(this.drawableId) * 31, 31, this.navigationUpEnabled);
                String str = this.title;
                int hashCode = (this.titleAlign.hashCode() + ((a11 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
                Integer num = this.backgroundColor;
                int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.iconColor;
                return hashCode2 + (num2 != null ? num2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                int i11 = this.drawableId;
                boolean z11 = this.navigationUpEnabled;
                String str = this.title;
                ToolbarTitleAlign toolbarTitleAlign = this.titleAlign;
                Integer num = this.backgroundColor;
                Integer num2 = this.iconColor;
                StringBuilder sb2 = new StringBuilder("DefaultState(drawableId=");
                sb2.append(i11);
                sb2.append(", navigationUpEnabled=");
                sb2.append(z11);
                sb2.append(", title=");
                sb2.append(str);
                sb2.append(", titleAlign=");
                sb2.append(toolbarTitleAlign);
                sb2.append(", backgroundColor=");
                return Z.c(sb2, num, ", iconColor=", num2, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.drawableId);
                dest.writeInt(this.navigationUpEnabled ? 1 : 0);
                dest.writeString(this.title);
                dest.writeString(this.titleAlign.name());
                Integer num = this.backgroundColor;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    Nh.a.f(dest, 1, num);
                }
                Integer num2 = this.iconColor;
                if (num2 == null) {
                    dest.writeInt(0);
                } else {
                    Nh.a.f(dest, 1, num2);
                }
            }

            public DefaultState(int i11, boolean z11, String str, @NotNull ToolbarTitleAlign titleAlign, Integer num, Integer num2) {
                Intrinsics.checkNotNullParameter(titleAlign, "titleAlign");
                this.drawableId = i11;
                this.navigationUpEnabled = z11;
                this.title = str;
                this.titleAlign = titleAlign;
                this.backgroundColor = num;
                this.iconColor = num2;
            }

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
                	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
                	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
                	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
                	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
                	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
                */
            public /* synthetic */ DefaultState(int r2, boolean r3, java.lang.String r4, ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.ToolbarConfig.ToolbarTitleAlign r5, java.lang.Integer r6, java.lang.Integer r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
                /*
                    r1 = this;
                    r9 = r8 & 1
                    if (r9 == 0) goto L6
                    int r2 = ru.ozon.uni.core.R$drawable.ic_m_disclosure_back_filled
                L6:
                    r9 = r8 & 2
                    if (r9 == 0) goto Lb
                    r3 = 1
                Lb:
                    r9 = r8 & 4
                    r0 = 0
                    if (r9 == 0) goto L11
                    r4 = r0
                L11:
                    r9 = r8 & 8
                    if (r9 == 0) goto L17
                    ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig$ToolbarConfig$ToolbarTitleAlign r5 = ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.ToolbarConfig.ToolbarTitleAlign.LEFT
                L17:
                    r9 = r8 & 16
                    if (r9 == 0) goto L1c
                    r6 = r0
                L1c:
                    r8 = r8 & 32
                    if (r8 == 0) goto L28
                    r9 = r0
                    r7 = r5
                    r8 = r6
                    r5 = r3
                    r6 = r4
                    r3 = r1
                    r4 = r2
                    goto L2f
                L28:
                    r9 = r7
                    r8 = r6
                    r6 = r4
                    r7 = r5
                    r4 = r2
                    r5 = r3
                    r3 = r1
                L2f:
                    r3.<init>(r4, r5, r6, r7, r8, r9)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.ToolbarConfig.DefaultState.<init>(int, boolean, java.lang.String, ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig$ToolbarConfig$ToolbarTitleAlign, java.lang.Integer, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$ToolbarConfig$ToolbarTitleAlign;", "", "<init>", "(Ljava/lang/String;I)V", "LEFT", "CENTER", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ToolbarTitleAlign {
            private static final /* synthetic */ Xc.a $ENTRIES;
            private static final /* synthetic */ ToolbarTitleAlign[] $VALUES;
            public static final ToolbarTitleAlign LEFT = new ToolbarTitleAlign("LEFT", 0);
            public static final ToolbarTitleAlign CENTER = new ToolbarTitleAlign("CENTER", 1);

            private static final /* synthetic */ ToolbarTitleAlign[] $values() {
                return new ToolbarTitleAlign[]{LEFT, CENTER};
            }

            static {
                ToolbarTitleAlign[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private ToolbarTitleAlign(String str, int i11) {
            }

            public static ToolbarTitleAlign valueOf(String str) {
                return (ToolbarTitleAlign) Enum.valueOf(ToolbarTitleAlign.class, str);
            }

            public static ToolbarTitleAlign[] values() {
                return (ToolbarTitleAlign[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ToolbarConfig() {
            this(null, 0, 3, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ToolbarConfig)) {
                return false;
            }
            ToolbarConfig toolbarConfig = (ToolbarConfig) other;
            return Intrinsics.d(this.defaultState, toolbarConfig.defaultState) && this.insetStart == toolbarConfig.insetStart;
        }

        public final DefaultState getDefaultState() {
            return this.defaultState;
        }

        public final int getInsetStart() {
            return this.insetStart;
        }

        public int hashCode() {
            DefaultState defaultState = this.defaultState;
            return Integer.hashCode(this.insetStart) + ((defaultState == null ? 0 : defaultState.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "ToolbarConfig(defaultState=" + this.defaultState + ", insetStart=" + this.insetStart + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DefaultState defaultState = this.defaultState;
            if (defaultState == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                defaultState.writeToParcel(dest, flags);
            }
            dest.writeInt(this.insetStart);
        }

        public ToolbarConfig(DefaultState defaultState, int i11) {
            this.defaultState = defaultState;
            this.insetStart = i11;
        }

        public /* synthetic */ ToolbarConfig(DefaultState defaultState, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? new DefaultState(0, false, null, null, null, null, 63, null) : defaultState, (i12 & 2) != 0 ? 0 : i11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ComposerScreenConfig(@NotNull h.c pageRef, ToolbarConfig toolbarConfig, boolean z11, BottomSheetConfig bottomSheetConfig, boolean z12, boolean z13, boolean z14, boolean z15, @NotNull RefreshByAuthConfig refreshByAuthConfig, boolean z16, boolean z17, boolean z18, @NotNull Set<? extends Class<? extends PageConfigurator>> configurators, @NotNull Set<? extends Class<? extends g>> interceptors, Integer num, BackgroundColor backgroundColor, boolean z19, @NotNull AppearanceConfig appearanceConfig, Set<String> set, Integer num2, boolean z21, boolean z22, @NotNull Class<? extends a> composerEmptyStateScreenFactory, @NotNull Class<? extends C00.a> initialWidgetsProvider) {
        Intrinsics.checkNotNullParameter(pageRef, "pageRef");
        Intrinsics.checkNotNullParameter(refreshByAuthConfig, "refreshByAuthConfig");
        Intrinsics.checkNotNullParameter(configurators, "configurators");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(appearanceConfig, "appearanceConfig");
        Intrinsics.checkNotNullParameter(composerEmptyStateScreenFactory, "composerEmptyStateScreenFactory");
        Intrinsics.checkNotNullParameter(initialWidgetsProvider, "initialWidgetsProvider");
        this.pageRef = pageRef;
        this.toolbarConfig = toolbarConfig;
        this.isPageViewTrackingEnabled = z11;
        this.bottomSheetConfig = bottomSheetConfig;
        this.stickyHeaderEnabled = z12;
        this.animationEnabled = z13;
        this.isSwipeToRefreshEnabled = z14;
        this.isRefreshByLocation = z15;
        this.refreshByAuthConfig = refreshByAuthConfig;
        this.isRefreshByCurrency = z16;
        this.isRefreshByLocale = z17;
        this.isFullScreen = z18;
        this.configurators = configurators;
        this.interceptors = interceptors;
        this.backgroundColor = num;
        this.backgroundColorThemed = backgroundColor;
        this.useSemanticStatusBarColor = z19;
        this.appearanceConfig = appearanceConfig;
        this.notRemovableNoUi = set;
        this.softInputMode = num2;
        this.skipComposerFrequencyLoadCheck = z21;
        this.isFirstRowSpacerEnabled = z22;
        this.composerEmptyStateScreenFactory = composerEmptyStateScreenFactory;
        this.initialWidgetsProvider = initialWidgetsProvider;
    }

    public static /* synthetic */ ComposerScreenConfig copy$default(ComposerScreenConfig composerScreenConfig, h.c cVar, ToolbarConfig toolbarConfig, boolean z11, BottomSheetConfig bottomSheetConfig, boolean z12, boolean z13, boolean z14, boolean z15, RefreshByAuthConfig refreshByAuthConfig, boolean z16, boolean z17, boolean z18, Set set, Set set2, Integer num, BackgroundColor backgroundColor, boolean z19, AppearanceConfig appearanceConfig, Set set3, Integer num2, boolean z21, boolean z22, Class cls, Class cls2, int i11, Object obj) {
        Class cls3;
        Class cls4;
        h.c cVar2 = (i11 & 1) != 0 ? composerScreenConfig.pageRef : cVar;
        ToolbarConfig toolbarConfig2 = (i11 & 2) != 0 ? composerScreenConfig.toolbarConfig : toolbarConfig;
        boolean z23 = (i11 & 4) != 0 ? composerScreenConfig.isPageViewTrackingEnabled : z11;
        BottomSheetConfig bottomSheetConfig2 = (i11 & 8) != 0 ? composerScreenConfig.bottomSheetConfig : bottomSheetConfig;
        boolean z24 = (i11 & 16) != 0 ? composerScreenConfig.stickyHeaderEnabled : z12;
        boolean z25 = (i11 & 32) != 0 ? composerScreenConfig.animationEnabled : z13;
        boolean z26 = (i11 & 64) != 0 ? composerScreenConfig.isSwipeToRefreshEnabled : z14;
        boolean z27 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? composerScreenConfig.isRefreshByLocation : z15;
        RefreshByAuthConfig refreshByAuthConfig2 = (i11 & 256) != 0 ? composerScreenConfig.refreshByAuthConfig : refreshByAuthConfig;
        boolean z28 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? composerScreenConfig.isRefreshByCurrency : z16;
        boolean z29 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? composerScreenConfig.isRefreshByLocale : z17;
        boolean z31 = (i11 & 2048) != 0 ? composerScreenConfig.isFullScreen : z18;
        Set set4 = (i11 & 4096) != 0 ? composerScreenConfig.configurators : set;
        Set set5 = (i11 & 8192) != 0 ? composerScreenConfig.interceptors : set2;
        h.c cVar3 = cVar2;
        Integer num3 = (i11 & 16384) != 0 ? composerScreenConfig.backgroundColor : num;
        BackgroundColor backgroundColor2 = (i11 & 32768) != 0 ? composerScreenConfig.backgroundColorThemed : backgroundColor;
        boolean z32 = (i11 & 65536) != 0 ? composerScreenConfig.useSemanticStatusBarColor : z19;
        AppearanceConfig appearanceConfig2 = (i11 & 131072) != 0 ? composerScreenConfig.appearanceConfig : appearanceConfig;
        Set set6 = (i11 & 262144) != 0 ? composerScreenConfig.notRemovableNoUi : set3;
        Integer num4 = (i11 & 524288) != 0 ? composerScreenConfig.softInputMode : num2;
        boolean z33 = (i11 & 1048576) != 0 ? composerScreenConfig.skipComposerFrequencyLoadCheck : z21;
        boolean z34 = (i11 & 2097152) != 0 ? composerScreenConfig.isFirstRowSpacerEnabled : z22;
        Class cls5 = (i11 & 4194304) != 0 ? composerScreenConfig.composerEmptyStateScreenFactory : cls;
        if ((i11 & 8388608) != 0) {
            cls4 = cls5;
            cls3 = composerScreenConfig.initialWidgetsProvider;
        } else {
            cls3 = cls2;
            cls4 = cls5;
        }
        return composerScreenConfig.copy(cVar3, toolbarConfig2, z23, bottomSheetConfig2, z24, z25, z26, z27, refreshByAuthConfig2, z28, z29, z31, set4, set5, num3, backgroundColor2, z32, appearanceConfig2, set6, num4, z33, z34, cls4, cls3);
    }

    @NotNull
    public final ComposerScreenConfig copy(@NotNull h.c pageRef, ToolbarConfig toolbarConfig, boolean isPageViewTrackingEnabled, BottomSheetConfig bottomSheetConfig, boolean stickyHeaderEnabled, boolean animationEnabled, boolean isSwipeToRefreshEnabled, boolean isRefreshByLocation, @NotNull RefreshByAuthConfig refreshByAuthConfig, boolean isRefreshByCurrency, boolean isRefreshByLocale, boolean isFullScreen, @NotNull Set<? extends Class<? extends PageConfigurator>> configurators, @NotNull Set<? extends Class<? extends g>> interceptors, Integer backgroundColor, BackgroundColor backgroundColorThemed, boolean useSemanticStatusBarColor, @NotNull AppearanceConfig appearanceConfig, Set<String> notRemovableNoUi, Integer softInputMode, boolean skipComposerFrequencyLoadCheck, boolean isFirstRowSpacerEnabled, @NotNull Class<? extends a> composerEmptyStateScreenFactory, @NotNull Class<? extends C00.a> initialWidgetsProvider) {
        Intrinsics.checkNotNullParameter(pageRef, "pageRef");
        Intrinsics.checkNotNullParameter(refreshByAuthConfig, "refreshByAuthConfig");
        Intrinsics.checkNotNullParameter(configurators, "configurators");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(appearanceConfig, "appearanceConfig");
        Intrinsics.checkNotNullParameter(composerEmptyStateScreenFactory, "composerEmptyStateScreenFactory");
        Intrinsics.checkNotNullParameter(initialWidgetsProvider, "initialWidgetsProvider");
        return new ComposerScreenConfig(pageRef, toolbarConfig, isPageViewTrackingEnabled, bottomSheetConfig, stickyHeaderEnabled, animationEnabled, isSwipeToRefreshEnabled, isRefreshByLocation, refreshByAuthConfig, isRefreshByCurrency, isRefreshByLocale, isFullScreen, configurators, interceptors, backgroundColor, backgroundColorThemed, useSemanticStatusBarColor, appearanceConfig, notRemovableNoUi, softInputMode, skipComposerFrequencyLoadCheck, isFirstRowSpacerEnabled, composerEmptyStateScreenFactory, initialWidgetsProvider);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComposerScreenConfig)) {
            return false;
        }
        ComposerScreenConfig composerScreenConfig = (ComposerScreenConfig) other;
        return Intrinsics.d(this.pageRef, composerScreenConfig.pageRef) && Intrinsics.d(this.toolbarConfig, composerScreenConfig.toolbarConfig) && this.isPageViewTrackingEnabled == composerScreenConfig.isPageViewTrackingEnabled && Intrinsics.d(this.bottomSheetConfig, composerScreenConfig.bottomSheetConfig) && this.stickyHeaderEnabled == composerScreenConfig.stickyHeaderEnabled && this.animationEnabled == composerScreenConfig.animationEnabled && this.isSwipeToRefreshEnabled == composerScreenConfig.isSwipeToRefreshEnabled && this.isRefreshByLocation == composerScreenConfig.isRefreshByLocation && Intrinsics.d(this.refreshByAuthConfig, composerScreenConfig.refreshByAuthConfig) && this.isRefreshByCurrency == composerScreenConfig.isRefreshByCurrency && this.isRefreshByLocale == composerScreenConfig.isRefreshByLocale && this.isFullScreen == composerScreenConfig.isFullScreen && Intrinsics.d(this.configurators, composerScreenConfig.configurators) && Intrinsics.d(this.interceptors, composerScreenConfig.interceptors) && Intrinsics.d(this.backgroundColor, composerScreenConfig.backgroundColor) && Intrinsics.d(this.backgroundColorThemed, composerScreenConfig.backgroundColorThemed) && this.useSemanticStatusBarColor == composerScreenConfig.useSemanticStatusBarColor && Intrinsics.d(this.appearanceConfig, composerScreenConfig.appearanceConfig) && Intrinsics.d(this.notRemovableNoUi, composerScreenConfig.notRemovableNoUi) && Intrinsics.d(this.softInputMode, composerScreenConfig.softInputMode) && this.skipComposerFrequencyLoadCheck == composerScreenConfig.skipComposerFrequencyLoadCheck && this.isFirstRowSpacerEnabled == composerScreenConfig.isFirstRowSpacerEnabled && Intrinsics.d(this.composerEmptyStateScreenFactory, composerScreenConfig.composerEmptyStateScreenFactory) && Intrinsics.d(this.initialWidgetsProvider, composerScreenConfig.initialWidgetsProvider);
    }

    public final boolean getAnimationEnabled() {
        return this.animationEnabled;
    }

    @NotNull
    public final AppearanceConfig getAppearanceConfig() {
        return this.appearanceConfig;
    }

    public final BackgroundColor getBackgroundColorThemed() {
        return this.backgroundColorThemed;
    }

    public final BottomSheetConfig getBottomSheetConfig() {
        return this.bottomSheetConfig;
    }

    @NotNull
    public final Class<? extends a> getComposerEmptyStateScreenFactory() {
        return this.composerEmptyStateScreenFactory;
    }

    @NotNull
    public final Set<Class<? extends PageConfigurator>> getConfigurators() {
        return this.configurators;
    }

    @NotNull
    public final Class<? extends C00.a> getInitialWidgetsProvider() {
        return this.initialWidgetsProvider;
    }

    @NotNull
    public final Set<Class<? extends g>> getInterceptors() {
        return this.interceptors;
    }

    public final Set<String> getNotRemovableNoUi() {
        return this.notRemovableNoUi;
    }

    @NotNull
    public final h.c getPageRef() {
        return this.pageRef;
    }

    @NotNull
    public final RefreshByAuthConfig getRefreshByAuthConfig() {
        return this.refreshByAuthConfig;
    }

    public final boolean getSkipComposerFrequencyLoadCheck() {
        return this.skipComposerFrequencyLoadCheck;
    }

    public final Integer getSoftInputMode() {
        return this.softInputMode;
    }

    public final boolean getStickyHeaderEnabled() {
        return this.stickyHeaderEnabled;
    }

    public final ToolbarConfig getToolbarConfig() {
        return this.toolbarConfig;
    }

    public final boolean getUseSemanticStatusBarColor() {
        return this.useSemanticStatusBarColor;
    }

    public int hashCode() {
        int hashCode = this.pageRef.hashCode() * 31;
        ToolbarConfig toolbarConfig = this.toolbarConfig;
        int a11 = C3532b.a((hashCode + (toolbarConfig == null ? 0 : toolbarConfig.hashCode())) * 31, 31, this.isPageViewTrackingEnabled);
        BottomSheetConfig bottomSheetConfig = this.bottomSheetConfig;
        int hashCode2 = (this.interceptors.hashCode() + ((this.configurators.hashCode() + C3532b.a(C3532b.a(C3532b.a((this.refreshByAuthConfig.hashCode() + C3532b.a(C3532b.a(C3532b.a(C3532b.a((a11 + (bottomSheetConfig == null ? 0 : bottomSheetConfig.hashCode())) * 31, 31, this.stickyHeaderEnabled), 31, this.animationEnabled), 31, this.isSwipeToRefreshEnabled), 31, this.isRefreshByLocation)) * 31, 31, this.isRefreshByCurrency), 31, this.isRefreshByLocale), 31, this.isFullScreen)) * 31)) * 31;
        Integer num = this.backgroundColor;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        BackgroundColor backgroundColor = this.backgroundColorThemed;
        int hashCode4 = (this.appearanceConfig.hashCode() + C3532b.a((hashCode3 + (backgroundColor == null ? 0 : backgroundColor.hashCode())) * 31, 31, this.useSemanticStatusBarColor)) * 31;
        Set<String> set = this.notRemovableNoUi;
        int hashCode5 = (hashCode4 + (set == null ? 0 : set.hashCode())) * 31;
        Integer num2 = this.softInputMode;
        return this.initialWidgetsProvider.hashCode() + ((this.composerEmptyStateScreenFactory.hashCode() + C3532b.a(C3532b.a((hashCode5 + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.skipComposerFrequencyLoadCheck), 31, this.isFirstRowSpacerEnabled)) * 31);
    }

    /* renamed from: isFirstRowSpacerEnabled, reason: from getter */
    public final boolean getIsFirstRowSpacerEnabled() {
        return this.isFirstRowSpacerEnabled;
    }

    /* renamed from: isFullScreen, reason: from getter */
    public final boolean getIsFullScreen() {
        return this.isFullScreen;
    }

    /* renamed from: isPageViewTrackingEnabled, reason: from getter */
    public final boolean getIsPageViewTrackingEnabled() {
        return this.isPageViewTrackingEnabled;
    }

    /* renamed from: isRefreshByCurrency, reason: from getter */
    public final boolean getIsRefreshByCurrency() {
        return this.isRefreshByCurrency;
    }

    /* renamed from: isRefreshByLocale, reason: from getter */
    public final boolean getIsRefreshByLocale() {
        return this.isRefreshByLocale;
    }

    /* renamed from: isRefreshByLocation, reason: from getter */
    public final boolean getIsRefreshByLocation() {
        return this.isRefreshByLocation;
    }

    /* renamed from: isSwipeToRefreshEnabled, reason: from getter */
    public final boolean getIsSwipeToRefreshEnabled() {
        return this.isSwipeToRefreshEnabled;
    }

    @NotNull
    public String toString() {
        h.c cVar = this.pageRef;
        ToolbarConfig toolbarConfig = this.toolbarConfig;
        boolean z11 = this.isPageViewTrackingEnabled;
        BottomSheetConfig bottomSheetConfig = this.bottomSheetConfig;
        boolean z12 = this.stickyHeaderEnabled;
        boolean z13 = this.animationEnabled;
        boolean z14 = this.isSwipeToRefreshEnabled;
        boolean z15 = this.isRefreshByLocation;
        RefreshByAuthConfig refreshByAuthConfig = this.refreshByAuthConfig;
        boolean z16 = this.isRefreshByCurrency;
        boolean z17 = this.isRefreshByLocale;
        boolean z18 = this.isFullScreen;
        Set<Class<? extends PageConfigurator>> set = this.configurators;
        Set<Class<? extends g>> set2 = this.interceptors;
        Integer num = this.backgroundColor;
        BackgroundColor backgroundColor = this.backgroundColorThemed;
        boolean z19 = this.useSemanticStatusBarColor;
        AppearanceConfig appearanceConfig = this.appearanceConfig;
        Set<String> set3 = this.notRemovableNoUi;
        Integer num2 = this.softInputMode;
        boolean z21 = this.skipComposerFrequencyLoadCheck;
        boolean z22 = this.isFirstRowSpacerEnabled;
        Class<? extends a> cls = this.composerEmptyStateScreenFactory;
        Class<? extends C00.a> cls2 = this.initialWidgetsProvider;
        StringBuilder sb2 = new StringBuilder("ComposerScreenConfig(pageRef=");
        sb2.append(cVar);
        sb2.append(", toolbarConfig=");
        sb2.append(toolbarConfig);
        sb2.append(", isPageViewTrackingEnabled=");
        sb2.append(z11);
        sb2.append(", bottomSheetConfig=");
        sb2.append(bottomSheetConfig);
        sb2.append(", stickyHeaderEnabled=");
        f.c(", animationEnabled=", ", isSwipeToRefreshEnabled=", sb2, z12, z13);
        f.c(", isRefreshByLocation=", ", refreshByAuthConfig=", sb2, z14, z15);
        sb2.append(refreshByAuthConfig);
        sb2.append(", isRefreshByCurrency=");
        sb2.append(z16);
        sb2.append(", isRefreshByLocale=");
        f.c(", isFullScreen=", ", configurators=", sb2, z17, z18);
        sb2.append(set);
        sb2.append(", interceptors=");
        sb2.append(set2);
        sb2.append(", backgroundColor=");
        sb2.append(num);
        sb2.append(", backgroundColorThemed=");
        sb2.append(backgroundColor);
        sb2.append(", useSemanticStatusBarColor=");
        sb2.append(z19);
        sb2.append(", appearanceConfig=");
        sb2.append(appearanceConfig);
        sb2.append(", notRemovableNoUi=");
        sb2.append(set3);
        sb2.append(", softInputMode=");
        sb2.append(num2);
        sb2.append(", skipComposerFrequencyLoadCheck=");
        f.c(", isFirstRowSpacerEnabled=", ", composerEmptyStateScreenFactory=", sb2, z21, z22);
        sb2.append(cls);
        sb2.append(", initialWidgetsProvider=");
        sb2.append(cls2);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.pageRef, flags);
        ToolbarConfig toolbarConfig = this.toolbarConfig;
        if (toolbarConfig == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            toolbarConfig.writeToParcel(dest, flags);
        }
        dest.writeInt(this.isPageViewTrackingEnabled ? 1 : 0);
        BottomSheetConfig bottomSheetConfig = this.bottomSheetConfig;
        if (bottomSheetConfig == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            bottomSheetConfig.writeToParcel(dest, flags);
        }
        dest.writeInt(this.stickyHeaderEnabled ? 1 : 0);
        dest.writeInt(this.animationEnabled ? 1 : 0);
        dest.writeInt(this.isSwipeToRefreshEnabled ? 1 : 0);
        dest.writeInt(this.isRefreshByLocation ? 1 : 0);
        dest.writeParcelable(this.refreshByAuthConfig, flags);
        dest.writeInt(this.isRefreshByCurrency ? 1 : 0);
        dest.writeInt(this.isRefreshByLocale ? 1 : 0);
        dest.writeInt(this.isFullScreen ? 1 : 0);
        Set<Class<? extends PageConfigurator>> set = this.configurators;
        dest.writeInt(set.size());
        Iterator<Class<? extends PageConfigurator>> it = set.iterator();
        while (it.hasNext()) {
            dest.writeSerializable(it.next());
        }
        Set<Class<? extends g>> set2 = this.interceptors;
        dest.writeInt(set2.size());
        Iterator<Class<? extends g>> it2 = set2.iterator();
        while (it2.hasNext()) {
            dest.writeSerializable(it2.next());
        }
        Integer num = this.backgroundColor;
        if (num == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num);
        }
        dest.writeParcelable(this.backgroundColorThemed, flags);
        dest.writeInt(this.useSemanticStatusBarColor ? 1 : 0);
        this.appearanceConfig.writeToParcel(dest, flags);
        Set<String> set3 = this.notRemovableNoUi;
        if (set3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(set3.size());
            Iterator<String> it3 = set3.iterator();
            while (it3.hasNext()) {
                dest.writeString(it3.next());
            }
        }
        Integer num2 = this.softInputMode;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num2);
        }
        dest.writeInt(this.skipComposerFrequencyLoadCheck ? 1 : 0);
        dest.writeInt(this.isFirstRowSpacerEnabled ? 1 : 0);
        dest.writeSerializable(this.composerEmptyStateScreenFactory);
        dest.writeSerializable(this.initialWidgetsProvider);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ComposerScreenConfig(h.c cVar, ToolbarConfig toolbarConfig, boolean z11, BottomSheetConfig bottomSheetConfig, boolean z12, boolean z13, boolean z14, boolean z15, RefreshByAuthConfig refreshByAuthConfig, boolean z16, boolean z17, boolean z18, Set set, Set set2, Integer num, BackgroundColor backgroundColor, boolean z19, AppearanceConfig appearanceConfig, Set set3, Integer num2, boolean z21, boolean z22, Class cls, Class cls2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, r4, r7, r8, r9, r10, r11, r12, r13, r2, r3, r14, r15, r5, r24, r17, r18, r0, (i11 & 262144) != 0 ? null : set3, (i11 & 524288) == 0 ? num2 : null, (i11 & 1048576) != 0 ? false : z21, (i11 & 2097152) == 0 ? z22 : r1, (i11 & 4194304) != 0 ? DefaultEmptyScreenFactory.class : cls, (i11 & 8388608) != 0 ? DefaultInitialWidgetsProvider.class : cls2);
        ToolbarConfig toolbarConfig2;
        RefreshByAuthConfig refreshByAuthConfig2;
        BackgroundColor backgroundColor2;
        Integer num3;
        boolean z23;
        AppearanceConfig appearanceConfig2;
        int i12 = 3;
        int i13 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if ((i11 & 2) != 0) {
            toolbarConfig2 = new ToolbarConfig(objArr4 == true ? 1 : 0, i13, i12, objArr3 == true ? 1 : 0);
        } else {
            toolbarConfig2 = toolbarConfig;
        }
        boolean z24 = (i11 & 4) != 0 ? true : z11;
        BottomSheetConfig bottomSheetConfig2 = (i11 & 8) != 0 ? null : bottomSheetConfig;
        boolean z25 = (i11 & 16) != 0 ? false : z12;
        boolean z26 = (i11 & 32) != 0 ? true : z13;
        boolean z27 = (i11 & 64) != 0 ? true : z14;
        boolean z28 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? true : z15;
        if ((i11 & 256) != 0) {
            RefreshByAuthConfig.Enabled.ReasonRefresh[] elements = {RefreshByAuthConfig.Enabled.ReasonRefresh.Login.INSTANCE, RefreshByAuthConfig.Enabled.ReasonRefresh.Logout.INSTANCE, RefreshByAuthConfig.Enabled.ReasonRefresh.SwitchUser.INSTANCE};
            Intrinsics.checkNotNullParameter(elements, "elements");
            refreshByAuthConfig2 = new RefreshByAuthConfig.Enabled(C7705l.j0(elements));
        } else {
            refreshByAuthConfig2 = refreshByAuthConfig;
        }
        boolean z29 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? true : z16;
        boolean z31 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? true : z17;
        boolean z32 = (i11 & 2048) != 0 ? false : z18;
        Set set4 = (i11 & 4096) != 0 ? M.f71699a : set;
        Set set5 = (i11 & 8192) != 0 ? M.f71699a : set2;
        Integer num4 = (i11 & 16384) != 0 ? null : num;
        if ((i11 & 32768) != 0) {
            backgroundColor2 = num4 != null ? BackgroundColorResource.m682boximpl(BackgroundColorResource.m683constructorimpl(num4.intValue())) : null;
        } else {
            backgroundColor2 = backgroundColor;
        }
        boolean z33 = (i11 & 65536) != 0 ? true : z19;
        if ((i11 & 131072) != 0) {
            num3 = num4;
            z23 = true;
            appearanceConfig2 = new AppearanceConfig(objArr2 == true ? 1 : 0, 1 == true ? 1 : 0, objArr == true ? 1 : 0);
        } else {
            num3 = num4;
            z23 = true;
            appearanceConfig2 = appearanceConfig;
        }
    }
}

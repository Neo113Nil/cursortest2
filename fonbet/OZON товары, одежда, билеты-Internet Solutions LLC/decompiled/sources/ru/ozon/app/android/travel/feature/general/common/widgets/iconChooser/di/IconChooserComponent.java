package ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.di;

import Cn.C2782a;
import GZ.g;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import androidx.lifecycle.z0;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.travel.data.storage.TravelStorageManagerHolder;
import ru.ozon.app.android.travel.data.storage.di.api.TravelStorageApi;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 &2\u00060\u0001j\u0002`\u0002:\u0001&B\u0015\b\u0002\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/di/IconChooserComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "<init>", "(Lk20/g;)V", "Lk20/g;", "Lru/ozon/app/android/travel/data/storage/TravelStorageManagerHolder;", "travelStorageManagerHolder", "Lru/ozon/app/android/travel/data/storage/TravelStorageManagerHolder;", "getTravelStorageManagerHolder", "()Lru/ozon/app/android/travel/data/storage/TravelStorageManagerHolder;", "Landroid/content/Context;", "context$delegate", "LSc/j;", "getContext", "()Landroid/content/Context;", "context", "Landroidx/lifecycle/z0$b;", "viewModelFactory$delegate", "getViewModelFactory", "()Landroidx/lifecycle/z0$b;", "viewModelFactory", "LGZ/g;", "ozonRouter$delegate", "getOzonRouter", "()LGZ/g;", "ozonRouter", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "getContextComponentDependencies", "()Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentDependencies", "Lru/ozon/app/android/travel/data/storage/di/api/TravelStorageApi;", "getTravelStorageComponentDependencies", "()Lru/ozon/app/android/travel/data/storage/di/api/TravelStorageApi;", "travelStorageComponentDependencies", "Companion", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class IconChooserComponent implements InterfaceC6958a {

    /* renamed from: context$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j context;

    /* renamed from: ozonRouter$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j ozonRouter;

    @NotNull
    private final C7475g storage;

    @NotNull
    private final TravelStorageManagerHolder travelStorageManagerHolder;

    /* renamed from: viewModelFactory$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewModelFactory;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/di/IconChooserComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/di/IconChooserComponent;", "getInstance", "(Lk20/g;)Lk20/e;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final IconChooserComponent getInstance$lambda$0(C7475g c7475g) {
            return new IconChooserComponent(c7475g, null);
        }

        @NotNull
        public final C7473e<IconChooserComponent> getInstance(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(IconChooserComponent.class), new C2782a(storage, 4));
        }

        private Companion() {
        }
    }

    public /* synthetic */ IconChooserComponent(C7475g c7475g, DefaultConstructorMarker defaultConstructorMarker) {
        this(c7475g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContextComponentDependencies getContextComponentDependencies() {
        return (ContextComponentDependencies) this.storage.getComponent(ContextComponentDependencies.class);
    }

    private final TravelStorageApi getTravelStorageComponentDependencies() {
        return (TravelStorageApi) this.storage.getComponent(TravelStorageApi.class);
    }

    @NotNull
    public final Context getContext() {
        return (Context) this.context.getValue();
    }

    @NotNull
    public final g getOzonRouter() {
        return (g) this.ozonRouter.getValue();
    }

    @NotNull
    public final TravelStorageManagerHolder getTravelStorageManagerHolder() {
        return this.travelStorageManagerHolder;
    }

    @NotNull
    public final z0.b getViewModelFactory() {
        return (z0.b) this.viewModelFactory.getValue();
    }

    private IconChooserComponent(C7475g c7475g) {
        this.storage = c7475g;
        this.travelStorageManagerHolder = getTravelStorageComponentDependencies().getTravelStorageManagerHolder();
        this.context = k.b(new IconChooserComponent$context$2(this));
        this.viewModelFactory = k.b(new IconChooserComponent$viewModelFactory$2(this));
        this.ozonRouter = k.b(new IconChooserComponent$ozonRouter$2(this));
    }
}

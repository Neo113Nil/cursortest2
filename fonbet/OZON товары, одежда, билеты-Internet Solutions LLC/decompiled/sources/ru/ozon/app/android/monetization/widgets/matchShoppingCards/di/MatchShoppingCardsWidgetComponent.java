package ru.ozon.app.android.monetization.widgets.matchShoppingCards.di;

import AO.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.core.MatchShoppingCardsMapper;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.domain.MatchShoppingCardsImagesPrefetcher;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.domain.MatchShoppingCardsInteractor;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.teensMode.TeensModeStorage;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 <2\u00060\u0001j\u0002`\u0002:\u0001<B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\n\u001a\u0004\b\u001f\u0010 R\u001f\u0010'\u001a\u00060\"j\u0002`#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\n\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\n\u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\n\u001a\u0004\b/\u00100R\u001b\u00106\u001a\u0002028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\n\u001a\u0004\b4\u00105R\u001b\u0010;\u001a\u0002078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b8\u0010\n\u001a\u0004\b9\u0010:¨\u0006="}, d2 = {"Lru/ozon/app/android/monetization/widgets/matchShoppingCards/di/MatchShoppingCardsWidgetComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lk20/g;", "storage", "<init>", "(Lk20/g;)V", "Lk20/g;", "Lru/ozon/app/android/action/di/ActionComponentApi;", "actionComponentApi$delegate", "LSc/j;", "getActionComponentApi", "()Lru/ozon/app/android/action/di/ActionComponentApi;", "actionComponentApi", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextDependencies$delegate", "getContextDependencies", "()Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextDependencies", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi$delegate", "getRetainComposerComponentApi", "()Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "storageComponentApi$delegate", "getStorageComponentApi", "()Lru/ozon/app/android/storage/di/StorageComponentApi;", "storageComponentApi", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/core/MatchShoppingCardsMapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/monetization/widgets/matchShoppingCards/core/MatchShoppingCardsMapper;", "mapper", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory$delegate", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/domain/MatchShoppingCardsInteractor;", "matchShoppingCardsInteractor$delegate", "getMatchShoppingCardsInteractor", "()Lru/ozon/app/android/monetization/widgets/matchShoppingCards/domain/MatchShoppingCardsInteractor;", "matchShoppingCardsInteractor", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/domain/MatchShoppingCardsImagesPrefetcher;", "matchShoppingCardsImagesPrefetcher$delegate", "getMatchShoppingCardsImagesPrefetcher", "()Lru/ozon/app/android/monetization/widgets/matchShoppingCards/domain/MatchShoppingCardsImagesPrefetcher;", "matchShoppingCardsImagesPrefetcher", "LWZ/l;", "tokenizedAnalytics$delegate", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/storage/teensMode/TeensModeStorage;", "teensModeStorage$delegate", "getTeensModeStorage", "()Lru/ozon/app/android/storage/teensMode/TeensModeStorage;", "teensModeStorage", "Companion", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MatchShoppingCardsWidgetComponent implements InterfaceC6958a {

    /* renamed from: actionComponentApi$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j actionComponentApi;

    /* renamed from: contextDependencies$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j contextDependencies;

    /* renamed from: customActionHandlersStoreFactory$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j customActionHandlersStoreFactory;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mapper;

    /* renamed from: matchShoppingCardsImagesPrefetcher$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j matchShoppingCardsImagesPrefetcher;

    /* renamed from: matchShoppingCardsInteractor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j matchShoppingCardsInteractor;

    /* renamed from: retainComposerComponentApi$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j retainComposerComponentApi;

    @NotNull
    private final C7475g storage;

    /* renamed from: storageComponentApi$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j storageComponentApi;

    /* renamed from: teensModeStorage$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j teensModeStorage;

    /* renamed from: tokenizedAnalytics$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j tokenizedAnalytics;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/monetization/widgets/matchShoppingCards/di/MatchShoppingCardsWidgetComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "storage", "Lk20/e;", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/di/MatchShoppingCardsWidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MatchShoppingCardsWidgetComponent create$lambda$0(C7475g c7475g) {
            return new MatchShoppingCardsWidgetComponent(c7475g, null);
        }

        @NotNull
        public final C7473e<MatchShoppingCardsWidgetComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(MatchShoppingCardsWidgetComponent.class), new a(storage, 3));
        }

        private Companion() {
        }
    }

    public /* synthetic */ MatchShoppingCardsWidgetComponent(C7475g c7475g, DefaultConstructorMarker defaultConstructorMarker) {
        this(c7475g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ActionComponentApi getActionComponentApi() {
        return (ActionComponentApi) this.actionComponentApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContextComponentDependencies getContextDependencies() {
        return (ContextComponentDependencies) this.contextDependencies.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RetainComposerComponentApi getRetainComposerComponentApi() {
        return (RetainComposerComponentApi) this.retainComposerComponentApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StorageComponentApi getStorageComponentApi() {
        return (StorageComponentApi) this.storageComponentApi.getValue();
    }

    @NotNull
    public final d getCustomActionHandlersStoreFactory() {
        return (d) this.customActionHandlersStoreFactory.getValue();
    }

    @NotNull
    public final MatchShoppingCardsMapper getMapper() {
        return (MatchShoppingCardsMapper) this.mapper.getValue();
    }

    @NotNull
    public final MatchShoppingCardsImagesPrefetcher getMatchShoppingCardsImagesPrefetcher() {
        return (MatchShoppingCardsImagesPrefetcher) this.matchShoppingCardsImagesPrefetcher.getValue();
    }

    @NotNull
    public final MatchShoppingCardsInteractor getMatchShoppingCardsInteractor() {
        return (MatchShoppingCardsInteractor) this.matchShoppingCardsInteractor.getValue();
    }

    @NotNull
    public final TeensModeStorage getTeensModeStorage() {
        return (TeensModeStorage) this.teensModeStorage.getValue();
    }

    private MatchShoppingCardsWidgetComponent(C7475g c7475g) {
        this.storage = c7475g;
        this.actionComponentApi = k.b(new MatchShoppingCardsWidgetComponent$actionComponentApi$2(this));
        this.contextDependencies = k.b(new MatchShoppingCardsWidgetComponent$contextDependencies$2(this));
        this.retainComposerComponentApi = k.b(new MatchShoppingCardsWidgetComponent$retainComposerComponentApi$2(this));
        this.storageComponentApi = k.b(new MatchShoppingCardsWidgetComponent$storageComponentApi$2(this));
        this.mapper = k.b(MatchShoppingCardsWidgetComponent$mapper$2.INSTANCE);
        this.customActionHandlersStoreFactory = k.b(new MatchShoppingCardsWidgetComponent$customActionHandlersStoreFactory$2(this));
        this.matchShoppingCardsInteractor = k.b(new MatchShoppingCardsWidgetComponent$matchShoppingCardsInteractor$2(this));
        this.matchShoppingCardsImagesPrefetcher = k.b(new MatchShoppingCardsWidgetComponent$matchShoppingCardsImagesPrefetcher$2(this));
        this.tokenizedAnalytics = k.b(new MatchShoppingCardsWidgetComponent$tokenizedAnalytics$2(this));
        this.teensModeStorage = k.b(new MatchShoppingCardsWidgetComponent$teensModeStorage$2(this));
    }
}

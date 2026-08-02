package ru.ozon.app.android.seller.molecule.sisbrandfavorite;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ge.n;
import Sc.o;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.favorites.seller.SellerFavoriteService;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.common.actionHandlers.R$string;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.localstorage.FavoriteStateStore;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.localstorage.KeyFavoriteEntityModel;
import ru.ozon.app.android.favorites.domain.eventmanager.FavoriteEvent;
import ru.ozon.app.android.favorites.domain.eventmanager.FavoriteEventManager;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.data.SisBrandFavoriteButton;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;
import xe.C10727i;
import xe.H0;
import xe.J;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 12\u00020\u0001:\u00011B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J!\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001b\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001a\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u001f\u0010 J\"\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!H\u0086@¢\u0006\u0004\b$\u0010%J#\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, d2 = {"Lru/ozon/app/android/seller/molecule/sisbrandfavorite/SisBrandFavoriteInteractor;", "", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEventManager;", "favoriteEventManager", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/localstorage/FavoriteStateStore;", "favoriteStateStore", "Lru/ozon/app/android/account/favorites/seller/SellerFavoriteService;", "sellerFavoriteService", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "dispatchers", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEventManager;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/localstorage/FavoriteStateStore;Lru/ozon/app/android/account/favorites/seller/SellerFavoriteService;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;)V", "", "id", "LAe/h;", "", "observeBrands", "(J)LAe/h;", "observeSellers", "", "actionId", "", "updateState", "(Ljava/lang/String;J)V", "moleculeId", "revertState", "sendEvent", "(Ljava/lang/String;)V", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "createDefaultError", "(Ljava/lang/String;)Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "processAction", "(JLru/ozon/uni/atoms/af/AtomAction$ComposerAction;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/data/SisBrandFavoriteButton$MoleculeType;", "type", "observeState", "(JLru/ozon/app/android/seller/molecule/sisbrandfavorite/data/SisBrandFavoriteButton$MoleculeType;)LAe/h;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEventManager;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/localstorage/FavoriteStateStore;", "Lru/ozon/app/android/account/favorites/seller/SellerFavoriteService;", "Lxe/M;", "scope", "Lxe/M;", "Companion", "seller_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SisBrandFavoriteInteractor {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final Set<String> SUPPORTED_ACTIONS;

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final FavoriteEventManager favoriteEventManager;

    @NotNull
    private final FavoriteStateStore favoriteStateStore;

    @NotNull
    private final M scope;

    @NotNull
    private final SellerFavoriteService sellerFavoriteService;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/seller/molecule/sisbrandfavorite/SisBrandFavoriteInteractor$Companion;", "", "<init>", "()V", "SIS_LIKE", "", "SIS_UNLIKE", "FAVORITE_BRAND_ADD", "FAVORITE_BRAND_REMOVE", "SUPPORTED_ACTIONS", "", "getSUPPORTED_ACTIONS", "()Ljava/util/Set;", "seller_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<String> getSUPPORTED_ACTIONS() {
            return SisBrandFavoriteInteractor.SUPPORTED_ACTIONS;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SisBrandFavoriteButton.MoleculeType.values().length];
            try {
                iArr[SisBrandFavoriteButton.MoleculeType.BRAND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SisBrandFavoriteButton.MoleculeType.SELLER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        String[] elements = {"sisLike", "sisUnlike", "favoriteBrandAdd", "favoriteBrandRemove"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        SUPPORTED_ACTIONS = C7705l.j0(elements);
    }

    public SisBrandFavoriteInteractor(@NotNull ActionV2Repository actionV2Repository, @NotNull FavoriteEventManager favoriteEventManager, @NotNull FavoriteStateStore favoriteStateStore, @NotNull SellerFavoriteService sellerFavoriteService, @NotNull CoroutineDispatcherProvider dispatchers) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(favoriteEventManager, "favoriteEventManager");
        Intrinsics.checkNotNullParameter(favoriteStateStore, "favoriteStateStore");
        Intrinsics.checkNotNullParameter(sellerFavoriteService, "sellerFavoriteService");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.actionV2Repository = actionV2Repository;
        this.favoriteEventManager = favoriteEventManager;
        this.favoriteStateStore = favoriteStateStore;
        this.sellerFavoriteService = sellerFavoriteService;
        this.scope = N.a(CoroutineContext.Element.a.d(dispatchers.getIO(), (H0) X0.b()).plus(new SisBrandFavoriteInteractor$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
    
        if (r14.equals("favoriteBrandRemove") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        r14 = ru.ozon.app.android.common.actionHandlers.R$string.reviews_single_review_social_header_unsubscribe_error_android;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
    
        if (r14.equals("favoriteBrandAdd") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r14.equals("sisUnlike") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
    
        if (r14.equals("sisLike") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0025, code lost:
    
        r14 = ru.ozon.app.android.common.actionHandlers.R$string.reviews_single_review_social_header_subscribe_error_android;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final NotificationDTO createDefaultError(String actionId) {
        if (actionId != null) {
            switch (actionId.hashCode()) {
                case -1865246483:
                    break;
                case 617809238:
                    break;
                case 1708143535:
                    break;
                case 2098342420:
                    break;
            }
            return new NotificationDTO(StringProvider.getString(r14), StringProvider.getString(R$string.reviews_single_review_social_header_try_again_android), null, null, null, null, null, null, null, NotificationDTO.Preset.NEGATIVE, 476, null);
        }
        int i11 = 0;
        return new NotificationDTO(StringProvider.getString(i11), StringProvider.getString(R$string.reviews_single_review_social_header_try_again_android), null, null, null, null, null, null, null, NotificationDTO.Preset.NEGATIVE, 476, null);
    }

    private final InterfaceC2395h<Boolean> observeBrands(long id2) {
        final KeyFavoriteEntityModel keyFavoriteEntityModel = new KeyFavoriteEntityModel(id2, SisBrandFavoriteButton.MoleculeType.BRAND.getType());
        final InterfaceC2395h a11 = n.a(this.favoriteStateStore.subscribeOnFavoriteUpdate());
        return C2399j.o(new InterfaceC2395h<Boolean>() { // from class: ru.ozon.app.android.seller.molecule.sisbrandfavorite.SisBrandFavoriteInteractor$observeBrands$$inlined$mapNotNull$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.seller.molecule.sisbrandfavorite.SisBrandFavoriteInteractor$observeBrands$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ KeyFavoriteEntityModel $key$inlined;
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.seller.molecule.sisbrandfavorite.SisBrandFavoriteInteractor$observeBrands$$inlined$mapNotNull$1$2", f = "SisBrandFavoriteInteractor.kt", l = {52}, m = "emit")
                /* renamed from: ru.ozon.app.android.seller.molecule.sisbrandfavorite.SisBrandFavoriteInteractor$observeBrands$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i, KeyFavoriteEntityModel keyFavoriteEntityModel) {
                    this.$this_unsafeFlow = interfaceC2397i;
                    this.$key$inlined = keyFavoriteEntityModel;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            a aVar = a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                Object obj3 = ((Map) obj).get(this.$key$inlined);
                                if (obj3 != null) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2397i.emit(obj3, anonymousClass1) == aVar) {
                                        return aVar;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    a aVar2 = a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super Boolean> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, keyFavoriteEntityModel), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        });
    }

    private final InterfaceC2395h<Boolean> observeSellers(final long id2) {
        final InterfaceC2395h a11 = n.a(this.sellerFavoriteService.favoritesChangeEvents());
        return C2399j.o(new InterfaceC2395h<Boolean>() { // from class: ru.ozon.app.android.seller.molecule.sisbrandfavorite.SisBrandFavoriteInteractor$observeSellers$$inlined$mapNotNull$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.seller.molecule.sisbrandfavorite.SisBrandFavoriteInteractor$observeSellers$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ long $id$inlined;
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.seller.molecule.sisbrandfavorite.SisBrandFavoriteInteractor$observeSellers$$inlined$mapNotNull$1$2", f = "SisBrandFavoriteInteractor.kt", l = {52}, m = "emit")
                /* renamed from: ru.ozon.app.android.seller.molecule.sisbrandfavorite.SisBrandFavoriteInteractor$observeSellers$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i, long j11) {
                    this.$this_unsafeFlow = interfaceC2397i;
                    this.$id$inlined = j11;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            a aVar = a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                Object obj3 = ((Map) obj).get(new Long(this.$id$inlined));
                                if (obj3 != null) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2397i.emit(obj3, anonymousClass1) == aVar) {
                                        return aVar;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    a aVar2 = a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super Boolean> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, id2), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public final void revertState(String actionId, long moleculeId) {
        if (actionId != null) {
            switch (actionId.hashCode()) {
                case -1865246483:
                    if (actionId.equals("sisUnlike")) {
                        this.sellerFavoriteService.addSellerFavoriteLocal(moleculeId);
                        break;
                    }
                    break;
                case 617809238:
                    if (actionId.equals("favoriteBrandAdd")) {
                        this.favoriteStateStore.favoriteIsUpdated(new KeyFavoriteEntityModel(moleculeId, SisBrandFavoriteButton.MoleculeType.BRAND.getType()), false);
                        break;
                    }
                    break;
                case 1708143535:
                    if (actionId.equals("favoriteBrandRemove")) {
                        this.favoriteStateStore.favoriteIsUpdated(new KeyFavoriteEntityModel(moleculeId, SisBrandFavoriteButton.MoleculeType.BRAND.getType()), true);
                        break;
                    }
                    break;
                case 2098342420:
                    if (actionId.equals("sisLike")) {
                        this.sellerFavoriteService.removeSellerFavoriteLocal(moleculeId);
                        break;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public final void sendEvent(String actionId) {
        if (actionId != null) {
            switch (actionId.hashCode()) {
                case -1865246483:
                    if (!actionId.equals("sisUnlike")) {
                    }
                    this.favoriteEventManager.onFavStateUpdated(FavoriteEvent.FavoriteStateUpdated.INSTANCE);
                    break;
                case 617809238:
                    if (!actionId.equals("favoriteBrandAdd")) {
                    }
                    this.favoriteEventManager.onFavEntityStateUpdated(FavoriteEvent.FavoriteEntityUpdated.INSTANCE);
                    break;
                case 1708143535:
                    if (!actionId.equals("favoriteBrandRemove")) {
                    }
                    this.favoriteEventManager.onFavEntityStateUpdated(FavoriteEvent.FavoriteEntityUpdated.INSTANCE);
                    break;
                case 2098342420:
                    if (!actionId.equals("sisLike")) {
                    }
                    this.favoriteEventManager.onFavStateUpdated(FavoriteEvent.FavoriteStateUpdated.INSTANCE);
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public final void updateState(String actionId, long id2) {
        if (actionId != null) {
            switch (actionId.hashCode()) {
                case -1865246483:
                    if (actionId.equals("sisUnlike")) {
                        this.sellerFavoriteService.removeSellerFavoriteLocal(id2);
                        break;
                    }
                    break;
                case 617809238:
                    if (actionId.equals("favoriteBrandAdd")) {
                        this.favoriteStateStore.favoriteIsUpdated(new KeyFavoriteEntityModel(id2, SisBrandFavoriteButton.MoleculeType.BRAND.getType()), true);
                        break;
                    }
                    break;
                case 1708143535:
                    if (actionId.equals("favoriteBrandRemove")) {
                        this.favoriteStateStore.favoriteIsUpdated(new KeyFavoriteEntityModel(id2, SisBrandFavoriteButton.MoleculeType.BRAND.getType()), false);
                        break;
                    }
                    break;
                case 2098342420:
                    if (actionId.equals("sisLike")) {
                        this.sellerFavoriteService.addSellerFavoriteLocal(id2);
                        break;
                    }
                    break;
            }
        }
    }

    @NotNull
    public final InterfaceC2395h<Boolean> observeState(long id2, @NotNull SisBrandFavoriteButton.MoleculeType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        int i11 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i11 == 1) {
            return observeBrands(id2);
        }
        if (i11 == 2) {
            return observeSellers(id2);
        }
        throw new o();
    }

    public final Object processAction(long j11, @NotNull AtomAction.ComposerAction composerAction, @NotNull d<? super NotificationModelWrapper> dVar) {
        return C10727i.f(this.scope.getCoroutineContext(), new SisBrandFavoriteInteractor$processAction$2(composerAction, this, j11, null), dVar);
    }
}

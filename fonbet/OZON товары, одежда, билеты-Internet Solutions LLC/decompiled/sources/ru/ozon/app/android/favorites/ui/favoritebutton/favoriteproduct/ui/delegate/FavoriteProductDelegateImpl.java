package ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate;

import Ae.B0;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import Sc.s;
import Ve.C4598rp;
import WZ.l;
import Wc.a;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.domain.actionhandlers.FavoritesComposerActionHandler;
import ru.ozon.app.android.favorites.domain.eventBus.RemoveFromFavoritesEventBus;
import ru.ozon.app.android.favorites.domain.notification.NotificationDelegate;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.FavProductButtonPresenter;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.FavProductButtonView;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.FavoriteButton;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.ProductFavoriteButtonViewHolder;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.ProductFavoriteMoleculeButtonView;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB1\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u0012J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u0019\u0010\u001e\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010#\u001a\u00020\u00182\u0006\u0010!\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u001cH\u0016¢\u0006\u0004\b&\u0010\u001fJ\u0017\u0010'\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u001cH\u0016¢\u0006\u0004\b'\u0010\u001fJ\u001f\u0010,\u001a\u00020\u00182\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u0013\u00100\u001a\u00060.j\u0002`/H\u0016¢\u0006\u0004\b0\u00101J\u0011\u00102\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\u00182\u0006\u0010!\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0018H\u0016¢\u0006\u0004\b7\u0010\u001aJ\u0017\u0010:\u001a\u00020\u00182\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u00182\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b<\u0010;J\u0017\u0010=\u001a\u00020\u00182\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b=\u0010;R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010>R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010?R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010@R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010AR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010BR\u0018\u0010C\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u001b\u0010J\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0018\u0010K\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010M\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR0\u0010P\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0018\u0018\u00010O8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010U¨\u0006V"}, d2 = {"Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegateImpl;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/FavProductButtonView;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/FavProductButtonPresenter;", "favoriteProductButtonPresenter", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesComposerActionHandler;", "favoritesComposerActionHandler", "Lru/ozon/app/android/utils/AppType;", "appType", "<init>", "(Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/FavProductButtonPresenter;Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesComposerActionHandler;Lru/ozon/app/android/utils/AppType;)V", "Ll10/i;", "container", "(Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/FavProductButtonPresenter;Lru/ozon/app/android/account/adult/presenter/AdultHandler;Ll10/i;Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesComposerActionHandler;Lru/ozon/app/android/utils/AppType;)V", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "analyticData", "Lru/ozon/app/android/favorites/domain/notification/NotificationDelegate;", "createNotificationDelegate", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;)Lru/ozon/app/android/favorites/domain/notification/NotificationDelegate;", "", "showError", "()V", "observeLoadCompleted", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "model", "updateLocalFavStateIfNeeded", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;)V", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/FavoriteButton;", "button", "molecule", "bindFavoriteProductButton", "(Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/FavoriteButton;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;)V", "favoriteProductMolecule", "bindFavButtonOnError", "favStateSuccefullyChanged", "", "sku", "", "favState", "handleMoleculeStateUpdate", "(JZ)V", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "getNotificationDelegate", "()Lru/ozon/app/android/favorites/domain/notification/NotificationDelegate;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/ProductFavoriteMoleculeButtonView;", "attachFavButtonView", "(Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/ProductFavoriteMoleculeButtonView;)V", "detachFavButtonView", "Landroidx/lifecycle/J;", "owner", "onStart", "(Landroidx/lifecycle/J;)V", "onStop", "onDestroy", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/FavProductButtonPresenter;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesComposerActionHandler;", "Lru/ozon/app/android/utils/AppType;", "moleculeLink", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/ProductFavoriteButtonViewHolder;", "favButtonViewHolder$delegate", "LSc/j;", "getFavButtonViewHolder", "()Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/ProductFavoriteButtonViewHolder;", "favButtonViewHolder", "notificationDelegate", "Lru/ozon/app/android/favorites/domain/notification/NotificationDelegate;", "needLocalFavStateUpdate", "Z", "Lkotlin/Function1;", "onFavoriteClick", "Lkotlin/jvm/functions/Function1;", "getOnFavoriteClick", "()Lkotlin/jvm/functions/Function1;", "setOnFavoriteClick", "(Lkotlin/jvm/functions/Function1;)V", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FavoriteProductDelegateImpl implements FavoriteProductDelegate, DefaultLifecycleObserver, FavProductButtonView {

    @NotNull
    private final AdultHandler adultHandler;

    @NotNull
    private final AppType appType;

    @NotNull
    private final ComposerReferences composerReferences;

    /* renamed from: favButtonViewHolder$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j favButtonViewHolder;

    @NotNull
    private final FavProductButtonPresenter favoriteProductButtonPresenter;

    @NotNull
    private final FavoritesComposerActionHandler favoritesComposerActionHandler;
    private FavoriteProductMolecule moleculeLink;
    private boolean needLocalFavStateUpdate;
    private NotificationDelegate notificationDelegate;
    private Function1<? super Boolean, Unit> onFavoriteClick;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegateImpl$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<FavoriteProductMolecule, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FavoriteProductMolecule favoriteProductMolecule) {
            invoke2(favoriteProductMolecule);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(FavoriteProductMolecule it) {
            Intrinsics.checkNotNullParameter(it, "it");
            FavProductButtonPresenter.onFavoriteChanged$default(FavoriteProductDelegateImpl.this.favoriteProductButtonPresenter, it, null, 2, null);
            Function1<Boolean, Unit> onFavoriteClick = FavoriteProductDelegateImpl.this.getOnFavoriteClick();
            if (onFavoriteClick != null) {
                onFavoriteClick.invoke(Boolean.valueOf(!it.isFavorite()));
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegateImpl$3", f = "FavoriteProductDelegate.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegateImpl$3, reason: invalid class name */
    static final class AnonymousClass3 extends j implements Function2<Long, d<? super Unit>, Object> {
        int label;

        AnonymousClass3(d<? super AnonymousClass3> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return FavoriteProductDelegateImpl.this.new AnonymousClass3(dVar);
        }

        public final Object invoke(long j11, d<? super Unit> dVar) {
            return ((AnonymousClass3) create(Long.valueOf(j11), dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            FavoriteProductMolecule favoriteProductMolecule = FavoriteProductDelegateImpl.this.moleculeLink;
            if (favoriteProductMolecule == null) {
                return Unit.f71690a;
            }
            FavoriteProductDelegateImpl.this.getFavButtonViewHolder().changeButton(favoriteProductMolecule);
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Long l11, d<? super Unit> dVar) {
            return invoke(l11.longValue(), dVar);
        }
    }

    public FavoriteProductDelegateImpl(@NotNull FavProductButtonPresenter favoriteProductButtonPresenter, @NotNull AdultHandler adultHandler, @NotNull ComposerReferences composerReferences, @NotNull FavoritesComposerActionHandler favoritesComposerActionHandler, @NotNull AppType appType) {
        Intrinsics.checkNotNullParameter(favoriteProductButtonPresenter, "favoriteProductButtonPresenter");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(favoritesComposerActionHandler, "favoritesComposerActionHandler");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.favoriteProductButtonPresenter = favoriteProductButtonPresenter;
        this.adultHandler = adultHandler;
        this.composerReferences = composerReferences;
        this.favoritesComposerActionHandler = favoritesComposerActionHandler;
        this.appType = appType;
        this.favButtonViewHolder = k.a(n.NONE, new FavoriteProductDelegateImpl$favButtonViewHolder$2(this));
        favoriteProductButtonPresenter.attachView(this);
        getFavButtonViewHolder().setOnButtonChanged(new AnonymousClass1());
        final B0<Long> flow = RemoveFromFavoritesEventBus.INSTANCE.getFlow();
        C4598rp.f(composerReferences, new C2408n0(new InterfaceC2395h<Long>() { // from class: ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegateImpl$special$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegateImpl$special$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;
                final /* synthetic */ FavoriteProductDelegateImpl this$0;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegateImpl$special$$inlined$filter$1$2", f = "FavoriteProductDelegate.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegateImpl$special$$inlined$filter$1$2$1, reason: invalid class name */
                /* loaded from: classes12.dex */
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

                public AnonymousClass2(InterfaceC2397i interfaceC2397i, FavoriteProductDelegateImpl favoriteProductDelegateImpl) {
                    this.$this_unsafeFlow = interfaceC2397i;
                    this.this$0 = favoriteProductDelegateImpl;
                }

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
                                long longValue = ((Number) obj).longValue();
                                FavoriteProductMolecule favoriteProductMolecule = this.this$0.moleculeLink;
                                if (favoriteProductMolecule != null && longValue == favoriteProductMolecule.getSku()) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
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
            public Object collect(InterfaceC2397i<? super Long> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, this), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new AnonymousClass3(null)));
        observeLoadCompleted();
    }

    private final NotificationDelegate createNotificationDelegate(AnalyticData analyticData) {
        ComponentCallbacksC5392m c11 = this.composerReferences.getContainer().c();
        View view = c11 != null ? c11.getView() : null;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null) {
            r a11 = this.composerReferences.getContainer().a();
            viewGroup = a11 != null ? ContextExtKt.getRootView(a11) : null;
            if (viewGroup == null) {
                return null;
            }
        }
        this.favoritesComposerActionHandler.setContainer(new WeakReference<>(this.composerReferences.getContainer()));
        return new NotificationDelegate(viewGroup, this.composerReferences.getContainer().g(), new ActionHandler.Builder(this.composerReferences, FavoriteProductDelegateImpl$createNotificationDelegate$1.INSTANCE, new FavoriteProductDelegateImpl$createNotificationDelegate$2(analyticData), new FavoriteProductDelegateImpl$createNotificationDelegate$3(analyticData)).onComposerAction(new FavoriteProductDelegateImpl$createNotificationDelegate$4(this.favoritesComposerActionHandler)).buildHandler());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProductFavoriteButtonViewHolder getFavButtonViewHolder() {
        return (ProductFavoriteButtonViewHolder) this.favButtonViewHolder.getValue();
    }

    private final void observeLoadCompleted() {
        C4598rp.f(this.composerReferences, new C2408n0(this.composerReferences.getController().getEventsFlow(), new FavoriteProductDelegateImpl$observeLoadCompleted$1(this, null)));
    }

    private final void showError() {
        ViewGroup rootView;
        ComponentCallbacksC5392m c11 = this.composerReferences.getContainer().c();
        if (c11 == null || (rootView = ContextExtKt.getRootView(c11)) == null) {
            return;
        }
        FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, null, null, null, null, this.composerReferences.getContainer().g(), 62, null).show();
    }

    private final void updateLocalFavStateIfNeeded(FavoriteProductMolecule model) {
        FavoriteProductMolecule currentFavState;
        if (!this.needLocalFavStateUpdate || model == null || (currentFavState = this.favoriteProductButtonPresenter.getCurrentFavState(model)) == null || currentFavState.isFavorite() == model.isFavorite()) {
            return;
        }
        this.favoriteProductButtonPresenter.shareMoleculeUpdateState(model);
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate
    public void attachFavButtonView(@NotNull ProductFavoriteMoleculeButtonView button) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.composerReferences.getContainer().f().getLifecycle().a(this);
        getFavButtonViewHolder().attachButton(button);
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.FavProductButtonView
    public void bindFavButtonOnError(@NotNull FavoriteProductMolecule favoriteProductMolecule) {
        Intrinsics.checkNotNullParameter(favoriteProductMolecule, "favoriteProductMolecule");
        getFavButtonViewHolder().rebindData(favoriteProductMolecule, true);
        showError();
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate
    public void bindFavoriteProductButton(@NotNull FavoriteButton button, FavoriteProductMolecule molecule, @NotNull AnalyticData analyticData) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(analyticData, "analyticData");
        updateLocalFavStateIfNeeded(molecule);
        FavoriteProductMolecule currentFavState = this.favoriteProductButtonPresenter.getCurrentFavState(molecule);
        this.favoritesComposerActionHandler.setTrackingData(analyticData.getTrackingData());
        this.notificationDelegate = createNotificationDelegate(analyticData);
        this.moleculeLink = currentFavState;
        this.favoriteProductButtonPresenter.setAnalyticData(analyticData);
        getFavButtonViewHolder().bindButton(button, currentFavState, analyticData.getViewItem());
        this.favoriteProductButtonPresenter.resubscribe(currentFavState);
        this.favoriteProductButtonPresenter.trackAnalyticsViewEventIfNeed(currentFavState);
        this.needLocalFavStateUpdate = false;
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate
    public void detachFavButtonView() {
        this.composerReferences.getContainer().f().getLifecycle().e(this);
        getFavButtonViewHolder().detachButton();
        this.notificationDelegate = null;
        setOnFavoriteClick(null);
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.FavProductButtonView
    public void favStateSuccefullyChanged(@NotNull FavoriteProductMolecule favoriteProductMolecule) {
        Intrinsics.checkNotNullParameter(favoriteProductMolecule, "favoriteProductMolecule");
        FavoriteProductMolecule favoriteProductMolecule2 = this.moleculeLink;
        if (favoriteProductMolecule2 != null) {
            favoriteProductMolecule2.setFavorite(favoriteProductMolecule.isFavorite());
        }
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.FavProductButtonView
    public NotificationDelegate getNotificationDelegate() {
        return this.notificationDelegate;
    }

    public Function1<Boolean, Unit> getOnFavoriteClick() {
        return this.onFavoriteClick;
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.FavProductButtonView
    @NotNull
    public l getTokenizedAnalytics() {
        return this.composerReferences.getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.FavProductButtonView
    public void handleMoleculeStateUpdate(long sku, boolean favState) {
        FavoriteProductMolecule favoriteProductMolecule;
        FavoriteProductMolecule favoriteProductMolecule2 = this.moleculeLink;
        if ((favoriteProductMolecule2 == null || favoriteProductMolecule2.isFavorite() != favState) && (favoriteProductMolecule = this.moleculeLink) != null && favoriteProductMolecule.getSku() == sku) {
            FavoriteProductMolecule favoriteProductMolecule3 = this.moleculeLink;
            if (favoriteProductMolecule3 != null) {
                favoriteProductMolecule3.setFavorite(favState);
            }
            ProductFavoriteButtonViewHolder.rebindData$default(getFavButtonViewHolder(), this.moleculeLink, false, 2, null);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.favoriteProductButtonPresenter.dispose();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.favoriteProductButtonPresenter.resubscribe(this.moleculeLink);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.favoriteProductButtonPresenter.clearDisposables();
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate
    public void setOnFavoriteClick(Function1<? super Boolean, Unit> function1) {
        this.onFavoriteClick = function1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FavoriteProductDelegateImpl(@NotNull FavProductButtonPresenter favoriteProductButtonPresenter, @NotNull AdultHandler adultHandler, @NotNull i container, @NotNull FavoritesComposerActionHandler favoritesComposerActionHandler, @NotNull AppType appType) {
        this(favoriteProductButtonPresenter, adultHandler, (ComposerReferences) r10, favoritesComposerActionHandler, appType);
        Intrinsics.checkNotNullParameter(favoriteProductButtonPresenter, "favoriteProductButtonPresenter");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(favoritesComposerActionHandler, "favoritesComposerActionHandler");
        Intrinsics.checkNotNullParameter(appType, "appType");
        l10.e V11 = container.V();
        Intrinsics.g(V11, "null cannot be cast to non-null type ru.ozon.app.android.composer.ComposerReferences");
    }
}

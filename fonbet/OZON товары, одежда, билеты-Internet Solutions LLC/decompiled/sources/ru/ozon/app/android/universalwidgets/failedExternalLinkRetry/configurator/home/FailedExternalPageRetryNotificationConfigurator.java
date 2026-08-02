package ru.ozon.app.android.universalwidgets.failedExternalLinkRetry.configurator.home;

import A00.a;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.InterfaceC4008j;
import Sc.s;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.FailedExternalLinkRetryInteractor;
import ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.analytics.FailedExternalLinkRetryAnalytics;
import ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.di.FailedExternalLinkRetryComponentApi;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 '2\u00020\u0001:\u0001'B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010 \u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b \u0010!R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0010\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"Lru/ozon/app/android/universalwidgets/failedExternalLinkRetry/configurator/home/FailedExternalPageRetryNotificationConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "", "failedExternalLink", "", "showNotificationIfNeed", "(Ljava/lang/String;)V", "onComposerInitialized", "Landroidx/lifecycle/J;", "owner", "onStart", "(Landroidx/lifecycle/J;)V", "Lru/ozon/app/android/domain/tiles/failedExternalLinkRetry/di/FailedExternalLinkRetryComponentApi;", "failedExternalLinkRetryComponentApi$delegate", "LSc/j;", "getFailedExternalLinkRetryComponentApi", "()Lru/ozon/app/android/domain/tiles/failedExternalLinkRetry/di/FailedExternalLinkRetryComponentApi;", "failedExternalLinkRetryComponentApi", "Lru/ozon/app/android/domain/tiles/failedExternalLinkRetry/FailedExternalLinkRetryInteractor;", "externalLinkRetryInteractor$delegate", "getExternalLinkRetryInteractor", "()Lru/ozon/app/android/domain/tiles/failedExternalLinkRetry/FailedExternalLinkRetryInteractor;", "externalLinkRetryInteractor", "Lru/ozon/app/android/domain/tiles/failedExternalLinkRetry/analytics/FailedExternalLinkRetryAnalytics;", "analytics$delegate", "getAnalytics", "()Lru/ozon/app/android/domain/tiles/failedExternalLinkRetry/analytics/FailedExternalLinkRetryAnalytics;", "analytics", "", "isSelect$delegate", "isSelect", "()Z", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification$delegate", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FailedExternalPageRetryNotificationConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private static final Companion Companion = new Companion(null);

    /* renamed from: failedExternalLinkRetryComponentApi$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j failedExternalLinkRetryComponentApi = LazyUtilsKt.unsafeLazy(new FailedExternalPageRetryNotificationConfigurator$failedExternalLinkRetryComponentApi$2(this));

    /* renamed from: externalLinkRetryInteractor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j externalLinkRetryInteractor = LazyUtilsKt.unsafeLazy(new FailedExternalPageRetryNotificationConfigurator$externalLinkRetryInteractor$2(this));

    /* renamed from: analytics$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j analytics = LazyUtilsKt.unsafeLazy(new FailedExternalPageRetryNotificationConfigurator$analytics$2(this));

    /* renamed from: isSelect$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j isSelect = LazyUtilsKt.unsafeLazy(new FailedExternalPageRetryNotificationConfigurator$isSelect$2(this));

    /* renamed from: notification$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j notification = LazyUtilsKt.unsafeLazy(new FailedExternalPageRetryNotificationConfigurator$notification$2(this));

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/universalwidgets/failedExternalLinkRetry/configurator/home/FailedExternalPageRetryNotificationConfigurator$Companion;", "", "<init>", "()V", "BX_NOTIFICATION_IMAGE_LINK", "", "SELECT_NOTIFICATION_IMAGE_LINK", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FailedExternalLinkRetryAnalytics getAnalytics() {
        return (FailedExternalLinkRetryAnalytics) this.analytics.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FailedExternalLinkRetryInteractor getExternalLinkRetryInteractor() {
        return (FailedExternalLinkRetryInteractor) this.externalLinkRetryInteractor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FailedExternalLinkRetryComponentApi getFailedExternalLinkRetryComponentApi() {
        return (FailedExternalLinkRetryComponentApi) this.failedExternalLinkRetryComponentApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotificationDTO getNotification() {
        return (NotificationDTO) this.notification.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isSelect() {
        return ((Boolean) this.isSelect.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNotificationIfNeed(String failedExternalLink) {
        ViewGroup rootView;
        NotificationLayoutManager asNotificationLayoutManager$default;
        if (failedExternalLink == null || (rootView = ContextExtKt.getRootView(getContainer().c())) == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(rootView, null, 1, null)) == null) {
            return;
        }
        NotificationBar.INSTANCE.make(asNotificationLayoutManager$default, getNotification(), getContainer().f(), new FailedExternalPageRetryNotificationConfigurator$showNotificationIfNeed$1(this, failedExternalLink)).show();
        Unit unit = Unit.f71690a;
        FailedExternalLinkRetryInteractor externalLinkRetryInteractor = getExternalLinkRetryInteractor();
        if (externalLinkRetryInteractor != null) {
            externalLinkRetryInteractor.clearData();
        }
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        super.onComposerInitialized();
        ConfiguratorReferences references = getReferences();
        if (references == null) {
            return;
        }
        final InterfaceC2395h<a> eventsFlow = references.getController().getEventsFlow();
        C2399j.C(new C2408n0(new InterfaceC2395h<a>() { // from class: ru.ozon.app.android.universalwidgets.failedExternalLinkRetry.configurator.home.FailedExternalPageRetryNotificationConfigurator$onComposerInitialized$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.universalwidgets.failedExternalLinkRetry.configurator.home.FailedExternalPageRetryNotificationConfigurator$onComposerInitialized$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.universalwidgets.failedExternalLinkRetry.configurator.home.FailedExternalPageRetryNotificationConfigurator$onComposerInitialized$$inlined$filter$1$2", f = "FailedExternalPageRetryNotificationConfigurator.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.universalwidgets.failedExternalLinkRetry.configurator.home.FailedExternalPageRetryNotificationConfigurator$onComposerInitialized$$inlined$filter$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(InterfaceC2397i interfaceC2397i) {
                    this.$this_unsafeFlow = interfaceC2397i;
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
                            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                a aVar2 = (a) obj;
                                if ((aVar2 instanceof a.o) && (((a.o) aVar2).g() instanceof a.u)) {
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
                    Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super a> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new FailedExternalPageRetryNotificationConfigurator$onComposerInitialized$2(this, null)), K.a(getOwner()));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStart(owner);
        FailedExternalLinkRetryInteractor externalLinkRetryInteractor = getExternalLinkRetryInteractor();
        showNotificationIfNeed(externalLinkRetryInteractor != null ? externalLinkRetryInteractor.getFailedExternalLink() : null);
    }
}

package ru.ozon.app.android.checkoutcomposer.common.configurator;

import A00.a;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.s;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.scrollToWidget.CheckoutScrollToWidgetKeyRepository;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/configurator/ScrollToWidgetConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "Lru/ozon/app/android/checkoutcomposer/common/scrollToWidget/CheckoutScrollToWidgetKeyRepository;", "checkoutScrollToWidgetKeyRepository", "<init>", "(Lru/ozon/app/android/checkoutcomposer/common/scrollToWidget/CheckoutScrollToWidgetKeyRepository;)V", "", "onComposerInitialized", "()V", "Lru/ozon/app/android/checkoutcomposer/common/scrollToWidget/CheckoutScrollToWidgetKeyRepository;", "", "scrollOffset$delegate", "LSc/j;", "getScrollOffset", "()I", "scrollOffset", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScrollToWidgetConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final CheckoutScrollToWidgetKeyRepository checkoutScrollToWidgetKeyRepository;

    /* renamed from: scrollOffset$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j scrollOffset;

    public ScrollToWidgetConfigurator(@NotNull CheckoutScrollToWidgetKeyRepository checkoutScrollToWidgetKeyRepository) {
        Intrinsics.checkNotNullParameter(checkoutScrollToWidgetKeyRepository, "checkoutScrollToWidgetKeyRepository");
        this.checkoutScrollToWidgetKeyRepository = checkoutScrollToWidgetKeyRepository;
        this.scrollOffset = k.b(ScrollToWidgetConfigurator$scrollOffset$2.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getScrollOffset() {
        return ((Number) this.scrollOffset.getValue()).intValue();
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        super.onComposerInitialized();
        ConfiguratorReferences references = getReferences();
        if (references != null) {
            final InterfaceC2395h<a> eventsFlow = references.getController().getEventsFlow();
            C2399j.C(new C2408n0(new InterfaceC2395h<Object>() { // from class: ru.ozon.app.android.checkoutcomposer.common.configurator.ScrollToWidgetConfigurator$onComposerInitialized$lambda$0$$inlined$filterIsInstance$1

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                /* renamed from: ru.ozon.app.android.checkoutcomposer.common.configurator.ScrollToWidgetConfigurator$onComposerInitialized$lambda$0$$inlined$filterIsInstance$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements InterfaceC2397i {
                    final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @e(c = "ru.ozon.app.android.checkoutcomposer.common.configurator.ScrollToWidgetConfigurator$onComposerInitialized$lambda$0$$inlined$filterIsInstance$1$2", f = "ScrollToWidgetConfigurator.kt", l = {50}, m = "emit")
                    /* renamed from: ru.ozon.app.android.checkoutcomposer.common.configurator.ScrollToWidgetConfigurator$onComposerInitialized$lambda$0$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
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
                                    if (obj instanceof a.C2370k) {
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
                        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                        i11 = anonymousClass1.label;
                        if (i11 != 0) {
                        }
                        return Unit.f71690a;
                    }
                }

                @Override // Ae.InterfaceC2395h
                public Object collect(InterfaceC2397i<? super Object> interfaceC2397i, d dVar) {
                    Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                    return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
                }
            }, new ScrollToWidgetConfigurator$onComposerInitialized$1$1(this, references, null)), K.a(getOwner()));
        }
    }
}

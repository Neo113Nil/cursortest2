package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation;

import A00.a;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import Vg.d;
import WZ.l;
import WZ.t;
import Wc.a;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Iterator;
import java.util.List;
import jk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.travel.feature.hotels.shared.player.HotelsGalleryVideoPlayer;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.HotelsGalleryFullV2VI;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.pager.HotelsGalleryFullV2PagerAdapter;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.preview.HotelsGalleryFullV2PreviewAdapter;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.view.HotelsGalleryFullV2View;
import ru.ozon.app.android.travel.utils.extensions.ViewsExtensionsKt;
import ru.ozon.app.android.video.player.soundservice.SoundController;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BE\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\u0010\u000e\u001a\u00060\fj\u0002`\r\u0012\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ\u001f\u0010\"\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00182\u0006\u0010!\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010'R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010(R\u0018\u0010\u0011\u001a\u00060\u000fj\u0002`\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010)R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00180*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00064"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/HotelsGalleryFullV2WidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/HotelsGalleryFullV2VI;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/view/HotelsGalleryFullV2View;", "view", "Lru/ozon/app/android/video/player/soundservice/SoundController;", "soundController", "Lkotlin/Function0;", "Lru/ozon/app/android/travel/feature/hotels/shared/player/HotelsGalleryVideoPlayer;", "galleryVideoPlayerProvider", "Ll10/i;", "container", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/view/HotelsGalleryFullV2View;Lru/ozon/app/android/video/player/soundservice/SoundController;Lkotlin/jvm/functions/Function0;Ll10/i;LVg/d;LWZ/l;)V", "", "page", "", "isSmoothScroll", "", "setSelectedFullItem", "(IZ)V", "setInitialSelectedItem", "()V", "observeSelectedPositionUpdates", "onAttach", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/HotelsGalleryFullV2VI;Ll20/d;)V", "Ljk0/q;", "onVisibleAreaChanged", "(Ljk0/q;)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/view/HotelsGalleryFullV2View;", "Ll10/i;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/pager/HotelsGalleryFullV2PagerAdapter;", "pagerAdapter", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/pager/HotelsGalleryFullV2PagerAdapter;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/preview/HotelsGalleryFullV2PreviewAdapter;", "previewAdapter", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/preview/HotelsGalleryFullV2PreviewAdapter;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsGalleryFullV2WidgetViewHolder extends k<HotelsGalleryFullV2VI> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final i container;

    @NotNull
    private final HotelsGalleryFullV2PagerAdapter pagerAdapter;

    @NotNull
    private final HotelsGalleryFullV2PreviewAdapter previewAdapter;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final HotelsGalleryFullV2View view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsGalleryFullV2WidgetViewHolder(@NotNull HotelsGalleryFullV2View view, @NotNull SoundController soundController, @NotNull Function0<HotelsGalleryVideoPlayer> galleryVideoPlayerProvider, @NotNull i container, @NotNull d customActionHandlersStoreFactory, @NotNull l tokenizedAnalytics) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(soundController, "soundController");
        Intrinsics.checkNotNullParameter(galleryVideoPlayerProvider, "galleryVideoPlayerProvider");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.view = view;
        this.container = container;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new HotelsGalleryFullV2WidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        HotelsGalleryFullV2PagerAdapter hotelsGalleryFullV2PagerAdapter = new HotelsGalleryFullV2PagerAdapter(galleryVideoPlayerProvider, soundController, tokenizedAnalytics, this);
        this.pagerAdapter = hotelsGalleryFullV2PagerAdapter;
        HotelsGalleryFullV2PreviewAdapter hotelsGalleryFullV2PreviewAdapter = new HotelsGalleryFullV2PreviewAdapter(getContext(), new HotelsGalleryFullV2WidgetViewHolder$previewAdapter$1(this), this);
        this.previewAdapter = hotelsGalleryFullV2PreviewAdapter;
        view.setupViewPager(hotelsGalleryFullV2PagerAdapter, new ViewPager2.g() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.HotelsGalleryFullV2WidgetViewHolder.1
            @Override // androidx.viewpager2.widget.ViewPager2.g
            public void onPageSelected(int position) {
                t trackingInfo;
                List<HotelsGalleryFullV2VI.GalleryItem> items;
                HotelsGalleryFullV2WidgetViewHolder.this.container.M().d(HotelsGalleryFullV2SelectedPositionUpdate.m1395boximpl(HotelsGalleryFullV2SelectedPositionUpdate.m1396constructorimpl(position)));
                HotelsGalleryFullV2VI boundData = HotelsGalleryFullV2WidgetViewHolder.this.getBoundData();
                HotelsGalleryFullV2VI.GalleryItem galleryItem = (boundData == null || (items = boundData.getItems()) == null) ? null : (HotelsGalleryFullV2VI.GalleryItem) C7714v.Q(position, items);
                if (galleryItem == null || (trackingInfo = galleryItem.getTrackingInfo()) == null) {
                    return;
                }
                TokenizedAnalyticsExtensionsKt.processIgnoreViewPoolViewEvents$default(HotelsGalleryFullV2WidgetViewHolder.this.tokenizedAnalytics, trackingInfo, null, 2, null);
            }
        });
        view.setupPreviewAdapter(hotelsGalleryFullV2PreviewAdapter);
    }

    private final void observeSelectedPositionUpdates() {
        final InterfaceC2395h a11 = C5427n.a(this.container.M().getEventsFlow(), getLifecycle(), AbstractC5434v.b.STARTED);
        final InterfaceC2395h<Object> interfaceC2395h = new InterfaceC2395h<Object>() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.HotelsGalleryFullV2WidgetViewHolder$observeSelectedPositionUpdates$$inlined$filterIsInstance$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.HotelsGalleryFullV2WidgetViewHolder$observeSelectedPositionUpdates$$inlined$filterIsInstance$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.HotelsGalleryFullV2WidgetViewHolder$observeSelectedPositionUpdates$$inlined$filterIsInstance$1$2", f = "HotelsGalleryFullV2WidgetViewHolder.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.HotelsGalleryFullV2WidgetViewHolder$observeSelectedPositionUpdates$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(kotlin.coroutines.d dVar) {
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
                public final Object emit(Object obj, kotlin.coroutines.d dVar) {
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
                                if (obj instanceof a.J) {
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
            public Object collect(InterfaceC2397i<? super Object> interfaceC2397i, kotlin.coroutines.d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        };
        final InterfaceC2395h<a.J.InterfaceC0007a> interfaceC2395h2 = new InterfaceC2395h<a.J.InterfaceC0007a>() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.HotelsGalleryFullV2WidgetViewHolder$observeSelectedPositionUpdates$$inlined$map$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.HotelsGalleryFullV2WidgetViewHolder$observeSelectedPositionUpdates$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.HotelsGalleryFullV2WidgetViewHolder$observeSelectedPositionUpdates$$inlined$map$1$2", f = "HotelsGalleryFullV2WidgetViewHolder.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.HotelsGalleryFullV2WidgetViewHolder$observeSelectedPositionUpdates$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(kotlin.coroutines.d dVar) {
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
                public final Object emit(Object obj, kotlin.coroutines.d dVar) {
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
                                a.J.InterfaceC0007a d11 = ((a.J) obj).d();
                                anonymousClass1.label = 1;
                                if (interfaceC2397i.emit(d11, anonymousClass1) == aVar) {
                                    return aVar;
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
            public Object collect(InterfaceC2397i<? super a.J.InterfaceC0007a> interfaceC2397i, kotlin.coroutines.d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        };
        C2399j.C(new C2408n0(new InterfaceC2395h<Object>() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.HotelsGalleryFullV2WidgetViewHolder$observeSelectedPositionUpdates$$inlined$filterIsInstance$2

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.HotelsGalleryFullV2WidgetViewHolder$observeSelectedPositionUpdates$$inlined$filterIsInstance$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.HotelsGalleryFullV2WidgetViewHolder$observeSelectedPositionUpdates$$inlined$filterIsInstance$2$2", f = "HotelsGalleryFullV2WidgetViewHolder.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.HotelsGalleryFullV2WidgetViewHolder$observeSelectedPositionUpdates$$inlined$filterIsInstance$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(kotlin.coroutines.d dVar) {
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
                public final Object emit(Object obj, kotlin.coroutines.d dVar) {
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
                                if (obj instanceof HotelsGalleryFullV2SelectedPositionUpdate) {
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
            public Object collect(InterfaceC2397i<? super Object> interfaceC2397i, kotlin.coroutines.d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new HotelsGalleryFullV2WidgetViewHolder$observeSelectedPositionUpdates$2(this, null)), K.a(this));
    }

    private final void setInitialSelectedItem() {
        int i11;
        List<HotelsGalleryFullV2VI.GalleryItem> items;
        HotelsGalleryFullV2VI boundData = getBoundData();
        if (boundData != null) {
            Iterator<HotelsGalleryFullV2VI.GalleryItem> it = boundData.getItems().iterator();
            i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                } else if (it.next().getIsSelected()) {
                    break;
                } else {
                    i11++;
                }
            }
        } else {
            i11 = 0;
        }
        setSelectedFullItem(i11, false);
        HotelsGalleryFullV2VI boundData2 = getBoundData();
        HotelsGalleryFullV2VI.GalleryItem galleryItem = (boundData2 == null || (items = boundData2.getItems()) == null) ? null : (HotelsGalleryFullV2VI.GalleryItem) C7714v.Q(i11, items);
        this.view.setSelectedPreviewItem(i11, galleryItem != null ? galleryItem.getTitleText() : null, galleryItem != null ? galleryItem.getCounterText() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSelectedFullItem(int page, boolean isSmoothScroll) {
        this.view.setSelectedFullItem(page, isSmoothScroll);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        observeSelectedPositionUpdates();
        setInitialSelectedItem();
    }

    @Override // jk0.j, jk0.n
    public void onVisibleAreaChanged(@NotNull q info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onVisibleAreaChanged(info);
        ViewsExtensionsKt.updateHeightRegardingOverlapContainers$default(this.view, info, false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HotelsGalleryFullV2VI item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.view.bind(item, this.actionHandler);
        this.pagerAdapter.submitList(item.getItems());
        this.previewAdapter.submitList(item.getItems());
    }
}

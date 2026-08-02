package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.grid;

import A00.a;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ax.ViewOnClickListenerC2451a;
import Sc.s;
import Ve.C4598rp;
import WZ.t;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.ads.data.pixel.presentation.Pixel;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.universalwidgets.R$id;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.OpenNestedPageExtKt;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model.ObjectItemVO;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model.UWDeeplink;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.pixel.PixelAnalyticsViewModel;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$style;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u000eJ#\u0010\u001a\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00022\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u001c\u0010 \u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001e\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\"R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010#R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\f0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/grid/UniversalObjectGridViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/pixel/PixelAnalyticsViewModel;", "pixelAnalyticsViewModel", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/pixel/PixelAnalyticsViewModel;)V", "", "observeSwipeRefresh", "()V", "item", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onAttach", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemVO;Ll20/d;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/pixel/PixelAnalyticsViewModel;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/grid/UniversalObjectWidgetGridView;", "kotlin.jvm.PlatformType", "uwGridView", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/grid/UniversalObjectWidgetGridView;", "Ll20/d;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemVO;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UniversalObjectGridViewHolder extends k<ObjectItemVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private d info;
    private ObjectItemVO item;

    @NotNull
    private final PixelAnalyticsViewModel pixelAnalyticsViewModel;

    @NotNull
    private final ComposerReferences ref;
    private final UniversalObjectWidgetGridView uwGridView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalObjectGridViewHolder(@NotNull View containerView, @NotNull ComposerReferences ref, @NotNull PixelAnalyticsViewModel pixelAnalyticsViewModel) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(pixelAnalyticsViewModel, "pixelAnalyticsViewModel");
        this.ref = ref;
        this.pixelAnalyticsViewModel = pixelAnalyticsViewModel;
        UniversalObjectWidgetGridView universalObjectWidgetGridView = (UniversalObjectWidgetGridView) containerView.findViewById(R$id.uwGridView);
        this.uwGridView = universalObjectWidgetGridView;
        this.actionHandler = new ActionHandler.Builder(ref, this).buildHandler();
        universalObjectWidgetGridView.setOnClickListener(new ViewOnClickListenerC2451a(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$6(UniversalObjectGridViewHolder universalObjectGridViewHolder, View view) {
        UWDeeplink deeplink;
        ObjectItemVO boundData = universalObjectGridViewHolder.getBoundData();
        if (boundData == null || (deeplink = boundData.getDeeplink()) == null) {
            return;
        }
        ComposerReferences composerReferences = universalObjectGridViewHolder.ref;
        UniversalObjectWidgetGridView universalObjectWidgetGridView = universalObjectGridViewHolder.uwGridView;
        universalObjectWidgetGridView.setTransitionName("transition_view" + boundData);
        Unit unit = Unit.f71690a;
        OpenNestedPageExtKt.navigate(deeplink, composerReferences, "UniversalObjectGridViewHolder", U.i(new Pair("transition_view", universalObjectWidgetGridView)));
        t tokenizedEvent = boundData.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(universalObjectGridViewHolder.ref.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
        List<Pixel> pixel = boundData.getPixel();
        if (pixel != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : pixel) {
                if (((Pixel) obj).getAction() == Pixel.ActionType.CLICK) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                universalObjectGridViewHolder.pixelAnalyticsViewModel.trackPixel((Pixel) it.next());
            }
        }
    }

    private final void observeSwipeRefresh() {
        final InterfaceC2395h<a> eventsFlow = this.ref.getController().getEventsFlow();
        C4598rp.f(this.ref, new C2408n0(new InterfaceC2395h<a>() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.grid.UniversalObjectGridViewHolder$observeSwipeRefresh$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.grid.UniversalObjectGridViewHolder$observeSwipeRefresh$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.grid.UniversalObjectGridViewHolder$observeSwipeRefresh$$inlined$filter$1$2", f = "UniversalObjectGridViewHolder.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.grid.UniversalObjectGridViewHolder$observeSwipeRefresh$$inlined$filter$1$2$1, reason: invalid class name */
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
                                a aVar2 = (a) obj;
                                if ((aVar2 instanceof a.u.b) || (aVar2 instanceof a.u.c)) {
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
            public Object collect(InterfaceC2397i<? super a> interfaceC2397i, kotlin.coroutines.d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new UniversalObjectGridViewHolder$observeSwipeRefresh$2(this, null)));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        observeSwipeRefresh();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ObjectItemVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.info = info;
        this.item = item;
        UniversalObjectWidgetGridView universalObjectWidgetGridView = this.uwGridView;
        universalObjectWidgetGridView.setTransitionName(item.getStateId());
        universalObjectWidgetGridView.loadImage(item.getImage());
        universalObjectWidgetGridView.setTitleOrGone(item.getTitle());
        universalObjectWidgetGridView.setSubtitleOrGone(item.getSubtitle());
        universalObjectWidgetGridView.setImageBackground(item.getIsImageBackgroundHidden());
        if (item.getTitle() != null) {
            universalObjectWidgetGridView.setTitleTextAppearance(item.getDesignType() == ObjectItemVO.DesignTypeVO.Type.GRID_3 ? R$style.TextStyle_Body_M : R$style.TextStyle_Body_L);
        }
        universalObjectWidgetGridView.removeLetterSpacing();
        universalObjectWidgetGridView.setAdvBadgeOrGone(item.getAdvBadge(), this.actionHandler);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull ObjectItemVO item, @NotNull W10.c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((UniversalObjectGridViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.ref.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
        List<Pixel> pixel = item.getPixel();
        if (pixel != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : pixel) {
                if (((Pixel) obj).getAction() == Pixel.ActionType.VIEW) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.pixelAnalyticsViewModel.trackPixel((Pixel) it.next());
            }
        }
    }
}

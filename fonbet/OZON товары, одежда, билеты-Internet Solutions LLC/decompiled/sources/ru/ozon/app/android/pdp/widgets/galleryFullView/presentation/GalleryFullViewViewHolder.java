package ru.ozon.app.android.pdp.widgets.galleryFullView.presentation;

import Ae.B0;
import Ae.InterfaceC2397i;
import E4.c;
import Sc.C4005g;
import Sc.InterfaceC4003e;
import Sc.InterfaceC4008j;
import Sc.o;
import Sc.s;
import WZ.l;
import WZ.t;
import Wc.a;
import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.Q0;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7719a;
import kotlin.jvm.internal.InterfaceC7732n;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.layoutManager.scroll.ScrollExtKt;
import ru.ozon.app.android.gallery.common.VolumeContentObserver;
import ru.ozon.app.android.pdp.R$drawable;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.view.ViewExtKt;
import ru.ozon.app.android.pdp.view.pdp.GalleryFullViewCloseButton;
import ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GalleryFullViewLayout;
import ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GalleryFullViewViewModel$Action;
import ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.fullView.GalleryFullViewAdapter;
import ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.fullView.GalleryFullViewItemDecorator;
import ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.miniature.GalleryFullViewMiniatureAdapter;
import ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.miniature.GalleryPreviewSmoothScroller;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.player.VideoMoleculePlayerDelegateProvider;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.app.android.utils.WhenExtKt;
import ru.ozon.app.android.video.player.soundservice.SoundService;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000×\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0001j\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00182\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0018H\u0002¢\u0006\u0004\b'\u0010\"J\u000f\u0010(\u001a\u00020\u0018H\u0002¢\u0006\u0004\b(\u0010\"J\u0017\u0010*\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u0002H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0018H\u0002¢\u0006\u0004\b,\u0010\"J\u0011\u0010-\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b-\u0010.J\u0019\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\u00182\u0006\u00104\u001a\u000201H\u0002¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u00182\u0006\u00107\u001a\u000201H\u0002¢\u0006\u0004\b8\u00106J\u000f\u00109\u001a\u00020\u0018H\u0002¢\u0006\u0004\b9\u0010\"J\u000f\u0010:\u001a\u00020\u0018H\u0002¢\u0006\u0004\b:\u0010\"J\u0011\u0010;\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b;\u0010.J\u000f\u0010<\u001a\u00020\u0018H\u0002¢\u0006\u0004\b<\u0010\"J\u000f\u0010=\u001a\u00020\u0018H\u0002¢\u0006\u0004\b=\u0010\"J\u000f\u0010>\u001a\u00020\u0018H\u0002¢\u0006\u0004\b>\u0010\"J\u000f\u0010?\u001a\u00020\u0018H\u0002¢\u0006\u0004\b?\u0010\"J\u0017\u0010B\u001a\u00020\u00182\u0006\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bB\u0010CR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010DR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010ER\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010FR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010GR \u0010J\u001a\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020\u00180H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010V\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010Y\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010A\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010[R\u0016\u0010\\\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010[R\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020^0]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010b\u001a\u00020a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010e\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010h\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010k\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010l¨\u0006m"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewLayout$ViewBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GallerySyncViewModelImpl;", "widgetViewModel", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/player/VideoMoleculePlayerDelegateProvider;", "playerDelegateProvider", "Lru/ozon/app/android/gallery/common/VolumeContentObserver;", "volumeContentObserver", "Lru/ozon/app/android/video/player/soundservice/SoundService;", "soundService", "Lru/ozon/app/android/utils/AppType;", "appType", "<init>", "(Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewLayout$ViewBinding;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GallerySyncViewModelImpl;Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/player/VideoMoleculePlayerDelegateProvider;Lru/ozon/app/android/gallery/common/VolumeContentObserver;Lru/ozon/app/android/video/player/soundservice/SoundService;Lru/ozon/app/android/utils/AppType;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "removeLifeCycleObserver", "()V", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewModel$Action;", "action", "handleAction", "(Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewModel$Action;)V", "collapseView", "expandView", "data", "bindItems", "(Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO;)V", "initViewPager", "initMiniatureList", "()Lkotlin/Unit;", "", "ratio", "", "getItemListHeight", "(Ljava/lang/Double;)I", "page", "setCurrentPage", "(I)V", "position", "smoothScrollToPosition", "notifyPreviewAdapter", "lockPager", "unLockPager", "showPreview", "hidePreview", "hideCloseBtn", "showCloseBtn", "", "isFullScreen", "setFullScreen", "(Z)V", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewLayout$ViewBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GallerySyncViewModelImpl;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/fullView/GalleryFullViewAdapter;", "galleryFullViewAdapter", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/fullView/GalleryFullViewAdapter;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/miniature/GalleryFullViewMiniatureAdapter;", "galleryMiniatureAdapter", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/miniature/GalleryFullViewMiniatureAdapter;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/fullView/GalleryFullViewItemDecorator;", "fullViewItemDecorator", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/fullView/GalleryFullViewItemDecorator;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/miniature/GalleryPreviewSmoothScroller;", "galleryPreviewSmoothScroller", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/miniature/GalleryPreviewSmoothScroller;", "LWZ/t;", "closeButtonEvent", "LWZ/t;", "Z", "isScrolling", "LSc/j;", "Landroid/os/Handler;", "notifyHandler", "LSc/j;", "Ljava/lang/Runnable;", "notifyRunnable", "Ljava/lang/Runnable;", "Landroidx/lifecycle/G;", "lifecycleObserver", "Landroidx/lifecycle/G;", "Landroid/os/Parcelable;", "lastPreviewState", "Landroid/os/Parcelable;", "ru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewHolder$previewScrollListener$1", "previewScrollListener", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewHolder$previewScrollListener$1;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryFullViewViewHolder extends k<GalleryFullViewVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final GalleryFullViewLayout.ViewBinding binding;
    private t closeButtonEvent;

    @NotNull
    private final GalleryFullViewItemDecorator fullViewItemDecorator;

    @NotNull
    private final GalleryFullViewAdapter galleryFullViewAdapter;

    @NotNull
    private final GalleryFullViewMiniatureAdapter galleryMiniatureAdapter;

    @NotNull
    private final GalleryPreviewSmoothScroller galleryPreviewSmoothScroller;
    private boolean isFullScreen;
    private boolean isScrolling;
    private Parcelable lastPreviewState;

    @NotNull
    private final G lifecycleObserver;

    @NotNull
    private final InterfaceC4008j<Handler> notifyHandler;

    @SuppressLint({"NotifyDataSetChanged"})
    @NotNull
    private final Runnable notifyRunnable;

    @NotNull
    private final GalleryFullViewViewHolder$previewScrollListener$1 previewScrollListener;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final GallerySyncViewModelImpl widgetViewModel;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GalleryFullViewViewHolder$1", f = "GalleryFullViewViewHolder.kt", l = {104}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GalleryFullViewViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        int label;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GalleryFullViewViewHolder$1$1, reason: invalid class name and collision with other inner class name */
        /* synthetic */ class C18181 implements InterfaceC2397i, InterfaceC7732n {
            final /* synthetic */ GalleryFullViewViewHolder $tmp0;

            C18181(GalleryFullViewViewHolder galleryFullViewViewHolder) {
                this.$tmp0 = galleryFullViewViewHolder;
            }

            @Override // Ae.InterfaceC2397i
            public /* bridge */ /* synthetic */ Object emit(Object obj, d dVar) {
                return emit((GalleryFullViewViewModel$Action) obj, (d<? super Unit>) dVar);
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof InterfaceC2397i) && (obj instanceof InterfaceC7732n)) {
                    return Intrinsics.d(getFunctionDelegate(), ((InterfaceC7732n) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.InterfaceC7732n
            public final InterfaceC4003e<?> getFunctionDelegate() {
                return new C7719a(2, this.$tmp0, GalleryFullViewViewHolder.class, "handleAction", "handleAction(Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewModel$Action;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(GalleryFullViewViewModel$Action galleryFullViewViewModel$Action, d<? super Unit> dVar) {
                Object invokeSuspend$handleAction = AnonymousClass1.invokeSuspend$handleAction(this.$tmp0, galleryFullViewViewModel$Action, dVar);
                return invokeSuspend$handleAction == a.COROUTINE_SUSPENDED ? invokeSuspend$handleAction : Unit.f71690a;
            }
        }

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$handleAction(GalleryFullViewViewHolder galleryFullViewViewHolder, GalleryFullViewViewModel$Action galleryFullViewViewModel$Action, d dVar) {
            galleryFullViewViewHolder.handleAction(galleryFullViewViewModel$Action);
            return Unit.f71690a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return GalleryFullViewViewHolder.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                B0<GalleryFullViewViewModel$Action> event = GalleryFullViewViewHolder.this.widgetViewModel.getEvent();
                C18181 c18181 = new C18181(GalleryFullViewViewHolder.this);
                this.label = 1;
                if (event.collect(c18181, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            throw new C4005g();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GalleryFullViewViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function0<Integer> {
        AnonymousClass2() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(GalleryFullViewViewHolder.this.binding.getViewPager().f());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GalleryFullViewViewHolder$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<Integer, Unit> {
        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.f71690a;
        }

        public final void invoke(int i11) {
            GalleryFullViewViewHolder.this.binding.getViewPager().t(i11, true);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(I)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GalleryFullViewViewHolder$4, reason: invalid class name */
    static final class AnonymousClass4 extends AbstractC7737t implements Function1<Integer, Boolean> {
        AnonymousClass4() {
            super(1);
        }

        public final Boolean invoke(int i11) {
            return Boolean.valueOf(GalleryFullViewViewHolder.this.binding.getPreviewRv().canScrollHorizontally(i11));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r12v3, types: [ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GalleryFullViewViewHolder$previewScrollListener$1] */
    public GalleryFullViewViewHolder(@NotNull GalleryFullViewLayout.ViewBinding binding, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics, @NotNull GallerySyncViewModelImpl widgetViewModel, @NotNull VideoMoleculePlayerDelegateProvider playerDelegateProvider, @NotNull VolumeContentObserver volumeContentObserver, @NotNull SoundService soundService, @NotNull AppType appType) {
        super(binding.getGalleryContainer());
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(widgetViewModel, "widgetViewModel");
        Intrinsics.checkNotNullParameter(playerDelegateProvider, "playerDelegateProvider");
        Intrinsics.checkNotNullParameter(volumeContentObserver, "volumeContentObserver");
        Intrinsics.checkNotNullParameter(soundService, "soundService");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.binding = binding;
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.widgetViewModel = widgetViewModel;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).buildHandler();
        this.actionHandler = buildHandler;
        this.fullViewItemDecorator = new GalleryFullViewItemDecorator();
        this.notifyHandler = DelegatesKt.lazyUnsafe(GalleryFullViewViewHolder$notifyHandler$1.INSTANCE);
        this.notifyRunnable = new JD.a(this, 0);
        c cVar = new c(this, 1);
        this.lifecycleObserver = cVar;
        this.previewScrollListener = new RecyclerView.t() { // from class: ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GalleryFullViewViewHolder$previewScrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                boolean z11;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                super.onScrollStateChanged(recyclerView, newState);
                if (newState == 0) {
                    z11 = GalleryFullViewViewHolder.this.isScrolling;
                    if (z11) {
                        GalleryFullViewViewHolder galleryFullViewViewHolder = GalleryFullViewViewHolder.this;
                        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                        galleryFullViewViewHolder.lastPreviewState = layoutManager != null ? layoutManager.onSaveInstanceState() : null;
                        GalleryFullViewViewHolder.this.isScrolling = false;
                    }
                }
            }
        };
        refs.getContainer().g().getLifecycle().a(cVar);
        C10727i.c(K.a(refs.getContainer().g()), null, null, new AnonymousClass1(null), 3);
        this.galleryFullViewAdapter = new GalleryFullViewAdapter(refs, buildHandler, playerDelegateProvider, volumeContentObserver, soundService, widgetViewModel, this);
        this.galleryMiniatureAdapter = new GalleryFullViewMiniatureAdapter(new AnonymousClass2(), new AnonymousClass3(), appType == AppType.SELECT);
        this.galleryPreviewSmoothScroller = new GalleryPreviewSmoothScroller(getContext(), new AnonymousClass4());
        initViewPager();
        initMiniatureList();
    }

    private final void bindItems(GalleryFullViewVO data) {
        GalleryFullViewLayout.ViewBinding viewBinding = this.binding;
        this.galleryFullViewAdapter.setList(data.getItems());
        this.galleryMiniatureAdapter.setViewData(data);
        int itemListHeight = getItemListHeight(data.getMiniItemsRatio());
        if (viewBinding.getPreviewRv().getMeasuredHeight() != itemListHeight) {
            RecyclerView previewRv = viewBinding.getPreviewRv();
            ViewGroup.LayoutParams layoutParams = viewBinding.getPreviewRv().getLayoutParams();
            layoutParams.height = itemListHeight;
            previewRv.setLayoutParams(layoutParams);
        }
    }

    private final void collapseView() {
        ViewPager2 viewPager = this.binding.getViewPager();
        ViewGroup.LayoutParams layoutParams = viewPager.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).height = 0;
        bVar.f41600G = "0.75";
        viewPager.setLayoutParams(bVar);
    }

    private final void expandView() {
        ConstraintLayout galleryContainer = this.binding.getGalleryContainer();
        ViewGroup.LayoutParams layoutParams = galleryContainer.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = -1;
        galleryContainer.setLayoutParams(layoutParams);
        ViewPager2 viewPager = this.binding.getViewPager();
        ViewGroup.LayoutParams layoutParams2 = viewPager.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams2;
        ((ViewGroup.MarginLayoutParams) bVar).height = -1;
        bVar.f41600G = null;
        viewPager.setLayoutParams(bVar);
    }

    private final int getItemListHeight(Double ratio) {
        return (ratio == null || ratio.doubleValue() < 1.0d) ? GalleryFullViewUtils.INSTANCE.getMiniatureSizeMax() : GalleryFullViewUtils.INSTANCE.getMiniatureSizeMin();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleAction(GalleryFullViewViewModel$Action action) {
        Unit unit;
        if (action instanceof GalleryFullViewViewModel$Action.BindItems) {
            bindItems(((GalleryFullViewViewModel$Action.BindItems) action).getData());
            unit = Unit.f71690a;
        } else if (action instanceof GalleryFullViewViewModel$Action.SetCurrentPage) {
            setCurrentPage(((GalleryFullViewViewModel$Action.SetCurrentPage) action).getPage());
            unit = Unit.f71690a;
        } else if (action instanceof GalleryFullViewViewModel$Action.SmoothScrollToPage) {
            smoothScrollToPosition(((GalleryFullViewViewModel$Action.SmoothScrollToPage) action).getPage());
            unit = Unit.f71690a;
        } else if (action instanceof GalleryFullViewViewModel$Action.NotifyPreviewAdapter) {
            notifyPreviewAdapter();
            unit = Unit.f71690a;
        } else if (action instanceof GalleryFullViewViewModel$Action.LockPager) {
            lockPager();
            unit = Unit.f71690a;
        } else if (action instanceof GalleryFullViewViewModel$Action.UnlockPager) {
            unit = unLockPager();
        } else if (action instanceof GalleryFullViewViewModel$Action.ShowPreview) {
            showPreview();
            unit = Unit.f71690a;
        } else if (action instanceof GalleryFullViewViewModel$Action.HidePreview) {
            hidePreview();
            unit = Unit.f71690a;
        } else if (action instanceof GalleryFullViewViewModel$Action.HideSystemUI) {
            setFullScreen(true);
            unit = Unit.f71690a;
        } else if (action instanceof GalleryFullViewViewModel$Action.HideCloseBtn) {
            hideCloseBtn();
            unit = Unit.f71690a;
        } else if (action instanceof GalleryFullViewViewModel$Action.ShowSystemUI) {
            setFullScreen(false);
            unit = Unit.f71690a;
        } else if (Intrinsics.d(action, GalleryFullViewViewModel$Action.Collapse.INSTANCE)) {
            collapseView();
            unit = Unit.f71690a;
        } else if (Intrinsics.d(action, GalleryFullViewViewModel$Action.Expand.INSTANCE)) {
            expandView();
            unit = Unit.f71690a;
        } else {
            if (!Intrinsics.d(action, GalleryFullViewViewModel$Action.ShowCloseBtn.INSTANCE)) {
                throw new o();
            }
            showCloseBtn();
            unit = Unit.f71690a;
        }
        WhenExtKt.getExhaustive(unit);
    }

    private final void hideCloseBtn() {
        this.refs.getController().update(new GalleryFullViewCloseButton(false, this.closeButtonEvent, false, 4, null));
    }

    private final void hidePreview() {
        this.binding.hidePreviewRv();
    }

    private final Unit initMiniatureList() {
        GalleryFullViewLayout.ViewBinding viewBinding = this.binding;
        viewBinding.getPreviewRv().setAdapter(this.galleryMiniatureAdapter);
        viewBinding.getPreviewRv().addOnScrollListener(this.previewScrollListener);
        Drawable drawable = androidx.core.content.a.getDrawable(getContext(), R$drawable.pdp_gallery_full_view_miniature_divider);
        if (drawable == null) {
            return null;
        }
        RecyclerView previewRv = viewBinding.getPreviewRv();
        androidx.recyclerview.widget.j jVar = new androidx.recyclerview.widget.j(getContext(), 0);
        jVar.setDrawable(drawable);
        previewRv.addItemDecoration(jVar);
        return Unit.f71690a;
    }

    private final void initViewPager() {
        GalleryFullViewLayout.ViewBinding viewBinding = this.binding;
        viewBinding.getViewPager().s(this.galleryFullViewAdapter);
        viewBinding.getViewPager().v(-1);
        viewBinding.getViewPager().a(this.fullViewItemDecorator);
        viewBinding.getViewPager().p(new ViewPager2.g() { // from class: ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GalleryFullViewViewHolder$initViewPager$1$1
            @Override // androidx.viewpager2.widget.ViewPager2.g
            public void onPageSelected(int position) {
                GalleryFullViewViewHolder.this.widgetViewModel.onPageSelected(position);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lifecycleObserver$lambda$1(GalleryFullViewViewHolder galleryFullViewViewHolder, J j11, AbstractC5434v.a event) {
        Intrinsics.checkNotNullParameter(j11, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC5434v.a.ON_DESTROY) {
            if (galleryFullViewViewHolder.notifyHandler.isInitialized()) {
                galleryFullViewViewHolder.notifyHandler.getValue().removeCallbacks(galleryFullViewViewHolder.notifyRunnable);
            }
            galleryFullViewViewHolder.binding.getViewPager().s(null);
            galleryFullViewViewHolder.binding.getPreviewRv().removeOnScrollListener(galleryFullViewViewHolder.previewScrollListener);
            galleryFullViewViewHolder.removeLifeCycleObserver();
            if (galleryFullViewViewHolder.isFullScreen) {
                Window window = galleryFullViewViewHolder.refs.getContainer().i().getWindow();
                new Q0(window.getDecorView(), window).g(7);
            }
        }
    }

    private final void lockPager() {
        this.binding.getViewPager().y(false);
        ViewParent parent = this.binding.getGalleryContainer().getParent();
        RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
        if (recyclerView != null) {
            recyclerView.scrollToPosition(0);
            ScrollExtKt.scrollEnable(recyclerView, false);
        }
    }

    private final void notifyPreviewAdapter() {
        this.notifyHandler.getValue().post(this.notifyRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyRunnable$lambda$0(GalleryFullViewViewHolder galleryFullViewViewHolder) {
        RecyclerView.g adapter = galleryFullViewViewHolder.binding.getPreviewRv().getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    private final void removeLifeCycleObserver() {
        U7.d.c(this.refs).e(this.lifecycleObserver);
    }

    private final void setCurrentPage(int page) {
        this.binding.getViewPager().t(page, false);
    }

    private final void setFullScreen(boolean isFullScreen) {
        View view;
        View view2;
        this.isFullScreen = isFullScreen;
        Window window = this.refs.getContainer().i().getWindow();
        Q0 q02 = new Q0(window.getDecorView(), window);
        q02.f();
        if (isFullScreen) {
            this.binding.getViewPager().q(this.fullViewItemDecorator);
            q02.a(7);
            ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
            if (c11 == null || (view2 = c11.getView()) == null) {
                return;
            }
            view2.setFitsSystemWindows(false);
            return;
        }
        if (this.binding.getViewPager().g() == 0) {
            this.binding.getViewPager().a(this.fullViewItemDecorator);
        }
        q02.g(7);
        ComponentCallbacksC5392m c12 = this.refs.getContainer().c();
        if (c12 == null || (view = c12.getView()) == null) {
            return;
        }
        view.setFitsSystemWindows(true);
    }

    private final void showCloseBtn() {
        this.refs.getController().update(new GalleryFullViewCloseButton(false, this.closeButtonEvent, false, 5, null));
    }

    private final void showPreview() {
        this.binding.showPreviewRv();
    }

    private final void smoothScrollToPosition(int position) {
        RecyclerView.o layoutManager = this.binding.getPreviewRv().getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        this.isScrolling = true;
        this.galleryPreviewSmoothScroller.setTargetPosition(position);
        linearLayoutManager.startSmoothScroll(this.galleryPreviewSmoothScroller);
    }

    private final Unit unLockPager() {
        final GalleryFullViewLayout.ViewBinding viewBinding = this.binding;
        viewBinding.getViewPager().y(true);
        RecyclerView previewRv = viewBinding.getPreviewRv();
        if (!previewRv.isLaidOut() || previewRv.isLayoutRequested()) {
            previewRv.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GalleryFullViewViewHolder$unLockPager$lambda$14$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    RecyclerView.o layoutManager = GalleryFullViewLayout.ViewBinding.this.getPreviewRv().getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.onRestoreInstanceState(this.lastPreviewState);
                    }
                }
            });
        } else {
            RecyclerView.o layoutManager = viewBinding.getPreviewRv().getLayoutManager();
            if (layoutManager != null) {
                layoutManager.onRestoreInstanceState(this.lastPreviewState);
            }
        }
        ViewParent parent = viewBinding.getGalleryContainer().getParent();
        RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
        if (recyclerView == null) {
            return null;
        }
        ScrollExtKt.scrollEnable(recyclerView, true);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull GalleryFullViewVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.closeButtonEvent = item.getCloseButtonEvent();
        ViewExtKt.bindBackground(this.binding.getGalleryContainer(), item.getBackgroundColor());
        this.widgetViewModel.init(item);
        this.refs.getController().update(new GalleryFullViewCloseButton(false, item.getCloseButtonEvent(), false, 5, null));
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull GalleryFullViewVO item, @NotNull W10.c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((GalleryFullViewViewHolder) item, trackingData, viewedPond);
        TokenizedAnalyticsExtKt.processViewEvents(this.tokenizedAnalytics, item.getEvent());
    }
}

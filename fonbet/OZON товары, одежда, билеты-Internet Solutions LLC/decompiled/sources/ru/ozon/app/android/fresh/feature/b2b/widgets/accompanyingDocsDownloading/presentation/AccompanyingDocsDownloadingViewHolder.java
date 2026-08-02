package ru.ozon.app.android.fresh.feature.b2b.widgets.accompanyingDocsDownloading.presentation;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import Wc.a;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.FileProvider;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import com.google.android.gms.common.internal.ImagesContract;
import i10.l;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.fresh.feature.b2b.R$string;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetAccompanyingDocsDownloadingBinding;
import ru.ozon.app.android.fresh.feature.b2b.widgets.accompanyingDocsDownloading.presentation.AccompanyingDocsDownloadingVO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.accompanyingDocsDownloading.presentation.AccompanyingDocsEventHolder;
import ru.ozon.app.android.pdfviewer.presentation.FileDownloaderViewModel;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedBorderlessButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001:B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\"\u0010\u001dJ\u0017\u0010%\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020#H\u0014¢\u0006\u0004\b%\u0010&J\u001f\u0010*\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(H\u0014¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010,R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010-R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010.R\u0014\u0010/\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00100R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R \u00107\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u000f058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R \u00109\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u000f058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00108¨\u0006;"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/accompanyingDocsDownloading/presentation/AccompanyingDocsDownloadingViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/accompanyingDocsDownloading/presentation/AccompanyingDocsDownloadingVO;", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetAccompanyingDocsDownloadingBinding;", "binding", "Lru/ozon/app/android/pdfviewer/presentation/FileDownloaderViewModel;", "fileDownloaderViewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetAccompanyingDocsDownloadingBinding;Lru/ozon/app/android/pdfviewer/presentation/FileDownloaderViewModel;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "", "downloadPdf", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "", "resId", "", "cornerRadius", "Landroid/graphics/drawable/Drawable;", "getDrawableBackground", "(IF)Landroid/graphics/drawable/Drawable;", "", "showLoading", "(Z)V", "showDefaultErrorSnackBar", "()V", "Ljava/io/File;", "file", "showDownloadSuccess", "(Ljava/io/File;)V", "onRecycle", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/accompanyingDocsDownloading/presentation/AccompanyingDocsDownloadingVO;Ll20/d;)V", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetAccompanyingDocsDownloadingBinding;", "Lru/ozon/app/android/pdfviewer/presentation/FileDownloaderViewModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "cellListBackgroundCornerRadius", "F", "notificationBackgroundCornerRadius", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "cellListAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "pdfHandler", "Companion", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AccompanyingDocsDownloadingViewHolder extends k<AccompanyingDocsDownloadingVO> {
    private static AccompanyingDocsEventHolder accompanyingDocsEventHolder;

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetAccompanyingDocsDownloadingBinding binding;

    @NotNull
    private final AtomsAdapter cellListAdapter;
    private final float cellListBackgroundCornerRadius;

    @NotNull
    private final FileDownloaderViewModel fileDownloaderViewModel;
    private final float notificationBackgroundCornerRadius;

    @NotNull
    private final Function1<AtomAction, Unit> pdfHandler;

    @NotNull
    private final ComposerReferences references;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.accompanyingDocsDownloading.presentation.AccompanyingDocsDownloadingViewHolder$1", f = "AccompanyingDocsDownloadingViewHolder.kt", l = {62}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.fresh.feature.b2b.widgets.accompanyingDocsDownloading.presentation.AccompanyingDocsDownloadingViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return AccompanyingDocsDownloadingViewHolder.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InterfaceC2395h<AccompanyingDocsEventHolder.Event> events;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                AccompanyingDocsEventHolder accompanyingDocsEventHolder = AccompanyingDocsDownloadingViewHolder.INSTANCE.getAccompanyingDocsEventHolder();
                if (accompanyingDocsEventHolder != null && (events = accompanyingDocsEventHolder.getEvents()) != null) {
                    final AccompanyingDocsDownloadingViewHolder accompanyingDocsDownloadingViewHolder = AccompanyingDocsDownloadingViewHolder.this;
                    InterfaceC2397i<? super AccompanyingDocsEventHolder.Event> interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.fresh.feature.b2b.widgets.accompanyingDocsDownloading.presentation.AccompanyingDocsDownloadingViewHolder.1.1

                        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroid/content/Intent;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
                        /* renamed from: ru.ozon.app.android.fresh.feature.b2b.widgets.accompanyingDocsDownloading.presentation.AccompanyingDocsDownloadingViewHolder$1$1$1, reason: invalid class name and collision with other inner class name */
                        static final class C17741 extends AbstractC7737t implements Function1<Intent, Unit> {
                            public static final C17741 INSTANCE = new C17741();

                            C17741() {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Intent intent) {
                                invoke2(intent);
                                return Unit.f71690a;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Intent setResult) {
                                Intrinsics.checkNotNullParameter(setResult, "$this$setResult");
                                setResult.putExtra("action", "action_refresh");
                            }
                        }

                        @Override // Ae.InterfaceC2397i
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                            return emit((AccompanyingDocsEventHolder.Event) obj2, (d<? super Unit>) dVar);
                        }

                        public final Object emit(AccompanyingDocsEventHolder.Event event, d<? super Unit> dVar) {
                            InterfaceC7851b.a.e(AccompanyingDocsDownloadingViewHolder.this.references.getController(), null, null, null, 7);
                            ComposerExtKt.setResult$default(AccompanyingDocsDownloadingViewHolder.this.references.getContainer(), null, 0, C17741.INSTANCE, 3, null);
                            return Unit.f71690a;
                        }
                    };
                    this.label = 1;
                    if (events.collect(interfaceC2397i, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/accompanyingDocsDownloading/presentation/AccompanyingDocsDownloadingViewHolder$Companion;", "", "<init>", "()V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/accompanyingDocsDownloading/presentation/AccompanyingDocsEventHolder;", "accompanyingDocsEventHolder", "Lru/ozon/app/android/fresh/feature/b2b/widgets/accompanyingDocsDownloading/presentation/AccompanyingDocsEventHolder;", "getAccompanyingDocsEventHolder", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/accompanyingDocsDownloading/presentation/AccompanyingDocsEventHolder;", "setAccompanyingDocsEventHolder", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/accompanyingDocsDownloading/presentation/AccompanyingDocsEventHolder;)V", "", "PARAMS_URL_KEY", "Ljava/lang/String;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AccompanyingDocsEventHolder getAccompanyingDocsEventHolder() {
            return AccompanyingDocsDownloadingViewHolder.accompanyingDocsEventHolder;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AccompanyingDocsDownloadingViewHolder(@NotNull WidgetAccompanyingDocsDownloadingBinding binding, @NotNull FileDownloaderViewModel fileDownloaderViewModel, @NotNull ComposerReferences references, @NotNull HandlersInhibitor handlersInhibitor) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(fileDownloaderViewModel, "fileDownloaderViewModel");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        LinearLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.fileDownloaderViewModel = fileDownloaderViewModel;
        this.references = references;
        this.cellListBackgroundCornerRadius = ResourceExtKt.toPxF(16);
        this.notificationBackgroundCornerRadius = ResourceExtKt.toPxF(12);
        this.cellListAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.actionHandler = new ActionHandler.Builder(references, this).buildHandler();
        this.pdfHandler = new ActionHandler.Builder(references, this).enableClickThrottling(handlersInhibitor).onClick(new AccompanyingDocsDownloadingViewHolder$pdfHandler$1(this)).buildHandler();
        accompanyingDocsEventHolder = new AccompanyingDocsEventHolderImpl();
        C10727i.c(K.a(references.getContainer().g()), null, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void downloadPdf(AtomAction.Click action) {
        Map<String, String> params;
        String str;
        r a11 = this.references.getContainer().a();
        if (a11 == null || (params = action.getParams()) == null || (str = params.get(ImagesContract.URL)) == null) {
            return;
        }
        this.fileDownloaderViewModel.downloadFile(str, false, a11, true, "pdf");
    }

    private final Drawable getDrawableBackground(int resId, float cornerRadius) {
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.getPaint().setColor(getContext().getColor(resId));
        paintDrawable.setCornerRadius(cornerRadius);
        return paintDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDefaultErrorSnackBar() {
        ViewGroup rootView = ContextExtKt.getRootView(this.references.getContainer().j());
        if (rootView != null) {
            FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, null, null, 3000L, null, this.references.getContainer().g(), 46, null).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDownloadSuccess(File file) {
        ViewGroup rootView = ContextExtKt.getRootView(this.references.getContainer().j());
        if (rootView != null) {
            FlashbarFactory.create$default(FlashbarFactory.INSTANCE, rootView, null, OzonSpannableStringKt.toOzonSpannableString(StringProvider.getString(R$string.common_file_download_success_android, FileProvider.d(rootView.getContext(), rootView.getContext().getPackageName() + ".fileprovider", file).getLastPathSegment())), null, null, null, null, null, null, null, null, null, null, 3000L, null, null, this.references.getContainer().g(), 57338, null).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showLoading(boolean showLoading) {
        if (showLoading) {
            this.references.getController().e(new l.a.C1079a(0L, null, 3));
        } else {
            this.references.getController().hideLoader();
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        this.fileDownloaderViewModel.getSingleAction().observe(lifecycle, new AccompanyingDocsDownloadingViewHolder$sam$androidx_lifecycle_Observer$0(new AccompanyingDocsDownloadingViewHolder$onAttachViewModel$1(this)));
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        accompanyingDocsEventHolder = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AccompanyingDocsDownloadingVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetAccompanyingDocsDownloadingBinding widgetAccompanyingDocsDownloadingBinding = this.binding;
        widgetAccompanyingDocsDownloadingBinding.title.setText(item.getTitle());
        VerticalAtomsLayout verticalAtomsLayout = widgetAccompanyingDocsDownloadingBinding.cellListView;
        verticalAtomsLayout.setAdapter(this.cellListAdapter);
        verticalAtomsLayout.setBackground(getDrawableBackground(R$color.bg_secondary, this.cellListBackgroundCornerRadius));
        AtomsAdapter atomsAdapter = this.cellListAdapter;
        atomsAdapter.setOnAction(this.pdfHandler);
        atomsAdapter.bind(getContext(), item.getCellItems());
        LinearLayout linearLayout = widgetAccompanyingDocsDownloadingBinding.notificationLayout;
        Intrinsics.f(linearLayout);
        linearLayout.setVisibility(item.getNotification() != null ? 0 : 8);
        linearLayout.setBackground(getDrawableBackground(R$color.layer_floor_0, this.notificationBackgroundCornerRadius));
        TextAtomV2View notificationText = widgetAccompanyingDocsDownloadingBinding.notificationText;
        Intrinsics.checkNotNullExpressionValue(notificationText, "notificationText");
        AccompanyingDocsDownloadingVO.NotificationVO notification = item.getNotification();
        TextHolderKt.bindOrGone$default(notificationText, notification != null ? notification.getBody() : null, null, 2, null);
        SmallBorderlessButtonView notificationButton = widgetAccompanyingDocsDownloadingBinding.notificationButton;
        Intrinsics.checkNotNullExpressionValue(notificationButton, "notificationButton");
        AccompanyingDocsDownloadingVO.NotificationVO notification2 = item.getNotification();
        WrappedBorderlessButtonHolderKt.bindOrGone(notificationButton, notification2 != null ? notification2.getButton() : null, this.actionHandler);
    }
}

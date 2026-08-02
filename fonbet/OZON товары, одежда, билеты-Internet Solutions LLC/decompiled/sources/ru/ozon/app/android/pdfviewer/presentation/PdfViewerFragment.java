package ru.ozon.app.android.pdfviewer.presentation;

import Sc.o;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.MimeTypeMap;
import android.widget.FrameLayout;
import androidx.appcompat.app.AbstractC5051a;
import androidx.core.app.t;
import androidx.core.content.FileProvider;
import androidx.core.content.res.g;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.j;
import bd.h;
import com.google.android.gms.common.internal.ImagesContract;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import java.io.File;
import java.net.UnknownHostException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.R$id;
import ru.ozon.app.android.composer.R$layout;
import ru.ozon.app.android.composer.R$menu;
import ru.ozon.app.android.composer.databinding.PdfViewerFragmentBinding;
import ru.ozon.app.android.pdfviewer.di.PdfFileComponent;
import ru.ozon.app.android.pdfviewer.di.PdfFileComponentApi;
import ru.ozon.app.android.pdfviewer.presentation.PdfViewerViewModel;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.uikit.utils.NotificationBarHelperKt;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 F2\u00020\u0001:\u0001FB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\"\u0010#J!\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020!2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0006H\u0016¢\u0006\u0004\b'\u0010\u0003J\u000f\u0010(\u001a\u00020\u0006H\u0016¢\u0006\u0004\b(\u0010\u0003J\u001f\u0010,\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)2\u0006\u0010\u001e\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u00101\u001a\u0002002\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b1\u00102R(\u00105\u001a\b\u0012\u0004\u0012\u000204038\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0016\u0010;\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010>\u001a\u00020=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010A\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020@8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006G"}, d2 = {"Lru/ozon/app/android/pdfviewer/presentation/PdfViewerFragment;", "Landroidx/fragment/app/m;", "<init>", "()V", "", "error", "", "showError", "(Ljava/lang/Throwable;)V", "initToolbar", "initPdfView", "initDarkMode", "Ljava/io/File;", "file", "shareFile", "(Ljava/io/File;)V", "showPdfFile", "Lru/ozon/app/android/pdfviewer/presentation/PdfViewerViewModel$Action$Loading;", "action", "showProgess", "(Lru/ozon/app/android/pdfviewer/presentation/PdfViewerViewModel$Action$Loading;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "onDestroy", "Landroid/view/Menu;", "menu", "Landroid/view/MenuInflater;", "onCreateOptionsMenu", "(Landroid/view/Menu;Landroid/view/MenuInflater;)V", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "LIb/a;", "Lru/ozon/app/android/pdfviewer/presentation/PdfViewerViewModel;", "pViewModel", "LIb/a;", "getPViewModel$composer_prodGoogleAllVendorsRelease", "()LIb/a;", "setPViewModel$composer_prodGoogleAllVendorsRelease", "(LIb/a;)V", "viewModel", "Lru/ozon/app/android/pdfviewer/presentation/PdfViewerViewModel;", "Lru/ozon/app/android/pdfviewer/presentation/PdfViewerAdapter;", "pdfViewAdapter", "Lru/ozon/app/android/pdfviewer/presentation/PdfViewerAdapter;", "Lru/ozon/app/android/composer/databinding/PdfViewerFragmentBinding;", "mBinding", "Lru/ozon/app/android/composer/databinding/PdfViewerFragmentBinding;", "getBinding", "()Lru/ozon/app/android/composer/databinding/PdfViewerFragmentBinding;", "binding", "Companion", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PdfViewerFragment extends ComponentCallbacksC5392m {
    private PdfViewerFragmentBinding mBinding;
    public Ib.a<PdfViewerViewModel> pViewModel;
    private PdfViewerAdapter pdfViewAdapter;
    private PdfViewerViewModel viewModel;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pdfviewer/presentation/PdfViewerFragment$Companion;", "", "<init>", "()V", "EXTRA_URL", "", "EXTRA_IGNORE_AUTHORISE_TOKEN", "PDF_MIME_TYPE", "newInstance", "Lru/ozon/app/android/pdfviewer/presentation/PdfViewerFragment;", ImagesContract.URL, "ignoreAuthoriseToken", "", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PdfViewerFragment newInstance(@NotNull String url, boolean ignoreAuthoriseToken) {
            Intrinsics.checkNotNullParameter(url, "url");
            PdfViewerFragment pdfViewerFragment = new PdfViewerFragment();
            Bundle bundle = new Bundle();
            bundle.putString("ru.ozon.app.android.pdfviewer.presentation.pdfviewerfragment.url", url);
            bundle.putBoolean("ru.ozon.app.android.pdfviewer.presentation.pdfviewerfragment.ignoreAuthoriseToken", ignoreAuthoriseToken);
            pdfViewerFragment.setArguments(bundle);
            return pdfViewerFragment;
        }

        private Companion() {
        }
    }

    private final PdfViewerFragmentBinding getBinding() {
        PdfViewerFragmentBinding pdfViewerFragmentBinding = this.mBinding;
        Intrinsics.f(pdfViewerFragmentBinding);
        return pdfViewerFragmentBinding;
    }

    private final void initDarkMode() {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        if (!ThemeExtKt.isDarkThemeActive(requireContext)) {
            FrameLayout pdfViewParanjaFl = getBinding().pdfViewParanjaFl;
            Intrinsics.checkNotNullExpressionValue(pdfViewParanjaFl, "pdfViewParanjaFl");
            ViewExtKt.gone(pdfViewParanjaFl);
        } else {
            getBinding().pdfViewParanjaFl.getBackground().setColorFilter(androidx.core.content.a.getColor(requireContext(), R$color.oz_semantic_parandja), PorterDuff.Mode.DARKEN);
            FrameLayout pdfViewParanjaFl2 = getBinding().pdfViewParanjaFl;
            Intrinsics.checkNotNullExpressionValue(pdfViewParanjaFl2, "pdfViewParanjaFl");
            ViewExtKt.show(pdfViewParanjaFl2);
        }
    }

    private final void initPdfView() {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        this.pdfViewAdapter = new PdfViewerAdapter(requireContext);
        PinchRecyclerView pinchRecyclerView = getBinding().pdfView;
        PdfViewerAdapter pdfViewerAdapter = this.pdfViewAdapter;
        if (pdfViewerAdapter == null) {
            Intrinsics.n("pdfViewAdapter");
            throw null;
        }
        pinchRecyclerView.setAdapter(pdfViewerAdapter);
        pinchRecyclerView.setLayoutManager(new LinearLayoutManager(pinchRecyclerView.getContext(), 1, false));
        j jVar = new j(pinchRecyclerView.getContext(), 1);
        Resources resources = pinchRecyclerView.getResources();
        int i11 = R$color.oz_semantic_separator;
        Context context = pinchRecyclerView.getContext();
        jVar.setDrawable(new ColorDrawable(g.b(resources, i11, context != null ? context.getTheme() : null)));
        pinchRecyclerView.addItemDecoration(jVar);
    }

    private final void initToolbar() {
        r activity = getActivity();
        Intrinsics.g(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        androidx.appcompat.app.g gVar = (androidx.appcompat.app.g) activity;
        gVar.setSupportActionBar(getBinding().toolbar);
        AbstractC5051a supportActionBar = gVar.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.m(true);
            supportActionBar.o();
            supportActionBar.p(R$drawable.ic_arrow_back_black);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(PdfViewerFragment pdfViewerFragment, PdfViewerViewModel.Action action) {
        if (action instanceof PdfViewerViewModel.Action.Success) {
            pdfViewerFragment.showPdfFile(((PdfViewerViewModel.Action.Success) action).getFile());
        } else if (action instanceof PdfViewerViewModel.Action.Loading) {
            pdfViewerFragment.showProgess((PdfViewerViewModel.Action.Loading) action);
        } else {
            if (!(action instanceof PdfViewerViewModel.Action.Error)) {
                throw new o();
            }
            pdfViewerFragment.showError(((PdfViewerViewModel.Action.Error) action).getError());
        }
    }

    private final void shareFile(File file) {
        Uri d11 = FileProvider.d(requireContext(), requireContext().getPackageName() + ".fileprovider", file);
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(h.i(file));
        if (mimeTypeFromExtension == null) {
            mimeTypeFromExtension = "application/pdf";
        }
        t.a aVar = new t.a(requireActivity());
        aVar.g(mimeTypeFromExtension.toString());
        aVar.e(d11);
        aVar.c(R$string.common_action_share);
        startActivity(aVar.a().addFlags(1));
    }

    private final void showError(Throwable error) {
        NotificationLayoutManager asNotificationLayoutManager$default;
        Lm0.a.f17149a.e(error);
        ViewGroup rootView = ContextExtKt.getRootView(this);
        if (rootView == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(rootView, null, 1, null)) == null) {
            return;
        }
        NotificationBar.Companion companion = NotificationBar.INSTANCE;
        NotificationDTO createNetworkErrorNotificationDTO$default = error instanceof UnknownHostException ? NotificationBarHelperKt.createNetworkErrorNotificationDTO$default(false, 1, null) : new NotificationDTO(StringProvider.getString(ru.ozon.uni.R$string.error_flashbar_universal_network_error), null, null, null, null, null, null, null, null, NotificationDTO.Preset.WARNING, 510, null);
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        NotificationBar.Companion.make$default(companion, asNotificationLayoutManager$default, createNetworkErrorNotificationDTO$default, viewLifecycleOwner, null, 8, null).show();
    }

    private final void showPdfFile(File file) {
        PdfViewerAdapter pdfViewerAdapter = this.pdfViewAdapter;
        if (pdfViewerAdapter == null) {
            Intrinsics.n("pdfViewAdapter");
            throw null;
        }
        pdfViewerAdapter.openPdf(file);
        PinchRecyclerView pinchRecyclerView = getBinding().pdfView;
        PdfViewerAdapter pdfViewerAdapter2 = this.pdfViewAdapter;
        if (pdfViewerAdapter2 != null) {
            pinchRecyclerView.swapAdapter(pdfViewerAdapter2, true);
        } else {
            Intrinsics.n("pdfViewAdapter");
            throw null;
        }
    }

    private final void showProgess(PdfViewerViewModel.Action.Loading action) {
        FrameLayout constraintLayout = getBinding().progress.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ViewExtKt.showOrGone(constraintLayout, Boolean.valueOf(action.getShow()));
    }

    @NotNull
    public final Ib.a<PdfViewerViewModel> getPViewModel$composer_prodGoogleAllVendorsRelease() {
        Ib.a<PdfViewerViewModel> aVar = this.pViewModel;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("pViewModel");
        throw null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (PdfFileComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component PdfFileComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(context, PdfFileComponentApi.class).getDependencyStorage();
        if (PdfFileComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component PdfFileComponentApi is not DiComponent");
        }
        ((PdfFileComponent) dependencyStorage.b(PdfFileComponentApi.class)).inject(this);
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        PdfViewerViewModel pdfViewerViewModel = (PdfViewerViewModel) new z0(this, new z0.c() { // from class: ru.ozon.app.android.pdfviewer.presentation.PdfViewerFragment$onCreate$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                PdfViewerViewModel pdfViewerViewModel2 = PdfViewerFragment.this.getPViewModel$composer_prodGoogleAllVendorsRelease().get();
                Intrinsics.g(pdfViewerViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return pdfViewerViewModel2;
            }
        }).a(PdfViewerViewModel.class);
        this.viewModel = pdfViewerViewModel;
        if (pdfViewerViewModel != null) {
            pdfViewerViewModel.getSingleAction().observe(this, new XB.a(this, 1));
        } else {
            Intrinsics.n("viewModel");
            throw null;
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreateOptionsMenu(@NotNull Menu menu, @NotNull MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        inflater.inflate(R$menu.pdf_viewer_menu, menu);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R$layout.pdf_viewer_fragment, container, false);
        this.mBinding = PdfViewerFragmentBinding.bind(inflate);
        return inflate;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroy() {
        super.onDestroy();
        PdfViewerAdapter pdfViewerAdapter = this.pdfViewAdapter;
        if (pdfViewerAdapter != null) {
            pdfViewerAdapter.onDestroy();
        } else {
            Intrinsics.n("pdfViewAdapter");
            throw null;
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        super.onDestroyView();
        this.mBinding = null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        int itemId = item.getItemId();
        if (itemId != R$id.share) {
            if (itemId != 16908332) {
                return super.onOptionsItemSelected(item);
            }
            r activity = getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
            return true;
        }
        PdfViewerViewModel pdfViewerViewModel = this.viewModel;
        if (pdfViewerViewModel == null) {
            Intrinsics.n("viewModel");
            throw null;
        }
        File file = pdfViewerViewModel.getFile();
        if (file == null) {
            return false;
        }
        shareFile(file);
        return true;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initToolbar();
        initPdfView();
        initDarkMode();
        Bundle arguments = getArguments();
        if (arguments != null) {
            PdfViewerViewModel pdfViewerViewModel = this.viewModel;
            if (pdfViewerViewModel == null) {
                Intrinsics.n("viewModel");
                throw null;
            }
            String string = arguments.getString("ru.ozon.app.android.pdfviewer.presentation.pdfviewerfragment.url");
            Intrinsics.f(string);
            pdfViewerViewModel.openUrl(string, arguments.getBoolean("ru.ozon.app.android.pdfviewer.presentation.pdfviewerfragment.ignoreAuthoriseToken"));
        }
    }
}

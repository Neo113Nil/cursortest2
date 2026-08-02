package ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.viewHolder;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.atoms.v3.holders.disclaimer.DisclaimerHolderKt;
import ru.ozon.app.android.atoms.v3.molecules.DisclaimerContainer;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.returns.creation.databinding.PhotoPickerPhotosBinding;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.recycler.PhotosAdapter;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.recycler.decoration.PhotoDecoration;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.viewHolder.PhotosViewHolder;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.viewModel.PhotosViewModel;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.viewModel.PhotosViewState;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.viewObject.PhotosVO;
import ru.ozon.app.android.utils.WhenExtKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;

@Metadata(d1 = {"\u0000[\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005*\u0001(\b\u0001\u0018\u0000 +2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001+B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u000eJ\u000f\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u000eJ\u000f\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u000eJ\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewHolder/PhotosViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewObject/PhotosVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/returns/creation/databinding/PhotoPickerPhotosBinding;", "binding", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewModel/PhotosViewModel;", "viewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/returns/creation/databinding/PhotoPickerPhotosBinding;Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewModel/PhotosViewModel;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "setupRecycler", "()V", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewModel/PhotosViewState;", "viewState", "observeViewState", "(Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewModel/PhotosViewState;)V", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewModel/PhotosViewState$Photos;", "showPhotos", "(Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewModel/PhotosViewState$Photos;)V", "showEmptyState", "showErrorDisclaimer", "setGlobalListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeGlobalListener", "(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewObject/PhotosVO;Ll20/d;)V", "Lru/ozon/app/android/returns/creation/databinding/PhotoPickerPhotosBinding;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewModel/PhotosViewModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/recycler/PhotosAdapter;", "photosAdapter", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/recycler/PhotosAdapter;", "ru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewHolder/PhotosViewHolder$bottomContainerViewTreeObserver$1", "bottomContainerViewTreeObserver", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewHolder/PhotosViewHolder$bottomContainerViewTreeObserver$1;", "Companion", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PhotosViewHolder extends k<PhotosVO> {

    @NotNull
    private final PhotoPickerPhotosBinding binding;

    @NotNull
    private final PhotosViewHolder$bottomContainerViewTreeObserver$1 bottomContainerViewTreeObserver;

    @NotNull
    private final PhotosAdapter photosAdapter;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final PhotosViewModel viewModel;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int MIN_VERTICAL_OFFSET = UiExtKt.toPx(16);
    private static final int BUTTONS_TOP_OFFSET = UiExtKt.toPx(16);
    private static final int HORIZONTAL_OFFSET = UiExtKt.toPx(78);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.viewHolder.PhotosViewHolder$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<PhotosViewState, Unit> {
        AnonymousClass1(Object obj) {
            super(1, obj, PhotosViewHolder.class, "observeViewState", "observeViewState(Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewModel/PhotosViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PhotosViewState photosViewState) {
            invoke2(photosViewState);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PhotosViewState photosViewState) {
            ((PhotosViewHolder) this.receiver).observeViewState(photosViewState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewHolder/PhotosViewHolder$Companion;", "", "<init>", "()V", "SMALL_PHOTO_SCREEN_MIN_WIDTH", "", "LARGE_SCREEN_SPAN_COUNT", "SMALL_SCREEN_SPAN_COUNT", "MIN_VERTICAL_OFFSET", "getMIN_VERTICAL_OFFSET", "()I", "BUTTONS_TOP_OFFSET", "getBUTTONS_TOP_OFFSET", "HORIZONTAL_OFFSET", "getHORIZONTAL_OFFSET", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getBUTTONS_TOP_OFFSET() {
            return PhotosViewHolder.BUTTONS_TOP_OFFSET;
        }

        public final int getHORIZONTAL_OFFSET() {
            return PhotosViewHolder.HORIZONTAL_OFFSET;
        }

        public final int getMIN_VERTICAL_OFFSET() {
            return PhotosViewHolder.MIN_VERTICAL_OFFSET;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r3v2, types: [ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.viewHolder.PhotosViewHolder$bottomContainerViewTreeObserver$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PhotosViewHolder(@NotNull PhotoPickerPhotosBinding binding, @NotNull PhotosViewModel viewModel, @NotNull ComposerReferences refs) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(refs, "refs");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.viewModel = viewModel;
        this.refs = refs;
        this.photosAdapter = new PhotosAdapter(viewModel, refs.getContainer().g());
        this.bottomContainerViewTreeObserver = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.viewHolder.PhotosViewHolder$bottomContainerViewTreeObserver$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                PhotosViewModel photosViewModel;
                PhotoPickerPhotosBinding photoPickerPhotosBinding;
                ComposerReferences composerReferences;
                ComposerReferences composerReferences2;
                PhotoPickerPhotosBinding photoPickerPhotosBinding2;
                PhotoPickerPhotosBinding photoPickerPhotosBinding3;
                PhotosViewHolder.Companion companion;
                PhotosViewHolder.Companion companion2;
                PhotoPickerPhotosBinding photoPickerPhotosBinding4;
                PhotoPickerPhotosBinding photoPickerPhotosBinding5;
                PhotosViewHolder.Companion companion3;
                PhotosViewHolder.Companion companion4;
                PhotoPickerPhotosBinding photoPickerPhotosBinding6;
                PhotoPickerPhotosBinding photoPickerPhotosBinding7;
                photosViewModel = PhotosViewHolder.this.viewModel;
                if (!Intrinsics.d(photosViewModel.getPhotosState().getValue(), PhotosViewState.EmptyState.INSTANCE)) {
                    photoPickerPhotosBinding7 = PhotosViewHolder.this.binding;
                    ConstraintLayout constraintLayout2 = photoPickerPhotosBinding7.getConstraintLayout();
                    Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
                    constraintLayout2.setPadding(0, 0, 0, 0);
                    PhotosViewHolder.this.removeGlobalListener(this);
                    return;
                }
                photoPickerPhotosBinding = PhotosViewHolder.this.binding;
                int height = photoPickerPhotosBinding.emptyStateIv.getHeight();
                composerReferences = PhotosViewHolder.this.refs;
                View requireView = composerReferences.getContainer().j().requireView();
                Intrinsics.checkNotNullExpressionValue(requireView, "requireView(...)");
                SwipeRefreshLayout composerSwipeRefresh = ComposerViewExtensionKt.composerSwipeRefresh(requireView);
                int height2 = composerSwipeRefresh != null ? composerSwipeRefresh.getHeight() : 0;
                composerReferences2 = PhotosViewHolder.this.refs;
                View requireView2 = composerReferences2.getContainer().j().requireView();
                Intrinsics.checkNotNullExpressionValue(requireView2, "requireView(...)");
                int height3 = ComposerViewExtensionKt.composerBottomContainer(requireView2).getHeight();
                photoPickerPhotosBinding2 = PhotosViewHolder.this.binding;
                int top = (((height2 - photoPickerPhotosBinding2.getConstraintLayout().getTop()) - height3) - height) / 2;
                if (top < 0) {
                    companion2 = PhotosViewHolder.Companion;
                    int min_vertical_offset = (top * 2) + (height - companion2.getMIN_VERTICAL_OFFSET());
                    photoPickerPhotosBinding4 = PhotosViewHolder.this.binding;
                    int width = (photoPickerPhotosBinding4.emptyStateIv.getWidth() * min_vertical_offset) / height;
                    photoPickerPhotosBinding5 = PhotosViewHolder.this.binding;
                    Image emptyStateIv = photoPickerPhotosBinding5.emptyStateIv;
                    Intrinsics.checkNotNullExpressionValue(emptyStateIv, "emptyStateIv");
                    ViewGroup.LayoutParams layoutParams = emptyStateIv.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                    ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                    ((ViewGroup.MarginLayoutParams) bVar).width = width;
                    ((ViewGroup.MarginLayoutParams) bVar).height = min_vertical_offset;
                    companion3 = PhotosViewHolder.Companion;
                    bVar.setMarginStart(companion3.getHORIZONTAL_OFFSET());
                    companion4 = PhotosViewHolder.Companion;
                    bVar.setMarginEnd(companion4.getHORIZONTAL_OFFSET());
                    emptyStateIv.setLayoutParams(bVar);
                    photoPickerPhotosBinding6 = PhotosViewHolder.this.binding;
                    ConstraintLayout constraintLayout3 = photoPickerPhotosBinding6.getConstraintLayout();
                    Intrinsics.checkNotNullExpressionValue(constraintLayout3, "getRoot(...)");
                    constraintLayout3.setPadding(constraintLayout3.getPaddingLeft(), Math.abs(top), constraintLayout3.getPaddingRight(), constraintLayout3.getPaddingBottom());
                } else {
                    photoPickerPhotosBinding3 = PhotosViewHolder.this.binding;
                    ConstraintLayout constraintLayout4 = photoPickerPhotosBinding3.getConstraintLayout();
                    Intrinsics.checkNotNullExpressionValue(constraintLayout4, "getRoot(...)");
                    int abs = Math.abs(top);
                    companion = PhotosViewHolder.Companion;
                    constraintLayout4.setPadding(constraintLayout4.getPaddingLeft(), (companion.getBUTTONS_TOP_OFFSET() / 2) + abs, constraintLayout4.getPaddingRight(), constraintLayout4.getPaddingBottom());
                }
                PhotosViewHolder.this.removeGlobalListener(this);
            }
        };
        setupRecycler();
        viewModel.getPhotosState().observe(refs.getContainer().f(), new PhotosViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass1(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void observeViewState(PhotosViewState viewState) {
        if (viewState instanceof PhotosViewState.EmptyState) {
            showEmptyState();
        } else if (viewState instanceof PhotosViewState.Photos) {
            showPhotos((PhotosViewState.Photos) viewState);
        } else if (viewState instanceof PhotosViewState.Disclaimer) {
            showErrorDisclaimer();
        }
        WhenExtKt.getExhaustive(Unit.f71690a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeGlobalListener(ViewTreeObserver.OnGlobalLayoutListener listener) {
        View requireView = this.refs.getContainer().j().requireView();
        Intrinsics.checkNotNullExpressionValue(requireView, "requireView(...)");
        ComposerViewExtensionKt.composerBottomContainer(requireView).getViewTreeObserver().removeOnGlobalLayoutListener(listener);
    }

    private final void setGlobalListener() {
        View requireView = this.refs.getContainer().j().requireView();
        Intrinsics.checkNotNullExpressionValue(requireView, "requireView(...)");
        ComposerViewExtensionKt.composerBottomContainer(requireView).getViewTreeObserver().addOnGlobalLayoutListener(this.bottomContainerViewTreeObserver);
    }

    private final void setupRecycler() {
        int i11 = UiExtKt.toDp(this.refs.getContainer().i().getResources().getDisplayMetrics().widthPixels) >= 400 ? 4 : 3;
        RecyclerView recyclerView = this.binding.photosRv;
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), i11));
        recyclerView.setAdapter(this.photosAdapter);
        recyclerView.setItemAnimator(null);
        recyclerView.addItemDecoration(new PhotoDecoration());
    }

    private final void showEmptyState() {
        PhotoPickerPhotosBinding photoPickerPhotosBinding = this.binding;
        setGlobalListener();
        Image emptyStateIv = photoPickerPhotosBinding.emptyStateIv;
        Intrinsics.checkNotNullExpressionValue(emptyStateIv, "emptyStateIv");
        ViewExtKt.show(emptyStateIv);
        RecyclerView photosRv = photoPickerPhotosBinding.photosRv;
        Intrinsics.checkNotNullExpressionValue(photosRv, "photosRv");
        ViewExtKt.gone(photosRv);
        DisclaimerContainer disclaimerContainer = photoPickerPhotosBinding.disclaimerContainer;
        Intrinsics.checkNotNullExpressionValue(disclaimerContainer, "disclaimerContainer");
        ViewExtKt.gone(disclaimerContainer);
    }

    private final void showErrorDisclaimer() {
        DisclaimerContainer disclaimerContainer = this.binding.disclaimerContainer;
        Intrinsics.checkNotNullExpressionValue(disclaimerContainer, "disclaimerContainer");
        ViewExtKt.show(disclaimerContainer);
    }

    private final void showPhotos(PhotosViewState.Photos viewState) {
        PhotoPickerPhotosBinding photoPickerPhotosBinding = this.binding;
        setGlobalListener();
        Image emptyStateIv = photoPickerPhotosBinding.emptyStateIv;
        Intrinsics.checkNotNullExpressionValue(emptyStateIv, "emptyStateIv");
        ViewExtKt.gone(emptyStateIv);
        DisclaimerContainer disclaimerContainer = photoPickerPhotosBinding.disclaimerContainer;
        Intrinsics.checkNotNullExpressionValue(disclaimerContainer, "disclaimerContainer");
        ViewExtKt.gone(disclaimerContainer);
        RecyclerView photosRv = photoPickerPhotosBinding.photosRv;
        Intrinsics.checkNotNullExpressionValue(photosRv, "photosRv");
        ViewExtKt.show(photosRv);
        this.photosAdapter.submitList(viewState.getPhotos());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull PhotosVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.viewModel.fetchPhotos(item);
        Image emptyStateIv = this.binding.emptyStateIv;
        Intrinsics.checkNotNullExpressionValue(emptyStateIv, "emptyStateIv");
        ImageHolderKt.bind$default(emptyStateIv, item.getEmptyStateImage(), null, 2, null);
        DisclaimerAtom errorDisclaimer = item.getErrorDisclaimer();
        if (errorDisclaimer != null) {
            DisclaimerHolderKt.bind$default(this.binding.disclaimerContainer, errorDisclaimer, null, 2, null);
        }
    }
}

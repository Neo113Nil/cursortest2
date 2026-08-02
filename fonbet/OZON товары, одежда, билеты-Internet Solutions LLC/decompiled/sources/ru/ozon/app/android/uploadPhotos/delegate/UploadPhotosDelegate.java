package ru.ozon.app.android.uploadPhotos.delegate;

import Ci.C2779a;
import Ci.b;
import Ci.g;
import Ci.k;
import Ci.l;
import Hi.h;
import a00.C4911f;
import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;
import ru.ozon.app.android.uploadPhotos.adapter.PhotosDecoration;
import ru.ozon.app.android.uploadPhotos.adapter.UploadPhotosAdapter;
import ru.ozon.app.android.uploadPhotos.model.ViewState;
import ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModel;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\t2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007*\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001c\u001a\u00020\t*\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u001e\u001a\u00020\t*\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ!\u0010#\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b#\u0010$J\u001b\u0010'\u001a\u00020%*\u00020%2\u0006\u0010&\u001a\u00020\u001fH\u0002¢\u0006\u0004\b'\u0010(J\u0015\u0010+\u001a\u00020\t2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R&\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010/R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00100R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00105\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00067"}, d2 = {"Lru/ozon/app/android/uploadPhotos/delegate/UploadPhotosDelegate;", "", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Landroidx/recyclerview/widget/RecyclerView;", "photosRecyclerView", "Lkotlin/Function1;", "", "", "", "onUpdatePhotos", "", "isSelect", "Landroidx/recyclerview/widget/RecyclerView$n;", "photosDecoration", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Landroidx/recyclerview/widget/RecyclerView;Lkotlin/jvm/functions/Function1;ZLandroidx/recyclerview/widget/RecyclerView$n;)V", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;", "photos", "updatePhotosIfNeed", "(Ljava/util/List;)V", "Lru/ozon/app/android/uploadPhotos/model/ViewState;", "updateImageList", "(Lru/ozon/app/android/uploadPhotos/model/ViewState;)Ljava/util/List;", "Landroidx/fragment/app/m;", "Landroidx/lifecycle/J;", "viewOwner", "message", "showMessageRestriction", "(Landroidx/fragment/app/m;Landroidx/lifecycle/J;Ljava/lang/String;)V", "showErrorRestriction", "", "limit", "LBi/k;", "galleryLauncher", "openImagePicker", "(ILBi/k;)V", "LCi/k;", "count", "withCount", "(LCi/k;I)LCi/k;", "Lru/ozon/app/android/uploadPhotos/viewmodel/UploadPhotosViewModel;", "viewModel", "bind", "(Lru/ozon/app/android/uploadPhotos/viewmodel/UploadPhotosViewModel;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Landroidx/recyclerview/widget/RecyclerView;", "Lkotlin/jvm/functions/Function1;", "Z", "Lru/ozon/app/android/uploadPhotos/viewmodel/UploadPhotosViewModel;", "Lru/ozon/app/android/uploadPhotos/adapter/UploadPhotosAdapter;", "uploadPhotosAdapter", "Lru/ozon/app/android/uploadPhotos/adapter/UploadPhotosAdapter;", "reviewGalleryConfig", "LCi/k;", "upload-photos_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UploadPhotosDelegate {
    private final boolean isSelect;

    @NotNull
    private final Function1<List<String>, Unit> onUpdatePhotos;

    @NotNull
    private final RecyclerView photosRecyclerView;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final k reviewGalleryConfig;

    @NotNull
    private final UploadPhotosAdapter uploadPhotosAdapter;
    private UploadPhotosViewModel viewModel;

    /* JADX WARN: Multi-variable type inference failed */
    public UploadPhotosDelegate(@NotNull ComposerReferences references, @NotNull RecyclerView photosRecyclerView, @NotNull Function1<? super List<String>, Unit> onUpdatePhotos, boolean z11, @NotNull RecyclerView.n photosDecoration) {
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(photosRecyclerView, "photosRecyclerView");
        Intrinsics.checkNotNullParameter(onUpdatePhotos, "onUpdatePhotos");
        Intrinsics.checkNotNullParameter(photosDecoration, "photosDecoration");
        this.references = references;
        this.photosRecyclerView = photosRecyclerView;
        this.onUpdatePhotos = onUpdatePhotos;
        this.isSelect = z11;
        UploadPhotosAdapter uploadPhotosAdapter = new UploadPhotosAdapter(new UploadPhotosDelegate$uploadPhotosAdapter$1(this), new UploadPhotosDelegate$uploadPhotosAdapter$2(this), new UploadPhotosDelegate$uploadPhotosAdapter$3(this), new UploadPhotosDelegate$uploadPhotosAdapter$4(this));
        this.uploadPhotosAdapter = uploadPhotosAdapter;
        k b11 = C2779a.b();
        this.reviewGalleryConfig = k.b(b11, z11 ? R.style.OzonGallerySelectTheme : R.style.OzonGalleryTheme, h.d.f11018a, b.a(b11.d(), new g(UploadPhotosDelegate$reviewGalleryConfig$1$1.INSTANCE, UploadPhotosDelegate$reviewGalleryConfig$1$2.INSTANCE, null, 10), null, 0, 2046), C2779a.a(), 242);
        photosRecyclerView.setItemAnimator(null);
        photosRecyclerView.setAdapter(uploadPhotosAdapter);
        photosRecyclerView.setLayoutManager(new LinearLayoutManager(photosRecyclerView.getContext(), 0, false));
        photosRecyclerView.addItemDecoration(photosDecoration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openImagePicker(int limit, Bi.k galleryLauncher) {
        if (galleryLauncher != null) {
            k withCount = withCount(this.reviewGalleryConfig, limit);
            UploadPhotosViewModel uploadPhotosViewModel = this.viewModel;
            if (uploadPhotosViewModel != null) {
                galleryLauncher.b(withCount, new UploadPhotosDelegate$openImagePicker$1(uploadPhotosViewModel));
            } else {
                Intrinsics.n("viewModel");
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showErrorRestriction(ComponentCallbacksC5392m componentCallbacksC5392m, J j11, String str) {
        ViewGroup rootView = ContextExtKt.getRootView(componentCallbacksC5392m);
        if (rootView == null) {
            return;
        }
        FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, OzonSpannableStringKt.toOzonSpannableString(str), null, null, null, j11, 58, null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showMessageRestriction(ComponentCallbacksC5392m componentCallbacksC5392m, J j11, String str) {
        ViewGroup rootView = ContextExtKt.getRootView(componentCallbacksC5392m);
        if (rootView == null) {
            return;
        }
        FlashbarFactory.create$default(FlashbarFactory.INSTANCE, rootView, null, OzonSpannableStringKt.toOzonSpannableString(str), null, null, null, null, null, null, null, null, null, null, null, null, null, j11, 65530, null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<AttachmentVO.AttachedImageVO> updateImageList(ViewState viewState) {
        ArrayList arrayList = new ArrayList();
        if (viewState.getIsShowAttachImagesButton()) {
            arrayList.add(UploadPhotosAdapter.INSTANCE.getADD_PHOTO_STUB());
        }
        arrayList.addAll(viewState.getAttachments());
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updatePhotosIfNeed(List<AttachmentVO.AttachedImageVO> photos) {
        List<String> list;
        if (photos != null && (!photos.isEmpty())) {
            List<AttachmentVO.AttachedImageVO> list2 = photos;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return;
            }
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (!Intrinsics.d(((AttachmentVO.AttachedImageVO) it.next()).getStatus(), AttachmentVO.Status.ONLY_SHOW.INSTANCE)) {
                }
            }
            return;
        }
        if (photos != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : photos) {
                if (Intrinsics.d(((AttachmentVO.AttachedImageVO) obj).getStatus(), AttachmentVO.Status.UPLOADED.INSTANCE)) {
                    arrayList.add(obj);
                }
            }
            list = new ArrayList<>();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String url = ((AttachmentVO.AttachedImageVO) it2.next()).getUrl();
                if (url != null) {
                    list.add(url);
                }
            }
        } else {
            list = null;
        }
        if (list == null) {
            list = K.f71697a;
        }
        this.onUpdatePhotos.invoke(list);
    }

    private final k withCount(k kVar, int i11) {
        return k.a(kVar, 0, null, b.a(kVar.d(), g.a(kVar.d().f(), null, null, i11 == 1 ? l.RESULT_API_ONLY : kVar.d().f().g(), 31), null, i11, 1918), null, null, 119);
    }

    public final void bind(@NotNull UploadPhotosViewModel viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.viewModel = viewModel;
        C4911f container = this.references.getContainer();
        viewModel.getShowMessageEvent().observe(container.g(), new UploadPhotosDelegate$sam$androidx_lifecycle_Observer$0(new UploadPhotosDelegate$bind$1$1(this, container)));
        viewModel.getShowErrorEvent().observe(container.g(), new UploadPhotosDelegate$sam$androidx_lifecycle_Observer$0(new UploadPhotosDelegate$bind$1$2(this, container)));
        viewModel.getOpenPickScreenEvent().observe(container.g(), new UploadPhotosDelegate$sam$androidx_lifecycle_Observer$0(new UploadPhotosDelegate$bind$1$3(this)));
        viewModel.getState().observe(container.g(), new UploadPhotosDelegate$sam$androidx_lifecycle_Observer$0(new UploadPhotosDelegate$bind$1$4(this)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ UploadPhotosDelegate(ComposerReferences composerReferences, RecyclerView recyclerView, Function1 function1, boolean z11, RecyclerView.n nVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(composerReferences, recyclerView, function1, z11, nVar);
        if ((i11 & 16) != 0) {
            Context context = recyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            nVar = new PhotosDecoration(context);
        }
    }
}

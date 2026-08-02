package ru.ozon.android.messenger.blocks.messageimage.presentation;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.core.view.Y;
import com.github.chrisbanes.photoview.PhotoView;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.utils.n;
import ru.ozon.android.messenger.utils.view.m;
import ru.ozon.android.messenger.utils.view.s;
import ru.ozon.app.android.messenger.R$attr;
import ru.ozon.app.android.messenger.databinding.MFragmentGalleryImageBinding;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt$loadAsBitmapInscribedSize$1;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt$loadAsBitmapInscribedSize$2;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.loadPriority.LoadPriority;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.pikazon.processors.InscribedUrlProcessor;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lru/ozon/android/messenger/blocks/messageimage/presentation/a;", "Lru/ozon/android/messenger/framework/presentation/common/screen/i;", "Lru/ozon/app/android/messenger/databinding/MFragmentGalleryImageBinding;", "<init>", "()V", "b", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a extends ru.ozon.android.messenger.framework.presentation.common.screen.i<MFragmentGalleryImageBinding> {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public static final b f85751e = new b();

    /* renamed from: c, reason: collision with root package name */
    public ru.ozon.android.messenger.framework.core.initialization.d f85752c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Object f85753d;

    /* renamed from: ru.ozon.android.messenger.blocks.messageimage.presentation.a$a, reason: collision with other inner class name */
    /* synthetic */ class C1510a extends C7735q implements InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MFragmentGalleryImageBinding> {

        /* renamed from: a, reason: collision with root package name */
        public static final C1510a f85754a = new C1510a(3, MFragmentGalleryImageBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lru/ozon/app/android/messenger/databinding/MFragmentGalleryImageBinding;", 0);

        @Override // fd.InterfaceC6511n
        public final MFragmentGalleryImageBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p02 = layoutInflater;
            boolean booleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p02, "p0");
            return MFragmentGalleryImageBinding.inflate(p02, viewGroup, booleanValue);
        }
    }

    public static final class b {
    }

    static final class c extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f85756c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(0);
            this.f85756c = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            a.this.C(this.f85756c);
            return Unit.f71690a;
        }
    }

    static final class d extends AbstractC7737t implements Function1<Bitmap, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ PhotoView f85758c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ImageSize f85759d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(PhotoView photoView, ImageSize imageSize) {
            super(1);
            this.f85758c = photoView;
            this.f85759d = imageSize;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            Intrinsics.checkNotNullParameter(bitmap2, "bitmap");
            a aVar = a.this;
            if (aVar.getView() != null) {
                int width = bitmap2.getWidth();
                int height = bitmap2.getHeight();
                PhotoView photoView = this.f85758c;
                if (width > photoView.getWidth() || height > photoView.getHeight() - photoView.getPaddingTop()) {
                    photoView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                }
                if (this.f85759d == null) {
                    int width2 = photoView.getWidth();
                    int height2 = photoView.getHeight() - photoView.getPaddingTop();
                    if (bitmap2.getWidth() < width2 || bitmap2.getHeight() < height2) {
                        ImageSize a11 = ru.ozon.android.messenger.utils.image.e.a(new ImageSize(ru.ozon.android.messenger.utils.h.c(bitmap2.getWidth()), ru.ozon.android.messenger.utils.h.c(bitmap2.getHeight())), width2, height2);
                        bitmap2 = Bitmap.createScaledBitmap(bitmap2, a11.getWidth(), a11.getHeight(), false);
                        Intrinsics.f(bitmap2);
                    }
                }
                photoView.setImageBitmap(bitmap2);
                ProgressBar galleryImageLoaderPB = a.v(aVar).galleryImageLoaderPB;
                Intrinsics.checkNotNullExpressionValue(galleryImageLoaderPB, "galleryImageLoaderPB");
                s.a(galleryImageLoaderPB);
            }
            return Unit.f71690a;
        }
    }

    static final class e extends AbstractC7737t implements Function1<MFragmentGalleryImageBinding, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f85760b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str) {
            super(1);
            this.f85760b = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MFragmentGalleryImageBinding mFragmentGalleryImageBinding) {
            MFragmentGalleryImageBinding withSafeBinding = mFragmentGalleryImageBinding;
            Intrinsics.checkNotNullParameter(withSafeBinding, "$this$withSafeBinding");
            Lm0.a.f17149a.w("Failed to load image " + this.f85760b, new Object[0]);
            ProgressBar galleryImageLoaderPB = withSafeBinding.galleryImageLoaderPB;
            Intrinsics.checkNotNullExpressionValue(galleryImageLoaderPB, "galleryImageLoaderPB");
            s.a(galleryImageLoaderPB);
            ImageView failureIv = withSafeBinding.failureIv;
            Intrinsics.checkNotNullExpressionValue(failureIv, "failureIv");
            s.d(failureIv);
            return Unit.f71690a;
        }
    }

    public static final class f implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.blocks.messageimage.c f85762b;

        public f(ru.ozon.android.messenger.blocks.messageimage.c cVar) {
            this.f85762b = cVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.removeOnLayoutChangeListener(this);
            a.this.B(this.f85762b);
        }
    }

    static final class g extends AbstractC7737t implements Function0<m> {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final m invoke() {
            Window window = a.this.requireActivity().getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
            return new m(window);
        }
    }

    public a() {
        super(C1510a.f85754a);
        this.f85753d = ru.ozon.android.messenger.utils.f.b(new g());
    }

    private final void A(PhotoView photoView, String str, ImageSize imageSize) {
        Context context = getBinding().getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        z().getNetworkConfig().getClass();
        ContextExtKt.loadAsBitmapInscribedSize(context, n.b(str, "", z().getNetworkConfig().c()), (r14 & 2) != 0 ? K.f71697a : null, (r14 & 4) != 0 ? null : imageSize, (r14 & 8) != 0 ? LoadPriority.NORMAL : null, (r14 & 16) != 0 ? InscribedUrlProcessor.InscribedNormal.INSTANCE : null, (r14 & 32) != 0 ? ContextExtKt$loadAsBitmapInscribedSize$1.INSTANCE : new c(str), (r14 & 64) != 0 ? ContextExtKt$loadAsBitmapInscribedSize$2.INSTANCE : new d(photoView, imageSize));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(ru.ozon.android.messenger.blocks.messageimage.c cVar) {
        ImageView failureIv = getBinding().failureIv;
        Intrinsics.checkNotNullExpressionValue(failureIv, "failureIv");
        s.a(failureIv);
        ProgressBar galleryImageLoaderPB = getBinding().galleryImageLoaderPB;
        Intrinsics.checkNotNullExpressionValue(galleryImageLoaderPB, "galleryImageLoaderPB");
        s.d(galleryImageLoaderPB);
        ImageSize imageSize = (cVar.getWidth() == null || cVar.getHeight() == null) ? null : (cVar.getWidth().intValue() >= getBinding().galleryMainPV.getWidth() || cVar.getHeight().intValue() >= getBinding().galleryMainPV.getHeight()) ? new ImageSize(cVar.getWidth().intValue(), cVar.getHeight().intValue()) : new ImageSize(ru.ozon.android.messenger.utils.h.c(cVar.getWidth().intValue()), ru.ozon.android.messenger.utils.h.c(cVar.getHeight().intValue()));
        PhotoView photoView = getBinding().galleryMainPV;
        if (!cVar.f()) {
            Intrinsics.f(photoView);
            String c11 = cVar.c();
            if (c11 == null) {
                c11 = cVar.e();
            }
            A(photoView, c11, imageSize);
            return;
        }
        Intrinsics.f(photoView);
        String c12 = cVar.c();
        if (c12 == null) {
            c12 = cVar.e();
        }
        z().getNetworkConfig().getClass();
        ImageViewExtKt.load$default(photoView, n.b(c12, "", z().getNetworkConfig().c()), null, ru.ozon.android.messenger.utils.image.e.b(new ru.ozon.android.messenger.blocks.messageimage.presentation.c(photoView, this), new ru.ozon.android.messenger.blocks.messageimage.presentation.d(this, c12)), null, imageSize, false, null, 106, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(String str) {
        t(new e(str));
    }

    public static void u(a aVar, ru.ozon.android.messenger.blocks.messageimage.c cVar) {
        aVar.B(cVar);
    }

    public static final /* synthetic */ MFragmentGalleryImageBinding v(a aVar) {
        return aVar.getBinding();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        ru.ozon.android.messenger.utils.g.d(this).i(this);
        super.onCreate(bundle);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onResume() {
        super.onResume();
        m mVar = (m) this.f85753d.getValue();
        Context context = getBinding().getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        mVar.a(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        ru.ozon.android.messenger.blocks.messageimage.c cVar = (ru.ozon.android.messenger.blocks.messageimage.c) requireArguments().getParcelable("ARG_IMAGE_VO");
        if (cVar == null) {
            throw new IllegalStateException("Cannot get argument ARG_IMAGE_VO");
        }
        getBinding().getConstraintLayout().setFitsSystemWindows(!z().getEnabledInsets());
        MFragmentGalleryImageBinding binding = getBinding();
        binding.galleryBackIv.setOnClickListener(new Il.a(this, 17));
        binding.galleryMainPV.i(7.0f);
        PhotoView galleryMainPV = binding.galleryMainPV;
        Intrinsics.checkNotNullExpressionValue(galleryMainPV, "galleryMainPV");
        int i11 = Y.f42258g;
        if (!galleryMainPV.isLaidOut() || galleryMainPV.isLayoutRequested()) {
            galleryMainPV.addOnLayoutChangeListener(new f(cVar));
        } else {
            B(cVar);
        }
        binding.failureIv.setOnClickListener(new XT.a(6, this, cVar));
    }

    @NotNull
    public final ru.ozon.android.messenger.framework.core.initialization.d z() {
        ru.ozon.android.messenger.framework.core.initialization.d dVar = this.f85752c;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.n("messengerConfig");
        throw null;
    }
}

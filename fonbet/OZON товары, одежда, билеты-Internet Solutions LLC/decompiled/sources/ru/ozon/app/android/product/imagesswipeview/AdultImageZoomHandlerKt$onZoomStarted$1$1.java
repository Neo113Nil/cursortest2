package ru.ozon.app.android.product.imagesswipeview;

import Sc.s;
import Wc.a;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.product.utils.PinchToZoomTouchListener;
import xe.C10720e0;
import xe.C10727i;
import xe.L0;
import xe.M;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/graphics/Bitmap;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class AdultImageZoomHandlerKt$onZoomStarted$1$1 extends AbstractC7737t implements Function1<Bitmap, Unit> {
    final /* synthetic */ AdultImageView $this_apply;
    final /* synthetic */ ImageView $zoomableImageView;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.product.imagesswipeview.AdultImageZoomHandlerKt$onZoomStarted$1$1$1", f = "AdultImageZoomHandler.kt", l = {DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.product.imagesswipeview.AdultImageZoomHandlerKt$onZoomStarted$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ AdultImageView $this_apply;
        final /* synthetic */ ImageView $zoomableImageView;
        int label;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
        @e(c = "ru.ozon.app.android.product.imagesswipeview.AdultImageZoomHandlerKt$onZoomStarted$1$1$1$1", f = "AdultImageZoomHandler.kt", l = {}, m = "invokeSuspend")
        /* renamed from: ru.ozon.app.android.product.imagesswipeview.AdultImageZoomHandlerKt$onZoomStarted$1$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C18331 extends j implements Function2<M, d<? super Unit>, Object> {
            final /* synthetic */ Bitmap $bitmap;
            final /* synthetic */ ImageView $zoomableImageView;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18331(ImageView imageView, Bitmap bitmap, d<? super C18331> dVar) {
                super(2, dVar);
                this.$zoomableImageView = imageView;
                this.$bitmap = bitmap;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return new C18331(this.$zoomableImageView, this.$bitmap, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                this.$zoomableImageView.setImageBitmap(this.$bitmap);
                return Unit.f71690a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, d<? super Unit> dVar) {
                return ((C18331) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AdultImageView adultImageView, ImageView imageView, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$this_apply = adultImageView;
            this.$zoomableImageView = imageView;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$this_apply, this.$zoomableImageView, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                Bitmap bitmapFrom = PinchToZoomTouchListener.INSTANCE.getBitmapFrom(this.$this_apply);
                C10720e0 c10720e0 = C10720e0.f105451a;
                L0 l02 = De.s.f6650a;
                C18331 c18331 = new C18331(this.$zoomableImageView, bitmapFrom, null);
                this.label = 1;
                if (C10727i.f(l02, c18331, this) == aVar) {
                    return aVar;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdultImageZoomHandlerKt$onZoomStarted$1$1(AdultImageView adultImageView, ImageView imageView) {
        super(1);
        this.$this_apply = adultImageView;
        this.$zoomableImageView = imageView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
        invoke2(bitmap);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Bitmap it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$this_apply.setImage$product_prodGoogleAllVendorsRelease(it);
        ImageView imageView = this.$zoomableImageView;
        AdultImageZoomHandlerKt.onBackground(imageView, new AnonymousClass1(this.$this_apply, imageView, null));
    }
}

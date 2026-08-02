package ru.ozon.app.android.pikazon.util;

import Ej.b;
import Sc.s;
import T5.g;
import T5.m;
import Wc.a;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l6.AbstractC7878a;
import l6.i;
import ru.ozon.app.android.pikazon.Pikazon;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.glide.request.GlideRequestExtKt;
import ru.ozon.app.android.pikazon.glide.request.ImageLoaderKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.pikazon.glide.transformations.factory.ImageTransformationsFactory;
import ru.ozon.app.android.pikazon.glide.transformations.internal.MaxSizeTransformation;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

/* JADX INFO: Add missing generic type declarations: [Resource] */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"Resource", "Lxe/M;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pikazon.util.TestUtilKt$loadTestResource$1", f = "TestUtil.kt", l = {49}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class TestUtilKt$loadTestResource$1<Resource> extends j implements Function2<M, d<? super Resource>, Object> {
    final /* synthetic */ PikazonLoaderCallback<Resource> $callback;
    final /* synthetic */ Context $context;
    final /* synthetic */ Class<Resource> $resourceType;
    final /* synthetic */ int $testImage;
    final /* synthetic */ List<ImageTransformation> $transformations;
    int label;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"Resource", "Lxe/M;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.pikazon.util.TestUtilKt$loadTestResource$1$1", f = "TestUtil.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.pikazon.util.TestUtilKt$loadTestResource$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Resource>, Object> {
        final /* synthetic */ PikazonLoaderCallback<Resource> $callback;
        final /* synthetic */ Context $context;
        final /* synthetic */ Class<Resource> $resourceType;
        final /* synthetic */ int $testImage;
        final /* synthetic */ List<ImageTransformation> $transformations;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(List<? extends ImageTransformation> list, Context context, int i11, Class<Resource> cls, PikazonLoaderCallback<Resource> pikazonLoaderCallback, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$transformations = list;
            this.$context = context;
            this.$testImage = i11;
            this.$resourceType = cls;
            this.$callback = pikazonLoaderCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$transformations, this.$context, this.$testImage, this.$resourceType, this.$callback, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            ImageTransformationsFactory<m<Bitmap>> imageTransformationsFactory$lib_release = Pikazon.INSTANCE.getInstance().getImageTransformationsFactory$lib_release();
            List<ImageTransformation> list = this.$transformations;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(imageTransformationsFactory$lib_release.create((ImageTransformation) it.next()));
            }
            g gVar = new g(C7714v.q0(new MaxSizeTransformation(), arrayList));
            Drawable drawable = androidx.core.content.a.getDrawable(this.$context, this.$testImage);
            int i11 = this.$testImage;
            if (drawable == null) {
                throw new IllegalArgumentException(b.a(i11, "Не получилось найти тестовое изображение с id: ").toString());
            }
            com.bumptech.glide.m apply = ImageLoaderKt.createRequest(this.$context, this.$resourceType).load(androidx.core.graphics.drawable.b.b(drawable, 0, 0, 7)).apply((AbstractC7878a<?>) i.bitmapTransform(gVar));
            Intrinsics.checkNotNullExpressionValue(apply, "apply(...)");
            return GlideRequestExtKt.addCallback$default(apply, this.$callback, null, null, 6, null).submit().get();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Resource> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TestUtilKt$loadTestResource$1(List<? extends ImageTransformation> list, Context context, int i11, Class<Resource> cls, PikazonLoaderCallback<Resource> pikazonLoaderCallback, d<? super TestUtilKt$loadTestResource$1> dVar) {
        super(2, dVar);
        this.$transformations = list;
        this.$context = context;
        this.$testImage = i11;
        this.$resourceType = cls;
        this.$callback = pikazonLoaderCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TestUtilKt$loadTestResource$1(this.$transformations, this.$context, this.$testImage, this.$resourceType, this.$callback, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        C10720e0 c10720e0 = C10720e0.f105451a;
        He.b bVar = He.b.f10879b;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$transformations, this.$context, this.$testImage, this.$resourceType, this.$callback, null);
        this.label = 1;
        Object f7 = C10727i.f(bVar, anonymousClass1, this);
        return f7 == aVar ? aVar : f7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Resource> dVar) {
        return ((TestUtilKt$loadTestResource$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

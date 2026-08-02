package ru.ozon.app.android.courieronmap.presentation.provider;

import Sc.s;
import Wc.a;
import android.graphics.Bitmap;
import android.view.View;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import xe.C10720e0;
import xe.C10727i;
import xe.L0;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.courieronmap.presentation.provider.BitmapProcessor$shadeBitmap$1", f = "BitmapProcessor.kt", l = {DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class BitmapProcessor$shadeBitmap$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Function1<Bitmap, Unit> $onResult;
    final /* synthetic */ View $view;
    int label;
    final /* synthetic */ BitmapProcessor this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.courieronmap.presentation.provider.BitmapProcessor$shadeBitmap$1$1", f = "BitmapProcessor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.courieronmap.presentation.provider.BitmapProcessor$shadeBitmap$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ Function1<Bitmap, Unit> $onResult;
        final /* synthetic */ Bitmap $shadowedBitmap;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function1<? super Bitmap, Unit> function1, Bitmap bitmap, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$onResult = function1;
            this.$shadowedBitmap = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$onResult, this.$shadowedBitmap, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            this.$onResult.invoke(this.$shadowedBitmap);
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BitmapProcessor$shadeBitmap$1(BitmapProcessor bitmapProcessor, View view, Function1<? super Bitmap, Unit> function1, d<? super BitmapProcessor$shadeBitmap$1> dVar) {
        super(2, dVar);
        this.this$0 = bitmapProcessor;
        this.$view = view;
        this.$onResult = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new BitmapProcessor$shadeBitmap$1(this.this$0, this.$view, this.$onResult, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Bitmap createBitmapWithShadow;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            createBitmapWithShadow = this.this$0.createBitmapWithShadow(this.$view);
            C10720e0 c10720e0 = C10720e0.f105451a;
            L0 l02 = De.s.f6650a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onResult, createBitmapWithShadow, null);
            this.label = 1;
            if (C10727i.f(l02, anonymousClass1, this) == aVar) {
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
        return ((BitmapProcessor$shadeBitmap$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

package ru.ozon.app.android.account.orders.commonBarcode.presentation.rounded;

import Sc.s;
import Wc.a;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.account.orders.commonBarcode.presentation.rounded.CommonBarcodeViewHolder$setBarcode$1", f = "CommonBarcodeViewHolder.kt", l = {70, 71}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class CommonBarcodeViewHolder$setBarcode$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $code;
    int label;
    final /* synthetic */ CommonBarcodeViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonBarcodeViewHolder$setBarcode$1(CommonBarcodeViewHolder commonBarcodeViewHolder, String str, d<? super CommonBarcodeViewHolder$setBarcode$1> dVar) {
        super(2, dVar);
        this.this$0 = commonBarcodeViewHolder;
        this.$code = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CommonBarcodeViewHolder$setBarcode$1(this.this$0, this.$code, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r5 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        if (r5 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object bindBarcode;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            CommonBarcodeViewHolder commonBarcodeViewHolder = this.this$0;
            String str = this.$code;
            this.label = 1;
            obj = commonBarcodeViewHolder.createBarcodeDrawable(str, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
        }
        CommonBarcodeViewHolder commonBarcodeViewHolder2 = this.this$0;
        this.label = 2;
        bindBarcode = commonBarcodeViewHolder2.bindBarcode((Drawable) obj, this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CommonBarcodeViewHolder$setBarcode$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

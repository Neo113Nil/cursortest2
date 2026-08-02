package ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.presentation.viewmodel;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.cml.delivery.R$plurals;
import ru.ozon.app.android.uikit.text.StringProvider;
import xe.M;
import ze.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.presentation.viewmodel.ParcelPhotoAddViewModel$attachPhoto$1$1", f = "ParcelPhotoAddViewModel.kt", l = {111, 113}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class ParcelPhotoAddViewModel$attachPhoto$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ int $count;
    final /* synthetic */ int $limit;
    int label;
    final /* synthetic */ ParcelPhotoAddViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ParcelPhotoAddViewModel$attachPhoto$1$1(int i11, int i12, ParcelPhotoAddViewModel parcelPhotoAddViewModel, d<? super ParcelPhotoAddViewModel$attachPhoto$1$1> dVar) {
        super(2, dVar);
        this.$count = i11;
        this.$limit = i12;
        this.this$0 = parcelPhotoAddViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ParcelPhotoAddViewModel$attachPhoto$1$1(this.$count, this.$limit, this.this$0, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r7.n(r2, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0064, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        if (r7.n(r1, r6) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        h hVar;
        int i11;
        int i12;
        h hVar2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i13 = this.label;
        if (i13 == 0) {
            s.b(obj);
            if (this.$count < this.$limit) {
                hVar2 = this.this$0._openPickScreen;
                Integer num = new Integer(this.$limit - this.$count);
                this.label = 1;
            } else {
                hVar = this.this$0._errors;
                int i14 = R$plurals.delivery_parcel_photo_limit_message;
                i11 = this.this$0.pickPhotosLimit;
                i12 = this.this$0.pickPhotosLimit;
                String quantityString = StringProvider.getQuantityString(i14, i11, new Integer(i12));
                this.label = 2;
            }
        } else {
            if (i13 != 1 && i13 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ParcelPhotoAddViewModel$attachPhoto$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

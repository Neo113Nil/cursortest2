package bo.app;

import android.graphics.Bitmap;
import android.widget.ImageView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class p4 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ImageView f25901a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bitmap f25902b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(ImageView imageView, Bitmap bitmap, Continuation continuation) {
        super(2, continuation);
        this.f25901a = imageView;
        this.f25902b = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new p4(this.f25901a, this.f25902b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new p4(this.f25901a, this.f25902b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f25901a.setImageBitmap(this.f25902b);
        return Unit.INSTANCE;
    }
}

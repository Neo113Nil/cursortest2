package retrofit2.adapter.rxjava2;

import io.reactivex.EnumC7093a;
import io.reactivex.p;
import io.reactivex.x;
import java.lang.reflect.Type;
import retrofit2.Call;
import retrofit2.CallAdapter;

/* loaded from: classes6.dex */
final class RxJava2CallAdapter<R> implements CallAdapter<R, Object> {
    private final boolean isAsync;
    private final boolean isBody;
    private final boolean isCompletable;
    private final boolean isFlowable;
    private final boolean isMaybe;
    private final boolean isResult;
    private final boolean isSingle;
    private final Type responseType;
    private final x scheduler;

    RxJava2CallAdapter(Type type, x xVar, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        this.responseType = type;
        this.scheduler = xVar;
        this.isAsync = z11;
        this.isResult = z12;
        this.isBody = z13;
        this.isFlowable = z14;
        this.isSingle = z15;
        this.isMaybe = z16;
        this.isCompletable = z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    @Override // retrofit2.CallAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object adapt(Call<R> call) {
        p bodyObservable;
        x xVar;
        p callEnqueueObservable = this.isAsync ? new CallEnqueueObservable(call) : new CallExecuteObservable(call);
        if (!this.isResult) {
            if (this.isBody) {
                bodyObservable = new BodyObservable(callEnqueueObservable);
            }
            xVar = this.scheduler;
            if (xVar != null) {
                callEnqueueObservable = callEnqueueObservable.subscribeOn(xVar);
            }
            return !this.isFlowable ? callEnqueueObservable.toFlowable(EnumC7093a.LATEST) : this.isSingle ? callEnqueueObservable.singleOrError() : this.isMaybe ? callEnqueueObservable.singleElement() : this.isCompletable ? callEnqueueObservable.ignoreElements() : callEnqueueObservable;
        }
        bodyObservable = new ResultObservable(callEnqueueObservable);
        callEnqueueObservable = bodyObservable;
        xVar = this.scheduler;
        if (xVar != null) {
        }
        if (!this.isFlowable) {
        }
    }

    @Override // retrofit2.CallAdapter
    public Type responseType() {
        return this.responseType;
    }
}

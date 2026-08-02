package ru.ozon.app.android.ugc.core.widgets.singlereview.translateButton.presentation;

import Ae.w0;
import Sc.r;
import Sc.s;
import Wc.a;
import com.google.protobuf.DescriptorProtos$FileOptions;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.network.networkhandler.ConnectionHandler;
import ru.ozon.app.android.ugc.core.widgets.singlereview.translateButton.data.TranslateReviewResponse;
import ru.ozon.app.android.ugc.core.widgets.singlereview.translateButton.presentation.TranslateViewModel;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.core.widgets.singlereview.translateButton.presentation.TranslateViewModel$translate$1", f = "TranslateViewModel.kt", l = {DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER, 40, 78, 50, 52}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TranslateViewModel$translate$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ long $itemId;
    final /* synthetic */ String $link;
    final /* synthetic */ Map<String, String> $params;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TranslateViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TranslateViewModel$translate$1(TranslateViewModel translateViewModel, long j11, Map<String, String> map, String str, d<? super TranslateViewModel$translate$1> dVar) {
        super(2, dVar);
        this.this$0 = translateViewModel;
        this.$itemId = j11;
        this.$params = map;
        this.$link = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        TranslateViewModel$translate$1 translateViewModel$translate$1 = new TranslateViewModel$translate$1(this.this$0, this.$itemId, this.$params, this.$link, dVar);
        translateViewModel$translate$1.L$0 = obj;
        return translateViewModel$translate$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0128, code lost:
    
        if (r15.emit(r3, r14) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00fc, code lost:
    
        if (r15 == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0070, code lost:
    
        if (r15.emit(r0, r14) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0097, code lost:
    
        if (r0.emit(r8, r14) == r1) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e4  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a11;
        Throwable b11;
        Object obj2;
        Object handleSuccess;
        w0 w0Var;
        ConnectionHandler connectionHandler;
        w0 w0Var2;
        w0 w0Var3;
        ActionV2Repository actionV2Repository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
        } catch (Throwable th2) {
            r.Companion companion = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (i11 == 0) {
            s.b(obj);
            M m11 = (M) this.L$0;
            connectionHandler = this.this$0.connectionHandler;
            if (connectionHandler.hasInternetConnection()) {
                w0Var2 = this.this$0._translateStates;
                Map i12 = U.i(new Pair(new Long(this.$itemId), TranslateViewModel.TranslateState.Loading.INSTANCE));
                this.L$0 = m11;
                this.label = 2;
            } else {
                w0Var3 = this.this$0._translateStates;
                Map i13 = U.i(new Pair(new Long(this.$itemId), TranslateViewModel.TranslateState.NetworkError.INSTANCE));
                this.label = 1;
            }
            return aVar;
        }
        if (i11 == 1) {
            s.b(obj);
            return Unit.f71690a;
        }
        if (i11 == 2) {
            s.b(obj);
            TranslateViewModel translateViewModel = this.this$0;
            Map<String, String> map = this.$params;
            String str = this.$link;
            r.Companion companion2 = r.INSTANCE;
            actionV2Repository = translateViewModel.actionV2Repository;
            ActionV2Request actionV2Request = new ActionV2Request(map, str, false, 4, null);
            this.L$0 = null;
            this.label = 3;
            obj = actionV2Repository.callActionSuspend(actionV2Request, TranslateReviewResponse.class, this);
            if (obj == aVar) {
                return aVar;
            }
            a11 = (TranslateReviewResponse) ((ActionV2Response) obj).getData();
            r.Companion companion3 = r.INSTANCE;
            b11 = r.b(a11);
            if (b11 != null) {
            }
            obj2 = a11;
            TranslateViewModel translateViewModel2 = this.this$0;
            long j11 = this.$itemId;
            if (!(obj2 instanceof r.b)) {
            }
            TranslateViewModel translateViewModel3 = this.this$0;
            long j12 = this.$itemId;
            if (r.b(obj2) != null) {
            }
            return Unit.f71690a;
        }
        if (i11 != 3) {
            if (i11 != 4) {
                if (i11 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            obj2 = this.L$0;
            s.b(obj);
            TranslateViewModel translateViewModel32 = this.this$0;
            long j122 = this.$itemId;
            if (r.b(obj2) != null) {
                w0Var = translateViewModel32._translateStates;
                Map i14 = U.i(new Pair(new Long(j122), new TranslateViewModel.TranslateState.Error(null, 1, null)));
                this.L$0 = obj2;
                this.label = 5;
            }
            return Unit.f71690a;
        }
        s.b(obj);
        a11 = (TranslateReviewResponse) ((ActionV2Response) obj).getData();
        r.Companion companion32 = r.INSTANCE;
        b11 = r.b(a11);
        if (b11 != null) {
            a11 = s.a(b11);
        } else if (a11 == null) {
            a11 = s.a(new IllegalStateException("Result value is null"));
        }
        obj2 = a11;
        TranslateViewModel translateViewModel22 = this.this$0;
        long j112 = this.$itemId;
        if (!(obj2 instanceof r.b)) {
            this.L$0 = obj2;
            this.label = 4;
            handleSuccess = translateViewModel22.handleSuccess((TranslateReviewResponse) obj2, j112, this);
        }
        TranslateViewModel translateViewModel322 = this.this$0;
        long j1222 = this.$itemId;
        if (r.b(obj2) != null) {
        }
        return Unit.f71690a;
        r.Companion companion4 = r.INSTANCE;
        a11 = s.a(th2);
        b11 = r.b(a11);
        if (b11 != null) {
        }
        obj2 = a11;
        TranslateViewModel translateViewModel222 = this.this$0;
        long j1122 = this.$itemId;
        if (!(obj2 instanceof r.b)) {
        }
        TranslateViewModel translateViewModel3222 = this.this$0;
        long j12222 = this.$itemId;
        if (r.b(obj2) != null) {
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((TranslateViewModel$translate$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

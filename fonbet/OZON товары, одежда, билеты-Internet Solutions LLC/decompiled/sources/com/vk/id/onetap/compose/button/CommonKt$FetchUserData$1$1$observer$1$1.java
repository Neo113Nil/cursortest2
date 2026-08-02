package com.vk.id.onetap.compose.button;

import Sc.r;
import Sc.s;
import com.vk.id.VKID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "com.vk.id.onetap.compose.button.CommonKt$FetchUserData$1$1$observer$1$1", f = "Common.kt", l = {90, 91, 92}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class CommonKt$FetchUserData$1$1$observer$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ OnFetchingProgress $onFetchingProgress;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonKt$FetchUserData$1$1$observer$1$1(OnFetchingProgress onFetchingProgress, d<? super CommonKt$FetchUserData$1$1$observer$1$1> dVar) {
        super(2, dVar);
        this.$onFetchingProgress = onFetchingProgress;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CommonKt$FetchUserData$1$1$observer$1$1(this.$onFetchingProgress, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if (r1.onFetched((com.vk.id.VKIDUser) r6, r5) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        if (r6 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0034, code lost:
    
        if (r6.onPreFetch(r5) == r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object m45fetchUserDataIoAF18A;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            OnFetchingProgress onFetchingProgress = this.$onFetchingProgress;
            this.label = 1;
        } else if (i11 == 1) {
            s.b(obj);
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
            m45fetchUserDataIoAF18A = ((r) obj).getF26106a();
            r.Companion companion = r.INSTANCE;
            if (m45fetchUserDataIoAF18A instanceof r.b) {
                m45fetchUserDataIoAF18A = null;
            }
            OnFetchingProgress onFetchingProgress2 = this.$onFetchingProgress;
            this.label = 3;
        }
        VKID companion2 = VKID.INSTANCE.getInstance();
        this.label = 2;
        m45fetchUserDataIoAF18A = companion2.m45fetchUserDataIoAF18A(this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CommonKt$FetchUserData$1$1$observer$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

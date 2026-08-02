package Re;

import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.utils.Q;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import me.C5582a;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Qe.a f10221a;

    public static final class a extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f10222n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f10223o;

        /* renamed from: q, reason: collision with root package name */
        public int f10225q;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10223o = obj;
            this.f10225q |= Integer.MIN_VALUE;
            return m.this.a(null, null, null, null, false, false, null, null, null, null, null, null, this);
        }
    }

    public m(Qe.a conversationsRepository) {
        Intrinsics.checkNotNullParameter(conversationsRepository, "conversationsRepository");
        this.f10221a = conversationsRepository;
    }

    public static /* synthetic */ Object b(m mVar, String str, String str2, String str3, Pe.a aVar, boolean z10, boolean z11, String str4, String str5, String str6, Message message, Bg.a aVar2, Function0 function0, Continuation continuation, int i10, Object obj) {
        Function0 function02;
        m mVar2;
        String str7;
        String str8;
        String str9;
        boolean z12;
        boolean z13;
        String str10;
        String str11;
        String str12;
        Continuation continuation2;
        Pe.a aVar3 = (i10 & 8) != 0 ? Pe.a.Chat : aVar;
        Message message2 = (i10 & 512) != 0 ? null : message;
        Bg.a aVar4 = (i10 & 1024) != 0 ? null : aVar2;
        if ((i10 & 2048) != 0) {
            function02 = null;
            str7 = str;
            str8 = str2;
            str9 = str3;
            z12 = z10;
            z13 = z11;
            str10 = str4;
            str11 = str5;
            str12 = str6;
            continuation2 = continuation;
            mVar2 = mVar;
        } else {
            function02 = function0;
            mVar2 = mVar;
            str7 = str;
            str8 = str2;
            str9 = str3;
            z12 = z10;
            z13 = z11;
            str10 = str4;
            str11 = str5;
            str12 = str6;
            continuation2 = continuation;
        }
        return mVar2.a(str7, str8, str9, aVar3, z12, z13, str10, str11, str12, message2, aVar4, function02, continuation2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, Pe.a aVar, boolean z10, boolean z11, String str4, String str5, String str6, Message message, Bg.a aVar2, Function0 function0, Continuation continuation) {
        a aVar3;
        int i10;
        Pe.a aVar4;
        C5582a c5582a;
        if (continuation instanceof a) {
            aVar3 = (a) continuation;
            int i11 = aVar3.f10225q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar3.f10225q = i11 - Integer.MIN_VALUE;
                Object obj = aVar3.f10223o;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = aVar3.f10225q;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Qe.a aVar5 = this.f10221a;
                    aVar3.f10222n = aVar;
                    aVar3.f10225q = 1;
                    Object g10 = aVar5.g(str, str2, str3, aVar, z10, z11, str6, str4, str5, message, aVar2, function0, aVar3);
                    if (g10 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = g10;
                    aVar4 = aVar;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar4 = (Pe.a) aVar3.f10222n;
                    ResultKt.throwOnFailure(obj);
                }
                c5582a = (C5582a) obj;
                if (c5582a.d()) {
                    if (aVar4 == Pe.a.Audio) {
                        if (Q.f44447F.f44469d) {
                            Td.e.R0(Vd.a.AudioOutgoingUIShown, null, null, 6, null);
                            Q.f44447F.f44469d = false;
                        }
                        if (Q.f44447F.f44470e) {
                            Td.e.R0(Vd.a.AudioOutgoingUICleared, null, null, 6, null);
                            Q.f44447F.f44470e = false;
                        }
                    }
                }
                if (!c5582a.d()) {
                    Intrinsics.checkNotNull(c5582a.c(), "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult.Error");
                    if (aVar4 == Pe.a.Audio) {
                        Q q10 = Q.f44447F;
                        q10.f44468c = false;
                        q10.f44469d = false;
                        q10.f44470e = false;
                    }
                }
                return c5582a;
            }
        }
        aVar3 = new a(continuation);
        Object obj2 = aVar3.f10223o;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = aVar3.f10225q;
        if (i10 != 0) {
        }
        c5582a = (C5582a) obj2;
        if (c5582a.d()) {
        }
        if (!c5582a.d()) {
        }
        return c5582a;
    }
}

package cd0;

import Sc.s;
import androidx.lifecycle.C5418g0;
import com.vk.id.AccessToken;
import com.vk.id.VKIDAuthFail;
import com.vk.id.auth.AuthCodeData;
import com.vk.id.auth.VKIDAuthCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xe.C10727i;
import xe.M;

/* renamed from: cd0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5807b implements VKIDAuthCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C5806a f56940a;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.pageSocialAdditional.presentation.AuthViewModel$authVkIDCallback$2$1$onAuthCode$1", f = "AuthViewModel.kt", l = {91}, m = "invokeSuspend")
    /* renamed from: cd0.b$a */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f56941d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C5806a f56942e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AuthCodeData f56943f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C5806a c5806a, AuthCodeData authCodeData, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f56942e = c5806a;
            this.f56943f = authCodeData;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f56942e, this.f56943f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object y02;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f56941d;
            if (i11 == 0) {
                s.b(obj);
                C5806a c5806a = this.f56942e;
                C5418g0 c5418g0 = c5806a.f56910a;
                this.f56941d = 1;
                y02 = c5806a.y0(c5418g0, this.f56943f, this);
                if (y02 == aVar) {
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
    }

    C5807b(C5806a c5806a) {
        this.f56940a = c5806a;
    }

    @Override // com.vk.id.auth.VKIDAuthCallback
    public final void onAuth(AccessToken accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
    }

    @Override // com.vk.id.auth.VKIDAuthCallback
    public final void onAuthCode(AuthCodeData data, boolean z11) {
        M m11;
        Intrinsics.checkNotNullParameter(data, "data");
        VKIDAuthCallback.DefaultImpls.onAuthCode(this, data, z11);
        C5806a c5806a = this.f56940a;
        m11 = c5806a.f56912c;
        C10727i.c(m11, null, null, new a(c5806a, data, null), 3);
    }

    @Override // com.vk.id.auth.VKIDAuthCallback
    public final void onFail(VKIDAuthFail fail) {
        Intrinsics.checkNotNullParameter(fail, "fail");
        this.f56940a.N0(fail);
    }
}

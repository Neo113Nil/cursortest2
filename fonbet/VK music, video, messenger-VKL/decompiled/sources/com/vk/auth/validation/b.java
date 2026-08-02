package com.vk.auth.validation;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.FragmentActivity;
import com.vk.auth.api.models.AuthResult;
import com.vk.auth.main.SignUpData;
import com.vk.auth.validation.VkPhoneValidationCompleteResult;
import com.vk.auth.validation.VkValidatePhoneInfo;
import com.vk.auth.validation.b;
import com.vk.superapp.api.dto.auth.validatephonecheck.AuthValidatePhoneCheckResponse;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.c;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.b8e0;
import xsna.bws;
import xsna.c4a0;
import xsna.cbt0;
import xsna.dw20;
import xsna.gzs;
import xsna.hd4;
import xsna.izs;
import xsna.jq0;
import xsna.k4a0;
import xsna.ozl;
import xsna.par0;
import xsna.q55;
import xsna.qbe0;
import xsna.r55;
import xsna.rjg0;
import xsna.s25;
import xsna.s3q0;
import xsna.t12;
import xsna.t6v0;
import xsna.tmu0;
import xsna.u12;
import xsna.umu0;
import xsna.w9l0;

/* compiled from: VkPhoneValidationManager.kt */
/* loaded from: classes.dex */
public final class b {
    public static a a(b bVar, FragmentActivity fragmentActivity, VkValidatePhoneInfo vkValidatePhoneInfo, int i) {
        String string = fragmentActivity.getString(R.string.vk_service_validation_confirmation_subtitle);
        rjg0 rjg0Var = new rjg0(13);
        bVar.getClass();
        par0.a.getClass();
        par0.a("[PhoneValidationManager] verifyUserPhone, info=" + vkValidatePhoneInfo);
        return d(bVar, fragmentActivity, string, true, new cbt0(vkValidatePhoneInfo, 6), rjg0Var, 8);
    }

    public static a b(b bVar, FragmentActivity fragmentActivity, CharSequence charSequence, int i) {
        if ((i & 32) != 0) {
            charSequence = fragmentActivity.getString(R.string.vk_service_validation_confirmation_subtitle);
        }
        CharSequence charSequence2 = charSequence;
        bVar.getClass();
        par0.a.getClass();
        par0.a("[PhoneValidationManager] verifyUserPhone, isAuth=false");
        return d(bVar, fragmentActivity, charSequence2, true, new bws(27), null, 32);
    }

    public static void c(b bVar, FragmentActivity fragmentActivity, AuthValidatePhoneCheckResponse authValidatePhoneCheckResponse, CharSequence charSequence) {
        bVar.getClass();
        par0 par0Var = par0.a;
        String str = "[PhoneValidationManager] verifyUserPhone, status=" + authValidatePhoneCheckResponse.zb();
        par0Var.getClass();
        par0.a(str);
        d(bVar, fragmentActivity, charSequence, true, new b8e0(VkValidatePhoneInfo.a.b(authValidatePhoneCheckResponse), 26), null, 40);
    }

    public static a d(b bVar, FragmentActivity fragmentActivity, CharSequence charSequence, boolean z, izs izsVar, rjg0 rjg0Var, int i) {
        gzs gzsVar = rjg0Var;
        if ((i & 32) != 0) {
            gzsVar = new qbe0(13);
        }
        bVar.getClass();
        a aVar = new a(new WeakReference(fragmentActivity), z, false, gzsVar);
        w9l0 w9l0Var = new w9l0(14);
        r55 r55Var = r55.a;
        umu0 umu0Var = r55.g;
        if (umu0Var == null) {
            umu0Var = null;
        }
        tmu0 tmu0Var = umu0Var.k;
        c4a0 c4a0Var = new c4a0(new com.vk.auth.validation.a(fragmentActivity), aVar.c(), w9l0Var);
        c4a0Var.c(new k4a0(fragmentActivity, c4a0Var, charSequence, aVar.b()));
        izsVar.invoke(c4a0Var);
        return aVar;
    }

    /* compiled from: VkPhoneValidationManager.kt */
    /* loaded from: classes15.dex */
    public static final class a implements c {
        public final WeakReference<Activity> b;
        public final boolean c;
        public final boolean d;
        public final gzs<s3q0> e;
        public final io.reactivex.rxjava3.disposables.b f = new io.reactivex.rxjava3.disposables.b();
        public final hd4 g = new hd4(this, 12);
        public final C0419a h;
        public final Set<dw20> i;
        public int j;

        public a(WeakReference<Activity> weakReference, boolean z, boolean z2, gzs<s3q0> gzsVar) {
            this.b = weakReference;
            this.c = z;
            this.d = z2;
            this.e = gzsVar;
            C0419a c0419a = new C0419a();
            this.h = c0419a;
            q55 q55Var = q55.a;
            q55.a(c0419a);
            this.i = Collections.newSetFromMap(new WeakHashMap(2));
        }

        public final void a() {
            Set<dw20> set = this.i;
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                try {
                    ((dw20) it.next()).tn();
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable unused) {
                }
            }
            set.clear();
        }

        public final hd4 b() {
            return this.g;
        }

        public final io.reactivex.rxjava3.disposables.b c() {
            return this.f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Object, xsna.dw20] */
        public final void d(dw20.b bVar, String str) {
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            bVar.Z(new DialogInterface.OnDismissListener() { // from class: xsna.rcv0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    dw20 dw20Var = (dw20) Ref$ObjectRef.this.element;
                    if (dw20Var != null) {
                        b.a aVar = this;
                        if (aVar.j != 1) {
                            ttp0.a(aVar.i).remove(dw20Var);
                        }
                    }
                }
            });
            ?? I0 = bVar.I0(str);
            ref$ObjectRef.element = I0;
            this.i.add(I0);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final synchronized void dispose() {
            if (this.j != 0) {
                return;
            }
            this.j = 1;
            try {
                this.f.dispose();
                a();
                q55 q55Var = q55.a;
                q55.e(this.h);
            } finally {
                this.j = 2;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final synchronized boolean h() {
            return this.j == 2;
        }

        /* compiled from: VkPhoneValidationManager.kt */
        /* renamed from: com.vk.auth.validation.b$a$a, reason: collision with other inner class name */
        public static final class C0419a implements s25 {

            /* compiled from: VkPhoneValidationManager.kt */
            /* renamed from: com.vk.auth.validation.b$a$a$a, reason: collision with other inner class name */
            public static final /* synthetic */ class C0420a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[VkPhoneValidationErrorReason.values().length];
                    try {
                        iArr[VkPhoneValidationErrorReason.UNLINK.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[VkPhoneValidationErrorReason.API.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public C0419a() {
            }

            @Override // xsna.s25
            public final void h(VkPhoneValidationCompleteResult vkPhoneValidationCompleteResult) {
                boolean equals = vkPhoneValidationCompleteResult.equals(VkPhoneValidationCompleteResult.Skip.c);
                boolean z = false;
                a aVar = a.this;
                boolean z2 = equals && aVar.d;
                if (!equals && aVar.c) {
                    z = true;
                }
                if (z2 || z) {
                    aVar.a();
                    new Handler(Looper.getMainLooper()).postDelayed(new t12(aVar, 14), 64L);
                } else {
                    aVar.dispose();
                }
                aVar.e.invoke();
            }

            @Override // xsna.s25
            public final void v(VkPhoneValidationErrorReason vkPhoneValidationErrorReason) {
                a aVar = a.this;
                gzs<s3q0> gzsVar = aVar.e;
                int i = C0420a.$EnumSwitchMapping$0[vkPhoneValidationErrorReason.ordinal()];
                if (i == 1) {
                    aVar.a();
                    new Handler(Looper.getMainLooper()).postDelayed(new u12(aVar, 15), 64L);
                    gzsVar.invoke();
                    return;
                }
                if (i == 2) {
                    aVar.a();
                } else {
                    aVar.dispose();
                    gzsVar.invoke();
                }
            }

            @Override // xsna.s25
            public final void A() {
            }

            @Override // xsna.s25
            public final void m() {
            }

            @Override // xsna.s25
            public final void o() {
            }

            @Override // xsna.s25
            public final void p() {
            }

            @Override // xsna.s25
            public final void t() {
            }

            @Override // xsna.s25
            public final void u() {
            }

            @Override // xsna.s25
            public final void b(String str) {
            }

            @Override // xsna.s25
            @ozl
            public final void l(jq0 jq0Var) {
            }

            @Override // xsna.s25
            public final void n(AuthResult authResult) {
            }

            @Override // xsna.s25
            public final void r(t6v0 t6v0Var) {
            }

            @Override // xsna.s25
            public final void j(long j, SignUpData signUpData) {
            }
        }
    }
}

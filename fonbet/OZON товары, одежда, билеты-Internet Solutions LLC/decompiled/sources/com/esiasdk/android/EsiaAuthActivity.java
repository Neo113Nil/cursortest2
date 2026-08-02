package com.esiasdk.android;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.s;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.Log;
import androidx.appcompat.app.g;
import androidx.lifecycle.K;
import androidx.lifecycle.z0;
import com.esiasdk.android.EsiaAuthActivity;
import g.AbstractC6592d;
import g.C6589a;
import g.InterfaceC6590b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import xe.M;
import y6.C10846b;
import y6.C10848d;
import z6.C10992a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/esiasdk/android/EsiaAuthActivity;", "Landroidx/appcompat/app/g;", "<init>", "()V", "esiasdk-1.1.3(6)_nonPguRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class EsiaAuthActivity extends g {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f57722j = 0;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f57723h = k.b(new e());

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final AbstractC6592d<Intent> f57724i;

    @kotlin.coroutines.jvm.internal.e(c = "com.esiasdk.android.EsiaAuthActivity$onCreate$1", f = "EsiaAuthActivity.kt", l = {40}, m = "invokeSuspend")
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f57725d;

        /* renamed from: com.esiasdk.android.EsiaAuthActivity$a$a, reason: collision with other inner class name */
        static final class C0874a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ EsiaAuthActivity f57727a;

            C0874a(EsiaAuthActivity esiaAuthActivity) {
                this.f57727a = esiaAuthActivity;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                Intent intent = new Intent();
                intent.putExtra("EXTRA_TOKEN_PARAMS", (B6.c) obj);
                Unit unit = Unit.f71690a;
                EsiaAuthActivity esiaAuthActivity = this.f57727a;
                esiaAuthActivity.setResult(-1, intent);
                esiaAuthActivity.finish();
                return Unit.f71690a;
            }
        }

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return EsiaAuthActivity.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f57725d;
            if (i11 == 0) {
                s.b(obj);
                EsiaAuthActivity esiaAuthActivity = EsiaAuthActivity.this;
                InterfaceC2395h<B6.c> m02 = EsiaAuthActivity.J(esiaAuthActivity).m0();
                C0874a c0874a = new C0874a(esiaAuthActivity);
                this.f57725d = 1;
                if (m02.collect(c0874a, this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "com.esiasdk.android.EsiaAuthActivity$onCreate$2", f = "EsiaAuthActivity.kt", l = {49}, m = "invokeSuspend")
    static final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f57728d;

        static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ EsiaAuthActivity f57730a;

            a(EsiaAuthActivity esiaAuthActivity) {
                this.f57730a = esiaAuthActivity;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                EsiaAuthActivity esiaAuthActivity = this.f57730a;
                int i11 = EsiaAuthActivity.f57722j;
                Intent intent = new Intent();
                intent.putExtra("EXTRA_ERROR_CODE", (Parcelable) obj);
                Unit unit = Unit.f71690a;
                esiaAuthActivity.setResult(-1, intent);
                esiaAuthActivity.finish();
                return Unit.f71690a;
            }
        }

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return EsiaAuthActivity.this.new b(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f57728d;
            if (i11 == 0) {
                s.b(obj);
                EsiaAuthActivity esiaAuthActivity = EsiaAuthActivity.this;
                InterfaceC2395h<C10848d> l02 = EsiaAuthActivity.J(esiaAuthActivity).l0();
                a aVar2 = new a(esiaAuthActivity);
                this.f57728d = 1;
                if (l02.collect(aVar2, this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "com.esiasdk.android.EsiaAuthActivity$onCreate$3", f = "EsiaAuthActivity.kt", l = {55}, m = "invokeSuspend")
    static final class c extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f57731d;

        static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ EsiaAuthActivity f57733a;

            a(EsiaAuthActivity esiaAuthActivity) {
                this.f57733a = esiaAuthActivity;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                int i11 = EsiaAuthActivity.f57722j;
                EsiaAuthActivity esiaAuthActivity = this.f57733a;
                esiaAuthActivity.getClass();
                Intent intent = new Intent();
                intent.putExtra("EXTRA_BACK_PRESSED", true);
                intent.putExtra("EXTRA_ERROR_CODE", (Parcelable) obj);
                Unit unit = Unit.f71690a;
                esiaAuthActivity.setResult(0, intent);
                return Unit.f71690a;
            }
        }

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return EsiaAuthActivity.this.new c(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f57731d;
            if (i11 == 0) {
                s.b(obj);
                EsiaAuthActivity esiaAuthActivity = EsiaAuthActivity.this;
                InterfaceC2395h<C10848d> k02 = EsiaAuthActivity.J(esiaAuthActivity).k0();
                a aVar2 = new a(esiaAuthActivity);
                this.f57731d = 1;
                if (k02.collect(aVar2, this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "com.esiasdk.android.EsiaAuthActivity$onCreate$4", f = "EsiaAuthActivity.kt", l = {61}, m = "invokeSuspend")
    static final class d extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f57734d;

        static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ EsiaAuthActivity f57736a;

            a(EsiaAuthActivity esiaAuthActivity) {
                this.f57736a = esiaAuthActivity;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                EsiaAuthActivity.K(this.f57736a, (String) obj);
                return Unit.f71690a;
            }
        }

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return EsiaAuthActivity.this.new d(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f57734d;
            if (i11 == 0) {
                s.b(obj);
                EsiaAuthActivity esiaAuthActivity = EsiaAuthActivity.this;
                InterfaceC2395h<String> j02 = EsiaAuthActivity.J(esiaAuthActivity).j0();
                a aVar2 = new a(esiaAuthActivity);
                this.f57734d = 1;
                if (j02.collect(aVar2, this) == aVar) {
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

    static final class e extends AbstractC7737t implements Function0<C10846b> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C10846b invoke() {
            return (C10846b) new z0(EsiaAuthActivity.this).a(C10846b.class);
        }
    }

    public EsiaAuthActivity() {
        AbstractC6592d<Intent> registerForActivityResult = registerForActivityResult(new h.j(), new InterfaceC6590b() { // from class: y6.a
            @Override // g.InterfaceC6590b
            public final void onActivityResult(Object obj) {
                int i11 = EsiaAuthActivity.f57722j;
                EsiaAuthActivity this$0 = EsiaAuthActivity.this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (((C6589a) obj).b() == 0) {
                    new Handler().postDelayed(new N9.c(this$0, 3), 500L);
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul…)\n            }\n        }");
        this.f57724i = registerForActivityResult;
    }

    public static final C10846b J(EsiaAuthActivity esiaAuthActivity) {
        return (C10846b) esiaAuthActivity.f57723h.getValue();
    }

    public static final void K(EsiaAuthActivity esiaAuthActivity, String str) {
        try {
            esiaAuthActivity.f57724i.a(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException e11) {
            Log.e("EsiaAuthActivity", String.valueOf(e11.getMessage()));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.r, androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.act_esia_sign_in);
        K.a(this).b(new a(null));
        K.a(this).b(new b(null));
        K.a(this).b(new c(null));
        K.a(this).b(new d(null));
        if (bundle == null) {
            Intent intent = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "intent");
            String stringExtra = intent.getStringExtra("EXTRA_ESIA_API_URL");
            C10992a c10992a = (C10992a) intent.getParcelableExtra("EXTRA_CLIENT_SESSION");
            if (stringExtra == null || c10992a == null) {
                C10848d c10848d = new C10848d((String) null, 6, (Integer) 2);
                Intent intent2 = new Intent();
                intent2.putExtra("EXTRA_ERROR_CODE", (Parcelable) c10848d);
                Unit unit = Unit.f71690a;
                setResult(-1, intent2);
                finish();
                return;
            }
            String stringExtra2 = intent.getStringExtra("EXTRA_PERMISSIONS");
            InterfaceC4008j interfaceC4008j = this.f57723h;
            if (stringExtra2 == null || stringExtra2.length() == 0) {
                ((C10846b) interfaceC4008j.getValue()).p0(stringExtra, c10992a);
            } else {
                ((C10846b) interfaceC4008j.getValue()).q0(stringExtra, c10992a, stringExtra2);
            }
        }
    }

    @Override // androidx.activity.ActivityC5043j, android.app.Activity
    protected final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent == null) {
            return;
        }
        ((C10846b) this.f57723h.getValue()).r0(intent.getData(), intent.getExtras());
    }
}

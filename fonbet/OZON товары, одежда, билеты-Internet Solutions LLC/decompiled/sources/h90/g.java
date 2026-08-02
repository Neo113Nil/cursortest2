package h90;

import A30.m;
import Ae.C0;
import Ae.InterfaceC2397i;
import D30.f;
import H30.C3134c;
import Sc.s;
import Sc.z;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import androidx.recyclerview.widget.LinearLayoutManager;
import g30.InterfaceC6618a;
import i90.InterfaceC7024a;
import j90.InterfaceC7310a;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import k90.AbstractC7611a;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import xe.C10727i;
import xe.M;
import xe.Y;

/* loaded from: classes3.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC7310a f65165a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC7024a f65166b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final m f65167c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final S30.a f65168d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f65169e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final SharedPreferences f65170f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final R30.a f65171g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f65172h;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.notifications.domains.interactors.NotificationInteractorImpl$1", f = "NotificationInteractorImpl.kt", l = {76}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f65173d;

        /* renamed from: h90.g$a$a, reason: collision with other inner class name */
        static final class C1057a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ g f65175a;

            @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.notifications.domains.interactors.NotificationInteractorImpl$1$1", f = "NotificationInteractorImpl.kt", l = {80, 81}, m = "emit")
            /* renamed from: h90.g$a$a$a, reason: collision with other inner class name */
            static final class C1058a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: d, reason: collision with root package name */
                Object f65176d;

                /* renamed from: e, reason: collision with root package name */
                /* synthetic */ Object f65177e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ C1057a<T> f65178f;

                /* renamed from: g, reason: collision with root package name */
                int f65179g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C1058a(C1057a<? super T> c1057a, kotlin.coroutines.d<? super C1058a> dVar) {
                    super(dVar);
                    this.f65178f = c1057a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f65177e = obj;
                    this.f65179g |= LinearLayoutManager.INVALID_OFFSET;
                    return this.f65178f.emit(null, this);
                }
            }

            C1057a(g gVar) {
                this.f65175a = gVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
            
                if (r6.q() != r1) goto L27;
             */
            /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
            @Override // Ae.InterfaceC2397i
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(D30.f fVar, kotlin.coroutines.d<? super Unit> dVar) {
                C1058a c1058a;
                int i11;
                C1057a<T> c1057a;
                if (dVar instanceof C1058a) {
                    c1058a = (C1058a) dVar;
                    int i12 = c1058a.f65179g;
                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        c1058a.f65179g = i12 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj = c1058a.f65177e;
                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                        i11 = c1058a.f65179g;
                        if (i11 != 0) {
                            s.b(obj);
                            if (!(fVar instanceof f.a) || this.f65175a.f65172h) {
                                return Unit.f71690a;
                            }
                            c1058a.f65176d = this;
                            c1058a.f65179g = 1;
                            if (Y.b(5000L, c1058a) != aVar) {
                                c1057a = this;
                            }
                            return aVar;
                        }
                        if (i11 != 1) {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s.b(obj);
                            return Unit.f71690a;
                        }
                        c1057a = (C1057a) c1058a.f65176d;
                        s.b(obj);
                        g gVar = c1057a.f65175a;
                        c1058a.f65176d = null;
                        c1058a.f65179g = 2;
                    }
                }
                c1058a = new C1058a(this, dVar);
                Object obj2 = c1058a.f65177e;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c1058a.f65179g;
                if (i11 != 0) {
                }
                g gVar2 = c1057a.f65175a;
                c1058a.f65176d = null;
                c1058a.f65179g = 2;
            }
        }

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return g.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f65173d;
            if (i11 == 0) {
                s.b(obj);
                g gVar = g.this;
                C0 r11 = gVar.f65167c.r();
                C1057a c1057a = new C1057a(gVar);
                this.f65173d = 1;
                if (r11.collect(c1057a, this) == aVar) {
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

    public g(@NotNull InterfaceC7310a repository, @NotNull InterfaceC7024a pushManager, @NotNull ru.ozon.fintech.settings.domain.a settings, @NotNull Context context, @NotNull m authInteractor, @NotNull S30.a applicationInfoDataSource, @NotNull InterfaceC6618a analyticsInteractor, @NotNull SharedPreferences defaultSharedPreferences, @NotNull R30.a appCoroutineScopes) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(pushManager, "pushManager");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(authInteractor, "authInteractor");
        Intrinsics.checkNotNullParameter(applicationInfoDataSource, "applicationInfoDataSource");
        Intrinsics.checkNotNullParameter(analyticsInteractor, "analyticsInteractor");
        Intrinsics.checkNotNullParameter(defaultSharedPreferences, "defaultSharedPreferences");
        Intrinsics.checkNotNullParameter(appCoroutineScopes, "appCoroutineScopes");
        this.f65165a = repository;
        this.f65166b = pushManager;
        this.f65167c = authInteractor;
        this.f65168d = applicationInfoDataSource;
        this.f65169e = analyticsInteractor;
        this.f65170f = defaultSharedPreferences;
        this.f65171g = appCoroutineScopes;
        C10727i.c(appCoroutineScopes.b(), null, null, new a(null), 3);
        authInteractor.A(new A90.d(this, 2));
    }

    public static Unit k(g gVar) {
        SharedPreferences sharedPreferences = gVar.f65170f;
        sharedPreferences.edit().remove("FIN_JWT_KEY").commit();
        sharedPreferences.edit().remove("FIN_CERT_KEY").commit();
        gVar.f65172h = false;
        return Unit.f71690a;
    }

    @Override // h90.f
    public final boolean a() {
        return this.f65166b.a();
    }

    @Override // h90.f
    public final void b(@NotNull AbstractC7611a notification) {
        Intrinsics.checkNotNullParameter(notification, "notification");
        InterfaceC7024a interfaceC7024a = this.f65166b;
        if (interfaceC7024a.c()) {
            interfaceC7024a.b(notification);
        }
    }

    @Override // h90.f
    public final String c() {
        String f7 = f();
        String j11 = j();
        if (f7.length() <= 0 || j11.length() <= 0) {
            return null;
        }
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = f7.concat(j11).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] storage = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(storage, "digest(...)");
        Intrinsics.checkNotNullParameter(storage, "<this>");
        Intrinsics.checkNotNullParameter(storage, "storage");
        return C7714v.V(z.b(storage), "", null, null, new C3134c(), 30);
    }

    @Override // h90.f
    public final boolean d() {
        return this.f65166b.d();
    }

    @Override // h90.f
    public final void e(@NotNull String jwt, @NotNull String cert) {
        Intrinsics.checkNotNullParameter(jwt, "jwt");
        Intrinsics.checkNotNullParameter(cert, "cert");
        SharedPreferences sharedPreferences = this.f65170f;
        sharedPreferences.edit().putString("FIN_JWT_KEY", jwt).commit();
        sharedPreferences.edit().putString("FIN_CERT_KEY", cert).commit();
        this.f65172h = true;
    }

    @Override // h90.f
    @NotNull
    public final String f() {
        String string = this.f65170f.getString("FIN_CERT_KEY", "");
        return string == null ? "" : string;
    }

    @Override // h90.f
    @NotNull
    public final String g() {
        String string = this.f65170f.getString("FIN_JWT_KEY", "");
        return string == null ? "" : string;
    }

    @Override // h90.f
    @NotNull
    public final String h(@NotNull String passwordHex, @NotNull String encodedTextHex, @NotNull String nonce) throws Exception {
        Intrinsics.checkNotNullParameter(passwordHex, "passwordHex");
        Intrinsics.checkNotNullParameter(encodedTextHex, "encodedTextHex");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        byte[] a11 = H30.s.a(passwordHex);
        byte[] a12 = H30.s.a(encodedTextHex);
        byte[] a13 = H30.s.a(nonce);
        SecretKeySpec secretKeySpec = new SecretKeySpec(a11, "AES/GCM/NoPadding");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(a13, 0, a13.length);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        Intrinsics.checkNotNullExpressionValue(cipher, "getInstance(...)");
        cipher.init(2, secretKeySpec, ivParameterSpec);
        byte[] doFinal = cipher.doFinal(a12);
        Intrinsics.f(doFinal);
        String str = new String(doFinal, Charsets.UTF_8);
        Log.d("NotificationInteractorImpl", "otp string decoded = ".concat(str));
        return str;
    }

    @Override // h90.f
    public final String i() {
        String c11 = c();
        if (c11 == null || c11.length() <= 5) {
            return null;
        }
        String substring = c11.substring(c11.length() - 5, c11.length() - 1);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    @Override // h90.f
    @NotNull
    public final String j() {
        try {
            byte[] decode = Base64.decode((String) kotlin.text.h.m(g(), new String[]{"."}, 0, 6).get(1), 0);
            Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            return new JSONObject(new String(decode, UTF_8)).getString("sub");
        } catch (Exception unused) {
            return "";
        }
    }

    public final Unit q() {
        C10727i.c(this.f65171g.b(), null, null, new i(this, null), 3);
        return Unit.f71690a;
    }
}

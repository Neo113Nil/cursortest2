package bo.app;

import android.content.Context;
import com.braze.support.BrazeLogger;
import com.braze.support.ReflectionUtils;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n8 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f25801a;

    /* renamed from: b, reason: collision with root package name */
    public final p9 f25802b;

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f25803c;

    /* renamed from: d, reason: collision with root package name */
    public final Lazy f25804d;

    public n8(Context context, p9 registrationDataProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(registrationDataProvider, "registrationDataProvider");
        this.f25801a = context;
        this.f25802b = registrationDataProvider;
        this.f25803c = LazyKt.lazy(new Function0() { // from class: c3.H6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(bo.app.n8.c());
            }
        });
        this.f25804d = LazyKt.lazy(new Function0() { // from class: c3.I6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(bo.app.n8.d());
            }
        });
    }

    public static final String b(String str) {
        return "Automatically obtained Firebase Cloud Messaging push token: " + str;
    }

    public static final boolean c() {
        return ReflectionUtils.doesMethodExist("com.google.firebase.iid.FirebaseInstanceId", "getToken", String.class, String.class);
    }

    public static final boolean d() {
        return ReflectionUtils.doesMethodExist("com.google.firebase.messaging.FirebaseMessaging", "getToken", new Class[0]);
    }

    public static final String e() {
        return "Failed to register for Firebase Cloud Messaging";
    }

    public static final String f() {
        return "Firebase Cloud Messaging 'getInstance' method could not obtained. Not registering for Firebase Cloud Messaging.";
    }

    public static final String g() {
        return "Could not call 'getInstance' method. Not registering for Firebase Cloud Messaging.";
    }

    public static final String h() {
        return "Firebase Cloud Messaging 'InstanceId' object could not be invoked. Not registering for Firebase Cloud Messaging.";
    }

    public static final String i() {
        return "Firebase Cloud Messaging 'FirebaseInstanceId.getInstance().getToken()' method could not obtained. Not registering for Firebase Cloud Messaging.";
    }

    public static final String j() {
        return "Could not invoke 'getToken()' Not registering for Firebase Cloud Messaging.";
    }

    public static final String k() {
        return "Failed to get push token via instance id";
    }

    public final void a(String firebaseSenderId) {
        Intrinsics.checkNotNullParameter(firebaseSenderId, "firebaseSenderId");
        try {
            if (((Boolean) this.f25804d.getValue()).booleanValue()) {
                FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener() { // from class: c3.z6
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        bo.app.n8.a(bo.app.n8.this, task);
                    }
                });
            } else if (((Boolean) this.f25803c.getValue()).booleanValue()) {
                c(firebaseSenderId);
            }
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.F6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.n8.e();
                }
            }, 4, (Object) null);
        }
    }

    public static final String b() {
        return "Firebase Cloud Messaging requires the Google Play Store to be installed.";
    }

    public static final String d(String str) {
        return "Registering for Firebase Cloud Messaging token using sender id: " + str;
    }

    public final void c(final String str) {
        n8 n8Var;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.f29472V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: c3.J6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.n8.d(str);
            }
        }, 6, (Object) null);
        try {
            Method methodQuietly = ReflectionUtils.getMethodQuietly("com.google.firebase.iid.FirebaseInstanceId", "getInstance", (Class<?>[]) new Class[0]);
            if (methodQuietly == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.K6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.n8.f();
                    }
                }, 7, (Object) null);
                return;
            }
            Pair<Boolean, Object> invokeMethodQuietly = ReflectionUtils.invokeMethodQuietly(null, methodQuietly, new Object[0]);
            if (!invokeMethodQuietly.getFirst().booleanValue()) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.L6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.n8.g();
                    }
                }, 7, (Object) null);
                return;
            }
            Object second = invokeMethodQuietly.getSecond();
            if (second == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.M6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.n8.h();
                    }
                }, 7, (Object) null);
                return;
            }
            Method methodQuietly2 = ReflectionUtils.getMethodQuietly(second.getClass(), "getToken", (Class<?>[]) new Class[]{String.class, String.class});
            if (methodQuietly2 == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.N6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.n8.i();
                    }
                }, 7, (Object) null);
                return;
            }
            Pair<Boolean, Object> invokeMethodQuietly2 = ReflectionUtils.invokeMethodQuietly(second, methodQuietly2, str, FirebaseMessaging.INSTANCE_ID_SCOPE);
            if (!invokeMethodQuietly2.getFirst().booleanValue()) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.A6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.n8.j();
                    }
                }, 7, (Object) null);
                return;
            }
            final Object second2 = invokeMethodQuietly2.getSecond();
            if (second2 instanceof String) {
                n8Var = this;
                try {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) n8Var, priority, (Throwable) null, false, new Function0() { // from class: c3.B6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return bo.app.n8.a(second2);
                        }
                    }, 6, (Object) null);
                    ((tc) n8Var.f25802b).a((String) second2);
                } catch (Exception e10) {
                    e = e10;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) n8Var, BrazeLogger.Priority.f29470E, (Throwable) e, false, new Function0() { // from class: c3.C6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return bo.app.n8.k();
                        }
                    }, 4, (Object) null);
                }
            }
        } catch (Exception e11) {
            e = e11;
            n8Var = this;
        }
    }

    public static final void a(n8 n8Var, final Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (!task.isSuccessful()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) n8Var, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: c3.D6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.n8.a(Task.this);
                }
            }, 6, (Object) null);
            return;
        }
        final String str = (String) task.getResult();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) n8Var, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.E6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.n8.b(str);
            }
        }, 6, (Object) null);
        ((tc) n8Var.f25802b).a(str);
    }

    public static final String a(Task task) {
        return "Fetching registration token failed using FirebaseMessaging instance with default Firebase installation with exception " + task.getException();
    }

    public final boolean a() {
        if (com.braze.support.g.b(this.f25801a)) {
            return ((Boolean) this.f25804d.getValue()).booleanValue() || ((Boolean) this.f25803c.getValue()).booleanValue();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: c3.G6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.n8.b();
            }
        }, 6, (Object) null);
        return false;
    }

    public static final String a(Object obj) {
        return "Automatically obtained Firebase Cloud Messaging token: " + obj;
    }
}

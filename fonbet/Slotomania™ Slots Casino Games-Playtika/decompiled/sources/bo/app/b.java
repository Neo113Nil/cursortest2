package bo.app;

import android.content.Context;
import com.amazon.device.messaging.ADM;
import com.amazon.device.messaging.development.ADMManifest;
import com.braze.Constants;
import com.braze.support.BrazeLogger;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lbo/app/b;", "", "", Constants.BRAZE_PUSH_CONTENT_KEY, "Landroid/content/Context;", "context", "Lbo/app/k2;", "admRegistrationDataProvider", "<init>", "(Landroid/content/Context;Lbo/app/k2;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class b {
    public static final a c = new a(null);
    private final Context a;
    private final k2 b;

    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lbo/app/b$a;", "", "", Constants.BRAZE_PUSH_CONTENT_KEY, "Landroid/content/Context;", "context", "b", "", "ADM_INSTANCE_CLASSPATH", "Ljava/lang/String;", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: bo.app.b$a$a, reason: collision with other inner class name */
        static final class C0069a extends Lambda implements Function0<String> {
            public static final C0069a b = new C0069a();

            C0069a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "com.amazon.device.messaging.ADM not found";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: bo.app.b$a$b, reason: collision with other inner class name */
        static final class C0070b extends Lambda implements Function0<String> {
            final /* synthetic */ Exception b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0070b(Exception exc) {
                super(0);
                this.b = exc;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return Intrinsics.stringPlus("Manifest not authored properly to support ADM. ADM manifest exception: ", this.b);
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean b(Context context) {
            try {
                ADMManifest.checkManifestAuthoredProperly(context);
                return true;
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new C0070b(e), 2, (Object) null);
                return false;
            }
        }

        @JvmStatic
        public final boolean a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return a() && b(context);
        }

        private final boolean a() {
            try {
                Class.forName("com.amazon.device.messaging.ADM");
                return true;
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, C0069a.b, 2, (Object) null);
                return false;
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: bo.app.b$b, reason: collision with other inner class name */
    static final class C0071b extends Lambda implements Function0<String> {
        C0071b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("The device is already registered with the ADM server and is eligible to receive ADM messages.ADM registration id: ", b.this.b.a());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function0<String> {
        public static final c b = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Registering with ADM server...";
        }
    }

    public b(Context context, k2 admRegistrationDataProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(admRegistrationDataProvider, "admRegistrationDataProvider");
        this.a = context;
        this.b = admRegistrationDataProvider;
    }

    public final void a() {
        if (this.b.a() != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new C0071b(), 2, (Object) null);
            k2 k2Var = this.b;
            k2Var.a(k2Var.a());
        } else {
            ADM adm = new ADM(this.a);
            if (adm.isSupported()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, c.b, 2, (Object) null);
                adm.startRegister();
            }
        }
    }
}

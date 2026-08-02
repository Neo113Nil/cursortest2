package bo.app;

import android.content.Context;
import com.braze.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.LocationProviderName;
import com.braze.models.IBrazeLocation;
import com.braze.support.BrazeLogger;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.EnumSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000f"}, d2 = {"Lbo/app/o;", "Lbo/app/j2;", "Lcom/braze/models/IBrazeLocation;", FirebaseAnalytics.Param.LOCATION, "", Constants.BRAZE_PUSH_CONTENT_KEY, "Landroid/content/Context;", "context", "Lbo/app/z1;", "brazeManager", "Lcom/braze/configuration/BrazeConfigurationProvider;", "appConfigurationProvider", "<init>", "(Landroid/content/Context;Lbo/app/z1;Lcom/braze/configuration/BrazeConfigurationProvider;)V", "b", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes7.dex */
public final class o implements j2 {
    public static final b d = new b(null);
    private final z1 a;
    private final BrazeConfigurationProvider b;
    private n c;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class a extends Lambda implements Function0<String> {
        public static final a b = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "***Location API not found. Please include android-sdk-location module***";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\t"}, d2 = {"Lbo/app/o$b;", "", "Lcom/braze/configuration/BrazeConfigurationProvider;", "appConfigurationProvider", "Ljava/util/EnumSet;", "Lcom/braze/enums/LocationProviderName;", Constants.BRAZE_PUSH_CONTENT_KEY, "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class b {

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class a extends Lambda implements Function0<String> {
            final /* synthetic */ Ref.ObjectRef<EnumSet<LocationProviderName>> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Ref.ObjectRef<EnumSet<LocationProviderName>> objectRef) {
                super(0);
                this.b = objectRef;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return Intrinsics.stringPlus("Using location providers: ", this.b.element);
            }
        }

        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [T, java.util.EnumSet] */
        /* JADX WARN: Type inference failed for: r9v3, types: [T, java.util.EnumSet] */
        public final EnumSet<LocationProviderName> a(BrazeConfigurationProvider appConfigurationProvider) {
            Intrinsics.checkNotNullParameter(appConfigurationProvider, "appConfigurationProvider");
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = EnumSet.of(LocationProviderName.PASSIVE, LocationProviderName.NETWORK);
            if (!appConfigurationProvider.getCustomLocationProviderNames().isEmpty()) {
                objectRef.element = appConfigurationProvider.getCustomLocationProviderNames();
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new a(objectRef), 2, (Object) null);
            }
            T allowedLocationProviders = objectRef.element;
            Intrinsics.checkNotNullExpressionValue(allowedLocationProviders, "allowedLocationProviders");
            return (EnumSet) allowedLocationProviders;
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
            return "Failed to log location recorded event.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/braze/models/IBrazeLocation;", "it", "", Constants.BRAZE_PUSH_CONTENT_KEY, "(Lcom/braze/models/IBrazeLocation;)V"}, k = 3, mv = {1, 6, 0})
    static final class d extends Lambda implements Function1<IBrazeLocation, Unit> {
        d() {
            super(1);
        }

        public final void a(IBrazeLocation it) {
            Intrinsics.checkNotNullParameter(it, "it");
            o.this.a(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(IBrazeLocation iBrazeLocation) {
            a(iBrazeLocation);
            return Unit.INSTANCE;
        }
    }

    public o(Context context, z1 brazeManager, BrazeConfigurationProvider appConfigurationProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(appConfigurationProvider, "appConfigurationProvider");
        this.a = brazeManager;
        this.b = appConfigurationProvider;
        n nVar = new n(context, d.a(appConfigurationProvider), appConfigurationProvider);
        this.c = nVar;
        if (nVar.a()) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, a.b, 2, (Object) null);
    }

    @Override // bo.app.j2
    public boolean a(IBrazeLocation location) {
        Intrinsics.checkNotNullParameter(location, "location");
        try {
            x1 a2 = j.h.a(location);
            if (a2 == null) {
                return true;
            }
            this.a.a(a2);
            return true;
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, c.b);
            return false;
        }
    }

    @Override // bo.app.j2
    public boolean a() {
        return this.c.a(new d());
    }
}

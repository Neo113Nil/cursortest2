package vh0;

import Yg0.a;
import Zg0.d;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import dh0.C6200a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import nh0.C8596a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.push.sdk.external.service.RemoteMessage;
import ru.ozon.push.sdk.internal.service.OzonPushActionInfo;

/* loaded from: classes7.dex */
public final class m implements h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C8596a f102964a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Context f102965b;

    public static final class a extends AbstractC7737t implements Function0<String> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Exception f102966b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(0);
            this.f102966b = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Failed to get parcelable by name=ru.ozon.push.sdk.REMOTE_MESSAGE. Expected: RemoteMessage. Reason: ".concat(this.f102966b.getClass().getSimpleName());
        }
    }

    public static final class b extends AbstractC7737t implements Function0<String> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Exception f102967b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Exception exc) {
            super(0);
            this.f102967b = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Failed to get parcelable by name=ru.ozon.push.sdk.ACTION_INFO. Expected: OzonPushActionInfo. Reason: ".concat(this.f102967b.getClass().getSimpleName());
        }
    }

    public m(@NotNull C8596a analyticsPlugin, @NotNull Context applicationContext) {
        Intrinsics.checkNotNullParameter(analyticsPlugin, "analyticsPlugin");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.f102964a = analyticsPlugin;
        this.f102965b = applicationContext;
    }

    @Override // vh0.h
    public final boolean a(@NotNull Intent intent) {
        Parcelable parcelable;
        int f97694a;
        NotificationManager notificationManager;
        Object parcelableExtra;
        Object parcelableExtra2;
        Object parcelableExtra3;
        Intrinsics.checkNotNullParameter(intent, "intent");
        Context context = this.f102965b;
        intent.setExtrasClassLoader(context.getClassLoader());
        if (!intent.getBooleanExtra("ru.ozon.push.sdk.PUSH_CLICKED", false)) {
            return false;
        }
        intent.removeExtra("ru.ozon.push.sdk.PUSH_CLICKED");
        Zg0.d b11 = C6200a.b();
        Object obj = null;
        if (b11 instanceof d.b) {
            C6200a.c().a(C6200a.a("Push notification was clicked."), null);
            ((d.b) b11).getClass();
        }
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelableExtra3 = intent.getParcelableExtra("ru.ozon.push.sdk.REMOTE_MESSAGE", RemoteMessage.class);
                parcelable = (Parcelable) parcelableExtra3;
            } else {
                parcelable = intent.getParcelableExtra("ru.ozon.push.sdk.REMOTE_MESSAGE");
            }
        } catch (Exception e11) {
            int i11 = sh0.b.f98783c;
            sh0.b.f("OnClickGetParcelable", null, new a(e11), 2);
            parcelable = null;
        }
        RemoteMessage remoteMessage = (RemoteMessage) parcelable;
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelableExtra2 = intent.getParcelableExtra("ru.ozon.push.sdk.ACTION_INFO", OzonPushActionInfo.class);
                parcelableExtra = (Parcelable) parcelableExtra2;
            } else {
                parcelableExtra = intent.getParcelableExtra("ru.ozon.push.sdk.ACTION_INFO");
            }
            obj = parcelableExtra;
        } catch (Exception e12) {
            int i12 = sh0.b.f98783c;
            sh0.b.f("OnClickGetParcelable", null, new b(e12), 2);
        }
        OzonPushActionInfo ozonPushActionInfo = (OzonPushActionInfo) obj;
        if (remoteMessage != null) {
            Yg0.a.f35038y.getClass();
            Yg0.a b12 = a.C0652a.b();
            this.f102964a.a(remoteMessage, b12.y());
            b12.o().b(remoteMessage);
        }
        if (ozonPushActionInfo == null || (f97694a = ozonPushActionInfo.getF97694a()) == -1 || (notificationManager = (NotificationManager) androidx.core.content.a.getSystemService(context, NotificationManager.class)) == null) {
            return true;
        }
        notificationManager.cancel(f97694a);
        return true;
    }
}

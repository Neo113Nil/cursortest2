package m60;

import android.app.Activity;
import android.content.SharedPreferences;
import com.squareup.moshi.Moshi;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.navigation.models.RequestNotificationData;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;
import t90.AbstractC9782b;

/* loaded from: classes3.dex */
public final class n implements U50.a, U50.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final S80.b f74537a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final SharedPreferences f74538b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f74539c;

    /* renamed from: d, reason: collision with root package name */
    private final r90.f f74540d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Moshi f74541e;

    public n(@NotNull S80.b fintechNavigation, @NotNull SharedPreferences sharedPreferences, @NotNull Q90.c featureToggles, @NotNull ru.ozon.fintech.settings.domain.a fintechSettings, r90.f fVar, @NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f74537a = fintechNavigation;
        this.f74538b = sharedPreferences;
        this.f74539c = fintechSettings;
        this.f74540d = fVar;
        this.f74541e = moshi;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "goto_notifications_permissions";
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((U50.j) callback).invoke(handleSync(weakReference, parameterJson));
    }

    @Override // U50.d
    @NotNull
    public final NativeResult handleSync(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson) {
        r90.f fVar;
        SharedPreferences sharedPreferences = this.f74538b;
        S80.b bVar = this.f74537a;
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        try {
            Activity c11 = bVar.c();
            RequestNotificationData requestNotificationData = (RequestNotificationData) H30.q.a(this.f74541e, parameterJson, RequestNotificationData.class);
            if (c11 != null) {
                boolean z11 = sharedPreferences.getBoolean("IS_WAS_SHOWN_NOTIFICATION_REQUEST", false);
                if (this.f74539c.needShowNotificationRequest() && !z11 && (fVar = this.f74540d) != null && fVar.o() && !(fVar.k(c11) instanceof AbstractC9782b.a)) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putBoolean("IS_WAS_SHOWN_NOTIFICATION_REQUEST", true);
                    edit.apply();
                    bVar.i(requestNotificationData != null ? requestNotificationData.getIcon() : null, requestNotificationData != null ? requestNotificationData.getTitle() : null, requestNotificationData != null ? requestNotificationData.getSubtitle() : null);
                    NativeResult.Success.INSTANCE.getClass();
                    return NativeResult.Success.DEFAULT;
                }
            }
            return new NativeResult.Error("Не показано", NativeResult.Error.a.IS_NOT_AVAILABLE);
        } catch (Exception e11) {
            String message = e11.getMessage();
            if (message == null) {
                message = e11.toString();
            }
            return new NativeResult.Error(message, null, 2, null);
        }
    }
}

package m60;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.squareup.moshi.Moshi;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.navigation.models.TransitionBankingAppData;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.navigation.models.TransitionBankingAppResult;

/* renamed from: m60.C, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8095C extends V50.a<TransitionBankingAppData> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Context f74503b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8095C(@NotNull Context context, @NotNull Moshi moshi) {
        super(moshi);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f74503b = context;
    }

    @Override // V50.a
    @NotNull
    public final Class<TransitionBankingAppData> b() {
        return TransitionBankingAppData.class;
    }

    @Override // V50.a
    public final void d(WeakReference weakReference, Object obj, U50.j callback) {
        String str;
        TransitionBankingAppData value = (TransitionBankingAppData) obj;
        Context context = this.f74503b;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(callback, "callback");
        boolean z11 = false;
        try {
            if (value.getBankUrl().length() == 0) {
                L80.a.b("TransitionBankingAppNavigationInterface", "Url from " + value + " is null or empty");
            } else {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(value.getBankUrl()));
                intent.setFlags(268435456);
                if (context.getPackageManager().resolveActivity(intent, 0) != null) {
                    context.startActivity(intent);
                    z11 = true;
                }
            }
        } catch (Exception e11) {
            L80.a.c("TransitionBankingAppNavigationInterface", null, e11);
        }
        try {
            str = c().c(TransitionBankingAppResult.class).toJson(new TransitionBankingAppResult(z11));
        } catch (Throwable th2) {
            th2.printStackTrace();
            str = "";
        }
        callback.invoke(new NativeResult.Success(str));
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "transition_banking_app";
    }
}

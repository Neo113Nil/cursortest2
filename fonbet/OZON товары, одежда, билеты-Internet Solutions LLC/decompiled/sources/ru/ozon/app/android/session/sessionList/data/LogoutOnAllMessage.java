package ru.ozon.app.android.session.sessionList.data;

import a00.C4911f;
import android.view.ViewGroup;
import androidx.fragment.app.r;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.R$drawable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u00062\n\u0010\u000b\u001a\u00060\tj\u0002`\n¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\u00020\u00062\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/session/sessionList/data/LogoutOnAllMessage;", "", "<init>", "()V", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "setPendingValue", "(Ljava/lang/String;)V", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "container", "showPendingValue", "(La00/f;)V", "show", "(La00/f;Ljava/lang/String;)V", "Ljava/lang/String;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LogoutOnAllMessage {
    private static String value;

    @NotNull
    public static final LogoutOnAllMessage INSTANCE = new LogoutOnAllMessage();
    public static final int $stable = 8;

    private LogoutOnAllMessage() {
    }

    public final void setPendingValue(String value2) {
        value = value2;
    }

    public final void show(@NotNull C4911f container, @NotNull String value2) {
        ViewGroup rootView;
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(value2, "value");
        r a11 = container.a();
        if (a11 == null || (rootView = ContextExtKt.getRootView(a11)) == null) {
            return;
        }
        FlashbarFactory.create$default(FlashbarFactory.INSTANCE, rootView, null, OzonSpannableStringKt.toOzonSpannableString(value2), null, null, Integer.valueOf(R$drawable.ic_m_exclamation), null, null, null, null, null, null, null, null, null, null, container.f(), 65498, null).show();
    }

    public final void showPendingValue(@NotNull C4911f container) {
        Intrinsics.checkNotNullParameter(container, "container");
        String str = value;
        if (str == null) {
            return;
        }
        value = null;
        show(container, str);
    }
}

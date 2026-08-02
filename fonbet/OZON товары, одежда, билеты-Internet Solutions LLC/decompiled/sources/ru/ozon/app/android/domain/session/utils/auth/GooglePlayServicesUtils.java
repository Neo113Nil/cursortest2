package ru.ozon.app.android.domain.session.utils.auth;

import android.content.Context;
import androidx.fragment.app.r;
import com.google.android.gms.common.GoogleApiAvailability;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.utils.VersionModelKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u0006*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/domain/session/utils/auth/GooglePlayServicesUtils;", "", "<init>", "()V", "Landroidx/fragment/app/r;", "activity", "", "isGoogleServicesEnabled", "(Landroidx/fragment/app/r;)Z", "Landroid/content/Context;", "", "passedVersion", "deviceVersionServicesLowerThanPassed", "(Landroid/content/Context;Ljava/lang/String;)Z", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GooglePlayServicesUtils {

    @NotNull
    public static final GooglePlayServicesUtils INSTANCE = new GooglePlayServicesUtils();

    private GooglePlayServicesUtils() {
    }

    public final boolean deviceVersionServicesLowerThanPassed(@NotNull Context context, @NotNull String passedVersion) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(passedVersion, "passedVersion");
        try {
            String str = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionName;
            if (str != null && str.length() != 0) {
                return VersionModelKt.passedVersionIsLower(passedVersion, str);
            }
        } catch (Exception unused) {
        }
        return true;
    }

    public final boolean isGoogleServicesEnabled(@NotNull r activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(activity) == 0;
    }
}

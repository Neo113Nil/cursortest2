package ru.ozon.app.android.abtool.utils;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.AbToolNamespace;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/os/Bundle;", "Lru/ozon/app/android/abtool/AbToolNamespace;", "getNamespace", "(Landroid/os/Bundle;)Lru/ozon/app/android/abtool/AbToolNamespace;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "fromString", "(Ljava/lang/String;)Lru/ozon/app/android/abtool/AbToolNamespace;", "abzone_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NamespaceUtilsKt {
    private static final AbToolNamespace fromString(String str) {
        Object obj;
        Iterator<E> it = AbToolNamespace.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d(((AbToolNamespace) obj).name(), str)) {
                break;
            }
        }
        return (AbToolNamespace) obj;
    }

    @NotNull
    public static final AbToolNamespace getNamespace(Bundle bundle) {
        String string;
        AbToolNamespace fromString;
        return (bundle == null || (string = bundle.getString("NAMESPACE")) == null || (fromString = fromString(string)) == null) ? AbToolNamespace.DEFAULT : fromString;
    }
}

package ru.ozon.uni.atoms.utils;

import androidx.core.os.m;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u001c\u0010\b\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00070\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\u0003J\u0015\u0010\r\u001a\u00020\u0004*\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/uni/atoms/utils/OzTrace;", "", "<init>", "()V", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "Lkotlin/Pair;", "arguments", "", "beginTrace", "(Ljava/lang/String;[Lkotlin/Pair;)V", "endTrace", "transformValue", "(Ljava/lang/Object;)Ljava/lang/String;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OzTrace {

    @NotNull
    public static final OzTrace INSTANCE = new OzTrace();

    private OzTrace() {
    }

    public static final void beginTrace(String name, @NotNull Pair<? extends Object, ? extends Object>[] arguments) {
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        if (m.a()) {
            if (name == null) {
                Thread.currentThread().getStackTrace()[3].getMethodName();
            }
            if (arguments.length == 0) {
                return;
            }
            C7705l.P(arguments, null, null, null, OzTrace$beginTrace$fullName$1.INSTANCE, 31);
        }
    }

    public static final void endTrace() {
        m.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String transformValue(Object obj) {
        return obj != null ? obj.getClass().getSimpleName() : String.valueOf(obj);
    }
}

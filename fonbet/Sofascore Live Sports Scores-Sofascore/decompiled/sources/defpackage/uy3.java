package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcel;
import android.os.ResultReceiver;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class uy3 {
    public static final ry3 c = new ry3();
    public static final Set d = ph0.a0(new Integer[]{7, 20});
    public static final int e = 1;
    public final Context a;
    public final Context b;

    public uy3(Context context) {
        context.getClass();
        context.getClass();
        this.a = context;
        this.b = context;
    }

    public static void a(ResultReceiver resultReceiver, Intent intent, String str) {
        resultReceiver.getClass();
        intent.putExtra("TYPE", str);
        intent.putExtra("ACTIVITY_REQUEST_CODE", e);
        Parcel obtain = Parcel.obtain();
        obtain.getClass();
        resultReceiver.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        ResultReceiver resultReceiver2 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        intent.putExtra("RESULT_RECEIVER", resultReceiver2);
        intent.setFlags(C.DEFAULT_BUFFER_SEGMENT_SIZE);
    }

    public static boolean b(Bundle bundle, Function2 function2, Executor executor, oy3 oy3Var, CancellationSignal cancellationSignal) {
        bundle.getClass();
        if (!bundle.getBoolean("FAILURE_RESPONSE")) {
            return false;
        }
        Object invoke = function2.invoke(bundle.getString("EXCEPTION_TYPE"), bundle.getString("EXCEPTION_MESSAGE"));
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (fz3.a(cancellationSignal)) {
            return true;
        }
        executor.execute(new mc3(8, oy3Var, invoke));
        Unit unit = Unit.a;
        return true;
    }
}

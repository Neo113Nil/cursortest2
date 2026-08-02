package n3;

import android.app.Application;
import android.net.NetworkRequest;
import e3.x;
import io.sentry.android.core.w0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class a {
    public static i a(int[] capabilities, int[] transports) {
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        Intrinsics.checkNotNullParameter(transports, "transports");
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        Intrinsics.checkNotNullParameter(transports, "transports");
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i5 : capabilities) {
            try {
                builder.addCapability(i5);
            } catch (IllegalArgumentException e7) {
                x e9 = x.e();
                String str = i.f20835b;
                String str2 = i.f20835b;
                String str3 = "Ignoring adding capability '" + i5 + '\'';
                if (e9.f8571a <= 5) {
                    w0.n(str2, str3, e7);
                }
            }
        }
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = j.f20837a[i10];
            if (!kotlin.collections.p.n(capabilities, i11)) {
                try {
                    builder.removeCapability(i11);
                } catch (IllegalArgumentException e10) {
                    x e11 = x.e();
                    String str4 = i.f20835b;
                    String str5 = i.f20835b;
                    String str6 = "Ignoring removing default capability '" + i11 + '\'';
                    if (e11.f8571a <= 5) {
                        w0.n(str5, str6, e10);
                    }
                }
            }
        }
        for (int i12 : transports) {
            builder.addTransportType(i12);
        }
        NetworkRequest build = builder.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return new i(build);
    }

    public static String b() {
        String processName = Application.getProcessName();
        Intrinsics.checkNotNullExpressionValue(processName, "getProcessName(...)");
        return processName;
    }

    public static boolean c(NetworkRequest request, int i5) {
        Intrinsics.checkNotNullParameter(request, "request");
        return request.hasCapability(i5);
    }

    public static boolean d(NetworkRequest request, int i5) {
        Intrinsics.checkNotNullParameter(request, "request");
        return request.hasTransport(i5);
    }
}

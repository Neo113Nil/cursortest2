package k5;

import android.content.Context;
import android.os.Debug;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* loaded from: classes8.dex */
final class C1 extends D0<Integer> {

    /* renamed from: f, reason: collision with root package name */
    private static final String f70519f = C7563s0.a(new byte[]{44, -23, -19, 115, -86, 9, -62, 107, 106, 64, -105, -113, -124, -65, -95, 44, -38, 21, 68, -63, -25, -78, 107, -4, -48, 19, -21, -47, 31, 71, 107, 62});

    /* renamed from: g, reason: collision with root package name */
    private static final String f70520g = C7563s0.a(new byte[]{39, -59, 107, 94, -10, -51, -74, -37, -60, -76, 59, -79, -95, 87, 87, 63});

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final Context f70521e;

    C1(@NonNull Context context) {
        super(Mm0.e.Debugger);
        this.f70521e = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        if (java.lang.Integer.decode(r4.substring(r6.length() + 1).trim()).intValue() <= 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        r1 = true;
     */
    @Override // k5.D0
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final Integer s() throws D1 {
        boolean z11 = false;
        int i11 = (this.f70521e.getApplicationInfo().flags & 2) != 0 ? 1 : 0;
        if (Debug.isDebuggerConnected()) {
            i11 |= 2;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(f70519f)), UserVerificationMethods.USER_VERIFY_ALL);
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    int length = readLine.length();
                    String str = f70520g;
                    if (length > str.length() && readLine.substring(0, str.length()).equalsIgnoreCase(str)) {
                        break;
                    }
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            bufferedReader.close();
        } catch (IOException | NumberFormatException unused) {
        }
        if (z11) {
            i11 |= 4;
        }
        return Integer.valueOf(i11);
    }
}

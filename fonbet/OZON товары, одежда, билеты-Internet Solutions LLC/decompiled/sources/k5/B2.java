package k5;

import androidx.annotation.NonNull;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* loaded from: classes8.dex */
public final class B2 extends D0<String> {

    /* renamed from: e, reason: collision with root package name */
    private static final String f70516e = C7563s0.a(new byte[]{-108, 34, 36, -31, -21, 4, 55, -21, -51, -89, -116, 86, -6, 0, 34, 70, -20, 84, 110, -85, 21, 92, 27, -123, 39, -92, 67, -48, -104, -38, -103, 117});

    @Override // k5.D0
    @NonNull
    protected final String s() throws D1 {
        try {
            FileInputStream fileInputStream = new FileInputStream(f70516e);
            try {
                String trim = new BufferedReader(new InputStreamReader(fileInputStream)).readLine().trim();
                fileInputStream.close();
                return trim;
            } finally {
            }
        } catch (IOException unused) {
            throw new P2(C7563s0.a(new byte[]{-22, -49, -23, -24, 100, 125, -50, -90, 8, -5, 49, 36, 125, -116, -18, -36, 54, -118, 38, -79, 115, -66, 109, -5, 74, -38, -2, -12, -13, -122, 124, 32, 66, 110, 6, -14, 26, -46, -53, 5, Byte.MIN_VALUE, 110, 102, 51, -42, -110, -97, 91, -2, -102, 107, -98, -122, 59, 82, 86, 100, -74, 51, -115, -37, 64, -51, -67}));
        }
    }
}

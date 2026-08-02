package nh;

import androidx.appcompat.widget.c1;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class s {
    public static int a(int i5, int i10, int i11) {
        if ((i10 & 8) != 0) {
            i5--;
        }
        if (i11 <= i5) {
            return i5 - i11;
        }
        throw new IOException(c1.j(i11, "PROTOCOL_ERROR padding ", " > remaining length ", i5));
    }
}

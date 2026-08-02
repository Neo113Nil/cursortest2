package rf;

import com.google.android.gms.internal.measurement.y4;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p extends y4 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p(File file, File file2, String str, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        super(file, file2, str);
        file2 = (i5 & 2) != 0 ? null : file2;
        str = (i5 & 4) != 0 ? null : str;
        Intrinsics.checkNotNullParameter(file, "file");
    }
}

package C8;

import C8.c;
import android.os.Build;

/* loaded from: classes2.dex */
public final class e implements c.b {
    @Override // C8.c.b
    public void a(String str) {
        System.loadLibrary(str);
    }

    @Override // C8.c.b
    public String b(String str) {
        return (str.startsWith("lib") && str.endsWith(".so")) ? str : System.mapLibraryName(str);
    }

    @Override // C8.c.b
    public String c(String str) {
        return str.substring(3, str.length() - 3);
    }

    @Override // C8.c.b
    public String[] d() {
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr.length > 0) {
            return strArr;
        }
        String str = Build.CPU_ABI2;
        return !f.a(str) ? new String[]{Build.CPU_ABI, str} : new String[]{Build.CPU_ABI};
    }

    @Override // C8.c.b
    public void e(String str) {
        System.load(str);
    }
}

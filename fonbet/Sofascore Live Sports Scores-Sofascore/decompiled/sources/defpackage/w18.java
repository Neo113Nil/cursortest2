package defpackage;

import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class w18 extends t18 {
    public boolean b;
    public File[] c;
    public int d;
    public final /* synthetic */ z55 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w18(z55 z55Var, File file) {
        super(file);
        file.getClass();
        this.e = z55Var;
    }

    @Override // defpackage.x18
    public final File a() {
        Function2 function2;
        y18 y18Var = (y18) this.e.c;
        boolean z = this.b;
        File file = this.a;
        if (z) {
            File[] fileArr = this.c;
            if (fileArr == null || this.d < fileArr.length) {
                if (fileArr == null) {
                    File[] listFiles = file.listFiles();
                    this.c = listFiles;
                    if (listFiles == null && (function2 = y18Var.e) != null) {
                        File file2 = this.a;
                        function2.invoke(file2, new l9(file2, null, "Cannot list files in a directory", 2, null));
                    }
                    fileArr = this.c;
                    if (fileArr == null || fileArr.length == 0) {
                        Function1 function1 = y18Var.d;
                        if (function1 != null) {
                            function1.invoke(file);
                        }
                    }
                }
                fileArr.getClass();
                int i = this.d;
                this.d = i + 1;
                return fileArr[i];
            }
            Function1 function12 = y18Var.d;
            if (function12 != null) {
                function12.invoke(file);
                return null;
            }
        } else {
            Function1 function13 = y18Var.c;
            if (function13 == null || ((Boolean) function13.invoke(file)).booleanValue()) {
                this.b = true;
                return file;
            }
        }
        return null;
    }
}

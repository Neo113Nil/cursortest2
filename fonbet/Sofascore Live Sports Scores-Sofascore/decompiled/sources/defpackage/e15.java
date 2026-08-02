package defpackage;

import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class e15 extends RuntimeException {
    public final df3 a;

    public e15(df3 df3Var) {
        this.a = df3Var;
        if (df3Var.b) {
            return;
        }
        int[] iArr = {201, 202, 204, 206, 207, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, -127, 126665345, 200};
        List list = df3Var.a;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            ef3 ef3Var = (ef3) list.get(i);
            if (!ph0.s(ef3Var.a, iArr)) {
                if (ef3Var.a == 100) {
                    int i3 = i + 2;
                    if (i3 < size && ((ef3) list.get(i3)).a == 1000) {
                        break;
                    } else {
                        o13.E(arrayList);
                    }
                } else {
                    arrayList.add(ef3Var);
                }
            }
            i = i2;
        }
        int size2 = arrayList.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
        for (int i4 = 0; i4 < size2; i4++) {
            stackTraceElementArr[i4] = new StackTraceElement("$$compose", "m$" + ((ef3) arrayList.get(i4)).a, "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        df3 df3Var = this.a;
        if (!df3Var.b) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        xbb b = a.b();
        sxb F = p13.F(df3Var.a);
        int size = F.size();
        for (int i = 0; i < size; i++) {
            ((ef3) F.get(i)).getClass();
        }
        sxb F2 = p13.F(a.a(b));
        int size2 = F2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            String str = (String) F2.get(i2);
            sb.append("\tat ");
            sb.append(str);
            sb.append('\n');
        }
        return sb.toString();
    }
}

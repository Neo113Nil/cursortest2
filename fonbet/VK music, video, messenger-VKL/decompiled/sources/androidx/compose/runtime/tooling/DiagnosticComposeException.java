package androidx.compose.runtime.tooling;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import org.chromium.net.NetError;
import xsna.e43;
import xsna.epx;
import xsna.fgg0;
import xsna.g5g;
import xsna.pgk0;
import xsna.qqi;
import xsna.rl3;
import xsna.vqi;
import xsna.yyz;

/* compiled from: DiagnosticComposeException.jvmAndAndroid.kt */
/* loaded from: classes11.dex */
public final class DiagnosticComposeException extends RuntimeException {
    private final qqi trace;

    public DiagnosticComposeException(qqi qqiVar) {
        this.trace = qqiVar;
        if (qqiVar.b) {
            return;
        }
        int[] iArr = {201, 202, 204, 206, 207, 125, NetError.ERR_PROXY_AUTH_REQUESTED, 126665345, 200};
        List<vqi> list = qqiVar.a;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            vqi vqiVar = list.get(i);
            if (!rl3.E(vqiVar.a, iArr)) {
                if (vqiVar.a == 100) {
                    int i3 = i + 2;
                    if (i3 < size && list.get(i3).a == 1000) {
                        break;
                    } else {
                        g5g.J(arrayList);
                    }
                } else {
                    arrayList.add(vqiVar);
                }
            }
            i = i2;
        }
        int size2 = arrayList.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
        for (int i4 = 0; i4 < size2; i4++) {
            stackTraceElementArr[i4] = new StackTraceElement("$$compose", "m$" + ((vqi) arrayList.get(i4)).a, "SourceFile", 1);
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
        if (!this.trace.b) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        qqi qqiVar = this.trace;
        ListBuilder e = e43.e();
        fgg0 fgg0Var = new fgg0(qqiVar.a);
        int size = fgg0Var.size();
        String str = null;
        String str2 = null;
        for (int i = 0; i < size; i++) {
            vqi vqiVar = (vqi) fgg0Var.get(i);
            pgk0 pgk0Var = vqiVar.b;
            Integer num = vqiVar.c;
            if (pgk0Var != null) {
                boolean z = pgk0Var.a;
                String str3 = pgk0Var.b;
                if (str3 == null) {
                    String str4 = z ? "<lambda>" : null;
                    if (str4 != null) {
                        str = str4;
                    } else if (str == null) {
                        str = "<unknown function>";
                    }
                } else {
                    str = str3;
                }
                String str5 = pgk0Var.c;
                if (str5 != null) {
                    str2 = str5;
                } else if (str2 == null) {
                    str2 = "<unknown file>";
                }
                List<yyz> list = pgk0Var.f;
                String str6 = str + '(' + str2 + ':' + ((num == null || num.intValue() >= list.size()) ? "<unknown line>" : String.valueOf(list.get(num.intValue()).a)) + ')';
                if (!z) {
                }
                if (!epx.f(str3, "rememberCompositionContext") || !epx.f(pgk0Var.e, "9igjgp")) {
                    e.add(str6);
                }
            }
        }
        fgg0 fgg0Var2 = new fgg0(e.g());
        int size2 = fgg0Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            String str7 = (String) fgg0Var2.get(i2);
            sb.append("\tat ");
            sb.append(str7);
            sb.append('\n');
        }
        return sb.toString();
    }
}

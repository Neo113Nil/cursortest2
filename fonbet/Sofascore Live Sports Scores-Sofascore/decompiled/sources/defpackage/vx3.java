package defpackage;

import android.os.Build;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.Optional;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class vx3 {
    public static final Charset e = Charset.forName(C.UTF8_NAME);
    public static final int f = 15;
    public static final tx3 g = new tx3();
    public static final z h = new z(11);
    public static final dw3 i = new dw3(3);
    public final AtomicInteger a = new AtomicInteger(0);
    public final r18 b;
    public final ng2 c;
    public final ew3 d;

    public vx3(r18 r18Var, ng2 ng2Var, ew3 ew3Var) {
        this.b = r18Var;
        this.c = ng2Var;
        this.d = ew3Var;
    }

    public static void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String f(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void g(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final nx3 a(String str, ft0 ft0Var) {
        String str2 = ft0Var.b;
        return (Build.VERSION.SDK_INT < 37 || !(str2.equals("crash") || str2.equals("ndk-crash"))) ? ft0Var : (nx3) Optional.of(this.b.k(str, "profiling-manager-info")).filter(new gw3(1)).flatMap(new mn0(2)).map(new ux3(ft0Var, 0)).orElse(ft0Var);
    }

    public final ArrayList c() {
        ArrayList arrayList = new ArrayList();
        r18 r18Var = this.b;
        arrayList.addAll(r18.s(((File) r18Var.f).listFiles()));
        arrayList.addAll(r18.s(((File) r18Var.g).listFiles()));
        z zVar = h;
        Collections.sort(arrayList, zVar);
        List s = r18.s(((File) r18Var.e).listFiles());
        Collections.sort(s, zVar);
        arrayList.addAll(s);
        return arrayList;
    }

    public final NavigableSet d() {
        return new TreeSet(r18.s(((File) this.b.d).list())).descendingSet();
    }

    public final void e(nx3 nx3Var, String str, boolean z) {
        r18 r18Var = this.b;
        int i2 = this.c.g().a.b;
        g.getClass();
        try {
            g(r18Var.k(str, lnb.o("event", String.format(Locale.US, "%010d", Integer.valueOf(this.a.getAndIncrement())), z ? "_" : "")), tx3.a.m(nx3Var));
        } catch (IOException unused) {
        }
        dw3 dw3Var = new dw3(4);
        File file = new File((File) r18Var.d, str);
        file.mkdirs();
        List<File> s = r18.s(file.listFiles(dw3Var));
        Collections.sort(s, new z(12));
        int size = s.size();
        for (File file2 : s) {
            if (size <= i2) {
                return;
            }
            r18.r(file2);
            size--;
        }
    }
}

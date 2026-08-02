package defpackage;

import java.io.File;
import java.security.PrivilegedAction;
import java.util.logging.Logger;
import org.bouncycastle.crypto.a;

/* loaded from: classes7.dex */
public final class j4d implements PrivilegedAction {
    public final /* synthetic */ int a;

    public /* synthetic */ j4d(int i) {
        this.a = i;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        Logger logger;
        StringBuilder sb;
        File file;
        Logger logger2;
        StringBuilder sb2;
        switch (this.a) {
            case 0:
                File file2 = new File(fef.a("java.io.tmpdir"));
                if (file2.exists()) {
                    try {
                        long nanoTime = System.nanoTime();
                        int i = 0;
                        while (true) {
                            if (i < 1000) {
                                file = new File(file2, "bc-lts-jni" + Long.toString(i + nanoTime, 32) + "-libs");
                                if (!file.mkdirs()) {
                                    Thread.sleep(nanoTime % 97);
                                    i++;
                                }
                            } else {
                                file = null;
                            }
                        }
                        if (file == null) {
                            Logger logger3 = a.a;
                            a.b = "unable to create directory in " + file2 + " after 1000 unique attempts";
                            logger2 = a.a;
                            sb2 = new StringBuilder();
                            sb2.append("exited with ");
                            sb2.append(a.b);
                        } else {
                            if (file.exists()) {
                                Runtime.getRuntime().addShutdownHook(new Thread(new kac(file, 1)));
                                return file;
                            }
                            Logger logger4 = a.a;
                            a.b = "unable to create temp directory for jni libs: " + file;
                            logger2 = a.a;
                            sb2 = new StringBuilder();
                            sb2.append("exited with ");
                            sb2.append(a.b);
                        }
                        logger2.fine(sb2.toString());
                        return null;
                    } catch (Exception e) {
                        Logger logger5 = a.a;
                        a.b = bf3.j(e, new StringBuilder("failed because it was not able to create a temporary file in 'java.io.tmpdir' "));
                        logger = a.a;
                        sb = new StringBuilder("exited with ");
                    }
                } else {
                    Logger logger6 = a.a;
                    a.b = file2 + " did not exist";
                    logger = a.a;
                    sb = new StringBuilder("exited with ");
                }
                sb.append(a.b);
                logger.fine(sb.toString());
                return null;
            default:
                return System.getProperty("line.separator");
        }
    }
}

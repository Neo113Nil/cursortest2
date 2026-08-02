package defpackage;

import com.sofascore.model.mvvm.model.StatusKt;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class uha extends s18 {
    @Override // defpackage.s18
    public final tha C(uae uaeVar) {
        uaeVar.getClass();
        return new tha(true, new RandomAccessFile(uaeVar.toFile(), "rw"));
    }

    @Override // defpackage.s18
    public final ejh H(uae uaeVar, boolean z) {
        uaeVar.getClass();
        if (!z || !k(uaeVar)) {
            return new wk0(new FileOutputStream(uaeVar.toFile(), false), new pij());
        }
        throw new IOException(uaeVar + " already exists.");
    }

    @Override // defpackage.s18
    public final cwh M(uae uaeVar) {
        uaeVar.getClass();
        return new xk0(new FileInputStream(uaeVar.toFile()), pij.d);
    }

    @Override // defpackage.s18
    public final ejh e(uae uaeVar) {
        uaeVar.getClass();
        return new wk0(new FileOutputStream(uaeVar.toFile(), true), new pij());
    }

    @Override // defpackage.s18
    public void f(uae uaeVar, uae uaeVar2) {
        uaeVar.getClass();
        uaeVar2.getClass();
        if (uaeVar.toFile().renameTo(uaeVar2.toFile())) {
            return;
        }
        throw new IOException("failed to move " + uaeVar + " to " + uaeVar2);
    }

    @Override // defpackage.s18
    public final void h(uae uaeVar) {
        uaeVar.getClass();
        if (uaeVar.toFile().mkdir()) {
            return;
        }
        ux4 p = p(uaeVar);
        if (p == null || !p.c) {
            yhk.u(uaeVar, "failed to create directory: ");
        }
    }

    @Override // defpackage.s18
    public final void i(uae uaeVar) {
        uaeVar.getClass();
        if (Thread.interrupted()) {
            throw new InterruptedIOException(StatusKt.STATUS_INTERRUPTED);
        }
        File file = uaeVar.toFile();
        if (file.delete() || !file.exists()) {
            return;
        }
        yhk.u(uaeVar, "failed to delete ");
    }

    @Override // defpackage.s18
    public final List m(uae uaeVar) {
        uaeVar.getClass();
        File file = uaeVar.toFile();
        String[] list = file.list();
        if (list == null) {
            if (file.exists()) {
                yhk.u(uaeVar, "failed to list ");
                return null;
            }
            hg6.h(uaeVar, "no such file: ");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            str.getClass();
            arrayList.add(uaeVar.e(str));
        }
        n13.t(arrayList);
        return arrayList;
    }

    @Override // defpackage.s18
    public ux4 p(uae uaeVar) {
        uaeVar.getClass();
        File file = uaeVar.toFile();
        boolean isFile = file.isFile();
        boolean isDirectory = file.isDirectory();
        long lastModified = file.lastModified();
        long length = file.length();
        if (isFile || isDirectory || lastModified != 0 || length != 0 || file.exists()) {
            return new ux4(isFile, isDirectory, null, Long.valueOf(length), null, Long.valueOf(lastModified), null);
        }
        return null;
    }

    @Override // defpackage.s18
    public final tha t(uae uaeVar) {
        return new tha(false, new RandomAccessFile(uaeVar.toFile(), "r"));
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}

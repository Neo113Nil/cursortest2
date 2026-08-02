package com.bytedance.sdk.openadsdk.sf;

import com.bytedance.sdk.component.utils.qf;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class pcc {
    protected boolean pcc = false;
    private final ExecutorService sf = Executors.newSingleThreadExecutor();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.sdk.openadsdk.sf.pcc$pcc, reason: collision with other inner class name */
    public class CallableC0128pcc implements Callable<Void> {
        private final File sf;

        private CallableC0128pcc(File file) {
            this.sf = file;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            pcc.this.sf(this.sf);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf(File file) throws IOException {
        if (!this.pcc) {
            try {
                qf.sf(file);
            } catch (Throwable unused) {
            }
            pcc(qf.pcc(file.getParentFile()));
        } else {
            List<File> pcc = qf.pcc(file);
            pcc.toString();
            pcc(pcc);
        }
    }

    public void pcc(File file) throws IOException {
        this.sf.submit(new CallableC0128pcc(file));
    }

    public abstract void pcc(List<File> list);

    public abstract boolean pcc(long j, int i);

    public abstract boolean pcc(File file, long j, int i);

    public long sf(List<File> list) {
        Iterator<File> it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += it.next().length();
        }
        return j;
    }
}

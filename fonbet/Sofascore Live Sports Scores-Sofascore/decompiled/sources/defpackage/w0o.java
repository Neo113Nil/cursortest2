package defpackage;

import android.os.AsyncTask;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class w0o extends AsyncTask {
    public d1o a;
    public final c0l b;

    public w0o(c0l c0lVar) {
        this.b = c0lVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        d1o d1oVar = this.a;
        if (d1oVar != null) {
            d1oVar.c = null;
            w0o w0oVar = (w0o) d1oVar.b.poll();
            d1oVar.c = w0oVar;
            if (w0oVar != null) {
                w0oVar.executeOnExecutor(d1oVar.a, new Object[0]);
            }
        }
    }
}

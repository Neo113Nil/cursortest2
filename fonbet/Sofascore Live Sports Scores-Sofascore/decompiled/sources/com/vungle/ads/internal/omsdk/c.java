package com.vungle.ads.internal.omsdk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.iab.omid.library.vungle.Omid;
import com.iab.omid.library.vungle.internal.l;
import com.vungle.ads.R;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import defpackage.d7a;
import defpackage.p2g;
import defpackage.u2g;
import defpackage.w2g;
import defpackage.xtl;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class c {
    public final Context a;
    public final Handler b;
    public AtomicReference c;
    public AtomicReference d;

    public c(Context context) {
        context.getClass();
        this.a = context;
        this.b = new Handler(Looper.getMainLooper());
        this.c = new AtomicReference(null);
        this.d = new AtomicReference(null);
    }

    public final void a(File file) {
        FileWriter fileWriter;
        file.getClass();
        ArrayList arrayList = new ArrayList();
        File file2 = new File(file, "omsdk.js");
        if (!file2.exists()) {
            boolean z = u.a;
            StringBuilder a = l.a("injecting omsdk.js to ");
            a.append(file2.getAbsolutePath());
            t.a("OMInjector", a.toString());
            String a2 = a();
            if (a2 != null) {
                fileWriter = new FileWriter(file2);
                try {
                    fileWriter.write(a2);
                    fileWriter.flush();
                    fileWriter.close();
                } finally {
                }
            }
            arrayList.add(file2);
        }
        File file3 = new File(file, "omsdk-session.js");
        if (file3.exists()) {
            return;
        }
        boolean z2 = u.a;
        StringBuilder a3 = l.a("injecting omsdk-session.js to ");
        a3.append(file3.getAbsolutePath());
        t.a("OMInjector", a3.toString());
        String str = (String) this.d.get();
        if (str == null) {
            str = a(R.raw.omid_session_client_v1_6_2);
            this.d.set(str);
        }
        if (str != null) {
            fileWriter = new FileWriter(file3);
            try {
                fileWriter.write(str);
                fileWriter.flush();
                fileWriter.close();
            } finally {
            }
        }
        arrayList.add(file3);
    }

    public final void b() {
        this.b.post(new xtl(this, 4));
    }

    public static final void a(c cVar) {
        Object u2gVar;
        cVar.getClass();
        try {
            p2g p2gVar = w2g.b;
            if (!Omid.isActive()) {
                Omid.activate(cVar.a);
            }
            u2gVar = Unit.a;
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        Throwable a = w2g.a(u2gVar);
        if (a != null) {
            boolean z = u.a;
            StringBuilder a2 = l.a("error: ");
            a2.append(a.getLocalizedMessage());
            t.b("OMInjector", a2.toString());
        }
    }

    public final String a() {
        String str = (String) this.c.get();
        if (str != null) {
            return str;
        }
        String a = a(R.raw.omsdk_v1_6_2);
        this.c.set(a);
        return a;
    }

    public final String a(int i) {
        Object u2gVar;
        try {
            p2g p2gVar = w2g.b;
            InputStream openRawResource = this.a.getResources().openRawResource(i);
            openRawResource.getClass();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openRawResource, Charsets.UTF_8), 8192);
            try {
                u2gVar = d7a.E(bufferedReader);
                bufferedReader.close();
            } finally {
            }
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        if (u2gVar instanceof u2g) {
            u2gVar = null;
        }
        return (String) u2gVar;
    }
}

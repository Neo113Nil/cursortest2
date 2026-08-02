package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.util.Base64OutputStream;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.f9e0;
import xsna.g1v;
import xsna.h1v;
import xsna.hgq0;
import xsna.i1v;
import xsna.lfl;
import xsna.nfl;
import xsna.wkq0;

/* compiled from: DefaultHeartBeatController.java */
/* loaded from: classes.dex */
public final class a implements h1v, HeartBeatInfo {
    public final nfl a;
    public final Context b;
    public final f9e0<hgq0> c;
    public final Set<g1v> d;
    public final Executor e;

    public a() {
        throw null;
    }

    public a(Context context, String str, Set<g1v> set, f9e0<hgq0> f9e0Var, Executor executor) {
        this.a = new nfl(context, str);
        this.d = set;
        this.e = executor;
        this.c = f9e0Var;
        this.b = context;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatInfo
    @NonNull
    public final synchronized HeartBeatInfo.HeartBeat a() {
        boolean g;
        long currentTimeMillis = System.currentTimeMillis();
        i1v i1vVar = (i1v) this.a.get();
        synchronized (i1vVar) {
            g = i1vVar.g(currentTimeMillis);
        }
        if (!g) {
            return HeartBeatInfo.HeartBeat.NONE;
        }
        synchronized (i1vVar) {
            String d = i1vVar.d(System.currentTimeMillis());
            i1vVar.a.edit().putString("last-used-date", d).commit();
            i1vVar.f(d);
        }
        return HeartBeatInfo.HeartBeat.GLOBAL;
    }

    @Override // xsna.h1v
    public final Task<String> b() {
        if (!wkq0.a(this.b)) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.e, new Callable() { // from class: xsna.mfl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String byteArrayOutputStream;
                com.google.firebase.heartbeatinfo.a aVar = com.google.firebase.heartbeatinfo.a.this;
                synchronized (aVar) {
                    try {
                        i1v i1vVar = (i1v) aVar.a.get();
                        ArrayList c = i1vVar.c();
                        i1vVar.b();
                        JSONArray jSONArray = new JSONArray();
                        for (int i = 0; i < c.size(); i++) {
                            j1v j1vVar = (j1v) c.get(i);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", j1vVar.c());
                            jSONObject.put("dates", new JSONArray((Collection) j1vVar.b()));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes(C.UTF8_NAME));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                byteArrayOutputStream = byteArrayOutputStream2.toString(C.UTF8_NAME);
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return byteArrayOutputStream;
            }
        });
    }

    public final void c() {
        if (this.d.size() <= 0) {
            Tasks.forResult(null);
        } else if (!wkq0.a(this.b)) {
            Tasks.forResult(null);
        } else {
            Tasks.call(this.e, new lfl(this, 0));
        }
    }
}

package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.internal.common.zzg;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import z.C6900a;

/* loaded from: classes2.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f32583a = Collections.synchronizedMap(new C6900a());

    /* renamed from: b, reason: collision with root package name */
    public int f32584b = 0;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f32585c;

    public final AbstractC3136j a(String str, Class cls) {
        return (AbstractC3136j) cls.cast(this.f32583a.get(str));
    }

    public final void b(String str, AbstractC3136j abstractC3136j) {
        Map map = this.f32583a;
        if (map.containsKey(str)) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 59);
            sb2.append("LifecycleCallback with tag ");
            sb2.append(str);
            sb2.append(" already added to this fragment.");
            throw new IllegalArgumentException(sb2.toString());
        }
        map.put(str, abstractC3136j);
        if (this.f32584b > 0) {
            new zzg(Looper.getMainLooper()).post(new r1(this, abstractC3136j, str));
        }
    }

    public final void c(Bundle bundle) {
        this.f32584b = 1;
        this.f32585c = bundle;
        for (Map.Entry entry : this.f32583a.entrySet()) {
            ((AbstractC3136j) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void d() {
        this.f32584b = 2;
        Iterator it = this.f32583a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC3136j) it.next()).onStart();
        }
    }

    public final void e() {
        this.f32584b = 3;
        Iterator it = this.f32583a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC3136j) it.next()).onResume();
        }
    }

    public final void f(int i10, int i11, Intent intent) {
        Iterator it = this.f32583a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC3136j) it.next()).onActivityResult(i10, i11, intent);
        }
    }

    public final void g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f32583a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((AbstractC3136j) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    public final void h() {
        this.f32584b = 4;
        Iterator it = this.f32583a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC3136j) it.next()).onStop();
        }
    }

    public final void i() {
        this.f32584b = 5;
        Iterator it = this.f32583a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC3136j) it.next()).onDestroy();
        }
    }

    public final void j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        Iterator it = this.f32583a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC3136j) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final /* synthetic */ int k() {
        return this.f32584b;
    }

    public final /* synthetic */ Bundle l() {
        return this.f32585c;
    }
}

package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class q1 extends Fragment implements InterfaceC3138k {

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f32561b = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final s1 f32562a = new s1();

    public static q1 a(Activity activity) {
        q1 q1Var;
        WeakHashMap weakHashMap = f32561b;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (q1Var = (q1) weakReference.get()) != null) {
            return q1Var;
        }
        try {
            q1 q1Var2 = (q1) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (q1Var2 == null || q1Var2.isRemoving()) {
                q1Var2 = new q1();
                activity.getFragmentManager().beginTransaction().add(q1Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(q1Var2));
            return q1Var2;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3138k
    public final Activity Q() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        this.f32562a.j(str, fileDescriptor, printWriter, strArr);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3138k
    public final void h(String str, AbstractC3136j abstractC3136j) {
        this.f32562a.b(str, abstractC3136j);
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        this.f32562a.f(i10, i11, intent);
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f32562a.c(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f32562a.i();
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f32562a.e();
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f32562a.g(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f32562a.d();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f32562a.h();
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3138k
    public final AbstractC3136j s(String str, Class cls) {
        return this.f32562a.a(str, cls);
    }
}

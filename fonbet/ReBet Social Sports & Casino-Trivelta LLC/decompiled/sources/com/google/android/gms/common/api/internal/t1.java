package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.AbstractActivityC2168s;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class t1 extends Fragment implements InterfaceC3138k {

    /* renamed from: n, reason: collision with root package name */
    public static final WeakHashMap f32587n = new WeakHashMap();

    /* renamed from: m, reason: collision with root package name */
    public final s1 f32588m = new s1();

    public static t1 d0(AbstractActivityC2168s abstractActivityC2168s) {
        t1 t1Var;
        FragmentManager supportFragmentManager = abstractActivityC2168s.getSupportFragmentManager();
        WeakHashMap weakHashMap = f32587n;
        WeakReference weakReference = (WeakReference) weakHashMap.get(abstractActivityC2168s);
        if (weakReference != null && (t1Var = (t1) weakReference.get()) != null) {
            return t1Var;
        }
        try {
            t1 t1Var2 = (t1) supportFragmentManager.p0("SLifecycleFragmentImpl");
            if (t1Var2 == null || t1Var2.isRemoving()) {
                t1Var2 = new t1();
                supportFragmentManager.s().e(t1Var2, "SLifecycleFragmentImpl").i();
            }
            weakHashMap.put(abstractActivityC2168s, new WeakReference(t1Var2));
            return t1Var2;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3138k
    public final Activity Q() {
        return getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        this.f32588m.j(str, fileDescriptor, printWriter, strArr);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3138k
    public final void h(String str, AbstractC3136j abstractC3136j) {
        this.f32588m.b(str, abstractC3136j);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        this.f32588m.f(i10, i11, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f32588m.c(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f32588m.i();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f32588m.e();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f32588m.g(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f32588m.d();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f32588m.h();
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3138k
    public final AbstractC3136j s(String str, Class cls) {
        return this.f32588m.a(str, cls);
    }
}

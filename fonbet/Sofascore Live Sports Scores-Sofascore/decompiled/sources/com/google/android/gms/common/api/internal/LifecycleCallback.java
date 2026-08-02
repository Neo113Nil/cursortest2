package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.fp8;
import defpackage.sw9;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
/* loaded from: classes3.dex */
public class LifecycleCallback {

    @NonNull
    @KeepForSdk
    protected final LifecycleFragment mLifecycleFragment;

    public LifecycleCallback(LifecycleFragment lifecycleFragment) {
        this.mLifecycleFragment = lifecycleFragment;
    }

    @NonNull
    @KeepForSdk
    public static LifecycleFragment getFragment(@NonNull LifecycleActivity lifecycleActivity) {
        zza zzaVar;
        zzd zzdVar;
        Activity activity = lifecycleActivity.a;
        if (!(activity instanceof FragmentActivity)) {
            WeakHashMap weakHashMap = zza.b;
            WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
            if (weakReference != null && (zzaVar = (zza) weakReference.get()) != null) {
                return zzaVar;
            }
            try {
                zza zzaVar2 = (zza) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (zzaVar2 == null || zzaVar2.isRemoving()) {
                    zzaVar2 = new zza();
                    activity.getFragmentManager().beginTransaction().add(zzaVar2, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                weakHashMap.put(activity, new WeakReference(zzaVar2));
                return zzaVar2;
            } catch (ClassCastException e) {
                sw9.m("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
                return null;
            }
        }
        FragmentActivity fragmentActivity = (FragmentActivity) activity;
        WeakHashMap weakHashMap2 = zzd.b;
        fp8 k = fragmentActivity.k();
        WeakHashMap weakHashMap3 = zzd.b;
        WeakReference weakReference2 = (WeakReference) weakHashMap3.get(fragmentActivity);
        if (weakReference2 != null && (zzdVar = (zzd) weakReference2.get()) != null) {
            return zzdVar;
        }
        try {
            zzd zzdVar2 = (zzd) k.F("SLifecycleFragmentImpl");
            if (zzdVar2 == null || zzdVar2.isRemoving()) {
                zzdVar2 = new zzd();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(k);
                aVar.i(0, zzdVar2, "SLifecycleFragmentImpl", 1);
                aVar.g(true, true);
            }
            weakHashMap3.put(fragmentActivity, new WeakReference(zzdVar2));
            return zzdVar2;
        } catch (ClassCastException e2) {
            sw9.m("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e2);
            return null;
        }
    }

    @NonNull
    @KeepForSdk
    public Activity getActivity() {
        Activity g = this.mLifecycleFragment.g();
        Preconditions.i(g);
        return g;
    }

    @KeepForSdk
    public void onDestroy() {
    }

    @KeepForSdk
    public void onResume() {
    }

    @KeepForSdk
    public void onStart() {
    }

    public void onStop() {
    }

    @KeepForSdk
    public void onCreate(@Nullable Bundle bundle) {
    }

    @KeepForSdk
    public void onSaveInstanceState(@NonNull Bundle bundle) {
    }

    @KeepForSdk
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
    }

    @NonNull
    @KeepForSdk
    public static LifecycleFragment getFragment(@NonNull Activity activity) {
        return getFragment(new LifecycleActivity(activity));
    }

    @NonNull
    @KeepForSdk
    public static LifecycleFragment getFragment(@NonNull ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public void dump(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
    }
}

package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IFragmentWrapper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
/* loaded from: classes.dex */
public final class SupportFragmentWrapper extends IFragmentWrapper.Stub {
    public final Fragment a;

    public SupportFragmentWrapper(Fragment fragment) {
        this.a = fragment;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void N0(Intent intent, int i) {
        this.a.startActivityForResult(intent, i);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void O3(Intent intent) {
        this.a.startActivity(intent);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void P1(IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.Z1(iObjectWrapper);
        Preconditions.i(view);
        this.a.unregisterForContextMenu(view);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void W1(boolean z) {
        this.a.setUserVisibleHint(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void i0(boolean z) {
        this.a.setMenuVisibility(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void r(IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.Z1(iObjectWrapper);
        Preconditions.i(view);
        this.a.registerForContextMenu(view);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final ObjectWrapper zzb() {
        return new ObjectWrapper(this.a.getActivity());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final Bundle zzc() {
        return this.a.getArguments();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int zzd() {
        return this.a.getId();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IFragmentWrapper zze() {
        Fragment parentFragment = this.a.getParentFragment();
        if (parentFragment != null) {
            return new SupportFragmentWrapper(parentFragment);
        }
        return null;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final ObjectWrapper zzf() {
        return new ObjectWrapper(this.a.getResources());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzg() {
        return this.a.getRetainInstance();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final String zzh() {
        return this.a.getTag();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IFragmentWrapper zzi() {
        Fragment targetFragment = this.a.getTargetFragment();
        if (targetFragment != null) {
            return new SupportFragmentWrapper(targetFragment);
        }
        return null;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int zzj() {
        return this.a.getTargetRequestCode();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzk() {
        return this.a.getUserVisibleHint();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final ObjectWrapper zzl() {
        return new ObjectWrapper(this.a.getView());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzm() {
        return this.a.isAdded();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzn() {
        return this.a.isDetached();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzo() {
        return this.a.isHidden();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzp() {
        return this.a.isInLayout();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzq() {
        return this.a.isRemoving();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzr() {
        return this.a.isResumed();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzs() {
        return this.a.isVisible();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzu(boolean z) {
        this.a.setHasOptionsMenu(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzw(boolean z) {
        this.a.setRetainInstance(z);
    }
}

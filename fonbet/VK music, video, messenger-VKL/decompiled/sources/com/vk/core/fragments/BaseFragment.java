package com.vk.core.fragments;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import xsna.gzs;
import xsna.qt2;
import xsna.s3q0;
import xsna.v86;

/* compiled from: BaseFragment.kt */
/* loaded from: classes.dex */
public class BaseFragment extends FragmentImpl {
    public static final /* synthetic */ int R = 0;
    public final Handler N = new Handler(Looper.getMainLooper());
    public final io.reactivex.rxjava3.disposables.b O = new io.reactivex.rxjava3.disposables.b();
    public io.reactivex.rxjava3.disposables.b P = new io.reactivex.rxjava3.disposables.b();
    public io.reactivex.rxjava3.disposables.b Q = new io.reactivex.rxjava3.disposables.b();

    public void a(io.reactivex.rxjava3.disposables.c cVar) {
        eo(cVar);
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public boolean a0() {
        return false;
    }

    public final io.reactivex.rxjava3.disposables.c eo(io.reactivex.rxjava3.disposables.c cVar) {
        this.P.b(cVar);
        return cVar;
    }

    public final void fo(io.reactivex.rxjava3.disposables.c cVar) {
        this.O.b(cVar);
    }

    public final void go(gzs<s3q0> gzsVar) {
        this.N.post(new v86(1, gzsVar));
    }

    public final void ho(long j, gzs gzsVar) {
        this.N.postDelayed(new qt2(1, gzsVar), j);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        this.P = new io.reactivex.rxjava3.disposables.b();
        super.onCreate(bundle);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onDestroy() {
        this.P.dispose();
        super.onDestroy();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.O.e();
        this.N.removeCallbacksAndMessages(null);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onPause() {
        this.Q.dispose();
        super.onPause();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onResume() {
        this.Q = new io.reactivex.rxjava3.disposables.b();
        super.onResume();
    }
}

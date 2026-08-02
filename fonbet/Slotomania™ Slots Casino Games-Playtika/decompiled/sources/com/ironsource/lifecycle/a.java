package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

/* loaded from: classes7.dex */
public class a extends Fragment {
    private static final String b = "com.ironsource.lifecycle.IronsourceLifecycleFragment";
    private InterfaceC0213a a;

    /* renamed from: com.ironsource.lifecycle.a$a, reason: collision with other inner class name */
    interface InterfaceC0213a {
        void a(Activity activity);

        void b(Activity activity);

        void c(Activity activity);
    }

    static a a(Activity activity) {
        return (a) activity.getFragmentManager().findFragmentByTag(b);
    }

    static void b(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager == null || fragmentManager.findFragmentByTag(b) != null) {
            return;
        }
        fragmentManager.beginTransaction().add(new a(), b).commit();
        fragmentManager.executePendingTransactions();
    }

    private void c(InterfaceC0213a interfaceC0213a) {
        if (interfaceC0213a != null) {
            interfaceC0213a.b(getActivity());
        }
    }

    void d(InterfaceC0213a interfaceC0213a) {
        this.a = interfaceC0213a;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(this.a);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.a = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        b(this.a);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        c(this.a);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
    }

    private void a(InterfaceC0213a interfaceC0213a) {
        if (interfaceC0213a != null) {
            interfaceC0213a.c(getActivity());
        }
    }

    private void b(InterfaceC0213a interfaceC0213a) {
        if (interfaceC0213a != null) {
            interfaceC0213a.a(getActivity());
        }
    }
}

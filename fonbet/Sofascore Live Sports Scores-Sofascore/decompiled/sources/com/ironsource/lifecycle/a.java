package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class a extends Fragment {
    private static final String b = "com.ironsource.lifecycle.IronsourceLifecycleFragment";
    private InterfaceC1205a a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.lifecycle.a$a, reason: collision with other inner class name */
    public interface InterfaceC1205a {
        void a(Activity activity);

        void b(Activity activity);

        void c(Activity activity);
    }

    public static a a(Activity activity) {
        return (a) activity.getFragmentManager().findFragmentByTag(b);
    }

    public static void b(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager == null || fragmentManager.findFragmentByTag(b) != null) {
            return;
        }
        fragmentManager.beginTransaction().add(new a(), b).commit();
        fragmentManager.executePendingTransactions();
    }

    private void c(InterfaceC1205a interfaceC1205a) {
        if (interfaceC1205a != null) {
            interfaceC1205a.b(getActivity());
        }
    }

    public void d(InterfaceC1205a interfaceC1205a) {
        this.a = interfaceC1205a;
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

    private void a(InterfaceC1205a interfaceC1205a) {
        if (interfaceC1205a != null) {
            interfaceC1205a.c(getActivity());
        }
    }

    private void b(InterfaceC1205a interfaceC1205a) {
        if (interfaceC1205a != null) {
            interfaceC1205a.a(getActivity());
        }
    }
}

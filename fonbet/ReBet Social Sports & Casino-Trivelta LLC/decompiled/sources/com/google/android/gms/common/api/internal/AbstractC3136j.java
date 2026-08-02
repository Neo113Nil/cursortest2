package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3191o;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: com.google.android.gms.common.api.internal.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3136j {

    @NonNull
    protected final InterfaceC3138k mLifecycleFragment;

    public AbstractC3136j(InterfaceC3138k interfaceC3138k) {
        this.mLifecycleFragment = interfaceC3138k;
    }

    @NonNull
    public static InterfaceC3138k getFragment(@NonNull Activity activity) {
        return getFragment(new C3134i(activity));
    }

    public void dump(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
    }

    @NonNull
    public Activity getActivity() {
        Activity Q10 = this.mLifecycleFragment.Q();
        AbstractC3191o.m(Q10);
        return Q10;
    }

    public void onActivityResult(int i10, int i11, Intent intent) {
    }

    public void onCreate(Bundle bundle) {
    }

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onSaveInstanceState(@NonNull Bundle bundle) {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    @NonNull
    public static InterfaceC3138k getFragment(@NonNull ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public static InterfaceC3138k getFragment(@NonNull C3134i c3134i) {
        if (c3134i.a()) {
            return t1.d0(c3134i.d());
        }
        if (c3134i.b()) {
            return q1.a(c3134i.c());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }
}

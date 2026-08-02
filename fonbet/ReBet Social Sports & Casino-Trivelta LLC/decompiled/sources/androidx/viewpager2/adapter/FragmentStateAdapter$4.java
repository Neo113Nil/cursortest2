package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.AbstractC2185j;
import androidx.lifecycle.InterfaceC2191p;
import androidx.lifecycle.InterfaceC2193s;

/* loaded from: classes.dex */
class FragmentStateAdapter$4 implements InterfaceC2191p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f23703a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f23704b;

    @Override // androidx.lifecycle.InterfaceC2191p
    public void k(InterfaceC2193s interfaceC2193s, AbstractC2185j.a aVar) {
        if (aVar == AbstractC2185j.a.ON_DESTROY) {
            this.f23703a.removeCallbacks(this.f23704b);
            interfaceC2193s.getLifecycle().d(this);
        }
    }
}

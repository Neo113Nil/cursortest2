package r;

import android.os.Handler;
import androidx.lifecycle.W;

/* loaded from: classes8.dex */
final class v implements W<Integer> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ u f82385a;

    v(u uVar) {
        this.f82385a = uVar;
    }

    @Override // androidx.lifecycle.W
    public final void onChanged(Integer num) {
        Integer num2 = num;
        u uVar = this.f82385a;
        Handler handler = uVar.f82376a;
        Runnable runnable = uVar.f82377b;
        handler.removeCallbacks(runnable);
        uVar.u(num2.intValue());
        uVar.v(num2.intValue());
        handler.postDelayed(runnable, 2000L);
    }
}

package r;

import android.os.Handler;
import android.widget.TextView;
import androidx.lifecycle.W;

/* loaded from: classes8.dex */
final class w implements W<CharSequence> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ u f82386a;

    w(u uVar) {
        this.f82386a = uVar;
    }

    @Override // androidx.lifecycle.W
    public final void onChanged(CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        u uVar = this.f82386a;
        Handler handler = uVar.f82376a;
        Runnable runnable = uVar.f82377b;
        handler.removeCallbacks(runnable);
        TextView textView = uVar.f82382g;
        if (textView != null) {
            textView.setText(charSequence2);
        }
        uVar.f82376a.postDelayed(runnable, 2000L);
    }
}

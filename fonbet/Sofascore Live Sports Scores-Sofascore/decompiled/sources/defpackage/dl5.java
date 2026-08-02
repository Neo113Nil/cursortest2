package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dl5 implements rq4 {
    public final /* synthetic */ g6b a;

    public dl5(EmojiCompatInitializer emojiCompatInitializer, g6b g6bVar) {
        this.a = g6bVar;
    }

    @Override // defpackage.rq4
    public final void e(u6b u6bVar) {
        (Build.VERSION.SDK_INT >= 28 ? sh3.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new gl5(0), 500L);
        this.a.d(this);
    }
}

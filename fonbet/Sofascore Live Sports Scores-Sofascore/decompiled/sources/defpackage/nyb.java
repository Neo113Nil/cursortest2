package defpackage;

import android.graphics.drawable.Drawable;
import com.google.android.material.button.MaterialButton;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class nyb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MaterialButton b;
    public final /* synthetic */ Drawable c;

    public /* synthetic */ nyb(MaterialButton materialButton, Drawable drawable, int i) {
        this.a = i;
        this.b = materialButton;
        this.c = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Drawable drawable = this.c;
        MaterialButton materialButton = this.b;
        switch (i) {
            case 0:
                int[] iArr = MaterialButton.N;
                materialButton.setIcon(drawable);
                break;
            default:
                int[] iArr2 = MaterialButton.N;
                materialButton.setIcon(drawable);
                break;
        }
    }
}

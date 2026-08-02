package defpackage;

import android.view.MotionEvent;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class k3p extends i3p {
    public Object[] a = new Object[4];
    public int b = 0;
    public boolean c;

    public final void b(MotionEvent motionEvent) {
        int length = this.a.length;
        int a = i3p.a(length, this.b + 1);
        if (a > length || this.c) {
            this.a = Arrays.copyOf(this.a, a);
            this.c = false;
        }
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = motionEvent;
    }
}

package defpackage;

import android.os.Build;
import android.view.MotionEvent;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fze {
    public final List a;
    public final yih b;
    public final int c;
    public final int d;
    public final int e;
    public int f;

    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        if (r11 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        r0 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0084, code lost:
    
        if (r11 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008e, code lost:
    
        if (r11 != false) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fze(List list, yih yihVar) {
        MotionEvent a;
        this.a = list;
        this.b = yihVar;
        int i = Build.VERSION.SDK_INT;
        int i2 = 0;
        this.c = (i < 29 || (a = a()) == null) ? 0 : a.getClassification();
        MotionEvent a2 = a();
        this.d = a2 != null ? a2.getButtonState() : 0;
        MotionEvent a3 = a();
        this.e = a3 != null ? a3.getMetaState() : 0;
        MotionEvent a4 = a();
        if (a4 != null) {
            boolean z = i >= 29 && a4.getClassification() == 3;
            boolean z2 = i >= 29 && a4.getClassification() == 5;
            int actionMasked = a4.getActionMasked();
            if (actionMasked == 0) {
                if (!z) {
                    if (z2) {
                        i2 = 7;
                    }
                    i2 = 1;
                }
                i2 = 10;
            } else if (actionMasked != 1) {
                if (actionMasked != 2) {
                    switch (actionMasked) {
                        case 5:
                            if (!z) {
                            }
                            i2 = 10;
                            break;
                        case 6:
                            if (!z) {
                            }
                            i2 = 12;
                            break;
                        case 8:
                            i2 = 6;
                            break;
                        case 9:
                            i2 = 4;
                            break;
                        case 10:
                            i2 = 5;
                            break;
                    }
                }
                if (z) {
                    i2 = 11;
                }
            } else {
                if (!z) {
                    if (z2) {
                        i2 = 9;
                    }
                    i2 = 2;
                }
                i2 = 12;
            }
        } else {
            int size = list.size();
            while (i2 < size) {
                mze mzeVar = (mze) list.get(i2);
                if (qea.n(mzeVar)) {
                    i2 = 2;
                } else if (qea.l(mzeVar)) {
                    i2 = 1;
                } else {
                    i2++;
                }
            }
            i2 = 3;
        }
        this.f = i2;
    }

    public final MotionEvent a() {
        yih yihVar = this.b;
        if (yihVar != null) {
            return (MotionEvent) ((k1d) yihVar.d).c;
        }
        return null;
    }
}

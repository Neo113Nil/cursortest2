package y0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* renamed from: y0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6835A {

    /* renamed from: a, reason: collision with root package name */
    public final Object f68188a;

    /* renamed from: y0.A$a */
    public static class a extends AccessibilityNodeProvider {

        /* renamed from: a, reason: collision with root package name */
        public final C6835A f68189a;

        public a(C6835A c6835a) {
            this.f68189a = c6835a;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            z b10 = this.f68189a.b(i10);
            if (b10 == null) {
                return null;
            }
            return b10.e1();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List findAccessibilityNodeInfosByText(String str, int i10) {
            List c10 = this.f68189a.c(str, i10);
            if (c10 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = c10.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(((z) c10.get(i11)).e1());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i10) {
            z d10 = this.f68189a.d(i10);
            if (d10 == null) {
                return null;
            }
            return d10.e1();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i10, int i11, Bundle bundle) {
            return this.f68189a.f(i10, i11, bundle);
        }
    }

    /* renamed from: y0.A$b */
    public static class b extends a {
        public b(C6835A c6835a) {
            super(c6835a);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f68189a.a(i10, z.f1(accessibilityNodeInfo), str, bundle);
        }
    }

    public C6835A() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f68188a = new b(this);
        } else {
            this.f68188a = new a(this);
        }
    }

    public z b(int i10) {
        return null;
    }

    public List c(String str, int i10) {
        return null;
    }

    public z d(int i10) {
        return null;
    }

    public Object e() {
        return this.f68188a;
    }

    public boolean f(int i10, int i11, Bundle bundle) {
        return false;
    }

    public C6835A(Object obj) {
        this.f68188a = obj;
    }

    public void a(int i10, z zVar, String str, Bundle bundle) {
    }
}

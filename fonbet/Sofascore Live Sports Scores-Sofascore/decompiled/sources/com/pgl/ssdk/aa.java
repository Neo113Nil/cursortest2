package com.pgl.ssdk;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Display;
import com.ironsource.U3;

/* loaded from: classes4.dex */
public class aa {
    private static volatile DisplayManager.DisplayListener a = null;
    private static volatile boolean b = false;
    private static String c = null;
    private static String d = null;
    private static String e = null;
    private static volatile boolean f = false;
    private static volatile boolean g = false;
    private static DisplayManager h;

    public static class a implements DisplayManager.DisplayListener {
        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
            aa.b(i, 1);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            aa.b(i, 3);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
            aa.b(i, 2);
        }
    }

    public static boolean a(Context context) {
        Display[] displays;
        if (b && (c != null || d != null || e != null)) {
            return true;
        }
        if (b && f) {
            return g;
        }
        int i = 0;
        if (context == null) {
            return false;
        }
        DisplayManager displayManager = h;
        if (displayManager == null) {
            displayManager = (DisplayManager) context.getSystemService(U3.i.d);
            h = displayManager;
        }
        if (displayManager != null && (displays = displayManager.getDisplays()) != null) {
            int length = displays.length;
            while (true) {
                if (i < length) {
                    Display display = displays[i];
                    if (display != null && display.getDisplayId() != 0) {
                        g = true;
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
        }
        f = true;
        return g;
    }

    public static void b(Context context) {
        Handler b2;
        if (b) {
            return;
        }
        if (a == null) {
            a = new a();
        }
        DisplayManager displayManager = h;
        if (displayManager == null) {
            displayManager = (DisplayManager) context.getSystemService(U3.i.d);
            h = displayManager;
        }
        if (displayManager == null || (b2 = ar.b()) == null) {
            return;
        }
        try {
            h.registerDisplayListener(a, b2);
            b = true;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(int i, int i2) {
        if (i == 0) {
            return;
        }
        try {
            String a2 = a(i);
            if (i2 == 1) {
                if (a2.equals(c)) {
                    return;
                }
                c = a2;
            } else if (i2 == 2) {
                if (a2.equals(d)) {
                    return;
                }
                d = a2;
            } else {
                if (i2 != 3 || a2.equals(e)) {
                    return;
                }
                e = a2;
            }
        } catch (Throwable unused) {
        }
    }

    private static String a(Display display) {
        String name = display.getName();
        boolean z = false;
        Object a2 = au.a(display, display.getClass(), "getType", new Class[0], new Object[0]);
        Object a3 = au.a(display, display.getClass(), "getOwnerPackageName", new Class[0], new Object[0]);
        Object a4 = au.a(null, display.getClass(), "TYPE_VIRTUAL", null);
        if (a2 != null && a4 != null && ((Integer) a2).intValue() == ((Integer) a4).intValue()) {
            z = true;
        }
        return String.format("%s#%s#%b", a3, name, Boolean.valueOf(z));
    }

    private static String a(int i) {
        Display display = h.getDisplay(i);
        return display != null ? a(display) : "pd";
    }
}

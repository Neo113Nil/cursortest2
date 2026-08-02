package defpackage;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class d4 implements PrivilegedExceptionAction {
    public static final /* synthetic */ d4 b = new d4(10);
    public static final /* synthetic */ d4 c = new d4(12);
    public static final /* synthetic */ d4 d = new d4(18);
    public final /* synthetic */ int a;

    public /* synthetic */ d4(int i) {
        this.a = i;
    }

    @Override // java.security.PrivilegedExceptionAction
    public final Object run() {
        int i = 0;
        switch (this.a) {
            case 0:
                Field[] declaredFields = Unsafe.class.getDeclaredFields();
                int length = declaredFields.length;
                while (i < length) {
                    Field field = declaredFields[i];
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                    i++;
                }
                throw new NoSuchFieldError("the Unsafe");
            case 1:
                return SSLEngine.class.getMethod("getApplicationProtocol", null);
            case 2:
                return SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
            case 3:
                return SSLSocket.class.getMethod("getApplicationProtocol", null);
            case 4:
                Field[] declaredFields2 = Unsafe.class.getDeclaredFields();
                int length2 = declaredFields2.length;
                while (i < length2) {
                    Field field2 = declaredFields2[i];
                    field2.setAccessible(true);
                    Object obj2 = field2.get(null);
                    if (Unsafe.class.isInstance(obj2)) {
                        return (Unsafe) Unsafe.class.cast(obj2);
                    }
                    i++;
                }
                return null;
            case 5:
                Field[] declaredFields3 = Unsafe.class.getDeclaredFields();
                int length3 = declaredFields3.length;
                while (i < length3) {
                    Field field3 = declaredFields3[i];
                    field3.setAccessible(true);
                    Object obj3 = field3.get(null);
                    if (Unsafe.class.isInstance(obj3)) {
                        return (Unsafe) Unsafe.class.cast(obj3);
                    }
                    i++;
                }
                return null;
            case 6:
                Field[] declaredFields4 = Unsafe.class.getDeclaredFields();
                int length4 = declaredFields4.length;
                while (i < length4) {
                    Field field4 = declaredFields4[i];
                    field4.setAccessible(true);
                    Object obj4 = field4.get(null);
                    if (Unsafe.class.isInstance(obj4)) {
                        return (Unsafe) Unsafe.class.cast(obj4);
                    }
                    i++;
                }
                return null;
            case 7:
                Field[] declaredFields5 = Unsafe.class.getDeclaredFields();
                int length5 = declaredFields5.length;
                while (i < length5) {
                    Field field5 = declaredFields5[i];
                    field5.setAccessible(true);
                    Object obj5 = field5.get(null);
                    if (Unsafe.class.isInstance(obj5)) {
                        return (Unsafe) Unsafe.class.cast(obj5);
                    }
                    i++;
                }
                return null;
            case 8:
                Field[] declaredFields6 = Unsafe.class.getDeclaredFields();
                int length6 = declaredFields6.length;
                while (i < length6) {
                    Field field6 = declaredFields6[i];
                    field6.setAccessible(true);
                    Object obj6 = field6.get(null);
                    if (Unsafe.class.isInstance(obj6)) {
                        return (Unsafe) Unsafe.class.cast(obj6);
                    }
                    i++;
                }
                return null;
            case 9:
                Field[] declaredFields7 = Unsafe.class.getDeclaredFields();
                int length7 = declaredFields7.length;
                while (i < length7) {
                    Field field7 = declaredFields7[i];
                    field7.setAccessible(true);
                    Object obj7 = field7.get(null);
                    if (Unsafe.class.isInstance(obj7)) {
                        return (Unsafe) Unsafe.class.cast(obj7);
                    }
                    i++;
                }
                return null;
            case 10:
                return uin.a0();
            case 11:
                Field[] declaredFields8 = Unsafe.class.getDeclaredFields();
                int length8 = declaredFields8.length;
                while (i < length8) {
                    Field field8 = declaredFields8[i];
                    field8.setAccessible(true);
                    Object obj8 = field8.get(null);
                    if (Unsafe.class.isInstance(obj8)) {
                        return (Unsafe) Unsafe.class.cast(obj8);
                    }
                    i++;
                }
                return null;
            case 12:
                return elo.f0();
            case 13:
                Field[] declaredFields9 = Unsafe.class.getDeclaredFields();
                int length9 = declaredFields9.length;
                while (i < length9) {
                    Field field9 = declaredFields9[i];
                    field9.setAccessible(true);
                    Object obj9 = field9.get(null);
                    if (Unsafe.class.isInstance(obj9)) {
                        return (Unsafe) Unsafe.class.cast(obj9);
                    }
                    i++;
                }
                return null;
            case 14:
                Field[] declaredFields10 = Unsafe.class.getDeclaredFields();
                int length10 = declaredFields10.length;
                while (i < length10) {
                    Field field10 = declaredFields10[i];
                    field10.setAccessible(true);
                    Object obj10 = field10.get(null);
                    if (Unsafe.class.isInstance(obj10)) {
                        return (Unsafe) Unsafe.class.cast(obj10);
                    }
                    i++;
                }
                return null;
            case 15:
                Field[] declaredFields11 = Unsafe.class.getDeclaredFields();
                int length11 = declaredFields11.length;
                while (i < length11) {
                    Field field11 = declaredFields11[i];
                    field11.setAccessible(true);
                    Object obj11 = field11.get(null);
                    if (Unsafe.class.isInstance(obj11)) {
                        return (Unsafe) Unsafe.class.cast(obj11);
                    }
                    i++;
                }
                return null;
            case 16:
                Field[] declaredFields12 = Unsafe.class.getDeclaredFields();
                int length12 = declaredFields12.length;
                while (i < length12) {
                    Field field12 = declaredFields12[i];
                    field12.setAccessible(true);
                    Object obj12 = field12.get(null);
                    if (Unsafe.class.isInstance(obj12)) {
                        return (Unsafe) Unsafe.class.cast(obj12);
                    }
                    i++;
                }
                throw new NoSuchFieldError("the Unsafe");
            case 17:
                Field[] declaredFields13 = Unsafe.class.getDeclaredFields();
                int length13 = declaredFields13.length;
                while (i < length13) {
                    Field field13 = declaredFields13[i];
                    field13.setAccessible(true);
                    Object obj13 = field13.get(null);
                    if (Unsafe.class.isInstance(obj13)) {
                        return (Unsafe) Unsafe.class.cast(obj13);
                    }
                    i++;
                }
                return null;
            default:
                Unsafe unsafe = gap.e;
                Field[] declaredFields14 = Unsafe.class.getDeclaredFields();
                int length14 = declaredFields14.length;
                while (i < length14) {
                    Field field14 = declaredFields14[i];
                    field14.setAccessible(true);
                    Object obj14 = field14.get(null);
                    if (Unsafe.class.isInstance(obj14)) {
                        return (Unsafe) Unsafe.class.cast(obj14);
                    }
                    i++;
                }
                throw new NoSuchFieldError("the Unsafe");
        }
    }
}

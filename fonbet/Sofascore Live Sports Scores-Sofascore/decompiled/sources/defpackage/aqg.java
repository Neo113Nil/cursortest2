package defpackage;

import android.os.IBinder;
import android.os.Parcelable;
import java.io.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class aqg {
    public static final SerialDescriptor a;
    public static final SerialDescriptor b;
    public static final SerialDescriptor c;
    public static final SerialDescriptor d;
    public static final sg0 e;
    public static final sg0 f;
    public static final sg0 g;
    public static final sg0 h;
    public static final sg0 i;
    public static final sg0 j;
    public static final sg0 k;
    public static final sg0 l;
    public static final SerialDescriptor m;
    public static final SerialDescriptor n;
    public static final SerialDescriptor o;

    static {
        fuf fufVar = duf.a;
        a = new a0f(fufVar.getOrCreateKotlinClass(CharSequence.class)).getDescriptor();
        b = new a0f(fufVar.getOrCreateKotlinClass(Parcelable.class)).getDescriptor();
        c = new a0f(fufVar.getOrCreateKotlinClass(Serializable.class)).getDescriptor();
        d = new a0f(fufVar.getOrCreateKotlinClass(IBinder.class)).getDescriptor();
        qr4 qr4Var = qr4.b;
        e = l98.c(fufVar.getOrCreateKotlinClass(Parcelable.class), qr4Var).c;
        f = l98.c(fufVar.getOrCreateKotlinClass(Parcelable.class), new a0f(fufVar.getOrCreateKotlinClass(Parcelable.class))).c;
        g = new sg0(qr4Var.getDescriptor(), 1);
        SerialDescriptor descriptor = new a0f(fufVar.getOrCreateKotlinClass(Parcelable.class)).getDescriptor();
        descriptor.getClass();
        h = new sg0(descriptor, 1);
        i = l98.c(fufVar.getOrCreateKotlinClass(CharSequence.class), rp2.a).c;
        j = l98.c(fufVar.getOrCreateKotlinClass(CharSequence.class), new a0f(fufVar.getOrCreateKotlinClass(CharSequence.class))).c;
        m5h m5hVar = rp2.b;
        m5hVar.getClass();
        k = new sg0(m5hVar, 1);
        SerialDescriptor descriptor2 = new a0f(fufVar.getOrCreateKotlinClass(CharSequence.class)).getDescriptor();
        descriptor2.getClass();
        l = new sg0(descriptor2, 1);
        cxh cxhVar = dxh.Companion;
        m = cxhVar.serializer(qr4Var).getDescriptor();
        n = cxhVar.serializer(new a0f(fufVar.getOrCreateKotlinClass(Parcelable.class))).getDescriptor();
        o = cxhVar.serializer(l98.W(new a0f(fufVar.getOrCreateKotlinClass(Parcelable.class)))).getDescriptor();
    }
}

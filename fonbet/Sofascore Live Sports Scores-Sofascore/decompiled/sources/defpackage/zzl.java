package defpackage;

import android.graphics.drawable.AnimatedImageDrawable;
import com.fyber.inneractive.sdk.player.exoplayer2.r;
import com.fyber.inneractive.sdk.protobuf.m1;
import com.fyber.inneractive.sdk.protobuf.n1;
import com.google.android.gms.internal.measurement.zzaeg;
import com.google.android.gms.internal.play_billing.zzhb;
import com.google.android.gms.internal.wearable.zzdu;
import com.vungle.ads.internal.util.m;
import com.vungle.ads.internal.util.n;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzl implements m {
    public static /* synthetic */ void b() {
        throw new ndd();
    }

    public static /* synthetic */ void c(int i, int i2) {
        throw new IllegalArgumentException("Length too large: " + i + i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void d(int i, long j) {
        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) i) + ((Object) " at index ") + j);
    }

    public static /* synthetic */ void e(int i, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append((Object) "#read(byte[]) returned invalid result: ");
        sb.append(i);
        sb.append((Object) "\nThe InputStream implementation is buggy.");
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void f(int i, Object obj, double d) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(obj);
        sb.append(d);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void g(int i, String str) {
        throw new IllegalArgumentException(str + ((char) i));
    }

    public static /* synthetic */ void h(Object obj, int i, Object obj2, Object obj3, int i2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(obj);
        sb.append(i2);
        sb.append(obj2);
        sb.append(obj3);
        throw new o9p(sb.toString(), 16);
    }

    public static /* synthetic */ void i(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void j(String str) {
        throw new n1(str);
    }

    public static /* synthetic */ void k(String str, float f, Object obj, float f2, Object obj2) {
        throw new IllegalArgumentException(str + f + obj + f2 + obj2);
    }

    public static /* synthetic */ void l(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void m(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }

    public static /* bridge */ /* synthetic */ boolean n(Object obj) {
        return obj instanceof AnimatedImageDrawable;
    }

    public static /* synthetic */ void o() {
        throw new m1();
    }

    public static /* synthetic */ void p(int i, int i2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append((Object) "Length too large: ");
        sb.append(i2);
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void q(int i, String str) {
        throw new IllegalStateException(str + i);
    }

    public static /* synthetic */ void r(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void s() {
        throw new IllegalStateException();
    }

    public static /* synthetic */ void t(String str) {
        throw new r(str);
    }

    public static /* synthetic */ void u() {
        throw new kan();
    }

    public static /* synthetic */ void v(String str) {
        throw new zzhb(str);
    }

    public static /* synthetic */ void w() {
        throw new zzaeg();
    }

    public static /* synthetic */ void x(String str) {
        throw new GeneralSecurityException(str);
    }

    public static /* synthetic */ void y() {
        throw new zzdu();
    }

    @Override // com.vungle.ads.internal.util.m
    public ObjectInputStream a(InputStream inputStream) {
        return n.a(inputStream);
    }
}

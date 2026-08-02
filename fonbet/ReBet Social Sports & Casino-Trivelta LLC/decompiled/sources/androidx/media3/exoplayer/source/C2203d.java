package androidx.media3.exoplayer.source;

import H1.C1177j;
import H1.InterfaceC1183p;
import H1.InterfaceC1184q;
import a2.C1914f;
import android.net.Uri;
import b1.InterfaceC2358l;
import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4134a;
import java.io.EOFException;
import java.util.Map;

/* renamed from: androidx.media3.exoplayer.source.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2203d implements Q {

    /* renamed from: a, reason: collision with root package name */
    public final H1.u f21713a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC1183p f21714b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC1184q f21715c;

    public C2203d(H1.u uVar) {
        this.f21713a = uVar;
    }

    @Override // androidx.media3.exoplayer.source.Q
    public void a(long j10, long j11) {
        ((InterfaceC1183p) AbstractC4134a.e(this.f21714b)).a(j10, j11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
    
        if (r1.getPosition() != r11) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0079, code lost:
    
        if (r1.getPosition() != r11) goto L23;
     */
    @Override // androidx.media3.exoplayer.source.Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(InterfaceC2358l interfaceC2358l, Uri uri, Map map, long j10, long j11, H1.r rVar) {
        C1177j c1177j = new C1177j(interfaceC2358l, j10, j11);
        this.f21715c = c1177j;
        if (this.f21714b != null) {
            return;
        }
        InterfaceC1183p[] d10 = this.f21713a.d(uri, map);
        AbstractC3445z.a l10 = AbstractC3445z.l(d10.length);
        if (d10.length == 1) {
            this.f21714b = d10[0];
        } else {
            int length = d10.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                InterfaceC1183p interfaceC1183p = d10[i10];
                try {
                } catch (EOFException unused) {
                    if (this.f21714b == null) {
                    }
                } catch (Throwable th2) {
                    AbstractC4134a.g(this.f21714b != null || c1177j.getPosition() == j10);
                    c1177j.g();
                    throw th2;
                }
                if (interfaceC1183p.j(c1177j)) {
                    this.f21714b = interfaceC1183p;
                    AbstractC4134a.g(true);
                    c1177j.g();
                    break;
                } else {
                    l10.k(interfaceC1183p.k());
                    if (this.f21714b == null) {
                    }
                    boolean z10 = true;
                    AbstractC4134a.g(z10);
                    c1177j.g();
                    i10++;
                }
            }
            if (this.f21714b == null) {
                throw new n0("None of the available extractors (" + Ra.g.g(", ").d(com.google.common.collect.L.k(AbstractC3445z.q(d10), new Ra.f() { // from class: androidx.media3.exoplayer.source.c
                    @Override // Ra.f
                    public final Object apply(Object obj) {
                        String simpleName;
                        simpleName = ((InterfaceC1183p) obj).f().getClass().getSimpleName();
                        return simpleName;
                    }
                })) + ") could read the stream.", (Uri) AbstractC4134a.e(uri), l10.m());
            }
        }
        this.f21714b.c(rVar);
    }

    @Override // androidx.media3.exoplayer.source.Q
    public void c() {
        InterfaceC1183p interfaceC1183p = this.f21714b;
        if (interfaceC1183p == null) {
            return;
        }
        InterfaceC1183p f10 = interfaceC1183p.f();
        if (f10 instanceof C1914f) {
            ((C1914f) f10).l();
        }
    }

    @Override // androidx.media3.exoplayer.source.Q
    public int d(H1.I i10) {
        return ((InterfaceC1183p) AbstractC4134a.e(this.f21714b)).g((InterfaceC1184q) AbstractC4134a.e(this.f21715c), i10);
    }

    @Override // androidx.media3.exoplayer.source.Q
    public long e() {
        InterfaceC1184q interfaceC1184q = this.f21715c;
        if (interfaceC1184q != null) {
            return interfaceC1184q.getPosition();
        }
        return -1L;
    }

    @Override // androidx.media3.exoplayer.source.Q
    public void release() {
        InterfaceC1183p interfaceC1183p = this.f21714b;
        if (interfaceC1183p != null) {
            interfaceC1183p.release();
            this.f21714b = null;
        }
        this.f21715c = null;
    }
}

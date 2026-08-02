package Sh;

import Ph.InterfaceC1456i0;
import Ph.InterfaceC1465n;
import Ph.M0;
import Ph.Z;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class w extends M0 implements Z {

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f10821b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10822c;

    public /* synthetic */ w(Throwable th2, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(th2, (i10 & 2) != 0 ? null : str);
    }

    @Override // Ph.Z
    public InterfaceC1456i0 J(long j10, Runnable runnable, CoroutineContext coroutineContext) {
        h2();
        throw new KotlinNothingValueException();
    }

    @Override // Ph.L
    public boolean a2(CoroutineContext coroutineContext) {
        h2();
        throw new KotlinNothingValueException();
    }

    @Override // Ph.M0, Ph.L
    public Ph.L c2(int i10, String str) {
        h2();
        throw new KotlinNothingValueException();
    }

    @Override // Ph.L
    /* renamed from: g2, reason: merged with bridge method [inline-methods] */
    public Void Y1(CoroutineContext coroutineContext, Runnable runnable) {
        h2();
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (r1 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Void h2() {
        String str;
        if (this.f10821b == null) {
            AbstractC1583v.d();
            throw new KotlinNothingValueException();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Module with the Main dispatcher had failed to initialize");
        String str2 = this.f10822c;
        if (str2 != null) {
            str = ". " + str2;
        }
        str = "";
        sb2.append(str);
        throw new IllegalStateException(sb2.toString(), this.f10821b);
    }

    @Override // Ph.Z
    /* renamed from: i2, reason: merged with bridge method [inline-methods] */
    public Void w0(long j10, InterfaceC1465n interfaceC1465n) {
        h2();
        throw new KotlinNothingValueException();
    }

    @Override // Ph.M0, Ph.L
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Dispatchers.Main[missing");
        if (this.f10821b != null) {
            str = ", cause=" + this.f10821b;
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(']');
        return sb2.toString();
    }

    public w(Throwable th2, String str) {
        this.f10821b = th2;
        this.f10822c = str;
    }

    @Override // Ph.M0
    public M0 e2() {
        return this;
    }
}

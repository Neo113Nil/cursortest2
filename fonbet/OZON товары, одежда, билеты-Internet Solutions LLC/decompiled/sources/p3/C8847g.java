package p3;

import java.io.IOException;

/* renamed from: p3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8847g extends IOException {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f80059b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f80060a;

    public C8847g(int i11) {
        this.f80060a = i11;
    }

    public C8847g(int i11, Exception exc) {
        super(exc);
        this.f80060a = i11;
    }

    public C8847g(String str, int i11) {
        super(str);
        this.f80060a = i11;
    }

    public C8847g(int i11, Exception exc, String str) {
        super(str, exc);
        this.f80060a = i11;
    }
}

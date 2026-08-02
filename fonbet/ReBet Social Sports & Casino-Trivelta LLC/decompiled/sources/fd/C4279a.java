package fd;

import okhttp3.OkHttpClient;

/* renamed from: fd.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4279a {

    /* renamed from: b, reason: collision with root package name */
    public static final C4279a f46604b = new C4279a();

    /* renamed from: a, reason: collision with root package name */
    public OkHttpClient f46605a;

    public OkHttpClient a() {
        if (this.f46605a == null) {
            this.f46605a = new OkHttpClient();
        }
        return this.f46605a;
    }
}

package x4;

import B4.h;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.e;
import com.bumptech.glide.util.c;
import com.bumptech.glide.util.k;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* renamed from: x4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6795a implements d, Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Call.Factory f67830a;

    /* renamed from: b, reason: collision with root package name */
    public final h f67831b;

    /* renamed from: c, reason: collision with root package name */
    public InputStream f67832c;

    /* renamed from: d, reason: collision with root package name */
    public ResponseBody f67833d;

    /* renamed from: e, reason: collision with root package name */
    public d.a f67834e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Call f67835f;

    public C6795a(Call.Factory factory, h hVar) {
        this.f67830a = factory;
        this.f67831b = hVar;
    }

    @Override // com.bumptech.glide.load.data.d
    public Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        try {
            InputStream inputStream = this.f67832c;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException unused) {
        }
        ResponseBody responseBody = this.f67833d;
        if (responseBody != null) {
            responseBody.close();
        }
        this.f67834e = null;
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
        Call call = this.f67835f;
        if (call != null) {
            call.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public com.bumptech.glide.load.a d() {
        return com.bumptech.glide.load.a.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(com.bumptech.glide.h hVar, d.a aVar) {
        Request.Builder url = new Request.Builder().url(this.f67831b.h());
        for (Map.Entry entry : this.f67831b.e().entrySet()) {
            url.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        Request build = url.build();
        this.f67834e = aVar;
        this.f67835f = this.f67830a.newCall(build);
        this.f67835f.enqueue(this);
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException iOException) {
        Log.isLoggable("OkHttpFetcher", 3);
        this.f67834e.c(iOException);
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        this.f67833d = response.body();
        if (!response.isSuccessful()) {
            this.f67834e.c(new e(response.message(), response.code()));
            return;
        }
        InputStream k10 = c.k(this.f67833d.byteStream(), ((ResponseBody) k.d(this.f67833d)).getContentLength());
        this.f67832c = k10;
        this.f67834e.f(k10);
    }
}

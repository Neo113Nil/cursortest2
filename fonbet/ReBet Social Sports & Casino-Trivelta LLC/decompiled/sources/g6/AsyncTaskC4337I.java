package g6;

import T7.Y;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.GraphRequest;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* renamed from: g6.I, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class AsyncTaskC4337I extends AsyncTask {

    /* renamed from: d, reason: collision with root package name */
    public static final a f46951d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final String f46952e = AsyncTaskC4337I.class.getCanonicalName();

    /* renamed from: a, reason: collision with root package name */
    public final HttpURLConnection f46953a;

    /* renamed from: b, reason: collision with root package name */
    public final C4338J f46954b;

    /* renamed from: c, reason: collision with root package name */
    public Exception f46955c;

    /* renamed from: g6.I$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public AsyncTaskC4337I(HttpURLConnection httpURLConnection, C4338J requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        this.f46953a = httpURLConnection;
        this.f46954b = requests;
    }

    public List a(Void... params) {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(params, "params");
            try {
                HttpURLConnection httpURLConnection = this.f46953a;
                return httpURLConnection == null ? this.f46954b.f() : GraphRequest.f30314n.o(httpURLConnection, this.f46954b);
            } catch (Exception e10) {
                this.f46955c = e10;
                return null;
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    public void b(List result) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(result, "result");
            super.onPostExecute(result);
            Exception exc = this.f46955c;
            if (exc != null) {
                Y y10 = Y.f11042a;
                String str = f46952e;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                Y.k0(str, format);
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            return a((Void[]) objArr);
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            b((List) obj);
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            super.onPreExecute();
            if (C4331C.D()) {
                Y y10 = Y.f11042a;
                String str = f46952e;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format("execute async task: %s", Arrays.copyOf(new Object[]{this}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                Y.k0(str, format);
            }
            if (this.f46954b.l() == null) {
                this.f46954b.x(Thread.currentThread() instanceof HandlerThread ? new Handler() : new Handler(Looper.getMainLooper()));
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public String toString() {
        String str = "{RequestAsyncTask:  connection: " + this.f46953a + ", requests: " + this.f46954b + "}";
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder()\n        .append(\"{RequestAsyncTask: \")\n        .append(\" connection: \")\n        .append(connection)\n        .append(\", requests: \")\n        .append(requests)\n        .append(\"}\")\n        .toString()");
        return str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AsyncTaskC4337I(C4338J requests) {
        this(null, requests);
        Intrinsics.checkNotNullParameter(requests, "requests");
    }
}

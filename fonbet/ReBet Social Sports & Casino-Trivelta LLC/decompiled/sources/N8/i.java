package N8;

import Ph.AbstractC1440a0;
import Ph.AbstractC1459k;
import Ph.C1483w0;
import Ph.P;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final SimpleDateFormat f7934a;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.f7955m.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.f7956n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.f7954l.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class b extends Lambda implements Function3 {

        /* renamed from: d, reason: collision with root package name */
        public static final b f7935d = new b();

        public b() {
            super(3);
        }

        public final void a(boolean z10, String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "<anonymous parameter 1>");
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a(((Boolean) obj).booleanValue(), (String) obj2, (String) obj3);
            return Unit.INSTANCE;
        }
    }

    public static final class c extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f7936n;

        /* renamed from: o, reason: collision with root package name */
        public int f7937o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f7938p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f7939q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Function3 f7940r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ long f7941s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i10, String str, Function3 function3, long j10, Continuation continuation) {
            super(2, continuation);
            this.f7938p = i10;
            this.f7939q = str;
            this.f7940r = function3;
            this.f7941s = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.f7938p, this.f7939q, this.f7940r, this.f7941s, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((c) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0024 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00d6  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0109  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0113 -> B:5:0x0116). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i10;
            BufferedReader bufferedReader;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f7937o;
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                i10 = 0;
                if (i10 < this.f7938p) {
                }
                this.f7940r.invoke(Boxing.boxBoolean(false), "Request failed: " + this.f7939q, null);
                return Unit.INSTANCE;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = this.f7936n;
            ResultKt.throwOnFailure(obj);
            i10++;
            if (i10 < this.f7938p) {
                try {
                } catch (IOException e10) {
                    if (i10 < this.f7938p - 1) {
                    }
                }
                URLConnection openConnection = new URL(this.f7939q).openConnection();
                Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(5000);
                if (httpURLConnection.getResponseCode() != 200) {
                    InputStream errorStream = httpURLConnection.getErrorStream();
                    if (errorStream != null) {
                        bufferedReader = new BufferedReader(new InputStreamReader(errorStream, Charsets.UTF_8), 8192);
                        try {
                            String readText = TextStreamsKt.readText(bufferedReader);
                            CloseableKt.closeFinally(bufferedReader, null);
                            this.f7940r.invoke(Boxing.boxBoolean(false), "Failed with HTTP code: " + httpURLConnection.getResponseCode(), readText);
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    } else {
                        this.f7940r.invoke(Boxing.boxBoolean(false), "Failed with HTTP code: " + httpURLConnection.getResponseCode(), null);
                    }
                    i10++;
                    if (i10 < this.f7938p) {
                    }
                } else {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    Intrinsics.checkNotNullExpressionValue(inputStream, "connection.inputStream");
                    bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), 8192);
                    try {
                        String readText2 = TextStreamsKt.readText(bufferedReader);
                        CloseableKt.closeFinally(bufferedReader, null);
                        this.f7940r.invoke(Boxing.boxBoolean(true), "Request successful: " + this.f7939q, readText2);
                    } finally {
                    }
                }
                if (i10 < this.f7938p - 1) {
                    this.f7940r.invoke(Boxing.boxBoolean(false), "Failed after " + this.f7938p + " attempts: " + this.f7939q + ", Error: " + e10.getMessage(), null);
                } else {
                    long j10 = this.f7941s;
                    this.f7936n = i10;
                    this.f7937o = 1;
                    if (AbstractC1440a0.a(j10, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i10++;
                    if (i10 < this.f7938p) {
                    }
                }
            }
            this.f7940r.invoke(Boxing.boxBoolean(false), "Request failed: " + this.f7939q, null);
            return Unit.INSTANCE;
        }
    }

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        f7934a = simpleDateFormat;
    }

    public static final void c(String urlString, int i10, long j10, Function3 callback) {
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AbstractC1459k.d(C1483w0.f9135a, null, null, new c(i10, urlString, callback, j10, null), 3, null);
    }

    public static /* synthetic */ void d(String str, int i10, long j10, Function3 function3, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 3;
        }
        if ((i11 & 4) != 0) {
            j10 = 1000;
        }
        if ((i11 & 8) != 0) {
            function3 = b.f7935d;
        }
        c(str, i10, j10, function3);
    }

    public static final void e(N8.c cVar, List list, View view) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        if (list == null) {
            return;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        DisplayMetrics displayMetrics = view.getContext().getResources().getDisplayMetrics();
        f(list, new n(Integer.valueOf(view.getWidth()), Integer.valueOf(view.getHeight()), Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]), Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels)), cVar.e());
    }

    public static final void f(List list, n nVar, String userId) {
        String str;
        Intrinsics.checkNotNullParameter(userId, "userId");
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String i10 = i((String) it.next(), nVar);
            if (userId.length() > 0) {
                str = userId;
                i10 = StringsKt.replace$default(i10, "%%GIPHY_USER_ID%%", str, false, 4, (Object) null);
            } else {
                str = userId;
            }
            d(i10, 0, 0L, null, 14, null);
            userId = str;
        }
    }

    public static final String g() {
        TimeZone timeZone = TimeZone.getDefault();
        String displayName = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
        Intrinsics.checkNotNullExpressionValue(displayName, "tz.getDisplayName(isDaylight, TimeZone.SHORT)");
        return displayName;
    }

    public static final String h() {
        String format;
        Instant instant;
        ZoneId systemDefault;
        ZonedDateTime atZone;
        DateTimeFormatter dateTimeFormatter;
        Date date = new Date();
        if (Build.VERSION.SDK_INT >= 26) {
            instant = date.toInstant();
            systemDefault = ZoneId.systemDefault();
            atZone = instant.atZone(systemDefault);
            dateTimeFormatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
            format = atZone.format(dateTimeFormatter);
        } else {
            format = f7934a.format(date);
        }
        return URLEncoder.encode(format, "UTF-8");
    }

    public static final String i(String str, n nVar) {
        String str2 = str;
        for (l lVar : l.values()) {
            String name = lVar.name();
            String j10 = j(nVar, lVar);
            if (j10 == null) {
                j10 = "unknown";
            }
            str2 = StringsKt.replace$default(StringsKt.replace$default(str2, "%25", "%", false, 4, (Object) null), "%%" + name + "%%", j10, false, 4, (Object) null);
        }
        return str2;
    }

    public static final String j(n nVar, l lVar) {
        if (nVar == null) {
            return lVar.b();
        }
        int i10 = a.$EnumSwitchMapping$0[lVar.ordinal()];
        if (i10 == 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(nVar.d());
            sb2.append(',');
            sb2.append(nVar.a());
            return sb2.toString();
        }
        if (i10 == 2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(nVar.b());
            sb3.append(',');
            sb3.append(nVar.c());
            return sb3.toString();
        }
        if (i10 != 3) {
            return lVar.b();
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(nVar.f());
        sb4.append(',');
        sb4.append(nVar.e());
        return sb4.toString();
    }
}

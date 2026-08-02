package t8;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import r8.InterfaceC9215a;
import r8.f;
import r8.g;
import s8.InterfaceC9625b;

/* loaded from: classes9.dex */
public final class d implements InterfaceC9625b<d> {

    /* renamed from: e, reason: collision with root package name */
    private static final C9776a f99230e = new C9776a();

    /* renamed from: f, reason: collision with root package name */
    private static final t8.b f99231f = new t8.b();

    /* renamed from: g, reason: collision with root package name */
    private static final c f99232g = new c();

    /* renamed from: h, reason: collision with root package name */
    private static final b f99233h = new b();

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f99234a;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f99235b;

    /* renamed from: c, reason: collision with root package name */
    private C9776a f99236c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f99237d;

    final class a implements InterfaceC9215a {
        a() {
        }

        @Override // r8.InterfaceC9215a
        public final void a(@NonNull Writer writer, @NonNull Object obj) throws IOException {
            d dVar = d.this;
            e eVar = new e(writer, dVar.f99234a, dVar.f99235b, dVar.f99236c, dVar.f99237d);
            eVar.a(obj);
            eVar.c();
        }

        @Override // r8.InterfaceC9215a
        public final String b(@NonNull Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(stringWriter, obj);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    private static final class b implements f<Date> {

        /* renamed from: a, reason: collision with root package name */
        private static final SimpleDateFormat f99239a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f99239a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        @Override // r8.f
        public final void encode(@NonNull Object obj, @NonNull Object obj2) throws IOException {
            ((g) obj2).add(f99239a.format((Date) obj));
        }
    }

    public d() {
        HashMap hashMap = new HashMap();
        this.f99234a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f99235b = hashMap2;
        this.f99236c = f99230e;
        this.f99237d = false;
        hashMap2.put(String.class, f99231f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, f99232g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f99233h);
        hashMap.remove(Date.class);
    }

    @NonNull
    public final InterfaceC9215a e() {
        return new a();
    }

    @NonNull
    public final void f() {
        this.f99237d = true;
    }

    @Override // s8.InterfaceC9625b
    @NonNull
    public final d registerEncoder(@NonNull Class cls, @NonNull r8.d dVar) {
        this.f99234a.put(cls, dVar);
        this.f99235b.remove(cls);
        return this;
    }
}

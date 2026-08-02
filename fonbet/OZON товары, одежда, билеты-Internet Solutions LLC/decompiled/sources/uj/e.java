package uj;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import De.C2862e;
import Sc.o;
import Sc.s;
import androidx.lifecycle.w0;
import java.io.Closeable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.ozonLogger.android.AndroidLogEntry;
import ru.ozon.android.ozonLogger.core.g;
import uj.f;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Luj/e;", "Landroidx/lifecycle/w0;", "<init>", "()V", "ozon-logger-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e extends w0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2862e f100816a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final SimpleDateFormat f100817b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final x0<List<f>> f100818c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final M0<List<f>> f100819d;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.ozonLogger.android.debug.history.HistoryLogsViewModel$3", f = "HistoryLogsViewModel.kt", l = {}, m = "invokeSuspend")
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {
        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return e.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            e eVar = e.this;
            x0 x0Var = eVar.f100818c;
            List z02 = C7714v.z0(sj.e.f98817f.f());
            ArrayList arrayList = new ArrayList(C7714v.z(z02, 10));
            Iterator it = z02.iterator();
            while (it.hasNext()) {
                arrayList.add(eVar.i0((AndroidLogEntry) it.next()));
            }
            x0Var.setValue(arrayList);
            return Unit.f71690a;
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f100821a;

        static {
            int[] iArr = new int[ru.ozon.android.ozonLogger.core.c.values().length];
            try {
                iArr[ru.ozon.android.ozonLogger.core.c.ALERT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ru.ozon.android.ozonLogger.core.c.CRITICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ru.ozon.android.ozonLogger.core.c.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ru.ozon.android.ozonLogger.core.c.WARNING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ru.ozon.android.ozonLogger.core.c.NOTICE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ru.ozon.android.ozonLogger.core.c.INFO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ru.ozon.android.ozonLogger.core.c.DEBUG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f100821a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [uj.c] */
    public e() {
        C10720e0 c10720e0 = C10720e0.f105451a;
        C2862e a11 = N.a(De.s.f6650a.x());
        this.f100816a = a11;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss.SSS", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        this.f100817b = simpleDateFormat;
        x0<List<f>> a12 = O0.a(K.f71697a);
        this.f100818c = a12;
        this.f100819d = C2399j.b(a12);
        final ?? r12 = new g() { // from class: uj.c
            @Override // ru.ozon.android.ozonLogger.core.g
            public final void a(AndroidLogEntry androidLogEntry) {
                e.d0(e.this, androidLogEntry);
            }
        };
        sj.e.f98817f.k(r12);
        addCloseable(new Closeable() { // from class: uj.d
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                sj.e.f98817f.p(c.this);
            }
        });
        C10727i.c(a11, He.b.f10879b, null, new a(null), 2);
    }

    public static void d0(e eVar, AndroidLogEntry newEntry) {
        List<f> value;
        Intrinsics.checkNotNullParameter(newEntry, "newEntry");
        x0<List<f>> x0Var = eVar.f100818c;
        do {
            value = x0Var.getValue();
        } while (!x0Var.b(value, C7714v.p0(value, C7714v.a0(eVar.i0(newEntry)))));
    }

    private static void g0(Object obj, String str, StringBuilder sb2) {
        sb2.append(str + ": " + obj);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f i0(AndroidLogEntry androidLogEntry) {
        String str;
        f.a bVar;
        ru.ozon.android.ozonLogger.core.c level = androidLogEntry.getLevel();
        if (level.name().length() == 0) {
            str = "";
        } else {
            char[] charArray = level.name().toCharArray();
            Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
            charArray[0] = Character.toUpperCase(charArray[0]);
            Intrinsics.checkNotNullParameter(charArray, "<this>");
            int length = charArray.length - 1;
            if (1 <= length) {
                int i11 = 1;
                while (true) {
                    charArray[i11] = Character.toLowerCase(charArray[i11]);
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                }
            }
            Intrinsics.checkNotNullParameter(charArray, "<this>");
            str = new String(charArray);
        }
        String uuid = androidLogEntry.getUuid().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        String message = androidLogEntry.getMessage();
        StringBuilder sb2 = new StringBuilder();
        g0(androidLogEntry.getUuid(), "uuid", sb2);
        g0(androidLogEntry.getService(), "service", sb2);
        g0(androidLogEntry.getAppUuid(), "appUuid", sb2);
        g0(androidLogEntry.getTeam(), "team", sb2);
        g0(androidLogEntry.getGroup(), "group", sb2);
        g0(androidLogEntry.getOzonId(), "ozonId", sb2);
        g0(androidLogEntry.getSessionId(), "sessionId", sb2);
        g0(androidLogEntry.getAppVersion(), "appVersion", sb2);
        g0(androidLogEntry.getEnv(), "env", sb2);
        g0(androidLogEntry.getModel(), "model", sb2);
        g0(androidLogEntry.getManufacturer(), "manufacturer", sb2);
        g0(androidLogEntry.getPlatform(), "platform", sb2);
        g0(androidLogEntry.getIsFirstLaunch(), "isFirstLaunch", sb2);
        ru.ozon.android.ozonLogger.core.a customFields = androidLogEntry.getCustomFields();
        if (customFields != null) {
            for (Map.Entry<String, Object> entry : customFields.entrySet()) {
                g0(entry.getValue(), entry.getKey(), sb2);
            }
        }
        Unit unit = Unit.f71690a;
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        String B02 = h.B0(sb3, '\n', ' ');
        String format = this.f100817b.format(Long.valueOf(androidLogEntry.getTimestamp()));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        switch (b.f100821a[androidLogEntry.getLevel().ordinal()]) {
            case 1:
            case 2:
            case 3:
                bVar = new f.a.b(str);
                break;
            case 4:
                bVar = new f.a.d(str);
                break;
            case 5:
            case 6:
                bVar = new f.a.c(str);
                break;
            case 7:
                bVar = new f.a.C2211a(str);
                break;
            default:
                throw new o();
        }
        f.a aVar = bVar;
        Boolean isLocal = androidLogEntry.getIsLocal();
        return new f(uuid, message, B02, format, aVar, isLocal != null ? isLocal.booleanValue() : false);
    }

    @NotNull
    public final M0<List<f>> h0() {
        return this.f100819d;
    }

    @Override // androidx.lifecycle.w0
    protected final void onCleared() {
        super.onCleared();
        N.c(this.f100816a, null);
    }
}

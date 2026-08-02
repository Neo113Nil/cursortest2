package io.sentry.android.replay;

import Sc.InterfaceC4008j;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import io.sentry.C7165l;
import io.sentry.C7194q1;
import io.sentry.I2;
import io.sentry.InterfaceC7097a0;
import io.sentry.W2;
import io.sentry.X2;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.U;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class j implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final W2 f67576a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final io.sentry.protocol.t f67577b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f67578c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f67579d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f67580e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f67581f;

    /* renamed from: g, reason: collision with root package name */
    private io.sentry.android.replay.video.e f67582g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f67583h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final ArrayList f67584i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap<String, String> f67585j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f67586k;

    public static final class a {
        /* JADX WARN: Code restructure failed: missing block: B:76:0x0229, code lost:
        
            if (r4 != null) goto L92;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static io.sentry.android.replay.e a(@NotNull W2 options, @NotNull io.sentry.protocol.t replayId) {
            File file;
            Date date;
            X2.b bVar;
            String str = "";
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(replayId, "replayId");
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(replayId, "replayId");
            String cacheDirPath = options.getCacheDirPath();
            Iterable iterable = null;
            if (cacheDirPath == null || cacheDirPath.length() == 0) {
                options.getLogger().c(I2.WARNING, "SentryOptions.cacheDirPath is not set, session replay is no-op", new Object[0]);
                file = null;
            } else {
                String cacheDirPath2 = options.getCacheDirPath();
                Intrinsics.f(cacheDirPath2);
                file = new File(cacheDirPath2, "replay_" + replayId);
                file.mkdirs();
            }
            File file2 = new File(file, ".ongoing_segment");
            if (!file2.exists()) {
                options.getLogger().c(I2.DEBUG, "No ongoing segment found for replay: %s", replayId);
                io.sentry.util.g.a(file);
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2), Charsets.UTF_8), 8192);
            try {
                Iterator it = bd.q.b(bufferedReader).iterator();
                while (it.hasNext()) {
                    List m11 = kotlin.text.h.m((String) it.next(), new String[]{"="}, 2, 2);
                    Pair pair = new Pair((String) m11.get(0), (String) m11.get(1));
                    linkedHashMap.put(pair.e(), pair.f());
                }
                bufferedReader.close();
                String str2 = (String) linkedHashMap.get("config.height");
                Integer w02 = str2 != null ? kotlin.text.h.w0(str2) : null;
                String str3 = (String) linkedHashMap.get("config.width");
                Integer w03 = str3 != null ? kotlin.text.h.w0(str3) : null;
                String str4 = (String) linkedHashMap.get("config.frame-rate");
                Integer w04 = str4 != null ? kotlin.text.h.w0(str4) : null;
                String str5 = (String) linkedHashMap.get("config.bit-rate");
                Integer w05 = str5 != null ? kotlin.text.h.w0(str5) : null;
                String str6 = (String) linkedHashMap.get("segment.id");
                Integer w06 = str6 != null ? kotlin.text.h.w0(str6) : null;
                try {
                    String str7 = (String) linkedHashMap.get("segment.timestamp");
                    if (str7 == null) {
                        str7 = "";
                    }
                    date = C7165l.d(str7);
                } catch (Throwable unused) {
                    date = null;
                }
                try {
                    String str8 = (String) linkedHashMap.get("replay.type");
                    if (str8 != null) {
                        str = str8;
                    }
                    bVar = X2.b.valueOf(str);
                } catch (Throwable unused2) {
                    bVar = null;
                }
                if (w02 == null || w03 == null || w04 == null || w05 == null || w06 == null || w06.intValue() == -1 || date == null || bVar == null) {
                    options.getLogger().c(I2.DEBUG, "Incorrect segment values found for replay: %s, deleting the replay", replayId);
                    io.sentry.util.g.a(file);
                    return null;
                }
                t tVar = new t(w03.intValue(), w02.intValue(), 1.0f, 1.0f, w04.intValue(), w05.intValue());
                final j jVar = new j(options, replayId);
                File s11 = jVar.s();
                if (s11 != null) {
                    s11.listFiles(new FilenameFilter() { // from class: io.sentry.android.replay.g
                        @Override // java.io.FilenameFilter
                        public final boolean accept(File file3, String str9) {
                            Intrinsics.f(str9);
                            if (kotlin.text.h.A(str9, ".jpg", false)) {
                                File file4 = new File(file3, str9);
                                Intrinsics.checkNotNullParameter(file4, "<this>");
                                String name = file4.getName();
                                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                                Long y02 = kotlin.text.h.y0(kotlin.text.h.o0(name, ".", name));
                                if (y02 != null) {
                                    j.this.k(file4, y02.longValue(), null);
                                }
                            }
                            return false;
                        }
                    });
                }
                if (jVar.r().isEmpty()) {
                    options.getLogger().c(I2.DEBUG, "No frames found for replay: %s, deleting the replay", replayId);
                    io.sentry.util.g.a(file);
                    return null;
                }
                ArrayList r11 = jVar.r();
                if (r11.size() > 1) {
                    C7714v.G0(new h(), r11);
                }
                X2.b bVar2 = X2.b.SESSION;
                int intValue = bVar == bVar2 ? w06.intValue() : 0;
                if (bVar != bVar2) {
                    date = C7165l.c(((k) C7714v.K(jVar.r())).c());
                    Intrinsics.f(date);
                }
                Date date2 = date;
                long c11 = (((k) C7714v.X(jVar.r())).c() - date2.getTime()) + (1000 / w04.intValue());
                String str9 = (String) linkedHashMap.get("replay.recording");
                if (str9 != null) {
                    C7194q1 c7194q1 = (C7194q1) options.getSerializer().c(new StringReader(str9), C7194q1.class);
                    if ((c7194q1 != null ? c7194q1.a() : null) != null) {
                        List<? extends io.sentry.rrweb.b> a11 = c7194q1.a();
                        Intrinsics.f(a11);
                        iterable = new LinkedList(a11);
                    }
                }
                iterable = K.f71697a;
                return new io.sentry.android.replay.e(tVar, jVar, date2, intValue, c11, bVar, (String) linkedHashMap.get("replay.screen-at-start"), C7714v.I0(new i(0), iterable));
            } finally {
            }
        }
    }

    static final class b extends AbstractC7737t implements Function0<File> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final File invoke() {
            j jVar = j.this;
            if (jVar.s() == null) {
                return null;
            }
            File file = new File(jVar.s(), ".ongoing_segment");
            if (!file.exists()) {
                file.createNewFile();
            }
            return file;
        }
    }

    static final class c extends AbstractC7737t implements Function1<Map.Entry<String, String>, CharSequence> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f67588b = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(Map.Entry<String, String> entry) {
            Map.Entry<String, String> entry2 = entry;
            Intrinsics.checkNotNullParameter(entry2, "<name for destructuring parameter 0>");
            return entry2.getKey() + '=' + entry2.getValue();
        }
    }

    static final class d extends AbstractC7737t implements Function0<File> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final File invoke() {
            j jVar = j.this;
            W2 options = jVar.f67576a;
            io.sentry.protocol.t replayId = jVar.f67577b;
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(replayId, "replayId");
            String cacheDirPath = options.getCacheDirPath();
            if (cacheDirPath == null || cacheDirPath.length() == 0) {
                options.getLogger().c(I2.WARNING, "SentryOptions.cacheDirPath is not set, session replay is no-op", new Object[0]);
                return null;
            }
            String cacheDirPath2 = options.getCacheDirPath();
            Intrinsics.f(cacheDirPath2);
            File file = new File(cacheDirPath2, "replay_" + replayId);
            file.mkdirs();
            return file;
        }
    }

    static final class e extends AbstractC7737t implements Function1<k, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f67590b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j f67591c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ M<String> f67592d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j11, j jVar, M<String> m11) {
            super(1);
            this.f67590b = j11;
            this.f67591c = jVar;
            this.f67592d = m11;
        }

        /* JADX WARN: Type inference failed for: r5v3, types: [T, java.lang.String] */
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(k kVar) {
            k it = kVar;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.c() < this.f67590b) {
                this.f67591c.p(it.b());
                return Boolean.TRUE;
            }
            M<String> m11 = this.f67592d;
            if (m11.f71787a == null) {
                m11.f71787a = it.a();
            }
            return Boolean.FALSE;
        }
    }

    public j(@NotNull W2 options, @NotNull io.sentry.protocol.t replayId) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(replayId, "replayId");
        this.f67576a = options;
        this.f67577b = replayId;
        this.f67578c = new AtomicBoolean(false);
        this.f67579d = new io.sentry.util.a();
        this.f67580e = new io.sentry.util.a();
        this.f67581f = new io.sentry.util.a();
        this.f67583h = Sc.k.b(new d());
        this.f67584i = new ArrayList();
        this.f67585j = new LinkedHashMap<>();
        this.f67586k = Sc.k.b(new b());
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0193 A[LOOP:0: B:31:0x00e7->B:50:0x0193, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0198 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static io.sentry.android.replay.d o(j jVar, long j11, long j12, int i11, int i12, int i13, int i14, int i15) {
        InterfaceC7097a0 interfaceC7097a0;
        io.sentry.util.a aVar;
        kotlin.ranges.g gVar;
        int i16;
        Object obj;
        int i17;
        long j13;
        Bitmap decodeFile;
        File videoFile = new File(jVar.s(), i11 + ".mp4");
        jVar.getClass();
        Intrinsics.checkNotNullParameter(videoFile, "videoFile");
        if (videoFile.exists() && videoFile.length() > 0) {
            videoFile.delete();
        }
        io.sentry.util.a aVar2 = jVar.f67581f;
        InterfaceC7097a0 a11 = aVar2.a();
        ArrayList arrayList = jVar.f67584i;
        try {
            ArrayList<k> arrayList2 = arrayList.isEmpty() ? new ArrayList() : C7714v.W0(arrayList);
            a11.close();
            boolean isEmpty = arrayList2.isEmpty();
            W2 w22 = jVar.f67576a;
            if (isEmpty) {
                w22.getLogger().c(I2.DEBUG, "No captured frames, skipping generating a video segment", new Object[0]);
                return null;
            }
            io.sentry.util.a aVar3 = jVar.f67579d;
            InterfaceC7097a0 a12 = aVar3.a();
            try {
                interfaceC7097a0 = a12;
                try {
                    io.sentry.android.replay.video.e eVar = new io.sentry.android.replay.video.e(w22, new io.sentry.android.replay.video.a(videoFile, i13, i12, i14, i15));
                    eVar.h();
                    interfaceC7097a0.close();
                    jVar.f67582g = eVar;
                    long j14 = 1000 / i14;
                    Object M11 = C7714v.M(arrayList2);
                    long j15 = j12 + j11;
                    if (j15 <= Long.MIN_VALUE) {
                        kotlin.ranges.g.INSTANCE.getClass();
                        gVar = kotlin.ranges.g.f71850f;
                        aVar = aVar2;
                    } else {
                        aVar = aVar2;
                        gVar = new kotlin.ranges.g(j12, j15 - 1);
                    }
                    kotlin.ranges.f n11 = kotlin.ranges.h.n(gVar, j14);
                    long f71846a = n11.getF71846a();
                    long f71847b = n11.getF71847b();
                    long f71848c = n11.getF71848c();
                    if ((f71848c <= 0 || f71846a > f71847b) && (f71848c >= 0 || f71847b > f71846a)) {
                        i16 = 0;
                    } else {
                        int i18 = 0;
                        while (true) {
                            for (k kVar : arrayList2) {
                                long j16 = f71846a + j14;
                                long c11 = kVar.c();
                                if (f71846a <= c11 && c11 <= j16) {
                                    obj = kVar;
                                    break;
                                }
                                if (kVar.c() > j16) {
                                    break;
                                }
                            }
                            obj = M11;
                            k kVar2 = (k) obj;
                            if (kVar2 == null) {
                                i17 = i18;
                                j13 = f71846a;
                            } else {
                                try {
                                    decodeFile = BitmapFactory.decodeFile(kVar2.b().getAbsolutePath());
                                    i17 = i18;
                                    try {
                                        a11 = aVar3.a();
                                        j13 = f71846a;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        j13 = f71846a;
                                        w22.getLogger().a(I2.WARNING, "Unable to decode bitmap and encode it into a video, skipping frame", th);
                                        if (obj != null) {
                                        }
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    i17 = i18;
                                }
                                try {
                                    try {
                                        io.sentry.android.replay.video.e eVar2 = jVar.f67582g;
                                        if (eVar2 != null) {
                                            Intrinsics.f(decodeFile);
                                            eVar2.b(decodeFile);
                                            Unit unit = Unit.f71690a;
                                        }
                                        a11.close();
                                        decodeFile.recycle();
                                        i18 = i17 + 1;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        w22.getLogger().a(I2.WARNING, "Unable to decode bitmap and encode it into a video, skipping frame", th);
                                        if (obj != null) {
                                        }
                                    }
                                    M11 = obj;
                                    if (j13 == f71847b) {
                                        i16 = i18;
                                        break;
                                    }
                                    f71846a = j13 + f71848c;
                                } finally {
                                }
                            }
                            if (obj != null) {
                                jVar.p(((k) obj).b());
                                a11 = aVar.a();
                                try {
                                    U.a(arrayList);
                                    arrayList.remove(obj);
                                    a11.close();
                                    arrayList2.remove(obj);
                                    i18 = i17;
                                    M11 = null;
                                    if (j13 == f71847b) {
                                    }
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            } else {
                                i18 = i17;
                                M11 = obj;
                                if (j13 == f71847b) {
                                }
                            }
                        }
                    }
                    if (i16 == 0) {
                        w22.getLogger().c(I2.DEBUG, "Generated a video with no frames, not capturing a replay segment", new Object[0]);
                        jVar.p(videoFile);
                        return null;
                    }
                    a11 = aVar3.a();
                    try {
                        io.sentry.android.replay.video.e eVar3 = jVar.f67582g;
                        if (eVar3 != null) {
                            eVar3.g();
                        }
                        io.sentry.android.replay.video.e eVar4 = jVar.f67582g;
                        long c12 = eVar4 != null ? eVar4.c() : 0L;
                        jVar.f67582g = null;
                        Unit unit2 = Unit.f71690a;
                        a11.close();
                        jVar.v(j15);
                        return new io.sentry.android.replay.d(videoFile, i16, c12);
                    } finally {
                    }
                } catch (Throwable th5) {
                    th = th5;
                    Throwable th6 = th;
                    try {
                        throw th6;
                    } catch (Throwable th7) {
                        Jb.j.e(interfaceC7097a0, th6);
                        throw th7;
                    }
                }
            } catch (Throwable th8) {
                th = th8;
                interfaceC7097a0 = a12;
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(File file) {
        W2 w22 = this.f67576a;
        try {
            if (file.delete()) {
                return;
            }
            w22.getLogger().c(I2.ERROR, "Failed to delete replay frame: %s", file.getAbsolutePath());
        } catch (Throwable th2) {
            w22.getLogger().b(I2.ERROR, th2, "Failed to delete replay frame: %s", file.getAbsolutePath());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InterfaceC7097a0 a11 = this.f67579d.a();
        try {
            io.sentry.android.replay.video.e eVar = this.f67582g;
            if (eVar != null) {
                eVar.g();
            }
            this.f67582g = null;
            Unit unit = Unit.f71690a;
            a11.close();
            this.f67578c.set(true);
        } finally {
        }
    }

    public final void k(@NotNull File screenshot, long j11, String str) {
        Intrinsics.checkNotNullParameter(screenshot, "screenshot");
        k kVar = new k(screenshot, j11, str);
        InterfaceC7097a0 a11 = this.f67581f.a();
        try {
            this.f67584i.add(kVar);
            Unit unit = Unit.f71690a;
            a11.close();
        } finally {
        }
    }

    public final void m(@NotNull Bitmap bitmap, long j11, String str) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        if (s() == null || bitmap.isRecycled()) {
            return;
        }
        File s11 = s();
        if (s11 != null) {
            s11.mkdirs();
        }
        File file = new File(s(), j11 + ".jpg");
        file.createNewFile();
        synchronized (bitmap) {
            if (bitmap.isRecycled()) {
                return;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, this.f67576a.getSessionReplay().o().screenshotQuality, fileOutputStream);
                fileOutputStream.flush();
                Unit unit = Unit.f71690a;
                fileOutputStream.close();
                k(file, j11, str);
            } finally {
            }
        }
    }

    public final Long q() {
        InterfaceC7097a0 a11 = this.f67581f.a();
        try {
            k kVar = (k) C7714v.M(this.f67584i);
            Long valueOf = kVar != null ? Long.valueOf(kVar.c()) : null;
            a11.close();
            return valueOf;
        } finally {
        }
    }

    @NotNull
    public final ArrayList r() {
        return this.f67584i;
    }

    public final File s() {
        return (File) this.f67583h.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t(@NotNull String key, String str) {
        File file;
        File file2;
        Intrinsics.checkNotNullParameter(key, "key");
        InterfaceC7097a0 a11 = this.f67580e.a();
        try {
            if (this.f67578c.get()) {
                a11.close();
                return;
            }
            InterfaceC4008j interfaceC4008j = this.f67586k;
            File file3 = (File) interfaceC4008j.getValue();
            if ((file3 == null || !file3.exists()) && (file = (File) interfaceC4008j.getValue()) != null) {
                file.createNewFile();
            }
            LinkedHashMap<String, String> linkedHashMap = this.f67585j;
            if (linkedHashMap.isEmpty() && (file2 = (File) interfaceC4008j.getValue()) != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2), Charsets.UTF_8), 8192);
                try {
                    Iterator it = bd.q.b(bufferedReader).iterator();
                    while (it.hasNext()) {
                        List m11 = kotlin.text.h.m((String) it.next(), new String[]{"="}, 2, 2);
                        Pair pair = new Pair((String) m11.get(0), (String) m11.get(1));
                        linkedHashMap.put(pair.e(), pair.f());
                    }
                    bufferedReader.close();
                } finally {
                }
            }
            if (str == null) {
                linkedHashMap.remove(key);
            } else {
                linkedHashMap.put(key, str);
            }
            File file4 = (File) interfaceC4008j.getValue();
            if (file4 != null) {
                Set entrySet = linkedHashMap.entrySet();
                Intrinsics.checkNotNullExpressionValue(entrySet, "<get-entries>(...)");
                bd.h.o(file4, C7714v.V(entrySet, "\n", null, null, c.f67588b, 30), Charsets.UTF_8);
                Unit unit = Unit.f71690a;
            }
            a11.close();
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String v(long j11) {
        M m11 = new M();
        InterfaceC7097a0 a11 = this.f67581f.a();
        try {
            C.h(this.f67584i, new e(j11, this, m11));
            a11.close();
            return (String) m11.f71787a;
        } finally {
        }
    }
}

package io.sentry.android.replay;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import io.sentry.AbstractC4779m;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.G3;
import io.sentry.H1;
import io.sentry.InterfaceC4765j0;
import io.sentry.android.replay.i;
import io.sentry.util.AbstractC4851i;
import io.sentry.util.C4843a;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.io.TextStreamsKt;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.LongProgression;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class i implements Closeable {

    /* renamed from: l, reason: collision with root package name */
    public static final a f51619l = new a(null);

    /* renamed from: m, reason: collision with root package name */
    public static final int f51620m = 8;

    /* renamed from: a, reason: collision with root package name */
    public final F3 f51621a;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.protocol.u f51622b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f51623c;

    /* renamed from: d, reason: collision with root package name */
    public final C4843a f51624d;

    /* renamed from: e, reason: collision with root package name */
    public final C4843a f51625e;

    /* renamed from: f, reason: collision with root package name */
    public final C4843a f51626f;

    /* renamed from: g, reason: collision with root package name */
    public io.sentry.android.replay.video.c f51627g;

    /* renamed from: h, reason: collision with root package name */
    public final Lazy f51628h;

    /* renamed from: i, reason: collision with root package name */
    public final List f51629i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f51630j;

    /* renamed from: k, reason: collision with root package name */
    public final Lazy f51631k;

    public static final class a {

        /* renamed from: io.sentry.android.replay.i$a$a, reason: collision with other inner class name */
        public static final class C0759a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ComparisonsKt.compareValues(Long.valueOf(((j) obj).c()), Long.valueOf(((j) obj2).c()));
            }
        }

        public static final class b implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ComparisonsKt.compareValues(Long.valueOf(((io.sentry.rrweb.b) obj).e()), Long.valueOf(((io.sentry.rrweb.b) obj2).e()));
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final boolean b(i iVar, File file, String str) {
            Intrinsics.checkNotNull(str);
            if (StringsKt.endsWith$default(str, ".jpg", false, 2, (Object) null)) {
                File file2 = new File(file, str);
                Long longOrNull = StringsKt.toLongOrNull(FilesKt.getNameWithoutExtension(file2));
                if (longOrNull != null) {
                    i.J(iVar, file2, longOrNull.longValue(), null, 4, null);
                }
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:75:0x0203, code lost:
        
            if (r7 != null) goto L91;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final io.sentry.android.replay.d c(F3 options, io.sentry.protocol.u replayId, Function1 function1) {
            Date date;
            G3.b bVar;
            io.sentry.android.replay.d dVar;
            final i iVar;
            List emptyList;
            String str = "";
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(replayId, "replayId");
            File d10 = d(options, replayId);
            File file = new File(d10, ".ongoing_segment");
            if (!file.exists()) {
                options.getLogger().c(EnumC4788n3.DEBUG, "No ongoing segment found for replay: %s", replayId);
                AbstractC4851i.a(d10);
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), Charsets.UTF_8), 8192);
            try {
                Iterator<String> it = TextStreamsKt.lineSequence(bufferedReader).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    List split$default = StringsKt.split$default((CharSequence) it.next(), new String[]{"="}, false, 2, 2, (Object) null);
                    Pair pair = TuplesKt.to((String) split$default.get(0), (String) split$default.get(1));
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                }
                CloseableKt.closeFinally(bufferedReader, null);
                String str2 = (String) linkedHashMap.get("config.height");
                Integer intOrNull = str2 != null ? StringsKt.toIntOrNull(str2) : null;
                String str3 = (String) linkedHashMap.get("config.width");
                Integer intOrNull2 = str3 != null ? StringsKt.toIntOrNull(str3) : null;
                String str4 = (String) linkedHashMap.get("config.frame-rate");
                Integer intOrNull3 = str4 != null ? StringsKt.toIntOrNull(str4) : null;
                String str5 = (String) linkedHashMap.get("config.bit-rate");
                Integer intOrNull4 = str5 != null ? StringsKt.toIntOrNull(str5) : null;
                String str6 = (String) linkedHashMap.get("segment.id");
                Integer intOrNull5 = str6 != null ? StringsKt.toIntOrNull(str6) : null;
                try {
                    String str7 = (String) linkedHashMap.get("segment.timestamp");
                    if (str7 == null) {
                        str7 = "";
                    }
                    date = AbstractC4779m.e(str7);
                } catch (Throwable unused) {
                    date = null;
                }
                try {
                    String str8 = (String) linkedHashMap.get("replay.type");
                    if (str8 != null) {
                        str = str8;
                    }
                    bVar = G3.b.valueOf(str);
                } catch (Throwable unused2) {
                    bVar = null;
                }
                if (intOrNull == null || intOrNull2 == null || intOrNull3 == null || intOrNull4 == null || intOrNull5 == null) {
                    dVar = null;
                } else {
                    dVar = null;
                    if (intOrNull5.intValue() != -1 && date != null && bVar != null) {
                        s sVar = new s(intOrNull2.intValue(), intOrNull.intValue(), 1.0f, 1.0f, intOrNull3.intValue(), intOrNull4.intValue());
                        if (function1 == null || (iVar = (i) function1.invoke(replayId)) == null) {
                            iVar = new i(options, replayId);
                        }
                        File T12 = iVar.T1();
                        if (T12 != null) {
                            T12.listFiles(new FilenameFilter() { // from class: io.sentry.android.replay.h
                                @Override // java.io.FilenameFilter
                                public final boolean accept(File file2, String str9) {
                                    boolean b10;
                                    b10 = i.a.b(i.this, file2, str9);
                                    return b10;
                                }
                            });
                        }
                        if (iVar.n1().isEmpty()) {
                            options.getLogger().c(EnumC4788n3.DEBUG, "No frames found for replay: %s, deleting the replay", replayId);
                            AbstractC4851i.a(d10);
                            return null;
                        }
                        List n12 = iVar.n1();
                        if (n12.size() > 1) {
                            CollectionsKt.sortWith(n12, new C0759a());
                        }
                        G3.b bVar2 = G3.b.SESSION;
                        int intValue = bVar == bVar2 ? intOrNull5.intValue() : 0;
                        if (bVar != bVar2) {
                            date = AbstractC4779m.d(((j) CollectionsKt.first(iVar.n1())).c());
                            Intrinsics.checkNotNull(date);
                        }
                        Date date2 = date;
                        long c10 = (((j) CollectionsKt.last(iVar.n1())).c() - date2.getTime()) + (1000 / intOrNull3.intValue());
                        String str9 = (String) linkedHashMap.get("replay.recording");
                        if (str9 != null) {
                            H1 h12 = (H1) options.getSerializer().c(new StringReader(str9), H1.class);
                            if ((h12 != null ? h12.a() : null) != null) {
                                List a10 = h12.a();
                                Intrinsics.checkNotNull(a10);
                                emptyList = new LinkedList(a10);
                            } else {
                                emptyList = null;
                            }
                        }
                        emptyList = CollectionsKt.emptyList();
                        return new io.sentry.android.replay.d(sVar, iVar, date2, intValue, c10, bVar, (String) linkedHashMap.get("replay.screen-at-start"), CollectionsKt.sortedWith(emptyList, new b()));
                    }
                }
                options.getLogger().c(EnumC4788n3.DEBUG, "Incorrect segment values found for replay: %s, deleting the replay", replayId);
                AbstractC4851i.a(d10);
                return dVar;
            } finally {
            }
        }

        public final File d(F3 options, io.sentry.protocol.u replayId) {
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(replayId, "replayId");
            String cacheDirPath = options.getCacheDirPath();
            if (cacheDirPath == null || cacheDirPath.length() == 0) {
                options.getLogger().c(EnumC4788n3.WARNING, "SentryOptions.cacheDirPath is not set, session replay is no-op", new Object[0]);
                return null;
            }
            String cacheDirPath2 = options.getCacheDirPath();
            Intrinsics.checkNotNull(cacheDirPath2);
            File file = new File(cacheDirPath2, "replay_" + replayId);
            file.mkdirs();
            return file;
        }

        public a() {
        }
    }

    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            if (i.this.T1() == null) {
                return null;
            }
            File file = new File(i.this.T1(), ".ongoing_segment");
            if (!file.exists()) {
                file.createNewFile();
            }
            return file;
        }
    }

    public static final class c extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final c f51633d = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Map.Entry entry) {
            Intrinsics.checkNotNullParameter(entry, "<name for destructuring parameter 0>");
            return ((String) entry.getKey()) + '=' + ((String) entry.getValue());
        }
    }

    public static final class d extends Lambda implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            return i.f51619l.d(i.this.f51621a, i.this.f51622b);
        }
    }

    public static final class e extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f51635d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ i f51636e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef f51637f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j10, i iVar, Ref.ObjectRef objectRef) {
            super(1);
            this.f51635d = j10;
            this.f51636e = iVar;
            this.f51637f = objectRef;
        }

        /* JADX WARN: Type inference failed for: r5v2, types: [T, java.lang.String] */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(j it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.c() < this.f51635d) {
                this.f51636e.A0(it.b());
                return Boolean.TRUE;
            }
            Ref.ObjectRef objectRef = this.f51637f;
            if (objectRef.element == 0) {
                objectRef.element = it.a();
            }
            return Boolean.FALSE;
        }
    }

    public i(F3 options, io.sentry.protocol.u replayId) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(replayId, "replayId");
        this.f51621a = options;
        this.f51622b = replayId;
        this.f51623c = new AtomicBoolean(false);
        this.f51624d = new C4843a();
        this.f51625e = new C4843a();
        this.f51626f = new C4843a();
        this.f51628h = LazyKt.lazy(new d());
        this.f51629i = new ArrayList();
        this.f51630j = new LinkedHashMap();
        this.f51631k = LazyKt.lazy(new b());
    }

    public static /* synthetic */ void J(i iVar, File file, long j10, String str, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = null;
        }
        iVar.B(file, j10, str);
    }

    public static /* synthetic */ io.sentry.android.replay.c z0(i iVar, long j10, long j11, int i10, int i11, int i12, int i13, int i14, File file, int i15, Object obj) {
        int i16;
        File file2;
        if ((i15 & 128) != 0) {
            File T12 = iVar.T1();
            StringBuilder sb2 = new StringBuilder();
            i16 = i10;
            sb2.append(i16);
            sb2.append(".mp4");
            file2 = new File(T12, sb2.toString());
        } else {
            i16 = i10;
            file2 = file;
        }
        return iVar.w0(j10, j11, i16, i11, i12, i13, i14, file2);
    }

    public final void A0(File file) {
        try {
            if (file.delete()) {
                return;
            }
            this.f51621a.getLogger().c(EnumC4788n3.ERROR, "Failed to delete replay frame: %s", file.getAbsolutePath());
        } catch (Throwable th2) {
            this.f51621a.getLogger().a(EnumC4788n3.ERROR, th2, "Failed to delete replay frame: %s", file.getAbsolutePath());
        }
    }

    public final void B(File screenshot, long j10, String str) {
        Intrinsics.checkNotNullParameter(screenshot, "screenshot");
        j jVar = new j(screenshot, j10, str);
        InterfaceC4765j0 d10 = this.f51626f.d();
        try {
            this.f51629i.add(jVar);
            Unit unit = Unit.INSTANCE;
            AutoCloseableKt.closeFinally(d10, null);
        } finally {
        }
    }

    public final boolean D0(j jVar) {
        if (jVar == null) {
            return false;
        }
        try {
            Bitmap decodeFile = BitmapFactory.decodeFile(jVar.b().getAbsolutePath());
            InterfaceC4765j0 d10 = this.f51624d.d();
            try {
                io.sentry.android.replay.video.c cVar = this.f51627g;
                if (cVar != null) {
                    Intrinsics.checkNotNull(decodeFile);
                    cVar.b(decodeFile);
                    Unit unit = Unit.INSTANCE;
                }
                AutoCloseableKt.closeFinally(d10, null);
                decodeFile.recycle();
                return true;
            } finally {
            }
        } catch (Throwable th2) {
            this.f51621a.getLogger().b(EnumC4788n3.WARNING, "Unable to decode bitmap and encode it into a video, skipping frame", th2);
            return false;
        }
    }

    public final File T1() {
        return (File) this.f51628h.getValue();
    }

    public final void U(Bitmap bitmap, long j10, String str) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        if (T1() == null || bitmap.isRecycled()) {
            return;
        }
        File T12 = T1();
        if (T12 != null) {
            T12.mkdirs();
        }
        File file = new File(T1(), j10 + ".jpg");
        file.createNewFile();
        synchronized (bitmap) {
            if (bitmap.isRecycled()) {
                return;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, this.f51621a.getSessionReplay().v().screenshotQuality, fileOutputStream);
                fileOutputStream.flush();
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(fileOutputStream, null);
                B(file, j10, str);
            } finally {
            }
        }
    }

    public final void Y1(String key, String str) {
        File y12;
        File y13;
        Intrinsics.checkNotNullParameter(key, "key");
        InterfaceC4765j0 d10 = this.f51625e.d();
        try {
            if (this.f51623c.get()) {
                AutoCloseableKt.closeFinally(d10, null);
                return;
            }
            File y14 = y1();
            if ((y14 == null || !y14.exists()) && (y12 = y1()) != null) {
                y12.createNewFile();
            }
            if (this.f51630j.isEmpty() && (y13 = y1()) != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(y13), Charsets.UTF_8), 8192);
                try {
                    Sequence<String> lineSequence = TextStreamsKt.lineSequence(bufferedReader);
                    LinkedHashMap linkedHashMap = this.f51630j;
                    Iterator<String> it = lineSequence.iterator();
                    while (it.hasNext()) {
                        List split$default = StringsKt.split$default((CharSequence) it.next(), new String[]{"="}, false, 2, 2, (Object) null);
                        Pair pair = TuplesKt.to((String) split$default.get(0), (String) split$default.get(1));
                        linkedHashMap.put(pair.getFirst(), pair.getSecond());
                    }
                    CloseableKt.closeFinally(bufferedReader, null);
                } finally {
                }
            }
            if (str == null) {
                this.f51630j.remove(key);
            } else {
                this.f51630j.put(key, str);
            }
            File y15 = y1();
            if (y15 != null) {
                Set entrySet = this.f51630j.entrySet();
                Intrinsics.checkNotNullExpressionValue(entrySet, "<get-entries>(...)");
                FilesKt.writeText$default(y15, CollectionsKt.joinToString$default(entrySet, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, null, null, 0, null, c.f51633d, 30, null), null, 2, null);
                Unit unit = Unit.INSTANCE;
            }
            AutoCloseableKt.closeFinally(d10, null);
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String Z1(long j10) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        InterfaceC4765j0 d10 = this.f51626f.d();
        try {
            CollectionsKt.removeAll(this.f51629i, (Function1) new e(j10, this, objectRef));
            AutoCloseableKt.closeFinally(d10, null);
            return (String) objectRef.element;
        } finally {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InterfaceC4765j0 d10 = this.f51624d.d();
        try {
            io.sentry.android.replay.video.c cVar = this.f51627g;
            if (cVar != null) {
                cVar.i();
            }
            this.f51627g = null;
            Unit unit = Unit.INSTANCE;
            AutoCloseableKt.closeFinally(d10, null);
            this.f51623c.set(true);
        } finally {
        }
    }

    public final Long m1() {
        InterfaceC4765j0 d10 = this.f51626f.d();
        try {
            j jVar = (j) CollectionsKt.firstOrNull(this.f51629i);
            Long valueOf = jVar != null ? Long.valueOf(jVar.c()) : null;
            AutoCloseableKt.closeFinally(d10, null);
            return valueOf;
        } finally {
        }
    }

    public final List n1() {
        return this.f51629i;
    }

    public final io.sentry.android.replay.c w0(long j10, long j11, int i10, int i11, int i12, int i13, int i14, File videoFile) {
        InterfaceC4765j0 interfaceC4765j0;
        int i15;
        Intrinsics.checkNotNullParameter(videoFile, "videoFile");
        if (videoFile.exists() && videoFile.length() > 0) {
            videoFile.delete();
        }
        InterfaceC4765j0 d10 = this.f51626f.d();
        try {
            List arrayList = this.f51629i.isEmpty() ? new ArrayList() : CollectionsKt.toMutableList((Collection) this.f51629i);
            AutoCloseableKt.closeFinally(d10, null);
            if (arrayList.isEmpty()) {
                this.f51621a.getLogger().c(EnumC4788n3.DEBUG, "No captured frames, skipping generating a video segment", new Object[0]);
                return null;
            }
            InterfaceC4765j0 d11 = this.f51624d.d();
            try {
                interfaceC4765j0 = d11;
                try {
                    io.sentry.android.replay.video.c cVar = new io.sentry.android.replay.video.c(this.f51621a, new io.sentry.android.replay.video.a(videoFile, i12, i11, i13, i14, null, 32, null), null, 4, null);
                    cVar.j();
                    AutoCloseableKt.closeFinally(interfaceC4765j0, null);
                    this.f51627g = cVar;
                    long j12 = 1000 / i13;
                    Object firstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) arrayList);
                    long j13 = j11 + j10;
                    LongProgression step = RangesKt.step(RangesKt.until(j11, j13), j12);
                    long first = step.getFirst();
                    long last = step.getLast();
                    long step2 = step.getStep();
                    if ((step2 <= 0 || first > last) && (step2 >= 0 || last > first)) {
                        i15 = 0;
                    } else {
                        long j14 = first;
                        int i16 = 0;
                        while (true) {
                            Iterator it = arrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                j jVar = (j) it.next();
                                long j15 = j14 + j12;
                                long c10 = jVar.c();
                                if (j14 <= c10 && c10 <= j15) {
                                    firstOrNull = jVar;
                                    break;
                                }
                                if (jVar.c() > j15) {
                                    break;
                                }
                            }
                            if (D0((j) firstOrNull)) {
                                i16++;
                            } else if (firstOrNull != null) {
                                A0(((j) firstOrNull).b());
                                d10 = this.f51626f.d();
                                try {
                                    TypeIntrinsics.asMutableCollection(this.f51629i).remove(firstOrNull);
                                    AutoCloseableKt.closeFinally(d10, null);
                                    arrayList.remove(firstOrNull);
                                    firstOrNull = null;
                                } finally {
                                }
                            }
                            if (j14 == last) {
                                break;
                            }
                            j14 += step2;
                        }
                        i15 = i16;
                    }
                    if (i15 != 0) {
                        d10 = this.f51624d.d();
                        try {
                            io.sentry.android.replay.video.c cVar2 = this.f51627g;
                            if (cVar2 != null) {
                                cVar2.i();
                            }
                            io.sentry.android.replay.video.c cVar3 = this.f51627g;
                            long c11 = cVar3 != null ? cVar3.c() : 0L;
                            this.f51627g = null;
                            Unit unit = Unit.INSTANCE;
                            AutoCloseableKt.closeFinally(d10, null);
                            Z1(j13);
                            return new io.sentry.android.replay.c(videoFile, i15, c11);
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    this.f51621a.getLogger().c(EnumC4788n3.DEBUG, "Generated a video with no frames, not capturing a replay segment", new Object[0]);
                    d10 = this.f51624d.d();
                    try {
                        io.sentry.android.replay.video.c cVar4 = this.f51627g;
                        if (cVar4 != null) {
                            cVar4.i();
                        }
                        this.f51627g = null;
                        Unit unit2 = Unit.INSTANCE;
                        AutoCloseableKt.closeFinally(d10, null);
                        A0(videoFile);
                        return null;
                    } finally {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        AutoCloseableKt.closeFinally(interfaceC4765j0, th3);
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                interfaceC4765j0 = d11;
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public final File y1() {
        return (File) this.f51631k.getValue();
    }
}

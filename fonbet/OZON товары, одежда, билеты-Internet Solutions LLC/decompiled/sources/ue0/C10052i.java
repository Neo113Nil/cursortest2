package ue0;

import C.o0;
import Sc.C4001c;
import Sc.InterfaceC4008j;
import Sc.k;
import android.os.DeadSystemException;
import android.os.Environment;
import android.os.Process;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;

/* renamed from: ue0.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10052i implements InterfaceC10046c {

    /* renamed from: a, reason: collision with root package name */
    private final String f100678a = new SimpleDateFormat("yyyy-MM-dd'T'HH-mm-ss", Locale.getDefault()).format(new Date());

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f100679b = k.b(new a());

    /* renamed from: c, reason: collision with root package name */
    private final ExecutorService f100680c = Executors.newSingleThreadExecutor();

    /* renamed from: ue0.i$a */
    static final class a extends AbstractC7737t implements Function0<File> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final File invoke() {
            return C10052i.g(C10052i.this);
        }
    }

    public static void d(C10052i c10052i, String str, String str2) {
        c10052i.h("INFO", str, str2);
    }

    public static void e(C10052i c10052i, String str, String str2) {
        c10052i.h("DEBUG", str, str2);
    }

    public static void f(C10052i c10052i, String str, String str2, Throwable th2) {
        String str3;
        c10052i.h("ERROR", str, str2);
        if (th2 != null) {
            Throwable th3 = th2;
            while (th3 != null && !(th3 instanceof UnknownHostException)) {
                if (th3 instanceof DeadSystemException) {
                    str3 = "DeadSystemException: The system died;  earlier logs will point to the root cause \n";
                    break;
                }
                th3 = th3.getCause();
            }
            str3 = "";
            if (th3 == null) {
                str3 = U7.d.e(str3, C4001c.b(th2));
            }
            c10052i.h("ERROR", str, str3);
        }
    }

    public static final File g(C10052i c10052i) {
        c10052i.getClass();
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS);
        if (!externalStoragePublicDirectory.exists()) {
            externalStoragePublicDirectory.mkdirs();
        }
        return new File(externalStoragePublicDirectory, o0.c(new StringBuilder(), c10052i.f100678a, ".logcat"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00fe, code lost:
    
        r4 = r0 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0100, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0103, code lost:
    
        if (r4 <= 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0105, code lost:
    
        r13.seek(r4);
        r6 = (char) r13.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0111, code lost:
    
        if (kotlin.text.CharsKt.c(r6) == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0113, code lost:
    
        r4 = r4 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0117, code lost:
    
        if (r6 == '[') goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0119, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x011a, code lost:
    
        r13.seek(r0);
        r0 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0122, code lost:
    
        if (r9 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0124, code lost:
    
        r0.append(",");
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0129, code lost:
    
        r0.append("\n");
        r0.append(r12.toString(4));
        r0.append("\n");
        r0.append("]}");
        r12 = r0.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, "toString(...)");
        r12 = r12.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, "getBytes(...)");
        r13.write(r12);
        r12 = kotlin.Unit.f71690a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0158, code lost:
    
        r13.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x015c, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void h(String str, String str2, String str3) {
        int myPid = Process.myPid();
        long id2 = Thread.currentThread().getId();
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = 1000;
        long j12 = currentTimeMillis / j11;
        long j13 = (currentTimeMillis % j11) * 1000000;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("logLevel", str);
        jSONObject.put("pid", myPid);
        jSONObject.put("tid", id2);
        jSONObject.put("applicationId", "pid-" + myPid);
        jSONObject.put("processName", "pid-" + myPid);
        jSONObject.put("tag", str2);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("seconds", j12);
        jSONObject2.put("nanos", j13);
        Unit unit = Unit.f71690a;
        jSONObject.put("timestamp", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(CommentV3DTO.HEADER_FIELD_NAME, jSONObject);
        jSONObject3.put("message", str3);
        synchronized (this) {
            try {
                if (((File) this.f100679b.getValue()).exists() && ((File) this.f100679b.getValue()).length() != 0) {
                    RandomAccessFile randomAccessFile = new RandomAccessFile((File) this.f100679b.getValue(), "rw");
                    try {
                        long length = randomAccessFile.length() - 1;
                        while (length > 0) {
                            randomAccessFile.seek(length);
                            if (!CharsKt.c((char) randomAccessFile.readByte())) {
                                break;
                            } else {
                                length--;
                            }
                        }
                        randomAccessFile.seek(length);
                        if (((char) randomAccessFile.readByte()) != '}') {
                            throw new IOException("Неверный формат файла");
                        }
                        while (true) {
                            length--;
                            if (length <= 0) {
                                break;
                            }
                            randomAccessFile.seek(length);
                            char readByte = (char) randomAccessFile.readByte();
                            if (!CharsKt.c(readByte)) {
                                if (readByte != ']') {
                                    throw new IOException("Неверный формат файла");
                                }
                            }
                        }
                    } finally {
                    }
                }
                JSONObject jSONObject4 = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(jSONObject3);
                jSONObject4.put("logcatMessages", jSONArray);
                File file = (File) this.f100679b.getValue();
                String jSONObject5 = jSONObject4.toString(4);
                Intrinsics.checkNotNullExpressionValue(jSONObject5, "toString(...)");
                bd.h.o(file, jSONObject5, Charsets.UTF_8);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ue0.InterfaceC10046c
    public final void a(@NotNull final String tag, @NotNull final String message, final Throwable th2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f100680c.execute(new Runnable() { // from class: ue0.f
            @Override // java.lang.Runnable
            public final void run() {
                C10052i.f(C10052i.this, tag, message, th2);
            }
        });
    }

    @Override // ue0.InterfaceC10046c
    public final void b(@NotNull final String tag, @NotNull final String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f100680c.execute(new Runnable() { // from class: ue0.g
            @Override // java.lang.Runnable
            public final void run() {
                C10052i.e(C10052i.this, tag, message);
            }
        });
    }

    @Override // ue0.InterfaceC10046c
    public final void c(@NotNull final String tag, @NotNull final String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f100680c.execute(new Runnable() { // from class: ue0.h
            @Override // java.lang.Runnable
            public final void run() {
                C10052i.d(C10052i.this, tag, message);
            }
        });
    }

    @NotNull
    public final String toString() {
        return "Logger to file " + this.f100678a;
    }
}

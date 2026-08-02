package l1;

import android.util.JsonWriter;
import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4134a;
import e1.InterfaceC4143j;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* renamed from: l1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5366l {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f55525a = false;

    /* renamed from: b, reason: collision with root package name */
    public static final com.google.common.collect.B f55526b = com.google.common.collect.B.a().f("TransformerInternal", AbstractC3445z.u("Start")).f("AssetLoader", AbstractC3445z.v("InputFormat", "OutputFormat")).f("AudioDecoder", AbstractC3445z.z("InputFormat", "OutputFormat", "AcceptedInput", "ProducedOutput", "InputEnded", "OutputEnded")).f("AudioGraph", AbstractC3445z.v("RegisterNewInputStream", "OutputEnded")).f("AudioMixer", AbstractC3445z.w("RegisterNewInputStream", "OutputFormat", "ProducedOutput")).f("AudioEncoder", AbstractC3445z.z("InputFormat", "OutputFormat", "AcceptedInput", "ProducedOutput", "InputEnded", "OutputEnded")).f("VideoDecoder", AbstractC3445z.z("InputFormat", "OutputFormat", "AcceptedInput", "ProducedOutput", "InputEnded", "OutputEnded")).f("VideoFrameProcessor", AbstractC3445z.B("RegisterNewInputStream", "SurfaceTextureInput", "QueueFrame", "QueueBitmap", "QueueTexture", "RenderedToOutputSurface", "OutputTextureRendered", "ReceiveEndOfAllInput", "SignalEnded")).f("ExternalTextureManager", AbstractC3445z.v("SignalEOS", "SurfaceTextureTransformFix")).f("BitmapTextureManager", AbstractC3445z.u("SignalEOS")).f("TexIdTextureManager", AbstractC3445z.u("SignalEOS")).f("Compositor", AbstractC3445z.u("OutputTextureRendered")).f("VideoEncoder", AbstractC3445z.z("InputFormat", "OutputFormat", "AcceptedInput", "ProducedOutput", "InputEnded", "OutputEnded")).f("Muxer", AbstractC3445z.y("InputFormat", "CanWriteSample", "AcceptedInput", "InputEnded", "OutputEnded")).c();

    /* renamed from: c, reason: collision with root package name */
    public static final Map f55527c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static long f55528d = InterfaceC4143j.f45530a.b();

    /* renamed from: l1.l$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final long f55529a;

        /* renamed from: b, reason: collision with root package name */
        public final long f55530b;

        /* renamed from: c, reason: collision with root package name */
        public final String f55531c;

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(e1.Z.G("%s@%dms", AbstractC5366l.g(this.f55529a), Long.valueOf(this.f55530b)));
            sb2.append(this.f55531c.isEmpty() ? "" : e1.Z.G("(%s)", this.f55531c));
            return sb2.toString();
        }

        public b(long j10, long j11, String str) {
            this.f55529a = j10;
            this.f55530b = j11;
            this.f55531c = str;
        }
    }

    /* renamed from: l1.l$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final List f55532a = new ArrayList(10);

        /* renamed from: b, reason: collision with root package name */
        public final Queue f55533b = new ArrayDeque(10);

        /* renamed from: c, reason: collision with root package name */
        public int f55534c = 0;

        public void a(b bVar) {
            if (this.f55532a.size() < 10) {
                this.f55532a.add(bVar);
            } else {
                this.f55533b.add(bVar);
                if (this.f55533b.size() > 10) {
                    this.f55533b.remove();
                }
            }
            this.f55534c++;
        }

        public void b(JsonWriter jsonWriter) {
            jsonWriter.beginObject().name("count").value(this.f55534c).name("first").beginArray();
            Iterator it = this.f55532a.iterator();
            while (it.hasNext()) {
                jsonWriter.value(((b) it.next()).toString());
            }
            jsonWriter.endArray();
            if (!this.f55533b.isEmpty()) {
                jsonWriter.name("last").beginArray();
                Iterator it2 = this.f55533b.iterator();
                while (it2.hasNext()) {
                    jsonWriter.value(((b) it2.next()).toString());
                }
                jsonWriter.endArray();
            }
            jsonWriter.endObject();
        }
    }

    public static synchronized String b() {
        synchronized (AbstractC5366l.class) {
            if (!f55525a) {
                return "\"Tracing disabled\"";
            }
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                com.google.common.collect.m0 it = f55526b.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    List<String> list = (List) entry.getValue();
                    jsonWriter.name(str);
                    Map map = (Map) f55527c.get(str);
                    jsonWriter.beginObject();
                    for (String str2 : list) {
                        jsonWriter.name(str2);
                        if (map == null || !map.containsKey(str2)) {
                            jsonWriter.value("No events");
                        } else {
                            ((c) AbstractC4134a.e((c) map.get(str2))).b(jsonWriter);
                        }
                    }
                    jsonWriter.endObject();
                }
                jsonWriter.endObject();
                String stringWriter2 = stringWriter.toString();
                e1.Z.m(jsonWriter);
                return stringWriter2;
            } catch (IOException unused) {
                e1.Z.m(jsonWriter);
                return "\"Error generating trace summary\"";
            } catch (Throwable th2) {
                e1.Z.m(jsonWriter);
                throw th2;
            }
        }
    }

    public static String c(boolean z10, boolean z11) {
        return z10 ? z11 ? "VideoDecoder" : "AudioDecoder" : z11 ? "VideoEncoder" : "AudioEncoder";
    }

    public static synchronized void d(boolean z10, boolean z11, String str, long j10, String str2, Object... objArr) {
        synchronized (AbstractC5366l.class) {
            f(c(z10, z11), str, j10, str2, objArr);
        }
    }

    public static synchronized void e(String str, String str2, long j10) {
        synchronized (AbstractC5366l.class) {
            f(str, str2, j10, "", new Object[0]);
        }
    }

    public static synchronized void f(String str, String str2, long j10, String str3, Object... objArr) {
        synchronized (AbstractC5366l.class) {
            try {
                if (f55525a) {
                    long b10 = InterfaceC4143j.f45530a.b() - f55528d;
                    Map map = f55527c;
                    if (!map.containsKey(str)) {
                        map.put(str, new LinkedHashMap());
                    }
                    Map map2 = (Map) map.get(str);
                    if (!map2.containsKey(str2)) {
                        map2.put(str2, new c());
                    }
                    ((c) map2.get(str2)).a(new b(j10, b10, e1.Z.G(str3, objArr)));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static String g(long j10) {
        if (j10 == -9223372036854775807L) {
            return "UNSET";
        }
        if (j10 == Long.MIN_VALUE) {
            return "EOS";
        }
        return j10 + "us";
    }

    public static synchronized void h() {
        synchronized (AbstractC5366l.class) {
            f55527c.clear();
            f55528d = InterfaceC4143j.f45530a.b();
        }
    }
}

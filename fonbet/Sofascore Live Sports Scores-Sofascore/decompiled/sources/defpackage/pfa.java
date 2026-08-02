package defpackage;

import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class pfa {
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.setLenient(true);
            x4k x4kVar = b5k.a;
            o49.e(this, jsonWriter);
            return stringWriter.toString();
        } catch (IOException e) {
            a70.j(e);
            return null;
        }
    }
}

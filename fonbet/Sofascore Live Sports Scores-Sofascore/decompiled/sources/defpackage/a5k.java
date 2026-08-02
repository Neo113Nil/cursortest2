package defpackage;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class a5k extends u4k {
    public final /* synthetic */ int a;

    public /* synthetic */ a5k(int i) {
        this.a = i;
    }

    @Override // defpackage.u4k
    public final Object a(JsonReader jsonReader) {
        switch (this.a) {
            case 0:
                return new AtomicBoolean(jsonReader.nextBoolean());
            default:
                try {
                    return new AtomicInteger(jsonReader.nextInt());
                } catch (NumberFormatException e) {
                    throw new yga(e);
                }
        }
    }

    @Override // defpackage.u4k
    public final void b(JsonWriter jsonWriter, Object obj) {
        switch (this.a) {
            case 0:
                jsonWriter.value(((AtomicBoolean) obj).get());
                break;
            default:
                jsonWriter.value(((AtomicInteger) obj).get());
                break;
        }
    }
}

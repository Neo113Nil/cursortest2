package defpackage;

import android.util.JsonReader;
import com.mbridge.msdk.config.dynamic.binddata.wrapper.a;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class mn0 implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ mn0(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        CopyOnWriteArrayList a;
        switch (this.a) {
            case 0:
                return Integer.valueOf(Integer.bitCount(((Integer) obj).intValue()));
            case 1:
                String name = ((File) obj).getName();
                name.getClass();
                if (name.equals("trigger-type-anomaly")) {
                    return 8;
                }
                return !name.equals("trigger-type-oom") ? 0 : 7;
            case 2:
                File file = (File) obj;
                try {
                    tx3 tx3Var = vx3.g;
                    String f = vx3.f(file);
                    tx3Var.getClass();
                    try {
                        JsonReader jsonReader = new JsonReader(new StringReader(f));
                        try {
                            ws0 h = tx3.h(jsonReader);
                            jsonReader.close();
                            return Optional.of(h);
                        } catch (Throwable th) {
                            try {
                                jsonReader.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (IllegalStateException e) {
                        throw new IOException(e);
                    }
                } catch (IOException unused) {
                    return Optional.empty();
                }
            case 3:
                return new ArrayList();
            case 4:
                return new ConcurrentHashMap();
            case 5:
                return Boolean.TRUE;
            case 6:
                a = a.a((String) obj);
                return a;
            case 7:
                return ((String) obj).toLowerCase();
            default:
                return ((String) obj).toUpperCase();
        }
    }
}

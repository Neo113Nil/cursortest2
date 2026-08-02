package defpackage;

import com.google.gson.Gson;
import com.google.gson.stream.JsonWriter;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class r49 implements qs3 {
    public static final zdc c;
    public static final Charset d;
    public final Gson a;
    public final u4k b;

    static {
        Regex regex = zdc.e;
        c = bea.v("application/json; charset=UTF-8");
        d = Charset.forName(C.UTF8_NAME);
    }

    public r49(Gson gson, u4k u4kVar) {
        this.a = gson;
        this.b = u4kVar;
    }

    @Override // defpackage.qs3
    public final Object convert(Object obj) {
        x52 x52Var = new x52();
        JsonWriter newJsonWriter = this.a.newJsonWriter(new OutputStreamWriter(new v52(x52Var, 0), d));
        this.b.b(newJsonWriter, obj);
        newJsonWriter.close();
        return yzf.create(c, x52Var.l0(x52Var.b));
    }
}

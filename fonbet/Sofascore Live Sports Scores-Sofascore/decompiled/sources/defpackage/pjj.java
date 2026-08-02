package defpackage;

import com.google.gson.stream.JsonReader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public enum pjj extends tjj {
    public pjj() {
        super("DOUBLE", 0);
    }

    @Override // defpackage.ujj
    public final Number a(JsonReader jsonReader) {
        return Double.valueOf(jsonReader.nextDouble());
    }
}

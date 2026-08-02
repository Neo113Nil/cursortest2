package defpackage;

import java.lang.reflect.Field;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public enum rz7 extends yz7 {
    public rz7() {
        super("IDENTITY", 0);
    }

    @Override // com.google.gson.FieldNamingStrategy
    public final String translateName(Field field) {
        return field.getName();
    }
}

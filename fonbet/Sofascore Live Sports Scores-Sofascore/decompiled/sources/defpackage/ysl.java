package defpackage;

import com.blaze.blazesdk.shared.BlazeSDK;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty1;
import kotlin.reflect.full.KClasses;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ysl extends u4k {
    public final /* synthetic */ u4k a;
    public final /* synthetic */ u5k b;

    public ysl(u4k u4kVar, u5k u5kVar) {
        this.a = u4kVar;
        this.b = u5kVar;
    }

    @Override // defpackage.u4k
    public final Object a(JsonReader jsonReader) {
        jsonReader.getClass();
        try {
            Object a = this.a.a(jsonReader);
            if (a != null) {
                KClass createKotlinClass = duf.a.createKotlinClass(this.b.a);
                createKotlinClass.getClass();
                for (KProperty1 kProperty1 : KClasses.getMemberProperties(createKotlinClass)) {
                    if (!kProperty1.getReturnType().isMarkedNullable() && kProperty1.get(a) == null) {
                        throw new nga("Value of non-nullable member [" + kProperty1.getName() + "] cannot be null");
                    }
                }
            }
            return a;
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            throw th;
        }
    }

    @Override // defpackage.u4k
    public final void b(JsonWriter jsonWriter, Object obj) {
        jsonWriter.getClass();
        this.a.b(jsonWriter, obj);
    }
}

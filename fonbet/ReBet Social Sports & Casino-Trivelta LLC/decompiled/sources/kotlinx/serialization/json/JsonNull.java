package kotlinx.serialization.json;

import Zh.InterfaceC1901b;
import Zh.n;
import com.google.crypto.tink.integration.android.b;
import ei.C4210A;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@n(with = C4210A.class)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lkotlinx/serialization/json/JsonNull;", "Lkotlinx/serialization/json/JsonPrimitive;", "<init>", "()V", "LZh/b;", "serializer", "()LZh/b;", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "content", "", b.f37029b, "()Z", "isString", "kotlinx-serialization-json"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class JsonNull extends JsonPrimitive {

    @NotNull
    public static final JsonNull INSTANCE = new JsonNull();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final String content = "null";

    public JsonNull() {
        super(null);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public String a() {
        return content;
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public boolean b() {
        return false;
    }

    @NotNull
    public final InterfaceC1901b serializer() {
        return C4210A.f46065a;
    }
}

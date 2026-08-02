package ed0;

import java.util.Map;
import jc0.AbstractC7345h;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ed0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6348a extends AbstractC7345h {

    /* renamed from: ed0.a$a, reason: collision with other inner class name */
    static final class C0977a extends AbstractC7737t implements Function1<Map<String, Object>, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f62164b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f62165c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0977a(String str, String str2) {
            super(1);
            this.f62164b = str;
            this.f62165c = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Map<String, Object> map) {
            Map<String, Object> addPayload = map;
            Intrinsics.checkNotNullParameter(addPayload, "$this$addPayload");
            String str = this.f62164b;
            if (str != null) {
                addPayload.put("custom_dimension4", str);
            }
            String str2 = this.f62165c;
            if (str2 != null) {
                addPayload.put("custom_dimension6", str2);
            }
            return Unit.f71690a;
        }
    }

    public C6348a() {
        throw null;
    }

    @NotNull
    public final String e(@NotNull String trackingAction, String str, String str2) {
        Intrinsics.checkNotNullParameter(trackingAction, "trackingAction");
        return (str == null && str2 == null) ? trackingAction : b(trackingAction, new C0977a(str, str2));
    }
}

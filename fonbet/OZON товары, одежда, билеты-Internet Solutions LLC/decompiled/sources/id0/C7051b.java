package id0;

import Fb0.f;
import Sc.InterfaceC4008j;
import com.google.android.gms.common.internal.ImagesContract;
import com.squareup.moshi.Moshi;
import java.util.Map;
import jc0.AbstractC7345h;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

/* renamed from: id0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7051b extends AbstractC7345h {

    /* renamed from: id0.b$a */
    static final class a extends AbstractC7737t implements Function1<Map<String, Object>, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f66253c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Integer f66254d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f66255e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f66256f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Integer num, String str2, String str3) {
            super(1);
            this.f66253c = str;
            this.f66254d = num;
            this.f66255e = str2;
            this.f66256f = str3;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Map<String, Object> map) {
            Map<String, Object> addPayload = map;
            Intrinsics.checkNotNullParameter(addPayload, "$this$addPayload");
            C7051b c7051b = C7051b.this;
            C7051b.e(c7051b, addPayload, ImagesContract.URL, this.f66253c);
            C7051b.e(c7051b, addPayload, "index", this.f66254d);
            C7051b.e(c7051b, addPayload, "status", this.f66255e);
            addPayload.put("widget_name", "error.composerError");
            String str = this.f66256f;
            if (str != null) {
                addPayload.put("type", "error");
                addPayload.put("id", str);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7051b(@NotNull f ozonIdConfig, @NotNull InterfaceC4008j<Moshi> moshi) {
        super(ozonIdConfig, moshi);
        Intrinsics.checkNotNullParameter(ozonIdConfig, "ozonIdConfig");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
    }

    public static final /* synthetic */ void e(C7051b c7051b, Map map, String str, Object obj) {
        c7051b.getClass();
        AbstractC7345h.d(map, str, obj);
    }

    public static /* synthetic */ String g(C7051b c7051b, Integer num, String str, int i11) {
        if ((i11 & 1) != 0) {
            num = -1;
        }
        return c7051b.f(str, null, num, null);
    }

    @NotNull
    public final String f(String str, String str2, Integer num, String str3) {
        return b(c(TokenizedTrackingInfo.ACTION_ERROR_VIEW), new a(str2, num, str, str3));
    }
}

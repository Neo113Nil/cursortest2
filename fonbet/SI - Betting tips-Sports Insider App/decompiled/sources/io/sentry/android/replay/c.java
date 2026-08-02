package io.sentry.android.replay;

import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.MatchResult;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends Lambda implements Function1 {

    /* renamed from: f, reason: collision with root package name */
    public static final c f15951f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f15952g;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15953e;

    static {
        int i5 = 1;
        f15951f = new c(i5, 0);
        f15952g = new c(i5, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i5, int i10) {
        super(i5);
        this.f15953e = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15953e) {
            case 0:
                MatchResult it = (MatchResult) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                String upperCase = String.valueOf(kotlin.text.d0.y(it.getValue())).toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                return upperCase;
            default:
                Map.Entry entry = (Map.Entry) obj;
                Intrinsics.checkNotNullParameter(entry, "<name for destructuring parameter 0>");
                return ((String) entry.getKey()) + '=' + ((String) entry.getValue());
        }
    }
}

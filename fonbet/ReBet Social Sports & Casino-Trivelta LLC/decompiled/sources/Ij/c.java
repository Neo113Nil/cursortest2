package Ij;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import zendesk.core.Constants;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final a f5858b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f5859a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public c(Rj.c configDataProvider) {
        Intrinsics.checkNotNullParameter(configDataProvider, "configDataProvider");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, Constants.USER_AGENT_HEADER_TEMPLATE, Arrays.copyOf(new Object[]{configDataProvider.b(), Integer.valueOf(configDataProvider.a()), "Talk"}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        this.f5859a = format;
    }
}

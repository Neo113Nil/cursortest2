package c90;

import a90.C4966d;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.tabber.presentation.finance.FinanceActivity;

/* renamed from: c90.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC5773a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C0860a f56817a = C0860a.f56818a;

    /* renamed from: c90.a$a, reason: collision with other inner class name */
    public static final class C0860a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C0860a f56818a = new C0860a();

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private static final List<String> f56819b = C7714v.b0("is-mobile-autotests", "x-o3-test-name", "host-name");

        @NotNull
        public static Intent a(@NotNull Context context, @NotNull Uri uri) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(FinanceActivity.class, "cls");
            Intent intent = new Intent(context, (Class<?>) FinanceActivity.class);
            intent.setAction("android.intent.action.VIEW");
            intent.setData(uri);
            return intent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Boolean] */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.StringBuilder] */
        @NotNull
        public static Uri b(String str, String str2, String str3) {
            StringBuilder sb2 = new StringBuilder("ozonbank://is-mobile-autotests?");
            if (str2 != null) {
                Fj.c.f("x-o3-test-name=", str2, "&", sb2);
            }
            if (str3 != null) {
                Fj.c.f("host-name=", str3, "&", sb2);
            }
            if (str == 0) {
                str = Boolean.FALSE;
            }
            sb2.append("is-mobile-autotests=" + str);
            Uri parse = Uri.parse(sb2.toString());
            Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
            return parse;
        }

        @NotNull
        public static Uri c(@NotNull String features) {
            Intrinsics.checkNotNullParameter(features, "features");
            Uri parse = Uri.parse("ozonbank://mock-features?features=" + features);
            Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
            return parse;
        }

        @NotNull
        public static Uri d(@NotNull String features) {
            Intrinsics.checkNotNullParameter(features, "features");
            Uri parse = Uri.parse("ozonbank://testing-features?testing-features-version=" + features);
            Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
            return parse;
        }

        @NotNull
        public static Uri e() {
            Uri parse = Uri.parse("ozonbank://is-mobile-autotests?is-mobile-autotests=false&x-o3-test-name=&host-name=");
            Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
            return parse;
        }

        @NotNull
        public static Uri f() {
            Uri parse = Uri.parse("ozonbank://mock-features?features=");
            Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
            return parse;
        }

        @NotNull
        public static Uri g() {
            Uri parse = Uri.parse("ozonbank://testing-features?testing-features-version=");
            Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
            return parse;
        }
    }

    void a(@NotNull String str);

    String b();

    void c();

    boolean canHandle(Uri uri);

    String d();

    void e();

    void f();

    void g(@NotNull String str);

    String getABVariantsHeader();

    @NotNull
    String getHeaderToken();

    boolean getIsAutotestsHeader();

    String getLoginHeader();

    String getMeshHeader();

    String getPasswordHeader();

    @NotNull
    String getTestingFeaturesHeader();

    @NotNull
    C5774b h();

    String i();

    @NotNull
    C4966d j();

    void k(@NotNull String str);

    void l(@NotNull String str);

    void m();

    String n();

    void o();

    void p(@NotNull List<String> list, @NotNull List<String> list2, @NotNull Map<String, ? extends Object> map);

    void q();

    @NotNull
    String r();

    String s();
}

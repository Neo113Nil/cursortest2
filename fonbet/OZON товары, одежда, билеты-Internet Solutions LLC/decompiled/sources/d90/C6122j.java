package d90;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.network.models.TestingFeaturesDto;

/* renamed from: d90.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6122j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final SharedPreferences f61388a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f61389b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f61390c;

    public C6122j(@NotNull Context context, @NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f61388a = sharedPreferences;
        String string = context.getString(R.string.fintech_testing_features_header_key);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.f61389b = string;
        String string2 = context.getString(R.string.fintech_testing_mock_features_header_key);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        this.f61390c = string2;
    }

    public final void a() {
        SharedPreferences.Editor edit = this.f61388a.edit();
        edit.remove(this.f61389b);
        edit.commit();
    }

    @NotNull
    public final String b() {
        String string = this.f61388a.getString(this.f61389b, null);
        return string == null ? "" : string;
    }

    @NotNull
    public final String c() {
        String string = this.f61388a.getString(this.f61390c, null);
        return string == null ? "" : string;
    }

    public final void d(@NotNull String features) {
        String json;
        Intrinsics.checkNotNullParameter(features, "features");
        TestingFeaturesDto.INSTANCE.getClass();
        TestingFeaturesDto a11 = TestingFeaturesDto.Companion.a(features);
        String str = "";
        if (!kotlin.text.h.K(features) && (json = a11.toJson()) != null) {
            str = json;
        }
        SharedPreferences.Editor edit = this.f61388a.edit();
        edit.putString(this.f61389b, str);
        edit.commit();
    }

    public final void e(@NotNull String features) {
        Intrinsics.checkNotNullParameter(features, "features");
        SharedPreferences.Editor edit = this.f61388a.edit();
        edit.putString(this.f61390c, features);
        edit.commit();
    }
}

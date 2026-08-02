package d90;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.network.models.TestingFeaturesV2DeleteDto;
import ru.ozon.fintech.network.models.TestingFeaturesV2Dto;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final SharedPreferences f61393a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f61394b;

    public l(@NotNull Context context, @NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f61393a = sharedPreferences;
        String string = context.getString(R.string.fintech_testing_features_v2_header_key);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.f61394b = string;
    }

    public final void a() {
        SharedPreferences.Editor edit = this.f61393a.edit();
        edit.remove(this.f61394b);
        edit.commit();
    }

    public final String b() {
        return this.f61393a.getString(this.f61394b, null);
    }

    public final void c(@NotNull List<String> deleteFeatures, @NotNull List<String> deleteSwitches, @NotNull Map<String, ? extends Object> editFeatures) {
        Intrinsics.checkNotNullParameter(deleteFeatures, "deleteFeatures");
        Intrinsics.checkNotNullParameter(deleteSwitches, "deleteSwitches");
        Intrinsics.checkNotNullParameter(editFeatures, "editFeatures");
        TestingFeaturesV2Dto testingFeaturesV2Dto = new TestingFeaturesV2Dto(new TestingFeaturesV2DeleteDto(deleteFeatures, deleteSwitches), editFeatures);
        SharedPreferences.Editor edit = this.f61393a.edit();
        edit.putString(this.f61394b, testingFeaturesV2Dto.toJson());
        edit.commit();
    }
}

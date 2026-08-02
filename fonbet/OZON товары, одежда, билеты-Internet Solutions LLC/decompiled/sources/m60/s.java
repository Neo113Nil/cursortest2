package m60;

import com.squareup.moshi.Moshi;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* loaded from: classes3.dex */
public final class s implements U50.a, U50.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final S80.b f74576a;

    public s(@NotNull S80.b fintechNavigation, @NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        this.f74576a = fintechNavigation;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "photo_preview";
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((U50.j) callback).invoke(handleSync(weakReference, parameterJson));
    }

    @Override // U50.d
    @NotNull
    public final NativeResult handleSync(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson) {
        ArrayList arrayList;
        ArrayList arrayList2;
        NativeResult.Success success;
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        try {
            JSONArray optJSONArray = new JSONObject(parameterJson).optJSONArray("urls");
            if (optJSONArray == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                int length = optJSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    arrayList.add(optJSONArray.getString(i11));
                }
            }
            JSONArray optJSONArray2 = new JSONObject(parameterJson).optJSONArray("base64");
            if (optJSONArray2 == null) {
                arrayList2 = null;
            } else {
                arrayList2 = new ArrayList();
                int length2 = optJSONArray2.length();
                for (int i12 = 0; i12 < length2; i12++) {
                    arrayList2.add(optJSONArray2.getString(i12));
                }
            }
            this.f74576a.t0(new JSONObject(parameterJson).optInt("selected"), arrayList, arrayList2);
            NativeResult.Success.INSTANCE.getClass();
            success = NativeResult.Success.DEFAULT_WITH_SUCCESS;
            return success;
        } catch (Exception e11) {
            L80.a.c("NavigationPhotoPreview", null, e11);
            return new NativeResult.Error("error photo preview", null, 2, null);
        }
    }
}

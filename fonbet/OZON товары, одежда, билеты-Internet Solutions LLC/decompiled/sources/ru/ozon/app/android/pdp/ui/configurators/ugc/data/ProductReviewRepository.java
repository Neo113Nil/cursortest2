package ru.ozon.app.android.pdp.ui.configurators.ugc.data;

import Lm0.a;
import Sc.r;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ4\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/data/ProductReviewRepository;", "", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "", "actionName", "", "params", "LSc/r;", "processAction-0E7RQCE", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "processAction", "parseDataFieldToMap", "(Ljava/util/Map;)Ljava/util/Map;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Companion", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProductReviewRepository {

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final JsonParser jsonDeserializer;
    public static final int $stable = 8;

    public ProductReviewRepository(@NotNull ActionV2Repository actionV2Repository, @NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.actionV2Repository = actionV2Repository;
        this.jsonDeserializer = jsonDeserializer;
    }

    public final Map<String, String> parseDataFieldToMap(Map<String, String> params) {
        String str;
        if (params != null && (str = params.get("data")) != null) {
            try {
                return (Map) this.jsonDeserializer.fromJson(str, Map.class);
            } catch (Exception e11) {
                a.f17149a.e(e11, "Parsing failed for data=".concat(str), new Object[0]);
            }
        }
        return params;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: processAction-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m874processAction0E7RQCE(@NotNull String str, Map<String, String> map, @NotNull d<? super r<? extends Object>> dVar) {
        ProductReviewRepository$processAction$1 productReviewRepository$processAction$1;
        int i11;
        if (dVar instanceof ProductReviewRepository$processAction$1) {
            productReviewRepository$processAction$1 = (ProductReviewRepository$processAction$1) dVar;
            int i12 = productReviewRepository$processAction$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                productReviewRepository$processAction$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = productReviewRepository$processAction$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = productReviewRepository$processAction$1.label;
                if (i11 == 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return ((r) obj).getF26106a();
                }
                s.b(obj);
                Map<String, String> parseDataFieldToMap = parseDataFieldToMap(map);
                ActionV2Repository actionV2Repository = this.actionV2Repository;
                ActionV2Request actionV2Request = new ActionV2Request(parseDataFieldToMap, str, false, 4, null);
                productReviewRepository$processAction$1.label = 1;
                Object mo479requestActionResult0E7RQCE = actionV2Repository.mo479requestActionResult0E7RQCE(actionV2Request, Object.class, productReviewRepository$processAction$1);
                return mo479requestActionResult0E7RQCE == aVar ? aVar : mo479requestActionResult0E7RQCE;
            }
        }
        productReviewRepository$processAction$1 = new ProductReviewRepository$processAction$1(this, dVar);
        Object obj2 = productReviewRepository$processAction$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = productReviewRepository$processAction$1.label;
        if (i11 == 0) {
        }
    }
}

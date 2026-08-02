package bo.app;

import com.braze.enums.CardKey;
import com.braze.enums.CardType;
import com.braze.models.cards.CaptionedImageCard;
import com.braze.models.cards.Card;
import com.braze.models.cards.ControlCard;
import com.braze.models.cards.ImageOnlyCard;
import com.braze.models.cards.ShortNewsCard;
import com.braze.models.cards.TextAnnouncementCard;
import com.braze.storage.ICardStorageProvider;
import com.braze.support.BrazeLogger;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class n3 {

    /* renamed from: a, reason: collision with root package name */
    public static final n3 f25786a = new n3();

    public static final Card a(a9 a9Var, ICardStorageProvider iCardStorageProvider, e9 e9Var, final JSONArray jSONArray, final Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        try {
            return a(new JSONObject(it.toString()), a9Var, iCardStorageProvider, e9Var);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f25786a, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.o6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.n3.a(it, jSONArray);
                }
            }, 4, (Object) null);
            return null;
        }
    }

    public static final String a(Object obj, JSONArray jSONArray) {
        return "Unable to create Card JSON in array. Ignoring. Was on element: " + obj + " of json array: " + jSONArray;
    }

    public static final Card a(JSONObject jsonObject, a9 brazeManager, ICardStorageProvider cardStorageProvider, e9 cardAnalyticsProvider) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(cardStorageProvider, "cardStorageProvider");
        Intrinsics.checkNotNullParameter(cardAnalyticsProvider, "cardAnalyticsProvider");
        CardType cardTypeFromJson = CardKey.INSTANCE.getCardTypeFromJson(jsonObject);
        int i10 = cardTypeFromJson == null ? -1 : k3.f25638a[cardTypeFromJson.ordinal()];
        if (i10 == 1) {
            return new ImageOnlyCard(jsonObject, brazeManager, cardStorageProvider, cardAnalyticsProvider);
        }
        if (i10 == 2) {
            return new CaptionedImageCard(jsonObject, brazeManager, cardStorageProvider, cardAnalyticsProvider);
        }
        if (i10 == 3) {
            return new ShortNewsCard(jsonObject, brazeManager, cardStorageProvider, cardAnalyticsProvider);
        }
        if (i10 == 4) {
            return new TextAnnouncementCard(jsonObject, brazeManager, cardStorageProvider, cardAnalyticsProvider);
        }
        if (i10 != 5) {
            return null;
        }
        return new ControlCard(jsonObject, brazeManager, cardStorageProvider, cardAnalyticsProvider);
    }

    public static final List a(final JSONArray cardJsonStringArray, final e2 brazeManager, final x3 cardStorageProvider, final r3 cardAnalyticsProvider) {
        Intrinsics.checkNotNullParameter(cardJsonStringArray, "cardJsonStringArray");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(cardStorageProvider, "cardStorageProvider");
        Intrinsics.checkNotNullParameter(cardAnalyticsProvider, "cardAnalyticsProvider");
        return SequencesKt.toList(SequencesKt.mapNotNull(SequencesKt.asSequence(SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(RangesKt.until(0, cardJsonStringArray.length())), new l3(cardJsonStringArray)), new m3(cardJsonStringArray)).iterator()), new Function1() { // from class: c3.n6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return bo.app.n3.a(bo.app.a9.this, cardStorageProvider, cardAnalyticsProvider, cardJsonStringArray, obj);
            }
        }));
    }
}

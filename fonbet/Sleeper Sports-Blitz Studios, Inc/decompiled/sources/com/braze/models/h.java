package com.braze.models;

import com.braze.enums.CardKey;
import com.braze.enums.CardType;
import com.braze.managers.m0;
import com.braze.managers.r;
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

/* loaded from: classes6.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f630a = new h();

    public static final Card a(m0 m0Var, ICardStorageProvider iCardStorageProvider, com.braze.analytics.b bVar, final JSONArray jSONArray, final Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        try {
            return a(new JSONObject(it.toString()), m0Var, iCardStorageProvider, bVar);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f630a, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.models.h$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return h.a(it, jSONArray);
                }
            }, 4, (Object) null);
            return null;
        }
    }

    public static final String a(Object obj, JSONArray jSONArray) {
        return "Unable to create Card JSON in array. Ignoring. Was on element: " + obj + " of json array: " + jSONArray;
    }

    public static final Card a(JSONObject jsonObject, m0 brazeManager, ICardStorageProvider cardStorageProvider, com.braze.analytics.b cardAnalyticsProvider) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(cardStorageProvider, "cardStorageProvider");
        Intrinsics.checkNotNullParameter(cardAnalyticsProvider, "cardAnalyticsProvider");
        CardType cardTypeFromJson = CardKey.INSTANCE.getCardTypeFromJson(jsonObject);
        int i = cardTypeFromJson == null ? -1 : e.f627a[cardTypeFromJson.ordinal()];
        if (i == 1) {
            return new ImageOnlyCard(jsonObject, brazeManager, cardStorageProvider, cardAnalyticsProvider);
        }
        if (i == 2) {
            return new CaptionedImageCard(jsonObject, brazeManager, cardStorageProvider, cardAnalyticsProvider);
        }
        if (i == 3) {
            return new ShortNewsCard(jsonObject, brazeManager, cardStorageProvider, cardAnalyticsProvider);
        }
        if (i == 4) {
            return new TextAnnouncementCard(jsonObject, brazeManager, cardStorageProvider, cardAnalyticsProvider);
        }
        if (i != 5) {
            return null;
        }
        return new ControlCard(jsonObject, brazeManager, cardStorageProvider, cardAnalyticsProvider);
    }

    public static final List a(final JSONArray cardJsonStringArray, final r brazeManager, final com.braze.storage.p cardStorageProvider, final com.braze.analytics.a cardAnalyticsProvider) {
        Intrinsics.checkNotNullParameter(cardJsonStringArray, "cardJsonStringArray");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(cardStorageProvider, "cardStorageProvider");
        Intrinsics.checkNotNullParameter(cardAnalyticsProvider, "cardAnalyticsProvider");
        return SequencesKt.toList(SequencesKt.mapNotNull(SequencesKt.asSequence(SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(RangesKt.until(0, cardJsonStringArray.length())), new f(cardJsonStringArray)), new g(cardJsonStringArray)).iterator()), new Function1() { // from class: com.braze.models.h$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.a(m0.this, cardStorageProvider, cardAnalyticsProvider, cardJsonStringArray, obj);
            }
        }));
    }
}

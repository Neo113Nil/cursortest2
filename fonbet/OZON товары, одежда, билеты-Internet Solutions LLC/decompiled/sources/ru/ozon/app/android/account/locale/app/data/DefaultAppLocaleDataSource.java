package ru.ozon.app.android.account.locale.app.data;

import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.flags.LanguageDefaultsFlag;
import ru.ozon.app.android.network.flags.LanguageSupportVersionFlag;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001&B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\b\u001a\u00020\u0007*\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000b\u001a\u0004\u0018\u00010\u0007*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\r*\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006*\u00060\u0010j\u0002`\u00112\u0006\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u001a\u0010\u001bR\u001f\u0010 \u001a\u00060\u0010j\u0002`\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lru/ozon/app/android/account/locale/app/data/DefaultAppLocaleDataSource;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "", "default", "(Ljava/util/Map;)Ljava/lang/String;", "systemLanguage", "find", "(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;", "", "splitToSet", "(Ljava/lang/String;)Ljava/util/Set;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "fromJsonOrNull", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Ljava/lang/String;)Ljava/util/Map;", "selectBy", "(Ljava/lang/String;)Ljava/lang/String;", "versionApp", "language", "", "isAvailableFromFeatureFlag", "(Ljava/lang/String;Ljava/lang/String;)Z", "jsonParser$delegate", "LSc/j;", "getJsonParser", "()Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "jsonParser", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService$delegate", "getFeatureService", "()Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Companion", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DefaultAppLocaleDataSource {

    @NotNull
    private static final Companion Companion = new Companion(null);

    /* renamed from: featureService$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j featureService;

    /* renamed from: jsonParser$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j jsonParser;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/account/locale/app/data/DefaultAppLocaleDataSource$Companion;", "", "<init>", "()V", "DEFAULT_LANGUAGE_KEY", "", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public DefaultAppLocaleDataSource(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.jsonParser = k.b(new DefaultAppLocaleDataSource$jsonParser$2(context));
        this.featureService = k.b(new DefaultAppLocaleDataSource$featureService$2(context));
    }

    /* renamed from: default, reason: not valid java name */
    private final String m456default(Map<String, String> map) {
        String orDefault;
        return (map == null || (orDefault = map.getOrDefault("default", "en")) == null) ? "en" : orDefault;
    }

    private final String find(Map<String, String> map, String str) {
        Object obj;
        Iterator<T> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (splitToSet((String) ((Map.Entry) obj).getValue()).contains(str)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return (String) entry.getKey();
        }
        return null;
    }

    private final Map<String, String> fromJsonOrNull(JsonParser jsonParser, String str) {
        try {
            return (Map) jsonParser.fromJson(str, Map.class);
        } catch (Exception unused) {
            return null;
        }
    }

    private final FeatureService getFeatureService() {
        return (FeatureService) this.featureService.getValue();
    }

    private final JsonParser getJsonParser() {
        return (JsonParser) this.jsonParser.getValue();
    }

    private final Set<String> splitToSet(String str) {
        List l11 = h.l(str, new char[]{','}, 0, 6);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = l11.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(h.z0((String) it.next()).toString());
        }
        return linkedHashSet;
    }

    public final boolean isAvailableFromFeatureFlag(@NotNull String versionApp, String language) {
        String str;
        Intrinsics.checkNotNullParameter(versionApp, "versionApp");
        Map<String, String> fromJsonOrNull = fromJsonOrNull(getJsonParser(), getFeatureService().getStringKey(LanguageSupportVersionFlag.INSTANCE));
        return (fromJsonOrNull == null || (str = fromJsonOrNull.get(language)) == null || str.length() == 0 || str.compareTo(versionApp) > 0) ? false : true;
    }

    @NotNull
    public final String selectBy(String systemLanguage) {
        String find;
        Map<String, String> fromJsonOrNull = fromJsonOrNull(getJsonParser(), getFeatureService().getStringKey(LanguageDefaultsFlag.INSTANCE));
        return systemLanguage == null ? m456default(fromJsonOrNull) : (fromJsonOrNull == null || (find = find(fromJsonOrNull, systemLanguage)) == null) ? m456default(fromJsonOrNull) : find;
    }
}

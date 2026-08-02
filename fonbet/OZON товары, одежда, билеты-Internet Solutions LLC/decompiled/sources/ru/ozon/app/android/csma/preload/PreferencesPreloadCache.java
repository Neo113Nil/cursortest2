package ru.ozon.app.android.csma.preload;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.network.serialize.JsonSerializer;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0016H\u0016J\u000e\u0010\u0017\u001a\u0004\u0018\u00010\u0018*\u00020\u0018H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/csma/preload/PreferencesPreloadCache;", "Lru/ozon/app/android/csma/preload/PreloadCache;", "jsonSerializer", "Lru/ozon/app/android/network/serialize/JsonSerializer;", "jsonDeserializer", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "context", "Landroid/content/Context;", "<init>", "(Lru/ozon/app/android/network/serialize/JsonSerializer;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Landroid/content/Context;)V", "prefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "Landroid/content/SharedPreferences;", "maxSize", "", ProductAction.ACTION_ADD, "", "entry", "Lru/ozon/app/android/csma/preload/PreloadEntry;", "getEntries", "", "extractFileName", "", "Companion", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PreferencesPreloadCache implements PreloadCache {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final JsonParser jsonDeserializer;

    @NotNull
    private final JsonSerializer jsonSerializer;
    private final int maxSize;
    private final SharedPreferences prefs;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/csma/preload/PreferencesPreloadCache$Companion;", "", "<init>", "()V", "PREFS_NAME", "", "CACHE_FIELD_NAME", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PreferencesPreloadCache(@NotNull JsonSerializer jsonSerializer, @NotNull JsonParser jsonDeserializer, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(jsonSerializer, "jsonSerializer");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(context, "context");
        this.jsonSerializer = jsonSerializer;
        this.jsonDeserializer = jsonDeserializer;
        this.prefs = context.getSharedPreferences("preload_cache", 0);
        this.maxSize = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String extractFileName(String str) {
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        if (lastPathSegment == null || lastPathSegment.length() <= 0) {
            return null;
        }
        return lastPathSegment;
    }

    @Override // ru.ozon.app.android.csma.preload.PreloadCache
    public void add(@NotNull PreloadEntry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        ArrayList W02 = C7714v.W0(getEntries());
        C.h(W02, new PreferencesPreloadCache$add$1(this, extractFileName(entry.getImageUrl())));
        W02.add(entry);
        List K02 = C7714v.K0(W02, this.maxSize);
        SharedPreferences prefs = this.prefs;
        Intrinsics.checkNotNullExpressionValue(prefs, "prefs");
        SharedPreferences.Editor edit = prefs.edit();
        edit.putString("entries_cache", this.jsonSerializer.toJson((JsonSerializer) new PreloadEntries(K02), (Class<JsonSerializer>) PreloadEntries.class));
        edit.apply();
    }

    @Override // ru.ozon.app.android.csma.preload.PreloadCache
    @NotNull
    public List<PreloadEntry> getEntries() {
        String string = this.prefs.getString("entries_cache", null);
        return string == null ? K.f71697a : ((PreloadEntries) this.jsonDeserializer.fromJson(string, PreloadEntries.class)).getEntries();
    }
}

package ru.ozon.app.android.tabbar.data.local;

import Nk.a;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import bd.h;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.C7721c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.network.serialize.JsonSerializer;
import ru.ozon.app.android.tabbar.data.TabConfigDTO;
import ru.ozon.app.android.tabbar.data.TabConfigResponse;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lru/ozon/app/android/tabbar/data/local/TabConfigLocalDataSource;", "", "Landroid/content/Context;", "context", "Lru/ozon/app/android/network/serialize/JsonSerializer;", "jsonSerializer", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/network/serialize/JsonSerializer;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Lru/ozon/app/android/tabbar/data/local/TabConfigCacheModel;", "ignoreIndicator", "(Lru/ozon/app/android/tabbar/data/local/TabConfigCacheModel;)Lru/ozon/app/android/tabbar/data/local/TabConfigCacheModel;", "cache", "", "save", "(Lru/ozon/app/android/tabbar/data/local/TabConfigCacheModel;)V", "", "", "Lru/ozon/app/android/tabbar/data/TabConfigResponse;", "retrieveTabConfigs", "()Ljava/util/Map;", "Landroid/content/Context;", "Lru/ozon/app/android/network/serialize/JsonSerializer;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Ljava/io/File;", "workingDir$delegate", "LSc/j;", "getWorkingDir", "()Ljava/io/File;", "workingDir", "Companion", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TabConfigLocalDataSource {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Context context;

    @NotNull
    private final JsonParser jsonDeserializer;

    @NotNull
    private final JsonSerializer jsonSerializer;

    /* renamed from: workingDir$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j workingDir;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/tabbar/data/local/TabConfigLocalDataSource$Companion;", "", "<init>", "()V", "CONFIG_DIR", "", "CONFIG_PREFIX", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public TabConfigLocalDataSource(@NotNull Context context, @NotNull JsonSerializer jsonSerializer, @NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(jsonSerializer, "jsonSerializer");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.context = context;
        this.jsonSerializer = jsonSerializer;
        this.jsonDeserializer = jsonDeserializer;
        this.workingDir = k.b(new TabConfigLocalDataSource$workingDir$2(this));
    }

    private final File getWorkingDir() {
        return (File) this.workingDir.getValue();
    }

    private final TabConfigCacheModel ignoreIndicator(TabConfigCacheModel tabConfigCacheModel) {
        List<TabConfigDTO> tabs = tabConfigCacheModel.getConfig().getTabs();
        ArrayList arrayList = new ArrayList(C7714v.z(tabs, 10));
        boolean z11 = false;
        for (TabConfigDTO tabConfigDTO : tabs) {
            if (tabConfigDTO.getStaticIndicator() != null) {
                tabConfigDTO = TabConfigDTO.copy$default(tabConfigDTO, null, null, null, null, null, null, null, 63, null);
                z11 = true;
            }
            arrayList.add(tabConfigDTO);
        }
        return !z11 ? tabConfigCacheModel : TabConfigCacheModel.copy$default(tabConfigCacheModel, null, TabConfigResponse.copy$default(tabConfigCacheModel.getConfig(), null, arrayList, 1, null), 1, null);
    }

    @NotNull
    public final Map<String, TabConfigResponse> retrieveTabConfigs() {
        HashMap hashMap = new HashMap();
        File[] listFiles = getWorkingDir().listFiles();
        if (listFiles != null && listFiles.length != 0) {
            Iterator a11 = C7721c.a(listFiles);
            while (a11.hasNext()) {
                File file = (File) a11.next();
                Intrinsics.f(file);
                TabConfigCacheModel tabConfigCacheModel = (TabConfigCacheModel) this.jsonDeserializer.fromJson(h.l(file), TabConfigCacheModel.class);
                hashMap.put(tabConfigCacheModel.getId(), tabConfigCacheModel.getConfig());
            }
        }
        return hashMap;
    }

    public final void save(@NotNull TabConfigCacheModel cache) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        File file = new File(getWorkingDir(), a.b("tab_bar_config_", cache.getId()));
        if (!file.exists()) {
            file.createNewFile();
        }
        h.o(file, this.jsonSerializer.toJson((JsonSerializer) ignoreIndicator(cache), (Class<JsonSerializer>) TabConfigCacheModel.class), Charsets.UTF_8);
    }
}

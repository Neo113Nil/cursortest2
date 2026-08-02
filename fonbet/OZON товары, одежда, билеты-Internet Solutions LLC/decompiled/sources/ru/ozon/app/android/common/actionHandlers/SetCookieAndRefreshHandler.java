package ru.ozon.app.android.common.actionHandlers;

import Ob0.a;
import P4.f;
import i10.h;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.storage.cookiePreference.ExtraCookieStorage;
import ru.ozon.app.android.storage.cookiePreference.RefreshByGenderCookieEvents;
import zb0.e;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001b\u001cB+\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJQ\u0010\u0015\u001a\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001a¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/common/actionHandlers/SetCookieAndRefreshHandler;", "", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/storage/cookiePreference/ExtraCookieStorage;", "extraCookieStorage", "Lru/ozon/app/android/storage/cookiePreference/RefreshByGenderCookieEvents;", "refreshByGenderEvents", "LOb0/a;", "ozonIdAppApi", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/storage/cookiePreference/ExtraCookieStorage;Lru/ozon/app/android/storage/cookiePreference/RefreshByGenderCookieEvents;LOb0/a;)V", "", "actionId", "", "actionParams", "refreshLink", "Li10/h$b;", "postProcessing", "uuid", "", "handleAction", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Li10/h$b;Ljava/lang/String;)Z", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/storage/cookiePreference/ExtraCookieStorage;", "Lru/ozon/app/android/storage/cookiePreference/RefreshByGenderCookieEvents;", "LOb0/a;", "Companion", "SetCookieAndRefreshAssistedFactory", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SetCookieAndRefreshHandler {

    @NotNull
    private final ExtraCookieStorage extraCookieStorage;

    @NotNull
    private final a ozonIdAppApi;

    @NotNull
    private final RefreshByGenderCookieEvents refreshByGenderEvents;

    @NotNull
    private final ComposerReferences refs;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/common/actionHandlers/SetCookieAndRefreshHandler$SetCookieAndRefreshAssistedFactory;", "", "create", "Lru/ozon/app/android/common/actionHandlers/SetCookieAndRefreshHandler;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface SetCookieAndRefreshAssistedFactory {
        @NotNull
        SetCookieAndRefreshHandler create(@NotNull ComposerReferences refs);
    }

    public SetCookieAndRefreshHandler(@NotNull ComposerReferences refs, @NotNull ExtraCookieStorage extraCookieStorage, @NotNull RefreshByGenderCookieEvents refreshByGenderEvents, @NotNull a ozonIdAppApi) {
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(extraCookieStorage, "extraCookieStorage");
        Intrinsics.checkNotNullParameter(refreshByGenderEvents, "refreshByGenderEvents");
        Intrinsics.checkNotNullParameter(ozonIdAppApi, "ozonIdAppApi");
        this.refs = refs;
        this.extraCookieStorage = extraCookieStorage;
        this.refreshByGenderEvents = refreshByGenderEvents;
        this.ozonIdAppApi = ozonIdAppApi;
    }

    public static /* synthetic */ boolean handleAction$default(SetCookieAndRefreshHandler setCookieAndRefreshHandler, String str, Map map, String str2, h.b bVar, String str3, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        if ((i11 & 8) != 0) {
            bVar = null;
        }
        if ((i11 & 16) != 0) {
            str3 = null;
        }
        return setCookieAndRefreshHandler.handleAction(str, map, str2, bVar, str3);
    }

    public final boolean handleAction(String actionId, Map<String, String> actionParams, String refreshLink, h.b postProcessing, String uuid) {
        if (!Intrinsics.d(actionId, "setCookiesAndRefresh") || actionParams == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : actionParams.entrySet()) {
            if (!kotlin.text.h.e0(entry.getKey(), "cookie", false)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (Intrinsics.d(actionParams.get("cookieIsPersistent"), "true")) {
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (final Map.Entry entry2 : linkedHashMap.entrySet()) {
                arrayList.add(new e(entry2) { // from class: ru.ozon.app.android.common.actionHandlers.SetCookieAndRefreshHandler$handleAction$clientCookies$1$1
                    private final String name;
                    private final String value;

                    {
                        this.name = entry2.getKey();
                        this.value = entry2.getValue();
                    }

                    @Override // zb0.e
                    public String getName() {
                        return this.name;
                    }

                    @Override // zb0.e
                    public String getValue() {
                        return this.value;
                    }
                });
            }
            r0.c(arrayList, C7714v.a0(this.ozonIdAppApi.M().f107498a));
        } else {
            this.extraCookieStorage.addExtraCookies(linkedHashMap);
        }
        InterfaceC7851b.a.a(this.refs.getController(), refreshLink, null, null, postProcessing, 6);
        if (!linkedHashMap.containsKey("apparelSelectedTab")) {
            return true;
        }
        RefreshByGenderCookieEvents refreshByGenderCookieEvents = this.refreshByGenderEvents;
        if (uuid == null) {
            uuid = f.b("toString(...)");
        }
        refreshByGenderCookieEvents.refreshByGenderCookieChanged(uuid);
        return true;
    }
}

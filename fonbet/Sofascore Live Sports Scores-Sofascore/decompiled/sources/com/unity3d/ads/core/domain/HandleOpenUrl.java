package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.AdObject;
import defpackage.a70;
import defpackage.rq3;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JZ\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH¦B¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/domain/HandleOpenUrl;", "", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "", "url", HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, "action", "", HandleInvocationsFromAdViewer.KEY_EXTRAS, "", HandleInvocationsFromAdViewer.KEY_USE_ACTIVITY_FOR_RESULT, "invoke", "(Lcom/unity3d/ads/core/data/model/AdObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLrq3;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface HandleOpenUrl {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(HandleOpenUrl handleOpenUrl, AdObject adObject, String str, String str2, String str3, Map map, boolean z, rq3 rq3Var, int i, Object obj) {
            if (obj != null) {
                a70.m("Super calls with default arguments not supported in this target, function: invoke");
                return null;
            }
            if ((i & 8) != 0) {
                str3 = "android.intent.action.VIEW";
            }
            String str4 = str3;
            if ((i & 16) != 0) {
                map = null;
            }
            Map map2 = map;
            if ((i & 32) != 0) {
                z = false;
            }
            return handleOpenUrl.invoke(adObject, str, str2, str4, map2, z, rq3Var);
        }
    }

    @Nullable
    Object invoke(@NotNull AdObject adObject, @NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Map<String, ? extends Object> map, boolean z, @NotNull rq3<? super Boolean> rq3Var);
}

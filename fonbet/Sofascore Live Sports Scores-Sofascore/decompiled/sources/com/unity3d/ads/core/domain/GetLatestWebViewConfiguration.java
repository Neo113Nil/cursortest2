package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource;
import com.unity3d.ads.core.data.model.WebViewConfiguration;
import com.unity3d.ads.datastore.WebviewConfigurationStore;
import defpackage.a70;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JF\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0086B¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/domain/GetLatestWebViewConfiguration;", "", "Lcom/unity3d/ads/core/data/datasource/WebviewConfigurationDataSource;", "webviewConfigurationDataSource", "<init>", "(Lcom/unity3d/ads/core/data/datasource/WebviewConfigurationDataSource;)V", "", "receivedEntryPoint", "", "receivedVersion", "", "receivedAdditionalFiles", "receivedType", "Lcom/unity3d/ads/core/data/model/WebViewConfiguration;", "invoke", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/datasource/WebviewConfigurationDataSource;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GetLatestWebViewConfiguration {

    @NotNull
    private final WebviewConfigurationDataSource webviewConfigurationDataSource;

    public GetLatestWebViewConfiguration(@NotNull WebviewConfigurationDataSource webviewConfigurationDataSource) {
        webviewConfigurationDataSource.getClass();
        this.webviewConfigurationDataSource = webviewConfigurationDataSource;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object invoke$default(GetLatestWebViewConfiguration getLatestWebViewConfiguration, String str, Integer num, List list, String str2, rq3 rq3Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            list = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        return getLatestWebViewConfiguration.invoke(str, num, list, str2, rq3Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x005f, code lost:
    
        if (r13 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(@Nullable String str, @Nullable Integer num, @Nullable List<String> list, @Nullable String str2, @NotNull rq3<? super WebViewConfiguration> rq3Var) {
        GetLatestWebViewConfiguration$invoke$1 getLatestWebViewConfiguration$invoke$1;
        int i;
        WebViewConfiguration webViewConfiguration;
        WebViewConfiguration webViewConfiguration2;
        if (rq3Var instanceof GetLatestWebViewConfiguration$invoke$1) {
            getLatestWebViewConfiguration$invoke$1 = (GetLatestWebViewConfiguration$invoke$1) rq3Var;
            int i2 = getLatestWebViewConfiguration$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getLatestWebViewConfiguration$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getLatestWebViewConfiguration$invoke$1.result;
                lu3 lu3Var = lu3.a;
                i = getLatestWebViewConfiguration$invoke$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    WebviewConfigurationDataSource webviewConfigurationDataSource = this.webviewConfigurationDataSource;
                    getLatestWebViewConfiguration$invoke$1.L$0 = str;
                    getLatestWebViewConfiguration$invoke$1.L$1 = num;
                    getLatestWebViewConfiguration$invoke$1.L$2 = list;
                    getLatestWebViewConfiguration$invoke$1.L$3 = str2;
                    getLatestWebViewConfiguration$invoke$1.label = 1;
                    obj = webviewConfigurationDataSource.get(getLatestWebViewConfiguration$invoke$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        WebViewConfiguration webViewConfiguration3 = (WebViewConfiguration) getLatestWebViewConfiguration$invoke$1.L$0;
                        y6a.M(obj);
                        return webViewConfiguration3;
                    }
                    str2 = (String) getLatestWebViewConfiguration$invoke$1.L$3;
                    list = (List) getLatestWebViewConfiguration$invoke$1.L$2;
                    num = (Integer) getLatestWebViewConfiguration$invoke$1.L$1;
                    str = (String) getLatestWebViewConfiguration$invoke$1.L$0;
                    y6a.M(obj);
                }
                WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore = (WebviewConfigurationStore.WebViewConfigurationStore) obj;
                int version = webViewConfigurationStore.getVersion();
                String entryPoint = webViewConfigurationStore.getEntryPoint();
                entryPoint.getClass();
                List<String> additionalFilesList = webViewConfigurationStore.getAdditionalFilesList();
                additionalFilesList.getClass();
                String type = webViewConfigurationStore.getType();
                type.getClass();
                webViewConfiguration = new WebViewConfiguration(version, entryPoint, additionalFilesList, type);
                if (str != null && num == null && list == null && str2 == null) {
                    return webViewConfiguration;
                }
                int intValue = num == null ? num.intValue() : webViewConfiguration.getVersion();
                if (str == null) {
                    str = webViewConfiguration.getEntryPoint();
                }
                if (list == null) {
                    list = webViewConfiguration.getAdditionalFiles();
                }
                if (str2 == null) {
                    str2 = webViewConfiguration.getType();
                }
                webViewConfiguration2 = new WebViewConfiguration(intValue, str, list, str2);
                if (!webViewConfiguration2.equals(webViewConfiguration)) {
                    WebviewConfigurationDataSource webviewConfigurationDataSource2 = this.webviewConfigurationDataSource;
                    WebviewConfigurationStore.WebViewConfigurationStore.Builder newBuilder = WebviewConfigurationStore.WebViewConfigurationStore.newBuilder();
                    newBuilder.setVersion(webViewConfiguration2.getVersion());
                    newBuilder.setEntryPoint(webViewConfiguration2.getEntryPoint());
                    newBuilder.addAllAdditionalFiles(webViewConfiguration2.getAdditionalFiles());
                    newBuilder.setType(webViewConfiguration2.getType());
                    WebviewConfigurationStore.WebViewConfigurationStore build = newBuilder.build();
                    build.getClass();
                    getLatestWebViewConfiguration$invoke$1.L$0 = webViewConfiguration2;
                    getLatestWebViewConfiguration$invoke$1.L$1 = null;
                    getLatestWebViewConfiguration$invoke$1.L$2 = null;
                    getLatestWebViewConfiguration$invoke$1.L$3 = null;
                    getLatestWebViewConfiguration$invoke$1.label = 2;
                    if (webviewConfigurationDataSource2.set(build, getLatestWebViewConfiguration$invoke$1) == lu3Var) {
                        return lu3Var;
                    }
                }
                return webViewConfiguration2;
            }
        }
        getLatestWebViewConfiguration$invoke$1 = new GetLatestWebViewConfiguration$invoke$1(this, rq3Var);
        Object obj2 = getLatestWebViewConfiguration$invoke$1.result;
        lu3 lu3Var2 = lu3.a;
        i = getLatestWebViewConfiguration$invoke$1.label;
        if (i != 0) {
        }
        WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore2 = (WebviewConfigurationStore.WebViewConfigurationStore) obj2;
        int version2 = webViewConfigurationStore2.getVersion();
        String entryPoint2 = webViewConfigurationStore2.getEntryPoint();
        entryPoint2.getClass();
        List<String> additionalFilesList2 = webViewConfigurationStore2.getAdditionalFilesList();
        additionalFilesList2.getClass();
        String type2 = webViewConfigurationStore2.getType();
        type2.getClass();
        webViewConfiguration = new WebViewConfiguration(version2, entryPoint2, additionalFilesList2, type2);
        if (str != null) {
        }
        if (num == null) {
        }
        if (str == null) {
        }
        if (list == null) {
        }
        if (str2 == null) {
        }
        webViewConfiguration2 = new WebViewConfiguration(intValue, str, list, str2);
        if (!webViewConfiguration2.equals(webViewConfiguration)) {
        }
        return webViewConfiguration2;
    }
}

package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource;
import com.unity3d.ads.core.data.model.WebViewConfiguration;
import com.unity3d.ads.datastore.WebviewConfigurationStore;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.spj;

/* compiled from: GetLatestWebViewConfiguration.kt */
/* loaded from: classes14.dex */
public final class GetLatestWebViewConfiguration {
    private final WebviewConfigurationDataSource webviewConfigurationDataSource;

    public GetLatestWebViewConfiguration(WebviewConfigurationDataSource webviewConfigurationDataSource) {
        this.webviewConfigurationDataSource = webviewConfigurationDataSource;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object invoke$default(GetLatestWebViewConfiguration getLatestWebViewConfiguration, String str, Integer num, List list, String str2, spj spjVar, int i, Object obj) {
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
        return getLatestWebViewConfiguration.invoke(str, num, list, str2, spjVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0060, code lost:
    
        if (r12 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(String str, Integer num, List<String> list, String str2, spj<? super WebViewConfiguration> spjVar) {
        GetLatestWebViewConfiguration$invoke$1 getLatestWebViewConfiguration$invoke$1;
        int i;
        WebViewConfiguration webViewConfiguration;
        WebViewConfiguration webViewConfiguration2;
        if (spjVar instanceof GetLatestWebViewConfiguration$invoke$1) {
            getLatestWebViewConfiguration$invoke$1 = (GetLatestWebViewConfiguration$invoke$1) spjVar;
            int i2 = getLatestWebViewConfiguration$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getLatestWebViewConfiguration$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getLatestWebViewConfiguration$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getLatestWebViewConfiguration$invoke$1.label;
                if (i != 0) {
                    kotlin.a.a(obj);
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
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        WebViewConfiguration webViewConfiguration3 = (WebViewConfiguration) getLatestWebViewConfiguration$invoke$1.L$0;
                        kotlin.a.a(obj);
                        return webViewConfiguration3;
                    }
                    str2 = (String) getLatestWebViewConfiguration$invoke$1.L$3;
                    list = (List) getLatestWebViewConfiguration$invoke$1.L$2;
                    num = (Integer) getLatestWebViewConfiguration$invoke$1.L$1;
                    str = (String) getLatestWebViewConfiguration$invoke$1.L$0;
                    kotlin.a.a(obj);
                }
                WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore = (WebviewConfigurationStore.WebViewConfigurationStore) obj;
                webViewConfiguration = new WebViewConfiguration(webViewConfigurationStore.getVersion(), webViewConfigurationStore.getEntryPoint(), webViewConfigurationStore.getAdditionalFilesList(), webViewConfigurationStore.getType());
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
                    getLatestWebViewConfiguration$invoke$1.L$0 = webViewConfiguration2;
                    getLatestWebViewConfiguration$invoke$1.L$1 = null;
                    getLatestWebViewConfiguration$invoke$1.L$2 = null;
                    getLatestWebViewConfiguration$invoke$1.L$3 = null;
                    getLatestWebViewConfiguration$invoke$1.label = 2;
                    if (webviewConfigurationDataSource2.set(build, getLatestWebViewConfiguration$invoke$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return webViewConfiguration2;
            }
        }
        getLatestWebViewConfiguration$invoke$1 = new GetLatestWebViewConfiguration$invoke$1(this, spjVar);
        Object obj2 = getLatestWebViewConfiguration$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getLatestWebViewConfiguration$invoke$1.label;
        if (i != 0) {
        }
        WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore2 = (WebviewConfigurationStore.WebViewConfigurationStore) obj2;
        webViewConfiguration = new WebViewConfiguration(webViewConfigurationStore2.getVersion(), webViewConfigurationStore2.getEntryPoint(), webViewConfigurationStore2.getAdditionalFilesList(), webViewConfigurationStore2.getType());
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

package com.safedk.android.analytics.brandsafety.creatives;

import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.webkit.WebView;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.RedirectDetails;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.v;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.SimpleConcurrentHashSet;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public interface AdNetworkDiscovery {
    public static final float a = 0.15f;

    public enum WebViewResourceMatchingMethod {
        DEFAULT,
        DIRECT_CREATIVE_INFO,
        WEBVIEW_LOOKUP
    }

    boolean A(String str);

    long a(CreativeInfo creativeInfo);

    Pair<String, List<String>> a(Set<String> set);

    CreativeInfo a(SimpleConcurrentHashSet<String> simpleConcurrentHashSet);

    CreativeInfo a(Object obj);

    String a(Bundle bundle);

    String a(View view, BrandSafetyUtils.AdType adType);

    String a(WebView webView, String str, String str2);

    String a(String str, String str2, WeakReference<WebView> weakReference);

    WeakReference<View> a(com.safedk.android.analytics.brandsafety.d dVar);

    WeakReference<WebView> a(List<WeakReference<WebView>> list, String str);

    List<CreativeInfo> a(int i);

    List<CreativeInfo> a(WebView webView, String str);

    List<CreativeInfo> a(String str, String str2, WebView webView);

    List<CreativeInfo> a(String str, String str2, byte[] bArr, Map<String, List<String>> map, c.a aVar);

    List<CreativeInfo> a(WeakReference<View> weakReference, String str, BrandSafetyUtils.AdType adType);

    void a(View view, int i, int i2);

    void a(WebView webView);

    void a(WebView webView, Object obj);

    void a(CreativeInfo creativeInfo, String str);

    void a(com.safedk.android.analytics.brandsafety.d dVar, List<WeakReference<View>> list);

    void a(v vVar);

    void a(FileInputStream fileInputStream, FileDescriptor fileDescriptor);

    void a(FileInputStream fileInputStream, String str);

    void a(Object obj, Object obj2);

    void a(Object obj, String str);

    void a(String str, String str2, BrandSafetyEvent.AdFormatType adFormatType, Object obj);

    void a(String str, String str2, String str3, String str4);

    void a(WeakReference<WebView> weakReference, String str);

    boolean a();

    boolean a(View view);

    boolean a(com.safedk.android.analytics.brandsafety.c cVar);

    boolean a(com.safedk.android.analytics.brandsafety.e eVar, List<String> list, String str);

    boolean a(String str);

    boolean a(String str, Bundle bundle);

    boolean a(String str, com.safedk.android.analytics.brandsafety.e eVar);

    boolean a(String str, Object obj);

    boolean a(String str, String str2);

    WebViewResourceMatchingMethod b();

    CreativeInfo b(Object obj);

    void b(WebView webView, String str);

    void b(CreativeInfo creativeInfo);

    void b(v vVar);

    void b(Object obj, Object obj2);

    void b(String str, String str2, WebView webView);

    boolean b(View view);

    boolean b(String str);

    boolean b(String str, String str2);

    CreativeInfo c(Object obj, Object obj2);

    String c(Object obj);

    String c(String str, String str2);

    Set<String> c();

    void c(View view);

    void c(CreativeInfo creativeInfo);

    boolean c(String str);

    b d();

    CreativeInfo d(Object obj);

    void d(View view);

    void d(Object obj, Object obj2);

    void d(String str, String str2);

    boolean d(CreativeInfo creativeInfo);

    boolean d(String str);

    String e(String str, String str2);

    List<String> e();

    void e(Object obj);

    void e(String str);

    boolean e(View view);

    BrandSafetyUtils.AdType f(View view);

    String f();

    String f(String str);

    void f(String str, String str2);

    View g(View view);

    HashMap<Integer, String> g();

    void g(String str, String str2);

    boolean g(String str);

    String h(String str);

    void h(String str, String str2);

    int i(String str);

    boolean j(String str);

    boolean k(String str);

    RedirectDetails.RedirectType l(String str);

    String m(String str);

    boolean n(String str);

    void o(String str);

    void p(String str);

    boolean q(String str);

    Set<String> r(String str);

    void s(String str);

    List<CreativeInfo> t(String str);

    List<CreativeInfo> u(String str);

    List<CreativeInfo> v(String str);

    String w(String str);

    void x(String str);

    String y(String str);

    void z(String str);
}

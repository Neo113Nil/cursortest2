package se;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.widget.Toast;
import com.zoho.livechat.android.utils.LiveChatUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import od.AbstractC5886l;
import og.AbstractC5892d;
import w.C6694a;
import w.d;

/* renamed from: se.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6363a {

    /* renamed from: a, reason: collision with root package name */
    public static final C6363a f64857a = new C6363a();

    public static final void b(Context context, String url) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Uri parse = Uri.parse(url);
        d.C0946d c0946d = new d.C0946d();
        C6694a.C0945a c0945a = new C6694a.C0945a();
        c0945a.e(AbstractC5892d.h(context, Integer.valueOf(AbstractC5886l.f59851k3), 0.0f, 2, null));
        c0945a.b(AbstractC5892d.h(context, Integer.valueOf(AbstractC5886l.f59832h), 0.0f, 2, null));
        c0945a.c(AbstractC5892d.h(context, Integer.valueOf(AbstractC5886l.f59767S1), 0.0f, 2, null));
        c0946d.e(c0945a.a());
        c0946d.n(true);
        d a10 = c0946d.a();
        Intrinsics.checkNotNullExpressionValue(a10, "build(...)");
        String a11 = f64857a.a(context, url);
        if (a11 != null) {
            a10.f67200a.setPackage(a11);
        }
        try {
            a10.a(context, parse);
        } catch (ActivityNotFoundException unused) {
            LiveChatUtil.log("CustomTabHelper - No browser supporting Custom Tabs was found.");
            try {
                context.startActivity(new Intent("android.intent.action.VIEW", parse));
            } catch (ActivityNotFoundException unused2) {
                LiveChatUtil.log("CustomTabHelper - No browser was found to handle the URL.");
                Toast.makeText(context, "No application found to open the link", 0).show();
            }
        }
    }

    public final String a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0);
        Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "queryIntentActivities(...)");
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            Intent intent = new Intent();
            intent.setAction("android.support.customtabs.action.CustomTabsService");
            intent.setPackage(resolveInfo.activityInfo.packageName);
            if (packageManager.resolveService(intent, 0) != null) {
                String packageName = resolveInfo.activityInfo.packageName;
                Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
                arrayList.add(packageName);
            }
        }
        return (String) CollectionsKt.firstOrNull((List) arrayList);
    }
}

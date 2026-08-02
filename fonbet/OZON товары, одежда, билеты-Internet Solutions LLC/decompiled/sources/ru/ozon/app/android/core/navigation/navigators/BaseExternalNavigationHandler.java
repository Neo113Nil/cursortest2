package ru.ozon.app.android.core.navigation.navigators;

import EZ.a;
import EZ.e;
import EZ.g;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.fragment.app.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.core.navigation.destinations.ExternalDestination;
import ru.ozon.app.android.main.R$anim;
import s.C9557e;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0004\b\u0019\u0010\u000bJ%\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010\"\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\u00020$2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0004¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0004¢\u0006\u0004\b'\u0010\u000bJ\u001f\u0010(\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0004¢\u0006\u0004\b(\u0010\u000b¨\u0006)"}, d2 = {"Lru/ozon/app/android/core/navigation/navigators/BaseExternalNavigationHandler;", "Lru/ozon/app/android/core/navigation/destinations/ExternalDestination;", "T", "LEZ/a;", "<init>", "()V", "Landroidx/fragment/app/r;", "context", "destination", "", "openInCustomTabsDefaultPackage", "(Landroidx/fragment/app/r;Lru/ozon/app/android/core/navigation/destinations/ExternalDestination;)V", "", "packageName", "openInCustomTabsInternal", "(Landroidx/fragment/app/r;Lru/ozon/app/android/core/navigation/destinations/ExternalDestination;Ljava/lang/String;)V", "Landroid/content/Context;", "openUrlFallback", "(Landroid/content/Context;Lru/ozon/app/android/core/navigation/destinations/ExternalDestination;)V", "Landroid/net/Uri;", "uri", "", "getPackageNamesByUri", "(Landroidx/fragment/app/r;Landroid/net/Uri;)Ljava/util/List;", "activity", "navigateInternal", "LEZ/g;", "navigator", "LEZ/e;", "response", "navigate", "(LEZ/g;LEZ/e;)V", "", "requestCode", "navigateForResult", "(LEZ/g;LEZ/e;I)V", "", "canOpenInNonBrowserApp", "(Landroidx/fragment/app/r;Lru/ozon/app/android/core/navigation/destinations/ExternalDestination;)Z", "openInAppOrBrowser", "openInCustomTabs", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseExternalNavigationHandler<T extends ExternalDestination> implements a<T> {
    private final List<String> getPackageNamesByUri(r context, Uri uri) {
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", uri), 65536);
        Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "queryIntentActivities(...)");
        List<ResolveInfo> list = queryIntentActivities;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ResolveInfo) it.next()).activityInfo.packageName);
        }
        return arrayList;
    }

    private final void openInCustomTabsDefaultPackage(r context, T destination) {
        try {
            openInCustomTabsInternal$default(this, context, destination, null, 4, null);
        } catch (ActivityNotFoundException unused) {
            openUrlFallback(context, destination);
        } catch (Exception e11) {
            Lm0.a.f17149a.e(e11);
        }
    }

    private final void openInCustomTabsInternal(r context, T destination, String packageName) {
        C9557e.a aVar = new C9557e.a();
        aVar.e();
        aVar.f(context, R$anim.fade_in, R$anim.fade_out);
        aVar.d(context, R$anim.fade_in, R$anim.fade_out);
        C9557e b11 = aVar.b();
        Intrinsics.checkNotNullExpressionValue(b11, "build(...)");
        Intent intent = b11.f98031a;
        if (packageName != null) {
            intent.setPackage(packageName);
        }
        if (destination.getNewTask()) {
            intent.addFlags(268435456);
        }
        b11.a(context, destination.getUri());
    }

    static /* synthetic */ void openInCustomTabsInternal$default(BaseExternalNavigationHandler baseExternalNavigationHandler, r rVar, ExternalDestination externalDestination, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openInCustomTabsInternal");
        }
        if ((i11 & 4) != 0) {
            str = null;
        }
        baseExternalNavigationHandler.openInCustomTabsInternal(rVar, externalDestination, str);
    }

    private final void openUrlFallback(Context context, T destination) {
        Intent intent = new Intent("android.intent.action.VIEW", destination.getUri());
        if (destination.getNewTask()) {
            intent.addFlags(268435456);
        }
        try {
            context.startActivity(intent);
        } catch (Exception e11) {
            Lm0.a.f17149a.e(e11);
        }
    }

    protected final boolean canOpenInNonBrowserApp(@NotNull r context, @NotNull T destination) {
        Uri uri;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(destination, "destination");
        uri = BaseExternalNavigationHandlerKt.URI_HTTP;
        Intrinsics.checkNotNullExpressionValue(uri, "access$getURI_HTTP$p(...)");
        List<String> packageNamesByUri = getPackageNamesByUri(context, uri);
        List<String> packageNamesByUri2 = getPackageNamesByUri(context, destination.getUri());
        ArrayList arrayList = new ArrayList();
        for (Object obj : packageNamesByUri2) {
            if (!packageNamesByUri.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        return !arrayList.isEmpty();
    }

    @Override // EZ.a
    public void navigate(@NotNull g navigator, @NotNull e<T> response) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(response, "response");
        navigateInternal(navigator.getActivity(), response.b());
    }

    @Override // EZ.a
    public void navigateForResult(@NotNull g navigator, @NotNull e<T> response, int requestCode) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(response, "response");
        navigateInternal(navigator.getActivity(), response.b());
    }

    public abstract void navigateInternal(@NotNull r activity, @NotNull T destination);

    protected final void openInAppOrBrowser(@NotNull r context, @NotNull T destination) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(destination, "destination");
        context.startActivity(new Intent("android.intent.action.VIEW", destination.getUri()));
    }

    protected final void openInCustomTabs(@NotNull r context, @NotNull T destination) {
        Uri uri;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(destination, "destination");
        uri = BaseExternalNavigationHandlerKt.URI_HTTP;
        Intrinsics.checkNotNullExpressionValue(uri, "access$getURI_HTTP$p(...)");
        try {
            openInCustomTabsInternal(context, destination, (String) C7714v.M(getPackageNamesByUri(context, uri)));
        } catch (ActivityNotFoundException unused) {
            openInCustomTabsDefaultPackage(context, destination);
        } catch (Exception e11) {
            Lm0.a.f17149a.e(e11);
        }
    }
}

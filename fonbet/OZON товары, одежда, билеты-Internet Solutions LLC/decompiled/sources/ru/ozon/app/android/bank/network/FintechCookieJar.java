package ru.ozon.app.android.bank.network;

import Lm0.a;
import We.A;
import We.C4873o;
import We.InterfaceC4875q;
import android.net.Uri;
import android.webkit.CookieManager;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/bank/network/FintechCookieJar;", "LWe/q;", "ozCookieJar", "Landroid/net/Uri;", "uri", "<init>", "(LWe/q;Landroid/net/Uri;)V", "LWe/A;", ImagesContract.URL, "", "LWe/o;", "loadForRequest", "(LWe/A;)Ljava/util/List;", "cookies", "", "saveFromResponse", "(LWe/A;Ljava/util/List;)V", "LWe/q;", "Landroid/net/Uri;", "Companion", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FintechCookieJar implements InterfaceC4875q {

    @NotNull
    private final InterfaceC4875q ozCookieJar;

    @NotNull
    private final Uri uri;

    public FintechCookieJar(@NotNull InterfaceC4875q ozCookieJar, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(ozCookieJar, "ozCookieJar");
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.ozCookieJar = ozCookieJar;
        this.uri = uri;
    }

    @Override // We.InterfaceC4875q
    @NotNull
    public List<C4873o> loadForRequest(@NotNull A url) {
        String str;
        List m11;
        Object obj;
        Intrinsics.checkNotNullParameter(url, "url");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.ozCookieJar.loadForRequest(url));
        try {
            String cookie = CookieManager.getInstance().getCookie(this.uri.toString());
            if (cookie == null || (m11 = h.m(cookie, new String[]{";"}, 0, 6)) == null) {
                str = null;
            } else {
                Iterator it = m11.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (h.e0(h.z0((String) obj).toString(), "__OBANK_session", false)) {
                        break;
                    }
                }
                str = (String) obj;
            }
            List m12 = str != null ? h.m(str, new String[]{"="}, 0, 6) : null;
            String host = this.uri.getHost();
            if (m12 != null && m12.size() == 2 && host != null) {
                C4873o.a aVar = new C4873o.a();
                aVar.d(h.z0((String) m12.get(0)).toString());
                aVar.e(h.z0((String) m12.get(1)).toString());
                aVar.b(host);
                Intrinsics.checkNotNullParameter("/", "path");
                if (!h.e0("/", "/", false)) {
                    throw new IllegalArgumentException("path must start with '/'");
                }
                arrayList.add(aVar.a());
                return arrayList;
            }
        } catch (Throwable th2) {
            a.f17149a.e("Error getting FinTech webview cookies e=" + th2, new Object[0]);
        }
        return arrayList;
    }

    @Override // We.InterfaceC4875q
    public void saveFromResponse(@NotNull A url, @NotNull List<C4873o> cookies) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(cookies, "cookies");
        this.ozCookieJar.saveFromResponse(url, cookies);
    }
}

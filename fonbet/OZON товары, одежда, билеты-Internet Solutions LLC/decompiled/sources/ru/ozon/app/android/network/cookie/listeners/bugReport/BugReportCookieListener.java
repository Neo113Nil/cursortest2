package ru.ozon.app.android.network.cookie.listeners.bugReport;

import We.A;
import We.C4873o;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.cookie.CookieListener;
import ru.ozon.app.android.storage.bugReport.BugReportCookieState;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\f\u0010\rJ+\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/network/cookie/listeners/bugReport/BugReportCookieListener;", "Lru/ozon/app/android/network/cookie/CookieListener;", "Lru/ozon/app/android/storage/bugReport/BugReportCookieState;", "bugReportCookieState", "<init>", "(Lru/ozon/app/android/storage/bugReport/BugReportCookieState;)V", "LWe/A;", ImagesContract.URL, "", "LWe/o;", "cookies", "", "saveFromResponse", "(LWe/A;Ljava/util/List;)V", "fromRequest", "(Ljava/util/List;LWe/A;)Ljava/util/List;", "Lru/ozon/app/android/storage/bugReport/BugReportCookieState;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BugReportCookieListener implements CookieListener {

    @NotNull
    private final BugReportCookieState bugReportCookieState;

    public BugReportCookieListener(@NotNull BugReportCookieState bugReportCookieState) {
        Intrinsics.checkNotNullParameter(bugReportCookieState, "bugReportCookieState");
        this.bugReportCookieState = bugReportCookieState;
    }

    @Override // ru.ozon.app.android.network.cookie.CookieListener
    @NotNull
    public List<C4873o> fromRequest(@NotNull List<C4873o> cookies, @NotNull A url) {
        Object obj;
        Intrinsics.checkNotNullParameter(cookies, "cookies");
        Intrinsics.checkNotNullParameter(url, "url");
        Iterator<T> it = cookies.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d(((C4873o) obj).f(), "bugreportMode")) {
                break;
            }
        }
        C4873o c4873o = (C4873o) obj;
        if (c4873o != null) {
            this.bugReportCookieState.setBugReportModeCookieChanged(Intrinsics.d(c4873o.i(), "2"));
        }
        return cookies;
    }

    @Override // ru.ozon.app.android.network.cookie.CookieListener
    public void saveFromResponse(@NotNull A url, @NotNull List<C4873o> cookies) {
        Object obj;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(cookies, "cookies");
        Iterator<T> it = cookies.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.d(((C4873o) obj).f(), "bugreportMode")) {
                    break;
                }
            }
        }
        C4873o c4873o = (C4873o) obj;
        if (c4873o != null) {
            this.bugReportCookieState.setBugReportModeCookieChanged(Intrinsics.d(c4873o.i(), "2"));
        }
    }
}

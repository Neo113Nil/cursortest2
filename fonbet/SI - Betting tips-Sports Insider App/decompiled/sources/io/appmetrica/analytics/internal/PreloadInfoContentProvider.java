package io.appmetrica.analytics.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.A5;
import io.appmetrica.analytics.impl.AbstractC0158fj;
import io.appmetrica.analytics.impl.B5;
import io.appmetrica.analytics.impl.C0123ea;
import io.appmetrica.analytics.impl.C0180gf;
import io.appmetrica.analytics.impl.C0206hf;
import io.appmetrica.analytics.impl.C0396p3;
import io.appmetrica.analytics.impl.C0421q3;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import java.util.concurrent.CountDownLatch;
import r4.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class PreloadInfoContentProvider extends ContentProvider {

    /* renamed from: a, reason: collision with root package name */
    private boolean f15010a = false;

    /* renamed from: b, reason: collision with root package name */
    private final UriMatcher f15011b = new UriMatcher(-1);

    private void a(B5 b52, ContentValues contentValues) {
        Context context = getContext();
        Context applicationContext = context == null ? null : context.getApplicationContext();
        if (applicationContext != null) {
            try {
                Object invoke = b52.f12034a.invoke(contentValues);
                if (invoke != null) {
                    b52.f12036c.b(applicationContext);
                    if (((Boolean) b52.f12035b.invoke(invoke)).booleanValue()) {
                        AbstractC0158fj.a("Successfully saved " + b52.f12037d, new Object[0]);
                    } else {
                        AbstractC0158fj.a("Did not save " + b52.f12037d + " because data is already present", new Object[0]);
                    }
                }
            } catch (Throwable th2) {
                ImportantLogger.INSTANCE.info("AppMetrica-Attribution", "Unexpected error occurred\n" + StringUtils.throwableToString(th2), new Object[0]);
            }
        }
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, String str, String[] strArr) {
        AbstractC0158fj.a("Deleting is not supported", new Object[0]);
        return -1;
    }

    public synchronized void disable() {
        this.f15010a = true;
    }

    @Override // android.content.ContentProvider
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(@NonNull Uri uri, ContentValues contentValues) {
        synchronized (this) {
            try {
                if (this.f15010a) {
                    return null;
                }
                if (contentValues != null) {
                    int match = this.f15011b.match(uri);
                    if (match == 1) {
                        a(new B5(new C0180gf(), new C0206hf(), C0123ea.f13678d, "preload info"), contentValues);
                    } else if (match != 2) {
                        AbstractC0158fj.a("Bad content provider uri.", new Object[0]);
                    } else {
                        a(new B5(new C0396p3(), new C0421q3(), C0123ea.f13678d, "clids"), contentValues);
                    }
                }
                CountDownLatch countDownLatch = A5.f11972a;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        Context applicationContext = context == null ? null : context.getApplicationContext();
        String l6 = k.l(applicationContext != null ? applicationContext.getPackageName() : "", ".appmetrica.preloadinfo.retail");
        this.f15011b.addURI(l6, "preloadinfo", 1);
        this.f15011b.addURI(l6, "clids", 2);
        A5.f11972a = new CountDownLatch(1);
        A5.f11973b = this;
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(@NonNull Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        AbstractC0158fj.a("Query is not supported", new Object[0]);
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, ContentValues contentValues, String str, String[] strArr) {
        AbstractC0158fj.a("Updating is not supported", new Object[0]);
        return -1;
    }
}

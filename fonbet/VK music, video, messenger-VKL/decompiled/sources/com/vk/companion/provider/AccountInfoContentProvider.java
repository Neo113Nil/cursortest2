package com.vk.companion.provider;

import android.app.Activity;
import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.vk.bridges.CompanionApp;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.metrics.performance.appstart.a;
import com.vk.metrics.performance.appstart.content_provider.a;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import xsna.c63;
import xsna.dx90;
import xsna.e43;
import xsna.i6n0;
import xsna.k6i;
import xsna.kvf;
import xsna.msy;
import xsna.obu0;
import xsna.ow90;
import xsna.po;
import xsna.qo;
import xsna.s6i;
import xsna.sw90;
import xsna.v6u0;
import xsna.vqw;
import xsna.zqn0;

/* compiled from: AccountInfoContentProvider.kt */
/* loaded from: classes.dex */
public final class AccountInfoContentProvider extends ContentProvider {
    public static final /* synthetic */ int c = 0;
    public final Object b;

    public AccountInfoContentProvider() {
        a.b("com.vk.companion.provider.AccountInfoContentProvider.<init>(AccountInfoContentProvider.kt:28)");
        try {
            this.b = msy.a(LazyThreadSafetyMode.NONE, new qo(0));
        } finally {
            a.a("com.vk.companion.provider.AccountInfoContentProvider.<init>(AccountInfoContentProvider.kt:28)");
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final MatrixCursor a(String[] strArr) {
        CompanionApp.State state;
        Context context = getContext();
        s6i s6iVar = new s6i(context);
        try {
            v6u0 a = obu0.a(context);
            Pair pair = new Pair(Long.valueOf(a != null ? a.b() : UserId.d.b), s6iVar.m());
            s6iVar.close();
            long longValue = ((Number) pair.d()).longValue();
            List list = (List) pair.g();
            MatrixCursor matrixCursor = new MatrixCursor(strArr);
            MatrixCursor.RowBuilder newRow = matrixCursor.newRow();
            if (strArr != null) {
                for (String str : strArr) {
                    switch (str.hashCode()) {
                        case -147132913:
                            if (str.equals("user_id")) {
                                newRow.add(str, Long.valueOf(longValue));
                                break;
                            } else {
                                break;
                            }
                        case 715440:
                            if (str.equals("in_app_notifications")) {
                                newRow.add(str, vqw.b(list));
                                break;
                            } else {
                                break;
                            }
                        case 506867304:
                            if (str.equals("authorized_user_ids")) {
                                String str2 = k6i.a;
                                newRow.add(str, kvf.a(list).toString());
                                break;
                            } else {
                                break;
                            }
                        case 816209642:
                            if (str.equals("notifications_enabled")) {
                                newRow.add(str, Integer.valueOf(zqn0.a.f() ? 1 : 0));
                                break;
                            } else {
                                break;
                            }
                        case 1842529523:
                            if (str.equals("app_state")) {
                                c63 c63Var = c63.a;
                                if (c63.f) {
                                    state = CompanionApp.State.FOREGROUND;
                                } else {
                                    Activity b = c63.b();
                                    state = (b == null || !b.isDestroyed()) ? CompanionApp.State.UI_DESTROYED : CompanionApp.State.BACKGROUND;
                                }
                                newRow.add(str, state.i());
                                break;
                            } else {
                                break;
                            }
                            break;
                    }
                }
            }
            return matrixCursor;
        } finally {
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException(i6n0.a(uri, "Operation delete does not support URI: "));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        ?? r0 = this.b;
        if (((po) r0.getValue()).b.match(uri) != 1) {
            return null;
        }
        po poVar = (po) r0.getValue();
        StringBuilder sb = new StringBuilder("vnd.android.cursor.dir/vnd.");
        sb.append(poVar.a + ".providers.account.info");
        sb.append(".state");
        return sb.toString();
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException(i6n0.a(uri, "Operation insert does not support URI: "));
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        a.b("com.vk.companion.provider.AccountInfoContentProvider.onCreate(AccountInfoContentProvider.kt:38)");
        try {
            Context context = getContext();
            if (e43.a == null) {
                e43.a = context;
            }
            Preference.a.getClass();
            Preference.w(context);
            zqn0 zqn0Var = zqn0.a;
            Application application = (Application) context.getApplicationContext();
            synchronized (zqn0Var) {
                if (!zqn0.f) {
                    zqn0.f = true;
                    zqn0.b = application;
                }
            }
            po poVar = (po) this.b.getValue();
            getContext();
            poVar.b.addURI(poVar.a + ".providers.account.info", "state", 1);
            ow90.g.getClass();
            dx90 dx90Var = ow90.e;
            dx90Var.getClass();
            dx90Var.e = System.currentTimeMillis();
            int i = dx90.W;
            dx90.b.b("initContentProviders");
            dx90Var.r();
            return true;
        } finally {
            a.a("com.vk.companion.provider.AccountInfoContentProvider.onCreate(AccountInfoContentProvider.kt:38)");
        }
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        a.b("com.vk.companion.provider.AccountInfoContentProvider.query(AccountInfoContentProvider.kt:51)");
        try {
            com.vk.metrics.performance.appstart.a aVar = ow90.g;
            aVar.c = false;
            Iterator<a.InterfaceC1278a> it = aVar.d.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
            sw90.a.getClass();
            sw90.d = false;
            if (((po) this.b.getValue()).b.match(uri) == 1) {
                MatrixCursor a = a(strArr);
                com.vk.metrics.performance.appstart.content_provider.a.a("com.vk.companion.provider.AccountInfoContentProvider.query(AccountInfoContentProvider.kt:51)");
                return a;
            }
            throw new IllegalArgumentException("Wrong URI: " + uri);
        } catch (Throwable th) {
            com.vk.metrics.performance.appstart.content_provider.a.a("com.vk.companion.provider.AccountInfoContentProvider.query(AccountInfoContentProvider.kt:51)");
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException(i6n0.a(uri, "Operation update does not support URI: "));
    }
}

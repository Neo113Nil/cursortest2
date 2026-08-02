package io.appmetrica.analytics.screenshot.impl;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Z extends ContentObserver {

    /* renamed from: d, reason: collision with root package name */
    public static final String f15342d = MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString();

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f15343a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f15344b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C0676k f15345c;

    public Z(ClientContext clientContext, C0683s c0683s) {
        super(clientContext.getClientExecutorProvider().getDefaultExecutor().getHandler());
        this.f15343a = clientContext;
        this.f15344b = c0683s;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z5, Uri uri) {
        C0676k c0676k;
        super.onChange(z5, uri);
        if (!kotlin.text.z.o(String.valueOf(uri), f15342d, false) || (c0676k = this.f15345c) == null) {
            return;
        }
        try {
            String[] strArr = {"date_added"};
            List elements = c0676k.f15373b;
            Intrinsics.checkNotNullParameter(strArr, "<this>");
            Intrinsics.checkNotNullParameter(elements, "elements");
            int i5 = 1;
            Object[] copyOf = Arrays.copyOf(strArr, elements.size() + 1);
            Iterator it = elements.iterator();
            while (it.hasNext()) {
                copyOf[i5] = it.next();
                i5++;
            }
            Intrinsics.checkNotNull(copyOf);
            String[] strArr2 = (String[]) copyOf;
            Cursor query = this.f15343a.getContext().getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, strArr2, "date_added >= ?", new String[]{String.valueOf(new SystemTimeProvider().currentTimeSeconds() - c0676k.f15374c)}, "date_added DESC");
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        for (String str : strArr2) {
                        }
                        Iterator it2 = c0676k.f15373b.iterator();
                        while (it2.hasNext()) {
                            if (StringsKt.A(query.getString(query.getColumnIndexOrThrow((String) it2.next())).toLowerCase(Locale.ROOT), "screenshot", false)) {
                                this.f15344b.invoke();
                            }
                        }
                    }
                } finally {
                }
            }
            Unit unit = Unit.f19194a;
            com.google.android.play.core.appupdate.b.g(query, null);
        } catch (Exception unused) {
        }
    }
}

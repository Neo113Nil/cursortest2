package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Z6 {

    /* renamed from: a, reason: collision with root package name */
    public final I6 f13266a;

    /* renamed from: b, reason: collision with root package name */
    public final List f13267b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f13268c;

    public Z6(I6 i62, ArrayList arrayList, boolean z5) {
        this.f13266a = i62;
        this.f13267b = arrayList;
        this.f13268c = z5;
    }

    public final String a(Context context, X6 x62) {
        File parentFile;
        try {
            File a7 = this.f13266a.a(context, x62.b());
            if (!a7.exists() && (parentFile = a7.getParentFile()) != null && (parentFile.exists() || parentFile.mkdirs())) {
                a(context, x62.a(), a7);
            }
            return a7.getPath();
        } catch (Throwable unused) {
            return x62.b();
        }
    }

    public final void a(Context context, String str, File file) {
        List list = this.f13267b;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                File a7 = ((I6) it.next()).a(context, str);
                if (a7.exists()) {
                    try {
                        if (this.f13268c) {
                            FileUtils.copyToNullable(a7, file);
                        } else {
                            FileUtils.move(a7, file);
                        }
                        String path = a7.getPath();
                        String path2 = file.getPath();
                        for (String str2 : kotlin.collections.u.f("-journal", "-shm", "-wal")) {
                            File file2 = new File(path + str2);
                            File file3 = new File(path2 + str2);
                            if (this.f13268c) {
                                FileUtils.copyToNullable(file2, file3);
                            } else {
                                FileUtils.move(file2, file3);
                            }
                        }
                        return;
                    } catch (Throwable unused) {
                        continue;
                    }
                }
            }
        }
    }
}

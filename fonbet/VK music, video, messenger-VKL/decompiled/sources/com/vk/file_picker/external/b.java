package com.vk.file_picker.external;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import com.vk.core.files.a;
import com.vk.file_picker.external.ExternalFilePickerFragment;
import com.vk.file_picker.external.a;
import com.vk.file_picker.external.c;
import com.vk.file_picker.external.g;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.operators.single.v;
import java.io.File;
import java.util.Collections;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.a7f0;
import xsna.i4h;
import xsna.n3i;
import xsna.oeq;
import xsna.wk50;

/* compiled from: ExternalFilePickerFeature.kt */
/* loaded from: classes18.dex */
public final class b extends wk50<e, oeq, a, c> {
    public final ExternalFilePickerFragment f;
    public final f g;

    public b(a.b bVar, d dVar, ExternalFilePickerFragment externalFilePickerFragment, f fVar) {
        super(bVar, dVar);
        this.f = externalFilePickerFragment;
        this.g = fVar;
    }

    @Override // xsna.wk50
    public final void N(oeq oeqVar, a aVar) {
        x k;
        a aVar2 = aVar;
        boolean z = aVar2 instanceof a.b;
        final f fVar = this.g;
        if (z) {
            ExternalFilePickerFragment externalFilePickerFragment = fVar.d;
            if (externalFilePickerFragment.isAdded()) {
                externalFilePickerFragment.Q.a(new String[]{"*/*"});
            }
            T(c.C1067c.b);
            return;
        }
        if (!(aVar2 instanceof a.C1066a)) {
            throw new NoWhenBranchMatchedException();
        }
        a.C1066a c1066a = (a.C1066a) aVar2;
        int i = c1066a.b;
        final String str = c1066a.c;
        if (i != 128512) {
            k = x.k(new g.b(fVar.a.getString(R.string.error)));
        } else {
            fVar.getClass();
            k = str == null ? x.k(new g.a(EmptyList.b)) : new v(new Callable() { // from class: xsna.peq
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Throwable] */
                /* JADX WARN: Type inference failed for: r2v7, types: [kotlin.Result$Failure] */
                /* JADX WARN: Type inference failed for: r8v1, types: [T, java.lang.Exception] */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    jeq jeqVar;
                    com.vk.file_picker.external.f fVar2 = com.vk.file_picker.external.f.this;
                    ExternalFilePickerFragment externalFilePickerFragment2 = fVar2.a;
                    req reqVar = fVar2.e;
                    String str2 = str;
                    Uri parse = Uri.parse(str2);
                    Context context = reqVar.a;
                    ContentResolver contentResolver = context.getContentResolver();
                    contentResolver.takePersistableUriPermission(parse, 1);
                    Cursor query = contentResolver.query(parse, null, null, null, null, null);
                    ErrnoException errnoException = null;
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                jeqVar = new jeq(query.getLong(query.getColumnIndex("_size")), query.getString(query.getColumnIndex("_display_name")));
                            } else {
                                jeqVar = null;
                            }
                            query.close();
                        } finally {
                        }
                    } else {
                        jeqVar = null;
                    }
                    int i2 = R.string.error;
                    if (jeqVar == null) {
                        return new g.b(externalFilePickerFragment2.getString(R.string.error));
                    }
                    String str3 = jeqVar.b;
                    long j = jeqVar.a;
                    long j2 = fVar2.b;
                    if (j > j2) {
                        return new g.b(externalFilePickerFragment2.getResources().getString(R.string.file_upload_limit, new Object[]{dun.s6(j2, externalFilePickerFragment2.getResources())}));
                    }
                    String g = com.vk.core.files.a.g(str3);
                    if (g == null) {
                        g = "";
                    }
                    if (fVar2.c.contains(g)) {
                        return new g.b(externalFilePickerFragment2.getString(R.string.attach_upload_wrong_format_error));
                    }
                    File a = req.a(str3);
                    Uri parse2 = Uri.parse(str2);
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    ref$ObjectRef.element = new Exception("Error happened while copying ".concat(str3));
                    if (!a.b.a(context, parse2, a, new qeq(ref$ObjectRef))) {
                        a = new Result.Failure((Throwable) ref$ObjectRef.element);
                    }
                    ?? a2 = Result.a(a);
                    ErrnoException errnoException2 = a2;
                    if (a2 == 0) {
                        return new g.a(Collections.singletonList(a));
                    }
                    while (true) {
                        if (errnoException2 == null) {
                            break;
                        }
                        if (errnoException2.getClass().equals(ErrnoException.class)) {
                            errnoException = errnoException2;
                            break;
                        }
                        if (errnoException2.equals(errnoException2.getCause())) {
                            break;
                        }
                        errnoException2 = errnoException2.getCause();
                    }
                    if (errnoException != null && errnoException.errno == OsConstants.ENOSPC) {
                        i2 = R.string.out_of_space_error;
                    }
                    return new g.b(externalFilePickerFragment2.getString(i2));
                }
            }).q(io.reactivex.rxjava3.schedulers.a.b());
        }
        a7f0.a.f(this, k, new i4h(this, 18), new n3i(this, 17), 1);
    }
}

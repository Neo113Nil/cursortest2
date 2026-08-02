package io.appmetrica.analytics.impl;

import android.os.FileObserver;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.e6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class FileObserverC0119e6 extends FileObserver {

    /* renamed from: a, reason: collision with root package name */
    public final Consumer f13639a;

    /* renamed from: b, reason: collision with root package name */
    public final File f13640b;

    /* renamed from: c, reason: collision with root package name */
    public final C0020aa f13641c;

    public FileObserverC0119e6(File file, C0171g6 c0171g6, C0020aa c0020aa) {
        super(file.getAbsolutePath(), 8);
        this.f13639a = c0171g6;
        this.f13640b = file;
        this.f13641c = c0020aa;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i5, String str) {
        if (i5 != 8 || TextUtils.isEmpty(str)) {
            return;
        }
        Consumer consumer = this.f13639a;
        C0020aa c0020aa = this.f13641c;
        File file = this.f13640b;
        c0020aa.getClass();
        consumer.consume(new File(file, str));
    }
}

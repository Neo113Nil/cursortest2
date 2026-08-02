package io.appmetrica.analytics.impl;

import java.io.File;
import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.a7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0017a7 {

    /* renamed from: a, reason: collision with root package name */
    public final I6 f13348a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f13349b;

    public C0017a7(File file) {
        ArrayList arrayList = new ArrayList();
        this.f13349b = arrayList;
        if (file != null) {
            this.f13348a = new C0432qe(file, new N6());
            arrayList.add(new C0432qe(file, new C0256je()));
        } else {
            this.f13348a = new J6(new N6());
        }
        arrayList.add(new J6(new C0256je()));
    }
}

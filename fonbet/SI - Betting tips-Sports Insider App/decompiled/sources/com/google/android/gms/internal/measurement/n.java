package com.google.android.gms.internal.measurement;

import bet.prediction.response.Prediction;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public interface n {
    public static final r S = new r();
    public static final l T = new l();
    public static final f U = new f("continue");
    public static final f V = new f("break");
    public static final f W = new f(Prediction.RETURN);

    /* renamed from: a0, reason: collision with root package name */
    public static final e f5144a0 = new e(Boolean.TRUE);

    /* renamed from: b0, reason: collision with root package name */
    public static final e f5145b0 = new e(Boolean.FALSE);

    /* renamed from: c0, reason: collision with root package name */
    public static final q f5146c0 = new q("");

    Boolean c();

    Double d();

    Iterator e();

    n f(String str, com.google.firebase.messaging.x xVar, ArrayList arrayList);

    String h();

    n i();
}

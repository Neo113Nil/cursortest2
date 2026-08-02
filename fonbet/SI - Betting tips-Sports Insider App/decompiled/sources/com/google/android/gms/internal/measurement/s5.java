package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s5 extends h {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5236c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s5(String str, int i5) {
        super(str);
        this.f5236c = i5;
    }

    @Override // com.google.android.gms.internal.measurement.h
    public final n j(com.google.firebase.messaging.x xVar, List list) {
        switch (this.f5236c) {
            case 0:
                return n.S;
            case 1:
            case 2:
                return this;
            case 3:
                return new g(Double.valueOf(0.0d));
            default:
                return n.S;
        }
    }
}

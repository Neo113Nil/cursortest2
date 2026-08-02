package com.google.firebase.messaging;

import com.google.android.gms.cloudmessaging.CloudMessage;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements w7.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6163a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f6164b;

    public /* synthetic */ p(FirebaseMessaging firebaseMessaging, int i5) {
        this.f6163a = i5;
        this.f6164b = firebaseMessaging;
    }

    @Override // w7.d
    public final void onSuccess(Object obj) {
        int i5 = this.f6163a;
        FirebaseMessaging firebaseMessaging = this.f6164b;
        switch (i5) {
            case 0:
                e0 e0Var = (e0) obj;
                if (firebaseMessaging.f6066e.e()) {
                    e0Var.i();
                    break;
                }
                break;
            default:
                CloudMessage cloudMessage = (CloudMessage) obj;
                h9.c cVar = FirebaseMessaging.f6059l;
                firebaseMessaging.getClass();
                if (cloudMessage != null) {
                    m4.g.s(cloudMessage.f4437a);
                    firebaseMessaging.e();
                    break;
                }
                break;
        }
    }
}

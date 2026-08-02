package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements w7.d, w7.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f6173a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f6174b;

    public /* synthetic */ v(Context context, boolean z5) {
        this.f6174b = context;
        this.f6173a = z5;
    }

    @Override // w7.c
    public void c(Exception exc) {
        com.sports.insider.ui.activities.a aVar = (com.sports.insider.ui.activities.a) this.f6174b;
        if (this.f6173a) {
            com.sports.insider.ui.activities.a.x(aVar);
        }
    }

    @Override // w7.d
    public void onSuccess(Object obj) {
        SharedPreferences.Editor edit = rh.g.s(this.f6174b).edit();
        edit.putBoolean("proxy_retention", this.f6173a);
        edit.apply();
    }

    public /* synthetic */ v(boolean z5, com.sports.insider.ui.activities.a aVar) {
        this.f6173a = z5;
        this.f6174b = aVar;
    }
}

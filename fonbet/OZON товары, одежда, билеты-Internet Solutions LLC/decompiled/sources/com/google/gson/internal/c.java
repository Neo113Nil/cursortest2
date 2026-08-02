package com.google.gson.internal;

import android.app.Activity;
import androidx.fragment.app.ComponentCallbacksC5392m;
import ru.ozon.app.android.permission.PermissionRequest;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements o, PermissionRequest.ActivityProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f59956a;

    public /* synthetic */ c(Object obj) {
        this.f59956a = obj;
    }

    @Override // com.google.gson.internal.o
    public Object f() {
        throw new com.google.gson.j((String) this.f59956a);
    }

    @Override // ru.ozon.app.android.permission.PermissionRequest.ActivityProvider
    public Activity provide() {
        Activity activity;
        activity = ((ComponentCallbacksC5392m) this.f59956a).getActivity();
        return activity;
    }
}

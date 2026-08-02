package com.google.android.gms.auth;

import android.app.PendingIntent;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.AbstractC3191o;
import v9.C6666a;
import v9.EnumC6679n;

@KeepName
/* loaded from: classes2.dex */
public class UserRecoverableAuthException extends C6666a {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f32019a;

    /* renamed from: b, reason: collision with root package name */
    public final PendingIntent f32020b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC6679n f32021c;

    public UserRecoverableAuthException(String str, Intent intent) {
        this(str, intent, null, EnumC6679n.LEGACY);
    }

    public static UserRecoverableAuthException b(String str, Intent intent, PendingIntent pendingIntent) {
        AbstractC3191o.m(intent);
        AbstractC3191o.m(pendingIntent);
        return new UserRecoverableAuthException(str, intent, pendingIntent, EnumC6679n.AUTH_INSTANTIATION);
    }

    public Intent a() {
        Intent intent = this.f32019a;
        if (intent != null) {
            return new Intent(intent);
        }
        int ordinal = this.f32021c.ordinal();
        if (ordinal == 0) {
            Log.w("Auth", "Make sure that an intent was provided to class instantiation.");
            return null;
        }
        if (ordinal == 1) {
            Log.e("Auth", "This shouldn't happen. Gms API throwing this exception should support the recovery Intent.");
            return null;
        }
        if (ordinal != 2) {
            return null;
        }
        Log.e("Auth", "this instantiation of UserRecoverableAuthException doesn't support an Intent.");
        return null;
    }

    public UserRecoverableAuthException(String str, Intent intent, PendingIntent pendingIntent, EnumC6679n enumC6679n) {
        super(str);
        this.f32020b = pendingIntent;
        this.f32019a = intent;
        this.f32021c = (EnumC6679n) AbstractC3191o.m(enumC6679n);
    }
}

package ru.ozon.android.messenger.utils;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class j implements id.f<Object, Boolean> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SharedPreferences f91963a;

    j(SharedPreferences sharedPreferences) {
        this.f91963a = sharedPreferences;
    }

    @Override // id.e
    public final Object getValue(Object thisRef, kotlin.reflect.m property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        SharedPreferences sharedPreferences = this.f91963a;
        return Boolean.valueOf(sharedPreferences != null ? sharedPreferences.getBoolean("PREFERENCES_HIDE_READ_KEY", false) : false);
    }

    @Override // id.f
    public final void setValue(Object thisRef, kotlin.reflect.m property, Boolean bool) {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putBoolean;
        boolean booleanValue = bool.booleanValue();
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        SharedPreferences sharedPreferences = this.f91963a;
        if (sharedPreferences == null || (edit = sharedPreferences.edit()) == null || (putBoolean = edit.putBoolean("PREFERENCES_HIDE_READ_KEY", booleanValue)) == null) {
            return;
        }
        putBoolean.apply();
    }
}

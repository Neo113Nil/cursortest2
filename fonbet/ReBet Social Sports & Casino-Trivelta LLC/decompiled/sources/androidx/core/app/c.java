package androidx.core.app;

import android.app.ActivityOptions;
import android.content.Context;
import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class c {

    public static class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final ActivityOptions f18835a;

        public a(ActivityOptions activityOptions) {
            this.f18835a = activityOptions;
        }

        @Override // androidx.core.app.c
        public Bundle b() {
            return this.f18835a.toBundle();
        }
    }

    public static c a(Context context, int i10, int i11) {
        return new a(ActivityOptions.makeCustomAnimation(context, i10, i11));
    }

    public abstract Bundle b();
}

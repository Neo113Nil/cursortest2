package io.sentry.android.core;

import android.content.SharedPreferences;
import j$.util.Objects;
import java.io.File;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final long f15833a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15834b;

    /* renamed from: c, reason: collision with root package name */
    public long f15835c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f15836d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f15837e;

    public s(s7.v0 v0Var, String str, long j) {
        Objects.requireNonNull(v0Var);
        this.f15837e = v0Var;
        g6.v.e(str);
        this.f15836d = str;
        this.f15833a = j;
    }

    public long a() {
        if (!this.f15834b) {
            this.f15834b = true;
            s7.v0 v0Var = (s7.v0) this.f15837e;
            this.f15835c = v0Var.n().getLong((String) this.f15836d, this.f15833a);
        }
        return this.f15835c;
    }

    public void b(long j) {
        SharedPreferences.Editor edit = ((s7.v0) this.f15837e).n().edit();
        edit.putLong((String) this.f15836d, j);
        edit.apply();
        this.f15835c = j;
    }

    public s(long j, long j6, boolean z5, File file, HashMap hashMap) {
        this.f15833a = j;
        this.f15836d = file;
        this.f15835c = j6;
        this.f15837e = hashMap;
        this.f15834b = z5;
    }
}

package com.vk.im.engine.models;

import defpackage.q0;
import kotlin.Result;
import org.json.JSONObject;
import xsna.drm0;

/* compiled from: ImClipRecomPayloadConfig.kt */
/* loaded from: classes2.dex */
public final class a {
    public static final C1121a b = new C1121a();
    public static final a c = new a(false);
    public final boolean a;

    /* compiled from: ImClipRecomPayloadConfig.kt */
    /* renamed from: com.vk.im.engine.models.a$a, reason: collision with other inner class name */
    public static final class C1121a {
        public static a a() {
            return a.c;
        }

        public static a b(String str) {
            Object failure;
            try {
                failure = drm0.N(str) ? new a(false) : new a(new JSONObject(str).optBoolean("is_recent_clip_attaches_balanced", false));
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
            Throwable a = Result.a(failure);
            if (a != null) {
                bVar.a(a);
            }
            if (Result.a(failure) != null) {
                a.b.getClass();
                failure = a.c;
            }
            return (a) failure;
        }
    }

    public a(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.a == ((a) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return q0.a(new StringBuilder("ImClipRecomPayloadConfig(isRecentClipAttachesBalanced="), this.a, ')');
    }
}

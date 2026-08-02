package io.appmetrica.analytics.impl;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0516u implements InterfaceC0566w {

    /* renamed from: a, reason: collision with root package name */
    public final String f14691a = "yandex";

    @Nullable
    public final String a() {
        try {
            return new JSONArray((Collection) CollectionsKt.N(kotlin.collections.t.c(this.f14691a), C0040b4.l().m().f13207d)).toString();
        } catch (Throwable unused) {
            return null;
        }
    }
}

package io.appmetrica.analytics.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.qb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0429qb implements so {
    @Override // io.appmetrica.analytics.impl.so
    public final qo a(String str) {
        return str == null ? new qo(this, false, "key is null") : str.startsWith(G7.f12256b) ? new qo(this, false, "key starts with appmetrica") : str.length() > 200 ? new qo(this, false, "key length more then 200 characters") : new qo(this, true, "");
    }
}

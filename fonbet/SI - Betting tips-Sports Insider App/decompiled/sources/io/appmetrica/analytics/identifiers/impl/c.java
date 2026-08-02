package io.appmetrica.analytics.identifiers.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final IdentifierStatus f11805a;

    /* renamed from: b, reason: collision with root package name */
    public final a f11806b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11807c;

    public c(IdentifierStatus identifierStatus, a aVar, String str) {
        this.f11805a = identifierStatus;
        this.f11806b = aVar;
        this.f11807c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f11805a == cVar.f11805a && Intrinsics.areEqual(this.f11806b, cVar.f11806b) && Intrinsics.areEqual(this.f11807c, cVar.f11807c);
    }

    public final int hashCode() {
        int hashCode = this.f11805a.hashCode() * 31;
        a aVar = this.f11806b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.f11807c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvIdResult(status=");
        sb2.append(this.f11805a);
        sb2.append(", advIdInfo=");
        sb2.append(this.f11806b);
        sb2.append(", errorExplanation=");
        return d9.e.k(sb2, this.f11807c, ')');
    }

    public /* synthetic */ c(IdentifierStatus identifierStatus, a aVar, String str, int i5) {
        this(identifierStatus, (i5 & 2) != 0 ? null : aVar, (i5 & 4) != 0 ? null : str);
    }
}

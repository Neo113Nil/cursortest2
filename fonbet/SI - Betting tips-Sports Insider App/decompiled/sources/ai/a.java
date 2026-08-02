package ai;

import a2.j;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final gi.a f182a;

    /* renamed from: b, reason: collision with root package name */
    public final ag.c f183b;

    /* renamed from: c, reason: collision with root package name */
    public final gi.a f184c;

    /* renamed from: d, reason: collision with root package name */
    public final Function2 f185d;

    /* renamed from: e, reason: collision with root package name */
    public final b f186e;

    /* renamed from: f, reason: collision with root package name */
    public List f187f;

    public a(gi.a scopeQualifier, ag.c primaryType, gi.a aVar, Function2 definition, b kind, e0 secondaryTypes) {
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        Intrinsics.checkNotNullParameter(primaryType, "primaryType");
        Intrinsics.checkNotNullParameter(definition, "definition");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(secondaryTypes, "secondaryTypes");
        this.f182a = scopeQualifier;
        this.f183b = primaryType;
        this.f184c = aVar;
        this.f185d = definition;
        this.f186e = kind;
        this.f187f = secondaryTypes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.koin.core.definition.BeanDefinition<*>");
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f183b, aVar.f183b) && Intrinsics.areEqual(this.f184c, aVar.f184c) && Intrinsics.areEqual(this.f182a, aVar.f182a);
    }

    public final int hashCode() {
        gi.a aVar = this.f184c;
        return this.f182a.f10338a.hashCode() + ((this.f183b.hashCode() + ((aVar != null ? aVar.f10338a.hashCode() : 0) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        sb2.append(this.f186e);
        sb2.append(": '");
        sb2.append(li.a.a(this.f183b));
        sb2.append('\'');
        gi.a aVar = this.f184c;
        if (aVar != null) {
            sb2.append(",qualifier:");
            sb2.append(aVar);
        }
        gi.a aVar2 = hi.a.f10827c;
        gi.a aVar3 = this.f182a;
        if (!Intrinsics.areEqual(aVar3, aVar2)) {
            sb2.append(",scope:");
            sb2.append(aVar3);
        }
        if (!this.f187f.isEmpty()) {
            sb2.append(",binds:");
            CollectionsKt.I(this.f187f, sb2, StringUtils.COMMA, new j(2), 60);
        }
        sb2.append(']');
        return sb2.toString();
    }
}

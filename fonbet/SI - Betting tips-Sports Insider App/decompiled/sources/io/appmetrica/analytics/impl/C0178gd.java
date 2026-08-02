package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleServiceEventHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.gd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0178gd extends Rg {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f13828b;

    public C0178gd(@NotNull X4 x42) {
        super(x42);
        String b10 = x42.b().b();
        b10 = b10 == null ? "empty" : b10;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String.format("[ModulesEventHandler-%s]", Arrays.copyOf(new Object[]{b10}, 1));
        LinkedHashMap a7 = C0353na.k().o().a(b10);
        ArrayList arrayList = new ArrayList(a7.size());
        for (Map.Entry entry : a7.entrySet()) {
            arrayList.add(new Pair(entry.getValue(), new Tc(x42, (String) entry.getKey())));
        }
        this.f13828b = arrayList;
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(@NotNull P5 p52) {
        if (!this.f12818a.f13159t.c()) {
            return false;
        }
        ArrayList arrayList = this.f13828b;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            ModuleServiceEventHandler moduleServiceEventHandler = (ModuleServiceEventHandler) pair.f19192a;
            Tc tc2 = (Tc) pair.f19193b;
            if (moduleServiceEventHandler.handle(new Wc(tc2.f12917b, tc2.f12916a, new Vc(tc2.f12919d, tc2.f12918c, p52)), p52)) {
                return true;
            }
        }
        return false;
    }
}

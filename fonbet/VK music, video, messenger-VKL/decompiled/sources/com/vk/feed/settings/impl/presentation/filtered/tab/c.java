package com.vk.feed.settings.impl.presentation.filtered.tab;

import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import com.vk.feed.settings.api.domain.model.FilteredSourceType;
import com.vk.feed.settings.impl.presentation.filtered.tab.b;
import com.vk.feed.settings.impl.presentation.filtered.tab.d;
import com.vk.feed.settings.impl.presentation.filtered.tab.f;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;
import xsna.be7;
import xsna.ce7;
import xsna.cfr;
import xsna.cws;
import xsna.f4z;
import xsna.fz60;
import xsna.j5g;
import xsna.lav;
import xsna.owv;
import xsna.ti60;
import xsna.tz;
import xsna.wk50;

/* compiled from: NewsfeedFilterListFeature.kt */
/* loaded from: classes18.dex */
public final class c extends wk50<g, ti60, b, d> {
    public final fz60 f;
    public final FilteredSourceType g;
    public final f4z h;

    /* compiled from: NewsfeedFilterListFeature.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FilteredSourceType.values().length];
            try {
                iArr[FilteredSourceType.GROUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public c(fz60 fz60Var, FilteredSourceType filteredSourceType, e eVar) {
        super(b.d.b, eVar);
        this.f = fz60Var;
        this.g = filteredSourceType;
        this.h = new f4z();
    }

    @Override // xsna.wk50
    public final void N(ti60 ti60Var, b bVar) {
        ti60 ti60Var2 = ti60Var;
        b bVar2 = bVar;
        if (bVar2.equals(b.d.b)) {
            T(d.b.b);
            return;
        }
        boolean z = bVar2 instanceof b.c;
        io.reactivex.rxjava3.disposables.b bVar3 = this.e;
        FilteredSourceType filteredSourceType = this.g;
        fz60 fz60Var = this.f;
        if (z) {
            b.c cVar = (b.c) bVar2;
            UserId userId = cVar.b;
            bVar3.b((a.$EnumSwitchMapping$0[filteredSourceType.ordinal()] == 1 ? fz60Var.c(userId) : fz60Var.b(userId)).subscribe(new be7(ti60Var2, cVar, this, 2), new lav(new owv(this, 16), 14)));
            return;
        }
        if (bVar2 instanceof b.f) {
            b.f fVar = (b.f) bVar2;
            UserId userId2 = fVar.b;
            bVar3.b((a.$EnumSwitchMapping$0[filteredSourceType.ordinal()] == 1 ? fz60Var.e(userId2) : fz60Var.a(userId2)).subscribe(new ce7(ti60Var2, this, fVar, 1), new tz(new cws(this, 27), 25)));
            return;
        }
        if (bVar2 instanceof b.C1061b) {
            b.C1061b c1061b = (b.C1061b) bVar2;
            cfr<UserProfile> cfrVar = c1061b.b;
            U(ti60Var2, cfrVar.c, cfrVar.a, c1061b.c);
        } else if (bVar2 instanceof b.a) {
            b.a aVar = (b.a) bVar2;
            cfr<Group> cfrVar2 = aVar.b;
            U(ti60Var2, cfrVar2.c, cfrVar2.a, aVar.c);
        } else {
            if (!(bVar2 instanceof b.e)) {
                throw new NoWhenBranchMatchedException();
            }
            b.e eVar = (b.e) bVar2;
            if (eVar.equals(b.e.a.b)) {
                T(d.a.b);
            } else {
                if (!eVar.equals(b.e.C1062b.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                T(d.c.b);
            }
        }
    }

    public final void U(ti60 ti60Var, ArrayList arrayList, int i, boolean z) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (!z) {
            linkedHashSet.addAll(ti60Var.c);
        }
        linkedHashSet.addAll(arrayList);
        V(new f.b.a(this.g, i));
        T(new d.C1063d(j5g.O0(linkedHashSet), i));
    }

    public final void V(f fVar) {
        this.h.b(fVar);
    }
}

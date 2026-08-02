package com.vk.profile.community.suggestions.impl.ui.suggestions;

import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupSuggestion;
import com.vk.profile.community.suggestions.impl.ui.suggestions.a;
import com.vk.profile.community.suggestions.impl.ui.suggestions.d;
import com.vk.profile.community.suggestions.impl.ui.suggestions.f;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.c0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.a7f0;
import xsna.c5g;
import xsna.da;
import xsna.e43;
import xsna.f4z;
import xsna.fkq0;
import xsna.g2i;
import xsna.g6b;
import xsna.gd60;
import xsna.i3i;
import xsna.n1d;
import xsna.ns1;
import xsna.ozh;
import xsna.p4g;
import xsna.r6;
import xsna.v95;
import xsna.wk50;
import xsna.wvw;
import xsna.x2e;
import xsna.ztg;

/* compiled from: CommunitySuggestionsFeature.kt */
/* loaded from: classes5.dex */
public final class b extends wk50<CommunitySuggestionsViewState, ztg, a, d> {
    public static final ArrayList l;
    public final /* synthetic */ g6b f;
    public final UserId g;
    public final int h;
    public final g2i i;
    public final wvw j;
    public final gd60 k;

    static {
        List l2 = e43.l(GroupsFieldsDto.VERIFIED, GroupsFieldsDto.MEMBER_STATUS, GroupsFieldsDto.PHOTO_AVG_COLOR, GroupsFieldsDto.COVER, GroupsFieldsDto.FRIENDS, GroupsFieldsDto.MEMBERS_COUNT, GroupsFieldsDto.ACTIVITY, GroupsFieldsDto.PHOTO_BASE);
        ArrayList arrayList = new ArrayList(c5g.u(l2, 10));
        Iterator it = l2.iterator();
        while (it.hasNext()) {
            arrayList.add(((GroupsFieldsDto) it.next()).k());
        }
        l = arrayList;
    }

    public b(UserId userId, int i, g2i g2iVar, wvw wvwVar, gd60 gd60Var, String str) {
        super(a.b.b, new e(new ztg(str, false, EmptyList.b, null, null, null, 0)));
        this.f = new g6b(1);
        this.g = userId;
        this.h = i;
        this.i = g2iVar;
        this.j = wvwVar;
        this.k = gd60Var;
    }

    @Override // xsna.wk50
    public final void N(ztg ztgVar, a aVar) {
        ztg ztgVar2 = ztgVar;
        a aVar2 = aVar;
        boolean equals = aVar2.equals(a.b.b);
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        ArrayList arrayList = l;
        UserId userId = this.g;
        g2i g2iVar = this.i;
        if (equals) {
            a7f0.a.e(this, new c0(g2iVar.a(fkq0.a(userId), null, arrayList), new da(new r6(this, 28), 20), kVar), null, new ozh(this, 2), new x2e(this, 3), null, 9);
            return;
        }
        if (aVar2.equals(a.c.b)) {
            boolean z = ztgVar2.c;
            String str = ztgVar2.e;
            if (z || str == null || str.length() == 0) {
                return;
            }
            a7f0.a.e(this, new c0(g2iVar.a(fkq0.a(userId), str, arrayList), new da(new r6(this, 28), 20), kVar), null, new ns1(this, 28), new n1d(this, 11), null, 9);
            return;
        }
        if (aVar2 instanceof a.d) {
            a.d dVar = (a.d) aVar2;
            U(new f.c.b(dVar.b, dVar.c));
            return;
        }
        if (aVar2 instanceof a.f) {
            a.f fVar = (a.f) aVar2;
            Group group = fVar.b;
            String str2 = fVar.c;
            if (group.j) {
                U(new f.b(group, str2));
                return;
            } else {
                U(new f.a(group, str2, fVar.d));
                return;
            }
        }
        if (aVar2 instanceof a.h) {
            a.h hVar = (a.h) aVar2;
            int i = hVar.c;
            Pair i2 = p4g.i(ztgVar2.d, new v95(hVar, 3));
            if (i2 != null) {
                boolean z2 = true;
                if (i != 1 && i != 4) {
                    z2 = false;
                }
                i3i i3iVar = (i3i) i2.j();
                Group group2 = ((i3i) i2.j()).b;
                group2.C = i;
                group2.j = z2;
                T(new d.e(new i3i(group2, i3iVar.c), ((Number) i2.i()).intValue()));
                U(new f.d(((Number) i2.i()).intValue()));
                return;
            }
            return;
        }
        if (aVar2 instanceof a.g) {
            g2iVar.getClass();
            i3i i3iVar2 = ((a.g) aVar2).b;
            this.k.T("show_group_suggestion", new GroupSuggestion(i3iVar2.b, null, null, i3iVar2.c, null), g2iVar.b);
            return;
        }
        if (aVar2.equals(a.C1636a.b)) {
            U(f.c.a.a);
        } else {
            if (!aVar2.equals(a.e.b)) {
                throw new NoWhenBranchMatchedException();
            }
            if (ztgVar2.g == null) {
                return;
            }
            U(new f.c.C1638c(null, null, fkq0.e(userId)));
        }
    }

    public final void U(f fVar) {
        ((f4z) this.f.b).b(fVar);
    }
}

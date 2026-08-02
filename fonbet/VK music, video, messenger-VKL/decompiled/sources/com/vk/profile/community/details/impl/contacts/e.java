package com.vk.profile.community.details.impl.contacts;

import com.vk.movika.sdk.base.observable.q;
import com.vk.profile.community.details.impl.contacts.CommunityAddContactsState;
import com.vk.profile.community.details.impl.contacts.d;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.dm50;
import xsna.eqg;
import xsna.m8j;
import xsna.myc0;

/* compiled from: CommunityAddContactsReducer.kt */
/* loaded from: classes5.dex */
public final class e extends dm50<eqg, d, CommunityAddContactsState> {
    @Override // xsna.dm50
    public final CommunityAddContactsState c(CommunityAddContactsState communityAddContactsState, d dVar) {
        String str;
        CommunityAddContactsState communityAddContactsState2 = communityAddContactsState;
        d dVar2 = dVar;
        List<CommunityAddContactsState.ContactField> list = communityAddContactsState2.h;
        if (dVar2.equals(d.a.b)) {
            String str2 = communityAddContactsState2.g;
            String str3 = communityAddContactsState2.f;
            String str4 = communityAddContactsState2.e;
            CommunityAddContactsState.a aVar = communityAddContactsState2.c;
            List<CommunityAddContactsState.ContactField> a = aVar != null ? m8j.a(list, CommunityAddContactsState.ContactField.a(list.get(CommunityAddContactsState.ContactField.ContactViewType.CITY.ordinal()), new CommunityAddContactsState.ContactField.c(aVar.a, 2), null, 14)) : list;
            if (str4 != null) {
                a = m8j.a(a, CommunityAddContactsState.ContactField.a(list.get(CommunityAddContactsState.ContactField.ContactViewType.PHONE.ordinal()), new CommunityAddContactsState.ContactField.c(str4, 2), null, 14));
            }
            if (str3 != null) {
                a = m8j.a(a, CommunityAddContactsState.ContactField.a(list.get(CommunityAddContactsState.ContactField.ContactViewType.WEBSITE.ordinal()), new CommunityAddContactsState.ContactField.c(str3, 2), null, 14));
            }
            if (str2 != null) {
                a = m8j.a(a, CommunityAddContactsState.ContactField.a(list.get(CommunityAddContactsState.ContactField.ContactViewType.ADDRESS.ordinal()), new CommunityAddContactsState.ContactField.c(str2, 2), null, 14));
            }
            return CommunityAddContactsState.a(communityAddContactsState2, null, a, 63);
        }
        if (dVar2 instanceof d.c) {
            d.c cVar = (d.c) dVar2;
            return CommunityAddContactsState.a(communityAddContactsState2, null, m8j.a(list, CommunityAddContactsState.ContactField.a(list.get(cVar.b.ordinal()), new CommunityAddContactsState.ContactField.c(cVar.c, cVar.d), CommunityAddContactsState.ContactField.b.a.a, 12)), 63);
        }
        if (dVar2 instanceof d.b) {
            d.b bVar = (d.b) dVar2;
            return CommunityAddContactsState.a(communityAddContactsState2, null, m8j.a(list, CommunityAddContactsState.ContactField.a(list.get(bVar.b.ordinal()), null, bVar.c, 13)), 63);
        }
        if (!(dVar2 instanceof d.C1554d)) {
            throw new NoWhenBranchMatchedException();
        }
        CommunityAddContactsState.a aVar2 = ((d.C1554d) dVar2).b;
        CommunityAddContactsState.ContactField contactField = list.get(CommunityAddContactsState.ContactField.ContactViewType.CITY.ordinal());
        CommunityAddContactsState.ContactField.b bVar2 = contactField.b;
        if ((bVar2 instanceof CommunityAddContactsState.ContactField.b.C1552b) && aVar2 != null && (str = aVar2.a) != null && myc0.f(str)) {
            bVar2 = CommunityAddContactsState.ContactField.b.a.a;
        }
        String str5 = aVar2 != null ? aVar2.a : null;
        if (str5 == null) {
            str5 = "";
        }
        return CommunityAddContactsState.a(communityAddContactsState2, aVar2, m8j.a(list, CommunityAddContactsState.ContactField.a(contactField, new CommunityAddContactsState.ContactField.c(str5, 2), bVar2, 12)), 61);
    }

    @Override // xsna.dm50
    public final eqg d() {
        return new eqg(e(new q(this, 29)));
    }

    @Override // xsna.dm50
    public final void h(CommunityAddContactsState communityAddContactsState, eqg eqgVar) {
        f(eqgVar.a, communityAddContactsState);
    }
}

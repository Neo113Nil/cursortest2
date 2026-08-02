package com.vk.profile.community.details.impl.contacts;

import com.vk.dto.common.id.UserId;
import com.vk.profile.community.details.impl.contacts.CommunityAddContactsState;
import com.vk.profile.community.details.impl.contacts.a;
import com.vk.profile.community.details.impl.contacts.d;
import com.vk.profile.community.details.impl.contacts.f;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.a94;
import xsna.dl0;
import xsna.e43;
import xsna.eqg;
import xsna.f4z;
import xsna.izs;
import xsna.s3q0;
import xsna.wk50;

/* compiled from: CommunityAddContactsFeature.kt */
/* loaded from: classes5.dex */
public final class c extends wk50<eqg, CommunityAddContactsState, com.vk.profile.community.details.impl.contacts.a, d> {
    public final String f;
    public final f4z g;
    public final g h;

    /* compiled from: CommunityAddContactsFeature.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<d, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(d dVar) {
            ((c) this.receiver).T(dVar);
            return s3q0.a;
        }
    }

    /* compiled from: CommunityAddContactsFeature.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<f, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(f fVar) {
            ((c) this.receiver).g.b(fVar);
            return s3q0.a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(CommunityAddContactsState.a aVar, String str, String str2, String str3, UserId userId, String str4) {
        super(r0, new e(new CommunityAddContactsState(userId, aVar, aVar, str, str2, str3, r4.g())));
        CommunityAddContactsState.ContactField.a aVar2;
        a.C1553a c1553a = a.C1553a.b;
        ListBuilder e = e43.e();
        for (CommunityAddContactsState.ContactField.ContactViewType contactViewType : CommunityAddContactsState.ContactField.ContactViewType.h()) {
            CommunityAddContactsState.ContactField.c cVar = new CommunityAddContactsState.ContactField.c((String) null, 3);
            CommunityAddContactsState.ContactField.b.a aVar3 = CommunityAddContactsState.ContactField.b.a.a;
            int i = dl0.$EnumSwitchMapping$0[contactViewType.ordinal()];
            if (i == 1) {
                aVar2 = new CommunityAddContactsState.ContactField.a(R.string.community_add_contacts_bs_address_subhead, R.string.community_add_contacts_bs_address_placeholder);
            } else if (i == 2) {
                aVar2 = new CommunityAddContactsState.ContactField.a(R.string.community_add_contacts_bs_city_subhead, R.string.community_add_contacts_bs_city_placeholder);
            } else if (i == 3) {
                aVar2 = new CommunityAddContactsState.ContactField.a(R.string.community_add_contacts_bs_phone_subhead, R.string.community_add_contacts_bs_phone_placeholder);
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar2 = new CommunityAddContactsState.ContactField.a(R.string.community_add_contacts_bs_website_subhead, R.string.community_add_contacts_bs_website_placeholder);
            }
            e.add(new CommunityAddContactsState.ContactField(cVar, aVar3, aVar2, contactViewType));
        }
        this.f = str4;
        this.g = new f4z();
        this.h = new g(new a(1, this, c.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0), new b(1, this, c.class, "send", "send(Lcom/vk/profile/community/details/impl/contacts/CommunityAddContactsSideEffect;)V", 0));
    }

    @Override // xsna.wk50
    public final void N(CommunityAddContactsState communityAddContactsState, com.vk.profile.community.details.impl.contacts.a aVar) {
        CommunityAddContactsState communityAddContactsState2 = communityAddContactsState;
        com.vk.profile.community.details.impl.contacts.a aVar2 = aVar;
        List<CommunityAddContactsState.ContactField> list = communityAddContactsState2.h;
        if (aVar2.equals(a.C1553a.b)) {
            T(d.a.b);
            return;
        }
        boolean equals = aVar2.equals(a.c.b);
        g gVar = this.h;
        if (equals) {
            gVar.a(list, new a94(8, this, communityAddContactsState2));
            return;
        }
        if (aVar2 instanceof a.b) {
            CommunityAddContactsState.a aVar3 = communityAddContactsState2.c;
            this.g.b(new f.b(aVar3 != null ? Integer.valueOf(aVar3.b) : null));
            return;
        }
        if (aVar2 instanceof a.e) {
            a.e eVar = (a.e) aVar2;
            T(new d.c(eVar.b, eVar.c, eVar.d));
            return;
        }
        if (!(aVar2 instanceof a.d)) {
            if (!(aVar2 instanceof a.f)) {
                throw new NoWhenBranchMatchedException();
            }
            T(new d.C1554d(((a.f) aVar2).b));
            return;
        }
        a.d dVar = (a.d) aVar2;
        CommunityAddContactsState.ContactField.ContactViewType contactViewType = dVar.b;
        if (dVar.c) {
            T(new d.b(contactViewType, CommunityAddContactsState.ContactField.b.a.a));
            return;
        }
        ListBuilder e = e43.e();
        e.add(list.get(contactViewType.ordinal()));
        if (contactViewType == CommunityAddContactsState.ContactField.ContactViewType.ADDRESS) {
            e.add(list.get(CommunityAddContactsState.ContactField.ContactViewType.CITY.ordinal()));
        }
        gVar.a(e.g(), null);
    }
}

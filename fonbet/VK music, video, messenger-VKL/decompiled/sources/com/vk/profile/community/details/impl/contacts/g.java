package com.vk.profile.community.details.impl.contacts;

import com.vk.profile.community.details.impl.contacts.CommunityAddContactsState;
import com.vk.profile.community.details.impl.contacts.c;
import com.vk.profile.community.details.impl.contacts.d;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.text.Regex;
import xsna.a94;
import xsna.drm0;
import xsna.iz3;
import xsna.msy;
import xsna.wv0;

/* compiled from: CommunityAddContactsValidationFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class g {
    public final c.a a;
    public final c.b b;
    public final Object c;
    public final Object d;

    /* compiled from: CommunityAddContactsValidationFeatureDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommunityAddContactsState.ContactField.ContactViewType.values().length];
            try {
                iArr[CommunityAddContactsState.ContactField.ContactViewType.PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommunityAddContactsState.ContactField.ContactViewType.WEBSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommunityAddContactsState.ContactField.ContactViewType.ADDRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public g(c.a aVar, c.b bVar) {
        this.a = aVar;
        this.b = bVar;
        iz3 iz3Var = new iz3(4);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = msy.a(lazyThreadSafetyMode, iz3Var);
        this.d = msy.a(lazyThreadSafetyMode, new wv0(7));
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(List list, a94 a94Var) {
        boolean z;
        String str;
        Object obj;
        CommunityAddContactsState.ContactField.c cVar;
        List<CommunityAddContactsState.ContactField> list2 = list;
        loop0: while (true) {
            z = true;
            for (CommunityAddContactsState.ContactField contactField : list2) {
                String str2 = contactField.a.a;
                int i = a.$EnumSwitchMapping$0[contactField.d.ordinal()];
                c.a aVar = this.a;
                if (i == 1) {
                    if (!drm0.N(str2) && (new Regex("\\D").g(str2, "").length() < 8 || !((Regex) this.c.getValue()).f(str2))) {
                        aVar.invoke(new d.b(CommunityAddContactsState.ContactField.ContactViewType.PHONE, new CommunityAddContactsState.ContactField.b.C1552b(R.string.community_add_contacts_bs_phone_error)));
                    } else if (z) {
                        break;
                    }
                    z = false;
                } else if (i == 2) {
                    if (!drm0.N(str2) && !((Regex) this.d.getValue()).f(str2)) {
                        aVar.invoke(new d.b(CommunityAddContactsState.ContactField.ContactViewType.WEBSITE, new CommunityAddContactsState.ContactField.b.C1552b(R.string.community_add_contacts_bs_website_error)));
                    } else if (z) {
                        break;
                    }
                    z = false;
                } else if (i != 3) {
                    continue;
                } else {
                    Iterator it = list2.iterator();
                    while (true) {
                        str = null;
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((CommunityAddContactsState.ContactField) obj).d == CommunityAddContactsState.ContactField.ContactViewType.CITY) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    CommunityAddContactsState.ContactField contactField2 = (CommunityAddContactsState.ContactField) obj;
                    if (contactField2 != null && (cVar = contactField2.a) != null) {
                        str = cVar.a;
                    }
                    if (str != null) {
                        if (str2.length() > 255) {
                            aVar.invoke(new d.b(CommunityAddContactsState.ContactField.ContactViewType.ADDRESS, new CommunityAddContactsState.ContactField.b.C1552b(R.string.community_add_contacts_bs_address_error)));
                        } else if (drm0.N(str2) || str.length() != 0) {
                            aVar.invoke(new d.b(CommunityAddContactsState.ContactField.ContactViewType.CITY, CommunityAddContactsState.ContactField.b.a.a));
                            if (z) {
                                break;
                            }
                        } else {
                            aVar.invoke(new d.b(CommunityAddContactsState.ContactField.ContactViewType.CITY, new CommunityAddContactsState.ContactField.b.C1552b(R.string.community_add_contacts_bs_city_error)));
                        }
                    }
                    z = false;
                }
            }
        }
        if (!z || a94Var == null) {
            return;
        }
        a94Var.invoke();
    }
}

package com.vk.messagetemplates.impl.details;

import com.vk.messagetemplates.impl.common.Template;
import com.vk.messagetemplates.impl.details.BottomBarViewState;
import com.vk.messagetemplates.impl.details.f;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.c5g;
import xsna.c8p0;
import xsna.h4m;
import xsna.i4m;
import xsna.izs;
import xsna.tlo0;
import xsna.tq;
import xsna.zrp;

/* compiled from: TemplateDetailsStateMapper.kt */
/* loaded from: classes3.dex */
public final class e implements izs<TemplateDetailsState, f> {
    @Override // xsna.izs
    public final f invoke(TemplateDetailsState templateDetailsState) {
        tlo0.g gVar;
        TemplateDetailsState templateDetailsState2 = templateDetailsState;
        String str = templateDetailsState2.c;
        String str2 = templateDetailsState2.d;
        boolean z = templateDetailsState2.b != null;
        c8p0 c8p0Var = new c8p0(z);
        BottomBarViewState bottomBarViewState = new BottomBarViewState(z, templateDetailsState2.e ? BottomBarViewState.State.PROGRESS : (str == null || str.length() < 2 || (str != null && str.length() > 200) || str2 == null || str2.length() < 5 || (str2 != null && str2.length() > 2000)) ? BottomBarViewState.State.DISABLED : BottomBarViewState.State.ACTIVE);
        tlo0.g gVar2 = null;
        if (str == null || str.length() <= 200) {
            gVar = null;
        } else {
            tlo0.Companion.getClass();
            gVar = tlo0.a.c(R.string.template_details_field_length_error, 200);
        }
        h4m h4mVar = new h4m(str, gVar);
        if (str2 != null && str2.length() > 2000) {
            tlo0.Companion.getClass();
            gVar2 = tlo0.a.c(R.string.template_details_field_length_error, 2000);
        }
        h4m h4mVar2 = new h4m(str2, gVar2);
        zrp<Template> h = Template.h();
        ArrayList arrayList = new ArrayList(c5g.u(h, 10));
        for (Template template : h) {
            arrayList.add(new f.a(template.ordinal(), tq.h(tlo0.Companion, template.i())));
        }
        return new f(c8p0Var, bottomBarViewState, new i4m(h4mVar, h4mVar2, arrayList));
    }
}

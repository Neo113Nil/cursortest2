package com.vk.stories.design.view.stats.tabs.info.mvi;

import com.vk.stories.design.view.stats.tabs.info.mvi.g;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.c3m0;
import xsna.gfm0;
import xsna.ifm0;
import xsna.izs;
import xsna.qwl0;
import xsna.vdm0;
import xsna.wdm0;
import xsna.y8g0;
import xsna.zdm0;
import xsna.zem0;

/* compiled from: StoryStatisticsInfoReducer.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class e extends FunctionReferenceImpl implements izs<ifm0, g.b> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    @Override // xsna.izs
    public final g.b invoke(ifm0 ifm0Var) {
        ?? r2;
        ifm0 ifm0Var2 = ifm0Var;
        ((f) this.receiver).getClass();
        c3m0 c3m0Var = ifm0Var2.d;
        if (c3m0Var != null) {
            String str = c3m0Var.c;
            r2 = new ArrayList();
            String str2 = c3m0Var.b;
            if (str2 != null && str2.length() != 0 && str != null && str.length() != 0) {
                r2.add(new gfm0.a(new qwl0(str2, str)));
            }
            for (vdm0 vdm0Var : c3m0Var.d) {
                r2.add(new gfm0.b(new zem0(vdm0Var.a, null)));
                for (wdm0 wdm0Var : vdm0Var.b) {
                    r2.add(new gfm0.c(new zdm0(wdm0Var.a, wdm0Var.c ? y8g0.e(R.string.story_stat_off) : String.valueOf(wdm0Var.b))));
                }
            }
        } else {
            r2 = EmptyList.b;
        }
        return new g.b(ifm0Var2.c, r2, ifm0Var2.e);
    }
}

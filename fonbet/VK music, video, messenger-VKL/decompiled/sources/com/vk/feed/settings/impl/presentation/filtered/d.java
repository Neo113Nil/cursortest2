package com.vk.feed.settings.impl.presentation.filtered;

import com.vk.feed.settings.api.domain.model.FilteredSourceType;
import com.vk.feed.settings.impl.presentation.filtered.c;
import kotlin.NoWhenBranchMatchedException;
import xsna.cj60;
import xsna.dm50;
import xsna.tcn;

/* compiled from: NewsfeedFilteredSourcesReducer.kt */
/* loaded from: classes18.dex */
public final class d extends dm50<f, c, cj60> {

    /* compiled from: NewsfeedFilteredSourcesReducer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FilteredSourceType.values().length];
            try {
                iArr[FilteredSourceType.USER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public d() {
        super(new cj60(null, 5));
    }

    @Override // xsna.dm50
    public final cj60 c(cj60 cj60Var, c cVar) {
        c cVar2 = cVar;
        if (cVar2.equals(c.a.b)) {
            return new cj60(null, 3);
        }
        if (cVar2.equals(c.b.b)) {
            return new cj60(null, 5);
        }
        if (cVar2 instanceof c.C1058c) {
            return new cj60(((c.C1058c) cVar2).b, 6);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final f d() {
        return new f(e(new tcn(this, 29)));
    }

    @Override // xsna.dm50
    public final void h(cj60 cj60Var, f fVar) {
        f(fVar.a, cj60Var);
    }
}

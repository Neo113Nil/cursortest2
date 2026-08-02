package com.vk.clips.interests.impl.ui;

import com.vk.clips.interests.impl.feature.ClipsInterestsState;
import xsna.jge;
import xsna.oq;
import xsna.tlo0;
import xsna.ucp;
import xsna.vka;

/* compiled from: ClipsInterestsViewMapper.kt */
/* loaded from: classes16.dex */
public final class c {
    public final float a;

    /* compiled from: ClipsInterestsViewMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ClipsInterestsState.Content.Step.values().length];
            try {
                iArr[ClipsInterestsState.Content.Step.MAIN_CATEGORIES_CHOICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipsInterestsState.Content.Step.SUB_CATEGORIES_CHOICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ClipsInterestsState.Content.FlowCompletedType.values().length];
            try {
                iArr2[ClipsInterestsState.Content.FlowCompletedType.FLOW_FINISHED_CONTENT_VISIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ClipsInterestsState.Content.FlowCompletedType.FLOW_FINISHED_CONTENT_HIDDEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ClipsInterestsState.Content.FlowCompletedType.FLOW_IN_PROGRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public c(float f) {
        this.a = f;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [xsna.fld] */
    public static final vka a(jge<?> jgeVar, c cVar, ClipsInterestsState.Content content) {
        ?? id = jgeVar.getId();
        tlo0.h d = oq.d(tlo0.Companion, jgeVar.getName());
        ucp ucpVar = ucp.a;
        return new vka(id, d, ucp.j(jgeVar.getIcon(), Float.valueOf(cVar.a)), content.f.contains(jgeVar.getId()));
    }
}

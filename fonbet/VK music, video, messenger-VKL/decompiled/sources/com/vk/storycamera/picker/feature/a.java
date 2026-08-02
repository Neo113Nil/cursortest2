package com.vk.storycamera.picker.feature;

import com.vk.stories.analytics.StoryPublishEvent;
import com.vk.storycamera.picker.feature.StoryMediaPickerState;
import com.vk.storycamera.picker.feature.b;
import com.vk.storycamera.picker.feature.d;
import com.vk.storycamera.picker.ui.a;
import io.reactivex.rxjava3.internal.operators.observable.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.a7f0;
import xsna.bpn0;
import xsna.d6m0;
import xsna.f4z;
import xsna.rvl0;
import xsna.tsk0;
import xsna.u620;
import xsna.wk50;
import xsna.wqf0;
import xsna.xka0;

/* compiled from: StoryMediaPickerFeature.kt */
/* loaded from: classes6.dex */
public final class a extends wk50<com.vk.storycamera.picker.ui.c, StoryMediaPickerState, com.vk.storycamera.picker.ui.a, d> {
    public final e f;
    public final d6m0 g;
    public final rvl0 h;
    public final bpn0 i;
    public final f4z j;
    public final f4z k;

    /* compiled from: StoryMediaPickerFeature.kt */
    /* renamed from: com.vk.storycamera.picker.feature.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1844a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StoryMediaPickerState.ScreenMode.values().length];
            try {
                iArr[StoryMediaPickerState.ScreenMode.STORY_TEMPLATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StoryMediaPickerState.ScreenMode.PHOTO_PICKER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a(e eVar, d6m0 d6m0Var, rvl0 rvl0Var) {
        super(a.C1847a.b, eVar);
        this.f = eVar;
        this.g = d6m0Var;
        this.h = rvl0Var;
        bpn0 bpn0Var = new bpn0(new wqf0(4));
        this.i = bpn0Var;
        this.j = new f4z();
        this.k = new f4z();
        if (((Boolean) bpn0Var.getValue()).booleanValue()) {
            a7f0.a.e(this, new y(rvl0Var.d(), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a), null, new xka0(this, 14), null, null, 13);
        }
    }

    @Override // xsna.wk50
    public final void N(StoryMediaPickerState storyMediaPickerState, com.vk.storycamera.picker.ui.a aVar) {
        StoryMediaPickerState storyMediaPickerState2 = storyMediaPickerState;
        com.vk.storycamera.picker.ui.a aVar2 = aVar;
        d6m0 d6m0Var = this.g;
        f4z f4zVar = this.j;
        if (aVar2 instanceof a.C1847a) {
            if (storyMediaPickerState2 instanceof StoryMediaPickerState.b) {
                T(new d.b(((StoryMediaPickerState.b) storyMediaPickerState2).b));
                return;
            }
            return;
        }
        if (aVar2 instanceof a.i) {
            a.i iVar = (a.i) aVar2;
            if (storyMediaPickerState2 instanceof StoryMediaPickerState.a) {
                T(new d.e(iVar.b));
                return;
            }
            return;
        }
        if (aVar2 instanceof a.b) {
            if (storyMediaPickerState2 instanceof StoryMediaPickerState.a) {
                StoryMediaPickerState.a aVar3 = (StoryMediaPickerState.a) storyMediaPickerState2;
                if (!aVar3.c.isEmpty()) {
                    T(new d.e(EmptyList.b));
                    return;
                } else {
                    V(aVar3);
                    f4zVar.b(b.a.a);
                    return;
                }
            }
            return;
        }
        if (aVar2 instanceof a.c) {
            if (storyMediaPickerState2 instanceof StoryMediaPickerState.a) {
                V((StoryMediaPickerState.a) storyMediaPickerState2);
                f4zVar.b(b.a.a);
                return;
            }
            return;
        }
        if (aVar2 instanceof a.f) {
            a.f fVar = (a.f) aVar2;
            if (storyMediaPickerState2 instanceof StoryMediaPickerState.a) {
                f4zVar.b(new b.c(fVar.b));
                return;
            }
            return;
        }
        if (aVar2 instanceof a.d) {
            a.d dVar = (a.d) aVar2;
            if (storyMediaPickerState2 instanceof StoryMediaPickerState.a) {
                f4zVar.b(new b.C1845b(dVar.b, dVar.c, dVar.e));
                return;
            }
            return;
        }
        if (aVar2 instanceof a.e) {
            if (storyMediaPickerState2 instanceof StoryMediaPickerState.a) {
                d6m0Var.a.c(StoryPublishEvent.OPEN_GALLERY, null);
                T(d.a.b);
                return;
            }
            return;
        }
        if (aVar2 instanceof a.h) {
            if (storyMediaPickerState2 instanceof StoryMediaPickerState.a) {
                d6m0Var.a.c(StoryPublishEvent.OPEN_TEMPLATES_SECTION, null);
                T(d.C1846d.b);
                U();
                return;
            }
            return;
        }
        if (!(aVar2 instanceof a.g)) {
            throw new NoWhenBranchMatchedException();
        }
        int i = ((a.g) aVar2).b;
        S s = this.f.c;
        StoryMediaPickerState.a aVar4 = s instanceof StoryMediaPickerState.a ? (StoryMediaPickerState.a) s : null;
        if ((aVar4 != null ? aVar4.b : null) == StoryMediaPickerState.ScreenMode.STORY_TEMPLATE && i != 0) {
            U();
        }
        T(new d.c(i));
    }

    public final void U() {
        if (((Boolean) this.i.getValue()).booleanValue()) {
            rvl0 rvl0Var = this.h;
            if (rvl0Var.e() != 0) {
                a7f0.a.d(this, rvl0Var.f(), null, new u620(25), new tsk0(this, 6), 1);
            }
        }
    }

    public final void V(StoryMediaPickerState.a aVar) {
        int i = C1844a.$EnumSwitchMapping$0[aVar.b.ordinal()];
        d6m0 d6m0Var = this.g;
        if (i == 1) {
            d6m0Var.a.c(StoryPublishEvent.CLOSE_TEMPLATES_SECTION, null);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            d6m0Var.a.c(StoryPublishEvent.CLOSE_GALLERY, null);
        }
    }
}

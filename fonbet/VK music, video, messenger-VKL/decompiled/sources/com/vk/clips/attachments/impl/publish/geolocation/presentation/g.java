package com.vk.clips.attachments.impl.publish.geolocation.presentation;

import com.vk.clips.attachments.impl.publish.geolocation.presentation.ClipsGeoPickerState;
import com.vk.clips.attachments.impl.publish.geolocation.presentation.f;
import kotlin.NoWhenBranchMatchedException;
import xsna.bpn0;
import xsna.cu1;
import xsna.dm50;
import xsna.e60;
import xsna.j6e;
import xsna.jt;

/* compiled from: ClipsGeoPickerReducer.kt */
/* loaded from: classes16.dex */
public final class g extends dm50<j, f, ClipsGeoPickerState> {
    public final bpn0 d;

    /* compiled from: ClipsGeoPickerReducer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipsGeoPickerState.FullscreenState.values().length];
            try {
                iArr[ClipsGeoPickerState.FullscreenState.Loading.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipsGeoPickerState.FullscreenState.Unavailable.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public g() {
        super(ClipsGeoPickerState.g);
        this.d = new bpn0(new cu1(8));
    }

    @Override // xsna.dm50
    public final ClipsGeoPickerState c(ClipsGeoPickerState clipsGeoPickerState, f fVar) {
        ClipsGeoPickerState clipsGeoPickerState2 = clipsGeoPickerState;
        f fVar2 = fVar;
        if (fVar2 instanceof f.d) {
            f.d dVar = (f.d) fVar2;
            return ClipsGeoPickerState.a(clipsGeoPickerState2, null, null, new ClipsGeoPickerState.a(dVar.c, dVar.b), null, 23);
        }
        if (fVar2 instanceof f.b) {
            return ClipsGeoPickerState.a(clipsGeoPickerState2, ((f.b) fVar2).b, ClipsGeoPickerState.FullscreenState.None, null, null, 25);
        }
        if (fVar2 instanceof f.e) {
            return ClipsGeoPickerState.a(clipsGeoPickerState2, null, null, null, null, 30);
        }
        if (fVar2.equals(f.a.b)) {
            return ClipsGeoPickerState.a(clipsGeoPickerState2, null, ClipsGeoPickerState.FullscreenState.Unavailable, null, null, 27);
        }
        if (fVar2.equals(f.c.b)) {
            return ClipsGeoPickerState.a(clipsGeoPickerState2, null, ClipsGeoPickerState.FullscreenState.Loading, null, null, 27);
        }
        if (fVar2 instanceof f.C0548f) {
            return ClipsGeoPickerState.a(clipsGeoPickerState2, null, null, null, ((f.C0548f) fVar2).b, 15);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final j d() {
        return new j(e(new jt(14)), e(new j6e(this, 1)), e(new e60(12)));
    }

    @Override // xsna.dm50
    public final void h(ClipsGeoPickerState clipsGeoPickerState, j jVar) {
        ClipsGeoPickerState clipsGeoPickerState2 = clipsGeoPickerState;
        j jVar2 = jVar;
        int i = a.$EnumSwitchMapping$0[clipsGeoPickerState2.d.ordinal()];
        if (i == 1) {
            f(jVar2.a, clipsGeoPickerState2);
        } else if (i != 2) {
            f(jVar2.b, clipsGeoPickerState2);
        } else {
            f(jVar2.c, clipsGeoPickerState2);
        }
    }
}
